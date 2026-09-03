package p541o0o0OoOO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0O;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p523o0o0O0oo.oO000O0O;
import p541o0o0OoOO.oOOOOo0O;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopSofaList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopSofaList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopSofaList\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,156:1\n72#2,7:157\n79#2:192\n83#2:239\n78#3,11:164\n78#3,11:199\n91#3:232\n91#3:238\n78#3,11:247\n91#3:286\n456#4,8:175\n464#4,3:189\n456#4,8:210\n464#4,3:224\n467#4,3:229\n467#4,3:235\n456#4,8:258\n464#4,3:272\n467#4,3:283\n4144#5,6:183\n4144#5,6:218\n4144#5,6:266\n76#6:193\n88#7:194\n154#8:195\n154#8:196\n154#8:228\n154#8:234\n154#8:240\n154#8:276\n154#8:277\n154#8:278\n154#8:279\n154#8:280\n154#8:281\n154#8:282\n154#8:288\n76#9,2:197\n78#9:227\n82#9:233\n66#10,6:241\n72#10:275\n76#10:287\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopSofaList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopSofaList\n*L\n56#1:157,7\n56#1:192\n56#1:239\n56#1:164,11\n68#1:199,11\n68#1:232\n56#1:238\n99#1:247,11\n99#1:286\n56#1:175,8\n56#1:189,3\n68#1:210,8\n68#1:224,3\n68#1:229,3\n56#1:235,3\n99#1:258,8\n99#1:272,3\n99#1:283,3\n56#1:183,6\n68#1:218,6\n99#1:266,6\n58#1:193\n59#1:194\n67#1:195\n72#1:196\n83#1:228\n92#1:234\n100#1:240\n110#1:276\n113#1:277\n122#1:278\n123#1:279\n131#1:280\n140#1:281\n149#1:282\n52#1:288\n68#1:197,2\n68#1:227\n68#1:233\n99#1:241,6\n99#1:275\n99#1:287\n*E\n"})
public final class oOOOOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOOOOo0O f55278OooO00o = new oOOOOo0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f55279OooO0O0 = Dp.m3775constructorimpl(42);

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopSofaList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopSofaList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopSofaList$Content$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,156:1\n171#2,12:157\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopSofaList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopSofaList$Content$1$1\n*L\n60#1:157,12\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55280OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            final SnapshotStateList<Long> snapshotStateList = com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO;
            int size = snapshotStateList.size();
            final oOOOoo00 oooooo00 = oOOOoo00.f55284OooO0Oo;
            LazyRow.items(size, oooooo00 != null ? new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopSofaList$Content$1$1$invoke$$inlined$itemsIndexed$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    int iIntValue = num.intValue();
                    return oooooo00.invoke(Integer.valueOf(iIntValue), snapshotStateList.get(iIntValue));
                }
            } : null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopSofaList$Content$1$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    snapshotStateList.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopSofaList$Content$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                        }
                        int i2 = (i & 112) | (i & 14);
                        oOOOOo0O.OooO0O0(oOOOOo0O.f55278OooO00o, ((Number) snapshotStateList.get(iIntValue)).longValue(), iIntValue, composer2, ((i2 >> 6) & 14) | 384 | (i2 & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55281OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48493OooO00o.setValue(Boolean.TRUE);
            o0oo0000.OooO00o.OooO0O0("102085");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55283OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f55283OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55283OooO0o0 | 1);
            oOOOOo0O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: com.yalla.yalla.model.room.RoomUserInfoModel
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: com.yalla.yalla.model.room.RoomUserInfoModel
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 com.yalla.yalla.model.room.RoomUserInfoModel, new type: com.yalla.yalla.model.room.RoomUserInfoModel
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void OooO0O0(oOOOOo0O oooooo0o, long j, int i, Composer composer, int i2) {
        int i3;
        BoxScopeInstance boxScopeInstance;
        oooooo0o.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(166864323);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(oooooo0o) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 651) == 130 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(166864323, i3, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopSofaList.SofaItem (LiveRoomScreenTopSofaList.kt:96)");
            }
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(j));
            if (roomUserInfoModelOooO0o0 == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new oOo0o00(oooooo0o, j, i, i2));
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 30;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m527sizeVpY3zN4(companion, f55279OooO0O0, Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, new oOOo0000(roomUserInfoModelOooO0o0), 253);
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(o000OO.OooO0O0((String) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getUserHeader(), null, composerStartRestartGroup, 8, 1).getValue(), null, composerStartRestartGroup, 0, 1), (String) null, BorderKt.m182borderxT4_qwU(boxScopeInstance2.align(ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.getCircleShape()), companion2.getCenter()), Dp.m3775constructorimpl(1), o0OOo000.f48156OooOo0o, RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.startReplaceableGroup(206947080);
            if (((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getSilenced(), null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                boxScopeInstance = boxScopeInstance2;
                IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.ic_room_banned, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getTopEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(6), 0.0f, 11, null), Dp.m3775constructorimpl(14)), o0OOo000.f48362o0OoOo0, composerStartRestartGroup, 56, 0);
            } else {
                boxScopeInstance = boxScopeInstance2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            oO000O0O oo000o0o = oO000O0O.f53112OooO00o;
            int iIntValue = ((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankWeek(), null, composerStartRestartGroup, r13, 1).getValue()).intValue();
            int iIntValue2 = ((Number) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getRankDay(), null, composerStartRestartGroup, r13, 1).getValue()).intValue();
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            oo000o0o.OooO0OO(iIntValue, iIntValue2, PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance3.align(companion, companion2.getBottomStart()), Dp.m3775constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 3072, 0);
            if (roomUserInfoModelOooO0o0.needShowPremiumJustForCompose(composerStartRestartGroup, r13)) {
                composerStartRestartGroup.startReplaceableGroup(206947964);
                oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
                oO0OO.OooO00o.OooOOoo(((Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.isPremium(), null, composerStartRestartGroup, r13, 1).getValue()).booleanValue(), PremiumLevel.INSTANCE.of((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getPremiumLevel(), null, composerStartRestartGroup, 8, 1).getValue()), false, 0.0f, SizeKt.m525size3ABfNKs(boxScopeInstance3.align(companion, companion2.getBottomEnd()), Dp.m3775constructorimpl(16)), composerStartRestartGroup, 262144, 12);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(206948365);
                oO0OO.OooO00o oooO00o2 = oO0OO.OooO00o.f59939OooO00o;
                oO0OO.OooO00o.OooOo0((Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipState(), null, composerStartRestartGroup, r13, 1).getValue(), (Integer) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getVipLevel(), null, composerStartRestartGroup, r13, 1).getValue(), (Boolean) SnapshotStateKt.collectAsState(roomUserInfoModelOooO0o0.getShowVIP(), null, composerStartRestartGroup, r13, 1).getValue(), 0.0f, SizeKt.m525size3ABfNKs(boxScopeInstance3.align(companion, companion2.getBottomEnd()), Dp.m3775constructorimpl(16)), composerStartRestartGroup, 262144, 8);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new oOOo0O00(oooooo0o, j, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1525026827);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525026827, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopSofaList.Content (LiveRoomScreenTopSofaList.kt:54)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(companion2, start, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            LazyDslKt.LazyRow(SizeKt.m532widthInVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(f55279OooO0O0 * 4.5f), 1, null), lazyListStateRememberLazyListState, null, false, null, null, null, false, OooO00o.f55280OooO0Oo, composerStartRestartGroup, 100663302, 252);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m170backgroundbw27NRU(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(30)), o0OOo000.f48136OooO0OO, RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, OooO0O0.f55281OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icon_room_online_num_f, composerStartRestartGroup, 0);
            long j = o0OOo000.f48135OooO0O0;
            IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(12)), j, composerStartRestartGroup, 440, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(String.valueOf(((Number) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48494OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).intValue()), (Modifier) null, j, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
            o0ooOOo.OooO00o(composer2);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
    }
}
