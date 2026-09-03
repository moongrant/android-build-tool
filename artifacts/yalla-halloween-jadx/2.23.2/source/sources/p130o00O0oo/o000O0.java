package p130o00O0oo;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0<T extends View> implements o000O0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final T f36766OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f36767OooO0O0;

    public o000O0(@NotNull T t, boolean z) {
        this.f36766OooO00o = t;
        this.f36767OooO0O0 = z;
    }

    @Override // p130o00O0oo.o000O0O0
    public final boolean OooO00o() {
        return this.f36767OooO0O0;
    }

    @Override // p130o00O0oo.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull o0000 o0000Var) throws Throwable {
        Object objOooO00o = o000O0O0.OooO00o.OooO00o(this);
        if (objOooO00o == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(o0000Var), 1);
            cancellableContinuationImpl.initCancellability();
            ViewTreeObserver viewTreeObserver = this.f36766OooO00o.getViewTreeObserver();
            o000OO00 o000oo01 = new o000OO00(this, viewTreeObserver, cancellableContinuationImpl);
            viewTreeObserver.addOnPreDrawListener(o000oo01);
            cancellableContinuationImpl.invokeOnCancellation(new o000O(this, viewTreeObserver, o000oo01));
            objOooO00o = cancellableContinuationImpl.getResult();
            if (objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(o0000Var);
            }
        }
        return objOooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000O0) {
            o000O0 o000o0 = (o000O0) obj;
            if (Intrinsics.areEqual(this.f36766OooO00o, o000o0.f36766OooO00o)) {
                if (this.f36767OooO0O0 == o000o0.f36767OooO0O0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p130o00O0oo.o000O0O0
    @NotNull
    public final T getView() {
        return this.f36766OooO00o;
    }

    public final int hashCode() {
        return (this.f36766OooO00o.hashCode() * 31) + (this.f36767OooO0O0 ? 1231 : 1237);
    }
}
