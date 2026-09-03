package p513o0o0O00o;

import android.app.Activity;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0O0O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154o00OoO00.OooOo00;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o00Oo0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainRoomActionIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomActionIcon.kt\ncom/yalla/yalla/ui/composable/main/MainRoomActionIcon\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,199:1\n81#2,11:200\n154#3,11:211\n154#3:257\n154#3:303\n154#3:304\n154#3:312\n66#4,6:222\n72#4:256\n76#4:302\n78#5,11:228\n78#5,11:264\n91#5:296\n91#5:301\n456#6,8:239\n464#6,3:253\n456#6,8:275\n464#6,3:289\n467#6,3:293\n467#6,3:298\n36#6:305\n36#6:313\n4144#7,6:247\n4144#7,6:283\n72#8,6:258\n78#8:292\n82#8:297\n1097#9,6:306\n1097#9,6:314\n*S KotlinDebug\n*F\n+ 1 MainRoomActionIcon.kt\ncom/yalla/yalla/ui/composable/main/MainRoomActionIcon\n*L\n46#1:200,11\n49#1:211,11\n53#1:257\n155#1:303\n158#1:304\n166#1:312\n47#1:222,6\n47#1:256\n47#1:302\n47#1:228,11\n51#1:264,11\n51#1:296\n47#1:301\n47#1:239,8\n47#1:253,3\n51#1:275,8\n51#1:289,3\n51#1:293,3\n47#1:298,3\n163#1:305\n176#1:313\n47#1:247,6\n51#1:283,6\n51#1:258,6\n51#1:292\n51#1:297\n163#1:306,6\n176#1:314,6\n*E\n"})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO f51522OooO00o = new OooOOO();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51523OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51525OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f51526OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51527OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51528OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, int i, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f51526OooO0o0 = str;
            this.f51525OooO0o = i;
            this.f51527OooO0oO = function0;
            this.f51528OooO0oo = i2;
            this.f51523OooO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOO.this.OooO0OO(this.f51526OooO0o0, this.f51525OooO0o, this.f51527OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51528OooO0oo | 1), this.f51523OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51529OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MainRoomVM mainRoomVM) {
            super(0);
            this.f51529OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomVM mainRoomVM = this.f51529OooO0Oo;
            o0OO000.OooO00o(mainRoomVM.getHaveSignIn() ? "101033" : "101073");
            o0OO000.OooO0O0("101091", MapsKt.mapOf(TuplesKt.to("icon_id", Integer.valueOf(mainRoomVM.getHaveSignIn() ? 2 : 1))));
            mainRoomVM.setDialogShowCheckInTask(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51531OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51532OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51533OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51532OooO0o0 = fragmentActivity;
            this.f51531OooO0o = mainRoomVM;
            this.f51533OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51533OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51532OooO0o0;
            MainRoomVM mainRoomVM = this.f51531OooO0o;
            OooOOO.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51535OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51536OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51536OooO0o0 = fragmentActivity;
            this.f51535OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51535OooO0o | 1);
            OooOOO.this.OooO0O0(this.f51536OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51537OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(1);
            this.f51537OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = this.f51537OooO0Oo;
            it.OooO0Oo(i);
            o00Oo0.OooO0o0(it, i);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51538OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f51538OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f51538OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f51539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51540OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(OfficialActionModel officialActionModel, FragmentActivity fragmentActivity) {
            super(0);
            this.f51539OooO0Oo = officialActionModel;
            this.f51540OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OfficialActionModel officialActionModel = this.f51539OooO0Oo;
            officialActionModel.getType();
            p513o0o0O00o.OooOOOO onLogin = new p513o0o0O00o.OooOOOO(officialActionModel, this.f51540OooO0o0);
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

    /* JADX INFO: renamed from: o0o0O00o.OooOOO$OooOOO, reason: collision with other inner class name */
    public static final class C0494OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f51541OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51542OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0494OooOOO(OfficialActionModel officialActionModel, FragmentActivity fragmentActivity) {
            super(0);
            this.f51541OooO0Oo = officialActionModel;
            this.f51542OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("101050");
            OooOo00 onLogin = new OooOo00(this.f51541OooO0Oo, this.f51542OooO0o0);
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

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51544OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51545OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51546OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51545OooO0o0 = fragmentActivity;
            this.f51544OooO0o = mainRoomVM;
            this.f51546OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51546OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51545OooO0o0;
            MainRoomVM mainRoomVM = this.f51544OooO0o;
            OooOOO.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51548OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51549OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51550OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51549OooO0o0 = fragmentActivity;
            this.f51548OooO0o = mainRoomVM;
            this.f51550OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51550OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51549OooO0o0;
            MainRoomVM mainRoomVM = this.f51548OooO0o;
            OooOOO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(552189298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(552189298, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.CheckInTaskIcon (MainRoomActionIcon.kt:119)");
        }
        String str = "";
        if (mainRoomVM.getCheckInTaskTypeShowIv()) {
            i2 = oOo00OO0.icon_checkin_float;
        } else if (mainRoomVM.getCheckInTaskTypeShowSvga()) {
            i2 = oOo00OO0.icon_checkin_float;
            str = "svga/anim_is_check.svga";
        } else {
            i2 = 0;
        }
        int i3 = i2;
        String str2 = str;
        if (i3 > 0) {
            o0OO000.OooO0O0("401007", MapsKt.mapOf(TuplesKt.to("icon_id", Integer.valueOf(mainRoomVM.getHaveSignIn() ? 2 : 1))));
            OooO0OO(str2, i3, new OooO00o(mainRoomVM), composerStartRestartGroup, (i << 3) & 7168, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(fragmentActivity, mainRoomVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@NotNull FragmentActivity activity, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(1849470561);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1849470561, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.Content (MainRoomActionIcon.kt:44)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MainRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MainRoomVM mainRoomVM = (MainRoomVM) viewModel;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl((float) 17.5d), Dp.m3765constructorimpl(50), 3, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(55)), companion2.getBottomEnd());
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooOOO oooOOO = f51522OooO00o;
        oooOOO.OooO0Oo(activity, mainRoomVM, composerStartRestartGroup, 456);
        oooOOO.OooO0o0(activity, mainRoomVM, composerStartRestartGroup, 456);
        oooOOO.OooO00o(activity, mainRoomVM, composerStartRestartGroup, 456);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(activity, i));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(String str, int i, Function0<Unit> function0, Composer composer, int i2, int i3) {
        String str2;
        int i4;
        Function0<Unit> function1;
        String str3;
        Function0<Unit> function2;
        Modifier.Companion companion;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifierOooO0O0;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(746521991);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 14) == 0) {
            str2 = str;
            i4 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 896) == 0) {
                function1 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i4 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(746521991, i4, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.ItemView (MainRoomActionIcon.kt:151)");
                }
                float fM3765constructorimpl = Dp.m3765constructorimpl(0);
                long jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                companion = Modifier.INSTANCE;
                Modifier modifierBorder = BorderKt.border(ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(55)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOO0(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(12), null, composerStartRestartGroup, 6, 2);
                if (o0000O0O.OooO0oO(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(1313890092);
                    OooOo00.OooO00o(str3, true, 0, null, null, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (o0000O0O.OooO0o0(str3)) {
                    composerStartRestartGroup.startReplaceableGroup(1313890269);
                    Integer numValueOf = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OooO0o(i);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(o00Oo0.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1313890761);
                    if (i > 0) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str3 = str2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function2, i2, i3));
        }
        i4 |= 384;
        function1 = function0;
        if ((i4 & 731) == 146) {
            if (i5 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (i6 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(746521991, i4, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.ItemView (MainRoomActionIcon.kt:151)");
            }
            float fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            long jM1705getTransparent0d7_KjU2 = Color.INSTANCE.m1705getTransparent0d7_KjU();
            companion = Modifier.INSTANCE;
            Modifier modifierBorder2 = BorderKt.border(ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(55)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3765constructorimpl2, new SolidColor(jM1705getTransparent0d7_KjU2, null), null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(12), null, composerStartRestartGroup, 6, 2);
            if (o0000O0O.OooO0oO(str3)) {
                composerStartRestartGroup.startReplaceableGroup(1313890092);
                OooOo00.OooO00o(str3, true, 0, null, null, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 48, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (o0000O0O.OooO0o0(str3)) {
                composerStartRestartGroup.startReplaceableGroup(1313890269);
                Integer numValueOf2 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0o(i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0o(i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(o00Oo0.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1313890761);
                if (i > 0) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i5 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (i6 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(746521991, i4, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.ItemView (MainRoomActionIcon.kt:151)");
            }
            float fM3765constructorimpl3 = Dp.m3765constructorimpl(0);
            long jM1705getTransparent0d7_KjU3 = Color.INSTANCE.m1705getTransparent0d7_KjU();
            companion = Modifier.INSTANCE;
            Modifier modifierBorder3 = BorderKt.border(ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(55)), RoundedCornerShapeKt.getCircleShape()), new BorderStroke(fM3765constructorimpl3, new SolidColor(jM1705getTransparent0d7_KjU3, null), null), RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO0O0 = o0O0O00.OooO0O0(modifierBorder3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(12), null, composerStartRestartGroup, 6, 2);
            if (o0000O0O.OooO0oO(str3)) {
                composerStartRestartGroup.startReplaceableGroup(1313890092);
                OooOo00.OooO00o(str3, true, 0, null, null, companion.then(modifierOooO0O0), composerStartRestartGroup, (i4 & 14) | 48, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (o0000O0O.OooO0o0(str3)) {
                composerStartRestartGroup.startReplaceableGroup(1313890269);
                Integer numValueOf3 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0o(i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0o(i);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(o00Oo0.OooO0OO(str3, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14, 0), (String) null, companion.then(modifierOooO0O0), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1313890761);
                if (i > 0) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i4 >> 3) & 14), (String) null, companion.then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(str3, i, function2, i2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1773194397);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1773194397, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.OfficialActionIcon (MainRoomActionIcon.kt:68)");
        }
        OfficialActionModel officialActionModel = mainRoomVM.getOfficialActionModel();
        if (officialActionModel != null && officialActionModel.getDefaultIsShowButton()) {
            f51522OooO00o.OooO0OO(o0OoOo0.OooOOO(officialActionModel.getEntranceImgUrl(), ""), oOo00OO0.icon_picture_default, new OooOO0O(officialActionModel, fragmentActivity), composerStartRestartGroup, 3072, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(fragmentActivity, mainRoomVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-156869769);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-156869769, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomActionIcon.UserReturnIcon (MainRoomActionIcon.kt:98)");
        }
        OfficialActionModel userReturnModel = mainRoomVM.getUserReturnModel();
        if (userReturnModel != null && userReturnModel.getDefaultIsShowButton()) {
            f51522OooO00o.OooO0OO(o0OoOo0.OooOOO(userReturnModel.getEntranceImgUrl(), ""), oOo00OO0.icon_picture_default, new C0494OooOOO(userReturnModel, fragmentActivity), composerStartRestartGroup, 3072, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(fragmentActivity, mainRoomVM, i));
    }
}
