package p160o00OoOOO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 implements o0O0O00<Bitmap, Bitmap> {

    public static final class OooO00o implements o00oOoo<Bitmap> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Bitmap f38081OooO0Oo;

        public OooO00o(@NonNull Bitmap bitmap) {
            this.f38081OooO0Oo = bitmap;
        }

        @Override // p144o00Oo.o00oOoo
        public final void OooO00o() {
        }

        @Override // p144o00Oo.o00oOoo
        @NonNull
        public final Class<Bitmap> OooO0OO() {
            return Bitmap.class;
        }

        @Override // p144o00Oo.o00oOoo
        @NonNull
        public final Bitmap get() {
            return this.f38081OooO0Oo;
        }

        @Override // p144o00Oo.o00oOoo
        public final int getSize() {
            return o00OO0O0.OooO0OO(this.f38081OooO0Oo);
        }
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull Bitmap bitmap, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<Bitmap> OooO0O0(@NonNull Bitmap bitmap, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return new OooO00o(bitmap);
    }
}
