import java.util.scanner
public class addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi pirmo skaitli: ");
        int pirmais = Integer.valueOf(Scanner.nextLine());

        System.out.print("Ievadi otro skaitli: ");
        int otro = Integer.valueOf(Scanner.nextLine());

        int rezultats = pirmais + otro;
        System.out.print("Rezultāts ir: " + rezultats);

    }
}