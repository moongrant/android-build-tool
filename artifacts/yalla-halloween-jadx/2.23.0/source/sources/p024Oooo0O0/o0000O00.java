package p024Oooo0O0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O0OO0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p023Oooo00o.oO00O0o0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O00 {
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    @NonNull
    public static o00O0OO0 OooO00o(@NonNull oO00O0o0 oo00o0o0) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Integer num = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new o00000(oo00o0o0));
        }
        Integer num2 = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null) {
            num2.intValue();
        }
        HashSet hashSet = o000OO00.f1033OooO00o;
        String str = Build.DEVICE;
        Locale locale = Locale.US;
        if (hashSet.contains(str.toLowerCase(locale))) {
            arrayList.add(new o000OO00());
        }
        Integer num3 = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num3 != null && num3.intValue() == 2) {
            arrayList.add(new o0000Ooo(oo00o0o0));
        }
        List<String> list = o000OO0O.f1034OooO00o;
        String str2 = Build.MODEL;
        if (o000OO0O.f1034OooO00o.contains(str2.toUpperCase(locale)) && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000OO0O());
        }
        List<String> list2 = o0000.f1015OooO00o;
        if (o0000.f1015OooO00o.contains(str2.toUpperCase(locale)) && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o0000());
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
            arrayList.add(new oOO00O());
        }
        Iterator<String> it = o000O00.f1023OooO00o.iterator();
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
        if (z2 && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000O00());
        }
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new o00000O0());
        }
        Integer num4 = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num4 != null && num4.intValue() == 2) {
            arrayList.add(new o0000O0O());
        }
        Integer num5 = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num5 != null && num5.intValue() == 2) {
            arrayList.add(new o00());
        }
        Integer num6 = (Integer) oo00o0o0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num6 != null && num6.intValue() == 2) {
            arrayList.add(new o0000O0());
        }
        List<String> list3 = o000O0.f1021OooO00o;
        String str4 = Build.MODEL;
        Locale locale2 = Locale.US;
        if ((o000O0.f1022OooO0O0.contains(str4.toLowerCase(locale2)) && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) || o000O0.f1021OooO00o.contains(str4.toLowerCase(locale2))) {
            arrayList.add(new o000O0());
        }
        List<String> list4 = o000O0O0.f1025OooO00o;
        if (o000O0O0.f1025OooO00o.contains(str4.toLowerCase(locale2)) && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new o000O0O0());
        }
        List<String> list5 = o000O00O.f1024OooO00o;
        if (o000O00O.f1024OooO00o.contains(str4.toLowerCase(locale2)) && ((Integer) oo00o0o0.OooO00o(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new o000O00O());
        }
        return new o00O0OO0(arrayList);
    }
}
