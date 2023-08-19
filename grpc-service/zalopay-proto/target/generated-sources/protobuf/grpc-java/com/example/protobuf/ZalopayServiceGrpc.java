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
    comments = "Source: zalopay.proto")
public final class ZalopayServiceGrpc {

  private ZalopayServiceGrpc() {}

  public static final String SERVICE_NAME = "ZalopayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.CommitInBalanceRequest,
      com.example.protobuf.Zalopay.CommitInBalanceResponse> getCommitInBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commitInBalance",
      requestType = com.example.protobuf.Zalopay.CommitInBalanceRequest.class,
      responseType = com.example.protobuf.Zalopay.CommitInBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.CommitInBalanceRequest,
      com.example.protobuf.Zalopay.CommitInBalanceResponse> getCommitInBalanceMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.CommitInBalanceRequest, com.example.protobuf.Zalopay.CommitInBalanceResponse> getCommitInBalanceMethod;
    if ((getCommitInBalanceMethod = ZalopayServiceGrpc.getCommitInBalanceMethod) == null) {
      synchronized (ZalopayServiceGrpc.class) {
        if ((getCommitInBalanceMethod = ZalopayServiceGrpc.getCommitInBalanceMethod) == null) {
          ZalopayServiceGrpc.getCommitInBalanceMethod = getCommitInBalanceMethod = 
              io.grpc.MethodDescriptor.<com.example.protobuf.Zalopay.CommitInBalanceRequest, com.example.protobuf.Zalopay.CommitInBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ZalopayService", "commitInBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Zalopay.CommitInBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Zalopay.CommitInBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ZalopayServiceMethodDescriptorSupplier("commitInBalance"))
                  .build();
          }
        }
     }
     return getCommitInBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.RedoInBalanceRequest,
      com.example.protobuf.Zalopay.RedoInBalanceResponse> getRedoInBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redoInBalance",
      requestType = com.example.protobuf.Zalopay.RedoInBalanceRequest.class,
      responseType = com.example.protobuf.Zalopay.RedoInBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.RedoInBalanceRequest,
      com.example.protobuf.Zalopay.RedoInBalanceResponse> getRedoInBalanceMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.Zalopay.RedoInBalanceRequest, com.example.protobuf.Zalopay.RedoInBalanceResponse> getRedoInBalanceMethod;
    if ((getRedoInBalanceMethod = ZalopayServiceGrpc.getRedoInBalanceMethod) == null) {
      synchronized (ZalopayServiceGrpc.class) {
        if ((getRedoInBalanceMethod = ZalopayServiceGrpc.getRedoInBalanceMethod) == null) {
          ZalopayServiceGrpc.getRedoInBalanceMethod = getRedoInBalanceMethod = 
              io.grpc.MethodDescriptor.<com.example.protobuf.Zalopay.RedoInBalanceRequest, com.example.protobuf.Zalopay.RedoInBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ZalopayService", "redoInBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Zalopay.RedoInBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.Zalopay.RedoInBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ZalopayServiceMethodDescriptorSupplier("redoInBalance"))
                  .build();
          }
        }
     }
     return getRedoInBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZalopayServiceStub newStub(io.grpc.Channel channel) {
    return new ZalopayServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZalopayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ZalopayServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZalopayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ZalopayServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ZalopayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void commitInBalance(com.example.protobuf.Zalopay.CommitInBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.CommitInBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitInBalanceMethod(), responseObserver);
    }

    /**
     */
    public void redoInBalance(com.example.protobuf.Zalopay.RedoInBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.RedoInBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedoInBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommitInBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.Zalopay.CommitInBalanceRequest,
                com.example.protobuf.Zalopay.CommitInBalanceResponse>(
                  this, METHODID_COMMIT_IN_BALANCE)))
          .addMethod(
            getRedoInBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.Zalopay.RedoInBalanceRequest,
                com.example.protobuf.Zalopay.RedoInBalanceResponse>(
                  this, METHODID_REDO_IN_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class ZalopayServiceStub extends io.grpc.stub.AbstractStub<ZalopayServiceStub> {
    private ZalopayServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZalopayServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZalopayServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZalopayServiceStub(channel, callOptions);
    }

    /**
     */
    public void commitInBalance(com.example.protobuf.Zalopay.CommitInBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.CommitInBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitInBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redoInBalance(com.example.protobuf.Zalopay.RedoInBalanceRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.RedoInBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedoInBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ZalopayServiceBlockingStub extends io.grpc.stub.AbstractStub<ZalopayServiceBlockingStub> {
    private ZalopayServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZalopayServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZalopayServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZalopayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.protobuf.Zalopay.CommitInBalanceResponse commitInBalance(com.example.protobuf.Zalopay.CommitInBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommitInBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.protobuf.Zalopay.RedoInBalanceResponse redoInBalance(com.example.protobuf.Zalopay.RedoInBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRedoInBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ZalopayServiceFutureStub extends io.grpc.stub.AbstractStub<ZalopayServiceFutureStub> {
    private ZalopayServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZalopayServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZalopayServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZalopayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.Zalopay.CommitInBalanceResponse> commitInBalance(
        com.example.protobuf.Zalopay.CommitInBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitInBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.Zalopay.RedoInBalanceResponse> redoInBalance(
        com.example.protobuf.Zalopay.RedoInBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRedoInBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMIT_IN_BALANCE = 0;
  private static final int METHODID_REDO_IN_BALANCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ZalopayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ZalopayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMIT_IN_BALANCE:
          serviceImpl.commitInBalance((com.example.protobuf.Zalopay.CommitInBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.CommitInBalanceResponse>) responseObserver);
          break;
        case METHODID_REDO_IN_BALANCE:
          serviceImpl.redoInBalance((com.example.protobuf.Zalopay.RedoInBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.Zalopay.RedoInBalanceResponse>) responseObserver);
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

  private static abstract class ZalopayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZalopayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.protobuf.Zalopay.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZalopayService");
    }
  }

  private static final class ZalopayServiceFileDescriptorSupplier
      extends ZalopayServiceBaseDescriptorSupplier {
    ZalopayServiceFileDescriptorSupplier() {}
  }

  private static final class ZalopayServiceMethodDescriptorSupplier
      extends ZalopayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ZalopayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ZalopayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZalopayServiceFileDescriptorSupplier())
              .addMethod(getCommitInBalanceMethod())
              .addMethod(getRedoInBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
