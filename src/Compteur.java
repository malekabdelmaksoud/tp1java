public class Compteur {

        private int x;


        public Compteur(int n) {
            this.x = n;
        }


        public Compteur increment() {
            x++;
            return this;
        }


        public int value() {
            return x;
        }
    }