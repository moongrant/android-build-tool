package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightFixGridLayoutManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26377OooO0oO;

    public o00000O0(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        this.f26377OooO0oO = exploreCountryRoomListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0oo0000.OooO00o.OooO0O0("101086");
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26377OooO0oO;
        ArrayList arrayList = exploreCountryRoomListActivity.f26076OooOo0;
        if (arrayList.size() == 0) {
            return;
        }
        if (exploreCountryRoomListActivity.f26075OooOo == null) {
            o00000OO o00000oo2 = new o00000OO(exploreCountryRoomListActivity, p562o0oOo000.oo0o0Oo.main_item_more_country);
            exploreCountryRoomListActivity.f26075OooOo = o00000oo2;
            int i = 1;
            o00000oo2.f13176OooO0o = new androidx.media3.session.o000000O(exploreCountryRoomListActivity, i);
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44780OooO0OO.setOnClickListener(new com.twitter.sdk.android.tweetui.o00Ooo(exploreCountryRoomListActivity, i));
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44781OooO0Oo.setLayoutManager(new MaxHeightFixGridLayoutManager(exploreCountryRoomListActivity));
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44781OooO0Oo.addItemDecoration(new ExploreCountryRoomListActivity.OooO00o(com.code.android.util.o0000O0.OooO00o(4), com.code.android.util.o0000O0.OooO00o(8)));
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44781OooO0Oo.setAdapter(exploreCountryRoomListActivity.f26075OooOo);
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44779OooO0O0.setOnClickListener(new o000000O(exploreCountryRoomListActivity, 0));
        }
        o00000OO o00000oo3 = exploreCountryRoomListActivity.f26075OooOo;
        if (o00000oo3 != null) {
            o00000oo3.OooOoO0(arrayList);
        }
        LinearLayout llCountryRoot = exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44780OooO0OO;
        Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
        com.code.android.util.o000O.OooOOOO(llCountryRoot);
    }
}
