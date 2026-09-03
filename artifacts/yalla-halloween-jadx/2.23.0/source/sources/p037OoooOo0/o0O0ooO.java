package p037OoooOo0;

import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o000000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.activity.room.o00000O;
import kotlin.jvm.internal.Intrinsics;
import p587o0oOooo.o0OO000;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0ooO implements o00O000.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1615OooO0Oo;

    public /* synthetic */ o0O0ooO(Object obj) {
        this.f1615OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f1615OooO0Oo;
        int i2 = ExploreCountryRoomListActivity.f26525OooOoo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0OO000.OooO00o("101087");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.CountryModel");
        CountryModel countryModel = (CountryModel) obj;
        if (o000000.OooO0o0(countryModel.getCid()) == this$0.f26533OooOoO0) {
            return;
        }
        this$0.f26533OooOoO0 = o000000.OooO0o0(countryModel.getCid());
        this$0.OooOo().f58509OooO0o.setCurrentItem(i);
        o00000O o00000o = this$0.f26527OooOo;
        if (o00000o != null) {
            o00000o.OooOoO0(this$0.f26528OooOo0);
        }
        LinearLayout linearLayout = this$0.OooOo().f58507OooO0OO.f57723OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
        o000OO00.OooO0O0(linearLayout);
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        ((o00O000) this.f1615OooO0Oo).f1587OooOOO = oooO00o;
        return "SurfaceOutputImpl close future complete";
    }
}
