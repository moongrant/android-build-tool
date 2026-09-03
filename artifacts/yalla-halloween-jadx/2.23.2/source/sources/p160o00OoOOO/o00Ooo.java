package p160o00OoOOO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144o00Oo.o000OOo0;
import p144o00Oo.o00oOoo;
import p156o00OoO00.OooOO0;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements o00oOoo<Bitmap>, o000OOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bitmap f38087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f38088OooO0o0;

    public o00Ooo(@NonNull Bitmap bitmap, @NonNull OooOO0 oooOO1) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f38087OooO0Oo = bitmap;
        if (oooOO1 == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f38088OooO0o0 = oooOO1;
    }

    @Nullable
    public static o00Ooo OooO0O0(@Nullable Bitmap bitmap, @NonNull OooOO0 oooOO1) {
        if (bitmap == null) {
            return null;
        }
        return new o00Ooo(bitmap, oooOO1);
    }

    @Override // p144o00Oo.o00oOoo
    public final void OooO00o() {
        this.f38088OooO0o0.OooO0Oo(this.f38087OooO0Oo);
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Class<Bitmap> OooO0OO() {
        return Bitmap.class;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Bitmap get() {
        return this.f38087OooO0Oo;
    }

    @Override // p144o00Oo.o00oOoo
    public final int getSize() {
        return o00OO0O0.OooO0OO(this.f38087OooO0Oo);
    }

    @Override // p144o00Oo.o000OOo0
    public final void initialize() {
        this.f38087OooO0Oo.prepareToDraw();
    }
}
