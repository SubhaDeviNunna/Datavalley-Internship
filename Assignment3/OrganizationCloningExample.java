import java.util.Scanner;

class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Getter and setter methods if needed

}

public class OrganizationCloningExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Organization Code: ");
        int code = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Organization Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Organization Address: ");
        String address = scanner.nextLine();

        Organization org1 = new Organization(code, name, address);
        System.out.println("Details of Original Organization:");
        org1.printDetails();

        try {
            Organization org2 = (Organization) org1.clone();
            System.out.println("\nDetails of Cloned Organization:");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
