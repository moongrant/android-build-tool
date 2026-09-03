package p707oOooo0o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.ui.view.SVGAView;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000OO00 f53023OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Dialog f53022OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f53024OooO0OO = null;

    public class OooO00o implements DialogInterface.OnCancelListener {
        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            o000OO00 o000oo01 = o00.this.f53023OooO0O0;
            if (o000oo01 != null) {
                o000oo01.onCancel();
                o00.this.f53023OooO0O0 = null;
            }
        }
    }

    public class OooO0O0 implements DialogInterface.OnDismissListener {
        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            o00.this.f53023OooO0O0 = null;
        }
    }

    public final o00 OooO00o(Context context, String str) {
        if (this.f53022OooO00o == null) {
            Dialog dialog = new Dialog(context);
            this.f53022OooO00o = dialog;
            dialog.setCanceledOnTouchOutside(false);
            this.f53022OooO00o.requestWindowFeature(1);
            this.f53022OooO00o.setContentView(R.layout.dialog_loading_room);
            Window window = this.f53022OooO00o.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.5f);
            window.setGravity(17);
            ((SVGAView) window.findViewById(R.id.svga_loading)).OooO0OO();
            this.f53024OooO0OO = (TextView) window.findViewById(R.id.tv_loading);
        }
        if (OooO0OO.OooO0O0(str)) {
            this.f53024OooO0OO.setVisibility(0);
            this.f53024OooO0OO.setText(str);
        } else {
            this.f53024OooO0OO.setVisibility(8);
        }
        this.f53022OooO00o.setOnCancelListener(new OooO00o());
        this.f53022OooO00o.setOnDismissListener(new OooO0O0());
        p146o00Oo000.OooO0O0.OooOOO0(this.f53022OooO00o, context);
        return this;
    }
}
