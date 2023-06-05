import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedList {
    public static void main(String[] args) throws IOException {
          
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!Objects.equals(list.get(i), list.get(j))) {
                return false;
            }
        }

        return true;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
