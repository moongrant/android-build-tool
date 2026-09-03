package p044OooooOo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o0Oo0oo;
import java.util.Arrays;
import java.util.Locale;
import p039OoooOoo.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o0O0o0 implements o0O {
    public static boolean OooO0Oo() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean OooO0o() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean OooO0o0() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    @Override // p044OooooOo.o0O
    public final boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o00O000o o00o000o2) {
        if (OooO0Oo() || OooO0o0()) {
            return o00o000o2 == o00O000o.f1675OooO0Oo;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return o00o000o2 == o00O000o.f1673OooO0O0 || o00o000o2 == o00O000o.f1674OooO0OO;
        }
        if (OooO0o()) {
            return o0oo0oo2.OooO0o0() == 0 && (o00o000o2 == o00O000o.f1674OooO0OO || o00o000o2 == o00O000o.f1673OooO0O0);
        }
        return false;
    }

    @Override // p044OooooOo.o0O
    public final boolean OooO0OO() {
        return OooO0Oo() || OooO0o0() || OooO0o();
    }
}
