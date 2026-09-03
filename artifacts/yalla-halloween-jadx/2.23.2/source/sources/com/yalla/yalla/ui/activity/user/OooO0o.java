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
import p205o00o0o0o.o000O;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o0000oo<CountryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f26660OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(UserCountrySelectActivity userCountrySelectActivity, int i) {
        super(userCountrySelectActivity, i);
        this.f26660OooOoo0 = userCountrySelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        final ViewHolder helper = (ViewHolder) baseViewHolder;
        final CountryModel item = (CountryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        UserCountrySelectActivity userCountrySelectActivity = this.f26660OooOoo0;
        if (userCountrySelectActivity.f26740OooOo0O == 0) {
            helper.setGone(o0OO00O.tv_title, false);
        } else if (helper.getPosition() == 0) {
            int i = o0OO00O.tv_title;
            helper.setGone(i, true);
            helper.setText(i, o000000.select_country_Hot);
        } else if (helper.getPosition() == userCountrySelectActivity.f26740OooOo0O) {
            int i2 = o0OO00O.tv_title;
            helper.setGone(i2, true);
            helper.setText(i2, o000000.All);
        } else {
            helper.setGone(o0OO00O.tv_title, false);
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        boolean z = o0O00oO0.OooO0OO().getValue() == Integer.valueOf(item.getCid());
        helper.setGone(o0OO00O.ivSelected, z);
        if (userCountrySelectActivity.f26742OooOoO == helper.getLayoutPosition()) {
            helper.setBackgroundColor(o0OO00O.ll_country_item, o0000.OooO00o(o0OOO0o.color_E9E9E9));
        } else {
            helper.setBackgroundRes(o0OO00O.ll_country_item, o0Oo0oo.ripple_border);
        }
        helper.setText(o0OO00O.tv_country, item.getName());
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(userCountrySelectActivity);
        oooO00o.f43126OooO0OO = p595o0oo00O.OooOo00.OooO00o(item.getCid());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_flag));
        int i3 = o0OO00O.ll_country_item;
        final UserCountrySelectActivity userCountrySelectActivity2 = this.f26660OooOoo0;
        final boolean z2 = z;
        helper.setViewOnClickListener(i3, new View.OnClickListener() { // from class: o0o00oOo.oO0O00O
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
                if (!this$0.f26737OooOo) {
                    LiveEventBus.get("Recharge_Country_Temp").post(item2);
                    this$0.finish();
                    return;
                }
                if (z2) {
                    return;
                }
                this$0.f26742OooOoO = helper2.getLayoutPosition();
                this$1.notifyItemChanged(helper2.getLayoutPosition());
                Intrinsics.checkNotNullParameter(item2, "item");
                boolean zContains = p386o0OOooO.o0Oo0oo.f43505OooO00o.contains(Integer.valueOf(item2.getCid()));
                RoomIndexModel value = o0O00oO0.f47987Ooooo00.getValue();
                if (value == null || value.ispwdroom != 1) {
                    z3 = false;
                } else {
                    Integer numValueOf = Integer.valueOf(value.isencrypt);
                    Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
                    if (numValueOf.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                String strOooO00o = o0000O.OooO00o(this$0.getString(o000000.UserInfoTag_ChangeCountry_HintContent), item2.getName());
                if (zContains && !this$0.f26743OooOoO0 && z3) {
                    strOooO00o = o0000.OooO0OO(o000000.change_country_pas_room_limited);
                }
                o000O o000o = new o000O(this$0);
                o000o.OooOo00(strOooO00o);
                o000o.OooOOOO(o000000.Change_Country);
                o000o.OooOo0(new oO0O00oO(item2, this$0, zContains));
                o000o.OooOo(true);
                o000o.OooOO0(new OooOO0(this$0));
                o000o.OooOO0o();
            }
        });
    }
}
