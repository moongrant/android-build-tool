package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.OooOOOO;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/yalla/yalla/ui/dialog/BaseDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1855#2,2:214\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/yalla/yalla/ui/dialog/BaseDialog\n*L\n51#1:214,2\n*E\n"})
public class o000OO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f58506OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f58507OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LinearLayout f58508OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final LifeCycleDialog f58509OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Window f58510OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f58511OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f58512OooOO0;

    public static final class OooO00o extends Lambda implements Function0<List<Function1<? super DialogInterface, ? extends Unit>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f58513OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Function1<? super DialogInterface, ? extends Unit>> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o000OO00.this.OooO0o0(view);
        }
    }

    public o000OO00(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58507OooO0Oo = context;
        LifeCycleDialog lifeCycleDialog = new LifeCycleDialog(context, i);
        this.f58509OooO0o0 = lifeCycleDialog;
        this.f58510OooO0oO = lifeCycleDialog.getWindow();
        int i2 = 1;
        this.f58511OooO0oo = true;
        Window window = lifeCycleDialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(o0OOO0o.transparent);
            window.setDimAmount(0.3f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f58508OooO0o = linearLayout;
        lifeCycleDialog.setContentView(linearLayout);
        lifeCycleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0ooo.o000O0O0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o000OO00 this$0 = this.f58495OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (Function1 function1 : (List) this$0.f58506OooO.getValue()) {
                    if (function1 != null) {
                        Intrinsics.checkNotNull(dialogInterface);
                        function1.invoke(dialogInterface);
                    }
                }
                this$0.OooO0Oo();
            }
        });
        OooO0o(this.f58511OooO0oo);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.setOnClickListener(new OooOOOO(this, i2));
        linearLayout.setOnHierarchyChangeListener(new o000OOo0(this));
        OooO0oo(17);
        this.f58506OooO = LazyKt.lazy(OooO00o.f58513OooO0Oo);
        this.f58512OooOO0 = new OooO0O0();
    }

    public void OooO() {
        Context context = this.f58507OooO0Oo;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) context).isFinishing())) {
            return;
        }
        try {
            this.f58509OooO0o0.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }

    public final void OooO00o(@NotNull Function1<? super DialogInterface, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((List) this.f58506OooO.getValue()).add(listener);
    }

    public void OooO0O0() {
        this.f58509OooO0o0.dismiss();
    }

    public final boolean OooO0OO() {
        return this.f58509OooO0o0.isShowing();
    }

    public void OooO0Oo() {
    }

    public final void OooO0o(boolean z) {
        this.f58511OooO0oo = z;
        this.f58509OooO0o0.setCanceledOnTouchOutside(z);
    }

    public void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void OooO0oO(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.f58508OooO0o;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
    }

    public final void OooO0oo(int i) {
        this.f58508OooO0o.setGravity(i);
        Window window = this.f58509OooO0o0.getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f58512OooOO0.onClick(v);
    }
}
