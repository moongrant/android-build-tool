package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final float[][] f4720OooOooo = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final float[][] f4721Oooo000 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4722OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f4723OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4724OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f4725OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f4727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4728OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f4729OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f4730OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f4731OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f4732OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f4733OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4737OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final MotionLayout f4738OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4739OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4740OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f4741OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f4742OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f4743OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f4744OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4745OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f4746OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f4747OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f4748OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f4749OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f4750OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f4751OooOooO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f4735OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float[] f4734OooOOO = new float[2];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int[] f4736OooOOOO = new int[2];

    public OooO0O0(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f4723OooO00o = 0;
        this.f4724OooO0O0 = 0;
        this.f4725OooO0OO = 0;
        this.f4726OooO0Oo = -1;
        this.f4728OooO0o0 = -1;
        this.f4727OooO0o = -1;
        this.f4729OooO0oO = 0.5f;
        this.f4730OooO0oo = 0.5f;
        this.f4722OooO = -1;
        this.f4731OooOO0 = false;
        this.f4732OooOO0O = 0.0f;
        this.f4733OooOO0o = 1.0f;
        this.f4740OooOOoo = 4.0f;
        this.f4743OooOo00 = 1.2f;
        this.f4742OooOo0 = true;
        this.f4744OooOo0O = 1.0f;
        this.f4745OooOo0o = 0;
        this.f4741OooOo = 10.0f;
        this.f4747OooOoO0 = 10.0f;
        this.f4746OooOoO = 1.0f;
        this.f4748OooOoOO = Float.NaN;
        this.f4750OooOoo0 = Float.NaN;
        this.f4749OooOoo = 0;
        this.f4751OooOooO = 0;
        this.f4738OooOOo = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == OooO.OnSwipe_touchAnchorId) {
                this.f4726OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4726OooO0Oo);
            } else if (index == OooO.OnSwipe_touchAnchorSide) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f4723OooO00o);
                this.f4723OooO00o = i2;
                float[] fArr = f4720OooOooo[i2];
                this.f4730OooO0oo = fArr[0];
                this.f4729OooO0oO = fArr[1];
            } else if (index == OooO.OnSwipe_dragDirection) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f4724OooO0O0);
                this.f4724OooO0O0 = i3;
                if (i3 < 6) {
                    float[] fArr2 = f4721Oooo000[i3];
                    this.f4732OooOO0O = fArr2[0];
                    this.f4733OooOO0o = fArr2[1];
                } else {
                    this.f4733OooOO0o = Float.NaN;
                    this.f4732OooOO0O = Float.NaN;
                    this.f4731OooOO0 = true;
                }
            } else if (index == OooO.OnSwipe_maxVelocity) {
                this.f4740OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f4740OooOOoo);
            } else if (index == OooO.OnSwipe_maxAcceleration) {
                this.f4743OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f4743OooOo00);
            } else if (index == OooO.OnSwipe_moveWhenScrollAtTop) {
                this.f4742OooOo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4742OooOo0);
            } else if (index == OooO.OnSwipe_dragScale) {
                this.f4744OooOo0O = typedArrayObtainStyledAttributes.getFloat(index, this.f4744OooOo0O);
            } else if (index == OooO.OnSwipe_dragThreshold) {
                this.f4741OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f4741OooOo);
            } else if (index == OooO.OnSwipe_touchRegionId) {
                this.f4728OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4728OooO0o0);
            } else if (index == OooO.OnSwipe_onTouchUp) {
                this.f4725OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f4725OooO0OO);
            } else if (index == OooO.OnSwipe_nestedScrollFlags) {
                this.f4745OooOo0o = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == OooO.OnSwipe_limitBoundsTo) {
                this.f4727OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == OooO.OnSwipe_rotationCenterId) {
                this.f4722OooO = typedArrayObtainStyledAttributes.getResourceId(index, this.f4722OooO);
            } else if (index == OooO.OnSwipe_springDamping) {
                this.f4747OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4747OooOoO0);
            } else if (index == OooO.OnSwipe_springMass) {
                this.f4746OooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f4746OooOoO);
            } else if (index == OooO.OnSwipe_springStiffness) {
                this.f4748OooOoOO = typedArrayObtainStyledAttributes.getFloat(index, this.f4748OooOoOO);
            } else if (index == OooO.OnSwipe_springStopThreshold) {
                this.f4750OooOoo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4750OooOoo0);
            } else if (index == OooO.OnSwipe_springBoundary) {
                this.f4749OooOoo = typedArrayObtainStyledAttributes.getInt(index, this.f4749OooOoo);
            } else if (index == OooO.OnSwipe_autoCompleteMode) {
                this.f4751OooOooO = typedArrayObtainStyledAttributes.getInt(index, this.f4751OooOooO);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF OooO00o(MotionLayout motionLayout, RectF rectF) {
        View viewFindViewById;
        int i = this.f4727OooO0o;
        if (i == -1 || (viewFindViewById = motionLayout.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF OooO0O0(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f4728OooO0o0;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void OooO0OO(boolean z) {
        float[][] fArr = f4720OooOooo;
        float[][] fArr2 = f4721Oooo000;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f4723OooO00o];
        this.f4730OooO0oo = fArr3[0];
        this.f4729OooO0oO = fArr3[1];
        int i = this.f4724OooO0O0;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.f4732OooOO0O = fArr4[0];
        this.f4733OooOO0o = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f4732OooOO0O)) {
            return "rotation";
        }
        return this.f4732OooOO0O + " , " + this.f4733OooOO0o;
    }
}
