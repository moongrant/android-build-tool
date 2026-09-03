package p398o0Oo0O00;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IdRes;
import p554o0oOOoo0.oO000;
import p584o0oOooO0.oO00O0oO;
import p629o0ooO0O0.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO0OO<Model, Tag> implements o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f44419OooO0Oo;

    public OooO0OO(Activity activity, int i) {
        View viewFindViewById = activity.findViewById(i);
        this.f44419OooO0Oo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
        }
        oO000 oo000 = (oO000) this;
        oo000.f56067OooO0o0 = (ImageView) oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_iv_1);
        oo000.f56068OooO0oO = (TextView) oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_tv_1);
        oo000.f56066OooO0o = (ImageView) oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_iv_2);
        oo000.f56069OooO0oo = (TextView) oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_tv_2);
        oo000.f56070OooOO0 = oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_point_red);
        oo000.f56065OooO = oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_line_b);
        oo000.f56071OooOO0O = oo000.OooO00o(oO00O0oO.include_image_text_text_image_line_line_b10);
        ImageView imageView = oo000.f56067OooO0o0;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = oo000.f56068OooO0oO;
        if (textView != null) {
            textView.setText("");
            oo000.f56068OooO0oO.setHint("");
        }
        TextView textView2 = oo000.f56069OooO0oo;
        if (textView2 != null) {
            textView2.setText("");
            oo000.f56069OooO0oo.setHint("");
        }
        View view = oo000.f56070OooOO0;
        if (view != null) {
            view.setVisibility(8);
        }
        oo000.f56071OooOO0O.setVisibility(8);
        oo000.f56065OooO.setVisibility(8);
    }

    public final View OooO00o(@IdRes int i) {
        return this.f44419OooO0Oo.findViewById(i);
    }
}
