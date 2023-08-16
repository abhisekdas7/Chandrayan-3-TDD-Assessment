import java.util.*;
public class Chandrayan3 {

        private int x, y, z;
        private String direction;

        public Chandrayan3(int x, int y, int z, String direction) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.direction = direction;
        }

        public void moveForward() {
            if ("N".equals(direction)) {
                y++;
            } else if ("S".equals(direction)) {
                y--;
            } else if ("E".equals(direction)) {
                x++;
            } else if ("W".equals(direction)) {
                x--;
            } else if ("Up".equals(direction)) {
                z++;
            } else if ("Down".equals(direction)) {
                z--;
            }
        }

        public void moveBackward() {
            if ("N".equals(direction)) {
                y--;
            } else if ("S".equals(direction)) {
                y++;
            } else if ("E".equals(direction)) {
                x--;
            } else if ("W".equals(direction)) {
                x++;
            } else if ("Up".equals(direction)) {
                z--;
            } else if ("Down".equals(direction)) {
                z++;
            }
        }

        public void turnLeft() {
            if ("N".equals(direction)) {
                direction = "W";
            } else if ("W".equals(direction)) {
                direction = "S";
            } else if ("S".equals(direction)) {
                direction = "E";
            } else if ("E".equals(direction)) {
                direction = "N";
            }
        }

        public void turnRight() {
            if ("N".equals(direction)) {
                direction = "E";
            } else if ("E".equals(direction)) {
                direction = "S";
            } else if ("S".equals(direction)) {
                direction = "W";
            } else if ("W".equals(direction)) {
                direction = "N";
            }
        }

        public void turnUp() {
            if ("N".equals(direction)) {
                direction = "U";
            } else if ("S".equals(direction)) {
                direction = "D";
            } else if ("E".equals(direction) || "W".equals(direction)) {

            }
        }

        public void turnDown() {
            if ("U".equals(direction)) {
                direction = "U";
            } else if ("D".equals(direction)) {
                direction = "D";
            } else if ("E".equals(direction) || "W".equals(direction)) {

            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] startingPosition = {0, 0, 0};
            String initialDirection = "N";
         //   String[] commands = {"f", "r", "u", "b", "l"};

            Chandrayan3 spacecraft = new Chandrayan3(startingPosition[0], startingPosition[1], startingPosition[2], initialDirection);
            while(true) {

                String command=sc.next();
                    switch (command) {
                        case "f":
                            spacecraft.moveForward();
                            break;
                        case "b":
                            spacecraft.moveBackward();
                            break;
                        case "l":
                            spacecraft.turnLeft();
                            break;
                        case "r":
                            spacecraft.turnRight();
                            break;
                        case "u":
                            spacecraft.turnUp();
                            break;
                        case "d":
                            spacecraft.turnDown();
                            break;
                    }


            int[] finalPosition = {spacecraft.x, spacecraft.y, spacecraft.z};
            String finalDirection = spacecraft.direction;

            System.out.println("Starting Position: (" + startingPosition[0] + ", " + startingPosition[1] + ", " + startingPosition[2] + ")");
            System.out.println("Initial Direction: " + initialDirection);
            System.out.println("Final Position: (" + finalPosition[2] + ", " + finalPosition[1] + ", " + finalPosition[0] + ")");
            System.out.println("Final Direction: " + finalDirection);
        }
    }
}


