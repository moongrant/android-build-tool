package p519o0o0O0oO;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
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
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/yalla/yalla/ui/dialog/BaseDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1855#2,2:214\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/yalla/yalla/ui/dialog/BaseDialog\n*L\n51#1:214,2\n*E\n"})
public class o00O00OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f52531OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f52532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LinearLayout f52533OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final LifeCycleDialog f52534OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Window f52535OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f52536OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f52537OooOO0;

    public static final class OooO00o extends Lambda implements Function0<List<Function1<? super DialogInterface, ? extends Unit>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f52538OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Function1<? super DialogInterface, ? extends Unit>> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00O00OO.this.OooO0o0(view);
        }
    }

    public o00O00OO(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52532OooO0Oo = context;
        LifeCycleDialog lifeCycleDialog = new LifeCycleDialog(context, i);
        this.f52534OooO0o0 = lifeCycleDialog;
        this.f52535OooO0oO = lifeCycleDialog.getWindow();
        this.f52536OooO0oo = true;
        Window window = lifeCycleDialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(oO00O0o.transparent);
            window.setDimAmount(0.3f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52533OooO0o = linearLayout;
        lifeCycleDialog.setContentView(linearLayout);
        lifeCycleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o0O0oO.o00O00
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o00O00OO this$0 = this.f52525OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (Function1 function1 : (List) this$0.f52531OooO.getValue()) {
                    if (function1 != null) {
                        Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialogInterface");
                        function1.invoke(dialogInterface);
                    }
                }
                this$0.OooO0Oo();
            }
        });
        OooO0o(this.f52536OooO0oo);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oOO00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00O00OO this$0 = this.f52957OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f52536OooO0oo) {
                    this$0.OooO0O0();
                }
            }
        });
        linearLayout.setOnHierarchyChangeListener(new o00O00o0(this));
        OooO0oo(17);
        this.f52531OooO = LazyKt.lazy(OooO00o.f52538OooO0Oo);
        this.f52537OooOO0 = new OooO0O0();
    }

    public void OooO() {
        Context context = this.f52532OooO0Oo;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) context).isFinishing())) {
            return;
        }
        try {
            this.f52534OooO0o0.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }

    public final void OooO00o(@NotNull Function1<? super DialogInterface, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((List) this.f52531OooO.getValue()).add(listener);
    }

    public void OooO0O0() {
        this.f52534OooO0o0.dismiss();
    }

    public final boolean OooO0OO() {
        return this.f52534OooO0o0.isShowing();
    }

    public void OooO0Oo() {
    }

    public final void OooO0o(boolean z) {
        this.f52536OooO0oo = z;
        this.f52534OooO0o0.setCanceledOnTouchOutside(z);
    }

    public void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void OooO0oO(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.f52533OooO0o;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
    }

    public final void OooO0oo(int i) {
        this.f52533OooO0o.setGravity(i);
        Window window = this.f52534OooO0o0.getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f52537OooOO0.onClick(v);
    }
}
