package p060o0000o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.bz;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p057o0000Oo0.o00000O;
import p063o0000o0o.o0OO00O;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27710OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f27709OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f27711OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27712OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27708OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27713OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27714OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f27715OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27717OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27716OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f27718OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27719OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f27721OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f27720OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f27722OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f27724OooOo00 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f27723OooOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f27725OooOo0O = Float.NaN;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f27726OooOo0o = Float.NaN;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27727OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27727OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyCycle_motionTarget, 1);
            f27727OooO00o.append(o000O00.KeyCycle_framePosition, 2);
            f27727OooO00o.append(o000O00.KeyCycle_transitionEasing, 3);
            f27727OooO00o.append(o000O00.KeyCycle_curveFit, 4);
            f27727OooO00o.append(o000O00.KeyCycle_waveShape, 5);
            f27727OooO00o.append(o000O00.KeyCycle_wavePeriod, 6);
            f27727OooO00o.append(o000O00.KeyCycle_waveOffset, 7);
            f27727OooO00o.append(o000O00.KeyCycle_waveVariesBy, 8);
            f27727OooO00o.append(o000O00.KeyCycle_android_alpha, 9);
            f27727OooO00o.append(o000O00.KeyCycle_android_elevation, 10);
            f27727OooO00o.append(o000O00.KeyCycle_android_rotation, 11);
            f27727OooO00o.append(o000O00.KeyCycle_android_rotationX, 12);
            f27727OooO00o.append(o000O00.KeyCycle_android_rotationY, 13);
            f27727OooO00o.append(o000O00.KeyCycle_transitionPathRotate, 14);
            f27727OooO00o.append(o000O00.KeyCycle_android_scaleX, 15);
            f27727OooO00o.append(o000O00.KeyCycle_android_scaleY, 16);
            f27727OooO00o.append(o000O00.KeyCycle_android_translationX, 17);
            f27727OooO00o.append(o000O00.KeyCycle_android_translationY, 18);
            f27727OooO00o.append(o000O00.KeyCycle_android_translationZ, 19);
            f27727OooO00o.append(o000O00.KeyCycle_motionProgress, 20);
            f27727OooO00o.append(o000O00.KeyCycle_wavePhase, 21);
        }
    }

    public OooOOOO() {
        this.f27707OooO0Oo = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p060o0000o.OooOOO0
    public final void OooO00o(HashMap<String, oo0o0Oo> map) {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("add ");
        sbOooO0O0.append(map.size());
        sbOooO0O0.append(" values");
        String string = sbOooO0O0.toString();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String strOooO00o = ZegoConstants.ZegoVideoDataAuxPublishingStream;
        for (int i = 1; i <= iMin; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0(".(");
            sbOooO0O1.append(stackTrace[i].getFileName());
            sbOooO0O1.append(CertificateUtil.DELIMITER);
            sbOooO0O1.append(stackTrace[i].getLineNumber());
            sbOooO0O1.append(") ");
            sbOooO0O1.append(stackTrace[i].getMethodName());
            String string2 = sbOooO0O1.toString();
            strOooO00o = OooOo00.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            Log.v("KeyCycle", string + strOooO00o + string2 + strOooO00o);
        }
        for (String str : map.keySet()) {
            oo0o0Oo oo0o0oo = map.get(str);
            if (oo0o0oo != null) {
                Objects.requireNonNull(str);
                str.hashCode();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 8;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 9;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 11;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b = 12;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b = bz.k;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27721OooOOo0);
                        break;
                    case 1:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27720OooOOo);
                        break;
                    case 2:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27723OooOo0);
                        break;
                    case 3:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27725OooOo0O);
                        break;
                    case 4:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27726OooOo0o);
                        break;
                    case 5:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27714OooOO0O);
                        break;
                    case 6:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27722OooOOoo);
                        break;
                    case 7:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27724OooOo00);
                        break;
                    case 8:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27718OooOOOO);
                        break;
                    case 9:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27716OooOOO);
                        break;
                    case 10:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27719OooOOOo);
                        break;
                    case 11:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27717OooOOO0);
                        break;
                    case 12:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27708OooO);
                        break;
                    case 13:
                        oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27713OooOO0);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                        }
                        break;
                }
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0 clone() {
        OooOOOO oooOOOO = new OooOOOO();
        super.OooO0OO(this);
        oooOOOO.f27710OooO0o0 = this.f27710OooO0o0;
        oooOOOO.f27709OooO0o = this.f27709OooO0o;
        oooOOOO.f27711OooO0oO = this.f27711OooO0oO;
        oooOOOO.f27712OooO0oo = this.f27712OooO0oo;
        oooOOOO.f27708OooO = this.f27708OooO;
        oooOOOO.f27713OooOO0 = this.f27713OooOO0;
        oooOOOO.f27714OooOO0O = this.f27714OooOO0O;
        oooOOOO.f27715OooOO0o = this.f27715OooOO0o;
        oooOOOO.f27717OooOOO0 = this.f27717OooOOO0;
        oooOOOO.f27716OooOOO = this.f27716OooOOO;
        oooOOOO.f27718OooOOOO = this.f27718OooOOOO;
        oooOOOO.f27719OooOOOo = this.f27719OooOOOo;
        oooOOOO.f27721OooOOo0 = this.f27721OooOOo0;
        oooOOOO.f27720OooOOo = this.f27720OooOOo;
        oooOOOO.f27722OooOOoo = this.f27722OooOOoo;
        oooOOOO.f27724OooOo00 = this.f27724OooOo00;
        oooOOOO.f27723OooOo0 = this.f27723OooOo0;
        oooOOOO.f27725OooOo0O = this.f27725OooOo0O;
        oooOOOO.f27726OooOo0o = this.f27726OooOo0o;
        return oooOOOO;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f27717OooOOO0)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f27716OooOOO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f27718OooOOOO)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f27721OooOOo0)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f27720OooOOo)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f27722OooOOoo)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f27724OooOo00)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f27719OooOOOo)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f27723OooOo0)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f27725OooOo0O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f27726OooOo0o)) {
            hashSet.add("translationZ");
        }
        if (this.f27707OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27707OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyCycle);
        SparseIntArray sparseIntArray = OooO00o.f27727OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27727OooO00o.get(index)) {
                case 1:
                    if (MotionLayout.f7161o0000Oo) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f27705OooO0O0);
                        this.f27705OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f27706OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27706OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f27705OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27705OooO0O0);
                    }
                    break;
                case 2:
                    this.f27704OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f27704OooO00o);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f27710OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f27710OooO0o0);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27711OooO0oO = typedArrayObtainStyledAttributes.getString(index);
                        this.f27709OooO0o = 7;
                    } else {
                        this.f27709OooO0o = typedArrayObtainStyledAttributes.getInt(index, this.f27709OooO0o);
                    }
                    break;
                case 6:
                    this.f27712OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f27712OooO0oo);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f27708OooO = typedArrayObtainStyledAttributes.getDimension(index, this.f27708OooO);
                    } else {
                        this.f27708OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f27708OooO);
                    }
                    break;
                case 8:
                    this.f27715OooOO0o = typedArrayObtainStyledAttributes.getInt(index, this.f27715OooOO0o);
                    break;
                case 9:
                    this.f27717OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27717OooOOO0);
                    break;
                case 10:
                    this.f27716OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f27716OooOOO);
                    break;
                case 11:
                    this.f27718OooOOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f27718OooOOOO);
                    break;
                case 12:
                    this.f27721OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27721OooOOo0);
                    break;
                case 13:
                    this.f27720OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f27720OooOOo);
                    break;
                case 14:
                    this.f27719OooOOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f27719OooOOOo);
                    break;
                case 15:
                    this.f27722OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f27722OooOOoo);
                    break;
                case 16:
                    this.f27724OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f27724OooOo00);
                    break;
                case 17:
                    this.f27723OooOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f27723OooOo0);
                    break;
                case 18:
                    this.f27725OooOo0O = typedArrayObtainStyledAttributes.getDimension(index, this.f27725OooOo0O);
                    break;
                case 19:
                    this.f27726OooOo0o = typedArrayObtainStyledAttributes.getDimension(index, this.f27726OooOo0o);
                    break;
                case 20:
                    this.f27714OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f27714OooOO0O);
                    break;
                case 21:
                    this.f27713OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27713OooOO0) / 360.0f;
                    break;
                default:
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                    sbOooO0O0.append(Integer.toHexString(index));
                    sbOooO0O0.append("   ");
                    sbOooO0O0.append(OooO00o.f27727OooO00o.get(index));
                    Log.e("KeyCycle", sbOooO0O0.toString());
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO0oo(HashMap<String, o0OO00O> map) {
        o0OO00O o0oo00o2;
        float f;
        float f2;
        o0OO00O o0oo00o3;
        for (String str : map.keySet()) {
            byte b = 7;
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f27707OooO0Oo.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.f7497OooO0OO == ConstraintAttribute.AttributeType.FLOAT_TYPE && (o0oo00o2 = map.get(str)) != null) {
                    int i = this.f27704OooO00o;
                    int i2 = this.f27709OooO0o;
                    String str2 = this.f27711OooO0oO;
                    int i3 = this.f27715OooOO0o;
                    o0oo00o2.f27590OooO0o.add(new o00000O.OooO0O0(i, this.f27712OooO0oo, this.f27708OooO, this.f27713OooOO0, constraintAttribute.OooO00o()));
                    if (i3 != -1) {
                        o0oo00o2.f27591OooO0o0 = i3;
                    }
                    o0oo00o2.f27588OooO0OO = i2;
                    o0oo00o2.OooO0OO(constraintAttribute);
                    o0oo00o2.f27589OooO0Oo = str2;
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189617:
                        if (!str.equals("scaleY")) {
                            b = -1;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            b = bz.k;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        f = this.f27721OooOOo0;
                        f2 = f;
                        break;
                    case 1:
                        f = this.f27720OooOOo;
                        f2 = f;
                        break;
                    case 2:
                        f = this.f27723OooOo0;
                        f2 = f;
                        break;
                    case 3:
                        f = this.f27725OooOo0O;
                        f2 = f;
                        break;
                    case 4:
                        f = this.f27726OooOo0o;
                        f2 = f;
                        break;
                    case 5:
                        f = this.f27714OooOO0O;
                        f2 = f;
                        break;
                    case 6:
                        f = this.f27722OooOOoo;
                        f2 = f;
                        break;
                    case 7:
                        f = this.f27724OooOo00;
                        f2 = f;
                        break;
                    case 8:
                        f = this.f27718OooOOOO;
                        f2 = f;
                        break;
                    case 9:
                        f = this.f27716OooOOO;
                        f2 = f;
                        break;
                    case 10:
                        f = this.f27719OooOOOo;
                        f2 = f;
                        break;
                    case 11:
                        f = this.f27717OooOOO0;
                        f2 = f;
                        break;
                    case 12:
                        f = this.f27708OooO;
                        f2 = f;
                        break;
                    case 13:
                        f = this.f27713OooOO0;
                        f2 = f;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                        }
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2) && (o0oo00o3 = map.get(str)) != null) {
                    int i4 = this.f27704OooO00o;
                    int i5 = this.f27709OooO0o;
                    String str3 = this.f27711OooO0oO;
                    int i6 = this.f27715OooOO0o;
                    o0oo00o3.f27590OooO0o.add(new o00000O.OooO0O0(i4, this.f27712OooO0oo, this.f27708OooO, this.f27713OooOO0, f2));
                    if (i6 != -1) {
                        o0oo00o3.f27591OooO0o0 = i6;
                    }
                    o0oo00o3.f27588OooO0OO = i5;
                    o0oo00o3.f27589OooO0Oo = str3;
                }
            }
        }
    }
}
