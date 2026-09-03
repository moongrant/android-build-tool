package p707oOooo0o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.ui.view.SVGAView;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000OO00 f53028OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Dialog f53027OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f53029OooO0OO = null;

    public class OooO00o implements DialogInterface.OnCancelListener {
        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            o000OO00 o000oo01 = o000O.this.f53028OooO0O0;
            if (o000oo01 != null) {
                o000oo01.onCancel();
                o000O.this.f53028OooO0O0 = null;
            }
        }
    }

    public class OooO0O0 implements DialogInterface.OnDismissListener {
        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            o000O.this.f53028OooO0O0 = null;
        }
    }

    public final void OooO00o() {
        try {
            Dialog dialog = this.f53027OooO00o;
            if (dialog != null && dialog.isShowing()) {
                this.f53027OooO00o.dismiss();
            }
            this.f53029OooO0OO = null;
            this.f53027OooO00o = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final o000O OooO0O0(Context context, @StringRes int i) {
        OooO0OO(context, o000O0O0.OooO0OO(i));
        return this;
    }

    public final o000O OooO0OO(Context context, String str) {
        if (this.f53027OooO00o == null) {
            Dialog dialog = new Dialog(context);
            this.f53027OooO00o = dialog;
            dialog.setCanceledOnTouchOutside(false);
            this.f53027OooO00o.requestWindowFeature(1);
            this.f53027OooO00o.setContentView(R.layout.dialog_loading_anim);
            Window window = this.f53027OooO00o.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
            window.setGravity(17);
            ((SVGAView) window.findViewById(R.id.svga_loading)).OooO0OO();
            this.f53029OooO0OO = (TextView) window.findViewById(R.id.tv_loading);
        }
        if (OooO0OO.OooO0O0(str)) {
            this.f53029OooO0OO.setVisibility(0);
            this.f53029OooO0OO.setText(str);
        } else {
            this.f53029OooO0OO.setVisibility(8);
        }
        this.f53027OooO00o.setOnCancelListener(new OooO00o());
        this.f53027OooO00o.setOnDismissListener(new OooO0O0());
        p146o00Oo000.OooO0O0.OooOOO0(this.f53027OooO00o, context);
        return this;
    }
}
