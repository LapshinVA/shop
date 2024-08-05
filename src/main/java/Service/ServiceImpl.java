package Service;

public class ServiceImpl implements Service {

    /**
     * Парсит введенные пользователем данные
     *
     * @param str - введенная пользователем строка данных
     * @return массив, где (array[0] - номер товара по меню, array[1] - количество товара)
     */
    public int[] parsingFromConsole(String str) {
        int productNumber = 0;    //для текущего номера продукта
        int productCount = 0;     //для текущего количества
        String[] output;
        output = str.split(" ");
        try {
            productNumber = Integer.parseInt(output[0]); // считывается с консоли номер продукта
            productCount = Integer.parseInt(output[1]);  // считывается с консоли количество продукта
            if (productCount < 1 || productNumber < 1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");
        }
        int[] array = new int[2];
        array[0] = productNumber;
        array[1] = productCount;
        return array;
    }


}
