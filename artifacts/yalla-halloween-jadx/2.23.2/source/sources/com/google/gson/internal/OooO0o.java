package com.google.gson.internal;

import android.content.Context;
import com.app.selectPicture.model.ImageLocationInfo;
import com.facebook.appevents.AppEventsConstants;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements o00oO0o {
    public static String OooO0O0(float f) {
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
        return p004OooO0oO.o000oOoO.OooO0O0("#", hexString, "000000");
    }

    public static float OooO0OO(Context context, ImageLocationInfo imageLocationInfo) {
        int i = imageLocationInfo.f12874OooO0o0;
        float f = imageLocationInfo.f12872OooO0Oo;
        float f2 = i * 1.0f;
        return f2 / f >= (((float) OooO0o0(context)) * 1.0f) / ((float) OooO0Oo(context)) ? f2 / OooO0o0(context) : (f * 1.0f) / OooO0Oo(context);
    }

    public static int OooO0Oo(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static boolean OooO0o(com.twitter.sdk.android.core.models.OooO0o oooO0o) {
        Object obj;
        boolean z;
        if (!"player".equals(oooO0o.f21580OooO0O0) && !"vine".equals(oooO0o.f21580OooO0O0)) {
            return false;
        }
        com.twitter.sdk.android.core.models.OooO0OO oooO0OO = oooO0o.f21579OooO00o;
        oooO0OO.getClass();
        try {
            obj = oooO0OO.f21578OooO00o.get("site");
        } catch (ClassCastException unused) {
            obj = null;
        }
        com.twitter.sdk.android.core.models.o0OoOo0 o0oooo1 = (com.twitter.sdk.android.core.models.o0OoOo0) obj;
        if (o0oooo1 != null) {
            try {
                if (Long.parseLong(o0oooo1.f21733OooO00o) == 586671909) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused2) {
            }
        } else {
            z = false;
        }
        return z;
    }

    public static int OooO0o0(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // com.google.gson.internal.o00oO0o
    public Object OooO00o() {
        return new ConcurrentSkipListMap();
    }
}
