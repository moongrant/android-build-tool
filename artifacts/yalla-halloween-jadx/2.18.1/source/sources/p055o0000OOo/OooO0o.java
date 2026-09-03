package p055o0000OOo;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import io.agora.rtc.video.VideoCapture;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f27521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27522OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27523OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f27524OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f27525OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f27526OooO0o0;

    public OooO0o(OooO0o oooO0o) {
        this.f27523OooO0OO = Integer.MIN_VALUE;
        this.f27524OooO0Oo = Float.NaN;
        this.f27526OooO0o0 = null;
        this.f27521OooO00o = oooO0o.f27521OooO00o;
        this.f27522OooO0O0 = oooO0o.f27522OooO0O0;
        this.f27523OooO0OO = oooO0o.f27523OooO0OO;
        this.f27524OooO0Oo = oooO0o.f27524OooO0Oo;
        this.f27526OooO0o0 = oooO0o.f27526OooO0o0;
        this.f27525OooO0o = oooO0o.f27525OooO0o;
    }

    public static String OooO00o(int i) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("00000000");
        sbOooO0o0.append(Integer.toHexString(i));
        String string = sbOooO0o0.toString();
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("#");
        sbOooO0o1.append(string.substring(string.length() - 8));
        return sbOooO0o1.toString();
    }

    public final String toString() {
        String strOooO0O0 = o00oO0o.OooO0O0(new StringBuilder(), this.f27521OooO00o, ':');
        switch (this.f27522OooO0O0) {
            case 900:
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o0.append(this.f27523OooO0OO);
                return sbOooO0o0.toString();
            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o1.append(this.f27524OooO0Oo);
                return sbOooO0o1.toString();
            case 902:
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o2.append(OooO00o(this.f27523OooO0OO));
                return sbOooO0o2.toString();
            case 903:
                StringBuilder sbOooO0o3 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o3.append(this.f27526OooO0o0);
                return sbOooO0o3.toString();
            case 904:
                StringBuilder sbOooO0o4 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o4.append(Boolean.valueOf(this.f27525OooO0o));
                return sbOooO0o4.toString();
            case 905:
                StringBuilder sbOooO0o5 = OooO00o.OooO0o0(strOooO0O0);
                sbOooO0o5.append(this.f27524OooO0Oo);
                return sbOooO0o5.toString();
            default:
                return OooOo00.OooO0Oo(strOooO0O0, "????");
        }
    }

    public OooO0o(String str, int i) {
        this.f27524OooO0Oo = Float.NaN;
        this.f27526OooO0o0 = null;
        this.f27521OooO00o = str;
        this.f27522OooO0O0 = 902;
        this.f27523OooO0OO = i;
    }

    public OooO0o(String str, float f) {
        this.f27523OooO0OO = Integer.MIN_VALUE;
        this.f27526OooO0o0 = null;
        this.f27521OooO00o = str;
        this.f27522OooO0O0 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
        this.f27524OooO0Oo = f;
    }
}
