package p055o0000OOo;

import OooO00o.OooO00o;
import io.agora.rtc.video.VideoCapture;
import p016OooOoO0.OooOo00;
import p100o000oOoO.o0oO0Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f27541OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27542OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27543OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f27544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f27545OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f27546OooO0o0;

    public OooO0o(OooO0o oooO0o) {
        this.f27543OooO0OO = Integer.MIN_VALUE;
        this.f27544OooO0Oo = Float.NaN;
        this.f27546OooO0o0 = null;
        this.f27541OooO00o = oooO0o.f27541OooO00o;
        this.f27542OooO0O0 = oooO0o.f27542OooO0O0;
        this.f27543OooO0OO = oooO0o.f27543OooO0OO;
        this.f27544OooO0Oo = oooO0o.f27544OooO0Oo;
        this.f27546OooO0o0 = oooO0o.f27546OooO0o0;
        this.f27545OooO0o = oooO0o.f27545OooO0o;
    }

    public static String OooO00o(int i) {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("00000000");
        sbOooO0O0.append(Integer.toHexString(i));
        String string = sbOooO0O0.toString();
        StringBuilder sbOooO0O1 = OooO00o.OooO0O0("#");
        sbOooO0O1.append(string.substring(string.length() - 8));
        return sbOooO0O1.toString();
    }

    public final String toString() {
        String strOooO00o = o0oO0Ooo.OooO00o(new StringBuilder(), this.f27541OooO00o, ':');
        switch (this.f27542OooO0O0) {
            case 900:
                StringBuilder sbOooO0O0 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O0.append(this.f27543OooO0OO);
                return sbOooO0O0.toString();
            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                StringBuilder sbOooO0O1 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O1.append(this.f27544OooO0Oo);
                return sbOooO0O1.toString();
            case 902:
                StringBuilder sbOooO0O2 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O2.append(OooO00o(this.f27543OooO0OO));
                return sbOooO0O2.toString();
            case 903:
                StringBuilder sbOooO0O3 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O3.append(this.f27546OooO0o0);
                return sbOooO0O3.toString();
            case 904:
                StringBuilder sbOooO0O4 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O4.append(Boolean.valueOf(this.f27545OooO0o));
                return sbOooO0O4.toString();
            case 905:
                StringBuilder sbOooO0O5 = OooO00o.OooO0O0(strOooO00o);
                sbOooO0O5.append(this.f27544OooO0Oo);
                return sbOooO0O5.toString();
            default:
                return OooOo00.OooO00o(strOooO00o, "????");
        }
    }

    public OooO0o(String str, int i) {
        this.f27544OooO0Oo = Float.NaN;
        this.f27546OooO0o0 = null;
        this.f27541OooO00o = str;
        this.f27542OooO0O0 = 902;
        this.f27543OooO0OO = i;
    }

    public OooO0o(String str, float f) {
        this.f27543OooO0OO = Integer.MIN_VALUE;
        this.f27546OooO0o0 = null;
        this.f27541OooO00o = str;
        this.f27542OooO0O0 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
        this.f27544OooO0Oo = f;
    }
}
