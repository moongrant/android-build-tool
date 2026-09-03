package p493o0o00O0o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49168OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f49169OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49170OooO0o0;

    public /* synthetic */ o0O0O0Oo(int i, Object obj, Object obj2) {
        this.f49168OooO0Oo = i;
        this.f49170OooO0o0 = obj;
        this.f49169OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49168OooO0Oo;
        Object obj = this.f49169OooO0o;
        Object obj2 = this.f49170OooO0o0;
        switch (i) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) obj2;
                ViewHolder helper = (ViewHolder) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                Function1<? super Integer, Unit> function1 = this$0.f25576OooOooO;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                break;
            default:
                MemberRemoveLayout this$1 = (MemberRemoveLayout) obj2;
                RoomUserInfoModel item = (RoomUserInfoModel) obj;
                int i2 = MemberRemoveLayout.f29962OooO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26776Oooo0o;
                Context context = this$1.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0O0((Activity) context, String.valueOf(item.getUserId().getValue().longValue()), false, true, false, false);
                break;
        }
    }
}
