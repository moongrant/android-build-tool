package com.app.base.view.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import p176o00OoooO.oO00o0;
import p176o00OoooO.oO00o00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class WelcomeDialog extends Dialog {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f12168Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f12169Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f12170Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f12171Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f12172OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeDialog(@NotNull final AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f12169Oooo0o = activity;
        this.f12172OoooO00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TaskViewModel.class), new Function0<ViewModelStore>() { // from class: com.app.base.view.dialog.WelcomeDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.view.dialog.WelcomeDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.app.base.view.dialog.WelcomeDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f12175Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f12175Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        requestWindowFeature(1);
        setContentView(R.layout.dialog_welcome);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable());
            window.setGravity(17);
            window.setWindowAnimations(R.style.anim_dialog_top);
        }
        View viewFindViewById = findViewById(R.id.tv_welcome_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_welcome_content)");
        this.f12168Oooo = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_welcome_conferm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tv_welcome_conferm)");
        this.f12171Oooo0oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.dialog_welcom_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.dialog_welcom_dismiss)");
        this.f12170Oooo0oO = (ImageView) viewFindViewById3;
        TextView textView = this.f12171Oooo0oo;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvConferm");
            textView = null;
        }
        textView.setOnClickListener(new oO00o00O(this));
        ImageView imageView2 = this.f12170Oooo0oO;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageViewDismiss");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new oO00o0(this));
    }
}
