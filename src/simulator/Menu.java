package simulator;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public class Menu extends JFrame implements ActionListener{

	public Menu(){
		//set the size of the window
		setSize(300,300);
		//show the window
		setVisible(true);
		//Title of the window
		setTitle("Simulator");
		// Make the bar for the menu
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);
		
		//adding the items for the menu
		JMenu file = new JMenu("File");
		bar.add(file);
		JMenuItem open = new JMenuItem("New");
		file.add(open);
		JMenuItem close = new JMenuItem("Exit");
		file.add(close);
					
		JMenu edit = new JMenu("Edit");
		bar.add(edit);
		JMenuItem undo = new JMenuItem("Undo");
		edit.add(undo);
		JMenuItem redo = new JMenuItem("Redo");
		edit.add(redo);
		
		JMenu search = new JMenu("Search");
		bar.add(search);
		JMenuItem search1 = new JMenuItem("Search...");
		search.add(search1);
		
		JMenu project = new JMenu("Project");
		bar.add(project);
		JMenuItem openproject = new JMenuItem("Open Project");
		project.add(openproject);
		JMenuItem closeproject = new JMenuItem("Close Project");
		project.add(closeproject);
		
		JMenu about = new JMenu("About");
		bar.add(about);
		JMenuItem aboutus = new JMenuItem("About Us");
		about.add(aboutus);		
		JMenuItem moreinfo = new JMenuItem("More Info");
		about.add(moreinfo);
						
		JMenu help = new JMenu("Help");
		bar.add(help);
		JMenuItem helpcontents = new JMenuItem("Help Contents");
		help.add(helpcontents);	
		
		//how many layout and close when you exit
		this.setLayout(new GridLayout(7,1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding buttons 
		JButton companyLowestCapital = new JButton("Company with the Lowest Capital");
		companyLowestCapital.addActionListener(this);
		companyLowestCapital.setActionCommand("companyLowestCapital");
		this.add(companyLowestCapital);
				
		JButton companyHighestCapital = new JButton("Company with the Highest Capital");
		companyHighestCapital.addActionListener(this);
		companyHighestCapital.setActionCommand("companyHighestCapital");
		this.add(companyHighestCapital);
				
		JButton investorHighestShares = new JButton("Investor with the Highest Number of Shares");
		investorHighestShares.addActionListener(this);
		investorHighestShares.setActionCommand("investorHighestShares");
		this.add(investorHighestShares);
				
		JButton investorinvestedmostcompanies = new JButton("Investor that has invested in the most Companies");
		investorinvestedmostcompanies.addActionListener(this);
		investorinvestedmostcompanies.setActionCommand("investorinvestedmostcompanies");
		this.add(investorinvestedmostcompanies);
				
		JButton investorLowestShares = new JButton("Investor with the Lowest Number of Shares");
		investorLowestShares.addActionListener(this);
		investorLowestShares.setActionCommand("investorLowestShares");
		this.add(investorLowestShares);
				
		JButton investorinvestedleastcompanies = new JButton("Investor that has invested in the least Companies");
		investorinvestedleastcompanies.addActionListener(this);
		investorinvestedleastcompanies.setActionCommand("investorinvestedleastcompanies");
		this.add(investorinvestedleastcompanies);
				
		JButton exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setActionCommand("exit");
		this.add(exit);
				
		validate();
		repaint();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();
	}
			
	public void CompanyLowestCapital(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Companies with the Lowest Capital!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	public void CompanyHighestCapital(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Companies with the Highest Capital!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	public void InvestorHighestShares(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Investor with the Highest Number of Shares!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	public void InvestorInvestedMostCompanies(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Investor that has invested in the most Companies!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	public void InvestorLowestShares(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Investor with the Lowest Number of Shares!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	public void InvestorInvestedLeastCompanies(){
		try {
			JOptionPane.showMessageDialog(this, "Here are the Investor that has invested in the least Companies!!");
			this.dispose();
			    	  	    	   
		} catch (InputMismatchException e) {
            System.out.println("please try again");
            this.dispose();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("companyLowestCapital")){
			//do something
			CompanyLowestCapital();
			new Menu().setVisible(true);
		}
		if(e.getActionCommand().equals("companyHighestCapital")){
			//do something
			CompanyHighestCapital();
			new Menu().setVisible(true);
		}
		if(e.getActionCommand().equals("investorHighestShares")){
			//do something
			InvestorHighestShares();
			new Menu().setVisible(true);
		}
		if(e.getActionCommand().equals("investorinvestedmostcompanies")){
			//do something
			InvestorInvestedMostCompanies();
			new Menu().setVisible(true);
		}
		if(e.getActionCommand().equals("investorLowestShares")){
			//do something
			InvestorLowestShares();
			new Menu().setVisible(true);
		}
		if(e.getActionCommand().equals("investorinvestedleastcompanies")){
			//do something
			InvestorInvestedLeastCompanies();
			new Menu().setVisible(true);
		}
		
		else if(e.getActionCommand().equals("exit")){
					
			this.dispose();
		}
	}
}
