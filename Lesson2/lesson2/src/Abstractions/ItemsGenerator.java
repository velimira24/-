package Abstractions;

// Абстракция класса фабрики
public abstract class ItemsGenerator {

    // Метод взаимодействия с абстрактной продукцией

    public String openReward() {
        IGamesItem gameItem = createItem();
        return gameItem.open();
    } // вернуть содержимое из разных сундуков

    // метод создания экземпляра продукта
    // return: экземпляр продукта
    public abstract IGamesItem createItem();
}