// Generated by jextract

package org.breizhjug.jdk21.panama.libzstd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ZSTD_dParam_getBounds",
        constants$5.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ZSTD_DCtx_setParameter",
        constants$6.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ZSTD_DCtx_reset",
        constants$6.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("src"),
        JAVA_LONG.withName("size"),
        JAVA_LONG.withName("pos")
    ).withName("ZSTD_inBuffer_s");
    static final VarHandle const$4 = constants$7.const$3.varHandle(MemoryLayout.PathElement.groupElement("src"));
    static final VarHandle const$5 = constants$7.const$3.varHandle(MemoryLayout.PathElement.groupElement("size"));
}


