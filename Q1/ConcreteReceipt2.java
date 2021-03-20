public class ConcreteReceipt2 extends AbstractSalesReceiptFactory{

    public AbstractReceipt createReceipt() {
        return new Receipt1();
    }

    public AbstractHeader createHeader() {
        return new Header1();
    }


    public AbstractFooter createFooter() {
        return new Footer1();
    }

    private ConcreteReceipt2() {
    }

    public String displayName() {
        return "Receipt2";
    }
    private static ConcreteReceipt2 instance = null;

    public static ConcreteReceipt2 getInstance() {
        instance = new ConcreteReceipt2();
        return instance;
    }


}