#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <vector>

#define THRESHOLD 0.40

using namespace std;

vector< vector<int> > makeMatrix(){
  int n = rand() % 5 + 5;
  vector<int> row(n,0);
  vector< vector<int> > matrix(n,row);

  for( int r = 0; r < n; r++ ){
    for( int c = r + 1; c < n; c++ ){
      int rn = rand();
      if( rn < RAND_MAX * 1.0 * THRESHOLD ){
        matrix[r][c] = ( rand() % 5 ) + 1;
        matrix[c][r] = matrix[r][c];
      }
    }
  }
  return matrix;
}

bool fullyConnected( vector< vector<int> > matrix ){
  int n = matrix.size();
  vector<bool> connected(n,false);
  connected[0] = true;
  for( int r = 0; r < n; r++ ){
    for( int c = 0; c < n; c++ ){
      if( connected[r] && matrix[r][c] > 0 ){
        connected[c] = true;
      }
    }
  }

  for( int i = 0; i < n; i++ ){
    if( !connected[i] ){
      return false;
    }
  }

  return true;
}

bool goodMatrix( vector< vector<int> > matrix ){
  int n = matrix.size();
  vector<bool> connected(n,false);

  for( int i = 0; i < n; i++ ){
    for( int j = i + 1; j < n; j++ ){
      if( matrix[i][j] > 0 ){
	connected[i] = true;
	connected[j] = true;
	continue;
      }
    }
  }

  for( int i = 0; i < n; i++ ){
    if( !connected[i] ){
      return false;
    }
  }

  return fullyConnected( matrix );
}

void printMatrix( vector< vector<int> > matrix ){
  cerr << "----------------" << endl;
  for( int r = 0; r < matrix.size(); r++ ){
    for( int c = 0; c < matrix.size(); c++ ){
      fprintf( stderr , "% 2d " , matrix[r][c] );
    }
    cerr << endl;
  }
}

int main( int argc , char **argv ){
  srand( time( NULL ) );

  vector< vector<int> > matrix = makeMatrix();
  
  while( !goodMatrix( matrix ) ){
    matrix = makeMatrix();
  }

  int n = matrix.size();

  for( int i = 0; i < n; i++ ){
    cout << i << endl;
  }
  
  for( int i = 0; i < n; i++ ){
    for( int j = i + 1; j < n; j++ ){
      if( matrix[i][j] ){
	fprintf( stderr , "%d;%d;%d\n" , i , j , matrix[i][j] );
      }
    }
  }
  
  return 0;
}
