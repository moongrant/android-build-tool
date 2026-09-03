package p505o0o00oOO;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.TopCardPersentationModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends o0000oo<TopCardPersentationModel> {
    public o0OO0(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        TopCardPersentationModel topCardPersentationModel = (TopCardPersentationModel) obj;
        viewHolder.setText(o0OO00O.tv_title, topCardPersentationModel.title);
        viewHolder.setText(o0OO00O.tv_desc, topCardPersentationModel.desc);
    }
}
