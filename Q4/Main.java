public class Main 
{
public static void main (String args[])
{
  
Builder b1 = new ConcreteBuilder1();
ProductAssembler assembler = new ProductAssembler(b1);
  
assembler.assemble();
  
Product finalProduct = b1.getProduct();
System.out.println(" Final Product " + finalProduct);
  
}
}