package p250o00oo0oO;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.code.android.easydialog.WindowAnim;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p250o00oo0oO.o000O000;

/* JADX INFO: loaded from: classes.dex */
public class o000O000<T extends o000O000<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f34199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f34200OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f34201OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34202OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f34203OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f34204OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowAnim.values().length];
            iArr[WindowAnim.Alpha.ordinal()] = 1;
            iArr[WindowAnim.Bottom.ordinal()] = 2;
            iArr[WindowAnim.BottomWithAlpha.ordinal()] = 3;
            iArr[WindowAnim.Scale.ordinal()] = 4;
            iArr[WindowAnim.ScaleWithAlpha.ordinal()] = 5;
            iArr[WindowAnim.Top.ordinal()] = 6;
            iArr[WindowAnim.TopWithAlpha.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o000O000(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34199OooO00o = context;
        int i = 0;
        o000Oo0 o000oo1 = new o000Oo0(0, this, context);
        this.f34200OooO0O0 = o000oo1;
        this.f34202OooO0Oo = true;
        Window window = o000oo1.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(o000O0.easy_dialog_background);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(32);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34201OooO0OO = linearLayout;
        o000oo1.setContentView(linearLayout);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.getLayoutParams().height = -2;
        linearLayout.setGravity(1);
        linearLayout.setOnClickListener(new o000(this, i));
        linearLayout.setOnHierarchyChangeListener(new o000O0o(this));
        o000oo1.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o00oo0oO.o0000OO0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o000O000 this$0 = this.f34197OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
            }
        });
        o000oo1.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o00oo0oO.o000OO
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o000O000 this$0 = this.f34210Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                Function0<? extends Object> function0 = this$0.f34204OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        o000oo1.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o00oo0oO.o0000O0O
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                o000O000 this$0 = this.f34196Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                Function0<? extends Object> function0 = this$0.f34203OooO0o;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        o000oo1.setCanceledOnTouchOutside(true);
    }

    @NotNull
    public final o000O000 OooO() {
        this.f34201OooO0OO.setGravity(81);
        Window window = this.f34200OooO0O0.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    public final void OooO0OO() {
        this.f34200OooO0O0.cancel();
    }

    public final void OooO0Oo() {
        this.f34200OooO0O0.dismiss();
    }

    public void OooO0o() {
    }

    @Nullable
    public final Window OooO0o0() {
        return this.f34200OooO0O0.getWindow();
    }

    @NotNull
    public final T OooO0oO(boolean z) {
        this.f34202OooO0Oo = z;
        this.f34200OooO0O0.setCancelable(z);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    @NotNull
    public final T OooO0oo(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f34201OooO0OO.removeAllViews();
        this.f34201OooO0OO.addView(view);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    @NotNull
    public final T OooOO0(@Nullable Function0<? extends Object> function0) {
        this.f34203OooO0o = function0;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    @NotNull
    public final T OooOO0O(@Nullable Function0<? extends Object> function0) {
        this.f34204OooO0o0 = function0;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    @NotNull
    public final T OooOO0o(@NotNull WindowAnim windowAnim) {
        int i;
        Intrinsics.checkNotNullParameter(windowAnim, "windowAnim");
        Window windowOooO0o0 = OooO0o0();
        if (windowOooO0o0 != null) {
            switch (OooO00o.$EnumSwitchMapping$0[windowAnim.ordinal()]) {
                case 1:
                    i = o000O0Oo.WindowAnimAlpha;
                    break;
                case 2:
                    i = o000O0Oo.WindowAnimBottom;
                    break;
                case 3:
                    i = o000O0Oo.WindowAnimBottomWithAlpha;
                    break;
                case 4:
                    i = o000O0Oo.WindowAnimScale;
                    break;
                case 5:
                    i = o000O0Oo.WindowAnimScaleWithAlpha;
                    break;
                case 6:
                    i = o000O0Oo.WindowAnimTop;
                    break;
                case 7:
                    i = o000O0Oo.WindowAnimTopWithAlpha;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            windowOooO0o0.setWindowAnimations(i);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        return this;
    }

    public void OooOOO0() {
        Context context = this.f34199OooO00o;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) this.f34199OooO00o).isFinishing())) {
            return;
        }
        try {
            this.f34200OooO0O0.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }
}
