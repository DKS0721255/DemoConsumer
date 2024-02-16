/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.completion;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CompletionKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -735153763174801218L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CompletionKey\",\"namespace\":\"com.dcsg.pc.eventing.schema.completion\",\"fields\":[{\"name\":\"messageId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CompletionKey> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CompletionKey> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CompletionKey> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CompletionKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CompletionKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CompletionKey to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CompletionKey from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CompletionKey instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CompletionKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence messageId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CompletionKey() {}

  /**
   * All-args constructor.
   * @param messageId The new value for messageId
   */
  public CompletionKey(java.lang.CharSequence messageId) {
    this.messageId = messageId;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return messageId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: messageId = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'messageId' field.
   * @return The value of the 'messageId' field.
   */
  public java.lang.CharSequence getMessageId() {
    return messageId;
  }


  /**
   * Sets the value of the 'messageId' field.
   * @param value the value to set.
   */
  public void setMessageId(java.lang.CharSequence value) {
    this.messageId = value;
  }

  /**
   * Creates a new CompletionKey RecordBuilder.
   * @return A new CompletionKey RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder newBuilder() {
    return new com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder();
  }

  /**
   * Creates a new CompletionKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CompletionKey RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder newBuilder(com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder(other);
    }
  }

  /**
   * Creates a new CompletionKey RecordBuilder by copying an existing CompletionKey instance.
   * @param other The existing instance to copy.
   * @return A new CompletionKey RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder newBuilder(com.dcsg.pc.eventing.schema.completion.CompletionKey other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder(other);
    }
  }

  /**
   * RecordBuilder for CompletionKey instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CompletionKey>
    implements org.apache.avro.data.RecordBuilder<CompletionKey> {

    private java.lang.CharSequence messageId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.messageId)) {
        this.messageId = data().deepCopy(fields()[0].schema(), other.messageId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CompletionKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.completion.CompletionKey other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.messageId)) {
        this.messageId = data().deepCopy(fields()[0].schema(), other.messageId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'messageId' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessageId() {
      return messageId;
    }


    /**
      * Sets the value of the 'messageId' field.
      * @param value The value of 'messageId'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder setMessageId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.messageId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'messageId' field has been set.
      * @return True if the 'messageId' field has been set, false otherwise.
      */
    public boolean hasMessageId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'messageId' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.completion.CompletionKey.Builder clearMessageId() {
      messageId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CompletionKey build() {
      try {
        CompletionKey record = new CompletionKey();
        record.messageId = fieldSetFlags()[0] ? this.messageId : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CompletionKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<CompletionKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CompletionKey>
    READER$ = (org.apache.avro.io.DatumReader<CompletionKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.messageId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.messageId = in.readString(this.messageId instanceof Utf8 ? (Utf8)this.messageId : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.messageId = in.readString(this.messageId instanceof Utf8 ? (Utf8)this.messageId : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









