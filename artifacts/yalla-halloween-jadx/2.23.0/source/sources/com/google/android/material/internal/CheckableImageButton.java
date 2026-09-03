package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f17131OooOO0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f17132OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f17133OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f17134OooO0oo;

    public class OooO00o extends androidx.core.view.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            CheckableImageButton checkableImageButton = CheckableImageButton.this;
            o0oo0oo2.f34022OooO00o.setCheckable(checkableImageButton.f17134OooO0oo);
            o0oo0oo2.f34022OooO00o.setChecked(checkableImageButton.isChecked());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f17136OooO0o;

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
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17136OooO0o = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            parcel.writeInt(this.f17136OooO0o ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f17133OooO0oO;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f17133OooO0oO ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f17131OooOO0) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        setChecked(savedState.f17136OooO0o);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17136OooO0o = this.f17133OooO0oO;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f17134OooO0oo != z) {
            this.f17134OooO0oo = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f17134OooO0oo || this.f17133OooO0oO == z) {
            return;
        }
        this.f17133OooO0oO = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f17132OooO = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f17132OooO) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f17133OooO0oO);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17134OooO0oo = true;
        this.f17132OooO = true;
        ViewCompat.OooOOOO(this, new OooO00o());
    }
}
