package p060o0000o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p057o0000Oo0.o000000O;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Oooo000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f27709OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f27710OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f27711OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f27708OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27712OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f27713OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27714OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27716OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27715OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f27717OooOOOO = 0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27718OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27718OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyPosition_motionTarget, 1);
            f27718OooO00o.append(o000O00.KeyPosition_framePosition, 2);
            f27718OooO00o.append(o000O00.KeyPosition_transitionEasing, 3);
            f27718OooO00o.append(o000O00.KeyPosition_curveFit, 4);
            f27718OooO00o.append(o000O00.KeyPosition_drawPath, 5);
            f27718OooO00o.append(o000O00.KeyPosition_percentX, 6);
            f27718OooO00o.append(o000O00.KeyPosition_percentY, 7);
            f27718OooO00o.append(o000O00.KeyPosition_keyPositionType, 9);
            f27718OooO00o.append(o000O00.KeyPosition_sizePercent, 8);
            f27718OooO00o.append(o000O00.KeyPosition_percentWidth, 11);
            f27718OooO00o.append(o000O00.KeyPosition_percentHeight, 12);
            f27718OooO00o.append(o000O00.KeyPosition_pathMotionArc, 10);
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO00o(HashMap<String, oo0o0Oo> map) {
    }

    @Override // p060o0000o.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0 clone() {
        OooOo oooOo = new OooOo();
        super.OooO0OO(this);
        oooOo.f27709OooO0o = this.f27709OooO0o;
        oooOo.f27710OooO0oO = this.f27710OooO0oO;
        oooOo.f27711OooO0oo = this.f27711OooO0oo;
        oooOo.f27708OooO = this.f27708OooO;
        oooOo.f27712OooOO0 = Float.NaN;
        oooOo.f27713OooOO0O = this.f27713OooOO0O;
        oooOo.f27714OooOO0o = this.f27714OooOO0o;
        oooOo.f27716OooOOO0 = this.f27716OooOOO0;
        oooOo.f27715OooOOO = this.f27715OooOOO;
        return oooOo;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyPosition);
        SparseIntArray sparseIntArray = OooO00o.f27718OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27718OooO00o.get(index)) {
                case 1:
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
                case 2:
                    this.f27684OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f27684OooO00o);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27709OooO0o = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f27709OooO0o = o000000O.f27560OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f27738OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f27738OooO0o0);
                    break;
                case 5:
                    this.f27711OooO0oo = typedArrayObtainStyledAttributes.getInt(index, this.f27711OooO0oo);
                    break;
                case 6:
                    this.f27713OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f27713OooOO0O);
                    break;
                case 7:
                    this.f27714OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27714OooOO0o);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f27712OooOO0);
                    this.f27708OooO = f;
                    this.f27712OooOO0 = f;
                    break;
                case 9:
                    this.f27717OooOOOO = typedArrayObtainStyledAttributes.getInt(index, this.f27717OooOOOO);
                    break;
                case 10:
                    this.f27710OooO0oO = typedArrayObtainStyledAttributes.getInt(index, this.f27710OooO0oO);
                    break;
                case 11:
                    this.f27708OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f27708OooO);
                    break;
                case 12:
                    this.f27712OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f27712OooOO0);
                    break;
                default:
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unused attribute 0x");
                    sbOooO0o0.append(Integer.toHexString(index));
                    sbOooO0o0.append("   ");
                    sbOooO0o0.append(OooO00o.f27718OooO00o.get(index));
                    Log.e("KeyPosition", sbOooO0o0.toString());
                    break;
            }
        }
        if (this.f27684OooO00o == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void OooO0oo(String str, Object obj) {
        switch (str) {
            case "transitionEasing":
                this.f27709OooO0o = obj.toString();
                break;
            case "percentWidth":
                this.f27708OooO = OooO0oO(obj);
                break;
            case "percentHeight":
                this.f27712OooOO0 = OooO0oO(obj);
                break;
            case "drawPath":
                this.f27711OooO0oo = obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
                break;
            case "sizePercent":
                float fOooO0oO = OooO0oO(obj);
                this.f27708OooO = fOooO0oO;
                this.f27712OooOO0 = fOooO0oO;
                break;
            case "percentX":
                this.f27713OooOO0O = OooO0oO(obj);
                break;
            case "percentY":
                this.f27714OooOO0o = OooO0oO(obj);
                break;
        }
    }
}
