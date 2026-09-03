package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f48385OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48386OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48387OooO0oo;

    public o0OO00O(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean, ViewHolder viewHolder) {
        this.f48386OooO0oO = blackListActivity;
        this.f48387OooO0oo = dataBean;
        this.f48385OooO = viewHolder;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f48385OooO.getLayoutPosition();
        int i = BlackListActivity.f25368OooOo;
        BlackListActivity blackListActivity = this.f48386OooO0oO;
        blackListActivity.getClass();
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(blackListActivity);
        String string = blackListActivity.getString(oO00OOo0.Unblock_this_user);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Unblock_this_user)");
        o0oo00o2.OooOo00(string);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new o000OOo(blackListActivity, this.f48387OooO0oo));
        o0oo00o2.OooOO0o();
    }
}
