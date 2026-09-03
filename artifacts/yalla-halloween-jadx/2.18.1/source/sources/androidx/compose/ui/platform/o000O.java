package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
public final class o000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Channel<Unit> f6427Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ReceiveChannel f6428Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ChannelIterator f6429Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f6430Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(Channel<Unit> channel, Continuation<? super o000O> continuation) {
        super(2, continuation);
        this.f6427Oooo = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O(this.f6427Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x003e, B:19:0x0046, B:20:0x004e, B:27:0x0064, B:29:0x0067, B:32:0x0070, B:33:0x0071, B:21:0x004f, B:23:0x005c), top: B:44:0x003e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #3 {, blocks: (B:21:0x004f, B:23:0x005c), top: B:50:0x004f, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x003e, B:19:0x0046, B:20:0x004e, B:27:0x0064, B:29:0x0067, B:32:0x0070, B:33:0x0071, B:21:0x004f, B:23:0x005c), top: B:44:0x003e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0037 -> B:16:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f6430Oooo0oo
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            kotlinx.coroutines.channels.ChannelIterator r1 = r8.f6429Oooo0oO
            kotlinx.coroutines.channels.ReceiveChannel r3 = r8.f6428Oooo0o
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L7a
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L3d
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r3 = r8.f6427Oooo
            kotlinx.coroutines.channels.ChannelIterator r9 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
            r1 = r9
            r9 = r8
        L2a:
            r9.f6428Oooo0o = r3     // Catch: java.lang.Throwable -> L7a
            r9.f6429Oooo0oO = r1     // Catch: java.lang.Throwable -> L7a
            r9.f6430Oooo0oo = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r4 = r1.hasNext(r9)     // Catch: java.lang.Throwable -> L7a
            if (r4 != r0) goto L37
            return r0
        L37:
            r7 = r0
            r0 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L3d:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L78
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r9 == 0) goto L72
            java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L78
            kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = p047Oooooo0.oo0o0O0.f4158OooO0OO     // Catch: java.lang.Throwable -> L78
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicReference<Oooooo0.o00O000> r5 = p047Oooooo0.oo0o0O0.f4155OooO     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L6f
            Oooooo0.o00O000 r5 = (p047Oooooo0.o00O000) r5     // Catch: java.lang.Throwable -> L6f
            java.util.Set<Oooooo0.o0oOOo> r5 = r5.f4068OooO0oo     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            if (r5 == 0) goto L64
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L6f
            r5 = r5 ^ r2
            if (r5 != r2) goto L64
            r6 = 1
        L64:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L6a
            p047Oooooo0.oo0o0O0.OooO00o()     // Catch: java.lang.Throwable -> L78
        L6a:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2a
        L6f:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L72:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L78:
            r9 = move-exception
            goto L7c
        L7a:
            r9 = move-exception
            r4 = r3
        L7c:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.o000O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
