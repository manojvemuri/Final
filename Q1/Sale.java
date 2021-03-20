// Manoj Kumar Vemuri ID 2022213
package Q1;

import java.util.*;
public class Sale {

    public static AbstractReceipt ar;
    public static AbstractHeader ah;
    public static AbstractFooter af;

    public Sale(AbstractSalesReceiptFactory factory) {
        ar = factory.createReceipt();
        ah = factory.createHeader();
        af = factory.createFooter();
    }

    public void run() {
      System.out.println(
            String.format( "%s %s %s", ah.displayName(), ar.displayName(),  af.displayName() )
        );
    }

    public static void main (String [] args) {
        AbstractSalesReceiptFactory receipt1 = ConcreteReceipt1.getInstance();

        Sale c1 = new Sale(receipt1);
        c1.run();
    }
}