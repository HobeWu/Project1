package shape;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private static boolean isSort = false;


	private static Shape[] createTwoRectangles() {
		ShapeFactory shapeFactory = new ShapeFactory();
				
		Color myColor1 = new Color(231, 151, 44);
		Shape shape1 =shapeFactory.getShape("RECTANGLE",40, 40, 44, 60, myColor1);

		Color myColor2 = new Color(131, 151, 44);
		Shape shape2 = shapeFactory.getShape("CIRCLE",100, 100, 60, 0, myColor2);

		Color myColor3 = new Color(101, 151, 44);
		Shape shape3 = shapeFactory.getShape("SQUARE",170, 170, 64, 0, myColor3);

		Color myColor4 = new Color(135, 206, 250);
		Shape shape4 = shapeFactory.getShape("RECTANGLE",250, 250, 70, 50, myColor4);

		Color myColor5 = new Color(255, 0, 0);
		Shape shape5 = shapeFactory.getShape("CIRCLE",320, 320, 80, 0, myColor5);

		Color myColor6 = new Color(0, 191, 255);
		Shape shape6 = shapeFactory.getShape("SQUARE",410, 410, 50, 0, myColor6);

		Shape shapes[] = new Shape[6];
		shapes[0] = shape1;
		shapes[1] = shape2;
		shapes[2] = shape3;
		shapes[3] = shape4;
		shapes[4] = shape5;
		shapes[5] = shape6;
		return shapes;
	}


	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		// calling the method that creates six shapes (rectangles)
		Shape[] shapes = createTwoRectangles();
		if (isSort) {
			SortingTechnique.sortArr(shapes);
		}
		for (Shape shape : shapes) {
			g2d.setColor(shape.getColor());
			shape.drawShape(g2d);
		}
	}


	
	
	public static void main(String[] args) {
		final MyPanel rects = new MyPanel();
		JFrame frame = new JFrame("Display  shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new FlowLayout());
		JButton btnNewButton = new JButton("Load shapes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rects.setVisible(true);
				isSort = false;
				rects.repaint();
			}
		});
		panel_1.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Sort shapes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isSort = true;
				rects.repaint();

			}
		});
		panel_1.add(btnNewButton_1);
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		rects.setVisible(false);

		frame.getContentPane().add(rects, BorderLayout.CENTER);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
