package p117o00O0Oo;

import android.content.Context;
import com.app.selectPicture.model.ImageLocationInfo;
import com.facebook.appevents.AppEventsConstants;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {
    public static String OooO00o(float f) {
        if (f >= 1.0f) {
            f = 1.0f;
        }
        if (f <= 0.0f) {
            f = 0.0f;
        }
        String hexString = Integer.toHexString((int) (f * 255.0f));
        if (hexString.length() == 1) {
            hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(hexString);
        }
        if (hexString.length() == 0) {
            hexString = "00";
        }
        return o000oOoO.OooO00o("#", hexString, "000000");
    }

    public static float OooO0O0(Context context, ImageLocationInfo imageLocationInfo) {
        int i = imageLocationInfo.f9783OooO0o0;
        float f = imageLocationInfo.f9781OooO0Oo;
        float f2 = i * 1.0f;
        return f2 / f >= (((float) OooO0Oo(context)) * 1.0f) / ((float) OooO0OO(context)) ? f2 / OooO0Oo(context) : (f * 1.0f) / OooO0OO(context);
    }

    public static int OooO0OO(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int OooO0Oo(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }
}
