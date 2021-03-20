class ConcreteBuilder2 implements Builder{
Product product;
  
ConcreteBuilder2(){
this.product = new Product();
}
public void buildPart1(){
product.setPart1("21");
}
public void buildPart2(){
product.setPart2("22");
}
public void buildPart3(){
product.setPart3("23");
}
public void buildPart4(){
product.setPart4("24");
}
public Product getProduct(){
return product;
}
}