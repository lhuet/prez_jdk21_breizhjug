package org.breizhjug.jdk21;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public class DemoPanamaGettingStarted {


    public static void main(String[] args) throws Throwable {

        String test = STR."Hello BreizhJUG from the process \{getpid()}";

        System.out.println(test);

        String test2 = STR."La chaine de test à la taille: \{strlen(test)}";
        System.out.println(test2);

    }

    static int getpid() throws Throwable {

        Linker linker = Linker.nativeLinker();
        SymbolLookup stdLib = linker.defaultLookup();

        // Get the function pointer of C function
        // pid_t getpid()
        MemorySegment getpid_addr = stdLib.find("getpid").get();

        // Object to describe the function prototype
        FunctionDescriptor getpid_desc = FunctionDescriptor.of(ValueLayout.JAVA_INT);

        // Associate the function pointer with its prototype
        MethodHandle getpid  = linker.downcallHandle(getpid_addr, getpid_desc);

        // Call the native function
        int result = (int) getpid.invokeExact();

        return result;
    }

    static long strlen(String mystr) throws Throwable {

        Linker linker = Linker.nativeLinker();
        SymbolLookup stdLib = linker.defaultLookup();

        // Get the function pointer of C function
        // size_t strlen(const char *s)
        MemorySegment strlen_addr = stdLib.find("strlen").get();

        // Object to describe the function prototype
        FunctionDescriptor strlen_desc = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);

        // Create the downcall handle
        MethodHandle strlen = linker.downcallHandle(strlen_addr, strlen_desc);

        // Call the native function
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment nativeString = arena.allocateUtf8String(mystr);
            return (long) strlen.invokeExact(nativeString);
        }

    }

}
