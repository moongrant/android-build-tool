package o00OO0O0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31456Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f31457OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31458OoooO00;

    public /* synthetic */ o00000OO(Object obj, Object obj2, int i) {
        this.f31456Oooo = i;
        this.f31458OoooO00 = obj;
        this.f31457OoooO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31456Oooo) {
            case 0:
                ChatModel model = (ChatModel) this.f31458OoooO00;
                o0000Ooo this$0 = (o0000Ooo) this.f31457OoooO0;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p608o0oo0O.OooOo.OooO0OO("102001", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(model.eventModel.getId())), new Pair("roomeventState", Integer.valueOf(model.eventModel.getEventState()))));
                Function0<Unit> function0 = this$0.f31477OooO0Oo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                MemberRemoveLayout this$1 = (MemberRemoveLayout) this.f31458OoooO00;
                RoomUserInfoModel item = (RoomUserInfoModel) this.f31457OoooO0;
                int i = MemberRemoveLayout.f24878OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                Context context = this$1.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                oooO00o.OooO0OO((Activity) context, String.valueOf(item.getUserId()), false, true, false, false);
                break;
            default:
                TopicInfoHeadView this$2 = (TopicInfoHeadView) this.f31458OoooO00;
                TextView this_apply = (TextView) this.f31457OoooO0;
                int i2 = TopicInfoHeadView.f25245OoooO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (this$2.f25246Oooo.f49452OooOOOO.getMaxLines() != 2) {
                    p524o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_bottom_gray));
                    this$2.f25246Oooo.f49452OooOOOO.setMaxLines(2);
                } else {
                    p524o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_top_gray));
                    this$2.f25246Oooo.f49452OooOOOO.setMaxLines(Integer.MAX_VALUE);
                }
                break;
        }
    }
}
