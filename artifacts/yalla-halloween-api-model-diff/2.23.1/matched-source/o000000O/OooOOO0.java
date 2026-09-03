package o000000O;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p418o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f33277OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33278OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33279OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33276OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33280OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33281OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33282OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33284OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33283OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33285OooOOOO = 0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f33286OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33286OooO00o = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_motionTarget, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_framePosition, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_transitionEasing, 3);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_curveFit, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_drawPath, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_percentX, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_percentY, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_keyPositionType, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_sizePercent, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_percentWidth, 11);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_percentHeight, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyPosition_pathMotionArc, 10);
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO00o(HashMap<String, o000000.OooO0o> map) {
    }

    @Override // o000000O.OooO0o
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooO0o clone() {
        OooOOO0 oooOOO0 = new OooOOO0();
        super.OooO0OO(this);
        oooOOO0.f33277OooO0o = this.f33277OooO0o;
        oooOOO0.f33278OooO0oO = this.f33278OooO0oO;
        oooOOO0.f33279OooO0oo = this.f33279OooO0oo;
        oooOOO0.f33276OooO = this.f33276OooO;
        oooOOO0.f33280OooOO0 = Float.NaN;
        oooOOO0.f33281OooOO0O = this.f33281OooOO0O;
        oooOOO0.f33282OooOO0o = this.f33282OooOO0o;
        oooOOO0.f33284OooOOO0 = this.f33284OooOOO0;
        oooOOO0.f33283OooOOO = this.f33283OooOOO;
        return oooOOO0;
    }

    @Override // o000000O.OooO0o
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.KeyPosition);
        SparseIntArray sparseIntArray = OooO00o.f33286OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f33286OooO00o;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33277OooO0o = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f33277OooO0o = oO00Oo00.f46472OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f33275OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f33275OooO0o0);
                    break;
                case 5:
                    this.f33279OooO0oo = typedArrayObtainStyledAttributes.getInt(index, this.f33279OooO0oo);
                    break;
                case 6:
                    this.f33281OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f33281OooOO0O);
                    break;
                case 7:
                    this.f33282OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f33282OooOO0o);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f33280OooOO0);
                    this.f33276OooO = f;
                    this.f33280OooOO0 = f;
                    break;
                case 9:
                    this.f33285OooOOOO = typedArrayObtainStyledAttributes.getInt(index, this.f33285OooOOOO);
                    break;
                case 10:
                    this.f33278OooO0oO = typedArrayObtainStyledAttributes.getInt(index, this.f33278OooO0oO);
                    break;
                case 11:
                    this.f33276OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f33276OooO);
                    break;
                case 12:
                    this.f33280OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f33280OooOO0);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f33249OooO00o == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void OooO0oo(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f33277OooO0o = obj.toString();
                break;
            case "percentWidth":
                this.f33276OooO = OooO0o.OooO0oO((Number) obj);
                break;
            case "percentHeight":
                this.f33280OooOO0 = OooO0o.OooO0oO((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f33279OooO0oo = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fOooO0oO = OooO0o.OooO0oO((Number) obj);
                this.f33276OooO = fOooO0oO;
                this.f33280OooOO0 = fOooO0oO;
                break;
            case "percentX":
                this.f33281OooOO0O = OooO0o.OooO0oO((Number) obj);
                break;
            case "percentY":
                this.f33282OooOO0o = OooO0o.OooO0oO((Number) obj);
                break;
        }
    }
}
