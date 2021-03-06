// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ContractDestroyed extends Table {
  public static ContractDestroyed getRootAsContractDestroyed(ByteBuffer _bb) { return getRootAsContractDestroyed(_bb, new ContractDestroyed()); }
  public static ContractDestroyed getRootAsContractDestroyed(ByteBuffer _bb, ContractDestroyed obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public ContractDestroyed __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int pc() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Bytes20 address() { return address(new Bytes20()); }
  public Bytes20 address(Bytes20 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Bytes20 refundAddress() { return refundAddress(new Bytes20()); }
  public Bytes20 refundAddress(Bytes20 obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 refundAmount() { return refundAmount(new UInt256()); }
  public UInt256 refundAmount(UInt256 obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Bytes32 transactionHash() { return transactionHash(new Bytes32()); }
  public Bytes32 transactionHash(Bytes32 obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createContractDestroyed(FlatBufferBuilder builder,
      int pc,
      int addressOffset,
      int refundAddressOffset,
      int refundAmountOffset,
      int transactionHashOffset) {
    builder.startObject(5);
    ContractDestroyed.addTransactionHash(builder, transactionHashOffset);
    ContractDestroyed.addRefundAmount(builder, refundAmountOffset);
    ContractDestroyed.addRefundAddress(builder, refundAddressOffset);
    ContractDestroyed.addAddress(builder, addressOffset);
    ContractDestroyed.addPc(builder, pc);
    return ContractDestroyed.endContractDestroyed(builder);
  }

  public static void startContractDestroyed(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addPc(FlatBufferBuilder builder, int pc) { builder.addInt(0, pc, 0); }
  public static void addAddress(FlatBufferBuilder builder, int addressOffset) { builder.addOffset(1, addressOffset, 0); }
  public static void addRefundAddress(FlatBufferBuilder builder, int refundAddressOffset) { builder.addOffset(2, refundAddressOffset, 0); }
  public static void addRefundAmount(FlatBufferBuilder builder, int refundAmountOffset) { builder.addOffset(3, refundAmountOffset, 0); }
  public static void addTransactionHash(FlatBufferBuilder builder, int transactionHashOffset) { builder.addOffset(4, transactionHashOffset, 0); }
  public static int endContractDestroyed(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

