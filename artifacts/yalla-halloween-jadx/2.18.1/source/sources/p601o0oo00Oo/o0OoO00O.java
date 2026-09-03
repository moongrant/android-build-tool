package p601o0oo00Oo;

import android.app.Activity;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48226Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(MomentDetailView momentDetailView) {
        super(0);
        this.f48226Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentAdapterTag momentAdapterTag;
        o0O00000.OooO0OO("Moments_profile");
        MomentDetailModel momentDetailModel = this.f48226Oooo0o.f24941Oooo0oo;
        if ((momentDetailModel != null && momentDetailModel.getIsInRoom()) && ((momentAdapterTag = this.f48226Oooo0o.f24938Oooo) == MomentAdapterTag.MomentListFollowingFragment || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag == MomentAdapterTag.MomentListFollowingFragment_Recommend)) {
            o0O00000.OooO0OO("Moments_following_avatar_inroom");
        }
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        Activity activity = this.f48226Oooo0o.getActivity();
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel2 = this.f48226Oooo0o.f24941Oooo0oo;
        sb.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserId()) : null);
        sb.append("");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, activity, sb.toString(), false, 12);
        return null;
    }
}
