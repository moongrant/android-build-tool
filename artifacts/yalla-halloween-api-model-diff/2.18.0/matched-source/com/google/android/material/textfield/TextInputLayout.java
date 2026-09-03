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
import androidx.appcompat.widget.o0ooOOo;
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
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p396o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public static final int f17945o000O00 = p338o0OO0o0.Oooo000.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17946Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public EditText f17947OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f17948OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final o00O0O f17949OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17950OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public CharSequence f17951OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f17952OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f17953OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f17954OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Oooo000 f17955OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f17956OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f17957Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f17958Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17959OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f17960OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f17961OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f17962Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public CharSequence f17963Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public AppCompatTextView f17964OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17965Ooooooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public boolean f17966o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public final SparseArray<OooOo00> f17967o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @ColorInt
    public int f17968o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public int f17969o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f17970o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @ColorInt
    public int f17971o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final Rect f17972o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public final Rect f17973o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final RectF f17974o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public Typeface f17975o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17976o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final LinkedHashSet<OooOO0> f17977o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public int f17978o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public Drawable f17979o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public PorterDuff.Mode f17980o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17981o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    @Nullable
    public ColorDrawable f17982o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public View.OnLongClickListener f17983o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public View.OnLongClickListener f17984o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17985o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public ColorStateList f17986o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public ColorStateList f17987o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public PorterDuff.Mode f17988o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public ColorStateList f17989o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public int f17990o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public ColorStateList f17991o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    @ColorInt
    public int f17992o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    @ColorInt
    public int f17993o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    @ColorInt
    public int f17994o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public ColorStateList f17995o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    @ColorInt
    public int f17996o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    @ColorInt
    public int f17997o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    @ColorInt
    public int f17998o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public final LinkedHashSet<OooOO0O> f17999o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    @ColorInt
    public int f18000o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    @ColorInt
    public int f18001o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0OO f18002o000O000;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public boolean f18003o000O0O;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public boolean f18004o000O0o;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public int f18005o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f18006o000OOo;

    /* JADX INFO: renamed from: o000Oo0, reason: collision with root package name */
    public boolean f18007o000Oo0;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public boolean f18008o000OoO;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public ValueAnimator f18009o000Ooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f18010o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public Fade f18011o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f18012o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f18013o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @Nullable
    public CharSequence f18014o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f18015o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public CharSequence f18016o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f18017o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f18018o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public final int f18019o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO00o f18020o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f18021o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f18022o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18023o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18024o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f18025o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f18026oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f18027oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public Fade f18028ooOO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public static class OooO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextInputLayout f18029OooO0Oo;

        public OooO(@NonNull TextInputLayout textInputLayout) {
            this.f18029OooO0Oo = textInputLayout;
        }

        @Override // androidx.core.view.OooO00o
        public void OooO0Oo(@NonNull View view, @NonNull o0000OO0 o0000oo1) {
            this.f7877OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28214OooO00o);
            EditText editText = this.f18029OooO0Oo.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f18029OooO0Oo.getHint();
            CharSequence error = this.f18029OooO0Oo.getError();
            CharSequence placeholderText = this.f18029OooO0Oo.getPlaceholderText();
            int counterMaxLength = this.f18029OooO0Oo.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f18029OooO0Oo.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f18029OooO0Oo.f17966o000;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            o00O0O o00o0o2 = this.f18029OooO0Oo.f17949OoooO00;
            if (o00o0o2.f18042OoooO00.getVisibility() == 0) {
                o0000oo1.f28214OooO00o.setLabelFor(o00o0o2.f18042OoooO00);
                o0000oo1.OooooOO(o00o0o2.f18042OoooO00);
            } else {
                o0000oo1.OooooOO(o00o0o2.f18043OoooO0O);
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
            o0000oo1.f28214OooO00o.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                o0000oo1.f28214OooO00o.setError(error);
            }
            AppCompatTextView appCompatTextView = this.f18029OooO0Oo.f17955OoooOoO.f17933OooOOo;
            if (appCompatTextView != null) {
                o0000oo1.f28214OooO00o.setLabelFor(appCompatTextView);
            }
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.OooOoOO(!textInputLayout.f18007o000Oo0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f17956OoooOoo) {
                textInputLayout2.OooOo00(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f17962Oooooo) {
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
            TextInputLayout.this.f17981o0000O00.performClick();
            TextInputLayout.this.f17981o0000O00.jumpDrawablesToCurrentState();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f17947OoooO.requestLayout();
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f18002o000O000.OooOo(((Float) valueAnimator.getAnimatedValue()).floatValue());
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

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @Nullable
        public CharSequence f18034OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @Nullable
        public CharSequence f18035OoooO0;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f18036OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @Nullable
        public CharSequence f18037OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @Nullable
        public CharSequence f18038o000oOoO;

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
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("TextInputLayout.SavedState{");
            sbOooO0O0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0O0.append(" error=");
            sbOooO0O0.append((Object) this.f18035OoooO0);
            sbOooO0O0.append(" hint=");
            sbOooO0O0.append((Object) this.f18034OoooO);
            sbOooO0O0.append(" helperText=");
            sbOooO0O0.append((Object) this.f18037OoooOO0);
            sbOooO0O0.append(" placeholderText=");
            sbOooO0O0.append((Object) this.f18038o000oOoO);
            sbOooO0O0.append("}");
            return sbOooO0O0.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8042Oooo, i);
            TextUtils.writeToParcel(this.f18035OoooO0, parcel, i);
            parcel.writeInt(this.f18036OoooO0O ? 1 : 0);
            TextUtils.writeToParcel(this.f18034OoooO, parcel, i);
            TextUtils.writeToParcel(this.f18037OoooOO0, parcel, i);
            TextUtils.writeToParcel(this.f18038o000oOoO, parcel, i);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18035OoooO0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18036OoooO0O = parcel.readInt() == 1;
            this.f18034OoooO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18037OoooOO0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18038o000oOoO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
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
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
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
        OooOo00 oooOo00 = this.f17967o0000.get(this.f17978o00000oo);
        return oooOo00 != null ? oooOo00 : this.f17967o0000.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f17985o0000OOO.getVisibility() == 0) {
            return this.f17985o0000OOO;
        }
        if (OooO() && OooOO0O()) {
            return this.f17981o0000O00;
        }
        return null;
    }

    private void setEditText(EditText editText) {
        if (this.f17947OoooO != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f17978o00000oo != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17947OoooO = editText;
        int i = this.f18010o000oOoO;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f17953OoooOOo);
        }
        int i2 = this.f17952OoooOOO;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f17954OoooOo0);
        }
        OooOOO0();
        setTextInputAccessibilityDelegate(new OooO(this));
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
        Typeface typeface = this.f17947OoooO.getTypeface();
        boolean zOooOOo = oooO0OO.OooOOo(typeface);
        boolean zOooOo0o = oooO0OO.OooOo0o(typeface);
        if (zOooOOo || zOooOo0o) {
            oooO0OO.OooOOO0(false);
        }
        com.google.android.material.internal.OooO0OO oooO0OO2 = this.f18002o000O000;
        float textSize = this.f17947OoooO.getTextSize();
        if (oooO0OO2.f17239OooOOO0 != textSize) {
            oooO0OO2.f17239OooOOO0 = textSize;
            oooO0OO2.OooOOO0(false);
        }
        com.google.android.material.internal.OooO0OO oooO0OO3 = this.f18002o000O000;
        float letterSpacing = this.f17947OoooO.getLetterSpacing();
        if (oooO0OO3.f17284Oooooo0 != letterSpacing) {
            oooO0OO3.f17284Oooooo0 = letterSpacing;
            oooO0OO3.OooOOO0(false);
        }
        int gravity = this.f17947OoooO.getGravity();
        this.f18002o000O000.OooOOo0((gravity & PayError.ERROR_PARAMS_IS_NULL) | 48);
        this.f18002o000O000.OooOo0O(gravity);
        this.f17947OoooO.addTextChangedListener(new OooO00o());
        if (this.f17987o0000Oo == null) {
            this.f17987o0000Oo = this.f17947OoooO.getHintTextColors();
        }
        if (this.f18026oo000o) {
            if (TextUtils.isEmpty(this.f18016o00oO0o)) {
                CharSequence hint = this.f17947OoooO.getHint();
                this.f17951OoooOO0 = hint;
                setHint(hint);
                this.f17947OoooO.setHint((CharSequence) null);
            }
            this.f18015o00oO0O = true;
        }
        if (this.f17959OooooO0 != null) {
            OooOo00(this.f17947OoooO.getText().length());
        }
        OooOo0o();
        this.f17955OoooOoO.OooO0O0();
        this.f17949OoooO00.bringToFront();
        this.f17948OoooO0.bringToFront();
        this.f17950OoooO0O.bringToFront();
        this.f17985o0000OOO.bringToFront();
        Iterator<OooOO0> it = this.f17977o00000oO.iterator();
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
        if (TextUtils.equals(charSequence, this.f18016o00oO0o)) {
            return;
        }
        this.f18016o00oO0o = charSequence;
        this.f18002o000O000.OooOoo0(charSequence);
        if (this.f17966o000) {
            return;
        }
        OooOOO();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f17962Oooooo == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.f17964OoooooO;
            if (appCompatTextView != null) {
                this.f17946Oooo.addView(appCompatTextView);
                this.f17964OoooooO.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f17964OoooooO;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f17964OoooooO = null;
        }
        this.f17962Oooooo = z;
    }

    public final boolean OooO() {
        return this.f17978o00000oo != 0;
    }

    public final void OooO00o(@NonNull OooOO0 oooOO1) {
        this.f17977o00000oO.add(oooOO1);
        if (this.f17947OoooO != null) {
            oooOO1.OooO00o(this);
        }
    }

    public final void OooO0O0(@NonNull OooOO0O oooOO0O) {
        this.f17999o0000oo.add(oooOO0O);
    }

    @VisibleForTesting
    public final void OooO0OO(float f) {
        if (this.f18002o000O000.f17229OooO0OO == f) {
            return;
        }
        if (this.f18009o000Ooo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18009o000Ooo = valueAnimator;
            valueAnimator.setInterpolator(p339o0OO0o0O.OooO0o.f37993OooO0O0);
            this.f18009o000Ooo.setDuration(167L);
            this.f18009o000Ooo.addUpdateListener(new OooO0o());
        }
        this.f18009o000Ooo.setFloatValues(this.f18002o000O000.f17229OooO0OO, f);
        this.f18009o000Ooo.start();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    public final void OooO0Oo() {
        boolean z;
        MaterialShapeDrawable materialShapeDrawable = this.f18023o0ooOO0;
        if (materialShapeDrawable == null) {
            return;
        }
        com.google.android.material.shape.OooO00o oooO00o = materialShapeDrawable.f17528Oooo.f17553OooO00o;
        com.google.android.material.shape.OooO00o oooO00o2 = this.f18020o0OOO0o;
        boolean z2 = false;
        if (oooO00o != oooO00o2) {
            materialShapeDrawable.setShapeAppearanceModel(oooO00o2);
            if (this.f17978o00000oo == 3 && this.f18027oo0o0Oo == 2) {
                com.google.android.material.textfield.OooOO0O oooOO0O = (com.google.android.material.textfield.OooOO0O) this.f17967o0000.get(3);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f17947OoooO;
                Objects.requireNonNull(oooOO0O);
                if (!(autoCompleteTextView.getKeyListener() != null) && oooOO0O.f17912OooO00o.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
                    oooOO0O.OooO(autoCompleteTextView);
                }
            }
        }
        if (this.f18027oo0o0Oo != 2) {
            z = false;
        } else {
            if (this.f18006o000OOo > -1 && this.f17971o000000o != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f18023o0ooOO0.OooOo0(this.f18006o000OOo, this.f17971o000000o);
        }
        int iOooO0O0 = this.f17968o00000;
        if (this.f18027oo0o0Oo == 1) {
            iOooO0O0 = p071o000O0o.OooO0o.OooO0O0(this.f17968o00000, o0O0000O.OooO0O0(getContext(), p338o0OO0o0.OooO0o.colorSurface, 0));
        }
        this.f17968o00000 = iOooO0O0;
        this.f18023o0ooOO0.OooOOOo(ColorStateList.valueOf(iOooO0O0));
        if (this.f17978o00000oo == 3) {
            this.f17947OoooO.getBackground().invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f18024o0ooOOo;
        if (materialShapeDrawable2 != null && this.f18025o0ooOoO != null) {
            if (this.f18006o000OOo > -1 && this.f17971o000000o != 0) {
                z2 = true;
            }
            if (z2) {
                materialShapeDrawable2.OooOOOo(this.f17947OoooO.isFocused() ? ColorStateList.valueOf(this.f17992o0000o0) : ColorStateList.valueOf(this.f17971o000000o));
                this.f18025o0ooOoO.OooOOOo(ColorStateList.valueOf(this.f17971o000000o));
            }
            invalidate();
        }
        invalidate();
    }

    public final boolean OooO0o() {
        return this.f18026oo000o && !TextUtils.isEmpty(this.f18016o00oO0o) && (this.f18023o0ooOO0 instanceof com.google.android.material.textfield.OooOO0);
    }

    public final int OooO0o0() {
        float fOooO0oO;
        if (!this.f18026oo000o) {
            return 0;
        }
        int i = this.f18027oo0o0Oo;
        if (i == 0) {
            fOooO0oO = this.f18002o000O000.OooO0oO();
        } else {
            if (i != 2) {
                return 0;
            }
            fOooO0oO = this.f18002o000O000.OooO0oO() / 2.0f;
        }
        return (int) fOooO0oO;
    }

    public final int OooO0oO(int i, boolean z) {
        int compoundPaddingLeft = this.f17947OoooO.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int OooO0oo(int i, boolean z) {
        int compoundPaddingRight = i - this.f17947OoooO.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void OooOO0() {
        AppCompatTextView appCompatTextView = this.f17964OoooooO;
        if (appCompatTextView == null || !this.f17962Oooooo) {
            return;
        }
        appCompatTextView.setText((CharSequence) null);
        androidx.transition.OooOO0.OooO00o(this.f17946Oooo, this.f18011o00O0O);
        this.f17964OoooooO.setVisibility(4);
    }

    public final boolean OooOO0O() {
        return this.f17950OoooO0O.getVisibility() == 0 && this.f17981o0000O00.getVisibility() == 0;
    }

    public final boolean OooOO0o() {
        return this.f17985o0000OOO.getVisibility() == 0;
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
            RectF rectF = this.f17974o00000OO;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
            int width = this.f17947OoooO.getWidth();
            int gravity = this.f17947OoooO.getGravity();
            boolean zOooO0O0 = oooO0OO.OooO0O0(oooO0OO.f17260Oooo00O);
            oooO0OO.f17258Oooo0 = zOooO0O0;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    Rect rect = oooO0OO.f17226OooO;
                    if (zOooO0O0) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = oooO0OO.f17286Ooooooo;
                    }
                } else {
                    Rect rect2 = oooO0OO.f17226OooO;
                    if (zOooO0O0) {
                        f = rect2.right;
                        f2 = oooO0OO.f17286Ooooooo;
                    } else {
                        i2 = rect2.left;
                        f3 = i2;
                    }
                }
                rectF.left = f3;
                Rect rect3 = oooO0OO.f17226OooO;
                float f5 = rect3.top;
                rectF.top = f5;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (oooO0OO.f17286Ooooooo / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zOooO0O0) {
                        f4 = oooO0OO.f17286Ooooooo + f3;
                    } else {
                        i = rect3.right;
                        f4 = i;
                    }
                } else if (zOooO0O0) {
                    i = rect3.right;
                    f4 = i;
                } else {
                    f4 = oooO0OO.f17286Ooooooo + f3;
                }
                rectF.right = f4;
                rectF.bottom = oooO0OO.OooO0oO() + f5;
                float f6 = rectF.left;
                float f7 = this.f18019o0OO00O;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18006o000OOo);
                com.google.android.material.textfield.OooOO0 oooOO1 = (com.google.android.material.textfield.OooOO0) this.f18023o0ooOO0;
                Objects.requireNonNull(oooOO1);
                oooOO1.OooOoo0(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            f2 = oooO0OO.f17286Ooooooo / 2.0f;
            f3 = f - f2;
            rectF.left = f3;
            Rect rect4 = oooO0OO.f17226OooO;
            float f8 = rect4.top;
            rectF.top = f8;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (oooO0OO.f17286Ooooooo / 2.0f);
            } else {
                f4 = (width / 2.0f) + (oooO0OO.f17286Ooooooo / 2.0f);
            }
            rectF.right = f4;
            rectF.bottom = oooO0OO.OooO0oO() + f8;
            float f9 = rectF.left;
            float f10 = this.f18019o0OO00O;
            rectF.left = f9 - f10;
            rectF.right += f10;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f18006o000OOo);
            com.google.android.material.textfield.OooOO0 oooOO2 = (com.google.android.material.textfield.OooOO0) this.f18023o0ooOO0;
            Objects.requireNonNull(oooOO2);
            oooOO2.OooOoo0(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void OooOOO0() {
        int i = this.f18027oo0o0Oo;
        if (i == 0) {
            this.f18023o0ooOO0 = null;
            this.f18024o0ooOOo = null;
            this.f18025o0ooOoO = null;
        } else if (i == 1) {
            this.f18023o0ooOO0 = new MaterialShapeDrawable(this.f18020o0OOO0o);
            this.f18024o0ooOOo = new MaterialShapeDrawable();
            this.f18025o0ooOoO = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(OooO0o.OooO0OO.OooO0O0(new StringBuilder(), this.f18027oo0o0Oo, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f18026oo000o || (this.f18023o0ooOO0 instanceof com.google.android.material.textfield.OooOO0)) {
                this.f18023o0ooOO0 = new MaterialShapeDrawable(this.f18020o0OOO0o);
            } else {
                this.f18023o0ooOO0 = new com.google.android.material.textfield.OooOO0(this.f18020o0OOO0o);
            }
            this.f18024o0ooOOo = null;
            this.f18025o0ooOoO = null;
        }
        EditText editText = this.f17947OoooO;
        if ((editText == null || this.f18023o0ooOO0 == null || editText.getBackground() != null || this.f18027oo0o0Oo == 0) ? false : true) {
            EditText editText2 = this.f17947OoooO;
            MaterialShapeDrawable materialShapeDrawable = this.f18023o0ooOO0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            ViewCompat.OooO0o.OooOOo0(editText2, materialShapeDrawable);
        }
        Oooo000();
        if (this.f18027oo0o0Oo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f18018o0O0O00 = getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_font_2_0_box_collapsed_padding_top);
            } else if (o0OOO0O.OooO0OO.OooO0oO(getContext())) {
                this.f18018o0O0O00 = getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f17947OoooO != null && this.f18027oo0o0Oo == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f17947OoooO;
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7885OooO00o;
                ViewCompat.OooO.OooOO0O(editText3, ViewCompat.OooO.OooO0o(editText3), getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_filled_edittext_font_2_0_padding_top), ViewCompat.OooO.OooO0o0(this.f17947OoooO), getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_filled_edittext_font_2_0_padding_bottom));
            } else if (o0OOO0O.OooO0OO.OooO0oO(getContext())) {
                EditText editText4 = this.f17947OoooO;
                WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7885OooO00o;
                ViewCompat.OooO.OooOO0O(editText4, ViewCompat.OooO.OooO0o(editText4), getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_filled_edittext_font_1_3_padding_top), ViewCompat.OooO.OooO0o0(this.f17947OoooO), getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f18027oo0o0Oo != 0) {
            OooOoO();
        }
    }

    public final void OooOOOo() {
        OooOo.OooO0OO(this, this.f17981o0000O00, this.f17995o0000oO);
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
            TextViewCompat.OooO0o(textView, p338o0OO0o0.Oooo000.TextAppearance_AppCompat_Caption);
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), p338o0OO0o0.OooO.design_error));
        }
    }

    public final void OooOOoo() {
        if (this.f17959OooooO0 != null) {
            EditText editText = this.f17947OoooO;
            OooOo00(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void OooOo() {
        this.f17950OoooO0O.setVisibility((this.f17981o0000O00.getVisibility() != 0 || OooOO0o()) ? 8 : 0);
        this.f17948OoooO0.setVisibility(OooOO0O() || OooOO0o() || ((this.f18014o00o0O == null || this.f17966o000) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public final void OooOo0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f17959OooooO0;
        if (appCompatTextView != null) {
            OooOOo(appCompatTextView, this.f17958Ooooo0o ? this.f17960OooooOO : this.f17961OooooOo);
            if (!this.f17958Ooooo0o && (colorStateList2 = this.f18012o00Oo0) != null) {
                this.f17959OooooO0.setTextColor(colorStateList2);
            }
            if (!this.f17958Ooooo0o || (colorStateList = this.f18013o00Ooo) == null) {
                return;
            }
            this.f17959OooooO0.setTextColor(colorStateList);
        }
    }

    public final void OooOo00(int i) {
        boolean z = this.f17958Ooooo0o;
        int i2 = this.f17957Ooooo00;
        if (i2 == -1) {
            this.f17959OooooO0.setText(String.valueOf(i));
            this.f17959OooooO0.setContentDescription(null);
            this.f17958Ooooo0o = false;
        } else {
            this.f17958Ooooo0o = i > i2;
            Context context = getContext();
            this.f17959OooooO0.setContentDescription(context.getString(this.f17958Ooooo0o ? p338o0OO0o0.OooOo.character_counter_overflowed_content_description : p338o0OO0o0.OooOo.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f17957Ooooo00)));
            if (z != this.f17958Ooooo0o) {
                OooOo0();
            }
            o000O0Oo.OooO00o oooO00oOooO0OO = o000O0Oo.OooO00o.OooO0OO();
            AppCompatTextView appCompatTextView = this.f17959OooooO0;
            String string = getContext().getString(p338o0OO0o0.OooOo.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f17957Ooooo00));
            appCompatTextView.setText(string != null ? ((SpannableStringBuilder) oooO00oOooO0OO.OooO0Oo(string, oooO00oOooO0OO.f28164OooO0OO)).toString() : null);
        }
        if (this.f17947OoooO == null || z == this.f17958Ooooo0o) {
            return;
        }
        OooOoOO(false, false);
        Oooo000();
        OooOo0o();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public final boolean OooOo0O() {
        boolean z;
        if (this.f17947OoooO == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f17949OoooO00.getMeasuredWidth() > 0) {
            int measuredWidth = this.f17949OoooO00.getMeasuredWidth() - this.f17947OoooO.getPaddingLeft();
            if (this.f17976o00000o0 == null || this.f17990o0000Ooo != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17976o00000o0 = colorDrawable;
                this.f17990o0000Ooo = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrOooO00o = TextViewCompat.OooO0O0.OooO00o(this.f17947OoooO);
            Drawable drawable = drawableArrOooO00o[0];
            ColorDrawable colorDrawable2 = this.f17976o00000o0;
            if (drawable != colorDrawable2) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17947OoooO, colorDrawable2, drawableArrOooO00o[1], drawableArrOooO00o[2], drawableArrOooO00o[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f17976o00000o0 != null) {
            Drawable[] drawableArrOooO00o2 = TextViewCompat.OooO0O0.OooO00o(this.f17947OoooO);
            TextViewCompat.OooO0O0.OooO0o0(this.f17947OoooO, null, drawableArrOooO00o2[1], drawableArrOooO00o2[2], drawableArrOooO00o2[3]);
            this.f17976o00000o0 = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.f17985o0000OOO.getVisibility() == 0 || ((OooO() && OooOO0O()) || this.f18014o00o0O != null)) && this.f17948OoooO0.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f18017o00ooo.getMeasuredWidth() - this.f17947OoooO.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = o000O0O0.OooOO0.OooO0OO((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrOooO00o3 = TextViewCompat.OooO0O0.OooO00o(this.f17947OoooO);
            ColorDrawable colorDrawable3 = this.f17982o0000O0O;
            if (colorDrawable3 == null || this.f18005o000OO == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f17982o0000O0O = colorDrawable4;
                    this.f18005o000OO = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrOooO00o3[2];
                ColorDrawable colorDrawable5 = this.f17982o0000O0O;
                if (drawable2 != colorDrawable5) {
                    this.f17979o0000O = drawableArrOooO00o3[2];
                    TextViewCompat.OooO0O0.OooO0o0(this.f17947OoooO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], colorDrawable5, drawableArrOooO00o3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f18005o000OO = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.OooO0O0.OooO0o0(this.f17947OoooO, drawableArrOooO00o3[0], drawableArrOooO00o3[1], this.f17982o0000O0O, drawableArrOooO00o3[3]);
            }
        } else {
            if (this.f17982o0000O0O == null) {
                return z;
            }
            Drawable[] drawableArrOooO00o4 = TextViewCompat.OooO0O0.OooO00o(this.f17947OoooO);
            if (drawableArrOooO00o4[2] == this.f17982o0000O0O) {
                TextViewCompat.OooO0O0.OooO0o0(this.f17947OoooO, drawableArrOooO00o4[0], drawableArrOooO00o4[1], this.f17979o0000O, drawableArrOooO00o4[3]);
            } else {
                z2 = z;
            }
            this.f17982o0000O0O = null;
        }
        return z2;
    }

    public final void OooOo0o() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f17947OoooO;
        if (editText == null || this.f18027oo0o0Oo != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = o0ooOOo.f5493OooO00o;
        Drawable drawableMutate = background.mutate();
        if (this.f17955OoooOoO.OooO0o0()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(this.f17955OoooOoO.OooO0oO(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17958Ooooo0o && (appCompatTextView = this.f17959OooooO0) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            o0OOO0o.OooO00o(drawableMutate);
            this.f17947OoooO.refreshDrawableState();
        }
    }

    public final void OooOoO() {
        if (this.f18027oo0o0Oo != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17946Oooo.getLayoutParams();
            int iOooO0o0 = OooO0o0();
            if (iOooO0o0 != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0o0;
                this.f17946Oooo.requestLayout();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final void OooOoO0() {
        boolean z;
        if (getErrorIconDrawable() != null) {
            Oooo000 oooo000 = this.f17955OoooOoO;
            if (oooo000.f17927OooOO0O && oooo000.OooO0o0()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f17985o0000OOO.setVisibility(z ? 0 : 8);
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
        EditText editText = this.f17947OoooO;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17947OoooO;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zOooO0o0 = this.f17955OoooOoO.OooO0o0();
        ColorStateList colorStateList2 = this.f17987o0000Oo;
        if (colorStateList2 != null) {
            this.f18002o000O000.OooOOOo(colorStateList2);
            this.f18002o000O000.OooOo0(this.f17987o0000Oo);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f17987o0000Oo;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f18001o0000ooO) : this.f18001o0000ooO;
            this.f18002o000O000.OooOOOo(ColorStateList.valueOf(colorForState));
            this.f18002o000O000.OooOo0(ColorStateList.valueOf(colorForState));
        } else if (zOooO0o0) {
            com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
            AppCompatTextView appCompatTextView2 = this.f17955OoooOoO.f17928OooOO0o;
            oooO0OO.OooOOOo(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f17958Ooooo0o && (appCompatTextView = this.f17959OooooO0) != null) {
            this.f18002o000O000.OooOOOo(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f17989o0000OoO) != null) {
            this.f18002o000O000.OooOOOo(colorStateList);
        }
        if (z3 || !this.f18008o000OoO || (isEnabled() && z4)) {
            if (z2 || this.f17966o000) {
                ValueAnimator valueAnimator = this.f18009o000Ooo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f18009o000Ooo.cancel();
                }
                if (z && this.f18004o000O0o) {
                    OooO0OO(1.0f);
                } else {
                    this.f18002o000O000.OooOo(1.0f);
                }
                this.f17966o000 = false;
                if (OooO0o()) {
                    OooOOO();
                }
                EditText editText3 = this.f17947OoooO;
                OooOoo0(editText3 == null ? 0 : editText3.getText().length());
                o00O0O o00o0o2 = this.f17949OoooO00;
                o00o0o2.f18045OoooOOO = false;
                o00o0o2.OooO0oO();
                OooOooo();
                return;
            }
            return;
        }
        if (z2 || !this.f17966o000) {
            ValueAnimator valueAnimator2 = this.f18009o000Ooo;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f18009o000Ooo.cancel();
            }
            if (z && this.f18004o000O0o) {
                OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                this.f18002o000O000.OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            if (OooO0o() && (!((com.google.android.material.textfield.OooOO0) this.f18023o0ooOO0).f17879o00Ooo.isEmpty()) && OooO0o()) {
                ((com.google.android.material.textfield.OooOO0) this.f18023o0ooOO0).OooOoo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            this.f17966o000 = true;
            OooOO0();
            o00O0O o00o0o3 = this.f17949OoooO00;
            o00o0o3.f18045OoooOOO = true;
            o00o0o3.OooO0oO();
            OooOooo();
        }
    }

    public final void OooOoo(boolean z, boolean z2) {
        int defaultColor = this.f17991o0000o.getDefaultColor();
        int colorForState = this.f17991o0000o.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17991o0000o.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f17971o000000o = colorForState2;
        } else if (z2) {
            this.f17971o000000o = colorForState;
        } else {
            this.f17971o000000o = defaultColor;
        }
    }

    public final void OooOoo0(int i) {
        if (i != 0 || this.f17966o000) {
            OooOO0();
            return;
        }
        if (this.f17964OoooooO == null || !this.f17962Oooooo || TextUtils.isEmpty(this.f17963Oooooo0)) {
            return;
        }
        this.f17964OoooooO.setText(this.f17963Oooooo0);
        androidx.transition.OooOO0.OooO00o(this.f17946Oooo, this.f18028ooOO);
        this.f17964OoooooO.setVisibility(0);
        this.f17964OoooooO.bringToFront();
        announceForAccessibility(this.f17963Oooooo0);
    }

    public final void OooOooO() {
        int iOooO0o0;
        if (this.f17947OoooO == null) {
            return;
        }
        if (OooOO0O() || OooOO0o()) {
            iOooO0o0 = 0;
        } else {
            EditText editText = this.f17947OoooO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            iOooO0o0 = ViewCompat.OooO.OooO0o0(editText);
        }
        AppCompatTextView appCompatTextView = this.f18017o00ooo;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f17947OoooO.getPaddingTop();
        int paddingBottom = this.f17947OoooO.getPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7885OooO00o;
        ViewCompat.OooO.OooOO0O(appCompatTextView, dimensionPixelSize, paddingTop, iOooO0o0, paddingBottom);
    }

    public final void OooOooo() {
        int visibility = this.f18017o00ooo.getVisibility();
        int i = (this.f18014o00o0O == null || this.f17966o000) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().OooO0OO(i == 0);
        }
        OooOo();
        this.f18017o00ooo.setVisibility(i);
        OooOo0O();
    }

    public final void Oooo000() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f18023o0ooOO0 == null || this.f18027oo0o0Oo == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f17947OoooO) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f17947OoooO) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f17971o000000o = this.f18001o0000ooO;
        } else if (this.f17955OoooOoO.OooO0o0()) {
            if (this.f17991o0000o != null) {
                OooOoo(z2, z);
            } else {
                this.f17971o000000o = this.f17955OoooOoO.OooO0oO();
            }
        } else if (!this.f17958Ooooo0o || (appCompatTextView = this.f17959OooooO0) == null) {
            if (z2) {
                this.f17971o000000o = this.f17994o0000o0o;
            } else if (z) {
                this.f17971o000000o = this.f17993o0000o0O;
            } else {
                this.f17971o000000o = this.f17992o0000o0;
            }
        } else if (this.f17991o0000o != null) {
            OooOoo(z2, z);
        } else {
            this.f17971o000000o = appCompatTextView.getCurrentTextColor();
        }
        OooOoO0();
        OooOo.OooO0OO(this, this.f17985o0000OOO, this.f17986o0000OOo);
        o00O0O o00o0o2 = this.f17949OoooO00;
        OooOo.OooO0OO(o00o0o2.f18039Oooo, o00o0o2.f18043OoooO0O, o00o0o2.f18040OoooO);
        OooOOOo();
        OooOo00 endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof com.google.android.material.textfield.OooOO0O) {
            if (!this.f17955OoooOoO.OooO0o0() || getEndIconDrawable() == null) {
                OooOo.OooO00o(this, this.f17981o0000O00, this.f17995o0000oO, this.f17980o0000O0);
            } else {
                Drawable drawableMutate = o0OOO0o.OooO0o0(getEndIconDrawable()).mutate();
                o0OOO0o.OooO0O0.OooO0oO(drawableMutate, this.f17955OoooOoO.OooO0oO());
                this.f17981o0000O00.setImageDrawable(drawableMutate);
            }
        }
        if (this.f18027oo0o0Oo == 2) {
            int i = this.f18006o000OOo;
            if (z2 && isEnabled()) {
                this.f18006o000OOo = this.f17970o000000O;
            } else {
                this.f18006o000OOo = this.f17969o000000;
            }
            if (this.f18006o000OOo != i && OooO0o() && !this.f17966o000) {
                if (OooO0o()) {
                    ((com.google.android.material.textfield.OooOO0) this.f18023o0ooOO0).OooOoo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                OooOOO();
            }
        }
        if (this.f18027oo0o0Oo == 1) {
            if (!isEnabled()) {
                this.f17968o00000 = this.f17997o0000oOO;
            } else if (z && !z2) {
                this.f17968o00000 = this.f18000o0000oo0;
            } else if (z2) {
                this.f17968o00000 = this.f17998o0000oOo;
            } else {
                this.f17968o00000 = this.f17996o0000oO0;
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
        this.f17946Oooo.addView(view, layoutParams2);
        this.f17946Oooo.setLayoutParams(layoutParams);
        OooOoO();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f17947OoooO;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f17951OoooOO0 != null) {
            boolean z = this.f18015o00oO0O;
            this.f18015o00oO0O = false;
            CharSequence hint = editText.getHint();
            this.f17947OoooO.setHint(this.f17951OoooOO0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f17947OoooO.setHint(hint);
                this.f18015o00oO0O = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f17946Oooo.getChildCount());
        for (int i2 = 0; i2 < this.f17946Oooo.getChildCount(); i2++) {
            View childAt = this.f17946Oooo.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f17947OoooO) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f18007o000Oo0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f18007o000Oo0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        if (this.f18026oo000o) {
            this.f18002o000O000.OooO0o(canvas);
        }
        if (this.f18025o0ooOoO == null || (materialShapeDrawable = this.f18024o0ooOOo) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f17947OoooO.isFocused()) {
            Rect bounds = this.f18025o0ooOoO.getBounds();
            Rect bounds2 = this.f18024o0ooOOo.getBounds();
            float f = this.f18002o000O000.f17229OooO0OO;
            int iCenterX = bounds2.centerX();
            bounds.left = p339o0OO0o0O.OooO0o.OooO0O0(iCenterX, bounds2.left, f);
            bounds.right = p339o0OO0o0O.OooO0o.OooO0O0(iCenterX, bounds2.right, f);
            this.f18025o0ooOoO.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f18003o000O0O) {
            return;
        }
        this.f18003o000O0O = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
        boolean zOooOoOO = oooO0OO != null ? oooO0OO.OooOoOO(drawableState) | false : false;
        if (this.f17947OoooO != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            OooOoOO(ViewCompat.OooOO0O.OooO0OO(this) && isEnabled(), false);
        }
        OooOo0o();
        Oooo000();
        if (zOooOoOO) {
            invalidate();
        }
        this.f18003o000O0O = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17947OoooO;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0o0() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f18027oo0o0Oo;
        if (i == 1 || i == 2) {
            return this.f18023o0ooOO0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17968o00000;
    }

    public int getBoxBackgroundMode() {
        return this.f18027oo0o0Oo;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18018o0O0O00;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return o00Ooo.OooO0o(this) ? this.f18020o0OOO0o.f17582OooO0oo.OooO00o(this.f17974o00000OO) : this.f18020o0OOO0o.f17581OooO0oO.OooO00o(this.f17974o00000OO);
    }

    public float getBoxCornerRadiusBottomStart() {
        return o00Ooo.OooO0o(this) ? this.f18020o0OOO0o.f17581OooO0oO.OooO00o(this.f17974o00000OO) : this.f18020o0OOO0o.f17582OooO0oo.OooO00o(this.f17974o00000OO);
    }

    public float getBoxCornerRadiusTopEnd() {
        return o00Ooo.OooO0o(this) ? this.f18020o0OOO0o.f17580OooO0o0.OooO00o(this.f17974o00000OO) : this.f18020o0OOO0o.f17579OooO0o.OooO00o(this.f17974o00000OO);
    }

    public float getBoxCornerRadiusTopStart() {
        return o00Ooo.OooO0o(this) ? this.f18020o0OOO0o.f17579OooO0o.OooO00o(this.f17974o00000OO) : this.f18020o0OOO0o.f17580OooO0o0.OooO00o(this.f17974o00000OO);
    }

    public int getBoxStrokeColor() {
        return this.f17994o0000o0o;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17991o0000o;
    }

    public int getBoxStrokeWidth() {
        return this.f17969o000000;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17970o000000O;
    }

    public int getCounterMaxLength() {
        return this.f17957Ooooo00;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f17956OoooOoo && this.f17958Ooooo0o && (appCompatTextView = this.f17959OooooO0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f18012o00Oo0;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f18012o00Oo0;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f17987o0000Oo;
    }

    @Nullable
    public EditText getEditText() {
        return this.f17947OoooO;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f17981o0000O00.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f17981o0000O00.getDrawable();
    }

    public int getEndIconMode() {
        return this.f17978o00000oo;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f17981o0000O00;
    }

    @Nullable
    public CharSequence getError() {
        Oooo000 oooo000 = this.f17955OoooOoO;
        if (oooo000.f17927OooOO0O) {
            return oooo000.f17926OooOO0;
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f17955OoooOoO.f17930OooOOO0;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f17955OoooOoO.OooO0oO();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f17985o0000OOO.getDrawable();
    }

    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.f17955OoooOoO.OooO0oO();
    }

    @Nullable
    public CharSequence getHelperText() {
        Oooo000 oooo000 = this.f17955OoooOoO;
        if (oooo000.f17934OooOOo0) {
            return oooo000.f17932OooOOOo;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f17955OoooOoO.f17933OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f18026oo000o) {
            return this.f18016o00oO0o;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f18002o000O000.OooO0oO();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f18002o000O000.OooO0oo();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f17989o0000OoO;
    }

    public int getMaxEms() {
        return this.f17952OoooOOO;
    }

    @Px
    public int getMaxWidth() {
        return this.f17954OoooOo0;
    }

    public int getMinEms() {
        return this.f18010o000oOoO;
    }

    @Px
    public int getMinWidth() {
        return this.f17953OoooOOo;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17981o0000O00.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17981o0000O00.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f17962Oooooo) {
            return this.f17963Oooooo0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f18022o0OoOo0;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f17965Ooooooo;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f17949OoooO00.f18041OoooO0;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f17949OoooO00.f18042OoooO00.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f17949OoooO00.f18042OoooO00;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f17949OoooO00.f18043OoooO0O.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f17949OoooO00.f18043OoooO0O.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f18014o00o0O;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f18017o00ooo.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f18017o00ooo;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f17975o00000Oo;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18002o000O000.OooOO0O(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f17947OoooO;
        if (editText != null) {
            Rect rect = this.f17973o00000O0;
            com.google.android.material.internal.OooO0o.OooO00o(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f18024o0ooOOo;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.f17969o000000, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f18025o0ooOoO;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.f17970o000000O, rect.right, i6);
            }
            if (this.f18026oo000o) {
                com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
                float textSize = this.f17947OoooO.getTextSize();
                if (oooO0OO.f17239OooOOO0 != textSize) {
                    oooO0OO.f17239OooOOO0 = textSize;
                    oooO0OO.OooOOO0(false);
                }
                int gravity = this.f17947OoooO.getGravity();
                this.f18002o000O000.OooOOo0((gravity & PayError.ERROR_PARAMS_IS_NULL) | 48);
                this.f18002o000O000.OooOo0O(gravity);
                com.google.android.material.internal.OooO0OO oooO0OO2 = this.f18002o000O000;
                if (this.f17947OoooO == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f17972o00000O;
                boolean zOooO0o = o00Ooo.OooO0o(this);
                rect2.bottom = rect.bottom;
                int i7 = this.f18027oo0o0Oo;
                if (i7 == 1) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = rect.top + this.f18018o0O0O00;
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else if (i7 != 2) {
                    rect2.left = OooO0oO(rect.left, zOooO0o);
                    rect2.top = getPaddingTop();
                    rect2.right = OooO0oo(rect.right, zOooO0o);
                } else {
                    rect2.left = this.f17947OoooO.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - OooO0o0();
                    rect2.right = rect.right - this.f17947OoooO.getPaddingRight();
                }
                Objects.requireNonNull(oooO0OO2);
                oooO0OO2.OooOOO(rect2.left, rect2.top, rect2.right, rect2.bottom);
                com.google.android.material.internal.OooO0OO oooO0OO3 = this.f18002o000O000;
                if (this.f17947OoooO == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f17972o00000O;
                TextPaint textPaint = oooO0OO3.f17272OoooOO0;
                textPaint.setTextSize(oooO0OO3.f17239OooOOO0);
                textPaint.setTypeface(oooO0OO3.f17252OooOoOO);
                textPaint.setLetterSpacing(oooO0OO3.f17284Oooooo0);
                float f = -oooO0OO3.f17272OoooOO0.ascent();
                rect3.left = this.f17947OoooO.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.f18027oo0o0Oo == 1 && this.f17947OoooO.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f17947OoooO.getCompoundPaddingTop();
                rect3.right = rect.right - this.f17947OoooO.getCompoundPaddingRight();
                rect3.bottom = this.f18027oo0o0Oo == 1 && this.f17947OoooO.getMinLines() <= 1 ? (int) (rect3.top + f) : rect.bottom - this.f17947OoooO.getCompoundPaddingBottom();
                Objects.requireNonNull(oooO0OO3);
                oooO0OO3.OooOOoo(rect3.left, rect3.top, rect3.right, rect3.bottom);
                this.f18002o000O000.OooOOO0(false);
                if (!OooO0o() || this.f17966o000) {
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
        if (this.f17947OoooO != null && this.f17947OoooO.getMeasuredHeight() < (iMax = Math.max(this.f17948OoooO0.getMeasuredHeight(), this.f17949OoooO00.getMeasuredHeight()))) {
            this.f17947OoooO.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zOooOo0O = OooOo0O();
        if (z || zOooOo0O) {
            this.f17947OoooO.post(new OooO0OO());
        }
        if (this.f17964OoooooO != null && (editText = this.f17947OoooO) != null) {
            this.f17964OoooooO.setGravity(editText.getGravity());
            this.f17964OoooooO.setPadding(this.f17947OoooO.getCompoundPaddingLeft(), this.f17947OoooO.getCompoundPaddingTop(), this.f17947OoooO.getCompoundPaddingRight(), this.f17947OoooO.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(savedState.f8042Oooo);
        setError(savedState.f18035OoooO0);
        if (savedState.f18036OoooO0O) {
            this.f17981o0000O00.post(new OooO0O0());
        }
        setHint(savedState.f18034OoooO);
        setHelperText(savedState.f18037OoooOO0);
        setPlaceholderText(savedState.f18038o000oOoO);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f18021o0Oo0oo;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float fOooO00o = this.f18020o0OOO0o.f17580OooO0o0.OooO00o(this.f17974o00000OO);
            float fOooO00o2 = this.f18020o0OOO0o.f17579OooO0o.OooO00o(this.f17974o00000OO);
            float fOooO00o3 = this.f18020o0OOO0o.f17582OooO0oo.OooO00o(this.f17974o00000OO);
            float fOooO00o4 = this.f18020o0OOO0o.f17581OooO0oO.OooO00o(this.f17974o00000OO);
            float f = z ? fOooO00o : fOooO00o2;
            if (z) {
                fOooO00o = fOooO00o2;
            }
            float f2 = z ? fOooO00o3 : fOooO00o4;
            if (z) {
                fOooO00o3 = fOooO00o4;
            }
            boolean zOooO0o = o00Ooo.OooO0o(this);
            this.f18021o0Oo0oo = zOooO0o;
            float f3 = zOooO0o ? fOooO00o : f;
            if (!zOooO0o) {
                f = fOooO00o;
            }
            float f4 = zOooO0o ? fOooO00o3 : f2;
            if (!zOooO0o) {
                f2 = fOooO00o3;
            }
            MaterialShapeDrawable materialShapeDrawable = this.f18023o0ooOO0;
            if (materialShapeDrawable != null && materialShapeDrawable.OooOO0O() == f3) {
                MaterialShapeDrawable materialShapeDrawable2 = this.f18023o0ooOO0;
                if (materialShapeDrawable2.f17528Oooo.f17553OooO00o.f17579OooO0o.OooO00o(materialShapeDrawable2.OooO0oo()) == f) {
                    MaterialShapeDrawable materialShapeDrawable3 = this.f18023o0ooOO0;
                    if (materialShapeDrawable3.f17528Oooo.f17553OooO00o.f17582OooO0oo.OooO00o(materialShapeDrawable3.OooO0oo()) == f4) {
                        MaterialShapeDrawable materialShapeDrawable4 = this.f18023o0ooOO0;
                        if (materialShapeDrawable4.f17528Oooo.f17553OooO00o.f17581OooO0oO.OooO00o(materialShapeDrawable4.OooO0oo()) == f2) {
                            return;
                        }
                    }
                }
            }
            com.google.android.material.shape.OooO00o oooO00o = this.f18020o0OOO0o;
            Objects.requireNonNull(oooO00o);
            com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
            c0110OooO00o.OooO0o(f3);
            c0110OooO00o.OooO0oO(f);
            c0110OooO00o.OooO0Oo(f4);
            c0110OooO00o.OooO0o0(f2);
            this.f18020o0OOO0o = c0110OooO00o.OooO00o();
            OooO0Oo();
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f17955OoooOoO.OooO0o0()) {
            savedState.f18035OoooO0 = getError();
        }
        savedState.f18036OoooO0O = OooO() && this.f17981o0000O00.isChecked();
        savedState.f18034OoooO = getHint();
        savedState.f18037OoooOO0 = getHelperText();
        savedState.f18038o000oOoO = getPlaceholderText();
        return savedState;
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f17968o00000 != i) {
            this.f17968o00000 = i;
            this.f17996o0000oO0 = i;
            this.f17998o0000oOo = i;
            this.f18000o0000oo0 = i;
            OooO0Oo();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(o000O000.OooO00o.OooO0O0(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17996o0000oO0 = defaultColor;
        this.f17968o00000 = defaultColor;
        this.f17997o0000oOO = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17998o0000oOo = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f18000o0000oo0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0Oo();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f18027oo0o0Oo) {
            return;
        }
        this.f18027oo0o0Oo = i;
        if (this.f17947OoooO != null) {
            OooOOO0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f18018o0O0O00 = i;
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f17994o0000o0o != i) {
            this.f17994o0000o0o = i;
            Oooo000();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f17992o0000o0 = colorStateList.getDefaultColor();
            this.f18001o0000ooO = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17993o0000o0O = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f17994o0000o0o = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f17994o0000o0o != colorStateList.getDefaultColor()) {
            this.f17994o0000o0o = colorStateList.getDefaultColor();
        }
        Oooo000();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f17991o0000o != colorStateList) {
            this.f17991o0000o = colorStateList;
            Oooo000();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f17969o000000 = i;
        Oooo000();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f17970o000000O = i;
        Oooo000();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f17956OoooOoo != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17959OooooO0 = appCompatTextView;
                appCompatTextView.setId(p338o0OO0o0.OooOOO0.textinput_counter);
                Typeface typeface = this.f17975o00000Oo;
                if (typeface != null) {
                    this.f17959OooooO0.setTypeface(typeface);
                }
                this.f17959OooooO0.setMaxLines(1);
                this.f17955OoooOoO.OooO00o(this.f17959OooooO0, 2);
                o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) this.f17959OooooO0.getLayoutParams(), getResources().getDimensionPixelOffset(p338o0OO0o0.OooOO0.mtrl_textinput_counter_margin_start));
                OooOo0();
                OooOOoo();
            } else {
                this.f17955OoooOoO.OooOO0(this.f17959OooooO0, 2);
                this.f17959OooooO0 = null;
            }
            this.f17956OoooOoo = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f17957Ooooo00 != i) {
            if (i > 0) {
                this.f17957Ooooo00 = i;
            } else {
                this.f17957Ooooo00 = -1;
            }
            if (this.f17956OoooOoo) {
                OooOOoo();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f17960OooooOO != i) {
            this.f17960OooooOO = i;
            OooOo0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18013o00Ooo != colorStateList) {
            this.f18013o00Ooo = colorStateList;
            OooOo0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f17961OooooOo != i) {
            this.f17961OooooOo = i;
            OooOo0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f18012o00Oo0 != colorStateList) {
            this.f18012o00Oo0 = colorStateList;
            OooOo0();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f17987o0000Oo = colorStateList;
        this.f17989o0000OoO = colorStateList;
        if (this.f17947OoooO != null) {
            OooOoOO(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOOOO(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f17981o0000O00.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f17981o0000O00.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        setEndIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f17978o00000oo;
        if (i2 == i) {
            return;
        }
        this.f17978o00000oo = i;
        Iterator<OooOO0O> it = this.f17999o0000oo.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().OooO0O0(this.f18027oo0o0Oo)) {
            getEndIconDelegate().OooO00o();
            OooOo.OooO00o(this, this.f17981o0000O00, this.f17995o0000oO, this.f17980o0000O0);
        } else {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("The current box background mode ");
            sbOooO0O0.append(this.f18027oo0o0Oo);
            sbOooO0O0.append(" is not supported by the end icon mode ");
            sbOooO0O0.append(i);
            throw new IllegalStateException(sbOooO0O0.toString());
        }
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f17981o0000O00;
        View.OnLongClickListener onLongClickListener = this.f17984o0000OO0;
        checkableImageButton.setOnClickListener(onClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17984o0000OO0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f17981o0000O00;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17995o0000oO != colorStateList) {
            this.f17995o0000oO = colorStateList;
            OooOo.OooO00o(this, this.f17981o0000O00, colorStateList, this.f17980o0000O0);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17980o0000O0 != mode) {
            this.f17980o0000O0 = mode;
            OooOo.OooO00o(this, this.f17981o0000O00, this.f17995o0000oO, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (OooOO0O() != z) {
            this.f17981o0000O00.setVisibility(z ? 0 : 8);
            OooOo();
            OooOooO();
            OooOo0O();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f17955OoooOoO.f17927OooOO0O) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f17955OoooOoO.OooO();
            return;
        }
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.OooO0OO();
        oooo000.f17926OooOO0 = charSequence;
        oooo000.f17928OooOO0o.setText(charSequence);
        int i = oooo000.f17925OooO0oo;
        if (i != 1) {
            oooo000.f17917OooO = 1;
        }
        oooo000.OooOO0o(i, oooo000.f17917OooO, oooo000.OooOO0O(oooo000.f17928OooOO0o, charSequence));
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.f17930OooOOO0 = charSequence;
        AppCompatTextView appCompatTextView = oooo000.f17928OooOO0o;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        if (oooo000.f17927OooOO0O == z) {
            return;
        }
        oooo000.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oooo000.f17918OooO00o);
            oooo000.f17928OooOO0o = appCompatTextView;
            appCompatTextView.setId(p338o0OO0o0.OooOOO0.textinput_error);
            oooo000.f17928OooOO0o.setTextAlignment(5);
            Typeface typeface = oooo000.f17936OooOo0;
            if (typeface != null) {
                oooo000.f17928OooOO0o.setTypeface(typeface);
            }
            int i = oooo000.f17929OooOOO;
            oooo000.f17929OooOOO = i;
            AppCompatTextView appCompatTextView2 = oooo000.f17928OooOO0o;
            if (appCompatTextView2 != null) {
                oooo000.f17919OooO0O0.OooOOo(appCompatTextView2, i);
            }
            ColorStateList colorStateList = oooo000.f17931OooOOOO;
            oooo000.f17931OooOOOO = colorStateList;
            AppCompatTextView appCompatTextView3 = oooo000.f17928OooOO0o;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = oooo000.f17930OooOOO0;
            oooo000.f17930OooOOO0 = charSequence;
            AppCompatTextView appCompatTextView4 = oooo000.f17928OooOO0o;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            oooo000.f17928OooOO0o.setVisibility(4);
            AppCompatTextView appCompatTextView5 = oooo000.f17928OooOO0o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView5, 1);
            oooo000.OooO00o(oooo000.f17928OooOO0o, 0);
        } else {
            oooo000.OooO();
            oooo000.OooOO0(oooo000.f17928OooOO0o, 0);
            oooo000.f17928OooOO0o = null;
            oooo000.f17919OooO0O0.OooOo0o();
            oooo000.f17919OooO0O0.Oooo000();
        }
        oooo000.f17927OooOO0O = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        setErrorIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
        OooOo.OooO0OO(this, this.f17985o0000OOO, this.f17986o0000OOo);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f17985o0000OOO;
        View.OnLongClickListener onLongClickListener = this.f17983o0000OO;
        checkableImageButton.setOnClickListener(onClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17983o0000OO = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f17985o0000OOO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooOOo0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17986o0000OOo != colorStateList) {
            this.f17986o0000OOo = colorStateList;
            OooOo.OooO00o(this, this.f17985o0000OOO, colorStateList, this.f17988o0000Oo0);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17988o0000Oo0 != mode) {
            this.f17988o0000Oo0 = mode;
            OooOo.OooO00o(this, this.f17985o0000OOO, this.f17986o0000OOo, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.f17929OooOOO = i;
        AppCompatTextView appCompatTextView = oooo000.f17928OooOO0o;
        if (appCompatTextView != null) {
            oooo000.f17919OooO0O0.OooOOo(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.f17931OooOOOO = colorStateList;
        AppCompatTextView appCompatTextView = oooo000.f17928OooOO0o;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f18008o000OoO != z) {
            this.f18008o000OoO = z;
            OooOoOO(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f17955OoooOoO.f17934OooOOo0) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f17955OoooOoO.f17934OooOOo0) {
            setHelperTextEnabled(true);
        }
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.OooO0OO();
        oooo000.f17932OooOOOo = charSequence;
        oooo000.f17933OooOOo.setText(charSequence);
        int i = oooo000.f17925OooO0oo;
        if (i != 2) {
            oooo000.f17917OooO = 2;
        }
        oooo000.OooOO0o(i, oooo000.f17917OooO, oooo000.OooOO0O(oooo000.f17933OooOOo, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.f17937OooOo00 = colorStateList;
        AppCompatTextView appCompatTextView = oooo000.f17933OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        if (oooo000.f17934OooOOo0 == z) {
            return;
        }
        oooo000.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(oooo000.f17918OooO00o);
            oooo000.f17933OooOOo = appCompatTextView;
            appCompatTextView.setId(p338o0OO0o0.OooOOO0.textinput_helper_text);
            oooo000.f17933OooOOo.setTextAlignment(5);
            Typeface typeface = oooo000.f17936OooOo0;
            if (typeface != null) {
                oooo000.f17933OooOOo.setTypeface(typeface);
            }
            oooo000.f17933OooOOo.setVisibility(4);
            AppCompatTextView appCompatTextView2 = oooo000.f17933OooOOo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            ViewCompat.OooOO0O.OooO0o(appCompatTextView2, 1);
            int i = oooo000.f17935OooOOoo;
            oooo000.f17935OooOOoo = i;
            AppCompatTextView appCompatTextView3 = oooo000.f17933OooOOo;
            if (appCompatTextView3 != null) {
                TextViewCompat.OooO0o(appCompatTextView3, i);
            }
            ColorStateList colorStateList = oooo000.f17937OooOo00;
            oooo000.f17937OooOo00 = colorStateList;
            AppCompatTextView appCompatTextView4 = oooo000.f17933OooOOo;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            oooo000.OooO00o(oooo000.f17933OooOOo, 1);
            oooo000.f17933OooOOo.setAccessibilityDelegate(new Oooo0(oooo000));
        } else {
            oooo000.OooO0OO();
            int i2 = oooo000.f17925OooO0oo;
            if (i2 == 2) {
                oooo000.f17917OooO = 0;
            }
            oooo000.OooOO0o(i2, oooo000.f17917OooO, oooo000.OooOO0O(oooo000.f17933OooOOo, ""));
            oooo000.OooOO0(oooo000.f17933OooOOo, 1);
            oooo000.f17933OooOOo = null;
            oooo000.f17919OooO0O0.OooOo0o();
            oooo000.f17919OooO0O0.Oooo000();
        }
        oooo000.f17934OooOOo0 = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        Oooo000 oooo000 = this.f17955OoooOoO;
        oooo000.f17935OooOOoo = i;
        AppCompatTextView appCompatTextView = oooo000.f17933OooOOo;
        if (appCompatTextView != null) {
            TextViewCompat.OooO0o(appCompatTextView, i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f18026oo000o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.oo0o0Oo.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f18004o000O0o = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f18026oo000o) {
            this.f18026oo000o = z;
            if (z) {
                CharSequence hint = this.f17947OoooO.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f18016o00oO0o)) {
                        setHint(hint);
                    }
                    this.f17947OoooO.setHint((CharSequence) null);
                }
                this.f18015o00oO0O = true;
            } else {
                this.f18015o00oO0O = false;
                if (!TextUtils.isEmpty(this.f18016o00oO0o) && TextUtils.isEmpty(this.f17947OoooO.getHint())) {
                    this.f17947OoooO.setHint(this.f18016o00oO0o);
                }
                setHintInternal(null);
            }
            if (this.f17947OoooO != null) {
                OooOoO();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.f18002o000O000.OooOOOO(i);
        this.f17989o0000OoO = this.f18002o000O000.f17241OooOOOo;
        if (this.f17947OoooO != null) {
            OooOoOO(false, false);
            OooOoO();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17989o0000OoO != colorStateList) {
            if (this.f17987o0000Oo == null) {
                this.f18002o000O000.OooOOOo(colorStateList);
            }
            this.f17989o0000OoO = colorStateList;
            if (this.f17947OoooO != null) {
                OooOoOO(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f17952OoooOOO = i;
        EditText editText = this.f17947OoooO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.f17954OoooOo0 = i;
        EditText editText = this.f17947OoooO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f18010o000oOoO = i;
        EditText editText = this.f17947OoooO;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.f17953OoooOOo = i;
        EditText editText = this.f17947OoooO;
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
        if (z && this.f17978o00000oo != 1) {
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
        this.f17995o0000oO = colorStateList;
        OooOo.OooO00o(this, this.f17981o0000O00, colorStateList, this.f17980o0000O0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f17980o0000O0 = mode;
        OooOo.OooO00o(this, this.f17981o0000O00, this.f17995o0000oO, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f17964OoooooO == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f17964OoooooO = appCompatTextView;
            appCompatTextView.setId(p338o0OO0o0.OooOOO0.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f17964OoooooO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            ViewCompat.OooO0o.OooOOoo(appCompatTextView2, 2);
            Fade fade = new Fade();
            fade.f9576OoooO0 = 87L;
            LinearInterpolator linearInterpolator = p339o0OO0o0O.OooO0o.f37992OooO00o;
            fade.f9578OoooO0O = linearInterpolator;
            this.f18028ooOO = fade;
            fade.f9577OoooO00 = 67L;
            Fade fade2 = new Fade();
            fade2.f9576OoooO0 = 87L;
            fade2.f9578OoooO0O = linearInterpolator;
            this.f18011o00O0O = fade2;
            setPlaceholderTextAppearance(this.f18022o0OoOo0);
            setPlaceholderTextColor(this.f17965Ooooooo);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17962Oooooo) {
                setPlaceholderTextEnabled(true);
            }
            this.f17963Oooooo0 = charSequence;
        }
        EditText editText = this.f17947OoooO;
        OooOoo0(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f18022o0OoOo0 = i;
        AppCompatTextView appCompatTextView = this.f17964OoooooO;
        if (appCompatTextView != null) {
            TextViewCompat.OooO0o(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f17965Ooooooo != colorStateList) {
            this.f17965Ooooooo = colorStateList;
            AppCompatTextView appCompatTextView = this.f17964OoooooO;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        o00O0O o00o0o2 = this.f17949OoooO00;
        Objects.requireNonNull(o00o0o2);
        o00o0o2.f18041OoooO0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        o00o0o2.f18042OoooO00.setText(charSequence);
        o00o0o2.OooO0oO();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        TextViewCompat.OooO0o(this.f17949OoooO00.f18042OoooO00, i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f17949OoooO00.f18042OoooO00.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f17949OoooO00.f18043OoooO0O.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f17949OoooO00.OooO0OO(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f17949OoooO00.OooO0Oo(onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        o00O0O o00o0o2 = this.f17949OoooO00;
        if (o00o0o2.f18040OoooO != colorStateList) {
            o00o0o2.f18040OoooO = colorStateList;
            OooOo.OooO00o(o00o0o2.f18039Oooo, o00o0o2.f18043OoooO0O, colorStateList, o00o0o2.f18044OoooOO0);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        o00O0O o00o0o2 = this.f17949OoooO00;
        if (o00o0o2.f18044OoooOO0 != mode) {
            o00o0o2.f18044OoooOO0 = mode;
            OooOo.OooO00o(o00o0o2.f18039Oooo, o00o0o2.f18043OoooO0O, o00o0o2.f18040OoooO, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f17949OoooO00.OooO0o0(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f18014o00o0O = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f18017o00ooo.setText(charSequence);
        OooOooo();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        TextViewCompat.OooO0o(this.f18017o00ooo, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f18017o00ooo.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable OooO oooO) {
        EditText editText = this.f17947OoooO;
        if (editText != null) {
            ViewCompat.OooOo0o(editText, oooO);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f17975o00000Oo) {
            this.f17975o00000Oo = typeface;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f18002o000O000;
            boolean zOooOOo = oooO0OO.OooOOo(typeface);
            boolean zOooOo0o = oooO0OO.OooOo0o(typeface);
            if (zOooOOo || zOooOo0o) {
                oooO0OO.OooOOO0(false);
            }
            Oooo000 oooo000 = this.f17955OoooOoO;
            if (typeface != oooo000.f17936OooOo0) {
                oooo000.f17936OooOo0 = typeface;
                AppCompatTextView appCompatTextView = oooo000.f17928OooOO0o;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = oooo000.f17933OooOOo;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f17959OooooO0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p338o0OO0o0.OooO0o.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f17981o0000O00.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f17981o0000O00.setImageDrawable(drawable);
        if (drawable != null) {
            OooOo.OooO00o(this, this.f17981o0000O00, this.f17995o0000oO, this.f17980o0000O0);
            OooOOOo();
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f17949OoooO00.OooO00o(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f17949OoooO00.OooO0O0(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [boolean, int] */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        ?? r3;
        int i3 = f17945o000O00;
        super(p353o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i3), attributeSet, i);
        this.f18010o000oOoO = -1;
        this.f17952OoooOOO = -1;
        this.f17953OoooOOo = -1;
        this.f17954OoooOo0 = -1;
        this.f17955OoooOoO = new Oooo000(this);
        this.f17973o00000O0 = new Rect();
        this.f17972o00000O = new Rect();
        this.f17974o00000OO = new RectF();
        this.f17977o00000oO = new LinkedHashSet<>();
        this.f17978o00000oo = 0;
        SparseArray<OooOo00> sparseArray = new SparseArray<>();
        this.f17967o0000 = sparseArray;
        this.f17999o0000oo = new LinkedHashSet<>();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f18002o000O000 = oooO0OO;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17946Oooo = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f17950OoooO0O = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f17948OoooO0 = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f18017o00ooo = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        int i4 = p338o0OO0o0.OooOOOO.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i4, (ViewGroup) linearLayout, false);
        this.f17985o0000OOO = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(i4, (ViewGroup) frameLayout2, false);
        this.f17981o0000O00 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = p339o0OO0o0O.OooO0o.f37992OooO00o;
        oooO0OO.f17273OoooOOO = linearInterpolator;
        oooO0OO.OooOOO0(false);
        oooO0OO.OooOoO(linearInterpolator);
        oooO0OO.OooOOo0(8388659);
        int[] iArr = p338o0OO0o0.Oooo0.TextInputLayout;
        int i5 = p338o0OO0o0.Oooo0.TextInputLayout_counterTextAppearance;
        int i6 = p338o0OO0o0.Oooo0.TextInputLayout_counterOverflowTextAppearance;
        int i7 = p338o0OO0o0.Oooo0.TextInputLayout_errorTextAppearance;
        int i8 = p338o0OO0o0.Oooo0.TextInputLayout_helperTextTextAppearance;
        int i9 = p338o0OO0o0.Oooo0.TextInputLayout_hintTextAppearance;
        o0000O0 o0000o0OooO0o0 = com.google.android.material.internal.o000oOoO.OooO0o0(context2, attributeSet, iArr, i, i3, i5, i6, i7, i8, i9);
        o00O0O o00o0o2 = new o00O0O(this, o0000o0OooO0o0);
        this.f17949OoooO00 = o00o0o2;
        this.f18026oo000o = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_hintEnabled, true);
        setHint(o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_android_hint));
        this.f18004o000O0o = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_hintAnimationEnabled, true);
        this.f18008o000OoO = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_expandedHintEnabled, true);
        int i10 = p338o0OO0o0.Oooo0.TextInputLayout_android_minEms;
        if (o0000o0OooO0o0.OooOOOo(i10)) {
            i2 = -1;
            setMinEms(o0000o0OooO0o0.OooOO0(i10, -1));
        } else {
            i2 = -1;
            int i11 = p338o0OO0o0.Oooo0.TextInputLayout_android_minWidth;
            if (o0000o0OooO0o0.OooOOOo(i11)) {
                setMinWidth(o0000o0OooO0o0.OooO0o(i11, -1));
            }
        }
        int i12 = p338o0OO0o0.Oooo0.TextInputLayout_android_maxEms;
        if (o0000o0OooO0o0.OooOOOo(i12)) {
            setMaxEms(o0000o0OooO0o0.OooOO0(i12, i2));
        } else {
            int i13 = p338o0OO0o0.Oooo0.TextInputLayout_android_maxWidth;
            if (o0000o0OooO0o0.OooOOOo(i13)) {
                setMaxWidth(o0000o0OooO0o0.OooO0o(i13, i2));
            }
        }
        this.f18020o0OOO0o = new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0OO(context2, attributeSet, i, i3));
        this.f18019o0OO00O = context2.getResources().getDimensionPixelOffset(p338o0OO0o0.OooOO0.mtrl_textinput_box_label_cutout_padding);
        this.f18018o0O0O00 = o0000o0OooO0o0.OooO0o0(p338o0OO0o0.Oooo0.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f17969o000000 = o0000o0OooO0o0.OooO0o(p338o0OO0o0.Oooo0.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.mtrl_textinput_box_stroke_width_default));
        this.f17970o000000O = o0000o0OooO0o0.OooO0o(p338o0OO0o0.Oooo0.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(p338o0OO0o0.OooOO0.mtrl_textinput_box_stroke_width_focused));
        this.f18006o000OOo = this.f17969o000000;
        float fOooO0Oo = o0000o0OooO0o0.OooO0Oo(p338o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusTopStart);
        float fOooO0Oo2 = o0000o0OooO0o0.OooO0Oo(p338o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusTopEnd);
        float fOooO0Oo3 = o0000o0OooO0o0.OooO0Oo(p338o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusBottomEnd);
        float fOooO0Oo4 = o0000o0OooO0o0.OooO0Oo(p338o0OO0o0.Oooo0.TextInputLayout_boxCornerRadiusBottomStart);
        com.google.android.material.shape.OooO00o oooO00o = this.f18020o0OOO0o;
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
        this.f18020o0OOO0o = new com.google.android.material.shape.OooO00o(c0110OooO00o);
        ColorStateList colorStateListOooO0O0 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, p338o0OO0o0.Oooo0.TextInputLayout_boxBackgroundColor);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.f17996o0000oO0 = defaultColor;
            this.f17968o00000 = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.f17997o0000oOO = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.f17998o0000oOo = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f18000o0000oo0 = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17998o0000oOo = this.f17996o0000oO0;
                ColorStateList colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(context2, p338o0OO0o0.OooO.mtrl_filled_background_color);
                this.f17997o0000oOO = colorStateListOooO00o.getColorForState(new int[]{-16842910}, -1);
                this.f18000o0000oo0 = colorStateListOooO00o.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f17968o00000 = 0;
            this.f17996o0000oO0 = 0;
            this.f17997o0000oOO = 0;
            this.f17998o0000oOo = 0;
            this.f18000o0000oo0 = 0;
        }
        int i14 = p338o0OO0o0.Oooo0.TextInputLayout_android_textColorHint;
        if (o0000o0OooO0o0.OooOOOo(i14)) {
            ColorStateList colorStateListOooO0OO = o0000o0OooO0o0.OooO0OO(i14);
            this.f17989o0000OoO = colorStateListOooO0OO;
            this.f17987o0000Oo = colorStateListOooO0OO;
        }
        int i15 = p338o0OO0o0.Oooo0.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListOooO0O1 = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i15);
        this.f17994o0000o0o = o0000o0OooO0o0.OooO0O0(i15);
        this.f17992o0000o0 = o000O000.OooO00o.OooO0O0(context2, p338o0OO0o0.OooO.mtrl_textinput_default_box_stroke_color);
        this.f18001o0000ooO = o000O000.OooO00o.OooO0O0(context2, p338o0OO0o0.OooO.mtrl_textinput_disabled_color);
        this.f17993o0000o0O = o000O000.OooO00o.OooO0O0(context2, p338o0OO0o0.OooO.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O1 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O1);
        }
        int i16 = p338o0OO0o0.Oooo0.TextInputLayout_boxStrokeErrorColor;
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
        CharSequence charSequenceOooOOOO = o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_errorContentDescription);
        boolean zOooO00o = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_errorEnabled, r3);
        checkableImageButton.setId(p338o0OO0o0.OooOOO0.text_input_error_icon);
        if (o0OOO0O.OooO0OO.OooO0oO(context2)) {
            o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r3);
        }
        int i17 = p338o0OO0o0.Oooo0.TextInputLayout_errorIconTint;
        if (o0000o0OooO0o0.OooOOOo(i17)) {
            this.f17986o0000OOo = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i17);
        }
        int i18 = p338o0OO0o0.Oooo0.TextInputLayout_errorIconTintMode;
        if (o0000o0OooO0o0.OooOOOo(i18)) {
            this.f17988o0000Oo0 = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i18, -1), null);
        }
        int i19 = p338o0OO0o0.Oooo0.TextInputLayout_errorIconDrawable;
        if (o0000o0OooO0o0.OooOOOo(i19)) {
            setErrorIconDrawable(o0000o0OooO0o0.OooO0oO(i19));
        }
        checkableImageButton.setContentDescription(getResources().getText(p338o0OO0o0.OooOo.error_icon_content_description));
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7885OooO00o;
        ViewCompat.OooO0o.OooOOoo(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iOooOOO1 = o0000o0OooO0o0.OooOOO0(i8, 0);
        boolean zOooO00o2 = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceOooOOOO2 = o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_helperText);
        int iOooOOO2 = o0000o0OooO0o0.OooOOO0(p338o0OO0o0.Oooo0.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceOooOOOO3 = o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_placeholderText);
        int iOooOOO3 = o0000o0OooO0o0.OooOOO0(p338o0OO0o0.Oooo0.TextInputLayout_suffixTextAppearance, 0);
        CharSequence charSequenceOooOOOO4 = o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_suffixText);
        boolean zOooO00o3 = o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(o0000o0OooO0o0.OooOO0(p338o0OO0o0.Oooo0.TextInputLayout_counterMaxLength, -1));
        this.f17961OooooOo = o0000o0OooO0o0.OooOOO0(i5, 0);
        this.f17960OooooOO = o0000o0OooO0o0.OooOOO0(i6, 0);
        setBoxBackgroundMode(o0000o0OooO0o0.OooOO0(p338o0OO0o0.Oooo0.TextInputLayout_boxBackgroundMode, 0));
        if (o0OOO0O.OooO0OO.OooO0oO(context2)) {
            o000O0O0.OooOO0.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iOooOOO4 = o0000o0OooO0o0.OooOOO0(p338o0OO0o0.Oooo0.TextInputLayout_endIconDrawable, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.OooO(this, iOooOOO4));
        sparseArray.append(0, new o000oOoO(this));
        sparseArray.append(1, new o0OoOo0(this, iOooOOO4 == 0 ? o0000o0OooO0o0.OooOOO0(p338o0OO0o0.Oooo0.TextInputLayout_passwordToggleDrawable, 0) : iOooOOO4));
        sparseArray.append(2, new com.google.android.material.textfield.OooO00o(this, iOooOOO4));
        sparseArray.append(3, new com.google.android.material.textfield.OooOO0O(this, iOooOOO4));
        int i20 = p338o0OO0o0.Oooo0.TextInputLayout_passwordToggleEnabled;
        if (!o0000o0OooO0o0.OooOOOo(i20)) {
            int i21 = p338o0OO0o0.Oooo0.TextInputLayout_endIconTint;
            if (o0000o0OooO0o0.OooOOOo(i21)) {
                this.f17995o0000oO = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i21);
            }
            int i22 = p338o0OO0o0.Oooo0.TextInputLayout_endIconTintMode;
            if (o0000o0OooO0o0.OooOOOo(i22)) {
                this.f17980o0000O0 = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i22, -1), null);
            }
        }
        int i23 = p338o0OO0o0.Oooo0.TextInputLayout_endIconMode;
        if (o0000o0OooO0o0.OooOOOo(i23)) {
            setEndIconMode(o0000o0OooO0o0.OooOO0(i23, 0));
            int i24 = p338o0OO0o0.Oooo0.TextInputLayout_endIconContentDescription;
            if (o0000o0OooO0o0.OooOOOo(i24)) {
                setEndIconContentDescription(o0000o0OooO0o0.OooOOOO(i24));
            }
            setEndIconCheckable(o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_endIconCheckable, true));
        } else if (o0000o0OooO0o0.OooOOOo(i20)) {
            int i25 = p338o0OO0o0.Oooo0.TextInputLayout_passwordToggleTint;
            if (o0000o0OooO0o0.OooOOOo(i25)) {
                this.f17995o0000oO = o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, i25);
            }
            int i26 = p338o0OO0o0.Oooo0.TextInputLayout_passwordToggleTintMode;
            if (o0000o0OooO0o0.OooOOOo(i26)) {
                this.f17980o0000O0 = o00Ooo.OooO0oO(o0000o0OooO0o0.OooOO0(i26, -1), null);
            }
            setEndIconMode(o0000o0OooO0o0.OooO00o(i20, false) ? 1 : 0);
            setEndIconContentDescription(o0000o0OooO0o0.OooOOOO(p338o0OO0o0.Oooo0.TextInputLayout_passwordToggleContentDescription));
        }
        appCompatTextView.setId(p338o0OO0o0.OooOOO0.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ViewCompat.OooOO0O.OooO0o(appCompatTextView, 1);
        setErrorContentDescription(charSequenceOooOOOO);
        setCounterOverflowTextAppearance(this.f17960OooooOO);
        setHelperTextTextAppearance(iOooOOO1);
        setErrorTextAppearance(iOooOOO0);
        setCounterTextAppearance(this.f17961OooooOo);
        setPlaceholderText(charSequenceOooOOOO3);
        setPlaceholderTextAppearance(iOooOOO2);
        setSuffixTextAppearance(iOooOOO3);
        int i27 = p338o0OO0o0.Oooo0.TextInputLayout_errorTextColor;
        if (o0000o0OooO0o0.OooOOOo(i27)) {
            setErrorTextColor(o0000o0OooO0o0.OooO0OO(i27));
        }
        int i28 = p338o0OO0o0.Oooo0.TextInputLayout_helperTextTextColor;
        if (o0000o0OooO0o0.OooOOOo(i28)) {
            setHelperTextColor(o0000o0OooO0o0.OooO0OO(i28));
        }
        int i29 = p338o0OO0o0.Oooo0.TextInputLayout_hintTextColor;
        if (o0000o0OooO0o0.OooOOOo(i29)) {
            setHintTextColor(o0000o0OooO0o0.OooO0OO(i29));
        }
        int i30 = p338o0OO0o0.Oooo0.TextInputLayout_counterTextColor;
        if (o0000o0OooO0o0.OooOOOo(i30)) {
            setCounterTextColor(o0000o0OooO0o0.OooO0OO(i30));
        }
        int i31 = p338o0OO0o0.Oooo0.TextInputLayout_counterOverflowTextColor;
        if (o0000o0OooO0o0.OooOOOo(i31)) {
            setCounterOverflowTextColor(o0000o0OooO0o0.OooO0OO(i31));
        }
        int i32 = p338o0OO0o0.Oooo0.TextInputLayout_placeholderTextColor;
        if (o0000o0OooO0o0.OooOOOo(i32)) {
            setPlaceholderTextColor(o0000o0OooO0o0.OooO0OO(i32));
        }
        int i33 = p338o0OO0o0.Oooo0.TextInputLayout_suffixTextColor;
        if (o0000o0OooO0o0.OooOOOo(i33)) {
            setSuffixTextColor(o0000o0OooO0o0.OooO0OO(i33));
        }
        setEnabled(o0000o0OooO0o0.OooO00o(p338o0OO0o0.Oooo0.TextInputLayout_android_enabled, true));
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
        this.f17985o0000OOO.setImageDrawable(drawable);
        OooOoO0();
        OooOo.OooO00o(this, this.f17985o0000OOO, this.f17986o0000OOo, this.f17988o0000Oo0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f17981o0000O00.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f17981o0000O00.setImageDrawable(drawable);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
