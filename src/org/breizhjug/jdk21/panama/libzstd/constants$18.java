// Generated by jextract

package org.breizhjug.jdk21.panama.libzstd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final VarHandle const$0 = constants$17.const$4.varHandle(MemoryLayout.PathElement.groupElement("notificationLevel"));
    static final VarHandle const$1 = constants$17.const$4.varHandle(MemoryLayout.PathElement.groupElement("dictID"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("compressionLevel"),
            JAVA_INT.withName("notificationLevel"),
            JAVA_INT.withName("dictID")
        ).withName("")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ZDICT_finalizeDictionary",
        constants$18.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ZDICT_getDictID",
        constants$14.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ZDICT_getDictHeaderSize",
        constants$1.const$2
    );
}


