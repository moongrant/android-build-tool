package p544o0o0OoOO;

import androidx.viewpager2.widget.ViewPager2;
import com.app.base.model.CountryModel;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import p254o00ooO0O.o000Oo0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f44346OooO00o;

    public y3(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        this.f44346OooO00o = exploreCountryRoomListActivity;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.CountryModel>] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        if (i >= 0 && i < this.f44346OooO00o.f22801OooooO0.size()) {
            ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f44346OooO00o;
            exploreCountryRoomListActivity.OooOoO0((String) exploreCountryRoomListActivity.f22801OooooO0.get(i));
            ExploreCountryRoomListActivity exploreCountryRoomListActivity2 = this.f44346OooO00o;
            exploreCountryRoomListActivity2.f22805Oooooo0 = o000Oo0.OooO0OO(((CountryModel) exploreCountryRoomListActivity2.f22800Ooooo0o.get(i)).getCid(), 0);
            ExploreCountryRoomListActivity exploreCountryRoomListActivity3 = this.f44346OooO00o;
            if (exploreCountryRoomListActivity3.f22806OoooooO) {
                o0O00000.OooO0Oo("Room_country_change", exploreCountryRoomListActivity3.f22805Oooooo0);
            }
        }
        this.f44346OooO00o.f22806OoooooO = true;
    }
}
