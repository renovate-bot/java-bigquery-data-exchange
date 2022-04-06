/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

/**
 *
 *
 * <pre>
 * Message for response to listing DataExchanges.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse}
 */
public final class ListDataExchangesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)
    ListDataExchangesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDataExchangesResponse.newBuilder() to construct.
  private ListDataExchangesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDataExchangesResponse() {
    dataExchanges_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDataExchangesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDataExchangesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dataExchanges_ =
                    new java.util.ArrayList<
                        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>();
                mutable_bitField0_ |= 0x00000001;
              }
              dataExchanges_.add(
                  input.readMessage(
                      com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dataExchanges_ = java.util.Collections.unmodifiableList(dataExchanges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListDataExchangesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListDataExchangesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse.class,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse.Builder.class);
  }

  public static final int DATA_EXCHANGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
      dataExchanges_;
  /**
   *
   *
   * <pre>
   * The list of DataExchange.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
      getDataExchangesList() {
    return dataExchanges_;
  }
  /**
   *
   *
   * <pre>
   * The list of DataExchange.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
      getDataExchangesOrBuilderList() {
    return dataExchanges_;
  }
  /**
   *
   *
   * <pre>
   * The list of DataExchange.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  @java.lang.Override
  public int getDataExchangesCount() {
    return dataExchanges_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of DataExchange.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange getDataExchanges(int index) {
    return dataExchanges_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of DataExchange.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder
      getDataExchangesOrBuilder(int index) {
    return dataExchanges_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < dataExchanges_.size(); i++) {
      output.writeMessage(1, dataExchanges_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataExchanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dataExchanges_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse other =
        (com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse) obj;

    if (!getDataExchangesList().equals(other.getDataExchangesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDataExchangesCount() > 0) {
      hash = (37 * hash) + DATA_EXCHANGES_FIELD_NUMBER;
      hash = (53 * hash) + getDataExchangesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Message for response to listing DataExchanges.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)
      com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListDataExchangesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListDataExchangesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse.class,
              com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataExchangesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataExchangesBuilder_ == null) {
        dataExchanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataExchangesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListDataExchangesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse build() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse buildPartial() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse result =
          new com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse(this);
      int from_bitField0_ = bitField0_;
      if (dataExchangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataExchanges_ = java.util.Collections.unmodifiableList(dataExchanges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataExchanges_ = dataExchanges_;
      } else {
        result.dataExchanges_ = dataExchangesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse other) {
      if (other
          == com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
              .getDefaultInstance()) return this;
      if (dataExchangesBuilder_ == null) {
        if (!other.dataExchanges_.isEmpty()) {
          if (dataExchanges_.isEmpty()) {
            dataExchanges_ = other.dataExchanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataExchangesIsMutable();
            dataExchanges_.addAll(other.dataExchanges_);
          }
          onChanged();
        }
      } else {
        if (!other.dataExchanges_.isEmpty()) {
          if (dataExchangesBuilder_.isEmpty()) {
            dataExchangesBuilder_.dispose();
            dataExchangesBuilder_ = null;
            dataExchanges_ = other.dataExchanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataExchangesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDataExchangesFieldBuilder()
                    : null;
          } else {
            dataExchangesBuilder_.addAllMessages(other.dataExchanges_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
        dataExchanges_ = java.util.Collections.emptyList();

    private void ensureDataExchangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataExchanges_ =
            new java.util.ArrayList<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>(
                dataExchanges_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
        dataExchangesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
        getDataExchangesList() {
      if (dataExchangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataExchanges_);
      } else {
        return dataExchangesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public int getDataExchangesCount() {
      if (dataExchangesBuilder_ == null) {
        return dataExchanges_.size();
      } else {
        return dataExchangesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange getDataExchanges(int index) {
      if (dataExchangesBuilder_ == null) {
        return dataExchanges_.get(index);
      } else {
        return dataExchangesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder setDataExchanges(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange value) {
      if (dataExchangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataExchangesIsMutable();
        dataExchanges_.set(index, value);
        onChanged();
      } else {
        dataExchangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder setDataExchanges(
        int index,
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder builderForValue) {
      if (dataExchangesBuilder_ == null) {
        ensureDataExchangesIsMutable();
        dataExchanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataExchangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder addDataExchanges(
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange value) {
      if (dataExchangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataExchangesIsMutable();
        dataExchanges_.add(value);
        onChanged();
      } else {
        dataExchangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder addDataExchanges(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange value) {
      if (dataExchangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataExchangesIsMutable();
        dataExchanges_.add(index, value);
        onChanged();
      } else {
        dataExchangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder addDataExchanges(
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder builderForValue) {
      if (dataExchangesBuilder_ == null) {
        ensureDataExchangesIsMutable();
        dataExchanges_.add(builderForValue.build());
        onChanged();
      } else {
        dataExchangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder addDataExchanges(
        int index,
        com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder builderForValue) {
      if (dataExchangesBuilder_ == null) {
        ensureDataExchangesIsMutable();
        dataExchanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataExchangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder addAllDataExchanges(
        java.lang.Iterable<? extends com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
            values) {
      if (dataExchangesBuilder_ == null) {
        ensureDataExchangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataExchanges_);
        onChanged();
      } else {
        dataExchangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder clearDataExchanges() {
      if (dataExchangesBuilder_ == null) {
        dataExchanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataExchangesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public Builder removeDataExchanges(int index) {
      if (dataExchangesBuilder_ == null) {
        ensureDataExchangesIsMutable();
        dataExchanges_.remove(index);
        onChanged();
      } else {
        dataExchangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder
        getDataExchangesBuilder(int index) {
      return getDataExchangesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder
        getDataExchangesOrBuilder(int index) {
      if (dataExchangesBuilder_ == null) {
        return dataExchanges_.get(index);
      } else {
        return dataExchangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
        getDataExchangesOrBuilderList() {
      if (dataExchangesBuilder_ != null) {
        return dataExchangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataExchanges_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder
        addDataExchangesBuilder() {
      return getDataExchangesFieldBuilder()
          .addBuilder(
              com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder
        addDataExchangesBuilder(int index) {
      return getDataExchangesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of DataExchange.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder>
        getDataExchangesBuilderList() {
      return getDataExchangesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
        getDataExchangesFieldBuilder() {
      if (dataExchangesBuilder_ == null) {
        dataExchangesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange,
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange.Builder,
                com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>(
                dataExchanges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataExchanges_ = null;
      }
      return dataExchangesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse)
  private static final com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse();
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataExchangesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDataExchangesResponse>() {
        @java.lang.Override
        public ListDataExchangesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDataExchangesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDataExchangesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataExchangesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.ListDataExchangesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
