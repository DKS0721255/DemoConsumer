/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dcsg.pc.eventing.schema.common;
@org.apache.avro.specific.AvroGenerated
public enum EntityLinkAction implements org.apache.avro.generic.GenericEnumSymbol<EntityLinkAction> {
  ADD, DELETE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EntityLinkAction\",\"namespace\":\"com.dcsg.pc.eventing.schema.common\",\"symbols\":[\"ADD\",\"DELETE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}