package p650o0ooo;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o extends o0000oo<GiftPropModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropModel item = (GiftPropModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(item.getImageUrl());
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43138OooOOOo = o0Oo0oo.room_dialog_lucky_golds_send_gift_item_default;
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.image));
        helper.setText(o0OO00O.content, o0OoOo0.OooOO0o(Integer.valueOf(item.getPrice()), ""));
        if (item.getGiftId() == o00Ooo.OooO0oo().OooOOO()) {
            helper.setVisible(o0OO00O.bg_selected, true);
        } else {
            helper.setVisible(o0OO00O.bg_selected, false);
        }
    }
}
