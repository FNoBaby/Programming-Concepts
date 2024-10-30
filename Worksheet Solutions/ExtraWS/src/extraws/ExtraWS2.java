package extraws;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.util.Scanner;

public class ExtraWS2 extends JFrame implements KeyListener {
    private int currentFloor = 0;
    public String[] floorDescriptions = {
        "Ground",
        "Office",
        "Apartment 1",
        "Apartment 2",
        "Penthouse",
        "Roof"
    };

    public ExtraWS2() {
        addKeyListener(this);
        setTitle("Lift Simulator");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public boolean isFloorValid(int floor) {
        return floor >= 0 && floor <= 5;
    }

    public void moveLift(int direction) {
        int newFloor = currentFloor + direction;
        if (isFloorValid(newFloor)) {
            try {
                // Simulate moving the lift
                // Sleep for 1 second for each floor
                // Math.abs is used to get the absolute value
                // If the direction is negative, the value will be negative
                Thread.sleep(1000 * Math.abs(newFloor - currentFloor));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentFloor = newFloor;
            System.out.println("Now at floor: " + currentFloor + ": " + floorDescriptions[currentFloor]+ ".");
        }
    }

    // KeyPressed is used when the key is pressed
    // We use this method to move the lift
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                moveLift(1);
                break;
            case KeyEvent.VK_DOWN:
                moveLift(-1);
                break;
        }
    }

    // KeyReleased and KeyTyped are not used
    // but must be implemented for the KeyListener interface

    //KeyReleased is used when the key is released
    //KeyTyped is used when the key is typed

    //We don't need to do anything in these methods
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        ExtraWS2 extraWS2 = new ExtraWS2();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a floor number: ");
            System.out.println("0: Ground, 1: Office, 2: Apartment 1, 3: Apartment 2, 4: Penthouse, 5: Roof");
            System.out.println("Press UP to go up and DOWN to go down.");

            int floor = input.nextInt();

            if (extraWS2.isFloorValid(floor)) {
                extraWS2.currentFloor = floor;
                try {
                    Thread.sleep(1000*floor);
                } catch (InterruptedException e) {
                    e.printStackTrace(); //Logs the error
                }
                System.out.println("Now at floor: " + floor + ": " + extraWS2.floorDescriptions[floor] + ".");
            } else {
                System.out.println("The floor is invalid.");
            }
        }
    }
}