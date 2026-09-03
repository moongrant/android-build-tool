package p188o00o00o0;

import android.view.View;
import android.widget.LinearLayout;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooO00o {
    public OooO0o(View view) {
        super(view);
    }

    public final OooO0o OooOOO(int i) {
        ((LinearLayout) OooO0Oo(R.id.linearLayout)).setGravity(i);
        return this;
    }

    public final OooO0o OooOOO0(int i, boolean z) {
        OooO0Oo(i).setEnabled(z);
        return this;
    }

    public final OooO0o OooOOOO(int i, View.OnClickListener onClickListener) {
        OooO0Oo(i).setOnClickListener(onClickListener);
        return this;
    }

    public final OooO0o OooOOOo(int i, View.OnLongClickListener onLongClickListener) {
        OooO0Oo(i).setOnLongClickListener(onLongClickListener);
        return this;
    }
}
