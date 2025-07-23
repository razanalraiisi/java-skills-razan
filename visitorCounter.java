public class visitorCounter {
    private static int totalVisitors = 0;


    private int sessionVisits;
    private String visitorName;


    public visitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisits = 0;
        totalVisitors++;
    }


    public void recordVisit() {
        sessionVisits++;
        System.out.println(visitorName + " visited. Session visits: " + sessionVisits);
    }


    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }


    public static int getTotalVisitors() {
        return totalVisitors;
    }


    public static void main(String[] args) {
        visitorCounter v1 = new visitorCounter("Alice");
        visitorCounter v2 = new visitorCounter("Bob");
        visitorCounter v3 = new visitorCounter("Charlie");


        v1.recordVisit();
        v1.recordVisit();

        v2.recordVisit();

        v3.recordVisit();
        v3.recordVisit();
        v3.recordVisit();


        displayTotalVisitors();
    }
}
