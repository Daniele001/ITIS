/*
 *  (c) Daniele Ceribelli, 2018. Some rights reserved.
 *  See LICENSE file for more details.
 *  THE SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND.
*/

#include <iostream>
#include <cmath>

using namespace std;

void soluzione_eq(int a, int b, int c) {
    float delta = 0, x1 = 0, x2 = 0;
    delta =(float)pow(b, 2) -4*a*c;
    if(delta >= 0) {
        x1 = (-b + sqrt(delta)) / (2 * a);
        x2 = (-b - sqrt(delta)) / (2 * a);
        cout << "x1: " << x1 <<endl;
        cout << "x2: " << x2 <<endl;
    }
    else {
        cout << "impossibile" <<endl;
    }
}

int main() {
    int a, b, c;
    cout << "inserisci a: ";
    cin >> a;
    cout << "inserisci b: ";
    cin >> b;
    cout << "inserisci c: ";
    cin >> c;

    soluzione_eq(a, b, c);
    return 0;
}