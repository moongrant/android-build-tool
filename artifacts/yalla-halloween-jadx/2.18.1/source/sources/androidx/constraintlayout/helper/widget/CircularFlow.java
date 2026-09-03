package androidx.constraintlayout.helper.widget;

import OooO00o.OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static float f7103Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static int f7104Oooooo0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ConstraintLayout f7105OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f7106OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float[] f7107OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int[] f7108OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f7109OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f7110Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f7111Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f7112OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Float f7113OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public Integer f7114OooooOo;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7110Ooooo00 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooOo0O(str.substring(i).trim());
                return;
            } else {
                OooOo0O(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7109OoooOoo = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooOo0o(str.substring(i).trim());
                return;
            } else {
                OooOo0o(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f7106OoooOOo = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7111Ooooo0o = string;
                    setAngles(string);
                } else if (index == o000O00.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f7112OooooO0 = string2;
                    setRadius(string2);
                } else if (index == o000O00.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f7103Oooooo));
                    this.f7113OooooOO = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == o000O00.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f7104Oooooo0));
                    this.f7114OooooOo = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooOo0O(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f7492Oooo0oo == null || (fArr = this.f7107OoooOo0) == null) {
            return;
        }
        if (this.f7110Ooooo00 + 1 > fArr.length) {
            this.f7107OoooOo0 = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f7107OoooOo0[this.f7110Ooooo00] = Integer.parseInt(str);
        this.f7110Ooooo00++;
    }

    public final void OooOo0o(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f7492Oooo0oo == null || (iArr = this.f7108OoooOoO) == null) {
            return;
        }
        if (this.f7109OoooOoo + 1 > iArr.length) {
            this.f7108OoooOoO = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f7108OoooOoO[this.f7109OoooOoo] = (int) (Integer.parseInt(str) * this.f7492Oooo0oo.getResources().getDisplayMetrics().density);
        this.f7109OoooOoo++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f7107OoooOo0, this.f7110Ooooo00);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f7108OoooOoO, this.f7109OoooOoo);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f7111Ooooo0o;
        if (str != null) {
            this.f7107OoooOo0 = new float[1];
            setAngles(str);
        }
        String str2 = this.f7112OooooO0;
        if (str2 != null) {
            this.f7108OoooOoO = new int[1];
            setRadius(str2);
        }
        Float f = this.f7113OooooOO;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f7114OooooOo;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f7105OoooOOO = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f7491Oooo0oO; i++) {
            View viewById = this.f7105OoooOOO.getViewById(this.f7490Oooo0o[i]);
            if (viewById != null) {
                int i2 = f7104Oooooo0;
                float f2 = f7103Oooooo;
                int[] iArr = this.f7108OoooOoO;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.f7114OooooOo;
                    if (num2 == null || num2.intValue() == -1) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Added radius to view with id: ");
                        sbOooO0o0.append(this.f7493OoooO.get(Integer.valueOf(viewById.getId())));
                        Log.e("CircularFlow", sbOooO0o0.toString());
                    } else {
                        this.f7109OoooOoo++;
                        if (this.f7108OoooOoO == null) {
                            this.f7108OoooOoO = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f7108OoooOoO = radius;
                        radius[this.f7109OoooOoo - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f7107OoooOo0;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.f7113OooooOO;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Added angle to view with id: ");
                        sbOooO0o1.append(this.f7493OoooO.get(Integer.valueOf(viewById.getId())));
                        Log.e("CircularFlow", sbOooO0o1.toString());
                    } else {
                        this.f7110Ooooo00++;
                        if (this.f7107OoooOo0 == null) {
                            this.f7107OoooOo0 = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f7107OoooOo0 = angles;
                        angles[this.f7110Ooooo00 - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f7513OooOOo = f2;
                layoutParams.f7512OooOOOo = this.f7106OoooOOo;
                layoutParams.f7514OooOOo0 = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        OooO0oo();
    }

    public void setDefaultAngle(float f) {
        f7103Oooooo = f;
    }

    public void setDefaultRadius(int i) {
        f7104Oooooo0 = i;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
