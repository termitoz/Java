package com.termitoz.school.java.cmd;

/**
 * Created by ZOOPARK on 22.01.2017.
 */
public class testBall {

    private static final int ARGS_NUM = 4;

    public static void viewErrorMessage() {

        System.out.println("Incorrect sequence of parameters.");
        System.out.println("Type -h to view help message.");

    }

    public static void viewHelpMessage() {

        System.out.println("           ");
        System.out.println("    -n <Name> -r <Radius> [-n <Name> -r <Radius>]");
        System.out.println("           ");
        System.out.println("    -n: Name");
        System.out.println("    -r: Radius");
        System.out.println("    -h or -help: Help");

    }

    public static void main(String[] args) {

        if (args.length % 2 != 0) {

            System.out.println("Error: incorrect quantity of parameters");

        } else {

            Ball[] balls = new Ball[(int) args.length / ARGS_NUM];

            if (args.length != 0) {
                if (args[0].equals("-h") | args[0].equals("-help")) {

                    viewHelpMessage();

                } else {

                    int n = 0;

                    for (int i = 0; i < args.length; i += 4) {

                        if (!args[i].equals("-n") & !args[i].equals("-r")) {

                            //  viewErrorMessage();
                            balls[n] = new Ball("Error", 0.0f);
                            n++;

                        }

                        if (args[i].equals("-n")) {

                            balls[n] = new Ball(args[i + 1], Float.valueOf(args[i + 3]));
                            n++;

                        }

                        if (args[i].equals("-r")) {

                            balls[n] = new Ball(args[i + 3], Float.valueOf(args[i + 1]));
                            n++;

                        }

                    }

                    System.out.println("============================================");

                    for (int i = 0; i < balls.length; i++) {

                        if (balls[i].getName().equals("Error")) {

                            System.out.println("Error: incorrect sequence of parameters.");

                        } else {

                            System.out.println(balls[i].getName() + " with radius " + balls[i].getR());
                        }
                    }

                    System.out.println("============================================");

                }
            }

        }

    }

}
