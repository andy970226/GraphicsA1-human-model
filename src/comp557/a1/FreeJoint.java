//Name: Andi Dai  No.260844907
package comp557.a1;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import mintools.parameters.DoubleParameter;

public class FreeJoint extends DAGNode {

	DoubleParameter tx;
	DoubleParameter ty;
	DoubleParameter tz;
	DoubleParameter rx;
	DoubleParameter ry;
	DoubleParameter rz;
		
	public FreeJoint( String name ) {
		super(name);
		dofs.add( tx = new DoubleParameter( name+" tx", 0, -6, 6 ) );		
		dofs.add( ty = new DoubleParameter( name+" ty", 0, -6, 6 ) );
		dofs.add( tz = new DoubleParameter( name+" tz", 0, -16, 16 ) );
		dofs.add( rx = new DoubleParameter( name+" rx", 0, -180, 180 ) );		
		dofs.add( ry = new DoubleParameter( name+" ry", 0, -180, 180 ) );
		dofs.add( rz = new DoubleParameter( name+" rz", 0, -180, 180 ) );
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		gl.glPushMatrix();
		gl.glTranslated(tx.getValue(), ty.getValue(), tz.getValue());
		gl.glRotated(rx.getValue(),1, 0, 0);
		gl.glRotated(ry.getValue(),0, 1, 0);
		gl.glRotated(rz.getValue(),0, 0, 1);
		

		super.display(drawable);
		gl.glPopMatrix();
		// TODO: Objective 1: implement the FreeJoint display method
		
		
	}

	
}
