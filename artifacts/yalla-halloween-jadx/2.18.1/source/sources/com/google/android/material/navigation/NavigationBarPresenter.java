package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOOO0;
import androidx.appcompat.view.menu.OooOo00;
import androidx.transition.AutoTransition;
import androidx.transition.OooOO0;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarPresenter implements OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public NavigationBarMenuView f17435Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f17436Oooo0oO = false;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f17437Oooo0oo;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f17438Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public ParcelableSparseArray f17439Oooo0oO;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(@NonNull Parcel parcel) {
            this.f17438Oooo0o = parcel.readInt();
            this.f17439Oooo0oO = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f17438Oooo0o);
            parcel.writeParcelable(this.f17439Oooo0oO, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f17435Oooo0o;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f17438Oooo0o;
            int size = navigationBarMenuView.f17431o00Oo0.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = navigationBarMenuView.f17431o00Oo0.getItem(i2);
                if (i == item.getItemId()) {
                    navigationBarMenuView.f17413OoooO0O = i;
                    navigationBarMenuView.f17410OoooO = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f17435Oooo0o.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f17439Oooo0oO;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                if (state == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                int i4 = BadgeDrawable.f16478OoooOoo;
                int i5 = BadgeDrawable.f16477OoooOoO;
                sparseArray.put(iKeyAt, new BadgeDrawable(context, state));
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f17435Oooo0o;
            Objects.requireNonNull(navigationBarMenuView2);
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                int iKeyAt2 = sparseArray.keyAt(i6);
                if (navigationBarMenuView2.f17421Ooooo0o.indexOfKey(iKeyAt2) < 0) {
                    navigationBarMenuView2.f17421Ooooo0o.append(iKeyAt2, (BadgeDrawable) sparseArray.get(iKeyAt2));
                }
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f17411OoooO0;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    navigationBarItemView.setBadge(navigationBarMenuView2.f17421Ooooo0o.get(navigationBarItemView.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(@Nullable OooO0o oooO0o, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        AutoTransition autoTransition;
        if (this.f17436Oooo0oO) {
            return;
        }
        if (z) {
            this.f17435Oooo0o.OooO00o();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f17435Oooo0o;
        OooO0o oooO0o = navigationBarMenuView.f17431o00Oo0;
        if (oooO0o == null || navigationBarMenuView.f17411OoooO0 == null) {
            return;
        }
        int size = oooO0o.size();
        if (size != navigationBarMenuView.f17411OoooO0.length) {
            navigationBarMenuView.OooO00o();
            return;
        }
        int i = navigationBarMenuView.f17413OoooO0O;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = navigationBarMenuView.f17431o00Oo0.getItem(i2);
            if (item.isChecked()) {
                navigationBarMenuView.f17413OoooO0O = item.getItemId();
                navigationBarMenuView.f17410OoooO = i2;
            }
        }
        if (i != navigationBarMenuView.f17413OoooO0O && (autoTransition = navigationBarMenuView.f17407Oooo0o) != null) {
            OooOO0.OooO00o(navigationBarMenuView, autoTransition);
        }
        boolean zOooO0o = navigationBarMenuView.OooO0o(navigationBarMenuView.f17412OoooO00, navigationBarMenuView.f17431o00Oo0.OooOOO0().size());
        for (int i3 = 0; i3 < size; i3++) {
            navigationBarMenuView.f17430o00O0O.f17436Oooo0oO = true;
            navigationBarMenuView.f17411OoooO0[i3].setLabelVisibilityMode(navigationBarMenuView.f17412OoooO00);
            navigationBarMenuView.f17411OoooO0[i3].setShifting(zOooO0o);
            navigationBarMenuView.f17411OoooO0[i3].OooO0Oo((androidx.appcompat.view.menu.OooOO0) navigationBarMenuView.f17431o00Oo0.getItem(i3));
            navigationBarMenuView.f17430o00O0O.f17436Oooo0oO = false;
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0oO(@Nullable androidx.appcompat.view.menu.OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(@NonNull Context context, @NonNull OooO0o oooO0o) {
        this.f17435Oooo0o.f17431o00Oo0 = oooO0o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(@Nullable OooOo00 oooOo00) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    @NonNull
    public final Parcelable OooOO0o() {
        SavedState savedState = new SavedState();
        savedState.f17438Oooo0o = this.f17435Oooo0o.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f17435Oooo0o.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            if (badgeDrawableValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.f16485OoooO00.f16492OooO00o);
        }
        savedState.f17439Oooo0oO = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOOO0(@Nullable androidx.appcompat.view.menu.OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final int getId() {
        return this.f17437Oooo0oo;
    }
}
