import java.util.*;

public class HELLOJAR {

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();

        // Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}

// ==================== INVOICE ====================
class Invoice {
    private String customerName;
    private double amount;
    private String paymentMethod;

    public Invoice(String customerName, double amount, String paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}

// ==================== PAYMENT CONTROLLER ====================
class PaymentController {

    public Invoice getInvoice() {
        // Dữ liệu mẫu để test
        String customerName = "Nguyen Van A";
        double amount = 500000;
        String paymentMethod = "Cash";

        return new Invoice(customerName, amount, paymentMethod);
    }
}

// ==================== INVOICE VIEW ====================
class InvoiceView {

    public static void show(Invoice invoice) {
        System.out.println("========== INVOICE ==========");
        System.out.println("Customer: " + invoice.getCustomerName());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Payment method: " + invoice.getPaymentMethod());
        System.out.println("=============================");
    }
}