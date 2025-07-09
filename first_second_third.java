class first_second_third{
  public static void main(String []args){
        int a=10;	
	int b=20;
	int c=30;
	if(a>b && a>c){
	System.out.println("the First rank is"+a);}
	else if(b>c ){
	System.out.println("the First rank is"+b);}
	else{
	System.out.println("the First rank is"+c);}

	if((a>b &&b>c)||(b>a && c>b)){
	System.out.println("the second rank  is" +b);}
	else if((b>a &&a>c)||(a>b &&c>a)){
	System.out.println("the second rank  is" +a);}
	else{
	System.out.println("the second rank  is" +c);}

	if(a<b && a<c){
	System.out.println("the Third rank is"+a);}
	else if(b<c ){
	System.out.println("the Third rank is"+b);}
	else{
	System.out.println("the Third rank is"+c);}
	

}
}
