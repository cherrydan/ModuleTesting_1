import java.util.ArrayList;
import java.util.List;

/*
Пример из книги Пышкин-Глухих "Модульное тестирование", стр. 70
Создание класса и метода, генерирующего заданную последовательность простых чисел
 */
public class SimpleNumbers {

    static List<Integer> genSimples(int maxNum) {
        List<Integer> simples = new ArrayList<>();
        int current = 2; //Последнее проверяемое число
        int limit = 2; //Последний проверяемый делитель
        while (current <= maxNum) {
            boolean isSimple = true;
            if(limit * limit <= current) limit++;
            for(int simpleDivisor: simples) {
                if(simpleDivisor >= limit) break;
                if(current % simpleDivisor == 0) {
                    isSimple = false;
                    break;
                }
            }
            if(isSimple) simples.add(current);
            current++;
        }
        return simples;
    }

}
