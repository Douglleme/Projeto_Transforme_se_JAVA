package Enums;

public class EnumTestes {
    
    public static void main(String[] args) {
        Turno turno = Turno.TARDE;
        
        System.out.println("Turno: " + Turno.values());
        
        for(Turno t : Turno.values()) {
            System.out.println("Turno: " + t.getDescricao());
        }
    }

}