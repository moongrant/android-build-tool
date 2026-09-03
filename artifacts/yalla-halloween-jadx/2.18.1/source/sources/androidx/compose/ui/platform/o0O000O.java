package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {116, 122}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class o0O000O extends SuspendLambda implements Function2<FlowCollector<? super Float>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f6572Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ChannelIterator f6573Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f6574Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f6575Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Context f6576OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f6577OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Uri f6578OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Channel<Unit> f6579OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(ContentResolver contentResolver, Uri uri, o0OoOoOo o0oooooo2, Channel<Unit> channel, Context context, Continuation<? super o0O000O> continuation) {
        super(2, continuation);
        this.f6572Oooo = contentResolver;
        this.f6578OoooO00 = uri;
        this.f6577OoooO0 = o0oooooo2;
        this.f6579OoooO0O = channel;
        this.f6576OoooO = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0O000O o0o000o = new o0O000O(this.f6572Oooo, this.f6578OoooO00, this.f6577OoooO0, this.f6579OoooO0O, this.f6576OoooO, continuation);
        o0o000o.f6575Oooo0oo = obj;
        return o0o000o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Float> flowCollector, Continuation<? super Unit> continuation) {
        return ((o0O000O) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {all -> 0x0089, blocks: (B:21:0x005a, B:23:0x0062), top: B:39:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0084 -> B:37:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f6574Oooo0oO
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.f6573Oooo0o
            java.lang.Object r4 = r9.f6575Oooo0oo
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L9a
            goto L46
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.f6573Oooo0o
            java.lang.Object r4 = r9.f6575Oooo0oo
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L9a
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L5a
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f6575Oooo0oo
            r4 = r10
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            android.content.ContentResolver r10 = r9.f6572Oooo
            android.net.Uri r1 = r9.f6578OoooO00
            r5 = 0
            androidx.compose.ui.platform.o0OoOoOo r6 = r9.f6577OoooO0
            r10.registerContentObserver(r1, r5, r6)
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r10 = r9.f6579OoooO0O     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> L9a
        L46:
            r10 = r9
        L47:
            r10.f6575Oooo0oo = r4     // Catch: java.lang.Throwable -> L95
            r10.f6573Oooo0o = r1     // Catch: java.lang.Throwable -> L95
            r10.f6574Oooo0oO = r2     // Catch: java.lang.Throwable -> L95
            java.lang.Object r5 = r1.hasNext(r10)     // Catch: java.lang.Throwable -> L95
            if (r5 != r0) goto L54
            return r0
        L54:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L5a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L89
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L8b
            r4.next()     // Catch: java.lang.Throwable -> L89
            android.content.Context r10 = r0.f6576OoooO     // Catch: java.lang.Throwable -> L89
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L89
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)     // Catch: java.lang.Throwable -> L89
            r0.f6575Oooo0oo = r5     // Catch: java.lang.Throwable -> L89
            r0.f6573Oooo0o = r4     // Catch: java.lang.Throwable -> L89
            r0.f6574Oooo0oO = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r10 = r5.emit(r10, r0)     // Catch: java.lang.Throwable -> L89
            if (r10 != r1) goto L84
            return r1
        L84:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L47
        L89:
            r10 = move-exception
            goto L9c
        L8b:
            android.content.ContentResolver r10 = r0.f6572Oooo
            androidx.compose.ui.platform.o0OoOoOo r0 = r0.f6577OoooO0
            r10.unregisterContentObserver(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L95:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9c
        L9a:
            r10 = move-exception
            r0 = r9
        L9c:
            android.content.ContentResolver r1 = r0.f6572Oooo
            androidx.compose.ui.platform.o0OoOoOo r0 = r0.f6577OoooO0
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.o0O000O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
