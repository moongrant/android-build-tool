package o00OO0O0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;
import p129o00O0ooo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o00000O0<Uri, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0OO.OooOo00 f37241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f37242OooO0O0;

    public o0OOO0o(o00OO0OO.OooOo00 oooOo00, o0000oo o0000ooVar) {
        this.f37241OooO00o = oooOo00;
        this.f37242OooO0O0 = o0000ooVar;
    }

    @Override // p126o00O0oOo.o00000O0
    @Nullable
    public final o0000<Bitmap> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        o0000 o0000VarOooO0OO = this.f37241OooO00o.OooO0OO(uri, o00000Var);
        if (o0000VarOooO0OO == null) {
            return null;
        }
        return Oooo0.OooO00o(this.f37242OooO0O0, (Drawable) ((o00OO0OO.OooOOO) o0000VarOooO0OO).get(), i, i2);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull Uri uri, @NonNull o00000 o00000Var) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
