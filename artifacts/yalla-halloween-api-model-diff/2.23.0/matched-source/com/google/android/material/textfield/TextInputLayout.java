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
import androidx.core.view.o000O0Oo;
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
import p198o00o0OoO.o00O0OO0;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o00000O0;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.b1;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17982OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00Ooo f17984OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o0O0O00 f17985OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public EditText f17986OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CharSequence f17987OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17988OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17989OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17990OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f17991OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0ooOOo f17992OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f17993OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f17994OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17995OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public OooOO0 f17996OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17997OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17998OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public CharSequence f17999OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f18000OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f18001OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AppCompatTextView f18002OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Fade f18003OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f18004OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Fade f18005OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f18006OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f18007OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f18008OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public CharSequence f18009OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f18010Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public StateListDrawable f18011Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f18012Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18013Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public MaterialShapeDrawable f18014Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f18015Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18016Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO0O0 f18017Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18018Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f18019Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f18020Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f18021OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f18022OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f18023OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f18024OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @ColorInt
    public int f18025OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Rect f18026OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Rect f18027OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final RectF f18028OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Typeface f18029OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ColorDrawable f18030OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f18031Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final LinkedHashSet<OooOO0O> f18032Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorDrawable f18033OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f18034OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public Drawable f18035OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ColorStateList f18036Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ColorStateList f18037Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @ColorInt
    public int f18038OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @ColorInt
    public int f18039Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @ColorInt
    public int f18040o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @ColorInt
    public int f18041o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @ColorInt
    public int f18042o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @ColorInt
    public int f18043o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @ColorInt
    public int f18044o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f18045o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0OO f18046o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @ColorInt
    public int f18047o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f18048o0OOO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @ColorInt
    public int f18049o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f18050o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ValueAnimator f18051o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f18052o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f18053oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ColorStateList f18054ooOO;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public static final int f17981o0Oo0oo = o0000O0O.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public static final int[][] f17980o0OO00O = {new int[]{R.attr.state_pressed}, new int[0]};

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public static class OooO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextInputLayout f18055OooO00o;

        public OooO(@NonNull TextInputLayout textInputLayout) {
            this.f18055OooO00o = textInputLayout;
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            TextInputLayout textInputLayout = this.f18055OooO00o;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !textInputLayout.f18053oo000o;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            o0O0O00 o0o0o00 = textInputLayout.f17985OooO0o0;
            AppCompatTextView appCompatTextView = o0o0o00.f18110OooO0o0;
            if (appCompatTextView.getVisibility() == 0) {
                o0oo0oo2.f34022OooO00o.setLabelFor(appCompatTextView);
                o0oo0oo2.f34022OooO00o.setTraversalAfter(appCompatTextView);
            } else {
                o0oo0oo2.f34022OooO00o.setTraversalAfter(o0o0o00.f18111OooO0oO);
            }
            if (z) {
                o0oo0oo2.OooOOo0(text);
            } else if (!TextUtils.isEmpty(string)) {
                o0oo0oo2.OooOOo0(string);
                if (z3 && placeholderText != null) {
                    o0oo0oo2.OooOOo0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                o0oo0oo2.OooOOo0(placeholderText);
            }
            boolean zIsEmpty = TextUtils.isEmpty(string);
            AccessibilityNodeInfo accessibilityNodeInfo = o0oo0oo2.f34022OooO00o;
            if (!zIsEmpty) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    o0oo0oo2.OooOOO(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    o0oo0oo2.OooOOo0(string);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z6);
                } else {
                    o0oo0oo2.OooO0oo(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            AccessibilityNodeInfo accessibilityNodeInfo2 = o0oo0oo2.f34022OooO00o;
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo2.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.f17992OooOOO0.f18145OooOoO0;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo2.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f17984OooO0o.OooO0O0().OooOOO(o0oo0oo2);
        }

        @Override // androidx.core.view.OooO00o
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f18055OooO00o.f17984OooO0o.OooO0O0().OooOOOO(accessibilityEvent);
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.OooOo00(!textInputLayout.f18048o0OOO0o, false);
            if (textInputLayout.f17991OooOOO) {
                textInputLayout.OooOOO(editable);
            }
            if (textInputLayout.f18001OooOo0O) {
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
            CheckableImageButton checkableImageButton = TextInputLayout.this.f17984OooO0o.f18084OooOO0;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f17986OooO0oO.requestLayout();
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f18046o00oO0o.OooOOOo(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
        public CharSequence f18060OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f18061OooO0oO;

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
            this.f18060OooO0o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18061OooO0oO = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f18060OooO0o) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            TextUtils.writeToParcel(this.f18060OooO0o, parcel, i);
            parcel.writeInt(this.f18061OooO0oO ? 1 : 0);
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
        EditText editText = this.f17986OooO0oO;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int iOooO0OO = p272o0O000oo.OooOOO.OooO0OO(o00000.colorControlHighlight, this.f17986OooO0oO);
                int i = this.f18010Oooo;
                int[][] iArr = f17980o0OO00O;
                if (i != 2) {
                    if (i != 1) {
                        return null;
                    }
                    MaterialShapeDrawable materialShapeDrawable = this.f18013Oooo00O;
                    int i2 = this.f18040o000oOoO;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{p272o0O000oo.OooOOO.OooO0o0(iOooO0OO, 0.1f, i2), i2}), materialShapeDrawable, materialShapeDrawable);
                }
                Context context = getContext();
                MaterialShapeDrawable materialShapeDrawable2 = this.f18013Oooo00O;
                TypedValue typedValueOooO0OO = b1.OooO0OO(o00000.colorSurface, context, "TextInputLayout");
                int i3 = typedValueOooO0OO.resourceId;
                if (i3 != 0) {
                    Object obj = ContextCompat.f5271OooO00o;
                    iOooO00o = ContextCompat.OooO0o.OooO00o(context, i3);
                } else {
                    iOooO00o = typedValueOooO0OO.data;
                }
                MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.f17582OooO0Oo.f17605OooO00o);
                int iOooO0o0 = p272o0O000oo.OooOOO.OooO0o0(iOooO0OO, 0.1f, iOooO00o);
                materialShapeDrawable3.OooOOO(new ColorStateList(iArr, new int[]{iOooO0o0, 0}));
                materialShapeDrawable3.setTint(iOooO00o);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iOooO0o0, iOooO00o});
                MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.f17582OooO0Oo.f17605OooO00o);
                materialShapeDrawable4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
            }
        }
        return this.f18013Oooo00O;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f18011Oooo0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f18011Oooo0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f18011Oooo0.addState(new int[0], OooO0o(false));
        }
        return this.f18011Oooo0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f18014Oooo00o == null) {
            this.f18014Oooo00o = OooO0o(true);
        }
        return this.f18014Oooo00o;
    }

    private void setEditText(EditText editText) {
        if (this.f17986OooO0oO != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17986OooO0oO = editText;
        int i = this.f17982OooO;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f17989OooOO0O);
        }
        int i2 = this.f17988OooOO0;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f17990OooOO0o);
        }
        this.f18015Oooo0O0 = false;
        OooO();
        setTextInputAccessibilityDelegate(new OooO(this));
        Typeface typeface = this.f17986OooO0oO.getTypeface();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        boolean zOooOOO0 = oooO0OO.OooOOO0(typeface);
        boolean zOooOOOO = oooO0OO.OooOOOO(typeface);
        if (zOooOOO0 || zOooOOOO) {
            oooO0OO.OooO(false);
        }
        float textSize = this.f17986OooO0oO.getTextSize();
        if (oooO0OO.f17219OooOO0o != textSize) {
            oooO0OO.f17219OooOO0o = textSize;
            oooO0OO.OooO(false);
        }
        float letterSpacing = this.f17986OooO0oO.getLetterSpacing();
        if (oooO0OO.f17266Oooooo0 != letterSpacing) {
            oooO0OO.f17266Oooooo0 = letterSpacing;
            oooO0OO.OooO(false);
        }
        int gravity = this.f17986OooO0oO.getGravity();
        oooO0OO.OooOO0o((gravity & (-113)) | 48);
        if (oooO0OO.f17217OooOO0 != gravity) {
            oooO0OO.f17217OooOO0 = gravity;
            oooO0OO.OooO(false);
        }
        this.f17986OooO0oO.addTextChangedListener(new OooO00o());
        if (this.f18037Oooooo0 == null) {
            this.f18037Oooooo0 = this.f17986OooO0oO.getHintTextColors();
        }
        if (this.f18008OooOooO) {
            if (TextUtils.isEmpty(this.f18009OooOooo)) {
                CharSequence hint = this.f17986OooO0oO.getHint();
                this.f17987OooO0oo = hint;
                setHint(hint);
                this.f17986OooO0oO.setHint((CharSequence) null);
            }
            this.f18012Oooo000 = true;
        }
        if (this.f17995OooOOo != null) {
            OooOOO(this.f17986OooO0oO.getText());
        }
        OooOOo0();
        this.f17992OooOOO0.OooO0O0();
        this.f17985OooO0o0.bringToFront();
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.bringToFront();
        Iterator<OooOO0O> it = this.f18032Ooooo0o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this);
        }
        o00ooo2.OooOO0o();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        OooOo00(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f18009OooOooo)) {
            return;
        }
        this.f18009OooOooo = charSequence;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        if (charSequence == null || !TextUtils.equals(oooO0OO.f17242Oooo00O, charSequence)) {
            oooO0OO.f17242Oooo00O = charSequence;
            oooO0OO.f17243Oooo00o = null;
            Bitmap bitmap = oooO0OO.f17245Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooO0OO.f17245Oooo0OO = null;
            }
            oooO0OO.OooO(false);
        }
        if (this.f18053oo000o) {
            return;
        }
        OooOO0();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f18001OooOo0O == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.f18002OooOo0o;
            if (appCompatTextView != null) {
                this.f17983OooO0Oo.addView(appCompatTextView);
                this.f18002OooOo0o.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f18002OooOo0o;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f18002OooOo0o = null;
        }
        this.f18001OooOo0O = z;
    }

    public final void OooO() {
        int i = this.f18010Oooo;
        if (i == 0) {
            this.f18013Oooo00O = null;
            this.f18016Oooo0OO = null;
            this.f18018Oooo0o0 = null;
        } else if (i == 1) {
            this.f18013Oooo00O = new MaterialShapeDrawable(this.f18017Oooo0o);
            this.f18016Oooo0OO = new MaterialShapeDrawable();
            this.f18018Oooo0o0 = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO0O0(new StringBuilder(), this.f18010Oooo, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f18008OooOooO || (this.f18013Oooo00O instanceof OooOOO)) {
                this.f18013Oooo00O = new MaterialShapeDrawable(this.f18017Oooo0o);
            } else {
                com.google.android.material.shape.OooO0O0 oooO0O0 = this.f18017Oooo0o;
                int i2 = OooOOO.f17970OooOoo0;
                if (oooO0O0 == null) {
                    oooO0O0 = new com.google.android.material.shape.OooO0O0();
                }
                this.f18013Oooo00O = new OooOOO.OooO0O0(new OooOOO.OooO00o(oooO0O0, new RectF()));
            }
            this.f18016Oooo0OO = null;
            this.f18018Oooo0o0 = null;
        }
        OooOOo();
        OooOo0o();
        if (this.f18010Oooo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f18023OoooO00 = getResources().getDimensionPixelSize(o00000O.material_font_2_0_box_collapsed_padding_top);
            } else if (c1.OooO0o0(getContext())) {
                this.f18023OoooO00 = getResources().getDimensionPixelSize(o00000O.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f17986OooO0oO != null && this.f18010Oooo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f17986OooO0oO;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO.OooOO0O(editText, ViewCompat.OooO.OooO0o(editText), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_2_0_padding_top), ViewCompat.OooO.OooO0o0(this.f17986OooO0oO), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_2_0_padding_bottom));
            } else if (c1.OooO0o0(getContext())) {
                EditText editText2 = this.f17986OooO0oO;
                WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                ViewCompat.OooO.OooOO0O(editText2, ViewCompat.OooO.OooO0o(editText2), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_1_3_padding_top), ViewCompat.OooO.OooO0o0(this.f17986OooO0oO), getResources().getDimensionPixelSize(o00000O.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f18010Oooo != 0) {
            OooOOoo();
        }
        EditText editText3 = this.f17986OooO0oO;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f18010Oooo;
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
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        if (oooO0OO.f17210OooO0O0 == f) {
            return;
        }
        if (this.f18051o0ooOOo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18051o0ooOOo = valueAnimator;
            valueAnimator.setInterpolator(o0O00OO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f41572OooO0O0));
            this.f18051o0ooOOo.setDuration(o0O00OO.OooO00o.OooO0OO(o00000.motionDurationMedium4, getContext(), 167));
            this.f18051o0ooOOo.addUpdateListener(new OooO0o());
        }
        this.f18051o0ooOOo.setFloatValues(oooO0OO.f17210OooO0O0, f);
        this.f18051o0ooOOo.start();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    public final void OooO0O0() {
        boolean z;
        MaterialShapeDrawable materialShapeDrawable = this.f18013Oooo00O;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.OooO0O0 oooO0O0 = materialShapeDrawable.f17582OooO0Oo.f17605OooO00o;
        com.google.android.material.shape.OooO0O0 oooO0O1 = this.f18017Oooo0o;
        if (oooO0O0 != oooO0O1) {
            materialShapeDrawable.setShapeAppearanceModel(oooO0O1);
        }
        boolean z2 = false;
        if (this.f18010Oooo != 2) {
            z = false;
        } else {
            if (this.f18022OoooO0 > -1 && this.f18025OoooOO0 != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            MaterialShapeDrawable materialShapeDrawable2 = this.f18013Oooo00O;
            float f = this.f18022OoooO0;
            int i = this.f18025OoooOO0;
            materialShapeDrawable2.OooOo00(f);
            materialShapeDrawable2.OooOOoo(ColorStateList.valueOf(i));
        }
        int iOooO0OO = this.f18040o000oOoO;
        if (this.f18010Oooo == 1) {
            iOooO0OO = p052o00000oO.OooOO0.OooO0OO(this.f18040o000oOoO, p272o0O000oo.OooOOO.OooO0O0(o00000.colorSurface, getContext(), 0));
        }
        this.f18040o000oOoO = iOooO0OO;
        this.f18013Oooo00O.OooOOO(ColorStateList.valueOf(iOooO0OO));
        MaterialShapeDrawable materialShapeDrawable3 = this.f18016Oooo0OO;
        if (materialShapeDrawable3 != null && this.f18018Oooo0o0 != null) {
            if (this.f18022OoooO0 > -1 && this.f18025OoooOO0 != 0) {
                z2 = true;
            }
            if (z2) {
                materialShapeDrawable3.OooOOO(this.f17986OooO0oO.isFocused() ? ColorStateList.valueOf(this.f18038OoooooO) : ColorStateList.valueOf(this.f18025OoooOO0));
                this.f18018Oooo0o0.OooOOO(ColorStateList.valueOf(this.f18025OoooOO0));
            }
            invalidate();
        }
        OooOOo();
    }

    public final int OooO0OO() {
        float fOooO0o0;
        if (!this.f18008OooOooO) {
            return 0;
        }
        int i = this.f18010Oooo;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
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
        fade.f8208OooO0o = o0O00OO.OooO00o.OooO0OO(o00000.motionDurationShort2, getContext(), 87);
        fade.f8210OooO0oO = o0O00OO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f41571OooO00o);
        return fade;
    }

    public final MaterialShapeDrawable OooO0o(boolean z) {
        int iOooO00o;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(o00000O.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f17986OooO0oO;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(o00000O.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(o00000O.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
        oooO00o.OooO0o0(f);
        oooO00o.OooO0o(f);
        oooO00o.OooO0OO(dimensionPixelOffset);
        oooO00o.OooO0Oo(dimensionPixelOffset);
        com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(oooO00o);
        Context context = getContext();
        Paint paint = MaterialShapeDrawable.f17580OooOoO;
        TypedValue typedValueOooO0OO = b1.OooO0OO(o00000.colorSurface, context, MaterialShapeDrawable.class.getSimpleName());
        int i = typedValueOooO0OO.resourceId;
        if (i != 0) {
            Object obj = ContextCompat.f5271OooO00o;
            iOooO00o = ContextCompat.OooO0o.OooO00o(context, i);
        } else {
            iOooO00o = typedValueOooO0OO.data;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.OooOO0O(context);
        materialShapeDrawable.OooOOO(ColorStateList.valueOf(iOooO00o));
        materialShapeDrawable.OooOOO0(popupElevation);
        materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        MaterialShapeDrawable.OooO0O0 oooO0O1 = materialShapeDrawable.f17582OooO0Oo;
        if (oooO0O1.f17612OooO0oo == null) {
            oooO0O1.f17612OooO0oo = new Rect();
        }
        materialShapeDrawable.f17582OooO0Oo.f17612OooO0oo.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final boolean OooO0o0() {
        return this.f18008OooOooO && !TextUtils.isEmpty(this.f18009OooOooo) && (this.f18013Oooo00O instanceof OooOOO);
    }

    public final int OooO0oO(int i, boolean z) {
        int compoundPaddingLeft = this.f17986OooO0oO.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int OooO0oo(int i, boolean z) {
        int compoundPaddingRight = i - this.f17986OooO0oO.getCompoundPaddingRight();
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
            int width = this.f17986OooO0oO.getWidth();
            int gravity = this.f17986OooO0oO.getGravity();
            com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
            boolean zOooO0O0 = oooO0OO.OooO0O0(oooO0OO.f17242Oooo00O);
            oooO0OO.f17240Oooo0 = zOooO0O0;
            Rect rect = oooO0OO.f17216OooO0oo;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zOooO0O0) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = oooO0OO.f17268Ooooooo;
                    }
                } else if (zOooO0O0) {
                    f = rect.right;
                    f2 = oooO0OO.f17268Ooooooo;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f18028OoooOo0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (oooO0OO.f17268Ooooooo / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (oooO0OO.f17240Oooo0) {
                        f4 = oooO0OO.f17268Ooooooo + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (oooO0OO.f17240Oooo0) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f4 = oooO0OO.f17268Ooooooo + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = oooO0OO.OooO0o0() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.f18020Oooo0oo;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18022OoooO0);
                OooOOO oooOOO = (OooOOO) this.f18013Oooo00O;
                oooOOO.getClass();
                oooOOO.OooOo(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = oooO0OO.f17268Ooooooo / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f18028OoooOo0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (oooO0OO.f17268Ooooooo / 2.0f);
            } else {
                f4 = (width / 2.0f) + (oooO0OO.f17268Ooooooo / 2.0f);
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
            Object obj = ContextCompat.f5271OooO00o;
            textView.setTextColor(ContextCompat.OooO0o.OooO00o(context, i2));
        }
    }

    public final void OooOOO(@Nullable Editable editable) {
        ((o00O0OO0) this.f17996OooOOo0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f17994OooOOOo;
        int i = this.f17993OooOOOO;
        String string = null;
        if (i == -1) {
            this.f17995OooOOo.setText(String.valueOf(length));
            this.f17995OooOOo.setContentDescription(null);
            this.f17994OooOOOo = false;
        } else {
            this.f17994OooOOOo = length > i;
            Context context = getContext();
            this.f17995OooOOo.setContentDescription(context.getString(this.f17994OooOOOo ? o0000O0.character_counter_overflowed_content_description : o0000O0.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f17993OooOOOO)));
            if (z != this.f17994OooOOOo) {
                OooOOOO();
            }
            String str = o0000O0O.OooO00o.f34090OooO0Oo;
            Locale locale = Locale.getDefault();
            int i2 = o0000O0O.oo000o.f34114OooO00o;
            o0000O0O.OooO00o oooO00o = o0000O0O.oo000o.OooO00o.OooO00o(locale) == 1 ? o0000O0O.OooO00o.f34093OooO0oO : o0000O0O.OooO00o.f34091OooO0o;
            AppCompatTextView appCompatTextView = this.f17995OooOOo;
            String string2 = getContext().getString(o0000O0.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f17993OooOOOO));
            if (string2 == null) {
                oooO00o.getClass();
            } else {
                string = oooO00o.OooO0OO(string2, oooO00o.f34096OooO0OO).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f17986OooO0oO == null || z == this.f17994OooOOOo) {
            return;
        }
        OooOo00(false, false);
        OooOo0o();
        OooOOo0();
    }

    public final boolean OooOOO0() {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        return (o0ooooo.f18134OooOOOO != 1 || o0ooooo.f18136OooOOo == null || TextUtils.isEmpty(o0ooooo.f18135OooOOOo)) ? false : true;
    }

    public final void OooOOOO() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f17995OooOOo;
        if (appCompatTextView != null) {
            OooOO0o(appCompatTextView, this.f17994OooOOOo ? this.f17997OooOOoo : this.f18000OooOo00);
            if (!this.f17994OooOOOo && (colorStateList2 = this.f18007OooOoo0) != null) {
                this.f17995OooOOo.setTextColor(colorStateList2);
            }
            if (!this.f17994OooOOOo || (colorStateList = this.f18006OooOoo) == null) {
                return;
            }
            this.f17995OooOOo.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    public final boolean OooOOOo() {
        boolean z;
        boolean z2;
        if (this.f17986OooO0oO == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        boolean z3 = true;
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        CheckableImageButton checkableImageButton = null;
        if ((startIconDrawable != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && o0o0o00.getMeasuredWidth() > 0) {
            int measuredWidth = o0o0o00.getMeasuredWidth() - this.f17986OooO0oO.getPaddingLeft();
            if (this.f18030OoooOoo == null || this.f18031Ooooo00 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f18030OoooOoo = colorDrawable;
                this.f18031Ooooo00 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this.f17986OooO0oO);
            Drawable drawable = drawableArrOooO00o[0];
            ColorDrawable colorDrawable2 = this.f18030OoooOoo;
            if (drawable != colorDrawable2) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17986OooO0oO, colorDrawable2, drawableArrOooO00o[1], drawableArrOooO00o[2], drawableArrOooO00o[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f18030OoooOoo != null) {
            Drawable[] drawableArrOooO00o2 = TextViewCompat.OooO0O0.OooO00o(this.f17986OooO0oO);
            TextViewCompat.OooO0O0.OooO0o0(this.f17986OooO0oO, null, drawableArrOooO00o2[1], drawableArrOooO00o2[2], drawableArrOooO00o2[3]);
            this.f18030OoooOoo = null;
            z = true;
        } else {
            z = false;
        }
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (!o00ooo2.OooO0Oo()) {
            if (!((o00ooo2.f18086OooOO0o != 0) && o00ooo2.OooO0OO()) && o00ooo2.f18093OooOOoo == null) {
                z2 = false;
            } else if (o00ooo2.getMeasuredWidth() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (o00ooo2.getMeasuredWidth() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int measuredWidth2 = o00ooo2.f18096OooOo00.getMeasuredWidth() - this.f17986OooO0oO.getPaddingRight();
            if (o00ooo2.OooO0Oo()) {
                checkableImageButton = o00ooo2.f18080OooO0o;
            } else {
                if ((o00ooo2.f18086OooOO0o != 0) && o00ooo2.OooO0OO()) {
                    checkableImageButton = o00ooo2.f18084OooOO0;
                }
            }
            if (checkableImageButton != null) {
                measuredWidth2 = androidx.core.view.o00O0O.OooO0OO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrOooO00o3 = TextViewCompat.OooO0O0.OooO00o(this.f17986OooO0oO);
            ColorDrawable colorDrawable3 = this.f18033OooooO0;
            if (colorDrawable3 == null || this.f18034OooooOO == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f18033OooooO0 = colorDrawable4;
                    this.f18034OooooOO = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrOooO00o3[2];
                ColorDrawable colorDrawable5 = this.f18033OooooO0;
                if (drawable2 != colorDrawable5) {
                    this.f18035OooooOo = drawable2;
                    TextViewCompat.OooO0O0.OooO0o0(this.f17986OooO0oO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], colorDrawable5, drawableArrOooO00o3[3]);
                } else {
                    z3 = z;
                }
            } else {
                this.f18034OooooOO = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.OooO0O0.OooO0o0(this.f17986OooO0oO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], this.f18033OooooO0, drawableArrOooO00o3[3]);
            }
        } else {
            if (this.f18033OooooO0 == null) {
                return z;
            }
            Drawable[] drawableArrOooO00o4 = TextViewCompat.OooO0O0.OooO00o(this.f17986OooO0oO);
            if (drawableArrOooO00o4[2] == this.f18033OooooO0) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17986OooO0oO, drawableArrOooO00o4[0], drawableArrOooO00o4[1], this.f18035OooooOo, drawableArrOooO00o4[3]);
            } else {
                z3 = z;
            }
            this.f18033OooooO0 = null;
        }
        return z3;
    }

    public final void OooOOo() {
        EditText editText = this.f17986OooO0oO;
        if (editText == null || this.f18013Oooo00O == null) {
            return;
        }
        if ((this.f18015Oooo0O0 || editText.getBackground() == null) && this.f18010Oooo != 0) {
            EditText editText2 = this.f17986OooO0oO;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(editText2, editTextBoxBackground);
            this.f18015Oooo0O0 = true;
        }
    }

    public final void OooOOo0() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f17986OooO0oO;
        if (editText == null || this.f18010Oooo != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = o000000.f3194OooO00o;
        Drawable drawableMutate = background.mutate();
        if (OooOOO0()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOOO0.OooO0OO(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17994OooOOOo && (appCompatTextView = this.f17995OooOOo) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOOO0.OooO0OO(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f17986OooO0oO.refreshDrawableState();
        }
    }

    public final void OooOOoo() {
        if (this.f18010Oooo != 1) {
            FrameLayout frameLayout = this.f17983OooO0Oo;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iOooO0OO = OooO0OO();
            if (iOooO0OO != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0OO;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOo0(@Nullable Editable editable) {
        ((o00O0OO0) this.f17996OooOOo0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f17983OooO0Oo;
        if (length != 0 || this.f18053oo000o) {
            AppCompatTextView appCompatTextView = this.f18002OooOo0o;
            if (appCompatTextView == null || !this.f18001OooOo0O) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            androidx.transition.OooOOO0.OooO00o(frameLayout, this.f18005OooOoOO);
            this.f18002OooOo0o.setVisibility(4);
            return;
        }
        if (this.f18002OooOo0o == null || !this.f18001OooOo0O || TextUtils.isEmpty(this.f17999OooOo0)) {
            return;
        }
        this.f18002OooOo0o.setText(this.f17999OooOo0);
        androidx.transition.OooOOO0.OooO00o(frameLayout, this.f18003OooOoO);
        this.f18002OooOo0o.setVisibility(0);
        this.f18002OooOo0o.bringToFront();
        announceForAccessibility(this.f17999OooOo0);
    }

    public final void OooOo00(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17986OooO0oO;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17986OooO0oO;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f18037Oooooo0;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        if (colorStateList2 != null) {
            oooO0OO.OooOO0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f18037Oooooo0;
            oooO0OO.OooOO0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f18047o00ooo) : this.f18047o00ooo));
        } else if (OooOOO0()) {
            AppCompatTextView appCompatTextView2 = this.f17992OooOOO0.f18136OooOOo;
            oooO0OO.OooOO0(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f17994OooOOOo && (appCompatTextView = this.f17995OooOOo) != null) {
            oooO0OO.OooOO0(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f18036Oooooo) != null && oooO0OO.f17222OooOOOO != colorStateList) {
            oooO0OO.f17222OooOOOO = colorStateList;
            oooO0OO.OooO(false);
        }
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        if (z3 || !this.f18045o00oO0O || (isEnabled() && z4)) {
            if (z2 || this.f18053oo000o) {
                ValueAnimator valueAnimator = this.f18051o0ooOOo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f18051o0ooOOo.cancel();
                }
                if (z && this.f18050o0ooOO0) {
                    OooO00o(1.0f);
                } else {
                    oooO0OO.OooOOOo(1.0f);
                }
                this.f18053oo000o = false;
                if (OooO0o0()) {
                    OooOO0();
                }
                EditText editText3 = this.f17986OooO0oO;
                OooOo0(editText3 != null ? editText3.getText() : null);
                o0o0o00.f18116OooOOO0 = false;
                o0o0o00.OooO0Oo();
                o00ooo2.f18095OooOo0 = false;
                o00ooo2.OooOOO0();
                return;
            }
            return;
        }
        if (z2 || !this.f18053oo000o) {
            ValueAnimator valueAnimator2 = this.f18051o0ooOOo;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f18051o0ooOOo.cancel();
            }
            if (z && this.f18050o0ooOO0) {
                OooO00o(0.0f);
            } else {
                oooO0OO.OooOOOo(0.0f);
            }
            if (OooO0o0() && (!((OooOOO) this.f18013Oooo00O).f17971OooOoOO.f17972OooOo0O.isEmpty()) && OooO0o0()) {
                ((OooOOO) this.f18013Oooo00O).OooOo(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f18053oo000o = true;
            AppCompatTextView appCompatTextView3 = this.f18002OooOo0o;
            if (appCompatTextView3 != null && this.f18001OooOo0O) {
                appCompatTextView3.setText((CharSequence) null);
                androidx.transition.OooOOO0.OooO00o(this.f17983OooO0Oo, this.f18005OooOoOO);
                this.f18002OooOo0o.setVisibility(4);
            }
            o0o0o00.f18116OooOOO0 = true;
            o0o0o00.OooO0Oo();
            o00ooo2.f18095OooOo0 = true;
            o00ooo2.OooOOO0();
        }
    }

    public final void OooOo0O(boolean z, boolean z2) {
        int defaultColor = this.f18054ooOO.getDefaultColor();
        int colorForState = this.f18054ooOO.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f18054ooOO.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f18025OoooOO0 = colorForState2;
        } else if (z2) {
            this.f18025OoooOO0 = colorForState;
        } else {
            this.f18025OoooOO0 = defaultColor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    public final void OooOo0o() {
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateListValueOf;
        EditText editText;
        EditText editText2;
        if (this.f18013Oooo00O == null || this.f18010Oooo == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f17986OooO0oO) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f17986OooO0oO) != null && editText.isHovered());
        if (OooOOO0() || (this.f17995OooOOo != null && this.f17994OooOOOo)) {
            z = true;
        }
        if (!isEnabled()) {
            this.f18025OoooOO0 = this.f18047o00ooo;
        } else if (OooOOO0()) {
            if (this.f18054ooOO != null) {
                OooOo0O(z2, z3);
            } else {
                this.f18025OoooOO0 = getErrorCurrentTextColors();
            }
        } else if (!this.f17994OooOOOo || (appCompatTextView = this.f17995OooOOo) == null) {
            if (z2) {
                this.f18025OoooOO0 = this.f18049o0OoOo0;
            } else if (z3) {
                this.f18025OoooOO0 = this.f18039Ooooooo;
            } else {
                this.f18025OoooOO0 = this.f18038OoooooO;
            }
        } else if (this.f18054ooOO != null) {
            OooOo0O(z2, z3);
        } else {
            this.f18025OoooOO0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueOooO00o = b1.OooO00o(o00000.colorControlActivated, context);
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
            EditText editText3 = this.f17986OooO0oO;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f17986OooO0oO.getTextCursorDrawable();
                if (z) {
                    ColorStateList colorStateListValueOf2 = this.f18054ooOO;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.f18025OoooOO0);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                o00000oo.o00Ooo.OooO0O0.OooO0oo(textCursorDrawable, colorStateListValueOf);
            }
        }
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.OooOO0O();
        CheckableImageButton checkableImageButton = o00ooo2.f18080OooO0o;
        ColorStateList colorStateList = o00ooo2.f18082OooO0oO;
        TextInputLayout textInputLayout = o00ooo2.f18079OooO0Oo;
        o00oO0o.OooO0OO(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = o00ooo2.f18087OooOOO;
        CheckableImageButton checkableImageButton2 = o00ooo2.f18084OooOO0;
        o00oO0o.OooO0OO(textInputLayout, checkableImageButton2, colorStateList2);
        if (o00ooo2.OooO0O0() instanceof o00Oo0) {
            if (!textInputLayout.OooOOO0() || checkableImageButton2.getDrawable() == null) {
                o00oO0o.OooO00o(textInputLayout, checkableImageButton2, o00ooo2.f18087OooOOO, o00ooo2.f18089OooOOOO);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                o00000oo.o00Ooo.OooO0O0.OooO0oO(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        o00oO0o.OooO0OO(o0o0o00.f18108OooO0Oo, o0o0o00.f18111OooO0oO, o0o0o00.f18112OooO0oo);
        if (this.f18010Oooo == 2) {
            int i3 = this.f18022OoooO0;
            if (z2 && isEnabled()) {
                this.f18022OoooO0 = this.f18021OoooO;
            } else {
                this.f18022OoooO0 = this.f18024OoooO0O;
            }
            if (this.f18022OoooO0 != i3 && OooO0o0() && !this.f18053oo000o) {
                if (OooO0o0()) {
                    ((OooOOO) this.f18013Oooo00O).OooOo(0.0f, 0.0f, 0.0f, 0.0f);
                }
                OooOO0();
            }
        }
        if (this.f18010Oooo == 1) {
            if (!isEnabled()) {
                this.f18040o000oOoO = this.f18042o00Oo0;
            } else if (z3 && !z2) {
                this.f18040o000oOoO = this.f18044o00o0O;
            } else if (z2) {
                this.f18040o000oOoO = this.f18043o00Ooo;
            } else {
                this.f18040o000oOoO = this.f18041o00O0O;
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
        FrameLayout frameLayout = this.f17983OooO0Oo;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOOoo();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f17986OooO0oO;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f17987OooO0oo != null) {
            boolean z = this.f18012Oooo000;
            this.f18012Oooo000 = false;
            CharSequence hint = editText.getHint();
            this.f17986OooO0oO.setHint(this.f17987OooO0oo);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f17986OooO0oO.setHint(hint);
                this.f18012Oooo000 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f17983OooO0Oo;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f17986OooO0oO) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f18048o0OOO0o = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f18048o0OOO0o = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.f18008OooOooO;
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        if (z) {
            oooO0OO.OooO0Oo(canvas);
        }
        if (this.f18018Oooo0o0 == null || (materialShapeDrawable = this.f18016Oooo0OO) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f17986OooO0oO.isFocused()) {
            Rect bounds = this.f18018Oooo0o0.getBounds();
            Rect bounds2 = this.f18016Oooo0OO.getBounds();
            float f = oooO0OO.f17210OooO0O0;
            int iCenterX = bounds2.centerX();
            bounds.left = o0O000.OooO0O0.OooO0O0(iCenterX, bounds2.left, f);
            bounds.right = o0O000.OooO0O0.OooO0O0(iCenterX, bounds2.right, f);
            this.f18018Oooo0o0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f18052o0ooOoO) {
            return;
        }
        this.f18052o0ooOoO = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        boolean zOooOOo = oooO0OO != null ? oooO0OO.OooOOo(drawableState) | false : false;
        if (this.f17986OooO0oO != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            OooOo00(ViewCompat.OooOO0O.OooO0OO(this) && isEnabled(), false);
        }
        OooOOo0();
        OooOo0o();
        if (zOooOOo) {
            invalidate();
        }
        this.f18052o0ooOoO = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17986OooO0oO;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0OO() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f18010Oooo;
        if (i == 1 || i == 2) {
            return this.f18013Oooo00O;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f18040o000oOoO;
    }

    public int getBoxBackgroundMode() {
        return this.f18010Oooo;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18023OoooO00;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f18028OoooOo0;
        return zOooO0o ? this.f18017Oooo0o.f17635OooO0oo.OooO00o(rectF) : this.f18017Oooo0o.f17634OooO0oO.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f18028OoooOo0;
        return zOooO0o ? this.f18017Oooo0o.f17634OooO0oO.OooO00o(rectF) : this.f18017Oooo0o.f17635OooO0oo.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f18028OoooOo0;
        return zOooO0o ? this.f18017Oooo0o.f17633OooO0o0.OooO00o(rectF) : this.f18017Oooo0o.f17632OooO0o.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
        RectF rectF = this.f18028OoooOo0;
        return zOooO0o ? this.f18017Oooo0o.f17632OooO0o.OooO00o(rectF) : this.f18017Oooo0o.f17633OooO0o0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f18049o0OoOo0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f18054ooOO;
    }

    public int getBoxStrokeWidth() {
        return this.f18024OoooO0O;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f18021OoooO;
    }

    public int getCounterMaxLength() {
        return this.f17993OooOOOO;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f17991OooOOO && this.f17994OooOOOo && (appCompatTextView = this.f17995OooOOo) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f18006OooOoo;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f18007OooOoo0;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f18037Oooooo0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f17986OooO0oO;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f17984OooO0o.f18084OooOO0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f17984OooO0o.f18084OooOO0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f17984OooO0o.f18090OooOOOo;
    }

    public int getEndIconMode() {
        return this.f17984OooO0o.f18086OooOO0o;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f17984OooO0o.f18092OooOOo0;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f17984OooO0o.f18084OooOO0;
    }

    @Nullable
    public CharSequence getError() {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (o0ooooo.f18137OooOOo0) {
            return o0ooooo.f18135OooOOOo;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f17992OooOOO0.f18141OooOo00;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f17992OooOOO0.f18138OooOOoo;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f17992OooOOO0.f18136OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f17984OooO0o.f18080OooO0o.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (o0ooooo.f18139OooOo) {
            return o0ooooo.f18143OooOo0o;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f17992OooOOO0.f18145OooOoO0;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f18008OooOooO) {
            return this.f18009OooOooo;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f18046o00oO0o.OooO0o0();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        return oooO0OO.OooO0o(oooO0OO.f17222OooOOOO);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f18036Oooooo;
    }

    @NonNull
    public OooOO0 getLengthCounter() {
        return this.f17996OooOOo0;
    }

    public int getMaxEms() {
        return this.f17988OooOO0;
    }

    @Px
    public int getMaxWidth() {
        return this.f17990OooOO0o;
    }

    public int getMinEms() {
        return this.f17982OooO;
    }

    @Px
    public int getMinWidth() {
        return this.f17989OooOO0O;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17984OooO0o.f18084OooOO0.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17984OooO0o.f18084OooOO0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f18001OooOo0O) {
            return this.f17999OooOo0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f18004OooOoO0;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f17998OooOo;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f17985OooO0o0.f18109OooO0o;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f17985OooO0o0.f18110OooO0o0.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f17985OooO0o0.f18110OooO0o0;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        return this.f18017Oooo0o;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f17985OooO0o0.f18111OooO0oO.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f17985OooO0o0.f18111OooO0oO.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f17985OooO0o0.f18113OooOO0;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f17985OooO0o0.f18114OooOO0O;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f17984OooO0o.f18093OooOOoo;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f17984OooO0o.f18096OooOo00.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f17984OooO0o.f18096OooOo00;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f18029OoooOoO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18046o00oO0o.OooO0oo(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f17986OooO0oO;
        if (editText != null) {
            Rect rect = this.f18026OoooOOO;
            com.google.android.material.internal.OooO0o.OooO00o(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f18016Oooo0OO;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.f18024OoooO0O, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f18018Oooo0o0;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.f18021OoooO, rect.right, i6);
            }
            if (this.f18008OooOooO) {
                float textSize = this.f17986OooO0oO.getTextSize();
                com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
                if (oooO0OO.f17219OooOO0o != textSize) {
                    oooO0OO.f17219OooOO0o = textSize;
                    oooO0OO.OooO(false);
                }
                int gravity = this.f17986OooO0oO.getGravity();
                oooO0OO.OooOO0o((gravity & (-113)) | 48);
                if (oooO0OO.f17217OooOO0 != gravity) {
                    oooO0OO.f17217OooOO0 = gravity;
                    oooO0OO.OooO(false);
                }
                if (this.f17986OooO0oO == null) {
                    throw new IllegalStateException();
                }
                boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
                int i7 = rect.bottom;
                Rect rect2 = this.f18027OoooOOo;
                rect2.bottom = i7;
                int i8 = this.f18010Oooo;
                if (i8 == 1) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = rect.top + this.f18023OoooO00;
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else if (i8 != 2) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = getPaddingTop();
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else {
                    rect2.left = this.f17986OooO0oO.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - OooO0OO();
                    rect2.right = rect.right - this.f17986OooO0oO.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = oooO0OO.f17216OooO0oo;
                if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                    rect3.set(i9, i10, i11, i12);
                    oooO0OO.f17253OoooO0O = true;
                }
                if (this.f17986OooO0oO == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = oooO0OO.f17254OoooOO0;
                textPaint.setTextSize(oooO0OO.f17219OooOO0o);
                textPaint.setTypeface(oooO0OO.f17232OooOoO);
                textPaint.setLetterSpacing(oooO0OO.f17266Oooooo0);
                float f = -textPaint.ascent();
                rect2.left = this.f17986OooO0oO.getCompoundPaddingLeft() + rect.left;
                rect2.top = this.f18010Oooo == 1 && this.f17986OooO0oO.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f17986OooO0oO.getCompoundPaddingTop();
                rect2.right = rect.right - this.f17986OooO0oO.getCompoundPaddingRight();
                int compoundPaddingBottom = this.f18010Oooo == 1 && this.f17986OooO0oO.getMinLines() <= 1 ? (int) (rect2.top + f) : rect.bottom - this.f17986OooO0oO.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = oooO0OO.f17215OooO0oO;
                if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    oooO0OO.f17253OoooO0O = true;
                }
                oooO0OO.OooO(false);
                if (!OooO0o0() || this.f18053oo000o) {
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
        EditText editText2 = this.f17986OooO0oO;
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (editText2 != null && this.f17986OooO0oO.getMeasuredHeight() < (iMax = Math.max(o00ooo2.getMeasuredHeight(), this.f17985OooO0o0.getMeasuredHeight()))) {
            this.f17986OooO0oO.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zOooOOOo = OooOOOo();
        if (z || zOooOOOo) {
            this.f17986OooO0oO.post(new OooO0OO());
        }
        if (this.f18002OooOo0o != null && (editText = this.f17986OooO0oO) != null) {
            this.f18002OooOo0o.setGravity(editText.getGravity());
            this.f18002OooOo0o.setPadding(this.f17986OooO0oO.getCompoundPaddingLeft(), this.f17986OooO0oO.getCompoundPaddingTop(), this.f17986OooO0oO.getCompoundPaddingRight(), this.f17986OooO0oO.getCompoundPaddingBottom());
        }
        o00ooo2.OooOO0o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        setError(savedState.f18060OooO0o);
        if (savedState.f18061OooO0oO) {
            post(new OooO0O0());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f18019Oooo0oO) {
            o0O00o00.OooO0o oooO0o = this.f18017Oooo0o.f17633OooO0o0;
            RectF rectF = this.f18028OoooOo0;
            float fOooO00o = oooO0o.OooO00o(rectF);
            float fOooO00o2 = this.f18017Oooo0o.f17632OooO0o.OooO00o(rectF);
            float fOooO00o3 = this.f18017Oooo0o.f17635OooO0oo.OooO00o(rectF);
            float fOooO00o4 = this.f18017Oooo0o.f17634OooO0oO.OooO00o(rectF);
            com.google.android.material.shape.OooO0O0 oooO0O0 = this.f18017Oooo0o;
            o0O00o00.OooO oooO = oooO0O0.f17628OooO00o;
            com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
            o0O00o00.OooO oooO2 = oooO0O0.f17629OooO0O0;
            oooO00o.f17640OooO00o = oooO2;
            float fOooO00o5 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooO2);
            if (fOooO00o5 != -1.0f) {
                oooO00o.OooO0o0(fOooO00o5);
            }
            oooO00o.f17641OooO0O0 = oooO;
            float fOooO00o6 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooO);
            if (fOooO00o6 != -1.0f) {
                oooO00o.OooO0o(fOooO00o6);
            }
            o0O00o00.OooO oooO3 = oooO0O0.f17630OooO0OO;
            oooO00o.f17643OooO0Oo = oooO3;
            float fOooO00o7 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooO3);
            if (fOooO00o7 != -1.0f) {
                oooO00o.OooO0OO(fOooO00o7);
            }
            o0O00o00.OooO oooO4 = oooO0O0.f17631OooO0Oo;
            oooO00o.f17642OooO0OO = oooO4;
            float fOooO00o8 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooO4);
            if (fOooO00o8 != -1.0f) {
                oooO00o.OooO0Oo(fOooO00o8);
            }
            oooO00o.OooO0o0(fOooO00o2);
            oooO00o.OooO0o(fOooO00o);
            oooO00o.OooO0OO(fOooO00o4);
            oooO00o.OooO0Oo(fOooO00o3);
            com.google.android.material.shape.OooO0O0 oooO0O1 = new com.google.android.material.shape.OooO0O0(oooO00o);
            this.f18019Oooo0oO = z;
            setShapeAppearanceModel(oooO0O1);
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (OooOOO0()) {
            savedState.f18060OooO0o = getError();
        }
        o00Ooo o00ooo2 = this.f17984OooO0o;
        savedState.f18061OooO0oO = (o00ooo2.f18086OooOO0o != 0) && o00ooo2.f18084OooOO0.isChecked();
        return savedState;
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f18040o000oOoO != i) {
            this.f18040o000oOoO = i;
            this.f18041o00O0O = i;
            this.f18043o00Ooo = i;
            this.f18044o00o0O = i;
            OooO0O0();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5271OooO00o;
        setBoxBackgroundColor(ContextCompat.OooO0o.OooO00o(context, i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f18041o00O0O = defaultColor;
        this.f18040o000oOoO = defaultColor;
        this.f18042o00Oo0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f18043o00Ooo = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f18044o00o0O = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0O0();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f18010Oooo) {
            return;
        }
        this.f18010Oooo = i;
        if (this.f17986OooO0oO != null) {
            OooO();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f18023OoooO00 = i;
    }

    public void setBoxCornerFamily(int i) {
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f18017Oooo0o;
        oooO0O0.getClass();
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
        o0O00o00.OooO0o oooO0o = this.f18017Oooo0o.f17633OooO0o0;
        o0O00o00.OooO oooOOooO00o = o0O00o00.OooOOO.OooO00o(i);
        oooO00o.f17640OooO00o = oooOOooO00o;
        float fOooO00o = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o);
        if (fOooO00o != -1.0f) {
            oooO00o.OooO0o0(fOooO00o);
        }
        oooO00o.f17645OooO0o0 = oooO0o;
        o0O00o00.OooO0o oooO0o2 = this.f18017Oooo0o.f17632OooO0o;
        o0O00o00.OooO oooOOooO00o2 = o0O00o00.OooOOO.OooO00o(i);
        oooO00o.f17641OooO0O0 = oooOOooO00o2;
        float fOooO00o2 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o2);
        if (fOooO00o2 != -1.0f) {
            oooO00o.OooO0o(fOooO00o2);
        }
        oooO00o.f17644OooO0o = oooO0o2;
        o0O00o00.OooO0o oooO0o3 = this.f18017Oooo0o.f17635OooO0oo;
        o0O00o00.OooO oooOOooO00o3 = o0O00o00.OooOOO.OooO00o(i);
        oooO00o.f17643OooO0Oo = oooOOooO00o3;
        float fOooO00o3 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o3);
        if (fOooO00o3 != -1.0f) {
            oooO00o.OooO0OO(fOooO00o3);
        }
        oooO00o.f17647OooO0oo = oooO0o3;
        o0O00o00.OooO0o oooO0o4 = this.f18017Oooo0o.f17634OooO0oO;
        o0O00o00.OooO oooOOooO00o4 = o0O00o00.OooOOO.OooO00o(i);
        oooO00o.f17642OooO0OO = oooOOooO00o4;
        float fOooO00o4 = com.google.android.material.shape.OooO0O0.OooO00o.OooO00o(oooOOooO00o4);
        if (fOooO00o4 != -1.0f) {
            oooO00o.OooO0Oo(fOooO00o4);
        }
        oooO00o.f17646OooO0oO = oooO0o4;
        this.f18017Oooo0o = new com.google.android.material.shape.OooO0O0(oooO00o);
        OooO0O0();
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f18049o0OoOo0 != i) {
            this.f18049o0OoOo0 = i;
            OooOo0o();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f18038OoooooO = colorStateList.getDefaultColor();
            this.f18047o00ooo = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f18039Ooooooo = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f18049o0OoOo0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f18049o0OoOo0 != colorStateList.getDefaultColor()) {
            this.f18049o0OoOo0 = colorStateList.getDefaultColor();
        }
        OooOo0o();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f18054ooOO != colorStateList) {
            this.f18054ooOO = colorStateList;
            OooOo0o();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f18024OoooO0O = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f18021OoooO = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f17991OooOOO != z) {
            o0ooOOo o0ooooo = this.f17992OooOOO0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17995OooOOo = appCompatTextView;
                appCompatTextView.setId(o0000Ooo.textinput_counter);
                Typeface typeface = this.f18029OoooOoO;
                if (typeface != null) {
                    this.f17995OooOOo.setTypeface(typeface);
                }
                this.f17995OooOOo.setMaxLines(1);
                o0ooooo.OooO00o(this.f17995OooOOo, 2);
                androidx.core.view.o00O0O.OooO0oo((ViewGroup.MarginLayoutParams) this.f17995OooOOo.getLayoutParams(), getResources().getDimensionPixelOffset(o00000O.mtrl_textinput_counter_margin_start));
                OooOOOO();
                if (this.f17995OooOOo != null) {
                    EditText editText = this.f17986OooO0oO;
                    OooOOO(editText != null ? editText.getText() : null);
                }
            } else {
                o0ooooo.OooO0oO(this.f17995OooOOo, 2);
                this.f17995OooOOo = null;
            }
            this.f17991OooOOO = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f17993OooOOOO != i) {
            if (i > 0) {
                this.f17993OooOOOO = i;
            } else {
                this.f17993OooOOOO = -1;
            }
            if (!this.f17991OooOOO || this.f17995OooOOo == null) {
                return;
            }
            EditText editText = this.f17986OooO0oO;
            OooOOO(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f17997OooOOoo != i) {
            this.f17997OooOOoo = i;
            OooOOOO();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18006OooOoo != colorStateList) {
            this.f18006OooOoo = colorStateList;
            OooOOOO();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f18000OooOo00 != i) {
            this.f18000OooOo00 = i;
            OooOOOO();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18007OooOoo0 != colorStateList) {
            this.f18007OooOoo0 = colorStateList;
            OooOOOO();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f18037Oooooo0 = colorStateList;
        this.f18036Oooooo = colorStateList;
        if (this.f17986OooO0oO != null) {
            OooOo00(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOO0O(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f17984OooO0o.f18084OooOO0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f17984OooO0o.f18084OooOO0.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        CharSequence text = i != 0 ? o00ooo2.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        Drawable drawableOooO00o = i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00ooo2.getContext(), i) : null;
        CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
        checkableImageButton.setImageDrawable(drawableOooO00o);
        if (drawableOooO00o != null) {
            ColorStateList colorStateList = o00ooo2.f18087OooOOO;
            PorterDuff.Mode mode = o00ooo2.f18089OooOOOO;
            TextInputLayout textInputLayout = o00ooo2.f18079OooO0Oo;
            o00oO0o.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            o00oO0o.OooO0OO(textInputLayout, checkableImageButton, o00ooo2.f18087OooOOO);
        }
    }

    public void setEndIconMinSize(@IntRange(from = ULong.MIN_VALUE) int i) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (i < 0) {
            o00ooo2.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != o00ooo2.f18090OooOOOo) {
            o00ooo2.f18090OooOOOo = i;
            CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = o00ooo2.f18080OooO0o;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f17984OooO0o.OooO0o(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        View.OnLongClickListener onLongClickListener = o00ooo2.f18091OooOOo;
        CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
        checkableImageButton.setOnClickListener(onClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18091OooOOo = onLongClickListener;
        CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18092OooOOo0 = scaleType;
        o00ooo2.f18084OooOO0.setScaleType(scaleType);
        o00ooo2.f18080OooO0o.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (o00ooo2.f18087OooOOO != colorStateList) {
            o00ooo2.f18087OooOOO = colorStateList;
            o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18084OooOO0, colorStateList, o00ooo2.f18089OooOOOO);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (o00ooo2.f18089OooOOOO != mode) {
            o00ooo2.f18089OooOOOO = mode;
            o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18084OooOO0, o00ooo2.f18087OooOOO, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f17984OooO0o.OooO0oO(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (!o0ooooo.f18137OooOOo0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            o0ooooo.OooO0o();
            return;
        }
        o0ooooo.OooO0OO();
        o0ooooo.f18135OooOOOo = charSequence;
        o0ooooo.f18136OooOOo.setText(charSequence);
        int i = o0ooooo.f18132OooOOO;
        if (i != 1) {
            o0ooooo.f18134OooOOOO = 1;
        }
        o0ooooo.OooO(i, o0ooooo.f18134OooOOOO, o0ooooo.OooO0oo(o0ooooo.f18136OooOOo, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18141OooOo00 = i;
        AppCompatTextView appCompatTextView = o0ooooo.f18136OooOOo;
        if (appCompatTextView != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView, i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18138OooOOoo = charSequence;
        AppCompatTextView appCompatTextView = o0ooooo.f18136OooOOo;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (o0ooooo.f18137OooOOo0 == z) {
            return;
        }
        o0ooooo.OooO0OO();
        TextInputLayout textInputLayout = o0ooooo.f18128OooO0oo;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o0ooooo.f18127OooO0oO);
            o0ooooo.f18136OooOOo = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_error);
            o0ooooo.f18136OooOOo.setTextAlignment(5);
            Typeface typeface = o0ooooo.f18147OooOoo0;
            if (typeface != null) {
                o0ooooo.f18136OooOOo.setTypeface(typeface);
            }
            int i = o0ooooo.f18140OooOo0;
            o0ooooo.f18140OooOo0 = i;
            AppCompatTextView appCompatTextView2 = o0ooooo.f18136OooOOo;
            if (appCompatTextView2 != null) {
                textInputLayout.OooOO0o(appCompatTextView2, i);
            }
            ColorStateList colorStateList = o0ooooo.f18142OooOo0O;
            o0ooooo.f18142OooOo0O = colorStateList;
            AppCompatTextView appCompatTextView3 = o0ooooo.f18136OooOOo;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = o0ooooo.f18138OooOOoo;
            o0ooooo.f18138OooOOoo = charSequence;
            AppCompatTextView appCompatTextView4 = o0ooooo.f18136OooOOo;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = o0ooooo.f18141OooOo00;
            o0ooooo.f18141OooOo00 = i2;
            AppCompatTextView appCompatTextView5 = o0ooooo.f18136OooOOo;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOO0O.OooO0o(appCompatTextView5, i2);
            }
            o0ooooo.f18136OooOOo.setVisibility(4);
            o0ooooo.OooO00o(o0ooooo.f18136OooOOo, 0);
        } else {
            o0ooooo.OooO0o();
            o0ooooo.OooO0oO(o0ooooo.f18136OooOOo, 0);
            o0ooooo.f18136OooOOo = null;
            textInputLayout.OooOOo0();
            textInputLayout.OooOo0o();
        }
        o0ooooo.f18137OooOOo0 = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.OooO0oo(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00ooo2.getContext(), i) : null);
        o00oO0o.OooO0OO(o00ooo2.f18079OooO0Oo, o00ooo2.f18080OooO0o, o00ooo2.f18082OooO0oO);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        CheckableImageButton checkableImageButton = o00ooo2.f18080OooO0o;
        View.OnLongClickListener onLongClickListener = o00ooo2.f18078OooO;
        checkableImageButton.setOnClickListener(onClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18078OooO = onLongClickListener;
        CheckableImageButton checkableImageButton = o00ooo2.f18080OooO0o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (o00ooo2.f18082OooO0oO != colorStateList) {
            o00ooo2.f18082OooO0oO = colorStateList;
            o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18080OooO0o, colorStateList, o00ooo2.f18083OooO0oo);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (o00ooo2.f18083OooO0oo != mode) {
            o00ooo2.f18083OooO0oo = mode;
            o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18080OooO0o, o00ooo2.f18082OooO0oO, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18140OooOo0 = i;
        AppCompatTextView appCompatTextView = o0ooooo.f18136OooOOo;
        if (appCompatTextView != null) {
            o0ooooo.f18128OooO0oo.OooOO0o(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18142OooOo0O = colorStateList;
        AppCompatTextView appCompatTextView = o0ooooo.f18136OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f18045o00oO0O != z) {
            this.f18045o00oO0O = z;
            OooOo00(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (zIsEmpty) {
            if (o0ooooo.f18139OooOo) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!o0ooooo.f18139OooOo) {
            setHelperTextEnabled(true);
        }
        o0ooooo.OooO0OO();
        o0ooooo.f18143OooOo0o = charSequence;
        o0ooooo.f18145OooOoO0.setText(charSequence);
        int i = o0ooooo.f18132OooOOO;
        if (i != 2) {
            o0ooooo.f18134OooOOOO = 2;
        }
        o0ooooo.OooO(i, o0ooooo.f18134OooOOOO, o0ooooo.OooO0oo(o0ooooo.f18145OooOoO0, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18146OooOoOO = colorStateList;
        AppCompatTextView appCompatTextView = o0ooooo.f18145OooOoO0;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        if (o0ooooo.f18139OooOo == z) {
            return;
        }
        o0ooooo.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o0ooooo.f18127OooO0oO);
            o0ooooo.f18145OooOoO0 = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_helper_text);
            o0ooooo.f18145OooOoO0.setTextAlignment(5);
            Typeface typeface = o0ooooo.f18147OooOoo0;
            if (typeface != null) {
                o0ooooo.f18145OooOoO0.setTypeface(typeface);
            }
            o0ooooo.f18145OooOoO0.setVisibility(4);
            AppCompatTextView appCompatTextView2 = o0ooooo.f18145OooOoO0;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView2, 1);
            int i = o0ooooo.f18144OooOoO;
            o0ooooo.f18144OooOoO = i;
            AppCompatTextView appCompatTextView3 = o0ooooo.f18145OooOoO0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = o0ooooo.f18146OooOoOO;
            o0ooooo.f18146OooOoOO = colorStateList;
            AppCompatTextView appCompatTextView4 = o0ooooo.f18145OooOoO0;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            o0ooooo.OooO00o(o0ooooo.f18145OooOoO0, 1);
            o0ooooo.f18145OooOoO0.setAccessibilityDelegate(new o0OOO0o(o0ooooo));
        } else {
            o0ooooo.OooO0OO();
            int i2 = o0ooooo.f18132OooOOO;
            if (i2 == 2) {
                o0ooooo.f18134OooOOOO = 0;
            }
            o0ooooo.OooO(i2, o0ooooo.f18134OooOOOO, o0ooooo.OooO0oo(o0ooooo.f18145OooOoO0, ""));
            o0ooooo.OooO0oO(o0ooooo.f18145OooOoO0, 1);
            o0ooooo.f18145OooOoO0 = null;
            TextInputLayout textInputLayout = o0ooooo.f18128OooO0oo;
            textInputLayout.OooOOo0();
            textInputLayout.OooOo0o();
        }
        o0ooooo.f18139OooOo = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        o0ooOOo o0ooooo = this.f17992OooOOO0;
        o0ooooo.f18144OooOoO = i;
        AppCompatTextView appCompatTextView = o0ooooo.f18145OooOoO0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f18008OooOooO) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f18050o0ooOO0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f18008OooOooO) {
            this.f18008OooOooO = z;
            if (z) {
                CharSequence hint = this.f17986OooO0oO.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f18009OooOooo)) {
                        setHint(hint);
                    }
                    this.f17986OooO0oO.setHint((CharSequence) null);
                }
                this.f18012Oooo000 = true;
            } else {
                this.f18012Oooo000 = false;
                if (!TextUtils.isEmpty(this.f18009OooOooo) && TextUtils.isEmpty(this.f17986OooO0oO.getHint())) {
                    this.f17986OooO0oO.setHint(this.f18009OooOooo);
                }
                setHintInternal(null);
            }
            if (this.f17986OooO0oO != null) {
                OooOOoo();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
        oooO0OO.OooOO0O(i);
        this.f18036Oooooo = oooO0OO.f17222OooOOOO;
        if (this.f17986OooO0oO != null) {
            OooOo00(false, false);
            OooOOoo();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18036Oooooo != colorStateList) {
            if (this.f18037Oooooo0 == null) {
                com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
                if (oooO0OO.f17222OooOOOO != colorStateList) {
                    oooO0OO.f17222OooOOOO = colorStateList;
                    oooO0OO.OooO(false);
                }
            }
            this.f18036Oooooo = colorStateList;
            if (this.f17986OooO0oO != null) {
                OooOo00(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull OooOO0 oooOO1) {
        this.f17996OooOOo0 = oooOO1;
    }

    public void setMaxEms(int i) {
        this.f17988OooOO0 = i;
        EditText editText = this.f17986OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.f17990OooOO0o = i;
        EditText editText = this.f17986OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f17982OooO = i;
        EditText editText = this.f17986OooO0oO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.f17989OooOO0O = i;
        EditText editText = this.f17986OooO0oO;
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
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18084OooOO0.setContentDescription(i != 0 ? o00ooo2.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18084OooOO0.setImageDrawable(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(o00ooo2.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        if (z && o00ooo2.f18086OooOO0o != 1) {
            o00ooo2.OooO0o(1);
        } else if (z) {
            o00ooo2.getClass();
        } else {
            o00ooo2.OooO0o(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18087OooOOO = colorStateList;
        o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18084OooOO0, colorStateList, o00ooo2.f18089OooOOOO);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.f18089OooOOOO = mode;
        o00oO0o.OooO00o(o00ooo2.f18079OooO0Oo, o00ooo2.f18084OooOO0, o00ooo2.f18087OooOOO, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f18002OooOo0o == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f18002OooOo0o = appCompatTextView;
            appCompatTextView.setId(o0000Ooo.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f18002OooOo0o;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOoo(appCompatTextView2, 2);
            Fade fadeOooO0Oo = OooO0Oo();
            this.f18003OooOoO = fadeOooO0Oo;
            fadeOooO0Oo.f8209OooO0o0 = 67L;
            this.f18005OooOoOO = OooO0Oo();
            setPlaceholderTextAppearance(this.f18004OooOoO0);
            setPlaceholderTextColor(this.f17998OooOo);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f18001OooOo0O) {
                setPlaceholderTextEnabled(true);
            }
            this.f17999OooOo0 = charSequence;
        }
        EditText editText = this.f17986OooO0oO;
        OooOo0(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f18004OooOoO0 = i;
        AppCompatTextView appCompatTextView = this.f18002OooOo0o;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17998OooOo != colorStateList) {
            this.f17998OooOo = colorStateList;
            AppCompatTextView appCompatTextView = this.f18002OooOo0o;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        o0o0o00.getClass();
        o0o0o00.f18109OooO0o = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o0o0o00.f18110OooO0o0.setText(charSequence);
        o0o0o00.OooO0Oo();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        this.f17985OooO0o0.f18110OooO0o0.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17985OooO0o0.f18110OooO0o0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        MaterialShapeDrawable materialShapeDrawable = this.f18013Oooo00O;
        if (materialShapeDrawable == null || materialShapeDrawable.f17582OooO0Oo.f17605OooO00o == oooO0O0) {
            return;
        }
        this.f18017Oooo0o = oooO0O0;
        OooO0O0();
    }

    public void setStartIconCheckable(boolean z) {
        this.f17985OooO0o0.f18111OooO0oO.setCheckable(z);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f17985OooO0o0.f18111OooO0oO;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(getContext(), i) : null);
    }

    public void setStartIconMinSize(@IntRange(from = ULong.MIN_VALUE) int i) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        if (i < 0) {
            o0o0o00.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != o0o0o00.f18113OooOO0) {
            o0o0o00.f18113OooOO0 = i;
            CheckableImageButton checkableImageButton = o0o0o00.f18111OooO0oO;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        View.OnLongClickListener onLongClickListener = o0o0o00.f18115OooOO0o;
        CheckableImageButton checkableImageButton = o0o0o00.f18111OooO0oO;
        checkableImageButton.setOnClickListener(onClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        o0o0o00.f18115OooOO0o = onLongClickListener;
        CheckableImageButton checkableImageButton = o0o0o00.f18111OooO0oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        o0o0o00.f18114OooOO0O = scaleType;
        o0o0o00.f18111OooO0oO.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        if (o0o0o00.f18112OooO0oo != colorStateList) {
            o0o0o00.f18112OooO0oo = colorStateList;
            o00oO0o.OooO00o(o0o0o00.f18108OooO0Oo, o0o0o00.f18111OooO0oO, colorStateList, o0o0o00.f18107OooO);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        o0O0O00 o0o0o00 = this.f17985OooO0o0;
        if (o0o0o00.f18107OooO != mode) {
            o0o0o00.f18107OooO = mode;
            o00oO0o.OooO00o(o0o0o00.f18108OooO0Oo, o0o0o00.f18111OooO0oO, o0o0o00.f18112OooO0oo, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f17985OooO0o0.OooO0O0(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        o00ooo2.getClass();
        o00ooo2.f18093OooOOoo = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o00ooo2.f18096OooOo00.setText(charSequence);
        o00ooo2.OooOOO0();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.f17984OooO0o.f18096OooOo00.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17984OooO0o.f18096OooOo00.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable OooO oooO) {
        EditText editText = this.f17986OooO0oO;
        if (editText != null) {
            ViewCompat.OooOOOO(editText, oooO);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f18029OoooOoO) {
            this.f18029OoooOoO = typeface;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f18046o00oO0o;
            boolean zOooOOO0 = oooO0OO.OooOOO0(typeface);
            boolean zOooOOOO = oooO0OO.OooOOOO(typeface);
            if (zOooOOO0 || zOooOOOO) {
                oooO0OO.OooO(false);
            }
            o0ooOOo o0ooooo = this.f17992OooOOO0;
            if (typeface != o0ooooo.f18147OooOoo0) {
                o0ooooo.f18147OooOoo0 = typeface;
                AppCompatTextView appCompatTextView = o0ooooo.f18136OooOOo;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = o0ooooo.f18145OooOoO0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f17995OooOOo;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.textInputStyle);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f17985OooO0o0.OooO00o(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17981o0Oo0oo;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17982OooO = -1;
        this.f17988OooOO0 = -1;
        this.f17989OooOO0O = -1;
        this.f17990OooOO0o = -1;
        this.f17992OooOOO0 = new o0ooOOo(this);
        this.f17996OooOOo0 = new o00O0OO0();
        this.f18026OoooOOO = new Rect();
        this.f18027OoooOOo = new Rect();
        this.f18028OoooOo0 = new RectF();
        this.f18032Ooooo0o = new LinkedHashSet<>();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f18046o00oO0o = oooO0OO;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17983OooO0Oo = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
        oooO0OO.f17255OoooOOO = linearInterpolator;
        oooO0OO.OooO(false);
        oooO0OO.f17269o000oOoO = linearInterpolator;
        oooO0OO.OooO(false);
        oooO0OO.OooOO0o(8388659);
        int[] iArr = o000OO.TextInputLayout;
        int i3 = o000OO.TextInputLayout_counterTextAppearance;
        int i4 = o000OO.TextInputLayout_counterOverflowTextAppearance;
        int i5 = o000OO.TextInputLayout_errorTextAppearance;
        int i6 = o000OO.TextInputLayout_helperTextTextAppearance;
        int i7 = o000OO.TextInputLayout_hintTextAppearance;
        o000Oo0 o000oo0OooO0o0 = com.google.android.material.internal.o00oO0o.OooO0o0(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        o0O0O00 o0o0o00 = new o0O0O00(this, o000oo0OooO0o0);
        this.f17985OooO0o0 = o0o0o00;
        this.f18008OooOooO = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_hintEnabled, true);
        setHint(o000oo0OooO0o0.OooOO0O(o000OO.TextInputLayout_android_hint));
        this.f18050o0ooOO0 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_hintAnimationEnabled, true);
        this.f18045o00oO0O = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_expandedHintEnabled, true);
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
        this.f18017Oooo0o = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, i, i2));
        this.f18020Oooo0oo = context2.getResources().getDimensionPixelOffset(o00000O.mtrl_textinput_box_label_cutout_padding);
        this.f18023OoooO00 = o000oo0OooO0o0.OooO0OO(o000OO.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f18024OoooO0O = o000oo0OooO0o0.OooO0Oo(o000OO.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(o00000O.mtrl_textinput_box_stroke_width_default));
        this.f18021OoooO = o000oo0OooO0o0.OooO0Oo(o000OO.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(o00000O.mtrl_textinput_box_stroke_width_focused));
        this.f18022OoooO0 = this.f18024OoooO0O;
        int i12 = o000OO.TextInputLayout_boxCornerRadiusTopStart;
        TypedArray typedArray = o000oo0OooO0o0.f3326OooO0O0;
        float dimension = typedArray.getDimension(i12, -1.0f);
        float dimension2 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(o000OO.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f18017Oooo0o;
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
        this.f18017Oooo0o = new com.google.android.material.shape.OooO0O0(oooO00o);
        ColorStateList colorStateListOooO0O0 = c1.OooO0O0(context2, o000oo0OooO0o0, o000OO.TextInputLayout_boxBackgroundColor);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.f18041o00O0O = defaultColor;
            this.f18040o000oOoO = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.f18042o00Oo0 = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.f18043o00Ooo = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f18044o00o0O = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f18043o00Ooo = this.f18041o00O0O;
                ColorStateList colorStateListOooO0O1 = ContextCompat.OooO0O0(o00000O0.mtrl_filled_background_color, context2);
                this.f18042o00Oo0 = colorStateListOooO0O1.getColorForState(new int[]{-16842910}, -1);
                this.f18044o00o0O = colorStateListOooO0O1.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f18040o000oOoO = 0;
            this.f18041o00O0O = 0;
            this.f18042o00Oo0 = 0;
            this.f18043o00Ooo = 0;
            this.f18044o00o0O = 0;
        }
        int i13 = o000OO.TextInputLayout_android_textColorHint;
        if (o000oo0OooO0o0.OooOO0o(i13)) {
            ColorStateList colorStateListOooO0O2 = o000oo0OooO0o0.OooO0O0(i13);
            this.f18036Oooooo = colorStateListOooO0O2;
            this.f18037Oooooo0 = colorStateListOooO0O2;
        }
        int i14 = o000OO.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListOooO0O3 = c1.OooO0O0(context2, o000oo0OooO0o0, i14);
        this.f18049o0OoOo0 = typedArray.getColor(i14, 0);
        int i15 = o00000O0.mtrl_textinput_default_box_stroke_color;
        Object obj = ContextCompat.f5271OooO00o;
        this.f18038OoooooO = ContextCompat.OooO0o.OooO00o(context2, i15);
        this.f18047o00ooo = ContextCompat.OooO0o.OooO00o(context2, o00000O0.mtrl_textinput_disabled_color);
        this.f18039Ooooooo = ContextCompat.OooO0o.OooO00o(context2, o00000O0.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O3 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O3);
        }
        int i16 = o000OO.TextInputLayout_boxStrokeErrorColor;
        if (o000oo0OooO0o0.OooOO0o(i16)) {
            setBoxStrokeErrorColor(c1.OooO0O0(context2, o000oo0OooO0o0, i16));
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
        this.f18000OooOo00 = o000oo0OooO0o0.OooO(i3, 0);
        this.f17997OooOOoo = o000oo0OooO0o0.OooO(i4, 0);
        setBoxBackgroundMode(o000oo0OooO0o0.OooO0oo(o000OO.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceOooOO0O);
        setErrorAccessibilityLiveRegion(iOooO0oo);
        setCounterOverflowTextAppearance(this.f17997OooOOoo);
        setHelperTextTextAppearance(iOooO2);
        setErrorTextAppearance(iOooO);
        setCounterTextAppearance(this.f18000OooOo00);
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
        o00Ooo o00ooo2 = new o00Ooo(this, o000oo0OooO0o0);
        this.f17984OooO0o = o00ooo2;
        boolean zOooO00o4 = o000oo0OooO0o0.OooO00o(o000OO.TextInputLayout_android_enabled, true);
        o000oo0OooO0o0.OooOOO();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 2);
        int i23 = Build.VERSION.SDK_INT;
        if (i23 >= 26 && i23 >= 26) {
            ViewCompat.OooOo.OooOO0o(this, 1);
        }
        frameLayout.addView(o0o0o00);
        frameLayout.addView(o00ooo2);
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
        this.f17984OooO0o.f18084OooOO0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f17984OooO0o.f18084OooOO0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f17984OooO0o.OooO0oo(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f17984OooO0o.f18084OooOO0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        o00Ooo o00ooo2 = this.f17984OooO0o;
        CheckableImageButton checkableImageButton = o00ooo2.f18084OooOO0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = o00ooo2.f18087OooOOO;
            PorterDuff.Mode mode = o00ooo2.f18089OooOOOO;
            TextInputLayout textInputLayout = o00ooo2.f18079OooO0Oo;
            o00oO0o.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            o00oO0o.OooO0OO(textInputLayout, checkableImageButton, o00ooo2.f18087OooOOO);
        }
    }
}
