package o000O00O;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000Oo0 implements o000OoO.o00000.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34035OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f34034OooO0Oo = i;
        this.f34035OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Context context;
        MessageBoxFragment this$0 = (MessageBoxFragment) this.f34035OooO0o0;
        int i2 = MessageBoxFragment.f28004OooOo00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.yalla.yalla.ui.adapter.Oooo000 oooo000 = this$0.f28006OooOOOo;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        SystemConversationModel systemConversationModelOooOOO = oooo000.OooOOO(i);
        if (systemConversationModelOooOOO == null || (context = this$0.getContext()) == null) {
            return;
        }
        int i3 = MessageBoxFragment.OooO00o.$EnumSwitchMapping$0[systemConversationModelOooOOO.getType().ordinal()];
        if (i3 == 1) {
            int i4 = MomentMessageListActivity.f25669OooOoOO;
            MomentMessageListActivity.OooO00o.OooO00o(context);
            return;
        }
        if (i3 == 2) {
            int i5 = SystemMessageActivity.f25310OooOo0o;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SystemMessageActivity.class));
        } else {
            if (i3 == 3) {
                context.startActivity(new Intent(this$0.getContext(), (Class<?>) ActivitiesNoticeActivity.class));
                return;
            }
            if (i3 == 4) {
                int i6 = YallaTeamMessageActivity.f25320OooOoo0;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
            } else {
                if (i3 != 5) {
                    return;
                }
                int i7 = FriendRequestMessageActivity.f25196OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) FriendRequestMessageActivity.class));
            }
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34034OooO0Oo;
        Object obj2 = this.f34035OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onTracksChanged(((o00O0OOO) obj2).f34096OooO.f46757OooO0Oo);
                return;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}
