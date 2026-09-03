package p139o00OOOo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class o000Oo0 extends OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f31799OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f31800OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinearLayout f31801OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f31802OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f31803OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f31804o000oOoO;

    public o000Oo0(Context context) {
        super(context, 0);
        OooOO0o(48);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f31800OoooO0.setVisibility(0);
        this.f31801OoooO0O.setVisibility(0);
        this.f31799OoooO.setText("");
        this.f31802OoooOO0.setText("");
        this.f31804o000oOoO.setText("");
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_lucky_gift_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f31800OoooO0 = (RelativeLayout) OooO00o(R.id.rl_lucky_gift_layout_bg);
        this.f31801OoooO0O = (LinearLayout) findViewById(R.id.ll_lucky_gift_content_wrapper);
        this.f31799OoooO = (TextView) findViewById(R.id.tv_lucky_gift_content);
        this.f31802OoooOO0 = (TextView) findViewById(R.id.tv_lucky_gift_multiple);
        this.f31804o000oOoO = (TextView) findViewById(R.id.tv_lucky_gift_coin);
        this.f31803OoooOOO = (TextView) OooO00o(R.id.tv_lucky_gift_confirm);
        this.f31799OoooO.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f31803OoooOOO.setVisibility(0);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.tv_lucky_gift_confirm) {
            dismiss();
        }
    }
}
