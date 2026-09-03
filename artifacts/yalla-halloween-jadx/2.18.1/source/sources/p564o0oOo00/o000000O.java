package p564o0oOo00;

import android.content.Context;
import com.app.base.model.TopCardPersentationModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import java.util.List;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends OooO0OO<TopCardPersentationModel> {
    public o000000O(Context context, List list) {
        super(context, R.layout.item_topcard_persentation, list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        TopCardPersentationModel topCardPersentationModel = (TopCardPersentationModel) obj;
        oooO0o.OooO(R.id.tv_title, topCardPersentationModel.title);
        oooO0o.OooO(R.id.tv_desc, topCardPersentationModel.desc);
    }
}
