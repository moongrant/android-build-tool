package p402o0Oo0O0O;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IdRes;
import p400o0Oo0O0.OooOO0O;
import p561o0oOo00.OooOO0;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0000O00<Model, Tag> implements OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f43656OooO0Oo;

    public o0000O00(Activity activity, int i) {
        View viewFindViewById = activity.findViewById(i);
        this.f43656OooO0Oo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
        }
        OooOO0 oooOO1 = (OooOO0) this;
        oooOO1.f56239OooO0o0 = (ImageView) oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_iv_1);
        oooOO1.f56240OooO0oO = (TextView) oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_tv_1);
        oooOO1.f56238OooO0o = (ImageView) oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_iv_2);
        oooOO1.f56241OooO0oo = (TextView) oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_tv_2);
        oooOO1.f56242OooOO0 = oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_point_red);
        oooOO1.f56237OooO = oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_line_b);
        oooOO1.f56243OooOO0O = oooOO1.OooO00o(o0OO00O.include_image_text_text_image_line_line_b10);
        ImageView imageView = oooOO1.f56239OooO0o0;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = oooOO1.f56240OooO0oO;
        if (textView != null) {
            textView.setText("");
            oooOO1.f56240OooO0oO.setHint("");
        }
        TextView textView2 = oooOO1.f56241OooO0oo;
        if (textView2 != null) {
            textView2.setText("");
            oooOO1.f56241OooO0oo.setHint("");
        }
        View view = oooOO1.f56242OooOO0;
        if (view != null) {
            view.setVisibility(8);
        }
        oooOO1.f56243OooOO0O.setVisibility(8);
        oooOO1.f56237OooO.setVisibility(8);
    }

    public final View OooO00o(@IdRes int i) {
        return this.f43656OooO0Oo.findViewById(i);
    }
}
