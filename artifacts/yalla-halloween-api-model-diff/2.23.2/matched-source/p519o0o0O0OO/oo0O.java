package p519o0o0O0OO;

import android.app.Activity;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOO0O;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendState;
import com.yalla.yalla.util.sendPostTask.MomentSendService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentHeadSendingComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentHeadSendingComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentHeadSendingCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,154:1\n76#2:155\n76#2:156\n25#3:157\n25#3:164\n25#3:171\n456#3,8:196\n464#3,3:210\n467#3,3:215\n1097#4,6:158\n1097#4,6:165\n1097#4,6:172\n154#5:178\n154#5:214\n73#6,6:179\n79#6:213\n83#6:219\n78#7,11:185\n91#7:218\n4144#8,6:204\n81#9:220\n107#9,2:221\n81#9:223\n107#9,2:224\n81#9:226\n107#9,2:227\n*S KotlinDebug\n*F\n+ 1 MomentHeadSendingComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentHeadSendingCompKt\n*L\n39#1:155\n43#1:156\n45#1:157\n46#1:164\n47#1:171\n84#1:196,8\n84#1:210,3\n84#1:215,3\n45#1:158,6\n46#1:165,6\n47#1:172,6\n87#1:178\n95#1:214\n84#1:179,6\n84#1:213\n84#1:219\n84#1:185,11\n84#1:218\n84#1:204,6\n45#1:220\n45#1:221,2\n46#1:223\n46#1:224,2\n47#1:226\n47#1:227,2\n*E\n"})
public final class oo0O {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52724OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f52723OooO0Oo = momentDetailModel;
            this.f52724OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52724OooO0o0 | 1);
            oo0O.OooO00o(this.f52723OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52725OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f52726OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Activity activity, MomentDetailModel momentDetailModel) {
            super(0);
            this.f52725OooO0Oo = momentDetailModel;
            this.f52726OooO0o0 = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentSendModel sendPostModel = this.f52725OooO0Oo.getSendPostModel();
            Intrinsics.checkNotNull(sendPostModel);
            Activity activity = this.f52726OooO0o0;
            Intrinsics.checkNotNull(activity);
            MomentSendState sendPostState = sendPostModel.getSendPostState();
            MomentSendState momentSendState = MomentSendState.Sending;
            if (sendPostState != momentSendState) {
                sendPostModel.setSendPostState(momentSendState);
                int i = MomentSendService.f32346OooO0oo;
                MomentSendService.OooO00o.OooO00o(activity, sendPostModel, false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52727OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52728OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f52727OooO0Oo = momentDetailModel;
            this.f52728OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52728OooO0o0 | 1);
            oo0O.OooO00o(this.f52727OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentSendState.values().length];
            try {
                iArr[MomentSendState.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentSendState.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentSendState.FailedSendFrequently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MomentSendState.FailedContent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MomentSendState.FailedImage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MomentDetailModel data, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1281051125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1281051125, i, -1, "com.yalla.yalla.ui.composable.moment.MomentPosting (MomentHeadSendingComp.kt:37)");
        }
        if (!((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52729OooO)).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(data, i));
            return;
        }
        Activity activity = (Activity) composerStartRestartGroup.consume(oo0OOoo.f52735OooO0o0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue3;
        MomentSendModel sendPostModel = data.getSendPostModel();
        Intrinsics.checkNotNull(sendPostModel);
        MomentSendState sendPostState = sendPostModel.getSendPostState();
        int i2 = sendPostState != null ? OooO0o.$EnumSwitchMapping$0[sendPostState.ordinal()] : -1;
        if (i2 == 1) {
            composerStartRestartGroup.startReplaceableGroup(-501262804);
            composerStartRestartGroup.endReplaceableGroup();
            Boolean bool = Boolean.FALSE;
            mutableState.setValue(bool);
            mutableState2.setValue(o0O0O0o0.OooO0Oo(System.currentTimeMillis(), System.currentTimeMillis()) + " • ");
            mutableState3.setValue(bool);
        } else if (i2 == 2) {
            composerStartRestartGroup.startReplaceableGroup(-501262545);
            Boolean bool2 = Boolean.FALSE;
            mutableState.setValue(bool2);
            mutableState2.setValue(StringResources_androidKt.stringResource(o000000.Posting, composerStartRestartGroup, 0));
            mutableState3.setValue(bool2);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i2 == 3) {
            composerStartRestartGroup.startReplaceableGroup(-501262361);
            Boolean bool3 = Boolean.TRUE;
            mutableState.setValue(bool3);
            mutableState2.setValue(StringResources_androidKt.stringResource(o000000.You_are_posting_too_much, composerStartRestartGroup, 0));
            mutableState3.setValue(bool3);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i2 == 4) {
            composerStartRestartGroup.startReplaceableGroup(-501262153);
            Boolean bool4 = Boolean.TRUE;
            mutableState.setValue(bool4);
            mutableState2.setValue(StringResources_androidKt.stringResource(o000000.Network_connection_lost, composerStartRestartGroup, 0));
            mutableState3.setValue(bool4);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (i2 != 5) {
            composerStartRestartGroup.startReplaceableGroup(-501261763);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-501261947);
            Boolean bool5 = Boolean.TRUE;
            mutableState.setValue(bool5);
            mutableState2.setValue(StringResources_androidKt.stringResource(o000000.Network_connection_lost, composerStartRestartGroup, 0));
            mutableState3.setValue(bool5);
            composerStartRestartGroup.endReplaceableGroup();
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(1), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
        TextKt.m1261Text4IGK_g((String) mutableState2.getValue(), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
        composerStartRestartGroup.startReplaceableGroup(-501261413);
        if (((Boolean) mutableState3.getValue()).booleanValue()) {
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.try_again, composerStartRestartGroup, 0), o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, new OooO0O0(activity, data), 253), o0OOo000.f48186Ooooo0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (OooOo.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(data, i));
    }
}
