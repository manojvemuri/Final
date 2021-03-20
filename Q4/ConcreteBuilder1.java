class ConcreteBuilder1 implements Builder{
Product product;
  
ConcreteBuilder1(){
this.product = new Product();
}
public void buildPart1(){
product.setPart1("11");
}
public void buildPart2(){
product.setPart2("12");
}
public void buildPart3(){
product.setPart3("13");
}
public void buildPart4(){
product.setPart4("14");
}
public Product getProduct(){
return product;
}
}