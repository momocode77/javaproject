import javax.swing.*;



public class WordPad {
	
		JFrame frame;
		JTextArea typeTF;
		JMenuBar wordpadbar, subMenu;
		JMenu menuFile, menuEdit, subM;
		JMenuItem miNew, miOpen, miSave, miClose, miExit, miFont, miArial, miTMS;
		JCheckBoxMenuItem miCheck;
		
		public WordPad()
		{
			
			frame = new JFrame("Menu - Demo");
			wordpadbar = new JMenuBar();
			menuFile = new JMenu("File");
			menuEdit = new JMenu("Tools");
			subM = new JMenu("Font");
			
			miNew = new JMenuItem ("New");
			miOpen = new JMenuItem ("Open");
			miSave = new JMenuItem ("Save");
			miClose = new JMenuItem ("Close");
			miExit = new JMenuItem ("Exit");
			miArial = new JMenuItem("Arial");
			miTMS = new JMenuItem("Times New Roman");
			
			miFont = new JMenuItem ("Font");
			
			typeTF = new JTextArea();
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			miCheck = new JCheckBoxMenuItem("Keyboard", false);
			
			frame.setJMenuBar(wordpadbar);
			wordpadbar.add(menuFile);
			wordpadbar.add(menuEdit);
			wordpadbar.add(subM);
			
			
			menuFile.add(miNew);
			menuFile.add(miOpen);
			menuFile.add(miSave);
			menuFile.add(miClose);
			menuFile.add(miExit);
			
			menuEdit.add(miCheck);
			subM.add(miArial);
			subM.add(miTMS);
			
			menuEdit.add(subM);
			
			frame.add(typeTF);
			frame.setSize(800,500);
			frame.setVisible(true);
			
		}
	

	public static void main(String[] args) {
		
		WordPad demoWordPad = new WordPad();

	}

}
