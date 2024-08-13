package model.services;

public interface PaymentService {
    double paymentFee(Double amount);
    double interest(Double amount, Integer months);
}
