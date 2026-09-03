package com.google.android.material.slider;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.o0OOO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.OooO00o;
import com.google.android.material.slider.OooO0O0;
import io.agora.rtc.Constants;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.ULong;
import o0000O.o0Oo0oo;
import o0O00o00.OooO;
import o0O00o00.OooOOO;
import org.jctools.util.Pow2;
import p003OooO0o0.o0O0O00;
import p052o00000oO.OooOO0;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o00000O0;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.b1;
import p545o0oO0Ooo.c1;
import p545o0oO0Ooo.d1;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.OooO00o<S>, T extends com.google.android.material.slider.OooO0O0<S>> extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Paint f17711OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Paint f17712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Paint f17713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Paint f17714OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Paint f17715OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Paint f17716OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final OooO0OO f17717OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AccessibilityManager f17718OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public BaseSlider<S, L, T>.OooO0O0 f17719OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ArrayList f17720OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f17721OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final ArrayList f17722OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final ArrayList f17723OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ValueAnimator f17724OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f17725OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ValueAnimator f17726OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f17727OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f17728OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f17729OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f17730OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f17731OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Dimension(unit = 1)
    public int f17732OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f17733OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f17734OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f17735OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f17736OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f17737OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f17738OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17739Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f17740Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f17741Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f17742Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f17743Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public MotionEvent f17744Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f17745Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f17746Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f17747Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ArrayList<Float> f17748Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f17749Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17750OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float[] f17751OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f17752OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f17753OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f17754OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f17755OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f17756OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NonNull
    public ColorStateList f17757OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NonNull
    public ColorStateList f17758OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NonNull
    public ColorStateList f17759OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NonNull
    public ColorStateList f17760Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public ColorStateList f17761Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f17762OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public Drawable f17763OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NonNull
    public List<Drawable> f17764OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17765Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f17766Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f17767o000oOoO;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final int f17706OoooooO = o0000O0O.Widget_MaterialComponents_Slider;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final int f17707Ooooooo = o00000.motionDurationMedium4;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final int f17709o0OoOo0 = o00000.motionDurationShort3;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final int f17710ooOO = o00000.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final int f17708o00O0O = o00000.motionEasingEmphasizedAccelerateInterpolator;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            for (o0O0O0O.OooO00o oooO00o : baseSlider.f17720OooOOO) {
                oooO00o.f41912Oooo0oo = 1.2f;
                oooO00o.f41909Oooo0o = fFloatValue;
                oooO00o.f41911Oooo0oO = fFloatValue;
                oooO00o.f41902Oooo = o0O000.OooO0O0.OooO00o(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                oooO00o.invalidateSelf();
            }
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(baseSlider);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17769OooO0Oo = -1;

        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f17717OooOO0.OooOOO(this.f17769OooO0Oo, 4);
        }
    }

    public static class OooO0OO extends p056o0000Oo0.OooO0O0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f17771OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final Rect f17772OooOOOO;

        public OooO0OO(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f17772OooOOOO = new Rect();
            this.f17771OooOOO = baseSlider;
        }

        @Override // p056o0000Oo0.OooO0O0
        public final boolean OooO(int i, int i2, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.f17771OooOOO;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    int i3 = BaseSlider.f17706OoooooO;
                    if (baseSlider.OooOOOo(f, i)) {
                        baseSlider.OooOOo();
                        baseSlider.postInvalidate();
                        OooO0o(i);
                        return true;
                    }
                }
                return false;
            }
            int i4 = BaseSlider.f17706OoooooO;
            float fRound = baseSlider.f17752OoooO00;
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f2 = (baseSlider.f17746Oooo0o - baseSlider.f17747Oooo0o0) / fRound;
            float f3 = 20;
            if (f2 > f3) {
                fRound *= Math.round(f2 / f3);
            }
            if (i2 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.OooO0oo()) {
                fRound = -fRound;
            }
            if (!baseSlider.OooOOOo(o0000O00.OooO00o.OooO00o(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()), i)) {
                return false;
            }
            baseSlider.OooOOo();
            baseSlider.postInvalidate();
            OooO0o(i);
            return true;
        }

        @Override // p056o0000Oo0.OooO0O0
        public final int OooO0Oo(float f, float f2) {
            int i = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.f17771OooOOO;
                if (i >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f17772OooOOOO;
                baseSlider.OooOOo0(i, rect);
                if (rect.contains((int) f, (int) f2)) {
                    return i;
                }
                i++;
            }
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooO0o0(ArrayList arrayList) {
            int iOooO00o = 0;
            while (iOooO00o < this.f17771OooOOO.getValues().size()) {
                iOooO00o = o0O0O00.OooO00o(iOooO00o, arrayList, iOooO00o, 1);
            }
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooOO0O(int i, o0Oo0oo o0oo0oo2) {
            String string;
            o0oo0oo2.OooO0O0(o0Oo0oo.OooO00o.f34039OooOOoo);
            BaseSlider<?, ?, ?> baseSlider = this.f17771OooOOO;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    o0oo0oo2.OooO00o(8192);
                }
                if (fFloatValue < valueTo) {
                    o0oo0oo2.OooO00o(4096);
                }
            }
            o0oo0oo2.f34022OooO00o.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
            o0oo0oo2.OooOO0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb.append(baseSlider.getContentDescription());
                sb.append(",");
            }
            String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
            String string2 = baseSlider.getContext().getString(o0000O0.material_slider_value);
            if (values.size() > 1) {
                if (i == baseSlider.getValues().size() - 1) {
                    string = baseSlider.getContext().getString(o0000O0.material_slider_range_end);
                } else {
                    string = i == 0 ? baseSlider.getContext().getString(o0000O0.material_slider_range_start) : "";
                }
                string2 = string;
            }
            sb.append(String.format(Locale.US, "%s, %s", string2, str));
            o0oo0oo2.OooOOO0(sb.toString());
            Rect rect = this.f17772OooOOOO;
            baseSlider.OooOOo0(i, rect);
            o0oo0oo2.OooO(rect);
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f17773OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ArrayList<Float> f17774OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f17775OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f17776OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f17777OooO0oo;

        public class OooO00o implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f17773OooO0Oo = parcel.readFloat();
            this.f17775OooO0o0 = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f17774OooO0o = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f17776OooO0oO = parcel.readFloat();
            this.f17777OooO0oo = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f17773OooO0Oo);
            parcel.writeFloat(this.f17775OooO0o0);
            parcel.writeList(this.f17774OooO0o);
            parcel.writeFloat(this.f17776OooO0oO);
            parcel.writeBooleanArray(new boolean[]{this.f17777OooO0oo});
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f17748Oooo0oO.size() == 1) {
            fFloatValue2 = this.f17747Oooo0o0;
        }
        float fOooOO0o = OooOO0o(fFloatValue2);
        float fOooOO0o2 = OooOO0o(fFloatValue);
        return OooO0oo() ? new float[]{fOooOO0o2, fOooOO0o} : new float[]{fOooOO0o, fOooOO0o2};
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f = this.f17766Oooooo0;
        float f2 = this.f17752OoooO00;
        if (f2 > 0.0f) {
            int i = (int) ((this.f17746Oooo0o - this.f17747Oooo0o0) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (OooO0oo()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f17746Oooo0o;
        float f4 = this.f17747Oooo0o0;
        return (float) ((dRound * ((double) (f3 - f4))) + ((double) f4));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f17766Oooooo0;
        if (OooO0oo()) {
            f = 1.0f - f;
        }
        float f2 = this.f17746Oooo0o;
        float f3 = this.f17747Oooo0o0;
        return OooOo.OooO0o.OooO00o(f2, f3, f, f3);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        int iOooO00o;
        int iOooO00o2;
        int iOooO00o3;
        ViewGroup viewGroupOooO0OO;
        int resourceId;
        o0OOO0o o0ooo0oOooO0Oo;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f17748Oooo0oO.size() == arrayList.size() && this.f17748Oooo0oO.equals(arrayList)) {
            return;
        }
        this.f17748Oooo0oO = arrayList;
        this.f17756OoooOOo = true;
        this.f17739Oooo = 0;
        OooOOo();
        ArrayList arrayList2 = this.f17720OooOOO;
        if (arrayList2.size() > this.f17748Oooo0oO.size()) {
            List<o0O0O0O.OooO00o> listSubList = arrayList2.subList(this.f17748Oooo0oO.size(), arrayList2.size());
            for (o0O0O0O.OooO00o oooO00o : listSubList) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                if (ViewCompat.OooOO0O.OooO0O0(this) && (o0ooo0oOooO0Oo = oo0o0Oo.OooO0Oo(this)) != null) {
                    o0ooo0oOooO0Oo.f17327OooO00o.remove(oooO00o);
                    ViewGroup viewGroupOooO0OO2 = oo0o0Oo.OooO0OO(this);
                    if (viewGroupOooO0OO2 == null) {
                        oooO00o.getClass();
                    } else {
                        viewGroupOooO0OO2.removeOnLayoutChangeListener(oooO00o.f41901OooOooo);
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f17748Oooo0oO.size()) {
            Context context = getContext();
            int i = this.f17721OooOOO0;
            o0O0O0O.OooO00o oooO00o2 = new o0O0O0O.OooO00o(context, i);
            TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(oooO00o2.f41899OooOoo0, null, o000OO.Tooltip, 0, i, new int[0]);
            Context context2 = oooO00o2.f41899OooOoo0;
            oooO00o2.f41908Oooo0OO = context2.getResources().getDimensionPixelSize(o00000O.mtrl_tooltip_arrowSize);
            com.google.android.material.shape.OooO0O0 oooO0O0 = oooO00o2.f17582OooO0Oo.f17605OooO00o;
            oooO0O0.getClass();
            com.google.android.material.shape.OooO0O0.OooO00o oooO00o3 = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
            oooO00o3.f17649OooOO0O = oooO00o2.OooOoO0();
            oooO00o2.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o3));
            CharSequence text = typedArrayOooO0Oo.getText(o000OO.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(oooO00o2.f41897OooOoOO, text);
            o00Oo0 o00oo1 = oooO00o2.f41900OooOooO;
            if (!zEquals) {
                oooO00o2.f41897OooOoOO = text;
                o00oo1.f17316OooO0Oo = true;
                oooO00o2.invalidateSelf();
            }
            int i2 = o000OO.Tooltip_android_textAppearance;
            d1 d1Var = (!typedArrayOooO0Oo.hasValue(i2) || (resourceId = typedArrayOooO0Oo.getResourceId(i2, 0)) == 0) ? null : new d1(context2, resourceId);
            if (d1Var != null) {
                int i3 = o000OO.Tooltip_android_textColor;
                if (typedArrayOooO0Oo.hasValue(i3)) {
                    d1Var.f55821OooOO0 = c1.OooO00o(context2, typedArrayOooO0Oo, i3);
                }
            }
            o00oo1.OooO0O0(d1Var, context2);
            TypedValue typedValueOooO0OO = b1.OooO0OO(o00000.colorOnBackground, context2, o0O0O0O.OooO00o.class.getCanonicalName());
            int i4 = typedValueOooO0OO.resourceId;
            if (i4 != 0) {
                Object obj = ContextCompat.f5271OooO00o;
                iOooO00o = ContextCompat.OooO0o.OooO00o(context2, i4);
            } else {
                iOooO00o = typedValueOooO0OO.data;
            }
            TypedValue typedValueOooO0OO2 = b1.OooO0OO(R.attr.colorBackground, context2, o0O0O0O.OooO00o.class.getCanonicalName());
            int i5 = typedValueOooO0OO2.resourceId;
            if (i5 != 0) {
                Object obj2 = ContextCompat.f5271OooO00o;
                iOooO00o2 = ContextCompat.OooO0o.OooO00o(context2, i5);
            } else {
                iOooO00o2 = typedValueOooO0OO2.data;
            }
            oooO00o2.OooOOO(ColorStateList.valueOf(typedArrayOooO0Oo.getColor(o000OO.Tooltip_backgroundTint, OooOO0.OooO0OO(OooOO0.OooO0Oo(iOooO00o, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED), OooOO0.OooO0Oo(iOooO00o2, 229)))));
            TypedValue typedValueOooO0OO3 = b1.OooO0OO(o00000.colorSurface, context2, o0O0O0O.OooO00o.class.getCanonicalName());
            int i6 = typedValueOooO0OO3.resourceId;
            if (i6 != 0) {
                Object obj3 = ContextCompat.f5271OooO00o;
                iOooO00o3 = ContextCompat.OooO0o.OooO00o(context2, i6);
            } else {
                iOooO00o3 = typedValueOooO0OO3.data;
            }
            oooO00o2.OooOOoo(ColorStateList.valueOf(iOooO00o3));
            oooO00o2.f41905Oooo00O = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Tooltip_android_padding, 0);
            oooO00o2.f41906Oooo00o = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Tooltip_android_minWidth, 0);
            oooO00o2.f41903Oooo0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Tooltip_android_minHeight, 0);
            oooO00o2.f41907Oooo0O0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Tooltip_android_layout_margin, 0);
            typedArrayOooO0Oo.recycle();
            arrayList2.add(oooO00o2);
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this) && (viewGroupOooO0OO = oo0o0Oo.OooO0OO(this)) != null) {
                int[] iArr = new int[2];
                viewGroupOooO0OO.getLocationOnScreen(iArr);
                oooO00o2.f41910Oooo0o0 = iArr[0];
                viewGroupOooO0OO.getWindowVisibleDisplayFrame(oooO00o2.f41904Oooo000);
                viewGroupOooO0OO.addOnLayoutChangeListener(oooO00o2.f41901OooOooo);
            }
        }
        int i7 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((o0O0O0O.OooO00o) it.next()).OooOo00(i7);
        }
        for (com.google.android.material.slider.OooO00o oooO00o4 : this.f17722OooOOOO) {
            Iterator<Float> it2 = this.f17748Oooo0oO.iterator();
            while (it2.hasNext()) {
                it2.next().floatValue();
                oooO00o4.OooO00o();
            }
        }
        postInvalidate();
    }

    public final void OooO() {
        if (this.f17752OoooO00 <= 0.0f) {
            return;
        }
        OooOo00();
        int iMin = Math.min((int) (((this.f17746Oooo0o - this.f17747Oooo0o0) / this.f17752OoooO00) + 1.0f), (this.f17767o000oOoO / (this.f17737OooOooO * 2)) + 1);
        float[] fArr = this.f17751OoooO0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f17751OoooO0 = new float[iMin * 2];
        }
        float f = this.f17767o000oOoO / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f17751OoooO0;
            fArr2[i] = ((i / 2.0f) * f) + this.f17738OooOooo;
            fArr2[i + 1] = OooO0O0();
        }
    }

    public final void OooO00o(Drawable drawable) {
        int i = this.f17741Oooo000 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final int OooO0O0() {
        int intrinsicHeight;
        int i = this.f17736OooOoo0 / 2;
        int i2 = this.f17735OooOoo;
        if (i2 != 1) {
            intrinsicHeight = i2 == 3 ? ((o0O0O0O.OooO00o) this.f17720OooOOO.get(0)).getIntrinsicHeight() : 0;
        }
        return i + intrinsicHeight;
    }

    public final ValueAnimator OooO0OO(boolean z) {
        int iOooO0OO;
        TimeInterpolator timeInterpolatorOooO0Oo;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f17726OooOOoo : this.f17724OooOOo;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iOooO0OO = o0O00OO.OooO00o.OooO0OO(f17707Ooooooo, getContext(), 83);
            timeInterpolatorOooO0Oo = o0O00OO.OooO00o.OooO0Oo(getContext(), f17710ooOO, o0O000.OooO0O0.f41575OooO0o0);
        } else {
            iOooO0OO = o0O00OO.OooO00o.OooO0OO(f17709o0OoOo0, getContext(), 117);
            timeInterpolatorOooO0Oo = o0O00OO.OooO00o.OooO0Oo(getContext(), f17708o00O0O, o0O000.OooO0O0.f41573OooO0OO);
        }
        valueAnimatorOfFloat.setDuration(iOooO0OO);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorOooO0Oo);
        valueAnimatorOfFloat.addUpdateListener(new OooO00o());
        return valueAnimatorOfFloat;
    }

    public final void OooO0Oo(@NonNull Canvas canvas, int i, int i2, float f, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f17738OooOooo + ((int) (OooOO0o(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final boolean OooO0o(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f17752OoooO00)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    @ColorInt
    public final int OooO0o0(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final boolean OooO0oO(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean OooO0oo() {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1;
    }

    public final boolean OooOO0(int i) {
        int i2 = this.f17739Oooo;
        long j = ((long) i2) + ((long) i);
        long size = this.f17748Oooo0oO.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f17739Oooo = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f17749Oooo0oo != -1) {
            this.f17749Oooo0oo = i3;
        }
        OooOOo();
        postInvalidate();
        return true;
    }

    public final void OooOO0O(int i) {
        if (OooO0oo()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        OooOO0(i);
    }

    public final float OooOO0o(float f) {
        float f2 = this.f17747Oooo0o0;
        float f3 = (f - f2) / (this.f17746Oooo0o - f2);
        return OooO0oo() ? 1.0f - f3 : f3;
    }

    public boolean OooOOO() {
        if (this.f17749Oooo0oo != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fOooOO0o = (OooOO0o(valueOfTouchPositionAbsolute) * this.f17767o000oOoO) + this.f17738OooOooo;
        this.f17749Oooo0oo = 0;
        float fAbs = Math.abs(this.f17748Oooo0oO.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f17748Oooo0oO.size(); i++) {
            float fAbs2 = Math.abs(this.f17748Oooo0oO.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fOooOO0o2 = (OooOO0o(this.f17748Oooo0oO.get(i).floatValue()) * this.f17767o000oOoO) + this.f17738OooOooo;
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !OooO0oo() ? fOooOO0o2 - fOooOO0o >= 0.0f : fOooOO0o2 - fOooOO0o <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f17749Oooo0oo = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fOooOO0o2 - fOooOO0o) < this.f17729OooOo00) {
                        this.f17749Oooo0oo = -1;
                        return false;
                    }
                    if (z) {
                        this.f17749Oooo0oo = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f17749Oooo0oo != -1;
    }

    public final void OooOOO0() {
        Iterator it = this.f17723OooOOOo.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.OooO0O0) it.next()).OooO0O0();
        }
    }

    public final void OooOOOO(o0O0O0O.OooO00o oooO00o, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(oooO00o.f41897OooOoOO, str)) {
            oooO00o.f41897OooOoOO = str;
            oooO00o.f41900OooOooO.f17316OooO0Oo = true;
            oooO00o.invalidateSelf();
        }
        int iOooOO0o = (this.f17738OooOooo + ((int) (OooOO0o(f) * this.f17767o000oOoO))) - (oooO00o.getIntrinsicWidth() / 2);
        int iOooO0O0 = OooO0O0() - (this.f17743Oooo00o + this.f17741Oooo000);
        oooO00o.setBounds(iOooOO0o, iOooO0O0 - oooO00o.getIntrinsicHeight(), oooO00o.getIntrinsicWidth() + iOooOO0o, iOooO0O0);
        Rect rect = new Rect(oooO00o.getBounds());
        com.google.android.material.internal.OooO0o.OooO0OO(oo0o0Oo.OooO0OO(this), this, rect);
        oooO00o.setBounds(rect);
        oo0o0Oo.OooO0Oo(this).f17327OooO00o.add(oooO00o);
    }

    public final boolean OooOOOo(float f, int i) {
        this.f17739Oooo = i;
        if (Math.abs(f - this.f17748Oooo0oO.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f17765Oooooo == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.f17738OooOooo) / this.f17767o000oOoO;
                float f3 = this.f17747Oooo0o0;
                minSeparation = OooOo.OooO0o.OooO00o(f3, this.f17746Oooo0o, f2, f3);
            }
        }
        if (OooO0oo()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f17748Oooo0oO.set(i, Float.valueOf(o0000O00.OooO00o.OooO00o(f, i3 < 0 ? this.f17747Oooo0o0 : minSeparation + this.f17748Oooo0oO.get(i3).floatValue(), i2 >= this.f17748Oooo0oO.size() ? this.f17746Oooo0o : this.f17748Oooo0oO.get(i2).floatValue() - minSeparation)));
        for (com.google.android.material.slider.OooO00o oooO00o : this.f17722OooOOOO) {
            this.f17748Oooo0oO.get(i).floatValue();
            oooO00o.OooO00o();
        }
        AccessibilityManager accessibilityManager = this.f17718OooOO0O;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        BaseSlider<S, L, T>.OooO0O0 oooO0O0 = this.f17719OooOO0o;
        if (oooO0O0 == null) {
            this.f17719OooOO0o = new OooO0O0();
        } else {
            removeCallbacks(oooO0O0);
        }
        BaseSlider<S, L, T>.OooO0O0 oooO0O1 = this.f17719OooOO0o;
        oooO0O1.f17769OooO0Oo = i;
        postDelayed(oooO0O1, 200L);
        return true;
    }

    public final void OooOOo() {
        if ((!(getBackground() instanceof RippleDrawable)) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iOooOO0o = (int) ((OooOO0o(this.f17748Oooo0oO.get(this.f17739Oooo).floatValue()) * this.f17767o000oOoO) + this.f17738OooOooo);
            int iOooO0O0 = OooO0O0();
            int i = this.f17742Oooo00O;
            o00Ooo.OooO0O0.OooO0o(background, iOooOO0o - i, iOooO0O0 - i, iOooOO0o + i, iOooO0O0 + i);
        }
    }

    public final void OooOOo0(int i, Rect rect) {
        int iOooOO0o = this.f17738OooOooo + ((int) (OooOO0o(getValues().get(i).floatValue()) * this.f17767o000oOoO));
        int iOooO0O0 = OooO0O0();
        int i2 = this.f17741Oooo000;
        int i3 = this.f17732OooOoO;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(iOooOO0o - i4, iOooO0O0 - i4, iOooOO0o + i4, iOooO0O0 + i4);
    }

    public final void OooOOoo() {
        boolean z;
        int iMax = Math.max(this.f17734OooOoOO, Math.max(this.f17737OooOooO + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.f17741Oooo000 * 2)));
        boolean z2 = false;
        if (iMax == this.f17736OooOoo0) {
            z = false;
        } else {
            this.f17736OooOoo0 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max(this.f17741Oooo000 - this.f17730OooOo0O, 0), Math.max((this.f17737OooOooO - this.f17731OooOo0o) / 2, 0)), Math.max(Math.max(this.f17750OoooO - this.f17727OooOo, 0), Math.max(this.f17754OoooOO0 - this.f17733OooOoO0, 0))) + this.f17728OooOo0;
        if (this.f17738OooOooo != iMax2) {
            this.f17738OooOooo = iMax2;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                this.f17767o000oOoO = Math.max(getWidth() - (this.f17738OooOooo * 2), 0);
                OooO();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void OooOo00() {
        if (this.f17756OoooOOo) {
            float f = this.f17747Oooo0o0;
            float f2 = this.f17746Oooo0o;
            if (f >= f2) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f17747Oooo0o0), Float.valueOf(this.f17746Oooo0o)));
            }
            if (f2 <= f) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f17746Oooo0o), Float.valueOf(this.f17747Oooo0o0)));
            }
            if (this.f17752OoooO00 > 0.0f && !OooO0o(f2 - f)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f17752OoooO00), Float.valueOf(this.f17747Oooo0o0), Float.valueOf(this.f17746Oooo0o)));
            }
            for (Float f3 : this.f17748Oooo0oO) {
                if (f3.floatValue() < this.f17747Oooo0o0 || f3.floatValue() > this.f17746Oooo0o) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f3, Float.valueOf(this.f17747Oooo0o0), Float.valueOf(this.f17746Oooo0o)));
                }
                if (this.f17752OoooO00 > 0.0f && !OooO0o(f3.floatValue() - this.f17747Oooo0o0)) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f3, Float.valueOf(this.f17747Oooo0o0), Float.valueOf(this.f17752OoooO00), Float.valueOf(this.f17752OoooO00)));
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            }
            float f4 = this.f17752OoooO00;
            if (f4 > 0.0f && minSeparation > 0.0f) {
                if (this.f17765Oooooo != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17752OoooO00)));
                }
                if (minSeparation < f4 || !OooO0o(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17752OoooO00), Float.valueOf(this.f17752OoooO00)));
                }
            }
            float f5 = this.f17752OoooO00;
            if (f5 != 0.0f) {
                if (((int) f5) != f5) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f5)));
                }
                float f6 = this.f17747Oooo0o0;
                if (((int) f6) != f6) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f6)));
                }
                float f7 = this.f17746Oooo0o;
                if (((int) f7) != f7) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f7)));
                }
            }
            this.f17756OoooOOo = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f17717OooOO0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f17712OooO0Oo.setColor(OooO0o0(this.f17761Ooooo0o));
        this.f17714OooO0o0.setColor(OooO0o0(this.f17760Ooooo00));
        this.f17716OooO0oo.setColor(OooO0o0(this.f17759OoooOoo));
        this.f17711OooO.setColor(OooO0o0(this.f17758OoooOoO));
        for (o0O0O0O.OooO00o oooO00o : this.f17720OooOOO) {
            if (oooO00o.isStateful()) {
                oooO00o.setState(getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.f17762OooooO0;
        if (materialShapeDrawable.isStateful()) {
            materialShapeDrawable.setState(getDrawableState());
        }
        Paint paint = this.f17715OooO0oO;
        paint.setColor(OooO0o0(this.f17757OoooOo0));
        paint.setAlpha(63);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f17717OooOO0.f34151OooO0oo;
    }

    public int getActiveThumbIndex() {
        return this.f17749Oooo0oo;
    }

    public int getFocusedThumbIndex() {
        return this.f17739Oooo;
    }

    @Dimension
    public int getHaloRadius() {
        return this.f17742Oooo00O;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f17757OoooOo0;
    }

    public int getLabelBehavior() {
        return this.f17735OooOoo;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f17752OoooO00;
    }

    public float getThumbElevation() {
        return this.f17762OooooO0.f17582OooO0Oo.f17616OooOOO;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f17741Oooo000;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f17762OooooO0.f17582OooO0Oo.f17608OooO0Oo;
    }

    public float getThumbStrokeWidth() {
        return this.f17762OooooO0.f17582OooO0Oo.f17614OooOO0O;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f17762OooooO0.f17582OooO0Oo.f17607OooO0OO;
    }

    @Dimension
    public int getTickActiveRadius() {
        return this.f17750OoooO;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f17758OoooOoO;
    }

    @Dimension
    public int getTickInactiveRadius() {
        return this.f17754OoooOO0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f17759OoooOoo;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f17759OoooOoo.equals(this.f17758OoooOoO)) {
            return this.f17758OoooOoO;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f17760Ooooo00;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f17737OooOooO;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f17761Ooooo0o;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f17738OooOooo;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f17761Ooooo0o.equals(this.f17760Ooooo00)) {
            return this.f17760Ooooo00;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f17767o000oOoO;
    }

    public float getValueFrom() {
        return this.f17747Oooo0o0;
    }

    public float getValueTo() {
        return this.f17746Oooo0o;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f17748Oooo0oO);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (o0O0O0O.OooO00o oooO00o : this.f17720OooOOO) {
            ViewGroup viewGroupOooO0OO = oo0o0Oo.OooO0OO(this);
            if (viewGroupOooO0OO == null) {
                oooO00o.getClass();
            } else {
                oooO00o.getClass();
                int[] iArr = new int[2];
                viewGroupOooO0OO.getLocationOnScreen(iArr);
                oooO00o.f41910Oooo0o0 = iArr[0];
                viewGroupOooO0OO.getWindowVisibleDisplayFrame(oooO00o.f41904Oooo000);
                viewGroupOooO0OO.addOnLayoutChangeListener(oooO00o.f41901OooOooo);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.OooO0O0 oooO0O0 = this.f17719OooOO0o;
        if (oooO0O0 != null) {
            removeCallbacks(oooO0O0);
        }
        this.f17725OooOOo0 = false;
        for (o0O0O0O.OooO00o oooO00o : this.f17720OooOOO) {
            o0OOO0o o0ooo0oOooO0Oo = oo0o0Oo.OooO0Oo(this);
            if (o0ooo0oOooO0Oo != null) {
                o0ooo0oOooO0Oo.f17327OooO00o.remove(oooO00o);
                ViewGroup viewGroupOooO0OO = oo0o0Oo.OooO0OO(this);
                if (viewGroupOooO0OO == null) {
                    oooO00o.getClass();
                } else {
                    viewGroupOooO0OO.removeOnLayoutChangeListener(oooO00o.f41901OooOooo);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0123  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x018a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169 A[SYNTHETIC] */
    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        ArrayList arrayList;
        Iterator it;
        int i;
        if (this.f17756OoooOOo) {
            OooOo00();
            OooO();
        }
        super.onDraw(canvas);
        int iOooO0O0 = OooO0O0();
        int i2 = this.f17767o000oOoO;
        float[] activeRange = getActiveRange();
        int i3 = this.f17738OooOooo;
        float f = i2;
        float f2 = i3 + (activeRange[1] * f);
        float f3 = i3 + i2;
        Paint paint = this.f17712OooO0Oo;
        if (f2 < f3) {
            float f4 = iOooO0O0;
            canvas.drawLine(f2, f4, f3, f4, paint);
        }
        float f5 = this.f17738OooOooo;
        float f6 = (activeRange[0] * f) + f5;
        if (f6 > f5) {
            float f7 = iOooO0O0;
            canvas.drawLine(f5, f7, f6, f7, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f17747Oooo0o0) {
            int i4 = this.f17767o000oOoO;
            float[] activeRange2 = getActiveRange();
            float f8 = this.f17738OooOooo;
            float f9 = i4;
            float f10 = iOooO0O0;
            canvas.drawLine((activeRange2[0] * f9) + f8, f10, (activeRange2[1] * f9) + f8, f10, this.f17714OooO0o0);
        }
        if (this.f17753OoooO0O && this.f17752OoooO00 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int iRound = Math.round(activeRange3[0] * ((this.f17751OoooO0.length / 2) - 1));
            int iRound2 = Math.round(activeRange3[1] * ((this.f17751OoooO0.length / 2) - 1));
            float[] fArr = this.f17751OoooO0;
            int i5 = iRound * 2;
            Paint paint2 = this.f17716OooO0oo;
            canvas.drawPoints(fArr, 0, i5, paint2);
            int i6 = iRound2 * 2;
            canvas.drawPoints(this.f17751OoooO0, i5, i6 - i5, this.f17711OooO);
            float[] fArr2 = this.f17751OoooO0;
            canvas.drawPoints(fArr2, i6, fArr2.length - i6, paint2);
        }
        if ((this.f17745Oooo0OO || isFocused()) && isEnabled()) {
            int i7 = this.f17767o000oOoO;
            if (!(getBackground() instanceof RippleDrawable)) {
                int iOooOO0o = (int) ((OooOO0o(this.f17748Oooo0oO.get(this.f17739Oooo).floatValue()) * i7) + this.f17738OooOooo);
                if (Build.VERSION.SDK_INT < 28) {
                    int i8 = this.f17742Oooo00O;
                    canvas.clipRect(iOooOO0o - i8, iOooO0O0 - i8, iOooOO0o + i8, i8 + iOooO0O0, Region.Op.UNION);
                }
                canvas.drawCircle(iOooOO0o, iOooO0O0, this.f17742Oooo00O, this.f17715OooO0oO);
            }
        }
        if (this.f17749Oooo0oo == -1) {
            if (this.f17735OooOoo == 3) {
                if (isEnabled()) {
                    if (this.f17735OooOoo != 2) {
                        if (!this.f17725OooOOo0) {
                            this.f17725OooOOo0 = true;
                            ValueAnimator valueAnimatorOooO0OO = OooO0OO(true);
                            this.f17724OooOOo = valueAnimatorOooO0OO;
                            this.f17726OooOOoo = null;
                            valueAnimatorOooO0OO.start();
                        }
                        arrayList = this.f17720OooOOO;
                        it = arrayList.iterator();
                        for (i = 0; i < this.f17748Oooo0oO.size(); i++) {
                            if (i == this.f17739Oooo) {
                                OooOOOO((o0O0O0O.OooO00o) it.next(), this.f17748Oooo0oO.get(i).floatValue());
                            }
                        }
                        if (it.hasNext()) {
                            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f17748Oooo0oO.size())));
                        }
                        OooOOOO((o0O0O0O.OooO00o) it.next(), this.f17748Oooo0oO.get(this.f17739Oooo).floatValue());
                    }
                } else if (this.f17725OooOOo0) {
                    this.f17725OooOOo0 = false;
                    ValueAnimator valueAnimatorOooO0OO2 = OooO0OO(false);
                    this.f17726OooOOoo = valueAnimatorOooO0OO2;
                    this.f17724OooOOo = null;
                    valueAnimatorOooO0OO2.addListener(new com.google.android.material.slider.OooO0OO(this));
                    this.f17726OooOOoo.start();
                }
            } else if (this.f17725OooOOo0) {
                this.f17725OooOOo0 = false;
                ValueAnimator valueAnimatorOooO0OO3 = OooO0OO(false);
                this.f17726OooOOoo = valueAnimatorOooO0OO3;
                this.f17724OooOOo = null;
                valueAnimatorOooO0OO3.addListener(new com.google.android.material.slider.OooO0OO(this));
                this.f17726OooOOoo.start();
            }
        } else if (isEnabled()) {
            if (this.f17735OooOoo != 2) {
                if (!this.f17725OooOOo0) {
                    this.f17725OooOOo0 = true;
                    ValueAnimator valueAnimatorOooO0OO4 = OooO0OO(true);
                    this.f17724OooOOo = valueAnimatorOooO0OO4;
                    this.f17726OooOOoo = null;
                    valueAnimatorOooO0OO4.start();
                }
                arrayList = this.f17720OooOOO;
                it = arrayList.iterator();
                while (i < this.f17748Oooo0oO.size() && it.hasNext()) {
                    if (i == this.f17739Oooo) {
                        OooOOOO((o0O0O0O.OooO00o) it.next(), this.f17748Oooo0oO.get(i).floatValue());
                    }
                }
                if (it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f17748Oooo0oO.size())));
                }
                OooOOOO((o0O0O0O.OooO00o) it.next(), this.f17748Oooo0oO.get(this.f17739Oooo).floatValue());
            }
        } else if (this.f17725OooOOo0) {
            this.f17725OooOOo0 = false;
            ValueAnimator valueAnimatorOooO0OO5 = OooO0OO(false);
            this.f17726OooOOoo = valueAnimatorOooO0OO5;
            this.f17724OooOOo = null;
            valueAnimatorOooO0OO5.addListener(new com.google.android.material.slider.OooO0OO(this));
            this.f17726OooOOoo.start();
        }
        int i9 = this.f17767o000oOoO;
        for (int i10 = 0; i10 < this.f17748Oooo0oO.size(); i10++) {
            float fFloatValue = this.f17748Oooo0oO.get(i10).floatValue();
            Drawable drawable = this.f17763OooooOO;
            if (drawable != null) {
                OooO0Oo(canvas, i9, iOooO0O0, fFloatValue, drawable);
            } else if (i10 < this.f17764OooooOo.size()) {
                OooO0Oo(canvas, i9, iOooO0O0, fFloatValue, this.f17764OooooOo.get(i10));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((OooOO0o(fFloatValue) * i9) + this.f17738OooOooo, iOooO0O0, this.f17741Oooo000, this.f17713OooO0o);
                }
                OooO0Oo(canvas, i9, iOooO0O0, fFloatValue, this.f17762OooooO0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        OooO0OO oooO0OO = this.f17717OooOO0;
        if (!z) {
            this.f17749Oooo0oo = -1;
            oooO0OO.OooO00o(this.f17739Oooo);
            return;
        }
        if (i == 1) {
            OooOO0(Integer.MAX_VALUE);
        } else if (i == 2) {
            OooOO0(Integer.MIN_VALUE);
        } else if (i == 17) {
            OooOO0O(Integer.MAX_VALUE);
        } else if (i == 66) {
            OooOO0O(Integer.MIN_VALUE);
        }
        oooO0OO.OooOOO0(this.f17739Oooo);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f17748Oooo0oO.size() == 1) {
            this.f17749Oooo0oo = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f17749Oooo0oo == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.f17749Oooo0oo = this.f17739Oooo;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    OooOO0(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    OooOO0(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            OooOO0O(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            OooOO0O(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.f17749Oooo0oo = this.f17739Oooo;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    OooOO0(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(OooOO0(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(OooOO0(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.f17755OoooOOO | keyEvent.isLongPress();
        this.f17755OoooOOO = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f = this.f17752OoooO00;
            fRound = f != 0.0f ? f : 1.0f;
            float f2 = (this.f17746Oooo0o - this.f17747Oooo0o0) / fRound;
            float f3 = 20;
            if (f2 > f3) {
                fRound *= Math.round(f2 / f3);
            }
        } else {
            float f4 = this.f17752OoooO00;
            if (f4 != 0.0f) {
                fRound = f4;
            }
        }
        if (i == 21) {
            if (!OooO0oo()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (OooO0oo()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (OooOOOo(fValueOf.floatValue() + this.f17748Oooo0oO.get(this.f17749Oooo0oo).floatValue(), this.f17749Oooo0oo)) {
                OooOOo();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return OooOO0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return OooOO0(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f17749Oooo0oo = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f17755OoooOOO = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicHeight;
        int i3 = this.f17736OooOoo0;
        int i4 = this.f17735OooOoo;
        if (i4 != 1) {
            intrinsicHeight = i4 == 3 ? ((o0O0O0O.OooO00o) this.f17720OooOOO.get(0)).getIntrinsicHeight() : 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + intrinsicHeight, Pow2.MAX_POW2));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f17747Oooo0o0 = sliderState.f17773OooO0Oo;
        this.f17746Oooo0o = sliderState.f17775OooO0o0;
        setValuesInternal(sliderState.f17774OooO0o);
        this.f17752OoooO00 = sliderState.f17776OooO0oO;
        if (sliderState.f17777OooO0oo) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f17773OooO0Oo = this.f17747Oooo0o0;
        sliderState.f17775OooO0o0 = this.f17746Oooo0o;
        sliderState.f17774OooO0o = new ArrayList<>(this.f17748Oooo0oO);
        sliderState.f17776OooO0oO = this.f17752OoooO00;
        sliderState.f17777OooO0oo = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f17767o000oOoO = Math.max(i - (this.f17738OooOooo * 2), 0);
        OooO();
        OooOOo();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[LOOP:0: B:40:0x00ca->B:42:0x00d0, LOOP_END] */
    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        float f;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f2 = (x - this.f17738OooOooo) / this.f17767o000oOoO;
        this.f17766Oooooo0 = f2;
        float fMax = Math.max(0.0f, f2);
        this.f17766Oooooo0 = fMax;
        this.f17766Oooooo0 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i = this.f17729OooOo00;
            if (actionMasked == 1) {
                this.f17745Oooo0OO = false;
                motionEvent2 = this.f17744Oooo0O0;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                    f = i;
                    if (Math.abs(this.f17744Oooo0O0.getX() - motionEvent.getX()) <= f && Math.abs(this.f17744Oooo0O0.getY() - motionEvent.getY()) <= f && OooOOO()) {
                        OooOOO0();
                    }
                }
                if (this.f17749Oooo0oo != -1) {
                    OooOOOo(getValueOfTouchPosition(), this.f17749Oooo0oo);
                    OooOOo();
                    this.f17749Oooo0oo = -1;
                    it = this.f17723OooOOOo.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.material.slider.OooO0O0) it.next()).OooO00o();
                    }
                }
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.f17745Oooo0OO) {
                    if (OooO0oO(motionEvent) && Math.abs(x - this.f17740Oooo0) < i) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    OooOOO0();
                }
                if (OooOOO()) {
                    this.f17745Oooo0OO = true;
                    OooOOOo(getValueOfTouchPosition(), this.f17749Oooo0oo);
                    OooOOo();
                    invalidate();
                }
            } else if (actionMasked == 3) {
                this.f17745Oooo0OO = false;
                motionEvent2 = this.f17744Oooo0O0;
                if (motionEvent2 != null) {
                    f = i;
                    if (Math.abs(this.f17744Oooo0O0.getX() - motionEvent.getX()) <= f) {
                        OooOOO0();
                    }
                }
                if (this.f17749Oooo0oo != -1) {
                    OooOOOo(getValueOfTouchPosition(), this.f17749Oooo0oo);
                    OooOOo();
                    this.f17749Oooo0oo = -1;
                    it = this.f17723OooOOOo.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.material.slider.OooO0O0) it.next()).OooO00o();
                    }
                }
                invalidate();
            }
        } else {
            this.f17740Oooo0 = x;
            if (!OooO0oO(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (OooOOO()) {
                    requestFocus();
                    this.f17745Oooo0OO = true;
                    OooOOOo(getValueOfTouchPosition(), this.f17749Oooo0oo);
                    OooOOo();
                    invalidate();
                    OooOOO0();
                }
            }
        }
        setPressed(this.f17745Oooo0OO);
        this.f17744Oooo0O0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        o0OOO0o o0ooo0oOooO0Oo;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (o0ooo0oOooO0Oo = oo0o0Oo.OooO0Oo(this)) == null) {
            return;
        }
        Iterator it = this.f17720OooOOO.iterator();
        while (it.hasNext()) {
            o0ooo0oOooO0Oo.f17327OooO00o.remove((o0O0O0O.OooO00o) it.next());
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f17749Oooo0oo = i;
    }

    public void setCustomThumbDrawable(@DrawableRes int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f17748Oooo0oO.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f17739Oooo = i;
        this.f17717OooOO0.OooOOO0(i);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (i == this.f17742Oooo00O) {
            return;
        }
        this.f17742Oooo00O = i;
        Drawable background = getBackground();
        if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.f17742Oooo00O);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17757OoooOo0)) {
            return;
        }
        this.f17757OoooOo0 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f17715OooO0oO;
        paint.setColor(OooO0o0(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f17735OooOoo != i) {
            this.f17735OooOoo = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable OooO0o oooO0o) {
    }

    public void setSeparationUnit(int i) {
        this.f17765Oooooo = i;
        this.f17756OoooOOo = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f17747Oooo0o0), Float.valueOf(this.f17746Oooo0o)));
        }
        if (this.f17752OoooO00 != f) {
            this.f17752OoooO00 = f;
            this.f17756OoooOOo = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f17762OooooO0.OooOOO0(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (i == this.f17741Oooo000) {
            return;
        }
        this.f17741Oooo000 = i;
        MaterialShapeDrawable materialShapeDrawable = this.f17762OooooO0;
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
        float f = this.f17741Oooo000;
        OooO oooOOooO00o = OooOOO.OooO00o(0);
        oooO00o.f17640OooO00o = oooOOooO00o;
        float fOooO00o = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o);
        if (fOooO00o != -1.0f) {
            oooO00o.OooO0o0(fOooO00o);
        }
        oooO00o.f17641OooO0O0 = oooOOooO00o;
        float fOooO00o2 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o);
        if (fOooO00o2 != -1.0f) {
            oooO00o.OooO0o(fOooO00o2);
        }
        oooO00o.f17642OooO0OO = oooOOooO00o;
        float fOooO00o3 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o);
        if (fOooO00o3 != -1.0f) {
            oooO00o.OooO0Oo(fOooO00o3);
        }
        oooO00o.f17643OooO0Oo = oooOOooO00o;
        float fOooO00o4 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o);
        if (fOooO00o4 != -1.0f) {
            oooO00o.OooO0OO(fOooO00o4);
        }
        oooO00o.OooO0O0(f);
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o));
        int i2 = this.f17741Oooo000 * 2;
        materialShapeDrawable.setBounds(0, 0, i2, i2);
        Drawable drawable = this.f17763OooooOO;
        if (drawable != null) {
            OooO00o(drawable);
        }
        Iterator<Drawable> it = this.f17764OooooOo.iterator();
        while (it.hasNext()) {
            OooO00o(it.next());
        }
        OooOOoo();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f17762OooooO0.OooOOoo(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(ContextCompat.OooO0O0(i, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f17762OooooO0.OooOo00(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f17762OooooO0;
        if (colorStateList.equals(materialShapeDrawable.f17582OooO0Oo.f17607OooO0OO)) {
            return;
        }
        materialShapeDrawable.OooOOO(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (this.f17750OoooO != i) {
            this.f17750OoooO = i;
            this.f17711OooO.setStrokeWidth(i * 2);
            OooOOoo();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17758OoooOoO)) {
            return;
        }
        this.f17758OoooOoO = colorStateList;
        this.f17711OooO.setColor(OooO0o0(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (this.f17754OoooOO0 != i) {
            this.f17754OoooOO0 = i;
            this.f17716OooO0oo.setStrokeWidth(i * 2);
            OooOOoo();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17759OoooOoo)) {
            return;
        }
        this.f17759OoooOoo = colorStateList;
        this.f17716OooO0oo.setColor(OooO0o0(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f17753OoooO0O != z) {
            this.f17753OoooO0O = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17760Ooooo00)) {
            return;
        }
        this.f17760Ooooo00 = colorStateList;
        this.f17714OooO0o0.setColor(OooO0o0(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (this.f17737OooOooO != i) {
            this.f17737OooOooO = i;
            this.f17712OooO0Oo.setStrokeWidth(i);
            this.f17714OooO0o0.setStrokeWidth(this.f17737OooOooO);
            OooOOoo();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17761Ooooo0o)) {
            return;
        }
        this.f17761Ooooo0o = colorStateList;
        this.f17712OooO0Oo.setColor(OooO0o0(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f17747Oooo0o0 = f;
        this.f17756OoooOOo = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f17746Oooo0o = f;
        this.f17756OoooOOo = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.sliderStyle);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        OooO00o(drawableNewDrawable);
        this.f17763OooooOO = drawableNewDrawable;
        this.f17764OooooOo.clear();
        postInvalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17706OoooooO;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17720OooOOO = new ArrayList();
        this.f17722OooOOOO = new ArrayList();
        this.f17723OooOOOo = new ArrayList();
        this.f17725OooOOo0 = false;
        this.f17745Oooo0OO = false;
        this.f17748Oooo0oO = new ArrayList<>();
        this.f17749Oooo0oo = -1;
        this.f17739Oooo = -1;
        this.f17752OoooO00 = 0.0f;
        this.f17753OoooO0O = true;
        this.f17755OoooOOO = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f17762OooooO0 = materialShapeDrawable;
        this.f17764OooooOo = Collections.emptyList();
        this.f17765Oooooo = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f17712OooO0Oo = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f17714OooO0o0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f17713OooO0o = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f17715OooO0oO = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f17716OooO0oo = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f17711OooO = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f17734OooOoOO = resources.getDimensionPixelSize(o00000O.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(o00000O.mtrl_slider_track_side_padding);
        this.f17728OooOo0 = dimensionPixelOffset;
        this.f17738OooOooo = dimensionPixelOffset;
        this.f17730OooOo0O = resources.getDimensionPixelSize(o00000O.mtrl_slider_thumb_radius);
        this.f17731OooOo0o = resources.getDimensionPixelSize(o00000O.mtrl_slider_track_height);
        int i3 = o00000O.mtrl_slider_tick_radius;
        this.f17727OooOo = resources.getDimensionPixelSize(i3);
        this.f17733OooOoO0 = resources.getDimensionPixelSize(i3);
        this.f17743Oooo00o = resources.getDimensionPixelSize(o00000O.mtrl_slider_label_padding);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.Slider, i, i2, new int[0]);
        this.f17721OooOOO0 = typedArrayOooO0Oo.getResourceId(o000OO.Slider_labelStyle, o0000O0O.Widget_MaterialComponents_Tooltip);
        this.f17747Oooo0o0 = typedArrayOooO0Oo.getFloat(o000OO.Slider_android_valueFrom, 0.0f);
        this.f17746Oooo0o = typedArrayOooO0Oo.getFloat(o000OO.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f17747Oooo0o0));
        this.f17752OoooO00 = typedArrayOooO0Oo.getFloat(o000OO.Slider_android_stepSize, 0.0f);
        this.f17732OooOoO = (int) Math.ceil(typedArrayOooO0Oo.getDimension(o000OO.Slider_minTouchTargetSize, (float) Math.ceil(oo0o0Oo.OooO0O0(48, getContext()))));
        int i4 = o000OO.Slider_trackColor;
        boolean zHasValue = typedArrayOooO0Oo.hasValue(i4);
        int i5 = zHasValue ? i4 : o000OO.Slider_trackColorInactive;
        i4 = zHasValue ? i4 : o000OO.Slider_trackColorActive;
        ColorStateList colorStateListOooO00o = c1.OooO00o(context2, typedArrayOooO0Oo, i5);
        setTrackInactiveTintList(colorStateListOooO00o == null ? ContextCompat.OooO0O0(o00000O0.material_slider_inactive_track_color, context2) : colorStateListOooO00o);
        ColorStateList colorStateListOooO00o2 = c1.OooO00o(context2, typedArrayOooO0Oo, i4);
        setTrackActiveTintList(colorStateListOooO00o2 == null ? ContextCompat.OooO0O0(o00000O0.material_slider_active_track_color, context2) : colorStateListOooO00o2);
        materialShapeDrawable.OooOOO(c1.OooO00o(context2, typedArrayOooO0Oo, o000OO.Slider_thumbColor));
        int i6 = o000OO.Slider_thumbStrokeColor;
        if (typedArrayOooO0Oo.hasValue(i6)) {
            setThumbStrokeColor(c1.OooO00o(context2, typedArrayOooO0Oo, i6));
        }
        setThumbStrokeWidth(typedArrayOooO0Oo.getDimension(o000OO.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListOooO00o3 = c1.OooO00o(context2, typedArrayOooO0Oo, o000OO.Slider_haloColor);
        setHaloTintList(colorStateListOooO00o3 == null ? ContextCompat.OooO0O0(o00000O0.material_slider_halo_color, context2) : colorStateListOooO00o3);
        this.f17753OoooO0O = typedArrayOooO0Oo.getBoolean(o000OO.Slider_tickVisible, true);
        int i7 = o000OO.Slider_tickColor;
        boolean zHasValue2 = typedArrayOooO0Oo.hasValue(i7);
        int i8 = zHasValue2 ? i7 : o000OO.Slider_tickColorInactive;
        i7 = zHasValue2 ? i7 : o000OO.Slider_tickColorActive;
        ColorStateList colorStateListOooO00o4 = c1.OooO00o(context2, typedArrayOooO0Oo, i8);
        setTickInactiveTintList(colorStateListOooO00o4 == null ? ContextCompat.OooO0O0(o00000O0.material_slider_inactive_tick_marks_color, context2) : colorStateListOooO00o4);
        ColorStateList colorStateListOooO00o5 = c1.OooO00o(context2, typedArrayOooO0Oo, i7);
        setTickActiveTintList(colorStateListOooO00o5 == null ? ContextCompat.OooO0O0(o00000O0.material_slider_active_tick_marks_color, context2) : colorStateListOooO00o5);
        setThumbRadius(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Slider_haloRadius, 0));
        setThumbElevation(typedArrayOooO0Oo.getDimension(o000OO.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Slider_tickRadiusActive, 0));
        setTickInactiveRadius(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Slider_tickRadiusInactive, 0));
        setLabelBehavior(typedArrayOooO0Oo.getInt(o000OO.Slider_labelBehavior, 0));
        if (!typedArrayOooO0Oo.getBoolean(o000OO.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayOooO0Oo.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.OooOOo(2);
        this.f17729OooOo00 = ViewConfiguration.get(context2).getScaledTouchSlop();
        OooO0OO oooO0OO = new OooO0OO(this);
        this.f17717OooOO0 = oooO0OO;
        ViewCompat.OooOOOO(this, oooO0OO);
        this.f17718OooOO0O = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f17763OooooOO = null;
        this.f17764OooooOo = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f17764OooooOo;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            OooO00o(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
