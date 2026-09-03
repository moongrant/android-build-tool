package p374o0OOoO0;

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
import p375o0OOoO00.Oooo0;
import p375o0OOoO00.o0OoOo0;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo0 f43191OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<OooO0O0> f43192OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f43193OooO0oo;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f43195OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooO0O0 oooO0O0) {
            super(0);
            this.f43195OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOOO oooOOOO = OooOOOO.this;
            String strOooO0o = OooOOOO.OooO0o(oooOOOO, this.f43195OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Pulse Exception";
            }
            OooO00o oooO00o = oooOOOO.f43193OooO0oo;
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
        public final int f43196OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Object f43197OooO0O0;

        public OooO0O0(int i, @Nullable Object obj) {
            this.f43196OooO00o = i;
            this.f43197OooO0O0 = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f43196OooO00o == oooO0O0.f43196OooO00o && Intrinsics.areEqual(this.f43197OooO0O0, oooO0O0.f43197OooO0O0);
        }

        public final int hashCode() {
            int i = this.f43196OooO00o * 31;
            Object obj = this.f43197OooO0O0;
            return i + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "LongLinkEvent(action=" + this.f43196OooO00o + ", extra=" + this.f43197OooO0O0 + ")";
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f43199OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f43199OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOOO oooOOOO = OooOOOO.this;
            String strOooO0o = OooOOOO.OooO0o(oooOOOO, this.f43199OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Reader Exception";
            }
            OooO00o oooO00o = oooOOOO.f43193OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f43201OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO0O0 oooO0O0) {
            super(0);
            this.f43201OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOOO oooOOOO = OooOOOO.this;
            String strOooO0o = OooOOOO.OooO0o(oooOOOO, this.f43201OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Writer Exception";
            }
            OooO00o oooO00o = oooOOOO.f43193OooO0oo;
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
            OooO00o oooO00o = OooOOOO.this.f43193OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f43204OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(OooO0O0 oooO0O0) {
            super(0);
            this.f43204OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOOOO oooOOOO = OooOOOO.this;
            String strOooO0o = OooOOOO.OooO0o(oooOOOO, this.f43204OooO0o0);
            if (strOooO0o == null) {
                strOooO0o = "Connect Failed";
            }
            OooO00o oooO00o = oooOOOO.f43193OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(strOooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.support.longlink.event.EventDispatcher$toMainThread$1", f = "EventDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CoroutineScope f43205OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0 f43206OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f43206OooO0o0 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            OooOOO oooOOO = new OooOOO(this.f43206OooO0o0, completion);
            oooOOO.f43205OooO0Oo = (CoroutineScope) obj;
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
            this.f43206OooO0o0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooO00o oooO00o = OooOOOO.this.f43193OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public OooOOOO(@NotNull Oooo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43191OooO = config;
        this.f43192OooO0oO = new LinkedBlockingQueue<>();
    }

    public static void OooO(Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooOOO(function0, null), 2, null);
    }

    public static final String OooO0o(OooOOOO oooOOOO, OooO0O0 oooO0O0) {
        oooOOOO.getClass();
        Object obj = oooO0O0.f43197OooO0O0;
        return obj instanceof Throwable ? ((Throwable) obj).getMessage() : String.valueOf(obj);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0O0() {
        oO000O0O.OooO00o(this.f43191OooO.f43211OooO0Oo).OooO00o("EventDispatcher end", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0OO() {
        oO000O0O.OooO00o(this.f43191OooO.f43211OooO0Oo).OooO00o("EventDispatcher start", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0o0() {
        try {
            OooO0O0 event = this.f43192OooO0oO.take();
            Intrinsics.checkNotNullExpressionValue(event, "event");
            OooO0oo(event);
        } catch (Throwable th) {
            oO000O0O.OooO00o(this.f43191OooO.f43211OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0oO(@NotNull OooO0O0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        oO000O0O.OooO00o(this.f43191OooO.f43211OooO0Oo).OooO00o("Method enqueue,is closed = " + this.f43236OooO0Oo + ", event = " + event.f43196OooO00o, new Object[0]);
        if (this.f43236OooO0Oo) {
            return;
        }
        this.f43192OooO0oO.offer(event);
    }

    public final void OooO0oo(OooO0O0 oooO0O0) {
        oO000O0O.OooO00o(this.f43191OooO.f43211OooO0Oo).OooO00o("Method handleEvent, event = " + oooO0O0.f43196OooO00o, new Object[0]);
        int i = oooO0O0.f43196OooO00o;
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
