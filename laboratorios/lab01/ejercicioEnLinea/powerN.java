public int powerN(int base, int n) {
return n == 0 ? 1: base * powerN(base,n-1);
}