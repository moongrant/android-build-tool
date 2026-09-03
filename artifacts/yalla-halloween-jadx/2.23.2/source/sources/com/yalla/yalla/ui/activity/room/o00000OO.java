package com.yalla.yalla.ui.activity.room;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends p571o0oOoO0.o0000oo<CountryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26378OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(ExploreCountryRoomListActivity exploreCountryRoomListActivity, int i) {
        super(exploreCountryRoomListActivity, i);
        this.f26378OooOoo0 = exploreCountryRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        CountryModel countryModel = (CountryModel) obj;
        if (viewHolder == null || countryModel == null) {
            return;
        }
        int iOooO0o0 = com.code.android.util.o000000.OooO0o0(countryModel.getCid());
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26378OooOoo0;
        boolean z = iOooO0o0 == exploreCountryRoomListActivity.f26081OooOoO0;
        ((ConstraintLayout) viewHolder.getView(p562o0oOo000.o0OO00O.clMoreCountry)).setSelected(z);
        viewHolder.setGone(p562o0oOo000.o0OO00O.ivCountrySelected, z);
        viewHolder.setGone(p562o0oOo000.o0OO00O.ivHotCountry, com.code.android.util.o000000.OooO0o0(countryModel.getHotico()) == 1);
        int i = p562o0oOo000.o0OO00O.tvCountryName;
        viewHolder.setText(i, countryModel.getName());
        ((TextView) viewHolder.getView(i)).setTextColor(com.code.android.util.o0000.OooO00o(z ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_5f5f5f));
        if (z) {
            exploreCountryRoomListActivity.OooOo().f44735OooO0OO.f44781OooO0Oo.scrollToPosition(viewHolder.getLayoutPosition());
        }
    }
}
