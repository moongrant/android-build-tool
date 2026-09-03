package o00OO0O0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<DataType> implements o00000O0<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<DataType, Bitmap> f37198OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f37199OooO0O0;

    public OooO00o(@NonNull Resources resources, @NonNull o00000O0<DataType, Bitmap> o00000o1) {
        this.f37199OooO0O0 = resources;
        this.f37198OooO00o = o00000o1;
    }

    @Override // p126o00O0oOo.o00000O0
    public final o0000<BitmapDrawable> OooO00o(@NonNull DataType datatype, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        o0000<Bitmap> o0000VarOooO00o = this.f37198OooO00o.OooO00o(datatype, i, i2, o00000Var);
        if (o0000VarOooO00o == null) {
            return null;
        }
        return new oo000o(this.f37199OooO0O0, o0000VarOooO00o);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull DataType datatype, @NonNull o00000 o00000Var) throws IOException {
        return this.f37198OooO00o.OooO0O0(datatype, o00000Var);
    }
}
