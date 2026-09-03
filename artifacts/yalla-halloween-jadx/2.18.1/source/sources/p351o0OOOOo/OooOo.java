package p351o0OOOOo;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.firebase.FirebaseCommonRegistrar;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements o000000O.OooO00o, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOo f38278OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOo f38279OooO0o0 = new OooOo();

    @Override // o0OOoOo.o000000O.OooO00o
    public final String OooO00o(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.OooO0O0(installerPackageName) : "";
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreTagRoomListFragment.m328initView$lambda2(baseQuickAdapter, view, i);
    }
}
