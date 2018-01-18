package by.it.patsko.calc;


abstract class Var implements Operation {
    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException(String.format("Сложение %s + %s невозможно\n", this, other));
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException(String.format("Вычитание %s + %s невозможно\n", this, other));
    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException(String.format("Умножение %s + %s невозможно\n", this, other));

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(String.format("Деление %s + %s невозможно\n", this, other));
    }

    @Override
    public Var assign(Var other) {
//        new CalcException(String.format("Присваивание %s + %s невозможно\n", this, other));
        System.out.printf("Присваивание %s = %s невозможно\n", this, other);
        return null;
    }

    static Var createVar(String operand){
        operand=operand.trim();
        if(operand.matches(Patterns.SCALAR))return new Scalar(operand);
        if(operand.matches(Patterns.VECTOR))return new Vector(operand);
        if(operand.matches(Patterns.MATRIX))return new Matrix(operand);
        if(operand.matches(Patterns.KEY)) return new Variable(operand);

        return null;
    }
}
