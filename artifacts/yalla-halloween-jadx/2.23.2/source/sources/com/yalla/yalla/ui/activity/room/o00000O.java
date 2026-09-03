package com.yalla.yalla.ui.activity.room;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.CountryModel;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26376OooO00o;

    public o00000O(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        this.f26376OooO00o = exploreCountryRoomListActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26376OooO00o;
        if (i >= 0 && i < exploreCountryRoomListActivity.f26078OooOo0O.size()) {
            exploreCountryRoomListActivity.OooOo00((String) exploreCountryRoomListActivity.f26078OooOo0O.get(i));
            int iOooO0o0 = com.code.android.util.o000000.OooO0o0(((CountryModel) exploreCountryRoomListActivity.f26076OooOo0.get(i)).getCid());
            exploreCountryRoomListActivity.f26081OooOoO0 = iOooO0o0;
            if (exploreCountryRoomListActivity.f26082OooOoOO) {
                o0oo0000.OooO00o.OooO0OO("101024", MapsKt.mapOf(new Pair("countryid", Integer.valueOf(iOooO0o0))));
            }
        }
        exploreCountryRoomListActivity.f26082OooOoOO = true;
    }
}
