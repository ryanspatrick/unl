#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <vector>

#define THRESHOLD 0.4

using namespace std;

vector< vector<int> > makeMatrix(){
  int n = rand() % 5 + 5;
  vector<int> row(n,0);
  vector< vector<int> > matrix(n,row);

  for( int r = 0; r < n; r++ ){
    for( int c = r + 1; c < n; c++ ){
      int rn = rand();
      if( rn < RAND_MAX * 0.5 * THRESHOLD ){
        matrix[r][c] = ( rand() % 5 ) + 1;
      }
      else if( rn < RAND_MAX * 1.0 * THRESHOLD ){
	matrix[c][r] = ( rand() % 5 ) + 1;
      }
    }
  }
  return matrix;
}

bool goodMatrix( vector< vector<int> > matrix ){
  int n = matrix.size();
  vector<bool> connected(n,false);
  vector<bool> source(n,true);
  vector<bool> sink(n,true);
  vector<int> ins(n,0);
  vector<int> outs(n,0);
  int pseudosources = 0;
  int pseudosinks = 0;

  for( int i = 0; i < n; i++ ){
    for( int j = i + 1; j < n; j++ ){
      if( matrix[i][j] > 0 || matrix[j][i] > 0 ){
	connected[i] = true;
	connected[j] = true;
	continue;
      }
    }
  }

  for( int i = 0; i < n; i++ ){
    int in = 0;
    for( int j = 0; j < n; j++ ){
      if( matrix[j][i] > 0 ){
	source[i] = false;
	in++;
      }
    }
    ins[i] = in;
  }

  for( int i = 0; i < n; i++ ){
    int out = 0;
    for( int j = 0; j < n; j++ ){
      if( matrix[i][j] > 0 ){
	sink[i] = false;
	out++;
      }			  
    }
    outs[i] = out;
  }

  int sources = 0;
  int sinks = 0;
  for( int i = 0; i < n; i++ ){
    if( source[i] && outs[i] > 1 ){
      sources++;
      pseudosources++;
    }
    else if( source[i] ){
      pseudosources++;
    }
    if( sink[i] && ins[i] > 1 ){
      sinks++;
      pseudosinks++;
    }
    else if( sink[i] ){
      pseudosinks++;
    }
  }
  
  for( int i = 0; i < n; i++ ){
    if( !connected[i] ){
      return false;
    }
  }

  return sources == 1 && sinks == 1 && pseudosources == 1 && pseudosinks == 1;
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
    for( int j = 0; j < n; j++ ){
      if( matrix[i][j] ){
	fprintf( stderr , "%d;%d;%d\n" , i , j , matrix[i][j] );
      }
    }
  }
  
  return 0;
}
