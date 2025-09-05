public class Main {
    public static void main(String[] args) {
        ChemicalElement hydrogen = new ChemicalElement("H", "Hydrogen", 1);
        ChemicalElement potassium = new ChemicalElement("K", "Potassium", 19);
        ChemicalElement zinc = new ChemicalElement("Zn", "Zinc", 30);
        ChemicalElement gallium = new ChemicalElement("Ga", "Gallium", 31);

        System.out.println(potassium.isAlkaliMetal());
        System.out.println(zinc.isTransitionMetal());
        System.out.println(gallium.isMetal());
        System.out.println(hydrogen.isMetal());
    }
}