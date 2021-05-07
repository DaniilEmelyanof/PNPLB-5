package Lab_5;

public class ListUtils
{
    public static ListElement insert (ListElement first, String value)
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

    public static ListElement filter (ListElement first)
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

    public static String reduce (ListElement first) 
    {
        String sum = "";
        while (first != null)
        {
            sum += first.getValue();
            first = first.getNext();
            reduce(first);
        }
        return sum; 
    }

}
