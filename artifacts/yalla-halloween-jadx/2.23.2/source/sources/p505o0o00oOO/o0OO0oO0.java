package p505o0o00oOO;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p573o0oOoOO.o0O0o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends o0000oo<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f50358OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(VehicleMineActivity vehicleMineActivity, int i) {
        super(vehicleMineActivity, i);
        this.f50358OooOoo0 = vehicleMineActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(o0OO00O.tvLimitTime);
        Intrinsics.checkNotNull(textView);
        o000O.OooO0OO(textView);
        textView.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
        textView.setBackgroundResource(o0Oo0oo.user_all_head_bg_ffeeec);
        o0O0o0.OooO00o(textView, o0000.OooO0O0(o0Oo0oo.user_ic_vehicle_limit_time_mine), ViewLocation.start, OooOo00.OooO0o0());
        if (item.getDayNum() > 0 && item.getTimeLong() != -1) {
            o000O.OooOOOO(textView);
            textView.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_xxx_days), String.valueOf(item.getDayNum())));
        }
        View view = helper.getView(o0OO00O.ivImage);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        NetImageView netImageView = (NetImageView) view;
        View view2 = helper.getView(o0OO00O.ivPlay);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        try {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(item.getPic());
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43138OooOOOo = o0Oo0oo.icon_vehicel_placeholder;
            oooO00o.OooO0Oo(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView2 = (TextView) helper.getView(o0OO00O.tvVehicleTag);
        if (textView2 != null) {
            textView2.setText(item.getVehicleTag());
            o000O.OooOOOO(textView2);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_4A90E2));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o000O.OooO0OO(textView2);
            } else {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_FF5B48));
                textView2.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_FFE7E4));
                textView2.setText(o0000.OooO0OO(o000000.vehicle_store_tag_vip5));
            }
        }
        View view3 = helper.getView(o0OO00O.layoutTopForeground);
        final TextView textView3 = (TextView) helper.getView(o0OO00O.tvPurchase);
        if (textView3 != null) {
            boolean isFreeze = item.getIsFreeze();
            final VehicleMineActivity vehicleMineActivity = this.f50358OooOoo0;
            if (isFreeze) {
                textView3.setText(o0000.OooO0OO(o000000.vehicle_mine_Frozen));
                textView3.setBackground(o0000.OooO0O0(o0Oo0oo.shape_bg_room_theme_item_sold_out));
                view3.setBackground(o0000.OooO0O0(o0Oo0oo.user_all_head_bg_tr00_top_6r));
            } else if (vehicleMineActivity.f26572OooOo0O == item.getShopId()) {
                textView3.setText(o0000.OooO0OO(o000000.vehicle_mine_inUse));
                textView3.setBackground(o0000.OooO0O0(o0Oo0oo.shape_bg_vehicle_item_green));
                view3.setBackground(o0000.OooO0O0(o0Oo0oo.user_all_head_bg_green_top_6r));
            } else {
                textView3.setText(o0000.OooO0OO(o000000.vehicle_mine_Use));
                textView3.setBackground(o0000.OooO0O0(o0Oo0oo.shape_bg_vehicle_item_green));
                view3.setBackground(o0000.OooO0O0(o0Oo0oo.user_all_head_bg_tr00_top_6r));
            }
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOO.o0OOooO0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    final ShopVehicleListModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    TextView this_run = textView3;
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    final VehicleMineActivity this$0 = vehicleMineActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (item2.getIsFreeze()) {
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(context);
                        o000o.OooOoO(o0000.OooO0OO(o000000.vehicle_mine_Vehicle_Frozen_title));
                        o000o.OooOo00(o0000.OooO0OO(o000000.vehicle_mine_Vehicle_Frozen_content));
                        o000o.OooOo0O(o0OO0o00.f50357OooO0Oo);
                        o000o.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
                        o000o.OooOo0(new o0OO0o(this$0));
                        o000o.OooOO0o();
                        return;
                    }
                    int i = VehicleMineActivity.f26568OooOo;
                    this$0.getClass();
                    if (com.code.android.util.OooOo00.OooO00o(item2) || com.code.android.util.OooOo00.OooO00o(Long.valueOf(item2.getShopId()))) {
                        return;
                    }
                    final Ref.IntRef intRef = new Ref.IntRef();
                    if (item2.getShopId() == this$0.f26572OooOo0O) {
                        intRef.element = 1;
                    }
                    ((VehicleStoreVM) this$0.f26571OooOo00.getValue()).useVehicleEdit(item2.getShopId(), intRef.element).observe(this$0, new Observer() { // from class: o0o00oOO.o0OO0O0
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            int i2 = VehicleMineActivity.f26568OooOo;
                            Ref.IntRef type = intRef;
                            Intrinsics.checkNotNullParameter(type, "$type");
                            ShopVehicleListModel item3 = item2;
                            Intrinsics.checkNotNullParameter(item3, "$item");
                            VehicleMineActivity this$1 = this$0;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            if (((Response) obj2).getIsSuccess()) {
                                boolean z = true;
                                if (type.element == 1) {
                                    item3.setSelected(false);
                                    this$1.f26572OooOo0O = 0L;
                                    String strOooO0OO = o0000.OooO0OO(o000000.vehicle_mine_inUse_successful);
                                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o000oo0OooO00o.run();
                                        } else {
                                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                        }
                                    }
                                } else {
                                    item3.setSelected(true);
                                    this$1.f26572OooOo0O = item3.getShopId();
                                    String strOooO0OO2 = o0000.OooO0OO(o000000.vehicle_mine_Use_successful);
                                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o000oo0OooO00o2.run();
                                        } else {
                                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                                        }
                                    }
                                }
                                o0OO0oO0 o0oo0oo1 = this$1.f26570OooOo0;
                                if (o0oo0oo1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                                    o0oo0oo1 = null;
                                }
                                o0oo0oo1.notifyDataSetChanged();
                            }
                        }
                    });
                }
            });
        }
        View view4 = helper.getView(o0OO00O.layoutPrice);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        o000O.OooO0O0(view4);
    }
}
