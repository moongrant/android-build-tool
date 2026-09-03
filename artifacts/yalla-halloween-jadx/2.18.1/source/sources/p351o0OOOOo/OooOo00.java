package p351o0OOOOo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import p382o0OOoOo.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements o000000O.OooO00o, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f38280OooO0Oo = new OooOo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f38281OooO0o0 = new OooOo00();

    @Override // o0OOoOo.o000000O.OooO00o
    public final String OooO00o(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListFragment.m325initView$lambda2(baseQuickAdapter, view, i);
    }
}
