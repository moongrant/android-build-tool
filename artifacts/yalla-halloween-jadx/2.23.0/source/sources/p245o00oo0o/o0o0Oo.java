package p245o00oo0o;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0Oo extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOO0 f40621OooO00o;

    public o0o0Oo(o00OOOO0 o00oooo1) {
        this.f40621OooO00o = o00oooo1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        o00OOOO0.OooO00o(this.f40621OooO00o, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
