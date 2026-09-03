package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o000000;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.ULong;
import o0000O.o0O0O00;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o00000O0;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17507OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00O0O f17509OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o0OO00O f17510OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public EditText f17511OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CharSequence f17512OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17513OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17514OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17515OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f17516OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final oo000o f17517OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f17518OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f17519OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17520OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public OooOO0 f17521OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17522OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17523OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public CharSequence f17524OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f17525OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f17526OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AppCompatTextView f17527OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Fade f17528OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f17529OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Fade f17530OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17531OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17532OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f17533OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public CharSequence f17534OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17535Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public StateListDrawable f17536Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f17537Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17538Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public MaterialShapeDrawable f17539Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f17540Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17541Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO0O0 f17542Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17543Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f17544Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f17545Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17546OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f17547OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17548OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17549OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @ColorInt
    public int f17550OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Rect f17551OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Rect f17552OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final RectF f17553OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Typeface f17554OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17555OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f17556Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final LinkedHashSet<OooOO0O> f17557Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17558OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f17559OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public Drawable f17560OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ColorStateList f17561Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ColorStateList f17562Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @ColorInt
    public int f17563OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @ColorInt
    public int f17564Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @ColorInt
    public int f17565o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @ColorInt
    public int f17566o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @ColorInt
    public int f17567o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @ColorInt
    public int f17568o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @ColorInt
    public int f17569o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f17570o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0OO f17571o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @ColorInt
    public int f17572o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f17573o0OOO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @ColorInt
    public int f17574o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f17575o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ValueAnimator f17576o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f17577o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f17578oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ColorStateList f17579ooOO;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public static final int f17506o0Oo0oo = o0000O0O.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public static final int[][] f17505o0OO00O = {new int[]{R.attr.state_pressed}, new int[0]};

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public static class OooO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextInputLayout f17580OooO00o;

        public OooO(@NonNull TextInputLayout textInputLayout) {
            this.f17580OooO00o = textInputLayout;
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull o0O0O00 o0o0o00) {
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            TextInputLayout textInputLayout = this.f17580OooO00o;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !textInputLayout.f17578oo000o;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            o0OO00O o0oo00o2 = textInputLayout.f17510OooO0o0;
            AppCompatTextView appCompatTextView = o0oo00o2.f17625OooO0o0;
            if (appCompatTextView.getVisibility() == 0) {
                o0o0o00.f33510OooO00o.setLabelFor(appCompatTextView);
                o0o0o00.f33510OooO00o.setTraversalAfter(appCompatTextView);
            } else {
                o0o0o00.f33510OooO00o.setTraversalAfter(o0oo00o2.f17626OooO0oO);
            }
            if (z) {
                o0o0o00.OooOOo0(text);
            } else if (!TextUtils.isEmpty(string)) {
                o0o0o00.OooOOo0(string);
                if (z3 && placeholderText != null) {
                    o0o0o00.OooOOo0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                o0o0o00.OooOOo0(placeholderText);
            }
            boolean zIsEmpty = TextUtils.isEmpty(string);
            AccessibilityNodeInfo accessibilityNodeInfo = o0o0o00.f33510OooO00o;
            if (!zIsEmpty) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    o0o0o00.OooOOOO(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    o0o0o00.OooOOo0(string);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z6);
                } else {
                    o0o0o00.OooO(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            AccessibilityNodeInfo accessibilityNodeInfo2 = o0o0o00.f33510OooO00o;
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo2.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.f17517OooOOO0.f17676OooOoO0;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo2.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f17509OooO0o.OooO0O0().OooOOO(o0o0o00);
        }

        @Override // androidx.core.view.OooO00o
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f17580OooO00o.f17509OooO0o.OooO0O0().OooOOOO(accessibilityEvent);
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.OooOo00(!textInputLayout.f17573o0OOO0o, false);
            if (textInputLayout.f17516OooOOO) {
                textInputLayout.OooOOO(editable);
            }
            if (textInputLayout.f17526OooOo0O) {
                textInputLayout.OooOo0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f17509OooO0o.f17594OooOO0;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f17511OooO0oO.requestLayout();
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f17571o00oO0o.OooOOOo(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface OooOO0 {
    }

    public interface OooOO0O {
        void OooO00o(@NonNull TextInputLayout textInputLayout);
    }

    public interface OooOOO0 {
        void OooO00o();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public CharSequence f17585OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f17586OooO0oO;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17585OooO0o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f17586OooO0oO = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f17585OooO0o) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            TextUtils.writeToParcel(this.f17585OooO0o, parcel, i);
            parcel.writeInt(this.f17586OooO0oO ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void OooOO0O(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOO0O((ViewGroup) childAt, z);
            }
        }
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        int iOooO00o;
        EditText editText = this.f17511OooO0oO;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int iOooO0OO = p274o0O000oo.OooOOO0.OooO0OO(o00000.colorControlHighlight, this.f17511OooO0oO);
                int i = this.f17535Oooo;
                int[][] iArr = f17505o0OO00O;
                if (i != 2) {
                    if (i != 1) {
                        return null;
                    }
                    MaterialShapeDrawable materialShapeDrawable = this.f17538Oooo00O;
                    int i2 = this.f17565o000oOoO;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{p274o0O000oo.OooOOO0.OooO0o0(iOooO0OO, 0.1f, i2), i2}), materialShapeDrawable, materialShapeDrawable);
                }
                Context context = getContext();
                MaterialShapeDrawable materialShapeDrawable2 = this.f17538Oooo00O;
                TypedValue typedValueOooO0OO = p276o0O00OoO.OooO0OO.OooO0OO(o00000.colorSurface, context, "TextInputLayout");
                int i3 = typedValueOooO0OO.resourceId;
                if (i3 != 0) {
                    Object obj = ContextCompat.f5281OooO00o;
                    iOooO00o = ContextCompat.OooO0o.OooO00o(context, i3);
                } else {
                    iOooO00o = typedValueOooO0OO.data;
                }
                MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.f17105OooO0Oo.f17128OooO00o);
                int iOooO0o0 = p274o0O000oo.OooOOO0.OooO0o0(iOooO0OO, 0.1f, iOooO00o);
                materialShapeDrawable3.OooOOO(new ColorStateList(iArr, new int[]{iOooO0o0, 0}));
                materialShapeDrawable3.setTint(iOooO00o);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iOooO0o0, iOooO00o});
                MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.f17105OooO0Oo.f17128OooO00o);
                materialShapeDrawable4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
            }
        }
        return this.f17538Oooo00O;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f17536Oooo0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f17536Oooo0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f17536Oooo0.addState(new int[0], OooO0o(false));
        }
        return this.f17536Oooo0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f17539Oooo00o == null) {
            this.f17539Oooo00o = OooO0o(true);
        }
        return this.f17539Oooo00o;
    }

    private void setEditText(EditText editText) {
        if (this.f17511OooO0oO != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17511OooO0oO = editText;
        int i = this.f17507OooO;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f17514OooOO0O);
        }
        int i2 = this.f17513OooOO0;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f17515OooOO0o);
        }
        this.f17540Oooo0O0 = false;
        OooO();
        setTextInputAccessibilityDelegate(new OooO(this));
        Typeface typeface = this.f17511OooO0oO.getTypeface();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        boolean zOooOOO0 = oooO0OO.OooOOO0(typeface);
        boolean zOooOOOO = oooO0OO.OooOOOO(typeface);
        if (zOooOOO0 || zOooOOOO) {
            oooO0OO.OooO(false);
        }
        float textSize = this.f17511OooO0oO.getTextSize();
        if (oooO0OO.f16746OooOO0o != textSize) {
            oooO0OO.f16746OooOO0o = textSize;
            oooO0OO.OooO(false);
        }
        float letterSpacing = this.f17511OooO0oO.getLetterSpacing();
        if (oooO0OO.f16793Oooooo0 != letterSpacing) {
            oooO0OO.f16793Oooooo0 = letterSpacing;
            oooO0OO.OooO(false);
        }
        int gravity = this.f17511OooO0oO.getGravity();
        oooO0OO.OooOO0o((gravity & (-113)) | 48);
        if (oooO0OO.f16744OooOO0 != gravity) {
            oooO0OO.f16744OooOO0 = gravity;
            oooO0OO.OooO(false);
        }
        this.f17511OooO0oO.addTextChangedListener(new OooO00o());
        if (this.f17562Oooooo0 == null) {
            this.f17562Oooooo0 = this.f17511OooO0oO.getHintTextColors();
        }
        if (this.f17533OooOooO) {
            if (TextUtils.isEmpty(this.f17534OooOooo)) {
                CharSequence hint = this.f17511OooO0oO.getHint();
                this.f17512OooO0oo = hint;
                setHint(hint);
                this.f17511OooO0oO.setHint((CharSequence) null);
            }
            this.f17537Oooo000 = true;
        }
        if (this.f17520OooOOo != null) {
            OooOOO(this.f17511OooO0oO.getText());
        }
        OooOOo0();
        this.f17517OooOOO0.OooO0O0();
        this.f17510OooO0o0.bringToFront();
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.bringToFront();
        Iterator<OooOO0O> it = this.f17557Ooooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this);
        }
        o00o0o2.OooOO0o();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        OooOo00(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f17534OooOooo)) {
            return;
        }
        this.f17534OooOooo = charSequence;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        if (charSequence == null || !TextUtils.equals(oooO0OO.f16769Oooo00O, charSequence)) {
            oooO0OO.f16769Oooo00O = charSequence;
            oooO0OO.f16770Oooo00o = null;
            Bitmap bitmap = oooO0OO.f16772Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooO0OO.f16772Oooo0OO = null;
            }
            oooO0OO.OooO(false);
        }
        if (this.f17578oo000o) {
            return;
        }
        OooOO0();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f17526OooOo0O == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.f17527OooOo0o;
            if (appCompatTextView != null) {
                this.f17508OooO0Oo.addView(appCompatTextView);
                this.f17527OooOo0o.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f17527OooOo0o;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f17527OooOo0o = null;
        }
        this.f17526OooOo0O = z;
    }

    public final void OooO() {
        int i = this.f17535Oooo;
        if (i == 0) {
            this.f17538Oooo00O = null;
            this.f17541Oooo0OO = null;
            this.f17543Oooo0o0 = null;
        } else if (i == 1) {
            this.f17538Oooo00O = new MaterialShapeDrawable(this.f17542Oooo0o);
            this.f17541Oooo0OO = new MaterialShapeDrawable();
            this.f17543Oooo0o0 = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO00o(new StringBuilder(), this.f17535Oooo, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f17533OooOooO || (this.f17538Oooo00O instanceof OooOOO)) {
                this.f17538Oooo00O = new MaterialShapeDrawable(this.f17542Oooo0o);
            } else {
                com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17542Oooo0o;
                int i2 = OooOOO.f17494OooOoo0;
                if (oooO0O0 == null) {
                    oooO0O0 = new com.google.android.material.shape.OooO0O0();
                }
                this.f17538Oooo00O = new OooOOO.OooO0O0(new OooOOO.OooO00o(oooO0O0, new RectF()));
            }
            this.f17541Oooo0OO = null;
            this.f17543Oooo0o0 = null;
        }
        OooOOo();
        OooOo0o();
        if (this.f17535Oooo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f17548OoooO00 = getResources().getDimensionPixelSize(o00000O.material_font_2_0_box_collapsed_padding_top);
            } else if (p276o0O00OoO.OooO0o.OooO0o0(getContext())) {
                this.f17548OoooO00 = getResources().getDimensionPixelSize(o00000O.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f17511OooO0oO != null && this.f17535Oooo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f17511OooO0oO;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO.OooOO0O(editText, ViewCompat.OooO.OooO0o(editText), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_2_0_padding_top), ViewCompat.OooO.OooO0o0(this.f17511OooO0oO), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_2_0_padding_bottom));
            } else if (p276o0O00OoO.OooO0o.OooO0o0(getContext())) {
                EditText editText2 = this.f17511OooO0oO;
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO.OooOO0O(editText2, ViewCompat.OooO.OooO0o(editText2), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_1_3_padding_top), ViewCompat.OooO.OooO0o0(this.f17511OooO0oO), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f17535Oooo != 0) {
            OooOOoo();
        }
        EditText editText3 = this.f17511OooO0oO;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f17535Oooo;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    @VisibleForTesting
    public final void OooO00o(float f) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        if (oooO0OO.f16737OooO0O0 == f) {
            return;
        }
        if (this.f17576o0ooOOo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17576o0ooOOo = valueAnimator;
            valueAnimator.setInterpolator(o0O00OOO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f40881OooO0O0));
            this.f17576o0ooOOo.setDuration(o0O00OOO.OooO00o.OooO0OO(o00000.motionDurationMedium4, getContext(), 167));
            this.f17576o0ooOOo.addUpdateListener(new OooO0o());
        }
        this.f17576o0ooOOo.setFloatValues(oooO0OO.f16737OooO0O0, f);
        this.f17576o0ooOOo.start();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    public final void OooO0O0() {
        boolean z;
        MaterialShapeDrawable materialShapeDrawable = this.f17538Oooo00O;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.OooO0O0 oooO0O0 = materialShapeDrawable.f17105OooO0Oo.f17128OooO00o;
        com.google.android.material.shape.OooO0O0 oooO0O1 = this.f17542Oooo0o;
        if (oooO0O0 != oooO0O1) {
            materialShapeDrawable.setShapeAppearanceModel(oooO0O1);
        }
        boolean z2 = false;
        if (this.f17535Oooo != 2) {
            z = false;
        } else {
            if (this.f17547OoooO0 > -1 && this.f17550OoooOO0 != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            MaterialShapeDrawable materialShapeDrawable2 = this.f17538Oooo00O;
            float f = this.f17547OoooO0;
            int i = this.f17550OoooOO0;
            materialShapeDrawable2.OooOo00(f);
            materialShapeDrawable2.OooOOoo(ColorStateList.valueOf(i));
        }
        int iOooO0OO = this.f17565o000oOoO;
        if (this.f17535Oooo == 1) {
            iOooO0OO = p052o00000oO.OooOO0.OooO0OO(this.f17565o000oOoO, p274o0O000oo.OooOOO0.OooO0O0(o00000.colorSurface, getContext(), 0));
        }
        this.f17565o000oOoO = iOooO0OO;
        this.f17538Oooo00O.OooOOO(ColorStateList.valueOf(iOooO0OO));
        MaterialShapeDrawable materialShapeDrawable3 = this.f17541Oooo0OO;
        if (materialShapeDrawable3 != null && this.f17543Oooo0o0 != null) {
            if (this.f17547OoooO0 > -1 && this.f17550OoooOO0 != 0) {
                z2 = true;
            }
            if (z2) {
                materialShapeDrawable3.OooOOO(this.f17511OooO0oO.isFocused() ? ColorStateList.valueOf(this.f17563OoooooO) : ColorStateList.valueOf(this.f17550OoooOO0));
                this.f17543Oooo0o0.OooOOO(ColorStateList.valueOf(this.f17550OoooOO0));
            }
            invalidate();
        }
        OooOOo();
    }

    public final int OooO0OO() {
        float fOooO0o0;
        if (!this.f17533OooOooO) {
            return 0;
        }
        int i = this.f17535Oooo;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        if (i == 0) {
            fOooO0o0 = oooO0OO.OooO0o0();
        } else {
            if (i != 2) {
                return 0;
            }
            fOooO0o0 = oooO0OO.OooO0o0() / 2.0f;
        }
        return (int) fOooO0o0;
    }

    public final Fade OooO0Oo() {
        Fade fade = new Fade();
        fade.f11302OooO0o = o0O00OOO.OooO00o.OooO0OO(o00000.motionDurationShort2, getContext(), 87);
        fade.f11304OooO0oO = o0O00OOO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f40880OooO00o);
        return fade;
    }

    public final MaterialShapeDrawable OooO0o(boolean z) {
        int iOooO00o;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(o00000O.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f17511OooO0oO;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(o00000O.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(o00000O.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
        oooO00o.OooO0o0(f);
        oooO00o.OooO0o(f);
        oooO00o.OooO0OO(dimensionPixelOffset);
        oooO00o.OooO0Oo(dimensionPixelOffset);
        com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(oooO00o);
        Context context = getContext();
        Paint paint = MaterialShapeDrawable.f17103OooOoO;
        TypedValue typedValueOooO0OO = p276o0O00OoO.OooO0OO.OooO0OO(o00000.colorSurface, context, MaterialShapeDrawable.class.getSimpleName());
        int i = typedValueOooO0OO.resourceId;
        if (i != 0) {
            Object obj = ContextCompat.f5281OooO00o;
            iOooO00o = ContextCompat.OooO0o.OooO00o(context, i);
        } else {
            iOooO00o = typedValueOooO0OO.data;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.OooOO0O(context);
        materialShapeDrawable.OooOOO(ColorStateList.valueOf(iOooO00o));
        materialShapeDrawable.OooOOO0(popupElevation);
        materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        MaterialShapeDrawable.OooO0O0 oooO0O1 = materialShapeDrawable.f17105OooO0Oo;
        if (oooO0O1.f17135OooO0oo == null) {
            oooO0O1.f17135OooO0oo = new Rect();
        }
        materialShapeDrawable.f17105OooO0Oo.f17135OooO0oo.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final boolean OooO0o0() {
        return this.f17533OooOooO && !TextUtils.isEmpty(this.f17534OooOooo) && (this.f17538Oooo00O instanceof OooOOO);
    }

    public final int OooO0oO(int i, boolean z) {
        int compoundPaddingLeft = this.f17511OooO0oO.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int OooO0oo(int i, boolean z) {
        int compoundPaddingRight = i - this.f17511OooO0oO.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    public final void OooOO0() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        int i2;
        if (OooO0o0()) {
            int width = this.f17511OooO0oO.getWidth();
            int gravity = this.f17511OooO0oO.getGravity();
            com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
            boolean zOooO0O0 = oooO0OO.OooO0O0(oooO0OO.f16769Oooo00O);
            oooO0OO.f16767Oooo0 = zOooO0O0;
            Rect rect = oooO0OO.f16743OooO0oo;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zOooO0O0) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = oooO0OO.f16795Ooooooo;
                    }
                } else if (zOooO0O0) {
                    f = rect.right;
                    f2 = oooO0OO.f16795Ooooooo;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f17553OoooOo0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (oooO0OO.f16795Ooooooo / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (oooO0OO.f16767Oooo0) {
                        f4 = oooO0OO.f16795Ooooooo + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (oooO0OO.f16767Oooo0) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f4 = oooO0OO.f16795Ooooooo + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = oooO0OO.OooO0o0() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.f17545Oooo0oo;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f17547OoooO0);
                OooOOO oooOOO = (OooOOO) this.f17538Oooo00O;
                oooOOO.getClass();
                oooOOO.OooOo(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = oooO0OO.f16795Ooooooo / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f17553OoooOo0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (oooO0OO.f16795Ooooooo / 2.0f);
            } else {
                f4 = (width / 2.0f) + (oooO0OO.f16795Ooooooo / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = oooO0OO.OooO0o0() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void OooOO0o(@NonNull TextView textView, @StyleRes int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(o0000O0O.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            int i2 = o00000O0.design_error;
            Object obj = ContextCompat.f5281OooO00o;
            textView.setTextColor(ContextCompat.OooO0o.OooO00o(context, i2));
        }
    }

    public final void OooOOO(@Nullable Editable editable) {
        ((androidx.compose.foundation.OooO00o) this.f17521OooOOo0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f17519OooOOOo;
        int i = this.f17518OooOOOO;
        String string = null;
        if (i == -1) {
            this.f17520OooOOo.setText(String.valueOf(length));
            this.f17520OooOOo.setContentDescription(null);
            this.f17519OooOOOo = false;
        } else {
            this.f17519OooOOOo = length > i;
            Context context = getContext();
            this.f17520OooOOo.setContentDescription(context.getString(this.f17519OooOOOo ? o0000O0.character_counter_overflowed_content_description : o0000O0.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f17518OooOOOO)));
            if (z != this.f17519OooOOOo) {
                OooOOOO();
            }
            String str = o0000O0O.OooO00o.f33577OooO0Oo;
            Locale locale = Locale.getDefault();
            int i2 = o0000O0O.oo000o.f33601OooO00o;
            o0000O0O.OooO00o oooO00o = o0000O0O.oo000o.OooO00o.OooO00o(locale) == 1 ? o0000O0O.OooO00o.f33580OooO0oO : o0000O0O.OooO00o.f33578OooO0o;
            AppCompatTextView appCompatTextView = this.f17520OooOOo;
            String string2 = getContext().getString(o0000O0.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f17518OooOOOO));
            if (string2 == null) {
                oooO00o.getClass();
            } else {
                string = oooO00o.OooO0OO(string2, oooO00o.f33583OooO0OO).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f17511OooO0oO == null || z == this.f17519OooOOOo) {
            return;
        }
        OooOo00(false, false);
        OooOo0o();
        OooOOo0();
    }

    public final boolean OooOOO0() {
        oo000o oo000oVar = this.f17517OooOOO0;
        return (oo000oVar.f17665OooOOOO != 1 || oo000oVar.f17667OooOOo == null || TextUtils.isEmpty(oo000oVar.f17666OooOOOo)) ? false : true;
    }

    public final void OooOOOO() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f17520OooOOo;
        if (appCompatTextView != null) {
            OooOO0o(appCompatTextView, this.f17519OooOOOo ? this.f17522OooOOoo : this.f17525OooOo00);
            if (!this.f17519OooOOOo && (colorStateList2 = this.f17532OooOoo0) != null) {
                this.f17520OooOOo.setTextColor(colorStateList2);
            }
            if (!this.f17519OooOOOo || (colorStateList = this.f17531OooOoo) == null) {
                return;
            }
            this.f17520OooOOo.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    public final boolean OooOOOo() {
        boolean z;
        boolean z2;
        if (this.f17511OooO0oO == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        boolean z3 = true;
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        CheckableImageButton checkableImageButton = null;
        if ((startIconDrawable != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && o0oo00o2.getMeasuredWidth() > 0) {
            int measuredWidth = o0oo00o2.getMeasuredWidth() - this.f17511OooO0oO.getPaddingLeft();
            if (this.f17555OoooOoo == null || this.f17556Ooooo00 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17555OoooOoo = colorDrawable;
                this.f17556Ooooo00 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this.f17511OooO0oO);
            Drawable drawable = drawableArrOooO00o[0];
            ColorDrawable colorDrawable2 = this.f17555OoooOoo;
            if (drawable != colorDrawable2) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17511OooO0oO, colorDrawable2, drawableArrOooO00o[1], drawableArrOooO00o[2], drawableArrOooO00o[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f17555OoooOoo != null) {
            Drawable[] drawableArrOooO00o2 = TextViewCompat.OooO0O0.OooO00o(this.f17511OooO0oO);
            TextViewCompat.OooO0O0.OooO0o0(this.f17511OooO0oO, null, drawableArrOooO00o2[1], drawableArrOooO00o2[2], drawableArrOooO00o2[3]);
            this.f17555OoooOoo = null;
            z = true;
        } else {
            z = false;
        }
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (!o00o0o2.OooO0Oo()) {
            if (!((o00o0o2.f17596OooOO0o != 0) && o00o0o2.OooO0OO()) && o00o0o2.f17603OooOOoo == null) {
                z2 = false;
            } else if (o00o0o2.getMeasuredWidth() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (o00o0o2.getMeasuredWidth() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int measuredWidth2 = o00o0o2.f17606OooOo00.getMeasuredWidth() - this.f17511OooO0oO.getPaddingRight();
            if (o00o0o2.OooO0Oo()) {
                checkableImageButton = o00o0o2.f17590OooO0o;
            } else {
                if ((o00o0o2.f17596OooOO0o != 0) && o00o0o2.OooO0OO()) {
                    checkableImageButton = o00o0o2.f17594OooOO0;
                }
            }
            if (checkableImageButton != null) {
                measuredWidth2 = androidx.core.view.o00O0O.OooO0OO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrOooO00o3 = TextViewCompat.OooO0O0.OooO00o(this.f17511OooO0oO);
            ColorDrawable colorDrawable3 = this.f17558OooooO0;
            if (colorDrawable3 == null || this.f17559OooooOO == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f17558OooooO0 = colorDrawable4;
                    this.f17559OooooOO = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrOooO00o3[2];
                ColorDrawable colorDrawable5 = this.f17558OooooO0;
                if (drawable2 != colorDrawable5) {
                    this.f17560OooooOo = drawable2;
                    TextViewCompat.OooO0O0.OooO0o0(this.f17511OooO0oO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], colorDrawable5, drawableArrOooO00o3[3]);
                } else {
                    z3 = z;
                }
            } else {
                this.f17559OooooOO = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.OooO0O0.OooO0o0(this.f17511OooO0oO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], this.f17558OooooO0, drawableArrOooO00o3[3]);
            }
        } else {
            if (this.f17558OooooO0 == null) {
                return z;
            }
            Drawable[] drawableArrOooO00o4 = TextViewCompat.OooO0O0.OooO00o(this.f17511OooO0oO);
            if (drawableArrOooO00o4[2] == this.f17558OooooO0) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17511OooO0oO, drawableArrOooO00o4[0], drawableArrOooO00o4[1], this.f17560OooooOo, drawableArrOooO00o4[3]);
            } else {
                z3 = z;
            }
            this.f17558OooooO0 = null;
        }
        return z3;
    }

    public final void OooOOo() {
        EditText editText = this.f17511OooO0oO;
        if (editText == null || this.f17538Oooo00O == null) {
            return;
        }
        if ((this.f17540Oooo0O0 || editText.getBackground() == null) && this.f17535Oooo != 0) {
            EditText editText2 = this.f17511OooO0oO;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(editText2, editTextBoxBackground);
            this.f17540Oooo0O0 = true;
        }
    }

    public final void OooOOo0() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f17511OooO0oO;
        if (editText == null || this.f17535Oooo != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = o000000.f3192OooO00o;
        Drawable drawableMutate = background.mutate();
        if (OooOOO0()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOOO0.OooO0OO(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17519OooOOOo && (appCompatTextView = this.f17520OooOOo) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOOO0.OooO0OO(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f17511OooO0oO.refreshDrawableState();
        }
    }

    public final void OooOOoo() {
        if (this.f17535Oooo != 1) {
            FrameLayout frameLayout = this.f17508OooO0Oo;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iOooO0OO = OooO0OO();
            if (iOooO0OO != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0OO;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOo0(@Nullable Editable editable) {
        ((androidx.compose.foundation.OooO00o) this.f17521OooOOo0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f17508OooO0Oo;
        if (length != 0 || this.f17578oo000o) {
            AppCompatTextView appCompatTextView = this.f17527OooOo0o;
            if (appCompatTextView == null || !this.f17526OooOo0O) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            androidx.transition.OooOOO0.OooO00o(frameLayout, this.f17530OooOoOO);
            this.f17527OooOo0o.setVisibility(4);
            return;
        }
        if (this.f17527OooOo0o == null || !this.f17526OooOo0O || TextUtils.isEmpty(this.f17524OooOo0)) {
            return;
        }
        this.f17527OooOo0o.setText(this.f17524OooOo0);
        androidx.transition.OooOOO0.OooO00o(frameLayout, this.f17528OooOoO);
        this.f17527OooOo0o.setVisibility(0);
        this.f17527OooOo0o.bringToFront();
        announceForAccessibility(this.f17524OooOo0);
    }

    public final void OooOo00(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17511OooO0oO;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17511OooO0oO;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f17562Oooooo0;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        if (colorStateList2 != null) {
            oooO0OO.OooOO0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f17562Oooooo0;
            oooO0OO.OooOO0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f17572o00ooo) : this.f17572o00ooo));
        } else if (OooOOO0()) {
            AppCompatTextView appCompatTextView2 = this.f17517OooOOO0.f17667OooOOo;
            oooO0OO.OooOO0(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f17519OooOOOo && (appCompatTextView = this.f17520OooOOo) != null) {
            oooO0OO.OooOO0(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f17561Oooooo) != null && oooO0OO.f16749OooOOOO != colorStateList) {
            oooO0OO.f16749OooOOOO = colorStateList;
            oooO0OO.OooO(false);
        }
        o00O0O o00o0o2 = this.f17509OooO0o;
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        if (z3 || !this.f17570o00oO0O || (isEnabled() && z4)) {
            if (z2 || this.f17578oo000o) {
                ValueAnimator valueAnimator = this.f17576o0ooOOo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f17576o0ooOOo.cancel();
                }
                if (z && this.f17575o0ooOO0) {
                    OooO00o(1.0f);
                } else {
                    oooO0OO.OooOOOo(1.0f);
                }
                this.f17578oo000o = false;
                if (OooO0o0()) {
                    OooOO0();
                }
                EditText editText3 = this.f17511OooO0oO;
                OooOo0(editText3 != null ? editText3.getText() : null);
                o0oo00o2.f17631OooOOO0 = false;
                o0oo00o2.OooO0Oo();
                o00o0o2.f17605OooOo0 = false;
                o00o0o2.OooOOO0();
                return;
            }
            return;
        }
        if (z2 || !this.f17578oo000o) {
            ValueAnimator valueAnimator2 = this.f17576o0ooOOo;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f17576o0ooOOo.cancel();
            }
            if (z && this.f17575o0ooOO0) {
                OooO00o(0.0f);
            } else {
                oooO0OO.OooOOOo(0.0f);
            }
            if (OooO0o0() && (!((OooOOO) this.f17538Oooo00O).f17495OooOoOO.f17496OooOo0O.isEmpty()) && OooO0o0()) {
                ((OooOOO) this.f17538Oooo00O).OooOo(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f17578oo000o = true;
            AppCompatTextView appCompatTextView3 = this.f17527OooOo0o;
            if (appCompatTextView3 != null && this.f17526OooOo0O) {
                appCompatTextView3.setText((CharSequence) null);
                androidx.transition.OooOOO0.OooO00o(this.f17508OooO0Oo, this.f17530OooOoOO);
                this.f17527OooOo0o.setVisibility(4);
            }
            o0oo00o2.f17631OooOOO0 = true;
            o0oo00o2.OooO0Oo();
            o00o0o2.f17605OooOo0 = true;
            o00o0o2.OooOOO0();
        }
    }

    public final void OooOo0O(boolean z, boolean z2) {
        int defaultColor = this.f17579ooOO.getDefaultColor();
        int colorForState = this.f17579ooOO.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17579ooOO.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f17550OoooOO0 = colorForState2;
        } else if (z2) {
            this.f17550OoooOO0 = colorForState;
        } else {
            this.f17550OoooOO0 = defaultColor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    public final void OooOo0o() {
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateListValueOf;
        EditText editText;
        EditText editText2;
        if (this.f17538Oooo00O == null || this.f17535Oooo == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f17511OooO0oO) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f17511OooO0oO) != null && editText.isHovered());
        if (OooOOO0() || (this.f17520OooOOo != null && this.f17519OooOOOo)) {
            z = true;
        }
        if (!isEnabled()) {
            this.f17550OoooOO0 = this.f17572o00ooo;
        } else if (OooOOO0()) {
            if (this.f17579ooOO != null) {
                OooOo0O(z2, z3);
            } else {
                this.f17550OoooOO0 = getErrorCurrentTextColors();
            }
        } else if (!this.f17519OooOOOo || (appCompatTextView = this.f17520OooOOo) == null) {
            if (z2) {
                this.f17550OoooOO0 = this.f17574o0OoOo0;
            } else if (z3) {
                this.f17550OoooOO0 = this.f17564Ooooooo;
            } else {
                this.f17550OoooOO0 = this.f17563OoooooO;
            }
        } else if (this.f17579ooOO != null) {
            OooOo0O(z2, z3);
        } else {
            this.f17550OoooOO0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueOooO00o = p276o0O00OoO.OooO0OO.OooO00o(o00000.colorControlActivated, context);
            if (typedValueOooO00o != null) {
                int i = typedValueOooO00o.resourceId;
                if (i != 0) {
                    colorStateListValueOf = ContextCompat.OooO0O0(i, context);
                } else {
                    int i2 = typedValueOooO00o.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
            EditText editText3 = this.f17511OooO0oO;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f17511OooO0oO.getTextCursorDrawable();
                if (z) {
                    ColorStateList colorStateListValueOf2 = this.f17579ooOO;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.f17550OoooOO0);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                o00000oo.o00Ooo.OooO0O0.OooO0oo(textCursorDrawable, colorStateListValueOf);
            }
        }
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.OooOO0O();
        CheckableImageButton checkableImageButton = o00o0o2.f17590OooO0o;
        ColorStateList colorStateList = o00o0o2.f17592OooO0oO;
        TextInputLayout textInputLayout = o00o0o2.f17589OooO0Oo;
        o00Ooo.OooO0OO(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = o00o0o2.f17597OooOOO;
        CheckableImageButton checkableImageButton2 = o00o0o2.f17594OooOO0;
        o00Ooo.OooO0OO(textInputLayout, checkableImageButton2, colorStateList2);
        if (o00o0o2.OooO0O0() instanceof o0OoOo0) {
            if (!textInputLayout.OooOOO0() || checkableImageButton2.getDrawable() == null) {
                o00Ooo.OooO00o(textInputLayout, checkableImageButton2, o00o0o2.f17597OooOOO, o00o0o2.f17599OooOOOO);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                o00000oo.o00Ooo.OooO0O0.OooO0oO(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        o00Ooo.OooO0OO(o0oo00o2.f17623OooO0Oo, o0oo00o2.f17626OooO0oO, o0oo00o2.f17627OooO0oo);
        if (this.f17535Oooo == 2) {
            int i3 = this.f17547OoooO0;
            if (z2 && isEnabled()) {
                this.f17547OoooO0 = this.f17546OoooO;
            } else {
                this.f17547OoooO0 = this.f17549OoooO0O;
            }
            if (this.f17547OoooO0 != i3 && OooO0o0() && !this.f17578oo000o) {
                if (OooO0o0()) {
                    ((OooOOO) this.f17538Oooo00O).OooOo(0.0f, 0.0f, 0.0f, 0.0f);
                }
                OooOO0();
            }
        }
        if (this.f17535Oooo == 1) {
            if (!isEnabled()) {
                this.f17565o000oOoO = this.f17567o00Oo0;
            } else if (z3 && !z2) {
                this.f17565o000oOoO = this.f17569o00o0O;
            } else if (z2) {
                this.f17565o000oOoO = this.f17568o00Ooo;
            } else {
                this.f17565o000oOoO = this.f17566o00O0O;
            }
        }
        OooO0O0();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f17508OooO0Oo;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOOoo();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f17511OooO0oO;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f17512OooO0oo != null) {
            boolean z = this.f17537Oooo000;
            this.f17537Oooo000 = false;
            CharSequence hint = editText.getHint();
            this.f17511OooO0oO.setHint(this.f17512OooO0oo);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f17511OooO0oO.setHint(hint);
                this.f17537Oooo000 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f17508OooO0Oo;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f17511OooO0oO) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f17573o0OOO0o = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17573o0OOO0o = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.f17533OooOooO;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        if (z) {
            oooO0OO.OooO0Oo(canvas);
        }
        if (this.f17543Oooo0o0 == null || (materialShapeDrawable = this.f17541Oooo0OO) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f17511OooO0oO.isFocused()) {
            Rect bounds = this.f17543Oooo0o0.getBounds();
            Rect bounds2 = this.f17541Oooo0OO.getBounds();
            float f = oooO0OO.f16737OooO0O0;
            int iCenterX = bounds2.centerX();
            bounds.left = o0O000.OooO0O0.OooO0O0(iCenterX, bounds2.left, f);
            bounds.right = o0O000.OooO0O0.OooO0O0(iCenterX, bounds2.right, f);
            this.f17543Oooo0o0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f17577o0ooOoO) {
            return;
        }
        this.f17577o0ooOoO = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        boolean zOooOOo = oooO0OO != null ? oooO0OO.OooOOo(drawableState) | false : false;
        if (this.f17511OooO0oO != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            OooOo00(ViewCompat.OooOO0O.OooO0OO(this) && isEnabled(), false);
        }
        OooOOo0();
        OooOo0o();
        if (zOooOOo) {
            invalidate();
        }
        this.f17577o0ooOoO = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17511OooO0oO;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0OO() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f17535Oooo;
        if (i == 1 || i == 2) {
            return this.f17538Oooo00O;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17565o000oOoO;
    }

    public int getBoxBackgroundMode() {
        return this.f17535Oooo;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f17548OoooO00;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f17553OoooOo0;
        return zOooO0o ? this.f17542Oooo0o.f17158OooO0oo.OooO00o(rectF) : this.f17542Oooo0o.f17157OooO0oO.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f17553OoooOo0;
        return zOooO0o ? this.f17542Oooo0o.f17157OooO0oO.OooO00o(rectF) : this.f17542Oooo0o.f17158OooO0oo.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f17553OoooOo0;
        return zOooO0o ? this.f17542Oooo0o.f17156OooO0o0.OooO00o(rectF) : this.f17542Oooo0o.f17155OooO0o.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f17553OoooOo0;
        return zOooO0o ? this.f17542Oooo0o.f17155OooO0o.OooO00o(rectF) : this.f17542Oooo0o.f17156OooO0o0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f17574o0OoOo0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17579ooOO;
    }

    public int getBoxStrokeWidth() {
        return this.f17549OoooO0O;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17546OoooO;
    }

    public int getCounterMaxLength() {
        return this.f17518OooOOOO;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f17516OooOOO && this.f17519OooOOOo && (appCompatTextView = this.f17520OooOOo) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f17531OooOoo;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f17532OooOoo0;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f17562Oooooo0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f17511OooO0oO;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f17509OooO0o.f17594OooOO0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f17509OooO0o.f17594OooOO0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f17509OooO0o.f17600OooOOOo;
    }

    public int getEndIconMode() {
        return this.f17509OooO0o.f17596OooOO0o;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f17509OooO0o.f17602OooOOo0;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f17509OooO0o.f17594OooOO0;
    }

    @Nullable
    public CharSequence getError() {
        oo000o oo000oVar = this.f17517OooOOO0;
        if (oo000oVar.f17668OooOOo0) {
            return oo000oVar.f17666OooOOOo;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f17517OooOOO0.f17672OooOo00;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f17517OooOOO0.f17669OooOOoo;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f17517OooOOO0.f17667OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f17509OooO0o.f17590OooO0o.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        oo000o oo000oVar = this.f17517OooOOO0;
        if (oo000oVar.f17670OooOo) {
            return oo000oVar.f17674OooOo0o;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f17517OooOOO0.f17676OooOoO0;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f17533OooOooO) {
            return this.f17534OooOooo;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f17571o00oO0o.OooO0o0();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        return oooO0OO.OooO0o(oooO0OO.f16749OooOOOO);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f17561Oooooo;
    }

    @NonNull
    public OooOO0 getLengthCounter() {
        return this.f17521OooOOo0;
    }

    public int getMaxEms() {
        return this.f17513OooOO0;
    }

    @Px
    public int getMaxWidth() {
        return this.f17515OooOO0o;
    }

    public int getMinEms() {
        return this.f17507OooO;
    }

    @Px
    public int getMinWidth() {
        return this.f17514OooOO0O;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17509OooO0o.f17594OooOO0.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17509OooO0o.f17594OooOO0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f17526OooOo0O) {
            return this.f17524OooOo0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f17529OooOoO0;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f17523OooOo;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f17510OooO0o0.f17624OooO0o;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f17510OooO0o0.f17625OooO0o0.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f17510OooO0o0.f17625OooO0o0;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        return this.f17542Oooo0o;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f17510OooO0o0.f17626OooO0oO.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f17510OooO0o0.f17626OooO0oO.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f17510OooO0o0.f17628OooOO0;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f17510OooO0o0.f17629OooOO0O;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f17509OooO0o.f17603OooOOoo;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f17509OooO0o.f17606OooOo00.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f17509OooO0o.f17606OooOo00;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f17554OoooOoO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17571o00oO0o.OooO0oo(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f17511OooO0oO;
        if (editText != null) {
            Rect rect = this.f17551OoooOOO;
            com.google.android.material.internal.OooO0o.OooO00o(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f17541Oooo0OO;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.f17549OoooO0O, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f17543Oooo0o0;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.f17546OoooO, rect.right, i6);
            }
            if (this.f17533OooOooO) {
                float textSize = this.f17511OooO0oO.getTextSize();
                com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
                if (oooO0OO.f16746OooOO0o != textSize) {
                    oooO0OO.f16746OooOO0o = textSize;
                    oooO0OO.OooO(false);
                }
                int gravity = this.f17511OooO0oO.getGravity();
                oooO0OO.OooOO0o((gravity & (-113)) | 48);
                if (oooO0OO.f16744OooOO0 != gravity) {
                    oooO0OO.f16744OooOO0 = gravity;
                    oooO0OO.OooO(false);
                }
                if (this.f17511OooO0oO == null) {
                    throw new IllegalStateException();
                }
                boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
                int i7 = rect.bottom;
                Rect rect2 = this.f17552OoooOOo;
                rect2.bottom = i7;
                int i8 = this.f17535Oooo;
                if (i8 == 1) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = rect.top + this.f17548OoooO00;
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else if (i8 != 2) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = getPaddingTop();
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else {
                    rect2.left = this.f17511OooO0oO.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - OooO0OO();
                    rect2.right = rect.right - this.f17511OooO0oO.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = oooO0OO.f16743OooO0oo;
                if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                    rect3.set(i9, i10, i11, i12);
                    oooO0OO.f16780OoooO0O = true;
                }
                if (this.f17511OooO0oO == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = oooO0OO.f16781OoooOO0;
                textPaint.setTextSize(oooO0OO.f16746OooOO0o);
                textPaint.setTypeface(oooO0OO.f16759OooOoO);
                textPaint.setLetterSpacing(oooO0OO.f16793Oooooo0);
                float f = -textPaint.ascent();
                rect2.left = this.f17511OooO0oO.getCompoundPaddingLeft() + rect.left;
                rect2.top = this.f17535Oooo == 1 && this.f17511OooO0oO.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f17511OooO0oO.getCompoundPaddingTop();
                rect2.right = rect.right - this.f17511OooO0oO.getCompoundPaddingRight();
                int compoundPaddingBottom = this.f17535Oooo == 1 && this.f17511OooO0oO.getMinLines() <= 1 ? (int) (rect2.top + f) : rect.bottom - this.f17511OooO0oO.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = oooO0OO.f16742OooO0oO;
                if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    oooO0OO.f16780OoooO0O = true;
                }
                oooO0OO.OooO(false);
                if (!OooO0o0() || this.f17578oo000o) {
                    return;
                }
                OooOO0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        EditText editText2 = this.f17511OooO0oO;
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (editText2 != null && this.f17511OooO0oO.getMeasuredHeight() < (iMax = Math.max(o00o0o2.getMeasuredHeight(), this.f17510OooO0o0.getMeasuredHeight()))) {
            this.f17511OooO0oO.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zOooOOOo = OooOOOo();
        if (z || zOooOOOo) {
            this.f17511OooO0oO.post(new OooO0OO());
        }
        if (this.f17527OooOo0o != null && (editText = this.f17511OooO0oO) != null) {
            this.f17527OooOo0o.setGravity(editText.getGravity());
            this.f17527OooOo0o.setPadding(this.f17511OooO0oO.getCompoundPaddingLeft(), this.f17511OooO0oO.getCompoundPaddingTop(), this.f17511OooO0oO.getCompoundPaddingRight(), this.f17511OooO0oO.getCompoundPaddingBottom());
        }
        o00o0o2.OooOO0o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        setError(savedState.f17585OooO0o);
        if (savedState.f17586OooO0oO) {
            post(new OooO0O0());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f17544Oooo0oO) {
            p280o0O00o0O.OooOO0 oooOO1 = this.f17542Oooo0o.f17156OooO0o0;
            RectF rectF = this.f17553OoooOo0;
            float fOooO00o = oooOO1.OooO00o(rectF);
            float fOooO00o2 = this.f17542Oooo0o.f17155OooO0o.OooO00o(rectF);
            float fOooO00o3 = this.f17542Oooo0o.f17158OooO0oo.OooO00o(rectF);
            float fOooO00o4 = this.f17542Oooo0o.f17157OooO0oO.OooO00o(rectF);
            com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17542Oooo0o;
            p280o0O00o0O.OooOO0O oooOO0O = oooO0O0.f17151OooO00o;
            com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
            p280o0O00o0O.OooOO0O oooOO0O2 = oooO0O0.f17152OooO0O0;
            oooO00o.f17163OooO00o = oooOO0O2;
            float fOooO00o5 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0O2);
            if (fOooO00o5 != -1.0f) {
                oooO00o.OooO0o0(fOooO00o5);
            }
            oooO00o.f17164OooO0O0 = oooOO0O;
            float fOooO00o6 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0O);
            if (fOooO00o6 != -1.0f) {
                oooO00o.OooO0o(fOooO00o6);
            }
            p280o0O00o0O.OooOO0O oooOO0O3 = oooO0O0.f17153OooO0OO;
            oooO00o.f17166OooO0Oo = oooOO0O3;
            float fOooO00o7 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0O3);
            if (fOooO00o7 != -1.0f) {
                oooO00o.OooO0OO(fOooO00o7);
            }
            p280o0O00o0O.OooOO0O oooOO0O4 = oooO0O0.f17154OooO0Oo;
            oooO00o.f17165OooO0OO = oooOO0O4;
            float fOooO00o8 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0O4);
            if (fOooO00o8 != -1.0f) {
                oooO00o.OooO0Oo(fOooO00o8);
            }
            oooO00o.OooO0o0(fOooO00o2);
            oooO00o.OooO0o(fOooO00o);
            oooO00o.OooO0OO(fOooO00o4);
            oooO00o.OooO0Oo(fOooO00o3);
            com.google.android.material.shape.OooO0O0 oooO0O1 = new com.google.android.material.shape.OooO0O0(oooO00o);
            this.f17544Oooo0oO = z;
            setShapeAppearanceModel(oooO0O1);
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (OooOOO0()) {
            savedState.f17585OooO0o = getError();
        }
        o00O0O o00o0o2 = this.f17509OooO0o;
        savedState.f17586OooO0oO = (o00o0o2.f17596OooOO0o != 0) && o00o0o2.f17594OooOO0.isChecked();
        return savedState;
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f17565o000oOoO != i) {
            this.f17565o000oOoO = i;
            this.f17566o00O0O = i;
            this.f17568o00Ooo = i;
            this.f17569o00o0O = i;
            OooO0O0();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setBoxBackgroundColor(ContextCompat.OooO0o.OooO00o(context, i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17566o00O0O = defaultColor;
        this.f17565o000oOoO = defaultColor;
        this.f17567o00Oo0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17568o00Ooo = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f17569o00o0O = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0O0();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f17535Oooo) {
            return;
        }
        this.f17535Oooo = i;
        if (this.f17511OooO0oO != null) {
            OooO();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f17548OoooO00 = i;
    }

    public void setBoxCornerFamily(int i) {
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17542Oooo0o;
        oooO0O0.getClass();
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
        p280o0O00o0O.OooOO0 oooOO1 = this.f17542Oooo0o.f17156OooO0o0;
        p280o0O00o0O.OooOO0O oooOO0OOooO00o = p280o0O00o0O.OooOo00.OooO00o(i);
        oooO00o.f17163OooO00o = oooOO0OOooO00o;
        float fOooO00o = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0OOooO00o);
        if (fOooO00o != -1.0f) {
            oooO00o.OooO0o0(fOooO00o);
        }
        oooO00o.f17168OooO0o0 = oooOO1;
        p280o0O00o0O.OooOO0 oooOO2 = this.f17542Oooo0o.f17155OooO0o;
        p280o0O00o0O.OooOO0O oooOO0OOooO00o2 = p280o0O00o0O.OooOo00.OooO00o(i);
        oooO00o.f17164OooO0O0 = oooOO0OOooO00o2;
        float fOooO00o2 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0OOooO00o2);
        if (fOooO00o2 != -1.0f) {
            oooO00o.OooO0o(fOooO00o2);
        }
        oooO00o.f17167OooO0o = oooOO2;
        p280o0O00o0O.OooOO0 oooOO3 = this.f17542Oooo0o.f17158OooO0oo;
        p280o0O00o0O.OooOO0O oooOO0OOooO00o3 = p280o0O00o0O.OooOo00.OooO00o(i);
        oooO00o.f17166OooO0Oo = oooOO0OOooO00o3;
        float fOooO00o3 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0OOooO00o3);
        if (fOooO00o3 != -1.0f) {
            oooO00o.OooO0OO(fOooO00o3);
        }
        oooO00o.f17170OooO0oo = oooOO3;
        p280o0O00o0O.OooOO0 oooOO4 = this.f17542Oooo0o.f17157OooO0oO;
        p280o0O00o0O.OooOO0O oooOO0OOooO00o4 = p280o0O00o0O.OooOo00.OooO00o(i);
        oooO00o.f17165OooO0OO = oooOO0OOooO00o4;
        float fOooO00o4 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOO0OOooO00o4);
        if (fOooO00o4 != -1.0f) {
            oooO00o.OooO0Oo(fOooO00o4);
        }
        oooO00o.f17169OooO0oO = oooOO4;
        this.f17542Oooo0o = new com.google.android.material.shape.OooO0O0(oooO00o);
        OooO0O0();
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f17574o0OoOo0 != i) {
            this.f17574o0OoOo0 = i;
            OooOo0o();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f17563OoooooO = colorStateList.getDefaultColor();
            this.f17572o00ooo = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17564Ooooooo = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f17574o0OoOo0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f17574o0OoOo0 != colorStateList.getDefaultColor()) {
            this.f17574o0OoOo0 = colorStateList.getDefaultColor();
        }
        OooOo0o();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f17579ooOO != colorStateList) {
            this.f17579ooOO = colorStateList;
            OooOo0o();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f17549OoooO0O = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f17546OoooO = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f17516OooOOO != z) {
            oo000o oo000oVar = this.f17517OooOOO0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17520OooOOo = appCompatTextView;
                appCompatTextView.setId(o0000Ooo.textinput_counter);
                Typeface typeface = this.f17554OoooOoO;
                if (typeface != null) {
                    this.f17520OooOOo.setTypeface(typeface);
                }
                this.f17520OooOOo.setMaxLines(1);
                oo000oVar.OooO00o(this.f17520OooOOo, 2);
                androidx.core.view.o00O0O.OooO0oo((ViewGroup.MarginLayoutParams) this.f17520OooOOo.getLayoutParams(), getResources().getDimensionPixelOffset(o00000O.mtrl_textinput_counter_margin_start));
                OooOOOO();
                if (this.f17520OooOOo != null) {
                    EditText editText = this.f17511OooO0oO;
                    OooOOO(editText != null ? editText.getText() : null);
                }
            } else {
                oo000oVar.OooO0oO(this.f17520OooOOo, 2);
                this.f17520OooOOo = null;
            }
            this.f17516OooOOO = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f17518OooOOOO != i) {
            if (i > 0) {
                this.f17518OooOOOO = i;
            } else {
                this.f17518OooOOOO = -1;
            }
            if (!this.f17516OooOOO || this.f17520OooOOo == null) {
                return;
            }
            EditText editText = this.f17511OooO0oO;
            OooOOO(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f17522OooOOoo != i) {
            this.f17522OooOOoo = i;
            OooOOOO();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17531OooOoo != colorStateList) {
            this.f17531OooOoo = colorStateList;
            OooOOOO();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f17525OooOo00 != i) {
            this.f17525OooOo00 = i;
            OooOOOO();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17532OooOoo0 != colorStateList) {
            this.f17532OooOoo0 = colorStateList;
            OooOOOO();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f17562Oooooo0 = colorStateList;
        this.f17561Oooooo = colorStateList;
        if (this.f17511OooO0oO != null) {
            OooOo00(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOO0O(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f17509OooO0o.f17594OooOO0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f17509OooO0o.f17594OooOO0.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        CharSequence text = i != 0 ? o00o0o2.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        Drawable drawableOooO00o = i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00o0o2.getContext(), i) : null;
        CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
        checkableImageButton.setImageDrawable(drawableOooO00o);
        if (drawableOooO00o != null) {
            ColorStateList colorStateList = o00o0o2.f17597OooOOO;
            PorterDuff.Mode mode = o00o0o2.f17599OooOOOO;
            TextInputLayout textInputLayout = o00o0o2.f17589OooO0Oo;
            o00Ooo.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            o00Ooo.OooO0OO(textInputLayout, checkableImageButton, o00o0o2.f17597OooOOO);
        }
    }

    public void setEndIconMinSize(@IntRange(from = ULong.MIN_VALUE) int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (i < 0) {
            o00o0o2.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != o00o0o2.f17600OooOOOo) {
            o00o0o2.f17600OooOOOo = i;
            CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = o00o0o2.f17590OooO0o;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f17509OooO0o.OooO0o(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        View.OnLongClickListener onLongClickListener = o00o0o2.f17601OooOOo;
        CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
        checkableImageButton.setOnClickListener(onClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17601OooOOo = onLongClickListener;
        CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17602OooOOo0 = scaleType;
        o00o0o2.f17594OooOO0.setScaleType(scaleType);
        o00o0o2.f17590OooO0o.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (o00o0o2.f17597OooOOO != colorStateList) {
            o00o0o2.f17597OooOOO = colorStateList;
            o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17594OooOO0, colorStateList, o00o0o2.f17599OooOOOO);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (o00o0o2.f17599OooOOOO != mode) {
            o00o0o2.f17599OooOOOO = mode;
            o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17594OooOO0, o00o0o2.f17597OooOOO, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f17509OooO0o.OooO0oO(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        oo000o oo000oVar = this.f17517OooOOO0;
        if (!oo000oVar.f17668OooOOo0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            oo000oVar.OooO0o();
            return;
        }
        oo000oVar.OooO0OO();
        oo000oVar.f17666OooOOOo = charSequence;
        oo000oVar.f17667OooOOo.setText(charSequence);
        int i = oo000oVar.f17663OooOOO;
        if (i != 1) {
            oo000oVar.f17665OooOOOO = 1;
        }
        oo000oVar.OooO(i, oo000oVar.f17665OooOOOO, oo000oVar.OooO0oo(oo000oVar.f17667OooOOo, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17672OooOo00 = i;
        AppCompatTextView appCompatTextView = oo000oVar.f17667OooOOo;
        if (appCompatTextView != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView, i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17669OooOOoo = charSequence;
        AppCompatTextView appCompatTextView = oo000oVar.f17667OooOOo;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        oo000o oo000oVar = this.f17517OooOOO0;
        if (oo000oVar.f17668OooOOo0 == z) {
            return;
        }
        oo000oVar.OooO0OO();
        TextInputLayout textInputLayout = oo000oVar.f17659OooO0oo;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oo000oVar.f17658OooO0oO);
            oo000oVar.f17667OooOOo = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_error);
            oo000oVar.f17667OooOOo.setTextAlignment(5);
            Typeface typeface = oo000oVar.f17678OooOoo0;
            if (typeface != null) {
                oo000oVar.f17667OooOOo.setTypeface(typeface);
            }
            int i = oo000oVar.f17671OooOo0;
            oo000oVar.f17671OooOo0 = i;
            AppCompatTextView appCompatTextView2 = oo000oVar.f17667OooOOo;
            if (appCompatTextView2 != null) {
                textInputLayout.OooOO0o(appCompatTextView2, i);
            }
            ColorStateList colorStateList = oo000oVar.f17673OooOo0O;
            oo000oVar.f17673OooOo0O = colorStateList;
            AppCompatTextView appCompatTextView3 = oo000oVar.f17667OooOOo;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = oo000oVar.f17669OooOOoo;
            oo000oVar.f17669OooOOoo = charSequence;
            AppCompatTextView appCompatTextView4 = oo000oVar.f17667OooOOo;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = oo000oVar.f17672OooOo00;
            oo000oVar.f17672OooOo00 = i2;
            AppCompatTextView appCompatTextView5 = oo000oVar.f17667OooOOo;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOO0O.OooO0o(appCompatTextView5, i2);
            }
            oo000oVar.f17667OooOOo.setVisibility(4);
            oo000oVar.OooO00o(oo000oVar.f17667OooOOo, 0);
        } else {
            oo000oVar.OooO0o();
            oo000oVar.OooO0oO(oo000oVar.f17667OooOOo, 0);
            oo000oVar.f17667OooOOo = null;
            textInputLayout.OooOOo0();
            textInputLayout.OooOo0o();
        }
        oo000oVar.f17668OooOOo0 = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.OooO0oo(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00o0o2.getContext(), i) : null);
        o00Ooo.OooO0OO(o00o0o2.f17589OooO0Oo, o00o0o2.f17590OooO0o, o00o0o2.f17592OooO0oO);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        CheckableImageButton checkableImageButton = o00o0o2.f17590OooO0o;
        View.OnLongClickListener onLongClickListener = o00o0o2.f17588OooO;
        checkableImageButton.setOnClickListener(onClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17588OooO = onLongClickListener;
        CheckableImageButton checkableImageButton = o00o0o2.f17590OooO0o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (o00o0o2.f17592OooO0oO != colorStateList) {
            o00o0o2.f17592OooO0oO = colorStateList;
            o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17590OooO0o, colorStateList, o00o0o2.f17593OooO0oo);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (o00o0o2.f17593OooO0oo != mode) {
            o00o0o2.f17593OooO0oo = mode;
            o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17590OooO0o, o00o0o2.f17592OooO0oO, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17671OooOo0 = i;
        AppCompatTextView appCompatTextView = oo000oVar.f17667OooOOo;
        if (appCompatTextView != null) {
            oo000oVar.f17659OooO0oo.OooOO0o(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17673OooOo0O = colorStateList;
        AppCompatTextView appCompatTextView = oo000oVar.f17667OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f17570o00oO0O != z) {
            this.f17570o00oO0O = z;
            OooOo00(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        oo000o oo000oVar = this.f17517OooOOO0;
        if (zIsEmpty) {
            if (oo000oVar.f17670OooOo) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!oo000oVar.f17670OooOo) {
            setHelperTextEnabled(true);
        }
        oo000oVar.OooO0OO();
        oo000oVar.f17674OooOo0o = charSequence;
        oo000oVar.f17676OooOoO0.setText(charSequence);
        int i = oo000oVar.f17663OooOOO;
        if (i != 2) {
            oo000oVar.f17665OooOOOO = 2;
        }
        oo000oVar.OooO(i, oo000oVar.f17665OooOOOO, oo000oVar.OooO0oo(oo000oVar.f17676OooOoO0, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17677OooOoOO = colorStateList;
        AppCompatTextView appCompatTextView = oo000oVar.f17676OooOoO0;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        oo000o oo000oVar = this.f17517OooOOO0;
        if (oo000oVar.f17670OooOo == z) {
            return;
        }
        oo000oVar.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oo000oVar.f17658OooO0oO);
            oo000oVar.f17676OooOoO0 = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_helper_text);
            oo000oVar.f17676OooOoO0.setTextAlignment(5);
            Typeface typeface = oo000oVar.f17678OooOoo0;
            if (typeface != null) {
                oo000oVar.f17676OooOoO0.setTypeface(typeface);
            }
            oo000oVar.f17676OooOoO0.setVisibility(4);
            AppCompatTextView appCompatTextView2 = oo000oVar.f17676OooOoO0;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView2, 1);
            int i = oo000oVar.f17675OooOoO;
            oo000oVar.f17675OooOoO = i;
            AppCompatTextView appCompatTextView3 = oo000oVar.f17676OooOoO0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = oo000oVar.f17677OooOoOO;
            oo000oVar.f17677OooOoOO = colorStateList;
            AppCompatTextView appCompatTextView4 = oo000oVar.f17676OooOoO0;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            oo000oVar.OooO00o(oo000oVar.f17676OooOoO0, 1);
            oo000oVar.f17676OooOoO0.setAccessibilityDelegate(new o00oO0o(oo000oVar));
        } else {
            oo000oVar.OooO0OO();
            int i2 = oo000oVar.f17663OooOOO;
            if (i2 == 2) {
                oo000oVar.f17665OooOOOO = 0;
            }
            oo000oVar.OooO(i2, oo000oVar.f17665OooOOOO, oo000oVar.OooO0oo(oo000oVar.f17676OooOoO0, ""));
            oo000oVar.OooO0oO(oo000oVar.f17676OooOoO0, 1);
            oo000oVar.f17676OooOoO0 = null;
            TextInputLayout textInputLayout = oo000oVar.f17659OooO0oo;
            textInputLayout.OooOOo0();
            textInputLayout.OooOo0o();
        }
        oo000oVar.f17670OooOo = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        oo000o oo000oVar = this.f17517OooOOO0;
        oo000oVar.f17675OooOoO = i;
        AppCompatTextView appCompatTextView = oo000oVar.f17676OooOoO0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f17533OooOooO) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f17575o0ooOO0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f17533OooOooO) {
            this.f17533OooOooO = z;
            if (z) {
                CharSequence hint = this.f17511OooO0oO.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17534OooOooo)) {
                        setHint(hint);
                    }
                    this.f17511OooO0oO.setHint((CharSequence) null);
                }
                this.f17537Oooo000 = true;
            } else {
                this.f17537Oooo000 = false;
                if (!TextUtils.isEmpty(this.f17534OooOooo) && TextUtils.isEmpty(this.f17511OooO0oO.getHint())) {
                    this.f17511OooO0oO.setHint(this.f17534OooOooo);
                }
                setHintInternal(null);
            }
            if (this.f17511OooO0oO != null) {
                OooOOoo();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
        oooO0OO.OooOO0O(i);
        this.f17561Oooooo = oooO0OO.f16749OooOOOO;
        if (this.f17511OooO0oO != null) {
            OooOo00(false, false);
            OooOOoo();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17561Oooooo != colorStateList) {
            if (this.f17562Oooooo0 == null) {
                com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
                if (oooO0OO.f16749OooOOOO != colorStateList) {
                    oooO0OO.f16749OooOOOO = colorStateList;
                    oooO0OO.OooO(false);
                }
            }
            this.f17561Oooooo = colorStateList;
            if (this.f17511OooO0oO != null) {
                OooOo00(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull OooOO0 oooOO1) {
        this.f17521OooOOo0 = oooOO1;
    }

    public void setMaxEms(int i) {
        this.f17513OooOO0 = i;
        EditText editText = this.f17511OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.f17515OooOO0o = i;
        EditText editText = this.f17511OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f17507OooO = i;
        EditText editText = this.f17511OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.f17514OooOO0O = i;
        EditText editText = this.f17511OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17594OooOO0.setContentDescription(i != 0 ? o00o0o2.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17594OooOO0.setImageDrawable(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00o0o2.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        if (z && o00o0o2.f17596OooOO0o != 1) {
            o00o0o2.OooO0o(1);
        } else if (z) {
            o00o0o2.getClass();
        } else {
            o00o0o2.OooO0o(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17597OooOOO = colorStateList;
        o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17594OooOO0, colorStateList, o00o0o2.f17599OooOOOO);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.f17599OooOOOO = mode;
        o00Ooo.OooO00o(o00o0o2.f17589OooO0Oo, o00o0o2.f17594OooOO0, o00o0o2.f17597OooOOO, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f17527OooOo0o == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f17527OooOo0o = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f17527OooOo0o;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOoo(appCompatTextView2, 2);
            Fade fadeOooO0Oo = OooO0Oo();
            this.f17528OooOoO = fadeOooO0Oo;
            fadeOooO0Oo.f11303OooO0o0 = 67L;
            this.f17530OooOoOO = OooO0Oo();
            setPlaceholderTextAppearance(this.f17529OooOoO0);
            setPlaceholderTextColor(this.f17523OooOo);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17526OooOo0O) {
                setPlaceholderTextEnabled(true);
            }
            this.f17524OooOo0 = charSequence;
        }
        EditText editText = this.f17511OooO0oO;
        OooOo0(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f17529OooOoO0 = i;
        AppCompatTextView appCompatTextView = this.f17527OooOo0o;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17523OooOo != colorStateList) {
            this.f17523OooOo = colorStateList;
            AppCompatTextView appCompatTextView = this.f17527OooOo0o;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        o0oo00o2.getClass();
        o0oo00o2.f17624OooO0o = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o0oo00o2.f17625OooO0o0.setText(charSequence);
        o0oo00o2.OooO0Oo();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        this.f17510OooO0o0.f17625OooO0o0.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17510OooO0o0.f17625OooO0o0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        MaterialShapeDrawable materialShapeDrawable = this.f17538Oooo00O;
        if (materialShapeDrawable == null || materialShapeDrawable.f17105OooO0Oo.f17128OooO00o == oooO0O0) {
            return;
        }
        this.f17542Oooo0o = oooO0O0;
        OooO0O0();
    }

    public void setStartIconCheckable(boolean z) {
        this.f17510OooO0o0.f17626OooO0oO.setCheckable(z);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f17510OooO0o0.f17626OooO0oO;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(getContext(), i) : null);
    }

    public void setStartIconMinSize(@IntRange(from = ULong.MIN_VALUE) int i) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        if (i < 0) {
            o0oo00o2.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != o0oo00o2.f17628OooOO0) {
            o0oo00o2.f17628OooOO0 = i;
            CheckableImageButton checkableImageButton = o0oo00o2.f17626OooO0oO;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        View.OnLongClickListener onLongClickListener = o0oo00o2.f17630OooOO0o;
        CheckableImageButton checkableImageButton = o0oo00o2.f17626OooO0oO;
        checkableImageButton.setOnClickListener(onClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        o0oo00o2.f17630OooOO0o = onLongClickListener;
        CheckableImageButton checkableImageButton = o0oo00o2.f17626OooO0oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        o0oo00o2.f17629OooOO0O = scaleType;
        o0oo00o2.f17626OooO0oO.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        if (o0oo00o2.f17627OooO0oo != colorStateList) {
            o0oo00o2.f17627OooO0oo = colorStateList;
            o00Ooo.OooO00o(o0oo00o2.f17623OooO0Oo, o0oo00o2.f17626OooO0oO, colorStateList, o0oo00o2.f17622OooO);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        o0OO00O o0oo00o2 = this.f17510OooO0o0;
        if (o0oo00o2.f17622OooO != mode) {
            o0oo00o2.f17622OooO = mode;
            o00Ooo.OooO00o(o0oo00o2.f17623OooO0Oo, o0oo00o2.f17626OooO0oO, o0oo00o2.f17627OooO0oo, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f17510OooO0o0.OooO0O0(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        o00o0o2.getClass();
        o00o0o2.f17603OooOOoo = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o00o0o2.f17606OooOo00.setText(charSequence);
        o00o0o2.OooOOO0();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.f17509OooO0o.f17606OooOo00.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17509OooO0o.f17606OooOo00.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable OooO oooO) {
        EditText editText = this.f17511OooO0oO;
        if (editText != null) {
            ViewCompat.OooOOOO(editText, oooO);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f17554OoooOoO) {
            this.f17554OoooOoO = typeface;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f17571o00oO0o;
            boolean zOooOOO0 = oooO0OO.OooOOO0(typeface);
            boolean zOooOOOO = oooO0OO.OooOOOO(typeface);
            if (zOooOOO0 || zOooOOOO) {
                oooO0OO.OooO(false);
            }
            oo000o oo000oVar = this.f17517OooOOO0;
            if (typeface != oo000oVar.f17678OooOoo0) {
                oo000oVar.f17678OooOoo0 = typeface;
                AppCompatTextView appCompatTextView = oo000oVar.f17667OooOOo;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = oo000oVar.f17676OooOoO0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f17520OooOOo;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.textInputStyle);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f17510OooO0o0.OooO00o(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17506o0Oo0oo;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17507OooO = -1;
        this.f17513OooOO0 = -1;
        this.f17514OooOO0O = -1;
        this.f17515OooOO0o = -1;
        this.f17517OooOOO0 = new oo000o(this);
        this.f17521OooOOo0 = new androidx.compose.foundation.OooO00o();
        this.f17551OoooOOO = new Rect();
        this.f17552OoooOOo = new Rect();
        this.f17553OoooOo0 = new RectF();
        this.f17557Ooooo0o = new LinkedHashSet<>();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f17571o00oO0o = oooO0OO;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17508OooO0Oo = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
        oooO0OO.f16782OoooOOO = linearInterpolator;
        oooO0OO.OooO(false);
        oooO0OO.f16796o000oOoO = linearInterpolator;
        oooO0OO.OooO(false);
        oooO0OO.OooOO0o(8388659);
        int[] iArr = o000OO.TextInputLayout;
        int i3 = o000OO.TextInputLayout_counterTextAppearance;
        int i4 = o000OO.TextInputLayout_counterOverflowTextAppearance;
        int i5 = o000OO.TextInputLayout_errorTextAppearance;
        int i6 = o000OO.TextInputLayout_helperTextTextAppearance;
        int i7 = o000OO.TextInputLayout_hintTextAppearance;
        o000Oo0 o000oo0OooO0o0 = com.google.android.material.internal.o00oO0o.OooO0o0(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        o0OO00O o0oo00o2 = new o0OO00O(this, o000oo0OooO0o0);
        this.f17510OooO0o0 = o0oo00o2;
        this.f17533OooOooO = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_hintEnabled, true);
        setHint(o000oo0OooO0o0.OooOO0O(o000OO.TextInputLayout_android_hint));
        this.f17575o0ooOO0 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_hintAnimationEnabled, true);
        this.f17570o00oO0O = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_expandedHintEnabled, true);
        int i8 = o000OO.TextInputLayout_android_minEms;
        if (o000oo0OooO0o0.OooOO0o(i8)) {
            setMinEms(o000oo0OooO0o0.OooO0oo(i8, -1));
        } else {
            int i9 = o000OO.TextInputLayout_android_minWidth;
            if (o000oo0OooO0o0.OooOO0o(i9)) {
                setMinWidth(o000oo0OooO0o0.OooO0Oo(i9, -1));
            }
        }
        int i10 = o000OO.TextInputLayout_android_maxEms;
        if (o000oo0OooO0o0.OooOO0o(i10)) {
            setMaxEms(o000oo0OooO0o0.OooO0oo(i10, -1));
        } else {
            int i11 = o000OO.TextInputLayout_android_maxWidth;
            if (o000oo0OooO0o0.OooOO0o(i11)) {
                setMaxWidth(o000oo0OooO0o0.OooO0Oo(i11, -1));
            }
        }
        this.f17542Oooo0o = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, i, i2));
        this.f17545Oooo0oo = context2.getResources().getDimensionPixelOffset(o00000O.mtrl_textinput_box_label_cutout_padding);
        this.f17548OoooO00 = o000oo0OooO0o0.OooO0OO(o000OO.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f17549OoooO0O = o000oo0OooO0o0.OooO0Oo(o000OO.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(o00000O.mtrl_textinput_box_stroke_width_default));
        this.f17546OoooO = o000oo0OooO0o0.OooO0Oo(o000OO.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(o00000O.mtrl_textinput_box_stroke_width_focused));
        this.f17547OoooO0 = this.f17549OoooO0O;
        int i12 = o000OO.TextInputLayout_boxCornerRadiusTopStart;
        TypedArray typedArray = o000oo0OooO0o0.f3324OooO0O0;
        float dimension = typedArray.getDimension(i12, -1.0f);
        float dimension2 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17542Oooo0o;
        oooO0O0.getClass();
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
        if (dimension >= 0.0f) {
            oooO00o.OooO0o0(dimension);
        }
        if (dimension2 >= 0.0f) {
            oooO00o.OooO0o(dimension2);
        }
        if (dimension3 >= 0.0f) {
            oooO00o.OooO0Oo(dimension3);
        }
        if (dimension4 >= 0.0f) {
            oooO00o.OooO0OO(dimension4);
        }
        this.f17542Oooo0o = new com.google.android.material.shape.OooO0O0(oooO00o);
        ColorStateList colorStateListOooO0O0 = p276o0O00OoO.OooO0o.OooO0O0(context2, o000oo0OooO0o0, o000OO.TextInputLayout_boxBackgroundColor);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.f17566o00O0O = defaultColor;
            this.f17565o000oOoO = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.f17567o00Oo0 = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.f17568o00Ooo = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f17569o00o0O = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17568o00Ooo = this.f17566o00O0O;
                ColorStateList colorStateListOooO0O1 = ContextCompat.OooO0O0(o00000O0.mtrl_filled_background_color, context2);
                this.f17567o00Oo0 = colorStateListOooO0O1.getColorForState(new int[]{-16842910}, -1);
                this.f17569o00o0O = colorStateListOooO0O1.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f17565o000oOoO = 0;
            this.f17566o00O0O = 0;
            this.f17567o00Oo0 = 0;
            this.f17568o00Ooo = 0;
            this.f17569o00o0O = 0;
        }
        int i13 = o000OO.TextInputLayout_android_textColorHint;
        if (o000oo0OooO0o0.OooOO0o(i13)) {
            ColorStateList colorStateListOooO0O2 = o000oo0OooO0o0.OooO0O0(i13);
            this.f17561Oooooo = colorStateListOooO0O2;
            this.f17562Oooooo0 = colorStateListOooO0O2;
        }
        int i14 = o000OO.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListOooO0O3 = p276o0O00OoO.OooO0o.OooO0O0(context2, o000oo0OooO0o0, i14);
        this.f17574o0OoOo0 = typedArray.getColor(i14, 0);
        int i15 = o00000O0.mtrl_textinput_default_box_stroke_color;
        Object obj = ContextCompat.f5281OooO00o;
        this.f17563OoooooO = ContextCompat.OooO0o.OooO00o(context2, i15);
        this.f17572o00ooo = ContextCompat.OooO0o.OooO00o(context2, o00000O0.mtrl_textinput_disabled_color);
        this.f17564Ooooooo = ContextCompat.OooO0o.OooO00o(context2, o00000O0.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O3 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O3);
        }
        int i16 = o000OO.TextInputLayout_boxStrokeErrorColor;
        if (o000oo0OooO0o0.OooOO0o(i16)) {
            setBoxStrokeErrorColor(p276o0O00OoO.OooO0o.OooO0O0(context2, o000oo0OooO0o0, i16));
        }
        if (o000oo0OooO0o0.OooO(i7, -1) != -1) {
            setHintTextAppearance(o000oo0OooO0o0.OooO(i7, 0));
        }
        int iOooO = o000oo0OooO0o0.OooO(i5, 0);
        CharSequence charSequenceOooOO0O = o000oo0OooO0o0.OooOO0O(o000OO.TextInputLayout_errorContentDescription);
        int iOooO0oo = o000oo0OooO0o0.OooO0oo(o000OO.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zOooO00o = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_errorEnabled, false);
        int iOooO2 = o000oo0OooO0o0.OooO(i6, 0);
        boolean zOooO00o2 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceOooOO0O2 = o000oo0OooO0o0.OooOO0O(o000OO.TextInputLayout_helperText);
        int iOooO3 = o000oo0OooO0o0.OooO(o000OO.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceOooOO0O3 = o000oo0OooO0o0.OooOO0O(o000OO.TextInputLayout_placeholderText);
        boolean zOooO00o3 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(o000oo0OooO0o0.OooO0oo(o000OO.TextInputLayout_counterMaxLength, -1));
        this.f17525OooOo00 = o000oo0OooO0o0.OooO(i3, 0);
        this.f17522OooOOoo = o000oo0OooO0o0.OooO(i4, 0);
        setBoxBackgroundMode(o000oo0OooO0o0.OooO0oo(o000OO.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceOooOO0O);
        setErrorAccessibilityLiveRegion(iOooO0oo);
        setCounterOverflowTextAppearance(this.f17522OooOOoo);
        setHelperTextTextAppearance(iOooO2);
        setErrorTextAppearance(iOooO);
        setCounterTextAppearance(this.f17525OooOo00);
        setPlaceholderText(charSequenceOooOO0O3);
        setPlaceholderTextAppearance(iOooO3);
        int i17 = o000OO.TextInputLayout_errorTextColor;
        if (o000oo0OooO0o0.OooOO0o(i17)) {
            setErrorTextColor(o000oo0OooO0o0.OooO0O0(i17));
        }
        int i18 = o000OO.TextInputLayout_helperTextTextColor;
        if (o000oo0OooO0o0.OooOO0o(i18)) {
            setHelperTextColor(o000oo0OooO0o0.OooO0O0(i18));
        }
        int i19 = o000OO.TextInputLayout_hintTextColor;
        if (o000oo0OooO0o0.OooOO0o(i19)) {
            setHintTextColor(o000oo0OooO0o0.OooO0O0(i19));
        }
        int i20 = o000OO.TextInputLayout_counterTextColor;
        if (o000oo0OooO0o0.OooOO0o(i20)) {
            setCounterTextColor(o000oo0OooO0o0.OooO0O0(i20));
        }
        int i21 = o000OO.TextInputLayout_counterOverflowTextColor;
        if (o000oo0OooO0o0.OooOO0o(i21)) {
            setCounterOverflowTextColor(o000oo0OooO0o0.OooO0O0(i21));
        }
        int i22 = o000OO.TextInputLayout_placeholderTextColor;
        if (o000oo0OooO0o0.OooOO0o(i22)) {
            setPlaceholderTextColor(o000oo0OooO0o0.OooO0O0(i22));
        }
        o00O0O o00o0o2 = new o00O0O(this, o000oo0OooO0o0);
        this.f17509OooO0o = o00o0o2;
        boolean zOooO00o4 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_android_enabled, true);
        o000oo0OooO0o0.OooOOO();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 2);
        int i23 = Build.VERSION.SDK_INT;
        if (i23 >= 26 && i23 >= 26) {
            ViewCompat.OooOo.OooOOO0(this, 1);
        }
        frameLayout.addView(o0oo00o2);
        frameLayout.addView(o00o0o2);
        addView(frameLayout);
        setEnabled(zOooO00o4);
        setHelperTextEnabled(zOooO00o2);
        setErrorEnabled(zOooO00o);
        setCounterEnabled(zOooO00o3);
        setHelperText(charSequenceOooOO0O2);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f17509OooO0o.f17594OooOO0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f17509OooO0o.f17594OooOO0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f17509OooO0o.OooO0oo(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f17509OooO0o.f17594OooOO0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        o00O0O o00o0o2 = this.f17509OooO0o;
        CheckableImageButton checkableImageButton = o00o0o2.f17594OooOO0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = o00o0o2.f17597OooOOO;
            PorterDuff.Mode mode = o00o0o2.f17599OooOOOO;
            TextInputLayout textInputLayout = o00o0o2.f17589OooO0Oo;
            o00Ooo.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            o00Ooo.OooO0OO(textInputLayout, checkableImageButton, o00o0o2.f17597OooOOO);
        }
    }
}
