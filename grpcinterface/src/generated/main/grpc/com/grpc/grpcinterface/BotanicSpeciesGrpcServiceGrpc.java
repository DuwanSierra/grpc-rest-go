package com.grpc.grpcinterface;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: BotanicSpecies.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BotanicSpeciesGrpcServiceGrpc {

  private BotanicSpeciesGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.grpcinterface.BotanicSpeciesGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.grpcinterface.BotanicSpeciesRequest,
      com.grpc.grpcinterface.BotanicSpeciesResponse> getGetAllBotanicalSpeciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllBotanicalSpecies",
      requestType = com.grpc.grpcinterface.BotanicSpeciesRequest.class,
      responseType = com.grpc.grpcinterface.BotanicSpeciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.grpcinterface.BotanicSpeciesRequest,
      com.grpc.grpcinterface.BotanicSpeciesResponse> getGetAllBotanicalSpeciesMethod() {
    io.grpc.MethodDescriptor<com.grpc.grpcinterface.BotanicSpeciesRequest, com.grpc.grpcinterface.BotanicSpeciesResponse> getGetAllBotanicalSpeciesMethod;
    if ((getGetAllBotanicalSpeciesMethod = BotanicSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod) == null) {
      synchronized (BotanicSpeciesGrpcServiceGrpc.class) {
        if ((getGetAllBotanicalSpeciesMethod = BotanicSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod) == null) {
          BotanicSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod = getGetAllBotanicalSpeciesMethod =
              io.grpc.MethodDescriptor.<com.grpc.grpcinterface.BotanicSpeciesRequest, com.grpc.grpcinterface.BotanicSpeciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllBotanicalSpecies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.grpcinterface.BotanicSpeciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.grpcinterface.BotanicSpeciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BotanicSpeciesGrpcServiceMethodDescriptorSupplier("GetAllBotanicalSpecies"))
              .build();
        }
      }
    }
    return getGetAllBotanicalSpeciesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BotanicSpeciesGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceStub>() {
        @java.lang.Override
        public BotanicSpeciesGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicSpeciesGrpcServiceStub(channel, callOptions);
        }
      };
    return BotanicSpeciesGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BotanicSpeciesGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceBlockingStub>() {
        @java.lang.Override
        public BotanicSpeciesGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicSpeciesGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return BotanicSpeciesGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BotanicSpeciesGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicSpeciesGrpcServiceFutureStub>() {
        @java.lang.Override
        public BotanicSpeciesGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicSpeciesGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return BotanicSpeciesGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void getAllBotanicalSpecies(com.grpc.grpcinterface.BotanicSpeciesRequest request,
        io.grpc.stub.StreamObserver<com.grpc.grpcinterface.BotanicSpeciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllBotanicalSpeciesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BotanicSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class BotanicSpeciesGrpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BotanicSpeciesGrpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BotanicSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicSpeciesGrpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BotanicSpeciesGrpcServiceStub> {
    private BotanicSpeciesGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicSpeciesGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicSpeciesGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getAllBotanicalSpecies(com.grpc.grpcinterface.BotanicSpeciesRequest request,
        io.grpc.stub.StreamObserver<com.grpc.grpcinterface.BotanicSpeciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllBotanicalSpeciesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BotanicSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicSpeciesGrpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BotanicSpeciesGrpcServiceBlockingStub> {
    private BotanicSpeciesGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicSpeciesGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicSpeciesGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public java.util.Iterator<com.grpc.grpcinterface.BotanicSpeciesResponse> getAllBotanicalSpecies(
        com.grpc.grpcinterface.BotanicSpeciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllBotanicalSpeciesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BotanicSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicSpeciesGrpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BotanicSpeciesGrpcServiceFutureStub> {
    private BotanicSpeciesGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicSpeciesGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicSpeciesGrpcServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ALL_BOTANICAL_SPECIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_BOTANICAL_SPECIES:
          serviceImpl.getAllBotanicalSpecies((com.grpc.grpcinterface.BotanicSpeciesRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.grpcinterface.BotanicSpeciesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAllBotanicalSpeciesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.grpc.grpcinterface.BotanicSpeciesRequest,
              com.grpc.grpcinterface.BotanicSpeciesResponse>(
                service, METHODID_GET_ALL_BOTANICAL_SPECIES)))
        .build();
  }

  private static abstract class BotanicSpeciesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BotanicSpeciesGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.grpcinterface.BotanicalSpeciesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BotanicSpeciesGrpcService");
    }
  }

  private static final class BotanicSpeciesGrpcServiceFileDescriptorSupplier
      extends BotanicSpeciesGrpcServiceBaseDescriptorSupplier {
    BotanicSpeciesGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class BotanicSpeciesGrpcServiceMethodDescriptorSupplier
      extends BotanicSpeciesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BotanicSpeciesGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BotanicSpeciesGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BotanicSpeciesGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetAllBotanicalSpeciesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
