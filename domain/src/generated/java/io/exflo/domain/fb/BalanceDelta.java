// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BalanceDelta extends Table {
  public static BalanceDelta getRootAsBalanceDelta(ByteBuffer _bb) { return getRootAsBalanceDelta(_bb, new BalanceDelta()); }
  public static BalanceDelta getRootAsBalanceDelta(ByteBuffer _bb, BalanceDelta obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public BalanceDelta __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte deltaType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int pc() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Bytes20 contractAddress() { return contractAddress(new Bytes20()); }
  public Bytes20 contractAddress(Bytes20 obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Bytes20 from() { return from(new Bytes20()); }
  public Bytes20 from(Bytes20 obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Bytes20 to() { return to(new Bytes20()); }
  public Bytes20 to(Bytes20 obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 amount() { return amount(new UInt256()); }
  public UInt256 amount(UInt256 obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 tokenId() { return tokenId(new UInt256()); }
  public UInt256 tokenId(UInt256 obj) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Bytes32 transactionHash() { return transactionHash(new Bytes32()); }
  public Bytes32 transactionHash(Bytes32 obj) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int transactionIndex() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createBalanceDelta(FlatBufferBuilder builder,
      byte deltaType,
      int pc,
      int contractAddressOffset,
      int fromOffset,
      int toOffset,
      int amountOffset,
      int tokenIdOffset,
      int transactionHashOffset,
      int transactionIndex) {
    builder.startObject(9);
    BalanceDelta.addTransactionHash(builder, transactionHashOffset);
    BalanceDelta.addTokenId(builder, tokenIdOffset);
    BalanceDelta.addAmount(builder, amountOffset);
    BalanceDelta.addTo(builder, toOffset);
    BalanceDelta.addFrom(builder, fromOffset);
    BalanceDelta.addContractAddress(builder, contractAddressOffset);
    BalanceDelta.addPc(builder, pc);
    BalanceDelta.addTransactionIndex(builder, transactionIndex);
    BalanceDelta.addDeltaType(builder, deltaType);
    return BalanceDelta.endBalanceDelta(builder);
  }

  public static void startBalanceDelta(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addDeltaType(FlatBufferBuilder builder, byte deltaType) { builder.addByte(0, deltaType, 0); }
  public static void addPc(FlatBufferBuilder builder, int pc) { builder.addInt(1, pc, 0); }
  public static void addContractAddress(FlatBufferBuilder builder, int contractAddressOffset) { builder.addOffset(2, contractAddressOffset, 0); }
  public static void addFrom(FlatBufferBuilder builder, int fromOffset) { builder.addOffset(3, fromOffset, 0); }
  public static void addTo(FlatBufferBuilder builder, int toOffset) { builder.addOffset(4, toOffset, 0); }
  public static void addAmount(FlatBufferBuilder builder, int amountOffset) { builder.addOffset(5, amountOffset, 0); }
  public static void addTokenId(FlatBufferBuilder builder, int tokenIdOffset) { builder.addOffset(6, tokenIdOffset, 0); }
  public static void addTransactionHash(FlatBufferBuilder builder, int transactionHashOffset) { builder.addOffset(7, transactionHashOffset, 0); }
  public static void addTransactionIndex(FlatBufferBuilder builder, int transactionIndex) { builder.addByte(8, (byte)transactionIndex, (byte)0); }
  public static int endBalanceDelta(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
