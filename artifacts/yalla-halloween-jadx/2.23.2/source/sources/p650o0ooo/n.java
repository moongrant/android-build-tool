package p650o0ooo;

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
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class n extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f58395OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f58396OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f58397OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public NetImageView f58398OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f58399OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f58400OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f58401OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f58402OooOOOo;

    public n(FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
        this.f58395OooO.setVisibility(0);
        this.f58396OooOO0.setVisibility(0);
        this.f58398OooOO0o.setImageDrawable(null);
        this.f58400OooOOO0.setText("");
        this.f58399OooOOO.setText("");
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_open_red_gift_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f58395OooO = (RelativeLayout) OooO00o(o0OO00O.dialog_open_red_gift_layout_layout_bg);
        this.f58396OooOO0 = (LinearLayout) findViewById(o0OO00O.dialog_open_red_gift_layout_layout_content);
        this.f58397OooOO0O = (ImageView) findViewById(o0OO00O.dialog_open_red_gift_layout_iv_title);
        this.f58398OooOO0o = (NetImageView) findViewById(o0OO00O.dialog_open_red_gift_layout_iv_head);
        this.f58400OooOOO0 = (TextView) findViewById(o0OO00O.dialog_open_red_gift_layout_tv_name);
        this.f58399OooOOO = (TextView) findViewById(o0OO00O.dialog_open_red_gift_layout_tv_info);
        this.f58401OooOOOO = (TextView) OooO00o(o0OO00O.dialog_open_red_gift_layout_tv_detail);
        this.f58402OooOOOo = (TextView) OooO00o(o0OO00O.dialog_open_red_gift_layout_tv_confirm);
        this.f58399OooOOO.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f58402OooOOOo.setVisibility(0);
        this.f58401OooOOOO.setVisibility(8);
    }

    public final void OooOO0o(boolean z) {
        if (z) {
            this.f58397OooOO0O.setImageResource(o0Oo0oo.icon_red_wars);
            this.f58402OooOOOo.setVisibility(0);
            this.f58401OooOOOO.setVisibility(8);
        } else {
            this.f58397OooOO0O.setImageResource(o0Oo0oo.icon_red_wars_not_get);
            this.f58402OooOOOo.setVisibility(8);
            this.f58401OooOOOO.setVisibility(0);
        }
    }

    public final void OooOOO0(String str) {
        TextView textView = this.f58399OooOOO;
        if (textView != null) {
            textView.setText("");
            this.f58399OooOOO.setVisibility(8);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f58399OooOOO.setText(str);
            this.f58399OooOOO.setVisibility(0);
        }
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.dialog_open_red_gift_layout_layout_bg) {
            OooOO0((String) this.f43650OooO0o0, AbsListenerTag.Bg);
            if (this.f43651OooO0oO) {
                dismiss();
                return;
            }
            return;
        }
        if (id == o0OO00O.dialog_open_red_gift_layout_tv_detail) {
            OooOO0((String) this.f43650OooO0o0, AbsListenerTag.Default);
            dismiss();
        } else if (id == o0OO00O.dialog_open_red_gift_layout_tv_confirm) {
            OooOO0((String) this.f43650OooO0o0, AbsListenerTag.Ok);
            dismiss();
        }
    }
}
