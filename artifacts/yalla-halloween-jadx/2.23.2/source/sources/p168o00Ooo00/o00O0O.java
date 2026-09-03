package p168o00Ooo00;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.oo0o0Oo;
import p160o00OoOOO.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements oo000o<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f38220OooO00o;

    public o00O0O(@NonNull Resources resources) {
        this.f38220OooO00o = resources;
    }

    @Override // p168o00Ooo00.oo000o
    @Nullable
    public final o00oOoo<BitmapDrawable> OooO00o(@NonNull o00oOoo<Bitmap> o00oooo2, @NonNull oo0o0Oo oo0o0oo) {
        if (o00oooo2 == null) {
            return null;
        }
        return new o00000(this.f38220OooO00o, o00oooo2);
    }
}
