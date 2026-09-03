package p519o0o0O0oO;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class O0000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public c f52154OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Dialog f52153OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f52155OooO0OO = null;

    public final void OooO00o() {
        try {
            Dialog dialog = this.f52153OooO00o;
            if (dialog != null && dialog.isShowing()) {
                this.f52153OooO00o.dismiss();
            }
            this.f52155OooO0OO = null;
            this.f52153OooO00o = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0(@StringRes int i, Context context) {
        OooO0OO(context, o0000.OooO0OO(i));
    }

    public final void OooO0OO(Context context, String str) {
        if (this.f52153OooO00o == null) {
            Dialog dialog = new Dialog(context);
            this.f52153OooO00o = dialog;
            dialog.setCanceledOnTouchOutside(false);
            this.f52153OooO00o.requestWindowFeature(1);
            this.f52153OooO00o.setContentView(oO00OO0O.dialog_loading_anim);
            Window window = this.f52153OooO00o.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
            window.setGravity(17);
            ((SVGAView) window.findViewById(oO00O0oO.svga_loading)).OooO0Oo();
            this.f52155OooO0OO = (TextView) window.findViewById(oO00O0oO.tv_loading);
        }
        if (OooOo00.OooO0O0(str)) {
            this.f52155OooO0OO.setVisibility(0);
            this.f52155OooO0OO.setText(str);
        } else {
            this.f52155OooO0OO.setVisibility(8);
        }
        this.f52153OooO00o.setOnCancelListener(new oo000000(this));
        this.f52153OooO00o.setOnDismissListener(new oo00(this));
        Dialog dialog2 = this.f52153OooO00o;
        if (OooOO0.OooO(dialog2, context)) {
            dialog2.show();
        }
    }
}
