import java.util.Scanner;
class CellularPhone
{
    String strArr[] = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    String message;
    CellularPhone()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Sentence : ");
        message = (sc.nextLine()).toLowerCase();
    }

    void findFreq()
    {
        String str = "";
        char ch;
        int freqArr[] = new int[10];
        for( int i = 0;i<message.length();i++)
        {
            ch = message.charAt(i);
            for( int j = 0;j<strArr.length;j++)
            {
                for( int k = 0;k<strArr[j].length();k++)
                {
                    if(ch==strArr[j].charAt(k))
                    {
                        for( int l = 0;l<k+1;l++)
                        {
                            freqArr[j]++;
                            str+=Integer.toString(j);
                        }
                    }
                }
            }
        }
        System.out.println(str);
        System.out.println("Number"+"\t"+"Frequency");
        for( int i = 0;i<10;i++)
        {
            System.out.println(i+"\t"+freqArr[i]);
        }
    }

    public static void main()
    {
        CellularPhone obj = new CellularPhone();
        obj.findFreq();
    }
}