package p564o0oOo00;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.framework.view.textView.ViewLocation;
import com.chad.library.adapter.base.OooO00o;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends OooO0OO<ShopVehicleListModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f45131OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(VehicleMineActivity vehicleMineActivity) {
        super(vehicleMineActivity, R.layout.user_activity_vehicle_mine_item);
        this.f45131OooO00o = vehicleMineActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        final ShopVehicleListModel item = (ShopVehicleListModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.OooO0Oo(R.id.tvLimitTime);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        o00O0O.OooO0O0(textView);
        textView.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
        textView.setBackgroundResource(R.drawable.user_all_head_bg_ffeeec);
        o00Oo00.OooO00o(textView, OooOOO.OooO0O0(R.drawable.user_ic_vehicle_limit_time_mine), ViewLocation.start, oo000o.OooO0o0());
        if (item.getDayNum() > 0 && item.getTimeLong() != -1) {
            o00O0O.OooO(textView);
            textView.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.vehicle_store_xxx_days), String.valueOf(item.getDayNum())));
        }
        View viewOooO0Oo = helper.OooO0Oo(R.id.ivImage);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.ivImage)");
        NetImageView netImageView = (NetImageView) viewOooO0Oo;
        View viewOooO0Oo2 = helper.OooO0Oo(R.id.ivPlay);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView(R.id.ivPlay)");
        try {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(item.getPic());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.icon_vehicel_placeholder;
            oooO00o2.OooO0o(netImageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.tvVehicleTag);
        if (textView2 != null) {
            textView2.setText(item.getVehicleTag());
            o00O0O.OooO(textView2);
            int nVehicleTagType = item.getNVehicleTagType();
            if (nVehicleTagType == 10 || nVehicleTagType == 11) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_4A90E2));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_E4EFFB));
            } else if (nVehicleTagType == 300) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip300));
            } else if (nVehicleTagType == 400) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip400));
            } else if (nVehicleTagType != 500) {
                o00O0O.OooO0O0(textView2);
            } else {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
                textView2.setBackgroundColor(o000O0O0.OooO00o(R.color.color_FFE7E4));
                textView2.setText(OooOOO.OooO0OO(R.string.vehicle_store_tag_vip5));
            }
        }
        View viewOooO0Oo3 = helper.OooO0Oo(R.id.layoutTopForeground);
        final TextView textView3 = (TextView) helper.OooO0Oo(R.id.tvPurchase);
        if (textView3 != null) {
            final VehicleMineActivity vehicleMineActivity = this.f45131OooO00o;
            if (item.getIsFreeze()) {
                textView3.setText(OooOOO.OooO0OO(R.string.vehicle_mine_Frozen));
                textView3.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_room_theme_item_sold_out));
                viewOooO0Oo3.setBackground(OooOOO.OooO0O0(R.drawable.user_all_head_bg_tr00_top_6r));
            } else if (vehicleMineActivity.f23253OooooO0 == item.getShopId()) {
                textView3.setText(OooOOO.OooO0OO(R.string.vehicle_mine_inUse));
                textView3.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_vehicle_item_green));
                viewOooO0Oo3.setBackground(OooOOO.OooO0O0(R.drawable.user_all_head_bg_green_top_6r));
            } else {
                textView3.setText(OooOOO.OooO0OO(R.string.vehicle_mine_Use));
                textView3.setBackground(OooOOO.OooO0O0(R.drawable.shape_bg_vehicle_item_green));
                viewOooO0Oo3.setBackground(OooOOO.OooO0O0(R.drawable.user_all_head_bg_tr00_top_6r));
            }
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o0oOo00.o00000O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ShopVehicleListModel item2 = item;
                    TextView this_run = textView3;
                    final VehicleMineActivity this$0 = vehicleMineActivity;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    Intrinsics.checkNotNullParameter(this_run, "$this_run");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (item2.getIsFreeze()) {
                        Context context = this_run.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                        oo0ooo0.OooOooO(OooOOO.OooO0OO(R.string.vehicle_mine_Vehicle_Frozen_title));
                        oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.vehicle_mine_Vehicle_Frozen_content));
                        oo0ooo0.OooOo(o00000OO.f45140Oooo0o);
                        oo0ooo0.OooOOo0(OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
                        oo0ooo0.OooOo0o(new o0000Ooo(this$0));
                        oo0ooo0.OooOOO0();
                        return;
                    }
                    VehicleMineActivity.OooO00o oooO00o3 = VehicleMineActivity.f23249OooooOo;
                    Objects.requireNonNull(this$0);
                    if (com.yalla.support.common.util.OooO0OO.OooO00o(item2) || com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(item2.getShopId()))) {
                        return;
                    }
                    final Ref.IntRef intRef = new Ref.IntRef();
                    if (item2.getShopId() == this$0.f23253OooooO0) {
                        intRef.element = 1;
                    }
                    ((VehicleStoreVM) this$0.f23251Ooooo00.getValue()).useVehicleEdit(item2.getShopId(), intRef.element).observe(this$0, new Observer() { // from class: o0oOo00.o00000
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            Ref.IntRef type = intRef;
                            ShopVehicleListModel item3 = item2;
                            VehicleMineActivity this$1 = this$0;
                            VehicleMineActivity.OooO00o oooO00o4 = VehicleMineActivity.f23249OooooOo;
                            Intrinsics.checkNotNullParameter(type, "$type");
                            Intrinsics.checkNotNullParameter(item3, "$item");
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            if (((Response) obj2).getIsSuccess()) {
                                if (type.element == 1) {
                                    item3.setSelected(false);
                                    this$1.f23253OooooO0 = 0L;
                                    String strOooO0OO = OooOOO.OooO0OO(R.string.vehicle_mine_inUse_successful);
                                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o0o0oooOooO0O0.run();
                                        } else {
                                            o00O000 o00o001 = o00O000.f34346OooO00o;
                                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                                        }
                                    }
                                } else {
                                    item3.setSelected(true);
                                    this$1.f23253OooooO0 = item3.getShopId();
                                    String strOooO0OO2 = OooOOO.OooO0OO(R.string.vehicle_mine_Use_successful);
                                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o0o0oooOooO0O1.run();
                                        } else {
                                            o00O000 o00o002 = o00O000.f34346OooO00o;
                                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                                        }
                                    }
                                }
                                OooO0OO<ShopVehicleListModel> oooO0OO = this$1.f23252Ooooo0o;
                                if (oooO0OO == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                                    oooO0OO = null;
                                }
                                oooO0OO.notifyDataSetChanged();
                            }
                        }
                    });
                }
            });
        }
        View viewOooO0Oo4 = helper.OooO0Oo(R.id.layoutPrice);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView<RelativeLayout>(R.id.layoutPrice)");
        o00O0O.OooO00o(viewOooO0Oo4);
    }
}
