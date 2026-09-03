package p224o00oOOOo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oOO000o implements o00000O0<Bitmap, Bitmap> {

    public static final class OooO00o implements o00OOOO0<Bitmap> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Bitmap f33846Oooo0o;

        public OooO00o(@NonNull Bitmap bitmap) {
            this.f33846Oooo0o = bitmap;
        }

        @Override // p214o00oO0.o00OOOO0
        public final void OooO00o() {
        }

        @Override // p214o00oO0.o00OOOO0
        @NonNull
        public final Class<Bitmap> OooO0OO() {
            return Bitmap.class;
        }

        @Override // p214o00oO0.o00OOOO0
        @NonNull
        public final Bitmap get() {
            return this.f33846Oooo0o;
        }

        @Override // p214o00oO0.o00OOOO0
        public final int getSize() {
            return o000O000.OooO0Oo(this.f33846Oooo0o);
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<Bitmap> OooO00o(@NonNull Bitmap bitmap, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return new OooO00o(bitmap);
    }

    @Override // p217o00oO00o.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull Bitmap bitmap, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}
