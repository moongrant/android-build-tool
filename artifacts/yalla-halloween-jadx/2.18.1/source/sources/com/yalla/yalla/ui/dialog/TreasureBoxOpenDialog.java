package com.yalla.yalla.ui.dialog;

import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502o0o00o0.o00000O;
import p534o0o0OOo0.o0O0o;
import p607o0oo0O0.o0Oo0oo;
import p649o0ooOOoo.pf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class TreasureBoxOpenDialog extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f23793OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final pf f23794OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Job f23795OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Room.TreasureBoxDrawNotify f23796o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasureBoxOpenDialog(@NotNull final FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23793OoooO = activity;
        new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0Oo0oo.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$special$$inlined$viewModels$default$2
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

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23799Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f23799Oooo0o;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        pf pfVarInflate = pf.inflate(activity.getLayoutInflater(), this.f41545Oooo0oo, false);
        Intrinsics.checkNotNullExpressionValue(pfVarInflate, "inflate(activity.layoutI…er, getRootView(), false)");
        this.f23794OoooOO0 = pfVarInflate;
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setDimAmount(0.8f);
        }
        FrameLayout frameLayout = pfVarInflate.f50313OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        OooO0oO(frameLayout);
        OooO0o(false);
        this.f41544Oooo0oO.setCancelable(false);
        pfVarInflate.f50316OooO0Oo.setOnClickListener(new o0O0o(this, 3));
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0Oo() {
        LiveEventBus.get("ROOM_TREASURE_BOX_OPEN_DIALOG_DISMISS").post(Boolean.TRUE);
        SVGAView sVGAView = this.f23794OoooOO0.f50317OooO0o;
        sVGAView.f21008Ooooo00 = null;
        sVGAView.OooOO0(true);
        Job job = this.f23795OoooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f23795OoooOOO = null;
    }
}
