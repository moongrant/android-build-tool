package p669oO0Oo;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
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
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.google.logging.type.LogSeverity;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Function;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000OO;
import p151o00Oo0oo.o000OO;
import p186o00o00oO.o00O00o0;
import p417o0OoO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.oo0o0Oo;
import p507o0o00ooo.u1;
import p516o0o0O0OO.o0OO00O;
import p517o0o0O0o.OooOOOO;
import p571o0oOoOO.o0O0o000;
import p577o0oOoOoO.oOO000o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 12 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,641:1\n76#2:642\n154#3:643\n154#3:679\n154#3:715\n154#3:752\n154#3:753\n154#3:776\n154#3:777\n154#3:813\n154#3:883\n154#3:920\n154#3:921\n154#3:922\n154#3:928\n154#3:963\n174#3:999\n154#3:1000\n154#3:1006\n154#3:1043\n154#3:1044\n154#3:1055\n154#3:1056\n154#3:1057\n154#3:1097\n154#3:1103\n154#3:1104\n154#3:1115\n154#3:1116\n154#3:1117\n154#3:1153\n154#3:1154\n154#3:1160\n154#3:1161\n154#3:1197\n154#3:1198\n154#3:1247\n154#3:1265\n154#3:1277\n154#3:1312\n66#4,6:644\n72#4:678\n76#4:775\n66#4,6:778\n72#4:812\n66#4,6:964\n72#4:998\n76#4:1005\n67#4,5:1058\n72#4:1091\n76#4:1096\n76#4:1114\n67#4,5:1278\n72#4:1311\n76#4:1317\n78#5,11:650\n78#5,11:686\n78#5,11:723\n91#5:757\n91#5:769\n91#5:774\n78#5,11:784\n78#5,11:820\n78#5,11:854\n78#5,11:891\n91#5:926\n78#5,11:934\n78#5,11:970\n91#5:1004\n78#5,11:1014\n91#5:1048\n91#5:1053\n78#5,11:1063\n91#5:1095\n91#5:1101\n91#5:1108\n91#5:1113\n78#5,11:1124\n91#5:1158\n78#5,11:1168\n78#5,11:1205\n91#5:1263\n78#5,11:1283\n91#5:1316\n91#5:1321\n456#6,8:661\n464#6,3:675\n456#6,8:697\n464#6,3:711\n456#6,8:734\n464#6,3:748\n467#6,3:754\n467#6,3:766\n467#6,3:771\n456#6,8:795\n464#6,3:809\n456#6,8:831\n464#6,3:845\n456#6,8:865\n464#6,3:879\n456#6,8:902\n464#6,3:916\n467#6,3:923\n456#6,8:945\n464#6,3:959\n456#6,8:981\n464#6,3:995\n467#6,3:1001\n456#6,8:1025\n464#6,3:1039\n467#6,3:1045\n467#6,3:1050\n456#6,8:1074\n464#6,3:1088\n467#6,3:1092\n467#6,3:1098\n467#6,3:1105\n467#6,3:1110\n456#6,8:1135\n464#6,3:1149\n467#6,3:1155\n456#6,8:1179\n464#6,3:1193\n456#6,8:1216\n464#6,3:1230\n467#6,3:1260\n456#6,8:1294\n464#6,3:1308\n467#6,3:1313\n467#6,3:1318\n25#6:1334\n4144#7,6:669\n4144#7,6:705\n4144#7,6:742\n4144#7,6:803\n4144#7,6:839\n4144#7,6:873\n4144#7,6:910\n4144#7,6:953\n4144#7,6:989\n4144#7,6:1033\n4144#7,6:1082\n4144#7,6:1143\n4144#7,6:1187\n4144#7,6:1224\n4144#7,6:1302\n72#8,6:680\n78#8:714\n82#8:770\n73#8,5:849\n78#8:882\n73#8,5:929\n78#8:962\n82#8:1054\n82#8:1102\n72#8,6:1199\n78#8:1233\n82#8:1264\n72#9,7:716\n79#9:751\n83#9:758\n73#9,6:814\n79#9:848\n72#9,7:884\n79#9:919\n83#9:927\n72#9,7:1007\n79#9:1042\n83#9:1049\n83#9:1109\n73#9,6:1118\n79#9:1152\n83#9:1159\n73#9,6:1162\n79#9:1196\n83#9:1322\n1098#10:759\n927#10,6:760\n1098#10:1234\n927#10,6:1235\n927#10,6:1241\n1098#10:1259\n81#11,11:1248\n81#11,11:1266\n81#11,11:1323\n1097#12,6:1335\n81#13:1341\n81#13:1342\n107#13,2:1343\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog\n*L\n108#1:642\n252#1:643\n255#1:679\n262#1:715\n270#1:752\n274#1:753\n308#1:776\n309#1:777\n323#1:813\n326#1:883\n330#1:920\n332#1:921\n334#1:922\n343#1:928\n349#1:963\n355#1:999\n356#1:1000\n359#1:1006\n371#1:1043\n373#1:1044\n385#1:1055\n398#1:1056\n399#1:1057\n411#1:1097\n414#1:1103\n418#1:1104\n432#1:1115\n435#1:1116\n439#1:1117\n449#1:1153\n453#1:1154\n465#1:1160\n466#1:1161\n468#1:1197\n469#1:1198\n480#1:1247\n528#1:1265\n533#1:1277\n586#1:1312\n250#1:644,6\n250#1:678\n250#1:775\n305#1:778,6\n305#1:812\n345#1:964,6\n345#1:998\n345#1:1005\n395#1:1058,5\n395#1:1091\n395#1:1096\n305#1:1114\n530#1:1278,5\n530#1:1311\n530#1:1317\n250#1:650,11\n255#1:686,11\n264#1:723,11\n264#1:757\n255#1:769\n250#1:774\n305#1:784,11\n319#1:820,11\n325#1:854,11\n327#1:891,11\n327#1:926\n344#1:934,11\n345#1:970,11\n345#1:1004\n368#1:1014,11\n368#1:1048\n344#1:1053\n395#1:1063,11\n395#1:1095\n325#1:1101\n319#1:1108\n305#1:1113\n436#1:1124,11\n436#1:1158\n462#1:1168,11\n470#1:1205,11\n470#1:1263\n530#1:1283,11\n530#1:1316\n462#1:1321\n250#1:661,8\n250#1:675,3\n255#1:697,8\n255#1:711,3\n264#1:734,8\n264#1:748,3\n264#1:754,3\n255#1:766,3\n250#1:771,3\n305#1:795,8\n305#1:809,3\n319#1:831,8\n319#1:845,3\n325#1:865,8\n325#1:879,3\n327#1:902,8\n327#1:916,3\n327#1:923,3\n344#1:945,8\n344#1:959,3\n345#1:981,8\n345#1:995,3\n345#1:1001,3\n368#1:1025,8\n368#1:1039,3\n368#1:1045,3\n344#1:1050,3\n395#1:1074,8\n395#1:1088,3\n395#1:1092,3\n325#1:1098,3\n319#1:1105,3\n305#1:1110,3\n436#1:1135,8\n436#1:1149,3\n436#1:1155,3\n462#1:1179,8\n462#1:1193,3\n470#1:1216,8\n470#1:1230,3\n470#1:1260,3\n530#1:1294,8\n530#1:1308,3\n530#1:1313,3\n462#1:1318,3\n604#1:1334\n250#1:669,6\n255#1:705,6\n264#1:742,6\n305#1:803,6\n319#1:839,6\n325#1:873,6\n327#1:910,6\n344#1:953,6\n345#1:989,6\n368#1:1033,6\n395#1:1082,6\n436#1:1143,6\n462#1:1187,6\n470#1:1224,6\n530#1:1302,6\n255#1:680,6\n255#1:714\n255#1:770\n325#1:849,5\n325#1:882\n344#1:929,5\n344#1:962\n344#1:1054\n325#1:1102\n470#1:1199,6\n470#1:1233\n470#1:1264\n264#1:716,7\n264#1:751\n264#1:758\n319#1:814,6\n319#1:848\n327#1:884,7\n327#1:919\n327#1:927\n368#1:1007,7\n368#1:1042\n368#1:1049\n319#1:1109\n436#1:1118,6\n436#1:1152\n436#1:1159\n462#1:1162,6\n462#1:1196\n462#1:1322\n279#1:759\n281#1:760,6\n471#1:1234\n473#1:1235,6\n476#1:1241,6\n489#1:1259\n487#1:1248,11\n529#1:1266,11\n603#1:1323,11\n604#1:1335,6\n427#1:1341\n604#1:1342\n604#1:1343,2\n*E\n"})
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O0Oo f60478OooO00o = new o000O0Oo();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f60479OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47518OooOOO0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f60480OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f60481OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f60482OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f60483OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f60484OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f60485OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f60486OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f60487OooO0oo;

        public OooO00o(int i, long j, long j2, long j3, int i2, int i3, long j4, int i4) {
            this.f60480OooO00o = i;
            this.f60481OooO0O0 = j;
            this.f60482OooO0OO = j2;
            this.f60483OooO0Oo = j3;
            this.f60485OooO0o0 = i2;
            this.f60484OooO0o = i3;
            this.f60486OooO0oO = j4;
            this.f60487OooO0oo = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f60480OooO00o == oooO00o.f60480OooO00o && Color.m1671equalsimpl0(this.f60481OooO0O0, oooO00o.f60481OooO0O0) && Color.m1671equalsimpl0(this.f60482OooO0OO, oooO00o.f60482OooO0OO) && Color.m1671equalsimpl0(this.f60483OooO0Oo, oooO00o.f60483OooO0Oo) && this.f60485OooO0o0 == oooO00o.f60485OooO0o0 && this.f60484OooO0o == oooO00o.f60484OooO0o && Color.m1671equalsimpl0(this.f60486OooO0oO, oooO00o.f60486OooO0oO) && this.f60487OooO0oo == oooO00o.f60487OooO0oo;
        }

        public final int hashCode() {
            return androidx.compose.material.OooOO0O.OooO0O0(this.f60486OooO0oO, (((androidx.compose.material.OooOO0O.OooO0O0(this.f60483OooO0Oo, androidx.compose.material.OooOO0O.OooO0O0(this.f60482OooO0OO, androidx.compose.material.OooOO0O.OooO0O0(this.f60481OooO0O0, this.f60480OooO00o * 31, 31), 31), 31) + this.f60485OooO0o0) * 31) + this.f60484OooO0o) * 31, 31) + this.f60487OooO0oo;
        }

        @NotNull
        public final String toString() {
            String strM1678toStringimpl = Color.m1678toStringimpl(this.f60481OooO0O0);
            String strM1678toStringimpl2 = Color.m1678toStringimpl(this.f60482OooO0OO);
            String strM1678toStringimpl3 = Color.m1678toStringimpl(this.f60483OooO0Oo);
            String strM1678toStringimpl4 = Color.m1678toStringimpl(this.f60486OooO0oO);
            StringBuilder sb = new StringBuilder("LevelThemeResource(background=");
            sb.append(this.f60480OooO00o);
            sb.append(", questionIconColor=");
            sb.append(strM1678toStringimpl);
            sb.append(", descColor=");
            OooO0OO.OooO0O0.OooO00o(sb, strM1678toStringimpl2, ", levelTextColor=", strM1678toStringimpl3, ", cardBackground=");
            sb.append(this.f60485OooO0o0);
            sb.append(", badgeIcon=");
            sb.append(this.f60484OooO0o);
            sb.append(", taskMainColor=");
            sb.append(strM1678toStringimpl4);
            sb.append(", frozenTipIcon=");
            return p022Oooo00O.OooOO0.OooO0O0(sb, this.f60487OooO0oo, ")");
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f60488OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == Lifecycle.Event.ON_RESUME) {
                oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                if (((Boolean) oo0o0oo.f47524OooOo.getValue()).booleanValue()) {
                    oo0o0oo.f47506OooO00o.setValue(Boolean.TRUE);
                    oo0o0oo.f47524OooOo.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$OnDialog$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,641:1\n76#2:642\n76#2:700\n81#3,11:643\n154#4:654\n154#4:656\n154#4:701\n154#4:702\n154#4:738\n154#4:739\n88#5:655\n66#6,6:657\n72#6:691\n76#6:749\n78#7,11:663\n78#7,11:709\n91#7:743\n91#7:748\n456#8,8:674\n464#8,3:688\n50#8:692\n49#8:693\n456#8,8:720\n464#8,3:734\n467#8,3:740\n467#8,3:745\n4144#9,6:682\n4144#9,6:728\n1097#10,6:694\n72#11,6:703\n78#11:737\n82#11:744\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$OnDialog$2\n*L\n118#1:642\n180#1:700\n120#1:643,11\n124#1:654\n125#1:656\n187#1:701\n188#1:702\n202#1:738\n204#1:739\n124#1:655\n121#1:657,6\n121#1:691\n121#1:749\n121#1:663,11\n198#1:709,11\n198#1:743\n121#1:748\n121#1:674,8\n121#1:688,3\n128#1:692\n128#1:693\n198#1:720,8\n198#1:734,3\n198#1:740,3\n121#1:745,3\n121#1:682,6\n198#1:728,6\n128#1:694,6\n198#1:703,6\n198#1:737\n198#1:744\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f60489OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context) {
            super(2);
            this.f60489OooO0Oo = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            OooO00o oooO00o;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1324755937, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.OnDialog.<anonymous> (LiveRoomMemberTaskDialog.kt:109)");
                }
                EffectsKt.LaunchedEffect((Object) null, new o000O0O0(null), composer2, 70);
                Configuration configuration = (Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                o000O0Oo o000o0oo2 = o000O0Oo.f60478OooO00o;
                o000o0oo2.OooO0O0(composer2, 6);
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(oOO000o.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                oOO000o ooo000o = (oOO000o) viewModel;
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(Dp.m3765constructorimpl(configuration.screenHeightDp) * 0.72f), 1, null), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), o0oO0O0o.f46946OooO0O0, null, 2, null);
                Context context = this.f60489OooO0Oo;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Integer numValueOf = Integer.valueOf(((Number) ooo000o.f56372OooO0OO.getValue()).intValue());
                Boolean boolValueOf = Boolean.valueOf(ooo000o.OooO0O0());
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(numValueOf) | composer2.changed(boolValueOf);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    int iIntValue2 = ((Number) ooo000o.f56372OooO0OO.getValue()).intValue();
                    if (iIntValue2 == 1) {
                        oooO00o = new OooO00o(oO00OOO.ic_room_dialog_member_task_level1, o0oO0O0o.f47056o000OO0O, o0oO0O0o.f47167o0OoO0o, o0oO0O0o.f47042o000O, oO00OOO.ic_room_dialog_member_task_card_level1, ooo000o.OooO0O0() ? oO00OOO.ic_room_dialog_member_task_card_badge1 : oO00OOO.ic_room_dialog_member_task_card_badge_gray1, o0oO0O0o.f47072o000OooO, oO00OOO.ic_room_member_task_badge_unable_tip1);
                    } else if (iIntValue2 != 2) {
                        oooO00o = new OooO00o(oO00OOO.ic_room_dialog_member_task_level3, o0oO0O0o.f47065o000Oo0O, o0oO0O0o.f47061o000OOoO, o0oO0O0o.f47060o000OOo0, oO00OOO.ic_room_dialog_member_task_card_level3, ooo000o.OooO0O0() ? oO00OOO.ic_room_dialog_member_task_card_badge3 : oO00OOO.ic_room_dialog_member_task_card_badge_gray3, o0oO0O0o.f47071o000Ooo0, oO00OOO.ic_room_member_task_badge_unable_tip3);
                    } else {
                        oooO00o = new OooO00o(oO00OOO.ic_room_dialog_member_task_level2, o0oO0O0o.f47064o000Oo00, o0oO0O0o.f47058o000OOO, o0oO0O0o.f47057o000OO0o, oO00OOO.ic_room_dialog_member_task_card_level2, ooo000o.OooO0O0() ? oO00OOO.ic_room_dialog_member_task_card_badge2 : oO00OOO.ic_room_dialog_member_task_card_badge_gray2, o0oO0O0o.f47069o000OoOo, oO00OOO.ic_room_member_task_badge_unable_tip2);
                    }
                    objRememberedValue = oooO00o;
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                OooO00o oooO00o2 = (OooO00o) objRememberedValue;
                int i = oooO00o2.f60480OooO00o;
                long j = oooO00o2.f60481OooO0O0;
                long j2 = oooO00o2.f60482OooO0OO;
                long j3 = oooO00o2.f60483OooO0Oo;
                int i2 = oooO00o2.f60485OooO0o0;
                int i3 = oooO00o2.f60484OooO0o;
                long j4 = oooO00o2.f60486OooO0oO;
                int i4 = oooO00o2.f60487OooO0oo;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer2, 6), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icv_doubt, composer2, 0);
                Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getTopEnd());
                float f2 = 16;
                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(modifierAlign, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 0.0f, 9, null), Dp.m3765constructorimpl(20)), false, false, 0L, false, null, null, null, new o000OO00(lifecycleOwner), 253), j, composer2, 56, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                o000O0Oo.OooO0o(o000o0oo2, composer2, 6);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composer2, 6, 2);
                o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(ooo000o.f56381OooOOO0.f37667OooO0oo, composer2);
                EffectsKt.LaunchedEffect((Object) null, new o000OOo0(ooo000o, oooO0O0OooO00o, null), composer2, 70);
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1980526327, true, new o00O000(lazyListStateRememberLazyListState, oooO0O0OooO00o, i2, ooo000o, j3, j2, i3, i4, j4, context));
                int i5 = o000O0.OooO0O0.f34327OooO0o0;
                p148o00Oo0o.o0O0O00.OooO00o(oooO0O0OooO00o, modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, null, null, composableLambda, composer2, 100663352, 248);
                if (o00000OO.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f60491OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f60491OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60491OooO0o0 | 1);
            o000O0Oo.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TipPopup$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,641:1\n36#2:642\n456#2,8:666\n464#2,3:680\n456#2,8:707\n464#2,3:721\n467#2,3:725\n467#2,3:733\n1097#3,6:643\n72#4,6:649\n78#4:683\n82#4:737\n78#5,11:655\n78#5,11:696\n91#5:728\n91#5:736\n4144#6,6:674\n4144#6,6:715\n154#7:684\n154#7:685\n154#7:686\n154#7:687\n154#7:688\n154#7:689\n154#7:730\n154#7:732\n66#8,6:690\n72#8:724\n76#8:729\n58#9:731\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskDialog$TipPopup$2\n*L\n614#1:642\n614#1:666,8\n614#1:680,3\n615#1:707,8\n615#1:721,3\n615#1:725,3\n614#1:733,3\n614#1:643,6\n614#1:649,6\n614#1:683\n614#1:737\n614#1:655,11\n615#1:696,11\n615#1:728\n614#1:736\n614#1:674,6\n615#1:715,6\n617#1:684\n619#1:685\n620#1:686\n624#1:687\n625#1:688\n626#1:689\n632#1:730\n634#1:732\n615#1:690,6\n615#1:724\n615#1:729\n632#1:731\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<IntSize> f60492OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f60493OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oOO000o f60494OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<IntSize> mutableState, oOO000o ooo000o, int i) {
            super(2);
            this.f60492OooO0Oo = mutableState;
            this.f60494OooO0o0 = ooo000o;
            this.f60493OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1249319263, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TipPopup.<anonymous> (LiveRoomMemberTaskDialog.kt:612)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                MutableState<IntSize> mutableState = this.f60492OooO0Oo;
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new oo00o(mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion, (Function1) objRememberedValue);
                composer2.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(16), 0.0f, 2, null);
                float f = 12;
                float fM3765constructorimpl = Dp.m3765constructorimpl(f);
                RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f));
                long j = o0oO0O0o.f46972OooOoo0;
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(SizeKt.m530widthInVpY3zN4$default(BackgroundKt.m168backgroundbw27NRU(ShadowKt.m1348shadows4CzXII$default(modifierM478paddingVpY3zN4$default, fM3765constructorimpl, roundedCornerShapeM727RoundedCornerShape0680j_4, false, j, j, 4, null), o000OOo.OooO0OO(composer2).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), 0.0f, Dp.m3765constructorimpl(240), 1, null), Dp.m3765constructorimpl(f));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Send_golds_gifts_desc_tip, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37711OooOO0O, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
                o000oOoO.OooO00o(composer2);
                BoxKt.Box(SizeKt.m525sizeVpY3zN4(BackgroundKt.m168backgroundbw27NRU(OffsetKt.m437offsetVpY3zN4$default(companion, Dp.m3765constructorimpl(o0000O0.OooO0o0(o000000.OooO0Oo(Float.valueOf(Offset.m1436getXimpl(this.f60494OooO0o0.f56380OooOO0o))) - this.f60493OooO0o, composer2) - Dp.m3765constructorimpl(7)), 0.0f, 2, null), o000OOo.OooO0OO(composer2).f37703OooO0O0, u1.f50293OooO00o), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(8)), composer2, 0);
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

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f60496OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f60496OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60496OooO0o0 | 1);
            o000O0Oo.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f60497OooO0Oo;

        public OooOOO0(o000O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f60497OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f60497OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f60497OooO0Oo;
        }

        public final int hashCode() {
            return this.f60497OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f60497OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(o000O0Oo o000o0oo2, oOO000o ooo000o, Composer composer, int i) {
        Composer composer2;
        o000o0oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(547898642);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(547898642, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.IntimacyAndRanking (LiveRoomMemberTaskDialog.kt:248)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511heightInVpY3zN4$default(companion, Dp.m3765constructorimpl(48), 0.0f, 2, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(105), 0.0f, 11, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Obtain_intimacy_points, composerStartRestartGroup, 0), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        long jLongValue = ((Number) ooo000o.f56374OooO0o.getValue()).longValue();
        MutableState mutableState = ooo000o.f56376OooO0oO;
        if (jLongValue == ((Number) mutableState.getValue()).longValue()) {
            composerStartRestartGroup.startReplaceableGroup(811678276);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Completed, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f47073o000Oooo, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_room_member_task_completed, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(811678980);
            composerStartRestartGroup.startReplaceableGroup(811679039);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResources_androidKt.stringResource(oO00OOo0.Todays_intimacy_points, composerStartRestartGroup, 0));
            int iPushStyle = builder.pushStyle(new SpanStyle(o0oO0O0o.f47073o000Oooo, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Number) ooo000o.f56374OooO0o.getValue()).longValue());
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                builder.append("/" + ((Number) mutableState.getValue()).longValue());
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                TextKt.m1252TextIbK3jfQ(annotatedString, null, o000OOo.OooO0OO(composerStartRestartGroup).f37711OooOO0O, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 3072, 0, 262130);
                composer2.endReplaceableGroup();
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        o000oOoO.OooO00o(composer2);
        Composer composer3 = composer2;
        o0OO00O.f51924OooO00o.OooO0O0(((Number) ooo000o.f56369OooO.getValue()).intValue(), 384, composer3, boxScopeInstance.align(companion, companion2.getCenterEnd()));
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O0(o000o0oo2, ooo000o, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0Oo(o000O0Oo o000o0oo2, int i, oOO000o ooo000o, long j, long j2, int i2, int i3, Composer composer, int i4) {
        Modifier modifier;
        int i5;
        int i6;
        o000o0oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(894300781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(894300781, i4, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.MyBadgeInfoCard (LiveRoomMemberTaskDialog.kt:296)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(120, OooOo.OooO0O0(f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), composerStartRestartGroup, 733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 6), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO00o2 = o0oOO.OooO00o(f, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Modifier modifierOooO00o3 = androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o3 = o00O00o0.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
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
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String str = (String) o000000O.OooO().getValue();
        float fM3765constructorimpl = Dp.m3765constructorimpl(1);
        long j3 = o0oO0O0o.f46946OooO0O0;
        oooOOOO.OooOO0(str, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(26)), fM3765constructorimpl, Color.m1660boximpl(j3), false, composerStartRestartGroup, 262576, 16);
        float f2 = 8;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Level, composerStartRestartGroup, 0) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Number) ooo000o.f56371OooO0O0.getValue()).intValue(), (Modifier) null, j, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i4 & 896) | 199680, 0, 131026);
        o000oOoO.OooO00o(composerStartRestartGroup);
        if (((Number) ooo000o.f56371OooO0O0.getValue()).intValue() < ((Number) ooo000o.f56375OooO0o0.getValue()).intValue()) {
            composerStartRestartGroup.startReplaceableGroup(-589491907);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(20), null, composerStartRestartGroup, 6, 2);
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o5 = o00O00o0.OooO00o(companion2, center2, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, currentCompositionLocalMap5);
            if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            float f3 = 4;
            Modifier modifierOooO00o4 = p153o00OoO0.OooOO0.OooO00o(f3, SizeKt.fillMaxWidth$default(BackgroundKt.m168backgroundbw27NRU(companion, o0oO0O0o.f47055o000OO00, RoundedCornerShapeKt.RoundedCornerShape(50)), 0.0f, 1, null), composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyOooO00o6 = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl6, measurePolicyOooO00o6, composerM1309constructorimpl6, currentCompositionLocalMap6);
            if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(BackgroundKt.m168backgroundbw27NRU(companion, j3, RoundedCornerShapeKt.RoundedCornerShape(50)), AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, null, 6, null), null, 2, null);
            MutableState mutableState = ooo000o.f56379OooOO0O;
            long jLongValue = ((Number) mutableState.getValue()).longValue();
            MutableState mutableState2 = ooo000o.f56378OooOO0;
            BoxKt.Box(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(modifierAnimateContentSize$default, Dp.m3765constructorimpl((jLongValue * ((long) 192)) / ((Number) mutableState2.getValue()).longValue())), Dp.m3765constructorimpl(f3)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            if (ooo000o.OooO0O0()) {
                composerStartRestartGroup.startReplaceableGroup(-104711489);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.member_intimacy_level_up, composerStartRestartGroup, 0), String.valueOf(((Number) mutableState2.getValue()).longValue() - ((Number) mutableState.getValue()).longValue())), (Modifier) null, j2, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 3) & 896) | 3072, 0, 131058);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-104711076);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o7 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl7, measurePolicyOooO00o7, composerM1309constructorimpl7, currentCompositionLocalMap7);
                if (composerM1309constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash7, composerM1309constructorimpl7, currentCompositeKeyHash7, function2OooO00o7);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, (i4 >> 15) & 14), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.member_badge_frozen_intimacy_tip, composerStartRestartGroup, 0), String.valueOf(((Number) mutableState2.getValue()).longValue() - ((Number) mutableState.getValue()).longValue())), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i4 >> 3) & 896) | 3072, 0, 65522);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            i6 = 6;
            modifier = null;
            i5 = 2;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-589489373);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            int i7 = ((i4 >> 3) & 896) | 3072;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(((Boolean) com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47511OooO0o0.getValue()).booleanValue() ? oO00OOo0.member_intimacy_level_highest : oO00OOo0.member_intimacy_level_highest_frozen, composerStartRestartGroup, 0), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i7, 0, 131058);
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.m509height3ABfNKs(BackgroundKt.m168backgroundbw27NRU(companion, o0oO0O0o.f46944OooO, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(23)), Dp.m3765constructorimpl(f2), 0.0f, 2, null);
            Alignment center3 = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor8);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o8 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl8, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl8, currentCompositionLocalMap8);
            if (composerM1309constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash8, composerM1309constructorimpl8, currentCompositeKeyHash8, function2OooO00o8);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Intimacy_points_x, composerStartRestartGroup, 0), String.valueOf(((Number) ooo000o.f56377OooO0oo.getValue()).longValue())), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), true, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i7, 3504, 116722);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            float fM3765constructorimpl2 = Dp.m3765constructorimpl(f);
            modifier = null;
            i5 = 2;
            com.code.android.util.OooOO0.OooO0o(fM3765constructorimpl2, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
            i6 = 6;
        }
        o000oOoO.OooO00o(composerStartRestartGroup);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(24), modifier, composerStartRestartGroup, i6, i5);
        ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, (i4 >> 12) & 14), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(80)), (Alignment) null, companion4.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OO0O(o000o0oo2, i, ooo000o, j, j2, i2, i3, i4));
    }

    public static final void OooO0o(o000O0Oo o000o0oo2, Composer composer, int i) {
        Composer composer2;
        o000o0oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1147327370);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147327370, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TopRoomInfo (LiveRoomMemberTaskDialog.kt:425)");
            }
            String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.rooms_Member_Group, composerStartRestartGroup, 0), (String) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f24999OooO0O0, "", composerStartRestartGroup, 56).getValue());
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            long sp = TextUnitKt.getSp(16);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            o000OO.OooO00o(strOooO00o, j, sp, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(60), 0.0f, 10, null), true, composerStartRestartGroup, 28032, 0);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), false, false, 0L, false, null, null, null, o00O0.f60519OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.Members) + ZegoConstants.ZegoVideoDataAuxPublishingStream + Math.max(com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0o0() - 1, 0), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composer2 = composerStartRestartGroup;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl((float) 2), null, composer2, 6, 2);
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_arrow, composer2, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6), o000OOo.OooO0OO(composer2).f37712OooOO0o, composer2, 56, 0);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O00(o000o0oo2, i));
    }

    public static final void OooO0o0(o000O0Oo o000o0oo2, RoomMemberTaskInfoModel roomMemberTaskInfoModel, long j, Context context, Composer composer, int i) {
        o000o0oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1947696407);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1947696407, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TaskItem (LiveRoomMemberTaskDialog.kt:460)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(72), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511heightInVpY3zN4$default);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(o00Oo0.OooO0OO(roomMemberTaskInfoModel.getTaskPic(), null, composerStartRestartGroup, 0, 1), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(12), null, composerStartRestartGroup, 6, 2);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(464272123);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(roomMemberTaskInfoModel.getTaskName());
        int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + roomMemberTaskInfoModel.getCurrVal());
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            int iPushStyle2 = builder.pushStyle(new SpanStyle(o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append("/" + roomMemberTaskInfoModel.getCompletedVal());
                builder.pop(iPushStyle2);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1252TextIbK3jfQ(annotatedString, null, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3072, 0, 262130);
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (roomMemberTaskInfoModel.getTaskId() != 4) {
                    composerStartRestartGroup.startReplaceableGroup(464272611);
                    TextKt.m1251Text4IGK_g(roomMemberTaskInfoModel.getTaskDesc(), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(464272852);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel viewModel = ViewModelKt.viewModel(oOO000o.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    oOO000o ooo000o = (oOO000o) viewModel;
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                    builder2.append(roomMemberTaskInfoModel.getTaskDesc());
                    builder2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    InlineTextContentKt.appendInlineContent$default(builder2, "icv_doubt", null, 2, null);
                    TextKt.m1252TextIbK3jfQ(builder2.toAnnotatedString(), null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to("icv_doubt", new InlineTextContent(new Placeholder(TextUnitKt.getSp(14), TextUnitKt.getSp(14), PlaceholderVerticalAlign.INSTANCE.m3245getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1548897795, true, new o00O00O(ooo000o))))), null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 98290);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel2 = ViewModelKt.viewModel(o0O0o000.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                o0O0o000 o0o0o000 = (o0O0o000) viewModel2;
                Alignment center = companion2.getCenter();
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(ClipKt.clip(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(64), Dp.m3765constructorimpl(32)), RoundedCornerShapeKt.RoundedCornerShape(50)), o000000.OooO00o(Integer.valueOf(roomMemberTaskInfoModel.getState())) ? Color.m1669copywmQWz5c$default(j, 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : j, RoundedCornerShapeKt.RoundedCornerShape(50)), false, !o000000.OooO00o(Integer.valueOf(roomMemberTaskInfoModel.getState())), 0L, false, null, null, null, new o00O00OO(roomMemberTaskInfoModel, o0o0o000, context), 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (o000000.OooO00o(Integer.valueOf(roomMemberTaskInfoModel.getState()))) {
                    composerStartRestartGroup.startReplaceableGroup(464277661);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_tick, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(20)), j, composerStartRestartGroup, ((i << 6) & 7168) | 440, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(464277964);
                    TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.Go), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00O00o0(o000o0oo2, roomMemberTaskInfoModel, j, context, i));
            } catch (Throwable th) {
                builder.pop(iPushStyle2);
                throw th;
            }
        } catch (Throwable th2) {
            builder.pop(iPushStyle);
            throw th2;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1302538607);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1302538607, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.OnDialog (LiveRoomMemberTaskDialog.kt:98)");
            }
            com.code.android.util.o00Oo0.OooO0O0(OooO0O0.f60488OooO0Oo, composerStartRestartGroup, 6);
            p158o00OoOOO.OooOOO0.OooO00o(com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47506OooO00o, false, false, null, null, 80, oO00Oo00.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1324755937, true, new OooO0OO((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), composerStartRestartGroup, 100663296, 158);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-292651769);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-292651769, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.TipPopup (LiveRoomMemberTaskDialog.kt:600)");
            }
            if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47518OooOOO0.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(oOO000o.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                oOO000o ooo000o = (oOO000o) viewModel;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                int iMax = Math.max(Math.min(o000000.OooO0Oo(Float.valueOf(Offset.m1436getXimpl(ooo000o.f56380OooOO0o))) - (IntSize.m3925getWidthimpl(((IntSize) mutableState.getValue()).getPackedValue()) / 2), o0000O00.OooO0O0() - IntSize.m3925getWidthimpl(((IntSize) mutableState.getValue()).getPackedValue())), 0);
                AndroidPopup_androidKt.m4004PopupK5zGePQ(null, IntOffsetKt.IntOffset(iMax, (o000000.OooO0Oo(Float.valueOf(Offset.m1437getYimpl(ooo000o.f56380OooOO0o))) - IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue())) - o0000O0.OooO00o(8)), OooO.f60479OooO0Oo, new PopupProperties(true, true, true, null, false, false, 56, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249319263, true, new OooOO0(mutableState, ooo000o, iMax)), composerStartRestartGroup, 28032, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i));
    }
}
