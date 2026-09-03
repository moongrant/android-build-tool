package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o00000O<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f37200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O<Bitmap> f37201OooO0O0;

    public OooO0O0(o0000oo o0000ooVar, OooO0OO oooO0OO) {
        this.f37200OooO00o = o0000ooVar;
        this.f37201OooO0O0 = oooO0OO;
    }

    @Override // p126o00O0oOo.o0O0O00
    public final boolean OooO00o(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) {
        return this.f37201OooO0O0.OooO00o(new OooOOO0(((BitmapDrawable) ((o0000) obj).get()).getBitmap(), this.f37200OooO00o), file, o00000Var);
    }

    @Override // p126o00O0oOo.o00000O
    @NonNull
    public final EncodeStrategy OooO0O0(@NonNull o00000 o00000Var) {
        return this.f37201OooO0O0.OooO0O0(o00000Var);
    }
}
