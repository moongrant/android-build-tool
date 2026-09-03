package p579o0oOoOOo;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.MoraGiftListModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import o00OO0O0.o00000O;
import p028Oooo0o0.o00O0O0O;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class O0OO00 extends OooO0OO<MoraGiftListModel> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f45895OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ O0000000 f45896OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0OO00(O0000000 o0000000, Context context) {
        super(context, R.layout.room_dialog_mora_game_gift_item);
        this.f45896OooO00o = o0000000;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        MoraGiftListModel moraGiftListModel = (MoraGiftListModel) obj;
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o2.f48429OooO0OO = moraGiftListModel != null ? moraGiftListModel.getImageUrl() : null;
        boolean z = false;
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(oooO0o != null ? (ImageView) oooO0o.OooO0Oo(R.id.ivGift) : null);
        TextView textView = oooO0o != null ? (TextView) oooO0o.OooO0Oo(R.id.tvGiftNum) : null;
        if (textView != null) {
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('x');
            sbOooO00o.append(moraGiftListModel != null ? Integer.valueOf(moraGiftListModel.getGiftNum()) : null);
            textView.setText(sbOooO00o.toString());
        }
        FrameLayout frameLayout = oooO0o != null ? (FrameLayout) oooO0o.OooO0Oo(R.id.flGift) : null;
        int i = 1;
        if (oooO0o != null && oooO0o.getLayoutPosition() == 0) {
            z = true;
        }
        if (z) {
            O0000000 o0000000 = this.f45896OooO00o;
            if (o0000000.f45878OoooOoo == null) {
                o0000000.f45879Ooooo00 = oooO0o.getLayoutPosition();
                O0000000.OooOOO(this.f45896OooO00o, frameLayout, null, 2);
            }
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new o00000O(this.f45896OooO00o, oooO0o, i));
        }
    }
}
