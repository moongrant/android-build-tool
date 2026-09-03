package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightFixGridLayoutManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26827OooO0oO;

    public o00000(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        this.f26827OooO0oO = exploreCountryRoomListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p587o0oOooo.o0OO000.OooO00o("101086");
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26827OooO0oO;
        ArrayList arrayList = exploreCountryRoomListActivity.f26528OooOo0;
        if (arrayList.size() == 0) {
            return;
        }
        if (exploreCountryRoomListActivity.f26527OooOo == null) {
            o00000O o00000o = new o00000O(exploreCountryRoomListActivity, oO00OO0O.main_item_more_country);
            exploreCountryRoomListActivity.f26527OooOo = o00000o;
            o00000o.f10098OooO0o = new p037OoooOo0.o0O0ooO(exploreCountryRoomListActivity);
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57723OooO0OO.setOnClickListener(new androidx.media3.ui.OooOO0(exploreCountryRoomListActivity, 2));
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57724OooO0Oo.setLayoutManager(new MaxHeightFixGridLayoutManager(exploreCountryRoomListActivity));
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57724OooO0Oo.addItemDecoration(new ExploreCountryRoomListActivity.OooO00o(com.code.android.util.o0000O0.OooO00o(4), com.code.android.util.o0000O0.OooO00o(8)));
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57724OooO0Oo.setAdapter(exploreCountryRoomListActivity.f26527OooOo);
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57722OooO0O0.setOnClickListener(new androidx.media3.ui.OooOO0O(exploreCountryRoomListActivity, 1));
        }
        o00000O o00000o2 = exploreCountryRoomListActivity.f26527OooOo;
        if (o00000o2 != null) {
            o00000o2.OooOoO0(arrayList);
        }
        LinearLayout linearLayout = exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57723OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
        com.code.android.util.o000OO00.OooOOOO(linearLayout);
    }
}
