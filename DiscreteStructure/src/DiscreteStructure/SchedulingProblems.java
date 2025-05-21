package DiscreteStructure;
import java.util.ArrayList;
import java.util.Scanner;

class Flight {
    String flightId;
    int startHour;
    int endHour;
    boolean isAssigned;

    Flight(String id, int start, int end) {
        flightId = id;
        startHour = start;
        endHour = end;
        isAssigned = false;
    }

    int getSignal() {
        return isAssigned ? 1 : 0;
    }

    public String toString() {
        return flightId + " (" + startHour + ":00 - " + endHour + ":00)";
    }
}

class Pilot {
    String pilotName;
    int availableFrom;
    int availableTo;
    ArrayList<Flight> assignedFlights;

    Pilot(String name, int from, int to) {
        pilotName = name;
        availableFrom = from;
        availableTo = to;
        assignedFlights = new ArrayList<>();
    }

    boolean canTakeFlight(Flight flight) {
        if (flight.isAssigned) return false;
        if (flight.startHour < availableFrom || flight.endHour > availableTo) return false;

        for (Flight assigned : assignedFlights) {
            boolean overlap = !(flight.endHour <= assigned.startHour || flight.startHour >= assigned.endHour);
            if (overlap) return false;
        }
        return true;
    }

    void assignFlight(Flight flight) {
        assignedFlights.add(flight);
        flight.isAssigned = true;
    }

    void unassignFlight(Flight flight) {
        assignedFlights.remove(flight);
        flight.isAssigned = false;
    }

    int getSignal() {
        return assignedFlights.size() > 0 ? 1 : 0;
    }

    public String toString() {
        return pilotName + " (" + availableFrom + ":00 - " + availableTo + ":00)";
    }
}

public class SchedulingProblems {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Flight> allFlights = new ArrayList<>();
    static ArrayList<Pilot> allPilots = new ArrayList<>();

    public static void main(String[] args) {
        allFlights.add(new Flight("F1", 9, 11));
        allFlights.add(new Flight("F2", 10, 12));
        allFlights.add(new Flight("F3", 13, 15));
        allFlights.add(new Flight("F4", 14, 16));

        allPilots.add(new Pilot("Ali", 8, 16));
        allPilots.add(new Pilot("Aurangzeb", 10, 18));

        int choice;
        do {
            System.out.println("\n--- Flight Scheduler Menu ---");
            System.out.println("1. Show Flights with Signals");
            System.out.println("2. Show Pilots with Signals");
            System.out.println("3. Assign a Flight to a Pilot");
            System.out.println("4. Exit");
            System.out.println("5. Unassign a Flight from a Pilot");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                showFlights();
            } else if (choice == 2) {
                showPilots();
            } else if (choice == 3) {
                assignFlight();
            } else if (choice == 4) {
                System.out.println("Program ended.");
            } else if (choice == 5) {
                unassignFlight();
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    static void showFlights() {
        System.out.println("\nFlight List:");
        for (Flight f : allFlights) {
            System.out.println(f + " | Signal: " + f.getSignal());
        }
    }

    static void showPilots() {
        System.out.println("\nPilot List:");
        for (Pilot p : allPilots) {
            System.out.println(p + " | Signal: " + p.getSignal());
        }
    }

    static void assignFlight() {
        System.out.print("Enter flight ID to assign (F1,F2,...): ");
        String id = input.nextLine();
        Flight selectedFlight = null;
        for (Flight f : allFlights) {
            if (f.flightId.equalsIgnoreCase(id)) {
                selectedFlight = f;
                break;
            }
        }
        if (selectedFlight == null) {
            System.out.println("Flight not found.");
            return;
        }
        if (selectedFlight.isAssigned) {
            System.out.println("This flight is already assigned.");
            return;
        }
        System.out.println("Available Pilots:");
        for (int i = 0; i < allPilots.size(); i++) {
            System.out.println((i + 1) + ". " + allPilots.get(i));
        }
        System.out.print("Choose pilot number: ");
        int pilotIndex = input.nextInt();
        input.nextLine();
        if (pilotIndex < 1 || pilotIndex > allPilots.size()) {
            System.out.println("Invalid pilot number.");
            return;
        }
        Pilot chosenPilot = allPilots.get(pilotIndex - 1);
        if (chosenPilot.canTakeFlight(selectedFlight)) {
            chosenPilot.assignFlight(selectedFlight);
            System.out.println("Flight " + selectedFlight.flightId + " assigned to " + chosenPilot.pilotName);
        } else {
            System.out.println("Pilot not available for this flight.");
        }
    }

    static void unassignFlight() {
        System.out.println("\n--- Unassign Flight ---");
        boolean anyAssigned = false;

        for (Pilot p : allPilots) {
            if (!p.assignedFlights.isEmpty()) {
                anyAssigned = true;
                break;
            }
        }

        if (!anyAssigned) {
            System.out.println("No flights are currently assigned.");
            return;
        }

        System.out.println("Select a pilot:");
        for (int i = 0; i < allPilots.size(); i++) {
            System.out.println((i + 1) + ". " + allPilots.get(i).pilotName);
        }

        System.out.print("Enter pilot number: ");
        int pilotIndex = input.nextInt();
        input.nextLine();

        if (pilotIndex < 1 || pilotIndex > allPilots.size()) {
            System.out.println("Invalid pilot number.");
            return;
        }

        Pilot selectedPilot = allPilots.get(pilotIndex - 1);
        if (selectedPilot.assignedFlights.isEmpty()) {
            System.out.println("This pilot has no assigned flights.");
            return;
        }

        System.out.println("Assigned flights:");
        for (int i = 0; i < selectedPilot.assignedFlights.size(); i++) {
            System.out.println((i + 1) + ". " + selectedPilot.assignedFlights.get(i));
        }

        System.out.print("Enter flight number to unassign: ");
        int flightIndex = input.nextInt();
        input.nextLine();

        if (flightIndex < 1 || flightIndex > selectedPilot.assignedFlights.size()) {
            System.out.println("Invalid flight number.");
            return;
        }

        Flight flightToUnassign = selectedPilot.assignedFlights.get(flightIndex - 1);
        selectedPilot.unassignFlight(flightToUnassign);
        System.out.println("Flight " + flightToUnassign.flightId + " unassigned from " + selectedPilot.pilotName);
    }
}
