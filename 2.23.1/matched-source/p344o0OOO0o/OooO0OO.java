package p344o0OOO0o;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.foundation.layout.oo000o;
import io.agora.rtc.video.VideoCapture;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42783OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f42784OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f42785OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f42786OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f42787OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f42788OooO0o0;

    public OooO0OO(OooO0OO oooO0OO) {
        this.f42785OooO0OO = Integer.MIN_VALUE;
        this.f42786OooO0Oo = Float.NaN;
        this.f42788OooO0o0 = null;
        this.f42783OooO00o = oooO0OO.f42783OooO00o;
        this.f42784OooO0O0 = oooO0OO.f42784OooO0O0;
        this.f42785OooO0OO = oooO0OO.f42785OooO0OO;
        this.f42786OooO0Oo = oooO0OO.f42786OooO0Oo;
        this.f42788OooO0o0 = oooO0OO.f42788OooO0o0;
        this.f42787OooO0o = oooO0OO.f42787OooO0o;
    }

    public static String OooO00o(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public final String toString() {
        String strOooO00o = oo000o.OooO00o(new StringBuilder(), this.f42783OooO00o, ':');
        switch (this.f42784OooO0O0) {
            case 900:
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o.append(this.f42785OooO0OO);
                return sbOooO00o.toString();
            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                StringBuilder sbOooO00o2 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o2.append(this.f42786OooO0Oo);
                return sbOooO00o2.toString();
            case 902:
                StringBuilder sbOooO00o3 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o3.append(OooO00o(this.f42785OooO0OO));
                return sbOooO00o3.toString();
            case 903:
                StringBuilder sbOooO00o4 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o4.append(this.f42788OooO0o0);
                return sbOooO00o4.toString();
            case 904:
                StringBuilder sbOooO00o5 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o5.append(Boolean.valueOf(this.f42787OooO0o));
                return sbOooO00o5.toString();
            case 905:
                StringBuilder sbOooO00o6 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o6.append(this.f42786OooO0Oo);
                return sbOooO00o6.toString();
            default:
                return OooOOOO.OooO00o(strOooO00o, "????");
        }
    }

    public OooO0OO(String str, int i) {
        this.f42786OooO0Oo = Float.NaN;
        this.f42788OooO0o0 = null;
        this.f42783OooO00o = str;
        this.f42784OooO0O0 = 902;
        this.f42785OooO0OO = i;
    }

    public OooO0OO(String str, float f) {
        this.f42785OooO0OO = Integer.MIN_VALUE;
        this.f42788OooO0o0 = null;
        this.f42783OooO00o = str;
        this.f42784OooO0O0 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
        this.f42786OooO0Oo = f;
    }
}
