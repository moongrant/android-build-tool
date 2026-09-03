package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O00oO implements o00000O<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOOo f33806OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O<Bitmap> f33807OooO0O0;

    public oO0O00oO(o0oOOo o0oooo2, o00000O<Bitmap> o00000o) {
        this.f33806OooO00o = o0oooo2;
        this.f33807OooO0O0 = o00000o;
    }

    @Override // p217o00oO00o.o00000O
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull o00000 o00000Var) {
        return this.f33807OooO0O0.OooO00o(o00000Var);
    }

    @Override // p217o00oO00o.o000OOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) {
        return this.f33807OooO0O0.OooO0O0((Bitmap) new oO0O0O0o(((BitmapDrawable) ((o00OOOO0) obj).get()).getBitmap(), this.f33806OooO00o), file, o00000Var);
    }
}
