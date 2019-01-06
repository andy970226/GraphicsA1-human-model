package comp557.a1;
//Name: Andi Dai  No.260844907
import javax.swing.JTextField;

import com.jogamp.opengl.GLAutoDrawable;

import comp557.a1.DAGNode;
import comp557.a1.Parser;
import mintools.parameters.BooleanParameter;

public class CharacterCreator {

	static public String name = "Lara - Andi Dai No.260844907";
	
	// TODO: Objective 6: change default of load from file to true once you start working with xml
	static BooleanParameter loadFromFile = new BooleanParameter( "Load from file (otherwise by procedure)", true );
	static JTextField baseFileName = new JTextField("a1data/character");
	static { baseFileName.setName("what is this?"); }
	
	/**
	 * Creates a character, either procedurally, or by loading from an xml file
	 * @return root node
	 */
	static public DAGNode create() {
		
		if ( loadFromFile.getValue() ) {
			// TODO: Objectives 6: create your character in the character.xml file 
			return Parser.load( baseFileName.getText() + ".xml");
		} else {
			/*only for test and get scores;
			 
			FreeJoint y=new FreeJoint("f");
			Hinge a=new Hinge("hingtest");
			BallXYZ b=new BallXYZ("balltest");
			Cube c=new Cube("cubetest");
			y.add(a);
			y.add(b);
			y.add(c);
			
			a.posx=1;
			a.posy=1;
			a.posz=1;
			a.rotx=0;
			a.roty=1;
			a.rotz=0;
			
			b.posx=3;
			b.posy=1;
			b.posz=1;
			
			c.posx=7;
			c.posy=1;
			c.posz=1;
			c.bblue=0.7;
			c.ggreen=0.5;
			c.rred=0.2;
			c.sclx=2;
			c.scly=2;
			c.sclz=2;
			

			return y; 
			
		*/

			// CharacterCreator.create();
			// TODO: Objective 1,2,3,4: test DAG nodes by creating a small DAG in the CharacterCreator.create() method 
						
			// Use this for testing, but ultimately it will be more interesting
			// to create your character with an xml description (see example).
			
			// Here we just return null, which will not be very interesting, so write
			// some code to create a test or partial charcter and return the root node.

			return null;
		}
	}
}
