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
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0;
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
import p193o00o0O0O.o0000oo;
import p194o00o0OO.oo00o;
import p207o00o0oO0.o000O0Oo;
import p423o0OoO0OO.o00O0000;
import p487o0o00O.o00O00;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00O;
import p543o0o0Ooo0.oOO0O000;
import p543o0o0Ooo0.oOOOoo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/FollowingScreen;", "Lo0o0OOo0/o000O0;", "Lcom/yalla/yalla/model/user/FollowUserInfoModel;", "data", "Lkotlin/Function0;", "", "onItemClick", "onFollowClick", "UserItem", "(Lcom/yalla/yalla/model/user/FollowUserInfoModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "", "show", "onConfirmClick", "OpenFollowDialog", "(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/ui/vm/user/FollowingVM;", "vm", "InitObservers", "(Lcom/yalla/yalla/ui/vm/user/FollowingVM;Landroidx/compose/runtime/Composer;I)V", "", "fanNumber", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "", "FOLLOWING_TAG", "Ljava/lang/String;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFollowingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,226:1\n76#2:227\n76#2:392\n81#3,11:228\n154#4:239\n154#4:282\n154#4:283\n154#4:319\n154#4:320\n154#4:321\n154#4:322\n154#4:328\n154#4:329\n154#4:370\n154#4:371\n154#4:379\n36#5:240\n456#5,8:264\n464#5,3:278\n456#5,8:301\n464#5,3:315\n467#5,3:323\n456#5,8:347\n464#5,3:361\n467#5,3:365\n36#5:372\n467#5,3:380\n36#5:385\n1097#6,6:241\n1097#6,6:373\n1097#6,6:386\n73#7,6:247\n79#7:281\n83#7:384\n78#8,11:253\n78#8,11:290\n91#8:326\n78#8,11:336\n91#8:368\n91#8:383\n4144#9,6:272\n4144#9,6:309\n4144#9,6:355\n66#10,6:284\n72#10:318\n76#10:327\n66#10,6:330\n72#10:364\n76#10:369\n*S KotlinDebug\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen\n*L\n63#1:227\n201#1:392\n70#1:228,11\n133#1:239\n137#1:282\n138#1:283\n142#1:319\n147#1:320\n153#1:321\n154#1:322\n158#1:328\n163#1:329\n168#1:370\n173#1:371\n178#1:379\n135#1:240\n131#1:264,8\n131#1:278,3\n138#1:301,8\n138#1:315,3\n138#1:323,3\n159#1:347,8\n159#1:361,3\n159#1:365,3\n174#1:372\n131#1:380,3\n191#1:385\n135#1:241,6\n174#1:373,6\n191#1:386,6\n131#1:247,6\n131#1:281\n131#1:384\n131#1:253,11\n138#1:290,11\n138#1:326\n159#1:336,11\n159#1:368\n131#1:383\n131#1:272,6\n138#1:309,6\n159#1:355,6\n138#1:284,6\n138#1:318\n138#1:327\n159#1:330,6\n159#1:364\n159#1:369\n*E\n"})
public final class FollowingScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    private static final String FOLLOWING_TAG = "fAN_NUMBER";

    @NotNull
    public static final FollowingScreen INSTANCE = new FollowingScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29340OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29341OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(FollowingVM followingVM, int i) {
            super(2);
            this.f29341OooO0o0 = followingVM;
            this.f29340OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29340OooO0o | 1);
            FollowingScreen.this.InitObservers(this.f29341OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f29342OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29343OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<FollowUserInfoModel> f29344OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LazyListState lazyListState, p107o000ooO0.OooOOOO<FollowUserInfoModel> oooOOOO, FollowingVM followingVM) {
            super(3);
            this.f29342OooO0Oo = lazyListState;
            this.f29344OooO0o0 = oooOOOO;
            this.f29343OooO0o = followingVM;
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
                    ComposerKt.traceEventStart(660532609, iIntValue, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.Content.<anonymous> (FollowingScreen.kt:86)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f29342OooO0Oo, null, false, null, null, null, false, new com.yalla.yalla.ui.screen.user.OooO0o(this.f29344OooO0o0, this.f29343OooO0o), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29345OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FollowingVM followingVM) {
            super(0);
            this.f29345OooO0Oo = followingVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FollowingVM followingVM = this.f29345OooO0Oo;
            followingVM.followUser(followingVM.getCurrentUserInfo());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29347OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29348OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f29348OooO0o0 = columnScope;
            this.f29347OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29347OooO0o | 1);
            FollowingScreen.this.Content(this.f29348OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFollowingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$InitObservers$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,226:1\n63#2,5:227\n*S KotlinDebug\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$InitObservers$2\n*L\n220#1:227,5\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f29349OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowingVM f29350OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ScreenNavigationActivity screenNavigationActivity, FollowingVM followingVM) {
            super(1);
            this.f29349OooO0Oo = screenNavigationActivity;
            this.f29350OooO0o0 = followingVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            com.yalla.yalla.ui.screen.user.OooO callback = new com.yalla.yalla.ui.screen.user.OooO(this.f29350OooO0o0);
            ScreenNavigationActivity screenNavigationActivity = this.f29349OooO0Oo;
            screenNavigationActivity.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            screenNavigationActivity.f28624OooO0oO.add(callback);
            return new oOOOoo00(screenNavigationActivity, callback);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29351OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f29351OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29351OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f29352OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29353OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0<Unit> function0) {
            super(0);
            this.f29353OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29353OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29355OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29356OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29357OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Boolean> mutableState, Function0<Unit> function0, int i) {
            super(2);
            this.f29356OooO0o0 = mutableState;
            this.f29355OooO0o = function0;
            this.f29357OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29357OooO0oO | 1);
            MutableState<Boolean> mutableState = this.f29356OooO0o0;
            Function0<Unit> function0 = this.f29355OooO0o;
            FollowingScreen.this.OpenFollowDialog(mutableState, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29358OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(Function0<Unit> function0) {
            super(0);
            this.f29358OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29358OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29360OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowUserInfoModel f29361OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29362OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29363OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(FollowUserInfoModel followUserInfoModel, Function0<Unit> function0, Function0<Unit> function1, int i) {
            super(2);
            this.f29361OooO0o0 = followUserInfoModel;
            this.f29360OooO0o = function0;
            this.f29362OooO0oO = function1;
            this.f29363OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FollowingScreen.this.UserItem(this.f29361OooO0o0, this.f29360OooO0o, this.f29362OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29363OooO0oo | 1));
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
            ComposerKt.traceEventStart(1454361839, i, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.InitObservers (FollowingScreen.kt:199)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
        Observable<Object> observable = LiveEventBus.get("USER_ADD_BLACKLISTED");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        o00O0000.OooO00o(observable, new o00O00(followingVM, 1), composerStartRestartGroup, 72);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooO0o((ScreenNavigationActivity) objConsume, followingVM), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(followingVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitObservers$lambda$6(FollowingVM vm, long j) {
        Intrinsics.checkNotNullParameter(vm, "$vm");
        vm.updateUser(j, false);
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
            int i3 = o000000.Unfollow;
            String strOooO0OO = o0000.OooO0OO(i3);
            String strOooO0OO2 = o0000.OooO0OO(o000000.unFollow_tips);
            String strOooO0OO3 = o0000.OooO0OO(i3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, strOooO0OO, strOooO0OO2, null, false, false, null, null, strOooO0OO3, false, null, false, (Function0) objRememberedValue, null, false, false, null, OooOO0O.f29352OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(mutableState, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void UserItem(FollowUserInfoModel followUserInfoModel, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1096440395);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1096440395, i, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.UserItem (FollowingScreen.kt:129)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(70)), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOOO(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM204clickableXHw0xAI$default = ClickableKt.m204clickableXHw0xAI$default(modifierM171backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM204clickableXHw0xAI$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(13), null, composerStartRestartGroup, 6, 2);
        Modifier modifierOooO00o = o00O0.OooO00o(46, companion, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        String userHeader = followUserInfoModel.getUserHeader();
        float f = 40;
        int iOooO00o = o0000O0.OooO00o(f);
        oooO00o.OooOO0(p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, userHeader), boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), companion2.getCenter()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        oooO00o.OooO0oo(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), companion2.getCenter()), followUserInfoModel.getUserHeaderFrame());
        float f2 = 16;
        oooO00o.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(27), Dp.m3775constructorimpl(f2)), companion2.getTopEnd()), followUserInfoModel.isOfficialRole());
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(7), null, composerStartRestartGroup, 6, 2);
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(15), 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        oooO00o.OooOOOO(followUserInfoModel, null, composerStartRestartGroup, 520, 2);
        oooO00o.OooO0o0(followUserInfoModel.getBio(), 0L, 0L, 0, 0, boxScopeInstance.align(companion, companion2.getBottomStart()), composerStartRestartGroup, 2097152, 30);
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(10), null, composerStartRestartGroup, 6, 2);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(followUserInfoModel.isFollowed().getValue().booleanValue() ? o0Oo0oo.icon_fans_followed : o0Oo0oo.icon_fans_follow, composerStartRestartGroup, 0);
        Modifier modifierOooO00o2 = o00O0.OooO00o(24, companion, composerStartRestartGroup, 1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(function1);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOOOO(function1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(painterPainterResource, "", ClickableKt.m204clickableXHw0xAI$default(modifierOooO00o2, false, null, null, (Function0) objRememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(followUserInfoModel, function0, function1, i));
    }

    @Override // p532o0o0OOo0.o000O0
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
            int i3 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup).getInt(FOLLOWING_TAG);
            String strStringResource = StringResources_androidKt.stringResource(o000000.Following, composerStartRestartGroup, 0);
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = i2;
            o0O0oo0o.OooO00o(strStringResource, 0.0f, j, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(FollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            FollowingVM followingVM = (FollowingVM) viewModel;
            p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(followingVM.userFollowingPager(i3, FeedbackType.Suggestions).f38501OooO0oo, composerStartRestartGroup);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            InitObservers(followingVM, composerStartRestartGroup, (i4 & 112) | 8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambda = oOO0O000.f55495OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 660532609, true, new OooO00o(lazyListStateRememberLazyListState, oooOOOOOooO00o, followingVM));
            int i5 = p107o000ooO0.OooOOOO.f35803OooO0o0;
            composer2 = composerStartRestartGroup;
            oo00o.OooO00o(oooOOOOOooO00o, modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236216, 184);
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
        p532o0o0OOo0.o00O00.OooO0o0(INSTANCE, p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to(FOLLOWING_TAG, Integer.valueOf(fanNumber))), false, null, 12);
    }
}
