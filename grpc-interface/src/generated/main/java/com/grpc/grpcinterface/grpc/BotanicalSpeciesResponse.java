// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BotanicalSpecies.proto

package com.grpc.grpcinterface.grpc;

/**
 * <pre>
 * The response message containing the greetings
 * </pre>
 *
 * Protobuf type {@code net.devh.boot.grpc.example.BotanicalSpeciesResponse}
 */
public final class BotanicalSpeciesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.BotanicalSpeciesResponse)
    BotanicalSpeciesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BotanicalSpeciesResponse.newBuilder() to construct.
  private BotanicalSpeciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BotanicalSpeciesResponse() {
    species_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BotanicalSpeciesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.class, com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.Builder.class);
  }

  public static final int SPECIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto> species_;
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto> getSpeciesList() {
    return species_;
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder> 
      getSpeciesOrBuilderList() {
    return species_;
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  @java.lang.Override
  public int getSpeciesCount() {
    return species_.size();
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  @java.lang.Override
  public com.grpc.grpcinterface.grpc.BotanicalSpeciesDto getSpecies(int index) {
    return species_.get(index);
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  @java.lang.Override
  public com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder getSpeciesOrBuilder(
      int index) {
    return species_.get(index);
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
    for (int i = 0; i < species_.size(); i++) {
      output.writeMessage(1, species_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < species_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, species_.get(i));
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
    if (!(obj instanceof com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse)) {
      return super.equals(obj);
    }
    com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse other = (com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse) obj;

    if (!getSpeciesList()
        .equals(other.getSpeciesList())) return false;
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
    if (getSpeciesCount() > 0) {
      hash = (37 * hash) + SPECIES_FIELD_NUMBER;
      hash = (53 * hash) + getSpeciesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse prototype) {
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
   * The response message containing the greetings
   * </pre>
   *
   * Protobuf type {@code net.devh.boot.grpc.example.BotanicalSpeciesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.BotanicalSpeciesResponse)
      com.grpc.grpcinterface.grpc.BotanicalSpeciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.class, com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.Builder.class);
    }

    // Construct using com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.newBuilder()
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
      if (speciesBuilder_ == null) {
        species_ = java.util.Collections.emptyList();
      } else {
        species_ = null;
        speciesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesProto.internal_static_net_devh_boot_grpc_example_BotanicalSpeciesResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse getDefaultInstanceForType() {
      return com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse build() {
      com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse buildPartial() {
      com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse result = new com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse result) {
      if (speciesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          species_ = java.util.Collections.unmodifiableList(species_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.species_ = species_;
      } else {
        result.species_ = speciesBuilder_.build();
      }
    }

    private void buildPartial0(com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse) {
        return mergeFrom((com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse other) {
      if (other == com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse.getDefaultInstance()) return this;
      if (speciesBuilder_ == null) {
        if (!other.species_.isEmpty()) {
          if (species_.isEmpty()) {
            species_ = other.species_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSpeciesIsMutable();
            species_.addAll(other.species_);
          }
          onChanged();
        }
      } else {
        if (!other.species_.isEmpty()) {
          if (speciesBuilder_.isEmpty()) {
            speciesBuilder_.dispose();
            speciesBuilder_ = null;
            species_ = other.species_;
            bitField0_ = (bitField0_ & ~0x00000001);
            speciesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpeciesFieldBuilder() : null;
          } else {
            speciesBuilder_.addAllMessages(other.species_);
          }
        }
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
            case 10: {
              com.grpc.grpcinterface.grpc.BotanicalSpeciesDto m =
                  input.readMessage(
                      com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.parser(),
                      extensionRegistry);
              if (speciesBuilder_ == null) {
                ensureSpeciesIsMutable();
                species_.add(m);
              } else {
                speciesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto> species_ =
      java.util.Collections.emptyList();
    private void ensureSpeciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        species_ = new java.util.ArrayList<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto>(species_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.grpcinterface.grpc.BotanicalSpeciesDto, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder, com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder> speciesBuilder_;

    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public java.util.List<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto> getSpeciesList() {
      if (speciesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(species_);
      } else {
        return speciesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public int getSpeciesCount() {
      if (speciesBuilder_ == null) {
        return species_.size();
      } else {
        return speciesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesDto getSpecies(int index) {
      if (speciesBuilder_ == null) {
        return species_.get(index);
      } else {
        return speciesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder setSpecies(
        int index, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto value) {
      if (speciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpeciesIsMutable();
        species_.set(index, value);
        onChanged();
      } else {
        speciesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder setSpecies(
        int index, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder builderForValue) {
      if (speciesBuilder_ == null) {
        ensureSpeciesIsMutable();
        species_.set(index, builderForValue.build());
        onChanged();
      } else {
        speciesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder addSpecies(com.grpc.grpcinterface.grpc.BotanicalSpeciesDto value) {
      if (speciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpeciesIsMutable();
        species_.add(value);
        onChanged();
      } else {
        speciesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder addSpecies(
        int index, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto value) {
      if (speciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpeciesIsMutable();
        species_.add(index, value);
        onChanged();
      } else {
        speciesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder addSpecies(
        com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder builderForValue) {
      if (speciesBuilder_ == null) {
        ensureSpeciesIsMutable();
        species_.add(builderForValue.build());
        onChanged();
      } else {
        speciesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder addSpecies(
        int index, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder builderForValue) {
      if (speciesBuilder_ == null) {
        ensureSpeciesIsMutable();
        species_.add(index, builderForValue.build());
        onChanged();
      } else {
        speciesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder addAllSpecies(
        java.lang.Iterable<? extends com.grpc.grpcinterface.grpc.BotanicalSpeciesDto> values) {
      if (speciesBuilder_ == null) {
        ensureSpeciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, species_);
        onChanged();
      } else {
        speciesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder clearSpecies() {
      if (speciesBuilder_ == null) {
        species_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        speciesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public Builder removeSpecies(int index) {
      if (speciesBuilder_ == null) {
        ensureSpeciesIsMutable();
        species_.remove(index);
        onChanged();
      } else {
        speciesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder getSpeciesBuilder(
        int index) {
      return getSpeciesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder getSpeciesOrBuilder(
        int index) {
      if (speciesBuilder_ == null) {
        return species_.get(index);  } else {
        return speciesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public java.util.List<? extends com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder> 
         getSpeciesOrBuilderList() {
      if (speciesBuilder_ != null) {
        return speciesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(species_);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder addSpeciesBuilder() {
      return getSpeciesFieldBuilder().addBuilder(
          com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.getDefaultInstance());
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder addSpeciesBuilder(
        int index) {
      return getSpeciesFieldBuilder().addBuilder(
          index, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.getDefaultInstance());
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
     */
    public java.util.List<com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder> 
         getSpeciesBuilderList() {
      return getSpeciesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.grpcinterface.grpc.BotanicalSpeciesDto, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder, com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder> 
        getSpeciesFieldBuilder() {
      if (speciesBuilder_ == null) {
        speciesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.grpcinterface.grpc.BotanicalSpeciesDto, com.grpc.grpcinterface.grpc.BotanicalSpeciesDto.Builder, com.grpc.grpcinterface.grpc.BotanicalSpeciesDtoOrBuilder>(
                species_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        species_ = null;
      }
      return speciesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.BotanicalSpeciesResponse)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.BotanicalSpeciesResponse)
  private static final com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse();
  }

  public static com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BotanicalSpeciesResponse>
      PARSER = new com.google.protobuf.AbstractParser<BotanicalSpeciesResponse>() {
    @java.lang.Override
    public BotanicalSpeciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BotanicalSpeciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BotanicalSpeciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.grpcinterface.grpc.BotanicalSpeciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

