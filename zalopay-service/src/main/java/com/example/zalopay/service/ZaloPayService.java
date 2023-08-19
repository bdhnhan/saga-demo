package com.example.zalopay.service;

import com.example.protobuf.Zalopay;
import com.example.protobuf.ZalopayServiceGrpc;
import com.example.zalopay.business.ZaloPayBusiness;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class ZaloPayService extends ZalopayServiceGrpc.ZalopayServiceImplBase {

    private final ZaloPayBusiness zaloPayBusiness;

    public ZaloPayService(ZaloPayBusiness zaloPayBusiness) {
        this.zaloPayBusiness = zaloPayBusiness;
    }

    @Override
    public void commitInBalance(Zalopay.CommitInBalanceRequest request, StreamObserver<Zalopay.CommitInBalanceResponse> responseObserver) {
        responseObserver.onNext(zaloPayBusiness.commit(request));
        responseObserver.onCompleted();
    }

    @Override
    public void redoInBalance(Zalopay.RedoInBalanceRequest request, StreamObserver<Zalopay.RedoInBalanceResponse> responseObserver) {
        responseObserver.onNext(zaloPayBusiness.redo(request));
        responseObserver.onCompleted();
    }
}
