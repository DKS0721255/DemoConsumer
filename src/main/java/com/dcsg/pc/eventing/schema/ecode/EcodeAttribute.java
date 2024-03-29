/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.ecode;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EcodeAttribute extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 114078579772972535L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EcodeAttribute\",\"namespace\":\"com.dcsg.pc.eventing.schema.ecode\",\"fields\":[{\"name\":\"eventId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ecode\",\"type\":\"string\"},{\"name\":\"attribute\",\"type\":{\"type\":\"record\",\"name\":\"Attribute\",\"namespace\":\"com.dcsg.pc.eventing.schema.common\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"enterpriseId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"values\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}]},{\"name\":\"variant\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"nestedAttributes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"Attribute\"}}],\"default\":null}]}},{\"name\":\"attributionAction\",\"type\":{\"type\":\"enum\",\"name\":\"AttributeAction\",\"namespace\":\"com.dcsg.pc.eventing.schema.common\",\"symbols\":[\"UPDATE\",\"DELETE\"]}},{\"name\":\"createdBy\",\"type\":\"string\"},{\"name\":\"createdOn\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<EcodeAttribute> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EcodeAttribute> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EcodeAttribute> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EcodeAttribute> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EcodeAttribute> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EcodeAttribute to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EcodeAttribute from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EcodeAttribute instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EcodeAttribute fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence eventId;
  private java.lang.CharSequence ecode;
  private com.dcsg.pc.eventing.schema.common.Attribute attribute;
  private com.dcsg.pc.eventing.schema.common.AttributeAction attributionAction;
  private java.lang.CharSequence createdBy;
  private java.time.Instant createdOn;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EcodeAttribute() {}

  /**
   * All-args constructor.
   * @param eventId The new value for eventId
   * @param ecode The new value for ecode
   * @param attribute The new value for attribute
   * @param attributionAction The new value for attributionAction
   * @param createdBy The new value for createdBy
   * @param createdOn The new value for createdOn
   */
  public EcodeAttribute(java.lang.CharSequence eventId, java.lang.CharSequence ecode, com.dcsg.pc.eventing.schema.common.Attribute attribute, com.dcsg.pc.eventing.schema.common.AttributeAction attributionAction, java.lang.CharSequence createdBy, java.time.Instant createdOn) {
    this.eventId = eventId;
    this.ecode = ecode;
    this.attribute = attribute;
    this.attributionAction = attributionAction;
    this.createdBy = createdBy;
    this.createdOn = createdOn.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventId;
    case 1: return ecode;
    case 2: return attribute;
    case 3: return attributionAction;
    case 4: return createdBy;
    case 5: return createdOn;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventId = (java.lang.CharSequence)value$; break;
    case 1: ecode = (java.lang.CharSequence)value$; break;
    case 2: attribute = (com.dcsg.pc.eventing.schema.common.Attribute)value$; break;
    case 3: attributionAction = (com.dcsg.pc.eventing.schema.common.AttributeAction)value$; break;
    case 4: createdBy = (java.lang.CharSequence)value$; break;
    case 5: createdOn = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventId' field.
   * @return The value of the 'eventId' field.
   */
  public java.lang.CharSequence getEventId() {
    return eventId;
  }


  /**
   * Sets the value of the 'eventId' field.
   * @param value the value to set.
   */
  public void setEventId(java.lang.CharSequence value) {
    this.eventId = value;
  }

  /**
   * Gets the value of the 'ecode' field.
   * @return The value of the 'ecode' field.
   */
  public java.lang.CharSequence getEcode() {
    return ecode;
  }


  /**
   * Sets the value of the 'ecode' field.
   * @param value the value to set.
   */
  public void setEcode(java.lang.CharSequence value) {
    this.ecode = value;
  }

  /**
   * Gets the value of the 'attribute' field.
   * @return The value of the 'attribute' field.
   */
  public com.dcsg.pc.eventing.schema.common.Attribute getAttribute() {
    return attribute;
  }


  /**
   * Sets the value of the 'attribute' field.
   * @param value the value to set.
   */
  public void setAttribute(com.dcsg.pc.eventing.schema.common.Attribute value) {
    this.attribute = value;
  }

  /**
   * Gets the value of the 'attributionAction' field.
   * @return The value of the 'attributionAction' field.
   */
  public com.dcsg.pc.eventing.schema.common.AttributeAction getAttributionAction() {
    return attributionAction;
  }


  /**
   * Sets the value of the 'attributionAction' field.
   * @param value the value to set.
   */
  public void setAttributionAction(com.dcsg.pc.eventing.schema.common.AttributeAction value) {
    this.attributionAction = value;
  }

  /**
   * Gets the value of the 'createdBy' field.
   * @return The value of the 'createdBy' field.
   */
  public java.lang.CharSequence getCreatedBy() {
    return createdBy;
  }


  /**
   * Sets the value of the 'createdBy' field.
   * @param value the value to set.
   */
  public void setCreatedBy(java.lang.CharSequence value) {
    this.createdBy = value;
  }

  /**
   * Gets the value of the 'createdOn' field.
   * @return The value of the 'createdOn' field.
   */
  public java.time.Instant getCreatedOn() {
    return createdOn;
  }


  /**
   * Sets the value of the 'createdOn' field.
   * @param value the value to set.
   */
  public void setCreatedOn(java.time.Instant value) {
    this.createdOn = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new EcodeAttribute RecordBuilder.
   * @return A new EcodeAttribute RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder newBuilder() {
    return new com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder();
  }

  /**
   * Creates a new EcodeAttribute RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EcodeAttribute RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder newBuilder(com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder(other);
    }
  }

  /**
   * Creates a new EcodeAttribute RecordBuilder by copying an existing EcodeAttribute instance.
   * @param other The existing instance to copy.
   * @return A new EcodeAttribute RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder newBuilder(com.dcsg.pc.eventing.schema.ecode.EcodeAttribute other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder(other);
    }
  }

  /**
   * RecordBuilder for EcodeAttribute instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EcodeAttribute>
    implements org.apache.avro.data.RecordBuilder<EcodeAttribute> {

    private java.lang.CharSequence eventId;
    private java.lang.CharSequence ecode;
    private com.dcsg.pc.eventing.schema.common.Attribute attribute;
    private com.dcsg.pc.eventing.schema.common.Attribute.Builder attributeBuilder;
    private com.dcsg.pc.eventing.schema.common.AttributeAction attributionAction;
    private java.lang.CharSequence createdBy;
    private java.time.Instant createdOn;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ecode)) {
        this.ecode = data().deepCopy(fields()[1].schema(), other.ecode);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.attribute)) {
        this.attribute = data().deepCopy(fields()[2].schema(), other.attribute);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasAttributeBuilder()) {
        this.attributeBuilder = com.dcsg.pc.eventing.schema.common.Attribute.newBuilder(other.getAttributeBuilder());
      }
      if (isValidValue(fields()[3], other.attributionAction)) {
        this.attributionAction = data().deepCopy(fields()[3].schema(), other.attributionAction);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.createdBy)) {
        this.createdBy = data().deepCopy(fields()[4].schema(), other.createdBy);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.createdOn)) {
        this.createdOn = data().deepCopy(fields()[5].schema(), other.createdOn);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing EcodeAttribute instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.ecode.EcodeAttribute other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ecode)) {
        this.ecode = data().deepCopy(fields()[1].schema(), other.ecode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attribute)) {
        this.attribute = data().deepCopy(fields()[2].schema(), other.attribute);
        fieldSetFlags()[2] = true;
      }
      this.attributeBuilder = null;
      if (isValidValue(fields()[3], other.attributionAction)) {
        this.attributionAction = data().deepCopy(fields()[3].schema(), other.attributionAction);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createdBy)) {
        this.createdBy = data().deepCopy(fields()[4].schema(), other.createdBy);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.createdOn)) {
        this.createdOn = data().deepCopy(fields()[5].schema(), other.createdOn);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'eventId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventId() {
      return eventId;
    }


    /**
      * Sets the value of the 'eventId' field.
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setEventId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.eventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventId' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearEventId() {
      eventId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ecode' field.
      * @return The value.
      */
    public java.lang.CharSequence getEcode() {
      return ecode;
    }


    /**
      * Sets the value of the 'ecode' field.
      * @param value The value of 'ecode'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setEcode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ecode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ecode' field has been set.
      * @return True if the 'ecode' field has been set, false otherwise.
      */
    public boolean hasEcode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ecode' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearEcode() {
      ecode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'attribute' field.
      * @return The value.
      */
    public com.dcsg.pc.eventing.schema.common.Attribute getAttribute() {
      return attribute;
    }


    /**
      * Sets the value of the 'attribute' field.
      * @param value The value of 'attribute'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setAttribute(com.dcsg.pc.eventing.schema.common.Attribute value) {
      validate(fields()[2], value);
      this.attributeBuilder = null;
      this.attribute = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'attribute' field has been set.
      * @return True if the 'attribute' field has been set, false otherwise.
      */
    public boolean hasAttribute() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'attribute' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.dcsg.pc.eventing.schema.common.Attribute.Builder getAttributeBuilder() {
      if (attributeBuilder == null) {
        if (hasAttribute()) {
          setAttributeBuilder(com.dcsg.pc.eventing.schema.common.Attribute.newBuilder(attribute));
        } else {
          setAttributeBuilder(com.dcsg.pc.eventing.schema.common.Attribute.newBuilder());
        }
      }
      return attributeBuilder;
    }

    /**
     * Sets the Builder instance for the 'attribute' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setAttributeBuilder(com.dcsg.pc.eventing.schema.common.Attribute.Builder value) {
      clearAttribute();
      attributeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'attribute' field has an active Builder instance
     * @return True if the 'attribute' field has an active Builder instance
     */
    public boolean hasAttributeBuilder() {
      return attributeBuilder != null;
    }

    /**
      * Clears the value of the 'attribute' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearAttribute() {
      attribute = null;
      attributeBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributionAction' field.
      * @return The value.
      */
    public com.dcsg.pc.eventing.schema.common.AttributeAction getAttributionAction() {
      return attributionAction;
    }


    /**
      * Sets the value of the 'attributionAction' field.
      * @param value The value of 'attributionAction'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setAttributionAction(com.dcsg.pc.eventing.schema.common.AttributeAction value) {
      validate(fields()[3], value);
      this.attributionAction = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'attributionAction' field has been set.
      * @return True if the 'attributionAction' field has been set, false otherwise.
      */
    public boolean hasAttributionAction() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'attributionAction' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearAttributionAction() {
      attributionAction = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdBy' field.
      * @return The value.
      */
    public java.lang.CharSequence getCreatedBy() {
      return createdBy;
    }


    /**
      * Sets the value of the 'createdBy' field.
      * @param value The value of 'createdBy'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setCreatedBy(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.createdBy = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'createdBy' field has been set.
      * @return True if the 'createdBy' field has been set, false otherwise.
      */
    public boolean hasCreatedBy() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'createdBy' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearCreatedBy() {
      createdBy = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdOn' field.
      * @return The value.
      */
    public java.time.Instant getCreatedOn() {
      return createdOn;
    }


    /**
      * Sets the value of the 'createdOn' field.
      * @param value The value of 'createdOn'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder setCreatedOn(java.time.Instant value) {
      validate(fields()[5], value);
      this.createdOn = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'createdOn' field has been set.
      * @return True if the 'createdOn' field has been set, false otherwise.
      */
    public boolean hasCreatedOn() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'createdOn' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.ecode.EcodeAttribute.Builder clearCreatedOn() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EcodeAttribute build() {
      try {
        EcodeAttribute record = new EcodeAttribute();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ecode = fieldSetFlags()[1] ? this.ecode : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (attributeBuilder != null) {
          try {
            record.attribute = this.attributeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("attribute"));
            throw e;
          }
        } else {
          record.attribute = fieldSetFlags()[2] ? this.attribute : (com.dcsg.pc.eventing.schema.common.Attribute) defaultValue(fields()[2]);
        }
        record.attributionAction = fieldSetFlags()[3] ? this.attributionAction : (com.dcsg.pc.eventing.schema.common.AttributeAction) defaultValue(fields()[3]);
        record.createdBy = fieldSetFlags()[4] ? this.createdBy : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.createdOn = fieldSetFlags()[5] ? this.createdOn : (java.time.Instant) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EcodeAttribute>
    WRITER$ = (org.apache.avro.io.DatumWriter<EcodeAttribute>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EcodeAttribute>
    READER$ = (org.apache.avro.io.DatumReader<EcodeAttribute>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










