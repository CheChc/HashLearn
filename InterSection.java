import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class InterSection
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)
        {
            return new int[0];
        }
        Set<Integer> manage = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1)
        {
            manage.add(i);
        }
        for (int j : nums2)
        {
            if (manage.contains(j))
            {
                res.add(j);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args)
    {
        int[] a = new int[5];
        int[] b = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j < 5; j++)
        {
            b[j] = scanner.nextInt();
        }
        InterSection inter = new InterSection();
        int[] c = inter.intersection(a, b);
        for (int k = 0; k < c.length; k++)
        {
            System.out.println(c[k]);
        }
    }
}
