package androidx.media3.session;

import android.view.View;
import android.widget.PopupWindow;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import kotlin.jvm.internal.Intrinsics;
import p642o0ooOOO0.d1;
import p650o0ooo.oOOO0OO0;
import p650o0ooo.oOOo0000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements o000OoO.o00000O0.OooO00o, p559o0oOo.o00O0O, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9478OooO0Oo;

    public /* synthetic */ o00Ooo(Object obj) {
        this.f9478OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f9478OooO0Oo;
        int i = JoinTopicListActivity.f25596OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oOOO0OO0 this$0 = (oOOO0OO0) this.f9478OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oOOo0000 oooo0000 = this$0.f59009OooOooO;
        if (oooo0000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
            oooo0000 = null;
        }
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) oooo0000.f13189OooOOoo.get(i);
        this$0.f59008OooOoo0 = roomUserInfoModel.getUserId().getValue().longValue();
        if (i == 0) {
            this$0.OooOO0().f44140OooOOOO.setImageResource(p562o0oOo000.o0Oo0oo.icon_default_head_circle);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$0.f58507OooO0Oo);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = roomUserInfoModel.getUserHeader().getValue();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(this$0.OooOO0().f44140OooOOOO);
        }
        this$0.OooOO0().f44152OooOoOO.setText(p412o0Oo0o0O.o000O000.OooO0O0(this$0.f59008OooOoo0, roomUserInfoModel.getUserName().getValue()));
        PopupWindow popupWindow = this$0.f59007OooOoo;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerError((PlaybackException) this.f9478OooO0Oo);
    }
}
