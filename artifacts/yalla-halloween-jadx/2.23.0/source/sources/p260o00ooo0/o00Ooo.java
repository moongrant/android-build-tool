package p260o00ooo0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f41055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f41056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f41057OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f41058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f41059OooO0o0;

    public o00Ooo(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f41059OooO0o0 = deferredLifecycleHelper;
        this.f41055OooO00o = frameLayout;
        this.f41056OooO0O0 = layoutInflater;
        this.f41057OooO0OO = viewGroup;
        this.f41058OooO0Oo = bundle;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final int zaa() {
        return 2;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final void zab() {
        FrameLayout frameLayout = this.f41055OooO00o;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f41059OooO0o0.f15310OooO00o.onCreateView(this.f41056OooO0O0, this.f41057OooO0OO, this.f41058OooO0Oo));
    }
}
