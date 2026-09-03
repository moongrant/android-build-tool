package p650o0ooo;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends o0000oo<MoraGiftListModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ oOOO0OO0 f59015OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(oOOO0OO0 oooo0oo0, Context context, int i) {
        super(context, i);
        this.f59015OooOoo0 = oooo0oo0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        final ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MoraGiftListModel moraGiftListModel = (MoraGiftListModel) obj;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = moraGiftListModel != null ? moraGiftListModel.getImageUrl() : null;
        boolean z = false;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(viewHolder != null ? (ImageView) viewHolder.getView(o0OO00O.ivGift) : null);
        TextView textView = viewHolder != null ? (TextView) viewHolder.getView(o0OO00O.tvGiftNum) : null;
        if (textView != null) {
            textView.setText("x" + (moraGiftListModel != null ? Integer.valueOf(moraGiftListModel.getGiftNum()) : null));
        }
        FrameLayout frameLayout = viewHolder != null ? (FrameLayout) viewHolder.getView(o0OO00O.flGift) : null;
        if (viewHolder != null && viewHolder.getLayoutPosition() == 0) {
            z = true;
        }
        final oOOO0OO0 oooo0oo0 = this.f59015OooOoo0;
        if (z && oooo0oo0.f58997OooOOo0 == null) {
            oooo0oo0.f58996OooOOo = viewHolder.getLayoutPosition();
            oOOO0OO0.OooOO0o(oooo0oo0, frameLayout, null, 2);
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.oOOO0OOO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oOOO0OO0 this$0 = oooo0oo0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.f58996OooOOo = viewHolder.getLayoutPosition();
                    oOOO0OO0.OooOO0o(this$0, view, null, 2);
                }
            });
        }
    }
}
