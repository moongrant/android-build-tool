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

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31438Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31439Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f31440Oooo0oo;

    public /* synthetic */ o00000OO(Object obj, Object obj2, int i) {
        this.f31438Oooo0o = i;
        this.f31439Oooo0oO = obj;
        this.f31440Oooo0oo = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31438Oooo0o) {
            case 0:
                ChatModel model = (ChatModel) this.f31439Oooo0oO;
                o0000Ooo this$0 = (o0000Ooo) this.f31440Oooo0oo;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p606o0oo0O.OooOo.OooO0OO("102001", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(model.eventModel.getId())), new Pair("roomeventState", Integer.valueOf(model.eventModel.getEventState()))));
                Function0<Unit> function0 = this$0.f31459OooO0Oo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                MemberRemoveLayout this$1 = (MemberRemoveLayout) this.f31439Oooo0oO;
                RoomUserInfoModel item = (RoomUserInfoModel) this.f31440Oooo0oo;
                int i = MemberRemoveLayout.f24859Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
                Context context = this$1.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                oooO00o.OooO0OO((Activity) context, String.valueOf(item.getUserId()), false, true, false, false);
                break;
            default:
                TopicInfoHeadView this$2 = (TopicInfoHeadView) this.f31439Oooo0oO;
                TextView this_apply = (TextView) this.f31440Oooo0oo;
                int i2 = TopicInfoHeadView.f25226Oooo0oo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (this$2.f25227Oooo0o.f49515OooOOOO.getMaxLines() != 2) {
                    p522o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_bottom_gray));
                    this$2.f25227Oooo0o.f49515OooOOOO.setMaxLines(2);
                } else {
                    p522o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_top_gray));
                    this$2.f25227Oooo0o.f49515OooOOOO.setMaxLines(Integer.MAX_VALUE);
                }
                break;
        }
    }
}
