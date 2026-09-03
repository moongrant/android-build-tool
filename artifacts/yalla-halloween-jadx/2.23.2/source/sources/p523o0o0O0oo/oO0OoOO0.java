package p523o0o0O0oo;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p200o00o0OoO.o00OO00O;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p482o0o000OO.OooOOO;
import p483o0o000Oo.o0000Ooo;
import p484o0o000o0.o00oO0o;
import p516o0o0O00o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberComp\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,185:1\n76#2:186\n66#3,6:187\n72#3:221\n76#3:271\n66#3,6:274\n72#3:308\n76#3:397\n78#4,11:193\n78#4,11:230\n91#4:264\n91#4:270\n78#4,11:280\n78#4,11:313\n78#4,11:350\n91#4:385\n91#4:391\n91#4:396\n456#5,8:204\n464#5,3:218\n456#5,8:241\n464#5,3:255\n467#5,3:261\n467#5,3:267\n456#5,8:291\n464#5,3:305\n456#5,8:324\n464#5,3:338\n456#5,8:361\n464#5,3:375\n467#5,3:382\n467#5,3:388\n467#5,3:393\n4144#6,6:212\n4144#6,6:249\n4144#6,6:299\n4144#6,6:332\n4144#6,6:369\n154#7:222\n154#7:223\n154#7:259\n154#7:260\n154#7:266\n154#7:272\n154#7:273\n154#7:309\n154#7:310\n154#7:342\n154#7:343\n154#7:379\n154#7:380\n154#7:381\n154#7:387\n73#8,6:224\n79#8:258\n83#8:265\n77#8,2:311\n79#8:341\n73#8,6:344\n79#8:378\n83#8:386\n83#8:392\n*S KotlinDebug\n*F\n+ 1 RoomMemberComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberComp\n*L\n52#1:186\n54#1:187,6\n54#1:221\n54#1:271\n116#1:274,6\n116#1:308\n116#1:397\n54#1:193,11\n80#1:230,11\n80#1:264\n54#1:270\n116#1:280,11\n132#1:313,11\n140#1:350,11\n140#1:385\n132#1:391\n116#1:396\n54#1:204,8\n54#1:218,3\n80#1:241,8\n80#1:255,3\n80#1:261,3\n54#1:267,3\n116#1:291,8\n116#1:305,3\n132#1:324,8\n132#1:338,3\n140#1:361,8\n140#1:375,3\n140#1:382,3\n132#1:388,3\n116#1:393,3\n54#1:212,6\n80#1:249,6\n116#1:299,6\n132#1:332,6\n140#1:369,6\n83#1:222\n84#1:223\n92#1:259\n100#1:260\n107#1:266\n119#1:272\n120#1:273\n124#1:309\n125#1:310\n136#1:342\n140#1:343\n144#1:379\n145#1:380\n146#1:381\n152#1:387\n80#1:224,6\n80#1:258\n80#1:265\n132#1:311,2\n132#1:341\n140#1:344,6\n140#1:378\n140#1:386\n132#1:392\n*E\n"})
public final class oO0OoOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0OoOO0 f53184OooO00o = new oO0OoOO0();

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53185OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0OoOO0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53186OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0OoOO0.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53188OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f53189OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, int i) {
            super(2);
            this.f53189OooO0o0 = modifier;
            this.f53188OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53188OooO0o | 1);
            oO0OoOO0.this.OooO00o(this.f53189OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO() {
        o0oo0000.OooO00o.OooO0O0("102019");
        o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
        MutableState<Boolean> mutableState = o0000ooo.f48544OooOoOO;
        Boolean bool = Boolean.FALSE;
        mutableState.setValue(bool);
        o0000ooo.f48528OooOO0O.setValue(bool);
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
        Integer value = oooO0O0OooO00o.f24546OooOO0o.getValue();
        if (value == null) {
            return;
        }
        if (value.intValue() != 0) {
            o00oO0o.OooO0OO(1018, 0, null);
            return;
        }
        Integer value2 = oooO0O0OooO00o.f24552OooOOo0.getValue();
        if (value2 == null) {
            return;
        }
        int iIntValue = value2.intValue();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooO0O0().getValue();
        if (l == null) {
            return;
        }
        if (l.longValue() >= iIntValue) {
            Long value3 = oooO0O0OooO00o.f24539OooO0Oo.getValue();
            if (value3 == null) {
                return;
            }
            OooOOO.OooO0O0(iIntValue, o0OoOo0.OooO00o(), String.valueOf(value3.longValue()), AppEventsConstants.EVENT_PARAM_VALUE_NO);
            return;
        }
        Boolean value4 = oooO0O0OooO00o.f24545OooOO0O.getValue();
        if (value4 != null) {
            bool = value4;
        }
        if (bool.booleanValue()) {
            LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").post(Boolean.TRUE);
        } else {
            o0000ooo.f48536OooOOoo.setValue(Boolean.TRUE);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer composer3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(852968894);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852968894, i2, -1, "com.yalla.yalla.ui.composable.room.RoomMemberComp.JoinMemberButton (RoomMemberComp.kt:114)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 80;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f, SizeKt.m530width3ABfNKs(companion.then(modifier), Dp.m3775constructorimpl(240)), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxKt.Box(o0O0O00.OooO0O0(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(BoxScopeInstance.INSTANCE.align(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(12), 7, null), Dp.m3775constructorimpl(43)), companion2.getBottomCenter()), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48185Ooooo00, null, 2, null), false, false, 0L, false, null, null, null, OooO00o.f53185OooO0Oo, 253), composerStartRestartGroup, 0);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            o00OO00O.OooO00o("svga/anim_member_call.svga", true, 0, null, null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, OooO0O0.f53186OooO0Oo, 253), composerStartRestartGroup, 54, 28);
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
            Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O0, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24552OooOOo0, 0, composerStartRestartGroup, 56);
            Object value = stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            if (((Number) value).intValue() > 0) {
                composerStartRestartGroup.startReplaceableGroup(-1208367527);
                String strOooO00o = OooOOOO.OooO00o(StringResources_androidKt.stringResource(o000000.Join, composerStartRestartGroup, 0), "(");
                long j = o0OOo000.f48135OooO0O0;
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(strOooO00o, (Modifier) null, j, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                float f2 = 4;
                i3 = 6;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                o000O.OooO00o(6, 0, composer2, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)));
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                TextKt.m1261Text4IGK_g(stateObserveAsState.getValue() + ")", (Modifier) null, j, o0000O0.OooO0OO(16, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                composer2.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1208367056);
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Join, composerStartRestartGroup, 0), (Modifier) null, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                composer2.endReplaceableGroup();
                i3 = 6;
            }
            o0ooOOo.OooO00o(composer2);
            composer3 = composer2;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composer3, i3, 2);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(int i, int i2, @Nullable Composer composer, @NotNull Modifier modifier) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1537732157);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1537732157, i3, -1, "com.yalla.yalla.ui.composable.room.RoomMemberComp.RankingLevel (RoomMemberComp.kt:50)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion.then(modifier), false, false, 0L, false, null, null, null, new oO000OOo(lifecycleOwner), 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(537689869);
            if (i > -1) {
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier modifierBackground$default = BackgroundKt.background$default(boxScopeInstance.align(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(21)), companion2.getCenter()), Brush.Companion.m1636horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48261o000OooO), Color.m1671boximpl(o0OOo000.f48260o000Ooo0), Color.m1671boximpl(o0OOo000.f48258o000OoOo)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape$default(0, 50, 50, 0, 9, (Object) null), 0.0f, 4, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(15), null, composerStartRestartGroup, 6, 2);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -929614328, true, new ooOOOOoo(i)), composerStartRestartGroup, 56);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(5), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00OO00O.OooO00o("svga/anim_room_member_rank.svga", true, 0, null, null, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(28)), companion2.getCenterStart()), composerStartRestartGroup, 54, 28);
            if (OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OOo0o(this, i, modifier, i2));
    }
}
