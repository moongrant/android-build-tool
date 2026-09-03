package p523o0o0O0oo;

import android.text.TextUtils;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM;
import java.util.List;
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
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0O00O;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberUserRankComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberUserRankComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberUserRankComp\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,286:1\n72#2,6:287\n78#2:321\n72#2,6:402\n78#2:436\n82#2:484\n82#2:495\n78#3,11:293\n78#3,11:330\n78#3,11:366\n91#3:398\n78#3,11:408\n78#3,11:443\n91#3:477\n91#3:483\n91#3:489\n91#3:494\n456#4,8:304\n464#4,3:318\n456#4,8:341\n464#4,3:355\n456#4,8:377\n464#4,3:391\n467#4,3:395\n456#4,8:419\n464#4,3:433\n456#4,8:454\n464#4,3:468\n467#4,3:474\n467#4,3:480\n467#4,3:486\n467#4,3:491\n4144#5,6:312\n4144#5,6:349\n4144#5,6:385\n4144#5,6:427\n4144#5,6:462\n164#6:322\n154#6:323\n154#6:359\n154#6:400\n154#6:401\n154#6:472\n154#6:473\n154#6:479\n154#6:485\n73#7,6:324\n79#7:358\n73#7,6:437\n79#7:471\n83#7:478\n83#7:490\n66#8,6:360\n72#8:394\n76#8:399\n*S KotlinDebug\n*F\n+ 1 RoomMemberUserRankComp.kt\ncom/yalla/yalla/ui/composable/room/RoomMemberUserRankComp\n*L\n47#1:287,6\n47#1:321\n159#1:402,6\n159#1:436\n159#1:484\n47#1:495\n47#1:293,11\n54#1:330,11\n122#1:366,11\n122#1:398\n159#1:408,11\n160#1:443,11\n160#1:477\n159#1:483\n54#1:489\n47#1:494\n47#1:304,8\n47#1:318,3\n54#1:341,8\n54#1:355,3\n122#1:377,8\n122#1:391,3\n122#1:395,3\n159#1:419,8\n159#1:433,3\n160#1:454,8\n160#1:468,3\n160#1:474,3\n159#1:480,3\n54#1:486,3\n47#1:491,3\n47#1:312,6\n54#1:349,6\n122#1:385,6\n159#1:427,6\n160#1:462,6\n49#1:322\n57#1:323\n122#1:359\n143#1:400\n147#1:401\n170#1:472\n186#1:473\n191#1:479\n207#1:485\n54#1:324,6\n54#1:358\n160#1:437,6\n160#1:471\n160#1:478\n54#1:490\n122#1:360,6\n122#1:394\n122#1:399\n*E\n"})
public final class oO000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO000Oo f53142OooO00o = new oO000Oo();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f53144OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f53145OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53146OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM, boolean z, int i) {
            super(2);
            this.f53145OooO0o0 = liveRoomMemberUserRankVM;
            this.f53144OooO0o = z;
            this.f53146OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53146OooO0oO | 1);
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = this.f53145OooO0o0;
            boolean z = this.f53144OooO0o;
            oO000Oo.this.OooO00o(liveRoomMemberUserRankVM, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f53148OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f53149OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53150OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM, boolean z, int i) {
            super(2);
            this.f53149OooO0o0 = liveRoomMemberUserRankVM;
            this.f53148OooO0o = z;
            this.f53150OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53150OooO0oO | 1);
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = this.f53149OooO0o0;
            boolean z = this.f53148OooO0o;
            oO000Oo.this.OooO00o(liveRoomMemberUserRankVM, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f53152OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f53153OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53154OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, String str, int i) {
            super(2);
            this.f53153OooO0o0 = boxScope;
            this.f53152OooO0o = str;
            this.f53154OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53154OooO0oO | 1);
            BoxScope boxScope = this.f53153OooO0o0;
            String str = this.f53152OooO0o;
            oO000Oo.this.OooO0O0(boxScope, str, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull LiveRoomMemberUserRankVM rankVM, boolean z, @Nullable Composer composer, int i) {
        long jLongValue;
        long j;
        String strOooO00o;
        String strOooOO0o;
        String str;
        String strOooO00o2;
        int i2;
        String headUrl;
        String nickName;
        String str2;
        String str3;
        Boolean isTopRank;
        LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO;
        Intrinsics.checkNotNullParameter(rankVM, "rankVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(1126833799);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1126833799, i, -1, "com.yalla.yalla.ui.composable.room.RoomMemberUserRankComp.CurrentUserShowInRankBottom (RoomMemberUserRankComp.kt:42)");
        }
        LiveRoomMemberUserRankModel.RankDataDTO currentUserData = rankVM.getCurrentUserData(z);
        if (currentUserData == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rankVM, z, i));
            return;
        }
        List<LiveRoomMemberUserRankModel.RankDataDTO> list = rankVM.getCurrentRankList(z).f38497OooO0Oo;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorKt.Color(4293585642L), null, 2, null), composerStartRestartGroup, 6, 0);
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(60));
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Integer currentRankNumber = rankVM.getCurrentRankNumber(z);
        long jLongValue2 = 0;
        if (currentRankNumber != null) {
            Long friendShip = rankVM.getCurrentRankList(z).f38497OooO0Oo.get(currentRankNumber.intValue()).getFriendShip();
            if (friendShip != null) {
                jLongValue = friendShip.longValue();
                j = jLongValue;
            } else {
                j = 0;
            }
        } else {
            Long friendShip2 = currentUserData.getFriendShip();
            if (friendShip2 != null) {
                jLongValue = friendShip2.longValue();
                j = jLongValue;
            } else {
                j = 0;
            }
        }
        long jLongValue3 = 1;
        if (currentUserData.notInRankAndFriendShipIsZero()) {
            composerStartRestartGroup.startReplaceableGroup(-514530131);
            if (list.size() >= 99) {
                Long friendShip3 = list.get(list.size() - 1).getFriendShip();
                jLongValue3 = (friendShip3 != null ? friendShip3.longValue() : 0L) + 1;
            }
            strOooO00o2 = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.live_room_member_rank_distance_to_the_list, composerStartRestartGroup, 0), o0OoOo0.OooOOO0("", Long.valueOf(jLongValue3)));
            composerStartRestartGroup.endReplaceableGroup();
            str = "-";
        } else {
            composerStartRestartGroup.startReplaceableGroup(-514529603);
            if (currentRankNumber != null || list.size() < 99) {
                composerStartRestartGroup.startReplaceableGroup(-514528946);
                if (currentRankNumber != null) {
                    strOooOO0o = o0OoOo0.OooOO0o(list.get(currentRankNumber.intValue()).getRank(), "");
                    if (currentRankNumber.intValue() == 0) {
                        composerStartRestartGroup.startReplaceableGroup(-514528695);
                        if (list.size() == 1) {
                            Long friendShip4 = list.get(0).getFriendShip();
                            if (friendShip4 != null) {
                                jLongValue2 = friendShip4.longValue();
                            }
                        } else {
                            Long friendShip5 = list.get(0).getFriendShip();
                            long jLongValue4 = friendShip5 != null ? friendShip5.longValue() : 0L;
                            Long friendShip6 = list.get(1).getFriendShip();
                            jLongValue2 = jLongValue4 - (friendShip6 != null ? friendShip6.longValue() : 0L);
                        }
                        strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.live_room_member_rank_keep_ahead_of_second, composerStartRestartGroup, 0), o0OoOo0.OooOOO0("", Long.valueOf(jLongValue2)));
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-514528061);
                        Long friendShip7 = list.get(currentRankNumber.intValue() - 1).getFriendShip();
                        strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.live_room_member_rank_distance_to_previous, composerStartRestartGroup, 0), o0OoOo0.OooOOO0("", Long.valueOf((friendShip7 != null ? friendShip7.longValue() : 0L) - j)));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    strOooO00o = null;
                    strOooOO0o = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                String str4 = strOooO00o;
                str = strOooOO0o;
                strOooO00o2 = str4;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-514529494);
                Long friendShip8 = list.get(list.size() - 1).getFriendShip();
                long jLongValue5 = ((friendShip8 != null ? friendShip8.longValue() : 0L) + 1) - j;
                strOooO00o2 = jLongValue5 > 0 ? o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.live_room_member_rank_distance_to_the_list, composerStartRestartGroup, 0), o0OoOo0.OooOOO0("", Long.valueOf(jLongValue5))) : "";
                composerStartRestartGroup.endReplaceableGroup();
                str = "99+";
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        String str5 = strOooO00o2;
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(56));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM530width3ABfNKs);
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
        Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        boolean z2 = false;
        OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (str != null) {
            try {
                i2 = Integer.parseInt(str);
            } catch (Exception unused) {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (1 <= i2 && i2 < 4) {
            z2 = true;
        }
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(1807668332);
            oO000o00.OooO00o(boxScopeInstance, i2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1807668422);
            oO000Oo oo000oo = f53142OooO00o;
            if (str == null) {
                str = "";
            }
            oo000oo.OooO0O0(boxScopeInstance, str, composerStartRestartGroup, 390);
            composerStartRestartGroup.endReplaceableGroup();
        }
        o0ooOOo.OooO00o(composerStartRestartGroup);
        if (currentRankNumber != null) {
            LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO2 = (LiveRoomMemberUserRankModel.RankDataDTO) CollectionsKt.getOrNull(list, currentRankNumber.intValue());
            headUrl = rankDataDTO2 != null ? rankDataDTO2.getHeadUrl() : null;
        } else {
            headUrl = currentUserData.getHeadUrl();
        }
        if (TextUtils.isEmpty(headUrl)) {
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            headUrl = (String) p475o0Ooooo0.o0O00oO0.OooO().getValue();
            if (headUrl == null) {
                headUrl = "";
            }
        }
        oO0OO.OooO00o.f59939OooO00o.OooOO0(headUrl, ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
        if (currentRankNumber == null ? (nickName = currentUserData.getNickName()) == null : !((rankDataDTO = (LiveRoomMemberUserRankModel.RankDataDTO) CollectionsKt.getOrNull(list, currentRankNumber.intValue())) != null && (nickName = rankDataDTO.getNickName()) != null)) {
            nickName = "";
        }
        if (TextUtils.isEmpty(nickName)) {
            p475o0Ooooo0.o0O00oO0 o0o00oo2 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            nickName = (String) p475o0Ooooo0.o0O00oO0.OooOOoo().getValue();
            if (nickName == null) {
                str2 = "";
            } else {
                Intrinsics.checkNotNull(nickName);
                str2 = nickName;
            }
        } else {
            str2 = nickName;
        }
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o5 = OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O3, composerM1320constructorimpl5, currentCompositionLocalMap5);
        if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        long j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        long jOooO0OO = oOO0O00O.OooO0OO(16, composerStartRestartGroup);
        TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
        TextKt.m1261Text4IGK_g(str2, rowScopeInstance.weight(companion, 1.0f, false), j2, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3120, 120816);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        if (currentRankNumber != null) {
            LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO3 = (LiveRoomMemberUserRankModel.RankDataDTO) CollectionsKt.getOrNull(list, currentRankNumber.intValue());
            String badgeUrl = rankDataDTO3 != null ? rankDataDTO3.getBadgeUrl() : null;
            LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO4 = (LiveRoomMemberUserRankModel.RankDataDTO) CollectionsKt.getOrNull(list, currentRankNumber.intValue());
            if (rankDataDTO4 == null || (isTopRank = rankDataDTO4.getIsTopRank()) == null) {
                isTopRank = Boolean.FALSE;
            }
            str3 = badgeUrl;
        } else {
            String badgeUrl2 = currentUserData.getBadgeUrl();
            Boolean isTopRank2 = currentUserData.getIsTopRank();
            if (isTopRank2 == null) {
                isTopRank2 = Boolean.FALSE;
            }
            str3 = badgeUrl2;
            isTopRank = isTopRank2;
        }
        oO000O0O.f53112OooO00o.OooO00o(currentUserData.getMemberLv(), str3, 0L, isTopRank.booleanValue(), SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 221184, 4);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-514524968);
        if (!TextUtils.isEmpty(str5)) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(2), null, composerStartRestartGroup, 6, 2);
            TextKt.m1261Text4IGK_g(str5 == null ? "" : str5, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3729getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120818);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        String strOooO0o0 = o0O0O0Oo.OooO0o0(j);
        long j3 = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        long jOooO0OO2 = oOO0O00O.OooO0OO(16, composerStartRestartGroup);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(26), 0.0f, Dp.m3775constructorimpl(16), 0.0f, 10, null);
        Intrinsics.checkNotNull(strOooO0o0);
        TextKt.m1261Text4IGK_g(strOooO0o0, modifierM482paddingqDBjuR0$default, j3, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
        if (OooOOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO00o(rankVM, z, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@NotNull BoxScope boxScope, @NotNull String text, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-412276141);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412276141, i3, -1, "com.yalla.yalla.ui.composable.room.RoomMemberUserRankComp.RoomMemberUserRankNumberShow (RoomMemberUserRankComp.kt:217)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(text, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, oOO0O00O.OooO0OO(16, composerStartRestartGroup), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 196608, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, text, i));
    }
}
