package p176o00OoooO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class oO000OOo extends OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f32831OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f32832OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinearLayout f32833OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public NetImageView f32834OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f32835OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f32836OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f32837OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f32838o000oOoO;

    public oO000OOo(Context context) {
        super(context, 0);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f32832OoooO0.setVisibility(0);
        this.f32833OoooO0O.setVisibility(0);
        this.f32834OoooOO0.setImageDrawable(null);
        this.f32838o000oOoO.setText("");
        this.f32835OoooOOO.setText("");
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_open_red_gift_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f32832OoooO0 = (RelativeLayout) OooO00o(R.id.dialog_open_red_gift_layout_layout_bg);
        this.f32833OoooO0O = (LinearLayout) findViewById(R.id.dialog_open_red_gift_layout_layout_content);
        this.f32831OoooO = (ImageView) findViewById(R.id.dialog_open_red_gift_layout_iv_title);
        this.f32834OoooOO0 = (NetImageView) findViewById(R.id.dialog_open_red_gift_layout_iv_head);
        this.f32838o000oOoO = (TextView) findViewById(R.id.dialog_open_red_gift_layout_tv_name);
        this.f32835OoooOOO = (TextView) findViewById(R.id.dialog_open_red_gift_layout_tv_info);
        this.f32836OoooOOo = (TextView) OooO00o(R.id.dialog_open_red_gift_layout_tv_detail);
        this.f32837OoooOo0 = (TextView) OooO00o(R.id.dialog_open_red_gift_layout_tv_confirm);
        this.f32835OoooOOO.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f32837OoooOo0.setVisibility(0);
        this.f32836OoooOOo.setVisibility(8);
    }

    public final oO000OOo OooOOO(boolean z) {
        if (z) {
            this.f32831OoooO.setImageResource(R.drawable.icon_red_wars);
            this.f32837OoooOo0.setVisibility(0);
            this.f32836OoooOOo.setVisibility(8);
        } else {
            this.f32831OoooO.setImageResource(R.drawable.icon_red_wars_not_get);
            this.f32837OoooOo0.setVisibility(8);
            this.f32836OoooOOo.setVisibility(0);
        }
        return this;
    }

    public final oO000OOo OooOOOO(String str) {
        TextView textView = this.f32835OoooOOO;
        if (textView != null) {
            textView.setText("");
            this.f32835OoooOOO.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                this.f32835OoooOOO.setText(str);
                this.f32835OoooOOO.setVisibility(0);
            }
        }
        return this;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.dialog_open_red_gift_layout_layout_bg) {
            OooOO0O((String) this.f32153Oooo0oO, AbsListenerTag.Bg);
            if (this.f32151Oooo) {
                dismiss();
                return;
            }
            return;
        }
        if (id == R.id.dialog_open_red_gift_layout_tv_detail) {
            OooOO0O((String) this.f32153Oooo0oO, AbsListenerTag.Default);
            dismiss();
        } else if (id == R.id.dialog_open_red_gift_layout_tv_confirm) {
            OooOO0O((String) this.f32153Oooo0oO, AbsListenerTag.Ok);
            dismiss();
        }
    }
}
