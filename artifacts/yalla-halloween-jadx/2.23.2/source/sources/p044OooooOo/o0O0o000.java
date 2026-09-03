package p044OooooOo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o0Oo0oo;
import p039OoooOoo.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o0O0o000 implements o0OO0 {
    public static boolean OooO0Oo() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean OooO0o0() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // p044OooooOo.o0OO0
    public final boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o00O000o o00o000o2) {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            return o00o000o2 == o00O000o.f1641OooO0OO || o00o000o2 == o00O000o.f1642OooO0Oo;
        }
        return (OooO0o0() || OooO0Oo()) && o00o000o2 == o00O000o.f1641OooO0OO;
    }

    @Override // p044OooooOo.o0OO0
    public final /* synthetic */ boolean OooO0OO() {
        return false;
    }
}
