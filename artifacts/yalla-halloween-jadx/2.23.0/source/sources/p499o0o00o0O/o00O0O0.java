package p499o0o00o0O;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.TopCardPersentationModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends o000O<TopCardPersentationModel> {
    public o00O0O0(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        TopCardPersentationModel topCardPersentationModel = (TopCardPersentationModel) obj;
        viewHolder.setText(oO00O0oO.tv_title, topCardPersentationModel.title);
        viewHolder.setText(oO00O0oO.tv_desc, topCardPersentationModel.desc);
    }
}
