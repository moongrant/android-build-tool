package oo0o0O0;

import Oooo000.Oooo0;
import android.view.View;
import android.view.ViewTreeObserver;
import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<T extends View> implements OooO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final T f53346OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f53347OooO0Oo;

    public OooO0OO(@NotNull T view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f53346OooO0OO = view;
        this.f53347OooO0Oo = z;
    }

    @Override // oo0o0O0.OooO
    public final boolean OooO00o() {
        return this.f53347OooO0Oo;
    }

    @Override // oo0o0O0.OooO0o
    @Nullable
    public final Object OooO0O0(@NotNull Continuation<? super Size> continuation) {
        Object objOooO0OO = OooO.OooO00o.OooO0OO(this);
        if (objOooO0OO == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            ViewTreeObserver viewTreeObserver = this.f53346OooO0OO.getViewTreeObserver();
            OooOO0O oooOO0O = new OooOO0O(this, viewTreeObserver, cancellableContinuationImpl);
            viewTreeObserver.addOnPreDrawListener(oooOO0O);
            cancellableContinuationImpl.invokeOnCancellation(new OooOO0(this, viewTreeObserver, oooOO0O));
            objOooO0OO = cancellableContinuationImpl.getResult();
            if (objOooO0OO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return objOooO0OO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (Intrinsics.areEqual(this.f53346OooO0OO, oooO0OO.f53346OooO0OO) && this.f53347OooO0Oo == oooO0OO.f53347OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    @Override // oo0o0O0.OooO
    @NotNull
    public final T getView() {
        return this.f53346OooO0OO;
    }

    public final int hashCode() {
        return (this.f53346OooO0OO.hashCode() * 31) + (this.f53347OooO0Oo ? 1231 : 1237);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RealViewSizeResolver(view=");
        sbOooO0o0.append(this.f53346OooO0OO);
        sbOooO0o0.append(", subtractPadding=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f53347OooO0Oo, ')');
    }
}
