public class Soda {
// Создайте класс Soda (для определения типа газированной воды).
// У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку
// добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
// В этом классе реализуйте метод public String GetMyDrinkString(), возвращающий строку
// Газировка и {добавка} в случае наличия добавки.
// Если добавки нет, нужно вернуть строку "Обычная газировка".

  private String ingredient;

  public Soda() {
    this.ingredient = "UNKNOWN";
  }

  public Soda(String ingredient) {
    this.ingredient = ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public String getIngredient() {
    return ingredient;
  }

  public String getMyDrinkString() {
    String soda = "Обычная газировка";
    if (this.getIngredient().equals("UNKNOWN")) {
      return String.format("Обычная газировка");
    } else {
      return String.format("Газировка и %s", getIngredient());
    }
  }
}

