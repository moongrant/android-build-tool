package p519o0o0O0oO;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p408o0Oo0o0O.o00Oo0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00oO extends o000O<GiftPropModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropModel item = (GiftPropModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(item.getImageUrl());
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43923OooOOOo = oOo00OO0.room_dialog_lucky_golds_send_gift_item_default;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.image));
        helper.setText(oO00O0oO.content, o0OoOo0.OooOO0o(Integer.valueOf(item.getPrice()), ""));
        if (item.getGiftId() == o00Oo0.OooO0oo().OooOOO()) {
            helper.setVisible(oO00O0oO.bg_selected, true);
        } else {
            helper.setVisible(oO00O0oO.bg_selected, false);
        }
    }
}
