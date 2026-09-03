package p340o0OOO0o;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.foundation.layout.oo000o;
import io.agora.rtc.video.VideoCapture;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f43602OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43603OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f43604OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f43605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f43606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f43607OooO0o0;

    public OooO0o(OooO0o oooO0o) {
        this.f43604OooO0OO = Integer.MIN_VALUE;
        this.f43605OooO0Oo = Float.NaN;
        this.f43607OooO0o0 = null;
        this.f43602OooO00o = oooO0o.f43602OooO00o;
        this.f43603OooO0O0 = oooO0o.f43603OooO0O0;
        this.f43604OooO0OO = oooO0o.f43604OooO0OO;
        this.f43605OooO0Oo = oooO0o.f43605OooO0Oo;
        this.f43607OooO0o0 = oooO0o.f43607OooO0o0;
        this.f43606OooO0o = oooO0o.f43606OooO0o;
    }

    public static String OooO00o(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public final String toString() {
        String strOooO00o = oo000o.OooO00o(new StringBuilder(), this.f43602OooO00o, ':');
        switch (this.f43603OooO0O0) {
            case 900:
                StringBuilder sbOooO00o = o00OO.OooO00o(strOooO00o);
                sbOooO00o.append(this.f43604OooO0OO);
                return sbOooO00o.toString();
            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                StringBuilder sbOooO00o2 = o00OO.OooO00o(strOooO00o);
                sbOooO00o2.append(this.f43605OooO0Oo);
                return sbOooO00o2.toString();
            case 902:
                StringBuilder sbOooO00o3 = o00OO.OooO00o(strOooO00o);
                sbOooO00o3.append(OooO00o(this.f43604OooO0OO));
                return sbOooO00o3.toString();
            case 903:
                StringBuilder sbOooO00o4 = o00OO.OooO00o(strOooO00o);
                sbOooO00o4.append(this.f43607OooO0o0);
                return sbOooO00o4.toString();
            case 904:
                StringBuilder sbOooO00o5 = o00OO.OooO00o(strOooO00o);
                sbOooO00o5.append(Boolean.valueOf(this.f43606OooO0o));
                return sbOooO00o5.toString();
            case 905:
                StringBuilder sbOooO00o6 = o00OO.OooO00o(strOooO00o);
                sbOooO00o6.append(this.f43605OooO0Oo);
                return sbOooO00o6.toString();
            default:
                return OooOOOO.OooO00o(strOooO00o, "????");
        }
    }

    public OooO0o(String str, int i) {
        this.f43605OooO0Oo = Float.NaN;
        this.f43607OooO0o0 = null;
        this.f43602OooO00o = str;
        this.f43603OooO0O0 = 902;
        this.f43604OooO0OO = i;
    }

    public OooO0o(String str, float f) {
        this.f43604OooO0OO = Integer.MIN_VALUE;
        this.f43607OooO0o0 = null;
        this.f43602OooO00o = str;
        this.f43603OooO0O0 = VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown;
        this.f43605OooO0Oo = f;
    }
}
