package p617o0oo0o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.Nullable;
import p235o00oOoOo.ooooO0O0;
import p237o00oOoo0.o0O000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends ooooO0O0<Bitmap> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Bitmap> f48547Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(CancellableContinuation<? super Bitmap> cancellableContinuation) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f48547Oooo = cancellableContinuation;
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void onLoadCleared(@Nullable Drawable drawable) {
        if (this.f48547Oooo.isActive()) {
            CancellableContinuation<Bitmap> cancellableContinuation = this.f48547Oooo;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(null));
        }
    }

    @Override // p235o00oOoOo.ooooO0O0, p235o00oOoOo.oOOO0O0o
    public final void onLoadFailed(@Nullable Drawable drawable) {
        if (this.f48547Oooo.isActive()) {
            CancellableContinuation<Bitmap> cancellableContinuation = this.f48547Oooo;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(null));
        }
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void onResourceReady(Object obj, o0O000Oo o0o000oo2) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        if (this.f48547Oooo.isActive()) {
            CancellableContinuation<Bitmap> cancellableContinuation = this.f48547Oooo;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(resource));
        }
    }
}
