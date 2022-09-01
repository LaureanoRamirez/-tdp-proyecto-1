package launcher;
import gui.*;
import entities.*;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//(int id, String lastName, String firstName, String mail, String githubURL, String pathPhoto)
             Student Laureano = new Student(137411, "Ramírez","Laureano","lauramirez2611@gmail.com","https://github.com/LaureanoRamirez","");
             PresentationScreen miInterfaz= new PresentationScreen(Laureano);
             miInterfaz.setVisible(true);
            }
        });
    }
}