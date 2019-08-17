public int count7(int n) {
int aux = 0;
if(n<7){
return 0;
}else{

if(n%10 == 7){
  aux = 1;    
}else{
  aux = 0;
}

return aux + count7(n/10);
}
}