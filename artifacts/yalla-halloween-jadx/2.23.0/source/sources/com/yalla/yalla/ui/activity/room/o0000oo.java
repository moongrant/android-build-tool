package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26839OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f26840OooO0oo;

    public o0000oo(ExploreTagRoomListActivity exploreTagRoomListActivity, int i) {
        this.f26839OooO0oO = exploreTagRoomListActivity;
        this.f26840OooO0oo = i;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        p587o0oOooo.o0OO000.OooO00o("101089");
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26839OooO0oO;
        ArrayList arrayList = exploreTagRoomListActivity.f26550OooOo00;
        int i = this.f26840OooO0oo;
        if (com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) arrayList.get(i)).id) == exploreTagRoomListActivity.f26548OooOo) {
            return;
        }
        exploreTagRoomListActivity.f26548OooOo = com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) exploreTagRoomListActivity.f26550OooOo00.get(i)).id);
        exploreTagRoomListActivity.OooOo().f58585OooO0o0.setCurrentItem(i);
        LinearLayout linearLayout = exploreTagRoomListActivity.OooOo().f58582OooO0OO.f57813OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
        com.code.android.util.o000OO00.OooO0O0(linearLayout);
    }
}
