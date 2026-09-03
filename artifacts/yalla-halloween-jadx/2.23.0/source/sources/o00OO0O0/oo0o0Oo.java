package o00OO0O0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o00000O0<Bitmap, Bitmap> {

    public static final class OooO00o implements o0000<Bitmap> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Bitmap f37253OooO0Oo;

        public OooO00o(@NonNull Bitmap bitmap) {
            this.f37253OooO0Oo = bitmap;
        }

        @Override // p127o00O0oo.o0000
        public final void OooO00o() {
        }

        @Override // p127o00O0oo.o0000
        @NonNull
        public final Class<Bitmap> OooO0O0() {
            return Bitmap.class;
        }

        @Override // p127o00O0oo.o0000
        @NonNull
        public final Bitmap get() {
            return this.f37253OooO0Oo;
        }

        @Override // p127o00O0oo.o0000
        public final int getSize() {
            return o0000oo.OooO0OO(this.f37253OooO0Oo);
        }
    }

    @Override // p126o00O0oOo.o00000O0
    public final o0000<Bitmap> OooO00o(@NonNull Bitmap bitmap, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return new OooO00o(bitmap);
    }

    @Override // p126o00O0oOo.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull Bitmap bitmap, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
