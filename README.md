# Password_Generator

#
# There is insufficient memory for the Java Runtime Environment to continue.
# Native memory allocation (malloc) failed to allocate 1752496 bytes for Chunk::new
# Possible reasons:
#   The system is out of physical RAM or swap space
#   The process is running with CompressedOops enabled, and the Java Heap may be blocking the growth of the native heap
# Possible solutions:
#   Reduce memory load on the system
#   Increase physical memory or swap space
#   Check if swap backing store is full
#   Decrease Java heap size (-Xmx/-Xms)
#   Decrease number of Java threads
#   Decrease Java thread stack sizes (-Xss)
#   Set larger code cache with -XX:ReservedCodeCacheSize=
#   JVM is running with Unscaled Compressed Oops mode in which the Java heap is
#     placed in the first 4GB address space. The Java Heap base address is the
#     maximum limit for the native heap growth. Please use -XX:HeapBaseMinAddress
#     to set the Java Heap base and to place the Java Heap above 4GB virtual address.
# This output file may be truncated or incomplete.
#
#  Out of Memory Error (arena.cpp:189), pid=1552, tid=312
#
# JRE version: OpenJDK Runtime Environment Temurin-17.0.7+7 (17.0.7+7) (build 17.0.7+7)
# Java VM: OpenJDK 64-Bit Server VM Temurin-17.0.7+7 (17.0.7+7, mixed mode, tiered, compressed oops, compressed class ptrs, parallel gc, windows-amd64)
# No core dump will be written. Minidumps are not enabled by default on client versions of Windows
#

---------------  S U M M A R Y ------------

Command Line: --add-modules=ALL-SYSTEM --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/sun.nio.fs=ALL-UNNAMED -Declipse.application=org.eclipse.jdt.ls.core.id1 -Dosgi.bundles.defaultStartLevel=4 -Declipse.product=org.eclipse.jdt.ls.core.product -Djava.import.generatesMetadataFilesAtProjectRoot=false -Dfile.encoding=utf8 -XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx1G -Xms100m -Xlog:disable -javaagent:c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\lombok\lombok-1.18.28.jar -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=c:\Users\JO\AppData\Roaming\Code\User\workspaceStorage\038773b738e5197abaf7b6006abb9ad6\redhat.java -Daether.dependencyCollector.impl=bf c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\server\plugins\org.eclipse.equinox.launcher_1.6.500.v20230717-2134.jar -configuration c:\Users\JO\AppData\Roaming\Code\User\globalStorage\redhat.java\1.21.0\config_win -data c:\Users\JO\AppData\Roaming\Code\User\workspaceStorage\038773b738e5197abaf7b6006abb9ad6\redhat.java\jdt_ws

Host: Intel(R) Core(TM) i3-1005G1 CPU @ 1.20GHz, 4 cores, 3G,  Windows 11 , 64 bit Build 22621 (10.0.22621.2070)
Time: Fri Sep  1 19:16:09 2023 India Standard Time elapsed time: 225.701318 seconds (0d 0h 3m 45s)

---------------  T H R E A D  ---------------

Current thread (0x000001fbcc77ec50):  JavaThread "C2 CompilerThread0" daemon [_thread_in_native, id=312, stack(0x000000b9a9c00000,0x000000b9a9d00000)]


Current CompileTask:
C2: 225701 9597       4       jdk.internal.org.objectweb.asm.Frame::execute (2318 bytes)

Stack: [0x000000b9a9c00000,0x000000b9a9d00000]
Native frames: (J=compiled Java code, j=interpreted, Vv=VM code, C=native code)
V  [jvm.dll+0x67754a]
V  [jvm.dll+0x834304]
V  [jvm.dll+0x835aae]
V  [jvm.dll+0x836113]
V  [jvm.dll+0x24696f]
V  [jvm.dll+0xac0ac]
V  [jvm.dll+0xac67c]
V  [jvm.dll+0x364de2]
V  [jvm.dll+0x32f6b1]
V  [jvm.dll+0x32eb5a]
V  [jvm.dll+0x219641]
V  [jvm.dll+0x218a61]
V  [jvm.dll+0x1a4d8d]
V  [jvm.dll+0x2284da]
V  [jvm.dll+0x226615]
V  [jvm.dll+0x7ea90b]
V  [jvm.dll+0x7e4e7a]
V  [jvm.dll+0x676395]
C  [ucrtbase.dll+0x29363]
C  [KERNEL32.DLL+0x126ad]
C  [ntdll.dll+0x5aa68]


---------------  P R O C E S S  ---------------

Threads class SMR info:
_java_thread_list=0x000001fbd5011a40, length=29, elements={
0x000001fbb69ac8d0, 0x000001fbb6a6c1e0, 0x000001fbb6a6d530, 0x000001fbcc753900,
0x000001fbcc7541c0, 0x000001fbcc754d70, 0x000001fbcc77b7c0, 0x000001fbcc77ec50,
0x000001fbcc780d60, 0x000001fbd1988070, 0x000001fbd1a4aa50, 0x000001fbd1cb3300,
0x000001fbd24346c0, 0x000001fbd23a7750, 0x000001fbd2492f00, 0x000001fbd27c6ff0,
0x000001fbd2a60030, 0x000001fbd2acc370, 0x000001fbd2ac9820, 0x000001fbd2ac9cf0,
0x000001fbd2aca1c0, 0x000001fbd2acb030, 0x000001fbd2aca690, 0x000001fbd2acb500,
0x000001fbd2acc840, 0x000001fbd35a2d40, 0x000001fbd35a53c0, 0x000001fbd35a4ef0,
0x000001fbd35a70a0
}

Java Threads: ( => current thread )
  0x000001fbb69ac8d0 JavaThread "main" [_thread_blocked, id=9288, stack(0x000000b9a9300000,0x000000b9a9400000)]
  0x000001fbb6a6c1e0 JavaThread "Reference Handler" daemon [_thread_blocked, id=15972, stack(0x000000b9a9600000,0x000000b9a9700000)]
  0x000001fbb6a6d530 JavaThread "Finalizer" daemon [_thread_blocked, id=21660, stack(0x000000b9a9700000,0x000000b9a9800000)]
  0x000001fbcc753900 JavaThread "Signal Dispatcher" daemon [_thread_blocked, id=17004, stack(0x000000b9a9800000,0x000000b9a9900000)]
  0x000001fbcc7541c0 JavaThread "Attach Listener" daemon [_thread_blocked, id=22760, stack(0x000000b9a9900000,0x000000b9a9a00000)]
  0x000001fbcc754d70 JavaThread "Service Thread" daemon [_thread_blocked, id=5064, stack(0x000000b9a9a00000,0x000000b9a9b00000)]
  0x000001fbcc77b7c0 JavaThread "Monitor Deflation Thread" daemon [_thread_blocked, id=16332, stack(0x000000b9a9b00000,0x000000b9a9c00000)]
=>0x000001fbcc77ec50 JavaThread "C2 CompilerThread0" daemon [_thread_in_native, id=312, stack(0x000000b9a9c00000,0x000000b9a9d00000)]
  0x000001fbcc780d60 JavaThread "C1 CompilerThread0" daemon [_thread_blocked, id=16440, stack(0x000000b9a9d00000,0x000000b9a9e00000)]
  0x000001fbd1988070 JavaThread "Sweeper thread" daemon [_thread_blocked, id=14968, stack(0x000000b9a9e00000,0x000000b9a9f00000)]
  0x000001fbd1a4aa50 JavaThread "Common-Cleaner" daemon [_thread_blocked, id=14920, stack(0x000000b9a9f00000,0x000000b9aa000000)]
  0x000001fbd1cb3300 JavaThread "Notification Thread" daemon [_thread_blocked, id=2964, stack(0x000000b9aa000000,0x000000b9aa100000)]
  0x000001fbd24346c0 JavaThread "Active Thread: Equinox Container: c8ede0d9-f4c4-4e42-96b6-7e29090b7b93" [_thread_blocked, id=6740, stack(0x000000b9aa500000,0x000000b9aa600000)]
  0x000001fbd23a7750 JavaThread "Framework Event Dispatcher: Equinox Container: c8ede0d9-f4c4-4e42-96b6-7e29090b7b93" daemon [_thread_blocked, id=6964, stack(0x000000b9aa600000,0x000000b9aa700000)]
  0x000001fbd2492f00 JavaThread "Start Level: Equinox Container: c8ede0d9-f4c4-4e42-96b6-7e29090b7b93" daemon [_thread_blocked, id=20956, stack(0x000000b9aa700000,0x000000b9aa800000)]
  0x000001fbd27c6ff0 JavaThread "SCR Component Actor" daemon [_thread_blocked, id=20692, stack(0x000000b9aa800000,0x000000b9aa900000)]
  0x000001fbd2a60030 JavaThread "Worker-JM" [_thread_blocked, id=17460, stack(0x000000b9aaa00000,0x000000b9aab00000)]
  0x000001fbd2acc370 JavaThread "Worker-0" [_thread_blocked, id=13860, stack(0x000000b9aab00000,0x000000b9aac00000)]
  0x000001fbd2ac9820 JavaThread "Java indexing" daemon [_thread_blocked, id=14408, stack(0x000000b9aad00000,0x000000b9aae00000)]
  0x000001fbd2ac9cf0 JavaThread "Worker-3" [_thread_blocked, id=10532, stack(0x000000b9aaf00000,0x000000b9ab000000)]
  0x000001fbd2aca1c0 JavaThread "JNA Cleaner" daemon [_thread_blocked, id=19360, stack(0x000000b9ab000000,0x000000b9ab100000)]
  0x000001fbd2acb030 JavaThread "Worker-4" [_thread_blocked, id=18016, stack(0x000000b9ab100000,0x000000b9ab200000)]
  0x000001fbd2aca690 JavaThread "pool-2-thread-1" [_thread_blocked, id=18780, stack(0x000000b9ab200000,0x000000b9ab300000)]
  0x000001fbd2acb500 JavaThread "WorkspaceEventsHandler" [_thread_blocked, id=21088, stack(0x000000b9ab300000,0x000000b9ab400000)]
  0x000001fbd2acc840 JavaThread "pool-1-thread-1" [_thread_in_native, id=10080, stack(0x000000b9ab400000,0x000000b9ab500000)]
  0x000001fbd35a2d40 JavaThread "ForkJoinPool.commonPool-worker-1" daemon [_thread_blocked, id=3056, stack(0x000000b9ab600000,0x000000b9ab700000)]
  0x000001fbd35a53c0 JavaThread "ForkJoinPool.commonPool-worker-2" daemon [_thread_in_vm, id=22588, stack(0x000000b9ab800000,0x000000b9ab900000)]
  0x000001fbd35a4ef0 JavaThread "Bundle File Closer" daemon [_thread_blocked, id=12672, stack(0x000000b9aba00000,0x000000b9abb00000)]
  0x000001fbd35a70a0 JavaThread "ForkJoinPool.commonPool-worker-4" daemon [_thread_blocked, id=17532, stack(0x000000b9a9000000,0x000000b9a9100000)]

Other Threads:
  0x000001fbcc71ab70 VMThread "VM Thread" [stack: 0x000000b9a9500000,0x000000b9a9600000] [id=20764]
  0x000001fbd1c944c0 WatcherThread [stack: 0x000000b9aa100000,0x000000b9aa200000] [id=3184]
  0x000001fbb69c19c0 GCTaskThread "GC Thread#0" [stack: 0x000000b9a9400000,0x000000b9a9500000] [id=22868]
  0x000001fbd21da9a0 GCTaskThread "GC Thread#1" [stack: 0x000000b9aa200000,0x000000b9aa300000] [id=21144]
  0x000001fbd2208840 GCTaskThread "GC Thread#2" [stack: 0x000000b9aa300000,0x000000b9aa400000] [id=10296]
  0x000001fbd2208af0 GCTaskThread "GC Thread#3" [stack: 0x000000b9aa400000,0x000000b9aa500000] [id=8264]

Threads with active compile tasks:
C2 CompilerThread0   225796 9597       4       jdk.internal.org.objectweb.asm.Frame::execute (2318 bytes)

VM state: not at safepoint (normal execution)

VM Mutex/Monitor currently owned by a thread: None

Heap address: 0x00000000c0000000, size: 1024 MB, Compressed Oops mode: 32-bit

CDS archive(s) not mapped
Compressed class space mapped at: 0x0000000100000000-0x0000000140000000, reserved size: 1073741824
Narrow klass base: 0x0000000000000000, Narrow klass shift: 3, Narrow klass range: 0x140000000

GC Precious Log:
 CPUs: 4 total, 4 available
 Memory: 3863M
 Large Page Support: Disabled
 NUMA Support: Disabled
 Compressed Oops: Enabled (32-bit)
 Alignments: Space 512K, Generation 512K, Heap 2M
 Heap Min Capacity: 100M
 Heap Initial Capacity: 100M
 Heap Max Capacity: 1G
 Pre-touch: Disabled
 Parallel Workers: 4

Heap:
 PSYoungGen      total 2048K, used 1663K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 77% used [0x00000000eab00000,0x00000000eac27c90,0x00000000eac80000)
  from space 512K, 93% used [0x00000000eae80000,0x00000000eaef8000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 405301K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcd538,0x00000000da780000)
 Metaspace       used 70770K, committed 71936K, reserved 1114112K
  class space    used 7543K, committed 8064K, reserved 1048576K

Card table byte_map: [0x000001fbca000000,0x000001fbca210000] _byte_map_base: 0x000001fbc9a00000

Marking Bits: (ParMarkBitMap*) 0x00007ffe91b452c0
 Begin Bits: [0x000001fbca370000, 0x000001fbcb370000)
 End Bits:   [0x000001fbcb370000, 0x000001fbcc370000)

Polling page: 0x000001fbb6a70000

Metaspace:

Usage:
  Non-class:     61.75 MB used.
      Class:      7.37 MB used.
       Both:     69.11 MB used.

Virtual space:
  Non-class space:       64.00 MB reserved,      62.38 MB ( 97%) committed,  1 nodes.
      Class space:        1.00 GB reserved,       7.88 MB ( <1%) committed,  1 nodes.
             Both:        1.06 GB reserved,      70.25 MB (  6%) committed. 

Chunk freelists:
   Non-Class:  1.52 MB
       Class:  8.13 MB
        Both:  9.65 MB

MaxMetaspaceSize: unlimited
CompressedClassSpaceSize: 1.00 GB
Initial GC threshold: 21.00 MB
Current GC threshold: 109.06 MB
CDS: off
MetaspaceReclaimPolicy: balanced
 - commit_granule_bytes: 65536.
 - commit_granule_words: 8192.
 - virtual_space_node_default_size: 8388608.
 - enlarge_chunks_in_place: 1.
 - new_chunks_are_fully_committed: 0.
 - uncommit_free_chunks: 1.
 - use_allocation_guard: 0.
 - handle_deallocations: 1.


Internal statistics:

num_allocs_failed_limit: 9.
num_arena_births: 674.
num_arena_deaths: 14.
num_vsnodes_births: 2.
num_vsnodes_deaths: 0.
num_space_committed: 1124.
num_space_uncommitted: 0.
num_chunks_returned_to_freelist: 23.
num_chunks_taken_from_freelist: 3554.
num_chunk_merges: 7.
num_chunk_splits: 2227.
num_chunks_enlarged: 1320.
num_inconsistent_stats: 0.

CodeHeap 'non-profiled nmethods': size=120000Kb used=5374Kb max_used=6226Kb free=114625Kb
 bounds [0x000001fbc28f0000, 0x000001fbc2f10000, 0x000001fbc9e20000]
CodeHeap 'profiled nmethods': size=120000Kb used=15790Kb max_used=17311Kb free=104209Kb
 bounds [0x000001fbbae20000, 0x000001fbbbf10000, 0x000001fbc2350000]
CodeHeap 'non-nmethods': size=5760Kb used=1380Kb max_used=1449Kb free=4379Kb
 bounds [0x000001fbc2350000, 0x000001fbc25c0000, 0x000001fbc28f0000]
 total_blobs=8411 nmethods=7690 adapters=630
 compilation: enabled
              stopped_count=0, restarted_count=0
 full_count=0

Compilation events (20 events):
Event: 225.655 Thread 0x000001fbcc780d60 9608       3       java.util.regex.Pattern$BitClass::add (97 bytes)
Event: 225.656 Thread 0x000001fbcc780d60 nmethod 9608 0x000001fbbae6eb90 code [0x000001fbbae6ede0, 0x000001fbbae6f718]
Event: 225.656 Thread 0x000001fbcc780d60 9609       3       java.util.regex.Pattern::createGroup (86 bytes)
Event: 225.657 Thread 0x000001fbcc780d60 nmethod 9609 0x000001fbbb2f2010 code [0x000001fbbb2f2200, 0x000001fbbb2f2898]
Event: 225.657 Thread 0x000001fbcc780d60 9610       3       java.util.regex.Pattern$GroupHead::<init> (10 bytes)
Event: 225.657 Thread 0x000001fbcc780d60 nmethod 9610 0x000001fbbafde790 code [0x000001fbbafde940, 0x000001fbbafdeb38]
Event: 225.660 Thread 0x000001fbcc780d60 9611       3       java.lang.invoke.LambdaForm$Name::withConstraint (20 bytes)
Event: 225.660 Thread 0x000001fbcc780d60 nmethod 9611 0x000001fbbb01ca90 code [0x000001fbbb01cc40, 0x000001fbbb01ce48]
Event: 225.661 Thread 0x000001fbcc780d60 9612       3       java.lang.invoke.LambdaFormBuffer::replaceName (124 bytes)
Event: 225.661 Thread 0x000001fbcc780d60 nmethod 9612 0x000001fbbb3b1710 code [0x000001fbbb3b18c0, 0x000001fbbb3b1a68]
Event: 225.661 Thread 0x000001fbcc780d60 9613       3       java.util.List::of (9 bytes)
Event: 225.662 Thread 0x000001fbcc780d60 nmethod 9613 0x000001fbbaead610 code [0x000001fbbaead7e0, 0x000001fbbaeadc88]
Event: 225.664 Thread 0x000001fbcc780d60 9615       3       java.util.regex.Pattern::qtype (39 bytes)
Event: 225.664 Thread 0x000001fbcc780d60 nmethod 9615 0x000001fbbafef110 code [0x000001fbbafef2e0, 0x000001fbbafef568]
Event: 225.667 Thread 0x000001fbcc780d60 9616       3       java.util.regex.Pattern::bitsOrSingle (106 bytes)
Event: 225.667 Thread 0x000001fbcc780d60 nmethod 9616 0x000001fbbb427b10 code [0x000001fbbb427d00, 0x000001fbbb428358]
Event: 225.668 Thread 0x000001fbcc780d60 9617       3       java.util.regex.Pattern$BitClass::<init> (14 bytes)
Event: 225.668 Thread 0x000001fbcc780d60 nmethod 9617 0x000001fbbb441c10 code [0x000001fbbb441da0, 0x000001fbbb441fb8]
Event: 225.673 Thread 0x000001fbcc780d60 9619       3       java.lang.invoke.MethodHandles::identity (87 bytes)
Event: 225.675 Thread 0x000001fbcc780d60 nmethod 9619 0x000001fbbb257110 code [0x000001fbbb257300, 0x000001fbbb257738]

GC Heap History (20 events):
Event: 214.691 GC heap before
{Heap before GC invocations=182 (full 9):
 PSYoungGen      total 2560K, used 2480K [0x00000000eab00000, 0x00000000eb000000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 1024K, 92% used [0x00000000eac80000,0x00000000ead6c000,0x00000000ead80000)
  to   space 1536K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eb000000)
 ParOldGen       total 433664K, used 403733K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8a45550,0x00000000da780000)
 Metaspace       used 68841K, committed 69888K, reserved 1114112K
  class space    used 7267K, committed 7744K, reserved 1048576K
}
Event: 214.699 GC heap after
{Heap after GC invocations=182 (full 9):
 PSYoungGen      total 2048K, used 224K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 43% used [0x00000000eae80000,0x00000000eaeb8000,0x00000000eaf00000)
  to   space 1024K, 0% used [0x00000000ead00000,0x00000000ead00000,0x00000000eae00000)
 ParOldGen       total 433664K, used 404626K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b249d0,0x00000000da780000)
 Metaspace       used 68841K, committed 69888K, reserved 1114112K
  class space    used 7267K, committed 7744K, reserved 1048576K
}
Event: 215.114 GC heap before
{Heap before GC invocations=183 (full 9):
 PSYoungGen      total 2048K, used 1760K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 43% used [0x00000000eae80000,0x00000000eaeb8000,0x00000000eaf00000)
  to   space 1024K, 0% used [0x00000000ead00000,0x00000000ead00000,0x00000000eae00000)
 ParOldGen       total 433664K, used 404626K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b249d0,0x00000000da780000)
 Metaspace       used 68981K, committed 70016K, reserved 1114112K
  class space    used 7273K, committed 7744K, reserved 1048576K
}
Event: 215.119 GC heap after
{Heap after GC invocations=183 (full 9):
 PSYoungGen      total 2560K, used 320K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 1024K, 31% used [0x00000000ead00000,0x00000000ead50000,0x00000000eae00000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404773K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b49528,0x00000000da780000)
 Metaspace       used 68981K, committed 70016K, reserved 1114112K
  class space    used 7273K, committed 7744K, reserved 1048576K
}
Event: 215.278 GC heap before
{Heap before GC invocations=184 (full 9):
 PSYoungGen      total 2560K, used 1856K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 1024K, 31% used [0x00000000ead00000,0x00000000ead50000,0x00000000eae00000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404773K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b49528,0x00000000da780000)
 Metaspace       used 69245K, committed 70336K, reserved 1114112K
  class space    used 7302K, committed 7808K, reserved 1048576K
}
Event: 215.282 GC heap after
{Heap after GC invocations=184 (full 9):
 PSYoungGen      total 2048K, used 384K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 75% used [0x00000000eae80000,0x00000000eaee0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69245K, committed 70336K, reserved 1114112K
  class space    used 7302K, committed 7808K, reserved 1048576K
}
Event: 224.350 GC heap before
{Heap before GC invocations=185 (full 9):
 PSYoungGen      total 2048K, used 1920K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 75% used [0x00000000eae80000,0x00000000eaee0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69267K, committed 70336K, reserved 1114112K
  class space    used 7302K, committed 7808K, reserved 1048576K
}
Event: 224.362 GC heap after
{Heap after GC invocations=185 (full 9):
 PSYoungGen      total 2048K, used 384K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 75% used [0x00000000eae00000,0x00000000eae60000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69267K, committed 70336K, reserved 1114112K
  class space    used 7302K, committed 7808K, reserved 1048576K
}
Event: 224.531 GC heap before
{Heap before GC invocations=186 (full 9):
 PSYoungGen      total 2048K, used 1920K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 75% used [0x00000000eae00000,0x00000000eae60000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69456K, committed 70528K, reserved 1114112K
  class space    used 7329K, committed 7808K, reserved 1048576K
}
Event: 224.540 GC heap after
{Heap after GC invocations=186 (full 9):
 PSYoungGen      total 2048K, used 448K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 87% used [0x00000000eae80000,0x00000000eaef0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69456K, committed 70528K, reserved 1114112K
  class space    used 7329K, committed 7808K, reserved 1048576K
}
Event: 224.676 GC heap before
{Heap before GC invocations=187 (full 9):
 PSYoungGen      total 2048K, used 1983K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 99% used [0x00000000eab00000,0x00000000eac7fed0,0x00000000eac80000)
  from space 512K, 87% used [0x00000000eae80000,0x00000000eaef0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 404781K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b4b528,0x00000000da780000)
 Metaspace       used 69574K, committed 70656K, reserved 1114112K
  class space    used 7341K, committed 7872K, reserved 1048576K
}
Event: 224.681 GC heap after
{Heap after GC invocations=187 (full 9):
 PSYoungGen      total 2048K, used 512K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 100% used [0x00000000eae00000,0x00000000eae80000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404997K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b81538,0x00000000da780000)
 Metaspace       used 69574K, committed 70656K, reserved 1114112K
  class space    used 7341K, committed 7872K, reserved 1048576K
}
Event: 224.931 GC heap before
{Heap before GC invocations=188 (full 9):
 PSYoungGen      total 2048K, used 2045K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 99% used [0x00000000eab00000,0x00000000eac7f4d0,0x00000000eac80000)
  from space 512K, 100% used [0x00000000eae00000,0x00000000eae80000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 404997K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8b81538,0x00000000da780000)
 Metaspace       used 69722K, committed 70784K, reserved 1114112K
  class space    used 7374K, committed 7872K, reserved 1048576K
}
Event: 224.937 GC heap after
{Heap after GC invocations=188 (full 9):
 PSYoungGen      total 2048K, used 192K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 37% used [0x00000000eae80000,0x00000000eaeb0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 69722K, committed 70784K, reserved 1114112K
  class space    used 7374K, committed 7872K, reserved 1048576K
}
Event: 225.050 GC heap before
{Heap before GC invocations=189 (full 9):
 PSYoungGen      total 2048K, used 1728K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 37% used [0x00000000eae80000,0x00000000eaeb0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 69911K, committed 71040K, reserved 1114112K
  class space    used 7401K, committed 7936K, reserved 1048576K
}
Event: 225.057 GC heap after
{Heap after GC invocations=189 (full 9):
 PSYoungGen      total 2048K, used 224K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 43% used [0x00000000eae00000,0x00000000eae38000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 69911K, committed 71040K, reserved 1114112K
  class space    used 7401K, committed 7936K, reserved 1048576K
}
Event: 225.172 GC heap before
{Heap before GC invocations=190 (full 9):
 PSYoungGen      total 2048K, used 1760K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 43% used [0x00000000eae00000,0x00000000eae38000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 70170K, committed 71232K, reserved 1114112K
  class space    used 7434K, committed 7936K, reserved 1048576K
}
Event: 225.179 GC heap after
{Heap after GC invocations=190 (full 9):
 PSYoungGen      total 2048K, used 320K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 62% used [0x00000000eae80000,0x00000000eaed0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 70170K, committed 71232K, reserved 1114112K
  class space    used 7434K, committed 7936K, reserved 1048576K
}
Event: 225.438 GC heap before
{Heap before GC invocations=191 (full 9):
 PSYoungGen      total 2048K, used 1856K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 100% used [0x00000000eab00000,0x00000000eac80000,0x00000000eac80000)
  from space 512K, 62% used [0x00000000eae80000,0x00000000eaed0000,0x00000000eaf00000)
  to   space 512K, 0% used [0x00000000eae00000,0x00000000eae00000,0x00000000eae80000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 70424K, committed 71616K, reserved 1114112K
  class space    used 7492K, committed 8064K, reserved 1048576K
}
Event: 225.453 GC heap after
{Heap after GC invocations=191 (full 9):
 PSYoungGen      total 2048K, used 352K [0x00000000eab00000, 0x00000000eaf00000, 0x0000000100000000)
  eden space 1536K, 0% used [0x00000000eab00000,0x00000000eab00000,0x00000000eac80000)
  from space 512K, 68% used [0x00000000eae00000,0x00000000eae58000,0x00000000eae80000)
  to   space 512K, 0% used [0x00000000eae80000,0x00000000eae80000,0x00000000eaf00000)
 ParOldGen       total 433664K, used 405293K [0x00000000c0000000, 0x00000000da780000, 0x00000000eab00000)
  object space 433664K, 93% used [0x00000000c0000000,0x00000000d8bcb538,0x00000000da780000)
 Metaspace       used 70424K, committed 71616K, reserved 1114112K
  class space    used 7492K, committed 8064K, reserved 1048576K
}

Dll operation events (13 events):
Event: 0.010 Loaded shared library c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\java.dll
Event: 0.174 Loaded shared library c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\zip.dll
Event: 0.179 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\instrument.dll
Event: 0.201 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\net.dll
Event: 0.207 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\nio.dll
Event: 0.222 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\zip.dll
Event: 0.246 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\jimage.dll
Event: 0.328 Loaded shared library c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\verify.dll
Event: 2.313 Loaded shared library C:\Users\JO\AppData\Roaming\Code\User\globalStorage\redhat.java\1.21.0\config_win\org.eclipse.equinox.launcher\org.eclipse.equinox.launcher.win32.win32.x86_64_1.2.700.v20221108-1024\eclipse_11801.dll
Event: 3.325 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\management.dll
Event: 3.328 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\management_ext.dll
Event: 6.491 Loaded shared library C:\Users\JO\AppData\Local\Temp\jna--1422960055\jna12498770445576905942.dll
Event: 21.153 Loaded shared library C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\sunmscapi.dll

Deoptimization events (20 events):
Event: 224.901 Thread 0x000001fbd35a53c0 Uncommon trap: trap_request=0xfffffff4 fr.pc=0x000001fbc2e8f728 relative=0x00000000000004e8
Event: 224.901 Thread 0x000001fbd35a53c0 Uncommon trap: reason=null_check action=make_not_entrant pc=0x000001fbc2e8f728 method=org.eclipse.core.internal.resources.Resource.equals(Ljava/lang/Object;)Z @ 8 c2
Event: 224.901 Thread 0x000001fbd35a53c0 DEOPT PACKING pc=0x000001fbc2e8f728 sp=0x000000b9ab8fe2e0
Event: 224.901 Thread 0x000001fbd35a53c0 DEOPT UNPACKING pc=0x000001fbc23a9ea3 sp=0x000000b9ab8fe298 mode 2
Event: 225.005 Thread 0x000001fbd35a53c0 Uncommon trap: trap_request=0xffffff45 fr.pc=0x000001fbc2ee9338 relative=0x0000000000000198
Event: 225.005 Thread 0x000001fbd35a53c0 Uncommon trap: reason=unstable_if action=reinterpret pc=0x000001fbc2ee9338 method=org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding.hashCode()I @ 4 c2
Event: 225.005 Thread 0x000001fbd35a53c0 DEOPT PACKING pc=0x000001fbc2ee9338 sp=0x000000b9ab8fe410
Event: 225.005 Thread 0x000001fbd35a53c0 DEOPT UNPACKING pc=0x000001fbc23a9ea3 sp=0x000000b9ab8fe3a8 mode 2
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: trap_request=0xffffff45 fr.pc=0x000001fbc2da26d4 relative=0x0000000000002ff4
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: reason=unstable_if action=reinterpret pc=0x000001fbc2da26d4 method=org.eclipse.jdt.internal.compiler.parser.Parser.consumeToken(I)V @ 1 c2
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT PACKING pc=0x000001fbc2da26d4 sp=0x000000b9ab8fda60
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT UNPACKING pc=0x000001fbc23a9ea3 sp=0x000000b9ab8fda40 mode 2
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: trap_request=0xffffff45 fr.pc=0x000001fbc2ed3828 relative=0x0000000000000528
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: reason=unstable_if action=reinterpret pc=0x000001fbc2ed3828 method=org.eclipse.jdt.internal.compiler.parser.Scanner.mayBeAtCasePattern(I)Z @ 21 c2
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT PACKING pc=0x000001fbc2ed3828 sp=0x000000b9ab8fdaa0
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT UNPACKING pc=0x000001fbc23a9ea3 sp=0x000000b9ab8fd9e8 mode 2
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: trap_request=0xffffff45 fr.pc=0x000001fbc2ed4870 relative=0x00000000000000d0
Event: 225.408 Thread 0x000001fbd35a53c0 Uncommon trap: reason=unstable_if action=reinterpret pc=0x000001fbc2ed4870 method=org.eclipse.jdt.internal.compiler.parser.Scanner.mayBeAtCasePattern(I)Z @ 21 c2
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT PACKING pc=0x000001fbc2ed4870 sp=0x000000b9ab8fda30
Event: 225.408 Thread 0x000001fbd35a53c0 DEOPT UNPACKING pc=0x000001fbc23a9ea3 sp=0x000000b9ab8fd9e0 mode 2

Classes unloaded (7 events):
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100218000 'java/lang/invoke/LambdaForm$MH+0x0000000100218000'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100217c00 'java/lang/invoke/LambdaForm$MH+0x0000000100217c00'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100217800 'java/lang/invoke/LambdaForm$MH+0x0000000100217800'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100217400 'java/lang/invoke/LambdaForm$MH+0x0000000100217400'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100217000 'java/lang/invoke/LambdaForm$BMH+0x0000000100217000'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100216c00 'java/lang/invoke/LambdaForm$DMH+0x0000000100216c00'
Event: 3.599 Thread 0x000001fbcc71ab70 Unloading class 0x0000000100214000 'java/lang/invoke/LambdaForm$DMH+0x0000000100214000'

Classes redefined (0 events):
No events

Internal exceptions (20 events):
Event: 46.936 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eac41660}> (0x00000000eac41660) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 63.387 Thread 0x000001fbd2acc370 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eacffec0}> (0x00000000eacffec0) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 63.612 Thread 0x000001fbd35a7570 Exception <a 'sun/nio/fs/WindowsException'{0x00000000ead18f80}> (0x00000000ead18f80) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 63.754 Thread 0x000001fbd35a70a0 Implicit null exception at 0x000001fbc2e40d4d to 0x000001fbc2e41708
Event: 63.884 Thread 0x000001fbd2acbea0 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eaba1b88}> (0x00000000eaba1b88) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 65.034 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eac812e0}> (0x00000000eac812e0) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 93.247 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eac5ac60}> (0x00000000eac5ac60) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 93.573 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eac008c8}> (0x00000000eac008c8) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 95.370 Thread 0x000001fbd2ac9820 Implicit null exception at 0x000001fbc2e977b7 to 0x000001fbc2e98bb0
Event: 102.294 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eab33a98}> (0x00000000eab33a98) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 102.501 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eac5f000}> (0x00000000eac5f000) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 103.084 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eab03568}> (0x00000000eab03568) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 190.207 Thread 0x000001fbd2ac9820 Exception <a 'sun/nio/fs/WindowsException'{0x00000000eabbeea8}> (0x00000000eabbeea8) 
thrown [s\src\hotspot\share\prims\jni.cpp, line 516]
Event: 224.901 Thread 0x000001fbd35a53c0 Implicit null exception at 0x000001fbc2e8f293 to 0x000001fbc2e8f719
Event: 225.005 Thread 0x000001fbd35a53c0 Implicit null exception at 0x000001fbc2ee91d3 to 0x000001fbc2ee9324
Event: 225.153 Thread 0x000001fbd35a53c0 Exception <a 'java/lang/NoSuchMethodError'{0x00000000eac51400}: 'void java.lang.invoke.DirectMethodHandle$Holder.invokeSpecial(java.lang.Object, java.lang.Object, int)'> (0x00000000eac51400) 
thrown [s\src\hotspot\share\interpreter\linkResolver.cpp, line 759]
Event: 225.547 Thread 0x000001fbd35a53c0 Exception <a 'java/lang/NoSuchMethodError'{0x00000000eab73938}: 'java.lang.Object java.lang.invoke.DirectMethodHandle$Holder.invokeSpecial(java.lang.Object, java.lang.Object, long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)'> (0x00000000eab73938) 
thrown [s\src\hotspot\share\interpreter\linkResolver.cpp, line 759]
Event: 225.622 Thread 0x000001fbd35a53c0 Exception <a 'java/lang/NoSuchMethodError'{0x00000000eab78370}: 'java.lang.Object java.lang.invoke.DelegatingMethodHandle$Holder.reinvoke_L(java.lang.Object, long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)'> (0x00000000eab78370) 
thrown [s\src\hotspot\share\interpreter\linkResolver.cpp, line 759]
Event: 225.652 Thread 0x000001fbd35a53c0 Exception <a 'java/lang/NoSuchMethodError'{0x00000000eaba7360}: 'java.lang.Object java.lang.invoke.DirectMethodHandle$Holder.invokeSpecial(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)'> (0x00000000eaba7360) 
thrown [s\src\hotspot\share\interpreter\linkResolver.cpp, line 759]
Event: 225.652 Thread 0x000001fbd35a53c0 Exception <a 'java/lang/NoSuchMethodError'{0x00000000eababd70}: 'java.lang.Object java.lang.invoke.Invokers$Holder.linkToTargetMethod(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)'> (0x00000000eababd70) 
thrown [s\src\hotspot\share\interpreter\linkResolver.cpp, line 759]

VM Operations (20 events):
Event: 224.350 Executing VM operation: ParallelGCFailedAllocation
Event: 224.362 Executing VM operation: ParallelGCFailedAllocation done
Event: 224.531 Executing VM operation: ParallelGCFailedAllocation
Event: 224.540 Executing VM operation: ParallelGCFailedAllocation done
Event: 224.600 Executing VM operation: HandshakeAllThreads
Event: 224.600 Executing VM operation: HandshakeAllThreads done
Event: 224.676 Executing VM operation: ParallelGCFailedAllocation
Event: 224.681 Executing VM operation: ParallelGCFailedAllocation done
Event: 224.699 Executing VM operation: HandshakeAllThreads
Event: 224.699 Executing VM operation: HandshakeAllThreads done
Event: 224.931 Executing VM operation: ParallelGCFailedAllocation
Event: 224.937 Executing VM operation: ParallelGCFailedAllocation done
Event: 225.049 Executing VM operation: ParallelGCFailedAllocation
Event: 225.057 Executing VM operation: ParallelGCFailedAllocation done
Event: 225.086 Executing VM operation: HandshakeAllThreads
Event: 225.086 Executing VM operation: HandshakeAllThreads done
Event: 225.172 Executing VM operation: ParallelGCFailedAllocation
Event: 225.179 Executing VM operation: ParallelGCFailedAllocation done
Event: 225.438 Executing VM operation: ParallelGCFailedAllocation
Event: 225.454 Executing VM operation: ParallelGCFailedAllocation done

Events (20 events):
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbc8b710
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcac610
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcad510
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcada90
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcae610
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcb1a10
Event: 215.121 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbccc010
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbcda110
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbd0b310
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbd11190
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbd39c90
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbd6c010
Event: 215.122 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbd9e690
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbdb8e10
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbdba590
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbdbf990
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbdc3f10
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbdc6010
Event: 215.123 Thread 0x000001fbd1988070 flushing nmethod 0x000001fbbbea6510
Event: 224.279 Thread 0x000001fbd35a70a0 Thread added: 0x000001fbd35a70a0


Dynamic libraries:
0x00007ff76f390000 - 0x00007ff76f39e000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\java.exe
0x00007fff24e90000 - 0x00007fff250a4000 	C:\WINDOWS\SYSTEM32\ntdll.dll
0x00007fff23c10000 - 0x00007fff23cd4000 	C:\WINDOWS\System32\KERNEL32.DLL
0x00007fff22390000 - 0x00007fff22734000 	C:\WINDOWS\System32\KERNELBASE.dll
0x00007fff22270000 - 0x00007fff22381000 	C:\WINDOWS\System32\ucrtbase.dll
0x00007fff1bf90000 - 0x00007fff1bfa7000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\jli.dll
0x00007fff24590000 - 0x00007fff2473a000 	C:\WINDOWS\System32\USER32.dll
0x00007fff22a40000 - 0x00007fff22a66000 	C:\WINDOWS\System32\win32u.dll
0x00007fff23e10000 - 0x00007fff23e39000 	C:\WINDOWS\System32\GDI32.dll
0x00007fff22800000 - 0x00007fff22919000 	C:\WINDOWS\System32\gdi32full.dll
0x00007fff229a0000 - 0x00007fff22a3a000 	C:\WINDOWS\System32\msvcp_win.dll
0x00007fff11d80000 - 0x00007fff11d99000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\VCRUNTIME140.dll
0x00007ffeff610000 - 0x00007ffeff89f000 	C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.22621.2070_none_2713e6537381f706\COMCTL32.dll
0x00007fff23d60000 - 0x00007fff23e07000 	C:\WINDOWS\System32\msvcrt.dll
0x00007fff23490000 - 0x00007fff234c1000 	C:\WINDOWS\System32\IMM32.DLL
0x00007fff1d3e0000 - 0x00007fff1d3ec000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\vcruntime140_1.dll
0x00007fff053b0000 - 0x00007fff05441000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\msvcp140.dll
0x00007ffe90fc0000 - 0x00007ffe91c08000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\server\jvm.dll
0x00007fff24aa0000 - 0x00007fff24b50000 	C:\WINDOWS\System32\ADVAPI32.dll
0x00007fff247b0000 - 0x00007fff24856000 	C:\WINDOWS\System32\sechost.dll
0x00007fff23ed0000 - 0x00007fff23fe7000 	C:\WINDOWS\System32\RPCRT4.dll
0x00007ffed20f0000 - 0x00007ffed20f9000 	C:\WINDOWS\SYSTEM32\WSOCK32.dll
0x00007fff1aec0000 - 0x00007fff1aeca000 	C:\WINDOWS\SYSTEM32\VERSION.dll
0x00007fff1a830000 - 0x00007fff1a864000 	C:\WINDOWS\SYSTEM32\WINMM.dll
0x00007fff234d0000 - 0x00007fff23541000 	C:\WINDOWS\System32\WS2_32.dll
0x00007fff21260000 - 0x00007fff21278000 	C:\WINDOWS\SYSTEM32\kernel.appcore.dll
0x00007fff1d2e0000 - 0x00007fff1d2ea000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\jimage.dll
0x00007fff1fbd0000 - 0x00007fff1fdfe000 	C:\WINDOWS\SYSTEM32\DBGHELP.DLL
0x00007fff24000000 - 0x00007fff2438a000 	C:\WINDOWS\System32\combase.dll
0x00007fff24960000 - 0x00007fff24a37000 	C:\WINDOWS\System32\OLEAUT32.dll
0x00007fff0b140000 - 0x00007fff0b172000 	C:\WINDOWS\SYSTEM32\dbgcore.DLL
0x00007fff22920000 - 0x00007fff2299a000 	C:\WINDOWS\System32\bcryptPrimitives.dll
0x00007fff11c60000 - 0x00007fff11c6e000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\instrument.dll
0x00007fff0ac80000 - 0x00007fff0aca5000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\java.dll
0x00007fff11c90000 - 0x00007fff11ca8000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\zip.dll
0x00007fff22c70000 - 0x00007fff23486000 	C:\WINDOWS\System32\SHELL32.dll
0x00007fff20240000 - 0x00007fff20b2a000 	C:\WINDOWS\SYSTEM32\windows.storage.dll
0x00007fff20100000 - 0x00007fff2023e000 	C:\WINDOWS\SYSTEM32\wintypes.dll
0x00007fff24ca0000 - 0x00007fff24d93000 	C:\WINDOWS\System32\SHCORE.dll
0x00007fff24a40000 - 0x00007fff24a9e000 	C:\WINDOWS\System32\shlwapi.dll
0x00007fff221a0000 - 0x00007fff221c6000 	C:\WINDOWS\SYSTEM32\profapi.dll
0x00007fff111c0000 - 0x00007fff111d9000 	C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\net.dll
0x00007fff1aba0000 - 0x00007fff1acd7000 	C:\WINDOWS\SYSTEM32\WINHTTP.dll
0x00007fff21730000 - 0x00007fff21799000 	C:\WINDOWS\system32\mswsock.dll
0x00007fff11170000 - 0x00007fff11185000 	C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\nio.dll
0x00007fff11c10000 - 0x00007fff11c20000 	c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\verify.dll
0x00007fff05780000 - 0x00007fff057be000 	C:\Users\JO\AppData\Roaming\Code\User\globalStorage\redhat.java\1.21.0\config_win\org.eclipse.equinox.launcher\org.eclipse.equinox.launcher.win32.win32.x86_64_1.2.700.v20221108-1024\eclipse_11801.dll
0x00007fff24390000 - 0x00007fff2452c000 	C:\WINDOWS\System32\ole32.dll
0x00007fff111a0000 - 0x00007fff111a9000 	C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\management.dll
0x00007fff10db0000 - 0x00007fff10dbb000 	C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\management_ext.dll
0x00007fff23b90000 - 0x00007fff23b98000 	C:\WINDOWS\System32\PSAPI.DLL
0x00007fff21980000 - 0x00007fff2199b000 	C:\WINDOWS\SYSTEM32\CRYPTSP.dll
0x00007fff21220000 - 0x00007fff21255000 	C:\WINDOWS\system32\rsaenh.dll
0x00007fff21820000 - 0x00007fff2184c000 	C:\WINDOWS\SYSTEM32\USERENV.dll
0x00007fff21b40000 - 0x00007fff21b68000 	C:\WINDOWS\SYSTEM32\bcrypt.dll
0x00007fff219a0000 - 0x00007fff219ac000 	C:\WINDOWS\SYSTEM32\CRYPTBASE.dll
0x00007fff20d90000 - 0x00007fff20dbd000 	C:\WINDOWS\SYSTEM32\IPHLPAPI.DLL
0x00007fff24580000 - 0x00007fff24589000 	C:\WINDOWS\System32\NSI.dll
0x00007fff1a780000 - 0x00007fff1a799000 	C:\WINDOWS\SYSTEM32\dhcpcsvc6.DLL
0x00007fff1a760000 - 0x00007fff1a77f000 	C:\WINDOWS\SYSTEM32\dhcpcsvc.DLL
0x00007fff20e00000 - 0x00007fff20ef3000 	C:\WINDOWS\SYSTEM32\DNSAPI.dll
0x00007fff05090000 - 0x00007fff050d5000 	C:\Users\JO\AppData\Local\Temp\jna--1422960055\jna12498770445576905942.dll
0x00007fff0fbf0000 - 0x00007fff0fbfe000 	C:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\sunmscapi.dll
0x00007fff22ae0000 - 0x00007fff22c47000 	C:\WINDOWS\System32\CRYPT32.dll
0x00007fff21b10000 - 0x00007fff21b3e000 	C:\WINDOWS\SYSTEM32\ncrypt.dll
0x00007fff21ad0000 - 0x00007fff21b07000 	C:\WINDOWS\SYSTEM32\NTASN1.dll

dbghelp: loaded successfully - version: 4.0.5 - missing functions: none
symbol engine: initialized successfully - sym options: 0x614 - pdb path: .;c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin;C:\WINDOWS\SYSTEM32;C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.22621.2070_none_2713e6537381f706;c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\jre\17.0.7-win32-x86_64\bin\server;C:\Users\JO\AppData\Roaming\Code\User\globalStorage\redhat.java\1.21.0\config_win\org.eclipse.equinox.launcher\org.eclipse.equinox.launcher.win32.win32.x86_64_1.2.700.v20221108-1024;C:\Users\JO\AppData\Local\Temp\jna--1422960055

VM Arguments:
jvm_args: --add-modules=ALL-SYSTEM --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/sun.nio.fs=ALL-UNNAMED -Declipse.application=org.eclipse.jdt.ls.core.id1 -Dosgi.bundles.defaultStartLevel=4 -Declipse.product=org.eclipse.jdt.ls.core.product -Djava.import.generatesMetadataFilesAtProjectRoot=false -Dfile.encoding=utf8 -XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx1G -Xms100m -Xlog:disable -javaagent:c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\lombok\lombok-1.18.28.jar -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=c:\Users\JO\AppData\Roaming\Code\User\workspaceStorage\038773b738e5197abaf7b6006abb9ad6\redhat.java -Daether.dependencyCollector.impl=bf 
java_command: c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\server\plugins\org.eclipse.equinox.launcher_1.6.500.v20230717-2134.jar -configuration c:\Users\JO\AppData\Roaming\Code\User\globalStorage\redhat.java\1.21.0\config_win -data c:\Users\JO\AppData\Roaming\Code\User\workspaceStorage\038773b738e5197abaf7b6006abb9ad6\redhat.java\jdt_ws
java_class_path (initial): c:\Users\JO\.vscode\extensions\redhat.java-1.21.0-win32-x64\server\plugins\org.eclipse.equinox.launcher_1.6.500.v20230717-2134.jar
Launcher Type: SUN_STANDARD

[Global flags]
    uintx AdaptiveSizePolicyWeight                 = 90                                        {product} {command line}
     intx CICompilerCount                          = 3                                         {product} {ergonomic}
    uintx GCTimeRatio                              = 4                                         {product} {command line}
     bool HeapDumpOnOutOfMemoryError               = true                                   {manageable} {command line}
    ccstr HeapDumpPath                             = c:\Users\JO\AppData\Roaming\Code\User\workspaceStorage\038773b738e5197abaf7b6006abb9ad6\redhat.java         {manageable} {command line}
   size_t InitialHeapSize                          = 104857600                                 {product} {command line}
   size_t MaxHeapSize                              = 1073741824                                {product} {command line}
   size_t MaxNewSize                               = 357564416                                 {product} {ergonomic}
   size_t MinHeapDeltaBytes                        = 524288                                    {product} {ergonomic}
   size_t MinHeapSize                              = 104857600                                 {product} {command line}
   size_t NewSize                                  = 34603008                                  {product} {ergonomic}
    uintx NonNMethodCodeHeapSize                   = 5832780                                {pd product} {ergonomic}
    uintx NonProfiledCodeHeapSize                  = 122912730                              {pd product} {ergonomic}
   size_t OldSize                                  = 70254592                                  {product} {ergonomic}
    uintx ProfiledCodeHeapSize                     = 122912730                              {pd product} {ergonomic}
    uintx ReservedCodeCacheSize                    = 251658240                              {pd product} {ergonomic}
     bool SegmentedCodeCache                       = true                                      {product} {ergonomic}
   size_t SoftMaxHeapSize                          = 1073741824                             {manageable} {ergonomic}
     bool UseCompressedClassPointers               = true                           {product lp64_product} {ergonomic}
     bool UseCompressedOops                        = true                           {product lp64_product} {ergonomic}
     bool UseLargePagesIndividualAllocation        = false                                  {pd product} {ergonomic}
     bool UseParallelGC                            = true                                      {product} {command line}

Logging:
Log output configuration:
 #0: stdout all=off uptime,level,tags
 #1: stderr all=off uptime,level,tags

Environment Variables:
PATH=C:\Python311\Scripts\;C:\Python311\;C:\oraclexe\app\oracle\product\10.2.0\server\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\MinGW\bin;C:\Program Files\Java\jdk-16.0.2\bin;C:\Program Files\dotnet\;C:\Program Files\nodejs\;C:\ProgramData\chocolatey\bin;C:\Program Files\Java\jdk-16.0.2\bin;C:\Program Files\Git\cmd;C:\Users\JO\AppData\Local\Microsoft\WindowsApps;C:\Users\JO\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\JO\AppData\Roaming\npm;C:\Users\JO\AppData\Local\GitHubDesktop\bin
USERNAME=Ashutoshpandey21
OS=Windows_NT
PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 126 Stepping 5, GenuineIntel
TMP=C:\Users\JO\AppData\Local\Temp
TEMP=C:\Users\JO\AppData\Local\Temp



---------------  S Y S T E M  ---------------

OS:
 Windows 11 , 64 bit Build 22621 (10.0.22621.2070)
OS uptime: 3 days 21:25 hours

CPU: total 4 (initial active 4) (2 cores per cpu, 2 threads per core) family 6 model 126 stepping 5 microcode 0xb8, cx8, cmov, fxsr, ht, mmx, 3dnowpref, sse, sse2, sse3, ssse3, sse4.1, sse4.2, popcnt, lzcnt, tsc, tscinvbit, avx, avx2, aes, erms, clmul, bmi1, bmi2, adx, avx512f, avx512dq, avx512cd, avx512bw, avx512vl, sha, fma, vzeroupper, avx512_vpopcntdq, avx512_vpclmulqdq, avx512_vaes, avx512_vnni, clflush, clflushopt, avx512_vbmi2, avx512_vbmi

Memory: 4k page, system-wide physical 3863M (41M free)
TotalPageFile size 15639M (AvailPageFile size 3M)
current process WorkingSet (physical memory assigned to process): 180M, peak: 515M
current process commit charge ("private bytes"): 640M, peak: 663M

vm_info: OpenJDK 64-Bit Server VM (17.0.7+7) for windows-amd64 JRE (17.0.7+7), built on Apr 18 2023 22:10:42 by "temurin" with MS VC++ 16.7 (VS2019)

END.
