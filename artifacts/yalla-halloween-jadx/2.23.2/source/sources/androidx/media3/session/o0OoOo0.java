package androidx.media3.session;

import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9489OooO0Oo;

    public /* synthetic */ o0OoOo0(Object obj) {
        this.f9489OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter adapter, View view, int i) {
        SearchFriendActivity this$0 = (SearchFriendActivity) this.f9489OooO0Oo;
        int i2 = SearchFriendActivity.f25264OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        o0oo0000.OooO00o.OooO0O0("104036");
        Object obj = adapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.data.db.table.UserInfo");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        this$0.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, o0000O00.OooO00o(((UserInfo) obj).getUserId()), false, 12);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaylistMetadataChanged(((o00O00O) this.f9489OooO0Oo).f9378OooOOOo);
    }
}
