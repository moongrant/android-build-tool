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
    public int f27723OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27722OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f27724OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27725OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27721OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27726OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27727OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27728OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27730OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27729OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f27731OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27732OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f27734OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f27733OooOOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f27735OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f27736OooOo00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27737OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27737OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyTimeCycle_android_alpha, 1);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_elevation, 2);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_rotation, 4);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_rotationX, 5);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_rotationY, 6);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_scaleX, 7);
            f27737OooO00o.append(o000O00.KeyTimeCycle_transitionPathRotate, 8);
            f27737OooO00o.append(o000O00.KeyTimeCycle_transitionEasing, 9);
            f27737OooO00o.append(o000O00.KeyTimeCycle_motionTarget, 10);
            f27737OooO00o.append(o000O00.KeyTimeCycle_framePosition, 12);
            f27737OooO00o.append(o000O00.KeyTimeCycle_curveFit, 13);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_scaleY, 14);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_translationX, 15);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_translationY, 16);
            f27737OooO00o.append(o000O00.KeyTimeCycle_android_translationZ, 17);
            f27737OooO00o.append(o000O00.KeyTimeCycle_motionProgress, 18);
            f27737OooO00o.append(o000O00.KeyTimeCycle_wavePeriod, 20);
            f27737OooO00o.append(o000O00.KeyTimeCycle_waveOffset, 21);
            f27737OooO00o.append(o000O00.KeyTimeCycle_waveShape, 19);
        }
    }

    public Oooo0() {
        this.f27687OooO0Oo = new HashMap<>();
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
        oooo0.f27723OooO0o0 = this.f27723OooO0o0;
        oooo0.f27733OooOOo = this.f27733OooOOo;
        oooo0.f27735OooOOoo = this.f27735OooOOoo;
        oooo0.f27736OooOo00 = this.f27736OooOo00;
        oooo0.f27734OooOOo0 = this.f27734OooOOo0;
        oooo0.f27722OooO0o = this.f27722OooO0o;
        oooo0.f27724OooO0oO = this.f27724OooO0oO;
        oooo0.f27725OooO0oo = this.f27725OooO0oo;
        oooo0.f27727OooOO0O = this.f27727OooOO0O;
        oooo0.f27721OooO = this.f27721OooO;
        oooo0.f27726OooOO0 = this.f27726OooOO0;
        oooo0.f27728OooOO0o = this.f27728OooOO0o;
        oooo0.f27730OooOOO0 = this.f27730OooOOO0;
        oooo0.f27729OooOOO = this.f27729OooOOO;
        oooo0.f27731OooOOOO = this.f27731OooOOOO;
        oooo0.f27732OooOOOo = this.f27732OooOOOo;
        return oooo0;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f27722OooO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f27724OooO0oO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f27725OooO0oo)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f27721OooO)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f27726OooOO0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f27729OooOOO)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f27731OooOOOO)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f27732OooOOOo)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f27727OooOO0O)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f27728OooOO0o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f27730OooOOO0)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f27734OooOOo0)) {
            hashSet.add("progress");
        }
        if (this.f27687OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27687OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o(HashMap<String, Integer> map) {
        if (this.f27723OooO0o0 == -1) {
            return;
        }
        if (!Float.isNaN(this.f27722OooO0o)) {
            map.put("alpha", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27724OooO0oO)) {
            map.put("elevation", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27725OooO0oo)) {
            map.put("rotation", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27721OooO)) {
            map.put("rotationX", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27726OooOO0)) {
            map.put("rotationY", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27729OooOOO)) {
            map.put("translationX", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27731OooOOOO)) {
            map.put("translationY", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27732OooOOOo)) {
            map.put("translationZ", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27727OooOO0O)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27728OooOO0o)) {
            map.put("scaleX", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27728OooOO0o)) {
            map.put("scaleY", Integer.valueOf(this.f27723OooO0o0));
        }
        if (!Float.isNaN(this.f27734OooOOo0)) {
            map.put("progress", Integer.valueOf(this.f27723OooO0o0));
        }
        if (this.f27687OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27687OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                map.put(OooOo00.OooO0Oo("CUSTOM,", it.next()), Integer.valueOf(this.f27723OooO0o0));
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyTimeCycle);
        SparseIntArray sparseIntArray = OooO00o.f27737OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27737OooO00o.get(index)) {
                case 1:
                    this.f27722OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27722OooO0o);
                    break;
                case 2:
                    this.f27724OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f27724OooO0oO);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unused attribute 0x");
                    sbOooO0o0.append(Integer.toHexString(index));
                    sbOooO0o0.append("   ");
                    sbOooO0o0.append(OooO00o.f27737OooO00o.get(index));
                    Log.e("KeyTimeCycle", sbOooO0o0.toString());
                    break;
                case 4:
                    this.f27725OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f27725OooO0oo);
                    break;
                case 5:
                    this.f27721OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f27721OooO);
                    break;
                case 6:
                    this.f27726OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27726OooOO0);
                    break;
                case 7:
                    this.f27728OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27728OooOO0o);
                    break;
                case 8:
                    this.f27727OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f27727OooOO0O);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f7146o0000OOO) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f27685OooO0O0);
                        this.f27685OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f27686OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27686OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f27685OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27685OooO0O0);
                    }
                    break;
                case 12:
                    this.f27684OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f27684OooO00o);
                    break;
                case 13:
                    this.f27723OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f27723OooO0o0);
                    break;
                case 14:
                    this.f27730OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27730OooOOO0);
                    break;
                case 15:
                    this.f27729OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f27729OooOOO);
                    break;
                case 16:
                    this.f27731OooOOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f27731OooOOOO);
                    break;
                case 17:
                    this.f27732OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f27732OooOOOo);
                    break;
                case 18:
                    this.f27734OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27734OooOOo0);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f27733OooOOo = 7;
                    } else {
                        this.f27733OooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f27733OooOOo);
                    }
                    break;
                case 20:
                    this.f27735OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f27735OooOOoo);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f27736OooOo00 = typedArrayObtainStyledAttributes.getDimension(index, this.f27736OooOo00);
                    } else {
                        this.f27736OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f27736OooOo00);
                    }
                    break;
            }
        }
    }
}
