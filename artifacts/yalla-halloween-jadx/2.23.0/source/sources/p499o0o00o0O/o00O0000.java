package p499o0o00o0O;

import android.content.Context;
import android.support.v4.media.session.OooO0o;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.Oooo0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.model.ViewTimeModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends o000O<StoreTopCardModel.TopCard> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f49382OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(PurchaseTopCardActivity purchaseTopCardActivity, Context context, int i) {
        super(context, i);
        this.f49382OooOoo0 = purchaseTopCardActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        StoreTopCardModel.TopCard topCard = (StoreTopCardModel.TopCard) obj;
        viewHolder.setText(oO00O0oO.tv_price, OooOOOO.OooO0Oo(topCard.price + ""));
        long j = topCard.expiryTime;
        PurchaseTopCardActivity purchaseTopCardActivity = this.f49382OooOoo0;
        if (j > 0) {
            int i = oO00O0oO.tv_time;
            int i2 = PurchaseTopCardActivity.f26998OooOoo0;
            purchaseTopCardActivity.getClass();
            viewHolder.setText(i, PurchaseTopCardActivity.OooOo0o(j));
            viewHolder.setGone(oO00O0oO.fl_time, true);
            TextView textView = (TextView) viewHolder.getView(i);
            purchaseTopCardActivity.f27002OooOo.put(Integer.valueOf(textView.hashCode()), new ViewTimeModel(textView, topCard.expiryTime));
        } else {
            viewHolder.setGone(oO00O0oO.fl_time, false);
        }
        if (topCard.purchaseState && !topCard.biddingState) {
            viewHolder.setLinearLayoutGravity(oO00O0oO.linearLayout, 16);
            viewHolder.setImageResource(oO00O0oO.iv_bg, oOo00OO0.icon_store_top_item_bg_buy);
            viewHolder.setText(oO00O0oO.tv_buy, oO00OOo0.Purchase);
            int i3 = oO00O0oO.ll_buy;
            viewHolder.setBackgroundRes(i3, oOo00OO0.shape_bg_store_top_buy);
            viewHolder.setEnable(i3, true);
            viewHolder.setGone(oO00O0oO.textview, false);
            viewHolder.setGone(oO00O0oO.ll_info, false);
            viewHolder.setViewOnClickListener(i3, new o000OOo0(this, topCard));
            SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.svga_top);
            sVGAView.OooO0o();
            sVGAView.setVisibility(8);
        }
        if (topCard.biddingState) {
            viewHolder.setImageResource(oO00O0oO.iv_bg, oOo00OO0.icon_store_top_item_bg);
            viewHolder.setLinearLayoutGravity(oO00O0oO.linearLayout, 48);
            viewHolder.setText(oO00O0oO.tv_buy, oO00OOo0.Store_Top_Card_Bid);
            int i4 = oO00O0oO.ll_buy;
            viewHolder.setBackgroundRes(i4, oOo00OO0.shape_bg_store_top_buy);
            viewHolder.setEnable(i4, true);
            viewHolder.setGone(oO00O0oO.textview, true);
            viewHolder.setGone(oO00O0oO.ll_info, true);
            viewHolder.setViewOnClickListener(i4, new o00(this, topCard));
            if (topCard.bidderUserid != 0) {
                int i5 = oO00O0oO.sdv_header;
                viewHolder.setGone(i5, true);
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f10108OooOOOo);
                oooO00o.OooO00o(OooO.OooO0OO());
                oooO00o.f43911OooO0OO = topCard.headurl;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(i5));
                int i6 = oO00O0oO.tv_name;
                viewHolder.setText(i6, topCard.nickname);
                int i7 = oO00O0oO.tv_id;
                viewHolder.setText(i7, OooO0o.OooO0O0(new StringBuilder("(ID:"), topCard.idx, ")"));
                o000000O o000000o2 = o000000O.f46674OooO00o;
                int iOooO00o = o0000.OooO00o(Oooo0.OooO00o().equals(String.valueOf(topCard.bidderUserid)) ? oO00O0o.color_8E4136 : oO00O0o.color_white_80);
                viewHolder.setTextColor(i6, iOooO00o);
                viewHolder.setTextColor(i7, iOooO00o);
            } else {
                viewHolder.setGone(oO00O0oO.sdv_header, false);
                int i8 = oO00O0oO.tv_name;
                viewHolder.setText(i8, oO00OOo0.Store_Top_Card_no_bid);
                viewHolder.setTextColor(i8, o0000.OooO00o(oO00O0o.color_white_80));
                viewHolder.setText(oO00O0oO.tv_id, "");
            }
            SVGAView sVGAView2 = (SVGAView) viewHolder.getView(oO00O0oO.svga_top);
            sVGAView2.setVisibility(0);
            sVGAView2.setVideoItem(purchaseTopCardActivity.f27009OooOoOO);
            sVGAView2.OooO0Oo();
        }
        if (topCard.purchaseState || topCard.biddingState) {
            return;
        }
        viewHolder.setImageResource(oO00O0oO.iv_bg, oOo00OO0.icon_store_top_item_bg);
        viewHolder.setLinearLayoutGravity(oO00O0oO.linearLayout, 48);
        viewHolder.setText(oO00O0oO.tv_buy, topCard.expiryTime > 0 ? oO00OOo0.Store_Top_Card_Bid : oO00OOo0.Purchase);
        int i9 = oO00O0oO.svga_top;
        viewHolder.setGone(i9, topCard.expiryTime > 0);
        int i10 = oO00O0oO.ll_buy;
        viewHolder.setBackgroundRes(i10, oOo00OO0.shape_bg_store_top_bid);
        viewHolder.setEnable(i10, false);
        viewHolder.setGone(oO00O0oO.textview, true);
        viewHolder.setGone(oO00O0oO.ll_info, true);
        if (topCard.bidderUserid != 0) {
            int i11 = oO00O0oO.sdv_header;
            viewHolder.setGone(i11, true);
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o2.OooO00o(OooO.OooO0OO());
            oooO00o2.f43911OooO0OO = topCard.headurl;
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i11));
            int i12 = oO00O0oO.tv_name;
            viewHolder.setText(i12, topCard.nickname);
            int i13 = oO00O0oO.tv_id;
            viewHolder.setText(i13, OooO0o.OooO0O0(new StringBuilder("(ID:"), topCard.idx, ")"));
            o000000O o000000o3 = o000000O.f46674OooO00o;
            int iOooO00o2 = o0000.OooO00o(Oooo0.OooO00o().equals(String.valueOf(topCard.bidderUserid)) ? oO00O0o.color_8E4136 : oO00O0o.color_white_80);
            viewHolder.setTextColor(i12, iOooO00o2);
            viewHolder.setTextColor(i13, iOooO00o2);
        } else {
            viewHolder.setGone(oO00O0oO.sdv_header, false);
            int i14 = oO00O0oO.tv_name;
            viewHolder.setText(i14, oO00OOo0.Store_Top_Card_no_bid);
            viewHolder.setTextColor(i14, o0000.OooO00o(oO00O0o.color_white_80));
            viewHolder.setText(oO00O0oO.tv_id, "");
        }
        viewHolder.setViewOnClickListener(i10, null);
        TextView textView2 = (TextView) viewHolder.getView(oO00O0oO.tv_time);
        if (topCard.expiryTime > 0) {
            purchaseTopCardActivity.f27002OooOo.put(Integer.valueOf(textView2.hashCode()), new ViewTimeModel(textView2, topCard.expiryTime));
        }
        SVGAView sVGAView3 = (SVGAView) viewHolder.getView(i9);
        sVGAView3.setVideoItem(purchaseTopCardActivity.f27009OooOoOO);
        sVGAView3.OooO0o();
        sVGAView3.OooO0o0();
    }
}
