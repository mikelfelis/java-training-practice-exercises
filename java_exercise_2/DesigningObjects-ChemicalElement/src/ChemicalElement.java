public class ChemicalElement {
    private final String symbol;
    private final String name;
    private final int atomicNumber;

    private static final boolean[] METALS = new boolean[117];

    static {
        int[] metalNumbers = {31, 49, 50, 81, 82, 83, 113, 114, 115, 116};
        for (int num : metalNumbers) {
            METALS[num] = true;
        }
    }

    public ChemicalElement(String symbol, String name, int atomicNumber) {
        this.symbol = symbol;
        this.name = name;
        this.atomicNumber = atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public boolean isAlkaliMetal() {
        switch (atomicNumber) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
                return true;
            default:
                return false;
        }
    }

    public boolean isTransitionMetal() {
        return (atomicNumber >= 21 && atomicNumber <= 30) ||
                (atomicNumber >= 39 && atomicNumber <= 48) ||
                (atomicNumber >= 72 && atomicNumber <= 80) ||
                (atomicNumber >= 104 && atomicNumber <= 112);
    }

    public boolean isMetal() {
        if (atomicNumber >= 0 && atomicNumber < METALS.length) {
            return METALS[atomicNumber];
        }
        return false;
    }
}
