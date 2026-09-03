package p502o0o00o0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.LifeCycleDialog;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public abstract class o0000oo extends LifeCycleDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f41578OoooOO0 = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f41579OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final LinearLayout f41580OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f41581OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final OooO00o f41582OoooO0O;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0000oo.this.OooO0OO(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41581OoooO00 = true;
        this.f41582OoooO0O = new OooO00o();
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(R.color.color_transparent);
            window.setDimAmount(0.3f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.setAttributes(window.getAttributes());
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41580OoooO0 = linearLayout;
        setContentView(linearLayout);
        setCanceledOnTouchOutside(this.f41581OoooO00);
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
        childAt.setOnClickListener(new View.OnClickListener() { // from class: o0o00o0.o0000O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = o0000oo.f41578OoooOO0;
            }
        });
        linearLayout.setOnClickListener(new o0000(this, 0));
    }

    public int OooO00o() {
        return 0;
    }

    public void OooO0O0(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    public void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f41582OoooO0O.onClick(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        if (this.f41579OoooO) {
            throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
        }
        this.f41579OoooO = true;
        super.setContentView(i);
    }

    @Override // com.yalla.yalla.common.ui.dialog.LifeCycleDialog, android.app.Dialog
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
        if (!this.f41579OoooO) {
            this.f41579OoooO = true;
            super.setContentView(view);
            return;
        }
        throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
    }

    @Override // android.app.Dialog
    public final void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.f41579OoooO) {
            this.f41579OoooO = true;
            super.setContentView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("Please override getContentView() or getContentViewId() to init content view");
    }
}
