public class Triangle {
// Создайте класс Triangle (треугольник), принимающий три целых значения - длины трёх сторон
// треугольника.
// В конструкторе нужно проверить введённые значения на корректность (например,
// длины не могут быть отрицательными).
// В классе должен быть описан отдельный статический метод
// public static bool checkSides(int a, int b, int c), который должен проверить
// неравенство треугольника.
// Этот метод необходимо использовать в конструкторе.
// При провале любой из проверок нужно вывести на экран соответствующее сообщение.

  private int sideA;
  private int sideB;
  private int sideC;

  public Triangle(int sideA, int sideB, int sideC) {
    if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
      System.out.println("Не допустимое значение длины стороны!");
      System.exit(1);
    }
    if (!checkSides(sideA, sideB, sideC)) {
      System.out.println("Такой треугольник не может существовать либо вырожден!");
      System.exit(1);
    }
  }

  public void setSideA(int sideA){
    this.sideA=sideA;
  }

  public void setSideB(int sideB){
    this.sideB=sideB;
  }

  public void setSideC(int sideC){
    this.sideC=sideC;
  }

  public int getSideA(){
    return sideA;
  }

  public int getSideB(){
    return sideB;
  }

  public int getSideC(){
    return sideC;
  }

  public static boolean checkSides(int a, int b, int c){
    return ((a < b + c) && (b < a + c) && (c < a + b));
  }
}
