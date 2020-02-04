package zadatak;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Zadatak {
	
	
	
	private JFrame mojOkvir;
	private JPanel p1, p2, p3;
	private JButton btnUplati;
	private JTextField jtfUplatilac;
	private JTextField jtfPrimalac;
	private JComboBox<String>  jcbPrijava;
	private JList<String> listaIznosa;
	private JLabel lblUplatilac, lblPrimalac, lblSvrha, lblIznos;
	private JScrollPane sk;
	String[] svrha={"Prijava ispita","Prijava kolokvijuma", "Overa semestra",
					"Upis godine", "Obnova godine"};
	
	 String[] iznos={"200","400","600","800","1000","2000","4000","8000","10000"};
	
	public Zadatak(){
		pripremiGUI();
	
	}
	
	
	private void pripremiGUI(){
		
		
		
		
		mojOkvir=new JFrame("Vezba 5-Zadatak");
		mojOkvir.setSize(400, 200);
		mojOkvir.setLayout(new BorderLayout(5,5));
		mojOkvir.setLocationRelativeTo(null);
		mojOkvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		p1=new JPanel();
		
		p1.setLayout(new GridLayout(4,1));
		
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(4,1));
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,1));
		
		
		

		

		
		
		jtfUplatilac=new JTextField(20);
		jtfPrimalac=new JTextField(20);
		
		jcbPrijava=new JComboBox<String>(svrha);
		
	
		listaIznosa = new JList<String>(iznos);
		listaIznosa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		
		
		

		
			
	
		lblUplatilac=new JLabel("Uplatilac: ");
		lblPrimalac=new JLabel("Primalac: ");
		lblSvrha= new JLabel("Svrha uplate: ");
		lblIznos= new JLabel("Iznos uplate: ");
		
		
		
		btnUplati=new JButton("Izvrsi uplatu");
		btnUplati.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
		    if(jtfUplatilac.getText().isEmpty()) {
		    	
		    	JOptionPane.showMessageDialog(mojOkvir, "Unesite ime Uplatioca");
		    }
		    
		    else if(jtfPrimalac.getText().isEmpty()){
		    	
		    	JOptionPane.showMessageDialog(mojOkvir, "Unesite ime Primaoca");
		    }
		    
		    	                                         
		    else if(listaIznosa.isSelectionEmpty()) {
		    	
		    	JOptionPane.showMessageDialog(mojOkvir, "Izaberite iznos");
		    }
		    else {JOptionPane.showMessageDialog(mojOkvir, jtfUplatilac.getText() + " je uplatio " + jtfPrimalac.getText() + " zbog " + jcbPrijava.getSelectedItem() + " u vrednosti od "  + listaIznosa.getSelectedValue() + " dinara " );
		    	
		    	
		    }
				}
					
			
			
		});
		
	}	
		
	
		private void prikaziGUI(){
		
			
		GridBagConstraints ogranicenja=new GridBagConstraints();
		ogranicenja.insets=new Insets(10,10,10,10);
		
		 ogranicenja.gridx=0;
		 ogranicenja.gridy=0;
		 p1.add(lblUplatilac, ogranicenja);
		 
		 ogranicenja.gridx=0;
		 ogranicenja.gridy=0;
		 p1.add(jtfUplatilac, ogranicenja);
		 
	
		 ogranicenja.gridx=0;
		 ogranicenja.gridy=0;
		 p1.add(lblPrimalac, ogranicenja);
		 
		 ogranicenja.gridx=0;
		 ogranicenja.gridy=0;
		 p1.add(jtfPrimalac, ogranicenja);
		
		
			ogranicenja.gridx=0;
			ogranicenja.gridy=0;
			p2.add(lblSvrha, ogranicenja);
			
			ogranicenja.gridx=0;
			ogranicenja.gridy=0;
			p2.add(jcbPrijava, ogranicenja);
			
			ogranicenja.gridx=0;
			ogranicenja.gridy=0;
			p2.add(lblIznos, ogranicenja);
			

			ogranicenja.gridx=0;
			ogranicenja.gridy=0;
			p2.add(listaIznosa, ogranicenja);
			
			sk=new JScrollPane(listaIznosa);
			p2.add(sk);
			
			
			
			
			
	
	
		
		
		p3.add(btnUplati, BorderLayout.SOUTH);
		
		
		mojOkvir.add(p1, BorderLayout.CENTER);
		mojOkvir.add(p2, BorderLayout.EAST);
		mojOkvir.add(p3, BorderLayout.SOUTH);
		mojOkvir.setVisible(true);
		
	
		
		
		}
		
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Zadatak obj=new Zadatak();
		obj.prikaziGUI();
		
	}

}
