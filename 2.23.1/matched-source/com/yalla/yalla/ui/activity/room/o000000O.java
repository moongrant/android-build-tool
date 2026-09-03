package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26377OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26378OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f26377OooO0Oo = i;
        this.f26378OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f26377OooO0Oo;
        Object obj = this.f26378OooO0o0;
        switch (i) {
            case 0:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i2 = ExploreCountryRoomListActivity.f26075OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llCountryRoot = this$0.OooOo().f44741OooO0OO.f44775OooO0OO;
                Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
                com.code.android.util.o000O.OooO0O0(llCountryRoot);
                break;
            default:
                MainExploreFragment.showOrInitErrorView$lambda$6((MainExploreFragment) obj, view);
                break;
        }
    }
}
