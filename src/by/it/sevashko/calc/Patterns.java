package by.it.sevashko.calc;

class Patterns {

    // регулярки, приведены для сокращения времени.
    // будет полезно составить свои варианты
    static final String SCALAR="((-?)([0-9.])+)";                       //числа
    static final String VECTOR="\\{((-?([0-9.])+),?)+}";                //вектора
    static final String MATRIX="\\{((\\{((-?([0-9.])+),?)+}),?)+}";     //матрицы
    static final String NAME_VAR="";

    //этот паттерн весьма несовершенный, т.к. операции вида
    //3.0 * -4.1 работать не смогут. Проблему решим позднее.
    static final String OPERATION="[-+*/=]";                             //операция
}
