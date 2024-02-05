package Task13;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Extend Afritada Class here
class Mechado extends Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Tomato Paste"};
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Another class extending Mechado
class Menudo extends Mechado {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes", "Carrots", "Bell Peppers", "Raisins", "Liver Spread"};
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// Another class extending Menudo
class Caldereta extends Menudo {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Tomato Paste", "Liver Spread",
                "Raisins", "Hotdog", "Siling Labuyo", "Cheese"};
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

public class Task131 {
    public static void main(String[] args) {
        // Create new objects Afritada, Mechado, Menudo, and Caldereta
        Afritada meal1 = new Afritada();
        Mechado meal2 = new Mechado();
        Menudo meal3 = new Menudo();
        Caldereta meal4 = new Caldereta();

        // Display ingredients for every object
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
