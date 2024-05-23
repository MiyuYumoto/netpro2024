//課題5-A
public class DinnerFullCourse {

    private Dish[] list = new Dish[5]; // [0]-[4]の計5個

    public static void main(String[] args) {
        DinnerFullCourse fullCourse = new DinnerFullCourse();
        fullCourse.eatAll();
    }

    DinnerFullCourse() {
        list[0] = new Dish();
        list[0].setName("サラダ");
        list[0].setValune(10);
        list[1] = new Dish();
        list[1].setName("スープ");
        list[1].setValune(15);
        list[2] = new Dish();
        list[2].setName("ハンバーグ");
        list[2].setValune(50);
        list[3] = new Dish();
        list[3].setName("ガーリックライス");
        list[3].setValune(30);
        list[4] = new Dish();
        list[4].setName("アイスクリーム");
        list[4].setValune(20);
    }

    void eatAll() {
        for (Dish dish : list) {
            System.out.println("料理の名前: " + dish.getName() + ", 値段: " + dish.getValune() + "円");
        }
    }

    // DinnerFullCourseクラスの内部クラスとしてDishクラスを定義
    class Dish {
        private String name;
        private int valune;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValune() {
            return valune;
        }

        public void setValune(int valune) {
            this.valune = valune;
        }
    }
}
