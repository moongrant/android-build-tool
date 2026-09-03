package p505o0o00oOO;

import android.content.Context;
import android.support.v4.media.session.OooO0OO;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.model.ViewTimeModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p004OooO0oO.o0OoOo0;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends o0000oo<StoreTopCardModel.TopCard> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f50380OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(PurchaseTopCardActivity purchaseTopCardActivity, Context context, int i) {
        super(context, i);
        this.f50380OooOoo0 = purchaseTopCardActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        StoreTopCardModel.TopCard topCard = (StoreTopCardModel.TopCard) obj;
        viewHolder.setText(o0OO00O.tv_price, o0O0O0Oo.OooO0Oo(topCard.price + ""));
        long j = topCard.expiryTime;
        PurchaseTopCardActivity purchaseTopCardActivity = this.f50380OooOoo0;
        if (j > 0) {
            int i = o0OO00O.tv_time;
            int i2 = PurchaseTopCardActivity.f26533OooOoo0;
            purchaseTopCardActivity.getClass();
            viewHolder.setText(i, PurchaseTopCardActivity.OooOo0o(j));
            viewHolder.setGone(o0OO00O.fl_time, true);
            TextView textView = (TextView) viewHolder.getView(i);
            purchaseTopCardActivity.f26537OooOo.put(Integer.valueOf(textView.hashCode()), new ViewTimeModel(textView, topCard.expiryTime));
        } else {
            viewHolder.setGone(o0OO00O.fl_time, false);
        }
        if (topCard.purchaseState && !topCard.biddingState) {
            viewHolder.setLinearLayoutGravity(o0OO00O.linearLayout, 16);
            viewHolder.setImageResource(o0OO00O.iv_bg, o0Oo0oo.icon_store_top_item_bg_buy);
            viewHolder.setText(o0OO00O.tv_buy, o000000.Purchase);
            int i3 = o0OO00O.ll_buy;
            viewHolder.setBackgroundRes(i3, o0Oo0oo.shape_bg_store_top_buy);
            viewHolder.setEnable(i3, true);
            viewHolder.setGone(o0OO00O.textview, false);
            viewHolder.setGone(o0OO00O.ll_info, false);
            viewHolder.setViewOnClickListener(i3, new o0O0OOO0(this, topCard));
            SVGAView sVGAView = (SVGAView) viewHolder.getView(o0OO00O.svga_top);
            sVGAView.OooO0o();
            sVGAView.setVisibility(8);
        }
        if (topCard.biddingState) {
            viewHolder.setImageResource(o0OO00O.iv_bg, o0Oo0oo.icon_store_top_item_bg);
            viewHolder.setLinearLayoutGravity(o0OO00O.linearLayout, 48);
            viewHolder.setText(o0OO00O.tv_buy, o000000.Store_Top_Card_Bid);
            int i4 = o0OO00O.ll_buy;
            viewHolder.setBackgroundRes(i4, o0Oo0oo.shape_bg_store_top_buy);
            viewHolder.setEnable(i4, true);
            viewHolder.setGone(o0OO00O.textview, true);
            viewHolder.setGone(o0OO00O.ll_info, true);
            viewHolder.setViewOnClickListener(i4, new o0O0OOOo(this, topCard));
            if (topCard.bidderUserid != 0) {
                int i5 = o0OO00O.sdv_header;
                viewHolder.setGone(i5, true);
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f13186OooOOOo);
                oooO00o.OooO00o(d1.OooO0OO());
                oooO00o.f43126OooO0OO = topCard.headurl;
                oooO00o.f43124OooO00o = 0;
                oooO00o.OooO0Oo((ImageView) viewHolder.getView(i5));
                int i6 = o0OO00O.tv_name;
                viewHolder.setText(i6, topCard.nickname);
                int i7 = o0OO00O.tv_id;
                viewHolder.setText(i7, OooO0OO.OooO0O0(new StringBuilder("(ID:"), topCard.idx, ")"));
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                int iOooO00o = o0000.OooO00o(o0OoOo0.OooO00o().equals(String.valueOf(topCard.bidderUserid)) ? o0OOO0o.color_8E4136 : o0OOO0o.color_white_80);
                viewHolder.setTextColor(i6, iOooO00o);
                viewHolder.setTextColor(i7, iOooO00o);
            } else {
                viewHolder.setGone(o0OO00O.sdv_header, false);
                int i8 = o0OO00O.tv_name;
                viewHolder.setText(i8, o000000.Store_Top_Card_no_bid);
                viewHolder.setTextColor(i8, o0000.OooO00o(o0OOO0o.color_white_80));
                viewHolder.setText(o0OO00O.tv_id, "");
            }
            SVGAView sVGAView2 = (SVGAView) viewHolder.getView(o0OO00O.svga_top);
            sVGAView2.setVisibility(0);
            sVGAView2.setVideoItem(purchaseTopCardActivity.f26544OooOoOO);
            sVGAView2.OooO0Oo();
        }
        if (topCard.purchaseState || topCard.biddingState) {
            return;
        }
        viewHolder.setImageResource(o0OO00O.iv_bg, o0Oo0oo.icon_store_top_item_bg);
        viewHolder.setLinearLayoutGravity(o0OO00O.linearLayout, 48);
        viewHolder.setText(o0OO00O.tv_buy, topCard.expiryTime > 0 ? o000000.Store_Top_Card_Bid : o000000.Purchase);
        int i9 = o0OO00O.svga_top;
        viewHolder.setGone(i9, topCard.expiryTime > 0);
        int i10 = o0OO00O.ll_buy;
        viewHolder.setBackgroundRes(i10, o0Oo0oo.shape_bg_store_top_bid);
        viewHolder.setEnable(i10, false);
        viewHolder.setGone(o0OO00O.textview, true);
        viewHolder.setGone(o0OO00O.ll_info, true);
        if (topCard.bidderUserid != 0) {
            int i11 = o0OO00O.sdv_header;
            viewHolder.setGone(i11, true);
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o2.OooO00o(d1.OooO0OO());
            oooO00o2.f43126OooO0OO = topCard.headurl;
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i11));
            int i12 = o0OO00O.tv_name;
            viewHolder.setText(i12, topCard.nickname);
            int i13 = o0OO00O.tv_id;
            viewHolder.setText(i13, OooO0OO.OooO0O0(new StringBuilder("(ID:"), topCard.idx, ")"));
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            int iOooO00o2 = o0000.OooO00o(o0OoOo0.OooO00o().equals(String.valueOf(topCard.bidderUserid)) ? o0OOO0o.color_8E4136 : o0OOO0o.color_white_80);
            viewHolder.setTextColor(i12, iOooO00o2);
            viewHolder.setTextColor(i13, iOooO00o2);
        } else {
            viewHolder.setGone(o0OO00O.sdv_header, false);
            int i14 = o0OO00O.tv_name;
            viewHolder.setText(i14, o000000.Store_Top_Card_no_bid);
            viewHolder.setTextColor(i14, o0000.OooO00o(o0OOO0o.color_white_80));
            viewHolder.setText(o0OO00O.tv_id, "");
        }
        viewHolder.setViewOnClickListener(i10, null);
        TextView textView2 = (TextView) viewHolder.getView(o0OO00O.tv_time);
        if (topCard.expiryTime > 0) {
            purchaseTopCardActivity.f26537OooOo.put(Integer.valueOf(textView2.hashCode()), new ViewTimeModel(textView2, topCard.expiryTime));
        }
        SVGAView sVGAView3 = (SVGAView) viewHolder.getView(i9);
        sVGAView3.setVideoItem(purchaseTopCardActivity.f26544OooOoOO);
        sVGAView3.OooO0o();
        sVGAView3.OooO0o0();
    }
}
