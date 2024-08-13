package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){

        double basicPayment = contract.getTotalValue()/months;

        for (int i=1;i<=months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicPayment, i);
            double paymentFee = paymentService.paymentFee(basicPayment+interest);
            double totalPayment = basicPayment+ paymentFee+ interest;

            contract.getInstallments().add(new Installment(totalPayment,dueDate));
        }
    }
}

