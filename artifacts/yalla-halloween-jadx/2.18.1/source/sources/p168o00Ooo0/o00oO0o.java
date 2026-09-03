package p168o00Ooo0;

import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.lifecycle.LifecycleOwner;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f32651OooO00o = {R.drawable.icon_medal_level1, R.drawable.icon_medal_level2, R.drawable.icon_medal_level3, R.drawable.icon_medal_level4, R.drawable.icon_medal_level5, R.drawable.icon_medal_level6, R.drawable.icon_medal_level7, R.drawable.icon_medal_level8, R.drawable.icon_medal_level9, R.drawable.icon_medal_level10};

    public static Uri OooO00o(int i, int i2) {
        if (i2 == 4 || (i == 1005 && i2 > 0)) {
            return Uri.parse("https://file.yalla.live/Medal/New_v1_L/Medal_" + i + "_" + i2 + ".svga");
        }
        return Uri.parse("https://file.yalla.live/Medal/New_v1_L/Medal_" + i + "_" + i2 + ".png");
    }

    public static int OooO0O0(int i) {
        if (i == 1000) {
            return R.color.color_FF559E;
        }
        if (i != 1001) {
            return i != 1003 ? R.color.color_FF7406 : R.color.color_FF19BD77;
        }
        return R.color.color_7A46F9;
    }

    public static void OooO0OO(ImageView imageView, SVGAView sVGAView, String str, @DrawableRes int i, LifecycleOwner lifecycleOwner) {
        if (str == null || str.isEmpty() || !str.contains("_")) {
            return;
        }
        String[] strArrSplit = str.split("_");
        int i2 = Integer.parseInt(strArrSplit[0]);
        int i3 = Integer.parseInt(strArrSplit[1]);
        int i4 = Integer.parseInt(strArrSplit[2]);
        StringBuilder sb = new StringBuilder("https://file.yalla.live/Medal/New_v1_S/Medal_");
        sb.append(i3);
        sb.append("_");
        if (i2 == 1) {
            sb.append(1);
            if (i3 == 1005) {
                sb.append(".svga");
            } else {
                sb.append(".png");
            }
        } else {
            sb.append(i4);
            if (i4 == 4) {
                sb.append(".svga");
            } else {
                sb.append(".png");
            }
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f21010OooooO0 = i;
        sVGAView.OooO0oo(string, lifecycleOwner);
        sVGAView.OooO();
        if (i2 == 1) {
            int[] iArr = f32651OooO00o;
            if (i4 <= 10) {
                imageView.setVisibility(0);
                imageView.setImageResource(iArr[i4 - 1]);
            }
        }
    }

    public static String[] OooO0Oo(String str) {
        if (OooO0OO.OooO00o(str)) {
            return new String[0];
        }
        if (str.startsWith(",")) {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!OooO0OO.OooO00o(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] OooO0o0(String str) {
        return str.split("_");
    }
}
