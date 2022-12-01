public class Main {
    public static void main(String[] args) {
        String [][] pairs = {{"Алые паруса", "Александр", "Степанович", "Грин"},
                {"Вишневый сад", "Антон", "Павлович", "Чехов"},
                {"Отцы и дети", "Иван", "Сергеевич", "Тургенев"}};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            sb.append("'").append(pairs[0][0]).append("' ").append(pairs[0][1].charAt(0)).append(".").append(pairs[0][2].charAt(0)).append(".").append(pairs[0][3]);
            sb2.append("'").append(pairs[1][0]).append("' ").append(pairs[1][1].charAt(0)).append(".").append(pairs[1][2].charAt(0)).append(".").append(pairs[1][3]);
            sb3.append("'").append(pairs[2][0]).append("' ").append(pairs[2][1].charAt(0)).append(".").append(pairs[2][2].charAt(0)).append(".").append(pairs[2][3]);
        }
        String firstString = sb.toString();
        System.out.println(firstString);
        String secondString = sb2.toString();
        System.out.println(secondString);
        String thirdString = sb3.toString();
        System.out.println(thirdString);
    }
}

