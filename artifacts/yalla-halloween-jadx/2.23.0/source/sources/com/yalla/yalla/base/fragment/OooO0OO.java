package com.yalla.yalla.base.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OooO0OO extends Fragment implements OooO0O0 {
    private String TAG_FRAGMENT = "AppManager_Fragment:";
    private boolean isDataLoaded;
    private boolean isTrueVisibleToUser;
    protected boolean isViewCreated;
    protected boolean isVisibleSystem;

    private void dispatchParentState() {
        if (isAdded()) {
            List<Fragment> listOooo00O = getChildFragmentManager().Oooo00O();
            if (listOooo00O.isEmpty()) {
                return;
            }
            for (Fragment fragment : listOooo00O) {
                if (fragment instanceof OooO0OO) {
                    ((OooO0OO) fragment).visibleChange();
                }
            }
        }
    }

    private boolean isParentVisible() {
        LifecycleOwner parentFragment = getParentFragment();
        return parentFragment == null || ((parentFragment instanceof OooO0O0) && ((OooO0O0) parentFragment).isVisiableSystem());
    }

    private void visibleChange() {
        boolean z = this.isViewCreated && this.isVisibleSystem && isParentVisible();
        if (this.isTrueVisibleToUser == z) {
            return;
        }
        this.isTrueVisibleToUser = z;
        onTrueVisibleChanged(z);
        dispatchParentState();
    }

    public boolean isTrueVisibleToUser() {
        return this.isTrueVisibleToUser;
    }

    @Override // androidx.fragment.app.Fragment, com.yalla.yalla.base.fragment.OooO0O0
    public boolean isVisiableSystem() {
        return this.isVisibleSystem;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.isViewCreated = true;
        visibleChange();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        visibleChange();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.isViewCreated = false;
        this.isTrueVisibleToUser = false;
        this.isDataLoaded = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.isVisibleSystem = !z;
        visibleChange();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        visibleChange();
    }

    public void onTrueVisibleChanged(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.isVisibleSystem = z;
        visibleChange();
    }
}
