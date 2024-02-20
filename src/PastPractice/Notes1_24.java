package PastPractice;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.abs;

import java.text.DecimalFormat;

public class Notes1_24 {
    static void generateRandomText(int amountToGenerate, int rangeMin, int rangeMax) {
        SplittableRandom splittableRandom = new SplittableRandom();
        for (int i=0;i<amountToGenerate;i++) {
            int random = splittableRandom.nextInt(rangeMin,rangeMax+1);
            if (i == amountToGenerate-1) {
                System.out.println(random);
                return;
            }
            System.out.print(random + ",");
        }
    }

    static int generateRandom(int rangeMin, int rangeMax) {
        SplittableRandom splittableRandom = new SplittableRandom();
            int random = splittableRandom.nextInt(rangeMin,rangeMax+1);
            return random;
    }    

    static void generateRandomDecimal(int amountToGenerate, int rangeMin, int rangeMax) {
        
        for (int i=0;i<amountToGenerate;i++) {
            int mult = generateRandom(rangeMin, rangeMax);
            double random = ThreadLocalRandom.current().nextDouble();
            if (i == amountToGenerate-1) {
                System.out.printf("%.2f%n", (mult + random));
                return;
            }
            System.out.printf("%.2f%n, ", (mult + random));
        }

    }
    static void getLexicog(String s, int k) {
        ArrayList<String> snippets = new ArrayList<String>();
        for (int i = 0; i <= s.length()-k; i++) {
            snippets.add(s.substring(i,i+k));
        }
        Collections.sort(snippets);
        String smallest = snippets.get(0);
        String largest = snippets.get(snippets.size());
        System.out.printf("Smallest: " + smallest + "\n" + "Largest: " + largest);
    }

    static void checkPal(String a) {
        String b = new StringBuilder(a).reverse().toString();
        if (a.equals(b)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    static void checkAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        String sortedA = new String(charA);
        String sortedB = new String(charB);
        System.out.println(sortedA.equals(sortedB) ? "Amagrams" : "Not Anagrams");
    }

    static void oneDimension() {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of Array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length-1; i++) {
            System.out.print("Input number " + i + ": ");
            int number = input.nextInt();
            a[i] = number;
        }
        for (int i : a) {
            System.out.println(i);
        }
        input.close();
    }

    static void queries() {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> paper = new ArrayList<>();
        ArrayList <Integer> paperLine = new ArrayList<>();
        ArrayList<ArrayList<Integer>> query = new ArrayList<>();
        ArrayList <Integer> queryValues = new ArrayList<>();
        System.out.print("Enter number of lines: ");
        int lines = input.nextInt();
        System.out.print("Enter number of queries: ");
        int queries = input.nextInt();

        for (int i=0;i<=lines-1;i++) {
            paperLine.clear();
            int j = 0;
            while (j > -1) {
                System.out.print("Enter values to line/ negative to stop: ");
                j = input.nextInt();
                if (j > -1) {
                    paperLine.add(j);
                }
            }
            paper.add(paperLine);
        }

        for (int i=0;i<=queries-1;i++) {
            System.out.print("Enter array index: ");
            int x = input.nextInt();
            System.out.print("Enter the index value: ");
            int y = input.nextInt();
            queryValues.add(x);
            queryValues.add(y);
            query.add(queryValues);
            queryValues.clear();
        }

        System.out.println(query);
        System.out.println(paper);

        input.close();
    }

    static void theGreatest(int a, int b, int c) {
        System.out.println((c + ((a + b + abs(a-b))/2) + abs(c-((a + b + abs(a-b))/2)))/2 + " eh o maior");
    }

    static void selectionTest(int a, int b, int c, int d) {
        if (c < b && a < d && a+b < c+d && 0 < c && 0 < d && a%2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

    static void snack(int x, int y) {
        float[] table = {4, 4.5f,5, 2, 1.5f};
        System.out.printf("Total: R$ %,.2f\n", (table[x-1] * y));

    }

    static void interval(double a) {
        if (a > 100 || 0 > a) {
            System.out.println("Fora de intervalo");
        } else if (a >= 0 && 25 >= a) {
            System.out.println("Intervalo [0,25]");
        } else if (a > 25 && 50 >= a) {
            System.out.println("Intervalo (25,50]");
        } else if (a > 50 && 75 >= a) {
            System.out.println("Intervalo (50,75]");
        } else if (a > 75) {
            System.out.println("Intervalo (75,100]");
        }
    }

    static void coordinates(double x, double y) {
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        }
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }

    static void multiples(int a, int b) {
        System.out.println(b % a == 0 ? "Soa Multiplos":"Nao sao Multiplos");
    }
    static void average3(double a, double b, double c, double d) {
        Scanner input = new Scanner(System.in);
        int A = 2; int B = 3; int C = 4; int D = 1;
        double weightedA = a * A;
        double weightedB = b * B;
        double weightedC = c * C;
        double weightedD = d * D;
        double weightedAverge = (weightedA+weightedB+weightedC+weightedD) / (A+B+C+D);
        System.out.printf("Media %,.1f\n", weightedAverge);
        if (weightedAverge >= 5 && weightedAverge <= 6.9) {
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            double test = input.nextDouble();
            double average = (test + weightedAverge)/2;
            if (average >= 5) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %,.1f", average);

        } else if (weightedAverge >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    static void triangle(float a, float b, float c) {
        boolean b1 = a + b > c && b + c > a && c + a > b;
        System.out.println(b1 ? "Perimetro = " + (a+b+c):"Area = " + ((a+b)/2)*c);
    }

    static void multiplicationTable(int N) {
        for (int i = 1;i <= 10;i++) {
            System.out.println(i + " x " + N + " = " + (i*N));
        }
    }

    static void arrayReplacement(int[] a) {
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] <= 0) {
                a[i] = 1;
            }
        }
        for (int j : a) {
            System.out.println(j);
        }
    }

    static void arraySort() {
        int[] intArray = {6,7,3,2,4};
        Arrays.sort(intArray);
        String[] strArray = {"James","Peter","George","Charlie"};
        Arrays.sort(strArray);
        for (int i : intArray) {
            System.out.println(i);
        }
        for (String j : strArray) {
            System.out.println(j);
        }
    }

    static void sumArray(int[] a) {
        int num = 0;
        for (int i : a) {
            num += i;
        }
        System.out.println(num);
    }

    static void outputGrid() {
        StringBuilder grid = new StringBuilder();
        for (int j=0;j<10;j++) {
            grid.append("_ ");
        }
        for (int i=0;i<10;i++) {
            System.out.println(grid);
        }
    }

    static void averageArray(int[] a) {
        int num = 0;
        for (int i : a) {
            num += i;
        }
        num = num / a.length;
        System.out.println(num);
    }

    static void checkElement(int[] a, int b) {
        for (int i=0;i<=a.length-1;i++) {
            if (a[i] == b) {
                System.out.println("Contains");
                return;
            }
        }
        System.out.println("Does not contain");
    }

    static void findIndex(int[] a, int b) {
        for (int i=0;i<=a.length-1;i++) {
            if (a[i] == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Does not contain");
    }

    static void removeElement(int[] a, int b) {
        int[] array = new int[a.length-1];
        for (int i=0, k=0;i<a.length;i++) {
            if(a[i]!=b) {
                array[k] = a[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void copyArrayLongWay(int[] a) {
        int[] array = new int[a.length];
        for (int i=0,j=0;i<a.length;i++){
            array[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(array));
    }

    static void arrayToArrayList(String[] a) {
        List al = Arrays.asList(a);
        System.out.println(al);
    }

    static void arrayListToArray() {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        Object[] objects = al.toArray();
        for (Object ob : objects) {
            System.out.println(ob);
        }
    }

    static void equalArrays(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }

    static void movingZeros(int[] a) {
        int countZeros = 0;
        int countNumbers = 0;
        for (int i : a) {
            if (i == 0) {
                countZeros += 1;
            } else {
                countNumbers += 1;
            }
        }
        int[] zeros = new int[countZeros];
        int[] numbers = new int[countNumbers];
        for(int i=0,j=0,k=0;i<a.length;i++) {
            if(a[i] == 0) {
                zeros[j] = a[i];
                j++;
            } else {
                numbers[k] = a[i];
                k++;
            }
        }
        int[] together = new int[zeros.length + numbers.length];
        for(int z=0;z<zeros.length;z++) {
            together[z] = zeros[z];
        }
        for (int x=zeros.length,y=0;x < together.length;x++) {
            together[x] = numbers[y];
            y++;
        }
        for (Object ob : together) {
            System.out.print(ob + " ");
        }
    }

    static void insertNumber(int[] a, int insertLocation, int insertNumber) {
        int[] newArray = new int[a.length + 1];
        for (int i=0,j=0;i<newArray.length;i++) {
            if (i == insertLocation+1) {
                newArray[i] = insertNumber;
            } else {
                newArray[i] = a[j];
                j++;
            }
        }
        for (int count : newArray) {
            System.out.print(count + " ");
        }
    }

    static void maxMin(int[] a) {
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[a.length-1]);
    }

    static void arrayReverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (Object ob : a) {
            System.out.print(ob + " ");
        }
    }

    static void findDupes(int[] a) {
        Arrays.sort(a);
        ArrayList <Integer> b = new ArrayList<Integer>();
        for (int i=0;i<a.length-1;i++) {
            if (!b.contains(a[i])) {
                if(a[i] == a[i+1]) {
                    b.add(a[i]);
                }
            }

        }
        System.out.println(b);
    }

    static void findStringDupes(String[] a) {
        Arrays.sort(a);
        ArrayList <String> b = new ArrayList<String>();
        for (int i=0;i<a.length-1;i++) {
            if (!b.contains(a[i])) {
                if(Objects.equals(a[i], a[i + 1])) {
                    b.add(a[i]);
                }
            }
        }
        System.out.println(b);
    }

    static void findSimilarString(String[] a, String[] b) {
        ArrayList <String> c = new ArrayList<String>();
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<b.length;j++) {
                if (Objects.equals(a[i],b[j]) || !c.contains(a[i])) {
                    c.add(a[i]);
                }
            }
        }
        System.out.println(c);
    }

    static void findSimilarInt(int[] a, int[] b) {
        ArrayList <Integer> c = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<b.length;j++) {
                if (a[i] == b[j] && !c.contains(a[i])) {
                    c.add(a[i]);
                }
            }
        }
        System.out.println(c);
    }

    static void removeDupes(int[] a) {
        Arrays.sort(a);
        ArrayList <Integer> b = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++) {
            if (!b.contains(a[i])) {;
                b.add(a[i]);
            }
        }
        System.out.println(b);
    }

    static void secondLargest(int[] a) {
        Arrays.sort(a);
        if(a.length >= 2) {
            System.out.println(a[a.length-2]);
        } else {
            System.out.println(a[0]);
        }
    }

    static void secondSmallest(int[] a) {
        Arrays.sort(a);
        if(a.length >= 2) {
            System.out.println(a[1]);
        } else {
            System.out.println(a[0]);
        }
    }

    static void missingNumber(int[] a) {
        Arrays.sort(a);
        for (int i=0;i<a.length-1;i++) {
            if (a[i+1] - a[i] != 1) {
                System.out.println("Missing: " + (a[i]+1));
                return;
            }
        }
    }

    static void addingToValue(int[] a, int value) {
        for (int i=0;i<a.length;i++) {
            for (int j = i+1;j<a.length;j++) {
                if (a[i] > value) {
                    return;
                }
                if (a[i] + a[j] == value) {
                    System.out.println(a[i] + " + " + a[j] + " = " + (a[i]+a[j]));
                }
            }
        }
    }

    static void addingMatrix(int[] a, int[] b) {
        ArrayList <Integer> c = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++) {
            c.add(a[i] + b[i]);
        }
        System.out.println(c);
    }

    static void checkingSame(int[] a, int[] b, int[] c) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        ArrayList <Integer> check = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<b.length;j++) {
                for (int k=0;k<c.length;k++) {
                    if (a[i] == b[j] && a[i] == c[k] && b[j] == c[k]) {
                        if (!check.contains(a[i])) {
                            check.add(a[i]);
                        }
                    }
                }
            }
        }
        System.out.println(check);
    }

    static void countEvenOdd(int[] a) {
        int Even = 0;
        int Odd = 0;
        for (int i=0;i<a.length;i++) {
            if(a[i]%2==0) {
                Even += 1;
            } else {
                Odd += 1;
            }
        }
        System.out.println("Even: " + Even + "\nOdd: " + Odd);
    }

    static void bigSmallDiff(int[] a){
        Arrays.sort(a);
        System.out.println(a[a.length-1] - a[0]);
    }

    static void averageNoBigSmall(int[] a) {
        double add = 0;
        for (int i=1;i<a.length-1;i++) {
            add += a[i];
        }
        double math = add / (a.length-2);
        System.out.println(math);
    }

    static void checkZeroMinusOne(int[] a) {
        String[] stringArray = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
        List al = Arrays.asList(stringArray);
        if (!al.contains("0") && !al.contains("-1")) {
            System.out.printf("No 0 or -1");
        } else {
            System.out.println("Contains 0 and -1");
        }
    }

    static void checkTens(int[] a) {
        int total = 0;
        for (int i=0;i<a.length;i++) {
            if(a[i] == 10) {
                total += 10;
            }
        }
        if (total == 30) {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }

    static void check65Or77(int[] a) {
        boolean check77 = false, check66 = false;
        for (int j : a) {
            if (j == 77) {
                check77 = true;
            }
            if (j == 65) {
                check66 = true;
            }
        }
        if(check77) {
            if (check66) {
                System.out.println(check77);
                return;
            }
        }
        System.out.println(false);
    }

    static void addingToValueThree(int[] a, int value) {
        Arrays.sort(a);
        for (int i=0;i<a.length;i++) {
            for (int j = i+1;j<a.length;j++) {
                for (int k = j+1;k<a.length;k++) {
                    if (a[i] > value) {
                        return;
                    }
                    if (a[i] + a[j] + a[k] == value && a[i] <= a[j] && a[j] <= a[k]) {
                        System.out.println(a[i] + " + " + a[j] + " + " + a[k] + " = " + (a[i]+a[j]+a[k]));
                    }
                }
            }
        }
    }

    static void leaders(int[] a) {
        ArrayList <Integer> b = new ArrayList<>();
        int j = 0;
        for (int i=0;i<a.length;i++) {
            if (i+1<a.length) {
                j=i+1;
            }
            while (j!=a.length) {
                if (a[i] > a[j]) {
                    if (j==a.length-1) {
                        b.add(a[i]);
                    }
                } else {
                    j = a.length-1;
                }
                j++;
            }
        }
        System.out.println(b);
    }

    static void closeTo0(int[] a) {
        int diff, compareDiff = 9999,x = 0,y = 0;
        for (int i=0;i<a.length;i++) {
            for (int j=i + 1;j<a.length;j++) {
                diff = a[i] - a[j];
                if (abs(diff)<compareDiff) {
                    compareDiff = diff;
                    x = a[i];
                    y = a[j];
                }
            }
        }
        System.out.println("Closest to zero is: " + x + " - " + y + " = " + compareDiff);
    }

    static void smallestSecondSmallest(int[] a){
        Arrays.sort(a);
        if (a.length >= 2) {
            System.out.println("The two smallest elements are: " + a[0] + " and " + a[1]);
        } else {
            System.out.println("There isn't two smallest integers");
        }
    }

    static void moveZeroesOnes(int[] a) {
        int countZeros = 0;
        int countOnes = 0;
        ArrayList <Integer> b = new ArrayList<>();
        for (int i : a) {
            if (i == 1) {
                countOnes++;
            }
            if (i == 0) {
                countZeros++;
            }
        }
        for (int i=0;i<countOnes+countZeros;i++) {
            if (i>=countOnes) {
                b.add(1);
            } else {
                b.add(0);
            }
        }
        System.out.println(b);
    }

    static void addingToValueFour(int[] a, int value) {
        Arrays.sort(a);
        for (int i=0;i<a.length;i++) {
            for (int j = i+1;j<a.length;j++) {
                for (int k = j+1;k<a.length;k++) {
                    for (int l = k+1;l<a.length;l++) {
                        if (a[i] > value) {
                            System.out.println("No values");
                            return;
                        }
                        if (a[i] + a[j] + a[k] + a[l] == value) {
                            System.out.println(a[i] + " + " + a[j] + " + " + a[k] + " + " + a[l] + " = " + (a[i]+a[j]+a[k]+a[l]));
                        }
                    }
                }
            }
        }
    }

    static void Testtriangle(int[] x) {
        int countTriangles = 0;
        for (int i=0;i<x.length;i++) {
            for (int j=i+1;j<x.length;j++) {
                for (int k=j+1;k<x.length;k++) {
                    if ((x[i] + x[j] > x[k]) && (x[j] + x[k] > x[i]) && (x[k] + x[i] > x[j])) {
//                        System.out.println(x[i]+"+"+x[j]+"="+(x[i]+x[j])+
//                        " > "+x[k]+"\n"+x[j]+"+"+x[k]+"="+(x[k]+x[j])+
//                        " > "+x[i]+"\n"+x[k]+"+"+x[i]+"="+(x[k]+x[i])+
//                        " > "+x[j]+"\n");
                        countTriangles++;
                    }
                }
            }
        }
        System.out.println("Number of Triangles: " + countTriangles);
    }

    static void rotateArray(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[a.length-1];
        System.arraycopy(a, 0, b, 1, a.length - 1);
        System.out.println(Arrays.toString(b));
    }

    static void findMissingLetter(char[] a)  {
        int[] b = new int[a.length];
        for (int i=0;i<a.length;i++) {
            b[i] = (int) a[i];
        }
        for (int i=0;i<a.length-1;i++) {
            if(b[i+1]-b[i] != 1) {
                System.out.println("Missing letter: " + Character.toChars(b[i]+1));
            }
        }

    }

    static void negativeDominant(int[] a) {
        int count = 0, countNeg = 0;
        for (int i : a) {
            if (i < 0) {
                countNeg++;
            } else {
                count++;
            }
        }
        System.out.println(countNeg > count ? "True" : "False");
    }

    static void checkAlternating(int[] a) {
        boolean startNeg = a[0] < 0;
        for (int i=0;i<a.length-1;i=i+2) {
            if (startNeg) {
                if(a[i+1] < 0) {
                    System.out.println("False");
                    return;
                }
            } else {
                if(a[i+1] > 0) {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }

    static void largestSortedGap(int[] a) {
        Arrays.sort(a);
        int check = 0, x=0,y=0;
        for (int i=0;i<a.length-1;i++) {
            if(a[i+1]-a[i]>check) {
                check = a[i+1]-a[i];
                x=a[i+1];
                y=a[i];
            }
        }
        System.out.println(x + " - " + y + " = " + check);
    }

    static void addingToValueTres(int[] a, int value) {
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                for (int k=j+1;k<a.length;k++) {
                    if (a[i] + a[j] + a[k] == value) {
                        System.out.println(a[i] + " + " + a[j] + " + " + a[k] + " = " + (a[i]+a[j]+a[k]));
                    }
                }
            }
        }
    }

    static void biggestCombinedNumber(int[] a) {
        String b = "";
        Arrays.sort(a);
        for (int i=a.length-1;i>=0;i--) {
            b += Integer.toString(a[i]);
        }
        System.out.println(b);
    }

    static void addSubArray(int[] a, int size) {
        int sum = 0;
        for (int i=0;i<size;i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
    static void biggestContDiff(int[] a) {
        int diff = 0;
        for(int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if(a[i] < a[j]) {
                    if (a[j]-a[i]>diff) {
                        diff = a[j] - a[i];
                    }
                }
            }
        }
        System.out.println(diff);
    }

    static void allOtherProducts(int[] a) {
        int[] b = new int[a.length];
        for (int i=0;i<a.length;i++) {
            b[i] = 1;
        }
        for(int i=0;i<a.length;i++) {
            for (int j=0;j<a.length;j++) {
                if (j != i) {
                    b[i] *= a[j];
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }

    static void shuffleArray(int[] a) {
        List<Integer> al = new ArrayList<>();
        for (int i:a) { al.add(i); }
        Collections.shuffle(al);
        Integer[] array = new Integer[a.length];
        array = al.toArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void maxProduct(int[] a) {
        int pro = 1, x=0,y=0;
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if(a[i]*a[j]>pro) {
                    pro = a[i]*a[j];
                    x=a[i];
                    y=a[j];
                }
            }
        }
        System.out.println("Pair is (" + x + "," + y + "), Maximum Product: " + pro);
    }

    static void seperateSortedArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i=0;i<a.length;i++) {
            c[i] = a[i];
        }
        for (int i=a.length,j=0;i<c.length;i++) {
            c[i] = b[j];
            j++;
        }
        Arrays.sort(c);
        int[] outputA = Arrays.copyOfRange(c,0,a.length);
        int[] outputB = Arrays.copyOfRange(c,a.length,c.length);
        System.out.println(Arrays.toString(outputA));
        System.out.println(Arrays.toString(outputB));

    }

    static void moveEvenOdds(int[] a) {
        ArrayList <Integer> b = new ArrayList<>();
        ArrayList <Integer> c = new ArrayList<>();
        ArrayList <Integer> d = new ArrayList<>();
        for (int i : a) {
            if (i % 2 == 0) {
                b.add(i);
            } else {
                c.add(i);
            }
        }
        d.addAll(b);
        d.addAll(c);
        Integer[] array = new Integer[d.size()];
        array = d.toArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void arrayHelix(int[] a) {
        Arrays.sort(a);
        ArrayList <Integer> b = new ArrayList<>();
        ArrayList <Integer> c = new ArrayList<>();
        for (int i:a) {b.add(i);c.add(i);}
        Collections.reverse(c);
        int[] d = new int[a.length/2];
        for(int i=0;i<a.length/2;i=i+2) {
            d[i] = c.get(i);
            d[i+1] = b.get(i);
        }
        System.out.println(Arrays.toString(d));
    }

    static void positiveBeforeNegative(int[] a) {
        ArrayList <Integer> b = new ArrayList<>();
        Integer[] c = new Integer[a.length];
        boolean checkType = false;
        int i = 0;
        while (i != a.length) {
            if (!checkType && a[i] > 0) {
                b.add(a[i]);
            }
            if (checkType && a[i] <= 0) {
                b.add(a[i]);
            }
            i++;
            if (i == a.length && !checkType){
                checkType = true;
                i=0;
            }
        }
        c = b.toArray(c);
        System.out.println(Arrays.toString(c));
    }
    static void negativeBeforePositive(int[] a) {
        ArrayList <Integer> b = new ArrayList<>();
        Integer[] c = new Integer[a.length];
        boolean checkType = false;
        int i = 0;
        while (i != a.length) {
            if (!checkType && a[i] <= 0) {
                b.add(a[i]);
            }
            if (checkType && a[i] > 0) {
                b.add(a[i]);
            }
            i++;
            if (i == a.length && !checkType){
                checkType = true;
                i=0;
            }
        }
        c = b.toArray(c);
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        generateRandomDecimal(20, 10, 80);
        //        negativeBeforePositive(new int[] {48,-38,-41,-31,-36,77,91,16,76,1,-29,86,97,-28,-50,59,-63,21,51,47});
//        positiveBeforeNegative(new int[] {48,-38,-41,-31,-36,77,91,16,76,1,-29,86,97,-28,-50,59,-63,21,51,47});
//        arrayHelix(new int[] {14,17,12,55,27,23,52,57,58,66,33,16,19,2,90,61,83,42,22,100});
//        moveZeroesOnes(new int[] {0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,0,1});
//        moveEvenOdds(new int[] {32,14,22,15,30,36,25,44,10,25});
//        seperateSortedArray(new int[] {1, 5, 6, 7, 8, 10}, new int[] {2, 4, 9});
//        maxProduct(new int[] {2, 3, 5, 7, -7, 5, 8, -5});
//        shuffleArray(new int[] {1, 2, 3, 4, 5, 6 });
//        biggestContDiff(new int[] {2, 3, 1, 7, 9, 5, 11, 3, 5});
//        allOtherProducts(new int[] {1, 2, 3, 4, 5, 6, 7});
//        allOtherProducts(new int[] {0, 1, 2, 3, 4, 5, 6, 7});
//        getLexicog("welcometojava", 3);
//        checkPal("racecar");
//        checkPal("java");
//        checkPal("madam");
//        checkAnagram("anagram", "marganaa");
//        checkAnagram("anagram", "margana");
//        checkAnagram("hello", "Hello");
//        oneDimension();
//        queries();
//        theGreatest(7,14,106);
//        theGreatest(217,14,6);
//        selectionTest(5,6,7,8);
//        selectionTest(2,3,2,6);
//        snack(3,2);
//        snack(4,3);
//        snack(2,3);
//        interval(25.01);
//        interval(25.00);
//        interval(100.00);
//        interval(-25.02);
//        coordinates(4.5,-2.2);
//        coordinates(.1,.1);
//        coordinates(0,0);
//        multiples(6,24);
//        multiples(6,25);
//        average3(2,4,7.5,8);
//        average3(2,6.5,4,9);
//        average3(9,4,8.5,9);
//        triangle(6,4,2);
//        triangle(6,4,2.1f);
//        multiplicationTable(140);
//        arrayReplacement(test);
//        arraySort();
//        sumArray(new int[]{1, 2, 3, 4, 5});
//        outputGrid();
//        averageArray(new int[] {1,2,3,4,5});
//        checkElement(new int[] {1,2,3,4,5},4);
//        findIndex(new int[] {1,2,3,4,5},7);
//        removeElement(new int[] {1,2,3,4,5},3);
//        copyArrayLongWay(new int[] {1,2,3,4,5});
//        arrayToArrayList(new String[] {"James","Jeff","Peter","Lukas"});
//        arrayListToArray();
//        equalArrays(new int[] {1,2,3,4,5}, new int[] {1,2,4,4,3});
//        movingZeros(new int[] {1,0,2,0,3,0,0,4,5});
//        insertNumber(new int[] {1,2,3,4,5},3,7);
//        maxMin(new int[] {6,3,7,3,7,4,5,28,9,23,4,6,34,67,1});
//        arrayReverse(new int[] {1,2,3,4,5,6,7,8,9,10});
//        findDupes(new int[] {1,1,2,3,4,4,5,6,6});
//        findStringDupes(new String[]{"James", "George", "James","Peter","Lucas","Harold","Peter"});
//        findSimilarString(new String[] {"James","John","Peter"}, new String[] {"Patrick", "Lucas", "James"});
//        findSimilarInt(new int[] {1,2,3,4,5,6,7,8}, new int[] {1,2,3,9,10,11});
//        removeDupes(new int[] {1,1,2,2,2,3,4,5,5,5,6,7,8,8,});
//        secondLargest(new int[] {1,2,3,4,5,6,7,8});
//        missingNumber(new int[] {1,2,3,5,6,7,8,9});
//        addingToValue(new int[] {1,2,3,4,5,6},6);
//        addingMatrix(new int[] {1,2,3,4,5}, new int[] {5,4,3,2,1});
//        checkingSame(new int[] {1,2,3,4,5,6}, new int[] {7,10,11,12,13,1,2,3}, new int[] {12,13,14,15,16,1,2,3,17,18});
//        countEvenOdd(new int[] {1,2,3,4,5,6,7,8});
//        bigSmallDiff(new int[] {1,2,3,4,5,6,7,8});
//        averageNoBigSmall(new int[] {1,2,3,4,5,6,7,8});
//        checkZeroMinusOne(new int[] {-1,0,1,2,3,4,5,6,7});
//        checkTens(new int[] {1,2,3,4,10,10,5,6,7,10});
//        check65Or77(new int[] {1,2,3,4,5,6,7,65,8,9,10});
//        removeDupes(new int[] {1,1,2,2,2,3,4,5,5,5,6,7,8,8,});
//        addingToValue(new int[] {1,2,3,4,5,6},6);
//        addingToValueThree(new int[] {1, -2, 0, 5, -1, -4},2);
//        leaders(new int[] {7,4,3,6,3,5});
//        closeTo0(new int[] {42,13,26,-39,-6,-23});
//        smallestSecondSmallest(new int[] {-5,});
//        moveZeroesOnes(new int[] {6,2,4,7,3,1,0,1,6,6,3,0,0,0,1,3,5,2,1,1});
//        addingToValueFour(new int[] {26, 70, 73, 95, 52, 32, 3, 33, 54, 98, 36, 49, 29, 51, 54, 94, 75, 57, 52, 80, 26, 14, 12, 45, 84, 65, 31, 20, 87, 44, 22, 70, 38, 39, 26, 64, 41, 95, 59, 26, 34, 0, 49, 50, 33, 68, 37, 67, 90, 41},126);
//        Testtriangle(new int[] {55, 42, 9, 18, 18, 42, 21, 32, 71, 8});
//        rotateArray(new int[] {1,2,3,4,5,6,7,8,9,10});
//        findMissingLetter(new char[] {'p', 'r', 's', 't'});
//        negativeDominant(new int[] {-1,-1,-1,1,1,1,1,-1,-1});
//        checkAlternating(new int[] {1,-1,2,-2,3,-3,4,-4});
//        checkAlternating(new int[] {1,-1,2,-2,3,-3,4});
//        checkAlternating(new int[] {1,-1,2,-2,3,-3,4,4});
//        largestSortedGap(new int[] {43, 94, 13, 63, 9, 79, 29, 88, 78, 78, 48, 85, 33, 32, 92});
//        addingToValueTres(new int[]{1, 6, 3, 0, 8, 4, 1, 7},7);
//        biggestCombinedNumber(new int[] {1, 2, 3, 0, 4, 6});
//        addSubArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},4);


    }
}