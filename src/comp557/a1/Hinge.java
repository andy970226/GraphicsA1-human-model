//Name: Andi Dai  No.260844907
package comp557.a1;



import javax.vecmath.Tuple3d;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class Hinge extends DAGNode {
	double posx;
	 double posy;
	 double posz;
	 double rotx;
	 double roty;
	 double rotz;
	public boolean ifhair; 
	 

	DoubleParameter rx;

		
	public Hinge( String name ) {
		super(name);
		dofs.add( rx = new DoubleParameter( name+" rx", 0, -5, 180 ) );		

	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		gl.glPushMatrix();
		gl.glTranslated(posx, posy, posz);
		if (ifhair)
			this.rx.setValue(50.0);
		
		gl.glRotated(rx.getValue(),rotx, roty, rotz);

		

		super.display(drawable);
		// TODO: Objective 1: implement the FreeJoint display method
		gl.glPopMatrix();
		
	}

	public void setPosition(Tuple3d tuple3dAttr) {
		// TODO Auto-generated method stub
		this.posx=tuple3dAttr.x;
		this.posy=tuple3dAttr.y;
		this.posz=tuple3dAttr.z;
		
		
	}

	public void setAxis(Tuple3d tuple3dAttr) {
		// TODO Auto-generated method stub
		this.rotx=tuple3dAttr.x;
		this.roty=tuple3dAttr.y;
		this.rotz=tuple3dAttr.z;
		
	}



	
}
