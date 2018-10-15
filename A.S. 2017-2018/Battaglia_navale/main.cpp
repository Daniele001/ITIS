#include<iostream>
#include<cmath>
#include <cstdlib>
#include<cstdio>
#include <ctime>
#include <random>

using namespace std;

void zero (int a, int b, int grid[10][10]);

int main() {
    int grid[10][10], coordinates[5][4];
    time_t t;
//counters
    int i = 0, k = 0, i_2 = 0, k_2 = 0, r = 0, c = 0;
//variables
    int x = 0, y = 0, x1 = 0, y1 = 0;
    int direction = 0;
    int dim = 0;
    int ship = 1;
    bool sunk_t = false, sov = true;
//code1
    zero(i, k, grid[10][10]);
    srand((unsigned) time(&t));
    for(i = 0; i < 5; i++) {
        for(k = 0; k < 2; k++) {
            x = rand() % 10;
            coordinates[i][k] = x;
        }
    }
    for(i = 0, k = 0; i < 5; i++, ship++) {
        x = coordinates[i][k];
        y = coordinates[i][k+1];
        grid[x][y] = ship;
    }
    ship = 1;
    for(i = 0, x1 = 0, y1 = 0; i < 10; i++) {
        for(k = 0; k < 10; k++) {
            if(grid[i][k] == ship) {
                dim = 0;
                c = 0;
                dim = rand() % 4 + 1;
                coordinates[x1][2] = dim;
                x1++;
                direction = rand() % 4;
                coordinates[y1][3] = direction;
                y1++;
                if (direction == 0) {
                    for (i_2 = 1; i_2 < dim; i_2++) {
                        i--;
                        grid[i][k] = ship;
                        c++;
                    }
                }
                if (direction == 1) {
                    for (i_2 = 1; i_2 < dim; i_2++) {
                        k--;
                        c++;
                    }
                }
                if (direction == 2) {
                    for (i_2 = 1; i_2 < dim; i_2++) {
                        i++;
                        c++;
                    }
                }
                if (direction == 3) {
                    for (i_2 = 1; i_2 < dim; i_2++) {
                        k++;
                        c++;
                    }
                }
                if (i < 0 || i > 9 || k < 0 || k > 9) {
                    dim--;
                    if (direction == 0) i = i + c;
                    if (direction == 1) k = k + c;
                    if (direction == 2) i = i - c;
                    if (direction == 3) k = k - c;
                    if (k > 0) {
                        k--;
                    } else if (i > 0) {
                        i--;
                    } else {
                        i = 0;
                        k = 0;
                    }
                }
                else{
                    for(r = 1; r < dim; r++) {
                        if (direction == 0) {
                            grid[i][k] = ship;
                            i++;
                        }
                        if (direction == 1) {
                            grid[i][k] = ship;
                            k++;
                        }
                        if (direction == 2) {
                            grid[i][k] = ship;
                            i--;
                        }
                        if (direction == 3) {
                            grid[i][k] = ship;
                            k--;
                        }
                    }
                }
            }
            ship++;
        }
    }
    for(i = 0; i < 10; i++) {
        printf("\t");
        for(k = 0; k < 10; k++) {
            printf("%d ", grid[i][k]);
        }
        printf("\n");
    }
    return 0;
}
void zero (int a, int b, int grid[10][10]) {
    for(a = 0; a < 10; a++) {
        for(b = 0; b < 10; b++) {
            grid[a][b] = 0;
        }
    }
}