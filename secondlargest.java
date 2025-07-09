class secondlargest{
 public static void main(String[]args){
	int a=10;
	int b=20;
	int c=30;
	if((a>b &&b>c)||(b>a && c>b)){
	System.out.println("the second largest element is" +b);}
	else if((b>a &&a>c)||(a>b &&c>a)){
	System.out.println("the second largest element is" +a);}
	else{
	System.out.println("the second largest element is" +c);}
}
}