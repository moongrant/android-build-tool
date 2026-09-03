package p185o00o00Oo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.easydialog.WindowAnim;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p185o00o00Oo.o0000oo;
import p205o00o0o0o.o000OO0O;
import p205o00o0o0o.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEasyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasyDialog.kt\ncom/code/android/easydialog/EasyDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,305:1\n162#2,8:306\n*S KotlinDebug\n*F\n+ 1 EasyDialog.kt\ncom/code/android/easydialog/EasyDialog\n*L\n237#1:306,8\n*E\n"})
public class o0000oo<T extends o0000oo<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f38487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000OO f38488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f38489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f38490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f38491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f38492OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowAnim.values().length];
            try {
                iArr[WindowAnim.Alpha.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowAnim.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowAnim.BottomWithAlpha.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WindowAnim.Scale.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WindowAnim.ScaleWithAlpha.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WindowAnim.Top.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WindowAnim.TopWithAlpha.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0000oo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38487OooO00o = context;
        o000OO o000oo2 = new o000OO(0, this, context);
        this.f38488OooO0O0 = o000oo2;
        this.f38490OooO0Oo = true;
        Window window = o000oo2.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(o000Oo0.easy_dialog_background);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(32);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38489OooO0OO = linearLayout;
        o000oo2.setContentView(linearLayout);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.getLayoutParams().height = -2;
        linearLayout.setGravity(1);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o00o00Oo.o0000O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0000oo this$0 = this.f38480OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f38490OooO0Oo) {
                    this$0.f38488OooO0O0.cancel();
                }
            }
        });
        linearLayout.setOnHierarchyChangeListener(new o0000O0O(this));
        o000oo2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o00o00Oo.o00000OO
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o0000oo this$0 = this.f38478OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
            }
        });
        o000oo2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o00o00Oo.o0000Ooo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0000oo this$0 = this.f38486OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0();
                Function0<? extends Object> function0 = this$0.f38492OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        o000oo2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o00o00Oo.o0000
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                o0000oo this$0 = this.f38475OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                Function0<? extends Object> function0 = this$0.f38491OooO0o;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        o000oo2.setCanceledOnTouchOutside(true);
    }

    @NotNull
    public final void OooO(@Nullable Function0 function0) {
        this.f38491OooO0o = function0;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public final void OooO0OO() {
        this.f38488OooO0O0.dismiss();
    }

    @Nullable
    public final Window OooO0Oo() {
        return this.f38488OooO0O0.getWindow();
    }

    @NotNull
    public final void OooO0o(boolean z) {
        this.f38490OooO0Oo = z;
        this.f38488OooO0O0.setCancelable(z);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public void OooO0o0() {
    }

    @NotNull
    public final void OooO0oO(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.f38489OooO0OO;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    @NotNull
    public final void OooO0oo() {
        this.f38489OooO0OO.setGravity(81);
        Window window = this.f38488OooO0O0.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    @NotNull
    public final void OooOO0(@Nullable Function0 function0) {
        this.f38492OooO0o0 = function0;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    @NotNull
    public final void OooOO0O(@NotNull WindowAnim windowAnim) {
        int i;
        Intrinsics.checkNotNullParameter(windowAnim, "windowAnim");
        Window windowOooO0Oo = OooO0Oo();
        if (windowOooO0Oo != null) {
            switch (OooO00o.$EnumSwitchMapping$0[windowAnim.ordinal()]) {
                case 1:
                    i = o000OO0O.WindowAnimAlpha;
                    break;
                case 2:
                    i = o000OO0O.WindowAnimBottom;
                    break;
                case 3:
                    i = o000OO0O.WindowAnimBottomWithAlpha;
                    break;
                case 4:
                    i = o000OO0O.WindowAnimScale;
                    break;
                case 5:
                    i = o000OO0O.WindowAnimScaleWithAlpha;
                    break;
                case 6:
                    i = o000OO0O.WindowAnimTop;
                    break;
                case 7:
                    i = o000OO0O.WindowAnimTopWithAlpha;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            windowOooO0Oo.setWindowAnimations(i);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public void OooOO0o() {
        Context context = this.f38487OooO00o;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        try {
            this.f38488OooO0O0.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }
}
