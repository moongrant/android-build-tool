package o000000O;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends OooO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33255OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33254OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f33256OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33257OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33253OooO = 0.0f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33258OooOO0 = 0.0f;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33259OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f33260OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33262OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33261OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33263OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33264OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33266OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f33265OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33267OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f33269OooOo00 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f33268OooOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f33270OooOo0O = Float.NaN;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f33271OooOo0o = Float.NaN;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f33272OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33272OooO00o = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_motionTarget, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_framePosition, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_transitionEasing, 3);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_curveFit, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_waveShape, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_wavePeriod, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_waveOffset, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_waveVariesBy, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_alpha, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_elevation, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_rotation, 11);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_rotationX, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_rotationY, 13);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_transitionPathRotate, 14);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_scaleX, 15);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_scaleY, 16);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_translationX, 17);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_translationY, 18);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_android_translationZ, 19);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_motionProgress, 20);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyCycle_wavePhase, 21);
        }
    }

    public OooOO0() {
        this.f33252OooO0Oo = new HashMap<>();
    }

    @Override // o000000O.OooO0o
    public final void OooO00o(HashMap<String, o000000.OooO0o> map) {
        String str = "add " + map.size() + " values";
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String strOooO00o = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        for (int i = 1; i <= iMin; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String str2 = ".(" + stackTrace[i].getFileName() + CertificateUtil.DELIMITER + stackTrace[i].getLineNumber() + ") " + stackTrace[i].getMethodName();
            strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            Log.v("KeyCycle", str + strOooO00o + str2 + strOooO00o);
        }
        for (String str3 : map.keySet()) {
            o000000.OooO0o oooO0o = map.get(str3);
            if (oooO0o != null) {
                str3.getClass();
                str3.hashCode();
                switch (str3) {
                    case "rotationX":
                        oooO0o.OooO0O0(this.f33266OooOOo0, this.f33249OooO00o);
                        break;
                    case "rotationY":
                        oooO0o.OooO0O0(this.f33265OooOOo, this.f33249OooO00o);
                        break;
                    case "translationX":
                        oooO0o.OooO0O0(this.f33268OooOo0, this.f33249OooO00o);
                        break;
                    case "translationY":
                        oooO0o.OooO0O0(this.f33270OooOo0O, this.f33249OooO00o);
                        break;
                    case "translationZ":
                        oooO0o.OooO0O0(this.f33271OooOo0o, this.f33249OooO00o);
                        break;
                    case "progress":
                        oooO0o.OooO0O0(this.f33259OooOO0O, this.f33249OooO00o);
                        break;
                    case "scaleX":
                        oooO0o.OooO0O0(this.f33267OooOOoo, this.f33249OooO00o);
                        break;
                    case "scaleY":
                        oooO0o.OooO0O0(this.f33269OooOo00, this.f33249OooO00o);
                        break;
                    case "rotation":
                        oooO0o.OooO0O0(this.f33263OooOOOO, this.f33249OooO00o);
                        break;
                    case "elevation":
                        oooO0o.OooO0O0(this.f33261OooOOO, this.f33249OooO00o);
                        break;
                    case "transitionPathRotate":
                        oooO0o.OooO0O0(this.f33264OooOOOo, this.f33249OooO00o);
                        break;
                    case "alpha":
                        oooO0o.OooO0O0(this.f33262OooOOO0, this.f33249OooO00o);
                        break;
                    case "waveOffset":
                        oooO0o.OooO0O0(this.f33253OooO, this.f33249OooO00o);
                        break;
                    case "wavePhase":
                        oooO0o.OooO0O0(this.f33258OooOO0, this.f33249OooO00o);
                        break;
                    default:
                        if (str3.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  ".concat(str3));
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // o000000O.OooO0o
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooO0o clone() {
        OooOO0 oooOO1 = new OooOO0();
        super.OooO0OO(this);
        oooOO1.f33255OooO0o0 = this.f33255OooO0o0;
        oooOO1.f33254OooO0o = this.f33254OooO0o;
        oooOO1.f33256OooO0oO = this.f33256OooO0oO;
        oooOO1.f33257OooO0oo = this.f33257OooO0oo;
        oooOO1.f33253OooO = this.f33253OooO;
        oooOO1.f33258OooOO0 = this.f33258OooOO0;
        oooOO1.f33259OooOO0O = this.f33259OooOO0O;
        oooOO1.f33260OooOO0o = this.f33260OooOO0o;
        oooOO1.f33262OooOOO0 = this.f33262OooOOO0;
        oooOO1.f33261OooOOO = this.f33261OooOOO;
        oooOO1.f33263OooOOOO = this.f33263OooOOOO;
        oooOO1.f33264OooOOOo = this.f33264OooOOOo;
        oooOO1.f33266OooOOo0 = this.f33266OooOOo0;
        oooOO1.f33265OooOOo = this.f33265OooOOo;
        oooOO1.f33267OooOOoo = this.f33267OooOOoo;
        oooOO1.f33269OooOo00 = this.f33269OooOo00;
        oooOO1.f33268OooOo0 = this.f33268OooOo0;
        oooOO1.f33270OooOo0O = this.f33270OooOo0O;
        oooOO1.f33271OooOo0o = this.f33271OooOo0o;
        return oooOO1;
    }

    @Override // o000000O.OooO0o
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f33262OooOOO0)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f33261OooOOO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f33263OooOOOO)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f33266OooOOo0)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f33265OooOOo)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f33267OooOOoo)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f33269OooOo00)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f33264OooOOOo)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f33268OooOo0)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f33270OooOo0O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f33271OooOo0o)) {
            hashSet.add("translationZ");
        }
        if (this.f33252OooO0Oo.size() > 0) {
            Iterator<String> it = this.f33252OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.KeyCycle);
        SparseIntArray sparseIntArray = OooO00o.f33272OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f33272OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f4581o00o0O) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f33250OooO0O0);
                        this.f33250OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f33251OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33251OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f33250OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33250OooO0O0);
                    }
                    break;
                case 2:
                    this.f33249OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f33249OooO00o);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f33255OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f33255OooO0o0);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33256OooO0oO = typedArrayObtainStyledAttributes.getString(index);
                        this.f33254OooO0o = 7;
                    } else {
                        this.f33254OooO0o = typedArrayObtainStyledAttributes.getInt(index, this.f33254OooO0o);
                    }
                    break;
                case 6:
                    this.f33257OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f33257OooO0oo);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f33253OooO = typedArrayObtainStyledAttributes.getDimension(index, this.f33253OooO);
                    } else {
                        this.f33253OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f33253OooO);
                    }
                    break;
                case 8:
                    this.f33260OooOO0o = typedArrayObtainStyledAttributes.getInt(index, this.f33260OooOO0o);
                    break;
                case 9:
                    this.f33262OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33262OooOOO0);
                    break;
                case 10:
                    this.f33261OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f33261OooOOO);
                    break;
                case 11:
                    this.f33263OooOOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f33263OooOOOO);
                    break;
                case 12:
                    this.f33266OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33266OooOOo0);
                    break;
                case 13:
                    this.f33265OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f33265OooOOo);
                    break;
                case 14:
                    this.f33264OooOOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f33264OooOOOo);
                    break;
                case 15:
                    this.f33267OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f33267OooOOoo);
                    break;
                case 16:
                    this.f33269OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f33269OooOo00);
                    break;
                case 17:
                    this.f33268OooOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f33268OooOo0);
                    break;
                case 18:
                    this.f33270OooOo0O = typedArrayObtainStyledAttributes.getDimension(index, this.f33270OooOo0O);
                    break;
                case 19:
                    this.f33271OooOo0o = typedArrayObtainStyledAttributes.getDimension(index, this.f33271OooOo0o);
                    break;
                case 20:
                    this.f33259OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f33259OooOO0O);
                    break;
                case 21:
                    this.f33258OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33258OooOO0) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }
}
