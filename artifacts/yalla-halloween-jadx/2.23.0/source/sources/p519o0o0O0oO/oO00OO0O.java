package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class oO00OO0O extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f52820OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f52821OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f52822OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f52823OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f52824OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f52825OooOOO0;

    public oO00OO0O(Context context) {
        super(context, 0);
        OooOO0O(48);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
        this.f52820OooO.setVisibility(0);
        this.f52821OooOO0.setVisibility(0);
        this.f52822OooOO0O.setText("");
        this.f52823OooOO0o.setText("");
        this.f52825OooOOO0.setText("");
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return p584o0oOooO0.oO00OO0O.dialog_lucky_gift_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f52820OooO = (RelativeLayout) OooO00o(oO00O0oO.rl_lucky_gift_layout_bg);
        this.f52821OooOO0 = (LinearLayout) findViewById(oO00O0oO.ll_lucky_gift_content_wrapper);
        this.f52822OooOO0O = (TextView) findViewById(oO00O0oO.tv_lucky_gift_content);
        this.f52823OooOO0o = (TextView) findViewById(oO00O0oO.tv_lucky_gift_multiple);
        this.f52825OooOOO0 = (TextView) findViewById(oO00O0oO.tv_lucky_gift_coin);
        this.f52824OooOOO = (TextView) OooO00o(oO00O0oO.tv_lucky_gift_confirm);
        this.f52822OooOO0O.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f52824OooOOO.setVisibility(0);
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        if (view.getId() == oO00O0oO.tv_lucky_gift_confirm) {
            dismiss();
        }
    }
}
