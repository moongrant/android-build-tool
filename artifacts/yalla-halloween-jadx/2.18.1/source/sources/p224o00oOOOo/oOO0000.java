package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0oOOo;
import p227o00oOOoO.oOO0O000;
import p227o00oOOoO.ooooO000;

/* JADX INFO: loaded from: classes.dex */
public final class oOO0000 implements o00000O0<Uri, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO0O000 f33838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOOo f33839OooO0O0;

    public oOO0000(oOO0O000 ooo0o000, o0oOOo o0oooo2) {
        this.f33838OooO00o = ooo0o000;
        this.f33839OooO0O0 = o0oooo2;
    }

    @Override // p217o00oO00o.o00000O0
    @Nullable
    public final o00OOOO0<Bitmap> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        o00OOOO0<Drawable> o00oooo0OooO00o = this.f33838OooO00o.OooO00o(uri, i, i2, o00000Var);
        if (o00oooo0OooO00o == null) {
            return null;
        }
        return ooo0o.OooO00o(this.f33839OooO0O0, (Drawable) ((ooooO000) o00oooo0OooO00o).get(), i, i2);
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull Uri uri, @NonNull o00000 o00000Var) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
