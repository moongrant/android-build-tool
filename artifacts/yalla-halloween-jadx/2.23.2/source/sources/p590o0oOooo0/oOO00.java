package p590o0oOooo0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.Nullable;
import p172o00OooO0.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 extends o000000<Bitmap> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Bitmap> f57169OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00(CancellableContinuationImpl cancellableContinuationImpl) {
        super(0);
        this.f57169OooO0oO = cancellableContinuationImpl;
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0O0(Object obj) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        CancellableContinuation<Bitmap> cancellableContinuation = this.f57169OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(resource));
        }
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0Oo(@Nullable Drawable drawable) {
        CancellableContinuation<Bitmap> cancellableContinuation = this.f57169OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(null));
        }
    }

    @Override // p172o00OooO0.o000000, p172o00OooO0.o00000OO
    public final void OooOO0O(@Nullable Drawable drawable) {
        CancellableContinuation<Bitmap> cancellableContinuation = this.f57169OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(null));
        }
    }
}
