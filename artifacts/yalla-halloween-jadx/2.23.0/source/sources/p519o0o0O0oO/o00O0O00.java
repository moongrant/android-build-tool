package p519o0o0O0oO;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public abstract class o00O0O00 extends LifeCycleDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f52542OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f52543OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f52544OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f52545OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f52546OooOO0O;

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00O0O00.this.OooO0OO(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52544OooO0oo = true;
        this.f52545OooOO0 = new OooO00o();
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(oO00O0o.color_transparent);
            window.setDimAmount(0.3f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.setAttributes(window.getAttributes());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52543OooO = linearLayout;
        setContentView(linearLayout);
        setCanceledOnTouchOutside(true);
        linearLayout.getLayoutParams().width = -1;
        int iOooO00o = OooO00o();
        if (iOooO00o != 0) {
            View.inflate(getContext(), iOooO00o, linearLayout);
        } else {
            OooO0O0(linearLayout);
        }
        View childAt = linearLayout.getChildAt(0);
        if (childAt == null) {
            throw new NullPointerException("Dialog 布局不能为空，请重写getContentViewId()或者initViewBiding()初始化布局");
        }
        childAt.setOnClickListener(new oo00o());
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.o00O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00O0O00 this$0 = this.f52524OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f52544OooO0oo) {
                    this$0.dismiss();
                }
            }
        });
    }

    public int OooO00o() {
        return 0;
    }

    public void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    public void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f52545OooOO0.onClick(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        if (this.f52546OooOO0O) {
            throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
        }
        this.f52546OooOO0O = true;
        super.setContentView(i);
    }

    @Override // com.yalla.yalla.ui.dialog.LifeCycleDialog, android.app.Dialog
    public void show() {
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        super.show();
    }

    @Override // android.app.Dialog
    public final void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.f52546OooOO0O) {
            this.f52546OooOO0O = true;
            super.setContentView(view);
            return;
        }
        throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
    }

    @Override // android.app.Dialog
    public final void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.f52546OooOO0O) {
            this.f52546OooOO0O = true;
            super.setContentView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
    }
}
