package com.code.android.easydialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.ui.OooOo;
import com.code.android.easydialog.OooO;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o00Oo0;
import p157o00OoOO0.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEasyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasyDialog.kt\ncom/code/android/easydialog/EasyDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,305:1\n162#2,8:306\n*S KotlinDebug\n*F\n+ 1 EasyDialog.kt\ncom/code/android/easydialog/EasyDialog\n*L\n237#1:306,8\n*E\n"})
public class OooO<T extends OooO<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f10133OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f10134OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f10135OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f10136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f10137OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f10138OooO0o0;

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

    public OooO(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10133OooO00o = context;
        OooOOO0 oooOOO0 = new OooOOO0(0, this, context);
        this.f10134OooO0O0 = oooOOO0;
        int i = 1;
        this.f10136OooO0Oo = true;
        Window window = oooOOO0.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(o00Oo0.easy_dialog_background);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -2;
            window.setAttributes(window.getAttributes());
            window.setSoftInputMode(32);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10135OooO0OO = linearLayout;
        oooOOO0.setContentView(linearLayout);
        linearLayout.getLayoutParams().width = -1;
        linearLayout.getLayoutParams().height = -2;
        linearLayout.setGravity(1);
        linearLayout.setOnClickListener(new OooOo(this, i));
        linearLayout.setOnHierarchyChangeListener(new OooOO0O(this));
        oooOOO0.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.code.android.easydialog.OooO0O0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                OooO this$0 = this.f10141OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
            }
        });
        oooOOO0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.code.android.easydialog.OooO0OO
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                OooO this$0 = this.f10142OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0();
                Function0<? extends Object> function0 = this$0.f10138OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        oooOOO0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.code.android.easydialog.OooO0o
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OooO this$0 = this.f10143OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                Function0<? extends Object> function0 = this$0.f10137OooO0o;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        oooOOO0.setCanceledOnTouchOutside(true);
    }

    @NotNull
    public final void OooO(@Nullable Function0 function0) {
        this.f10137OooO0o = function0;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public final void OooO0OO() {
        this.f10134OooO0O0.dismiss();
    }

    @Nullable
    public final Window OooO0Oo() {
        return this.f10134OooO0O0.getWindow();
    }

    @NotNull
    public final void OooO0o(boolean z) {
        this.f10136OooO0Oo = z;
        this.f10134OooO0O0.setCancelable(z);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public void OooO0o0() {
    }

    @NotNull
    public final void OooO0oO(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.f10135OooO0OO;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    @NotNull
    public final void OooO0oo() {
        this.f10135OooO0OO.setGravity(81);
        Window window = this.f10134OooO0O0.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    @NotNull
    public final void OooOO0(@Nullable Function0 function0) {
        this.f10138OooO0o0 = function0;
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
                    i = o0OOO0o.WindowAnimAlpha;
                    break;
                case 2:
                    i = o0OOO0o.WindowAnimBottom;
                    break;
                case 3:
                    i = o0OOO0o.WindowAnimBottomWithAlpha;
                    break;
                case 4:
                    i = o0OOO0o.WindowAnimScale;
                    break;
                case 5:
                    i = o0OOO0o.WindowAnimScaleWithAlpha;
                    break;
                case 6:
                    i = o0OOO0o.WindowAnimTop;
                    break;
                case 7:
                    i = o0OOO0o.WindowAnimTopWithAlpha;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            windowOooO0Oo.setWindowAnimations(i);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
    }

    public void OooOO0o() {
        Context context = this.f10133OooO00o;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        try {
            this.f10134OooO0O0.show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }
}
