package paes.javaThread;

public class Acumulator {
    private int totalOdd = 0;
    private int totalEven = 0;

    public int getTotalOdd() {
        return totalOdd;
    }

    public void setTotalOdd(int totalOdd) {
        this.totalOdd = totalOdd;
    }

    public int getTotalEven() {
        return totalEven;
    }

    public void setTotalEven(int totalEven) {
        this.totalEven = totalEven;
    }

    public void toString(int sum) {
        System.out.println("Total: " + sum);
        System.out.println("Odd total: " + getTotalOdd());
        System.out.println("Even total: " + getTotalEven());
    }
}
