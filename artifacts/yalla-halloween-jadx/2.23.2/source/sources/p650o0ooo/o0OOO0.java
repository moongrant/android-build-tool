package p650o0ooo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class o0OOO0 extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f58690OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f58691OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f58692OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f58693OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f58694OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f58695OooOOO0;

    public o0OOO0(Context context) {
        super(context, 0);
        OooOO0O(48);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
        this.f58690OooO.setVisibility(0);
        this.f58691OooOO0.setVisibility(0);
        this.f58692OooOO0O.setText("");
        this.f58693OooOO0o.setText("");
        this.f58695OooOOO0.setText("");
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_lucky_gift_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f58690OooO = (RelativeLayout) OooO00o(o0OO00O.rl_lucky_gift_layout_bg);
        this.f58691OooOO0 = (LinearLayout) findViewById(o0OO00O.ll_lucky_gift_content_wrapper);
        this.f58692OooOO0O = (TextView) findViewById(o0OO00O.tv_lucky_gift_content);
        this.f58693OooOO0o = (TextView) findViewById(o0OO00O.tv_lucky_gift_multiple);
        this.f58695OooOOO0 = (TextView) findViewById(o0OO00O.tv_lucky_gift_coin);
        this.f58694OooOOO = (TextView) OooO00o(o0OO00O.tv_lucky_gift_confirm);
        this.f58692OooOO0O.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f58694OooOOO.setVisibility(0);
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        if (view.getId() == o0OO00O.tv_lucky_gift_confirm) {
            dismiss();
        }
    }
}
