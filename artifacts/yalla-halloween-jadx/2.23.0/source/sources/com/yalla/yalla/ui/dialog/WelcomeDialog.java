package com.yalla.yalla.ui.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p519o0o0O0oO.o5;
import p519o0o0O0oO.p5;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nWelcomeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeDialog.kt\ncom/yalla/yalla/ui/dialog/WelcomeDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,125:1\n75#2,13:126\n*S KotlinDebug\n*F\n+ 1 WelcomeDialog.kt\ncom/yalla/yalla/ui/dialog/WelcomeDialog\n*L\n41#1:126,13\n*E\n"})
public final class WelcomeDialog extends Dialog {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f27987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f27988OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f27989OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27990OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeDialog(@NotNull final FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27986OooO0Oo = activity;
        this.f27990OooO0oo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TaskViewModel.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.WelcomeDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.dialog.WelcomeDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.dialog.WelcomeDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27993OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27993OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        requestWindowFeature(1);
        setContentView(oO00OO0O.dialog_welcome);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable());
            window.setGravity(17);
            window.setWindowAnimations(oO00Oo00.anim_dialog_top);
        }
        View viewFindViewById = findViewById(oO00O0oO.tv_welcome_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_welcome_content)");
        this.f27989OooO0oO = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tv_welcome_conferm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tv_welcome_conferm)");
        this.f27987OooO0o = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.dialog_welcom_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.dialog_welcom_dismiss)");
        this.f27988OooO0o0 = (ImageView) viewFindViewById3;
        TextView textView = this.f27987OooO0o;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvConferm");
            textView = null;
        }
        textView.setOnClickListener(new o5(this));
        ImageView imageView2 = this.f27988OooO0o0;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageViewDismiss");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new p5(this));
    }
}
