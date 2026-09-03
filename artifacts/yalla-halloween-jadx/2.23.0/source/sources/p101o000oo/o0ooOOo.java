package p101o000oo;

import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000O0O;
import p109o000ooo.o00oO0o;
import p111o000oooO.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements o00oO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f35579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00oO0o> f35580OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35581OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f35582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000O0O f35583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O00 f35584OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f35585OooO0oO;

    @DebugMetadata(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {25}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0ooOOo f35586OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f35587OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00oO0o f35588OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35590OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35587OooO0o = obj;
            this.f35590OooO0oo |= Integer.MIN_VALUE;
            return o0ooOOo.this.OooO0OO(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0ooOOo(@NotNull coil.request.OooO00o oooO00o, @NotNull List<? extends o00oO0o> list, int i, @NotNull coil.request.OooO00o oooO00o2, @NotNull o00O00 o00o01, @NotNull o0000O0O o0000o0o2, boolean z) {
        this.f35579OooO00o = oooO00o;
        this.f35580OooO0O0 = list;
        this.f35581OooO0OO = i;
        this.f35582OooO0Oo = oooO00o2;
        this.f35584OooO0o0 = o00o01;
        this.f35583OooO0o = o0000o0o2;
        this.f35585OooO0oO = z;
    }

    @Override // o000oo.o00oO0o.OooO00o
    @NotNull
    public final coil.request.OooO00o OooO00o() {
        return this.f35582OooO0Oo;
    }

    public final void OooO0O0(coil.request.OooO00o oooO00o, o00oO0o o00oo0o2) {
        Context context = oooO00o.f8549OooO00o;
        coil.request.OooO00o oooO00o2 = this.f35579OooO00o;
        if (!(context == oooO00o2.f8549OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + o00oo0o2 + "' cannot modify the request's context.").toString());
        }
        if (!(oooO00o.f8550OooO0O0 != p109o000ooo.o0ooOOo.f35892OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + o00oo0o2 + "' cannot set the request's data to null.").toString());
        }
        if (!(oooO00o.f8551OooO0OO == oooO00o2.f8551OooO0OO)) {
            throw new IllegalStateException(("Interceptor '" + o00oo0o2 + "' cannot modify the request's target.").toString());
        }
        if (!(oooO00o.f8574OooOoOO == oooO00o2.f8574OooOoOO)) {
            throw new IllegalStateException(("Interceptor '" + o00oo0o2 + "' cannot modify the request's lifecycle.").toString());
        }
        if (oooO00o.f8576OooOoo0 == oooO00o2.f8576OooOoo0) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + o00oo0o2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o00oO0o> continuation) {
        OooO00o oooO00o2;
        o0ooOOo o0ooooo;
        o00oO0o o00oo0o2;
        if (continuation instanceof OooO00o) {
            oooO00o2 = (OooO00o) continuation;
            int i = oooO00o2.f35590OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o2.f35590OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o2 = new OooO00o(continuation);
            }
        } else {
            oooO00o2 = new OooO00o(continuation);
        }
        Object obj = oooO00o2.f35587OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f35590OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<o00oO0o> list = this.f35580OooO0O0;
            int i3 = this.f35581OooO0OO;
            if (i3 > 0) {
                OooO0O0(oooO00o, list.get(i3 - 1));
            }
            o00oO0o o00oo0o3 = list.get(i3);
            o0ooOOo o0ooooo2 = new o0ooOOo(this.f35579OooO00o, this.f35580OooO0O0, i3 + 1, oooO00o, this.f35584OooO0o0, this.f35583OooO0o, this.f35585OooO0oO);
            oooO00o2.f35586OooO0Oo = this;
            oooO00o2.f35588OooO0o0 = o00oo0o3;
            oooO00o2.f35590OooO0oo = 1;
            Object objOooO00o = o00oo0o3.OooO00o(o0ooooo2, oooO00o2);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0ooooo = this;
            obj = objOooO00o;
            o00oo0o2 = o00oo0o3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o2 = oooO00o2.f35588OooO0o0;
            o0ooooo = oooO00o2.f35586OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        o00oO0o o00oo0o4 = (o00oO0o) obj;
        o0ooooo.OooO0O0(o00oo0o4.OooO0O0(), o00oo0o2);
        return o00oo0o4;
    }
}
