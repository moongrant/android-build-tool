package p181o00o000;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.weieyu.yalla.R;
import p147o00Oo00o.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends oo0o0Oo {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f32950OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView f32951OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f32952OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f32953OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f32954OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f32955OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f32956o000oOoO;

    public OooO0OO(Activity activity, int i) {
        super(activity, i);
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0O0() {
        ImageView imageView = this.f32951OoooO0;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.f32950OoooO;
        if (textView != null) {
            textView.setText("");
            this.f32950OoooO.setHint("");
        }
        TextView textView2 = this.f32953OoooOO0;
        if (textView2 != null) {
            textView2.setText("");
            this.f32953OoooOO0.setHint("");
        }
        View view = this.f32954OoooOOO;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f32955OoooOOo.setVisibility(8);
        this.f32956o000oOoO.setVisibility(8);
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0OO() {
        this.f32951OoooO0 = (ImageView) OooO00o(R.id.include_image_text_text_image_line_iv_1);
        this.f32950OoooO = (TextView) OooO00o(R.id.include_image_text_text_image_line_tv_1);
        this.f32952OoooO0O = (ImageView) OooO00o(R.id.include_image_text_text_image_line_iv_2);
        this.f32953OoooOO0 = (TextView) OooO00o(R.id.include_image_text_text_image_line_tv_2);
        this.f32954OoooOOO = OooO00o(R.id.include_image_text_text_image_line_point_red);
        this.f32956o000oOoO = OooO00o(R.id.include_image_text_text_image_line_line_b);
        this.f32955OoooOOo = OooO00o(R.id.include_image_text_text_image_line_line_b10);
    }

    public final void OooO0o(String str, String str2) {
        this.f32951OoooO0.setVisibility(8);
        if (str != null) {
            this.f32950OoooO.setText(str);
        }
        if (str2 != null) {
            this.f32953OoooOO0.setText(str2);
        }
        this.f32952OoooO0O.setVisibility(8);
        this.f32952OoooO0O.setVisibility(0);
        this.f32952OoooO0O.setImageResource(R.drawable.ic_account_right);
        this.f32956o000oOoO.setVisibility(8);
        this.f32956o000oOoO.setVisibility(0);
    }

    public final void OooO0o0(int i) {
        View view = this.f32954OoooOOO;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }
}
