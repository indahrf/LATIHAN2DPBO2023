
#include <iostream> 
#include <string>
#include "Human.cpp"

using namespace std;

class Civitas : protected Human{
    protected:
        string asal_universitas;
        string email_edu;
};