package com.yalla.yalla.ui.composable.moment;

import android.content.Context;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.media3.session.o00O0;
import com.code.android.util.OooOO0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p022Oooo00O.o0O00oO0;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p519o0o0O0OO.oo0OOoo;
import p521o0o0O0o0.o0000OO0;
import p521o0o0O0o0.o0000oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OOO0o;
import p606o0oo0O0o.o0O0O0o0;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.o0OOO00;
import p644o0ooOOo.oO000;
import p644o0ooOOo.oO00000;
import p644o0ooOOo.oO0000o0;
import p644o0ooOOo.oO000O0;
import p644o0ooOOo.oO0OoOO0;
import p644o0ooOOo.oO0o0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,246:1\n76#2:247\n76#2:248\n76#2:249\n76#2:250\n76#2:251\n72#3,6:252\n78#3:286\n72#3,6:457\n78#3:491\n82#3:530\n82#3:535\n78#4,11:258\n78#4,11:294\n78#4,11:331\n78#4,11:367\n91#4:401\n78#4,11:410\n91#4:444\n91#4:449\n91#4:454\n78#4,11:463\n91#4:529\n91#4:534\n456#5,8:269\n464#5,3:283\n456#5,8:305\n464#5,3:319\n456#5,8:342\n464#5,3:356\n456#5,8:378\n464#5,3:392\n467#5,3:398\n456#5,8:421\n464#5,3:435\n467#5,3:441\n467#5,3:446\n467#5,3:451\n456#5,8:474\n464#5,3:488\n25#5:499\n467#5,3:526\n467#5,3:531\n4144#6,6:277\n4144#6,6:313\n4144#6,6:350\n4144#6,6:386\n4144#6,6:429\n4144#6,6:482\n65#7,7:287\n72#7:322\n76#7:455\n154#8:323\n154#8:324\n154#8:396\n154#8:397\n154#8:439\n154#8:440\n164#8:456\n154#8:492\n154#8:493\n154#8:494\n73#9,6:325\n79#9:359\n72#9,7:360\n79#9:395\n83#9:402\n72#9,7:403\n79#9:438\n83#9:445\n83#9:450\n73#10,4:495\n77#10,20:506\n955#11,6:500\n*S KotlinDebug\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt\n*L\n52#1:247\n53#1:248\n54#1:249\n55#1:250\n56#1:251\n58#1:252,6\n58#1:286\n139#1:457,6\n139#1:491\n139#1:530\n58#1:535\n58#1:258,11\n73#1:294,11\n85#1:331,11\n100#1:367,11\n100#1:401\n118#1:410,11\n118#1:444\n85#1:449\n73#1:454\n139#1:463,11\n139#1:529\n58#1:534\n58#1:269,8\n58#1:283,3\n73#1:305,8\n73#1:319,3\n85#1:342,8\n85#1:356,3\n100#1:378,8\n100#1:392,3\n100#1:398,3\n118#1:421,8\n118#1:435,3\n118#1:441,3\n85#1:446,3\n73#1:451,3\n139#1:474,8\n139#1:488,3\n173#1:499\n139#1:526,3\n58#1:531,3\n58#1:277,6\n73#1:313,6\n85#1:350,6\n100#1:386,6\n118#1:429,6\n139#1:482,6\n73#1:287,7\n73#1:322\n73#1:455\n89#1:323\n95#1:324\n105#1:396\n112#1:397\n123#1:439\n130#1:440\n143#1:456\n160#1:492\n168#1:493\n176#1:494\n85#1:325,6\n85#1:359\n100#1:360,7\n100#1:395\n100#1:402\n118#1:403,7\n118#1:438\n118#1:445\n85#1:450\n173#1:495,4\n173#1:506,20\n173#1:500,6\n*E\n"})
public final class MomentShareEventKt {

    @SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,246:1\n154#2:247\n*S KotlinDebug\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$4$1\n*L\n225#1:247\n*E\n"})
    public static final class OooO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f27342OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OO o0oo) {
            super(1);
            this.f27342OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = this.f27342OooO0Oo;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, constrainAs.f58047OooO0OO.f58023OooO0Oo, Dp.m3775constructorimpl(12), 4);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f27343OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27344OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f27345OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f27346OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f27347OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27348OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z2, MomentForwardContent momentForwardContent) {
            super(0);
            this.f27344OooO0Oo = z;
            this.f27346OooO0o0 = context;
            this.f27345OooO0o = momentDetailModel;
            this.f27347OooO0oO = momentAdapterTag;
            this.f27348OooO0oo = z2;
            this.f27343OooO = momentForwardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f27344OooO0Oo) {
                o0000oo.OooO00o(this.f27346OooO0o0, this.f27345OooO0o, this.f27347OooO0oO, this.f27348OooO0oo, 0, false, 48);
            } else {
                long id = this.f27343OooO.getId();
                if (id > 0) {
                    o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
                    if (o0ooo0o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("event");
                        o0ooo0o2 = null;
                    }
                    EventModel eventModel = new EventModel();
                    eventModel.setId(id);
                    o0ooo0o2.OooO0o(eventModel);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,246:1\n154#2:247\n154#2:248\n*S KotlinDebug\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$1\n*L\n185#1:247\n186#1:248\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f27349OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, Dp.m3775constructorimpl(8), 4);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, Dp.m3775constructorimpl(12), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,246:1\n154#2:247\n154#2:248\n*S KotlinDebug\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$2$1\n*L\n200#1:247\n201#1:248\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f27350OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO f27351OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OO o0oo, o0OO o0oo2) {
            super(1);
            this.f27350OooO0Oo = o0oo;
            this.f27351OooO0o0 = o0oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = this.f27350OooO0Oo;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58023OooO0Oo, Dp.m3775constructorimpl(4), 4);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, this.f27351OooO0o0.f58021OooO0O0, Dp.m3775constructorimpl(16), 4);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            constrainAs.OooO00o(new oO0000o0(oO00000.f58075OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentShareEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,246:1\n154#2:247\n154#2:248\n*S KotlinDebug\n*F\n+ 1 MomentShareEvent.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareEventKt$MomentShareEvent$2$2$1$3$1\n*L\n213#1:247\n214#1:248\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f27352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO f27353OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OO o0oo, o0OO o0oo2) {
            super(1);
            this.f27352OooO0Oo = o0oo;
            this.f27353OooO0o0 = o0oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            oO000.OooO00o(constrainAs.f58050OooO0o0, constrainAs.f58047OooO0OO.f58022OooO0OO, Dp.m3775constructorimpl(8), 4);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, this.f27352OooO0Oo.f58021OooO0O0, Dp.m3775constructorimpl(4), 4);
            oO000.OooO00o(constrainAs.f58051OooO0oO, this.f27353OooO0o0.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f27354OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f27355OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f27356OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f27357OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Modifier modifier, MomentForwardContent momentForwardContent, int i, int i2) {
            super(2);
            this.f27354OooO0Oo = modifier;
            this.f27356OooO0o0 = momentForwardContent;
            this.f27355OooO0o = i;
            this.f27357OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f27355OooO0o | 1);
            MomentShareEventKt.OooO00o(this.f27354OooO0Oo, this.f27356OooO0o0, composer, iUpdateChangedFlags, this.f27357OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull final MomentForwardContent forwardContent, @Nullable Composer composer, int i, int i2) {
        float f;
        Composer composer2;
        Intrinsics.checkNotNullParameter(forwardContent, "forwardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1863944591);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1863944591, i, -1, "com.yalla.yalla.ui.composable.moment.MomentShareEvent (MomentShareEvent.kt:50)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
        MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
        MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooO00o(zBooleanValue, context, momentDetailModel, momentAdapterTag, zBooleanValue2, forwardContent), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        boolean z = !zBooleanValue;
        Modifier modifier3 = modifier2;
        ImageKt.Image(o000OO.OooO0OO(forwardContent.getImage(), null, composerStartRestartGroup, 0, 1), (String) null, ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.7375f, false, 2, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(o0000OO0.OooO00o(z), o0000OO0.OooO00o(z), 0.0f, 0.0f, 12, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        float f2 = 12;
        Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.background$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), Dp.m3775constructorimpl(38)), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(ColorKt.Color(2785017856L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), companion2.getCenterStart());
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (forwardContent.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
            composerStartRestartGroup.startReplaceableGroup(771125537);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composer2 = composerStartRestartGroup;
            f = f2;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_explore_event_yellow, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Room_Event_Live_Now, composer2, 0), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4294943263L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3504, 3072, 57328);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        } else {
            f = f2;
            composerStartRestartGroup.startReplaceableGroup(771126397);
            Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O3, composerM1320constructorimpl5, currentCompositionLocalMap5);
            if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_time, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            TextKt.m1261Text4IGK_g(o0O0O0o0.OooO0o(forwardContent.getStartTime()), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3120, 3072, 57328);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(BorderKt.m182borderxT4_qwU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl((float) 0.5d), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38621OooO0o, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, o0000OO0.OooO00o(z), o0000OO0.OooO00o(z), 3, null)), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, o0000OO0.OooO00o(z), o0000OO0.OooO00o(z), 3, null)), o0OOo000.f48135OooO0O0, null, 2, null);
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O4 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer3, 0, -1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor6);
        } else {
            composer3.useNode();
        }
        Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composer3);
        Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl6, measurePolicyOooO0O4, composerM1320constructorimpl6, currentCompositionLocalMap6);
        if (composerM1320constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash6, composerM1320constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer3, 6, 2);
        TextKt.m1261Text4IGK_g(forwardContent.getName(), PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, 2, null), p193o00o0O0O.o0000oo.OooO0OO(composer3).f38625OooOO0, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer3, 199728, 3120, 55248);
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(35));
        composer3.startReplaceableGroup(-270267587);
        composer3.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer3.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new oO000O0();
            composer3.updateRememberedValue(objRememberedValue);
        }
        composer3.endReplaceableGroup();
        final oO000O0 oo000o0 = (oO000O0) objRememberedValue;
        composer3.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer3.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composer3.updateRememberedValue(objRememberedValue2);
        }
        composer3.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composer3.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer3.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer3.updateRememberedValue(objRememberedValue3);
        }
        composer3.endReplaceableGroup();
        Pair pairOooO0O0 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo000o0, composer3);
        MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
        final Function0 function0 = (Function0) pairOooO0O0.component2();
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM511height3ABfNKs, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.composable.moment.MomentShareEventKt$MomentShareEvent$lambda$9$lambda$8$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                oO0o0o.OooO00o(semantics, oo000o0);
                return Unit.INSTANCE;
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.composable.moment.MomentShareEventKt$MomentShareEvent$lambda$9$lambda$8$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Composer composer4, Integer num) {
                Composer composer5 = composer4;
                if (((num.intValue() & 11) ^ 2) == 0 && composer5.getSkipping()) {
                    composer5.skipToGroupEnd();
                } else {
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    constraintLayoutScope2.getClass();
                    constraintLayoutScope2.OooO0Oo();
                    ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                    o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                    o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                    o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                    o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.ic_explore_event_room, composer5, 0);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    float f3 = 15;
                    ImageKt.Image(painterPainterResource, (String) null, ConstraintLayoutScope.OooO00o(SizeKt.m525size3ABfNKs(companion5, Dp.m3775constructorimpl(f3)), o0ooOooO00o, MomentShareEventKt.OooO0O0.f27349OooO0Oo), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                    OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composer5, 6, 2);
                    MomentForwardContent momentForwardContent = forwardContent;
                    String roomName = momentForwardContent.getRoomName();
                    if (roomName == null) {
                        roomName = "";
                    }
                    long sp = TextUnitKt.getSp(12);
                    long j = o0OOo000.f48277o000oo;
                    int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    composer5.startReplaceableGroup(511388516);
                    boolean zChanged = composer5.changed(o0ooOooO00o) | composer5.changed(o0ooOooO0OO);
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new MomentShareEventKt.OooO0OO(o0ooOooO00o, o0ooOooO0OO);
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    composer5.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(roomName, ConstraintLayoutScope.OooO00o(companion5, o0ooOooO0O0, (Function1) objRememberedValue4), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer5, 3072, 3120, 55280);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0Oo0oo.ic_moment_send_event_id, composer5, 0);
                    Modifier modifierOooO00o = o00O0.OooO00o(f3, companion5, composer5, 511388516);
                    boolean zChanged2 = composer5.changed(o0ooOooO0Oo) | composer5.changed(o0ooOooO00o);
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new MomentShareEventKt.OooO0o(o0ooOooO0Oo, o0ooOooO00o);
                        composer5.updateRememberedValue(objRememberedValue5);
                    }
                    composer5.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource2, (String) null, ConstraintLayoutScope.OooO00o(modifierOooO00o, o0ooOooO0OO, (Function1) objRememberedValue5), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                    String strValueOf = String.valueOf(momentForwardContent.getRoomIdx());
                    long sp2 = TextUnitKt.getSp(12);
                    composer5.startReplaceableGroup(1157296644);
                    boolean zChanged3 = composer5.changed(o0ooOooO00o);
                    Object objRememberedValue6 = composer5.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new MomentShareEventKt.OooO(o0ooOooO00o);
                        composer5.updateRememberedValue(objRememberedValue6);
                    }
                    composer5.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(strValueOf, ConstraintLayoutScope.OooO00o(companion5, o0ooOooO0Oo, (Function1) objRememberedValue6), j, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer5, 3072, 0, 65520);
                }
                return Unit.INSTANCE;
            }
        }), measurePolicy, composer3, 48, 0);
        composer3.endReplaceableGroup();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(modifier3, forwardContent, i, i2));
    }
}
