package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26382OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f26383OooO0oo;

    public o0000O00(ExploreTagRoomListActivity exploreTagRoomListActivity, int i) {
        this.f26382OooO0oO = exploreTagRoomListActivity;
        this.f26383OooO0oo = i;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0oo0000.OooO00o.OooO0O0("101089");
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26382OooO0oO;
        ArrayList arrayList = exploreTagRoomListActivity.f26098OooOo00;
        int i = this.f26383OooO0oo;
        if (com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) arrayList.get(i)).id) == exploreTagRoomListActivity.f26096OooOo) {
            return;
        }
        exploreTagRoomListActivity.f26096OooOo = com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) exploreTagRoomListActivity.f26098OooOo00.get(i)).id);
        exploreTagRoomListActivity.OooOo().f44745OooO0o0.setCurrentItem(i);
        LinearLayout llTagRoot = exploreTagRoomListActivity.OooOo().f44742OooO0OO.f44777OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(llTagRoot, "llTagRoot");
        com.code.android.util.o000O.OooO0O0(llTagRoot);
    }
}
