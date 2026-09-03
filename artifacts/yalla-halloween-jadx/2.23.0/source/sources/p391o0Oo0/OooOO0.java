package p391o0Oo0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.z0;
import p584o0oOooO0.oO00O0o;
import p629o0ooO0O0.o00000OO;
import p629o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class OooOO0<Model, ListenerTag> extends Dialog implements o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinearLayout f44396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000Ooo<Model, ListenerTag> f44397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Model f44398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f44399OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOO0O f44400OooO0oo;

    public class OooO00o extends oo00o {
        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooOO0 oooOO1 = OooOO0.this;
            if (oooOO1.OooO0Oo()) {
                oooOO1.dismiss();
            }
        }
    }

    public OooOO0(@NonNull Context context, int i) {
        super(context, i);
        this.f44399OooO0oO = true;
        this.f44400OooO0oo = null;
        Window window = getWindow();
        if (OooO0OO() > 0) {
            window.setWindowAnimations(OooO0OO());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(oO00O0o.colorTransparent);
        window.setDimAmount(OooO0o());
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(this.f44399OooO0oO);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f44396OooO0Oo = linearLayout;
        linearLayout.setFitsSystemWindows(true);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View.inflate(getContext(), OooO0o0(), linearLayout);
        linearLayout.getChildAt(0).setOnClickListener(new OooO00o());
        linearLayout.setOnClickListener(new OooO0O0());
        OooOO0O(17);
        setContentView(linearLayout);
        OooO0oo();
        OooO0O0();
    }

    public static boolean OooO(Dialog dialog, Context context) {
        if (context == null || dialog == null || dialog.isShowing()) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public final View OooO00o(@IdRes int i) {
        View viewFindViewById = findViewById(i);
        if (this.f44400OooO0oo == null) {
            this.f44400OooO0oo = new OooOO0O(this);
        }
        z0.OooO0O0(viewFindViewById, this.f44400OooO0oo);
        return viewFindViewById;
    }

    public abstract void OooO0O0();

    public int OooO0OO() {
        return 0;
    }

    @Deprecated
    public boolean OooO0Oo() {
        return this.f44399OooO0oO;
    }

    public float OooO0o() {
        return 0.3f;
    }

    public abstract int OooO0o0();

    public final String OooO0oO(@StringRes int i) {
        if (getContext() != null) {
            return getContext().getString(i);
        }
        return null;
    }

    public abstract void OooO0oo();

    public final void OooOO0(Object obj, Enum r4) {
        o0000Ooo<Model, ListenerTag> o0000ooo = this.f44397OooO0o;
        if (o0000ooo != null) {
            o0000ooo.OooO00o(-1, obj, r4);
        }
    }

    public final void OooOO0O(int i) {
        this.f44396OooO0Oo.setGravity(i);
        getWindow().setGravity(i);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f44399OooO0oO = z;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void show() {
        if (OooO(this, getContext())) {
            super.show();
        }
    }
}
