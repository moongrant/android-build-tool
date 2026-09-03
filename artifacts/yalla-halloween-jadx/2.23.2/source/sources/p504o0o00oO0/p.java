package p504o0o00oO0;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0OO;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.OooO0o;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p412o0Oo0o0O.o000O000;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p574o0oOoOO0.oOo0o0oO;
import p574o0oOoOO0.ooOOO0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomEnterCenterContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterCenterContent.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterCenterContentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,138:1\n73#2,6:139\n79#2:173\n83#2:185\n78#3,11:145\n91#3:184\n456#4,8:156\n464#4,3:170\n467#4,3:181\n4144#5,6:164\n154#6:174\n154#6:175\n154#6:176\n154#6:177\n154#6:178\n154#6:179\n154#6:180\n154#6:186\n154#6:187\n*S KotlinDebug\n*F\n+ 1 RoomEnterCenterContent.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterCenterContentKt\n*L\n38#1:139,6\n38#1:173\n38#1:185\n38#1:145,11\n38#1:184\n38#1:156,8\n38#1:170,3\n38#1:181,3\n38#1:164,6\n52#1:174\n67#1:175\n68#1:176\n75#1:177\n85#1:178\n92#1:179\n98#1:180\n31#1:186\n33#1:187\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f50183OooO00o;

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50184OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50185OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f50186OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomUserInfoModel roomUserInfoModel, Modifier modifier, int i) {
            super(2);
            this.f50184OooO0Oo = roomUserInfoModel;
            this.f50186OooO0o0 = modifier;
            this.f50185OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50185OooO0o | 1);
            p.OooO00o(this.f50184OooO0Oo, this.f50186OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        Dp.m3775constructorimpl(14);
        f50183OooO00o = Dp.m3775constructorimpl(2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull RoomUserInfoModel userModel, @NotNull Modifier modifier, @Nullable Composer composer, int i) {
        Composer composer2;
        String textColor;
        Color colorOooO00o;
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(117973351);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(117973351, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterCenterContent (RoomEnterCenterContent.kt:35)");
        }
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion.then(modifier), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1222581388);
        if (((Boolean) SnapshotStateKt.collectAsState(userModel.getBadgeState(), null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            oOo0o0oO.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f50183OooO00o, 0.0f, 11, null), (Integer) SnapshotStateKt.collectAsState(userModel.getMemberLevel(), null, composerStartRestartGroup, 8, 1).getValue(), (String) SnapshotStateKt.collectAsState(userModel.getBadgeUrl(), null, composerStartRestartGroup, 8, 1).getValue(), ((Boolean) SnapshotStateKt.collectAsState(userModel.isTopRank(), null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), 9.0f, Dp.m3775constructorimpl(16), composerStartRestartGroup, 221190, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f = f50183OooO00o;
        ooOOO0Oo.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), ((Number) SnapshotStateKt.collectAsState(userModel.getRankWeek(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue(), ((Number) SnapshotStateKt.collectAsState(userModel.getRankDay(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue(), false, composerStartRestartGroup, 6, 8);
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        float f2 = 15;
        oooO00o.OooOo(((Number) SnapshotStateKt.collectAsState(userModel.getWealthLevel(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue(), (String) SnapshotStateKt.collectAsState(userModel.getWealthBadgeWithBg(), r12, composerStartRestartGroup, 8, 1).getValue(), SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), Dp.m3775constructorimpl(f2)), Dp.m3775constructorimpl(31)), o0000O0.OooO0OO(8, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null);
        float fM3775constructorimpl = Dp.m3775constructorimpl(f2);
        int iIntValue = ((Number) SnapshotStateKt.collectAsState(userModel.getVipLevel(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue();
        composerStartRestartGroup.startReplaceableGroup(-1222580239);
        boolean z = ((Number) SnapshotStateKt.collectAsState(userModel.getVipState(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue() == VipState.Vip.getValue() && ((Boolean) SnapshotStateKt.collectAsState(userModel.getShowVIP(), 0, composerStartRestartGroup, 8, 1).getValue()).booleanValue();
        composerStartRestartGroup.endReplaceableGroup();
        oO0OO.OooO00o.OooOo0(null, Integer.valueOf(iIntValue), Boolean.valueOf(z), fM3775constructorimpl, modifierM482paddingqDBjuR0$default, composerStartRestartGroup, 289792, 1);
        oO0OO.OooO00o.OooOOo(Boolean.valueOf(((Boolean) SnapshotStateKt.collectAsState(userModel.isPremium(), r12, composerStartRestartGroup, 8, 1).getValue()).booleanValue()), Integer.valueOf(((Number) SnapshotStateKt.collectAsState(userModel.getPremiumLevel(), r12, composerStartRestartGroup, 8, 1).getValue()).intValue()), false, Dp.m3775constructorimpl(f2), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), composerStartRestartGroup, 289792, 4);
        oooO00o.OooOo00((Integer) SnapshotStateKt.collectAsState(userModel.getIdLevel(), r12, composerStartRestartGroup, 8, 1).getValue(), SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 560, 0);
        oooO00o.OooOOO((String) SnapshotStateKt.collectAsState(userModel.getMedal(), r12, composerStartRestartGroup, 8, 1).getValue(), null, Dp.m3775constructorimpl(f2), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11, null), composerStartRestartGroup, 36224, 2);
        RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo = (RoomUserInfoDTO.InRoomEffectsInfo) SnapshotStateKt.collectAsState(userModel.getInRoomEffectsInfoEntity(), r12, composerStartRestartGroup, 8, 1).getValue();
        long jM1691unboximpl = (inRoomEffectsInfo == null || (textColor = inRoomEffectsInfo.getTextColor()) == null || (colorOooO00o = OooO0o.OooO00o(textColor)) == null) ? o0OOo000.f48135OooO0O0 : colorOooO00o.m1691unboximpl();
        if (((Boolean) SnapshotStateKt.collectAsState(userModel.isUnLoginUser(), r12, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-1222579234);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.tourists_enter_room_tip, composerStartRestartGroup, 0), rowScopeInstance.weight(companion, 1.0f, false), jM1691unboximpl, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 3120, 55280);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1222578806);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o000O000.OooO0O0(((Number) SnapshotStateKt.collectAsState(userModel.getUserId(), r12, composerStartRestartGroup, 8, 1).getValue()).longValue(), (String) SnapshotStateKt.collectAsState(userModel.getUserName(), r12, composerStartRestartGroup, 8, 1).getValue()), rowScopeInstance.weight(companion, 1.0f, false), jM1691unboximpl, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 3120, 55280);
            TextKt.m1261Text4IGK_g(o00O00OO.OooO00o(ZegoConstants.ZegoVideoDataAuxPublishingStream, StringResources_androidKt.stringResource(o000000.novip_welcome, composer2, 0)), (Modifier) null, jM1691unboximpl, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 0, 65522);
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(userModel, modifier, i));
    }
}
