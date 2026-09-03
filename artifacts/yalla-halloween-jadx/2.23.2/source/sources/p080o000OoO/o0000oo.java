package p080o000OoO;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f34954OooO00o;

    public o0000oo(o0000O0 o0000o1) {
        this.f34954OooO00o = o0000o1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        o0000O0.OooO00o(this.f34954OooO00o, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
