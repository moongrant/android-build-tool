package p102o000oo0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.firebase.encoders.proto.OooOO0;
import com.google.firebase.messaging.o0OO00O;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p233o00oOoOO.o0O000o0;
import p307o0O0o0oo.o000O0;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements o000OO.OooO00o, o0O000o0 {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    @Override // o0O0oOo.o000OO.OooO00o
    public String OooO0O0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // p233o00oOoOO.o0O000o0
    public Object apply(Object obj) {
        o000O0 o000o0 = (o000O0) obj;
        o000o0.getClass();
        OooOO0 oooOO1 = o0OO00O.f19906OooO00o;
        oooOO1.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            oooOO1.OooO00o(byteArrayOutputStream, o000o0);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
