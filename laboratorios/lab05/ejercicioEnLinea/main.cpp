#include <iostream>
#include <vector>
#define MAX 1000

using namespace std;

bool mt[MAX][MAX];
int V, E;

bool freeColor(int v, int color[], int c){
  for(int i = 0; i<V;i++){
    if(mt[v][i] && c == color[i]){
      return false;
    }
  }
  return true;
}

bool btColoring(int m, int color[],int v){
  if (v == V) return true;
  for(int i = 1; i<=m;i++){
    if(freeColor(v,color,i)){
      color[v] = i;
      if(btColoring(m,color,v+1)) return true;
      color[v] = 0;
    }
  }
  return false;
}

void solve(int color[]){
  for(int i = 0; i<V;i++){
    cout<<color[i]<<" ";
  }
  cout << "\n";
}

bool isColored(int C){
  int color[V];
  for(int i = 0; i<V; i++){
    color[i] = 0;
  }
  if(!btColoring(C,color,0)){
    return false;
  }
  solve(color);
  return true;
}
int main() {
  int C;
  int a, b;
  cin >> V >> E;
  while(E--){
    cin >> a >> b;
    mt[a][b] = true;
    mt[b][a] = true;
  }

 C = 2;
  if(!isColored(C)){
    cout<<"No hay solucion\n";
  }else{
    cout<<"Bicoloreable\n";
  }
  return 0;
}
