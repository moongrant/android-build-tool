package p532o0o0OOo0;

import androidx.compose.animation.OooOo;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ProgressIndicatorDefaults;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000O0;
import com.common.support.netdiagwrapper.NetDiagnosisResult;
import com.common.support.networkstate.NetworkStateUtil;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import p004OooO0oO.o0OoOo0;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p386o0OOooO.oo0o0Oo;
import p448o0OoOoo.o00O0OOO;
import p516o0o0O00o.o0O0oo0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nNetworkTestScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkTestScreen.kt\ncom/yalla/yalla/ui/screen/NetworkTestScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,266:1\n72#2,6:267\n78#2:301\n82#2:320\n76#2,2:321\n78#2:351\n82#2:358\n73#2,5:419\n78#2:452\n82#2:458\n71#2,7:463\n78#2:498\n82#2:522\n78#3,11:273\n91#3:319\n78#3,11:323\n91#3:357\n78#3,11:366\n91#3:417\n78#3,11:424\n91#3:457\n78#3,11:470\n91#3:521\n456#4,8:284\n464#4,3:298\n25#4:302\n36#4:309\n467#4,3:316\n456#4,8:334\n464#4,3:348\n467#4,3:354\n456#4,8:377\n464#4,3:391\n36#4:395\n50#4:404\n49#4:405\n467#4,3:414\n456#4,8:435\n464#4,3:449\n467#4,3:454\n456#4,8:481\n464#4,3:495\n36#4:502\n36#4:511\n467#4,3:518\n4144#5,6:292\n4144#5,6:342\n4144#5,6:385\n4144#5,6:443\n4144#5,6:489\n1097#6,6:303\n1097#6,6:310\n1097#6,6:396\n1097#6,6:406\n1097#6,6:503\n1097#6,6:512\n154#7:352\n154#7:353\n154#7:402\n154#7:403\n154#7:412\n154#7:413\n154#7:453\n154#7:459\n154#7:460\n154#7:461\n154#7:462\n164#7:499\n154#7:500\n154#7:501\n154#7:509\n154#7:510\n65#8,7:359\n72#8:394\n76#8:418\n81#9:523\n81#9:524\n*S KotlinDebug\n*F\n+ 1 NetworkTestScreen.kt\ncom/yalla/yalla/ui/screen/NetworkTestScreenKt\n*L\n82#1:267,6\n82#1:301\n82#1:320\n122#1:321,2\n122#1:351\n122#1:358\n178#1:419,5\n178#1:452\n178#1:458\n227#1:463,7\n227#1:498\n227#1:522\n82#1:273,11\n82#1:319\n122#1:323,11\n122#1:357\n146#1:366,11\n146#1:417\n178#1:424,11\n178#1:457\n227#1:470,11\n227#1:521\n82#1:284,8\n82#1:298,3\n110#1:302\n112#1:309\n82#1:316,3\n122#1:334,8\n122#1:348,3\n122#1:354,3\n146#1:377,8\n146#1:391,3\n148#1:395\n157#1:404\n157#1:405\n146#1:414,3\n178#1:435,8\n178#1:449,3\n178#1:454,3\n227#1:481,8\n227#1:495,3\n235#1:502\n247#1:511\n227#1:518,3\n82#1:292,6\n122#1:342,6\n146#1:385,6\n178#1:443,6\n227#1:489,6\n110#1:303,6\n112#1:310,6\n148#1:396,6\n157#1:406,6\n235#1:503,6\n247#1:512,6\n131#1:352\n138#1:353\n156#1:402\n157#1:403\n166#1:412\n170#1:413\n192#1:453\n207#1:459\n208#1:460\n209#1:461\n221#1:462\n228#1:499\n233#1:500\n234#1:501\n245#1:509\n246#1:510\n146#1:359,7\n146#1:394\n146#1:418\n147#1:523\n149#1:524\n*E\n"})
public final class o0000O {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f53455OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53456OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O f53457OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(ColumnScope columnScope, o0O o0o, int i) {
            super(2);
            this.f53455OooO0Oo = columnScope;
            this.f53457OooO0o0 = o0o;
            this.f53456OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53456OooO0o | 1);
            o0000O.OooO0OO(this.f53455OooO0Oo, this.f53457OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53458OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f53458OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53458OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53459OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f53459OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53459OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f53460OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53461OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53462OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53463OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53464OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, Function0<Unit> function0, Function0<Unit> function1, int i2, int i3) {
            super(2);
            this.f53460OooO0Oo = i;
            this.f53462OooO0o0 = function0;
            this.f53461OooO0o = function1;
            this.f53463OooO0oO = i2;
            this.f53464OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O.OooO00o(this.f53460OooO0Oo, this.f53462OooO0o0, this.f53461OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53463OooO0oO | 1), this.f53464OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f53465OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f53466OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53467OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53468OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ColumnScope columnScope, int i, String str, int i2) {
            super(2);
            this.f53465OooO0Oo = columnScope;
            this.f53467OooO0o0 = i;
            this.f53466OooO0o = str;
            this.f53468OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53468OooO0oO | 1);
            int i = this.f53467OooO0o0;
            String str = this.f53466OooO0o;
            o0000O.OooO0O0(this.f53465OooO0Oo, i, str, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f53469OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53470OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f53471OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, String str, int i) {
            super(2);
            this.f53469OooO0Oo = columnScope;
            this.f53471OooO0o0 = str;
            this.f53470OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53470OooO0o | 1);
            o0000O.OooO0Oo(this.f53469OooO0Oo, this.f53471OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f53472OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f53473OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, float f) {
            super(1);
            this.f53472OooO0Oo = j;
            this.f53473OooO0o0 = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            long j = this.f53472OooO0Oo;
            float f = this.f53473OooO0o0;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(Canvas, j, 0L, SizeKt.Size(f, f), CornerRadiusKt.CornerRadius(f, f), new Stroke(o0000O0.OooO00o(8), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 226, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O f53474OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53475OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0O o0o, int i) {
            super(2);
            this.f53474OooO0Oo = o0o;
            this.f53475OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53475OooO0o0 | 1);
            o0000O.OooO0o0(this.f53474OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Float> f53476OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(State<Float> state) {
            super(0);
            this.f53476OooO0Oo = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f53476OooO0Oo.getValue().floatValue());
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f53477OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f53477OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f53477OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0233  */
    /* JADX WARN: Code duplicated, block: B:75:0x023b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0245  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i2, int i3) {
        int i4;
        Function0<Unit> function2;
        int i5;
        Function0<Unit> function3;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        float f;
        float f2;
        float f3;
        boolean zChanged;
        Object objRememberedValue;
        Function0<Unit> function4;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-856186023);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 896) == 0) {
                function2 = function1;
                i4 |= composerStartRestartGroup.changedInstance(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i4;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-856186023, i5, -1, "com.yalla.yalla.ui.screen.BottomBtnPanel (NetworkTestScreen.kt:225)");
                }
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, Dp.m3775constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
                String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i5 & 14);
                f = 32;
                f2 = 12;
                f3 = 36;
                Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m479paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00O0OO0.OooO00o(strStringResource, 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O0, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100663296, 262142);
                composerStartRestartGroup.startReplaceableGroup(1567115170);
                function4 = function3;
                if (function4 != null) {
                    String strStringResource2 = StringResources_androidKt.stringResource(o000000.network_test_button_again, composerStartRestartGroup, 0);
                    TextButtonStyle textButtonStyle = TextButtonStyle.GreyOutLined;
                    Modifier modifierOooO0O1 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), 2, null), composerStartRestartGroup, 1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OooO0O0(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00O0OO0.OooO00o(strStringResource2, 0L, null, textButtonStyle, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O1, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 100663296, 262134);
                }
                if (OooOo.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function4 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, function0, function4, i2, i3));
        }
        i4 |= 384;
        function2 = function1;
        i5 = i4;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856186023, i5, -1, "com.yalla.yalla.ui.screen.BottomBtnPanel (NetworkTestScreen.kt:225)");
            }
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O1, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, Dp.m3775constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
            String strStringResource3 = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i5 & 14);
            f = 32;
            f2 = 12;
            f3 = 36;
            Modifier modifierOooO0O2 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m479paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0OO0.OooO00o(strStringResource3, 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O2, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100663296, 262142);
            composerStartRestartGroup.startReplaceableGroup(1567115170);
            function4 = function3;
            if (function4 != null) {
                String strStringResource4 = StringResources_androidKt.stringResource(o000000.network_test_button_again, composerStartRestartGroup, 0);
                TextButtonStyle textButtonStyle2 = TextButtonStyle.GreyOutLined;
                Modifier modifierOooO0O3 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), 2, null), composerStartRestartGroup, 1157296644);
                zChanged2 = composerStartRestartGroup.changed(function4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00O0OO0.OooO00o(strStringResource4, 0L, null, textButtonStyle2, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O3, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 100663296, 262134);
            }
            if (OooOo.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                function3 = null;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856186023, i5, -1, "com.yalla.yalla.ui.screen.BottomBtnPanel (NetworkTestScreen.kt:225)");
            }
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O2, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, Dp.m3775constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
            String strStringResource5 = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i5 & 14);
            f = 32;
            f2 = 12;
            f3 = 36;
            Modifier modifierOooO0O4 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m479paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0OO0.OooO00o(strStringResource5, 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O4, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100663296, 262142);
            composerStartRestartGroup.startReplaceableGroup(1567115170);
            function4 = function3;
            if (function4 != null) {
                String strStringResource6 = StringResources_androidKt.stringResource(o000000.network_test_button_again, composerStartRestartGroup, 0);
                TextButtonStyle textButtonStyle3 = TextButtonStyle.GreyOutLined;
                Modifier modifierOooO0O5 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f3, PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), 2, null), composerStartRestartGroup, 1157296644);
                zChanged2 = composerStartRestartGroup.changed(function4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00O0OO0.OooO00o(strStringResource6, 0L, null, textButtonStyle3, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, modifierOooO0O5, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 100663296, 262134);
            }
            if (OooOo.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, function0, function4, i2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(ColumnScope columnScope, int i, String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        int i4 = i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92059283);
        if ((i4 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str2;
            composer2 = composerStartRestartGroup;
            i4 = i4;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92059283, i5, -1, "com.yalla.yalla.ui.screen.CenterNormalPanel (NetworkTestScreen.kt:176)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, companion, 1.0f, false, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = columnScope.align(modifierOooO00o, companion2.getCenterHorizontally());
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = o00O0OOO.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, ColumnScopeInstance.INSTANCE.align(companion, companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.startReplaceableGroup(-1994712341);
            if (!StringsKt.isBlank(str)) {
                float f = 40;
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(str, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(f), 0.0f, 8, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 6) & 14) | 3072, 0, 130544);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(columnScope, i, str2, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(ColumnScope columnScope, o0O o0o, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2040602013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040602013, i, -1, "com.yalla.yalla.ui.screen.CenterTestingPanel (NetworkTestScreen.kt:120)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, companion, 1.0f, false, 2, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO0o0(o0o, composerStartRestartGroup, 8);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.network_test_testing, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(20), 0.0f, 0.0f, 13, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        float f = 40;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.network_test_tips, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 8, null), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(columnScope, o0o, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(ColumnScope columnScope, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1809238551);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
            composer2 = composerStartRestartGroup;
            i3 = i;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1809238551, i4, -1, "com.yalla.yalla.ui.screen.ResultPanel (NetworkTestScreen.kt:198)");
            }
            float f = 8;
            composer2 = composerStartRestartGroup;
            i3 = i;
            str2 = str;
            TextKt.m1261Text4IGK_g(str, ScrollKt.verticalScroll$default(PaddingKt.m478padding3ABfNKs(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m478padding3ABfNKs(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m3775constructorimpl(f)), o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), Dp.m3775constructorimpl(f)), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3730getVisiblegIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i4 >> 3) & 14) | 3072, 48, 129008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(columnScope, str2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-192063351);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-192063351, i, -1, "com.yalla.yalla.ui.screen.TestTips (NetworkTestScreen.kt:214)");
            }
            String strStringResource = StringResources_androidKt.stringResource(o000000.network_test_description, composerStartRestartGroup, 0);
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
            long sp = TextUnitKt.getSp(16);
            float f = 16;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(f), 0.0f, 8, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, modifierM482paddingqDBjuR0$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(o0O o0o, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1800227965);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1800227965, i, -1, "com.yalla.yalla.ui.screen.TestProgress (NetworkTestScreen.kt:144)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        State stateCollectAsState = SnapshotStateKt.collectAsState(o0o.f56501OooO0o, Float.valueOf(0.0f), null, composerStartRestartGroup, 56, 2);
        Object[] objArr = {Float.valueOf(((Number) stateCollectAsState.getValue()).floatValue())};
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOOO0(stateCollectAsState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) RememberSaveableKt.m1333rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6)).floatValue(), ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
        float fOooO00o = o0000O0.OooO00o(Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT);
        long j = o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO;
        float f = Constants.ERR_ALREADY_IN_RECORDING;
        Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(4));
        Color colorM1671boximpl = Color.m1671boximpl(j);
        Float fValueOf = Float.valueOf(fOooO00o);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(colorM1671boximpl) | composerStartRestartGroup.changed(fValueOf);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOO0O(j, fOooO00o);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(modifierM478padding3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 6);
        ProgressIndicatorKt.m1152CircularProgressIndicatorDUhRLBM(stateAnimateFloatAsState.getValue().floatValue(), androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), o0000oo.OooO0OO(composerStartRestartGroup).f38617OooO00o, Dp.m3775constructorimpl(8), 0L, 0, composerStartRestartGroup, 3120, 48);
        TextKt.m1261Text4IGK_g(((int) (stateAnimateFloatAsState.getValue().floatValue() * 100)) + "%", (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(21), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(o0o, i));
    }

    public static final void OooO0oO(o0O o0o, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886298360);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1886298360, i, -1, "com.yalla.yalla.ui.screen.NetworkDiagScreenContent (NetworkTestScreen.kt:80)");
        }
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Network_Test, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
        int iIntValue = o0o.f56500OooO0Oo.getValue().intValue();
        String str = "";
        if (iIntValue == 0) {
            composerStartRestartGroup.startReplaceableGroup(-294060298);
            OooO0o(composerStartRestartGroup, 0);
            OooO0O0(columnScopeInstance, o0Oo0oo.icon_network_test_radar, "", composerStartRestartGroup, 390);
            OooO00o(o000000.network_test_button_start, new o0000OO0(o0o), null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (iIntValue == 1) {
            composerStartRestartGroup.startReplaceableGroup(-294060024);
            OooO0o(composerStartRestartGroup, 0);
            OooO0OO(columnScopeInstance, o0o, composerStartRestartGroup, 70);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (iIntValue == 2) {
            composerStartRestartGroup.startReplaceableGroup(-294059920);
            OooO0o(composerStartRestartGroup, 0);
            OooO0O0(columnScopeInstance, o0Oo0oo.icon_network_test_completed, StringResources_androidKt.stringResource(o000000.network_test_completed, composerStartRestartGroup, 0), composerStartRestartGroup, 6);
            OooO00o(o000000.network_test_button_show_result, new o000(o0o), new o000O000(o0o), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (iIntValue != 3) {
            composerStartRestartGroup.startReplaceableGroup(-294059297);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, -294059524, -492369756);
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objOooO00o == companion2.getEmpty()) {
                NetDiagnosisResult netDiagnosisResult = o0o.f56502OooO0o0;
                if (netDiagnosisResult != null) {
                    p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                    String strOooO00o = o0OoOo0.OooO00o();
                    String strValueOf = o0o.f56503OooO0oO;
                    if (StringsKt.isBlank(strValueOf)) {
                        strValueOf = String.valueOf(p475o0Ooooo0.o0O00oO0.OooO0OO().getValue());
                    }
                    String strDump = netDiagnosisResult.dump(strOooO00o, strValueOf, oo0o0Oo.OooO0Oo(), NetworkStateUtil.INSTANCE.networkType(o0o.getApplication()).name());
                    if (strDump != null) {
                        str = strDump;
                    }
                }
                composerStartRestartGroup.updateRememberedValue(str);
                objOooO00o = str;
            }
            composerStartRestartGroup.endReplaceableGroup();
            String str2 = (String) objOooO00o;
            OooO0Oo(columnScopeInstance, str2, composerStartRestartGroup, 54);
            int i2 = o000000.network_test_button_copy_result;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new o000O0o(str2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO00o(i2, (Function0) objRememberedValue, null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000Oo0(o0o, i));
    }
}
