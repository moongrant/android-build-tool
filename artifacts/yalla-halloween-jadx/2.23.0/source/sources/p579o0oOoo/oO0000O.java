package p579o0oOoo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o00OOO00.OooO0OO;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000O extends OooO0OO<Bitmap> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Bitmap> f56525OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(CancellableContinuationImpl cancellableContinuationImpl) {
        super(0);
        this.f56525OooO0oO = cancellableContinuationImpl;
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0OO(Object obj) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        CancellableContinuation<Bitmap> cancellableContinuation = this.f56525OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(resource));
        }
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0o(@Nullable Drawable drawable) {
        CancellableContinuation<Bitmap> cancellableContinuation = this.f56525OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(null));
        }
    }

    @Override // o00OOO00.OooO0OO, o00OOO00.OooOOO0
    public final void OooOO0O(@Nullable Drawable drawable) {
        CancellableContinuation<Bitmap> cancellableContinuation = this.f56525OooO0oO;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(null));
        }
    }
}
