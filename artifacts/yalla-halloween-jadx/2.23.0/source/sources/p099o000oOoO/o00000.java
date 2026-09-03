package p099o000oOoO;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O0O0O;
import androidx.camera.core.impl.o00O0OO0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final o00O0OO0 f35450OooO00o;

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
            arrayList.add(new o00000O0());
        }
        arrayList.add(new o0000O00());
        HashSet hashSet = o000000O.f35451OooO00o;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        String str4 = Build.MODEL;
        if (o000000O.f35451OooO00o.contains(Pair.create(upperCase, str4.toUpperCase(locale)))) {
            arrayList.add(new o000000O());
        }
        if (o00000OO.f35453OooO00o.contains(str4.toUpperCase(locale))) {
            arrayList.add(new o00000OO());
        }
        if (o00000O.f35452OooO00o.contains(str4.toUpperCase(locale))) {
            arrayList.add(new o00000O());
        }
        f35450OooO00o = new o00O0OO0(arrayList);
    }

    @Nullable
    public static <T extends o00O0O0O> T OooO00o(@NonNull Class<T> cls) {
        return (T) f35450OooO00o.OooO0O0(cls);
    }
}
