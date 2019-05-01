package program;

import javax.swing.*;

/*
https://www.youtube.com/watch?v=vtTUKLE_SWE 2;30 ciekawe
https://www.youtube.com/watch?v=vMtpdnMKSYc jewelery shop
https://www.youtube.com/watch?v=arqv2YVp_3E msQel i PHP czekają MYSQL



inspiracja dla gui z https://www.youtube.com/watch?v=WRwPVZ4jmNY skonczone na 32 minuta


*/



public class App extends JFrame {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new MainFrame();  // stworzyłem MainFrame
                /*
                Początkowo JFrame frame.
                 */


            }
        });



    }
}
