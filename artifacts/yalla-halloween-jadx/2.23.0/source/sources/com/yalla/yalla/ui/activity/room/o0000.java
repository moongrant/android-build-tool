package com.yalla.yalla.ui.activity.room;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f26826OooO00o;

    public o0000(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        this.f26826OooO00o = exploreTagRoomListActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f26826OooO00o;
        p587o0oOooo.o0OO000.OooO0O0("101026", MapsKt.mapOf(new Pair("tagid", ((CategoryModel) exploreTagRoomListActivity.f26550OooOo00.get(i)).id)));
        ArrayList arrayList = exploreTagRoomListActivity.f26549OooOo0;
        if (i >= 0 && i < arrayList.size()) {
            exploreTagRoomListActivity.OooOo00((String) arrayList.get(i));
            exploreTagRoomListActivity.f26548OooOo = com.code.android.util.o0OoOo0.OooO0o(0, ((CategoryModel) exploreTagRoomListActivity.f26550OooOo00.get(i)).id);
        }
    }
}
