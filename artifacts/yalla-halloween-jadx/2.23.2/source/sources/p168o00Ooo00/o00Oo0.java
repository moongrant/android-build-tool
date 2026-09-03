package p168o00Ooo00;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooOO0;
import p160o00OoOOO.o00Ooo;
import p165o00OoOoo.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements oo000o<Drawable, byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f38221OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o<Bitmap, byte[]> f38222OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o<o00, byte[]> f38223OooO0OO;

    public o00Oo0(@NonNull OooOO0 oooOO1, @NonNull o0OoOo0 o0oooo1, @NonNull o00Ooo o00ooo2) {
        this.f38221OooO00o = oooOO1;
        this.f38222OooO0O0 = o0oooo1;
        this.f38223OooO0OO = o00ooo2;
    }

    @Override // p168o00Ooo00.oo000o
    @Nullable
    public final o00oOoo<byte[]> OooO00o(@NonNull o00oOoo<Drawable> o00oooo2, @NonNull oo0o0Oo oo0o0oo) {
        Drawable drawable = o00oooo2.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f38222OooO0O0.OooO00o(o00Ooo.OooO0O0(((BitmapDrawable) drawable).getBitmap(), this.f38221OooO00o), oo0o0oo);
        }
        if (drawable instanceof o00) {
            return this.f38223OooO0OO.OooO00o(o00oooo2, oo0o0oo);
        }
        return null;
    }
}
