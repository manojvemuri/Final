class ConcreteBuilder3 implements Builder{
Product product;
  
ConcreteBuilder3(){
this.product = new Product();
}
public void buildPart1(){
product.setPart1("31");
}
public void buildPart2(){
product.setPart2("32");
}
public void buildPart3(){
product.setPart3("33");
}
public void buildPart4(){
product.setPart4("34");
}
public Product getProduct(){
return product;
}
}