package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static int f4535OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static float f4536OooOoO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ConstraintLayout f4537OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f4538OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float[] f4539OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f4540OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int[] f4541OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4542OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public String f4543OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f4544OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Float f4545OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Integer f4546OooOo0o;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4542OooOOoo = 0;
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
        this.f4540OooOOo = 0;
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
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f4538OooOOOO = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == OooO.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4544OooOo00 = string;
                    setAngles(string);
                } else if (index == OooO.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4543OooOo0 = string2;
                    setRadius(string2);
                } else if (index == OooO.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f4536OooOoO0));
                    this.f4545OooOo0O = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == OooO.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f4535OooOo));
                    this.f4546OooOo0o = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooOo0O(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f4922OooO0o == null || (fArr = this.f4539OooOOOo) == null) {
            return;
        }
        if (this.f4542OooOOoo + 1 > fArr.length) {
            this.f4539OooOOOo = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f4539OooOOOo[this.f4542OooOOoo] = Integer.parseInt(str);
        this.f4542OooOOoo++;
    }

    public final void OooOo0o(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f4922OooO0o) == null || (iArr = this.f4541OooOOo0) == null) {
            return;
        }
        if (this.f4540OooOOo + 1 > iArr.length) {
            this.f4541OooOOo0 = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f4541OooOOo0[this.f4540OooOOo] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f4540OooOOo++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f4539OooOOOo, this.f4542OooOOoo);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f4541OooOOo0, this.f4540OooOOo);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4544OooOo00;
        if (str != null) {
            this.f4539OooOOOo = new float[1];
            setAngles(str);
        }
        String str2 = this.f4543OooOo0;
        if (str2 != null) {
            this.f4541OooOOo0 = new int[1];
            setRadius(str2);
        }
        Float f = this.f4545OooOo0O;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f4546OooOo0o;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f4537OooOOO = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f4923OooO0o0; i++) {
            View viewById = this.f4537OooOOO.getViewById(this.f4921OooO0Oo[i]);
            if (viewById != null) {
                int i2 = f4535OooOo;
                float f2 = f4536OooOoO0;
                int[] iArr = this.f4541OooOOo0;
                HashMap<Integer, String> map = this.f4927OooOO0O;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.f4546OooOo0o;
                    if (num2 == null || num2.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + map.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f4540OooOOo++;
                        if (this.f4541OooOOo0 == null) {
                            this.f4541OooOOo0 = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f4541OooOOo0 = radius;
                        radius[this.f4540OooOOo - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f4539OooOOOo;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.f4545OooOo0O;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + map.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f4542OooOOoo++;
                        if (this.f4539OooOOOo == null) {
                            this.f4539OooOOOo = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f4539OooOOOo = angles;
                        angles[this.f4542OooOOoo - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f4944OooOOo = f2;
                layoutParams.f4943OooOOOo = this.f4538OooOOOO;
                layoutParams.f4945OooOOo0 = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        OooO0oo();
    }

    public void setDefaultAngle(float f) {
        f4536OooOoO0 = f;
    }

    public void setDefaultRadius(int i) {
        f4535OooOo = i;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
