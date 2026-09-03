package p472o0OoooO;

import java.util.Objects;
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
import p469o0Oooo.o00oO0o;
import p469o0Oooo.o0OOO0o;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO extends o0OOO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final LinkedBlockingQueue<OooO0O0> f40636Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o00oO0o f40637OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f40638OoooO00;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f40640Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooO0O0 oooO0O0) {
            super(0);
            this.f40640Oooo0oO = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o = o0O0ooO.OooO0o(o0O0ooO.this, this.f40640Oooo0oO);
            if (strOooO0o == null) {
                strOooO0o = "Pulse Exception";
            }
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public interface OooO00o {
        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(@NotNull String str);

        void OooO0o(@NotNull String str);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f40641OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Object f40642OooO0O0;

        public OooO0O0(int i, @Nullable Object obj) {
            this.f40641OooO00o = i;
            this.f40642OooO0O0 = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f40641OooO00o == oooO0O0.f40641OooO00o && Intrinsics.areEqual(this.f40642OooO0O0, oooO0O0.f40642OooO0O0);
        }

        public final int hashCode() {
            int i = this.f40641OooO00o * 31;
            Object obj = this.f40642OooO0O0;
            return i + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LongLinkEvent(action=");
            sbOooO0o0.append(this.f40641OooO00o);
            sbOooO0o0.append(", extra=");
            sbOooO0o0.append(this.f40642OooO0O0);
            sbOooO0o0.append(")");
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f40644Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f40644Oooo0oO = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o = o0O0ooO.OooO0o(o0O0ooO.this, this.f40644Oooo0oO);
            if (strOooO0o == null) {
                strOooO0o = "Reader Exception";
            }
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f40646Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO0O0 oooO0O0) {
            super(0);
            this.f40646Oooo0oO = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o = o0O0ooO.OooO0o(o0O0ooO.this, this.f40646Oooo0oO);
            if (strOooO0o == null) {
                strOooO0o = "Writer Exception";
            }
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(strOooO0o);
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
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f40649Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(OooO0O0 oooO0O0) {
            super(0);
            this.f40649Oooo0oO = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o = o0O0ooO.OooO0o(o0O0ooO.this, this.f40649Oooo0oO);
            if (strOooO0o == null) {
                strOooO0o = "Connect Failed";
            }
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0o(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.support.longlink.event.EventDispatcher$toMainThread$1", f = "EventDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public CoroutineScope f40650Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0 f40651Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f40651Oooo0oO = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            OooOOO oooOOO = new OooOOO(this.f40651Oooo0oO, completion);
            oooOOO.f40650Oooo0o = (CoroutineScope) obj;
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
            this.f40651Oooo0oO.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooO00o oooO00o = o0O0ooO.this.f40638OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public o0O0ooO(@NotNull o00oO0o config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f40637OoooO0 = config;
        this.f40636Oooo = new LinkedBlockingQueue<>();
    }

    public static final String OooO0o(o0O0ooO o0o0ooo, OooO0O0 oooO0O0) {
        Objects.requireNonNull(o0o0ooo);
        Object obj = oooO0O0.f40642OooO0O0;
        return obj instanceof Throwable ? ((Throwable) obj).getMessage() : String.valueOf(obj);
    }

    public final void OooO(Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooOOO(function0, null), 2, null);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0O0() {
        o00Ooo.OooO00o(this.f40637OoooO0.f40584OooO0Oo).OooO00o("EventDispatcher end", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0OO() {
        o00Ooo.OooO00o(this.f40637OoooO0.f40584OooO0Oo).OooO00o("EventDispatcher start", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0o0() {
        try {
            OooO0O0 event = this.f40636Oooo.take();
            Intrinsics.checkNotNullExpressionValue(event, "event");
            OooO0oo(event);
        } catch (Throwable th) {
            o00Ooo.OooO00o(this.f40637OoooO0.f40584OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0oO(@NotNull OooO0O0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(this.f40637OoooO0.f40584OooO0Oo);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Method enqueue,is closed = ");
        sbOooO0o0.append(this.f40603Oooo0o);
        sbOooO0o0.append(", event = ");
        sbOooO0o0.append(event.f40641OooO00o);
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        if (this.f40603Oooo0o) {
            return;
        }
        this.f40636Oooo.offer(event);
    }

    public final void OooO0oo(OooO0O0 oooO0O0) {
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(this.f40637OoooO0.f40584OooO0Oo);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Method handleEvent, event = ");
        sbOooO0o0.append(oooO0O0.f40641OooO00o);
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        int i = oooO0O0.f40641OooO00o;
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
