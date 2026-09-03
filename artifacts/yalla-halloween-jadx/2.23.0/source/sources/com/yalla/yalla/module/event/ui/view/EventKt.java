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
import coil.annotation.ExperimentalCoilApi;
import com.android.billingclient.api.o000;
import com.android.billingclient.api.o000Oo0;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o0O0O00;
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
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o0000O0;
import p186o00o00oO.o00O00o0;
import p417o0OoO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p442o0OoOoO0.oo0O;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p519o0o0O0oO.o0O0o000;
import p579o0oOoo.oO000;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p601o0oo0O0.o0000oo;
import p601o0oo0O0.o000OO;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.o0OOo000;
import p642o0ooOOo.o0OOooO0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,784:1\n72#2,6:785\n78#2:819\n71#2,7:862\n78#2:897\n82#2:903\n82#2:917\n78#3,11:791\n78#3,11:829\n78#3,11:869\n91#3:902\n91#3:910\n91#3:916\n78#3,11:958\n91#3:993\n78#3,11:1011\n91#3:1044\n78#3,11:1059\n91#3:1093\n78#3,11:1109\n91#3:1143\n78#3,11:1158\n91#3:1192\n456#4,8:802\n464#4,3:816\n456#4,8:840\n464#4,3:854\n456#4,8:880\n464#4,3:894\n467#4,3:899\n467#4,3:907\n467#4,3:913\n25#4:922\n456#4,8:969\n464#4,3:983\n467#4,3:990\n25#4:998\n36#4:1005\n456#4,8:1022\n464#4,3:1036\n467#4,3:1041\n25#4:1049\n36#4:1056\n456#4,8:1070\n464#4,3:1084\n467#4,3:1090\n25#4:1099\n36#4:1106\n456#4,8:1120\n464#4,3:1134\n467#4,3:1140\n25#4:1148\n36#4:1155\n456#4,8:1169\n464#4,3:1183\n467#4,3:1189\n4144#5,6:810\n4144#5,6:848\n4144#5,6:888\n4144#5,6:977\n4144#5,6:1030\n4144#5,6:1078\n4144#5,6:1128\n4144#5,6:1177\n164#6:820\n154#6:821\n154#6:822\n154#6:858\n154#6:859\n154#6:860\n154#6:861\n154#6:898\n154#6:904\n154#6:905\n154#6:906\n164#6:912\n154#6:950\n154#6:951\n154#6:987\n154#6:988\n154#6:989\n154#6:995\n154#6:996\n154#6:997\n154#6:1040\n154#6:1046\n154#6:1047\n154#6:1048\n154#6:1088\n154#6:1089\n154#6:1096\n154#6:1097\n154#6:1098\n154#6:1138\n154#6:1139\n154#6:1145\n154#6:1146\n154#6:1147\n154#6:1187\n154#6:1188\n164#6:1194\n73#7,6:823\n79#7:857\n83#7:911\n73#7,6:952\n79#7:986\n83#7:994\n77#7,2:1057\n79#7:1087\n83#7:1094\n77#7,2:1107\n79#7:1137\n83#7:1144\n77#7,2:1156\n79#7:1186\n83#7:1193\n73#8,4:918\n77#8,20:929\n955#9,6:923\n1097#9,6:999\n1097#9,6:1050\n1097#9,6:1100\n1097#9,6:1149\n76#10:949\n76#10:1095\n67#11,5:1006\n72#11:1039\n76#11:1045\n1#12:1195\n81#13:1196\n107#13,2:1197\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt\n*L\n88#1:785,6\n88#1:819\n122#1:862,7\n122#1:897\n122#1:903\n88#1:917\n88#1:791,11\n102#1:829,11\n122#1:869,11\n122#1:902\n102#1:910\n88#1:916\n393#1:958,11\n393#1:993\n638#1:1011,11\n638#1:1044\n658#1:1059,11\n658#1:1093\n700#1:1109,11\n700#1:1143\n741#1:1158,11\n741#1:1192\n88#1:802,8\n88#1:816,3\n102#1:840,8\n102#1:854,3\n122#1:880,8\n122#1:894,3\n122#1:899,3\n102#1:907,3\n88#1:913,3\n165#1:922\n393#1:969,8\n393#1:983,3\n393#1:990,3\n645#1:998\n645#1:1005\n638#1:1022,8\n638#1:1036,3\n638#1:1041,3\n669#1:1049\n669#1:1056\n658#1:1070,8\n658#1:1084,3\n658#1:1090,3\n711#1:1099\n711#1:1106\n700#1:1120,8\n700#1:1134,3\n700#1:1140,3\n749#1:1148\n749#1:1155\n741#1:1169,8\n741#1:1183,3\n741#1:1189,3\n88#1:810,6\n102#1:848,6\n122#1:888,6\n393#1:977,6\n638#1:1030,6\n658#1:1078,6\n700#1:1128,6\n741#1:1177,6\n101#1:820\n105#1:821\n106#1:822\n109#1:858\n117#1:859\n118#1:860\n120#1:861\n131#1:898\n145#1:904\n147#1:905\n154#1:906\n156#1:912\n362#1:950\n363#1:951\n394#1:987\n399#1:988\n426#1:989\n640#1:995\n641#1:996\n642#1:997\n651#1:1040\n660#1:1046\n662#1:1047\n665#1:1048\n681#1:1088\n683#1:1089\n702#1:1096\n704#1:1097\n707#1:1098\n718#1:1138\n725#1:1139\n743#1:1145\n745#1:1146\n746#1:1147\n757#1:1187\n759#1:1188\n773#1:1194\n102#1:823,6\n102#1:857\n102#1:911\n393#1:952,6\n393#1:986\n393#1:994\n658#1:1057,2\n658#1:1087\n658#1:1094\n700#1:1107,2\n700#1:1137\n700#1:1144\n741#1:1156,2\n741#1:1186\n741#1:1193\n165#1:918,4\n165#1:929,20\n165#1:923,6\n645#1:999,6\n669#1:1050,6\n711#1:1100,6\n749#1:1149,6\n354#1:949\n699#1:1095\n638#1:1006,5\n638#1:1039\n638#1:1045\n309#1:1196\n309#1:1197,2\n*E\n"})
public final class EventKt {

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$4$1\n*L\n236#1:785\n237#1:786\n*E\n"})
    public static final class OooO extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23987OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23987OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOo000 o0ooo001 = constrainAs.f59521OooO0Oo;
            o0OO0O0 o0oo0o1 = this.f23987OooO0Oo;
            float f = 12;
            o000Oo0.OooO0OO(o0ooo001, o0oo0o1.f59540OooO0O0, Dp.m3765constructorimpl(f), 4);
            o000.OooO00o(constrainAs.f59523OooO0o0, o0oo0o1.f59541OooO0OO, Dp.m3765constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23988OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23988OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOooO0 o0ooooo0 = constrainAs.f59523OooO0o0;
            o0OO0O0 o0oo0o1 = this.f23988OooO0Oo;
            o000.OooO00o(o0ooooo0, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$10$1\n*L\n333#1:785\n334#1:786\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23989OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23989OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOo000 o0ooo001 = constrainAs.f59522OooO0o;
            o0OO0O0 o0oo0o1 = this.f23989OooO0Oo;
            float f = 12;
            o000Oo0.OooO0OO(o0ooo001, o0oo0o1.f59542OooO0Oo, Dp.m3765constructorimpl(f), 4);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, Dp.m3765constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$2\n*L\n202#1:785\n203#1:786\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f23990OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOooO0 o0ooooo0 = constrainAs.f59523OooO0o0;
            o0OO0O0 o0oo0o1 = constrainAs.f59520OooO0OO;
            o000.OooO00o(o0ooooo0, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            float f = 12;
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, Dp.m3765constructorimpl(f), 4);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, Dp.m3765constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23991OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23991OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOo000 o0ooo001 = constrainAs.f59521OooO0Oo;
            o0OO0O0 o0oo0o1 = this.f23991OooO0Oo;
            o000Oo0.OooO0OO(o0ooo001, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f23992OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$6\n*L\n263#1:785\n264#1:786\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f23993OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOooO0 o0ooooo0 = constrainAs.f59523OooO0o0;
            o0OO0O0 o0oo0o1 = constrainAs.f59520OooO0OO;
            o000.OooO00o(o0ooooo0, o0oo0o1.f59541OooO0OO, Dp.m3765constructorimpl(12), 4);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, Dp.m3765constructorimpl(18), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,784:1\n154#2:785\n154#2:786\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$EventContent$1$8$1\n*L\n306#1:785\n307#1:786\n*E\n"})
    public static final class OooOOO extends Lambda implements Function1<o0OO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f23994OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0OO0O0 o0oo0o1) {
            super(1);
            this.f23994OooO0Oo = o0oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0 o0oo1) {
            o0OO0 constrainAs = o0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOo000 o0ooo001 = constrainAs.f59521OooO0Oo;
            o0OO0O0 o0oo0o1 = this.f23994OooO0Oo;
            float f = 12;
            o000Oo0.OooO0OO(o0ooo001, o0oo0o1.f59540OooO0O0, Dp.m3765constructorimpl(f), 4);
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59543OooO0o0, Dp.m3765constructorimpl(f), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23995OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventModel eventModel) {
            super(0);
            this.f23995OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            Intrinsics.checkNotNull(activityOooO0O0);
            o0O0o000 o0o0o000 = new o0O0o000(activityOooO0O0, false, false, true, true);
            o0o0o000.OooOOo0(new com.yalla.yalla.module.event.ui.view.OooO00o(this.f23995OooO0Oo));
            o0o0o000.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.EventKt$EventContent$1$9$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23996OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23997OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventModel eventModel, MutableState<Boolean> mutableState, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f23996OooO0Oo = eventModel;
            this.f23997OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f23996OooO0Oo, this.f23997OooO0o0, continuation);
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
            this.f23997OooO0o0.setValue(Boolean.valueOf(this.f23996OooO0Oo.getEventState() == EventModel.State.INSTANCE.getInProgress()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f23998OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23999OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(EventModel eventModel, int i) {
            super(2);
            this.f23998OooO0Oo = eventModel;
            this.f23999OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23999OooO0o0 | 1);
            EventKt.OooO0O0(this.f23998OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f24000OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24001OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EventModel eventModel, int i) {
            super(2);
            this.f24000OooO0Oo = eventModel;
            this.f24001OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24001OooO0o0 | 1);
            EventKt.OooO00o(this.f24000OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f24002OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f24003OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(EventModel eventModel) {
            super(0);
            this.f24003OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f24003OooO0Oo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomModel.websocketaddr = eventModel.getWebsocketaddr();
            p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24004OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f24005OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f24006OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24007OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(int i, Context context, MutableState mutableState, EventModel eventModel) {
            super(2);
            this.f24004OooO0Oo = mutableState;
            this.f24006OooO0o0 = context;
            this.f24005OooO0o = eventModel;
            this.f24007OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24007OooO0oO | 1);
            Context context = this.f24006OooO0o0;
            EventModel eventModel = this.f24005OooO0o;
            EventKt.OooOO0o(this.f24004OooO0Oo, context, eventModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24008OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(Function0<Unit> function0) {
            super(0);
            this.f24008OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24008OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24009OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(Function0<Unit> function0) {
            super(0);
            this.f24009OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24009OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24011OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(int i, Function0 function0) {
            super(2);
            this.f24010OooO0Oo = function0;
            this.f24011OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24011OooO0o0 | 1);
            EventKt.OooO0oo(this.f24010OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24012OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(Function0<Unit> function0) {
            super(0);
            this.f24012OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24012OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f24013OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24014OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24015OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24016OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(RowScope rowScope, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f24013OooO0Oo = rowScope;
            this.f24015OooO0o0 = z;
            this.f24014OooO0o = function0;
            this.f24016OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24016OooO0oO | 1);
            boolean z = this.f24015OooO0o0;
            Function0<Unit> function0 = this.f24014OooO0o;
            EventKt.OooO(this.f24013OooO0Oo, z, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.EventKt$showAddToCalendarDialog$1", f = "Event.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f24018OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f24019OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f24020OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableState<Boolean> mutableState) {
                super(1);
                this.f24020OooO0Oo = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                bool.booleanValue();
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.event_add_calendar_success);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f24020OooO0Oo.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(MutableState<Boolean> mutableState, Context context, EventModel eventModel, Continuation<? super o00000OO> continuation) {
            super(2, continuation);
            this.f24017OooO0Oo = mutableState;
            this.f24019OooO0o0 = context;
            this.f24018OooO0o = eventModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000OO(this.f24017OooO0Oo, this.f24019OooO0o0, this.f24018OooO0o, continuation);
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
            MutableState<Boolean> mutableState = this.f24017OooO0Oo;
            if (mutableState.getValue().booleanValue()) {
                Context context = this.f24019OooO0o0;
                EventModel eventModel = this.f24018OooO0o;
                oO000.OooO00o(context, eventModel.getEventName(), eventModel.getEventDesc(), o000OO.OooO00o(eventModel.getEventStartTime()), o000OO.OooO00o(eventModel.getEventEndTime()), new OooO00o(mutableState));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$showAddToCalendarDialog$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,784:1\n154#2:785\n154#2:821\n154#2:822\n154#2:830\n154#2:831\n154#2:832\n154#2:833\n154#2:834\n154#2:835\n154#2:836\n154#2:844\n154#2:880\n154#2:888\n164#2:889\n154#2:897\n154#2:924\n154#2:925\n154#2:926\n154#2:966\n72#3,6:786\n78#3:820\n82#3:971\n78#4,11:792\n78#4,11:851\n91#4:922\n78#4,11:932\n91#4:964\n91#4:970\n456#5,8:803\n464#5,3:817\n36#5:823\n25#5:837\n456#5,8:862\n464#5,3:876\n36#5:881\n36#5:890\n50#5:911\n49#5:912\n467#5,3:919\n456#5,8:943\n464#5,3:957\n467#5,3:961\n467#5,3:967\n4144#6,6:811\n4144#6,6:870\n4144#6,6:951\n1097#7,6:824\n1097#7,6:838\n1097#7,6:882\n1097#7,6:891\n1097#7,6:913\n73#8,6:845\n79#8:879\n83#8:923\n1098#9:898\n927#9,6:899\n927#9,6:905\n67#10,5:927\n72#10:960\n76#10:965\n81#11:972\n107#11,2:973\n*S KotlinDebug\n*F\n+ 1 Event.kt\ncom/yalla/yalla/module/event/ui/view/EventKt$showAddToCalendarDialog$2\n*L\n480#1:785\n487#1:821\n488#1:822\n498#1:830\n499#1:831\n502#1:832\n507#1:833\n509#1:834\n514#1:835\n516#1:836\n525#1:844\n533#1:880\n545#1:888\n547#1:889\n560#1:897\n584#1:924\n588#1:925\n589#1:926\n630#1:966\n475#1:786,6\n475#1:820\n475#1:971\n475#1:792,11\n522#1:851,11\n522#1:922\n585#1:932,11\n585#1:964\n475#1:970\n475#1:803,8\n475#1:817,3\n490#1:823\n517#1:837\n522#1:862,8\n522#1:876,3\n534#1:881\n551#1:890\n573#1:911\n573#1:912\n522#1:919,3\n585#1:943,8\n585#1:957,3\n585#1:961,3\n475#1:967,3\n475#1:811,6\n522#1:870,6\n585#1:951,6\n490#1:824,6\n517#1:838,6\n534#1:882,6\n551#1:891,6\n573#1:913,6\n522#1:845,6\n522#1:879\n522#1:923\n562#1:898\n563#1:899,6\n567#1:905,6\n585#1:927,5\n585#1:960\n585#1:965\n517#1:972\n517#1:973,2\n*E\n"})
    public static final class o0000Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24021OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f24022OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f24023OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(int i, Context context, MutableState mutableState, EventModel eventModel) {
            super(2);
            this.f24021OooO0Oo = mutableState;
            this.f24023OooO0o0 = context;
            this.f24022OooO0o = eventModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Modifier.Companion companion;
            int i;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1529471952, iIntValue, -1, "com.yalla.yalla.module.event.ui.view.showAddToCalendarDialog.<anonymous> (Event.kt:473)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                long j = o0oO0O0o.f46946OooO0O0;
                float f = 15;
                Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierFillMaxWidth$default, j, RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null));
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_dialog_close, composer2, 0);
                float f2 = 14;
                float f3 = 23;
                Modifier modifierAlign = columnScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 0.0f, 9, null), Dp.m3765constructorimpl(f3)), companion3.getEnd());
                composer2.startReplaceableGroup(1157296644);
                MutableState<Boolean> mutableState = this.f24021OooO0Oo;
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new com.yalla.yalla.module.event.ui.view.OooO0O0(mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierAlign, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_calendar, composer2, 0), (String) null, columnScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, Dp.m3765constructorimpl(9), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(115)), companion3.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                p150o00Oo0oO.o00000O.OooO00o(f3, companion2, composer2, 6);
                float f4 = 31;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_subscribe_successful, composer2, 0), PaddingKt.m478paddingVpY3zN4$default(companion2, Dp.m3765constructorimpl(f4), 0.0f, 2, null), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(17), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                float f5 = 8;
                p150o00Oo0oO.o00000O.OooO00o(f5, companion2, composer2, 6);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_subscribe_successful_desc, composer2, 0), PaddingKt.m478paddingVpY3zN4$default(companion2, Dp.m3765constructorimpl(f4), 0.0f, 2, null), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f4)), composer2, 6);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objRememberedValue2 == companion5.getEmpty()) {
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    Boolean bool = (Boolean) p464o0Oooo.o000000O.OooOo00().getValue();
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                Observable<Object> observable = LiveEventBus.get("UPDATE_AUTO_ADD_TO_CALENDAR_STATE");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.UPDATE_AUTO_ADD_TO_CALENDAR_STATE)");
                p417o0OoO0.o00000O.OooO00o(observable, new com.yalla.yalla.module.event.ui.view.OooO0OO(mutableState2), composer2, 8);
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3765constructorimpl(f4), 0.0f, 2, null);
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composer2, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Boolean autoAddCalendar = (Boolean) mutableState2.getValue();
                Intrinsics.checkNotNullExpressionValue(autoAddCalendar, "autoAddCalendar");
                if (autoAddCalendar.booleanValue()) {
                    composer2.startReplaceableGroup(1613035637);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oO00OOO.account_delete_selected, composer2, 0);
                    Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(f, companion2, composer2, 1157296644);
                    boolean zChanged2 = composer2.changed(mutableState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion5.getEmpty()) {
                        objRememberedValue3 = new com.yalla.yalla.module.event.ui.view.OooO0o(mutableState2);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource2, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierOooO00o, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                    i = 0;
                    companion = companion2;
                } else {
                    composer2.startReplaceableGroup(1613036367);
                    companion = companion2;
                    Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl((float) 0.5d), o0oO0O0o.f47034o0000o0o, RoundedCornerShapeKt.getCircleShape());
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged3 = composer2.changed(mutableState2);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == companion5.getEmpty()) {
                        objRememberedValue4 = new com.yalla.yalla.module.event.ui.view.OooO(mutableState2);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    SpacerKt.Spacer(com.code.android.util.o0O0O00.OooO0O0(modifierM180borderxT4_qwU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue4, 253), composer2, 0);
                    composer2.endReplaceableGroup();
                    i = 0;
                }
                oo0O.OooO00o(f5, companion, composer2, 6);
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.message_theme_view_more, composer2, i);
                composer2.startReplaceableGroup(1613037372);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(i, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37710OooOO0, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(oO00OOo0.event_auto_add_calendar, composer2, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.pushStringAnnotation(strStringResource, "");
                    long j2 = o0oO0O0o.f46993OoooOo0;
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strStringResource);
                        builder.pop(iPushStyle2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged4 = composer2.changed(annotatedString) | composer2.changed(strStringResource);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == companion5.getEmpty()) {
                            objRememberedValue5 = new com.yalla.yalla.module.event.ui.view.OooOO0(annotatedString, strStringResource);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        Function1 function1 = (Function1) objRememberedValue5;
                        Modifier.Companion companion6 = companion;
                        ClickableTextKt.m739ClickableText4YKlhWE(annotatedString, null, null, false, 0, 0, null, function1, composer2, 0, 126);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion6, Dp.m3765constructorimpl(12)), composer2, 6);
                        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(PaddingKt.m478paddingVpY3zN4$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m3765constructorimpl(41)), Dp.m3765constructorimpl(f4), 0.0f, 2, null), j2, RoundedCornerShapeKt.RoundedCornerShape(50)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.event.ui.view.OooOOO(this.f24023OooO0o0, this.f24022OooO0o, mutableState2, mutableState), 253);
                        Alignment center = companion3.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = r15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_subscribe_add_to_calendar, composer2, 0), (Modifier) null, j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                        SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion6, Dp.m3765constructorimpl(25)), composer2, 6);
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
        public final /* synthetic */ RowScope f24024OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24025OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24026OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24027OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(RowScope rowScope, int i, Function0<Unit> function0, int i2) {
            super(2);
            this.f24024OooO0Oo = rowScope;
            this.f24026OooO0o0 = i;
            this.f24025OooO0o = function0;
            this.f24027OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24027OooO0oO | 1);
            int i = this.f24026OooO0o0;
            Function0<Unit> function0 = this.f24025OooO0o;
            EventKt.OooO0oO(this.f24024OooO0Oo, i, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f24028OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24029OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(EventModel eventModel, int i) {
            super(2);
            this.f24028OooO0Oo = eventModel;
            this.f24029OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24029OooO0o0 | 1);
            EventKt.OooO0OO(this.f24028OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<EventModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f24030OooO0Oo = new o00O0O();

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
        public static final o00Oo0 f24031OooO0Oo = new o00Oo0();

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
        public final /* synthetic */ Function1<EventModel, Unit> f24032OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f24033OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(EventModel eventModel, Function1 function1) {
            super(0);
            this.f24032OooO0Oo = function1;
            this.f24033OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24032OooO0Oo.invoke(this.f24033OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f24034OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(EventModel eventModel) {
            super(0);
            this.f24034OooO0Oo = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            RoomModel roomModel = new RoomModel();
            EventModel eventModel = this.f24034OooO0Oo;
            roomModel.setId(eventModel.getRoomId());
            roomModel.setImage(eventModel.getRoomImage());
            roomModel.setName(eventModel.getRoomName());
            roomModel.setRoomIp(eventModel.getRoomServerIP());
            roomModel.websocketaddr = eventModel.getWebsocketaddr();
            p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.EventList);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24035OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(Function0<Unit> function0) {
            super(0);
            this.f24035OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24035OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f24036OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(Context context) {
            super(1);
            this.f24036OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.OooOO0O("svga/event_ongoing.svga", (LifecycleOwner) this.f24036OooO0Oo);
            sVGAView.OooOO0o();
            return sVGAView;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f24037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f24038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f24039OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24040OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f24041OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OOO0o(EventModel eventModel, Function1<? super EventModel, Unit> function1, Function1<? super EventModel, Unit> function2, int i, int i2) {
            super(2);
            this.f24037OooO0Oo = eventModel;
            this.f24039OooO0o0 = function1;
            this.f24038OooO0o = function2;
            this.f24040OooO0oO = i;
            this.f24041OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            EventKt.OooO0o0(this.f24037OooO0Oo, this.f24039OooO0o0, this.f24038OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24040OooO0oO | 1), this.f24041OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24042OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(Function0<Unit> function0) {
            super(0);
            this.f24042OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24042OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f24043OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f24043OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            EventKt.OooO0Oo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f24043OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f24044OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f24045OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(EventModel eventModel, Function1 function1) {
            super(0);
            this.f24044OooO0Oo = function1;
            this.f24045OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24044OooO0Oo.invoke(this.f24045OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<EventModel, Unit> f24046OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f24047OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(EventModel eventModel, Function1 function1) {
            super(0);
            this.f24046OooO0Oo = function1;
            this.f24047OooO0o0 = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24046OooO0Oo.invoke(this.f24047OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f24048OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24049OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24050OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(RowScope rowScope, Function0<Unit> function0, int i) {
            super(2);
            this.f24048OooO0Oo = rowScope;
            this.f24050OooO0o0 = function0;
            this.f24049OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24049OooO0o | 1);
            EventKt.OooO0o(this.f24048OooO0Oo, this.f24050OooO0o0, composer, iUpdateChangedFlags);
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
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(f, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(35)), 1.0f, false, 2, null));
            int i3 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierOooO0O0, z ? o0oO0O0o.f47010o000000O : o0oO0O0o.f46993OoooOo0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, o0oO0O0o.f46966OooOo0O, composerStartRestartGroup, 0, 3);
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
            Modifier modifierM200clickableO2vRcR0$default = ClickableKt.m200clickableO2vRcR0$default(modifierM168backgroundbw27NRU, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM200clickableO2vRcR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(z ? oOo00OO0.ic_event_has_subscribe : oOo00OO0.ic_event_not_subscribe, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            oo0O.OooO00o(8, companion, composer2, 6);
            String strStringResource = StringResources_androidKt.stringResource(z ? oO00OOo0.event_has_subscribe : oO00OOo0.event_not_subscribe, composer2, 0);
            long sp = TextUnitKt.getSp(15);
            composer2.startReplaceableGroup(552975929);
            long j = z ? p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37710OooOO0 : o0oO0O0o.f46946OooO0O0;
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
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
                ComposerKt.traceEventStart(-917241748, i, -1, "com.yalla.yalla.module.event.ui.view.EventContent (Event.kt:163)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00000 = (oO00000) objRememberedValue;
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
            Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo00000, composerStartRestartGroup);
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
                    oO0000Oo.OooO00o(semantics, oo00000);
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
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO0O0 o0oo0o0OooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope3 = oooO00oOooO0OO.f4208OooO00o;
                        o0OO0O0 o0oo0o0OooO0O1 = constraintLayoutScope3.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0O2 = constraintLayoutScope3.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0O3 = constraintLayoutScope3.OooO0O0();
                        composer3.startReplaceableGroup(-446210223);
                        EventModel eventModel3 = eventModel;
                        if (eventModel3.getEventState() == 1) {
                            float f = 3;
                            Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(PaddingKt.m476padding3ABfNKs(BorderKt.m180borderxT4_qwU(SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE, Dp.m3765constructorimpl(347), Dp.m3765constructorimpl(200)), Dp.m3765constructorimpl(f), o0oO0O0o.f47039o0000oo, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(16))), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(2), o0oO0O0o.f47007o0000, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(14)));
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged = composer3.changed(o0oo0o0OooO0O0);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new EventKt.OooO00o(o0oo0o0OooO0O0);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(modifierM180borderxT4_qwU, o0oo0o0OooO0O2, (Function1) objRememberedValue4);
                            i3 = 0;
                            SpacerKt.Spacer(modifierOooO00o, composer3, 0);
                        } else {
                            i3 = 0;
                        }
                        composer3.endReplaceableGroup();
                        o0000O0 o0000o0OooO0Oo = o00Oo0.OooO0Oo(eventModel3.getEventImage(), null, composer3, i3, 1);
                        ContentScale crop = ContentScale.INSTANCE.getCrop();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f2 = 12;
                        float f3 = 337;
                        ImageKt.Image(o0000o0OooO0Oo, (String) null, ConstraintLayoutScope.OooO00o(SizeKt.m525sizeVpY3zN4(SizeKt.fillMaxHeight$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), 0.0f, 1, null), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(FacebookRequestErrorClassification.EC_INVALID_TOKEN)), o0oo0o0OooO0O0, EventKt.OooO0OO.f23990OooO0Oo), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m525sizeVpY3zN4(companion2, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(38)), Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.mutableListOf(Color.m1660boximpl(o0oO0O0o.f46945OooO00o), Color.m1660boximpl(o0oO0O0o.f46971OooOoo)), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 3, null), 0.0f, 4, null);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0oo0o0OooO0O0);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new EventKt.OooO0o(o0oo0o0OooO0O0);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        SpacerKt.Spacer(ConstraintLayoutScope.OooO00o(modifierBackground$default, o0oo0o0OooO0O3, (Function1) objRememberedValue5), composer3, 0);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion3.getCenterVertically();
                        Modifier modifierOooO00o2 = o0oOO.OooO00o(6, BorderKt.m180borderxT4_qwU(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(23)), o0oO0O0o.f46968OooOoO, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), Dp.m3765constructorimpl((float) 0.5d), o0oO0O0o.f46944OooO, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), 0.0f, 2, null, composer3, 1157296644);
                        boolean zChanged3 = composer3.changed(o0oo0o0OooO0O0);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new EventKt.OooO(o0oo0o0OooO0O0);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOooO00o3 = ConstraintLayoutScope.OooO00o(modifierOooO00o2, o0oo0o0OooO00o, (Function1) objRememberedValue6);
                        composer3.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composer3, 48, -1323940314);
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
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageKt.Image(o00Oo0.OooO0Oo(eventModel3.getEventTagIcon(), EventKt.OooOO0.f23992OooO0Oo, composer3, 48, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                        float f4 = 2;
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion2, Dp.m3765constructorimpl(f4)), composer3, 6);
                        String eventTag = eventModel3.getEventTag();
                        long j = o0oO0O0o.f46946OooO0O0;
                        long sp = TextUnitKt.getSp(12);
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        TextKt.m1251Text4IGK_g(eventTag, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion5.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 130546);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-446206995);
                        long creatorUserId = eventModel3.getCreatorUserId();
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        if (l != null && creatorUserId == l.longValue()) {
                            eventModel2 = eventModel3;
                        } else {
                            eventModel2 = eventModel3;
                            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_more_event, composer3, 0), (String) null, o0O0O00.OooO0O0(ConstraintLayoutScope.OooO00o(PaddingKt.m476padding3ABfNKs(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(24)), o0oO0O0o.f46969OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3765constructorimpl(f4)), o0oo0o0OooO0OO, EventKt.OooOO0O.f23993OooO0Oo), false, false, 0L, false, null, null, null, new EventKt.OooOOO0(eventModel3), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
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
                        Modifier modifierOooO00o4 = ConstraintLayoutScope.OooO00o(r7, o0oo0o0OooO0Oo, (Function1) objRememberedValue7);
                        r8.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, r8, 48, -1323940314);
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
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(r8);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(r8)), r8, 0);
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
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(((Boolean) mutableState.getValue()).booleanValue() ? oOo00OO0.ic_explore_event_live : oOo00OO0.ic_event_time, r8, 0), (String) null, SizeKt.m523size3ABfNKs(r7, Dp.m3765constructorimpl(f2)), ((Boolean) mutableState.getValue()).booleanValue() ? o0oO0O0o.f47007o0000 : j, r8, 440, 0);
                        float f5 = 4;
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(r7, Dp.m3765constructorimpl(f5)), r8, 6);
                        r8.startReplaceableGroup(236575755);
                        String strStringResource = ((Boolean) mutableState.getValue()).booleanValue() ? StringResources_androidKt.stringResource(oO00OOo0.Room_Event_Live_Now, r8, 0) : o0000oo.OooO0o(eventModel2.getEventStartTime());
                        r8.endReplaceableGroup();
                        EventModel eventModel4 = eventModel2;
                        TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, ((Boolean) mutableState.getValue()).booleanValue() ? o0oO0O0o.f47007o0000 : j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion5.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, r8, 3072, 0, 130546);
                        r8.endReplaceableGroup();
                        r8.endNode();
                        r8.endReplaceableGroup();
                        r8.endReplaceableGroup();
                        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
                        r8.startReplaceableGroup(1157296644);
                        boolean zChanged5 = r8.changed(o0oo0o0OooO0O0);
                        Object objRememberedValue9 = r8.rememberedValue();
                        if (zChanged5 || objRememberedValue9 == companion6.getEmpty()) {
                            objRememberedValue9 = new EventKt.OooO0O0(o0oo0o0OooO0O0);
                            r8.updateRememberedValue(objRememberedValue9);
                        }
                        r8.endReplaceableGroup();
                        Modifier modifierOooO00o5 = ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO0O1, (Function1) objRememberedValue9);
                        r8.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically3, r8, 48, -1323940314);
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
                        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(r8);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(r8)), r8, 2058660585);
                        ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_time_remind, r8, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, r8, 440, 120);
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion2, Dp.m3765constructorimpl(f5)), r8, 6);
                        TextKt.m1251Text4IGK_g(String.valueOf(eventModel4.getEventNumber()), (Modifier) null, j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion5.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, r8, 3072, 0, 130546);
                        o000oOoO.OooO00o(r8);
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
                ComposerKt.traceEventStart(-1519618558, i, -1, "com.yalla.yalla.module.event.ui.view.EventName (Event.kt:352)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(eventModel.getEventName(), PaddingKt.m478paddingVpY3zN4$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(3))), Dp.m3765constructorimpl(12), 0.0f, 2, null), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
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
                ComposerKt.traceEventStart(-1250970345, i, -1, "com.yalla.yalla.module.event.ui.view.EventRoomInfoHeader (Event.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new Oooo000(eventModel), 253);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = (float) 6.5d;
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierOooO0O1 = com.facebook.OooOo.OooO0O0(3, PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(10), 0.0f, 2, null));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f2 = 2;
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 6);
            float f3 = 8;
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO(eventModel.getRoomImage(), Oooo0.f24002OooO0Oo, composerStartRestartGroup, 48, 0), (String) null, SizeKt.m523size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f3))), Dp.m3765constructorimpl(31)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composerStartRestartGroup, 6);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o3 = o00O00o0.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
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
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            String roomName = eventModel.getRoomName();
            long j = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            long sp = TextUnitKt.getSp(12);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM3674getLefte0LSkKk = companion4.m3674getLefte0LSkKk();
            int iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
            TextUnitType.Companion companion5 = TextUnitType.INSTANCE;
            TextKt.m1251Text4IGK_g(roomName, SizeKt.m530widthInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, companion5.m3979getSpUIouoOA()), (TextDecoration) null, TextAlign.m3664boximpl(iM3674getLefte0LSkKk), 0L, iM3719getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120176);
            TextKt.m1251Text4IGK_g(androidx.compose.ui.input.key.OooO00o.OooO00o("ID:", eventModel.getRoomIdx()), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, companion5.m3979getSpUIouoOA()), (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130418);
            p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_number, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(4)), composer2, 6);
            TextKt.m1251Text4IGK_g(String.valueOf(eventModel.getRoomOnLineNumber()), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3674getLefte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6);
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
            SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl((float) 0.5d)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, null, 2, null), composerStartRestartGroup, 0);
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
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(18, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(35)), 1.0f, false, 2, null));
            int i3 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(modifierOooO0O0, o0oO0O0o.f47007o0000, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(17)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, o0oO0O0o.f46966OooOo0O, composerStartRestartGroup, 0, 3);
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
            Modifier modifierM200clickableO2vRcR0$default = ClickableKt.m200clickableO2vRcR0$default(modifierM168backgroundbw27NRU, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM200clickableO2vRcR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-55222217);
            if (context instanceof FragmentActivity) {
                AndroidView_androidKt.AndroidView(new o0OO00O(context), SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(15)), null, composer2, 48, 4);
                oo0O.OooO00o(8, companion, composer2, 6);
            }
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_join, composer2, 0), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
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
    /* JADX WARN: Code duplicated, block: B:94:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
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
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        RowScopeInstance rowScopeInstance;
        float f;
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
                        function5 = o00O0O.f24030OooO0Oo;
                    } else {
                        function5 = function3;
                    }
                    if (i4 != 0) {
                        function6 = o00Oo0.f24031OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
                    }
                    long creatorUserId = eventModel.getCreatorUserId();
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                    if (l == null && creatorUserId == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    f = 12;
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(533791732);
                    if (z || (z && eventModel.getEventState() == 1)) {
                        OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function5 = function3;
                    function6 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function6, i, i2));
            }
            i3 |= 384;
            function4 = function2;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    function5 = o00O0O.f24030OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f24031OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
                }
                long creatorUserId2 = eventModel.getCreatorUserId();
                p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
                l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function5 = o00O0O.f24030OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f24031OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
                }
                long creatorUserId3 = eventModel.getCreatorUserId();
                p464o0Oooo.o000000O o000000o4 = p464o0Oooo.o000000O.f46674OooO00o;
                l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function6, i, i2));
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
                    function5 = o00O0O.f24030OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f24031OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
                }
                long creatorUserId4 = eventModel.getCreatorUserId();
                p464o0Oooo.o000000O o000000o5 = p464o0Oooo.o000000O.f46674OooO00o;
                l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i6 != 0) {
                    function5 = o00O0O.f24030OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i4 != 0) {
                    function6 = o00Oo0.f24031OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
                }
                long creatorUserId5 = eventModel.getCreatorUserId();
                p464o0Oooo.o000000O o000000o6 = p464o0Oooo.o000000O.f46674OooO00o;
                l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                if (l == null) {
                    z = false;
                } else {
                    z = true;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                f = 12;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(533791732);
                if (z) {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function6, i, i2));
        }
        i3 |= 384;
        function4 = function2;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                function5 = o00O0O.f24030OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i4 != 0) {
                function6 = o00Oo0.f24031OooO0Oo;
            } else {
                function6 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
            }
            long creatorUserId6 = eventModel.getCreatorUserId();
            p464o0Oooo.o000000O o000000o7 = p464o0Oooo.o000000O.f46674OooO00o;
            l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l == null) {
                z = false;
            } else {
                z = true;
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            f = 12;
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(533791732);
            if (z) {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            } else {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                function5 = o00O0O.f24030OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i4 != 0) {
                function6 = o00Oo0.f24031OooO0Oo;
            } else {
                function6 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497496277, i, -1, "com.yalla.yalla.module.event.ui.view.EventSubscribe (Event.kt:386)");
            }
            long creatorUserId7 = eventModel.getCreatorUserId();
            p464o0Oooo.o000000O o000000o8 = p464o0Oooo.o000000O.f46674OooO00o;
            l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l == null) {
                z = false;
            } else {
                z = true;
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            f = 12;
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(533791732);
            if (z) {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            } else {
                OooO0oo(new o00Ooo(eventModel, function5), composerStartRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
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
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(eventModel, function5, function6, i, i2));
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
            int i4 = o0oO0O0o.f47152o00OOOo;
            long j = i == 1 ? o0oO0O0o.f47007o0000 : o0oO0O0o.f46993OoooOo0;
            int i5 = o0oO0O0o.f47152o00OOOo;
            long j2 = i == 1 ? o0oO0O0o.f47021o0000O00 : o0oO0O0o.f46996Ooooo00;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 18;
            Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(com.facebook.OooOo.OooO0O0(f, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(35)), 1.0f, false, 2, null)), Dp.m3765constructorimpl(1), j, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            composer2 = composerStartRestartGroup;
            Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, j2, composerStartRestartGroup, 0, 3);
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
            Modifier modifierM200clickableO2vRcR0$default = ClickableKt.m200clickableO2vRcR0$default(modifierM180borderxT4_qwU, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM200clickableO2vRcR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_share_mine, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(19)), j, composer2, 440, 0);
            oo0O.OooO00o(8, companion, composer2, 6);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.share, composer2, 0), (Modifier) null, j, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
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
            Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(com.facebook.OooOo.OooO0O0(f, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(35))), Dp.m3765constructorimpl(1), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, o0oO0O0o.f46968OooOoO, composerStartRestartGroup, 0, 3);
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
            Modifier modifierM200clickableO2vRcR0$default = ClickableKt.m200clickableO2vRcR0$default(modifierM180borderxT4_qwU, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM200clickableO2vRcR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_event_share, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(23)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
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
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(context);
        o0oo00o2.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.event_unSubscribe_content));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOOOO(oO00OOo0.event_unSubscribe_confirm);
        o0oo00o2.OooOo0(new o00000O(subscribeRequest));
        o0oo00o2.OooOO0o();
    }

    public static final void OooOO0O(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            ShareContentType shareContentType = ShareContentType.Events;
            p648o0ooo.oo0o0Oo oo0o0oo = new p648o0ooo.oo0o0Oo((FragmentActivity) activityOooO0O0, shareContentType);
            ShareContentModel shareContentModel = new ShareContentModel(shareContentType);
            shareContentModel.setEvent(eventModel);
            oo0o0oo.f59806OooOOo0 = shareContentModel;
            oo0o0oo.OooO();
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
            ComposerKt.traceEventStart(-814424962, i, -1, "com.yalla.yalla.module.event.ui.view.showAddToCalendarDialog (Event.kt:445)");
        }
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo00().getValue(), Boolean.TRUE) && isShow.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(454484471);
            if (Build.VERSION.SDK_INT >= 24) {
                EffectsKt.LaunchedEffect(isShow.getValue(), new o00000OO(isShow, context, eventModel, null), composerStartRestartGroup, 64);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(454485233);
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.OooOOO0.OooO00o(isShow, false, false, null, null, 80, oO00Oo00.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1529471952, true, new o0000Ooo(i, context, isShow, eventModel)), composerStartRestartGroup, (i & 14) | 100663296, 158);
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
