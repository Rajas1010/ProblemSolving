import java.util.*;
public class SortTheStudentsByTheirKthScore
{
	public static void main(String args[])
	{
	int score[][]={{10,6,9,1},{7,5,11,2},{4,8,3,15}};
	int k=2;
        Arrays.sort(score, new Comparator<int[]>() {
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row2[k], row1[k]);
            }
        });
        System.out.println(Arrays.deepToString(score));
	}
}