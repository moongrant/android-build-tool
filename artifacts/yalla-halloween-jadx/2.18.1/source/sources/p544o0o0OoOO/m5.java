package p544o0o0OoOO;

import android.content.Context;
import android.widget.ImageView;
import com.app.base.model.RedPaperList;
import com.weieyu.yalla.R;
import java.util.List;
import o00OOO.OooO00o;
import p133o00OO00o.OooO0OO;
import p133o00OO00o.o0ooOOo;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class m5 extends OooO0OO<RedPaperList.Data> {
    public m5(Context context, List list) {
        super(context, list, R.layout.lst_red_rnvelopes);
    }

    @Override // p133o00OO00o.OooO0OO
    public final void OooO0O0(o0ooOOo o0ooooo2, Object obj) {
        RedPaperList.Data data = (RedPaperList.Data) obj;
        o0ooooo2.OooO0O0(R.id.txt_title, data.nickname);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31185Oooo0o);
        oooO00o.OooO00o(OooO00o.OooO0o0());
        oooO00o.f48429OooO0OO = data.headurl;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o((ImageView) o0ooooo2.OooO00o(R.id.img_head));
        o0ooooo2.OooO0O0(R.id.txt_time, o00O0.f48624OooO00o.OooO0Oo(data.stimetamp, System.currentTimeMillis()));
        o0ooooo2.OooO0O0(R.id.txt_coin, data.amount);
        if ("1".equals(data.bestluck)) {
            o0ooooo2.OooO00o(R.id.txt_luckiest).setVisibility(0);
        } else {
            o0ooooo2.OooO00o(R.id.txt_luckiest).setVisibility(4);
        }
    }
}
