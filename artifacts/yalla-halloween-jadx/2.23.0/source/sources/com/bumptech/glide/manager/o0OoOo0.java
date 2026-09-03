package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class o0OoOo0 extends Fragment {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Fragment f10066OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooO00o f10067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashSet f10068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f10069OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public com.bumptech.glide.OooOo00 f10070OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0OoOo0 f10071OooO0oo;

    public class OooO00o implements o00Ooo {
        public OooO00o() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o0OoOo0.this + "}";
        }
    }

    public o0OoOo0() {
        com.bumptech.glide.manager.OooO00o oooO00o = new com.bumptech.glide.manager.OooO00o();
        this.f10069OooO0o0 = new OooO00o();
        this.f10068OooO0o = new HashSet();
        this.f10067OooO0Oo = oooO00o;
    }

    public final void OooO00o(@NonNull Activity activity) {
        o0OoOo0 o0oooo0 = this.f10071OooO0oo;
        if (o0oooo0 != null) {
            o0oooo0.f10068OooO0o.remove(this);
            this.f10071OooO0oo = null;
        }
        o00Oo0 o00oo1 = com.bumptech.glide.OooO0OO.OooO0O0(activity).f9850OooO;
        o00oo1.getClass();
        o0OoOo0 o0oooo0OooO0oo = o00oo1.OooO0oo(activity.getFragmentManager(), null);
        this.f10071OooO0oo = o0oooo0OooO0oo;
        if (equals(o0oooo0OooO0oo)) {
            return;
        }
        this.f10071OooO0oo.f10068OooO0o.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            OooO00o(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10067OooO0Oo.OooO0OO();
        o0OoOo0 o0oooo0 = this.f10071OooO0oo;
        if (o0oooo0 != null) {
            o0oooo0.f10068OooO0o.remove(this);
            this.f10071OooO0oo = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        o0OoOo0 o0oooo0 = this.f10071OooO0oo;
        if (o0oooo0 != null) {
            o0oooo0.f10068OooO0o.remove(this);
            this.f10071OooO0oo = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10067OooO0Oo.OooO0Oo();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10067OooO0Oo.OooO0o0();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f10066OooO;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
