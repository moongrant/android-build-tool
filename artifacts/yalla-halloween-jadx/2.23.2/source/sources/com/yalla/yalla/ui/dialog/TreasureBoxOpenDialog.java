package com.yalla.yalla.ui.dialog;

import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.code.android.uikit.svga.SVGAView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.t;
import p581o0oOoo.o0000OO0;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTreasureBoxOpenDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreasureBoxOpenDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxOpenDialog\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n75#2,13:115\n1#3:128\n*S KotlinDebug\n*F\n+ 1 TreasureBoxOpenDialog.kt\ncom/yalla/yalla/ui/dialog/TreasureBoxOpenDialog\n*L\n24#1:115,13\n*E\n"})
public final class TreasureBoxOpenDialog extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27509OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final t f27510OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Job f27511OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RoomTreasureBox.TreasureBoxDrawNotify f27512OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasureBoxOpenDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27509OooOO0O = activity;
        new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0000OO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$special$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27515OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27515OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        t tVarInflate = t.inflate(activity.getLayoutInflater(), this.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(tVarInflate, "inflate(...)");
        this.f27510OooOO0o = tVarInflate;
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setDimAmount(0.8f);
        }
        FrameLayout frameLayout = tVarInflate.f45529OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        OooO0oO(frameLayout);
        OooO0o(false);
        this.f58509OooO0o0.setCancelable(false);
        tVarInflate.f45532OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TreasureBoxOpenDialog this$0 = this.f58248OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0Oo() {
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").post(Boolean.TRUE);
        SVGAView sVGAView = this.f27510OooOO0o.f45533OooO0o;
        sVGAView.f13231OooOoo0 = null;
        sVGAView.OooOOO0(true);
        Job job = this.f27511OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f27511OooOOO = null;
    }
}
