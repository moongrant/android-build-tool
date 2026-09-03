package androidx.media3.session;

import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000000O implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9286OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f9285OooO0Oo = i;
        this.f9286OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f9285OooO0Oo;
        Object obj = this.f9286OooO0o0;
        switch (i2) {
            case 1:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i3 = ExploreCountryRoomListActivity.f26073OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oo0000.OooO00o.OooO0O0("101087");
                Object obj2 = baseQuickAdapter.f13189OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.CountryModel");
                CountryModel countryModel = (CountryModel) obj2;
                if (com.code.android.util.o000000.OooO0o0(countryModel.getCid()) != this$0.f26081OooOoO0) {
                    this$0.f26081OooOoO0 = com.code.android.util.o000000.OooO0o0(countryModel.getCid());
                    this$0.OooOo().f44737OooO0o.setCurrentItem(i);
                    com.yalla.yalla.ui.activity.room.o00000OO o00000oo2 = this$0.f26075OooOo;
                    if (o00000oo2 != null) {
                        o00000oo2.OooOoO0(this$0.f26076OooOo0);
                    }
                    LinearLayout llCountryRoot = this$0.OooOo().f44735OooO0OO.f44780OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
                    com.code.android.util.o000O.OooO0O0(llCountryRoot);
                    break;
                }
                break;
            default:
                GiftSendFragment this$1 = (GiftSendFragment) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                com.yalla.yalla.ui.fragment.o00oO0o listener = new com.yalla.yalla.ui.fragment.o00oO0o(i, view, baseQuickAdapter, this$1);
                Intrinsics.checkNotNullParameter(listener, "listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - com.code.android.util.o000O0Oo.f13426OooO00o) > 200) {
                    com.code.android.util.o000O0Oo.f13426OooO00o = jCurrentTimeMillis;
                    listener.invoke();
                }
                break;
        }
    }
}
