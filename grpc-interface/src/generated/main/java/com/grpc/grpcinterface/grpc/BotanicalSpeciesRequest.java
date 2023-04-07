// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BotanicalSpecies.proto

package com.grpc.grpcinterface.grpc;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code net.devh.boot.grpc.example.BotanicalSpeciesRequest}
 */
public final class BotanicalSpeciesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.BotanicalSpeciesRequest)
    BotanicalSpeciesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BotanicalSpeciesRequest.newBuilder() to construct.
  private BotanicalSpeciesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BotanicalSpeciesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BotanicalSpeciesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.class, com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.Builder.class);
  }

  public static final int SIZE_FIELD_NUMBER = 1;
  private long size_ = 0L;
  /**
   * <code>int64 size = 1;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (size_ != 0L) {
      output.writeInt64(1, size_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, size_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest)) {
      return super.equals(obj);
    }
    com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest other = (com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest) obj;

    if (getSize()
        != other.getSize()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code net.devh.boot.grpc.example.BotanicalSpeciesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.BotanicalSpeciesRequest)
      com.grpc.grpcinterface.grpc.BotanicalSpeciesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.class, com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.Builder.class);
    }

    // Construct using com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      size_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest getDefaultInstanceForType() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest build() {
      com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest buildPartial() {
      com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest result = new com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.size_ = size_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest) {
        return mergeFrom((com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest other) {
      if (other == com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest.getDefaultInstance()) return this;
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              size_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long size_ ;
    /**
     * <code>int64 size = 1;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 size = 1;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {

      size_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      size_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.BotanicalSpeciesRequest)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.BotanicalSpeciesRequest)
  private static final com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest();
  }

  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BotanicalSpeciesRequest>
      PARSER = new com.google.protobuf.AbstractParser<BotanicalSpeciesRequest>() {
    @java.lang.Override
    public BotanicalSpeciesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BotanicalSpeciesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BotanicalSpeciesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.grpcinterface.grpc.BotanicalSpeciesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

