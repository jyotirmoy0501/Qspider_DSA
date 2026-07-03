class demo {
        String name;
        int age;
        String place;
        void Employee(String n, int r, String place) {
            name = n;
            age = r;
            this.place = place;
        }
        public void details() {
            System.out.println(name +", "+age+" ,"+ place);
        }
    }

    public class opps2 {

        public   static void  main(String[] args) {

            demo c = new demo();
            demo c1 = new demo();
            c.Employee("smith", 32, "Mumbai");
            c1.Employee("Allen",27,"Chennai");
            c.details();
            c1.details();
        }
    }

