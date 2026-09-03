package oo0ooO;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f53431OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f53432OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f53433OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f53434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f53435OooO0o0;

    public OooO0o(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f53435OooO0o0 = deferredLifecycleHelper;
        this.f53431OooO00o = frameLayout;
        this.f53432OooO0O0 = layoutInflater;
        this.f53433OooO0OO = viewGroup;
        this.f53434OooO0Oo = bundle;
    }

    @Override // oo0ooO.OooOOO0
    public final int zaa() {
        return 2;
    }

    @Override // oo0ooO.OooOOO0
    public final void zab() {
        this.f53431OooO00o.removeAllViews();
        this.f53431OooO00o.addView(this.f53435OooO0o0.f15817OooO00o.onCreateView(this.f53432OooO0O0, this.f53433OooO0OO, this.f53434OooO0Oo));
    }
}
