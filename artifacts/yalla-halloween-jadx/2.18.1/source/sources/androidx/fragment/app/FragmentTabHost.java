package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ArrayList<OooO00o> f8360Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TabHost.OnTabChangeListener f8361Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f8362Oooo0oo;

    public static final class OooO00o {
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public String f8363Oooo0o;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FragmentTabHost.SavedState{");
            sbOooO0o0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0o0.append(" curTab=");
            return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f8363Oooo0o, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f8363Oooo0o);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f8363Oooo0o = parcel.readString();
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f8360Oooo0o = new ArrayList<>();
        OooO0O0(context, null);
    }

    @Nullable
    public final o00000OO OooO00o() {
        if (this.f8360Oooo0o.size() <= 0) {
            return null;
        }
        Objects.requireNonNull(this.f8360Oooo0o.get(0));
        throw null;
    }

    public final void OooO0O0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        if (this.f8360Oooo0o.size() > 0) {
            Objects.requireNonNull(this.f8360Oooo0o.get(0));
            throw null;
        }
        this.f8362Oooo0oo = true;
        OooO00o();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8362Oooo0oo = false;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f8363Oooo0o);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8363Oooo0o = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(@Nullable String str) {
        if (this.f8362Oooo0oo) {
            OooO00o();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f8361Oooo0oO;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f8361Oooo0oO = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8360Oooo0o = new ArrayList<>();
        OooO0O0(context, attributeSet);
    }
}
