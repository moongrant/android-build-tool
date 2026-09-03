package p564o0oOo00;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.OooOOO0;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.StoreTopCardModel;
import com.app.base.model.ViewTimeModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p405o0Oo0OO0.OooO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends OooO0OO<StoreTopCardModel.TopCard> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f45166OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(PurchaseTopCardActivity purchaseTopCardActivity, Context context) {
        super(context, R.layout.item_store_top);
        this.f45166OooO00o = purchaseTopCardActivity;
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        StoreTopCardModel.TopCard topCard = (StoreTopCardModel.TopCard) obj;
        oooO0o.OooOO0(R.id.tv_price, o0O0O00.OooO0Oo(topCard.price + ""));
        long j = topCard.expiryTime;
        if (j > 0) {
            PurchaseTopCardActivity purchaseTopCardActivity = this.f45166OooO00o;
            int i = PurchaseTopCardActivity.f23222Ooooooo;
            oooO0o.OooOO0(R.id.tv_time, purchaseTopCardActivity.OooOoo0(j));
            oooO0o.OooO0oO(R.id.fl_time, true);
            TextView textView = (TextView) oooO0o.OooO0Oo(R.id.tv_time);
            this.f45166OooO00o.f23230OooooOo.put(Integer.valueOf(textView.hashCode()), new ViewTimeModel(textView, topCard.expiryTime));
        } else {
            oooO0o.OooO0oO(R.id.fl_time, false);
        }
        if (topCard.purchaseState && !topCard.biddingState) {
            oooO0o.OooOOO(16);
            oooO0o.OooO0oo(R.id.iv_bg, R.drawable.icon_store_top_item_bg_buy);
            oooO0o.OooO(R.id.tv_buy, R.string.Purchase);
            oooO0o.OooO0o(R.id.ll_buy, R.drawable.shape_bg_store_top_buy);
            oooO0o.OooOOO0(R.id.ll_buy, true);
            oooO0o.OooO0oO(R.id.textview, false);
            oooO0o.OooO0oO(R.id.ll_info, false);
            oooO0o.OooOOOO(R.id.ll_buy, new o00O0O(this, topCard));
            SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.svga_top);
            sVGAView.OooO0Oo();
            sVGAView.setVisibility(8);
        }
        if (topCard.biddingState) {
            oooO0o.OooO0oo(R.id.iv_bg, R.drawable.icon_store_top_item_bg);
            oooO0o.OooOOO(48);
            oooO0o.OooO(R.id.tv_buy, R.string.Store_Top_Card_Bid);
            oooO0o.OooO0o(R.id.ll_buy, R.drawable.shape_bg_store_top_buy);
            oooO0o.OooOOO0(R.id.ll_buy, true);
            oooO0o.OooO0oO(R.id.textview, true);
            oooO0o.OooO0oO(R.id.ll_info, true);
            oooO0o.OooOOOO(R.id.ll_buy, new o00Oo0(this, topCard));
            if (topCard.bidderUserid != 0) {
                oooO0o.OooO0oO(R.id.sdv_header, true);
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o2.f48429OooO0OO = topCard.headurl;
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_header));
                oooO0o.OooOO0(R.id.tv_name, topCard.nickname);
                StringBuilder sb = new StringBuilder();
                sb.append("(ID:");
                oooO0o.OooOO0(R.id.tv_id, OooOOO0.OooO00o(sb, topCard.idx, ")"));
                int iOooO00o = OooOOO.OooO00o(kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o).equals(String.valueOf(topCard.bidderUserid)) ? R.color.color_8E4136 : R.color.color_white_80);
                oooO0o.OooOO0O(R.id.tv_name, iOooO00o);
                oooO0o.OooOO0O(R.id.tv_id, iOooO00o);
            } else {
                oooO0o.OooO0oO(R.id.sdv_header, false);
                oooO0o.OooO(R.id.tv_name, R.string.Store_Top_Card_no_bid);
                oooO0o.OooOO0O(R.id.tv_name, OooOOO.OooO00o(R.color.color_white_80));
                oooO0o.OooOO0(R.id.tv_id, "");
            }
            SVGAView sVGAView2 = (SVGAView) oooO0o.OooO0Oo(R.id.svga_top);
            sVGAView2.setVisibility(0);
            sVGAView2.setVideoItem(this.f45166OooO00o.f23233OoooooO);
            sVGAView2.OooO0OO();
        }
        if (topCard.purchaseState || topCard.biddingState) {
            return;
        }
        oooO0o.OooO0oo(R.id.iv_bg, R.drawable.icon_store_top_item_bg);
        oooO0o.OooOOO(48);
        oooO0o.OooO(R.id.tv_buy, topCard.expiryTime > 0 ? R.string.Store_Top_Card_Bid : R.string.Purchase);
        oooO0o.OooO0oO(R.id.svga_top, topCard.expiryTime > 0);
        oooO0o.OooO0o(R.id.ll_buy, R.drawable.shape_bg_store_top_bid);
        oooO0o.OooOOO0(R.id.ll_buy, false);
        oooO0o.OooO0oO(R.id.textview, true);
        oooO0o.OooO0oO(R.id.ll_info, true);
        if (topCard.bidderUserid != 0) {
            oooO0o.OooO0oO(R.id.sdv_header, true);
            oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.mContext);
            oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o3.f48429OooO0OO = topCard.headurl;
            oooO00o3.f48427OooO00o = 0;
            oooO00o3.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_header));
            oooO0o.OooOO0(R.id.tv_name, topCard.nickname);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(ID:");
            oooO0o.OooOO0(R.id.tv_id, OooOOO0.OooO00o(sb2, topCard.idx, ")"));
            int iOooO00o2 = OooOOO.OooO00o(kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o).equals(String.valueOf(topCard.bidderUserid)) ? R.color.color_8E4136 : R.color.color_white_80);
            oooO0o.OooOO0O(R.id.tv_name, iOooO00o2);
            oooO0o.OooOO0O(R.id.tv_id, iOooO00o2);
        } else {
            oooO0o.OooO0oO(R.id.sdv_header, false);
            oooO0o.OooO(R.id.tv_name, R.string.Store_Top_Card_no_bid);
            oooO0o.OooOO0O(R.id.tv_name, OooOOO.OooO00o(R.color.color_white_80));
            oooO0o.OooOO0(R.id.tv_id, "");
        }
        oooO0o.OooOOOO(R.id.ll_buy, null);
        TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.tv_time);
        if (topCard.expiryTime > 0) {
            this.f45166OooO00o.f23230OooooOo.put(Integer.valueOf(textView2.hashCode()), new ViewTimeModel(textView2, topCard.expiryTime));
        }
        SVGAView sVGAView3 = (SVGAView) oooO0o.OooO0Oo(R.id.svga_top);
        sVGAView3.setVideoItem(this.f45166OooO00o.f23233OoooooO);
        sVGAView3.OooO0Oo();
        sVGAView3.OooO0O0();
        Drawable drawable = sVGAView3.getDrawable();
        OooO oooO = (OooO) (drawable instanceof OooO ? drawable : null);
        if (oooO != null) {
            oooO.OooO0O0(0);
        }
    }
}
