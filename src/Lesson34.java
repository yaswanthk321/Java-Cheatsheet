
/*
 * own implementation of hashcode and equal methods of object class
 */

class Laptop {
    String Model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Model == null) ? 0 : Model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (Model == null) {
            if (other.Model != null)
                return false;
        } else if (!Model.equals(other.Model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class Lesson34 {

    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.Model = "Lenovo Thinkpad";
        obj.price = 50000;

        Laptop obj1 = new Laptop();
        obj1.Model = "Lenovo Thinkpad";
        obj1.price = 50000;

        System.out.println(obj.hashCode()); // -715120093
        System.out.println(obj.equals(obj1)); // true

    }
}
