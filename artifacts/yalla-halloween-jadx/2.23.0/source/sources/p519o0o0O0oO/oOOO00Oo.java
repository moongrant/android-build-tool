package p519o0o0O0oO;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo extends o000O<MoraGiftListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ooooO0O0 f52988OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(ooooO0O0 ooooo0o0, Context context, int i) {
        super(context, i);
        this.f52988OooOoo0 = ooooo0o0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        final ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MoraGiftListModel moraGiftListModel = (MoraGiftListModel) obj;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.OooO00o(OooO.OooO0O0());
        oooO00o.f43911OooO0OO = moraGiftListModel != null ? moraGiftListModel.getImageUrl() : null;
        boolean z = false;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(viewHolder != null ? (ImageView) viewHolder.getView(oO00O0oO.ivGift) : null);
        TextView textView = viewHolder != null ? (TextView) viewHolder.getView(oO00O0oO.tvGiftNum) : null;
        if (textView != null) {
            textView.setText("x" + (moraGiftListModel != null ? Integer.valueOf(moraGiftListModel.getGiftNum()) : null));
        }
        FrameLayout frameLayout = viewHolder != null ? (FrameLayout) viewHolder.getView(oO00O0oO.flGift) : null;
        if (viewHolder != null && viewHolder.getLayoutPosition() == 0) {
            z = true;
        }
        final ooooO0O0 ooooo0o0 = this.f52988OooOoo0;
        if (z && ooooo0o0.f53049OooOOo0 == null) {
            ooooo0o0.f53048OooOOo = viewHolder.getLayoutPosition();
            ooooO0O0.OooOO0o(ooooo0o0, frameLayout, null, 2);
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oOOO00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ooooO0O0 this$0 = ooooo0o0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.f53048OooOOo = viewHolder.getLayoutPosition();
                    ooooO0O0.OooOO0o(this$0, view, null, 2);
                }
            });
        }
    }
}
