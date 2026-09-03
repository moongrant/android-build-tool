package p060o0000o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p016OooOoO0.OooOo00;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27743OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27742OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f27744OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27745OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27741OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27746OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27747OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27748OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27750OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27749OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f27751OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27752OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f27754OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f27753OooOOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f27755OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f27756OooOo00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27757OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27757OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyTimeCycle_android_alpha, 1);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_elevation, 2);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_rotation, 4);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_rotationX, 5);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_rotationY, 6);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_scaleX, 7);
            f27757OooO00o.append(o000O00.KeyTimeCycle_transitionPathRotate, 8);
            f27757OooO00o.append(o000O00.KeyTimeCycle_transitionEasing, 9);
            f27757OooO00o.append(o000O00.KeyTimeCycle_motionTarget, 10);
            f27757OooO00o.append(o000O00.KeyTimeCycle_framePosition, 12);
            f27757OooO00o.append(o000O00.KeyTimeCycle_curveFit, 13);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_scaleY, 14);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_translationX, 15);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_translationY, 16);
            f27757OooO00o.append(o000O00.KeyTimeCycle_android_translationZ, 17);
            f27757OooO00o.append(o000O00.KeyTimeCycle_motionProgress, 18);
            f27757OooO00o.append(o000O00.KeyTimeCycle_wavePeriod, 20);
            f27757OooO00o.append(o000O00.KeyTimeCycle_waveOffset, 21);
            f27757OooO00o.append(o000O00.KeyTimeCycle_waveShape, 19);
        }
    }

    public Oooo0() {
        this.f27707OooO0Oo = new HashMap<>();
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO00o(HashMap<String, oo0o0Oo> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p060o0000o.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0 clone() {
        Oooo0 oooo0 = new Oooo0();
        super.OooO0OO(this);
        oooo0.f27743OooO0o0 = this.f27743OooO0o0;
        oooo0.f27753OooOOo = this.f27753OooOOo;
        oooo0.f27755OooOOoo = this.f27755OooOOoo;
        oooo0.f27756OooOo00 = this.f27756OooOo00;
        oooo0.f27754OooOOo0 = this.f27754OooOOo0;
        oooo0.f27742OooO0o = this.f27742OooO0o;
        oooo0.f27744OooO0oO = this.f27744OooO0oO;
        oooo0.f27745OooO0oo = this.f27745OooO0oo;
        oooo0.f27747OooOO0O = this.f27747OooOO0O;
        oooo0.f27741OooO = this.f27741OooO;
        oooo0.f27746OooOO0 = this.f27746OooOO0;
        oooo0.f27748OooOO0o = this.f27748OooOO0o;
        oooo0.f27750OooOOO0 = this.f27750OooOOO0;
        oooo0.f27749OooOOO = this.f27749OooOOO;
        oooo0.f27751OooOOOO = this.f27751OooOOOO;
        oooo0.f27752OooOOOo = this.f27752OooOOOo;
        return oooo0;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f27742OooO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f27744OooO0oO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f27745OooO0oo)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f27741OooO)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f27746OooOO0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f27749OooOOO)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f27751OooOOOO)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f27752OooOOOo)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f27747OooOO0O)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f27748OooOO0o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f27750OooOOO0)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f27754OooOOo0)) {
            hashSet.add("progress");
        }
        if (this.f27707OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27707OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o(HashMap<String, Integer> map) {
        if (this.f27743OooO0o0 == -1) {
            return;
        }
        if (!Float.isNaN(this.f27742OooO0o)) {
            map.put("alpha", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27744OooO0oO)) {
            map.put("elevation", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27745OooO0oo)) {
            map.put("rotation", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27741OooO)) {
            map.put("rotationX", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27746OooOO0)) {
            map.put("rotationY", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27749OooOOO)) {
            map.put("translationX", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27751OooOOOO)) {
            map.put("translationY", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27752OooOOOo)) {
            map.put("translationZ", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27747OooOO0O)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27748OooOO0o)) {
            map.put("scaleX", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27748OooOO0o)) {
            map.put("scaleY", Integer.valueOf(this.f27743OooO0o0));
        }
        if (!Float.isNaN(this.f27754OooOOo0)) {
            map.put("progress", Integer.valueOf(this.f27743OooO0o0));
        }
        if (this.f27707OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27707OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                map.put(OooOo00.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f27743OooO0o0));
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyTimeCycle);
        SparseIntArray sparseIntArray = OooO00o.f27757OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27757OooO00o.get(index)) {
                case 1:
                    this.f27742OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27742OooO0o);
                    break;
                case 2:
                    this.f27744OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f27744OooO0oO);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                    sbOooO0O0.append(Integer.toHexString(index));
                    sbOooO0O0.append("   ");
                    sbOooO0O0.append(OooO00o.f27757OooO00o.get(index));
                    Log.e("KeyTimeCycle", sbOooO0O0.toString());
                    break;
                case 4:
                    this.f27745OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f27745OooO0oo);
                    break;
                case 5:
                    this.f27741OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f27741OooO);
                    break;
                case 6:
                    this.f27746OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27746OooOO0);
                    break;
                case 7:
                    this.f27748OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27748OooOO0o);
                    break;
                case 8:
                    this.f27747OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f27747OooOO0O);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f27704OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f27704OooO00o);
                    break;
                case 13:
                    this.f27743OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f27743OooO0o0);
                    break;
                case 14:
                    this.f27750OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27750OooOOO0);
                    break;
                case 15:
                    this.f27749OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f27749OooOOO);
                    break;
                case 16:
                    this.f27751OooOOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f27751OooOOOO);
                    break;
                case 17:
                    this.f27752OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f27752OooOOOo);
                    break;
                case 18:
                    this.f27754OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27754OooOOo0);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f27753OooOOo = 7;
                    } else {
                        this.f27753OooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f27753OooOOo);
                    }
                    break;
                case 20:
                    this.f27755OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f27755OooOOoo);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f27756OooOo00 = typedArrayObtainStyledAttributes.getDimension(index, this.f27756OooOo00);
                    } else {
                        this.f27756OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f27756OooOo00);
                    }
                    break;
            }
        }
    }
}
