package p544o0o0OoOO;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.model.CountryModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 extends OooO0OO<CountryModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f44353OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(ExploreCountryRoomListActivity exploreCountryRoomListActivity) {
        super(exploreCountryRoomListActivity, R.layout.main_item_more_country);
        this.f44353OooO00o = exploreCountryRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        CountryModel countryModel = (CountryModel) obj;
        if (oooO0o == null || countryModel == null) {
            return;
        }
        boolean z = o000Oo0.OooO0OO(countryModel.getCid(), 0) == this.f44353OooO00o.f22805Oooooo0;
        ((ConstraintLayout) oooO0o.OooO0Oo(R.id.clMoreCountry)).setSelected(z);
        oooO0o.OooO0oO(R.id.ivCountrySelected, z);
        oooO0o.OooO0oO(R.id.ivHotCountry, o000Oo0.OooO0OO(countryModel.getHotico(), 0) == 1);
        oooO0o.OooOO0(R.id.tvCountryName, countryModel.getName());
        ((TextView) oooO0o.OooO0Oo(R.id.tvCountryName)).setTextColor(o000O0O0.OooO00o(z ? R.color.color_333333 : R.color.color_5f5f5f));
        if (z) {
            this.f44353OooO00o.OooOoo().f49353OooO0OO.f50696OooO0Oo.scrollToPosition(oooO0o.getLayoutPosition());
        }
    }
}
