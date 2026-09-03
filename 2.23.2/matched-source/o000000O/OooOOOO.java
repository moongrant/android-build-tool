package o000000O;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33292OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33291OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33293OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33294OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33290OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33295OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33296OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33297OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33299OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33298OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33300OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33301OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33303OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f33302OooOOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33304OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f33305OooOo00 = 0.0f;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f33306OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33306OooO00o = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_alpha, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_elevation, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_rotation, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_rotationX, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_rotationY, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_scaleX, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_transitionPathRotate, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_transitionEasing, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_motionTarget, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_framePosition, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_curveFit, 13);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_scaleY, 14);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_translationX, 15);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_translationY, 16);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_android_translationZ, 17);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_motionProgress, 18);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_wavePeriod, 20);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_waveOffset, 21);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTimeCycle_waveShape, 19);
        }
    }

    public OooOOOO() {
        this.f33255OooO0Oo = new HashMap<>();
    }

    @Override // o000000O.OooO0o
    public final void OooO00o(HashMap<String, o000000.OooO0o> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // o000000O.OooO0o
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooO0o clone() {
        OooOOOO oooOOOO = new OooOOOO();
        super.OooO0OO(this);
        oooOOOO.f33292OooO0o0 = this.f33292OooO0o0;
        oooOOOO.f33302OooOOo = this.f33302OooOOo;
        oooOOOO.f33304OooOOoo = this.f33304OooOOoo;
        oooOOOO.f33305OooOo00 = this.f33305OooOo00;
        oooOOOO.f33303OooOOo0 = this.f33303OooOOo0;
        oooOOOO.f33291OooO0o = this.f33291OooO0o;
        oooOOOO.f33293OooO0oO = this.f33293OooO0oO;
        oooOOOO.f33294OooO0oo = this.f33294OooO0oo;
        oooOOOO.f33296OooOO0O = this.f33296OooOO0O;
        oooOOOO.f33290OooO = this.f33290OooO;
        oooOOOO.f33295OooOO0 = this.f33295OooOO0;
        oooOOOO.f33297OooOO0o = this.f33297OooOO0o;
        oooOOOO.f33299OooOOO0 = this.f33299OooOOO0;
        oooOOOO.f33298OooOOO = this.f33298OooOOO;
        oooOOOO.f33300OooOOOO = this.f33300OooOOOO;
        oooOOOO.f33301OooOOOo = this.f33301OooOOOo;
        return oooOOOO;
    }

    @Override // o000000O.OooO0o
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f33291OooO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f33293OooO0oO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f33294OooO0oo)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f33290OooO)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f33295OooOO0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f33298OooOOO)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f33300OooOOOO)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f33301OooOOOo)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f33296OooOO0O)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f33297OooOO0o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f33299OooOOO0)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f33303OooOOo0)) {
            hashSet.add("progress");
        }
        if (this.f33255OooO0Oo.size() > 0) {
            Iterator<String> it = this.f33255OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO0o(HashMap<String, Integer> map) {
        if (this.f33292OooO0o0 == -1) {
            return;
        }
        if (!Float.isNaN(this.f33291OooO0o)) {
            map.put("alpha", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33293OooO0oO)) {
            map.put("elevation", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33294OooO0oo)) {
            map.put("rotation", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33290OooO)) {
            map.put("rotationX", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33295OooOO0)) {
            map.put("rotationY", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33298OooOOO)) {
            map.put("translationX", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33300OooOOOO)) {
            map.put("translationY", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33301OooOOOo)) {
            map.put("translationZ", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33296OooOO0O)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33297OooOO0o)) {
            map.put("scaleX", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33297OooOO0o)) {
            map.put("scaleY", Integer.valueOf(this.f33292OooO0o0));
        }
        if (!Float.isNaN(this.f33303OooOOo0)) {
            map.put("progress", Integer.valueOf(this.f33292OooO0o0));
        }
        if (this.f33255OooO0Oo.size() > 0) {
            Iterator<String> it = this.f33255OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                map.put(o00O00OO.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f33292OooO0o0));
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.KeyTimeCycle);
        SparseIntArray sparseIntArray = OooO00o.f33306OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f33306OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f33291OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f33291OooO0o);
                    break;
                case 2:
                    this.f33293OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f33293OooO0oO);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f33294OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f33294OooO0oo);
                    break;
                case 5:
                    this.f33290OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f33290OooO);
                    break;
                case 6:
                    this.f33295OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33295OooOO0);
                    break;
                case 7:
                    this.f33297OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f33297OooOO0o);
                    break;
                case 8:
                    this.f33296OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f33296OooOO0O);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f4578o00o0O) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f33253OooO0O0);
                        this.f33253OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f33254OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33254OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f33253OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33253OooO0O0);
                    }
                    break;
                case 12:
                    this.f33252OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f33252OooO00o);
                    break;
                case 13:
                    this.f33292OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f33292OooO0o0);
                    break;
                case 14:
                    this.f33299OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33299OooOOO0);
                    break;
                case 15:
                    this.f33298OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f33298OooOOO);
                    break;
                case 16:
                    this.f33300OooOOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f33300OooOOOO);
                    break;
                case 17:
                    this.f33301OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f33301OooOOOo);
                    break;
                case 18:
                    this.f33303OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33303OooOOo0);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f33302OooOOo = 7;
                    } else {
                        this.f33302OooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f33302OooOOo);
                    }
                    break;
                case 20:
                    this.f33304OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f33304OooOOoo);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f33305OooOo00 = typedArrayObtainStyledAttributes.getDimension(index, this.f33305OooOo00);
                    } else {
                        this.f33305OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f33305OooOo00);
                    }
                    break;
            }
        }
    }
}
