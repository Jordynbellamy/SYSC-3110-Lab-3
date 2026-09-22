public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    static void main() {
        BuddyInfo b = new BuddyInfo();
        System.out.println("Hello " + b.getName());
    }

    public BuddyInfo(){

        this("Default name", "Default address", 0000000000);
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = "Homer";
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }
}
