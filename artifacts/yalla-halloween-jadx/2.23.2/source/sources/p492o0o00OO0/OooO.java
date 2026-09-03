package p492o0o00OO0;

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
public final /* synthetic */ class OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49083OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f49084OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49085OooO0o0;

    public /* synthetic */ OooO(int i, Object obj, Object obj2) {
        this.f49083OooO0Oo = i;
        this.f49085OooO0o0 = obj;
        this.f49084OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49083OooO0Oo;
        Object obj = this.f49084OooO0o;
        Object obj2 = this.f49085OooO0o0;
        switch (i) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) obj2;
                ViewHolder helper = (ViewHolder) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                Function1<? super Integer, Unit> function1 = this$0.f25574OooOooO;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                break;
            default:
                MemberRemoveLayout this$1 = (MemberRemoveLayout) obj2;
                RoomUserInfoModel item = (RoomUserInfoModel) obj;
                int i2 = MemberRemoveLayout.f29952OooO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                Context context = this$1.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                UserInfoActivity.OooO00o.OooO0O0((Activity) context, String.valueOf(item.getUserId().getValue().longValue()), false, true, false, false);
                break;
        }
    }
}
