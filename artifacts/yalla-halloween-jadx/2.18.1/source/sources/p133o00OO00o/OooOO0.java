package p133o00OO00o;

import android.content.Context;
import android.widget.TextView;
import com.weieyu.yalla.R;
import p254o00ooO0O.o000O0O0;
import p282o0O00o0.OooO;
import p282o0O00o0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0<Integer> extends OooO<Integer> {
    public OooOO0(Context context) {
        super(context, R.layout.explore_top_title_banner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p282o0O00o0.OooO
    public final void OooO00o(OooOOO0 oooOOO0, Integer integer) {
        ((TextView) oooOOO0.OooO00o(R.id.tv_title)).setText(o000O0O0.OooO0OO(((Integer) integer).intValue()));
    }
}
