package o000000O;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33753OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33752OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33754OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33755OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33751OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33756OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33757OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33758OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33760OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33759OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33761OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33762OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33764OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f33763OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33765OooOOoo = Float.NaN;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f33766OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33766OooO00o = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_alpha, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_elevation, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_rotation, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_rotationX, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_rotationY, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_transformPivotX, 19);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_transformPivotY, 20);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_scaleX, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_transitionPathRotate, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_transitionEasing, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_motionTarget, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_framePosition, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_curveFit, 13);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_scaleY, 14);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_translationX, 15);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_translationY, 16);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_android_translationZ, 17);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyAttribute_motionProgress, 18);
        }
    }

    public OooO() {
        this.f33770OooO0Oo = new HashMap<>();
    }

    @Override // o000000O.OooO0o
    public final void OooO00o(HashMap<String, o000000.OooO0o> map) {
        for (String str : map.keySet()) {
            o000000.OooO0o oooO0o = map.get(str);
            if (oooO0o != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f33751OooO)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33751OooO, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f33756OooOO0)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33756OooOO0, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f33762OooOOOo)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33762OooOOOo, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f33764OooOOo0)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33764OooOOo0, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f33763OooOOo)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33763OooOOo, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f33765OooOOoo)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33765OooOOoo, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f33759OooOOO)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33759OooOOO, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f33761OooOOOO)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33761OooOOOO, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f33751OooO)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33757OooOO0O, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f33756OooOO0)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33758OooOO0o, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f33755OooO0oo)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33755OooO0oo, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f33754OooO0oO)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33754OooO0oO, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f33760OooOOO0)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33760OooOOO0, this.f33767OooO00o);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f33752OooO0o)) {
                                break;
                            } else {
                                oooO0o.OooO0O0(this.f33752OooO0o, this.f33767OooO00o);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f33770OooO0Oo.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((o000000.OooO0o.OooO0O0) oooO0o).f33748OooO0o.append(this.f33767OooO00o, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // o000000O.OooO0o
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooO0o clone() {
        OooO oooO = new OooO();
        super.OooO0OO(this);
        oooO.f33753OooO0o0 = this.f33753OooO0o0;
        oooO.f33752OooO0o = this.f33752OooO0o;
        oooO.f33754OooO0oO = this.f33754OooO0oO;
        oooO.f33755OooO0oo = this.f33755OooO0oo;
        oooO.f33751OooO = this.f33751OooO;
        oooO.f33756OooOO0 = this.f33756OooOO0;
        oooO.f33757OooOO0O = this.f33757OooOO0O;
        oooO.f33758OooOO0o = this.f33758OooOO0o;
        oooO.f33760OooOOO0 = this.f33760OooOOO0;
        oooO.f33759OooOOO = this.f33759OooOOO;
        oooO.f33761OooOOOO = this.f33761OooOOOO;
        oooO.f33762OooOOOo = this.f33762OooOOOo;
        oooO.f33764OooOOo0 = this.f33764OooOOo0;
        oooO.f33763OooOOo = this.f33763OooOOo;
        oooO.f33765OooOOoo = this.f33765OooOOoo;
        return oooO;
    }

    @Override // o000000O.OooO0o
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f33752OooO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f33754OooO0oO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f33755OooO0oo)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f33751OooO)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f33756OooOO0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f33757OooOO0O)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f33758OooOO0o)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f33762OooOOOo)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f33764OooOOo0)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f33763OooOOo)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f33760OooOOO0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f33759OooOOO)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f33761OooOOOO)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f33765OooOOoo)) {
            hashSet.add("progress");
        }
        if (this.f33770OooO0Oo.size() > 0) {
            Iterator<String> it = this.f33770OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO0o(HashMap<String, Integer> map) {
        if (this.f33753OooO0o0 == -1) {
            return;
        }
        if (!Float.isNaN(this.f33752OooO0o)) {
            map.put("alpha", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33754OooO0oO)) {
            map.put("elevation", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33755OooO0oo)) {
            map.put("rotation", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33751OooO)) {
            map.put("rotationX", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33756OooOO0)) {
            map.put("rotationY", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33757OooOO0O)) {
            map.put("transformPivotX", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33758OooOO0o)) {
            map.put("transformPivotY", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33762OooOOOo)) {
            map.put("translationX", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33764OooOOo0)) {
            map.put("translationY", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33763OooOOo)) {
            map.put("translationZ", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33760OooOOO0)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33759OooOOO)) {
            map.put("scaleX", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33761OooOOOO)) {
            map.put("scaleY", Integer.valueOf(this.f33753OooO0o0));
        }
        if (!Float.isNaN(this.f33765OooOOoo)) {
            map.put("progress", Integer.valueOf(this.f33753OooO0o0));
        }
        if (this.f33770OooO0Oo.size() > 0) {
            Iterator<String> it = this.f33770OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                map.put(o00O00OO.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f33753OooO0o0));
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.KeyAttribute);
        SparseIntArray sparseIntArray = OooO00o.f33766OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f33766OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f33752OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f33752OooO0o);
                    break;
                case 2:
                    this.f33754OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f33754OooO0oO);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f33755OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f33755OooO0oo);
                    break;
                case 5:
                    this.f33751OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f33751OooO);
                    break;
                case 6:
                    this.f33756OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33756OooOO0);
                    break;
                case 7:
                    this.f33759OooOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f33759OooOOO);
                    break;
                case 8:
                    this.f33760OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33760OooOOO0);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f4572o00o0O) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f33768OooO0O0);
                        this.f33768OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f33769OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33769OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f33768OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33768OooO0O0);
                    }
                    break;
                case 12:
                    this.f33767OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f33767OooO00o);
                    break;
                case 13:
                    this.f33753OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f33753OooO0o0);
                    break;
                case 14:
                    this.f33761OooOOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f33761OooOOOO);
                    break;
                case 15:
                    this.f33762OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f33762OooOOOo);
                    break;
                case 16:
                    this.f33764OooOOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f33764OooOOo0);
                    break;
                case 17:
                    this.f33763OooOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f33763OooOOo);
                    break;
                case 18:
                    this.f33765OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f33765OooOOoo);
                    break;
                case 19:
                    this.f33757OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f33757OooOO0O);
                    break;
                case 20:
                    this.f33758OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f33758OooOO0o);
                    break;
            }
        }
    }

    public final void OooO0oo(Object obj, String str) {
        switch (str) {
            case "motionProgress":
                this.f33765OooOOoo = OooO0o.OooO0oO((Number) obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f33751OooO = OooO0o.OooO0oO((Number) obj);
                break;
            case "rotationY":
                this.f33756OooOO0 = OooO0o.OooO0oO((Number) obj);
                break;
            case "translationX":
                this.f33762OooOOOo = OooO0o.OooO0oO((Number) obj);
                break;
            case "translationY":
                this.f33764OooOOo0 = OooO0o.OooO0oO((Number) obj);
                break;
            case "translationZ":
                this.f33763OooOOo = OooO0o.OooO0oO((Number) obj);
                break;
            case "scaleX":
                this.f33759OooOOO = OooO0o.OooO0oO((Number) obj);
                break;
            case "scaleY":
                this.f33761OooOOOO = OooO0o.OooO0oO((Number) obj);
                break;
            case "transformPivotX":
                this.f33757OooOO0O = OooO0o.OooO0oO((Number) obj);
                break;
            case "transformPivotY":
                this.f33758OooOO0o = OooO0o.OooO0oO((Number) obj);
                break;
            case "rotation":
                this.f33755OooO0oo = OooO0o.OooO0oO((Number) obj);
                break;
            case "elevation":
                this.f33754OooO0oO = OooO0o.OooO0oO((Number) obj);
                break;
            case "transitionPathRotate":
                this.f33760OooOOO0 = OooO0o.OooO0oO((Number) obj);
                break;
            case "alpha":
                this.f33752OooO0o = OooO0o.OooO0oO((Number) obj);
                break;
            case "curveFit":
                Number number = (Number) obj;
                this.f33753OooO0o0 = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "visibility":
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                } else {
                    ((Boolean) obj).booleanValue();
                    break;
                }
                break;
        }
    }
}
