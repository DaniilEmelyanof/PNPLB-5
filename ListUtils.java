package Lab_5;

public class ListUtils
{
    public static ListElement insert (ListElement first, String value)//метод для вставки элемента в список
    {
        if (first == null)
            return new ListElement(value);
        else
        {
            ListElement p = first;
            while (p.getNext() != null)
                p = p.getNext();
            p.setNext(new ListElement(value));
            return first;
        }
    }

    public static ListElement filter (ListElement first)//метод "фильтрующий" элемент списка
            //в данном случае строку, т.е проверяет удовлетворение условию (наличию в строке тольк осимволов латинскоого алфавита)
    {
        ListElement p = null;
        while (first != null)
        {
            if (first.getValue().matches("[a-zA-Z]+"))
                p = insert(p, first.getValue());
            first = first.getNext();
        }
        return p;
    }

    public static String reduce (ListElement first)//метод конкатенирует строки (складывает их в одну)
    {
        String sum = "";
        while (first != null)
        {
            sum += first.getValue();
            first = first.getNext();
            reduce(first);
        }
        return sum;//возвращает конкатенирующую строку
    }

}
