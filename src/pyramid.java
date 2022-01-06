import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int i, j, number = 1;
        System.out.println("enter your alphabet or symbol");
        Scanner hc = new Scanner(System.in);
        String symbol = hc.nextLine();
        System.out.println("enter your number of rows ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (symbol.equals("alphabet")) {
            System.out.println("1.inverted half pyramid");
            System.out.println("2.pyramid");
            System.out.println("3.pascal");
            System.out.println("4.floyd");
            System.out.println("5.square");
            System.out.println("enter your shape");
            Scanner nc = new Scanner(System.in);
            String shape = nc.nextLine();
            if (shape.equals("invertedhalfpyramid")) {
                for (i = n; i >= 1; --i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            } else if (shape.equals("pyramid")) {
                for (i = 1; i <= n; ++i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (shape.equals("pascal")) {
                int x = 10, y = 10;
                for (i = 0; i < n; i++) {

                    for (j = n - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (j = 0; j <= i; j++) {

                        if (j == i) {
                            System.out.print(y);
                            System.out.print(" ");
                        } else if (j >= 1) {
                            x++;
                            System.out.print(x);
                            System.out.print(" ");

                        } else if ((i > 0 && i != n - 1) && ((j == 0 || j >= 3))) {
                            x--;
                            System.out.print(x);
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    y++;
                }
            } else if (shape.equals("floyd")) {
                for (i = 1; i <= n; i++) {

                    for (j = 1; j <= i; j++) {
                        System.out.print(number + " ");
                        ++number;
                    }

                    System.out.println();
                }

            } else if (shape.equals("square")) {
                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= n; j++) {
                        System.out.print(((i + j + 2) % n) + 1);
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("1.half pyramid");
            System.out.println("2.square");
            System.out.println("3.inverted half pyramid");
            System.out.println("4.diamond");
            System.out.println("5.christmastree");
            System.out.println("6.star");
            System.out.println("7.hallowdiamond");
            System.out.println("8.triangle");
            System.out.println("enter your shape");
            Scanner nc = new Scanner(System.in);
            String shapes = nc.nextLine();
            if (shapes.equals("halfpyramids")) {
                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            } else if (shapes.equals("square")) {
                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

            }
            if (shapes.equals("invertedhalfpyramids")) {
                for (i = n; i >= 1; --i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            } else if (shapes.equals("diamond")) {
                int space = 1;
                System.out.print("Enter the number of rows: ");
                Scanner s = new Scanner(System.in);
                n = s.nextInt();
                space = n - 1;
                for (j = 1; j <= n; j++) {
                    for (i = 1; i <= space; i++) {
                        System.out.print(" ");
                    }
                    space--;
                    for (i = 1; i <= 2 * j - 1; i++) {
                        if (j == 2 || i == 4) {
                            System.out.print("#");

                        } else {
                            System.out.print("*");

                        }
                    }
                    System.out.println("");
                }
                space = 1;
                for (j = 1; j <= n - 1; j++) {
                    for (i = 1; i <= space; i++) {
                        System.out.print(" ");
                    }
                    space++;
                    for (i = 1; i <= 2 * (n - j) - 1; i++) {

                        if (i == 4) {
                            System.out.print("#");
                        } else {
                            System.out.print("*");
                        }

                    }
                    System.out.println("");
                }

            } else if (shapes.equals("christmastree")) {
                Scanner cc = new Scanner(System.in);
                System.out.println("Enter the height of tree : ");
                int h = cc.nextInt();
                //beginning of upper part
                for (i = 1; i <= h; i++) {
                    for (j = h - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for (i = 1; i <= h - 1; i++) {
                    System.out.print(" ");
                    for (j = h - 3; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 2; k > 0; k--) {
                        System.out.print("| ");
                    }
                    System.out.println();
                }// end of lower part

            } else if (shapes.equals("star")) {


                Scanner mc = new Scanner(System.in);
                System.out.print("enter input");

                int lenght = mc.nextInt();
                for (i = 0; i <= lenght - 1; i++) {
                    for (j = 0; j <= lenght - 1; j++) {
                        System.out.print(" ");
                    }

                    for (j = i; j <= lenght - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = lenght - 1; k >= (lenght - 1 - i); k--) {
                        System.out.print("* ");
                    }

                    System.out.print("\n");
                }
                for (i = 0; i <= lenght - 3; i++) {

                    for ( j = 0; j <= lenght; j++) {
                        System.out.print("* ");

                    }
                    for (int k = 0; k <= lenght - 1; k++) {
                        System.out.print("* ");
                    }

                    System.out.print("\n");
                }
                for (i = 0; i <= lenght - 1; i++) {
                    for (j = 1; j <= lenght - 1; j++) {
                        System.out.print(" ");
                    }
                    for (j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k <= lenght - 1; k++) {
                        System.out.print(" *");
                    }

                    System.out.print("\n");

                }


            }else if(shapes.equals("hallowdiamond")){
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                int rows=scan.nextInt();
                System.out.print("Enter the symbol you want to print: ");
                char symbols=scan.next().charAt(0);
                for(i=1; i<=rows; i++)
                {
                    for(j=rows; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(symbols);
                    for(j=1; j<(i-1)*2; j++)
                    {
                        System.out.print(" ");
                    }
                    if(i==1)
                    {
                        System.out.print("\n");
                    }
                    else
                    {
                        System.out.print(symbols+"\n");
                    }
                }
                for( i=rows-1; i>=1; i--)
                {
                    for(j=rows; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(symbols);
                    for( j=1; j<(i-1)*2; j++)
                    {
                        System.out.print(" ");
                    }
                    if(i==1)
                    {
                        System.out.print("\n");
                    }
                    else
                    {
                        System.out.print(symbols+"\n");
                    }
                }

            } if(shapes.equals("triangles")){
                for ( i=0; i<n; i++)
                {
                    for (j=n-i; j>1; j--)
                    {
                        System.out.print(" ");
                    }
                    for ( j=0; j<=i; j++ )
                    {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            }


        }


    }
}