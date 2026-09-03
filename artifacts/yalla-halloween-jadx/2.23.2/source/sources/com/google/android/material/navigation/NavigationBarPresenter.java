package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOOO;
import androidx.appcompat.view.menu.OooOo;
import androidx.transition.AutoTransition;
import androidx.transition.OooOOO0;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarPresenter implements OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public NavigationBarMenuView f16949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16950OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16951OooO0o0 = false;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f16952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public ParcelableSparseArray f16953OooO0o0;

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
            this.f16952OooO0Oo = parcel.readInt();
            this.f16953OooO0o0 = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.f16952OooO0Oo);
            parcel.writeParcelable(this.f16953OooO0o0, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        AutoTransition autoTransition;
        if (this.f16951OooO0o0) {
            return;
        }
        if (z) {
            this.f16949OooO0Oo.OooO0O0();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f16949OooO0Oo;
        OooO oooO = navigationBarMenuView.f16947Oooo000;
        if (oooO == null || navigationBarMenuView.f16919OooO == null) {
            return;
        }
        int size = oooO.size();
        if (size != navigationBarMenuView.f16919OooO.length) {
            navigationBarMenuView.OooO0O0();
            return;
        }
        int i = navigationBarMenuView.f16925OooOO0;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = navigationBarMenuView.f16947Oooo000.getItem(i2);
            if (item.isChecked()) {
                navigationBarMenuView.f16925OooOO0 = item.getItemId();
                navigationBarMenuView.f16926OooOO0O = i2;
            }
        }
        if (i != navigationBarMenuView.f16925OooOO0 && (autoTransition = navigationBarMenuView.f16920OooO0Oo) != null) {
            OooOOO0.OooO00o(navigationBarMenuView, autoTransition);
        }
        boolean zOooO0o = NavigationBarMenuView.OooO0o(navigationBarMenuView.f16924OooO0oo, navigationBarMenuView.f16947Oooo000.OooOO0o().size());
        for (int i3 = 0; i3 < size; i3++) {
            navigationBarMenuView.f16946OooOooo.f16951OooO0o0 = true;
            navigationBarMenuView.f16919OooO[i3].setLabelVisibilityMode(navigationBarMenuView.f16924OooO0oo);
            navigationBarMenuView.f16919OooO[i3].setShifting(zOooO0o);
            navigationBarMenuView.f16919OooO[i3].OooO0OO((OooOO0O) navigationBarMenuView.f16947Oooo000.getItem(i3));
            navigationBarMenuView.f16946OooOooo.f16951OooO0o0 = false;
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(@Nullable OooO oooO, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0Oo(@Nullable OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(@Nullable OooOo oooOo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(@NonNull Parcelable parcelable) {
        SparseArray<BadgeDrawable> sparseArray;
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f16949OooO0Oo;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f16952OooO0Oo;
            int size = navigationBarMenuView.f16947Oooo000.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = navigationBarMenuView.f16947Oooo000.getItem(i2);
                if (i == item.getItemId()) {
                    navigationBarMenuView.f16925OooOO0 = i;
                    navigationBarMenuView.f16926OooOO0O = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f16949OooO0Oo.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f16953OooO0o0;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                if (state == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                sparseArray2.put(iKeyAt, new BadgeDrawable(context, state));
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f16949OooO0Oo;
            navigationBarMenuView2.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = navigationBarMenuView2.f16936OooOo0;
                if (i4 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (BadgeDrawable) sparseArray2.get(iKeyAt2));
                }
                i4++;
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f16919OooO;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    @NonNull
    public final Parcelable OooO0oO() {
        SavedState savedState = new SavedState();
        savedState.f16952OooO0Oo = this.f16949OooO0Oo.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f16949OooO0Oo.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            if (badgeDrawableValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.f15821OooO0oo.f15830OooO00o);
        }
        savedState.f16953OooO0o0 = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0oo(@Nullable OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooOO0O(@NonNull Context context, @NonNull OooO oooO) {
        this.f16949OooO0Oo.f16947Oooo000 = oooO;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return this.f16950OooO0o;
    }
}
