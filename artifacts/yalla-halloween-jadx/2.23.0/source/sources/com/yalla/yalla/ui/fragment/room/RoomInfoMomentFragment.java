package com.yalla.yalla.ui.fragment.room;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p579o0oOoo.oO0O0O00;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.g2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0014J\b\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/g2;", "", "initView", "Lcom/yalla/yalla/ui/vm/moment/RoomInfoMomentListVM;", "newMomentVM", "InitObservers", "(Lcom/yalla/yalla/ui/vm/moment/RoomInfoMomentListVM;Landroidx/compose/runtime/Composer;I)V", "onLazyInit", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "mMomentVM$delegate", "Lkotlin/Lazy;", "getMMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "mMomentVM", "Lo0oOoo/oO0O0O00;", "momentGiftSendUtil$delegate", "getMomentGiftSendUtil", "()Lo0oOoo/oO0O0O00;", "momentGiftSendUtil", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomInfoMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,194:1\n106#2,15:195\n*S KotlinDebug\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment\n*L\n57#1:195,15\n*E\n"})
public final class RoomInfoMomentFragment extends p508o0o0O.OooOO0O<g2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: mMomentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMomentVM;

    /* JADX INFO: renamed from: momentGiftSendUtil$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentGiftSendUtil;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29004OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMomentListVM f29005OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomInfoMomentListVM roomInfoMomentListVM, int i) {
            super(2);
            this.f29005OooO0o0 = roomInfoMomentListVM;
            this.f29004OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29004OooO0o | 1);
            RoomInfoMomentFragment.this.InitObservers(this.f29005OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1421416059, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment.initView.<anonymous> (RoomInfoMomentFragment.kt:73)");
                }
                SurfaceKt.m1185SurfaceFjzlyU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 493337289, true, new Oooo000(RoomInfoMomentFragment.this)), composer2, 1572870, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<oO0O0O00> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O0O00 invoke() {
            RoomInfoMomentFragment roomInfoMomentFragment = RoomInfoMomentFragment.this;
            FragmentActivity fragmentActivityRequireActivity = roomInfoMomentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new oO0O0O00(fragmentActivityRequireActivity, GiftPropTypeShow.InMomentList, roomInfoMomentFragment.getMMomentVM(), null, 24);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$1] */
    public RoomInfoMomentFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.mMomentVM = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f29015OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f29015OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.momentGiftSendUtil = LazyKt.lazy(new OooO0o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(RoomInfoMomentListVM roomInfoMomentListVM, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(17072141);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(roomInfoMomentListVM) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(17072141, i2, -1, "com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment.InitObservers (RoomInfoMomentFragment.kt:177)");
            }
            p509o0o0O0.o0ooOOo.OooO00o(roomInfoMomentListVM, null, composerStartRestartGroup, i2 & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(roomInfoMomentListVM, i));
    }

    @JvmStatic
    @NotNull
    public static final RoomInfoMomentFragment getInstance() {
        INSTANCE.getClass();
        return new RoomInfoMomentFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseMomentDetailVM getMMomentVM() {
        return (BaseMomentDetailVM) this.mMomentVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oO0O0O00 getMomentGiftSendUtil() {
        return (oO0O0O00) this.momentGiftSendUtil.getValue();
    }

    private final void initView() {
        ComposeView composeView = getBinding().f57957OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeView");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-1421416059, true, new OooO0OO()));
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0OO000.OooO00o("302007");
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public g2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g2 g2VarInflate = g2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(g2VarInflate, "inflate(inflater)");
        return g2VarInflate;
    }
}
