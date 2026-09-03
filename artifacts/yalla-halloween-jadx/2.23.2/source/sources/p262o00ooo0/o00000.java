package p262o00ooo0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f40378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f40379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f40380OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f40381OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f40382OooO0o0;

    public o00000(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f40382OooO0o0 = deferredLifecycleHelper;
        this.f40378OooO00o = frameLayout;
        this.f40379OooO0O0 = layoutInflater;
        this.f40380OooO0OO = viewGroup;
        this.f40381OooO0Oo = bundle;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final int zaa() {
        return 2;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final void zab() {
        FrameLayout frameLayout = this.f40378OooO00o;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f40382OooO0o0.f14834OooO00o.onCreateView(this.f40379OooO0O0, this.f40380OooO0OO, this.f40381OooO0Oo));
    }
}
