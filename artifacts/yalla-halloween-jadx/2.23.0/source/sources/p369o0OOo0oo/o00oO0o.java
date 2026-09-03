package p369o0OOo0oo;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0oO.o00Oo0;
import p368o0OOo0oO.o0OoOo0;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0OoOo0 f44012OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<OooO0O0> f44013OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f44014OooO0oo;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f44016OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooO0O0 oooO0O0) {
            super(0);
            this.f44016OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            String strOooO0o = o00oO0o.OooO0o(o00oo0o2, this.f44016OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Pulse Exception";
            }
            OooO00o oooO00o = o00oo0o2.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public interface OooO00o {
        void OooO0O0();

        void OooO0Oo(@NotNull String str);

        void OooO0o(@NotNull String str);

        void OooO0o0();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f44017OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Object f44018OooO0O0;

        public OooO0O0(int i, @Nullable Object obj) {
            this.f44017OooO00o = i;
            this.f44018OooO0O0 = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f44017OooO00o == oooO0O0.f44017OooO00o && Intrinsics.areEqual(this.f44018OooO0O0, oooO0O0.f44018OooO0O0);
        }

        public final int hashCode() {
            int i = this.f44017OooO00o * 31;
            Object obj = this.f44018OooO0O0;
            return i + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "LongLinkEvent(action=" + this.f44017OooO00o + ", extra=" + this.f44018OooO0O0 + ")";
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f44020OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f44020OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            String strOooO0o = o00oO0o.OooO0o(o00oo0o2, this.f44020OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Reader Exception";
            }
            OooO00o oooO00o = o00oo0o2.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f44022OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO0O0 oooO0O0) {
            super(0);
            this.f44022OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            String strOooO0o = o00oO0o.OooO0o(o00oo0o2, this.f44022OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Writer Exception";
            }
            OooO00o oooO00o = o00oo0o2.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooO00o oooO00o = o00oO0o.this.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f44025OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(OooO0O0 oooO0O0) {
            super(0);
            this.f44025OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            String strOooO0o = o00oO0o.OooO0o(o00oo0o2, this.f44025OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Connect Failed";
            }
            OooO00o oooO00o = o00oo0o2.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.support.longlink.event.EventDispatcher$toMainThread$1", f = "EventDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CoroutineScope f44026OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0 f44027OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f44027OooO0o0 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            OooOOO oooOOO = new OooOOO(this.f44027OooO0o0, completion);
            oooOOO.f44026OooO0Oo = (CoroutineScope) obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f44027OooO0o0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooO00o oooO00o = o00oO0o.this.f44014OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public o00oO0o(@NotNull o0OoOo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f44012OooO = config;
        this.f44013OooO0oO = new LinkedBlockingQueue<>();
    }

    public static void OooO(Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooOOO(function0, null), 2, null);
    }

    public static final String OooO0o(o00oO0o o00oo0o2, OooO0O0 oooO0O0) {
        o00oo0o2.getClass();
        Object obj = oooO0O0.f44018OooO0O0;
        return obj instanceof Throwable ? ((Throwable) obj).getMessage() : String.valueOf(obj);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0O0() {
        wc.OooO00o(this.f44012OooO.f43994OooO0Oo).OooO00o("EventDispatcher end", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0OO() {
        wc.OooO00o(this.f44012OooO.f43994OooO0Oo).OooO00o("EventDispatcher start", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0o0() {
        try {
            OooO0O0 event = this.f44013OooO0oO.take();
            Intrinsics.checkNotNullExpressionValue(event, "event");
            OooO0oo(event);
        } catch (Throwable th) {
            wc.OooO00o(this.f44012OooO.f43994OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0oO(@NotNull OooO0O0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        wc.OooO00o(this.f44012OooO.f43994OooO0Oo).OooO00o("Method enqueue,is closed = " + this.f43986OooO0Oo + ", event = " + event.f44017OooO00o, new Object[0]);
        if (this.f43986OooO0Oo) {
            return;
        }
        this.f44013OooO0oO.offer(event);
    }

    public final void OooO0oo(OooO0O0 oooO0O0) {
        wc.OooO00o(this.f44012OooO.f43994OooO0Oo).OooO00o("Method handleEvent, event = " + oooO0O0.f44017OooO00o, new Object[0]);
        int i = oooO0O0.f44017OooO00o;
        if (i == 0) {
            OooO(new OooO0OO(oooO0O0));
            return;
        }
        if (i == 1) {
            OooO(new OooO0o(oooO0O0));
            return;
        }
        if (i == 2) {
            OooO(new OooO(oooO0O0));
            return;
        }
        if (i == 3) {
            OooO(new OooOO0());
        } else if (i == 4) {
            OooO(new OooOO0O(oooO0O0));
        } else {
            if (i != 5) {
                return;
            }
            OooO(new OooOOO0());
        }
    }
}
