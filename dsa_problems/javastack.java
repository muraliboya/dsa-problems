import java.util.*;
class Solution{
    static boolean balancedornot(String expr)
    {
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<expr.length();i++)
        {
            char x=expr.charAt(i);
            if (x == '(' || x == '[' ||x == '{'){
                stack.push(x);
            }
            if(stack.isEmpty()){
                return false;
            }
            char ch;
            switch(x)
            {
                case ')':
                ch=stack.pop();
                if(ch=='[' || ch=='{')
                {
                    return false;
                }
                break;
                case ']':
                ch=stack.pop();
                if(ch=='('|| ch=='{') return false;
                break;
                case '}':
                ch=stack.pop();
                if(ch=='('||ch=='[') return false;
                break;
                
            }
        }
        return stack.isEmpty();
    }
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            boolean variable=balancedornot(input);
            System.out.println(variable);
		}
		
	}
}



