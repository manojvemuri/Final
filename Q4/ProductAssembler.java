class ProductAssembler {

Builder builder ;
ProductAssembler (Builder builder){
this.builder = builder;
}

public void assemble(){
builder.buildPart1();
builder.buildPart2();
builder.buildPart3();
builder.buildPart4();
}
}