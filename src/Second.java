/*
Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Second {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String json1=json.replace("{\"фамилия\":\"", "Студент ")
                .replace("\",\"оценка\":\"", " получил ")
                .replace("\",\"предмет\":\"", " по предмету ")
                .replace("[", "").replace("\"}", "").replace("]", "");
        //System.out.println(json1);
        StringBuilder j1 = new StringBuilder(json1);
        StringBuilder j2 = new StringBuilder(json1);
        StringBuilder j3 = new StringBuilder(json1);

        int a = j1.indexOf(",");
        StringBuilder first = j1.delete(a,j1.length());
        System.out.println(first.append("."));

        int b = j2.lastIndexOf(",");
        StringBuilder second = j2.delete(b,j2.length());
        int c = j2.indexOf(",");
        System.out.println(second.delete(0,c+1).append("."));

        int e = j3.indexOf(",");
        StringBuilder third = j3.delete(0, e);
        int f = third.lastIndexOf(",");
        System.out.println(third.delete(0,f+1).append("."));
    }
}
