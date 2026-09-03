package p499o0o00o0O;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p139o00OOooO.OooO0o;
import p157o00OoOO0.o0OO00O;
import p362o0OOo0O.OooOO0;
import p564o0oOo0OO.o000O;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends o000O<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f49394OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(VehicleMineActivity vehicleMineActivity, int i) {
        super(vehicleMineActivity, i);
        this.f49394OooOoo0 = vehicleMineActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView showDayNum$lambda$0 = (TextView) helper.getView(oO00O0oO.tvLimitTime);
        Intrinsics.checkNotNullExpressionValue(showDayNum$lambda$0, "showDayNum$lambda$0");
        o000OO00.OooO0OO(showDayNum$lambda$0);
        showDayNum$lambda$0.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
        showDayNum$lambda$0.setBackgroundResource(oOo00OO0.user_all_head_bg_ffeeec);
        oO000Oo.OooO00o(showDayNum$lambda$0, o0000.OooO0O0(oOo00OO0.user_ic_vehicle_limit_time_mine), ViewLocation.start, OooO.OooO0o0());
        if (item.getDayNum() > 0 && item.getTimeLong() != -1) {
            o000OO00.OooOOOO(showDayNum$lambda$0);
            showDayNum$lambda$0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vehicle_store_xxx_days), String.valueOf(item.getDayNum())));
        }
        View view = helper.getView(oO00O0oO.ivImage);
        Intrinsics.checkNotNullExpressionValue(view, "helper.getView(R.id.ivImage)");
        NetImageView netImageView = (NetImageView) view;
        View view2 = helper.getView(oO00O0oO.ivPlay);
        Intrinsics.checkNotNullExpressionValue(view2, "helper.getView(R.id.ivPlay)");
        try {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(item.getPic());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_vehicel_placeholder;
            oooO00o.OooO0Oo(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView = (TextView) helper.getView(oO00O0oO.tvVehicleTag);
        if (textView != null) {
            textView.setText(item.getVehicleTag());
            o000OO00.OooOOOO(textView);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_4A90E2));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o000OO00.OooO0OO(textView);
            } else {
                textView.setTextColor(o0000.OooO00o(oO00O0o.color_FF5B48));
                textView.setBackgroundColor(o0000.OooO00o(oO00O0o.color_FFE7E4));
                textView.setText(o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip5));
            }
        }
        View view3 = helper.getView(oO00O0oO.layoutTopForeground);
        final TextView textView2 = (TextView) helper.getView(oO00O0oO.tvPurchase);
        if (textView2 != null) {
            boolean isFreeze = item.getIsFreeze();
            final VehicleMineActivity vehicleMineActivity = this.f49394OooOoo0;
            if (isFreeze) {
                textView2.setText(o0000.OooO0OO(oO00OOo0.vehicle_mine_Frozen));
                textView2.setBackground(o0000.OooO0O0(oOo00OO0.shape_bg_room_theme_item_sold_out));
                view3.setBackground(o0000.OooO0O0(oOo00OO0.user_all_head_bg_tr00_top_6r));
            } else if (vehicleMineActivity.f27037OooOo0O == item.getShopId()) {
                textView2.setText(o0000.OooO0OO(oO00OOo0.vehicle_mine_inUse));
                textView2.setBackground(o0000.OooO0O0(oOo00OO0.shape_bg_vehicle_item_green));
                view3.setBackground(o0000.OooO0O0(oOo00OO0.user_all_head_bg_green_top_6r));
            } else {
                textView2.setText(o0000.OooO0OO(oO00OOo0.vehicle_mine_Use));
                textView2.setBackground(o0000.OooO0O0(oOo00OO0.shape_bg_vehicle_item_green));
                view3.setBackground(o0000.OooO0O0(oOo00OO0.user_all_head_bg_tr00_top_6r));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o0o00o0O.o00O0OO0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    ShopVehicleListModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    TextView this_run = textView2;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    VehicleMineActivity this$0 = vehicleMineActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (item2.getIsFreeze()) {
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        o0OO00O o0oo00o2 = new o0OO00O(context);
                        o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.vehicle_mine_Vehicle_Frozen_title));
                        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.vehicle_mine_Vehicle_Frozen_content));
                        o0oo00o2.OooOo0O(oo0o0O0.f49419OooO0Oo);
                        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
                        o0oo00o2.OooOo0(new o00O0OO(this$0));
                        o0oo00o2.OooOO0o();
                        return;
                    }
                    int i = VehicleMineActivity.f27033OooOo;
                    this$0.getClass();
                    if (OooOo00.OooO00o(item2) || OooOo00.OooO00o(Long.valueOf(item2.getShopId()))) {
                        return;
                    }
                    Ref.IntRef intRef = new Ref.IntRef();
                    if (item2.getShopId() == this$0.f27037OooOo0O) {
                        intRef.element = 1;
                    }
                    ((VehicleStoreVM) this$0.f27036OooOo00.getValue()).useVehicleEdit(item2.getShopId(), intRef.element).observe(this$0, new o00OO000(intRef, item2, this$0));
                }
            });
        }
        View view4 = helper.getView(oO00O0oO.layoutPrice);
        Intrinsics.checkNotNullExpressionValue(view4, "helper.getView<RelativeLayout>(R.id.layoutPrice)");
        o000OO00.OooO0O0(view4);
    }
}
