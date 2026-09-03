package o00O0O00;

import android.content.Context;
import android.graphics.Bitmap;
import coil.size.Size;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO0.OooOOO;
import o00O0OO0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f30455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f30456OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0> f30457OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f30458OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Size f30459OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f30460OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Bitmap f30461OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final oOO00O.OooO0OO f30462OooO0oo;

    @DebugMetadata(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {27}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO0OO f30464Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO0O0 f30465Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f30466Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f30467OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30466Oooo0oo = obj;
            this.f30467OoooO00 |= Integer.MIN_VALUE;
            return OooO0OO.this.OooO0O0(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(@NotNull coil.request.OooO00o initialRequest, int i, @NotNull List<? extends OooO0O0> interceptors, int i2, @NotNull coil.request.OooO00o request, @NotNull Size size, @Nullable Bitmap bitmap, @NotNull oOO00O.OooO0OO eventListener) {
        Intrinsics.checkNotNullParameter(initialRequest, "initialRequest");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f30455OooO00o = initialRequest;
        this.f30456OooO0O0 = i;
        this.f30457OooO0OO = interceptors;
        this.f30458OooO0Oo = i2;
        this.f30460OooO0o0 = request;
        this.f30459OooO0o = size;
        this.f30461OooO0oO = bitmap;
        this.f30462OooO0oo = eventListener;
    }

    public final void OooO00o(coil.request.OooO00o oooO00o, OooO0O0 oooO0O0) {
        Context context = oooO00o.f9876OooO00o;
        coil.request.OooO00o oooO00o2 = this.f30455OooO00o;
        if (!(context == oooO00o2.f9876OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + oooO0O0 + "' cannot modify the request's context.").toString());
        }
        if (!(oooO00o.f9877OooO0O0 != OooOOO.f30583OooO00o)) {
            throw new IllegalStateException(("Interceptor '" + oooO0O0 + "' cannot set the request's data to null.").toString());
        }
        if (!(oooO00o.f9878OooO0OO == oooO00o2.f9878OooO0OO)) {
            throw new IllegalStateException(("Interceptor '" + oooO0O0 + "' cannot modify the request's target.").toString());
        }
        if (!(oooO00o.f9888OooOOO0 == oooO00o2.f9888OooOOO0)) {
            throw new IllegalStateException(("Interceptor '" + oooO0O0 + "' cannot modify the request's lifecycle.").toString());
        }
        if (oooO00o.f9887OooOOO == oooO00o2.f9887OooOOO) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + oooO0O0 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0O0(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super OooOOO0> continuation) {
        OooO00o oooO00o2;
        OooO0O0 oooO0O0;
        OooO0OO oooO0OO;
        if (continuation instanceof OooO00o) {
            oooO00o2 = (OooO00o) continuation;
            int i = oooO00o2.f30467OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o2.f30467OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o2 = new OooO00o(continuation);
            }
        } else {
            oooO00o2 = new OooO00o(continuation);
        }
        Object obj = oooO00o2.f30466Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f30467OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = this.f30458OooO0Oo;
            if (i3 > 0) {
                OooO00o(oooO00o, this.f30457OooO0OO.get(i3 - 1));
            }
            OooO0O0 oooO0O1 = this.f30457OooO0OO.get(this.f30458OooO0Oo);
            OooO0OO oooO0OO2 = new OooO0OO(this.f30455OooO00o, this.f30456OooO0O0, this.f30457OooO0OO, this.f30458OooO0Oo + 1, oooO00o, this.f30459OooO0o, this.f30461OooO0oO, this.f30462OooO0oo);
            oooO00o2.f30464Oooo0o = this;
            oooO00o2.f30465Oooo0oO = oooO0O1;
            oooO00o2.f30467OoooO00 = 1;
            Object objOooO00o = oooO0O1.OooO00o(oooO0OO2, oooO00o2);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0O0 = oooO0O1;
            obj = objOooO00o;
            oooO0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0O0 = oooO00o2.f30465Oooo0oO;
            oooO0OO = oooO00o2.f30464Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        oooO0OO.OooO00o(oooOOO0.OooO0O0(), oooO0O0);
        return oooOOO0;
    }

    @Override // o00O0O00.OooO0O0.OooO00o
    @NotNull
    public final coil.request.OooO00o getRequest() {
        return this.f30460OooO0o0;
    }
}
