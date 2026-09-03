package p544o0o0OoOO;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p563o0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o5 implements o0ooOOo, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f44283OooO0Oo;

    public /* synthetic */ o5(Object obj) {
        this.f44283OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Context context;
        MessageBoxFragment this$0 = (MessageBoxFragment) this.f44283OooO0Oo;
        int i2 = MessageBoxFragment.f24012OoooOoo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0OO00O o0oo00o2 = this$0.f24013OoooOOO;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o2 = null;
        }
        SystemConversationModel item = o0oo00o2.getItem(i);
        if (item == null || (context = this$0.getContext()) == null) {
            return;
        }
        int i3 = MessageBoxFragment.OooO00o.$EnumSwitchMapping$0[item.getType().ordinal()];
        if (i3 == 1) {
            MomentMessageListActivity.f22334OoooooO.OooO00o(context);
            return;
        }
        if (i3 == 2) {
            SystemMessageActivity.OooO00o oooO00o = SystemMessageActivity.f22242OooooOO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SystemMessageActivity.class));
        } else if (i3 == 3) {
            context.startActivity(new Intent(this$0.getContext(), (Class<?>) ActivitiesNoticeActivity.class));
        } else if (i3 == 4) {
            YallaTeamMessageActivity.f22251OoooooO.OooO00o(context);
        } else {
            if (i3 != 5) {
                return;
            }
            FriendRequestMessageActivity.f22157OooooOO.OooO00o(context);
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        RoomMoraGameHistoryActivity this$0 = (RoomMoraGameHistoryActivity) this.f44283OooO0Oo;
        RoomMoraGameHistoryActivity.OooO00o oooO00o = RoomMoraGameHistoryActivity.f22938OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoOO();
    }
}
