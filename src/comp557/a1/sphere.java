//Name: Andi Dai  No.260844907
package comp557.a1;

import javax.vecmath.Tuple3d;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;



public class sphere extends DAGNode {
	
	 double rred;
	 double ggreen;
	 double bblue;
	 double posx;
	 double posy;
	 double posz;
	 double sclx;
	 double scly;
	 double sclz;
	 
	 
		
	public sphere( String name ) {
		super(name);
		
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		gl.glPushMatrix() ;
		//gl.glTranslatef(0f,0f,0f);  
		gl.glColor3d(rred,ggreen,bblue);
	    gl.glTranslated(posx, posy, posz);
	    gl.glScaled(sclx, scly, sclz);  
	    glut.glutSolidSphere(1,50,50);
	    gl.glScaled(1/sclx, 1/scly, 1/sclz);
	    super.display(drawable);
	    gl.glPopMatrix();
	    
	  
	    
	    
	   //  gl.glScaled(1, 1, 1);
	    
	    
	    
		// 
		// TODO: Objective 1: implement the FreeJoint display method
	}

	public void setCentre(Tuple3d t) {
		this.posx=t.x;
		this.posy=t.y;
		this.posz=t.z;
		// TODO Auto-generated method stub
		
	}

	public void setScale(Tuple3d t) {
		this.sclx=t.x;
		this.scly=t.y;
		this.sclz=t.z;
		
	}

	public void setColor(Tuple3d t) {
		this.rred=t.x;
		this.ggreen=t.y;
		this.bblue=t.z;
		// TODO Auto-generated method stub
		
	}

	
}
