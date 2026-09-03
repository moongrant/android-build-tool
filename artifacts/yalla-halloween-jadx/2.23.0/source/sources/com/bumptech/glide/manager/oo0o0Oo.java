package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class oo0o0Oo extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f10076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f10077OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashSet f10078OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Fragment f10079OooO0oO;

    public oo0o0Oo() {
        OooO00o oooO00o = new OooO00o();
        this.f10078OooO0o0 = new HashSet();
        this.f10076OooO0Oo = oooO00o;
    }

    public final void OooO0O0(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        oo0o0Oo oo0o0oo = this.f10077OooO0o;
        if (oo0o0oo != null) {
            oo0o0oo.f10078OooO0o0.remove(this);
            this.f10077OooO0o = null;
        }
        o00Oo0 o00oo1 = com.bumptech.glide.OooO0OO.OooO0O0(context).f9850OooO;
        HashMap map = o00oo1.f10031OooO0o;
        oo0o0Oo oo0o0oo2 = (oo0o0Oo) map.get(fragmentManager);
        if (oo0o0oo2 == null) {
            oo0o0Oo oo0o0oo3 = (oo0o0Oo) fragmentManager.OooOoo("com.bumptech.glide.manager");
            if (oo0o0oo3 == null) {
                oo0o0oo3 = new oo0o0Oo();
                oo0o0oo3.f10079OooO0oO = null;
                map.put(fragmentManager, oo0o0oo3);
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
                oooO00o.OooO0OO(0, oo0o0oo3, "com.bumptech.glide.manager", 1);
                oooO00o.OooO0o();
                o00oo1.f10033OooO0oO.obtainMessage(2, fragmentManager).sendToTarget();
            }
            oo0o0oo2 = oo0o0oo3;
        }
        this.f10077OooO0o = oo0o0oo2;
        if (equals(oo0o0oo2)) {
            return;
        }
        this.f10077OooO0o.f10078OooO0o0.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                OooO0O0(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10076OooO0Oo.OooO0OO();
        oo0o0Oo oo0o0oo = this.f10077OooO0o;
        if (oo0o0oo != null) {
            oo0o0oo.f10078OooO0o0.remove(this);
            this.f10077OooO0o = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f10079OooO0oO = null;
        oo0o0Oo oo0o0oo = this.f10077OooO0o;
        if (oo0o0oo != null) {
            oo0o0oo.f10078OooO0o0.remove(this);
            this.f10077OooO0o = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10076OooO0Oo.OooO0Oo();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10076OooO0Oo.OooO0o0();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f10079OooO0oO;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
