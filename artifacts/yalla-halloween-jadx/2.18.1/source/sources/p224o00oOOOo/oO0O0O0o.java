package p224o00oOOOo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p214o00oO0.o00OOO00;
import p214o00oO0.o00OOOO0;
import p219o00oO0O0.o0oOOo;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O0O0o implements o00OOOO0<Bitmap>, o00OOO00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Bitmap f33809Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oOOo f33810Oooo0oO;

    public oO0O0O0o(@NonNull Bitmap bitmap, @NonNull o0oOOo o0oooo2) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f33809Oooo0o = bitmap;
        Objects.requireNonNull(o0oooo2, "BitmapPool must not be null");
        this.f33810Oooo0oO = o0oooo2;
    }

    @Nullable
    public static oO0O0O0o OooO0O0(@Nullable Bitmap bitmap, @NonNull o0oOOo o0oooo2) {
        if (bitmap == null) {
            return null;
        }
        return new oO0O0O0o(bitmap, o0oooo2);
    }

    @Override // p214o00oO0.o00OOOO0
    public final void OooO00o() {
        this.f33810Oooo0oO.OooO0O0(this.f33809Oooo0o);
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<Bitmap> OooO0OO() {
        return Bitmap.class;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Bitmap get() {
        return this.f33809Oooo0o;
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return o000O000.OooO0Oo(this.f33809Oooo0o);
    }

    @Override // p214o00oO0.o00OOO00
    public final void initialize() {
        this.f33809Oooo0o.prepareToDraw();
    }
}
