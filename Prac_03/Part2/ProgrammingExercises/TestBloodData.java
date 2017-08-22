public class TestBloodData {
    public static void main(String[] args) {
    BloodData client1 = new BloodData();
    BloodData client2 = new BloodData("B", "+");
    BloodData client3 = new BloodData("A", "-");

    client1.showData();
    client2.showData();
    client3.showData();

    client1.setBloodType("A");
    client1.setBloodrhFactor("-");
    client1.showData();

    client1.setBloodrhFactor("");
    client1.showData();

    client1.setBloodrhFactor("B");
    client1.showData();

    client2.setBloodType("Banana");
    client2.showData();
    }
}
