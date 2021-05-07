package Lab_5;

public class ListElement
{
    private final String value;
    private ListElement next;

    public ListElement (String value) {this.value = value;}//конструктор
    public String getValue(){return value;}//возвращает значение элемента списка
    public ListElement getNext() {return next;}//возвращает следующий элемент списка
    public void setNext (ListElement next){this.next = next;}//определяет следующий элемент списка
}