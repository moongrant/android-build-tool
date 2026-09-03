package o00OO0O0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p127o00O0oo.o0000;
import p127o00O0oo.o00000O0;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o0000<Bitmap>, o00000O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bitmap f37206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000oo f37207OooO0o0;

    public OooOOO0(@NonNull Bitmap bitmap, @NonNull o0000oo o0000ooVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f37206OooO0Oo = bitmap;
        if (o0000ooVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f37207OooO0o0 = o0000ooVar;
    }

    @Nullable
    public static OooOOO0 OooO0OO(@Nullable Bitmap bitmap, @NonNull o0000oo o0000ooVar) {
        if (bitmap == null) {
            return null;
        }
        return new OooOOO0(bitmap, o0000ooVar);
    }

    @Override // p127o00O0oo.o0000
    public final void OooO00o() {
        this.f37207OooO0o0.OooO0Oo(this.f37206OooO0Oo);
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Class<Bitmap> OooO0O0() {
        return Bitmap.class;
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Bitmap get() {
        return this.f37206OooO0Oo;
    }

    @Override // p127o00O0oo.o0000
    public final int getSize() {
        return p532o0o0Oo.o0000oo.OooO0OO(this.f37206OooO0Oo);
    }

    @Override // p127o00O0oo.o00000O0
    public final void initialize() {
        this.f37206OooO0Oo.prepareToDraw();
    }
}
