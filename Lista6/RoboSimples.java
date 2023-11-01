import java.util.ArrayList;
import java.util.List;

public class RoboSimples {
    private String Nome;
    private int posX;
    private int posY;
    private String direcao;
    private static List<RoboSimples> robotList = new ArrayList<>();

    public RoboSimples(String name, int x, int y, String direction) {
        validateRobot(name, x, y, direction);
        Nome = name;
        posX = x;
        posY = y;
        direcao = direction;
        robotList.add(this);
    }

    public RoboSimples(String name) {
        this(name, 0, 0, "N");
    }

    public RoboSimples() {
        this("Wally");
    }

    private boolean validateRobot(String name, int x, int y, String newDirection) {
        if (validateName(name) && !isPositionOccupied(x, y) && validateDirection(newDirection))
            return true;
        return false;
    }

    private boolean validateName(String name) {
        if (name == null || name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException("Nome invalido");
        return true;
    }

    private boolean isPositionOccupied(int x, int y) {
        for (RoboSimples robot : robotList) {
            if ((robot.posX == x) && (robot.posY == y)) {
                System.out.printf("Erro ao mover %s: Posição (%d, %d) está ocupada pelo robô %s!!!\n", this.Nome, x, y, robot.Nome);
                return true;
            }
        }
        return false;
    }

    private boolean validateDirection(String direction) {
        switch (direction) {
            case "N":
            case "NL":
            case "L":
            case "SL":
            case "S":
            case "SO":
            case "O":
            case "NO":
                return true;

            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }

    public void move() {
        this.move(1);
    }

    public void move(int steps) {
        switch (direcao) {
            case "N":
                if (!isPositionOccupied(posX, posY + steps))
                    posY += steps;
                break;

            case "L":
                if (!isPositionOccupied(posX + steps, posY))
                    posX += steps;
                break;

            case "S":
                if (!isPositionOccupied(posX, posY - steps))
                    posY -= steps;
                break;

            case "O":
                if (!isPositionOccupied(posX - steps, posY))
                    posX -= steps;
                break;

            case "NL":
                if (!isPositionOccupied(posX + steps, posY + steps)) {
                    posY += steps;
                    posX += steps;
                }
                break;

            case "NO":
                if (!isPositionOccupied(posX - steps, posY + steps)) {
                    posY += steps;
                    posX -= steps;
                }
                break;

            case "SL":
                if (!isPositionOccupied(posX + steps, posY - steps)) {
                    posY -= steps;
                    posX += steps;
                }
                break;

            case "SO":
                if (!isPositionOccupied(posX - steps, posY - steps)) {
                    posY -= steps;
                    posX -= steps;
                }
                break;
        }
    }

    public void changeDirection(String newDirection) {
        direcao = newDirection;
    }

    public String toString() {
        String str = "\nNome: " + Nome + "\n";
        str = str + "Posição do Robô: (" + posX + ", " + posY + ")\n";
        str = str + "Posição do Robô: " + direcao;

        return str;
    }

    public static void main(String[] args) {
        RoboSimples robot1 = new RoboSimples("CAMPOS");
        RoboSimples robot2 = new RoboSimples("QUEIXADA");
        robot1.move(2);
        robot2.move(1);

        System.out.println("Robô 1:");
        System.out.println(robot1);

        System.out.println("\nRobô 2:");
        System.out.println(robot2);
    }
}
