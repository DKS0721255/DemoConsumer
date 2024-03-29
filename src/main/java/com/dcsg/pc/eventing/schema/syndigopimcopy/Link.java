/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.syndigopimcopy;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Link extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1590005205811101253L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Link\",\"namespace\":\"com.dcsg.pc.eventing.schema.syndigopimcopy\",\"fields\":[{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RelationshipData\",\"fields\":[{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValues\",\"fields\":[{\"name\":\"group\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Group\",\"fields\":[{\"name\":\"valuesMap\",\"type\":{\"type\":\"map\",\"values\":\"DataValues\"}}]},\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"values\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AttributeValue\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}],\"default\":null}]}}}]}],\"default\":null},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Link> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Link> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Link> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Link> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Link> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Link to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Link from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Link instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Link fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData data;
  private java.lang.CharSequence id;
  private java.lang.CharSequence type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Link() {}

  /**
   * All-args constructor.
   * @param data The new value for data
   * @param id The new value for id
   * @param type The new value for type
   */
  public Link(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData data, java.lang.CharSequence id, java.lang.CharSequence type) {
    this.data = data;
    this.id = id;
    this.type = type;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data;
    case 1: return id;
    case 2: return type;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data = (com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Creates a new Link RecordBuilder.
   * @return A new Link RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder newBuilder() {
    return new com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder();
  }

  /**
   * Creates a new Link RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Link RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder newBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder(other);
    }
  }

  /**
   * Creates a new Link RecordBuilder by copying an existing Link instance.
   * @param other The existing instance to copy.
   * @return A new Link RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder newBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.Link other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder(other);
    }
  }

  /**
   * RecordBuilder for Link instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Link>
    implements org.apache.avro.data.RecordBuilder<Link> {

    private com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData data;
    private com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.Builder dataBuilder;
    private java.lang.CharSequence id;
    private java.lang.CharSequence type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasDataBuilder()) {
        this.dataBuilder = com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.newBuilder(other.getDataBuilder());
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Link instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.syndigopimcopy.Link other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
      this.dataBuilder = null;
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder setData(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData value) {
      validate(fields()[0], value);
      this.dataBuilder = null;
      this.data = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.Builder getDataBuilder() {
      if (dataBuilder == null) {
        if (hasData()) {
          setDataBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.newBuilder(data));
        } else {
          setDataBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.newBuilder());
        }
      }
      return dataBuilder;
    }

    /**
     * Sets the Builder instance for the 'data' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder setDataBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData.Builder value) {
      clearData();
      dataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'data' field has an active Builder instance
     * @return True if the 'data' field has an active Builder instance
     */
    public boolean hasDataBuilder() {
      return dataBuilder != null;
    }

    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder clearData() {
      data = null;
      dataBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder setType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Link.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Link build() {
      try {
        Link record = new Link();
        if (dataBuilder != null) {
          try {
            record.data = this.dataBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("data"));
            throw e;
          }
        } else {
          record.data = fieldSetFlags()[0] ? this.data : (com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData) defaultValue(fields()[0]);
        }
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Link>
    WRITER$ = (org.apache.avro.io.DatumWriter<Link>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Link>
    READER$ = (org.apache.avro.io.DatumReader<Link>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.data == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.data.customEncode(out);
    }

    out.writeString(this.id);

    out.writeString(this.type);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.data = null;
      } else {
        if (this.data == null) {
          this.data = new com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData();
        }
        this.data.customDecode(in);
      }

      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.data = null;
          } else {
            if (this.data == null) {
              this.data = new com.dcsg.pc.eventing.schema.syndigopimcopy.RelationshipData();
            }
            this.data.customDecode(in);
          }
          break;

        case 1:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 2:
          this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










