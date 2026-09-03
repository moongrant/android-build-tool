package p487o0o00O;

import android.view.View;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f48790OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48791OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48792OooO0oo;

    public o000OOo(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean, ViewHolder viewHolder) {
        this.f48791OooO0oO = blackListActivity;
        this.f48792OooO0oo = dataBean;
        this.f48790OooO = viewHolder;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f48790OooO.getLayoutPosition();
        int i = BlackListActivity.f24914OooOo;
        BlackListActivity blackListActivity = this.f48791OooO0oO;
        blackListActivity.getClass();
        o000O o000o = new o000O(blackListActivity);
        String string = blackListActivity.getString(o000000.Unblock_this_user);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        o000o.OooOo00(string);
        o000o.OooOo(true);
        o000o.OooOo0(new o00000(blackListActivity, this.f48792OooO0oo));
        o000o.OooOO0o();
    }
}
