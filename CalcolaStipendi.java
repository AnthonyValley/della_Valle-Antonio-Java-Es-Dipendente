public class CalcolaStipendi {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("00309", 1000.00, 7.50);
        System.out.println("Stipendio con straordinari: " + d1.paga(10));
        System.out.println("Stipendio base: " + d1.getStipendio());

        DipendenteA d2 = new DipendenteA("00201", 1500.00, 8.50);
        d2.prendiMalattia(5);
        System.out.println("Stipendio con straordinari e malattia: " + d2.paga(3));
        d2.stampaMalattia();
    }
}