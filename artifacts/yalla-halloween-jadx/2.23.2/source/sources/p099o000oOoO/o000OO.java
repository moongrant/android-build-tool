package p099o000oOoO;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O0OO0;
import androidx.camera.core.impl.oo0o0O0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final oo0o0O0 f35340OooO00o;

    static {
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        boolean z = true;
        if (!("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL))) {
            if (!("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                String str2 = Build.FINGERPRINT;
                if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Cuttlefish") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                        Build.HARDWARE.contains("ranchu");
                    }
                }
                z = false;
            }
        }
        if (z) {
            arrayList.add(new o0000O());
        }
        arrayList.add(new o000Oo0());
        HashSet hashSet = o0000O0O.f35338OooO00o;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        String str4 = Build.MODEL;
        if (o0000O0O.f35338OooO00o.contains(Pair.create(upperCase, str4.toUpperCase(locale)))) {
            arrayList.add(new o0000O0O());
        }
        if (o000.f35337OooO00o.contains(str4.toUpperCase(locale))) {
            arrayList.add(new o000());
        }
        if (o0000OO0.f35339OooO00o.contains(str4.toUpperCase(locale))) {
            arrayList.add(new o0000OO0());
        }
        f35340OooO00o = new oo0o0O0(arrayList);
    }

    @Nullable
    public static <T extends o00O0OO0> T OooO00o(@NonNull Class<T> cls) {
        return (T) f35340OooO00o.OooO0O0(cls);
    }
}
