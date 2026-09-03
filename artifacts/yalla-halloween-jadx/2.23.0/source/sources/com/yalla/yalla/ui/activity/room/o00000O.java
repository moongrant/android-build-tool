package com.yalla.yalla.ui.activity.room;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends p564o0oOo0OO.o000O<CountryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ExploreCountryRoomListActivity f26830OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(ExploreCountryRoomListActivity exploreCountryRoomListActivity, int i) {
        super(exploreCountryRoomListActivity, i);
        this.f26830OooOoo0 = exploreCountryRoomListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        CountryModel countryModel = (CountryModel) obj;
        if (viewHolder == null || countryModel == null) {
            return;
        }
        int iOooO0o0 = com.code.android.util.o000000.OooO0o0(countryModel.getCid());
        ExploreCountryRoomListActivity exploreCountryRoomListActivity = this.f26830OooOoo0;
        boolean z = iOooO0o0 == exploreCountryRoomListActivity.f26533OooOoO0;
        ((ConstraintLayout) viewHolder.getView(oO00O0oO.clMoreCountry)).setSelected(z);
        viewHolder.setGone(oO00O0oO.ivCountrySelected, z);
        viewHolder.setGone(oO00O0oO.ivHotCountry, com.code.android.util.o000000.OooO0o0(countryModel.getHotico()) == 1);
        int i = oO00O0oO.tvCountryName;
        viewHolder.setText(i, countryModel.getName());
        ((TextView) viewHolder.getView(i)).setTextColor(com.code.android.util.o0000.OooO00o(z ? oO00O0o.color_333333 : oO00O0o.color_5f5f5f));
        if (z) {
            exploreCountryRoomListActivity.OooOo().f58507OooO0OO.f57724OooO0Oo.scrollToPosition(viewHolder.getLayoutPosition());
        }
    }
}
