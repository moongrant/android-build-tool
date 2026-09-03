package p401o0Oo0O00;

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
import p400o0Oo0O0.OooOO0O;
import p400o0Oo0O0.OooOOO0;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o0OOO0o;
import p587o0oOooOO.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class OooO<Model, ListenerTag> extends Dialog implements OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinearLayout f43648OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOO0<Model, ListenerTag> f43649OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Model f43650OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43651OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOO0 f43652OooO0oo;

    public class OooO00o extends o0OOOO0o {
        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO oooO = OooO.this;
            if (oooO.OooO0Oo()) {
                oooO.dismiss();
            }
        }
    }

    public OooO(@NonNull Context context, int i) {
        super(context, i);
        this.f43651OooO0oO = true;
        this.f43652OooO0oo = null;
        Window window = getWindow();
        if (OooO0OO() > 0) {
            window.setWindowAnimations(OooO0OO());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(o0OOO0o.colorTransparent);
        window.setDimAmount(OooO0o());
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(this.f43651OooO0oO);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f43648OooO0Oo = linearLayout;
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
        if (this.f43652OooO0oo == null) {
            this.f43652OooO0oo = new OooOO0(this);
        }
        u.OooO0O0(viewFindViewById, this.f43652OooO0oo);
        return viewFindViewById;
    }

    public abstract void OooO0O0();

    public int OooO0OO() {
        return 0;
    }

    @Deprecated
    public boolean OooO0Oo() {
        return this.f43651OooO0oO;
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
        OooOOO0<Model, ListenerTag> oooOOO0 = this.f43649OooO0o;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o(-1, obj, r4);
        }
    }

    public final void OooOO0O(int i) {
        this.f43648OooO0Oo.setGravity(i);
        getWindow().setGravity(i);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f43651OooO0oO = z;
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
