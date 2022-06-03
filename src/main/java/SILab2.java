import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) { //8
        if (list.size() <= 0) {  //9
            throw new IllegalArgumentException("List length should be greater than 0"); //10
        }
        int n = list.size(); //11
        int rootOfN = (int) Math.sqrt(n); //12
        if (rootOfN * rootOfN  != n) { //13
            throw new IllegalArgumentException("List length should be a perfect square"); //14
        }
        List<String> numMines = new ArrayList<>(); //15
        for (int i = 0; i < n; i++) { // 16
            if (!list.get(i).equals("#")) { //17
                int num = 0; //18
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //19
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //20
                        num += 2; //21
                    }
                    else {
                        num  += 1; //22
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //23
                    num++; //24
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //25
                    num++; //26
                }
                numMines.add(String.valueOf(num)); //27
            }
            else {
                numMines.add(list.get(i)); //28
            }
        } //29
        return numMines; //30
    } //31
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] pom;
        String s;
        int n;

        s = bf.readLine();
        n = Integer.parseInt(s);
        s = bf.readLine();
        pom = s.split(" ");
        for (int i=0; i<n; i++){
            list.add(pom[i]);
        }

        System.out.println(function(list));
    }
}


