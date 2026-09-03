package p485o0o00O0;

import com.google.android.material.appbar.AppBarLayout;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O00 implements AppBarLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f47942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f47943OooO0O0;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f47942OooO00o = i;
        this.f47943OooO0O0 = obj;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
    public final void OooO00o(AppBarLayout appBarLayout, int i) {
        int i2 = this.f47942OooO00o;
        Object obj = this.f47943OooO0O0;
        switch (i2) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                int i3 = MomentDetailActivity.f26057Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f26070OooOooo.setValue(Float.valueOf(Math.abs((i * 1.0f) / this$0.f26072Oooo00O)));
                break;
            default:
                MomentListFeaturedFragment.initView$lambda$0((MomentListFeaturedFragment) obj, appBarLayout, i);
                break;
        }
    }
}
