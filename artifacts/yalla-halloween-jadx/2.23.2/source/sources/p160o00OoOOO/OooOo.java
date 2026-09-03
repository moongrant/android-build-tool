package p160o00OoOOO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo<DataType> implements o0O0O00<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00<DataType, Bitmap> f38043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f38044OooO0O0;

    public OooOo(@NonNull Resources resources, @NonNull o0O0O00<DataType, Bitmap> o0o0o00) {
        this.f38044OooO0O0 = resources;
        this.f38043OooO00o = o0o0o00;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull DataType datatype, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return this.f38043OooO00o.OooO00o(datatype, oo0o0oo);
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<BitmapDrawable> OooO0O0(@NonNull DataType datatype, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        o00oOoo<Bitmap> o00ooooOooO0O0 = this.f38043OooO00o.OooO0O0(datatype, i, i2, oo0o0oo);
        if (o00ooooOooO0O0 == null) {
            return null;
        }
        return new o00000(this.f38044OooO0O0, o00ooooOooO0O0);
    }
}
