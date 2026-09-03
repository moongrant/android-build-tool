package p111o000oooO;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o<T extends View> implements oOO00O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final T f35927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f35928OooO0O0;

    public o00O000o(@NotNull T t, boolean z) {
        this.f35927OooO00o = t;
        this.f35928OooO0O0 = z;
    }

    @Override // p111o000oooO.o00O00O
    @Nullable
    public final Object OooO00o(@NotNull o000O00 o000o01) throws Throwable {
        Object objOooO00o = oOO00O.OooO00o.OooO00o(this);
        if (objOooO00o == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(o000o01), 1);
            cancellableContinuationImpl.initCancellability();
            ViewTreeObserver viewTreeObserver = this.f35927OooO00o.getViewTreeObserver();
            o00O00o0 o00o00o1 = new o00O00o0(this, viewTreeObserver, cancellableContinuationImpl);
            viewTreeObserver.addOnPreDrawListener(o00o00o1);
            cancellableContinuationImpl.invokeOnCancellation(new o00O00OO(this, viewTreeObserver, o00o00o1));
            objOooO00o = cancellableContinuationImpl.getResult();
            if (objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(o000o01);
            }
        }
        return objOooO00o;
    }

    @Override // p111o000oooO.oOO00O
    public final boolean OooO0O0() {
        return this.f35928OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O000o) {
            o00O000o o00o000o2 = (o00O000o) obj;
            if (Intrinsics.areEqual(this.f35927OooO00o, o00o000o2.f35927OooO00o)) {
                if (this.f35928OooO0O0 == o00o000o2.f35928OooO0O0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p111o000oooO.oOO00O
    @NotNull
    public final T getView() {
        return this.f35927OooO00o;
    }

    public final int hashCode() {
        return (this.f35927OooO00o.hashCode() * 31) + (this.f35928OooO0O0 ? 1231 : 1237);
    }
}
