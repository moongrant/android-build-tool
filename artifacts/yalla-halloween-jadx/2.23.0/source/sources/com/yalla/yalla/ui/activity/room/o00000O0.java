package com.yalla.yalla.ui.activity.room;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.CountryModel;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26831OooO00o;

    public o00000O0(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        this.f26831OooO00o = exploreCountryRoomListActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26831OooO00o;
        if (i >= 0 && i < exploreCountryRoomListActivity.f26530OooOo0O.size()) {
            exploreCountryRoomListActivity.OooOo00((String) exploreCountryRoomListActivity.f26530OooOo0O.get(i));
            int iOooO0o0 = com.code.android.util.o000000.OooO0o0(((CountryModel) exploreCountryRoomListActivity.f26528OooOo0.get(i)).getCid());
            exploreCountryRoomListActivity.f26533OooOoO0 = iOooO0o0;
            if (exploreCountryRoomListActivity.f26534OooOoOO) {
                p587o0oOooo.o0OO000.OooO0O0("101024", MapsKt.mapOf(new Pair("countryid", Integer.valueOf(iOooO0o0))));
            }
        }
        exploreCountryRoomListActivity.f26534OooOoOO = true;
    }
}
