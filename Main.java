package Lab_5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner write = new Scanner(System.in);
        System.out.println("Enter the number of elemements: ");
        int N = write.nextInt();
        System.out.println("Enter the elements themselves:");
        Lab_5.ListElement first = null;
        for (int i = 0; i < N+1; i++)
        {
            String value = write.nextLine();//ввод пользователем строки
            first = Lab_5.ListUtils.insert(first, value);//определение текщего элемента списка и вставка его в список
        }
        String result = Lab_5.ListUtils.reduce(Lab_5.ListUtils.filter(first));//определение резульата выполнение алгоритма
        //и вызов в нем метода фильтрации и конкатенации строк
        System.out.println(result);//вывод резульатата
    }
}
