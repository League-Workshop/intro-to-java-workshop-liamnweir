import org.jointheleague.graphical.robot.Robot;

public class RobotProgram {
public static void main(String[] args) {
	Robot c3po = new Robot();
	c3po.setPenColor(100, 100, 100);
	c3po.setSpeed(50);
	c3po.miniaturize();
	c3po.sparkle();
	c3po.penDown();
	c3po.move(150);
	c3po.turn(90);
	c3po.move(150);
	c3po.turn(90);
	c3po.move(150);
	c3po.turn(90);
	c3po.move(150);
	c3po.penUp();
	c3po.move(150);
	c3po.penDown();
	for (int i = 0; i < 4; i++) {
	c3po.move(150);
	c3po.turn(90);	
	}
	
	
	c3po.penUp();
    c3po.turn(-90);
	c3po.move(150);
	
	c3po.penDown();
	c3po.move(150);
	
}
}
