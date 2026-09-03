package p160o00OoOOO;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class o000000O implements o0O0O00<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f38062OooO00o = new o00Oo0();

    @Override // p154o00Oo0oo.o0O0O00
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull InputStream inputStream, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<Bitmap> OooO0O0(@NonNull InputStream inputStream, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return this.f38062OooO00o.OooO0OO(ImageDecoder.createSource(o00O0.OooO0O0(inputStream)), i, i2, oo0o0oo);
    }
}
