#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <vector>
#include <limits>

using namespace std;

int makeMST( vector< vector<int> > matrix ){
  vector<bool> start(matrix.size(),false);
  start[0] = true;
  int mstVal = 0;
  int minVal = numeric_limits<int>::max();
  int minInd = -1;
  for( int i = 1; i < start.size(); i++ ){
    if( matrix[0][i] > 0 && matrix[0][i] < minVal ){
      minVal = matrix[0][i];
      minInd = i;
    }
  }
  mstVal += minVal;
  fprintf( stderr , "%d;%d;%d\n" , 0 , minInd , minVal );
  start[minInd] = true;

  for( int i = 2; i < matrix.size(); i++ ){
    minVal = numeric_limits<int>::max();
    int minF = -1;
    int minT = -1;
    for( int r = 0; r < matrix.size(); r++ ){
      for( int c = 0; c < matrix.size(); c++ ){
	if( start[r] && !start[c] && matrix[r][c] > 0 && matrix[r][c] < minVal ){
	  minVal = matrix[r][c];
	  minF = r;
	  minT = c;
	}
      }
    }
    mstVal += minVal;
    //cerr << "mstVal" << endl;
    start[minF] = true;
    //cerr << "u T" << endl;
    start[minT] = true;
    fprintf( stderr , "%d;%d;%d\n" , minF , minT , minVal );
  }
  return mstVal;
}

int main( int argc , char **argv ){
  int numNodes;
  cin >> numNodes;
  vector<int> row(numNodes,numeric_limits<int>::max());
  vector< vector<int> > matrix(numNodes,row);
  int r , c , v;
  while( cin >> r >> c >> v ){
    matrix[r][c] = v;
    matrix[c][r] = v;
  }
  for( int i = 0; i < numNodes; i++ ){
    matrix[i][i] = 0;
  }

  cout << makeMST( matrix ) << endl;
  return 0;
}
