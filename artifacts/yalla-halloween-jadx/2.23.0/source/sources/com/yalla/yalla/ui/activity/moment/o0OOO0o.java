package com.yalla.yalla.ui.activity.moment;

import android.widget.TextView;
import com.android.billingclient.api.o0000OO0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.DateNumeralUtils;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends o000O<LockShopModel.LockShopModelItem> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f26443OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(PurchaseLockRoomActivity purchaseLockRoomActivity, int i) {
        super(purchaseLockRoomActivity, i);
        this.f26443OooOoo0 = purchaseLockRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        DateNumeralUtils.DateType dateType;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        LockShopModel.LockShopModelItem item = (LockShopModel.LockShopModelItem) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        T value = p464o0Oooo.o000000O.OooOO0o().getValue();
        Intrinsics.checkNotNull(value);
        TextView textView = (TextView) helper.getView(oO00O0oO.tv_price);
        TextView textView2 = (TextView) helper.getView(oO00O0oO.tv_num);
        TextView textView3 = (TextView) helper.getView(oO00O0oO.tv_num_unit);
        TextView textView4 = (TextView) helper.getView(oO00O0oO.tv_buy_room_lock);
        TextView textView5 = (TextView) helper.getView(oO00O0oO.tv_origin_price);
        if (item.getPromotionPrice() > item.getDiscountPrice()) {
            textView.setText(p590o0oo0.OooOOOO.OooO0OO(Long.valueOf(item.getDiscountPrice())));
            textView5.setText(p590o0oo0.OooOOOO.OooO0OO(Long.valueOf(item.getPromotionPrice())));
            textView5.getPaint().setAntiAlias(true);
            textView5.getPaint().setFlags(17);
        } else {
            textView.setText(p590o0oo0.OooOOOO.OooO0OO(Long.valueOf(item.getPromotionPrice())));
        }
        byte b = 0;
        if (o0000OO0.OooO0O0().OooO0O0("HAS_ROOM" + p464o0Oooo.o000000O.OooOOo0().getValue(), false)) {
            textView4.setBackgroundResource(oOo00OO0.bg_buy_roomlock);
        } else {
            textView4.setBackgroundResource(oOo00OO0.bg_btn_gray);
        }
        textView2.setText(String.valueOf(item.getTimeLong()));
        long timeLong = item.getTimeLong();
        String unit = item.getUnit();
        if (com.code.android.util.OooOo00.OooO00o(unit)) {
            dateType = DateNumeralUtils.DateType.d;
        } else {
            int iHashCode = unit.hashCode();
            if (iHashCode != 77) {
                if (iHashCode != 100) {
                    if (iHashCode != 104) {
                        if (iHashCode != 109 || !unit.equals("m")) {
                            b = -1;
                        }
                    } else if (unit.equals("h")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (unit.equals("d")) {
                    b = 3;
                } else {
                    b = -1;
                }
            } else if (unit.equals("M")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                dateType = DateNumeralUtils.DateType.m;
            } else if (b != 1) {
                dateType = b != 2 ? DateNumeralUtils.DateType.d : DateNumeralUtils.DateType.M;
            } else {
                dateType = DateNumeralUtils.DateType.h;
            }
        }
        String string = this.f26443OooOoo0.getString(DateNumeralUtils.OooO00o(timeLong, dateType));
        Intrinsics.checkNotNullExpressionValue(string, "getString(DateNumeralUti…tem.timeLong, item.unit))");
        textView3.setText(string);
    }
}
