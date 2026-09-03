package oo0o0O0;

import android.view.View;
import android.view.ViewTreeObserver;
import coil.size.PixelSize;
import coil.size.Size;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Size> f53352Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f53353Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO<View> f53354Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f53355Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(OooO<View> oooO, ViewTreeObserver viewTreeObserver, CancellableContinuation<? super Size> cancellableContinuation) {
        this.f53354Oooo0oO = oooO;
        this.f53355Oooo0oo = viewTreeObserver;
        this.f53352Oooo = cancellableContinuation;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PixelSize pixelSizeOooO0OO = OooO.OooO00o.OooO0OO(this.f53354Oooo0oO);
        if (pixelSizeOooO0OO != null) {
            OooO<View> oooO = this.f53354Oooo0oO;
            ViewTreeObserver viewTreeObserver = this.f53355Oooo0oo;
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "viewTreeObserver");
            OooO.OooO00o.OooO00o(oooO, viewTreeObserver, this);
            if (!this.f53353Oooo0o) {
                this.f53353Oooo0o = true;
                CancellableContinuation<Size> cancellableContinuation = this.f53352Oooo;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m502constructorimpl(pixelSizeOooO0OO));
            }
        }
        return true;
    }
}
