package p579o0oOoo;

import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.o0000O0;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import java.util.ArrayList;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo00o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f56707OooO00o = oOo00OO0.icon_medal_colour_bar;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f56708OooO0O0 = oO00O0o.color_7A46F9;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f56709OooO0OO = oO00O0o.color_FF559E;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f56710OooO0Oo = oO00O0o.color_FF7406;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f56712OooO0o0 = oO00O0o.color_FF19BD77;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f56711OooO0o = {oOo00OO0.icon_medal_level1, oOo00OO0.icon_medal_level2, oOo00OO0.icon_medal_level3, oOo00OO0.icon_medal_level4, oOo00OO0.icon_medal_level5, oOo00OO0.icon_medal_level6, oOo00OO0.icon_medal_level7, oOo00OO0.icon_medal_level8, oOo00OO0.icon_medal_level9, oOo00OO0.icon_medal_level10};

    public static Uri OooO00o(int i, int i2) {
        if (i2 == 4 || (i == 1005 && i2 > 0)) {
            return Uri.parse("https://file.yalla.live/Medal/New_v1_L/Medal_" + i + "_" + i2 + ".svga");
        }
        return Uri.parse("https://file.yalla.live/Medal/New_v1_L/Medal_" + i + "_" + i2 + ".png");
    }

    public static int OooO0O0(int i) {
        int i2 = f56710OooO0Oo;
        switch (i) {
            case 1000:
                return f56709OooO0OO;
            case 1001:
                return f56708OooO0O0;
            case 1002:
            case 1004:
            case 1005:
                return i2;
            case 1003:
                return f56712OooO0o0;
            default:
                return i2;
        }
    }

    public static void OooO0OO(ImageView imageView, SVGAView sVGAView, String str, @DrawableRes int i, LifecycleOwner lifecycleOwner) {
        if (str == null || str.isEmpty() || !str.contains("_")) {
            return;
        }
        String[] strArrSplit = str.split("_");
        int i2 = Integer.parseInt(strArrSplit[0]);
        int i3 = Integer.parseInt(strArrSplit[1]);
        int i4 = Integer.parseInt(strArrSplit[2]);
        StringBuilder sbOooO00o = o0000O0.OooO00o("https://file.yalla.live/Medal/New_v1_S/Medal_", i3, "_");
        if (i2 == 1) {
            sbOooO00o.append(1);
            if (i3 == 1005) {
                sbOooO00o.append(".svga");
            } else {
                sbOooO00o.append(".png");
            }
        } else {
            sbOooO00o.append(i4);
            if (i4 == 4) {
                sbOooO00o.append(".svga");
            } else {
                sbOooO00o.append(".png");
            }
        }
        String string = sbOooO00o.toString();
        if (string.isEmpty()) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f10172OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(string, lifecycleOwner);
        sVGAView.OooOO0o();
        if (i2 != 1 || i4 > 10) {
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(f56711OooO0o[i4 - 1]);
    }

    public static String[] OooO0Oo(String str) {
        if (OooOo00.OooO00o(str)) {
            return new String[0];
        }
        if (str.startsWith(",")) {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!OooOo00.OooO00o(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
