/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.common;
@org.apache.avro.specific.AvroGenerated
public enum AttributeAction implements org.apache.avro.generic.GenericEnumSymbol<AttributeAction> {
  UPDATE, DELETE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"AttributeAction\",\"namespace\":\"com.dcsg.pc.eventing.schema.common\",\"symbols\":[\"UPDATE\",\"DELETE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}