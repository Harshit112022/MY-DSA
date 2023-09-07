package oops;

public class Siyaram {


        public void funPublic()
        {
            System.out.println("jay siya ram public");
        }
        protected void funProtected()
        {
            System.out.println("jay siya ram protected");
            funPrivate();
        }
        private void funPrivate()
        {
            System.out.println("jay siya ram private");
        }
        void fun()
        {
            System.out.println("jay siya ram dafualt");
        }

}
