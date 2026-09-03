package o00O0O0O;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30476OooO00o;

    public OooOOO(@NotNull p113o00O00Oo.OooO0o referenceCounter) {
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.f30476OooO00o = referenceCounter;
    }

    @Override // o00O0O0O.oo000o
    @Nullable
    public final Object OooO0o0(@NotNull o00O0OO0.OooOo00 oooOo00, @NotNull Continuation<? super Unit> continuation) {
        p113o00O00Oo.OooO0o oooO0o = this.f30476OooO00o;
        Drawable drawable = oooOo00.f30592OooO00o;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            oooO0o.OooO00o(bitmap, false);
        }
        return Unit.INSTANCE;
    }
}
