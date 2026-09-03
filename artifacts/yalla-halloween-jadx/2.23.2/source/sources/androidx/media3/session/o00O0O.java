package androidx.media3.session;

import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.adapter.oo0oOO0;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9432OooO0Oo;

    public /* synthetic */ o00O0O(Object obj) {
        this.f9432OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ((UserInfoLeftFragment) this.f9432OooO0Oo).lambda$initView$2();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        YallaTeamMessageActivity this$0 = (YallaTeamMessageActivity) this.f9432OooO0Oo;
        int i2 = YallaTeamMessageActivity.f25319OooOoo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oo0oOO0 oo0ooo0 = this$0.f25321OooOo;
        if (oo0ooo0 != null) {
            oo0ooo0.f27238OooOoo0 = i;
        }
        if (oo0ooo0 != null) {
            oo0ooo0.notifyDataSetChanged();
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onVideoSizeChanged(((o00O00O) this.f9432OooO0Oo).f9377OooOOOO);
    }
}
