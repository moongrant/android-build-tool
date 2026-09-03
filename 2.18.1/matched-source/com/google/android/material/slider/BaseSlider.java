package com.google.android.material.slider;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.OooO00o;
import com.google.android.material.slider.OooO0O0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.ULong;
import o000O0O0.o00000O;
import p012OooOo0.OooOO0O;
import p021OooOooo.o00O0O;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.OooOo;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;
import p427o0OoO0o.o000000;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.OooO00o<S>, T extends com.google.android.material.slider.OooO0O0<S>> extends View {

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public static final int f17617o0000Ooo = Oooo000.Widget_MaterialComponents_Slider;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final Paint f17618Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Paint f17619Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final Paint f17620Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final Paint f17621Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final AccessibilityManager f17622OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NonNull
    public final Paint f17623OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final Paint f17624OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final OooO f17625OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public BaseSlider<S, L, T>.OooO0o f17626OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NonNull
    public final List<o0OOOO00.OooO00o> f17627OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NonNull
    public final List<L> f17628OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NonNull
    public final List<T> f17629OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f17630OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ValueAnimator f17631OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ValueAnimator f17632Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int f17633Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f17634OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f17635OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f17636OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17637Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f17638Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f17639OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f17640Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @NonNull
    public ColorStateList f17641o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @NonNull
    public ColorStateList f17642o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NonNull
    public ColorStateList f17643o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @NonNull
    public ColorStateList f17644o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @Nullable
    public Drawable f17645o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f17646o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    @NonNull
    public List<Drawable> f17647o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public float f17648o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public int f17649o00000o0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @NonNull
    public ColorStateList f17650o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NonNull
    public final OooO00o f17651o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f17652o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f17653o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public MotionEvent f17654o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public com.google.android.material.slider.OooO0OO f17655o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ArrayList<Float> f17656o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public float f17657o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f17658o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f17659o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f17660o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public float[] f17661o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f17662o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f17663o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public int f17664o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f17665o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public float f17666o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public float f17667oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f17668oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f17669ooOO;

    public static class OooO extends o000000 {

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final Rect f17670OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f17671OooOOo0;

        public OooO(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f17670OooOOo = new Rect();
            this.f17671OooOOo0 = baseSlider;
        }

        @Override // p427o0OoO0o.o000000
        public final int OooOOOO(float f, float f2) {
            for (int i = 0; i < this.f17671OooOOo0.getValues().size(); i++) {
                this.f17671OooOOo0.OooOoO0(i, this.f17670OooOOo);
                if (this.f17670OooOOo.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOOOo(List<Integer> list) {
            for (int i = 0; i < this.f17671OooOOo0.getValues().size(); i++) {
                ((ArrayList) list).add(Integer.valueOf(i));
            }
        }

        @Override // p427o0OoO0o.o000000
        public final boolean OooOo00(int i, int i2, Bundle bundle) {
            if (!this.f17671OooOOo0.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    BaseSlider<?, ?, ?> baseSlider = this.f17671OooOOo0;
                    int i3 = BaseSlider.f17617o0000Ooo;
                    if (baseSlider.OooOo0o(i, f)) {
                        this.f17671OooOOo0.OooOoO();
                        this.f17671OooOOo0.postInvalidate();
                        OooOOo0(i);
                        return true;
                    }
                }
                return false;
            }
            BaseSlider<?, ?, ?> baseSlider2 = this.f17671OooOOo0;
            int i4 = BaseSlider.f17617o0000Ooo;
            float fOooO0OO = baseSlider2.OooO0OO();
            if (i2 == 8192) {
                fOooO0OO = -fOooO0OO;
            }
            if (this.f17671OooOOo0.OooOOO0()) {
                fOooO0OO = -fOooO0OO;
            }
            if (!this.f17671OooOOo0.OooOo0o(i, o00O0O.OooO0Oo(this.f17671OooOOo0.getValues().get(i).floatValue() + fOooO0OO, this.f17671OooOOo0.getValueFrom(), this.f17671OooOOo0.getValueTo()))) {
                return false;
            }
            this.f17671OooOOo0.OooOoO();
            this.f17671OooOOo0.postInvalidate();
            OooOOo0(i);
            return true;
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOo0O(int i, o0000OO0 o0000oo1) {
            String string;
            o0000oo1.OooO0O0(o0000OO0.OooO00o.f28211OooOOoo);
            List<Float> values = this.f17671OooOOo0.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f17671OooOOo0.getValueFrom();
            float valueTo = this.f17671OooOOo0.getValueTo();
            if (this.f17671OooOOo0.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    o0000oo1.OooO00o(8192);
                }
                if (fFloatValue < valueTo) {
                    o0000oo1.OooO00o(4096);
                }
            }
            o0000oo1.f28194OooO00o.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
            o0000oo1.Oooo000(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f17671OooOOo0.getContentDescription() != null) {
                sb.append(this.f17671OooOOo0.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                if (i == this.f17671OooOOo0.getValues().size() - 1) {
                    string = this.f17671OooOOo0.getContext().getString(OooOo.material_slider_range_end);
                } else {
                    string = i == 0 ? this.f17671OooOOo0.getContext().getString(OooOo.material_slider_range_start) : "";
                }
                sb.append(string);
                sb.append(this.f17671OooOOo0.OooO(fFloatValue));
            }
            o0000oo1.Oooo0O0(sb.toString());
            this.f17671OooOOo0.OooOoO0(i, this.f17670OooOOo);
            o0000oo1.OooOoo0(this.f17670OooOOo);
        }
    }

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AttributeSet f17672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f17673OooO0O0;

        public OooO00o(AttributeSet attributeSet, int i) {
            this.f17672OooO00o = attributeSet;
            this.f17673OooO0O0 = i;
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (o0OOOO00.OooO00o oooO00o : BaseSlider.this.f17627OoooOOO) {
                oooO00o.f38212o0OO00O = 1.2f;
                oooO00o.f38213o0OOO0o = fFloatValue;
                oooO00o.f38214o0Oo0oo = fFloatValue;
                oooO00o.f38219oo0o0Oo = p338o0OO0o0O.OooO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 0.19f, 1.0f, fFloatValue);
                oooO00o.invalidateSelf();
            }
            BaseSlider baseSlider = BaseSlider.this;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(baseSlider);
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {
        public OooO0OO() {
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f17627OoooOOO.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.internal.o00O0O) o00Ooo.OooO0Oo(BaseSlider.this)).f17357OooO00o.remove((o0OOOO00.OooO00o) it.next());
            }
        }
    }

    public class OooO0o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f17677Oooo0o = -1;

        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f17625OoooO0O.OooOoO0(this.f17677Oooo0o, 4);
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public float f17679Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public float f17680Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f17681Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public ArrayList<Float> f17682Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f17683OoooO00;

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

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f17680Oooo0o);
            parcel.writeFloat(this.f17681Oooo0oO);
            parcel.writeList(this.f17682Oooo0oo);
            parcel.writeFloat(this.f17679Oooo);
            parcel.writeBooleanArray(new boolean[]{this.f17683OoooO00});
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f17680Oooo0o = parcel.readFloat();
            this.f17681Oooo0oO = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f17682Oooo0oo = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f17679Oooo = parcel.readFloat();
            this.f17683OoooO00 = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f17656o00oO0O.size() == 1) {
            fFloatValue2 = this.f17667oo000o;
        }
        float fOooOOo0 = OooOOo0(fFloatValue2);
        float fOooOOo1 = OooOOo0(fFloatValue);
        return OooOOO0() ? new float[]{fOooOOo1, fOooOOo0} : new float[]{fOooOOo0, fOooOOo1};
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f = this.f17648o00000Oo;
        float f2 = this.f17666o0ooOoO;
        if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            int i = (int) ((this.f17657o00oO0o - this.f17667oo000o) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (OooOOO0()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f17657o00oO0o;
        float f4 = this.f17667oo000o;
        return (float) ((dRound * ((double) (f3 - f4))) + ((double) f4));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f17648o00000Oo;
        if (OooOOO0()) {
            f = 1.0f - f;
        }
        float f2 = this.f17657o00oO0o;
        float f3 = this.f17667oo000o;
        return Oooo000.OooO00o.OooO00o(f2, f3, f, f3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f17656o00oO0O.size() == arrayList.size() && this.f17656o00oO0O.equals(arrayList)) {
            return;
        }
        this.f17656o00oO0O = arrayList;
        this.f17659o0O0O00 = true;
        this.f17665o0ooOOo = 0;
        OooOoO();
        if (this.f17627OoooOOO.size() > this.f17656o00oO0O.size()) {
            List<o0OOOO00.OooO00o> listSubList = this.f17627OoooOOO.subList(this.f17656o00oO0O.size(), this.f17627OoooOOO.size());
            for (o0OOOO00.OooO00o oooO00o : listSubList) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooOO0O.OooO0O0(this)) {
                    OooO0o(oooO00o);
                }
            }
            listSubList.clear();
        }
        while (this.f17627OoooOOO.size() < this.f17656o00oO0O.size()) {
            OooO00o oooO00o2 = this.f17651o000oOoO;
            TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(BaseSlider.this.getContext(), oooO00o2.f17672OooO00o, Oooo0.Slider, oooO00o2.f17673OooO0O0, f17617o0000Ooo, new int[0]);
            Context context = BaseSlider.this.getContext();
            int resourceId = typedArrayOooO0Oo.getResourceId(Oooo0.Slider_labelStyle, Oooo000.Widget_MaterialComponents_Tooltip);
            o0OOOO00.OooO00o oooO00o3 = new o0OOOO00.OooO00o(context, resourceId);
            TypedArray typedArrayOooO0Oo2 = o000oOoO.OooO0Oo(oooO00o3.f38205o00O0O, null, Oooo0.Tooltip, 0, resourceId, new int[0]);
            oooO00o3.f38216o0ooOOo = oooO00o3.f38205o00O0O.getResources().getDimensionPixelSize(OooOO0.mtrl_tooltip_arrowSize);
            com.google.android.material.shape.OooO00o oooO00o4 = oooO00o3.f17510Oooo0o.f17534OooO00o;
            Objects.requireNonNull(oooO00o4);
            com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o4);
            c0110OooO00o.f17577OooOO0O = oooO00o3.OooOoo();
            oooO00o3.setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(c0110OooO00o));
            CharSequence text = typedArrayOooO0Oo2.getText(Oooo0.Tooltip_android_text);
            if (!TextUtils.equals(oooO00o3.f38220ooOO, text)) {
                oooO00o3.f38220ooOO = text;
                oooO00o3.f38207o00Ooo.f17327OooO0Oo = true;
                oooO00o3.invalidateSelf();
            }
            o0OOO0O.OooO0o oooO0oOooO0o0 = o0OOO0O.OooO0OO.OooO0o0(oooO00o3.f38205o00O0O, typedArrayOooO0Oo2, Oooo0.Tooltip_android_textAppearance);
            if (oooO0oOooO0o0 != null) {
                int i = Oooo0.Tooltip_android_textColor;
                if (typedArrayOooO0Oo2.hasValue(i)) {
                    oooO0oOooO0o0.f38044OooOO0 = o0OOO0O.OooO0OO.OooO00o(oooO00o3.f38205o00O0O, typedArrayOooO0Oo2, i);
                }
            }
            oooO00o3.f38207o00Ooo.OooO0O0(oooO0oOooO0o0, oooO00o3.f38205o00O0O);
            oooO00o3.OooOOOo(ColorStateList.valueOf(typedArrayOooO0Oo2.getColor(Oooo0.Tooltip_backgroundTint, p071o000O0o.OooO0o.OooO0O0(p071o000O0o.OooO0o.OooO0o0(o0OOO0O.OooO0O0.OooO0O0(oooO00o3.f38205o00O0O, p337o0OO0o0.OooO0o.colorOnBackground, o0OOOO00.OooO00o.class.getCanonicalName()), Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED), p071o000O0o.OooO0o.OooO0o0(o0OOO0O.OooO0O0.OooO0O0(oooO00o3.f38205o00O0O, R.attr.colorBackground, o0OOOO00.OooO00o.class.getCanonicalName()), 229)))));
            oooO00o3.OooOo0o(ColorStateList.valueOf(o0OOO0O.OooO0O0.OooO0O0(oooO00o3.f38205o00O0O, p337o0OO0o0.OooO0o.colorSurface, o0OOOO00.OooO00o.class.getCanonicalName())));
            oooO00o3.f38218oo000o = typedArrayOooO0Oo2.getDimensionPixelSize(Oooo0.Tooltip_android_padding, 0);
            oooO00o3.f38210o00oO0o = typedArrayOooO0Oo2.getDimensionPixelSize(Oooo0.Tooltip_android_minWidth, 0);
            oooO00o3.f38209o00oO0O = typedArrayOooO0Oo2.getDimensionPixelSize(Oooo0.Tooltip_android_minHeight, 0);
            oooO00o3.f38215o0ooOO0 = typedArrayOooO0Oo2.getDimensionPixelSize(Oooo0.Tooltip_android_layout_margin, 0);
            typedArrayOooO0Oo2.recycle();
            typedArrayOooO0Oo.recycle();
            this.f17627OoooOOO.add(oooO00o3);
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this)) {
                OooO0O0(oooO00o3);
            }
        }
        int i2 = this.f17627OoooOOO.size() == 1 ? 0 : 1;
        Iterator it = this.f17627OoooOOO.iterator();
        while (it.hasNext()) {
            ((o0OOOO00.OooO00o) it.next()).OooOo(i2);
        }
        for (L l : this.f17628OoooOOo) {
            Iterator<Float> it2 = this.f17656o00oO0O.iterator();
            while (it2.hasNext()) {
                it2.next().floatValue();
                l.OooO00o();
            }
        }
        postInvalidate();
    }

    public final String OooO(float f) {
        com.google.android.material.slider.OooO0OO oooO0OO = this.f17655o00o0O;
        if (oooO0OO != null) {
            return oooO0OO.OooO00o();
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final void OooO00o(Drawable drawable) {
        int i = this.f17663o0OoOo0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void OooO0O0(o0OOOO00.OooO00o oooO00o) {
        ViewGroup viewGroupOooO0OO = o00Ooo.OooO0OO(this);
        Objects.requireNonNull(oooO00o);
        if (viewGroupOooO0OO == null) {
            return;
        }
        int[] iArr = new int[2];
        viewGroupOooO0OO.getLocationOnScreen(iArr);
        oooO00o.f38217o0ooOoO = iArr[0];
        viewGroupOooO0OO.getWindowVisibleDisplayFrame(oooO00o.f38211o00ooo);
        viewGroupOooO0OO.addOnLayoutChangeListener(oooO00o.f38208o00o0O);
    }

    public final float OooO0OO() {
        float f = this.f17666o0ooOoO;
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f = 1.0f;
        }
        float f2 = (this.f17657o00oO0o - this.f17667oo000o) / f;
        float f3 = 20;
        return f2 <= f3 ? f : Math.round(f2 / f3) * f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    public final int OooO0Oo() {
        return this.f17640Ooooooo + ((this.f17638Oooooo0 == 1 || OooOo0()) ? ((o0OOOO00.OooO00o) this.f17627OoooOOO.get(0)).getIntrinsicHeight() : 0);
    }

    public final void OooO0o(o0OOOO00.OooO00o oooO00o) {
        o00Oo0 o00oo0OooO0Oo = o00Ooo.OooO0Oo(this);
        if (o00oo0OooO0Oo != null) {
            ((com.google.android.material.internal.o00O0O) o00oo0OooO0Oo).f17357OooO00o.remove(oooO00o);
            ViewGroup viewGroupOooO0OO = o00Ooo.OooO0OO(this);
            Objects.requireNonNull(oooO00o);
            if (viewGroupOooO0OO == null) {
                return;
            }
            viewGroupOooO0OO.removeOnLayoutChangeListener(oooO00o.f38208o00o0O);
        }
    }

    public final ValueAnimator OooO0o0(boolean z) {
        float fFloatValue = z ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f;
        ValueAnimator valueAnimator = z ? this.f17632Ooooo00 : this.f17631OoooOoo;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        valueAnimatorOfFloat.setDuration(z ? 83L : 117L);
        valueAnimatorOfFloat.setInterpolator(z ? p338o0OO0o0O.OooO0o.f37976OooO0o0 : p338o0OO0o0O.OooO0o.f37974OooO0OO);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0());
        return valueAnimatorOfFloat;
    }

    public final void OooO0oO(@NonNull Canvas canvas, int i, int i2, float f, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f17639OoooooO + ((int) (OooOOo0(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void OooO0oo() {
        if (this.f17630OoooOoO) {
            this.f17630OoooOoO = false;
            ValueAnimator valueAnimatorOooO0o0 = OooO0o0(false);
            this.f17632Ooooo00 = valueAnimatorOooO0o0;
            this.f17631OoooOoo = null;
            valueAnimatorOooO0o0.addListener(new OooO0OO());
            this.f17632Ooooo00.start();
        }
    }

    @ColorInt
    public final int OooOO0(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean OooOO0O() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final boolean OooOO0o(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f17666o0ooOoO)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final void OooOOO() {
        if (this.f17666o0ooOoO <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        OooOoOO();
        int iMin = Math.min((int) (((this.f17657o00oO0o - this.f17667oo000o) / this.f17666o0ooOoO) + 1.0f), (this.f17660o0OO00O / (this.f17637Oooooo * 2)) + 1);
        float[] fArr = this.f17661o0OOO0o;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f17661o0OOO0o = new float[iMin * 2];
        }
        float f = this.f17660o0OO00O / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f17661o0OOO0o;
            fArr2[i] = ((i / 2) * f) + this.f17639OoooooO;
            fArr2[i + 1] = OooO0Oo();
        }
    }

    public final boolean OooOOO0() {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1;
    }

    public final boolean OooOOOO(int i) {
        int i2 = this.f17665o0ooOOo;
        long j = ((long) i2) + ((long) i);
        long size = this.f17656o00oO0O.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f17665o0ooOOo = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f17664o0ooOO0 != -1) {
            this.f17664o0ooOO0 = i3;
        }
        OooOoO();
        postInvalidate();
        return true;
    }

    public final boolean OooOOOo(int i) {
        if (OooOOO0()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return OooOOOO(i);
    }

    public final void OooOOo() {
        Iterator it = this.f17629OoooOo0.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.slider.OooO0O0) it.next()).OooO0O0();
        }
    }

    public final float OooOOo0(float f) {
        float f2 = this.f17667oo000o;
        float f3 = (f - f2) / (this.f17657o00oO0o - f2);
        return OooOOO0() ? 1.0f - f3 : f3;
    }

    public boolean OooOOoo() {
        if (this.f17664o0ooOO0 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fOooOOo0 = (OooOOo0(valueOfTouchPositionAbsolute) * this.f17660o0OO00O) + this.f17639OoooooO;
        this.f17664o0ooOO0 = 0;
        float fAbs = Math.abs(this.f17656o00oO0O.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f17656o00oO0O.size(); i++) {
            float fAbs2 = Math.abs(this.f17656o00oO0O.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fOooOOo1 = (OooOOo0(this.f17656o00oO0O.get(i).floatValue()) * this.f17660o0OO00O) + this.f17639OoooooO;
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !OooOOO0() ? fOooOOo1 - fOooOOo0 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : fOooOOo1 - fOooOOo0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f17664o0ooOO0 = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fOooOOo1 - fOooOOo0) < this.f17633Ooooo0o) {
                        this.f17664o0ooOO0 = -1;
                        return false;
                    }
                    if (z) {
                        this.f17664o0ooOO0 = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f17664o0ooOO0 != -1;
    }

    public final boolean OooOo() {
        return OooOo0o(this.f17664o0ooOO0, getValueOfTouchPosition());
    }

    public final boolean OooOo0() {
        return this.f17638Oooooo0 == 3;
    }

    public final void OooOo00(o0OOOO00.OooO00o oooO00o, float f) {
        String strOooO = OooO(f);
        if (!TextUtils.equals(oooO00o.f38220ooOO, strOooO)) {
            oooO00o.f38220ooOO = strOooO;
            oooO00o.f38207o00Ooo.f17327OooO0Oo = true;
            oooO00o.invalidateSelf();
        }
        int iOooOOo0 = (this.f17639OoooooO + ((int) (OooOOo0(f) * this.f17660o0OO00O))) - (oooO00o.getIntrinsicWidth() / 2);
        int iOooO0Oo = OooO0Oo() - (this.f17652o00O0O + this.f17663o0OoOo0);
        oooO00o.setBounds(iOooOOo0, iOooO0Oo - oooO00o.getIntrinsicHeight(), oooO00o.getIntrinsicWidth() + iOooOOo0, iOooO0Oo);
        Rect rect = new Rect(oooO00o.getBounds());
        com.google.android.material.internal.OooO0o.OooO0OO(o00Ooo.OooO0OO(this), this, rect);
        oooO00o.setBounds(rect);
        ((com.google.android.material.internal.o00O0O) o00Ooo.OooO0Oo(this)).f17357OooO00o.add(oooO00o);
    }

    public final boolean OooOo0O() {
        return !(getBackground() instanceof RippleDrawable);
    }

    public final boolean OooOo0o(int i, float f) {
        this.f17665o0ooOOo = i;
        if (Math.abs(f - this.f17656o00oO0O.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f17649o00000o0 == 0) {
            if (minSeparation == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                minSeparation = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                float f2 = (minSeparation - this.f17639OoooooO) / this.f17660o0OO00O;
                float f3 = this.f17667oo000o;
                minSeparation = Oooo000.OooO00o.OooO00o(f3, this.f17657o00oO0o, f2, f3);
            }
        }
        if (OooOOO0()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f17656o00oO0O.set(i, Float.valueOf(o00O0O.OooO0Oo(f, i3 < 0 ? this.f17667oo000o : minSeparation + this.f17656o00oO0O.get(i3).floatValue(), i2 >= this.f17656o00oO0O.size() ? this.f17657o00oO0o : this.f17656o00oO0O.get(i2).floatValue() - minSeparation)));
        for (L l : this.f17628OoooOOo) {
            this.f17656o00oO0O.get(i).floatValue();
            l.OooO00o();
        }
        AccessibilityManager accessibilityManager = this.f17622OoooO;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        BaseSlider<S, L, T>.OooO0o oooO0o = this.f17626OoooOO0;
        if (oooO0o == null) {
            this.f17626OoooOO0 = new OooO0o();
        } else {
            removeCallbacks(oooO0o);
        }
        BaseSlider<S, L, T>.OooO0o oooO0o2 = this.f17626OoooOO0;
        oooO0o2.f17677Oooo0o = i;
        postDelayed(oooO0o2, 200L);
        return true;
    }

    public final void OooOoO() {
        if (OooOo0O() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iOooOOo0 = (int) ((OooOOo0(this.f17656o00oO0O.get(this.f17665o0ooOOo).floatValue()) * this.f17660o0OO00O) + this.f17639OoooooO);
            int iOooO0Oo = OooO0Oo();
            int i = this.f17669ooOO;
            o0OOO0o.OooO0O0.OooO0o(background, iOooOOo0 - i, iOooO0Oo - i, iOooOOo0 + i, iOooO0Oo + i);
        }
    }

    public final void OooOoO0(int i, Rect rect) {
        int iOooOOo0 = this.f17639OoooooO + ((int) (OooOOo0(getValues().get(i).floatValue()) * this.f17660o0OO00O));
        int iOooO0Oo = OooO0Oo();
        int i2 = this.f17663o0OoOo0;
        rect.set(iOooOOo0 - i2, iOooO0Oo - i2, iOooOOo0 + i2, iOooO0Oo + i2);
    }

    public final void OooOoOO() {
        if (this.f17659o0O0O00) {
            float f = this.f17667oo000o;
            float f2 = this.f17657o00oO0o;
            if (f >= f2) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f17667oo000o), Float.valueOf(this.f17657o00oO0o)));
            }
            if (f2 <= f) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f17657o00oO0o), Float.valueOf(this.f17667oo000o)));
            }
            if (this.f17666o0ooOoO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOO0o(f2 - f)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f17666o0ooOoO), Float.valueOf(this.f17667oo000o), Float.valueOf(this.f17657o00oO0o)));
            }
            for (Float f3 : this.f17656o00oO0O) {
                if (f3.floatValue() < this.f17667oo000o || f3.floatValue() > this.f17657o00oO0o) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f3, Float.valueOf(this.f17667oo000o), Float.valueOf(this.f17657o00oO0o)));
                }
                if (this.f17666o0ooOoO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOO0o(f3.floatValue() - this.f17667oo000o)) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f3, Float.valueOf(this.f17667oo000o), Float.valueOf(this.f17666o0ooOoO), Float.valueOf(this.f17666o0ooOoO)));
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            }
            float f4 = this.f17666o0ooOoO;
            if (f4 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && minSeparation > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (this.f17649o00000o0 != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17666o0ooOoO)));
                }
                if (minSeparation < f4 || !OooOO0o(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17666o0ooOoO), Float.valueOf(this.f17666o0ooOoO)));
                }
            }
            float f5 = this.f17666o0ooOoO;
            if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (((int) f5) != f5) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f5)));
                }
                float f6 = this.f17667oo000o;
                if (((int) f6) != f6) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f6)));
                }
                float f7 = this.f17657o00oO0o;
                if (((int) f7) != f7) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f7)));
                }
            }
            this.f17659o0O0O00 = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f17625OoooO0O.OooOOO(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f17619Oooo0o.setColor(OooOO0(this.f17641o00000));
        this.f17620Oooo0oO.setColor(OooOO0(this.f17644o000000o));
        this.f17624OoooO00.setColor(OooOO0(this.f17643o000000O));
        this.f17623OoooO0.setColor(OooOO0(this.f17642o000000));
        for (o0OOOO00.OooO00o oooO00o : this.f17627OoooOOO) {
            if (oooO00o.isStateful()) {
                oooO00o.setState(getDrawableState());
            }
        }
        if (this.f17646o00000O0.isStateful()) {
            this.f17646o00000O0.setState(getDrawableState());
        }
        this.f17618Oooo.setColor(OooOO0(this.f17650o000OOo));
        this.f17618Oooo.setAlpha(63);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f17625OoooO0O.f39882OooOO0O;
    }

    public int getActiveThumbIndex() {
        return this.f17664o0ooOO0;
    }

    public int getFocusedThumbIndex() {
        return this.f17665o0ooOOo;
    }

    @Dimension
    public int getHaloRadius() {
        return this.f17669ooOO;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f17650o000OOo;
    }

    public int getLabelBehavior() {
        return this.f17638Oooooo0;
    }

    public float getMinSeparation() {
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getStepSize() {
        return this.f17666o0ooOoO;
    }

    public float getThumbElevation() {
        return this.f17646o00000O0.f17510Oooo0o.f17545OooOOO;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f17663o0OoOo0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f17646o00000O0.f17510Oooo0o.f17537OooO0Oo;
    }

    public float getThumbStrokeWidth() {
        return this.f17646o00000O0.f17510Oooo0o.f17543OooOO0O;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f17646o00000O0.f17510Oooo0o.f17536OooO0OO;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f17642o000000;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f17643o000000O;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f17643o000000O.equals(this.f17642o000000)) {
            return this.f17642o000000;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f17644o000000o;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f17637Oooooo;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f17641o00000;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f17639OoooooO;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f17641o00000.equals(this.f17644o000000o)) {
            return this.f17644o000000o;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f17660o0OO00O;
    }

    public float getValueFrom() {
        return this.f17667oo000o;
    }

    public float getValueTo() {
        return this.f17657o00oO0o;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f17656o00oO0O);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f17627OoooOOO.iterator();
        while (it.hasNext()) {
            OooO0O0((o0OOOO00.OooO00o) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.OooO0o oooO0o = this.f17626OoooOO0;
        if (oooO0o != null) {
            removeCallbacks(oooO0o);
        }
        this.f17630OoooOoO = false;
        Iterator it = this.f17627OoooOOO.iterator();
        while (it.hasNext()) {
            OooO0o((o0OOOO00.OooO00o) it.next());
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        if (this.f17659o0O0O00) {
            OooOoOO();
            OooOOO();
        }
        super.onDraw(canvas);
        int iOooO0Oo = OooO0Oo();
        int i = this.f17660o0OO00O;
        float[] activeRange = getActiveRange();
        int i2 = this.f17639OoooooO;
        float f = i;
        float f2 = (activeRange[1] * f) + i2;
        float f3 = i2 + i;
        if (f2 < f3) {
            float f4 = iOooO0Oo;
            canvas.drawLine(f2, f4, f3, f4, this.f17619Oooo0o);
        }
        float f5 = this.f17639OoooooO;
        float f6 = (activeRange[0] * f) + f5;
        if (f6 > f5) {
            float f7 = iOooO0Oo;
            canvas.drawLine(f5, f7, f6, f7, this.f17619Oooo0o);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f17667oo000o) {
            int i3 = this.f17660o0OO00O;
            float[] activeRange2 = getActiveRange();
            float f8 = this.f17639OoooooO;
            float f9 = i3;
            float f10 = iOooO0Oo;
            canvas.drawLine((activeRange2[0] * f9) + f8, f10, (activeRange2[1] * f9) + f8, f10, this.f17620Oooo0oO);
        }
        if (this.f17662o0Oo0oo && this.f17666o0ooOoO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float[] activeRange3 = getActiveRange();
            int iRound = Math.round(activeRange3[0] * ((this.f17661o0OOO0o.length / 2) - 1));
            int iRound2 = Math.round(activeRange3[1] * ((this.f17661o0OOO0o.length / 2) - 1));
            int i4 = iRound * 2;
            canvas.drawPoints(this.f17661o0OOO0o, 0, i4, this.f17624OoooO00);
            int i5 = iRound2 * 2;
            canvas.drawPoints(this.f17661o0OOO0o, i4, i5 - i4, this.f17623OoooO0);
            float[] fArr = this.f17661o0OOO0o;
            canvas.drawPoints(fArr, i5, fArr.length - i5, this.f17624OoooO00);
        }
        if ((this.f17658o00ooo || isFocused() || OooOo0()) && isEnabled()) {
            int i6 = this.f17660o0OO00O;
            if (OooOo0O()) {
                int iOooOOo0 = (int) ((OooOOo0(this.f17656o00oO0O.get(this.f17665o0ooOOo).floatValue()) * i6) + this.f17639OoooooO);
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = this.f17669ooOO;
                    canvas.clipRect(iOooOOo0 - i7, iOooO0Oo - i7, iOooOOo0 + i7, i7 + iOooO0Oo, Region.Op.UNION);
                }
                canvas.drawCircle(iOooOOo0, iOooO0Oo, this.f17669ooOO, this.f17618Oooo);
            }
            if (this.f17664o0ooOO0 == -1 && !OooOo0()) {
                OooO0oo();
            } else if (this.f17638Oooooo0 != 2) {
                if (!this.f17630OoooOoO) {
                    this.f17630OoooOoO = true;
                    ValueAnimator valueAnimatorOooO0o0 = OooO0o0(true);
                    this.f17631OoooOoo = valueAnimatorOooO0o0;
                    this.f17632Ooooo00 = null;
                    valueAnimatorOooO0o0.start();
                }
                Iterator it = this.f17627OoooOOO.iterator();
                for (int i8 = 0; i8 < this.f17656o00oO0O.size() && it.hasNext(); i8++) {
                    if (i8 != this.f17665o0ooOOo) {
                        OooOo00((o0OOOO00.OooO00o) it.next(), this.f17656o00oO0O.get(i8).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f17627OoooOOO.size()), Integer.valueOf(this.f17656o00oO0O.size())));
                }
                OooOo00((o0OOOO00.OooO00o) it.next(), this.f17656o00oO0O.get(this.f17665o0ooOOo).floatValue());
            }
        } else {
            OooO0oo();
        }
        int i9 = this.f17660o0OO00O;
        for (int i10 = 0; i10 < this.f17656o00oO0O.size(); i10++) {
            float fFloatValue = this.f17656o00oO0O.get(i10).floatValue();
            Drawable drawable = this.f17645o00000O;
            if (drawable != null) {
                OooO0oO(canvas, i9, iOooO0Oo, fFloatValue, drawable);
            } else if (i10 < this.f17647o00000OO.size()) {
                OooO0oO(canvas, i9, iOooO0Oo, fFloatValue, this.f17647o00000OO.get(i10));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((OooOOo0(fFloatValue) * i9) + this.f17639OoooooO, iOooO0Oo, this.f17663o0OoOo0, this.f17621Oooo0oo);
                }
                OooO0oO(canvas, i9, iOooO0Oo, fFloatValue, this.f17646o00000O0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f17664o0ooOO0 = -1;
            this.f17625OoooO0O.OooOO0O(this.f17665o0ooOOo);
            return;
        }
        if (i == 1) {
            OooOOOO(Integer.MAX_VALUE);
        } else if (i == 2) {
            OooOOOO(Integer.MIN_VALUE);
        } else if (i == 17) {
            OooOOOo(Integer.MAX_VALUE);
        } else if (i == 66) {
            OooOOOo(Integer.MIN_VALUE);
        }
        this.f17625OoooO0O.OooOo(this.f17665o0ooOOo);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        float fOooO0OO;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f17656o00oO0O.size() == 1) {
            this.f17664o0ooOO0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f17664o0ooOO0 == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.f17664o0ooOO0 = this.f17665o0ooOOo;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    OooOOOO(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    OooOOOO(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            OooOOOo(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            OooOOOo(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.f17664o0ooOO0 = this.f17665o0ooOOo;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    OooOOOO(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(OooOOOO(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(OooOOOO(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.f17668oo0o0Oo | keyEvent.isLongPress();
        this.f17668oo0o0Oo = zIsLongPress;
        if (zIsLongPress) {
            fOooO0OO = OooO0OO();
        } else {
            fOooO0OO = this.f17666o0ooOoO;
            if (fOooO0OO == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                fOooO0OO = 1.0f;
            }
        }
        if (i == 21) {
            if (!OooOOO0()) {
                fOooO0OO = -fOooO0OO;
            }
            fValueOf = Float.valueOf(fOooO0OO);
        } else if (i == 22) {
            if (OooOOO0()) {
                fOooO0OO = -fOooO0OO;
            }
            fValueOf = Float.valueOf(fOooO0OO);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fOooO0OO);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fOooO0OO);
        }
        if (fValueOf != null) {
            if (OooOo0o(this.f17664o0ooOO0, fValueOf.floatValue() + this.f17656o00oO0O.get(this.f17664o0ooOO0).floatValue())) {
                OooOoO();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return OooOOOO(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return OooOOOO(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f17664o0ooOO0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f17668oo0o0Oo = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0OOOO00.OooO00o>] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f17636OooooOo + ((this.f17638Oooooo0 == 1 || OooOo0()) ? ((o0OOOO00.OooO00o) this.f17627OoooOOO.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f17667oo000o = sliderState.f17680Oooo0o;
        this.f17657o00oO0o = sliderState.f17681Oooo0oO;
        setValuesInternal(sliderState.f17682Oooo0oo);
        this.f17666o0ooOoO = sliderState.f17679Oooo;
        if (sliderState.f17683OoooO00) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f17680Oooo0o = this.f17667oo000o;
        sliderState.f17681Oooo0oO = this.f17657o00oO0o;
        sliderState.f17682Oooo0oo = new ArrayList<>(this.f17656o00oO0O);
        sliderState.f17679Oooo = this.f17666o0ooOoO;
        sliderState.f17683OoooO00 = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f17660o0OO00O = Math.max(i - (this.f17639OoooooO * 2), 0);
        OooOOO();
        OooOoO();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.f17639OoooooO) / this.f17660o0OO00O;
        this.f17648o00000Oo = f;
        float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f);
        this.f17648o00000Oo = fMax;
        this.f17648o00000Oo = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17653o00Oo0 = x;
            if (!OooOO0O()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (OooOOoo()) {
                    requestFocus();
                    this.f17658o00ooo = true;
                    OooOo();
                    OooOoO();
                    invalidate();
                    OooOOo();
                }
            }
        } else if (actionMasked == 1) {
            this.f17658o00ooo = false;
            MotionEvent motionEvent2 = this.f17654o00Ooo;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f17654o00Ooo.getX() - motionEvent.getX()) <= this.f17633Ooooo0o && Math.abs(this.f17654o00Ooo.getY() - motionEvent.getY()) <= this.f17633Ooooo0o && OooOOoo()) {
                OooOOo();
            }
            if (this.f17664o0ooOO0 != -1) {
                OooOo();
                this.f17664o0ooOO0 = -1;
                Iterator it = this.f17629OoooOo0.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.slider.OooO0O0) it.next()).OooO00o();
                }
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f17658o00ooo) {
                if (OooOO0O() && Math.abs(x - this.f17653o00Oo0) < this.f17633Ooooo0o) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                OooOOo();
            }
            if (OooOOoo()) {
                this.f17658o00ooo = true;
                OooOo();
                OooOoO();
                invalidate();
            }
        }
        setPressed(this.f17658o00ooo);
        this.f17654o00Ooo = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.f17664o0ooOO0 = i;
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
        if (i < 0 || i >= this.f17656o00oO0O.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f17665o0ooOOo = i;
        this.f17625OoooO0O.OooOo(i);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (i == this.f17669ooOO) {
            return;
        }
        this.f17669ooOO = i;
        Drawable background = getBackground();
        if (OooOo0O() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            p342o0OO0oo0.OooO0O0.OooO00o((RippleDrawable) background, this.f17669ooOO);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17650o000OOo)) {
            return;
        }
        this.f17650o000OOo = colorStateList;
        Drawable background = getBackground();
        if (!OooOo0O() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f17618Oooo.setColor(OooOO0(colorStateList));
        this.f17618Oooo.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f17638Oooooo0 != i) {
            this.f17638Oooooo0 = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable com.google.android.material.slider.OooO0OO oooO0OO) {
        this.f17655o00o0O = oooO0OO;
    }

    public void setSeparationUnit(int i) {
        this.f17649o00000o0 = i;
        this.f17659o0O0O00 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f17667oo000o), Float.valueOf(this.f17657o00oO0o)));
        }
        if (this.f17666o0ooOoO != f) {
            this.f17666o0ooOoO = f;
            this.f17659o0O0O00 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f17646o00000O0.OooOOOO(f);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (i == this.f17663o0OoOo0) {
            return;
        }
        this.f17663o0OoOo0 = i;
        this.f17639OoooooO = this.f17634OooooO0 + Math.max(i - this.f17635OooooOO, 0);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(this)) {
            this.f17660o0OO00O = Math.max(getWidth() - (this.f17639OoooooO * 2), 0);
            OooOOO();
        }
        MaterialShapeDrawable materialShapeDrawable = this.f17646o00000O0;
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o();
        float f = this.f17663o0OoOo0;
        p347o0OOO0o0.o0OOO0o o0ooo0oOooO00o = o0O0O00.OooO00o(0);
        c0110OooO00o.f17568OooO00o = o0ooo0oOooO00o;
        com.google.android.material.shape.OooO00o.C0110OooO00o.OooO0O0(o0ooo0oOooO00o);
        c0110OooO00o.f17569OooO0O0 = o0ooo0oOooO00o;
        com.google.android.material.shape.OooO00o.C0110OooO00o.OooO0O0(o0ooo0oOooO00o);
        c0110OooO00o.f17570OooO0OO = o0ooo0oOooO00o;
        com.google.android.material.shape.OooO00o.C0110OooO00o.OooO0O0(o0ooo0oOooO00o);
        c0110OooO00o.f17571OooO0Oo = o0ooo0oOooO00o;
        com.google.android.material.shape.OooO00o.C0110OooO00o.OooO0O0(o0ooo0oOooO00o);
        c0110OooO00o.OooO0OO(f);
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(c0110OooO00o));
        MaterialShapeDrawable materialShapeDrawable2 = this.f17646o00000O0;
        int i2 = this.f17663o0OoOo0 * 2;
        materialShapeDrawable2.setBounds(0, 0, i2, i2);
        Drawable drawable = this.f17645o00000O;
        if (drawable != null) {
            OooO00o(drawable);
        }
        Iterator<Drawable> it = this.f17647o00000OO.iterator();
        while (it.hasNext()) {
            OooO00o(it.next());
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f17646o00000O0.OooOo0o(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(OooOO0O.OooO00o(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f17646o00000O0.OooOo(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17646o00000O0.f17510Oooo0o.f17536OooO0OO)) {
            return;
        }
        this.f17646o00000O0.OooOOOo(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17642o000000)) {
            return;
        }
        this.f17642o000000 = colorStateList;
        this.f17623OoooO0.setColor(OooOO0(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17643o000000O)) {
            return;
        }
        this.f17643o000000O = colorStateList;
        this.f17624OoooO00.setColor(OooOO0(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f17662o0Oo0oo != z) {
            this.f17662o0Oo0oo = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17644o000000o)) {
            return;
        }
        this.f17644o000000o = colorStateList;
        this.f17620Oooo0oO.setColor(OooOO0(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = ULong.MIN_VALUE) @Dimension int i) {
        if (this.f17637Oooooo != i) {
            this.f17637Oooooo = i;
            this.f17619Oooo0o.setStrokeWidth(i);
            this.f17620Oooo0oO.setStrokeWidth(this.f17637Oooooo);
            this.f17624OoooO00.setStrokeWidth(this.f17637Oooooo / 2.0f);
            this.f17623OoooO0.setStrokeWidth(this.f17637Oooooo / 2.0f);
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17641o00000)) {
            return;
        }
        this.f17641o00000 = colorStateList;
        this.f17619Oooo0o.setColor(OooOO0(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f17667oo000o = f;
        this.f17659o0O0O00 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f17657o00oO0o = f;
        this.f17659o0O0O00 = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.sliderStyle);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        OooO00o(drawableNewDrawable);
        this.f17645o00000O = drawableNewDrawable;
        this.f17647o00000OO.clear();
        postInvalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17617o0000Ooo;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17627OoooOOO = new ArrayList();
        this.f17628OoooOOo = new ArrayList();
        this.f17629OoooOo0 = new ArrayList();
        this.f17630OoooOoO = false;
        this.f17658o00ooo = false;
        this.f17656o00oO0O = new ArrayList<>();
        this.f17664o0ooOO0 = -1;
        this.f17665o0ooOOo = -1;
        this.f17666o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f17662o0Oo0oo = true;
        this.f17668oo0o0Oo = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f17646o00000O0 = materialShapeDrawable;
        this.f17647o00000OO = Collections.emptyList();
        this.f17649o00000o0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f17619Oooo0o = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f17620Oooo0oO = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f17621Oooo0oo = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f17618Oooo = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f17624OoooO00 = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f17623OoooO0 = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f17636OooooOo = resources.getDimensionPixelSize(OooOO0.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(OooOO0.mtrl_slider_track_side_padding);
        this.f17634OooooO0 = dimensionPixelOffset;
        this.f17639OoooooO = dimensionPixelOffset;
        this.f17635OooooOO = resources.getDimensionPixelSize(OooOO0.mtrl_slider_thumb_radius);
        this.f17640Ooooooo = resources.getDimensionPixelOffset(OooOO0.mtrl_slider_track_top);
        this.f17652o00O0O = resources.getDimensionPixelSize(OooOO0.mtrl_slider_label_padding);
        this.f17651o000oOoO = new OooO00o(attributeSet, i);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.Slider, i, i2, new int[0]);
        this.f17667oo000o = typedArrayOooO0Oo.getFloat(Oooo0.Slider_android_valueFrom, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17657o00oO0o = typedArrayOooO0Oo.getFloat(Oooo0.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f17667oo000o));
        this.f17666o0ooOoO = typedArrayOooO0Oo.getFloat(Oooo0.Slider_android_stepSize, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        int i3 = Oooo0.Slider_trackColor;
        boolean zHasValue = typedArrayOooO0Oo.hasValue(i3);
        int i4 = zHasValue ? i3 : Oooo0.Slider_trackColorInactive;
        i3 = zHasValue ? i3 : Oooo0.Slider_trackColorActive;
        ColorStateList colorStateListOooO00o = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i4);
        setTrackInactiveTintList(colorStateListOooO00o == null ? OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.material_slider_inactive_track_color) : colorStateListOooO00o);
        ColorStateList colorStateListOooO00o2 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i3);
        setTrackActiveTintList(colorStateListOooO00o2 == null ? OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.material_slider_active_track_color) : colorStateListOooO00o2);
        materialShapeDrawable.OooOOOo(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.Slider_thumbColor));
        int i5 = Oooo0.Slider_thumbStrokeColor;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            setThumbStrokeColor(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i5));
        }
        setThumbStrokeWidth(typedArrayOooO0Oo.getDimension(Oooo0.Slider_thumbStrokeWidth, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        ColorStateList colorStateListOooO00o3 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.Slider_haloColor);
        setHaloTintList(colorStateListOooO00o3 == null ? OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.material_slider_halo_color) : colorStateListOooO00o3);
        this.f17662o0Oo0oo = typedArrayOooO0Oo.getBoolean(Oooo0.Slider_tickVisible, true);
        int i6 = Oooo0.Slider_tickColor;
        boolean zHasValue2 = typedArrayOooO0Oo.hasValue(i6);
        int i7 = zHasValue2 ? i6 : Oooo0.Slider_tickColorInactive;
        i6 = zHasValue2 ? i6 : Oooo0.Slider_tickColorActive;
        ColorStateList colorStateListOooO00o4 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i7);
        setTickInactiveTintList(colorStateListOooO00o4 == null ? OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.material_slider_inactive_tick_marks_color) : colorStateListOooO00o4);
        ColorStateList colorStateListOooO00o5 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i6);
        setTickActiveTintList(colorStateListOooO00o5 == null ? OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.material_slider_active_tick_marks_color) : colorStateListOooO00o5);
        setThumbRadius(typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Slider_haloRadius, 0));
        setThumbElevation(typedArrayOooO0Oo.getDimension(Oooo0.Slider_thumbElevation, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        setTrackHeight(typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Slider_trackHeight, 0));
        setLabelBehavior(typedArrayOooO0Oo.getInt(Oooo0.Slider_labelBehavior, 0));
        if (!typedArrayOooO0Oo.getBoolean(Oooo0.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayOooO0Oo.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.OooOo00();
        this.f17633Ooooo0o = ViewConfiguration.get(context2).getScaledTouchSlop();
        OooO oooO = new OooO(this);
        this.f17625OoooO0O = oooO;
        ViewCompat.OooOo0o(this, oooO);
        this.f17622OoooO = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f17645o00000O = null;
        this.f17647o00000OO = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f17647o00000OO;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            OooO00o(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
