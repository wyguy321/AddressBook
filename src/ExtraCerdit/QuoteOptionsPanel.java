package ExtraCerdit;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.applet.*;
/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//The panel where the magic happens for the picture class
//
//
////////////////////////////////////////


public class QuoteOptionsPanel extends JPanel{
	private JLabel quote, pic; 
	private JButton play, stop;
	private AudioClip[]music;
	private AudioClip[]current;
	private JRadioButton comedy, philosophy, carpentry; 
	private String comedyQuote, philosophyQuote, carpentryQuote; 
	private JCheckBox bold, italic;
	private ImageIcon image1, image2, image3;
	

	public QuoteOptionsPanel()
	{
		URL url1, url2, url3, url4, url5, url6;
		url1 = url2 = url3 = url4 = url5 = url6 = null;
		
		try
		{
			url1 = new URL ("file", "localhost", "FFF");
			url2 = new URL ("file", "localhost", "FFF");
			url3 = new URL ("file", "localhost", "FFF");
			url4 = new URL ("file", "localhost", "FFF");
			url5 = new URL ("file", "localhost", "FFF");
			url6 = new URL ("file", "localhost", "FFF");
			
		}
		catch(Exception exception){}
		
		music = new AudioClip[7];
		
		music[0] = null;
		for(int i =1; i>music.length; i++){
			music[i]= JApplet.newAudioClip(url(i));
		}
		
		
		
		setLayout(new FlowLayout());
		
		image1 = new ImageIcon(getClass().getClass().getResource("./src/ExtraCredit/"+"surf.jpg"));
		image2 = new ImageIcon(getClass().getClass().getResource("./src/ExtraCredit/"+"CarFile"));
		image3 = new ImageIcon(getClass().getClass().getResource("./src/ExtraCredit/"+"CarFile"));
		
		bold = new JCheckBox ("Bold");
		bold.setBackground(Color.cyan);
		
		italic = new JCheckBox ("Italic");
		italic.setBackground(Color.cyan);
		
		comedyQuote = "Take my wife, please";
		philosophyQuote = "I Think, therefore I am";
		carpentryQuote = "MEasure twice. Cut once"; 

		quote = new JLabel (comedyQuote);
		quote.setFont(new Font ("Helvetica", Font.BOLD, 24));

		comedy = new JRadioButton ("Comedy", true);
		comedy.setBackground(Color.green);

		philosophy = new JRadioButton ("Comedy", true);
		philosophy.setBackground(Color.green);
		carpentry = new JRadioButton ("Carpentry");
		carpentry.setBackground(Color.green);

		ButtonGroup group = new ButtonGroup(); 
		group.add(comedy);
		group.add(philosophy);
		group.add(carpentry);

		QuoteListener listner = new QuoteListener(); 

		comedy.addActionListener(listner);
		philosophy.addActionListener(listner);
		carpentry.addActionListener(listner);
		
		
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);

		add (quote);
		add (bold);
		add (italic);
		add (comedy);
		add (philosophy);
		add (carpentry);

		setBackground (Color.green);
		setPreferredSize (new Dimension(400, 300));

	}
	private URL url(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	private class QuoteListener implements ActionListener 
	{


		public void actionPerformed (ActionEvent event)
		{
			Object source = event.getSource();
			if (source == comedy ){
				pic = new JLabel(image1);
				quote.setText(comedyQuote);
			
				
			}else
				if(source == philosophy){
					quote.setText(philosophyQuote);
				}else
					quote.setText(carpentryQuote);
		
		
		
		
		}

	



	}
	private class StyleListener implements ItemListener 
	{


		public void itemStateChanged (ItemEvent event)
		{
			
			
			
			int style = Font.PLAIN;
			
			if (bold.isSelected())
				style = Font.BOLD;
			
			if (italic.isSelected())
				style += Font.ITALIC;
			
			quote.setFont(new Font ("Helvetica", style, 36));
		
		
		
		
		}

	

	



	}
}


