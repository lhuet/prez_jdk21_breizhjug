// Generated by jextract

package org.breizhjug.jdk21.panama.libzstd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ZSTD_versionNumber",
        constants$0.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ZSTD_versionString",
        constants$0.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ZSTD_compress",
        constants$0.const$4
    );
}


