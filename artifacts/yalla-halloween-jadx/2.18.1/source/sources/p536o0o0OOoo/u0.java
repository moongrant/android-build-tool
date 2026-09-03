package p536o0o0OOoo;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.SearchRecommendModel;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import p133o00OO00o.OooOOO;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SearchFriendActivity f43876OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(SearchFriendActivity searchFriendActivity, Context context) {
        super(context);
        this.f43876OooO00o = searchFriendActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        SearchRecommendModel searchRecommendModel = (SearchRecommendModel) o0Oo0oo.OooO0O0(str, SearchRecommendModel.class);
        if (!"1000".equals(searchRecommendModel.f11881code) || searchRecommendModel.data == null) {
            return;
        }
        OooOOO oooOOO = this.f43876OooO00o.f22203Ooooo0o;
        oooOOO.f31207OooO0O0 = searchRecommendModel;
        oooOOO.notifyDataSetChanged();
    }
}
