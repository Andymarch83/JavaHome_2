/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null
 */
public class Main {
    public static void main(String[] args) {
        String sql = "select * from students where ";
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String json1=json.replace("{\"", "").replace("\"}", "")
                .replace("\":\"", "=").replace("\", \"", ", ");
        StringBuilder sq = new StringBuilder(sql);
        System.out.println(sq.append(json1));
        }
    }
