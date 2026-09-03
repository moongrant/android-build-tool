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
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.user.VisitorUserInfoModel;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Metadata;
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
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.oo00o;
import p195o00o0OO0.o00000OO;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oOOo;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJ\u0006\u0010\n\u001a\u00020\u0005J\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/UserVisitorScreen;", "Lo0o0OOo0/o000O0;", "Lcom/yalla/yalla/model/user/VisitorUserInfoModel;", "data", "Lkotlin/Function0;", "", "onItemClick", "InvisibleVisitorItem", "(Lcom/yalla/yalla/model/user/VisitorUserInfoModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VisitorItem", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserVisitorScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserVisitorScreen.kt\ncom/yalla/yalla/ui/screen/user/UserVisitorScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,170:1\n81#2,11:171\n154#3:182\n154#3:225\n154#3:226\n154#3:262\n154#3:268\n154#3:269\n154#3:270\n154#3:276\n154#3:319\n154#3:320\n154#3:356\n154#3:357\n154#3:358\n154#3:359\n154#3:360\n154#3:366\n154#3:367\n154#3:408\n154#3:409\n154#3:410\n36#4:183\n456#4,8:207\n464#4,3:221\n456#4,8:244\n464#4,3:258\n467#4,3:263\n467#4,3:271\n36#4:277\n456#4,8:301\n464#4,3:315\n456#4,8:338\n464#4,3:352\n467#4,3:361\n456#4,8:385\n464#4,3:399\n467#4,3:403\n467#4,3:411\n1097#5,6:184\n1097#5,6:278\n73#6,6:190\n79#6:224\n83#6:275\n73#6,6:284\n79#6:318\n83#6:415\n78#7,11:196\n78#7,11:233\n91#7:266\n91#7:274\n78#7,11:290\n78#7,11:327\n91#7:364\n78#7,11:374\n91#7:406\n91#7:414\n4144#8,6:215\n4144#8,6:252\n4144#8,6:309\n4144#8,6:346\n4144#8,6:393\n66#9,6:227\n72#9:261\n76#9:267\n66#9,6:321\n72#9:355\n76#9:365\n66#9,6:368\n72#9:402\n76#9:407\n*S KotlinDebug\n*F\n+ 1 UserVisitorScreen.kt\ncom/yalla/yalla/ui/screen/user/UserVisitorScreen\n*L\n51#1:171,11\n93#1:182\n97#1:225\n98#1:226\n103#1:262\n107#1:268\n109#1:269\n111#1:270\n119#1:276\n123#1:319\n124#1:320\n128#1:356\n134#1:357\n140#1:358\n141#1:359\n147#1:360\n150#1:366\n155#1:367\n160#1:408\n165#1:409\n167#1:410\n95#1:183\n90#1:207,8\n90#1:221,3\n98#1:244,8\n98#1:258,3\n98#1:263,3\n90#1:271,3\n121#1:277\n117#1:301,8\n117#1:315,3\n124#1:338,8\n124#1:352,3\n124#1:361,3\n151#1:385,8\n151#1:399,3\n151#1:403,3\n117#1:411,3\n95#1:184,6\n121#1:278,6\n90#1:190,6\n90#1:224\n90#1:275\n117#1:284,6\n117#1:318\n117#1:415\n90#1:196,11\n98#1:233,11\n98#1:266\n90#1:274\n117#1:290,11\n124#1:327,11\n124#1:364\n151#1:374,11\n151#1:406\n117#1:414\n90#1:215,6\n98#1:252,6\n117#1:309,6\n124#1:346,6\n151#1:393,6\n98#1:227,6\n98#1:261\n98#1:267\n124#1:321,6\n124#1:355\n124#1:365\n151#1:368,6\n151#1:402\n151#1:407\n*E\n"})
public final class UserVisitorScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final UserVisitorScreen INSTANCE = new UserVisitorScreen();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29608OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Function0<Unit> function0) {
            super(0);
            this.f29608OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29608OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f29609OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ UserVisitorVM f29610OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<VisitorUserInfoModel> f29611OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LazyListState lazyListState, p107o000ooO0.OooOOOO<VisitorUserInfoModel> oooOOOO, UserVisitorVM userVisitorVM) {
            super(3);
            this.f29609OooO0Oo = lazyListState;
            this.f29611OooO0o0 = oooOOOO;
            this.f29610OooO0o = userVisitorVM;
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
                    ComposerKt.traceEventStart(-856874595, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserVisitorScreen.Content.<anonymous> (UserVisitorScreen.kt:54)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f29609OooO0Oo, null, false, null, null, null, false, new o0OOO0o(this.f29611OooO0o0, this.f29610OooO0o), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29613OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29614OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f29614OooO0o0 = columnScope;
            this.f29613OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29613OooO0o | 1);
            UserVisitorScreen.this.Content(this.f29614OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29615OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f29615OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29615OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29617OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VisitorUserInfoModel f29618OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29619OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, int i) {
            super(2);
            this.f29618OooO0o0 = visitorUserInfoModel;
            this.f29617OooO0o = function0;
            this.f29619OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29619OooO0oO | 1);
            VisitorUserInfoModel visitorUserInfoModel = this.f29618OooO0o0;
            Function0<Unit> function0 = this.f29617OooO0o;
            UserVisitorScreen.this.InvisibleVisitorItem(visitorUserInfoModel, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29621OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VisitorUserInfoModel f29622OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29623OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, int i) {
            super(2);
            this.f29622OooO0o0 = visitorUserInfoModel;
            this.f29621OooO0o = function0;
            this.f29623OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29623OooO0oO | 1);
            VisitorUserInfoModel visitorUserInfoModel = this.f29622OooO0o0;
            Function0<Unit> function0 = this.f29621OooO0o;
            UserVisitorScreen.this.VisitorItem(visitorUserInfoModel, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private UserVisitorScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void InvisibleVisitorItem(VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1399766336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1399766336, i, -1, "com.yalla.yalla.ui.screen.user.UserVisitorScreen.InvisibleVisitorItem (UserVisitorScreen.kt:88)");
        }
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(companion2, Dp.m3775constructorimpl(70)), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM204clickableXHw0xAI$default = ClickableKt.m204clickableXHw0xAI$default(modifierM171backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 7, null);
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
        Modifier modifierOooO00o = o00O0.OooO00o(46, companion2, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_user_visitor_invisible_header, composerStartRestartGroup, 0), "", BoxScopeInstance.INSTANCE.align(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(40)), companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(7), null, composerStartRestartGroup, 6, 2);
        oO0OO.OooO00o.f59939OooO00o.OooOOOo(o0000.OooO0OO(o000000.Mysterious_Visitor), 0L, false, 0L, 0, 0, null, false, null, composerStartRestartGroup, Pow2.MAX_POW2, 510);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 6, 0);
        TextKt.m1261Text4IGK_g(o0O0O0o0.OooO0Oo(visitorUserInfoModel.getVtime(), System.currentTimeMillis()), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, o0000O0.OooO0OO(13, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(16), null, composerStartRestartGroup, 6, 2);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(visitorUserInfoModel, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void VisitorItem(VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-363972337);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-363972337, i, -1, "com.yalla.yalla.ui.screen.user.UserVisitorScreen.VisitorItem (UserVisitorScreen.kt:115)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(70)), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO(function0);
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
        String userHeader = visitorUserInfoModel.getUserHeader();
        float f = 40;
        int iOooO00o = o0000O0.OooO00o(f);
        oooO00o.OooOO0(p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, userHeader), boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), companion2.getCenter()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        oooO00o.OooO0oo(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), companion2.getCenter()), visitorUserInfoModel.getUserHeaderFrame());
        float f2 = 16;
        oooO00o.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(27), Dp.m3775constructorimpl(f2)), companion2.getTopEnd()), visitorUserInfoModel.isOfficialRole());
        o0oOOo.f51721OooO00o.OooO00o(!visitorUserInfoModel.getIsnew(), 0.0f, PaddingKt.m478padding3ABfNKs(boxScopeInstance.align(companion, companion2.getTopEnd()), Dp.m3775constructorimpl(3)), composerStartRestartGroup, 3072, 2);
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(7), null, composerStartRestartGroup, 6, 2);
        float f3 = 15;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(f3), 1, null);
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
        oooO00o.OooO0O0(visitorUserInfoModel, null, composerStartRestartGroup, 520, 2);
        oooO00o.OooO0o0(visitorUserInfoModel.getBio(), 0L, 0L, 0, 0, boxScopeInstance.align(companion, companion2.getBottomStart()), composerStartRestartGroup, 2097152, 30);
        o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        TextKt.m1261Text4IGK_g(o0O0O0o0.OooO0Oo(visitorUserInfoModel.getVtime(), System.currentTimeMillis()), PaddingKt.m482paddingqDBjuR0$default(rowScopeInstance.align(companion, companion2.getBottom()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 7, null), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, o0000O0.OooO0OO(13, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(visitorUserInfoModel, function0, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1455246343);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455246343, i, -1, "com.yalla.yalla.ui.screen.user.UserVisitorScreen.Content (UserVisitorScreen.kt:42)");
            }
            o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
            String strStringResource = StringResources_androidKt.stringResource(o000000.Visitors, composerStartRestartGroup, 0);
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(strStringResource, 0.0f, j, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            new VisitorUserInfoModel();
            composer2.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(UserVisitorVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            UserVisitorVM userVisitorVM = (UserVisitorVM) viewModel;
            p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(userVisitorVM.getUserVisitorPager().f38501OooO0oo, composer2);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -856874595, true, new OooO00o(lazyListStateRememberLazyListState, oooOOOOOooO00o, userVisitorVM));
            int i2 = p107o000ooO0.OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, composableLambda, composer2, 100663352, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, i));
    }

    public final void navigate() {
        o00O00.OooO0o0(INSTANCE, null, false, null, 14);
    }
}
