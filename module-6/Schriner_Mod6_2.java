/**
 *
 * Jason Schriner
 * Mod 6.2
 * 2/2/25
 */
public class Schriner_Mod6_2 {

    public static void main(String[] args) {
        //Instance 1 using Default Constructor
        Fan fan1 = new Fan();
        //Call toString Method to print results
        System.out.println(fan1.toString()); 

        //Instance 2 using setters and getters
        Fan fan2 = new Fan(Fan.Medium, true, 8.0, "Pink");
        //Call toString Method to print results
        System.out.println(fan2.toString());

    }

    public static class Fan {

        // Constants for fan speeds
        public static final int Stopped = 0;
        public static final int Slow = 1;
        public static final int Medium = 2;
        public static final int Fast = 3;

        private int speed;
        private boolean On;
        private double radius;
        private String color;

        // No-argument constructor
        public Fan() {
            this.On = false;
            this.speed = Stopped;  // Default speed is STOPPED
            this.radius = 6.0;     // Default radius is 6.0
            this.color = "White";  // Default color is white
        }

        // Constructor with arguments to set specific values
        public Fan(int speed, boolean On, double radius, String color) {
            this.speed = speed;
            this.On = On;
            this.radius = radius;
            this.color = color;
        }

        // Getter and setter for speed
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        // Getter and setter for On
        public boolean getOn() {
            return On;
        }

        public void setOn(boolean On) {
            this.On = On;
        }

        // Getter and setter for radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Getter and setter for color
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // toString() method to describe the fan's state
        public String toString() {
            
            //Needed to convert the speed from an int to a speed variable
            String speedDescription;
             if (speed == Slow) {
            speedDescription = "Slow";
            } else if (speed == Medium) {
            speedDescription = "Medium";
            } else if (speed == Fast) {
            speedDescription = "Fast";
            } else {
            speedDescription = "Stopped";
            }

            return "Fan Speed: " + speedDescription +
                   ", Status: " + (On ? "On" : "Off") +
                   ", Color: " + color + 
                   ", Radius: " + radius + " inches";
        }
        
        /*
        * Used https://www.geeksforgeeks.org/object-tostring-method-in-java/
        * to help create the to string method had trouble with this part
        */
    }
}