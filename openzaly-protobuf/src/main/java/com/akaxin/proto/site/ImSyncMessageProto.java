// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/im_sync_message.proto

package com.akaxin.proto.site;

public final class ImSyncMessageProto {
  private ImSyncMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImSyncMessageRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ImSyncMessageRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *二人消息游标
     * </pre>
     *
     * <code>optional int64 u2_pointer = 1;</code>
     */
    long getU2Pointer();

    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */
    int getGroupsPointerCount();
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */
    boolean containsGroupsPointer(
        java.lang.String key);
    /**
     * Use {@link #getGroupsPointerMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Long>
    getGroupsPointer();
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */
    java.util.Map<java.lang.String, java.lang.Long>
    getGroupsPointerMap();
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    long getGroupsPointerOrDefault(
        java.lang.String key,
        long defaultValue);
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    long getGroupsPointerOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code site.ImSyncMessageRequest}
   */
  public  static final class ImSyncMessageRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ImSyncMessageRequest)
      ImSyncMessageRequestOrBuilder {
    // Use ImSyncMessageRequest.newBuilder() to construct.
    private ImSyncMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImSyncMessageRequest() {
      u2Pointer_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ImSyncMessageRequest(
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
            case 8: {

              u2Pointer_ = input.readInt64();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                groupsPointer_ = com.google.protobuf.MapField.newMapField(
                    GroupsPointerDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000002;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              groupsPointer = input.readMessage(
                  GroupsPointerDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              groupsPointer_.getMutableMap().put(groupsPointer.getKey(), groupsPointer.getValue());
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
      return com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetGroupsPointer();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.class, com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.Builder.class);
    }

    private int bitField0_;
    public static final int U2_POINTER_FIELD_NUMBER = 1;
    private long u2Pointer_;
    /**
     * <pre>
     *二人消息游标
     * </pre>
     *
     * <code>optional int64 u2_pointer = 1;</code>
     */
    public long getU2Pointer() {
      return u2Pointer_;
    }

    public static final int GROUPS_POINTER_FIELD_NUMBER = 2;
    private static final class GroupsPointerDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.Long> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.Long>newDefaultInstance(
                  com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.INT64,
                  0L);
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> groupsPointer_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetGroupsPointer() {
      if (groupsPointer_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GroupsPointerDefaultEntryHolder.defaultEntry);
      }
      return groupsPointer_;
    }

    public int getGroupsPointerCount() {
      return internalGetGroupsPointer().getMap().size();
    }
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    public boolean containsGroupsPointer(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetGroupsPointer().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGroupsPointerMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getGroupsPointer() {
      return getGroupsPointerMap();
    }
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getGroupsPointerMap() {
      return internalGetGroupsPointer().getMap();
    }
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    public long getGroupsPointerOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetGroupsPointer().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *群组消息游标
     * </pre>
     *
     * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
     */

    public long getGroupsPointerOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetGroupsPointer().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (u2Pointer_ != 0L) {
        output.writeInt64(1, u2Pointer_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
           : internalGetGroupsPointer().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
        groupsPointer = GroupsPointerDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        output.writeMessage(2, groupsPointer);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (u2Pointer_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, u2Pointer_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
           : internalGetGroupsPointer().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
        groupsPointer = GroupsPointerDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, groupsPointer);
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
      if (!(obj instanceof com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest other = (com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest) obj;

      boolean result = true;
      result = result && (getU2Pointer()
          == other.getU2Pointer());
      result = result && internalGetGroupsPointer().equals(
          other.internalGetGroupsPointer());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + U2_POINTER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getU2Pointer());
      if (!internalGetGroupsPointer().getMap().isEmpty()) {
        hash = (37 * hash) + GROUPS_POINTER_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGroupsPointer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parseFrom(
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
    public static Builder newBuilder(com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest prototype) {
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
     * Protobuf type {@code site.ImSyncMessageRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ImSyncMessageRequest)
        com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetGroupsPointer();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableGroupsPointer();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.class, com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.newBuilder()
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
        u2Pointer_ = 0L;

        internalGetMutableGroupsPointer().clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ImSyncMessageProto.internal_static_site_ImSyncMessageRequest_descriptor;
      }

      public com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest build() {
        com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest buildPartial() {
        com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest result = new com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.u2Pointer_ = u2Pointer_;
        result.groupsPointer_ = internalGetGroupsPointer();
        result.groupsPointer_.makeImmutable();
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest) {
          return mergeFrom((com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest other) {
        if (other == com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest.getDefaultInstance()) return this;
        if (other.getU2Pointer() != 0L) {
          setU2Pointer(other.getU2Pointer());
        }
        internalGetMutableGroupsPointer().mergeFrom(
            other.internalGetGroupsPointer());
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
        com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long u2Pointer_ ;
      /**
       * <pre>
       *二人消息游标
       * </pre>
       *
       * <code>optional int64 u2_pointer = 1;</code>
       */
      public long getU2Pointer() {
        return u2Pointer_;
      }
      /**
       * <pre>
       *二人消息游标
       * </pre>
       *
       * <code>optional int64 u2_pointer = 1;</code>
       */
      public Builder setU2Pointer(long value) {
        
        u2Pointer_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *二人消息游标
       * </pre>
       *
       * <code>optional int64 u2_pointer = 1;</code>
       */
      public Builder clearU2Pointer() {
        
        u2Pointer_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.Long> groupsPointer_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
      internalGetGroupsPointer() {
        if (groupsPointer_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GroupsPointerDefaultEntryHolder.defaultEntry);
        }
        return groupsPointer_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
      internalGetMutableGroupsPointer() {
        onChanged();;
        if (groupsPointer_ == null) {
          groupsPointer_ = com.google.protobuf.MapField.newMapField(
              GroupsPointerDefaultEntryHolder.defaultEntry);
        }
        if (!groupsPointer_.isMutable()) {
          groupsPointer_ = groupsPointer_.copy();
        }
        return groupsPointer_;
      }

      public int getGroupsPointerCount() {
        return internalGetGroupsPointer().getMap().size();
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public boolean containsGroupsPointer(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetGroupsPointer().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGroupsPointerMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Long> getGroupsPointer() {
        return getGroupsPointerMap();
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public java.util.Map<java.lang.String, java.lang.Long> getGroupsPointerMap() {
        return internalGetGroupsPointer().getMap();
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public long getGroupsPointerOrDefault(
          java.lang.String key,
          long defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Long> map =
            internalGetGroupsPointer().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public long getGroupsPointerOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Long> map =
            internalGetGroupsPointer().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGroupsPointer() {
        getMutableGroupsPointer().clear();
        return this;
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public Builder removeGroupsPointer(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        getMutableGroupsPointer().remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Long>
      getMutableGroupsPointer() {
        return internalGetMutableGroupsPointer().getMutableMap();
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */
      public Builder putGroupsPointer(
          java.lang.String key,
          long value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        
        getMutableGroupsPointer().put(key, value);
        return this;
      }
      /**
       * <pre>
       *群组消息游标
       * </pre>
       *
       * <code>map&lt;string, int64&gt; groups_pointer = 2;</code>
       */

      public Builder putAllGroupsPointer(
          java.util.Map<java.lang.String, java.lang.Long> values) {
        getMutableGroupsPointer().putAll(values);
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


      // @@protoc_insertion_point(builder_scope:site.ImSyncMessageRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ImSyncMessageRequest)
    private static final com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest();
    }

    public static com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImSyncMessageRequest>
        PARSER = new com.google.protobuf.AbstractParser<ImSyncMessageRequest>() {
      public ImSyncMessageRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImSyncMessageRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImSyncMessageRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImSyncMessageRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ImSyncMessageProto.ImSyncMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ImSyncMessageRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ImSyncMessageRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032site/im_sync_message.proto\022\004site\032\017core" +
      "/core.proto\"\247\001\n\024ImSyncMessageRequest\022\022\n\n" +
      "u2_pointer\030\001 \001(\003\022E\n\016groups_pointer\030\002 \003(\013" +
      "2-.site.ImSyncMessageRequest.GroupsPoint" +
      "erEntry\0324\n\022GroupsPointerEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\003:\0028\0012Q\n\024ImSyncMessageSe" +
      "rvice\0229\n\007message\022\032.site.ImSyncMessageReq" +
      "uest\032\022.core.NoneResponseB+\n\025com.akaxin.p" +
      "roto.siteB\022ImSyncMessageProtob\006proto3"
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
          com.akaxin.proto.core.CoreProto.getDescriptor(),
        }, assigner);
    internal_static_site_ImSyncMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ImSyncMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ImSyncMessageRequest_descriptor,
        new java.lang.String[] { "U2Pointer", "GroupsPointer", });
    internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_descriptor =
      internal_static_site_ImSyncMessageRequest_descriptor.getNestedTypes().get(0);
    internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ImSyncMessageRequest_GroupsPointerEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.akaxin.proto.core.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
