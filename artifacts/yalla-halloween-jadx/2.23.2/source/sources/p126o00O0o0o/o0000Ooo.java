package p126o00O0o0o;

import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o000000;
import p130o00O0oo.o000O0Oo;
import p131o00O0oo0.o0OO00O;
import p131o00O0oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements o00000OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f36679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00000OO> f36680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f36681OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f36682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000000 f36683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f36684OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f36685OooO0oO;

    @DebugMetadata(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {25}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0000Ooo f36686OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f36687OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00000OO f36688OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f36690OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36687OooO0o = obj;
            this.f36690OooO0oo |= Integer.MIN_VALUE;
            return o0000Ooo.this.OooO0OO(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0000Ooo(@NotNull coil.request.OooO00o oooO00o, @NotNull List<? extends o00000OO> list, int i, @NotNull coil.request.OooO00o oooO00o2, @NotNull o000O0Oo o000o0oo2, @NotNull o000000 o000000Var, boolean z) {
        this.f36679OooO00o = oooO00o;
        this.f36680OooO0O0 = list;
        this.f36681OooO0OO = i;
        this.f36682OooO0Oo = oooO00o2;
        this.f36684OooO0o0 = o000o0oo2;
        this.f36683OooO0o = o000000Var;
        this.f36685OooO0oO = z;
    }

    @Override // o00O0o0o.o00000OO.OooO00o
    @NotNull
    public final coil.request.OooO00o OooO00o() {
        return this.f36682OooO0Oo;
    }

    public final void OooO0O0(coil.request.OooO00o oooO00o, o00000OO o00000oo2) {
        Context context = oooO00o.f11639OooO00o;
        coil.request.OooO00o oooO00o2 = this.f36679OooO00o;
        if (!(context == oooO00o2.f11639OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + o00000oo2 + "' cannot modify the request's context.").toString());
        }
        if (!(oooO00o.f11640OooO0O0 != o0OO00O.f36852OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + o00000oo2 + "' cannot set the request's data to null.").toString());
        }
        if (!(oooO00o.f11641OooO0OO == oooO00o2.f11641OooO0OO)) {
            throw new IllegalStateException(("Interceptor '" + o00000oo2 + "' cannot modify the request's target.").toString());
        }
        if (!(oooO00o.f11664OooOoOO == oooO00o2.f11664OooOoOO)) {
            throw new IllegalStateException(("Interceptor '" + o00000oo2 + "' cannot modify the request's lifecycle.").toString());
        }
        if (oooO00o.f11666OooOoo0 == oooO00o2.f11666OooOoo0) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + o00000oo2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o0Oo0oo> continuation) {
        OooO00o oooO00o2;
        o0000Ooo o0000ooo;
        o00000OO o00000oo2;
        if (continuation instanceof OooO00o) {
            oooO00o2 = (OooO00o) continuation;
            int i = oooO00o2.f36690OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o2.f36690OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o2 = new OooO00o(continuation);
            }
        } else {
            oooO00o2 = new OooO00o(continuation);
        }
        Object obj = oooO00o2.f36687OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f36690OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<o00000OO> list = this.f36680OooO0O0;
            int i3 = this.f36681OooO0OO;
            if (i3 > 0) {
                OooO0O0(oooO00o, list.get(i3 - 1));
            }
            o00000OO o00000oo3 = list.get(i3);
            o0000Ooo o0000ooo2 = new o0000Ooo(this.f36679OooO00o, this.f36680OooO0O0, i3 + 1, oooO00o, this.f36684OooO0o0, this.f36683OooO0o, this.f36685OooO0oO);
            oooO00o2.f36686OooO0Oo = this;
            oooO00o2.f36688OooO0o0 = o00000oo3;
            oooO00o2.f36690OooO0oo = 1;
            Object objOooO00o = o00000oo3.OooO00o(o0000ooo2, oooO00o2);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0000ooo = this;
            obj = objOooO00o;
            o00000oo2 = o00000oo3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00000oo2 = oooO00o2.f36688OooO0o0;
            o0000ooo = oooO00o2.f36686OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        o0000ooo.OooO0O0(o0oo0oo2.OooO0O0(), o00000oo2);
        return o0oo0oo2;
    }
}
