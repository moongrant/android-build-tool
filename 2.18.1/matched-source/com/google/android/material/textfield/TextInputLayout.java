package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yalla.yalla.common.manager.googlepay.PayError;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0O0O00.o0ooOOo;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public static final int f17926o000Ooo = p337o0OO0o0.Oooo000.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17927Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17928Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final o00O0O f17929Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f17930Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17931OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public CharSequence f17932OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public EditText f17933OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17934OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f17935OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Oooo000 f17936OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f17937OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f17938OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f17939OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17940OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f17941Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f17942Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public CharSequence f17943OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f17944OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public AppCompatTextView f17945OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17946Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17947Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public Fade f17948OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public Fade f17949Ooooooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public boolean f17950o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public ColorStateList f17951o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final RectF f17952o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @ColorInt
    public int f17953o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public final Rect f17954o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final Rect f17955o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17956o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public Typeface f17957o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public int f17958o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final LinkedHashSet<OooOO0> f17959o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public int f17960o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17961o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public final LinkedHashSet<OooOO0O> f17962o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17963o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public Drawable f17964o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public PorterDuff.Mode f17965o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public View.OnLongClickListener f17966o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public PorterDuff.Mode f17967o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public ColorStateList f17968o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public ColorStateList f17969o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public ColorStateList f17970o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    @ColorInt
    public int f17971o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    @ColorInt
    public int f17972o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    @ColorInt
    public int f17973o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final SparseArray<OooOo00> f17974o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    @ColorInt
    public int f17975o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    public ColorStateList f17976o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    @ColorInt
    public int f17977o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    @ColorInt
    public int f17978o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public int f17979o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    @ColorInt
    public int f17980o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    @ColorInt
    public int f17981o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    public boolean f17982o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17983o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0OO f17984o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public boolean f17985o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public ValueAnimator f17986o000O000;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public boolean f17987o000O0o;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public View.OnLongClickListener f17988o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @ColorInt
    public int f17989o000OOo;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public boolean f17990o000OoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f17991o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public CharSequence f17992o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f17993o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f17994o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public CharSequence f17995o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17996o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17997o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f17998o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f17999o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f18000o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f18001o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f18002o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f18003o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO00o f18004o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f18005o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final int f18006o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18007oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f18008oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f18009ooOO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public static class OooO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextInputLayout f18010OooO0Oo;

        public OooO(@NonNull TextInputLayout textInputLayout) {
            this.f18010OooO0Oo = textInputLayout;
        }

        @Override // androidx.core.view.OooO00o
        public void OooO0Oo(@NonNull View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            EditText editText = this.f18010OooO0Oo.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f18010OooO0Oo.getHint();
            CharSequence error = this.f18010OooO0Oo.getError();
            CharSequence placeholderText = this.f18010OooO0Oo.getPlaceholderText();
            int counterMaxLength = this.f18010OooO0Oo.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f18010OooO0Oo.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f18010OooO0Oo.f17982o0000oOo;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            o00O0O o00o0o2 = this.f18010OooO0Oo.f17929Oooo0oO;
            if (o00o0o2.f18022Oooo0oO.getVisibility() == 0) {
                o0000oo1.f28194OooO00o.setLabelFor(o00o0o2.f18022Oooo0oO);
                o0000oo1.OooooOO(o00o0o2.f18022Oooo0oO);
            } else {
                o0000oo1.OooooOO(o00o0o2.f18020Oooo);
            }
            if (z) {
                o0000oo1.OooooO0(text);
            } else if (!TextUtils.isEmpty(string)) {
                o0000oo1.OooooO0(string);
                if (z3 && placeholderText != null) {
                    o0000oo1.OooooO0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                o0000oo1.OooooO0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    o0000oo1.Oooo(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    o0000oo1.OooooO0(string);
                }
                o0000oo1.Ooooo00(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            o0000oo1.f28194OooO00o.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                o0000oo1.f28194OooO00o.setError(error);
            }
            AppCompatTextView appCompatTextView = this.f18010OooO0Oo.f17936OoooOOO.f17914OooOOo;
            if (appCompatTextView != null) {
                o0000oo1.f28194OooO00o.setLabelFor(appCompatTextView);
            }
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.OooOoOO(!textInputLayout.f17987o000O0o, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f17937OoooOOo) {
                textInputLayout2.OooOo00(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f17944OooooOO) {
                textInputLayout3.OooOoo0(editable.length());
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
            TextInputLayout.this.f17961o00000oO.performClick();
            TextInputLayout.this.f17961o00000oO.jumpDrawablesToCurrentState();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f17933OoooO00.requestLayout();
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f17984o0000oo0.OooOo(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface OooOO0 {
        void OooO00o(@NonNull TextInputLayout textInputLayout);
    }

    public interface OooOO0O {
        void OooO00o(@NonNull TextInputLayout textInputLayout, int i);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f18015Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public CharSequence f18016Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @Nullable
        public CharSequence f18017OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public CharSequence f18018OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @Nullable
        public CharSequence f18019OoooO0O;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextInputLayout.SavedState{");
            sbOooO0o0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0o0.append(" error=");
            sbOooO0o0.append((Object) this.f18016Oooo0oo);
            sbOooO0o0.append(" hint=");
            sbOooO0o0.append((Object) this.f18018OoooO00);
            sbOooO0o0.append(" helperText=");
            sbOooO0o0.append((Object) this.f18017OoooO0);
            sbOooO0o0.append(" placeholderText=");
            sbOooO0o0.append((Object) this.f18019OoooO0O);
            sbOooO0o0.append("}");
            return sbOooO0o0.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            TextUtils.writeToParcel(this.f18016Oooo0oo, parcel, i);
            parcel.writeInt(this.f18015Oooo ? 1 : 0);
            TextUtils.writeToParcel(this.f18018OoooO00, parcel, i);
            TextUtils.writeToParcel(this.f18017OoooO0, parcel, i);
            TextUtils.writeToParcel(this.f18019OoooO0O, parcel, i);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18016Oooo0oo = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18015Oooo = parcel.readInt() == 1;
            this.f18018OoooO00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18017OoooO0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18019OoooO0O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void OooOOOO(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOOOO((ViewGroup) childAt, z);
            }
        }
    }

    public static void OooOOo0(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean zOooO00o = ViewCompat.OooO0OO.OooO00o(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zOooO00o || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zOooO00o);
        checkableImageButton.setPressable(zOooO00o);
        checkableImageButton.setLongClickable(z);
        ViewCompat.OooO0o.OooOOoo(checkableImageButton, z2 ? 1 : 2);
    }

    private OooOo00 getEndIconDelegate() {
        OooOo00 oooOo00 = this.f17974o0000Ooo.get(this.f17960o00000o0);
        return oooOo00 != null ? oooOo00 : this.f17974o0000Ooo.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f17963o0000O.getVisibility() == 0) {
            return this.f17963o0000O;
        }
        if (OooO() && OooOO0O()) {
            return this.f17961o00000oO;
        }
        return null;
    }

    private void setEditText(EditText editText) {
        if (this.f17933OoooO00 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f17960o00000o0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17933OoooO00 = editText;
        int i = this.f17934OoooO0O;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f17935OoooOO0);
        }
        int i2 = this.f17931OoooO;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f17991o000oOoO);
        }
        OooOOO0();
        setTextInputAccessibilityDelegate(new OooO(this));
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
        Typeface typeface = this.f17933OoooO00.getTypeface();
        boolean zOooOOo = oooO0OO.OooOOo(typeface);
        boolean zOooOo0o = oooO0OO.OooOo0o(typeface);
        if (zOooOOo || zOooOo0o) {
            oooO0OO.OooOOO0(false);
        }
        com.google.android.material.internal.OooO0OO oooO0OO2 = this.f17984o0000oo0;
        float textSize = this.f17933OoooO00.getTextSize();
        if (oooO0OO2.f17220OooOOO0 != textSize) {
            oooO0OO2.f17220OooOOO0 = textSize;
            oooO0OO2.OooOOO0(false);
        }
        com.google.android.material.internal.OooO0OO oooO0OO3 = this.f17984o0000oo0;
        float letterSpacing = this.f17933OoooO00.getLetterSpacing();
        if (oooO0OO3.f17265Oooooo0 != letterSpacing) {
            oooO0OO3.f17265Oooooo0 = letterSpacing;
            oooO0OO3.OooOOO0(false);
        }
        int gravity = this.f17933OoooO00.getGravity();
        this.f17984o0000oo0.OooOOo0((gravity & PayError.ERROR_PARAMS_IS_NULL) | 48);
        this.f17984o0000oo0.OooOo0O(gravity);
        this.f17933OoooO00.addTextChangedListener(new OooO00o());
        if (this.f17969o0000OOO == null) {
            this.f17969o0000OOO = this.f17933OoooO00.getHintTextColors();
        }
        if (this.f17994o00Ooo) {
            if (TextUtils.isEmpty(this.f17995o00o0O)) {
                CharSequence hint = this.f17933OoooO00.getHint();
                this.f17932OoooO0 = hint;
                setHint(hint);
                this.f17933OoooO00.setHint((CharSequence) null);
            }
            this.f17998o00ooo = true;
        }
        if (this.f17940OoooOoo != null) {
            OooOo00(this.f17933OoooO00.getText().length());
        }
        OooOo0o();
        this.f17936OoooOOO.OooO0O0();
        this.f17929Oooo0oO.bringToFront();
        this.f17930Oooo0oo.bringToFront();
        this.f17927Oooo.bringToFront();
        this.f17963o0000O.bringToFront();
        Iterator<OooOO0> it = this.f17959o00000Oo.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this);
        }
        OooOooO();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        OooOoOO(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f17995o00o0O)) {
            return;
        }
        this.f17995o00o0O = charSequence;
        this.f17984o0000oo0.OooOoo0(charSequence);
        if (this.f17982o0000oOo) {
            return;
        }
        OooOOO();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f17944OooooOO == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.f17945OooooOo;
            if (appCompatTextView != null) {
                this.f17928Oooo0o.addView(appCompatTextView);
                this.f17945OooooOo.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f17945OooooOo;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f17945OooooOo = null;
        }
        this.f17944OooooOO = z;
    }

    public final boolean OooO() {
        return this.f17960o00000o0 != 0;
    }

    public final void OooO00o(@NonNull OooOO0 oooOO1) {
        this.f17959o00000Oo.add(oooOO1);
        if (this.f17933OoooO00 != null) {
            oooOO1.OooO00o(this);
        }
    }

    public final void OooO0O0(@NonNull OooOO0O oooOO0O) {
        this.f17962o00000oo.add(oooOO0O);
    }

    @VisibleForTesting
    public final void OooO0OO(float f) {
        if (this.f17984o0000oo0.f17210OooO0OO == f) {
            return;
        }
        if (this.f17986o000O000 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17986o000O000 = valueAnimator;
            valueAnimator.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            this.f17986o000O000.setDuration(167L);
            this.f17986o000O000.addUpdateListener(new OooO0o());
        }
        this.f17986o000O000.setFloatValues(this.f17984o0000oo0.f17210OooO0OO, f);
        this.f17986o000O000.start();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    public final void OooO0Oo() {
        boolean z;
        MaterialShapeDrawable materialShapeDrawable = this.f18007oo000o;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.OooO00o oooO00o = materialShapeDrawable.f17510Oooo0o.f17534OooO00o;
        com.google.android.material.shape.OooO00o oooO00o2 = this.f18004o0ooOO0;
        boolean z2 = false;
        if (oooO00o != oooO00o2) {
            materialShapeDrawable.setShapeAppearanceModel(oooO00o2);
            if (this.f17960o00000o0 == 3 && this.f18001o0OOO0o == 2) {
                com.google.android.material.textfield.OooOO0O oooOO0O = (com.google.android.material.textfield.OooOO0O) this.f17974o0000Ooo.get(3);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f17933OoooO00;
                Objects.requireNonNull(oooOO0O);
                if (!(autoCompleteTextView.getKeyListener() != null) && oooOO0O.f17893OooO00o.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
                    oooOO0O.OooO(autoCompleteTextView);
                }
            }
        }
        if (this.f18001o0OOO0o != 2) {
            z = false;
        } else {
            if (this.f18000o0OO00O > -1 && this.f17989o000OOo != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f18007oo000o.OooOo0(this.f18000o0OO00O, this.f17989o000OOo);
        }
        int iOooO0O0 = this.f17953o000000;
        if (this.f18001o0OOO0o == 1) {
            iOooO0O0 = p071o000O0o.OooO0o.OooO0O0(this.f17953o000000, o0O0000O.OooO0O0(getContext(), p337o0OO0o0.OooO0o.colorSurface, 0));
        }
        this.f17953o000000 = iOooO0O0;
        this.f18007oo000o.OooOOOo(ColorStateList.valueOf(iOooO0O0));
        if (this.f17960o00000o0 == 3) {
            this.f17933OoooO00.getBackground().invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f17997o00oO0o;
        if (materialShapeDrawable2 != null && this.f17996o00oO0O != null) {
            if (this.f18000o0OO00O > -1 && this.f17989o000OOo != 0) {
                z2 = true;
            }
            if (z2) {
                materialShapeDrawable2.OooOOOo(this.f17933OoooO00.isFocused() ? ColorStateList.valueOf(this.f17972o0000Oo0) : ColorStateList.valueOf(this.f17989o000OOo));
                this.f17996o00oO0O.OooOOOo(ColorStateList.valueOf(this.f17989o000OOo));
            }
            invalidate();
        }
        invalidate();
    }

    public final boolean OooO0o() {
        return this.f17994o00Ooo && !TextUtils.isEmpty(this.f17995o00o0O) && (this.f18007oo000o instanceof com.google.android.material.textfield.OooOO0);
    }

    public final int OooO0o0() {
        float fOooO0oO;
        if (!this.f17994o00Ooo) {
            return 0;
        }
        int i = this.f18001o0OOO0o;
        if (i == 0) {
            fOooO0oO = this.f17984o0000oo0.OooO0oO();
        } else {
            if (i != 2) {
                return 0;
            }
            fOooO0oO = this.f17984o0000oo0.OooO0oO() / 2.0f;
        }
        return (int) fOooO0oO;
    }

    public final int OooO0oO(int i, boolean z) {
        int compoundPaddingLeft = this.f17933OoooO00.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int OooO0oo(int i, boolean z) {
        int compoundPaddingRight = i - this.f17933OoooO00.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void OooOO0() {
        AppCompatTextView appCompatTextView = this.f17945OooooOo;
        if (appCompatTextView == null || !this.f17944OooooOO) {
            return;
        }
        appCompatTextView.setText((CharSequence) null);
        androidx.transition.OooOO0.OooO00o(this.f17928Oooo0o, this.f17949Ooooooo);
        this.f17945OooooOo.setVisibility(4);
    }

    public final boolean OooOO0O() {
        return this.f17927Oooo.getVisibility() == 0 && this.f17961o00000oO.getVisibility() == 0;
    }

    public final boolean OooOO0o() {
        return this.f17963o0000O.getVisibility() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    public final void OooOOO() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        if (OooO0o()) {
            RectF rectF = this.f17952o00000;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
            int width = this.f17933OoooO00.getWidth();
            int gravity = this.f17933OoooO00.getGravity();
            boolean zOooO0O0 = oooO0OO.OooO0O0(oooO0OO.f17241Oooo00O);
            oooO0OO.f17239Oooo0 = zOooO0O0;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    Rect rect = oooO0OO.f17207OooO;
                    if (zOooO0O0) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = oooO0OO.f17267Ooooooo;
                    }
                } else {
                    Rect rect2 = oooO0OO.f17207OooO;
                    if (zOooO0O0) {
                        f = rect2.right;
                        f2 = oooO0OO.f17267Ooooooo;
                    } else {
                        i2 = rect2.left;
                        f3 = i2;
                    }
                }
                rectF.left = f3;
                Rect rect3 = oooO0OO.f17207OooO;
                float f5 = rect3.top;
                rectF.top = f5;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (oooO0OO.f17267Ooooooo / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zOooO0O0) {
                        f4 = oooO0OO.f17267Ooooooo + f3;
                    } else {
                        i = rect3.right;
                        f4 = i;
                    }
                } else if (zOooO0O0) {
                    i = rect3.right;
                    f4 = i;
                } else {
                    f4 = oooO0OO.f17267Ooooooo + f3;
                }
                rectF.right = f4;
                rectF.bottom = oooO0OO.OooO0oO() + f5;
                float f6 = rectF.left;
                float f7 = this.f18006o0ooOoO;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18000o0OO00O);
                com.google.android.material.textfield.OooOO0 oooOO1 = (com.google.android.material.textfield.OooOO0) this.f18007oo000o;
                Objects.requireNonNull(oooOO1);
                oooOO1.OooOoo0(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            f2 = oooO0OO.f17267Ooooooo / 2.0f;
            f3 = f - f2;
            rectF.left = f3;
            Rect rect4 = oooO0OO.f17207OooO;
            float f8 = rect4.top;
            rectF.top = f8;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (oooO0OO.f17267Ooooooo / 2.0f);
            } else {
                f4 = (width / 2.0f) + (oooO0OO.f17267Ooooooo / 2.0f);
            }
            rectF.right = f4;
            rectF.bottom = oooO0OO.OooO0oO() + f8;
            float f9 = rectF.left;
            float f10 = this.f18006o0ooOoO;
            rectF.left = f9 - f10;
            rectF.right += f10;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18000o0OO00O);
            com.google.android.material.textfield.OooOO0 oooOO2 = (com.google.android.material.textfield.OooOO0) this.f18007oo000o;
            Objects.requireNonNull(oooOO2);
            oooOO2.OooOoo0(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void OooOOO0() {
        int i = this.f18001o0OOO0o;
        if (i == 0) {
            this.f18007oo000o = null;
            this.f17997o00oO0o = null;
            this.f17996o00oO0O = null;
        } else if (i == 1) {
            this.f18007oo000o = new MaterialShapeDrawable(this.f18004o0ooOO0);
            this.f17997o00oO0o = new MaterialShapeDrawable();
            this.f17996o00oO0O = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(o0ooOOo.OooO00o(new StringBuilder(), this.f18001o0OOO0o, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f17994o00Ooo || (this.f18007oo000o instanceof com.google.android.material.textfield.OooOO0)) {
                this.f18007oo000o = new MaterialShapeDrawable(this.f18004o0ooOO0);
            } else {
                this.f18007oo000o = new com.google.android.material.textfield.OooOO0(this.f18004o0ooOO0);
            }
            this.f17997o00oO0o = null;
            this.f17996o00oO0O = null;
        }
        EditText editText = this.f17933OoooO00;
        if ((editText == null || this.f18007oo000o == null || editText.getBackground() != null || this.f18001o0OOO0o == 0) ? false : true) {
            EditText editText2 = this.f17933OoooO00;
            MaterialShapeDrawable materialShapeDrawable = this.f18007oo000o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(editText2, materialShapeDrawable);
        }
        Oooo000();
        if (this.f18001o0OOO0o == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f18002o0Oo0oo = getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_font_2_0_box_collapsed_padding_top);
            } else if (o0OOO0O.OooO0OO.OooO0oO(getContext())) {
                this.f18002o0Oo0oo = getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f17933OoooO00 != null && this.f18001o0OOO0o == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f17933OoooO00;
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO.OooOO0O(editText3, ViewCompat.OooO.OooO0o(editText3), getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_filled_edittext_font_2_0_padding_top), ViewCompat.OooO.OooO0o0(this.f17933OoooO00), getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_filled_edittext_font_2_0_padding_bottom));
            } else if (o0OOO0O.OooO0OO.OooO0oO(getContext())) {
                EditText editText4 = this.f17933OoooO00;
                WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO.OooOO0O(editText4, ViewCompat.OooO.OooO0o(editText4), getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_filled_edittext_font_1_3_padding_top), ViewCompat.OooO.OooO0o0(this.f17933OoooO00), getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f18001o0OOO0o != 0) {
            OooOoO();
        }
    }

    public final void OooOOOo() {
        OooOo.OooO0OO(this, this.f17961o00000oO, this.f17951o0000);
    }

    public final void OooOOo(@NonNull TextView textView, @StyleRes int i) {
        boolean z = true;
        try {
            TextViewCompat.OooO0o(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            TextViewCompat.OooO0o(textView, p337o0OO0o0.Oooo000.TextAppearance_AppCompat_Caption);
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), p337o0OO0o0.OooO.design_error));
        }
    }

    public final void OooOOoo() {
        if (this.f17940OoooOoo != null) {
            EditText editText = this.f17933OoooO00;
            OooOo00(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void OooOo() {
        this.f17927Oooo.setVisibility((this.f17961o00000oO.getVisibility() != 0 || OooOO0o()) ? 8 : 0);
        this.f17930Oooo0oo.setVisibility(OooOO0O() || OooOO0o() || ((this.f17992o00O0O == null || this.f17982o0000oOo) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public final void OooOo0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f17940OoooOoo;
        if (appCompatTextView != null) {
            OooOOo(appCompatTextView, this.f17939OoooOoO ? this.f17941Ooooo00 : this.f17942Ooooo0o);
            if (!this.f17939OoooOoO && (colorStateList2 = this.f18003o0OoOo0) != null) {
                this.f17940OoooOoo.setTextColor(colorStateList2);
            }
            if (!this.f17939OoooOoO || (colorStateList = this.f18009ooOO) == null) {
                return;
            }
            this.f17940OoooOoo.setTextColor(colorStateList);
        }
    }

    public final void OooOo00(int i) {
        boolean z = this.f17939OoooOoO;
        int i2 = this.f17938OoooOo0;
        if (i2 == -1) {
            this.f17940OoooOoo.setText(String.valueOf(i));
            this.f17940OoooOoo.setContentDescription(null);
            this.f17939OoooOoO = false;
        } else {
            this.f17939OoooOoO = i > i2;
            Context context = getContext();
            this.f17940OoooOoo.setContentDescription(context.getString(this.f17939OoooOoO ? p337o0OO0o0.OooOo.character_counter_overflowed_content_description : p337o0OO0o0.OooOo.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f17938OoooOo0)));
            if (z != this.f17939OoooOoO) {
                OooOo0();
            }
            o000O0Oo.OooO00o oooO00oOooO0OO = o000O0Oo.OooO00o.OooO0OO();
            AppCompatTextView appCompatTextView = this.f17940OoooOoo;
            String string = getContext().getString(p337o0OO0o0.OooOo.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f17938OoooOo0));
            appCompatTextView.setText(string != null ? ((SpannableStringBuilder) oooO00oOooO0OO.OooO0Oo(string, oooO00oOooO0OO.f28144OooO0OO)).toString() : null);
        }
        if (this.f17933OoooO00 == null || z == this.f17939OoooOoO) {
            return;
        }
        OooOoOO(false, false);
        Oooo000();
        OooOo0o();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public final boolean OooOo0O() {
        boolean z;
        if (this.f17933OoooO00 == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f17929Oooo0oO.getMeasuredWidth() > 0) {
            int measuredWidth = this.f17929Oooo0oO.getMeasuredWidth() - this.f17933OoooO00.getPaddingLeft();
            if (this.f17956o00000O == null || this.f17958o00000OO != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17956o00000O = colorDrawable;
                this.f17958o00000OO = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this.f17933OoooO00);
            Drawable drawable = drawableArrOooO00o[0];
            ColorDrawable colorDrawable2 = this.f17956o00000O;
            if (drawable != colorDrawable2) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17933OoooO00, colorDrawable2, drawableArrOooO00o[1], drawableArrOooO00o[2], drawableArrOooO00o[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f17956o00000O != null) {
            Drawable[] drawableArrOooO00o2 = TextViewCompat.OooO0O0.OooO00o(this.f17933OoooO00);
            TextViewCompat.OooO0O0.OooO0o0(this.f17933OoooO00, null, drawableArrOooO00o2[1], drawableArrOooO00o2[2], drawableArrOooO00o2[3]);
            this.f17956o00000O = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.f17963o0000O.getVisibility() == 0 || ((OooO() && OooOO0O()) || this.f17992o00O0O != null)) && this.f17930Oooo0oo.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f17993o00Oo0.getMeasuredWidth() - this.f17933OoooO00.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = o000O0O0.OooOO0.OooO0OO((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrOooO00o3 = TextViewCompat.OooO0O0.OooO00o(this.f17933OoooO00);
            ColorDrawable colorDrawable3 = this.f17983o0000oo;
            if (colorDrawable3 == null || this.f17979o0000oO == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f17983o0000oo = colorDrawable4;
                    this.f17979o0000oO = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrOooO00o3[2];
                ColorDrawable colorDrawable5 = this.f17983o0000oo;
                if (drawable2 != colorDrawable5) {
                    this.f17964o0000O0 = drawableArrOooO00o3[2];
                    TextViewCompat.OooO0O0.OooO0o0(this.f17933OoooO00, drawableArrOooO00o3[0], drawableArrOooO00o3[1], colorDrawable5, drawableArrOooO00o3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f17979o0000oO = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.OooO0O0.OooO0o0(this.f17933OoooO00, drawableArrOooO00o3[0], drawableArrOooO00o3[1], this.f17983o0000oo, drawableArrOooO00o3[3]);
            }
        } else {
            if (this.f17983o0000oo == null) {
                return z;
            }
            Drawable[] drawableArrOooO00o4 = TextViewCompat.OooO0O0.OooO00o(this.f17933OoooO00);
            if (drawableArrOooO00o4[2] == this.f17983o0000oo) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17933OoooO00, drawableArrOooO00o4[0], drawableArrOooO00o4[1], this.f17964o0000O0, drawableArrOooO00o4[3]);
            } else {
                z2 = z;
            }
            this.f17983o0000oo = null;
        }
        return z2;
    }

    public final void OooOo0o() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f17933OoooO00;
        if (editText == null || this.f18001o0OOO0o != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = androidx.appcompat.widget.o0ooOOo.f5478OooO00o;
        Drawable drawableMutate = background.mutate();
        if (this.f17936OoooOOO.OooO0o0()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(this.f17936OoooOOO.OooO0oO(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17939OoooOoO && (appCompatTextView = this.f17940OoooOoo) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            o0OOO0o.OooO00o(drawableMutate);
            this.f17933OoooO00.refreshDrawableState();
        }
    }

    public final void OooOoO() {
        if (this.f18001o0OOO0o != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17928Oooo0o.getLayoutParams();
            int iOooO0o0 = OooO0o0();
            if (iOooO0o0 != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0o0;
                this.f17928Oooo0o.requestLayout();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final void OooOoO0() {
        boolean z;
        if (getErrorIconDrawable() != null) {
            Oooo000 oooo000 = this.f17936OoooOOO;
            if (oooo000.f17908OooOO0O && oooo000.OooO0o0()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f17963o0000O.setVisibility(z ? 0 : 8);
        OooOo();
        OooOooO();
        if (OooO()) {
            return;
        }
        OooOo0O();
    }

    public final void OooOoOO(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17933OoooO00;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17933OoooO00;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zOooO0o0 = this.f17936OoooOOO.OooO0o0();
        ColorStateList colorStateList2 = this.f17969o0000OOO;
        if (colorStateList2 != null) {
            this.f17984o0000oo0.OooOOOo(colorStateList2);
            this.f17984o0000oo0.OooOo0(this.f17969o0000OOO);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f17969o0000OOO;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f17981o0000oOO) : this.f17981o0000oOO;
            this.f17984o0000oo0.OooOOOo(ColorStateList.valueOf(colorForState));
            this.f17984o0000oo0.OooOo0(ColorStateList.valueOf(colorForState));
        } else if (zOooO0o0) {
            com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
            AppCompatTextView appCompatTextView2 = this.f17936OoooOOO.f17909OooOO0o;
            oooO0OO.OooOOOo(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f17939OoooOoO && (appCompatTextView = this.f17940OoooOoo) != null) {
            this.f17984o0000oo0.OooOOOo(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f17970o0000OOo) != null) {
            this.f17984o0000oo0.OooOOOo(colorStateList);
        }
        if (z3 || !this.f17985o0000ooO || (isEnabled() && z4)) {
            if (z2 || this.f17982o0000oOo) {
                ValueAnimator valueAnimator = this.f17986o000O000;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f17986o000O000.cancel();
                }
                if (z && this.f17950o000) {
                    OooO0OO(1.0f);
                } else {
                    this.f17984o0000oo0.OooOo(1.0f);
                }
                this.f17982o0000oOo = false;
                if (OooO0o()) {
                    OooOOO();
                }
                EditText editText3 = this.f17933OoooO00;
                OooOoo0(editText3 == null ? 0 : editText3.getText().length());
                o00O0O o00o0o2 = this.f17929Oooo0oO;
                o00o0o2.f18024OoooO = false;
                o00o0o2.OooO0oO();
                OooOooo();
                return;
            }
            return;
        }
        if (z2 || !this.f17982o0000oOo) {
            ValueAnimator valueAnimator2 = this.f17986o000O000;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f17986o000O000.cancel();
            }
            if (z && this.f17950o000) {
                OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                this.f17984o0000oo0.OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            if (OooO0o() && (!((com.google.android.material.textfield.OooOO0) this.f18007oo000o).f17860ooOO.isEmpty()) && OooO0o()) {
                ((com.google.android.material.textfield.OooOO0) this.f18007oo000o).OooOoo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            this.f17982o0000oOo = true;
            OooOO0();
            o00O0O o00o0o3 = this.f17929Oooo0oO;
            o00o0o3.f18024OoooO = true;
            o00o0o3.OooO0oO();
            OooOooo();
        }
    }

    public final void OooOoo(boolean z, boolean z2) {
        int defaultColor = this.f17976o0000o0.getDefaultColor();
        int colorForState = this.f17976o0000o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17976o0000o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f17989o000OOo = colorForState2;
        } else if (z2) {
            this.f17989o000OOo = colorForState;
        } else {
            this.f17989o000OOo = defaultColor;
        }
    }

    public final void OooOoo0(int i) {
        if (i != 0 || this.f17982o0000oOo) {
            OooOO0();
            return;
        }
        if (this.f17945OooooOo == null || !this.f17944OooooOO || TextUtils.isEmpty(this.f17943OooooO0)) {
            return;
        }
        this.f17945OooooOo.setText(this.f17943OooooO0);
        androidx.transition.OooOO0.OooO00o(this.f17928Oooo0o, this.f17948OoooooO);
        this.f17945OooooOo.setVisibility(0);
        this.f17945OooooOo.bringToFront();
        announceForAccessibility(this.f17943OooooO0);
    }

    public final void OooOooO() {
        int iOooO0o0;
        if (this.f17933OoooO00 == null) {
            return;
        }
        if (OooOO0O() || OooOO0o()) {
            iOooO0o0 = 0;
        } else {
            EditText editText = this.f17933OoooO00;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            iOooO0o0 = ViewCompat.OooO.OooO0o0(editText);
        }
        AppCompatTextView appCompatTextView = this.f17993o00Oo0;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f17933OoooO00.getPaddingTop();
        int paddingBottom = this.f17933OoooO00.getPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooOO0O(appCompatTextView, dimensionPixelSize, paddingTop, iOooO0o0, paddingBottom);
    }

    public final void OooOooo() {
        int visibility = this.f17993o00Oo0.getVisibility();
        int i = (this.f17992o00O0O == null || this.f17982o0000oOo) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().OooO0OO(i == 0);
        }
        OooOo();
        this.f17993o00Oo0.setVisibility(i);
        OooOo0O();
    }

    public final void Oooo000() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f18007oo000o == null || this.f18001o0OOO0o == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f17933OoooO00) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f17933OoooO00) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f17989o000OOo = this.f17981o0000oOO;
        } else if (this.f17936OoooOOO.OooO0o0()) {
            if (this.f17976o0000o0 != null) {
                OooOoo(z2, z);
            } else {
                this.f17989o000OOo = this.f17936OoooOOO.OooO0oO();
            }
        } else if (!this.f17939OoooOoO || (appCompatTextView = this.f17940OoooOoo) == null) {
            if (z2) {
                this.f17989o000OOo = this.f17973o0000OoO;
            } else if (z) {
                this.f17989o000OOo = this.f17971o0000Oo;
            } else {
                this.f17989o000OOo = this.f17972o0000Oo0;
            }
        } else if (this.f17976o0000o0 != null) {
            OooOoo(z2, z);
        } else {
            this.f17989o000OOo = appCompatTextView.getCurrentTextColor();
        }
        OooOoO0();
        OooOo.OooO0OO(this, this.f17963o0000O, this.f17968o0000OO0);
        o00O0O o00o0o2 = this.f17929Oooo0oO;
        OooOo.OooO0OO(o00o0o2.f18021Oooo0o, o00o0o2.f18020Oooo, o00o0o2.f18026OoooO00);
        OooOOOo();
        OooOo00 endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof com.google.android.material.textfield.OooOO0O) {
            if (!this.f17936OoooOOO.OooO0o0() || getEndIconDrawable() == null) {
                OooOo.OooO00o(this, this.f17961o00000oO, this.f17951o0000, this.f17965o0000O00);
            } else {
                Drawable drawableMutate = o0OOO0o.OooO0o0(getEndIconDrawable()).mutate();
                o0OOO0o.OooO0O0.OooO0oO(drawableMutate, this.f17936OoooOOO.OooO0oO());
                this.f17961o00000oO.setImageDrawable(drawableMutate);
            }
        }
        if (this.f18001o0OOO0o == 2) {
            int i = this.f18000o0OO00O;
            if (z2 && isEnabled()) {
                this.f18000o0OO00O = this.f17999o0O0O00;
            } else {
                this.f18000o0OO00O = this.f18008oo0o0Oo;
            }
            if (this.f18000o0OO00O != i && OooO0o() && !this.f17982o0000oOo) {
                if (OooO0o()) {
                    ((com.google.android.material.textfield.OooOO0) this.f18007oo000o).OooOoo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                OooOOO();
            }
        }
        if (this.f18001o0OOO0o == 1) {
            if (!isEnabled()) {
                this.f17953o000000 = this.f17978o0000o0o;
            } else if (z && !z2) {
                this.f17953o000000 = this.f17980o0000oO0;
            } else if (z2) {
                this.f17953o000000 = this.f17975o0000o;
            } else {
                this.f17953o000000 = this.f17977o0000o0O;
            }
        }
        OooO0Oo();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & PayError.ERROR_PARAMS_IS_NULL) | 16;
        this.f17928Oooo0o.addView(view, layoutParams2);
        this.f17928Oooo0o.setLayoutParams(layoutParams);
        OooOoO();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f17933OoooO00;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f17932OoooO0 != null) {
            boolean z = this.f17998o00ooo;
            this.f17998o00ooo = false;
            CharSequence hint = editText.getHint();
            this.f17933OoooO00.setHint(this.f17932OoooO0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f17933OoooO00.setHint(hint);
                this.f17998o00ooo = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f17928Oooo0o.getChildCount());
        for (int i2 = 0; i2 < this.f17928Oooo0o.getChildCount(); i2++) {
            View childAt = this.f17928Oooo0o.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f17933OoooO00) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f17987o000O0o = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17987o000O0o = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        if (this.f17994o00Ooo) {
            this.f17984o0000oo0.OooO0o(canvas);
        }
        if (this.f17996o00oO0O == null || (materialShapeDrawable = this.f17997o00oO0o) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f17933OoooO00.isFocused()) {
            Rect bounds = this.f17996o00oO0O.getBounds();
            Rect bounds2 = this.f17997o00oO0o.getBounds();
            float f = this.f17984o0000oo0.f17210OooO0OO;
            int iCenterX = bounds2.centerX();
            bounds.left = p338o0OO0o0O.OooO0o.OooO0O0(iCenterX, bounds2.left, f);
            bounds.right = p338o0OO0o0O.OooO0o.OooO0O0(iCenterX, bounds2.right, f);
            this.f17996o00oO0O.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f17990o000OoO) {
            return;
        }
        this.f17990o000OoO = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
        boolean zOooOoOO = oooO0OO != null ? oooO0OO.OooOoOO(drawableState) | false : false;
        if (this.f17933OoooO00 != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            OooOoOO(ViewCompat.OooOO0O.OooO0OO(this) && isEnabled(), false);
        }
        OooOo0o();
        Oooo000();
        if (zOooOoOO) {
            invalidate();
        }
        this.f17990o000OoO = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17933OoooO00;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0o0() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f18001o0OOO0o;
        if (i == 1 || i == 2) {
            return this.f18007oo000o;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17953o000000;
    }

    public int getBoxBackgroundMode() {
        return this.f18001o0OOO0o;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18002o0Oo0oo;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return o00Ooo.OooO0o(this) ? this.f18004o0ooOO0.f17563OooO0oo.OooO00o(this.f17952o00000) : this.f18004o0ooOO0.f17562OooO0oO.OooO00o(this.f17952o00000);
    }

    public float getBoxCornerRadiusBottomStart() {
        return o00Ooo.OooO0o(this) ? this.f18004o0ooOO0.f17562OooO0oO.OooO00o(this.f17952o00000) : this.f18004o0ooOO0.f17563OooO0oo.OooO00o(this.f17952o00000);
    }

    public float getBoxCornerRadiusTopEnd() {
        return o00Ooo.OooO0o(this) ? this.f18004o0ooOO0.f17561OooO0o0.OooO00o(this.f17952o00000) : this.f18004o0ooOO0.f17560OooO0o.OooO00o(this.f17952o00000);
    }

    public float getBoxCornerRadiusTopStart() {
        return o00Ooo.OooO0o(this) ? this.f18004o0ooOO0.f17560OooO0o.OooO00o(this.f17952o00000) : this.f18004o0ooOO0.f17561OooO0o0.OooO00o(this.f17952o00000);
    }

    public int getBoxStrokeColor() {
        return this.f17973o0000OoO;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17976o0000o0;
    }

    public int getBoxStrokeWidth() {
        return this.f18008oo0o0Oo;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17999o0O0O00;
    }

    public int getCounterMaxLength() {
        return this.f17938OoooOo0;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f17937OoooOOo && this.f17939OoooOoO && (appCompatTextView = this.f17940OoooOoo) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f18003o0OoOo0;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f18003o0OoOo0;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f17969o0000OOO;
    }

    @Nullable
    public EditText getEditText() {
        return this.f17933OoooO00;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f17961o00000oO.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f17961o00000oO.getDrawable();
    }

    public int getEndIconMode() {
        return this.f17960o00000o0;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f17961o00000oO;
    }

    @Nullable
    public CharSequence getError() {
        Oooo000 oooo000 = this.f17936OoooOOO;
        if (oooo000.f17908OooOO0O) {
            return oooo000.f17907OooOO0;
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f17936OoooOOO.f17911OooOOO0;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f17936OoooOOO.OooO0oO();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f17963o0000O.getDrawable();
    }

    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.f17936OoooOOO.OooO0oO();
    }

    @Nullable
    public CharSequence getHelperText() {
        Oooo000 oooo000 = this.f17936OoooOOO;
        if (oooo000.f17915OooOOo0) {
            return oooo000.f17913OooOOOo;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f17936OoooOOO.f17914OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f17994o00Ooo) {
            return this.f17995o00o0O;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f17984o0000oo0.OooO0oO();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f17984o0000oo0.OooO0oo();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f17970o0000OOo;
    }

    public int getMaxEms() {
        return this.f17931OoooO;
    }

    @Px
    public int getMaxWidth() {
        return this.f17991o000oOoO;
    }

    public int getMinEms() {
        return this.f17934OoooO0O;
    }

    @Px
    public int getMinWidth() {
        return this.f17935OoooOO0;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17961o00000oO.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17961o00000oO.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f17944OooooOO) {
            return this.f17943OooooO0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f17946Oooooo;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f17947Oooooo0;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f17929Oooo0oO.f18023Oooo0oo;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f17929Oooo0oO.f18022Oooo0oO.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f17929Oooo0oO.f18022Oooo0oO;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f17929Oooo0oO.f18020Oooo.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f17929Oooo0oO.f18020Oooo.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f17992o00O0O;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f17993o00Oo0.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f17993o00Oo0;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f17957o00000O0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17984o0000oo0.OooOO0O(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f17933OoooO00;
        if (editText != null) {
            Rect rect = this.f17954o000000O;
            com.google.android.material.internal.OooO0o.OooO00o(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f17997o00oO0o;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.f18008oo0o0Oo, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f17996o00oO0O;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.f17999o0O0O00, rect.right, i6);
            }
            if (this.f17994o00Ooo) {
                com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
                float textSize = this.f17933OoooO00.getTextSize();
                if (oooO0OO.f17220OooOOO0 != textSize) {
                    oooO0OO.f17220OooOOO0 = textSize;
                    oooO0OO.OooOOO0(false);
                }
                int gravity = this.f17933OoooO00.getGravity();
                this.f17984o0000oo0.OooOOo0((gravity & PayError.ERROR_PARAMS_IS_NULL) | 48);
                this.f17984o0000oo0.OooOo0O(gravity);
                com.google.android.material.internal.OooO0OO oooO0OO2 = this.f17984o0000oo0;
                if (this.f17933OoooO00 == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f17955o000000o;
                boolean zOooO0o = o00Ooo.OooO0o(this);
                rect2.bottom = rect.bottom;
                int i7 = this.f18001o0OOO0o;
                if (i7 == 1) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = rect.top + this.f18002o0Oo0oo;
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else if (i7 != 2) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = getPaddingTop();
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else {
                    rect2.left = this.f17933OoooO00.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - OooO0o0();
                    rect2.right = rect.right - this.f17933OoooO00.getPaddingRight();
                }
                Objects.requireNonNull(oooO0OO2);
                oooO0OO2.OooOOO(rect2.left, rect2.top, rect2.right, rect2.bottom);
                com.google.android.material.internal.OooO0OO oooO0OO3 = this.f17984o0000oo0;
                if (this.f17933OoooO00 == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f17955o000000o;
                TextPaint textPaint = oooO0OO3.f17253OoooOO0;
                textPaint.setTextSize(oooO0OO3.f17220OooOOO0);
                textPaint.setTypeface(oooO0OO3.f17233OooOoOO);
                textPaint.setLetterSpacing(oooO0OO3.f17265Oooooo0);
                float f = -oooO0OO3.f17253OoooOO0.ascent();
                rect3.left = this.f17933OoooO00.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.f18001o0OOO0o == 1 && this.f17933OoooO00.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f17933OoooO00.getCompoundPaddingTop();
                rect3.right = rect.right - this.f17933OoooO00.getCompoundPaddingRight();
                rect3.bottom = this.f18001o0OOO0o == 1 && this.f17933OoooO00.getMinLines() <= 1 ? (int) (rect3.top + f) : rect.bottom - this.f17933OoooO00.getCompoundPaddingBottom();
                Objects.requireNonNull(oooO0OO3);
                oooO0OO3.OooOOoo(rect3.left, rect3.top, rect3.right, rect3.bottom);
                this.f17984o0000oo0.OooOOO0(false);
                if (!OooO0o() || this.f17982o0000oOo) {
                    return;
                }
                OooOOO();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        if (this.f17933OoooO00 != null && this.f17933OoooO00.getMeasuredHeight() < (iMax = Math.max(this.f17930Oooo0oo.getMeasuredHeight(), this.f17929Oooo0oO.getMeasuredHeight()))) {
            this.f17933OoooO00.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zOooOo0O = OooOo0O();
        if (z || zOooOo0O) {
            this.f17933OoooO00.post(new OooO0OO());
        }
        if (this.f17945OooooOo != null && (editText = this.f17933OoooO00) != null) {
            this.f17945OooooOo.setGravity(editText.getGravity());
            this.f17945OooooOo.setPadding(this.f17933OoooO00.getCompoundPaddingLeft(), this.f17933OoooO00.getCompoundPaddingTop(), this.f17933OoooO00.getCompoundPaddingRight(), this.f17933OoooO00.getCompoundPaddingBottom());
        }
        OooOooO();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        setError(savedState.f18016Oooo0oo);
        if (savedState.f18015Oooo) {
            this.f17961o00000oO.post(new OooO0O0());
        }
        setHint(savedState.f18018OoooO00);
        setHelperText(savedState.f18017OoooO0);
        setPlaceholderText(savedState.f18019OoooO0O);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f18005o0ooOOo;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float fOooO00o = this.f18004o0ooOO0.f17561OooO0o0.OooO00o(this.f17952o00000);
            float fOooO00o2 = this.f18004o0ooOO0.f17560OooO0o.OooO00o(this.f17952o00000);
            float fOooO00o3 = this.f18004o0ooOO0.f17563OooO0oo.OooO00o(this.f17952o00000);
            float fOooO00o4 = this.f18004o0ooOO0.f17562OooO0oO.OooO00o(this.f17952o00000);
            float f = z ? fOooO00o : fOooO00o2;
            if (z) {
                fOooO00o = fOooO00o2;
            }
            float f2 = z ? fOooO00o3 : fOooO00o4;
            if (z) {
                fOooO00o3 = fOooO00o4;
            }
            boolean zOooO0o = o00Ooo.OooO0o(this);
            this.f18005o0ooOOo = zOooO0o;
            float f3 = zOooO0o ? fOooO00o : f;
            if (!zOooO0o) {
                f = fOooO00o;
            }
            float f4 = zOooO0o ? fOooO00o3 : f2;
            if (!zOooO0o) {
                f2 = fOooO00o3;
            }
            MaterialShapeDrawable materialShapeDrawable = this.f18007oo000o;
            if (materialShapeDrawable != null && materialShapeDrawable.OooOO0O() == f3) {
                MaterialShapeDrawable materialShapeDrawable2 = this.f18007oo000o;
                if (materialShapeDrawable2.f17510Oooo0o.f17534OooO00o.f17560OooO0o.OooO00o(materialShapeDrawable2.OooO0oo()) == f) {
                    MaterialShapeDrawable materialShapeDrawable3 = this.f18007oo000o;
                    if (materialShapeDrawable3.f17510Oooo0o.f17534OooO00o.f17563OooO0oo.OooO00o(materialShapeDrawable3.OooO0oo()) == f4) {
                        MaterialShapeDrawable materialShapeDrawable4 = this.f18007oo000o;
                        if (materialShapeDrawable4.f17510Oooo0o.f17534OooO00o.f17562OooO0oO.OooO00o(materialShapeDrawable4.OooO0oo()) == f2) {
                            return;
                        }
                    }
                }
            }
            com.google.android.material.shape.OooO00o oooO00o = this.f18004o0ooOO0;
            Objects.requireNonNull(oooO00o);
            com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
            c0110OooO00o.OooO0o(f3);
            c0110OooO00o.OooO0oO(f);
            c0110OooO00o.OooO0Oo(f4);
            c0110OooO00o.OooO0o0(f2);
            this.f18004o0ooOO0 = c0110OooO00o.OooO00o();
            OooO0Oo();
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f17936OoooOOO.OooO0o0()) {
            savedState.f18016Oooo0oo = getError();
        }
        savedState.f18015Oooo = OooO() && this.f17961o00000oO.isChecked();
        savedState.f18018OoooO00 = getHint();
        savedState.f18017OoooO0 = getHelperText();
        savedState.f18019OoooO0O = getPlaceholderText();
        return savedState;
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f17953o000000 != i) {
            this.f17953o000000 = i;
            this.f17977o0000o0O = i;
            this.f17975o0000o = i;
            this.f17980o0000oO0 = i;
            OooO0Oo();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(o000O000.OooO00o.OooO0O0(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17977o0000o0O = defaultColor;
        this.f17953o000000 = defaultColor;
        this.f17978o0000o0o = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17975o0000o = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f17980o0000oO0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0Oo();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f18001o0OOO0o) {
            return;
        }
        this.f18001o0OOO0o = i;
        if (this.f17933OoooO00 != null) {
            OooOOO0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f18002o0Oo0oo = i;
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f17973o0000OoO != i) {
            this.f17973o0000OoO = i;
            Oooo000();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f17972o0000Oo0 = colorStateList.getDefaultColor();
            this.f17981o0000oOO = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17971o0000Oo = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f17973o0000OoO = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f17973o0000OoO != colorStateList.getDefaultColor()) {
            this.f17973o0000OoO = colorStateList.getDefaultColor();
        }
        Oooo000();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f17976o0000o0 != colorStateList) {
            this.f17976o0000o0 = colorStateList;
            Oooo000();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f18008oo0o0Oo = i;
        Oooo000();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f17999o0O0O00 = i;
        Oooo000();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f17937OoooOOo != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17940OoooOoo = appCompatTextView;
                appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_counter);
                Typeface typeface = this.f17957o00000O0;
                if (typeface != null) {
                    this.f17940OoooOoo.setTypeface(typeface);
                }
                this.f17940OoooOoo.setMaxLines(1);
                this.f17936OoooOOO.OooO00o(this.f17940OoooOoo, 2);
                o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) this.f17940OoooOoo.getLayoutParams(), getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_textinput_counter_margin_start));
                OooOo0();
                OooOOoo();
            } else {
                this.f17936OoooOOO.OooOO0(this.f17940OoooOoo, 2);
                this.f17940OoooOoo = null;
            }
            this.f17937OoooOOo = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f17938OoooOo0 != i) {
            if (i > 0) {
                this.f17938OoooOo0 = i;
            } else {
                this.f17938OoooOo0 = -1;
            }
            if (this.f17937OoooOOo) {
                OooOOoo();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f17941Ooooo00 != i) {
            this.f17941Ooooo00 = i;
            OooOo0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18009ooOO != colorStateList) {
            this.f18009ooOO = colorStateList;
            OooOo0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f17942Ooooo0o != i) {
            this.f17942Ooooo0o = i;
            OooOo0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18003o0OoOo0 != colorStateList) {
            this.f18003o0OoOo0 = colorStateList;
            OooOo0();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f17969o0000OOO = colorStateList;
        this.f17970o0000OOo = colorStateList;
        if (this.f17933OoooO00 != null) {
            OooOoOO(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOOOO(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f17961o00000oO.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f17961o00000oO.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        setEndIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f17960o00000o0;
        if (i2 == i) {
            return;
        }
        this.f17960o00000o0 = i;
        Iterator<OooOO0O> it = this.f17962o00000oo.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().OooO0O0(this.f18001o0OOO0o)) {
            getEndIconDelegate().OooO00o();
            OooOo.OooO00o(this, this.f17961o00000oO, this.f17951o0000, this.f17965o0000O00);
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("The current box background mode ");
            sbOooO0o0.append(this.f18001o0OOO0o);
            sbOooO0o0.append(" is not supported by the end icon mode ");
            sbOooO0o0.append(i);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f17961o00000oO;
        View.OnLongClickListener onLongClickListener = this.f17966o0000O0O;
        checkableImageButton.setOnClickListener(onClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17966o0000O0O = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f17961o00000oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17951o0000 != colorStateList) {
            this.f17951o0000 = colorStateList;
            OooOo.OooO00o(this, this.f17961o00000oO, colorStateList, this.f17965o0000O00);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17965o0000O00 != mode) {
            this.f17965o0000O00 = mode;
            OooOo.OooO00o(this, this.f17961o00000oO, this.f17951o0000, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (OooOO0O() != z) {
            this.f17961o00000oO.setVisibility(z ? 0 : 8);
            OooOo();
            OooOooO();
            OooOo0O();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f17936OoooOOO.f17908OooOO0O) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f17936OoooOOO.OooO();
            return;
        }
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.OooO0OO();
        oooo000.f17907OooOO0 = charSequence;
        oooo000.f17909OooOO0o.setText(charSequence);
        int i = oooo000.f17906OooO0oo;
        if (i != 1) {
            oooo000.f17898OooO = 1;
        }
        oooo000.OooOO0o(i, oooo000.f17898OooO, oooo000.OooOO0O(oooo000.f17909OooOO0o, charSequence));
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.f17911OooOOO0 = charSequence;
        AppCompatTextView appCompatTextView = oooo000.f17909OooOO0o;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        if (oooo000.f17908OooOO0O == z) {
            return;
        }
        oooo000.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oooo000.f17899OooO00o);
            oooo000.f17909OooOO0o = appCompatTextView;
            appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_error);
            oooo000.f17909OooOO0o.setTextAlignment(5);
            Typeface typeface = oooo000.f17917OooOo0;
            if (typeface != null) {
                oooo000.f17909OooOO0o.setTypeface(typeface);
            }
            int i = oooo000.f17910OooOOO;
            oooo000.f17910OooOOO = i;
            AppCompatTextView appCompatTextView2 = oooo000.f17909OooOO0o;
            if (appCompatTextView2 != null) {
                oooo000.f17900OooO0O0.OooOOo(appCompatTextView2, i);
            }
            ColorStateList colorStateList = oooo000.f17912OooOOOO;
            oooo000.f17912OooOOOO = colorStateList;
            AppCompatTextView appCompatTextView3 = oooo000.f17909OooOO0o;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = oooo000.f17911OooOOO0;
            oooo000.f17911OooOOO0 = charSequence;
            AppCompatTextView appCompatTextView4 = oooo000.f17909OooOO0o;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            oooo000.f17909OooOO0o.setVisibility(4);
            AppCompatTextView appCompatTextView5 = oooo000.f17909OooOO0o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView5, 1);
            oooo000.OooO00o(oooo000.f17909OooOO0o, 0);
        } else {
            oooo000.OooO();
            oooo000.OooOO0(oooo000.f17909OooOO0o, 0);
            oooo000.f17909OooOO0o = null;
            oooo000.f17900OooO0O0.OooOo0o();
            oooo000.f17900OooO0O0.Oooo000();
        }
        oooo000.f17908OooOO0O = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        setErrorIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
        OooOo.OooO0OO(this, this.f17963o0000O, this.f17968o0000OO0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f17963o0000O;
        View.OnLongClickListener onLongClickListener = this.f17988o000OO;
        checkableImageButton.setOnClickListener(onClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17988o000OO = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f17963o0000O;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17968o0000OO0 != colorStateList) {
            this.f17968o0000OO0 = colorStateList;
            OooOo.OooO00o(this, this.f17963o0000O, colorStateList, this.f17967o0000OO);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17967o0000OO != mode) {
            this.f17967o0000OO = mode;
            OooOo.OooO00o(this, this.f17963o0000O, this.f17968o0000OO0, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.f17910OooOOO = i;
        AppCompatTextView appCompatTextView = oooo000.f17909OooOO0o;
        if (appCompatTextView != null) {
            oooo000.f17900OooO0O0.OooOOo(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.f17912OooOOOO = colorStateList;
        AppCompatTextView appCompatTextView = oooo000.f17909OooOO0o;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f17985o0000ooO != z) {
            this.f17985o0000ooO = z;
            OooOoOO(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f17936OoooOOO.f17915OooOOo0) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f17936OoooOOO.f17915OooOOo0) {
            setHelperTextEnabled(true);
        }
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.OooO0OO();
        oooo000.f17913OooOOOo = charSequence;
        oooo000.f17914OooOOo.setText(charSequence);
        int i = oooo000.f17906OooO0oo;
        if (i != 2) {
            oooo000.f17898OooO = 2;
        }
        oooo000.OooOO0o(i, oooo000.f17898OooO, oooo000.OooOO0O(oooo000.f17914OooOOo, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.f17918OooOo00 = colorStateList;
        AppCompatTextView appCompatTextView = oooo000.f17914OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        if (oooo000.f17915OooOOo0 == z) {
            return;
        }
        oooo000.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oooo000.f17899OooO00o);
            oooo000.f17914OooOOo = appCompatTextView;
            appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_helper_text);
            oooo000.f17914OooOOo.setTextAlignment(5);
            Typeface typeface = oooo000.f17917OooOo0;
            if (typeface != null) {
                oooo000.f17914OooOOo.setTypeface(typeface);
            }
            oooo000.f17914OooOOo.setVisibility(4);
            AppCompatTextView appCompatTextView2 = oooo000.f17914OooOOo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView2, 1);
            int i = oooo000.f17916OooOOoo;
            oooo000.f17916OooOOoo = i;
            AppCompatTextView appCompatTextView3 = oooo000.f17914OooOOo;
            if (appCompatTextView3 != null) {
                TextViewCompat.OooO0o(appCompatTextView3, i);
            }
            ColorStateList colorStateList = oooo000.f17918OooOo00;
            oooo000.f17918OooOo00 = colorStateList;
            AppCompatTextView appCompatTextView4 = oooo000.f17914OooOOo;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            oooo000.OooO00o(oooo000.f17914OooOOo, 1);
            oooo000.f17914OooOOo.setAccessibilityDelegate(new Oooo0(oooo000));
        } else {
            oooo000.OooO0OO();
            int i2 = oooo000.f17906OooO0oo;
            if (i2 == 2) {
                oooo000.f17898OooO = 0;
            }
            oooo000.OooOO0o(i2, oooo000.f17898OooO, oooo000.OooOO0O(oooo000.f17914OooOOo, ""));
            oooo000.OooOO0(oooo000.f17914OooOOo, 1);
            oooo000.f17914OooOOo = null;
            oooo000.f17900OooO0O0.OooOo0o();
            oooo000.f17900OooO0O0.Oooo000();
        }
        oooo000.f17915OooOOo0 = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        Oooo000 oooo000 = this.f17936OoooOOO;
        oooo000.f17916OooOOoo = i;
        AppCompatTextView appCompatTextView = oooo000.f17914OooOOo;
        if (appCompatTextView != null) {
            TextViewCompat.OooO0o(appCompatTextView, i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f17994o00Ooo) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.oo0o0Oo.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f17950o000 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f17994o00Ooo) {
            this.f17994o00Ooo = z;
            if (z) {
                CharSequence hint = this.f17933OoooO00.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17995o00o0O)) {
                        setHint(hint);
                    }
                    this.f17933OoooO00.setHint((CharSequence) null);
                }
                this.f17998o00ooo = true;
            } else {
                this.f17998o00ooo = false;
                if (!TextUtils.isEmpty(this.f17995o00o0O) && TextUtils.isEmpty(this.f17933OoooO00.getHint())) {
                    this.f17933OoooO00.setHint(this.f17995o00o0O);
                }
                setHintInternal(null);
            }
            if (this.f17933OoooO00 != null) {
                OooOoO();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.f17984o0000oo0.OooOOOO(i);
        this.f17970o0000OOo = this.f17984o0000oo0.f17222OooOOOo;
        if (this.f17933OoooO00 != null) {
            OooOoOO(false, false);
            OooOoO();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17970o0000OOo != colorStateList) {
            if (this.f17969o0000OOO == null) {
                this.f17984o0000oo0.OooOOOo(colorStateList);
            }
            this.f17970o0000OOo = colorStateList;
            if (this.f17933OoooO00 != null) {
                OooOoOO(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f17931OoooO = i;
        EditText editText = this.f17933OoooO00;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.f17991o000oOoO = i;
        EditText editText = this.f17933OoooO00;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f17934OoooO0O = i;
        EditText editText = this.f17933OoooO00;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.f17935OoooOO0 = i;
        EditText editText = this.f17933OoooO00;
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
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f17960o00000o0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f17951o0000 = colorStateList;
        OooOo.OooO00o(this, this.f17961o00000oO, colorStateList, this.f17965o0000O00);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f17965o0000O00 = mode;
        OooOo.OooO00o(this, this.f17961o00000oO, this.f17951o0000, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f17945OooooOo == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f17945OooooOo = appCompatTextView;
            appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f17945OooooOo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOoo(appCompatTextView2, 2);
            Fade fade = new Fade();
            fade.f9561Oooo0oo = 87L;
            LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
            fade.f9558Oooo = linearInterpolator;
            this.f17948OoooooO = fade;
            fade.f9560Oooo0oO = 67L;
            Fade fade2 = new Fade();
            fade2.f9561Oooo0oo = 87L;
            fade2.f9558Oooo = linearInterpolator;
            this.f17949Ooooooo = fade2;
            setPlaceholderTextAppearance(this.f17946Oooooo);
            setPlaceholderTextColor(this.f17947Oooooo0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17944OooooOO) {
                setPlaceholderTextEnabled(true);
            }
            this.f17943OooooO0 = charSequence;
        }
        EditText editText = this.f17933OoooO00;
        OooOoo0(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f17946Oooooo = i;
        AppCompatTextView appCompatTextView = this.f17945OooooOo;
        if (appCompatTextView != null) {
            TextViewCompat.OooO0o(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17947Oooooo0 != colorStateList) {
            this.f17947Oooooo0 = colorStateList;
            AppCompatTextView appCompatTextView = this.f17945OooooOo;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        o00O0O o00o0o2 = this.f17929Oooo0oO;
        Objects.requireNonNull(o00o0o2);
        o00o0o2.f18023Oooo0oo = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o00o0o2.f18022Oooo0oO.setText(charSequence);
        o00o0o2.OooO0oO();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        TextViewCompat.OooO0o(this.f17929Oooo0oO.f18022Oooo0oO, i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17929Oooo0oO.f18022Oooo0oO.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f17929Oooo0oO.f18020Oooo.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f17929Oooo0oO.OooO0OO(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17929Oooo0oO.OooO0Oo(onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        o00O0O o00o0o2 = this.f17929Oooo0oO;
        if (o00o0o2.f18026OoooO00 != colorStateList) {
            o00o0o2.f18026OoooO00 = colorStateList;
            OooOo.OooO00o(o00o0o2.f18021Oooo0o, o00o0o2.f18020Oooo, colorStateList, o00o0o2.f18025OoooO0);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00O0O o00o0o2 = this.f17929Oooo0oO;
        if (o00o0o2.f18025OoooO0 != mode) {
            o00o0o2.f18025OoooO0 = mode;
            OooOo.OooO00o(o00o0o2.f18021Oooo0o, o00o0o2.f18020Oooo, o00o0o2.f18026OoooO00, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f17929Oooo0oO.OooO0o0(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f17992o00O0O = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17993o00Oo0.setText(charSequence);
        OooOooo();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        TextViewCompat.OooO0o(this.f17993o00Oo0, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17993o00Oo0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable OooO oooO) {
        EditText editText = this.f17933OoooO00;
        if (editText != null) {
            ViewCompat.OooOo0o(editText, oooO);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f17957o00000O0) {
            this.f17957o00000O0 = typeface;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f17984o0000oo0;
            boolean zOooOOo = oooO0OO.OooOOo(typeface);
            boolean zOooOo0o = oooO0OO.OooOo0o(typeface);
            if (zOooOOo || zOooOo0o) {
                oooO0OO.OooOOO0(false);
            }
            Oooo000 oooo000 = this.f17936OoooOOO;
            if (typeface != oooo000.f17917OooOo0) {
                oooo000.f17917OooOo0 = typeface;
                AppCompatTextView appCompatTextView = oooo000.f17909OooOO0o;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = oooo000.f17914OooOOo;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f17940OoooOoo;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f17961o00000oO.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f17961o00000oO.setImageDrawable(drawable);
        if (drawable != null) {
            OooOo.OooO00o(this, this.f17961o00000oO, this.f17951o0000, this.f17965o0000O00);
            OooOOOo();
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f17929Oooo0oO.OooO00o(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f17929Oooo0oO.OooO0O0(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [boolean, int] */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        ?? r3;
        int i3 = f17926o000Ooo;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i3), attributeSet, i);
        this.f17934OoooO0O = -1;
        this.f17931OoooO = -1;
        this.f17935OoooOO0 = -1;
        this.f17991o000oOoO = -1;
        this.f17936OoooOOO = new Oooo000(this);
        this.f17954o000000O = new Rect();
        this.f17955o000000o = new Rect();
        this.f17952o00000 = new RectF();
        this.f17959o00000Oo = new LinkedHashSet<>();
        this.f17960o00000o0 = 0;
        SparseArray<OooOo00> sparseArray = new SparseArray<>();
        this.f17974o0000Ooo = sparseArray;
        this.f17962o00000oo = new LinkedHashSet<>();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f17984o0000oo0 = oooO0OO;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17928Oooo0o = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f17927Oooo = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f17930Oooo0oo = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f17993o00Oo0 = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        int i4 = p337o0OO0o0.OooOOOO.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i4, (ViewGroup) linearLayout, false);
        this.f17963o0000O = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(i4, (ViewGroup) frameLayout2, false);
        this.f17961o00000oO = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
        oooO0OO.f17254OoooOOO = linearInterpolator;
        oooO0OO.OooOOO0(false);
        oooO0OO.OooOoO(linearInterpolator);
        oooO0OO.OooOOo0(8388659);
        int[] iArr = p337o0OO0o0.Oooo0.TextInputLayout;
        int i5 = p337o0OO0o0.Oooo0.TextInputLayout_counterTextAppearance;
        int i6 = p337o0OO0o0.Oooo0.TextInputLayout_counterOverflowTextAppearance;
        int i7 = p337o0OO0o0.Oooo0.TextInputLayout_errorTextAppearance;
        int i8 = p337o0OO0o0.Oooo0.TextInputLayout_helperTextTextAppearance;
        int i9 = p337o0OO0o0.Oooo0.TextInputLayout_hintTextAppearance;
        o0000O0 o0000o0OooO0o0 = com.google.android.material.internal.o000oOoO.OooO0o0(context2, attributeSet, iArr, i, i3, i5, i6, i7, i8, i9);
        o00O0O o00o0o2 = new o00O0O(this, o0000o0OooO0o0);
        this.f17929Oooo0oO = o00o0o2;
        this.f17994o00Ooo = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_hintEnabled, true);
        setHint(o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_android_hint));
        this.f17950o000 = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_hintAnimationEnabled, true);
        this.f17985o0000ooO = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_expandedHintEnabled, true);
        int i10 = p337o0OO0o0.Oooo0.TextInputLayout_android_minEms;
        if (o0000o0OooO0o0.OooOOOo(i10)) {
            i2 = -1;
            setMinEms(o0000o0OooO0o0.OooOO0(i10, -1));
        } else {
            i2 = -1;
            int i11 = p337o0OO0o0.Oooo0.TextInputLayout_android_minWidth;
            if (o0000o0OooO0o0.OooOOOo(i11)) {
                setMinWidth(o0000o0OooO0o0.OooO0o(i11, -1));
            }
        }
        int i12 = p337o0OO0o0.Oooo0.TextInputLayout_android_maxEms;
        if (o0000o0OooO0o0.OooOOOo(i12)) {
            setMaxEms(o0000o0OooO0o0.OooOO0(i12, i2));
        } else {
            int i13 = p337o0OO0o0.Oooo0.TextInputLayout_android_maxWidth;
            if (o0000o0OooO0o0.OooOOOo(i13)) {
                setMaxWidth(o0000o0OooO0o0.OooO0o(i13, i2));
            }
        }
        this.f18004o0ooOO0 = new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0OO(context2, attributeSet, i, i3));
        this.f18006o0ooOoO = context2.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_textinput_box_label_cutout_padding);
        this.f18002o0Oo0oo = o0000o0OooO0o0.OooO0o0(p337o0OO0o0.Oooo0.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f18008oo0o0Oo = o0000o0OooO0o0.OooO0o(p337o0OO0o0.Oooo0.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_textinput_box_stroke_width_default));
        this.f17999o0O0O00 = o0000o0OooO0o0.OooO0o(p337o0OO0o0.Oooo0.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_textinput_box_stroke_width_focused));
        this.f18000o0OO00O = this.f18008oo0o0Oo;
        float fOooO0Oo = o0000o0OooO0o0.OooO0Oo(p337o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusTopStart);
        float fOooO0Oo2 = o0000o0OooO0o0.OooO0Oo(p337o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusTopEnd);
        float fOooO0Oo3 = o0000o0OooO0o0.OooO0Oo(p337o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusBottomEnd);
        float fOooO0Oo4 = o0000o0OooO0o0.OooO0Oo(p337o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusBottomStart);
        com.google.android.material.shape.OooO00o oooO00o = this.f18004o0ooOO0;
        Objects.requireNonNull(oooO00o);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
        if (fOooO0Oo >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            c0110OooO00o.OooO0o(fOooO0Oo);
        }
        if (fOooO0Oo2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            c0110OooO00o.OooO0oO(fOooO0Oo2);
        }
        if (fOooO0Oo3 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            c0110OooO00o.OooO0o0(fOooO0Oo3);
        }
        if (fOooO0Oo4 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            c0110OooO00o.OooO0Oo(fOooO0Oo4);
        }
        this.f18004o0ooOO0 = new com.google.android.material.shape.OooO00o(c0110OooO00o);
        ColorStateList colorStateListOooO0O0 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, p337o0OO0o0.Oooo0.TextInputLayout_boxBackgroundColor);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.f17977o0000o0O = defaultColor;
            this.f17953o000000 = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.f17978o0000o0o = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.f17975o0000o = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f17980o0000oO0 = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17975o0000o = this.f17977o0000o0O;
                ColorStateList colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(context2, p337o0OO0o0.OooO.mtrl_filled_background_color);
                this.f17978o0000o0o = colorStateListOooO00o.getColorForState(new int[]{-16842910}, -1);
                this.f17980o0000oO0 = colorStateListOooO00o.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f17953o000000 = 0;
            this.f17977o0000o0O = 0;
            this.f17978o0000o0o = 0;
            this.f17975o0000o = 0;
            this.f17980o0000oO0 = 0;
        }
        int i14 = p337o0OO0o0.Oooo0.TextInputLayout_android_textColorHint;
        if (o0000o0OooO0o0.OooOOOo(i14)) {
            ColorStateList colorStateListOooO0OO = o0000o0OooO0o0.OooO0OO(i14);
            this.f17970o0000OOo = colorStateListOooO0OO;
            this.f17969o0000OOO = colorStateListOooO0OO;
        }
        int i15 = p337o0OO0o0.Oooo0.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListOooO0O1 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i15);
        this.f17973o0000OoO = o0000o0OooO0o0.OooO0O0(i15);
        this.f17972o0000Oo0 = o000O000.OooO00o.OooO0O0(context2, p337o0OO0o0.OooO.mtrl_textinput_default_box_stroke_color);
        this.f17981o0000oOO = o000O000.OooO00o.OooO0O0(context2, p337o0OO0o0.OooO.mtrl_textinput_disabled_color);
        this.f17971o0000Oo = o000O000.OooO00o.OooO0O0(context2, p337o0OO0o0.OooO.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O1 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O1);
        }
        int i16 = p337o0OO0o0.Oooo0.TextInputLayout_boxStrokeErrorColor;
        if (o0000o0OooO0o0.OooOOOo(i16)) {
            setBoxStrokeErrorColor(o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i16));
        }
        if (o0000o0OooO0o0.OooOOO0(i9, -1) != -1) {
            r3 = 0;
            setHintTextAppearance(o0000o0OooO0o0.OooOOO0(i9, 0));
        } else {
            r3 = 0;
        }
        int iOooOOO0 = o0000o0OooO0o0.OooOOO0(i7, r3);
        CharSequence charSequenceOooOOOO = o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_errorContentDescription);
        boolean zOooO00o = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_errorEnabled, r3);
        checkableImageButton.setId(p337o0OO0o0.OooOOO0.text_input_error_icon);
        if (o0OOO0O.OooO0OO.OooO0oO(context2)) {
            o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r3);
        }
        int i17 = p337o0OO0o0.Oooo0.TextInputLayout_errorIconTint;
        if (o0000o0OooO0o0.OooOOOo(i17)) {
            this.f17968o0000OO0 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i17);
        }
        int i18 = p337o0OO0o0.Oooo0.TextInputLayout_errorIconTintMode;
        if (o0000o0OooO0o0.OooOOOo(i18)) {
            this.f17967o0000OO = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i18, -1), null);
        }
        int i19 = p337o0OO0o0.Oooo0.TextInputLayout_errorIconDrawable;
        if (o0000o0OooO0o0.OooOOOo(i19)) {
            setErrorIconDrawable(o0000o0OooO0o0.OooO0oO(i19));
        }
        checkableImageButton.setContentDescription(getResources().getText(p337o0OO0o0.OooOo.error_icon_content_description));
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iOooOOO1 = o0000o0OooO0o0.OooOOO0(i8, 0);
        boolean zOooO00o2 = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceOooOOOO2 = o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_helperText);
        int iOooOOO2 = o0000o0OooO0o0.OooOOO0(p337o0OO0o0.Oooo0.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceOooOOOO3 = o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_placeholderText);
        int iOooOOO3 = o0000o0OooO0o0.OooOOO0(p337o0OO0o0.Oooo0.TextInputLayout_suffixTextAppearance, 0);
        CharSequence charSequenceOooOOOO4 = o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_suffixText);
        boolean zOooO00o3 = o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(o0000o0OooO0o0.OooOO0(p337o0OO0o0.Oooo0.TextInputLayout_counterMaxLength, -1));
        this.f17942Ooooo0o = o0000o0OooO0o0.OooOOO0(i5, 0);
        this.f17941Ooooo00 = o0000o0OooO0o0.OooOOO0(i6, 0);
        setBoxBackgroundMode(o0000o0OooO0o0.OooOO0(p337o0OO0o0.Oooo0.TextInputLayout_boxBackgroundMode, 0));
        if (o0OOO0O.OooO0OO.OooO0oO(context2)) {
            o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iOooOOO4 = o0000o0OooO0o0.OooOOO0(p337o0OO0o0.Oooo0.TextInputLayout_endIconDrawable, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.OooO(this, iOooOOO4));
        sparseArray.append(0, new o000oOoO(this));
        sparseArray.append(1, new o0OoOo0(this, iOooOOO4 == 0 ? o0000o0OooO0o0.OooOOO0(p337o0OO0o0.Oooo0.TextInputLayout_passwordToggleDrawable, 0) : iOooOOO4));
        sparseArray.append(2, new com.google.android.material.textfield.OooO00o(this, iOooOOO4));
        sparseArray.append(3, new com.google.android.material.textfield.OooOO0O(this, iOooOOO4));
        int i20 = p337o0OO0o0.Oooo0.TextInputLayout_passwordToggleEnabled;
        if (!o0000o0OooO0o0.OooOOOo(i20)) {
            int i21 = p337o0OO0o0.Oooo0.TextInputLayout_endIconTint;
            if (o0000o0OooO0o0.OooOOOo(i21)) {
                this.f17951o0000 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i21);
            }
            int i22 = p337o0OO0o0.Oooo0.TextInputLayout_endIconTintMode;
            if (o0000o0OooO0o0.OooOOOo(i22)) {
                this.f17965o0000O00 = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i22, -1), null);
            }
        }
        int i23 = p337o0OO0o0.Oooo0.TextInputLayout_endIconMode;
        if (o0000o0OooO0o0.OooOOOo(i23)) {
            setEndIconMode(o0000o0OooO0o0.OooOO0(i23, 0));
            int i24 = p337o0OO0o0.Oooo0.TextInputLayout_endIconContentDescription;
            if (o0000o0OooO0o0.OooOOOo(i24)) {
                setEndIconContentDescription(o0000o0OooO0o0.OooOOOO(i24));
            }
            setEndIconCheckable(o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_endIconCheckable, true));
        } else if (o0000o0OooO0o0.OooOOOo(i20)) {
            int i25 = p337o0OO0o0.Oooo0.TextInputLayout_passwordToggleTint;
            if (o0000o0OooO0o0.OooOOOo(i25)) {
                this.f17951o0000 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i25);
            }
            int i26 = p337o0OO0o0.Oooo0.TextInputLayout_passwordToggleTintMode;
            if (o0000o0OooO0o0.OooOOOo(i26)) {
                this.f17965o0000O00 = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i26, -1), null);
            }
            setEndIconMode(o0000o0OooO0o0.OooO00o(i20, false) ? 1 : 0);
            setEndIconContentDescription(o0000o0OooO0o0.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_passwordToggleContentDescription));
        }
        appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ViewCompat.OooOO0O.OooO0o(appCompatTextView, 1);
        setErrorContentDescription(charSequenceOooOOOO);
        setCounterOverflowTextAppearance(this.f17941Ooooo00);
        setHelperTextTextAppearance(iOooOOO1);
        setErrorTextAppearance(iOooOOO0);
        setCounterTextAppearance(this.f17942Ooooo0o);
        setPlaceholderText(charSequenceOooOOOO3);
        setPlaceholderTextAppearance(iOooOOO2);
        setSuffixTextAppearance(iOooOOO3);
        int i27 = p337o0OO0o0.Oooo0.TextInputLayout_errorTextColor;
        if (o0000o0OooO0o0.OooOOOo(i27)) {
            setErrorTextColor(o0000o0OooO0o0.OooO0OO(i27));
        }
        int i28 = p337o0OO0o0.Oooo0.TextInputLayout_helperTextTextColor;
        if (o0000o0OooO0o0.OooOOOo(i28)) {
            setHelperTextColor(o0000o0OooO0o0.OooO0OO(i28));
        }
        int i29 = p337o0OO0o0.Oooo0.TextInputLayout_hintTextColor;
        if (o0000o0OooO0o0.OooOOOo(i29)) {
            setHintTextColor(o0000o0OooO0o0.OooO0OO(i29));
        }
        int i30 = p337o0OO0o0.Oooo0.TextInputLayout_counterTextColor;
        if (o0000o0OooO0o0.OooOOOo(i30)) {
            setCounterTextColor(o0000o0OooO0o0.OooO0OO(i30));
        }
        int i31 = p337o0OO0o0.Oooo0.TextInputLayout_counterOverflowTextColor;
        if (o0000o0OooO0o0.OooOOOo(i31)) {
            setCounterOverflowTextColor(o0000o0OooO0o0.OooO0OO(i31));
        }
        int i32 = p337o0OO0o0.Oooo0.TextInputLayout_placeholderTextColor;
        if (o0000o0OooO0o0.OooOOOo(i32)) {
            setPlaceholderTextColor(o0000o0OooO0o0.OooO0OO(i32));
        }
        int i33 = p337o0OO0o0.Oooo0.TextInputLayout_suffixTextColor;
        if (o0000o0OooO0o0.OooOOOo(i33)) {
            setSuffixTextColor(o0000o0OooO0o0.OooO0OO(i33));
        }
        setEnabled(o0000o0OooO0o0.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_android_enabled, true));
        o0000o0OooO0o0.OooOOoo();
        ViewCompat.OooO0o.OooOOoo(this, 2);
        int i34 = Build.VERSION.SDK_INT;
        if (i34 >= 26 && i34 >= 26) {
            ViewCompat.OooOo.OooOO0o(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(o00o0o2);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zOooO00o2);
        setErrorEnabled(zOooO00o);
        setCounterEnabled(zOooO00o3);
        setHelperText(charSequenceOooOOOO2);
        setSuffixText(charSequenceOooOOOO4);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f17963o0000O.setImageDrawable(drawable);
        OooOoO0();
        OooOo.OooO00o(this, this.f17963o0000O, this.f17968o0000OO0, this.f17967o0000OO);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f17961o00000oO.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f17961o00000oO.setImageDrawable(drawable);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
