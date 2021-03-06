// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TargetPackage.proto

package sears.holdings.protocol.buffers;

public final class TargetPackageOuterClass {
  private TargetPackageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TargetPackageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sears.holdings.protocol.buffers.TargetPackage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string className = 1;</code>
     */
    java.lang.String getClassName();
    /**
     * <code>string className = 1;</code>
     */
    com.google.protobuf.ByteString
        getClassNameBytes();

    /**
     * <code>string methodName = 2;</code>
     */
    java.lang.String getMethodName();
    /**
     * <code>string methodName = 2;</code>
     */
    com.google.protobuf.ByteString
        getMethodNameBytes();

    /**
     * <code>string param = 3;</code>
     */
    java.lang.String getParam();
    /**
     * <code>string param = 3;</code>
     */
    com.google.protobuf.ByteString
        getParamBytes();

    /**
     * <code>bytes malware = 4;</code>
     */
    com.google.protobuf.ByteString getMalware();

    /**
     * <code>bool malwareAvailable = 5;</code>
     */
    boolean getMalwareAvailable();
  }
  /**
   * Protobuf type {@code sears.holdings.protocol.buffers.TargetPackage}
   */
  public  static final class TargetPackage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sears.holdings.protocol.buffers.TargetPackage)
      TargetPackageOrBuilder {
    // Use TargetPackage.newBuilder() to construct.
    private TargetPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TargetPackage() {
      className_ = "";
      methodName_ = "";
      param_ = "";
      malware_ = com.google.protobuf.ByteString.EMPTY;
      malwareAvailable_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private TargetPackage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              className_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              methodName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              param_ = s;
              break;
            }
            case 34: {

              malware_ = input.readBytes();
              break;
            }
            case 40: {

              malwareAvailable_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sears.holdings.protocol.buffers.TargetPackageOuterClass.internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sears.holdings.protocol.buffers.TargetPackageOuterClass.internal_static_sears_holdings_protocol_buffers_TargetPackage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.class, sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.Builder.class);
    }

    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object className_;
    /**
     * <code>string className = 1;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        className_ = s;
        return s;
      }
    }
    /**
     * <code>string className = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METHODNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object methodName_;
    /**
     * <code>string methodName = 2;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      }
    }
    /**
     * <code>string methodName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAM_FIELD_NUMBER = 3;
    private volatile java.lang.Object param_;
    /**
     * <code>string param = 3;</code>
     */
    public java.lang.String getParam() {
      java.lang.Object ref = param_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param_ = s;
        return s;
      }
    }
    /**
     * <code>string param = 3;</code>
     */
    public com.google.protobuf.ByteString
        getParamBytes() {
      java.lang.Object ref = param_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MALWARE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString malware_;
    /**
     * <code>bytes malware = 4;</code>
     */
    public com.google.protobuf.ByteString getMalware() {
      return malware_;
    }

    public static final int MALWAREAVAILABLE_FIELD_NUMBER = 5;
    private boolean malwareAvailable_;
    /**
     * <code>bool malwareAvailable = 5;</code>
     */
    public boolean getMalwareAvailable() {
      return malwareAvailable_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getClassNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, className_);
      }
      if (!getMethodNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, methodName_);
      }
      if (!getParamBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, param_);
      }
      if (!malware_.isEmpty()) {
        output.writeBytes(4, malware_);
      }
      if (malwareAvailable_ != false) {
        output.writeBool(5, malwareAvailable_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClassNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, className_);
      }
      if (!getMethodNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, methodName_);
      }
      if (!getParamBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, param_);
      }
      if (!malware_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, malware_);
      }
      if (malwareAvailable_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, malwareAvailable_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage)) {
        return super.equals(obj);
      }
      sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage other = (sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage) obj;

      boolean result = true;
      result = result && getClassName()
          .equals(other.getClassName());
      result = result && getMethodName()
          .equals(other.getMethodName());
      result = result && getParam()
          .equals(other.getParam());
      result = result && getMalware()
          .equals(other.getMalware());
      result = result && (getMalwareAvailable()
          == other.getMalwareAvailable());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
      hash = (53 * hash) + getClassName().hashCode();
      hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
      hash = (53 * hash) + getMethodName().hashCode();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam().hashCode();
      hash = (37 * hash) + MALWARE_FIELD_NUMBER;
      hash = (53 * hash) + getMalware().hashCode();
      hash = (37 * hash) + MALWAREAVAILABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMalwareAvailable());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code sears.holdings.protocol.buffers.TargetPackage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sears.holdings.protocol.buffers.TargetPackage)
        sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sears.holdings.protocol.buffers.TargetPackageOuterClass.internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sears.holdings.protocol.buffers.TargetPackageOuterClass.internal_static_sears_holdings_protocol_buffers_TargetPackage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.class, sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.Builder.class);
      }

      // Construct using sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        className_ = "";

        methodName_ = "";

        param_ = "";

        malware_ = com.google.protobuf.ByteString.EMPTY;

        malwareAvailable_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sears.holdings.protocol.buffers.TargetPackageOuterClass.internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor;
      }

      public sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage getDefaultInstanceForType() {
        return sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.getDefaultInstance();
      }

      public sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage build() {
        sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage buildPartial() {
        sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage result = new sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage(this);
        result.className_ = className_;
        result.methodName_ = methodName_;
        result.param_ = param_;
        result.malware_ = malware_;
        result.malwareAvailable_ = malwareAvailable_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage) {
          return mergeFrom((sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage other) {
        if (other == sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage.getDefaultInstance()) return this;
        if (!other.getClassName().isEmpty()) {
          className_ = other.className_;
          onChanged();
        }
        if (!other.getMethodName().isEmpty()) {
          methodName_ = other.methodName_;
          onChanged();
        }
        if (!other.getParam().isEmpty()) {
          param_ = other.param_;
          onChanged();
        }
        if (other.getMalware() != com.google.protobuf.ByteString.EMPTY) {
          setMalware(other.getMalware());
        }
        if (other.getMalwareAvailable() != false) {
          setMalwareAvailable(other.getMalwareAvailable());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object className_ = "";
      /**
       * <code>string className = 1;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          className_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string className = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string className = 1;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        className_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string className = 1;</code>
       */
      public Builder clearClassName() {
        
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }
      /**
       * <code>string className = 1;</code>
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        className_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object methodName_ = "";
      /**
       * <code>string methodName = 2;</code>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          methodName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string methodName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string methodName = 2;</code>
       */
      public Builder setMethodName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        methodName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string methodName = 2;</code>
       */
      public Builder clearMethodName() {
        
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }
      /**
       * <code>string methodName = 2;</code>
       */
      public Builder setMethodNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        methodName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object param_ = "";
      /**
       * <code>string param = 3;</code>
       */
      public java.lang.String getParam() {
        java.lang.Object ref = param_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          param_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string param = 3;</code>
       */
      public com.google.protobuf.ByteString
          getParamBytes() {
        java.lang.Object ref = param_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          param_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string param = 3;</code>
       */
      public Builder setParam(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string param = 3;</code>
       */
      public Builder clearParam() {
        
        param_ = getDefaultInstance().getParam();
        onChanged();
        return this;
      }
      /**
       * <code>string param = 3;</code>
       */
      public Builder setParamBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        param_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString malware_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes malware = 4;</code>
       */
      public com.google.protobuf.ByteString getMalware() {
        return malware_;
      }
      /**
       * <code>bytes malware = 4;</code>
       */
      public Builder setMalware(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        malware_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes malware = 4;</code>
       */
      public Builder clearMalware() {
        
        malware_ = getDefaultInstance().getMalware();
        onChanged();
        return this;
      }

      private boolean malwareAvailable_ ;
      /**
       * <code>bool malwareAvailable = 5;</code>
       */
      public boolean getMalwareAvailable() {
        return malwareAvailable_;
      }
      /**
       * <code>bool malwareAvailable = 5;</code>
       */
      public Builder setMalwareAvailable(boolean value) {
        
        malwareAvailable_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool malwareAvailable = 5;</code>
       */
      public Builder clearMalwareAvailable() {
        
        malwareAvailable_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:sears.holdings.protocol.buffers.TargetPackage)
    }

    // @@protoc_insertion_point(class_scope:sears.holdings.protocol.buffers.TargetPackage)
    private static final sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage();
    }

    public static sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TargetPackage>
        PARSER = new com.google.protobuf.AbstractParser<TargetPackage>() {
      public TargetPackage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TargetPackage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TargetPackage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TargetPackage> getParserForType() {
      return PARSER;
    }

    public sears.holdings.protocol.buffers.TargetPackageOuterClass.TargetPackage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sears_holdings_protocol_buffers_TargetPackage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TargetPackage.proto\022\037sears.holdings.pr" +
      "otocol.buffers\"p\n\rTargetPackage\022\021\n\tclass" +
      "Name\030\001 \001(\t\022\022\n\nmethodName\030\002 \001(\t\022\r\n\005param\030" +
      "\003 \001(\t\022\017\n\007malware\030\004 \001(\014\022\030\n\020malwareAvailab" +
      "le\030\005 \001(\010b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sears_holdings_protocol_buffers_TargetPackage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sears_holdings_protocol_buffers_TargetPackage_descriptor,
        new java.lang.String[] { "ClassName", "MethodName", "Param", "Malware", "MalwareAvailable", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
