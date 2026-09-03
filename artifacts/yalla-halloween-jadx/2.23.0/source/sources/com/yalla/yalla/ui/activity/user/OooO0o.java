package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.user.OooO0o;
import com.yalla.yalla.ui.activity.user.OooOO0;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p157o00OoOO0.o0OO00O;
import p382o0OOoo0o.o00O0O;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o000O<CountryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f27127OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(UserCountrySelectActivity userCountrySelectActivity, int i) {
        super(userCountrySelectActivity, i);
        this.f27127OooOoo0 = userCountrySelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        final ViewHolder helper = (ViewHolder) baseViewHolder;
        final CountryModel item = (CountryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        UserCountrySelectActivity userCountrySelectActivity = this.f27127OooOoo0;
        if (userCountrySelectActivity.f27205OooOo0O == 0) {
            helper.setGone(oO00O0oO.tv_title, false);
        } else if (helper.getPosition() == 0) {
            int i = oO00O0oO.tv_title;
            helper.setGone(i, true);
            helper.setText(i, oO00OOo0.select_country_Hot);
        } else if (helper.getPosition() == userCountrySelectActivity.f27205OooOo0O) {
            int i2 = oO00O0oO.tv_title;
            helper.setGone(i2, true);
            helper.setText(i2, oO00OOo0.All);
        } else {
            helper.setGone(oO00O0oO.tv_title, false);
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        boolean z = o000000O.OooO0OO().getValue() == Integer.valueOf(item.getCid());
        helper.setGone(oO00O0oO.ivSelected, z);
        if (userCountrySelectActivity.f27207OooOoO == helper.getLayoutPosition()) {
            helper.setBackgroundColor(oO00O0oO.ll_country_item, o0000.OooO00o(oO00O0o.color_E9E9E9));
        } else {
            helper.setBackgroundRes(oO00O0oO.ll_country_item, oOo00OO0.ripple_border);
        }
        helper.setText(oO00O0oO.tv_country, item.getName());
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(userCountrySelectActivity);
        oooO00o.f43911OooO0OO = p591o0oo000O.OooO.OooO00o(item.getCid());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_flag));
        int i3 = oO00O0oO.ll_country_item;
        final UserCountrySelectActivity userCountrySelectActivity2 = this.f27127OooOoo0;
        final boolean z2 = z;
        helper.setViewOnClickListener(i3, new View.OnClickListener() { // from class: o0o00o.oo00oO
            /* JADX WARN: Code duplicated, block: B:15:0x0077  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z3;
                UserCountrySelectActivity this$0 = userCountrySelectActivity2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CountryModel item2 = item;
                Intrinsics.checkNotNullParameter(item2, "$item");
                ViewHolder helper2 = helper;
                Intrinsics.checkNotNullParameter(helper2, "$helper");
                OooO0o this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (!this$0.f27202OooOo) {
                    LiveEventBus.get("Recharge_Country_Temp").post(item2);
                    this$0.finish();
                    return;
                }
                if (z2) {
                    return;
                }
                this$0.f27207OooOoO = helper2.getLayoutPosition();
                this$1.notifyItemChanged(helper2.getLayoutPosition());
                Intrinsics.checkNotNullParameter(item2, "item");
                boolean zContains = o00O0O.f44281OooO00o.contains(Integer.valueOf(item2.getCid()));
                RoomIndexModel value = o000000O.f46724OoooOoo.getValue();
                if (value == null || value.ispwdroom != 1) {
                    z3 = false;
                } else {
                    Integer numValueOf = Integer.valueOf(value.isencrypt);
                    Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(roomInfo.isencrypt)");
                    if (numValueOf.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                String strOooO00o = o0000O.OooO00o(this$0.getString(oO00OOo0.UserInfoTag_ChangeCountry_HintContent), item2.getName());
                if (zContains && !this$0.f27208OooOoO0 && z3) {
                    strOooO00o = o0000.OooO0OO(oO00OOo0.change_country_pas_room_limited);
                }
                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                o0oo00o2.OooOo00(strOooO00o);
                o0oo00o2.OooOOOO(oO00OOo0.Change_Country);
                o0oo00o2.OooOo0(new o0O0o(item2, this$0, zContains));
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0(new OooOO0(this$0));
                o0oo00o2.OooOO0o();
            }
        });
    }
}
