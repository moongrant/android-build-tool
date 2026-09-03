package p519o0o0O0oO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.RedemptionCodeAwards;
import com.yalla.yalla.model.RedemptionCodeType;
import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import io.agora.rtc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000OO;
import p417o0OoO0.o0000Ooo;
import p417o0OoO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRedemptionCodeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedemptionCodeDialog.kt\ncom/yalla/yalla/ui/dialog/RedemptionCodeRewardDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,461:1\n81#2,11:462\n154#3:473\n154#3:474\n154#3:475\n154#3:476\n154#3:477\n154#3:478\n154#3:479\n154#3:480\n154#3:481\n154#3:482\n154#3:483\n154#3:531\n154#3:532\n154#3:533\n154#3:534\n154#3:535\n154#3:536\n154#3:577\n154#3:613\n154#3:658\n154#3:694\n154#3:696\n154#3:702\n154#3:703\n154#3:704\n154#3:740\n154#3:776\n154#3,11:812\n164#3:828\n154#3:881\n154#3:882\n154#3:888\n154#3:889\n154#3:890\n154#3:926\n154#3:962\n154#3:998\n154#3:1004\n154#3:1057\n154#3:1058\n67#4,5:484\n72#4:517\n76#4:522\n66#4,6:537\n72#4:571\n76#4:576\n66#4,6:578\n72#4:612\n67#4,5:614\n72#4:647\n76#4:652\n76#4:657\n66#4,6:659\n72#4:693\n76#4:701\n66#4,6:741\n72#4:775\n66#4,6:777\n72#4:811\n76#4:827\n76#4:880\n66#4,6:927\n72#4:961\n66#4,6:963\n72#4:997\n76#4:1003\n76#4:1056\n78#5,11:489\n91#5:521\n78#5,11:543\n91#5:575\n78#5,11:584\n78#5,11:619\n91#5:651\n91#5:656\n78#5,11:665\n91#5:700\n78#5,11:711\n78#5,11:747\n78#5,11:783\n91#5:826\n78#5,11:835\n91#5:874\n91#5:879\n91#5:886\n78#5,11:897\n78#5,11:933\n78#5,11:969\n91#5:1002\n78#5,11:1011\n91#5:1050\n91#5:1055\n91#5:1062\n456#6,8:500\n464#6,3:514\n467#6,3:518\n25#6:524\n456#6,8:554\n464#6,3:568\n467#6,3:572\n456#6,8:595\n464#6,3:609\n456#6,8:630\n464#6,3:644\n467#6,3:648\n467#6,3:653\n456#6,8:676\n464#6,3:690\n467#6,3:697\n456#6,8:722\n464#6,3:736\n456#6,8:758\n464#6,3:772\n456#6,8:794\n464#6,3:808\n467#6,3:823\n456#6,8:846\n464#6,3:860\n25#6:864\n467#6,3:871\n467#6,3:876\n467#6,3:883\n456#6,8:908\n464#6,3:922\n456#6,8:944\n464#6,3:958\n456#6,8:980\n464#6,3:994\n467#6,3:999\n456#6,8:1022\n464#6,3:1036\n25#6:1040\n467#6,3:1047\n467#6,3:1052\n467#6,3:1059\n4144#7,6:508\n4144#7,6:562\n4144#7,6:603\n4144#7,6:638\n4144#7,6:684\n4144#7,6:730\n4144#7,6:766\n4144#7,6:802\n4144#7,6:854\n4144#7,6:916\n4144#7,6:952\n4144#7,6:988\n4144#7,6:1030\n76#8:523\n1097#9,6:525\n1097#9,6:865\n1097#9,6:1041\n51#10:695\n72#11,6:705\n78#11:739\n82#11:887\n72#11,6:891\n78#11:925\n82#11:1063\n73#12,6:829\n79#12:863\n83#12:875\n73#12,6:1005\n79#12:1039\n83#12:1051\n*S KotlinDebug\n*F\n+ 1 RedemptionCodeDialog.kt\ncom/yalla/yalla/ui/dialog/RedemptionCodeRewardDialog\n*L\n49#1:462,11\n50#1:473\n51#1:474\n56#1:475\n57#1:476\n60#1:477\n61#1:478\n64#1:479\n65#1:480\n68#1:481\n69#1:482\n93#1:483\n108#1:531\n109#1:532\n122#1:533\n131#1:534\n140#1:535\n141#1:536\n158#1:577\n168#1:613\n201#1:658\n209#1:694\n223#1:696\n249#1:702\n250#1:703\n252#1:704\n257#1:740\n268#1:776\n281#1:812,11\n290#1:828\n330#1:881\n332#1:882\n341#1:888\n342#1:889\n344#1:890\n349#1:926\n360#1:962\n373#1:998\n382#1:1004\n421#1:1057\n423#1:1058\n91#1:484,5\n91#1:517\n91#1:522\n138#1:537,6\n138#1:571\n138#1:576\n154#1:578,6\n154#1:612\n166#1:614,5\n166#1:647\n166#1:652\n154#1:657\n198#1:659,6\n198#1:693\n198#1:701\n254#1:741,6\n254#1:775\n265#1:777,6\n265#1:811\n265#1:827\n254#1:880\n346#1:927,6\n346#1:961\n357#1:963,6\n357#1:997\n357#1:1003\n346#1:1056\n91#1:489,11\n91#1:521\n138#1:543,11\n138#1:575\n154#1:584,11\n166#1:619,11\n166#1:651\n154#1:656\n198#1:665,11\n198#1:700\n247#1:711,11\n254#1:747,11\n265#1:783,11\n265#1:826\n286#1:835,11\n286#1:874\n254#1:879\n247#1:886\n339#1:897,11\n346#1:933,11\n357#1:969,11\n357#1:1002\n378#1:1011,11\n378#1:1050\n346#1:1055\n339#1:1062\n91#1:500,8\n91#1:514,3\n91#1:518,3\n105#1:524\n138#1:554,8\n138#1:568,3\n138#1:572,3\n154#1:595,8\n154#1:609,3\n166#1:630,8\n166#1:644,3\n166#1:648,3\n154#1:653,3\n198#1:676,8\n198#1:690,3\n198#1:697,3\n247#1:722,8\n247#1:736,3\n254#1:758,8\n254#1:772,3\n265#1:794,8\n265#1:808,3\n265#1:823,3\n286#1:846,8\n286#1:860,3\n293#1:864\n286#1:871,3\n254#1:876,3\n247#1:883,3\n339#1:908,8\n339#1:922,3\n346#1:944,8\n346#1:958,3\n357#1:980,8\n357#1:994,3\n357#1:999,3\n378#1:1022,8\n378#1:1036,3\n385#1:1040\n378#1:1047,3\n346#1:1052,3\n339#1:1059,3\n91#1:508,6\n138#1:562,6\n154#1:603,6\n166#1:638,6\n198#1:684,6\n247#1:730,6\n254#1:766,6\n265#1:802,6\n286#1:854,6\n339#1:916,6\n346#1:952,6\n357#1:988,6\n378#1:1030,6\n104#1:523\n105#1:525,6\n293#1:865,6\n385#1:1041,6\n209#1:695\n247#1:705,6\n247#1:739\n247#1:887\n339#1:891,6\n339#1:925\n339#1:1063\n286#1:829,6\n286#1:863\n286#1:875\n378#1:1005,6\n378#1:1039\n378#1:1051\n*E\n"})
public final class h0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final h0 f52296OooO00o = new h0();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f52297OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f52299OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52300OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52301OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, float f, int i) {
            super(2);
            this.f52300OooO0o0 = boxScope;
            this.f52299OooO0o = f;
            this.f52301OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52301OooO0oO | 1);
            BoxScope boxScope = this.f52300OooO0o0;
            float f = this.f52299OooO0o;
            h0.this.OooO00o(boxScope, f, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52303OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52304OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f52305OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52306OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, float f, int i) {
            super(2);
            this.f52304OooO0o0 = boxScope;
            this.f52303OooO0o = redemptionCodeVm;
            this.f52305OooO0oO = f;
            this.f52306OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            h0.this.OooO0O0(this.f52304OooO0o0, this.f52303OooO0o, this.f52305OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52306OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52307OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RedemptionCodeVm redemptionCodeVm) {
            super(0);
            this.f52307OooO0Oo = redemptionCodeVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RedemptionCodeVm redemptionCodeVm = this.f52307OooO0Oo;
            redemptionCodeVm.getRedemptionCodeDialogShow().setValue(Boolean.FALSE);
            Function0<Unit> redemptionCodeDialogDismissListener = redemptionCodeVm.getRedemptionCodeDialogDismissListener();
            if (redemptionCodeDialogDismissListener != null) {
                redemptionCodeDialogDismissListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52309OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52310OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52311OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f52310OooO0o0 = boxScope;
            this.f52309OooO0o = redemptionCodeVm;
            this.f52311OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52311OooO0oO | 1);
            BoxScope boxScope = this.f52310OooO0o0;
            RedemptionCodeVm redemptionCodeVm = this.f52309OooO0o;
            h0.this.OooO0OO(boxScope, redemptionCodeVm, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52312OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RedemptionCodeVm redemptionCodeVm) {
            super(0);
            this.f52312OooO0Oo = redemptionCodeVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RedemptionCodeVm redemptionCodeVm = this.f52312OooO0Oo;
            redemptionCodeVm.getRedemptionCodeDialogShow().setValue(Boolean.FALSE);
            Function0<Unit> redemptionCodeDialogDismissListener = redemptionCodeVm.getRedemptionCodeDialogDismissListener();
            if (redemptionCodeDialogDismissListener != null) {
                redemptionCodeDialogDismissListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52313OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f52314OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f52315OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RedemptionCodeVm redemptionCodeVm, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(2);
            this.f52313OooO0Oo = redemptionCodeVm;
            this.f52315OooO0o0 = floatRef;
            this.f52314OooO0o = floatRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(769967820, iIntValue, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Dialog.<anonymous> (RedemptionCodeDialog.kt:83)");
                }
                h0.OooO0oo(h0.f52296OooO00o, this.f52313OooO0Oo, this.f52315OooO0o0.element, this.f52314OooO0o.element, composer2, 3080);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<LazyGridScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52316OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<RedemptionCodeAwards> f52317OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52318OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(List list, int i, int i2) {
            super(1);
            this.f52316OooO0Oo = i;
            this.f52318OooO0o0 = i2;
            this.f52317OooO0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyGridScope lazyGridScope) {
            LazyGridScope LazyVerticalGrid = lazyGridScope;
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            LazyGridScope.CC.OooO0O0(LazyVerticalGrid, this.f52316OooO0Oo, null, null, null, ComposableLambdaKt.composableLambdaInstance(148830938, true, new j0(this.f52318OooO0o0, this.f52317OooO0o)), 14, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52320OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52321OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52322OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z, int i, int i2) {
            super(2);
            this.f52321OooO0o0 = z;
            this.f52320OooO0o = i;
            this.f52322OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52320OooO0o | 1);
            h0.this.OooO0Oo(this.f52321OooO0o0, composer, iUpdateChangedFlags, this.f52322OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeVm f52324OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52325OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52326OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, int i) {
            super(2);
            this.f52325OooO0o0 = boxScope;
            this.f52324OooO0o = redemptionCodeVm;
            this.f52326OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52326OooO0oO | 1);
            BoxScope boxScope = this.f52325OooO0o0;
            RedemptionCodeVm redemptionCodeVm = this.f52324OooO0o;
            h0.this.OooO0o0(boxScope, redemptionCodeVm, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52328OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeAwards f52329OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RedemptionCodeAwards redemptionCodeAwards, int i) {
            super(2);
            this.f52329OooO0o0 = redemptionCodeAwards;
            this.f52328OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52328OooO0o | 1);
            h0.this.OooO0o(this.f52329OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f52330OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o00Oo0.OooO0o0(it, oOo00OO0.icon_picture_default);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52332OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeAwards f52333OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(RedemptionCodeAwards redemptionCodeAwards, int i) {
            super(2);
            this.f52333OooO0o0 = redemptionCodeAwards;
            this.f52332OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52332OooO0o | 1);
            h0.this.OooO0oO(this.f52333OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f52334OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o00Oo0.OooO0o0(it, oOo00OO0.icon_picture_default);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0oo(h0 h0Var, RedemptionCodeVm redemptionCodeVm, float f, float f2, Composer composer, int i) {
        h0Var.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(880975296);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(880975296, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.DialogContent (RedemptionCodeDialog.kt:89)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(24), 0.0f, 2, null), 0.0f, 1, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        h0 h0Var2 = f52296OooO00o;
        h0Var2.OooO00o(boxScopeInstance, f, composerStartRestartGroup, (i & 112) | 390);
        h0Var2.OooO0O0(boxScopeInstance, redemptionCodeVm, f2, composerStartRestartGroup, (i & 896) | 3142);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i0(h0Var, redemptionCodeVm, f, f2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(BoxScope boxScope, float f, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1237087707);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1237087707, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Background (RedemptionCodeDialog.kt:102)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int i3 = oO00OOO.ic_redemption_code_reward_dialog_bg_x;
                Object obj = ContextCompat.f5271OooO00o;
                objRememberedValue = ContextCompat.OooO0OO.OooO0O0(context, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f2 = 24;
            BoxKt.Box(o0000Ooo.OooO00o(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(ClipKt.clip(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(42), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), 0.0f, 1, null), f), (Drawable) objRememberedValue, composerStartRestartGroup, 64), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Congrats_You_got, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(20);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            int i4 = o0oO0O0o.f47152o00OOOo;
            long j = o0oO0O0o.f47126o00O0o0o;
            int iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(60), Dp.m3765constructorimpl(138), 0.0f, 8, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            TextKt.m1251Text4IGK_g(strStringResource, boxScope.align(modifierFillMaxWidth$default, companion2.getTopStart()), j, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3676getStarte0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 130512);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_dialog_gift, composer2, 0), "", boxScope.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING)), companion2.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, f, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, float f, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2067915761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2067915761, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Bottom (RedemptionCodeDialog.kt:136)");
        }
        float f2 = 8;
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(ClipKt.clip(PaddingKt.m479paddingqDBjuR0(Modifier.INSTANCE, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(126), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(24))), 0.0f, 1, null), f);
        int i2 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierM509height3ABfNKs, o0oO0O0o.f46946OooO0O0, null, 2, null);
        Alignment.Companion companion = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(modifierM169backgroundbw27NRU$default, companion.getTopCenter());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        h0 h0Var = f52296OooO00o;
        h0Var.OooO0o0(boxScopeInstance, redemptionCodeVm, composerStartRestartGroup, 454);
        h0Var.OooO0OO(boxScopeInstance, redemptionCodeVm, composerStartRestartGroup, 454);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, redemptionCodeVm, f, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1322441911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1322441911, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.BottomBtn (RedemptionCodeDialog.kt:152)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(76, SizeKt.fillMaxWidth$default(boxScope.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_dialog_btn_bg, composerStartRestartGroup, 0), "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(boxScopeInstance.align(SizeKt.fillMaxSize$default(PaddingKt.m476padding3ABfNKs(companion, Dp.m3765constructorimpl(16)), 0.0f, 1, null), companion2.getBottomCenter()), false, null, null, new OooO0OO(redemptionCodeVm), 7, null);
        Alignment center = companion2.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_dialog_btn, composerStartRestartGroup, 0), "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.OK, composerStartRestartGroup, 0);
        long sp = TextUnitKt.getSp(16);
        int i2 = o0oO0O0o.f47152o00OOOo;
        TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o0oO0O0o.f46946OooO0O0, sp, (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 130514);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, redemptionCodeVm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(boolean z, @Nullable Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(144293310);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            boolean z3 = i4 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144293310, i3, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Dialog (RedemptionCodeDialog.kt:47)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RedemptionCodeVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            RedemptionCodeVm redemptionCodeVm = (RedemptionCodeVm) viewModel;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float f = 384;
            floatRef.element = Dp.m3765constructorimpl(f);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float f2 = 476;
            floatRef2.element = Dp.m3765constructorimpl(f2);
            List<RedemptionCodeAwards> redemptionCodeResult = redemptionCodeVm.getRedemptionCodeResult();
            if (redemptionCodeResult != null) {
                switch (redemptionCodeResult.size()) {
                    case 1:
                    case 2:
                        floatRef.element = Dp.m3765constructorimpl(238);
                        floatRef2.element = Dp.m3765constructorimpl(330);
                        break;
                    case 3:
                        floatRef.element = Dp.m3765constructorimpl(ComposerKt.reuseKey);
                        floatRef2.element = Dp.m3765constructorimpl(300);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        floatRef.element = Dp.m3765constructorimpl(334);
                        floatRef2.element = Dp.m3765constructorimpl(426);
                        break;
                    default:
                        floatRef.element = Dp.m3765constructorimpl(f);
                        floatRef2.element = Dp.m3765constructorimpl(f2);
                        break;
                }
            }
            p158o00OoOOO.OooOOO0.OooO00o(redemptionCodeVm.getRedemptionCodeDialogShow(), z3, false, OooO.f52297OooO0Oo, new OooOO0(redemptionCodeVm), 0, 0, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 769967820, true, new OooOO0O(redemptionCodeVm, floatRef2, floatRef)), composerStartRestartGroup, ((i3 << 3) & 112) | 100666368, 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(z2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(@NotNull RedemptionCodeAwards it, @Nullable Composer composer, int i) {
        Painter painterOooO0OO;
        Intrinsics.checkNotNullParameter(it, "it");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1019637197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1019637197, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.ItemColumn1Or2 (RedemptionCodeDialog.kt:245)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = o0oOO.OooO00o(8, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(136)), Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING)), o0oO0O0o.f46946OooO0O0, null, 2, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO00o2 = p153o00OoO0.OooOO0.OooO00o(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_dialog_item_bg_2, composerStartRestartGroup, 0), "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        Modifier modifierOooO00o3 = p153o00OoO0.OooOO0.OooO00o(103, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (it.getRewardType() == RedemptionCodeType.RewardType.INSTANCE.getCoin()) {
            composerStartRestartGroup.startReplaceableGroup(-1526662079);
            painterOooO0OO = PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_coin, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1526661956);
            painterOooO0OO = o00Oo0.OooO0OO(it.getRewardImage(), OooOo00.f52330OooO0Oo, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        ImageKt.Image(painterOooO0OO, (String) null, boxScopeInstance.align(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(83), Dp.m3765constructorimpl((float) 67.6d)), companion2.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl((float) 26.5d)), companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            int unit = it.getUnit();
            RedemptionCodeType.Unit unit2 = RedemptionCodeType.Unit.INSTANCE;
            if (unit == unit2.getCount()) {
                objRememberedValue = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount()));
            } else if (unit == unit2.getDays()) {
                objRememberedValue = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx_Days), String.valueOf(it.getRewardCount()));
            } else {
                objRememberedValue = unit == unit2.getCoin() ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount())) : o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount()));
            }
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(12);
        long j = o0oO0O0o.f47125o00O0o0O;
        TextAlign.Companion companion4 = TextAlign.INSTANCE;
        TextKt.m1251Text4IGK_g((String) objRememberedValue, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, TextDirection.m3677boximpl(TextDirection.INSTANCE.m3684getContents_7Xco()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16711679, (DefaultConstructorMarker) null), composerStartRestartGroup, 3126, 0, 65008);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f = 5;
        TextKt.m1251Text4IGK_g(it.getRewardName(), SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), 0.0f, 1, null), Dp.m3765constructorimpl(25)), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3072, 122352);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(it, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(BoxScope boxScope, RedemptionCodeVm redemptionCodeVm, Composer composer, int i) {
        Modifier modifierM528width3ABfNKs;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1974400407);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1974400407, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Foreground (RedemptionCodeDialog.kt:194)");
        }
        List<RedemptionCodeAwards> redemptionCodeResult = redemptionCodeVm.getRedemptionCodeResult();
        if (redemptionCodeResult == null) {
            composer2 = composerStartRestartGroup;
        } else {
            int size = redemptionCodeResult.size();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(16));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM476padding3ABfNKs, companion2.getTopCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = 3;
            switch (size) {
                case 1:
                    float f = 13;
                    modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(Dp.m3765constructorimpl(f) + Dp.m3765constructorimpl(Dp.m3765constructorimpl(115) + Dp.m3765constructorimpl(f))));
                    i2 = 1;
                    break;
                case 2:
                    modifierM528width3ABfNKs = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    i2 = 2;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    modifierM528width3ABfNKs = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    break;
                default:
                    modifierM528width3ABfNKs = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(47), 7, null);
                    break;
            }
            GridCells.Fixed fixed = new GridCells.Fixed(i2);
            Modifier modifierAlign2 = boxScopeInstance.align(companion.then(modifierM528width3ABfNKs), companion2.getTopCenter());
            OooOOO oooOOO = new OooOOO(redemptionCodeResult, size, i2);
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierAlign2, null, null, false, null, null, null, false, oooOOO, composerStartRestartGroup, 0, 508);
            o000oOoO.OooO00o(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(boxScope, redemptionCodeVm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(@NotNull RedemptionCodeAwards it, @Nullable Composer composer, int i) {
        Painter painterOooO0OO;
        Intrinsics.checkNotNullParameter(it, "it");
        Composer composerStartRestartGroup = composer.startRestartGroup(-484638246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-484638246, i, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.ItemColumn3 (RedemptionCodeDialog.kt:337)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = o0oOO.OooO00o(2, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(90)), Dp.m3765constructorimpl(132)), o0oO0O0o.f46946OooO0O0, null, 2, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO00o2 = p153o00OoO0.OooOO0.OooO00o(98, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_dialog_item_bg_2, composerStartRestartGroup, 0), "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        Modifier modifierOooO00o3 = p153o00OoO0.OooOO0.OooO00o(78, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (it.getRewardType() == RedemptionCodeType.RewardType.INSTANCE.getCoin()) {
            composerStartRestartGroup.startReplaceableGroup(1520231683);
            painterOooO0OO = PainterResources_androidKt.painterResource(oO00OOO.ic_redemption_code_reward_coin, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1520231806);
            painterOooO0OO = o00Oo0.OooO0OO(it.getRewardImage(), Oooo000.f52334OooO0Oo, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        float f = 62;
        ImageKt.Image(painterOooO0OO, (String) null, boxScopeInstance.align(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f)), companion2.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(20)), companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            int unit = it.getUnit();
            RedemptionCodeType.Unit unit2 = RedemptionCodeType.Unit.INSTANCE;
            if (unit == unit2.getCount()) {
                objRememberedValue = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount()));
            } else if (unit == unit2.getDays()) {
                objRememberedValue = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx_Days), String.valueOf(it.getRewardCount()));
            } else {
                objRememberedValue = unit == unit2.getCoin() ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount())) : o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Exchange_Records_X_xxx), String.valueOf(it.getRewardCount()));
            }
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(9);
        long j = o0oO0O0o.f47125o00O0o0O;
        TextAlign.Companion companion4 = TextAlign.INSTANCE;
        TextKt.m1251Text4IGK_g((String) objRememberedValue, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, TextDirection.m3677boximpl(TextDirection.INSTANCE.m3684getContents_7Xco()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16711679, (DefaultConstructorMarker) null), composerStartRestartGroup, 3126, 0, 65008);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f2 = 4;
        TextKt.m1251Text4IGK_g(it.getRewardName(), SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f2), 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 10, null), 0.0f, 1, null), Dp.m3765constructorimpl(34)), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3072, 122352);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(it, i));
    }
}
