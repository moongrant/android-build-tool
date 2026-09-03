package p024Oooo0O0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.oo0o0O0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p023Oooo00o.oO000o00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000 {
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    @NonNull
    public static oo0o0O0 OooO00o(@NonNull oO000o00 oo000o00) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Integer num = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new o000000O(oo000o00));
        }
        Integer num2 = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null) {
            num2.intValue();
        }
        HashSet hashSet = o000O.f1007OooO00o;
        String str = Build.DEVICE;
        Locale locale = Locale.US;
        if (hashSet.contains(str.toLowerCase(locale))) {
            arrayList.add(new o000O());
        }
        Integer num3 = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num3 != null && num3.intValue() == 2) {
            arrayList.add(new o00000OO(oo000o00));
        }
        List<String> list = o000O0Oo.f1018OooO00o;
        String str2 = Build.MODEL;
        if (o000O0Oo.f1018OooO00o.contains(str2.toUpperCase(locale)) && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000O0Oo());
        }
        List<String> list2 = o0000Ooo.f1006OooO00o;
        if (o0000Ooo.f1006OooO00o.contains(str2.toUpperCase(locale)) && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o0000Ooo());
        }
        String str3 = Build.BRAND;
        if ("motorola".equalsIgnoreCase(str3) && "MotoG3".equalsIgnoreCase(str2)) {
            z = true;
        } else {
            if ("samsung".equalsIgnoreCase(str3) && "SM-G532F".equalsIgnoreCase(str2)) {
                z = true;
            } else {
                if ("samsung".equalsIgnoreCase(str3) && "SM-J700F".equalsIgnoreCase(str2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            arrayList.add(new o00O00O());
        }
        Iterator<String> it = o000Oo0.f1023OooO00o.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                z2 = true;
                break;
            }
        }
        if (z2 && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000Oo0());
        }
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new o00000());
        }
        Integer num4 = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num4 != null && num4.intValue() == 2) {
            arrayList.add(new o0000O0());
        }
        Integer num5 = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num5 != null && num5.intValue() == 2) {
            arrayList.add(new o000OOo0());
        }
        Integer num6 = (Integer) oo000o00.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num6 != null && num6.intValue() == 2) {
            arrayList.add(new o0000oo());
        }
        List<String> list3 = o000O00O.f1015OooO00o;
        String str4 = Build.MODEL;
        Locale locale2 = Locale.US;
        if ((o000O00O.f1016OooO0O0.contains(str4.toLowerCase(locale2)) && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) || o000O00O.f1015OooO00o.contains(str4.toLowerCase(locale2))) {
            arrayList.add(new o000O00O());
        }
        List<String> list4 = o000OO0O.f1022OooO00o;
        if (o000OO0O.f1022OooO00o.contains(str4.toLowerCase(locale2)) && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000OO0O());
        }
        List<String> list5 = o000O00.f1009OooO00o;
        if (o000O00.f1009OooO00o.contains(str4.toLowerCase(locale2)) && ((Integer) oo000o00.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new o000O00());
        }
        return new oo0o0O0(arrayList);
    }
}
