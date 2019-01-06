package comp557.a1;
//Name: Andi Dai  No.260844907

import javax.vecmath.Tuple3d;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class BallXYZ extends DAGNode {
	
	double posx, posy, posz;
	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
	public boolean ifbraidg;	
	public BallXYZ( String name ) {
		super(name);
		dofs.add( rx = new DoubleParameter( name+" rx", 0, -180, 180 ) );		
		dofs.add( ry = new DoubleParameter( name+" ry", 0, -180, 180 ) );
		dofs.add( rz = new DoubleParameter( name+" rz", 0, -180, 180 ) );

	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glPushMatrix();
		gl.glTranslated(posx, posy, posz);
		
		if (ifbraidg)
			this.rx.setValue(50.0);;
		
		gl.glRotated(rx.getValue(),1, 0, 0);
		gl.glRotated(ry.getValue(),0, 1, 0);
		gl.glRotated(rz.getValue(),0, 0, 1);
		

		super.display(drawable);
		// TODO: Objective 1: implement the FreeJoint display method
		gl.glPopMatrix();
		
	}

	public void setPosition(Tuple3d t) {
		// TODO Auto-generated method stub
		this.posx=t.x;
		this.posy=t.y;
		this.posz=t.z;
		
	}

	
}
