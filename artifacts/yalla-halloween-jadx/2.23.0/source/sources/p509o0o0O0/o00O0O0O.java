package p509o0o0O0;

import android.app.Activity;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentInputCoverVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentInputCoverVideo.kt\ncom/yalla/yalla/ui/composable/moment/MomentInputCoverVideoKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,91:1\n81#2,11:92\n81#2,11:103\n486#3,4:114\n490#3,2:122\n494#3:128\n25#4:118\n1097#5,3:119\n1100#5,3:125\n486#6:124\n*S KotlinDebug\n*F\n+ 1 MomentInputCoverVideo.kt\ncom/yalla/yalla/ui/composable/moment/MomentInputCoverVideoKt\n*L\n30#1:92,11\n31#1:103,11\n32#1:114,4\n32#1:122,2\n32#1:128\n32#1:118\n32#1:119,3\n32#1:125,3\n32#1:124\n*E\n"})
public final class o00O0O0O {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f50828OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ TempAtVM f50829OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f50830OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TempAtVM tempAtVM, MomentVideoVM momentVideoVM, CoroutineScope coroutineScope) {
            super(0);
            this.f50828OooO0Oo = momentVideoVM;
            this.f50830OooO0o0 = coroutineScope;
            this.f50829OooO0o = tempAtVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("106117");
            o00O0O0 onLogin = new o00O0O0(this.f50829OooO0o, this.f50828OooO0Oo, this.f50830OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f50831OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentVideoVM momentVideoVM) {
            super(0);
            this.f50831OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("106116");
            o00O0OO0 onLogin = new o00O0OO0(this.f50831OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f50832OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentVideoVM momentVideoVM) {
            super(0);
            this.f50832OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("106118");
            oo0o0O0 onLogin = new oo0o0O0(this.f50832OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50833OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50835OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f50836OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f50837OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50838OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, boolean z2, MutableState<String> mutableState, Modifier modifier, int i, int i2) {
            super(2);
            this.f50834OooO0Oo = z;
            this.f50836OooO0o0 = z2;
            this.f50835OooO0o = mutableState;
            this.f50837OooO0oO = modifier;
            this.f50838OooO0oo = i;
            this.f50833OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O0O0O.OooO00o(this.f50834OooO0Oo, this.f50836OooO0o0, this.f50835OooO0o, this.f50837OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50838OooO0oo | 1), this.f50833OooO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1 A[PHI: r2 r4 r6 r9
      0x00d1: PHI (r2v5 boolean) = (r2v2 boolean), (r2v7 boolean) binds: [B:70:0x00c8, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r4v8 boolean) = (r4v5 boolean), (r4v9 boolean) binds: [B:70:0x00c8, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r6v39 int) = (r6v12 int), (r6v40 int) binds: [B:70:0x00c8, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r9v12 androidx.compose.runtime.MutableState<java.lang.String>) = 
      (r9v7 androidx.compose.runtime.MutableState<java.lang.String>)
      (r9v6 androidx.compose.runtime.MutableState<java.lang.String>)
     binds: [B:70:0x00c8, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a7  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(boolean z, boolean z2, @Nullable MutableState<String> mutableState, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        MutableState<String> mutableStateMutableStateOf$default;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z5;
        boolean z6;
        Modifier modifier3;
        int i6;
        MutableState<String> mutableState2;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        ViewModelStoreOwner current;
        CreationExtras defaultViewModelCreationExtras;
        MomentVideoVM momentVideoVM;
        ViewModelStoreOwner current2;
        CreationExtras defaultViewModelCreationExtras2;
        Object objOooO00o;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2081609492);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 14) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    mutableStateMutableStateOf$default = mutableState;
                    int i9 = composerStartRestartGroup.changed(mutableStateMutableStateOf$default) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i9;
                } else {
                    mutableStateMutableStateOf$default = mutableState;
                }
                i3 |= i9;
            } else {
                mutableStateMutableStateOf$default = mutableState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z3;
                        }
                        if (i8 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                        }
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            i6 = i3;
                            mutableState2 = mutableStateMutableStateOf$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                        current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        momentVideoVM = (MomentVideoVM) viewModel;
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                        if (current2 != null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        if (current2 instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel2 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        TempAtVM tempAtVM = (TempAtVM) viewModel2;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM, momentVideoVM, coroutineScope), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        z5 = z3;
                        z6 = z4;
                    }
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                    modifier3 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                    current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel3 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    momentVideoVM = (MomentVideoVM) viewModel3;
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                    if (current2 != null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    if (current2 instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel4 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    TempAtVM tempAtVM2 = (TempAtVM) viewModel4;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM2, momentVideoVM, coroutineScope2), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z5 = z3;
                    z6 = z4;
                    mutableState2 = mutableStateMutableStateOf$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(z5, z6, mutableState2, modifier2, i, i2));
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                }
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel5 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM = (MomentVideoVM) viewModel5;
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current2 instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel6 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                TempAtVM tempAtVM3 = (TempAtVM) viewModel6;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM3, momentVideoVM, coroutineScope3), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                }
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel7 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM = (MomentVideoVM) viewModel7;
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current2 instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel8 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                TempAtVM tempAtVM4 = (TempAtVM) viewModel8;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM4, momentVideoVM, coroutineScope4), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(z5, z6, mutableState2, modifier2, i, i2));
        }
        i3 |= 48;
        z4 = z2;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                mutableStateMutableStateOf$default = mutableState;
                if (composerStartRestartGroup.changed(mutableStateMutableStateOf$default)) {
                }
                i3 |= i9;
            } else {
                mutableStateMutableStateOf$default = mutableState;
            }
            i3 |= i9;
        } else {
            mutableStateMutableStateOf$default = mutableState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                }
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel9 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM = (MomentVideoVM) viewModel9;
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current2 instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel10 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                TempAtVM tempAtVM5 = (TempAtVM) viewModel10;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM5, momentVideoVM, coroutineScope5), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                    } else {
                        i6 = i3;
                        mutableState2 = mutableStateMutableStateOf$default;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
                }
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel11 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                momentVideoVM = (MomentVideoVM) viewModel11;
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current2 instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel12 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                TempAtVM tempAtVM6 = (TempAtVM) viewModel12;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM6, momentVideoVM, coroutineScope6), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(z5, z6, mutableState2, modifier2, i, i2));
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                } else {
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                    modifier3 = modifier2;
                }
            } else {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                } else {
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current != null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel13 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            momentVideoVM = (MomentVideoVM) viewModel13;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 != null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel14 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TempAtVM tempAtVM7 = (TempAtVM) viewModel14;
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM7, momentVideoVM, coroutineScope7), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                } else {
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                    modifier3 = modifier2;
                }
            } else {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.hint_say_something), null, 2, null);
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                } else {
                    i6 = i3;
                    mutableState2 = mutableStateMutableStateOf$default;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2081609492, i6, -1, "com.yalla.yalla.ui.composable.moment.MomentInputCoverVideo (MomentInputCoverVideo.kt:23)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current != null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel15 = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            momentVideoVM = (MomentVideoVM) viewModel15;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 != null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel16 = ViewModelKt.viewModel(TempAtVM.class, current2, null, null, defaultViewModelCreationExtras2, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TempAtVM tempAtVM8 = (TempAtVM) viewModel16;
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            o00O000o.OooO00o(z5, z6, mutableState2, new OooO00o(tempAtVM8, momentVideoVM, coroutineScope8), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), modifier3, composerStartRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | ((i6 << 9) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(z5, z6, mutableState2, modifier2, i, i2));
    }
}
