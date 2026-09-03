package p650o0ooo;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public g f58138OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Dialog f58137OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f58139OooO0OO = null;

    public final void OooO00o() {
        try {
            Dialog dialog = this.f58137OooO00o;
            if (dialog != null && dialog.isShowing()) {
                this.f58137OooO00o.dismiss();
            }
            this.f58139OooO0OO = null;
            this.f58137OooO00o = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0(@StringRes int i, Context context) {
        OooO0OO(context, o0000.OooO0OO(i));
    }

    public final void OooO0OO(Context context, String str) {
        if (this.f58137OooO00o == null) {
            Dialog dialog = new Dialog(context);
            this.f58137OooO00o = dialog;
            dialog.setCanceledOnTouchOutside(false);
            this.f58137OooO00o.requestWindowFeature(1);
            this.f58137OooO00o.setContentView(oo0o0Oo.dialog_loading_anim);
            Window window = this.f58137OooO00o.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
            window.setGravity(17);
            ((SVGAView) window.findViewById(o0OO00O.svga_loading)).OooO0Oo();
            this.f58139OooO0OO = (TextView) window.findViewById(o0OO00O.tv_loading);
        }
        if (OooOo00.OooO0O0(str)) {
            this.f58139OooO0OO.setVisibility(0);
            this.f58139OooO0OO.setText(str);
        } else {
            this.f58139OooO0OO.setVisibility(8);
        }
        this.f58137OooO00o.setOnCancelListener(new O0OO00(this));
        this.f58137OooO00o.setOnDismissListener(new Oo0000(this));
        Dialog dialog2 = this.f58137OooO00o;
        if (OooO.OooO(dialog2, context)) {
            dialog2.show();
        }
    }
}
