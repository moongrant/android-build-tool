package p485o0o00O0;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0OO implements BaseQuickAdapter.OooO0O0, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48154OooO0Oo;

    public /* synthetic */ oOO0OO(Object obj) {
        this.f48154OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        RoomLuckyNumberHistoryDialog this$0 = (RoomLuckyNumberHistoryDialog) this.f48154OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOOO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicManagerActivity this$0 = (TopicManagerActivity) this.f48154OooO0Oo;
        int i2 = TopicManagerActivity.f26382OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() == oO00O0oO.tvUserRevoke) {
            String strValueOf = String.valueOf(this$0.OooOo().f10111OooOOoo.get(i).getUserId());
            String userName = this$0.OooOo().f10111OooOOoo.get(i).getUserName();
            if (this$0.isDestroyed() || this$0.isFinishing()) {
                return;
            }
            Intrinsics.checkNotNull(this$0, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
            this$0.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(930893164, true, new oOOO0OO0(userName, this$0, strValueOf, i)));
        }
    }
}
