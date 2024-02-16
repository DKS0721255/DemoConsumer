/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.asset;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DigitalAssetEntity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2406044384782831536L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DigitalAssetEntity\",\"namespace\":\"com.dcsg.pc.eventing.schema.asset\",\"fields\":[{\"name\":\"scene7Uploaded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"aprimoUploaded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"responseToPIM\",\"type\":\"boolean\",\"default\":false},{\"name\":\"savedToDB\",\"type\":\"boolean\",\"default\":false},{\"name\":\"retrycount\",\"type\":\"int\"},{\"name\":\"eventMessage\",\"type\":{\"type\":\"record\",\"name\":\"EventMessage\",\"namespace\":\"com.dcsg.pc.eventing.schema.syndigopimcopy\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"EventMessageData\",\"fields\":[{\"name\":\"attributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValues\",\"fields\":[{\"name\":\"group\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Group\",\"fields\":[{\"name\":\"valuesMap\",\"type\":{\"type\":\"map\",\"values\":\"DataValues\"}}]},\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"values\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AttributeValue\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"relationships\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RelationshipLink\",\"fields\":[{\"name\":\"attributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"DataValues\"}]},{\"name\":\"relTo\",\"type\":{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RelationshipData\",\"fields\":[{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":\"DataValues\"}}]}],\"default\":null},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}}]},\"java-class\":\"java.util.List\"}}],\"default\":null}]}},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventMessageProperties\",\"fields\":[{\"name\":\"createdBy\",\"type\":\"string\"},{\"name\":\"createdDate\",\"type\":\"string\"},{\"name\":\"modifiedBy\",\"type\":\"string\"},{\"name\":\"modifiedDate\",\"type\":\"string\"}]}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DigitalAssetEntity> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DigitalAssetEntity> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DigitalAssetEntity> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DigitalAssetEntity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DigitalAssetEntity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DigitalAssetEntity to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DigitalAssetEntity from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DigitalAssetEntity instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DigitalAssetEntity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private boolean scene7Uploaded;
  private boolean aprimoUploaded;
  private boolean responseToPIM;
  private boolean savedToDB;
  private int retrycount;
  private com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage eventMessage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DigitalAssetEntity() {}

  /**
   * All-args constructor.
   * @param scene7Uploaded The new value for scene7Uploaded
   * @param aprimoUploaded The new value for aprimoUploaded
   * @param responseToPIM The new value for responseToPIM
   * @param savedToDB The new value for savedToDB
   * @param retrycount The new value for retrycount
   * @param eventMessage The new value for eventMessage
   */
  public DigitalAssetEntity(java.lang.Boolean scene7Uploaded, java.lang.Boolean aprimoUploaded, java.lang.Boolean responseToPIM, java.lang.Boolean savedToDB, java.lang.Integer retrycount, com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage eventMessage) {
    this.scene7Uploaded = scene7Uploaded;
    this.aprimoUploaded = aprimoUploaded;
    this.responseToPIM = responseToPIM;
    this.savedToDB = savedToDB;
    this.retrycount = retrycount;
    this.eventMessage = eventMessage;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return scene7Uploaded;
    case 1: return aprimoUploaded;
    case 2: return responseToPIM;
    case 3: return savedToDB;
    case 4: return retrycount;
    case 5: return eventMessage;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: scene7Uploaded = (java.lang.Boolean)value$; break;
    case 1: aprimoUploaded = (java.lang.Boolean)value$; break;
    case 2: responseToPIM = (java.lang.Boolean)value$; break;
    case 3: savedToDB = (java.lang.Boolean)value$; break;
    case 4: retrycount = (java.lang.Integer)value$; break;
    case 5: eventMessage = (com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'scene7Uploaded' field.
   * @return The value of the 'scene7Uploaded' field.
   */
  public boolean getScene7Uploaded() {
    return scene7Uploaded;
  }


  /**
   * Sets the value of the 'scene7Uploaded' field.
   * @param value the value to set.
   */
  public void setScene7Uploaded(boolean value) {
    this.scene7Uploaded = value;
  }

  /**
   * Gets the value of the 'aprimoUploaded' field.
   * @return The value of the 'aprimoUploaded' field.
   */
  public boolean getAprimoUploaded() {
    return aprimoUploaded;
  }


  /**
   * Sets the value of the 'aprimoUploaded' field.
   * @param value the value to set.
   */
  public void setAprimoUploaded(boolean value) {
    this.aprimoUploaded = value;
  }

  /**
   * Gets the value of the 'responseToPIM' field.
   * @return The value of the 'responseToPIM' field.
   */
  public boolean getResponseToPIM() {
    return responseToPIM;
  }


  /**
   * Sets the value of the 'responseToPIM' field.
   * @param value the value to set.
   */
  public void setResponseToPIM(boolean value) {
    this.responseToPIM = value;
  }

  /**
   * Gets the value of the 'savedToDB' field.
   * @return The value of the 'savedToDB' field.
   */
  public boolean getSavedToDB() {
    return savedToDB;
  }


  /**
   * Sets the value of the 'savedToDB' field.
   * @param value the value to set.
   */
  public void setSavedToDB(boolean value) {
    this.savedToDB = value;
  }

  /**
   * Gets the value of the 'retrycount' field.
   * @return The value of the 'retrycount' field.
   */
  public int getRetrycount() {
    return retrycount;
  }


  /**
   * Sets the value of the 'retrycount' field.
   * @param value the value to set.
   */
  public void setRetrycount(int value) {
    this.retrycount = value;
  }

  /**
   * Gets the value of the 'eventMessage' field.
   * @return The value of the 'eventMessage' field.
   */
  public com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage getEventMessage() {
    return eventMessage;
  }


  /**
   * Sets the value of the 'eventMessage' field.
   * @param value the value to set.
   */
  public void setEventMessage(com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage value) {
    this.eventMessage = value;
  }

  /**
   * Creates a new DigitalAssetEntity RecordBuilder.
   * @return A new DigitalAssetEntity RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder newBuilder() {
    return new com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder();
  }

  /**
   * Creates a new DigitalAssetEntity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DigitalAssetEntity RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder newBuilder(com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder(other);
    }
  }

  /**
   * Creates a new DigitalAssetEntity RecordBuilder by copying an existing DigitalAssetEntity instance.
   * @param other The existing instance to copy.
   * @return A new DigitalAssetEntity RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder newBuilder(com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder(other);
    }
  }

  /**
   * RecordBuilder for DigitalAssetEntity instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DigitalAssetEntity>
    implements org.apache.avro.data.RecordBuilder<DigitalAssetEntity> {

    private boolean scene7Uploaded;
    private boolean aprimoUploaded;
    private boolean responseToPIM;
    private boolean savedToDB;
    private int retrycount;
    private com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage eventMessage;
    private com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.Builder eventMessageBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.scene7Uploaded)) {
        this.scene7Uploaded = data().deepCopy(fields()[0].schema(), other.scene7Uploaded);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.aprimoUploaded)) {
        this.aprimoUploaded = data().deepCopy(fields()[1].schema(), other.aprimoUploaded);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.responseToPIM)) {
        this.responseToPIM = data().deepCopy(fields()[2].schema(), other.responseToPIM);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.savedToDB)) {
        this.savedToDB = data().deepCopy(fields()[3].schema(), other.savedToDB);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.retrycount)) {
        this.retrycount = data().deepCopy(fields()[4].schema(), other.retrycount);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.eventMessage)) {
        this.eventMessage = data().deepCopy(fields()[5].schema(), other.eventMessage);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasEventMessageBuilder()) {
        this.eventMessageBuilder = com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.newBuilder(other.getEventMessageBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DigitalAssetEntity instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.scene7Uploaded)) {
        this.scene7Uploaded = data().deepCopy(fields()[0].schema(), other.scene7Uploaded);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.aprimoUploaded)) {
        this.aprimoUploaded = data().deepCopy(fields()[1].schema(), other.aprimoUploaded);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.responseToPIM)) {
        this.responseToPIM = data().deepCopy(fields()[2].schema(), other.responseToPIM);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.savedToDB)) {
        this.savedToDB = data().deepCopy(fields()[3].schema(), other.savedToDB);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.retrycount)) {
        this.retrycount = data().deepCopy(fields()[4].schema(), other.retrycount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.eventMessage)) {
        this.eventMessage = data().deepCopy(fields()[5].schema(), other.eventMessage);
        fieldSetFlags()[5] = true;
      }
      this.eventMessageBuilder = null;
    }

    /**
      * Gets the value of the 'scene7Uploaded' field.
      * @return The value.
      */
    public boolean getScene7Uploaded() {
      return scene7Uploaded;
    }


    /**
      * Sets the value of the 'scene7Uploaded' field.
      * @param value The value of 'scene7Uploaded'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setScene7Uploaded(boolean value) {
      validate(fields()[0], value);
      this.scene7Uploaded = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'scene7Uploaded' field has been set.
      * @return True if the 'scene7Uploaded' field has been set, false otherwise.
      */
    public boolean hasScene7Uploaded() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'scene7Uploaded' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearScene7Uploaded() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'aprimoUploaded' field.
      * @return The value.
      */
    public boolean getAprimoUploaded() {
      return aprimoUploaded;
    }


    /**
      * Sets the value of the 'aprimoUploaded' field.
      * @param value The value of 'aprimoUploaded'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setAprimoUploaded(boolean value) {
      validate(fields()[1], value);
      this.aprimoUploaded = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'aprimoUploaded' field has been set.
      * @return True if the 'aprimoUploaded' field has been set, false otherwise.
      */
    public boolean hasAprimoUploaded() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'aprimoUploaded' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearAprimoUploaded() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'responseToPIM' field.
      * @return The value.
      */
    public boolean getResponseToPIM() {
      return responseToPIM;
    }


    /**
      * Sets the value of the 'responseToPIM' field.
      * @param value The value of 'responseToPIM'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setResponseToPIM(boolean value) {
      validate(fields()[2], value);
      this.responseToPIM = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'responseToPIM' field has been set.
      * @return True if the 'responseToPIM' field has been set, false otherwise.
      */
    public boolean hasResponseToPIM() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'responseToPIM' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearResponseToPIM() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'savedToDB' field.
      * @return The value.
      */
    public boolean getSavedToDB() {
      return savedToDB;
    }


    /**
      * Sets the value of the 'savedToDB' field.
      * @param value The value of 'savedToDB'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setSavedToDB(boolean value) {
      validate(fields()[3], value);
      this.savedToDB = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'savedToDB' field has been set.
      * @return True if the 'savedToDB' field has been set, false otherwise.
      */
    public boolean hasSavedToDB() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'savedToDB' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearSavedToDB() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'retrycount' field.
      * @return The value.
      */
    public int getRetrycount() {
      return retrycount;
    }


    /**
      * Sets the value of the 'retrycount' field.
      * @param value The value of 'retrycount'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setRetrycount(int value) {
      validate(fields()[4], value);
      this.retrycount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'retrycount' field has been set.
      * @return True if the 'retrycount' field has been set, false otherwise.
      */
    public boolean hasRetrycount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'retrycount' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearRetrycount() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventMessage' field.
      * @return The value.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage getEventMessage() {
      return eventMessage;
    }


    /**
      * Sets the value of the 'eventMessage' field.
      * @param value The value of 'eventMessage'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setEventMessage(com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage value) {
      validate(fields()[5], value);
      this.eventMessageBuilder = null;
      this.eventMessage = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'eventMessage' field has been set.
      * @return True if the 'eventMessage' field has been set, false otherwise.
      */
    public boolean hasEventMessage() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'eventMessage' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.Builder getEventMessageBuilder() {
      if (eventMessageBuilder == null) {
        if (hasEventMessage()) {
          setEventMessageBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.newBuilder(eventMessage));
        } else {
          setEventMessageBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.newBuilder());
        }
      }
      return eventMessageBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventMessage' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder setEventMessageBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage.Builder value) {
      clearEventMessage();
      eventMessageBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'eventMessage' field has an active Builder instance
     * @return True if the 'eventMessage' field has an active Builder instance
     */
    public boolean hasEventMessageBuilder() {
      return eventMessageBuilder != null;
    }

    /**
      * Clears the value of the 'eventMessage' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.asset.DigitalAssetEntity.Builder clearEventMessage() {
      eventMessage = null;
      eventMessageBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DigitalAssetEntity build() {
      try {
        DigitalAssetEntity record = new DigitalAssetEntity();
        record.scene7Uploaded = fieldSetFlags()[0] ? this.scene7Uploaded : (java.lang.Boolean) defaultValue(fields()[0]);
        record.aprimoUploaded = fieldSetFlags()[1] ? this.aprimoUploaded : (java.lang.Boolean) defaultValue(fields()[1]);
        record.responseToPIM = fieldSetFlags()[2] ? this.responseToPIM : (java.lang.Boolean) defaultValue(fields()[2]);
        record.savedToDB = fieldSetFlags()[3] ? this.savedToDB : (java.lang.Boolean) defaultValue(fields()[3]);
        record.retrycount = fieldSetFlags()[4] ? this.retrycount : (java.lang.Integer) defaultValue(fields()[4]);
        if (eventMessageBuilder != null) {
          try {
            record.eventMessage = this.eventMessageBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventMessage"));
            throw e;
          }
        } else {
          record.eventMessage = fieldSetFlags()[5] ? this.eventMessage : (com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DigitalAssetEntity>
    WRITER$ = (org.apache.avro.io.DatumWriter<DigitalAssetEntity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DigitalAssetEntity>
    READER$ = (org.apache.avro.io.DatumReader<DigitalAssetEntity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeBoolean(this.scene7Uploaded);

    out.writeBoolean(this.aprimoUploaded);

    out.writeBoolean(this.responseToPIM);

    out.writeBoolean(this.savedToDB);

    out.writeInt(this.retrycount);

    this.eventMessage.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.scene7Uploaded = in.readBoolean();

      this.aprimoUploaded = in.readBoolean();

      this.responseToPIM = in.readBoolean();

      this.savedToDB = in.readBoolean();

      this.retrycount = in.readInt();

      if (this.eventMessage == null) {
        this.eventMessage = new com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage();
      }
      this.eventMessage.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.scene7Uploaded = in.readBoolean();
          break;

        case 1:
          this.aprimoUploaded = in.readBoolean();
          break;

        case 2:
          this.responseToPIM = in.readBoolean();
          break;

        case 3:
          this.savedToDB = in.readBoolean();
          break;

        case 4:
          this.retrycount = in.readInt();
          break;

        case 5:
          if (this.eventMessage == null) {
            this.eventMessage = new com.dcsg.pc.eventing.schema.syndigopimcopy.EventMessage();
          }
          this.eventMessage.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









