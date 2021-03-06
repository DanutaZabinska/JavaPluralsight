package com.plularsight.calcengine;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public MathEquation(){}

    public MathEquation(char opCode)
    {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal)
    {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
                break;
        }
    }
//    public void setLeftVal(double leftVal) {
//        this.leftVal = leftVal;
//    }
//
//    public void setRightVal(double rightVal) {
//        this.rightVal = rightVal;
//    }
//
//    public void setOpCode(char opCode) {
//        this.opCode = opCode;
//    }
}
