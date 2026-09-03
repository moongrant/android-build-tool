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
import androidx.recyclerview.widget.RecyclerView;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final int[] f17173OoooO0O = {R.attr.state_checked};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f17174Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f17175OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f17176OoooO00;

    public class OooO00o extends androidx.core.view.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.OooO0OO(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.OooOooO(CheckableImageButton.this.f17176OoooO00);
            o0000oo1.OooOooo(CheckableImageButton.this.isChecked());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f17178Oooo0oo;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f17178Oooo0oo ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17178Oooo0oo = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f17174Oooo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (!this.f17174Oooo) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f17173OoooO0O);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        setChecked(savedState.f17178Oooo0oo);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17178Oooo0oo = this.f17174Oooo;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f17176OoooO00 != z) {
            this.f17176OoooO00 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f17176OoooO00 || this.f17174Oooo == z) {
            return;
        }
        this.f17174Oooo = z;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.oo0o0Oo.FLAG_MOVED);
    }

    public void setPressable(boolean z) {
        this.f17175OoooO0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f17175OoooO0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f17174Oooo);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17176OoooO00 = true;
        this.f17175OoooO0 = true;
        ViewCompat.OooOo0o(this, new OooO00o());
    }
}
