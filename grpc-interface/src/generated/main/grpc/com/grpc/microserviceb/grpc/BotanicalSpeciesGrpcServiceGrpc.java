package com.grpc.microserviceb.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: BotanicalSpecies.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BotanicalSpeciesGrpcServiceGrpc {

  private BotanicalSpeciesGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "net.devh.boot.grpc.example.BotanicalSpeciesGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.microserviceb.grpc.BotanicalSpeciesRequest,
      com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> getGetAllBotanicalSpeciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllBotanicalSpecies",
      requestType = com.grpc.microserviceb.grpc.BotanicalSpeciesRequest.class,
      responseType = com.grpc.microserviceb.grpc.BotanicalSpeciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.microserviceb.grpc.BotanicalSpeciesRequest,
      com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> getGetAllBotanicalSpeciesMethod() {
    io.grpc.MethodDescriptor<com.grpc.microserviceb.grpc.BotanicalSpeciesRequest, com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> getGetAllBotanicalSpeciesMethod;
    if ((getGetAllBotanicalSpeciesMethod = BotanicalSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod) == null) {
      synchronized (BotanicalSpeciesGrpcServiceGrpc.class) {
        if ((getGetAllBotanicalSpeciesMethod = BotanicalSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod) == null) {
          BotanicalSpeciesGrpcServiceGrpc.getGetAllBotanicalSpeciesMethod = getGetAllBotanicalSpeciesMethod =
              io.grpc.MethodDescriptor.<com.grpc.microserviceb.grpc.BotanicalSpeciesRequest, com.grpc.microserviceb.grpc.BotanicalSpeciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllBotanicalSpecies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.microserviceb.grpc.BotanicalSpeciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.microserviceb.grpc.BotanicalSpeciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BotanicalSpeciesGrpcServiceMethodDescriptorSupplier("GetAllBotanicalSpecies"))
              .build();
        }
      }
    }
    return getGetAllBotanicalSpeciesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BotanicalSpeciesGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceStub>() {
        @java.lang.Override
        public BotanicalSpeciesGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicalSpeciesGrpcServiceStub(channel, callOptions);
        }
      };
    return BotanicalSpeciesGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BotanicalSpeciesGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceBlockingStub>() {
        @java.lang.Override
        public BotanicalSpeciesGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicalSpeciesGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return BotanicalSpeciesGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BotanicalSpeciesGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BotanicalSpeciesGrpcServiceFutureStub>() {
        @java.lang.Override
        public BotanicalSpeciesGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BotanicalSpeciesGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return BotanicalSpeciesGrpcServiceFutureStub.newStub(factory, channel);
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
    default void getAllBotanicalSpecies(com.grpc.microserviceb.grpc.BotanicalSpeciesRequest request,
        io.grpc.stub.StreamObserver<com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllBotanicalSpeciesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BotanicalSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class BotanicalSpeciesGrpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BotanicalSpeciesGrpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BotanicalSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicalSpeciesGrpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BotanicalSpeciesGrpcServiceStub> {
    private BotanicalSpeciesGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicalSpeciesGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicalSpeciesGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getAllBotanicalSpecies(com.grpc.microserviceb.grpc.BotanicalSpeciesRequest request,
        io.grpc.stub.StreamObserver<com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllBotanicalSpeciesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BotanicalSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicalSpeciesGrpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BotanicalSpeciesGrpcServiceBlockingStub> {
    private BotanicalSpeciesGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicalSpeciesGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicalSpeciesGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.grpc.microserviceb.grpc.BotanicalSpeciesResponse getAllBotanicalSpecies(com.grpc.microserviceb.grpc.BotanicalSpeciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllBotanicalSpeciesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BotanicalSpeciesGrpcService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class BotanicalSpeciesGrpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BotanicalSpeciesGrpcServiceFutureStub> {
    private BotanicalSpeciesGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BotanicalSpeciesGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BotanicalSpeciesGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.microserviceb.grpc.BotanicalSpeciesResponse> getAllBotanicalSpecies(
        com.grpc.microserviceb.grpc.BotanicalSpeciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllBotanicalSpeciesMethod(), getCallOptions()), request);
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
          serviceImpl.getAllBotanicalSpecies((com.grpc.microserviceb.grpc.BotanicalSpeciesRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.microserviceb.grpc.BotanicalSpeciesResponse>) responseObserver);
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
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.grpc.microserviceb.grpc.BotanicalSpeciesRequest,
              com.grpc.microserviceb.grpc.BotanicalSpeciesResponse>(
                service, METHODID_GET_ALL_BOTANICAL_SPECIES)))
        .build();
  }

  private static abstract class BotanicalSpeciesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BotanicalSpeciesGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.microserviceb.grpc.BotanicalSpeciesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BotanicalSpeciesGrpcService");
    }
  }

  private static final class BotanicalSpeciesGrpcServiceFileDescriptorSupplier
      extends BotanicalSpeciesGrpcServiceBaseDescriptorSupplier {
    BotanicalSpeciesGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class BotanicalSpeciesGrpcServiceMethodDescriptorSupplier
      extends BotanicalSpeciesGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BotanicalSpeciesGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BotanicalSpeciesGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BotanicalSpeciesGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetAllBotanicalSpeciesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
