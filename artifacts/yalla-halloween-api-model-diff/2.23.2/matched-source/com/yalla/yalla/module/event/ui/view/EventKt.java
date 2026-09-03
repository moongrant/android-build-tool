package com.yalla.yalla.module.event.ui.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00O0;
import androidx.media3.session.o00O0O0;
import coil.annotation.ExperimentalCoilApi;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import io.agora.rtc.Constants;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p121o00O0Ooo.o0000;
import p193o00o0O0O.o0000oo;
import p205o00o0o0o.o000O;
import p207o00o0oO0.o0000O0;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p448o0OoOoo.o00O0OOO;
import p448o0OoOoo.oo0oOO0;
import p454o0Ooo000.OooOo00;
import p476o0OooooO.o0OOo000;
import p526o0o0OO0O.o000O0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.ooooO000;
import p606o0oo0O0o.o0O0O0o0;
import p606o0oo0O0o.o0O0OOOo;
import p644o0ooOOo.o;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.o0OOO00;
import p644o0ooOOo.oO000;
import p644o0ooOOo.oO000O0;
import p644o0ooOOo.oO0OoOO0;
import p644o0ooOOo.oO0o0o;
import p650o0ooo.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,784:1\n72#2,6:785\n78#2:819\n71#2,7:862\n78#2:897\n82#2:903\n82#2:917\n78#3,11:791\n78#3,11:829\n78#3,11:869\n91#3:902\n91#3:910\n91#3:916\n78#3,11:958\n91#3:993\n78#3,11:1011\n91#3:1044\n78#3,11:1059\n91#3:1093\n78#3,11:1109\n91#3:1143\n78#3,11:1158\n91#3:1192\n456#4,8:802\n464#4,3:816\n456#4,8:840\n464#4,3:854\n456#4,8:880\n464#4,3:894\n467#4,3:899\n467#4,3:907\n467#4,3:913\n25#4:922\n456#4,8:969\n464#4,3:983\n467#4,3:990\n25#4:998\n36#4:1005\n456#4,8:1022\n464#4,3:1036\n467#4,3:1041\n25#4:1049\n36#4:1056\n456#4,8:1070\n464#4,3:1084\n467#4,3:1090\n25#4:1099\n36#4:1106\n456#4,8:1120\n464#4,3:1134\n467#4,3:1140\n25#4:1148\n36#4:1155\n456#4,8:1169\n464#4,3:1183\n467#4,3:1189\n4144#5,6:810\n4144#5,6:848\n4144#5,6:888\n4144#5,6:977\n4144#5,6:1030\n4144#5,6:1078\n4144#5,6:1128\n4144#5,6:1177\n164#6:820\n154#6:821\n154#6:822\n154#6:858\n154#6:859\n154#6:860\n154#6:861\n154#6:898\n154#6:904\n154#6:905\n154#6:906\n164#6:912\n154#6:950\n154#6:951\n154#6:987\n154#6:988\n154#6:989\n154#6:995\n154#6:996\n154#6:997\n154#6:1040\n154#6:1046\n154#6:1047\n154#6:1048\n154#6:1088\n154#6:1089\n154#6:1096\n154#6:1097\n154#6:1098\n154#6:1138\n154#6:1139\n154#6:1145\n154#6:1146\n154#6:1147\n154#6:1187\n154#6:1188\n164#6:1194\n73#7,6:823\n79#7:857\n83#7:911\n73#7,6:952\n79#7:986\n83#7:994\n77#7,2:1057\n79#7:1087\n83#7:1094\n77#7,2:1107\n79#7:1137\n83#7:1144\n77#7,2:1156\n79#7:1186\n83#7:1193\n73#8,4:918\n77#8,20:929\n955#9,6:923\n1097#9,6:999\n1097#9,6:1050\n1097#9,6:1100\n1097#9,6:1149\n76#10:949\n76#10:1095\n67#11,5:1006\n72#11:1039\n76#11:1045\n1#12:1195\n81#13:1196\n107#13,2:1197\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt\n*L\n88#1:785,6\n88#1:819\n122#1:862,7\n122#1:897\n122#1:903\n88#1:917\n88#1:791,11\n102#1:829,11\n122#1:869,11\n122#1:902\n102#1:910\n88#1:916\n393#1:958,11\n393#1:993\n638#1:1011,11\n638#1:1044\n658#1:1059,11\n658#1:1093\n700#1:1109,11\n700#1:1143\n741#1:1158,11\n741#1:1192\n88#1:802,8\n88#1:816,3\n102#1:840,8\n102#1:854,3\n122#1:880,8\n122#1:894,3\n122#1:899,3\n102#1:907,3\n88#1:913,3\n165#1:922\n393#1:969,8\n393#1:983,3\n393#1:990,3\n645#1:998\n645#1:1005\n638#1:1022,8\n638#1:1036,3\n638#1:1041,3\n669#1:1049\n669#1:1056\n658#1:1070,8\n658#1:1084,3\n658#1:1090,3\n711#1:1099\n711#1:1106\n700#1:1120,8\n700#1:1134,3\n700#1:1140,3\n749#1:1148\n749#1:1155\n741#1:1169,8\n741#1:1183,3\n741#1:1189,3\n88#1:810,6\n102#1:848,6\n122#1:888,6\n393#1:977,6\n638#1:1030,6\n658#1:1078,6\n700#1:1128,6\n741#1:1177,6\n101#1:820\n105#1:821\n106#1:822\n109#1:858\n117#1:859\n118#1:860\n120#1:861\n131#1:898\n145#1:904\n147#1:905\n154#1:906\n156#1:912\n362#1:950\n363#1:951\n394#1:987\n399#1:988\n426#1:989\n640#1:995\n641#1:996\n642#1:997\n651#1:1040\n660#1:1046\n662#1:1047\n665#1:1048\n681#1:1088\n683#1:1089\n702#1:1096\n704#1:1097\n707#1:1098\n718#1:1138\n725#1:1139\n743#1:1145\n745#1:1146\n746#1:1147\n757#1:1187\n759#1:1188\n773#1:1194\n102#1:823,6\n102#1:857\n102#1:911\n393#1:952,6\n393#1:986\n393#1:994\n658#1:1057,2\n658#1:1087\n658#1:1094\n700#1:1107,2\n700#1:1137\n700#1:1144\n741#1:1156,2\n741#1:1186\n741#1:1193\n165#1:918,4\n165#1:929,20\n165#1:923,6\n645#1:999,6\n669#1:1050,6\n711#1:1100,6\n749#1:1149,6\n354#1:949\n699#1:1095\n638#1:1006,5\n638#1:1039\n638#1:1045\n309#1:1196\n309#1:1197,2\n*E\n"})
public final class EventKt {

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$4$1\n*L\n236#1:785\n237#1:786\n*E\n"})
    public static final class OooO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f23520OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OO o0oo) {
            super(1);
            this.f23520OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f23520OooO0Oo;
            float f = 12;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, Dp.m3775constructorimpl(f), 4);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, Dp.m3775constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f23521OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO o0oo) {
            super(1);
            this.f23521OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = this.f23521OooO0Oo;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$10$1\n*L\n333#1:785\n334#1:786\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f23522OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO o0oo) {
            super(1);
            this.f23522OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58049OooO0o;
            o0OO o0oo = this.f23522OooO0Oo;
            float f = 12;
            oO0OoOO0.OooO00o(oVar, o0oo.f58023OooO0Oo, Dp.m3775constructorimpl(f), 4);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, Dp.m3775constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$2\n*L\n202#1:785\n203#1:786\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f23523OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            float f = 12;
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, Dp.m3775constructorimpl(f), 4);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, Dp.m3775constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f23524OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OO o0oo) {
            super(1);
            this.f23524OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f23524OooO0Oo;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f23525OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$6\n*L\n263#1:785\n264#1:786\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f23526OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, Dp.m3775constructorimpl(12), 4);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, Dp.m3775constructorimpl(18), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$8$1\n*L\n306#1:785\n307#1:786\n*E\n"})
    public static final class OooOOO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f23527OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0OO o0oo) {
            super(1);
            this.f23527OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f23527OooO0Oo;
            float f = 12;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, Dp.m3775constructorimpl(f), 4);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, Dp.m3775constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23528OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventModel eventModel) {
            super(0);
            this.f23528OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            Intrinsics.checkNotNull(activityOooO0O0);
            o00OOOO0 o00oooo1 = new o00OOOO0(activityOooO0O0, false, false, true, true);
            o00oooo1.OooOOo0(new com.yalla.yalla.module.event.ui.view.OooO00o(this.f23528OooO0Oo));
            o00oooo1.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.EventKt$EventContent$1$9$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23529OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23530OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventModel eventModel, MutableState<Boolean> mutableState, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f23529OooO0Oo = eventModel;
            this.f23530OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f23529OooO0Oo, this.f23530OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f23530OooO0o0.setValue(Boolean.valueOf(this.f23529OooO0Oo.getEventState() == EventModel.State.INSTANCE.getInProgress()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23531OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23532OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(EventModel eventModel, int i) {
            super(2);
            this.f23531OooO0Oo = eventModel;
            this.f23532OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23532OooO0o0 | 1);
            EventKt.OooO0O0(this.f23531OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23533OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23534OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EventModel eventModel, int i) {
            super(2);
            this.f23533OooO0Oo = eventModel;
            this.f23534OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23534OooO0o0 | 1);
            EventKt.OooO00o(this.f23533OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f23535OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23536OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(EventModel eventModel) {
            super(0);
            this.f23536OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f23536OooO0Oo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomModel.websocketaddr = eventModel.getWebsocketaddr();
            p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f23538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f23539OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23540OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(int i, Context context, MutableState mutableState, EventModel eventModel) {
            super(2);
            this.f23537OooO0Oo = mutableState;
            this.f23539OooO0o0 = context;
            this.f23538OooO0o = eventModel;
            this.f23540OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23540OooO0oO | 1);
            Context context = this.f23539OooO0o0;
            EventModel eventModel = this.f23538OooO0o;
            EventKt.OooOO0o(this.f23537OooO0Oo, context, eventModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23541OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(Function0<Unit> function0) {
            super(0);
            this.f23541OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23541OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23542OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(Function0<Unit> function0) {
            super(0);
            this.f23542OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23542OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23543OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23544OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(int i, Function0 function0) {
            super(2);
            this.f23543OooO0Oo = function0;
            this.f23544OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23544OooO0o0 | 1);
            EventKt.OooO0oo(this.f23543OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23545OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(Function0<Unit> function0) {
            super(0);
            this.f23545OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23545OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f23546OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23547OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23548OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23549OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(RowScope rowScope, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f23546OooO0Oo = rowScope;
            this.f23548OooO0o0 = z;
            this.f23547OooO0o = function0;
            this.f23549OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23549OooO0oO | 1);
            boolean z = this.f23548OooO0o0;
            Function0<Unit> function0 = this.f23547OooO0o;
            EventKt.OooO(this.f23546OooO0Oo, z, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.EventKt$showAddToCalendarDialog$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23550OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f23551OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f23552OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f23553OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableState<Boolean> mutableState) {
                super(1);
                this.f23553OooO0Oo = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                bool.booleanValue();
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.event_add_calendar_success);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f23553OooO0Oo.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(MutableState<Boolean> mutableState, Context context, EventModel eventModel, Continuation<? super o00000OO> continuation) {
            super(2, continuation);
            this.f23550OooO0Oo = mutableState;
            this.f23552OooO0o0 = context;
            this.f23551OooO0o = eventModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000OO(this.f23550OooO0Oo, this.f23552OooO0o0, this.f23551OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<Boolean> mutableState = this.f23550OooO0Oo;
            if (mutableState.getValue().booleanValue()) {
                Context context = this.f23552OooO0o0;
                EventModel eventModel = this.f23551OooO0o;
                ooooO000.OooO00o(context, eventModel.getEventName(), eventModel.getEventDesc(), o0O0OOOo.OooO00o(eventModel.getEventStartTime()), o0O0OOOo.OooO00o(eventModel.getEventEndTime()), new OooO00o(mutableState));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$showAddToCalendarDialog$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,784:1\n154#2:785\n154#2:821\n154#2:822\n154#2:830\n154#2:831\n154#2:832\n154#2:833\n154#2:834\n154#2:835\n154#2:836\n154#2:851\n154#2:887\n154#2:895\n164#2:896\n154#2:904\n154#2:931\n154#2:932\n154#2:933\n154#2:973\n72#3,6:786\n78#3:820\n82#3:978\n78#4,11:792\n78#4,11:858\n91#4:929\n78#4,11:939\n91#4:971\n91#4:977\n456#5,8:803\n464#5,3:817\n36#5:823\n25#5:837\n36#5:844\n456#5,8:869\n464#5,3:883\n36#5:888\n36#5:897\n50#5:918\n49#5:919\n467#5,3:926\n456#5,8:950\n464#5,3:964\n467#5,3:968\n467#5,3:974\n4144#6,6:811\n4144#6,6:877\n4144#6,6:958\n1097#7,6:824\n1097#7,6:838\n1097#7,6:845\n1097#7,6:889\n1097#7,6:898\n1097#7,6:920\n73#8,6:852\n79#8:886\n83#8:930\n1098#9:905\n927#9,6:906\n927#9,6:912\n67#10,5:934\n72#10:967\n76#10:972\n81#11:979\n107#11,2:980\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$showAddToCalendarDialog$2\n*L\n480#1:785\n487#1:821\n488#1:822\n498#1:830\n499#1:831\n502#1:832\n507#1:833\n509#1:834\n514#1:835\n516#1:836\n525#1:851\n533#1:887\n545#1:895\n547#1:896\n560#1:904\n584#1:931\n588#1:932\n589#1:933\n630#1:973\n475#1:786,6\n475#1:820\n475#1:978\n475#1:792,11\n522#1:858,11\n522#1:929\n585#1:939,11\n585#1:971\n475#1:977\n475#1:803,8\n475#1:817,3\n490#1:823\n517#1:837\n521#1:844\n522#1:869,8\n522#1:883,3\n534#1:888\n551#1:897\n573#1:918\n573#1:919\n522#1:926,3\n585#1:950,8\n585#1:964,3\n585#1:968,3\n475#1:974,3\n475#1:811,6\n522#1:877,6\n585#1:958,6\n490#1:824,6\n517#1:838,6\n521#1:845,6\n534#1:889,6\n551#1:898,6\n573#1:920,6\n522#1:852,6\n522#1:886\n522#1:930\n562#1:905\n563#1:906,6\n567#1:912,6\n585#1:934,5\n585#1:967\n585#1:972\n517#1:979\n517#1:980,2\n*E\n"})
    public static final class o0000Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23554OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f23555OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f23556OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(int i, Context context, MutableState mutableState, EventModel eventModel) {
            super(2);
            this.f23554OooO0Oo = mutableState;
            this.f23556OooO0o0 = context;
            this.f23555OooO0o = eventModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            MutableState mutableState;
            int i;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1529471952, iIntValue, -1, "com.yalla.yalla.module.event.ui.view.showAddToCalendarDialog.<anonymous> (Event.kt:474)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                long j = o0OOo000.f48135OooO0O0;
                float f = 15;
                Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(modifierFillMaxWidth$default, j, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null));
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM170backgroundbw27NRU);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_dialog_close, composer2, 0);
                float f2 = 14;
                float f3 = 23;
                Modifier modifierAlign = columnScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 0.0f, 9, null), Dp.m3775constructorimpl(f3)), companion2.getEnd());
                composer2.startReplaceableGroup(1157296644);
                MutableState<Boolean> mutableState2 = this.f23554OooO0Oo;
                boolean zChanged = composer2.changed(mutableState2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new com.yalla.yalla.module.event.ui.view.OooO0O0(mutableState2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierAlign, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_event_calendar, composer2, 0), (String) null, columnScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(9), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(115)), companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                androidx.compose.ui.semantics.OooO0O0.OooO0O0(f3, companion, composer2, 6);
                float f4 = 31;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.event_subscribe_successful, composer2, 0), PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 2, null), o0000oo.OooO0OO(composer2).f38616OooO, TextUnitKt.getSp(17), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                float f5 = 8;
                androidx.compose.ui.semantics.OooO0O0.OooO0O0(f5, companion, composer2, 6);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.event_subscribe_successful_desc, composer2, 0), PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 2, null), o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f4)), composer2, 6);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue2 == companion4.getEmpty()) {
                    p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                    Boolean bool = (Boolean) p475o0Ooooo0.o0O00oO0.OooOo00().getValue();
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue2;
                Observable<Object> observable = LiveEventBus.get("UPDATE_AUTO_ADD_TO_CALENDAR_STATE");
                Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(mutableState3);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new com.yalla.yalla.module.event.ui.view.OooO0OO(mutableState3);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                o00O0000.OooO00o(observable, (Observer) objRememberedValue3, composer2, 72);
                Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f4), 0.0f, 2, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composer2, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Boolean bool2 = (Boolean) mutableState3.getValue();
                Intrinsics.checkNotNullExpressionValue(bool2, "invoke$lambda$13$lambda$2(...)");
                if (bool2.booleanValue()) {
                    composer2.startReplaceableGroup(1613035637);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.account_delete_selected, composer2, 0);
                    Modifier modifierOooO00o = o00O0.OooO00o(f, companion, composer2, 1157296644);
                    boolean zChanged3 = composer2.changed(mutableState3);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == companion4.getEmpty()) {
                        objRememberedValue4 = new com.yalla.yalla.module.event.ui.view.OooO0o(mutableState3);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = mutableState3;
                    ImageKt.Image(painterPainterResource2, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierOooO00o, false, false, 0L, false, null, null, null, (Function0) objRememberedValue4, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                    i = 0;
                } else {
                    mutableState = mutableState3;
                    composer2.startReplaceableGroup(1613036367);
                    Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl((float) 0.5d), o0OOo000.f48226o0000oOO, RoundedCornerShapeKt.getCircleShape());
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged4 = composer2.changed(mutableState);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == companion4.getEmpty()) {
                        objRememberedValue5 = new com.yalla.yalla.module.event.ui.view.OooO(mutableState);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(modifierM182borderxT4_qwU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue5, 253);
                    i = 0;
                    SpacerKt.Spacer(modifierOooO0O0, composer2, 0);
                    composer2.endReplaceableGroup();
                }
                oo0oOO0.OooO00o(f5, companion, composer2, 6);
                String strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.message_theme_view_more, composer2, i);
                composer2.startReplaceableGroup(1613037372);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(i, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(o0000oo.OooO0OO(composer2).f38625OooOO0, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(p562o0oOo000.o000000.event_auto_add_calendar, composer2, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.pushStringAnnotation(strStringResource, "");
                    long j2 = o0OOo000.f48185Ooooo00;
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strStringResource);
                        builder.pop(iPushStyle2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged5 = composer2.changed(annotatedString) | composer2.changed(strStringResource);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == companion4.getEmpty()) {
                            objRememberedValue6 = new com.yalla.yalla.module.event.ui.view.OooOO0(annotatedString, strStringResource);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        ClickableTextKt.m741ClickableText4YKlhWE(annotatedString, null, null, false, 0, 0, null, (Function1) objRememberedValue6, composer2, 0, 126);
                        o000O.o0ooOOo.OooO00o(composer2);
                        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(12)), composer2, 6);
                        Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(41)), Dp.m3775constructorimpl(f4), 0.0f, 2, null), j2, RoundedCornerShapeKt.RoundedCornerShape(50)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.event.ui.view.OooOOO(this.f23556OooO0o0, this.f23555OooO0o, mutableState, mutableState2), 253);
                        Alignment center = companion2.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = r10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.event_subscribe_add_to_calendar, composer2, 0), (Modifier) null, j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
                        o000O.o0ooOOo.OooO00o(composer2);
                        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(25)), composer2, 6);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f23557OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23558OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23559OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23560OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(RowScope rowScope, int i, Function0<Unit> function0, int i2) {
            super(2);
            this.f23557OooO0Oo = rowScope;
            this.f23559OooO0o0 = i;
            this.f23558OooO0o = function0;
            this.f23560OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23560OooO0oO | 1);
            int i = this.f23559OooO0o0;
            Function0<Unit> function0 = this.f23558OooO0o;
            EventKt.OooO0oO(this.f23557OooO0Oo, i, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23561OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23562OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(EventModel eventModel, int i) {
            super(2);
            this.f23561OooO0Oo = eventModel;
            this.f23562OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23562OooO0o0 | 1);
            EventKt.OooO0OO(this.f23561OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<EventModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f23563OooO0Oo = new o00O0O();

        public o00O0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EventModel eventModel) {
            EventModel it = eventModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<EventModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f23564OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EventModel eventModel) {
            EventModel it = eventModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23565OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23566OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(EventModel eventModel, Function1 function1) {
            super(0);
            this.f23565OooO0Oo = function1;
            this.f23566OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23565OooO0Oo.invoke(this.f23566OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23567OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(EventModel eventModel) {
            super(0);
            this.f23567OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f23567OooO0Oo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomModel.websocketaddr = eventModel.getWebsocketaddr();
            p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23568OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(Function0<Unit> function0) {
            super(0);
            this.f23568OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23568OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f23569OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(Context context) {
            super(1);
            this.f23569OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.OooOO0O("svga/event_ongoing.svga", (LifecycleOwner) this.f23569OooO0Oo);
            sVGAView.OooOO0o();
            return sVGAView;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23570OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23571OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23572OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23573OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f23574OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OOO0o(EventModel eventModel, Function1<? super EventModel, Unit> function1, Function1<? super EventModel, Unit> function2, int i, int i2) {
            super(2);
            this.f23570OooO0Oo = eventModel;
            this.f23572OooO0o0 = function1;
            this.f23571OooO0o = function2;
            this.f23573OooO0oO = i;
            this.f23574OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            EventKt.OooO0o0(this.f23570OooO0Oo, this.f23572OooO0o0, this.f23571OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23573OooO0oO | 1), this.f23574OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23575OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(Function0<Unit> function0) {
            super(0);
            this.f23575OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23575OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f23576OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f23576OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            EventKt.OooO0Oo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f23576OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23578OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(EventModel eventModel, Function1 function1) {
            super(0);
            this.f23577OooO0Oo = function1;
            this.f23578OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23577OooO0Oo.invoke(this.f23578OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f23579OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f23580OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(EventModel eventModel, Function1 function1) {
            super(0);
            this.f23579OooO0Oo = function1;
            this.f23580OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23579OooO0Oo.invoke(this.f23580OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f23581OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23582OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23583OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(RowScope rowScope, Function0<Unit> function0, int i) {
            super(2);
            this.f23581OooO0Oo = rowScope;
            this.f23583OooO0o0 = function0;
            this.f23582OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23582OooO0o | 1);
            EventKt.OooO0o(this.f23581OooO0Oo, this.f23583OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO(@NotNull RowScope rowScope, boolean z, @NotNull Function0<Unit> subscribeRequest, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(subscribeRequest, "subscribeRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1357601782);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(subscribeRequest) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357601782, i2, -1, "com.yalla.yalla.module.event.ui.view.SubscribeEventButton (Event.kt:656)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 18;
            Modifier modifierOooO00o = o00O0O0.OooO00o(f, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(35)), 1.0f, false, 2, null));
            int i3 = o0OOo000.f48347o00OOooO;
            Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(modifierOooO00o, z ? o0OOo000.f48202o00000O0 : o0OOo000.f48185Ooooo00, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, o0OOo000.f48155OooOo0O, composerStartRestartGroup, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(subscribeRequest);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new o00000(subscribeRequest);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM202clickableO2vRcR0$default = ClickableKt.m202clickableO2vRcR0$default(modifierM170backgroundbw27NRU, mutableInteractionSource, indicationM1288rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableO2vRcR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(z ? p562o0oOo000.o0Oo0oo.ic_event_has_subscribe : p562o0oOo000.o0Oo0oo.ic_event_not_subscribe, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            oo0oOO0.OooO00o(8, companion, composer2, 6);
            String strStringResource = StringResources_androidKt.stringResource(z ? p562o0oOo000.o000000.event_has_subscribe : p562o0oOo000.o000000.event_not_subscribe, composer2, 0);
            long sp = TextUnitKt.getSp(15);
            composer2.startReplaceableGroup(552975929);
            long j = z ? o0000oo.OooO0OO(composer2).f38625OooOO0 : o0OOo000.f48135OooO0O0;
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000O0(rowScope, z, subscribeRequest, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull final EventModel eventModel, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-917241748);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917241748, i2, -1, "com.yalla.yalla.module.event.ui.view.EventContent (Event.kt:163)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO000O0();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO000O0 oo000o0 = (oO000O0) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo000o0, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.module.event.ui.view.EventKt$EventContent$$inlined$ConstraintLayout$1
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
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.event.ui.view.EventKt$EventContent$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    int i3;
                    EventModel eventModel2;
                    Continuation continuation;
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope3 = oooO00oOooO0OO.f4214OooO00o;
                        o0OO o0ooOooO0O1 = constraintLayoutScope3.OooO0O0();
                        o0OO o0ooOooO0O2 = constraintLayoutScope3.OooO0O0();
                        o0OO o0ooOooO0O3 = constraintLayoutScope3.OooO0O0();
                        composer3.startReplaceableGroup(-446210223);
                        EventModel eventModel3 = eventModel;
                        if (eventModel3.getEventState() == 1) {
                            float f = 3;
                            Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(SizeKt.m527sizeVpY3zN4(Modifier.INSTANCE, Dp.m3775constructorimpl(347), Dp.m3775constructorimpl(200)), Dp.m3775constructorimpl(f), o0OOo000.f48211o0000O0O, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16))), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(2), o0OOo000.f48224o0000oO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(14)));
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged = composer3.changed(o0ooOooO0O0);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new EventKt.OooO00o(o0ooOooO0O0);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(modifierM182borderxT4_qwU, o0ooOooO0O2, (Function1) objRememberedValue4);
                            i3 = 0;
                            SpacerKt.Spacer(modifierOooO00o, composer3, 0);
                        } else {
                            i3 = 0;
                        }
                        composer3.endReplaceableGroup();
                        o0000 o0000VarOooO0Oo = o000OO.OooO0Oo(eventModel3.getEventImage(), null, composer3, i3, 1);
                        ContentScale crop = ContentScale.INSTANCE.getCrop();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f2 = 12;
                        float f3 = 337;
                        ImageKt.Image(o0000VarOooO0Oo, (String) null, ConstraintLayoutScope.OooO00o(SizeKt.m527sizeVpY3zN4(SizeKt.fillMaxHeight$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), 0.0f, 1, null), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(FacebookRequestErrorClassification.EC_INVALID_TOKEN)), o0ooOooO0O0, EventKt.OooO0OO.f23523OooO0Oo), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m527sizeVpY3zN4(companion2, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(38)), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.mutableListOf(Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(o0OOo000.f48160OooOoo)), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 3, null), 0.0f, 4, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0ooOooO0O0);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new EventKt.OooO0o(o0ooOooO0O0);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        SpacerKt.Spacer(ConstraintLayoutScope.OooO00o(modifierBackground$default, o0ooOooO0O3, (Function1) objRememberedValue5), composer3, 0);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion3.getCenterVertically();
                        Modifier modifierOooO00o2 = OooOo00.OooO00o(6, BorderKt.m182borderxT4_qwU(BackgroundKt.m170backgroundbw27NRU(SizeKt.m511height3ABfNKs(companion2, Dp.m3775constructorimpl(23)), o0OOo000.f48157OooOoO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), Dp.m3775constructorimpl((float) 0.5d), o0OOo000.f48133OooO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), 0.0f, 2, null, composer3, 1157296644);
                        boolean zChanged3 = composer3.changed(o0ooOooO0O0);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new EventKt.OooO(o0ooOooO0O0);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOooO00o3 = ConstraintLayoutScope.OooO00o(modifierOooO00o2, o0ooOooO00o, (Function1) objRememberedValue6);
                        composer3.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composer3, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageKt.Image(o000OO.OooO0Oo(eventModel3.getEventTagIcon(), EventKt.OooOO0.f23525OooO0Oo, composer3, 48, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                        float f4 = 2;
                        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(f4)), composer3, 6);
                        String eventTag = eventModel3.getEventTag();
                        long j = o0OOo000.f48135OooO0O0;
                        long sp = TextUnitKt.getSp(12);
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        TextKt.m1261Text4IGK_g(eventTag, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 130546);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-446206995);
                        long creatorUserId = eventModel3.getCreatorUserId();
                        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                        Long l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                        if (l != null && creatorUserId == l.longValue()) {
                            eventModel2 = eventModel3;
                        } else {
                            eventModel2 = eventModel3;
                            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_more_event, composer3, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ConstraintLayoutScope.OooO00o(PaddingKt.m478padding3ABfNKs(BackgroundKt.m170backgroundbw27NRU(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(24)), o0OOo000.f48158OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3775constructorimpl(f4)), o0ooOooO0OO, EventKt.OooOO0O.f23526OooO0Oo), false, false, 0L, false, null, null, null, new EventKt.OooOOO0(eventModel3), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        }
                        r8.endReplaceableGroup();
                        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                        r8.startReplaceableGroup(1157296644);
                        boolean zChanged4 = r8.changed((Object) r9);
                        Object objRememberedValue7 = r8.rememberedValue();
                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new EventKt.OooOOO(r9);
                            r8.updateRememberedValue(objRememberedValue7);
                        }
                        r8.endReplaceableGroup();
                        Modifier modifierOooO00o4 = ConstraintLayoutScope.OooO00o(r7, o0ooOooO0Oo, (Function1) objRememberedValue7);
                        r8.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, r8, 48, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = r8.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o4);
                        if (!(r8.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        r8.startReusableNode();
                        if (r8.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            r8.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(r8);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(r8)), r8, 0);
                        r8.startReplaceableGroup(2058660585);
                        r8.startReplaceableGroup(-492369756);
                        Object objRememberedValue8 = r8.rememberedValue();
                        Composer.Companion companion6 = Composer.INSTANCE;
                        if (objRememberedValue8 == companion6.getEmpty()) {
                            continuation = null;
                            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(eventModel2.getEventState() == EventModel.State.INSTANCE.getInProgress()), null, 2, null);
                            r8.updateRememberedValue(objRememberedValue8);
                        } else {
                            continuation = null;
                        }
                        r8.endReplaceableGroup();
                        MutableState mutableState = (MutableState) objRememberedValue8;
                        EffectsKt.LaunchedEffect(Integer.valueOf(eventModel2.getEventState()), new EventKt.OooOOOO(eventModel2, mutableState, continuation), r8, 64);
                        IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(((Boolean) mutableState.getValue()).booleanValue() ? o0Oo0oo.ic_explore_event_live : o0Oo0oo.ic_event_time, r8, 0), (String) null, SizeKt.m525size3ABfNKs(r7, Dp.m3775constructorimpl(f2)), ((Boolean) mutableState.getValue()).booleanValue() ? o0OOo000.f48224o0000oO : j, r8, 440, 0);
                        float f5 = 4;
                        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(r7, Dp.m3775constructorimpl(f5)), r8, 6);
                        r8.startReplaceableGroup(236575755);
                        String strStringResource = ((Boolean) mutableState.getValue()).booleanValue() ? StringResources_androidKt.stringResource(o000000.Room_Event_Live_Now, r8, 0) : o0O0O0o0.OooO0o(eventModel2.getEventStartTime());
                        r8.endReplaceableGroup();
                        EventModel eventModel4 = eventModel2;
                        TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, ((Boolean) mutableState.getValue()).booleanValue() ? o0OOo000.f48224o0000oO : j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, r8, 3072, 0, 130546);
                        r8.endReplaceableGroup();
                        r8.endNode();
                        r8.endReplaceableGroup();
                        r8.endReplaceableGroup();
                        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
                        r8.startReplaceableGroup(1157296644);
                        boolean zChanged5 = r8.changed(o0ooOooO0O0);
                        Object objRememberedValue9 = r8.rememberedValue();
                        if (zChanged5 || objRememberedValue9 == companion6.getEmpty()) {
                            objRememberedValue9 = new EventKt.OooO0O0(o0ooOooO0O0);
                            r8.updateRememberedValue(objRememberedValue9);
                        }
                        r8.endReplaceableGroup();
                        Modifier modifierOooO00o5 = ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O1, (Function1) objRememberedValue9);
                        r8.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically3, r8, 48, -1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = r8.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o5);
                        if (!(r8.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        r8.startReusableNode();
                        if (r8.getInserting()) {
                            r8.createNode(constructor3);
                        } else {
                            r8.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(r8);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO0O2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(r8)), r8, 2058660585);
                        ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_time_remind, r8, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, r8, 440, 120);
                        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(f5)), r8, 6);
                        TextKt.m1261Text4IGK_g(String.valueOf(eventModel4.getEventNumber()), (Modifier) null, j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, r8, 3072, 0, 130546);
                        o0ooOOo.OooO00o(r8);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull EventModel eventModel, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1519618558);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1519618558, i2, -1, "com.yalla.yalla.module.event.ui.view.EventName (Event.kt:352)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(eventModel.getEventName(), PaddingKt.m480paddingVpY3zN4$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(3))), Dp.m3775constructorimpl(12), 0.0f, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalCoilApi
    public static final void OooO0OO(@NotNull EventModel eventModel, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1250970345);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1250970345, i2, -1, "com.yalla.yalla.module.event.ui.view.EventRoomInfoHeader (Event.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new Oooo000(eventModel), 253);
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
            float f = (float) 6.5d;
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierOooO00o = o00O0O0.OooO00o(3, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(10), 0.0f, 2, null));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f2 = 2;
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 6);
            float f3 = 8;
            ImageKt.Image(o000OO.OooO0OO(eventModel.getRoomImage(), Oooo0.f23535OooO0Oo, composerStartRestartGroup, 48, 0), (String) null, SizeKt.m525size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f3))), Dp.m3775constructorimpl(31)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f3)), composerStartRestartGroup, 6);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = o00O0OOO.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            String roomName = eventModel.getRoomName();
            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            long sp = TextUnitKt.getSp(12);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM3684getLefte0LSkKk = companion4.m3684getLefte0LSkKk();
            int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            TextUnitType.Companion companion5 = TextUnitType.INSTANCE;
            TextKt.m1261Text4IGK_g(roomName, SizeKt.m532widthInVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(iM3684getLefte0LSkKk), 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120176);
            TextKt.m1261Text4IGK_g(androidx.compose.ui.input.key.OooO00o.OooO00o("ID:", eventModel.getRoomIdx()), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130418);
            o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_event_number, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(4)), composer2, 6);
            TextKt.m1261Text4IGK_g(String.valueOf(eventModel.getRoomOnLineNumber()), (Modifier) null, o0000oo.OooO0OO(composer2).f38616OooO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3684getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer2, 6);
            OooO0Oo(composer2, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2146468670);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2146468670, i, -1, "com.yalla.yalla.module.event.ui.view.EventSpitLine (Event.kt:768)");
            }
            SpacerKt.Spacer(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl((float) 0.5d)), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull RowScope rowScope, @NotNull Function0<Unit> joinRequest, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(joinRequest, "joinRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1866467822);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(joinRequest) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1866467822, i2, -1, "com.yalla.yalla.module.event.ui.view.JoinEventButton (Event.kt:697)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = o00O0O0.OooO00o(18, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(35)), 1.0f, false, 2, null));
            int i3 = o0OOo000.f48347o00OOooO;
            Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(modifierOooO00o, o0OOo000.f48224o0000oO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(17)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, o0OOo000.f48155OooOo0O, composerStartRestartGroup, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(joinRequest);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new o0Oo0oo(joinRequest);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM202clickableO2vRcR0$default = ClickableKt.m202clickableO2vRcR0$default(modifierM170backgroundbw27NRU, mutableInteractionSource, indicationM1288rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableO2vRcR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-55222217);
            if (context instanceof FragmentActivity) {
                AndroidView_androidKt.AndroidView(new o0OO00O(context), SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(15)), null, composer2, 48, 4);
                oo0oOO0.OooO00o(8, companion, composer2, 6);
            }
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.event_join, composer2, 0), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(rowScope, joinRequest, i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void OooO0o0(@NotNull EventModel eventModel, @Nullable Function1<? super EventModel, Unit> function1, @Nullable Function1<? super EventModel, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Function1<? super EventModel, Unit> function3;
        int i4;
        Function1<? super EventModel, Unit> function4;
        int i5;
        Function1<? super EventModel, Unit> function5;
        Function1<? super EventModel, Unit> function6;
        Long l;
        boolean z;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        RowScopeInstance rowScopeInstance;
        float f;
        Function1<? super EventModel, Unit> function7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1497496277);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(eventModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                function3 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        function5 = o00O0O.f23563OooO0Oo;
                    } else {
                        function5 = function3;
                    }
                    if (i4 != 0) {
                        function6 = o00Oo0.f23564OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
                    }
                    long creatorUserId = eventModel.getCreatorUserId();
                    p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                    l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                    if (l == null && creatorUserId == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
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
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    f = 12;
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(533791732);
                    if (z || (z && eventModel.getEventState() == 1)) {
                        OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (!z && eventModel.getEventState() == 0) {
                        composerStartRestartGroup.startReplaceableGroup(533792025);
                        OooO0oO(rowScopeInstance, eventModel.getEventState(), new oo000o(eventModel, function5), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (eventModel.getEventState() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(533792205);
                        OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (z && eventModel.getEventState() == 0) {
                        composerStartRestartGroup.startReplaceableGroup(533792728);
                        OooO(rowScopeInstance, eventModel.getHasSubscribe(), new o0ooOOo(eventModel, function6), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function5 = function3;
                    function7 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function7, i, i2));
            }
            i3 |= 384;
            function4 = function2;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    function5 = o00O0O.f23563OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f23564OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
                }
                long creatorUserId2 = eventModel.getCreatorUserId();
                p475o0Ooooo0.o0O00oO0 o0o00oo2 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!z) {
                    if (eventModel.getEventState() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(533792205);
                        OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (z) {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
            } else {
                if (i6 != 0) {
                    function5 = o00O0O.f23563OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f23564OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
                }
                long creatorUserId3 = eventModel.getCreatorUserId();
                p475o0Ooooo0.o0O00oO0 o0o00oo3 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!z) {
                    if (eventModel.getEventState() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(533792205);
                        OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (z) {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function7, i, i2));
        }
        i3 |= 48;
        function3 = function1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    function5 = o00O0O.f23563OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f23564OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
                }
                long creatorUserId4 = eventModel.getCreatorUserId();
                p475o0Ooooo0.o0O00oO0 o0o00oo4 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default4);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!z) {
                    if (eventModel.getEventState() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(533792205);
                        OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (z) {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
            } else {
                if (i6 != 0) {
                    function5 = o00O0O.f23563OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f23564OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
                }
                long creatorUserId5 = eventModel.getCreatorUserId();
                p475o0Ooooo0.o0O00oO0 o0o00oo5 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default5);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO00o5, composerM1320constructorimpl, currentCompositionLocalMap5);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!z) {
                    if (eventModel.getEventState() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(533792205);
                        OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (z) {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(533792884);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function7, i, i2));
        }
        i3 |= 384;
        function4 = function2;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                function5 = o00O0O.f23563OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i4 != 0) {
                function6 = o00Oo0.f23564OooO0Oo;
            } else {
                function6 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
            }
            long creatorUserId6 = eventModel.getCreatorUserId();
            p475o0Ooooo0.o0O00oO0 o0o00oo6 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
            if (l == null) {
                z = false;
            } else {
                z = true;
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default6);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO00o6, composerM1320constructorimpl, currentCompositionLocalMap6);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            f = 12;
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(533791732);
            if (z) {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            } else {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!z) {
                if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else if (eventModel.getEventState() == 1) {
                composerStartRestartGroup.startReplaceableGroup(533792205);
                OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceableGroup(533792884);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(533792884);
                composerStartRestartGroup.endReplaceableGroup();
            }
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
        } else {
            if (i6 != 0) {
                function5 = o00O0O.f23563OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i4 != 0) {
                function6 = o00Oo0.f23564OooO0Oo;
            } else {
                function6 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497496277, i3, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:390)");
            }
            long creatorUserId7 = eventModel.getCreatorUserId();
            p475o0Ooooo0.o0O00oO0 o0o00oo7 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
            if (l == null) {
                z = false;
            } else {
                z = true;
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default7);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            f = 12;
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(533791732);
            if (z) {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            } else {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!z) {
                if (eventModel.getEventState() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(533792205);
                    OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(533792884);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else if (eventModel.getEventState() == 1) {
                composerStartRestartGroup.startReplaceableGroup(533792205);
                OooO0o(rowScopeInstance, new o00oO0o(eventModel), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceableGroup(533792884);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(533792884);
                composerStartRestartGroup.endReplaceableGroup();
            }
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function7, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(@NotNull RowScope rowScope, int i, @NotNull Function0<Unit> shareRequest, @Nullable Composer composer, int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(shareRequest, "shareRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-269998584);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(shareRequest) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-269998584, i3, -1, "com.yalla.yalla.module.event.ui.view.ShareEventButton (Event.kt:735)");
            }
            int i4 = o0OOo000.f48347o00OOooO;
            long j = i == 1 ? o0OOo000.f48224o0000oO : o0OOo000.f48185Ooooo00;
            int i5 = o0OOo000.f48347o00OOooO;
            long j2 = i == 1 ? o0OOo000.f48209o0000O0 : o0OOo000.f48188OooooOO;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 18;
            Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(o00O0O0.OooO00o(f, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(35)), 1.0f, false, 2, null)), Dp.m3775constructorimpl(1), j, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, j2, composerStartRestartGroup, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(shareRequest);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new o0O0O00(shareRequest);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM202clickableO2vRcR0$default = ClickableKt.m202clickableO2vRcR0$default(modifierM182borderxT4_qwU, mutableInteractionSource, indicationM1288rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableO2vRcR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_event_share_mine, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(19)), j, composer2, 440, 0);
            oo0oOO0.OooO00o(8, companion, composer2, 6);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.share, composer2, 0), (Modifier) null, j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(rowScope, i, shareRequest, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(@NotNull Function0<Unit> shareRequest, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(shareRequest, "shareRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(265907972);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(shareRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(265907972, i2, -1, "com.yalla.yalla.module.event.ui.view.ShareEventImage (Event.kt:636)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 18;
            Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(o00O0O0.OooO00o(f, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(35))), Dp.m3775constructorimpl(1), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
            Indication indicationM1288rememberRipple9IZ8Weo = RippleKt.m1288rememberRipple9IZ8Weo(false, 0.0f, o0OOo000.f48157OooOoO, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(shareRequest);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new o000000(shareRequest);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM202clickableO2vRcR0$default = ClickableKt.m202clickableO2vRcR0$default(modifierM182borderxT4_qwU, mutableInteractionSource, indicationM1288rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableO2vRcR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_event_share, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(23)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000O(i, shareRequest));
    }

    public static final void OooOO0(@NotNull Context context, boolean z, @NotNull Function0<Unit> subscribeRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subscribeRequest, "subscribeRequest");
        if (!z) {
            subscribeRequest.invoke();
            return;
        }
        o000O o000o = new o000O(context);
        o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.event_unSubscribe_content));
        o000o.OooOo(true);
        o000o.OooOOOO(p562o0oOo000.o000000.event_unSubscribe_confirm);
        o000o.OooOo0(new o00000O(subscribeRequest));
        o000o.OooOO0o();
    }

    public static final void OooOO0O(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            ShareContentType shareContentType = ShareContentType.Events;
            o000O0o o000o0o2 = new o000O0o((FragmentActivity) activityOooO0O0, shareContentType);
            ShareContentModel shareContentModel = new ShareContentModel(shareContentType);
            shareContentModel.setEvent(eventModel);
            o000o0o2.f53324OooOOo0 = shareContentModel;
            o000o0o2.OooO();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0o(@NotNull MutableState<Boolean> isShow, @NotNull Context context, @NotNull EventModel eventModel, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(isShow, "isShow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-814424962);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-814424962, i, -1, "com.yalla.yalla.module.event.ui.view.showAddToCalendarDialog (Event.kt:449)");
        }
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(p475o0Ooooo0.o0O00oO0.OooOo00().getValue(), Boolean.TRUE) && isShow.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(454484471);
            if (Build.VERSION.SDK_INT >= 24) {
                EffectsKt.LaunchedEffect(isShow.getValue(), new o00000OO(isShow, context, eventModel, null), composerStartRestartGroup, 64);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(454485233);
            composer2 = composerStartRestartGroup;
            o0000O0.OooO00o(isShow, false, false, null, null, 80, p562o0oOo000.o000000O.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1529471952, true, new o0000Ooo(i, context, isShow, eventModel)), composerStartRestartGroup, (i & 14) | 100859904, 158);
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000(i, context, isShow, eventModel));
    }
}
