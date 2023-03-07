import java.math.BigInteger;
import java.util.Stack;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> number1Stack = new Stack<>();
        Stack<Integer> number2Stack = new Stack<>();
        String number1String = new String();
        String number2String = new String();
        char[] total;
        Stack<Integer> resultStack = new Stack<>();
//        l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        while (l1.next != null) {
            number1Stack.push(l1.val);
            l1 = l1.next;
        }
        number1Stack.push(l1.val);

        while (l2.next != null) {
            number2Stack.push(l2.val);
            l2 = l2.next;
        }
        number2Stack.push(l2.val);

        while (!number1Stack.empty()) {
            number1String = number1String.concat(number1Stack.pop().toString());
        }
        while (!number2Stack.empty()) {
            number2String = number2String.concat(number2Stack.pop().toString());
        }

        total = String.valueOf(new BigInteger(number1String).add(new BigInteger(number2String))).toCharArray();

        for(char digit : total){
            resultStack.push(Integer.valueOf(String.valueOf(digit)));
        }

        return getListNode(resultStack);
    }

    public ListNode getListNode(Stack<Integer> stack){
        if(stack.size() == 1){
            return new ListNode(stack.pop());
        }
        else{
            return new ListNode(stack.pop(), getListNode(stack));
        }
    }

    public static void main(String args[]) {
        AddTwoNumbers a2n = new AddTwoNumbers();
        a2n.addTwoNumbers(null, null);
    }
}
