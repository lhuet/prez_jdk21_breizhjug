// Generated by jextract

package org.breizhjug.jdk21.panama.libzstd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$14 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$14() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ZSTD_decompress_usingDDict",
        constants$13.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ZSTD_getDictID_fromDict",
        constants$14.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ZSTD_getDictID_fromCDict",
        constants$14.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ZSTD_getDictID_fromDDict",
        constants$14.const$3
    );
}


