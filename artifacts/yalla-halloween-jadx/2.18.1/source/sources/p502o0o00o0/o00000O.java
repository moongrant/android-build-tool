package p502o0o00o0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.o0OoOo0;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.LifeCycleDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public class o00000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final Window f41542Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Context f41543Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final LifeCycleDialog f41544Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f41545Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f41546OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f41547OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f41548OoooO0O;

    public static final class OooO00o extends Lambda implements Function0<List<Function1<? super DialogInterface, ? extends Unit>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41549Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Function1<? super DialogInterface, ? extends Unit>> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00000O.this.OooO0o0(view);
        }
    }

    public o00000O(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41543Oooo0o = context;
        LifeCycleDialog lifeCycleDialog = new LifeCycleDialog(context, i);
        this.f41544Oooo0oO = lifeCycleDialog;
        this.f41542Oooo = lifeCycleDialog.getWindow();
        this.f41547OoooO00 = true;
        Window window = lifeCycleDialog.getWindow();
        int i2 = 0;
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setDimAmount(0.3f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41545Oooo0oo = linearLayout;
        lifeCycleDialog.setContentView(linearLayout);
        lifeCycleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00o0.o00000
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o00000O this$0 = this.f41541Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (Function1 function1 : (List) this$0.f41546OoooO0.getValue()) {
                    if (function1 != null) {
                        Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialogInterface");
                        function1.invoke(dialogInterface);
                    }
                }
                this$0.OooO0Oo();
            }
        });
        OooO0o(this.f41547OoooO00);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.setOnClickListener(new o00000O0(this, i2));
        linearLayout.setOnHierarchyChangeListener(new o0000Ooo(this));
        OooO0oo(17);
        this.f41546OoooO0 = LazyKt.lazy(OooO00o.f41549Oooo0o);
        this.f41548OoooO0O = new OooO0O0();
    }

    public final void OooO(@NotNull Function1<? super DialogInterface, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41544Oooo0oO.setOnCancelListener(new o0OoOo0(listener, 1));
    }

    public final void OooO00o(@NotNull Function1<? super DialogInterface, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((List) this.f41546OoooO0.getValue()).add(listener);
    }

    public void OooO0O0() {
        this.f41544Oooo0oO.dismiss();
    }

    public final boolean OooO0OO() {
        return this.f41544Oooo0oO.isShowing();
    }

    public void OooO0Oo() {
    }

    public final void OooO0o(boolean z) {
        this.f41547OoooO00 = z;
        this.f41544Oooo0oO.setCanceledOnTouchOutside(z);
    }

    public void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void OooO0oO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f41545Oooo0oo.removeAllViews();
        this.f41545Oooo0oo.addView(view);
    }

    public final void OooO0oo(int i) {
        this.f41545Oooo0oo.setGravity(i);
        Window window = this.f41544Oooo0oO.getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(i);
    }

    public void OooOO0() {
        Context context = this.f41543Oooo0o;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) this.f41543Oooo0o).isFinishing())) {
            return;
        }
        try {
            this.f41544Oooo0oO.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f41548OoooO0O.onClick(v);
    }
}
