package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.user.FollowUserInfoModel;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o0O0O00;
import p417o0OoO0.o00000O;
import p507o0o00ooo.t1;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p536o0o0Oo0o.o0OO0;
import p536o0o0Oo0o.oO00000o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/FollowingScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/model/user/FollowUserInfoModel;", "data", "Lkotlin/Function0;", "", "onItemClick", "onFollowClick", "UserItem", "(Lcom/yalla/yalla/model/user/FollowUserInfoModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "", "show", "onConfirmClick", "OpenFollowDialog", "(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/ui/vm/user/FollowingVM;", "vm", "InitObservers", "(Lcom/yalla/yalla/ui/vm/user/FollowingVM;Landroidx/compose/runtime/Composer;I)V", "", "fanNumber", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "", "FOLLOWING_TAG", "Ljava/lang/String;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFollowingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,226:1\n76#2:227\n76#2:392\n81#3,11:228\n154#4:239\n154#4:282\n154#4:283\n154#4:319\n154#4:320\n154#4:321\n154#4:322\n154#4:328\n154#4:329\n154#4:370\n154#4:371\n154#4:379\n36#5:240\n456#5,8:264\n464#5,3:278\n456#5,8:301\n464#5,3:315\n467#5,3:323\n456#5,8:347\n464#5,3:361\n467#5,3:365\n36#5:372\n467#5,3:380\n36#5:385\n1097#6,6:241\n1097#6,6:373\n1097#6,6:386\n73#7,6:247\n79#7:281\n83#7:384\n78#8,11:253\n78#8,11:290\n91#8:326\n78#8,11:336\n91#8:368\n91#8:383\n4144#9,6:272\n4144#9,6:309\n4144#9,6:355\n66#10,6:284\n72#10:318\n76#10:327\n66#10,6:330\n72#10:364\n76#10:369\n*S KotlinDebug\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen\n*L\n63#1:227\n201#1:392\n70#1:228,11\n133#1:239\n137#1:282\n138#1:283\n142#1:319\n147#1:320\n153#1:321\n154#1:322\n158#1:328\n163#1:329\n168#1:370\n173#1:371\n178#1:379\n135#1:240\n131#1:264,8\n131#1:278,3\n138#1:301,8\n138#1:315,3\n138#1:323,3\n159#1:347,8\n159#1:361,3\n159#1:365,3\n174#1:372\n131#1:380,3\n191#1:385\n135#1:241,6\n174#1:373,6\n191#1:386,6\n131#1:247,6\n131#1:281\n131#1:384\n131#1:253,11\n138#1:290,11\n138#1:326\n159#1:336,11\n159#1:368\n131#1:383\n131#1:272,6\n138#1:309,6\n159#1:355,6\n138#1:284,6\n138#1:318\n138#1:327\n159#1:330,6\n159#1:364\n159#1:369\n*E\n"})
public final class FollowingScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    private static final String FOLLOWING_TAG = "fAN_NUMBER";

    @NotNull
    public static final FollowingScreen INSTANCE = new FollowingScreen();

    @SourceDebugExtension({"SMAP\nFollowingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$InitObservers$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,226:1\n63#2,5:227\n*S KotlinDebug\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$InitObservers$2\n*L\n220#1:227,5\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f29880OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29881OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(ScreenNavigationActivity screenNavigationActivity, FollowingVM followingVM) {
            super(1);
            this.f29880OooO0Oo = screenNavigationActivity;
            this.f29881OooO0o0 = followingVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            com.yalla.yalla.ui.screen.user.OooO callback = new com.yalla.yalla.ui.screen.user.OooO(this.f29881OooO0o0);
            ScreenNavigationActivity screenNavigationActivity = this.f29880OooO0Oo;
            screenNavigationActivity.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            screenNavigationActivity.f29158OooO0oO.add(callback);
            return new oO00000o(screenNavigationActivity, callback);
        }
    }

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f29882OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29883OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<FollowUserInfoModel> f29884OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LazyListState lazyListState, o000O0.OooO0O0<FollowUserInfoModel> oooO0O0, FollowingVM followingVM) {
            super(3);
            this.f29882OooO0Oo = lazyListState;
            this.f29884OooO0o0 = oooO0O0;
            this.f29883OooO0o = followingVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(660532609, iIntValue, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.Content.<anonymous> (FollowingScreen.kt:85)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f29882OooO0Oo, null, false, null, null, null, false, new com.yalla.yalla.ui.screen.user.OooO0o(this.f29884OooO0o0, this.f29883OooO0o), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29885OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FollowingVM followingVM) {
            super(0);
            this.f29885OooO0Oo = followingVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FollowingVM followingVM = this.f29885OooO0Oo;
            followingVM.followUser(followingVM.getCurrentUserInfo());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29887OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29888OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f29888OooO0o0 = columnScope;
            this.f29887OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29887OooO0o | 1);
            FollowingScreen.this.Content(this.f29888OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29889OooO0Oo;

        public OooO0o(FollowingVM followingVM) {
            this.f29889OooO0Oo = followingVM;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            this.f29889OooO0Oo.updateUser(l.longValue(), false);
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29891OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29892OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FollowingVM followingVM, int i) {
            super(2);
            this.f29892OooO0o0 = followingVM;
            this.f29891OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29891OooO0o | 1);
            FollowingScreen.this.InitObservers(this.f29892OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29893OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f29893OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29893OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29896OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29897OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState, Function0<Unit> function0, int i) {
            super(2);
            this.f29896OooO0o0 = mutableState;
            this.f29895OooO0o = function0;
            this.f29897OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29897OooO0oO | 1);
            MutableState<Boolean> mutableState = this.f29896OooO0o0;
            Function0<Unit> function0 = this.f29895OooO0o;
            FollowingScreen.this.OpenFollowDialog(mutableState, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f29898OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29899OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(Function0<Unit> function0) {
            super(0);
            this.f29899OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29899OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29901OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowUserInfoModel f29902OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29903OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29904OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(FollowUserInfoModel followUserInfoModel, Function0<Unit> function0, Function0<Unit> function1, int i) {
            super(2);
            this.f29902OooO0o0 = followUserInfoModel;
            this.f29901OooO0o = function0;
            this.f29903OooO0oO = function1;
            this.f29904OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FollowingScreen.this.UserItem(this.f29902OooO0o0, this.f29901OooO0o, this.f29903OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29904OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29905OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Function0<Unit> function0) {
            super(0);
            this.f29905OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29905OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    private FollowingScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(FollowingVM followingVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1454361839);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1454361839, i, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.InitObservers (FollowingScreen.kt:197)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
        Observable<Object> observable = LiveEventBus.get("USER_ADD_BLACKLISTED");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.USER_ADD_BLACKLISTED)");
        o00000O.OooO00o(observable, new OooO0o(followingVM), composerStartRestartGroup, 8);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooO((ScreenNavigationActivity) objConsume, followingVM), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(followingVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OpenFollowDialog(MutableState<Boolean> mutableState, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(390470078);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(390470078, i2, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.OpenFollowDialog (FollowingScreen.kt:183)");
            }
            int i3 = oO00OOo0.Unfollow;
            String strOooO0OO = o0000.OooO0OO(i3);
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.unFollow_tips);
            String strOooO0OO3 = o0000.OooO0OO(i3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0O(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, strOooO0OO, strOooO0OO2, null, false, false, null, null, strOooO0OO3, false, null, false, (Function0) objRememberedValue, null, false, false, null, OooOOO0.f29898OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(mutableState, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void UserItem(FollowUserInfoModel followUserInfoModel, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1096440395);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1096440395, i, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.UserItem (FollowingScreen.kt:125)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(70)), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOOOO(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(modifierM169backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(13), null, composerStartRestartGroup, 6, 2);
        Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(46, companion, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
        String userHeader = followUserInfoModel.getUserHeader();
        float f = 40;
        int iOooO00o = o0000O0.OooO00o(f);
        oooOOOO.OooOO0(p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, userHeader), boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), companion2.getCenter()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        oooOOOO.OooO0oo(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), companion2.getCenter()), followUserInfoModel.getUserHeaderFrame());
        float f2 = 16;
        oooOOOO.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m525sizeVpY3zN4(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(1), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(27), Dp.m3765constructorimpl(f2)), companion2.getTopEnd()), followUserInfoModel.isOfficialRole());
        p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(7), null, composerStartRestartGroup, 6, 2);
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(15), 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        oooOOOO.OooOOOO(followUserInfoModel, null, composerStartRestartGroup, 520, 2);
        oooOOOO.OooO0o0(followUserInfoModel.getBio(), 0L, 0L, 0, 0, boxScopeInstance.align(companion, companion2.getBottomStart()), composerStartRestartGroup, 2097152, 30);
        p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(10), null, composerStartRestartGroup, 6, 2);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(followUserInfoModel.isFollowed().getValue().booleanValue() ? oOo00OO0.icon_fans_followed : oOo00OO0.icon_fans_follow, composerStartRestartGroup, 0);
        Modifier modifierOooO00o2 = com.facebook.OooOo00.OooO00o(24, companion, composerStartRestartGroup, 1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(function1);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOo00(function1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(painterPainterResource, "", ClickableKt.m202clickableXHw0xAI$default(modifierOooO00o2, false, null, null, (Function0) objRememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(followUserInfoModel, function0, function1, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1372320291);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372320291, i2, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.Content (FollowingScreen.kt:61)");
            }
            int i3 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup).getInt(FOLLOWING_TAG);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Following, composerStartRestartGroup, 0);
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37715OooOOOO;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = i2;
            t1.OooO00o(strStringResource, 0.0f, j, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(companion, o000OOo.OooO0OO(composerStartRestartGroup).f37716OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(FollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            FollowingVM followingVM = (FollowingVM) viewModel;
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(followingVM.userFollowingPager(i3, FeedbackType.Suggestions).f37667OooO0oo, composerStartRestartGroup);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            InitObservers(followingVM, composerStartRestartGroup, (i4 & 112) | 8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambda = o0OO0.f54965OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 660532609, true, new OooO00o(lazyListStateRememberLazyListState, oooO0O0OooO00o, followingVM));
            int i5 = o000O0.OooO0O0.f34327OooO0o0;
            composer2 = composerStartRestartGroup;
            o0O0O00.OooO00o(oooO0O0OooO00o, modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236216, 184);
            OpenFollowDialog(followingVM.getShowUnFollowDialog(), new OooO0O0(followingVM), composer2, (i4 << 3) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, i));
    }

    public final void navigate(int fanNumber) {
        oo0oOO0.OooO0o0(INSTANCE, p063o0000oO.o00Ooo.OooO0O0(TuplesKt.to(FOLLOWING_TAG, Integer.valueOf(fanNumber))), false, null, 12);
    }
}
