package p024Oooo0O0;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O0O0O;
import androidx.camera.core.impl.o00O0OO0;
import androidx.camera.core.impl.o00OO0OO;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final o00O0OO0 f1017OooO00o;

    /* JADX WARN: Code duplicated, block: B:117:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:146:0x024d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        List<String> list = o000O0Oo.f1026OooO00o;
        String str = Build.MODEL;
        boolean z5 = true;
        if (list.contains(str) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26) {
            arrayList.add(new o000O0Oo());
        }
        if (o000.OooO0o0()) {
            arrayList.add(new o000());
        }
        List<String> list2 = o000OOo0.f1035OooO00o;
        String str2 = Build.BRAND;
        "GOOGLE".equalsIgnoreCase(str2);
        if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            z = true;
        } else {
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                z = true;
            } else {
                if (("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || o0000OO0.OooO0o0() || o0000OO0.OooO0Oo()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            arrayList.add(new o0000OO0());
        }
        List<String> list3 = o000OO.f1032OooO00o;
        Locale locale = Locale.US;
        if (o000OO.f1032OooO00o.contains(str.toUpperCase(locale))) {
            arrayList.add(new o000OO());
        }
        List<String> list4 = o00O0000.f1038OooO00o;
        String str3 = Build.MANUFACTURER;
        if ("Google".equals(str3)) {
            if (o00O0000.f1038OooO00o.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            arrayList.add(new o00O0000());
        }
        if ("SAMSUNG".equals(str3.toUpperCase(locale)) && str.toUpperCase(locale).startsWith("SM-A716")) {
            arrayList.add(new o00O000());
        }
        o00OO0OO o00oo0oo = o000O0o.f1027OooO00o;
        String str4 = Build.DEVICE;
        if (("heroqltevzw".equalsIgnoreCase(str4) || "heroqltetmo".equalsIgnoreCase(str4)) || o000O0o.OooO0Oo() || o000O0o.OooO0o0()) {
            arrayList.add(new o000O0o());
        }
        if (o000Oo0.f1036OooO00o.contains(new Pair(str3.toLowerCase(locale), str.toLowerCase(locale)))) {
            arrayList.add(new o000Oo0());
        }
        if ("Huawei".equalsIgnoreCase(str2) && "mha-l29".equalsIgnoreCase(str)) {
            arrayList.add(new o0O0ooO());
        }
        if (Build.VERSION.SDK_INT <= 23) {
            arrayList.add(new o00O000o());
        }
        List<String> list5 = o00O00.f1037OooO00o;
        if (o00O00.f1037OooO00o.contains(str.toLowerCase(locale))) {
            arrayList.add(new o00O00());
        }
        if ("samsung".equalsIgnoreCase(str2) && str.toUpperCase(locale).startsWith("SM-F936")) {
            z3 = true;
        } else {
            if ("xiaomi".equalsIgnoreCase(str2) && str.toUpperCase(locale).startsWith("MI 8")) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            arrayList.add(new o00O00OO());
        }
        if ("motorola".equalsIgnoreCase(str2) && "moto e5 play".equalsIgnoreCase(str)) {
            arrayList.add(new o000O000());
        }
        List<String> list6 = o000O.f1020OooO00o;
        if (!("samsung".equalsIgnoreCase(str2) && Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a"))) {
            Locale locale2 = Locale.ROOT;
            if (o000O.f1020OooO00o.contains(str.toLowerCase(locale2))) {
                if (Build.ID.toLowerCase(locale2).startsWith("tp1a") || Build.ID.toLowerCase(locale2).startsWith("td1a")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        if (z5) {
            arrayList.add(new o000O());
        }
        if (o00oOoo.f1039OooO00o.containsKey(str.toUpperCase(locale))) {
            arrayList.add(new o00oOoo());
        }
        f1017OooO00o = new o00O0OO0(arrayList);
    }

    @Nullable
    public static <T extends o00O0O0O> T OooO00o(@NonNull Class<T> cls) {
        return (T) f1017OooO00o.OooO0O0(cls);
    }
}
