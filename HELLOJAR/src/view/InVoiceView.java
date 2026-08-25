import java.util.ArrayList;
import java.util.Scanner;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

class PaymentController {
    private static final Scanner sc = new Scanner(System.in);
    private Invoice invoice;

    public PaymentController() {
        // 1. Đọc thông tin sinh viên
        String studentId = sc.nextLine();
        String studentName = sc.nextLine();
        Student st = new Student(studentId, studentName);

        // 2. Đọc số môn học và danh sách môn
        int subjectCount = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        while (subjectCount-- > 0) {
            String subId = sc.nextLine();
            String subName = sc.nextLine();
            int credit = Integer.parseInt(sc.nextLine());
            // Lưu ý thứ tự tham số khởi tạo Subject trong JAR: (subName, subId, credit)
            subjects.add(new Subject(subName, subId, credit));
        }

        // 3. Đọc quy định thu học phí
        String ruleId = sc.nextLine();
        String ruleName = sc.nextLine();
        double creditPrice = Double.parseDouble(sc.nextLine());
        Rule rule = new Rule(ruleId, ruleName, creditPrice);

        // 4. Tạo hóa đơn & tính tổng tiền
        invoice = new Invoice(rule);
        invoice.setSt(st);
        invoice.setAlSubject(subjects);

        double amount = 0;
        for (Subject subject : subjects) {
            amount += rule.getCreditPrice() * subject.getCredit();
        }
        invoice.setAmount(amount);
    }

    public Invoice getInvoice() {
        return invoice;
    }
}

public class HELLOJAR {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}