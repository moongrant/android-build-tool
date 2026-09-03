package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.OooO0OO;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o000000O.OooO;
import o000000O.OooO00o;
import o000000O.OooO0o;
import o000000O.OooOOO0;
import o000000O.Oooo0;
import o000000O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4566OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f4567OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f4568OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4569OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f4570OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f4571OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f4572OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4573OooOo0o;

    public MotionEffect(Context context) {
        super(context);
        this.f4566OooOOOo = 0.1f;
        this.f4568OooOOo0 = 49;
        this.f4567OooOOo = 50;
        this.f4569OooOOoo = 0;
        this.f4571OooOo00 = 0;
        this.f4570OooOo0 = true;
        this.f4572OooOo0O = -1;
        this.f4573OooOo0o = -1;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public final void OooOo0(MotionLayout motionLayout, HashMap<View, Oooo0> map) {
        OooO oooO;
        OooO oooO2;
        OooO oooO3;
        OooO oooO4;
        boolean z;
        OooO oooO5;
        View[] viewArr;
        OooO oooO6;
        int i;
        MotionEffect motionEffect = this;
        HashMap<View, Oooo0> map2 = map;
        View[] viewArrOooOOO0 = motionEffect.OooOOO0((ConstraintLayout) getParent());
        if (viewArrOooOOO0 == null) {
            Log.v("FadeMove", OooO00o.OooO00o() + " views = null");
            return;
        }
        OooO oooO7 = new OooO();
        OooO oooO8 = new OooO();
        oooO7.OooO0oo(Float.valueOf(motionEffect.f4566OooOOOo), "alpha");
        oooO8.OooO0oo(Float.valueOf(motionEffect.f4566OooOOOo), "alpha");
        oooO7.f33252OooO00o = motionEffect.f4568OooOOo0;
        oooO8.f33252OooO00o = motionEffect.f4567OooOOo;
        OooOOO0 oooOOO0 = new OooOOO0();
        oooOOO0.f33252OooO00o = motionEffect.f4568OooOOo0;
        int i2 = 0;
        oooOOO0.f33288OooOOOO = 0;
        oooOOO0.OooO0oo(0, "percentX");
        oooOOO0.OooO0oo(0, "percentY");
        OooOOO0 oooOOO1 = new OooOOO0();
        oooOOO1.f33252OooO00o = motionEffect.f4567OooOOo;
        oooOOO1.f33288OooOOOO = 0;
        oooOOO1.OooO0oo(1, "percentX");
        oooOOO1.OooO0oo(1, "percentY");
        OooO oooO9 = null;
        if (motionEffect.f4569OooOOoo > 0) {
            oooO = new OooO();
            oooO2 = new OooO();
            oooO.OooO0oo(Integer.valueOf(motionEffect.f4569OooOOoo), "translationX");
            oooO.f33252OooO00o = motionEffect.f4567OooOOo;
            oooO2.OooO0oo(0, "translationX");
            oooO2.f33252OooO00o = motionEffect.f4567OooOOo - 1;
        } else {
            oooO = null;
            oooO2 = null;
        }
        if (motionEffect.f4571OooOo00 > 0) {
            OooO oooO10 = new OooO();
            OooO oooO11 = new OooO();
            oooO10.OooO0oo(Integer.valueOf(motionEffect.f4571OooOo00), "translationY");
            oooO10.f33252OooO00o = motionEffect.f4567OooOOo;
            oooO11.OooO0oo(0, "translationY");
            oooO11.f33252OooO00o = motionEffect.f4567OooOOo - 1;
            oooO3 = oooO10;
            oooO9 = oooO11;
        } else {
            oooO3 = null;
        }
        int i3 = motionEffect.f4573OooOo0o;
        if (i3 == -1) {
            int[] iArr = new int[4];
            int i4 = 0;
            while (i4 < viewArrOooOOO0.length) {
                Oooo0 oooo0 = map2.get(viewArrOooOOO0[i4]);
                if (oooo0 == null) {
                    oooO6 = oooO9;
                } else {
                    o0OoOo0 o0oooo1 = oooo0.f33352OooO0oO;
                    float f = o0oooo1.f33388OooO0oo;
                    o0OoOo0 o0oooo2 = oooo0.f33350OooO0o;
                    oooO6 = oooO9;
                    float f2 = f - o0oooo2.f33388OooO0oo;
                    float f3 = o0oooo1.f33383OooO - o0oooo2.f33383OooO;
                    if (f3 < 0.0f) {
                        i = 1;
                        iArr[1] = iArr[1] + 1;
                    } else {
                        i = 1;
                    }
                    if (f3 > 0.0f) {
                        iArr[0] = iArr[0] + i;
                    }
                    if (f2 > 0.0f) {
                        iArr[3] = iArr[3] + i;
                    }
                    if (f2 < 0.0f) {
                        iArr[2] = iArr[2] + i;
                    }
                }
                i4++;
                oooO9 = oooO6;
                i2 = 0;
            }
            oooO4 = oooO9;
            int i5 = i2;
            int i6 = iArr[i5];
            i3 = i5;
            for (int i7 = 1; i7 < 4; i7++) {
                int i8 = iArr[i7];
                if (i6 < i8) {
                    i6 = i8;
                    i3 = i7;
                }
            }
        } else {
            oooO4 = oooO9;
        }
        int i9 = 0;
        while (i9 < viewArrOooOOO0.length) {
            Oooo0 oooo1 = map2.get(viewArrOooOOO0[i9]);
            if (oooo1 == null) {
                viewArr = viewArrOooOOO0;
                oooO5 = oooO4;
            } else {
                o0OoOo0 o0oooo3 = oooo1.f33352OooO0oO;
                float f4 = o0oooo3.f33388OooO0oo;
                o0OoOo0 o0oooo4 = oooo1.f33350OooO0o;
                float f5 = f4 - o0oooo4.f33388OooO0oo;
                float f6 = o0oooo3.f33383OooO - o0oooo4.f33383OooO;
                if (i3 == 0) {
                    z = f6 <= 0.0f || (motionEffect.f4570OooOo0 && f5 != 0.0f);
                } else if (i3 == 1) {
                    if (f6 >= 0.0f || (motionEffect.f4570OooOo0 && f5 != 0.0f)) {
                    }
                } else if (i3 == 2) {
                    if (f5 < 0.0f && (!motionEffect.f4570OooOo0 || f6 == 0.0f)) {
                        z = false;
                    }
                } else if (i3 == 3 && f5 > 0.0f && (!motionEffect.f4570OooOo0 || f6 == 0.0f)) {
                    z = false;
                }
                if (z) {
                    int i10 = motionEffect.f4572OooOo0O;
                    if (i10 == -1) {
                        oooo1.OooO00o(oooO7);
                        oooo1.OooO00o(oooO8);
                        oooo1.OooO00o(oooOOO0);
                        oooo1.OooO00o(oooOOO1);
                        if (motionEffect.f4569OooOOoo > 0) {
                            oooo1.OooO00o(oooO);
                            oooo1.OooO00o(oooO2);
                        }
                        if (motionEffect.f4571OooOo00 > 0) {
                            oooo1.OooO00o(oooO3);
                            oooO5 = oooO4;
                            oooo1.OooO00o(oooO5);
                        } else {
                            oooO5 = oooO4;
                        }
                    } else {
                        oooO5 = oooO4;
                        androidx.constraintlayout.motion.widget.OooO00o oooO00o = motionLayout.f4580OooO0Oo;
                        if (oooO00o != null) {
                            Iterator<OooO0OO> it = oooO00o.f4696OooOOo0.f4787OooO0O0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    OooO0OO next = it.next();
                                    viewArr = viewArrOooOOO0;
                                    if (next.f4753OooO00o == i10) {
                                        ArrayList<OooO0o> arrayList = next.f4757OooO0o.f33277OooO00o.get(-1);
                                        if (arrayList != null) {
                                            oooo1.f33368OooOo0o.addAll(arrayList);
                                        }
                                    } else {
                                        viewArrOooOOO0 = viewArr;
                                    }
                                }
                            }
                        }
                    }
                    viewArr = viewArrOooOOO0;
                } else {
                    viewArr = viewArrOooOOO0;
                    oooO5 = oooO4;
                }
            }
            i9++;
            motionEffect = this;
            map2 = map;
            oooO4 = oooO5;
            viewArrOooOOO0 = viewArr;
        }
    }

    public final void OooOo0O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f4568OooOOo0);
                    this.f4568OooOOo0 = i2;
                    this.f4568OooOOo0 = Math.max(Math.min(i2, 99), 0);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f4567OooOOo);
                    this.f4567OooOOo = i3;
                    this.f4567OooOOo = Math.max(Math.min(i3, 99), 0);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_translationX) {
                    this.f4569OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4569OooOOoo);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_translationY) {
                    this.f4571OooOo00 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4571OooOo00);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_alpha) {
                    this.f4566OooOOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f4566OooOOOo);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_move) {
                    this.f4573OooOo0o = typedArrayObtainStyledAttributes.getInt(index, this.f4573OooOo0o);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_strict) {
                    this.f4570OooOo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4570OooOo0);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionEffect_motionEffect_viewTransition) {
                    this.f4572OooOo0O = typedArrayObtainStyledAttributes.getResourceId(index, this.f4572OooOo0O);
                }
            }
            int i4 = this.f4568OooOOo0;
            int i5 = this.f4567OooOOo;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f4568OooOOo0 = i4 - 1;
                } else {
                    this.f4567OooOOo = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4566OooOOOo = 0.1f;
        this.f4568OooOOo0 = 49;
        this.f4567OooOOo = 50;
        this.f4569OooOOoo = 0;
        this.f4571OooOo00 = 0;
        this.f4570OooOo0 = true;
        this.f4572OooOo0O = -1;
        this.f4573OooOo0o = -1;
        OooOo0O(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4566OooOOOo = 0.1f;
        this.f4568OooOOo0 = 49;
        this.f4567OooOOo = 50;
        this.f4569OooOOoo = 0;
        this.f4571OooOo00 = 0;
        this.f4570OooOo0 = true;
        this.f4572OooOo0O = -1;
        this.f4573OooOo0o = -1;
        OooOo0O(context, attributeSet);
    }
}
