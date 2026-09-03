package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooOO0;
import p163o00OoOo0.o0OO00O;
import p163o00OoOo0.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements o0O0O00<Uri, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f38070OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f38071OooO0O0;

    public o00000OO(o0OO00O o0oo00o2, OooOO0 oooOO1) {
        this.f38070OooO00o = o0oo00o2;
        this.f38071OooO0O0 = oooOO1;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull Uri uri, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // p154o00Oo0oo.o0O0O00
    @Nullable
    public final o00oOoo<Bitmap> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        o00oOoo o00ooooOooO0OO = this.f38070OooO00o.OooO0OO(uri, oo0o0oo);
        if (o00ooooOooO0OO == null) {
            return null;
        }
        return o0OO00O.OooO00o(this.f38071OooO0O0, (Drawable) ((o0OOO0o) o00ooooOooO0OO).get(), i, i2);
    }
}
