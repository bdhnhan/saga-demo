package com.example.bank.service;

import com.example.bank.business.BankAccountBusiness;
import com.example.protobuf.Bank;
import com.example.protobuf.BankServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class BankAccountService extends BankServiceGrpc.BankServiceImplBase {

    private final BankAccountBusiness bankAccountBusiness;

    public BankAccountService(BankAccountBusiness bankAccountBusiness) {
        this.bankAccountBusiness = bankAccountBusiness;
    }

    @Override
    public void commitOutBalance(Bank.CommitOutBalanceRequest request, StreamObserver<Bank.CommitOutBalanceResponse> responseObserver) {
        Bank.CommitOutBalanceResponse response = bankAccountBusiness.commit(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void redoOutBalance(Bank.RedoOutBalanceRequest request, StreamObserver<Bank.RedoOutBalanceResponse> responseObserver) {
        Bank.RedoOutBalanceResponse response = bankAccountBusiness.redo(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
