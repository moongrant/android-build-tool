package p485o0o00O0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0OO0O implements BaseQuickAdapter.OooO0o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48155OooO0Oo;

    public /* synthetic */ oOO0OO0O(Object obj) {
        this.f48155OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        RoomLuckyNumberHistoryDialog this$0 = (RoomLuckyNumberHistoryDialog) this.f48155OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOOO(true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicManagerActivity this$0 = (TopicManagerActivity) this.f48155OooO0Oo;
        int i2 = TopicManagerActivity.f26382OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        this$0.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, String.valueOf(this$0.OooOo().f10111OooOOoo.get(i).getUserId()), false, 12);
    }
}
