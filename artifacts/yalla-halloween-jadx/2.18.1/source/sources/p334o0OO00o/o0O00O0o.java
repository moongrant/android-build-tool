package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O00 f37366OooO0O0 = new o0O00();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoO00O f37367OooO00o;

    public o0O00O0o() {
        o0oO0Ooo o0oo0ooo2;
        o0oO0Ooo[] o0oo0oooArr = new o0oO0Ooo[2];
        o0oo0oooArr[0] = o0O0000O.f37359OooO00o;
        try {
            o0oo0ooo2 = (o0oO0Ooo) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0oo0ooo2 = f37366OooO0O0;
        }
        o0oo0oooArr[1] = o0oo0ooo2;
        o0OoO00O o0ooo00o2 = new o0OoO00O(o0oo0oooArr);
        Charset charset = zzkm.f15980OooO00o;
        this.f37367OooO00o = o0ooo00o2;
    }
}
