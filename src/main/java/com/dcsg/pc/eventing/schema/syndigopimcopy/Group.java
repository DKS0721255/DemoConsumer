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
public class Group extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 131417653127216180L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Group\",\"namespace\":\"com.dcsg.pc.eventing.schema.syndigopimcopy\",\"fields\":[{\"name\":\"valuesMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValues\",\"fields\":[{\"name\":\"group\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Group\",\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"values\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AttributeValue\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"}]},\"java-class\":\"java.util.List\"}],\"default\":null}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Group> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Group> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Group> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Group> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Group> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Group to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Group from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Group instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Group fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> valuesMap;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Group() {}

  /**
   * All-args constructor.
   * @param valuesMap The new value for valuesMap
   */
  public Group(java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> valuesMap) {
    this.valuesMap = valuesMap;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return valuesMap;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: valuesMap = (java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'valuesMap' field.
   * @return The value of the 'valuesMap' field.
   */
  public java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> getValuesMap() {
    return valuesMap;
  }


  /**
   * Sets the value of the 'valuesMap' field.
   * @param value the value to set.
   */
  public void setValuesMap(java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> value) {
    this.valuesMap = value;
  }

  /**
   * Creates a new Group RecordBuilder.
   * @return A new Group RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder newBuilder() {
    return new com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder();
  }

  /**
   * Creates a new Group RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Group RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder newBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder(other);
    }
  }

  /**
   * Creates a new Group RecordBuilder by copying an existing Group instance.
   * @param other The existing instance to copy.
   * @return A new Group RecordBuilder
   */
  public static com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder newBuilder(com.dcsg.pc.eventing.schema.syndigopimcopy.Group other) {
    if (other == null) {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder();
    } else {
      return new com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder(other);
    }
  }

  /**
   * RecordBuilder for Group instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Group>
    implements org.apache.avro.data.RecordBuilder<Group> {

    private java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> valuesMap;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.valuesMap)) {
        this.valuesMap = data().deepCopy(fields()[0].schema(), other.valuesMap);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Group instance
     * @param other The existing instance to copy.
     */
    private Builder(com.dcsg.pc.eventing.schema.syndigopimcopy.Group other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.valuesMap)) {
        this.valuesMap = data().deepCopy(fields()[0].schema(), other.valuesMap);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'valuesMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> getValuesMap() {
      return valuesMap;
    }


    /**
      * Sets the value of the 'valuesMap' field.
      * @param value The value of 'valuesMap'.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder setValuesMap(java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> value) {
      validate(fields()[0], value);
      this.valuesMap = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'valuesMap' field has been set.
      * @return True if the 'valuesMap' field has been set, false otherwise.
      */
    public boolean hasValuesMap() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'valuesMap' field.
      * @return This builder.
      */
    public com.dcsg.pc.eventing.schema.syndigopimcopy.Group.Builder clearValuesMap() {
      valuesMap = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Group build() {
      try {
        Group record = new Group();
        record.valuesMap = fieldSetFlags()[0] ? this.valuesMap : (java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Group>
    WRITER$ = (org.apache.avro.io.DatumWriter<Group>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Group>
    READER$ = (org.apache.avro.io.DatumReader<Group>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.valuesMap.size();
    out.writeMapStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> e0: this.valuesMap.entrySet()) {
      actualSize0++;
      out.startItem();
      out.writeString(e0.getKey());
      com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues v0 = e0.getValue();
      v0.customEncode(out);
    }
    out.writeMapEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> m0 = this.valuesMap; // Need fresh name due to limitation of macro system
      if (m0 == null) {
        m0 = new java.util.HashMap<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues>((int)size0);
        this.valuesMap = m0;
      } else m0.clear();
      for ( ; 0 < size0; size0 = in.mapNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence k0 = null;
          k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
          com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues v0 = null;
          if (v0 == null) {
            v0 = new com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues();
          }
          v0.customDecode(in);
          m0.put(k0, v0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues> m0 = this.valuesMap; // Need fresh name due to limitation of macro system
          if (m0 == null) {
            m0 = new java.util.HashMap<java.lang.CharSequence,com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues>((int)size0);
            this.valuesMap = m0;
          } else m0.clear();
          for ( ; 0 < size0; size0 = in.mapNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence k0 = null;
              k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
              com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues v0 = null;
              if (v0 == null) {
                v0 = new com.dcsg.pc.eventing.schema.syndigopimcopy.DataValues();
              }
              v0.customDecode(in);
              m0.put(k0, v0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









