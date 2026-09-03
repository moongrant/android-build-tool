package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.OooOO0O;
import androidx.compose.material.TextFieldImplKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import com.code.android.util.o0000;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p207o00o0oO0.o0000O0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nShareThirdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/ShareThirdDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,139:1\n76#2:140\n154#3:141\n154#3:177\n154#3:178\n72#4,6:142\n78#4:176\n82#4:183\n78#5,11:148\n91#5:182\n456#6,8:159\n464#6,3:173\n467#6,3:179\n4144#7,6:167\n*S KotlinDebug\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/ShareThirdDialogKt\n*L\n34#1:140\n126#1:141\n133#1:177\n135#1:178\n124#1:142,6\n124#1:176\n124#1:183\n124#1:148,11\n124#1:182\n124#1:159,8\n124#1:173,3\n124#1:179,3\n124#1:167,6\n*E\n"})
public final class m3 {

    @SourceDebugExtension({"SMAP\nShareThirdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/ShareThirdDialogKt$ShareThirdDialog$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,139:1\n154#2:140\n154#2:141\n154#2:142\n154#2:178\n154#2:179\n154#2:220\n72#3,6:143\n78#3:177\n82#3:225\n78#4,11:149\n78#4,11:186\n91#4:218\n91#4:224\n456#5,8:160\n464#5,3:174\n456#5,8:197\n464#5,3:211\n467#5,3:215\n467#5,3:221\n4144#6,6:168\n4144#6,6:205\n73#7,6:180\n79#7:214\n83#7:219\n*S KotlinDebug\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/ShareThirdDialogKt$ShareThirdDialog$1\n*L\n44#1:140\n47#1:141\n49#1:142\n52#1:178\n59#1:179\n98#1:220\n41#1:143,6\n41#1:177\n41#1:225\n41#1:149,11\n60#1:186,11\n60#1:218\n41#1:224\n41#1:160,8\n41#1:174,3\n60#1:197,8\n60#1:211,3\n60#1:215,3\n41#1:221,3\n41#1:168,6\n60#1:205,6\n60#1:180,6\n60#1:214\n60#1:219\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f58386OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BaseFragmentActivity f58387OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO000 o0oo000, BaseFragmentActivity baseFragmentActivity) {
            super(2);
            this.f58386OooO0Oo = o0oo000;
            this.f58387OooO0o0 = baseFragmentActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1597868448, iIntValue, -1, "com.yalla.yalla.ui.dialog.ShareThirdDialog.<anonymous> (ShareThirdDialog.kt:40)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 16;
                Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null));
                o0OO000 o0oo000 = this.f58386OooO0Oo;
                Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(BackgroundKt.m171backgroundbw27NRU$default(modifierClip, o0oo000.OooO0O0() ? o0OOo000.f48240o000O0o0 : o0OOo000.f48135OooO0O0, null, 2, null), Dp.m3775constructorimpl(1), o0oo000.OooO0O0() ? o0OOo000.f48237o000O0O0 : o0OOo000.f48135OooO0O0, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null));
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM182borderxT4_qwU);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f2 = 24;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                String strOooO0OO = o0000.OooO0OO(o000000.Share_to);
                long sp = TextUnitKt.getSp(17);
                composer2.startReplaceableGroup(1275700810);
                long j = o0oo000.OooO0O0() ? o0OOo000.f48135OooO0O0 : o0000oo.OooO0OO(composer2).f38616OooO;
                composer2.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(strOooO0OO, columnScopeInstance.align(companion, companion2.getCenterHorizontally()), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer2, 6, 2);
                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(companion, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierHorizontalScroll$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-710030596);
                boolean zBooleanValue = ((Boolean) o0oo000.f56517OooO0Oo.getValue()).booleanValue();
                BaseFragmentActivity baseFragmentActivity = this.f58387OooO0o0;
                if (zBooleanValue) {
                    m3.OooO0O0(ShareChannel.Friends, o0oo000.OooO0O0(), new g3(o0oo000, baseFragmentActivity), composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(-710030196);
                if (((Boolean) o0oo000.f56519OooO0o0.getValue()).booleanValue()) {
                    m3.OooO0O0(ShareChannel.Moments, o0oo000.OooO0O0(), new h3(o0oo000, baseFragmentActivity), composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1275701883);
                if (((Boolean) o0oo000.f56518OooO0o.getValue()).booleanValue()) {
                    m3.OooO0O0(ShareChannel.Facebook, o0oo000.OooO0O0(), new i3(o0oo000, baseFragmentActivity), composer2, 6);
                    m3.OooO0O0(ShareChannel.Twitter, o0oo000.OooO0O0(), new j3(o0oo000, baseFragmentActivity), composer2, 6);
                    m3.OooO0O0(ShareChannel.Instagram, o0oo000.OooO0O0(), new k3(o0oo000, baseFragmentActivity), composer2, 6);
                    m3.OooO0O0(ShareChannel.WhatsApp, o0oo000.OooO0O0(), new l3(o0oo000, baseFragmentActivity), composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f58388OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f58389OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f58390OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f58391OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO000 o0oo000, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f58388OooO0Oo = o0oo000;
            this.f58390OooO0o0 = function0;
            this.f58389OooO0o = i;
            this.f58391OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58389OooO0o | 1);
            m3.OooO00o(this.f58388OooO0Oo, this.f58390OooO0o0, composer, iUpdateChangedFlags, this.f58391OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            try {
                iArr[ShareChannel.Friends.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareChannel.Moments.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareChannel.Facebook.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareChannel.Twitter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareChannel.Instagram.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o0OO000 vm, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1837942866);
        Function0<Unit> function1 = (i2 & 2) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1837942866, i, -1, "com.yalla.yalla.ui.dialog.ShareThirdDialog (ShareThirdDialog.kt:32)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        Function0<Unit> function2 = function1;
        o0000O0.OooO00o(vm.f56514OooO00o, false, false, function1, null, 80, o000000O.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1597868448, true, new OooO00o(vm, (BaseFragmentActivity) objConsume)), composerStartRestartGroup, ((i << 6) & 7168) | 100859904, TextFieldImplKt.AnimationDuration);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(vm, function2, i, i2));
    }

    public static final void OooO0O0(ShareChannel shareChannel, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        e3 e3Var;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-440854259);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(shareChannel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-440854259, i2, -1, "com.yalla.yalla.ui.dialog.ShareItem (ShareThirdDialog.kt:107)");
            }
            switch (OooO0OO.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                case 1:
                    e3Var = new e3(o0Oo0oo.icon_share_friends, o0000.OooO0OO(o000000.Friends));
                    break;
                case 2:
                    e3Var = new e3(o0Oo0oo.icon_share_moment, o0000.OooO0OO(o000000.moments));
                    break;
                case 3:
                    e3Var = new e3(o0Oo0oo.facebook, o0000.OooO0OO(o000000.single_third_facebook));
                    break;
                case 4:
                    e3Var = new e3(o0Oo0oo.icon_share_twitter, o0000.OooO0OO(o000000.single_third_twitter));
                    break;
                case 5:
                    e3Var = new e3(o0Oo0oo.icon_share_instagram, o0000.OooO0OO(o000000.single_third_instagram));
                    break;
                case 6:
                    e3Var = new e3(o0Oo0oo.icon_share_whatapp, o0000.OooO0OO(o000000.single_third_whatsApp));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            e3 e3Var2 = e3Var;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(80)), false, false, 0L, false, null, null, null, function0, 253);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(e3Var2.f58199OooO00o, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(10), null, composerStartRestartGroup, 6, 2);
            String str = e3Var2.f58200OooO0O0;
            long sp = TextUnitKt.getSp(13);
            composerStartRestartGroup.startReplaceableGroup(-669215193);
            long j = z ? o0OOo000.f48147OooOOOO : o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f3(shareChannel, z, function0, i));
    }
}
