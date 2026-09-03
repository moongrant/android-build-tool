package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements o000OOo<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f38048OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<Bitmap> f38049OooO0O0;

    public Oooo000(OooOO0 oooOO1, Oooo0 oooo0) {
        this.f38048OooO00o = oooOO1;
        this.f38049OooO0O0 = oooo0;
    }

    @Override // p154o00Oo0oo.o000OOo
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull oo0o0Oo oo0o0oo) {
        return this.f38049OooO0O0.OooO00o(oo0o0oo);
    }

    @Override // p154o00Oo0oo.o0ooOOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull oo0o0Oo oo0o0oo) {
        return this.f38049OooO0O0.OooO0O0(new o00Ooo(((BitmapDrawable) ((o00oOoo) obj).get()).getBitmap(), this.f38048OooO00o), file, oo0o0oo);
    }
}
