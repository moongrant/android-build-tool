package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class j extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f52365OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f52366OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f52367OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public NetImageView f52368OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f52369OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f52370OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f52371OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f52372OooOOOo;

    public j(FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
        this.f52365OooO.setVisibility(0);
        this.f52366OooOO0.setVisibility(0);
        this.f52368OooOO0o.setImageDrawable(null);
        this.f52370OooOOO0.setText("");
        this.f52369OooOOO.setText("");
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_open_red_gift_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f52365OooO = (RelativeLayout) OooO00o(oO00O0oO.dialog_open_red_gift_layout_layout_bg);
        this.f52366OooOO0 = (LinearLayout) findViewById(oO00O0oO.dialog_open_red_gift_layout_layout_content);
        this.f52367OooOO0O = (ImageView) findViewById(oO00O0oO.dialog_open_red_gift_layout_iv_title);
        this.f52368OooOO0o = (NetImageView) findViewById(oO00O0oO.dialog_open_red_gift_layout_iv_head);
        this.f52370OooOOO0 = (TextView) findViewById(oO00O0oO.dialog_open_red_gift_layout_tv_name);
        this.f52369OooOOO = (TextView) findViewById(oO00O0oO.dialog_open_red_gift_layout_tv_info);
        this.f52371OooOOOO = (TextView) OooO00o(oO00O0oO.dialog_open_red_gift_layout_tv_detail);
        this.f52372OooOOOo = (TextView) OooO00o(oO00O0oO.dialog_open_red_gift_layout_tv_confirm);
        this.f52369OooOOO.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f52372OooOOOo.setVisibility(0);
        this.f52371OooOOOO.setVisibility(8);
    }

    public final void OooOO0o(boolean z) {
        if (z) {
            this.f52367OooOO0O.setImageResource(oOo00OO0.icon_red_wars);
            this.f52372OooOOOo.setVisibility(0);
            this.f52371OooOOOO.setVisibility(8);
        } else {
            this.f52367OooOO0O.setImageResource(oOo00OO0.icon_red_wars_not_get);
            this.f52372OooOOOo.setVisibility(8);
            this.f52371OooOOOO.setVisibility(0);
        }
    }

    public final void OooOOO0(String str) {
        TextView textView = this.f52369OooOOO;
        if (textView != null) {
            textView.setText("");
            this.f52369OooOOO.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f52369OooOOO.setText(str);
            this.f52369OooOOO.setVisibility(0);
        }
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.dialog_open_red_gift_layout_layout_bg) {
            OooOO0((String) this.f44398OooO0o0, AbsListenerTag.Bg);
            if (this.f44399OooO0oO) {
                dismiss();
                return;
            }
            return;
        }
        if (id == oO00O0oO.dialog_open_red_gift_layout_tv_detail) {
            OooOO0((String) this.f44398OooO0o0, AbsListenerTag.Default);
            dismiss();
        } else if (id == oO00O0oO.dialog_open_red_gift_layout_tv_confirm) {
            OooOO0((String) this.f44398OooO0o0, AbsListenerTag.Ok);
            dismiss();
        }
    }
}
