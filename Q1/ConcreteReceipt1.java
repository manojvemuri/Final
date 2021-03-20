public class ConcreteReceipt1 extends AbstractSalesReceiptFactory{

    public AbstractReceipt createReceipt() {
        return new Receipt1();
    }
    public AbstractHeader createHeader() {
        return new Header1();
    }


    public AbstractFooter createFooter() {
        return new Footer1();
    }

    private ConcreteReceipt1() {}

    public String displayName() {
        return "Receipt1";
    }

    private static ConcreteReceipt1 instance = null;

    public static ConcreteReceipt1 getInstance() {
        instance = new ConcreteReceipt1();
        return instance;
    }
}