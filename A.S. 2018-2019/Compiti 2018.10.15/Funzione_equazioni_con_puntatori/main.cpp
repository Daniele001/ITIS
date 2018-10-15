/*
 *  (c) Daniele Ceribelli, 2018. Some rights reserved.
 *  See LICENSE file for more details.
 *  THE SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND.
*/

#include <iostream>
#include <cmath>

using namespace std;

void soluzione_eq(int a, int b, int c, float *x1, float *x2) {
    float delta = 0;
    delta = (float)(pow(b, 2) - 4 * a * c);
    if(delta >= 0) {
        *x1 =(-b + sqrt(delta)) / (2 * a);
        *x2 =(-b - sqrt(delta)) / (2 * a);
    }
    else {
        cout << "impossibile" <<endl;
    }
}
int main() {
    int a, b, c;
    float x1, x2;
    cout << "inserisci a: ";
    cin >> a;
    cout << "inserisci b: ";
    cin >> b;
    cout << "inserisci c: ";
    cin >> c;

    soluzione_eq(a, b, c, &x1, &x2);
    cout << "x1: " << x1 << endl << "x2: " << x2;

    return 0;
}