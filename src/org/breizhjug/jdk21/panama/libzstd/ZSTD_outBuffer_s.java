// Generated by jextract

package org.breizhjug.jdk21.panama.libzstd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ZSTD_outBuffer_s {
 *     void* dst;
 *     size_t size;
 *     size_t pos;
 * };
 * }
 */
public class ZSTD_outBuffer_s {

    public static MemoryLayout $LAYOUT() {
        return constants$8.const$1;
    }
    public static VarHandle dst$VH() {
        return constants$8.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* dst;
     * }
     */
    public static MemorySegment dst$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$8.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* dst;
     * }
     */
    public static void dst$set(MemorySegment seg, MemorySegment x) {
        constants$8.const$2.set(seg, x);
    }
    public static MemorySegment dst$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$8.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dst$set(MemorySegment seg, long index, MemorySegment x) {
        constants$8.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$8.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$8.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$8.const$3.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$8.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$8.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pos$VH() {
        return constants$8.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t pos;
     * }
     */
    public static long pos$get(MemorySegment seg) {
        return (long)constants$8.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t pos;
     * }
     */
    public static void pos$set(MemorySegment seg, long x) {
        constants$8.const$4.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)constants$8.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        constants$8.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


