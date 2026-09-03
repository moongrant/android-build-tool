package p060o0000o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.bz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p016OooOoO0.OooOo00;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27690OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27689OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f27691OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27692OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27688OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27693OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27694OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27695OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27697OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27696OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f27698OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27699OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f27701OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f27700OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f27702OooOOoo = Float.NaN;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27703OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27703OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyAttribute_android_alpha, 1);
            f27703OooO00o.append(o000O00.KeyAttribute_android_elevation, 2);
            f27703OooO00o.append(o000O00.KeyAttribute_android_rotation, 4);
            f27703OooO00o.append(o000O00.KeyAttribute_android_rotationX, 5);
            f27703OooO00o.append(o000O00.KeyAttribute_android_rotationY, 6);
            f27703OooO00o.append(o000O00.KeyAttribute_android_transformPivotX, 19);
            f27703OooO00o.append(o000O00.KeyAttribute_android_transformPivotY, 20);
            f27703OooO00o.append(o000O00.KeyAttribute_android_scaleX, 7);
            f27703OooO00o.append(o000O00.KeyAttribute_transitionPathRotate, 8);
            f27703OooO00o.append(o000O00.KeyAttribute_transitionEasing, 9);
            f27703OooO00o.append(o000O00.KeyAttribute_motionTarget, 10);
            f27703OooO00o.append(o000O00.KeyAttribute_framePosition, 12);
            f27703OooO00o.append(o000O00.KeyAttribute_curveFit, 13);
            f27703OooO00o.append(o000O00.KeyAttribute_android_scaleY, 14);
            f27703OooO00o.append(o000O00.KeyAttribute_android_translationX, 15);
            f27703OooO00o.append(o000O00.KeyAttribute_android_translationY, 16);
            f27703OooO00o.append(o000O00.KeyAttribute_android_translationZ, 17);
            f27703OooO00o.append(o000O00.KeyAttribute_motionProgress, 18);
        }
    }

    public OooOOO() {
        this.f27707OooO0Oo = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p060o0000o.OooOOO0
    public final void OooO00o(HashMap<String, oo0o0Oo> map) {
        for (String str : map.keySet()) {
            oo0o0Oo oo0o0oo = map.get(str);
            if (oo0o0oo != null) {
                byte b = 7;
                if (!str.startsWith("CUSTOM")) {
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
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                b = 8;
                            } else {
                                b = -1;
                            }
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                b = 9;
                            } else {
                                b = -1;
                            }
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                b = 10;
                            } else {
                                b = -1;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                b = 11;
                            } else {
                                b = -1;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                b = 12;
                            } else {
                                b = -1;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
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
                            if (!Float.isNaN(this.f27688OooO)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27688OooO);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f27693OooOO0)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27693OooOO0);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f27699OooOOOo)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27699OooOOOo);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f27701OooOOo0)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27701OooOOo0);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f27700OooOOo)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27700OooOOo);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f27702OooOOoo)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27702OooOOoo);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f27696OooOOO)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27696OooOOO);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f27698OooOOOO)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27698OooOOOO);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f27688OooO)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27694OooOO0O);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f27693OooOO0)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27695OooOO0o);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f27692OooO0oo)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27692OooO0oo);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f27691OooO0oO)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27691OooO0oO);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.f27697OooOOO0)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27697OooOOO0);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.f27689OooO0o)) {
                                oo0o0oo.OooO0OO(this.f27704OooO00o, this.f27689OooO0o);
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f27707OooO0Oo.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((oo0o0Oo.OooO0O0) oo0o0oo).f27930OooO0o.append(this.f27704OooO00o, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0 clone() {
        OooOOO oooOOO = new OooOOO();
        super.OooO0OO(this);
        oooOOO.f27690OooO0o0 = this.f27690OooO0o0;
        oooOOO.f27689OooO0o = this.f27689OooO0o;
        oooOOO.f27691OooO0oO = this.f27691OooO0oO;
        oooOOO.f27692OooO0oo = this.f27692OooO0oo;
        oooOOO.f27688OooO = this.f27688OooO;
        oooOOO.f27693OooOO0 = this.f27693OooOO0;
        oooOOO.f27694OooOO0O = this.f27694OooOO0O;
        oooOOO.f27695OooOO0o = this.f27695OooOO0o;
        oooOOO.f27697OooOOO0 = this.f27697OooOOO0;
        oooOOO.f27696OooOOO = this.f27696OooOOO;
        oooOOO.f27698OooOOOO = this.f27698OooOOOO;
        oooOOO.f27699OooOOOo = this.f27699OooOOOo;
        oooOOO.f27701OooOOo0 = this.f27701OooOOo0;
        oooOOO.f27700OooOOo = this.f27700OooOOo;
        oooOOO.f27702OooOOoo = this.f27702OooOOoo;
        return oooOOO;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f27689OooO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f27691OooO0oO)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f27692OooO0oo)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f27688OooO)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f27693OooOO0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f27694OooOO0O)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f27695OooOO0o)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f27699OooOOOo)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f27701OooOOo0)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f27700OooOOo)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f27697OooOOO0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f27696OooOOO)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f27698OooOOOO)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f27702OooOOoo)) {
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
        if (this.f27690OooO0o0 == -1) {
            return;
        }
        if (!Float.isNaN(this.f27689OooO0o)) {
            map.put("alpha", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27691OooO0oO)) {
            map.put("elevation", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27692OooO0oo)) {
            map.put("rotation", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27688OooO)) {
            map.put("rotationX", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27693OooOO0)) {
            map.put("rotationY", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27694OooOO0O)) {
            map.put("transformPivotX", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27695OooOO0o)) {
            map.put("transformPivotY", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27699OooOOOo)) {
            map.put("translationX", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27701OooOOo0)) {
            map.put("translationY", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27700OooOOo)) {
            map.put("translationZ", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27697OooOOO0)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27696OooOOO)) {
            map.put("scaleX", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27698OooOOOO)) {
            map.put("scaleY", Integer.valueOf(this.f27690OooO0o0));
        }
        if (!Float.isNaN(this.f27702OooOOoo)) {
            map.put("progress", Integer.valueOf(this.f27690OooO0o0));
        }
        if (this.f27707OooO0Oo.size() > 0) {
            Iterator<String> it = this.f27707OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                map.put(OooOo00.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f27690OooO0o0));
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyAttribute);
        SparseIntArray sparseIntArray = OooO00o.f27703OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27703OooO00o.get(index)) {
                case 1:
                    this.f27689OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27689OooO0o);
                    break;
                case 2:
                    this.f27691OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f27691OooO0oO);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                    sbOooO0O0.append(Integer.toHexString(index));
                    sbOooO0O0.append("   ");
                    sbOooO0O0.append(OooO00o.f27703OooO00o.get(index));
                    Log.e("KeyAttribute", sbOooO0O0.toString());
                    break;
                case 4:
                    this.f27692OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f27692OooO0oo);
                    break;
                case 5:
                    this.f27688OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f27688OooO);
                    break;
                case 6:
                    this.f27693OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27693OooOO0);
                    break;
                case 7:
                    this.f27696OooOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f27696OooOOO);
                    break;
                case 8:
                    this.f27697OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27697OooOOO0);
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
                    this.f27690OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f27690OooO0o0);
                    break;
                case 14:
                    this.f27698OooOOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f27698OooOOOO);
                    break;
                case 15:
                    this.f27699OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f27699OooOOOo);
                    break;
                case 16:
                    this.f27701OooOOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f27701OooOOo0);
                    break;
                case 17:
                    this.f27700OooOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f27700OooOOo);
                    break;
                case 18:
                    this.f27702OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f27702OooOOoo);
                    break;
                case 19:
                    this.f27694OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f27694OooOO0O);
                    break;
                case 20:
                    this.f27695OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f27695OooOO0o);
                    break;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooO0oo(String str, Object obj) {
        byte b = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b = bz.k;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b = bz.l;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b = bz.m;
                }
                break;
            case 1941332754:
                if (str.equals(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY)) {
                    b = bz.n;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f27702OooOOoo = OooO0oO(obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f27688OooO = OooO0oO(obj);
                break;
            case 3:
                this.f27693OooOO0 = OooO0oO(obj);
                break;
            case 4:
                this.f27699OooOOOo = OooO0oO(obj);
                break;
            case 5:
                this.f27701OooOOo0 = OooO0oO(obj);
                break;
            case 6:
                this.f27700OooOOo = OooO0oO(obj);
                break;
            case 7:
                this.f27696OooOOO = OooO0oO(obj);
                break;
            case 8:
                this.f27698OooOOOO = OooO0oO(obj);
                break;
            case 9:
                this.f27694OooOO0O = OooO0oO(obj);
                break;
            case 10:
                this.f27695OooOO0o = OooO0oO(obj);
                break;
            case 11:
                this.f27692OooO0oo = OooO0oO(obj);
                break;
            case 12:
                this.f27691OooO0oO = OooO0oO(obj);
                break;
            case 13:
                this.f27697OooOOO0 = OooO0oO(obj);
                break;
            case 14:
                this.f27689OooO0o = OooO0oO(obj);
                break;
            case 15:
                this.f27690OooO0o0 = obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                } else {
                    ((Boolean) obj).booleanValue();
                }
                break;
        }
    }
}
