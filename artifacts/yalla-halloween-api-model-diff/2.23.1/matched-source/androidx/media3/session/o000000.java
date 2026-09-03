package androidx.media3.session;

import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import kotlin.jvm.internal.Intrinsics;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000000 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9293OooO0o0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f9292OooO0Oo = i;
        this.f9293OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f9292OooO0Oo;
        Object obj = this.f9293OooO0o0;
        switch (i2) {
            case 1:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i3 = ExploreCountryRoomListActivity.f26075OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0.OooO0O0("101087");
                Object obj2 = baseQuickAdapter.f13200OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.CountryModel");
                CountryModel countryModel = (CountryModel) obj2;
                if (com.code.android.util.o000000.OooO0o0(countryModel.getCid()) != this$0.f26083OooOoO0) {
                    this$0.f26083OooOoO0 = com.code.android.util.o000000.OooO0o0(countryModel.getCid());
                    this$0.OooOo().f44743OooO0o.setCurrentItem(i);
                    com.yalla.yalla.ui.activity.room.o00000OO o00000oo2 = this$0.f26077OooOo;
                    if (o00000oo2 != null) {
                        o00000oo2.OooOoO0(this$0.f26078OooOo0);
                    }
                    LinearLayout llCountryRoot = this$0.OooOo().f44741OooO0OO.f44775OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
                    com.code.android.util.o000O.OooO0O0(llCountryRoot);
                    break;
                }
                break;
            default:
                GuessListFragment.onLazyInit$lambda$0((GuessListFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }
}
