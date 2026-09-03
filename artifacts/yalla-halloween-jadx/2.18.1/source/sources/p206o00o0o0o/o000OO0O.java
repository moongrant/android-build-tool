package p206o00o0o0o;

import OooO0o.OooO0OO;
import android.content.Context;
import android.content.res.Resources;
import com.app.selectPicture.model.ImageLocationInfo;
import com.facebook.appevents.AppEventsConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import oO000O0.OooO0o;
import p016OooOoO0.OooOo00;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.mk;
import p701oO0Oo0oo.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O {
    public static int OooO(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static String OooO00o(float f) {
        if (f >= 1.0f) {
            f = 1.0f;
        }
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        String hexString = Integer.toHexString((int) (f * 255.0f));
        if (hexString.length() == 1) {
            hexString = OooOo00.OooO0Oo(AppEventsConstants.EVENT_PARAM_VALUE_NO, hexString);
        }
        if (hexString.length() == 0) {
            hexString = "00";
        }
        return OooO0OO.OooO00o("#", hexString, "000000");
    }

    public static float OooO0O0(Context context, ImageLocationInfo imageLocationInfo) {
        int i = imageLocationInfo.f12315Oooo0oO;
        float f = imageLocationInfo.f12314Oooo0o;
        float f2 = i * 1.0f;
        return f2 / f >= OooO0o0(context) ? f2 / OooO0o(context) : (f * 1.0f) / OooO0Oo(context);
    }

    public static Oooo000 OooO0OO(String str) {
        ooOOO0Oo ooooo0oo = (ooOOO0Oo) mk.f52220OooO00o.get(str);
        OooO0o oooO0oOooO00o = ooooo0oo != null ? (OooO0o) mk.f52221OooO0O0.get(ooooo0oo) : null;
        if (oooO0oOooO00o == null) {
            try {
                oooO0oOooO00o = mk.OooO00o(new ooOOO0Oo(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (oooO0oOooO00o == null) {
            return null;
        }
        return new Oooo000(str, oooO0oOooO00o.f52545OooO0Oo, oooO0oOooO00o.f52546OooO0o, oooO0oOooO00o.f52548OooO0oO, oooO0oOooO00o.f52549OooO0oo, oooO0oOooO00o.OooO00o());
    }

    public static int OooO0Oo(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int OooO0o(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static float OooO0o0(Context context) {
        return (OooO0o(context) * 1.0f) / OooO0Oo(context);
    }

    public static final int OooO0oO() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int OooO0oo() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
