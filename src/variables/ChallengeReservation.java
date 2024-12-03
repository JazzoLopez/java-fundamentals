package variables;

public class ChallengeReservation {
    public static void main(String[] args) {
        var clientName = "Pedro";
        var daysOfStay = 7;
        var dailyRate = 399.50;
        var hasSeaView = false;

        System.out.println("<-- RETO DE RESERVACIONES -->");
        System.out.println("clientName = " + clientName);
        System.out.println("daysOfStay = " + daysOfStay);
        System.out.println("dailyRate = " + dailyRate);
        System.out.println("hasSeaView = " + hasSeaView);

        clientName = "Pablo";
        daysOfStay = 12;
        dailyRate = 500;
        hasSeaView = true;

        System.out.println();
        System.out.println("<-- DATOS MODIFICADOS -->");
        System.out.println("clientName = " + clientName);
        System.out.println("daysOfStay = " + daysOfStay);
        System.out.println("dailyRate = " + dailyRate);
        System.out.println("hasSeaView = " + hasSeaView);
    }
}
