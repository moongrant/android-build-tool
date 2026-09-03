package p133o00OO0oO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00OO0O0.oo000o;
import p126o00O0oOo.o00000;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o00O0O<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f37315OooO00o;

    public Oooo0(@NonNull Resources resources) {
        this.f37315OooO00o = resources;
    }

    @Override // p133o00OO0oO.o00O0O
    @Nullable
    public final o0000<BitmapDrawable> OooO00o(@NonNull o0000<Bitmap> o0000Var, @NonNull o00000 o00000Var) {
        if (o0000Var == null) {
            return null;
        }
        return new oo000o(this.f37315OooO00o, o0000Var);
    }
}
