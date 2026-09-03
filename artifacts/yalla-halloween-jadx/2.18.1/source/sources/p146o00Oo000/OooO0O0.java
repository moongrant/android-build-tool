package p146o00Oo000;

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
import com.weieyu.yalla.R;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class OooO0O0<Model, ListenerTag> extends Dialog implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f32151Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public LinearLayout f32152Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Model f32153Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o00Oo00.OooO0O0<Model, ListenerTag> f32154Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO0OO f32155OoooO00;

    public class OooO00o extends o00Oo0 {
        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
        }
    }

    /* JADX INFO: renamed from: o00Oo000.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class ViewOnClickListenerC0345OooO0O0 implements View.OnClickListener {
        public ViewOnClickListenerC0345OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (OooO0O0.this.OooO0Oo()) {
                OooO0O0.this.dismiss();
            }
        }
    }

    public OooO0O0(@NonNull Context context, int i) {
        super(context, i);
        this.f32151Oooo = true;
        this.f32155OoooO00 = null;
        Window window = getWindow();
        if (OooO0OO() > 0) {
            window.setWindowAnimations(OooO0OO());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.colorTransparent);
        window.setDimAmount(OooO0o());
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(this.f32151Oooo);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f32152Oooo0o = linearLayout;
        linearLayout.setFitsSystemWindows(true);
        this.f32152Oooo0o.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View.inflate(getContext(), OooO0o0(), this.f32152Oooo0o);
        this.f32152Oooo0o.getChildAt(0).setOnClickListener(new OooO00o());
        this.f32152Oooo0o.setOnClickListener(new ViewOnClickListenerC0345OooO0O0());
        OooOO0o(17);
        setContentView(this.f32152Oooo0o);
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

    public static void OooOOO0(Dialog dialog, Context context) {
        if (OooO(dialog, context)) {
            dialog.show();
        }
    }

    public final View OooO00o(@IdRes int i) {
        View viewFindViewById = findViewById(i);
        if (this.f32155OoooO00 == null) {
            this.f32155OoooO00 = new OooO0OO(this);
        }
        p148o00Oo0O.o00Oo0.OooO0O0(viewFindViewById, this.f32155OoooO00);
        return viewFindViewById;
    }

    public abstract void OooO0O0();

    public int OooO0OO() {
        return 0;
    }

    @Deprecated
    public boolean OooO0Oo() {
        return this.f32151Oooo;
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

    public final void OooOO0(ListenerTag listenertag) {
        OooOO0O(this.f32153Oooo0oO, listenertag);
    }

    public final void OooOO0O(Object obj, Object obj2) {
        o00Oo00.OooO0O0<Model, ListenerTag> oooO0O0 = this.f32154Oooo0oo;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0(obj, -1, obj2);
        }
    }

    public final void OooOO0o(int i) {
        this.f32152Oooo0o.setGravity(i);
        getWindow().setGravity(i);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f32151Oooo = z;
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
