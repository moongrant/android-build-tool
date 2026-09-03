package p025Oooo0O0;

import com.qiniu.android.collect.ReportItem;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 {

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {79}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOOO f1491Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1492Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f1493Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1492Oooo0oO = obj;
            this.f1493Oooo0oo |= Integer.MIN_VALUE;
            return o00000O0.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {41, 44, 49}, m = "forEachGesture", n = {"$this$forEachGesture", ReportItem.LogTypeBlock, "currentContext", "$this$forEachGesture", ReportItem.LogTypeBlock, "currentContext", "$this$forEachGesture", ReportItem.LogTypeBlock, "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f1494Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00000 f1495Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Function2 f1496Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public CoroutineContext f1497Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f1498OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1494Oooo = obj;
            this.f1498OoooO00 |= Integer.MIN_VALUE;
            return o00000O0.OooO0O0(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[LOOP:0: B:27:0x0072->B:31:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:26:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object OooO00o(@org.jetbrains.annotations.NotNull p418o0Oo0oo.OooOOO r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof Oooo0O0.o00000O0.OooO00o
            if (r0 == 0) goto L13
            r0 = r8
            Oooo0O0.o00000O0$OooO00o r0 = (Oooo0O0.o00000O0.OooO00o) r0
            int r1 = r0.f1493Oooo0oo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1493Oooo0oo = r1
            goto L18
        L13:
            Oooo0O0.o00000O0$OooO00o r0 = new Oooo0O0.o00000O0$OooO00o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1492Oooo0oO
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1493Oooo0oo
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            o0Oo0oo.OooOOO r7 = r0.f1491Oooo0o
            kotlin.ResultKt.throwOnFailure(r8)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            o0Oo0oo.o00Oo0 r8 = r7.OooOoO0()
            java.util.List<o0Oo0oo.o0Oo0oo> r8 = r8.f39723OooO00o
            int r2 = r8.size()
            r5 = 0
        L47:
            if (r5 >= r2) goto L58
            java.lang.Object r6 = r8.get(r5)
            o0Oo0oo.o0Oo0oo r6 = (p418o0Oo0oo.o0Oo0oo) r6
            boolean r6 = r6.f39745OooO0Oo
            if (r6 == 0) goto L55
            r8 = 1
            goto L59
        L55:
            int r5 = r5 + 1
            goto L47
        L58:
            r8 = 0
        L59:
            r8 = r8 ^ r4
            if (r8 != 0) goto L86
        L5c:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f1491Oooo0o = r7
            r0.f1493Oooo0oo = r4
            java.lang.Object r8 = r7.OooOo0(r8, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            o0Oo0oo.o00Oo0 r8 = (p418o0Oo0oo.o00Oo0) r8
            java.util.List<o0Oo0oo.o0Oo0oo> r8 = r8.f39723OooO00o
            int r2 = r8.size()
            r5 = 0
        L72:
            if (r5 >= r2) goto L83
            java.lang.Object r6 = r8.get(r5)
            o0Oo0oo.o0Oo0oo r6 = (p418o0Oo0oo.o0Oo0oo) r6
            boolean r6 = r6.f39745OooO0Oo
            if (r6 == 0) goto L80
            r8 = 1
            goto L84
        L80:
            int r5 = r5 + 1
            goto L72
        L83:
            r8 = 0
        L84:
            if (r8 != 0) goto L5c
        L86:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o00000O0.OooO00o(o0Oo0oo.OooOOO, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: CancellationException -> 0x008f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:29:0x0072, B:32:0x008a, B:17:0x0044, B:20:0x0050), top: B:50:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r2v12, types: [o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, o0Oo0oo.o00000] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object OooO0O0(@org.jetbrains.annotations.NotNull p418o0Oo0oo.o00000 r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super p418o0Oo0oo.o00000, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof Oooo0O0.o00000O0.OooO0O0
            if (r0 == 0) goto L13
            r0 = r11
            Oooo0O0.o00000O0$OooO0O0 r0 = (Oooo0O0.o00000O0.OooO0O0) r0
            int r1 = r0.f1498OoooO00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1498OoooO00 = r1
            goto L18
        L13:
            Oooo0O0.o00000O0$OooO0O0 r0 = new Oooo0O0.o00000O0$OooO0O0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f1494Oooo
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1498OoooO00
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L54
            if (r2 == r4) goto L4a
            if (r2 == r5) goto L3e
            if (r2 != r6) goto L36
            kotlin.coroutines.CoroutineContext r9 = r0.f1497Oooo0oo
            kotlin.jvm.functions.Function2 r10 = r0.f1496Oooo0oO
            o0Oo0oo.o00000 r2 = r0.f1495Oooo0o
            kotlin.ResultKt.throwOnFailure(r11)
            goto L47
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.coroutines.CoroutineContext r9 = r0.f1497Oooo0oo
            kotlin.jvm.functions.Function2 r10 = r0.f1496Oooo0oO
            o0Oo0oo.o00000 r2 = r0.f1495Oooo0o
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L8f
        L47:
            r11 = r9
            r9 = r2
            goto L5b
        L4a:
            kotlin.coroutines.CoroutineContext r9 = r0.f1497Oooo0oo
            kotlin.jvm.functions.Function2 r10 = r0.f1496Oooo0oO
            o0Oo0oo.o00000 r2 = r0.f1495Oooo0o
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L8f
            goto L72
        L54:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.coroutines.CoroutineContext r11 = r0.get$context()
        L5b:
            boolean r2 = kotlinx.coroutines.JobKt.isActive(r11)
            if (r2 == 0) goto Lba
            r0.f1495Oooo0o = r9     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f1496Oooo0oO = r10     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f1497Oooo0oo = r11     // Catch: java.util.concurrent.CancellationException -> L91
            r0.f1498OoooO00 = r4     // Catch: java.util.concurrent.CancellationException -> L91
            java.lang.Object r2 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L91
            if (r2 != r1) goto L70
            return r1
        L70:
            r2 = r9
            r9 = r11
        L72:
            r0.f1495Oooo0o = r2     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f1496Oooo0oO = r10     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f1497Oooo0oo = r9     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f1498OoooO00 = r5     // Catch: java.util.concurrent.CancellationException -> L8f
            Oooo0O0.o00000 r11 = new Oooo0O0.o00000     // Catch: java.util.concurrent.CancellationException -> L8f
            r11.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L8f
            java.lang.Object r11 = r2.Oooo0OO(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L8f
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.util.concurrent.CancellationException -> L8f
            if (r11 != r7) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L8f
        L8c:
            if (r11 != r1) goto L47
            return r1
        L8f:
            r11 = move-exception
            goto L96
        L91:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r8
        L96:
            boolean r7 = kotlinx.coroutines.JobKt.isActive(r9)
            if (r7 == 0) goto Lb9
            r0.f1495Oooo0o = r2
            r0.f1496Oooo0oO = r10
            r0.f1497Oooo0oo = r9
            r0.f1498OoooO00 = r6
            Oooo0O0.o00000 r11 = new Oooo0O0.o00000
            r11.<init>(r3)
            java.lang.Object r11 = r2.Oooo0OO(r11, r0)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r7) goto Lb4
            goto Lb6
        Lb4:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        Lb6:
            if (r11 != r1) goto L47
            return r1
        Lb9:
            throw r11
        Lba:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o00000O0.OooO0O0(o0Oo0oo.o00000, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
