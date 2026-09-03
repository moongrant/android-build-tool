package p496o0o00o;

import android.content.Context;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.MedalRankModel;
import com.yalla.yalla.ui.activity.user.MedalRankActivity;
import com.yalla.yalla.ui.adapter.MedalRankAdapter;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MedalRankActivity f49010OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(MedalRankActivity medalRankActivity, Context context) {
        super(context);
        this.f49010OooO0o0 = medalRankActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(String str, String str2) {
        super.OooO0O0(str, str2);
        this.f49010OooO0o0.f27114OooOOo.setRefreshing(false);
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        MedalRankActivity medalRankActivity = this.f49010OooO0o0;
        medalRankActivity.f27114OooOOo.setRefreshing(false);
        MedalRankModel medalRankModel = (MedalRankModel) oOo00OO0.OooO00o(str, MedalRankModel.class);
        if ("1000".equals(medalRankModel.code)) {
            MedalRankAdapter medalRankAdapter = medalRankActivity.f27116OooOOoo;
            medalRankAdapter.f27403OooO0O0 = medalRankModel;
            medalRankAdapter.notifyDataSetChanged();
        }
    }
}
