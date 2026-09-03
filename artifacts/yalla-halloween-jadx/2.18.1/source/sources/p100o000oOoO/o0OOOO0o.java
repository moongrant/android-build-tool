package p100o000oOoO;

import io.agora.rtc.Constants;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.oOO00O;
import p047Oooooo0.oo00o;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {134, 138, Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class o0OOOO0o extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public oOO00O f29651Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Set f29652Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Function1 f29653Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Channel f29654Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Object> f29655OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f29656OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Object f29657OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public /* synthetic */ Object f29658OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Set<Object> f29659Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Set<Object> set) {
            super(1);
            this.f29659Oooo0o = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f29659Oooo0o.add(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Set<? extends Object>, oo00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Channel<Set<Object>> f29660Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Channel<Set<Object>> channel) {
            super(2);
            this.f29660Oooo0o = channel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, oo00o oo00oVar) {
            Set<? extends Object> changed = set;
            Intrinsics.checkNotNullParameter(changed, "changed");
            Intrinsics.checkNotNullParameter(oo00oVar, "<anonymous parameter 1>");
            this.f29660Oooo0o.mo2017trySendJP2dKIU(changed);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(Function0<Object> function0, Continuation<? super o0OOOO0o> continuation) {
        super(2, continuation);
        this.f29655OoooO = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OOOO0o o0oooo0o2 = new o0OOOO0o(this.f29655OoooO, continuation);
        o0oooo0o2.f29658OoooO0O = obj;
        return o0oooo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((o0OOOO0o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:2: B:50:0x00f9->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff A[Catch: all -> 0x0159, TryCatch #3 {all -> 0x0159, blocks: (B:11:0x002a, B:33:0x00c2, B:35:0x00c8, B:37:0x00d2, B:60:0x0112, B:30:0x00ad, B:63:0x0120, B:67:0x0138, B:69:0x0141, B:80:0x0162, B:81:0x0165, B:40:0x00d9, B:41:0x00dd, B:43:0x00e3, B:46:0x00ee, B:49:0x00f5, B:50:0x00f9, B:52:0x00ff, B:14:0x0040, B:21:0x007e, B:25:0x0093, B:87:0x016d, B:88:0x0170, B:64:0x012d, B:66:0x0135, B:77:0x015d, B:78:0x0160, B:65:0x0131, B:22:0x0088, B:24:0x0090, B:84:0x0168, B:85:0x016b), top: B:100:0x000b, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x011e -> B:30:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x013f -> B:30:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0156 -> B:30:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100o000oOoO.o0OOOO0o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
