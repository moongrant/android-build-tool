package p144o00OOooo;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.oOO00O;
import p524o0o0O0o.o00O0;
import p581o0oOoOOo.l;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O00 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32021OooO0O0;

    public /* synthetic */ o00O0O00(Object obj, int i) {
        this.f32020OooO00o = i;
        this.f32021OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = false;
        switch (this.f32020OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m49initObserve$lambda12((RoomInfoMemberListFragment) this.f32021OooO0O0, obj);
                break;
            case 1:
                va bindingDrawer = (va) this.f32021OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50816OooOO0.setText((String) obj);
                break;
            case 2:
                UntieAccountBindActivity this$0 = (UntieAccountBindActivity) this.f32021OooO0O0;
                Response response = (Response) obj;
                int i = UntieAccountBindActivity.f21906Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                if (response.getIsSuccess()) {
                    if (response.getData() != null) {
                        this$0.f21909OooooOo = (AccountBindInfo) response.getData();
                    }
                }
                break;
            case 3:
                YallaTeamMessageActivity this$1 = (YallaTeamMessageActivity) this.f32021OooO0O0;
                Integer it = (Integer) obj;
                YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22270ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                int iIntValue = it.intValue();
                TextView textView = this$1.f22275Oooooo0;
                if (iIntValue <= 0) {
                    if (textView != null) {
                        o00O0O.OooO00o(textView);
                    }
                } else if (textView != null) {
                    o00O0O.OooO(textView);
                }
                break;
            case 4:
                l this$2 = (l) this.f32021OooO0O0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOO0O().f49909OooO0OO.setText(o00O0.OooO0O0(String.valueOf((Long) obj)));
                break;
            case 5:
                FriendListFragment.m331initData$lambda2((FriendListFragment) this.f32021OooO0O0, (Pair) obj);
                break;
            default:
                RoomMemberConveneListDialog this$3 = (RoomMemberConveneListDialog) this.f32021OooO0O0;
                CheckConveneMemberStatusModel checkConveneMemberStatusModel = (CheckConveneMemberStatusModel) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.f24189Oooooo0 = checkConveneMemberStatusModel;
                if (checkConveneMemberStatusModel != null && checkConveneMemberStatusModel.getState() == 0) {
                    z = true;
                }
                boolean z2 = !z;
                this$3.f24188Oooooo = z2;
                if (z2) {
                    SearchLayout searchLayout = this$3.OooOOO().f49112OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(searchLayout, "binding.searchView");
                    oOO00O.OooO00o(searchLayout);
                }
                this$3.OooOOO0().notifyDataSetChanged();
                break;
        }
    }
}
