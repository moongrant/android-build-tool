package p024Oooo0O0;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O0OO0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o0000O implements o00O0OO0 {
    public static boolean OooO0Oo() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean OooO0o0() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equalsIgnoreCase(str.toUpperCase(locale)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE.toUpperCase(locale)) && Build.VERSION.SDK_INT >= 27;
    }
}
