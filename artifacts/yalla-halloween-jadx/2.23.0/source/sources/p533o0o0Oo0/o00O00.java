package p533o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p475o0o000.oo0o0Oo;
import p497o0o00o0.l;
import p497o0o00o0.m;
import p519o0o0O0oO.m3;
import p571o0oOoOO.o0O0o000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMenu\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,96:1\n81#2,11:97\n81#2,11:148\n73#3,6:108\n79#3:142\n83#3:169\n78#4,11:114\n91#4:168\n456#5,8:125\n464#5,3:139\n467#5,3:165\n4144#6,6:133\n154#7:143\n154#7:145\n154#7:146\n154#7:147\n154#7:159\n154#7:160\n154#7:161\n154#7:162\n154#7:163\n154#7:164\n76#8:144\n81#9:170\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMenu\n*L\n39#1:97,11\n62#1:148,11\n45#1:108,6\n45#1:142\n45#1:169\n45#1:114,11\n45#1:168\n45#1:125,8\n45#1:139,3\n45#1:165,3\n45#1:133,6\n46#1:143\n58#1:145\n59#1:146\n61#1:147\n75#1:159\n76#1:160\n79#1:161\n89#1:162\n90#1:163\n92#1:164\n47#1:144\n48#1:170\n*E\n"})
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00 f54737OooO00o = new o00O00();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54739OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f54739OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54739OooO0o0 | 1);
            o00O00.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o000 f54740OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O0o000 o0o0o000) {
            super(0);
            this.f54740OooO0Oo = o0o0o000;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            if (((Boolean) oo0o0oo.f47524OooOo.getValue()).booleanValue() && !this.f54740OooO0Oo.f56247OooO00o.getValue().booleanValue()) {
                oo0o0oo.f47506OooO00o.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f54741OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f54741OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p489o0o00OO0.OooO0OO oooO0OO;
            m mVar;
            Context context = this.f54741OooO0Oo;
            MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
            if (mixedRoomActivity != null && (oooO0OO = mixedRoomActivity.f23452OoooO0) != null && (mVar = oooO0OO.f48478OooO0o0) != null) {
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                Integer value = oooO00o.OooO00o().f25008OooOO0o.getValue();
                boolean z = true;
                boolean z2 = false;
                MixedRoomActivity mixedRoomActivity2 = mVar.f48470OooO00o;
                if (value != null && value.intValue() == 1) {
                    o0OO000.OooO00o("102090");
                    if (oooO00o.OooO00o().f25006OooOO0.getValue() != null) {
                        ProfileLimitModel value2 = oooO00o.OooO00o().f25006OooOO0.getValue();
                        if (value2 != null) {
                            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign), value2.getBlockReason());
                            if (value2.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value2.getExpireTime() <= 0) {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), value2.getBlockReason()), o0000oo.OooO0Oo(value2.getExpireTime(), System.currentTimeMillis()));
                                z2 = true;
                            }
                            o0OO00O o0oo00o2 = new o0OO00O(mixedRoomActivity2);
                            o0oo00o2.OooOo00(strOooO00o);
                            if (!z2) {
                                o0oo00o2.OooOo(true);
                                o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Continue_));
                                o0oo00o2.OooOo0(new l(mVar));
                            }
                            mVar.f49214OooO0O0 = o0oo00o2;
                            o0oo00o2.OooOO0o();
                        }
                    } else {
                        mVar.OooO0OO();
                    }
                } else {
                    o0OO000.OooO00o("102091");
                    o0OO00O o0oo00o3 = new o0OO00O(mixedRoomActivity2);
                    o0oo00o3.OooOoO0(oO00OOo0.Announcement);
                    String value3 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47490OooO0o.getValue();
                    if (value3 != null && !StringsKt.isBlank(value3)) {
                        z = false;
                    }
                    if (z) {
                        value3 = o0000.OooO0OO(oO00OOo0.title_RoomInfoMenu_normalNotice);
                    }
                    o0oo00o3.OooOo00(value3);
                    mVar.f49214OooO0O0 = o0oo00o3;
                    o0oo00o3.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o000 f54742OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O0o000 o0o0o000) {
            super(0);
            this.f54742OooO0Oo = o0o0o000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O00O onLogin = new o00O00O(this.f54742OooO0Oo);
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

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f54743OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f54743OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102269");
            Context context = this.f54743OooO0Oo;
            MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
            if (mixedRoomActivity != null) {
                mixedRoomActivity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Modifier.Companion companion;
        int i2;
        Modifier modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1745388725);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1745388725, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopMenu.Content (LiveRoomScreenTopMenu.kt:37)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0O0o000.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0o000 o0o0o000 = (o0O0o000) viewModel;
            m3.OooO00o(o0o0o000, new OooO00o(o0o0o000), composerStartRestartGroup, 8, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25005OooO0oo, null, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(984178290);
            if (((RoomLoginInformation) stateObserveAsState.getValue()) != null) {
                float f2 = 24;
                companion = companion2;
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.room_ic_top_announcement, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion2, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0O0(context), 255), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(3), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel2 = ViewModelKt.viewModel(LiveRoomVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_room_top_share, composerStartRestartGroup, 0);
                Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0OO(o0o0o000), 255), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(f2));
                modifier = null;
                ImageKt.Image(painterPainterResource, (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                i2 = 3;
            } else {
                companion = companion2;
                i2 = 3;
                modifier = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(i2), modifier, composerStartRestartGroup, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_room_close, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0o(context), 255), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(6), modifier, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }
}
