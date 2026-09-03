package p541o0o0OoOO;

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
import p205o00o0o0o.o000O;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000Ooo;
import p503o0o00oO.OooOOOO;
import p503o0o00oO.OooOo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0OO000;
import p606o0oo0O0o.o0O0O0o0;
import p650o0ooo.m3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMenu\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,96:1\n81#2,11:97\n81#2,11:148\n73#3,6:108\n79#3:142\n83#3:169\n78#4,11:114\n91#4:168\n456#5,8:125\n464#5,3:139\n467#5,3:165\n4144#6,6:133\n154#7:143\n154#7:145\n154#7:146\n154#7:147\n154#7:159\n154#7:160\n154#7:161\n154#7:162\n154#7:163\n154#7:164\n76#8:144\n81#9:170\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopMenu.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopMenu\n*L\n39#1:97,11\n62#1:148,11\n45#1:108,6\n45#1:142\n45#1:169\n45#1:114,11\n45#1:168\n45#1:125,8\n45#1:139,3\n45#1:165,3\n45#1:133,6\n46#1:143\n58#1:145\n59#1:146\n61#1:147\n75#1:159\n76#1:160\n79#1:161\n89#1:162\n90#1:163\n92#1:164\n47#1:144\n48#1:170\n*E\n"})
public final class oOO0OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0OO0O f55241OooO00o = new oOO0OO0O();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55243OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f55243OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55243OooO0o0 | 1);
            oOO0OO0O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f55244OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO000 o0oo000) {
            super(0);
            this.f55244OooO0Oo = o0oo000;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
            if (((Boolean) o0000ooo.f48537OooOo.getValue()).booleanValue() && !this.f55244OooO0Oo.f56514OooO00o.getValue().booleanValue()) {
                o0000ooo.f48519OooO00o.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55245OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f55245OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p495o0o00Oo.OooO oooO;
            OooOo00 oooOo00;
            Context context = this.f55245OooO0Oo;
            MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
            if (mixedRoomActivity != null && (oooO = mixedRoomActivity.f22983OoooO0) != null && (oooOo00 = oooO.f49620OooO0o0) != null) {
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
                Integer value = oooO00o.OooO00o().f24546OooOO0o.getValue();
                boolean z = true;
                boolean z2 = false;
                MixedRoomActivity mixedRoomActivity2 = oooOo00.f49626OooO00o;
                if (value != null && value.intValue() == 1) {
                    o0oo0000.OooO00o.OooO0O0("102090");
                    if (oooO00o.OooO00o().f24544OooOO0.getValue() != null) {
                        ProfileLimitModel value2 = oooO00o.OooO00o().f24544OooOO0.getValue();
                        if (value2 != null) {
                            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.RoomInfoEdit_ChangeLimit_HintContent_Sign), value2.getBlockReason());
                            if (value2.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value2.getExpireTime() <= 0) {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), value2.getBlockReason()), o0O0O0o0.OooO0Oo(value2.getExpireTime(), System.currentTimeMillis()));
                                z2 = true;
                            }
                            o000O o000o = new o000O(mixedRoomActivity2);
                            o000o.OooOo00(strOooO00o);
                            if (!z2) {
                                o000o.OooOo(true);
                                o000o.OooOOOo(o0000.OooO0OO(o000000.Continue_));
                                o000o.OooOo0(new OooOOOO(oooOo00));
                            }
                            oooOo00.f50181OooO0O0 = o000o;
                            o000o.OooOO0o();
                        }
                    } else {
                        oooOo00.OooO0OO();
                    }
                } else {
                    o0oo0000.OooO00o.OooO0O0("102091");
                    o000O o000o2 = new o000O(mixedRoomActivity2);
                    o000o2.OooOoO0(o000000.Announcement);
                    String value3 = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48463OooO0o.getValue();
                    if (value3 != null && !StringsKt.isBlank(value3)) {
                        z = false;
                    }
                    if (z) {
                        value3 = o0000.OooO0OO(o000000.title_RoomInfoMenu_normalNotice);
                    }
                    o000o2.OooOo00(value3);
                    oooOo00.f50181OooO0O0 = o000o2;
                    o000o2.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f55246OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OO000 o0oo000) {
            super(0);
            this.f55246OooO0Oo = o0oo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOO0OO onLogin = new oOO0OO(this.f55246OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55247OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f55247OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102269");
            Context context = this.f55247OooO0Oo;
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
            ViewModel viewModel = ViewModelKt.viewModel(o0OO000.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0OO000 o0oo000 = (o0OO000) viewModel;
            m3.OooO00o(o0oo000, new OooO00o(o0oo000), composerStartRestartGroup, 8, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24543OooO0oo, null, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(984178290);
            if (((RoomLoginInformation) stateObserveAsState.getValue()) != null) {
                float f2 = 24;
                companion = companion2;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.room_ic_top_announcement, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion2, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0O0(context), 255), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(3), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel2 = ViewModelKt.viewModel(LiveRoomVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icon_room_top_share, composerStartRestartGroup, 0);
                Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0OO(o0oo000), 255), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(f2));
                modifier = null;
                ImageKt.Image(painterPainterResource, (String) null, modifierM525size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                i2 = 3;
            } else {
                companion = companion2;
                i2 = 3;
                modifier = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(i2), modifier, composerStartRestartGroup, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_room_close, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, new OooO0o(context), 255), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), modifier, composerStartRestartGroup, 6, 2);
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
