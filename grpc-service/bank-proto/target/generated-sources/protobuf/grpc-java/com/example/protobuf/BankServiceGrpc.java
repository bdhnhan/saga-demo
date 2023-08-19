package com.example.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.Bank.CommitOutBalanceRequest,
      com.example.protobuf.Bank.CommitOutBalanceResponse> getCommitOutBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commitOutBalance",
      requestType = com.example.protobuf.Bank.CommitOutBalanceRequest.class,
      responseType = com.example.protobuf.Bank.CommitOutBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.Bank.CommitOutBalanceRequest,
      com.example.protobuf.Bank.CommitOutBalanceResponse> getCommitOutBalanceMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.Bank.CommitOutBalanceRequest, com.example.protobuf.Bank.CommitOutBalanceResponse> getCommitOutBalanceMethod;
    if ((getCommitOutBalanceMethod = BankServiceGrpc.getCommitOutBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCommitOutBalanceMethod = BankServiceGrpc.getCommitOutBalanceMethod) == null) {
          BankServiceGrpc.getCommitOutBalanceMethod = getCommitOutBalanceMethod = 
              io.grpc.MethodDescriptor.<com.example.protobuf.Bank.CommitOutBalanceRequest, com.example.protobuf.Bank.CommitOutBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "commitOutBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Bank.CommitOutBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Bank.CommitOutBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("commitOutBalance"))
                  .build();
          }
        }
     }
     return getCommitOutBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.Bank.RedoOutBalanceRequest,
      com.example.protobuf.Bank.RedoOutBalanceResponse> getRedoOutBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redoOutBalance",
      requestType = com.example.protobuf.Bank.RedoOutBalanceRequest.class,
      responseType = com.example.protobuf.Bank.RedoOutBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.Bank.RedoOutBalanceRequest,
      com.example.protobuf.Bank.RedoOutBalanceResponse> getRedoOutBalanceMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.Bank.RedoOutBalanceRequest, com.example.protobuf.Bank.RedoOutBalanceResponse> getRedoOutBalanceMethod;
    if ((getRedoOutBalanceMethod = BankServiceGrpc.getRedoOutBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getRedoOutBalanceMethod = BankServiceGrpc.getRedoOutBalanceMethod) == null) {
          BankServiceGrpc.getRedoOutBalanceMethod = getRedoOutBalanceMethod = 
              io.grpc.MethodDescriptor.<com.example.protobuf.Bank.RedoOutBalanceRequest, com.example.protobuf.Bank.RedoOutBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "redoOutBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Bank.RedoOutBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Bank.RedoOutBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("redoOutBalance"))
                  .build();
          }
        }
     }
     return getRedoOutBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void commitOutBalance(com.example.protobuf.Bank.CommitOutBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Bank.CommitOutBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitOutBalanceMethod(), responseObserver);
    }

    /**
     */
    public void redoOutBalance(com.example.protobuf.Bank.RedoOutBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Bank.RedoOutBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedoOutBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommitOutBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.Bank.CommitOutBalanceRequest,
                com.example.protobuf.Bank.CommitOutBalanceResponse>(
                  this, METHODID_COMMIT_OUT_BALANCE)))
          .addMethod(
            getRedoOutBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.Bank.RedoOutBalanceRequest,
                com.example.protobuf.Bank.RedoOutBalanceResponse>(
                  this, METHODID_REDO_OUT_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void commitOutBalance(com.example.protobuf.Bank.CommitOutBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Bank.CommitOutBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitOutBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redoOutBalance(com.example.protobuf.Bank.RedoOutBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Bank.RedoOutBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedoOutBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.protobuf.Bank.CommitOutBalanceResponse commitOutBalance(com.example.protobuf.Bank.CommitOutBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommitOutBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.protobuf.Bank.RedoOutBalanceResponse redoOutBalance(com.example.protobuf.Bank.RedoOutBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRedoOutBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.Bank.CommitOutBalanceResponse> commitOutBalance(
        com.example.protobuf.Bank.CommitOutBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitOutBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.Bank.RedoOutBalanceResponse> redoOutBalance(
        com.example.protobuf.Bank.RedoOutBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRedoOutBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMIT_OUT_BALANCE = 0;
  private static final int METHODID_REDO_OUT_BALANCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMIT_OUT_BALANCE:
          serviceImpl.commitOutBalance((com.example.protobuf.Bank.CommitOutBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.Bank.CommitOutBalanceResponse>) responseObserver);
          break;
        case METHODID_REDO_OUT_BALANCE:
          serviceImpl.redoOutBalance((com.example.protobuf.Bank.RedoOutBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.Bank.RedoOutBalanceResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.protobuf.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getCommitOutBalanceMethod())
              .addMethod(getRedoOutBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
