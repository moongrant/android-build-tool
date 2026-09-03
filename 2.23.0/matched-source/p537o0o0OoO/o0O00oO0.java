package p537o0o0OoO;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import com.yalla.yalla.ui.vm.room.VipVm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046Oooooo0.o0O00o0;
import p184o00o00o.Oooo000;
import p184o00o00o.o000oOoO;
import p402o0Oo0OOO.o00O000o;
import p417o0OoO0.o00000OO;
import p417o0OoO0.o000O0Oo;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.oOOO00o0;
import p539o0o0OoOO.r3;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,551:1\n76#2:552\n76#2:787\n76#2:919\n76#2:1007\n76#2:1008\n72#3,6:553\n78#3:587\n72#3,6:697\n78#3:731\n82#3:779\n72#3,6:821\n78#3:855\n82#3:903\n82#3:1006\n72#3,6:1046\n78#3:1080\n82#3:1144\n72#3,6:1150\n78#3:1184\n82#3:1190\n78#4,11:559\n78#4,11:596\n78#4,11:632\n78#4,11:666\n78#4,11:703\n78#4,11:739\n91#4:773\n91#4:778\n91#4:783\n78#4,11:790\n78#4,11:827\n78#4,11:863\n91#4:897\n91#4:902\n91#4:907\n91#4:912\n91#4:917\n78#4,11:928\n78#4,11:960\n91#4:995\n91#4:1000\n91#4:1005\n78#4,11:1017\n78#4,11:1052\n78#4,11:1084\n91#4:1116\n91#4:1143\n91#4:1148\n78#4,11:1156\n91#4:1189\n456#5,8:570\n464#5,3:584\n456#5,8:607\n464#5,3:621\n456#5,8:643\n464#5,3:657\n456#5,8:677\n464#5,3:691\n456#5,8:714\n464#5,3:728\n456#5,8:750\n464#5,3:764\n467#5,3:770\n467#5,3:775\n467#5,3:780\n456#5,8:801\n464#5,3:815\n456#5,8:838\n464#5,3:852\n456#5,8:874\n464#5,3:888\n467#5,3:894\n467#5,3:899\n467#5,3:904\n467#5,3:909\n467#5,3:914\n456#5,8:939\n464#5,3:953\n456#5,8:971\n464#5,3:985\n467#5,3:992\n467#5,3:997\n467#5,3:1002\n456#5,8:1028\n464#5,3:1042\n456#5,8:1063\n464#5,3:1077\n456#5,8:1095\n464#5,3:1109\n467#5,3:1113\n50#5:1132\n49#5:1133\n467#5,3:1140\n467#5,3:1145\n456#5,8:1167\n464#5,3:1181\n467#5,3:1186\n4144#6,6:578\n4144#6,6:615\n4144#6,6:651\n4144#6,6:685\n4144#6,6:722\n4144#6,6:758\n4144#6,6:809\n4144#6,6:846\n4144#6,6:882\n4144#6,6:947\n4144#6,6:979\n4144#6,6:1036\n4144#6,6:1071\n4144#6,6:1103\n4144#6,6:1175\n154#7:588\n154#7:589\n154#7:625\n154#7:695\n154#7:696\n154#7:768\n154#7:769\n154#7:785\n154#7:786\n154#7:819\n154#7:820\n154#7:892\n154#7:893\n154#7:920\n154#7:921\n154#7:957\n154#7:989\n154#7:990\n154#7:991\n154#7:1009\n154#7:1010\n154#7:1081\n154#7,11:1118\n154#7:1129\n154#7:1130\n154#7:1131\n154#7:1185\n66#8,6:590\n72#8:624\n76#8:918\n66#8,6:922\n72#8:956\n76#8:1001\n66#8,6:1011\n72#8:1045\n76#8:1149\n73#9,6:626\n79#9:660\n74#9,5:661\n79#9:694\n72#9,7:732\n79#9:767\n83#9:774\n83#9:784\n77#9,2:788\n79#9:818\n72#9,7:856\n79#9:891\n83#9:898\n83#9:908\n83#9:913\n77#9,2:958\n79#9:988\n83#9:996\n77#9,2:1082\n79#9:1112\n83#9:1117\n1097#10,6:1134\n81#11:1191\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt\n*L\n126#1:552\n219#1:787\n272#1:919\n350#1:1007\n351#1:1008\n132#1:553,6\n132#1:587\n187#1:697,6\n187#1:731\n187#1:779\n243#1:821,6\n243#1:855\n243#1:903\n132#1:1006\n368#1:1046,6\n368#1:1080\n368#1:1144\n482#1:1150,6\n482#1:1184\n482#1:1190\n132#1:559,11\n133#1:596,11\n146#1:632,11\n152#1:666,11\n187#1:703,11\n193#1:739,11\n193#1:773\n187#1:778\n152#1:783\n221#1:790,11\n243#1:827,11\n249#1:863,11\n249#1:897\n243#1:902\n221#1:907\n146#1:912\n133#1:917\n278#1:928,11\n291#1:960,11\n291#1:995\n278#1:1000\n132#1:1005\n355#1:1017,11\n368#1:1052,11\n371#1:1084,11\n371#1:1116\n368#1:1143\n355#1:1148\n482#1:1156,11\n482#1:1189\n132#1:570,8\n132#1:584,3\n133#1:607,8\n133#1:621,3\n146#1:643,8\n146#1:657,3\n152#1:677,8\n152#1:691,3\n187#1:714,8\n187#1:728,3\n193#1:750,8\n193#1:764,3\n193#1:770,3\n187#1:775,3\n152#1:780,3\n221#1:801,8\n221#1:815,3\n243#1:838,8\n243#1:852,3\n249#1:874,8\n249#1:888,3\n249#1:894,3\n243#1:899,3\n221#1:904,3\n146#1:909,3\n133#1:914,3\n278#1:939,8\n278#1:953,3\n291#1:971,8\n291#1:985,3\n291#1:992,3\n278#1:997,3\n132#1:1002,3\n355#1:1028,8\n355#1:1042,3\n368#1:1063,8\n368#1:1077,3\n371#1:1095,8\n371#1:1109,3\n371#1:1113,3\n459#1:1132\n459#1:1133\n368#1:1140,3\n355#1:1145,3\n482#1:1167,8\n482#1:1181,3\n482#1:1186,3\n132#1:578,6\n133#1:615,6\n146#1:651,6\n152#1:685,6\n187#1:722,6\n193#1:758,6\n221#1:809,6\n243#1:846,6\n249#1:882,6\n278#1:947,6\n291#1:979,6\n355#1:1036,6\n368#1:1071,6\n371#1:1103,6\n482#1:1175,6\n135#1:588\n137#1:589\n149#1:625\n180#1:695\n187#1:696\n203#1:768\n204#1:769\n215#1:785\n216#1:786\n241#1:819\n243#1:820\n259#1:892\n260#1:893\n279#1:920\n280#1:921\n295#1:957\n303#1:989\n313#1:990\n321#1:991\n357#1:1009\n359#1:1010\n373#1:1081\n436#1:1118,11\n460#1:1129\n461#1:1130\n465#1:1131\n486#1:1185\n133#1:590,6\n133#1:624\n133#1:918\n278#1:922,6\n278#1:956\n278#1:1001\n355#1:1011,6\n355#1:1045\n355#1:1149\n146#1:626,6\n146#1:660\n152#1:661,5\n152#1:694\n193#1:732,7\n193#1:767\n193#1:774\n152#1:784\n221#1:788,2\n221#1:818\n249#1:856,7\n249#1:891\n249#1:898\n221#1:908\n146#1:913\n291#1:958,2\n291#1:988\n291#1:996\n371#1:1082,2\n371#1:1112\n371#1:1117\n459#1:1134,6\n127#1:1191\n*E\n"})
public final class o0O00oO0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f55329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f55330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55331OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55332OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(VipModel vipModel, int i, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f55329OooO0Oo = vipModel;
            this.f55331OooO0o0 = i;
            this.f55330OooO0o = personalVipModel;
            this.f55332OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55332OooO0oO | 1);
            int i = this.f55331OooO0o0;
            PersonalVipModel personalVipModel = this.f55330OooO0o;
            o0O00oO0.OooO0O0(this.f55329OooO0Oo, i, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f55333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipModel f55334OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AppCompatActivity appCompatActivity, VipModel vipModel) {
            super(0);
            this.f55333OooO0Oo = appCompatActivity;
            this.f55334OooO0o0 = vipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("105128", MapsKt.mapOf(TuplesKt.to("source", 1)));
            AppCompatActivity appCompatActivity = this.f55333OooO0Oo;
            if (appCompatActivity != null) {
                o00O000o.f44512OooOo0o.observe(appCompatActivity, new OooOo(new o0O00o00(appCompatActivity, this.f55334OooO0o0)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function4<p184o00o00o.OooOo00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55335OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f55336OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<List<ItemVipModel>> f55337OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55338OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f55339OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, ArrayList arrayList, AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, VipModel vipModel) {
            super(4);
            this.f55335OooO0Oo = i;
            this.f55337OooO0o0 = arrayList;
            this.f55336OooO0o = appCompatActivity;
            this.f55338OooO0oO = lifecycleOwner;
            this.f55339OooO0oo = vipModel;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p184o00o00o.OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
            int i;
            p184o00o00o.OooOo00 HorizontalPager = oooOo00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((i & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1648936860, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.vip.NeverBeenVipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VipPrivilegeCard.kt:437)");
                }
                o0O00oO0.OooO0Oo(this.f55337OooO0o0.get(oOOO00o0.OooO0OO(iIntValue - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f55335OooO0Oo)), new o0O0O0O(this.f55336OooO0o, this.f55338OooO0oO, this.f55339OooO0oo), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55340OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(1);
            this.f55340OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(oOOO00o0.OooO0OO(num.intValue() - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f55340OooO0Oo));
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f55341OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55342OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55343OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipModel vipModel, int i, int i2) {
            super(2);
            this.f55341OooO0Oo = vipModel;
            this.f55343OooO0o0 = i;
            this.f55342OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55342OooO0o | 1);
            o0O00oO0.OooO00o(this.f55341OooO0Oo, this.f55343OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f55344OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipModel f55345OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(AppCompatActivity appCompatActivity, VipModel vipModel) {
            super(0);
            this.f55344OooO0Oo = appCompatActivity;
            this.f55345OooO0o0 = vipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("105128", MapsKt.mapOf(TuplesKt.to("source", 2)));
            AppCompatActivity appCompatActivity = this.f55344OooO0Oo;
            if (appCompatActivity != null) {
                o00O000o.f44512OooOo0o.observe(appCompatActivity, new OooOo(new o0oO0O0o(appCompatActivity, this.f55345OooO0o0)));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipContent$2$1$1$3\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,551:1\n17#2,5:552\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipContent$2$1$1$3\n*L\n229#1:552,5\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55346OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f55347OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context, PersonalVipModel personalVipModel) {
            super(0);
            this.f55346OooO0Oo = context;
            this.f55347OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("105127", MapsKt.mapOf(TuplesKt.to("source", 1)));
            Context context = this.f55346OooO0Oo;
            Intent intent = new Intent(context, (Class<?>) UserWelfareMallActivity.class);
            PersonalVipModel personalVipModel = this.f55347OooO0o0;
            intent.putExtra("POINT_BALANCE", personalVipModel.getPointBalance());
            intent.putExtra("EXPIRING_POINT", personalVipModel.getExpiringPoint());
            intent.putExtra("POINT_FROZEN", personalVipModel.getPointFrozen());
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f55348OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f55349OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55350OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55351OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(VipModel vipModel, int i, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f55348OooO0Oo = vipModel;
            this.f55350OooO0o0 = i;
            this.f55349OooO0o = personalVipModel;
            this.f55351OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55351OooO0oO | 1);
            int i = this.f55350OooO0o0;
            PersonalVipModel personalVipModel = this.f55349OooO0o;
            o0O00oO0.OooO0O0(this.f55348OooO0Oo, i, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f55352OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Drawable drawable) {
            super(1);
            this.f55352OooO0Oo = drawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Drawable drawable = this.f55352OooO0Oo;
            if (drawable != null) {
                int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(drawBehind.mo2108getSizeNHjbRc());
                int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(drawBehind.mo2108getSizeNHjbRc());
                Intrinsics.checkNotNullParameter(drawable, "<this>");
                drawable.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
            }
            if (drawable != null) {
                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55353OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f55354OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f55355OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55356OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i, VipVm vipVm, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f55353OooO0Oo = i;
            this.f55355OooO0o0 = vipVm;
            this.f55354OooO0o = personalVipModel;
            this.f55356OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55356OooO0oO | 1);
            VipVm vipVm = this.f55355OooO0o0;
            PersonalVipModel personalVipModel = this.f55354OooO0o;
            o0O00oO0.OooO0OO(this.f55353OooO0Oo, vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f55357OooO0Oo;

        public OooOo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f55357OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f55357OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f55357OooO0Oo;
        }

        public final int hashCode() {
            return this.f55357OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55357OooO0Oo.invoke(obj);
        }
    }

    public /* synthetic */ class OooOo00 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            try {
                iArr[VipLevel.Vip1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VipLevel.Vip2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VipLevel.Vip3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VipLevel.Vip4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VipLevel.Vip5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VipLevel.Vip6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(VipModel vipModel, int i, Composer composer, int i2) {
        long j;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1320185316);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320185316, i2, -1, "com.yalla.yalla.ui.screen.user.vip.NeverBeenVipContent (VipPrivilegeCard.kt:340)");
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip1), Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip2), Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip3), Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip4), Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip5), Integer.valueOf(oO00OOO.ic_privilege_card_bg_vip6)});
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int kaVipLv = vipModel.getKaVipLv();
        VipLevel.Companion companion = VipLevel.INSTANCE;
        switch (OooOo00.$EnumSwitchMapping$0[companion.of(kaVipLv).ordinal()]) {
            case 1:
                j = o0oO0O0o.f47012o00000O;
                break;
            case 2:
                j = o0oO0O0o.f47015o00000Oo;
                break;
            case 3:
                j = o0oO0O0o.f47014o00000OO;
                break;
            case 4:
                j = o0oO0O0o.f47016o00000o0;
                break;
            case 5:
                j = o0oO0O0o.f47017o00000oO;
                break;
            case 6:
                j = o0oO0O0o.f47018o00000oo;
                break;
            default:
                j = o0oO0O0o.f47012o00000O;
                break;
        }
        long j2 = j;
        int privilegeCount = vipModel.getPrivilegeCount();
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        int size = privilegeData != null ? privilegeData.size() : 0;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 16;
        float f2 = 4;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(230, SizeKt.fillMaxWidth$default(PaddingKt.m479paddingqDBjuR0(companion2, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2)), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(44)), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooO00o(appCompatActivity, vipModel), 255);
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1251Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.vip_XXX_privilege), String.valueOf(companion.of(vipModel.getKaVipLv()).level())), (Modifier) null, j2, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
        TextKt.m1251Text4IGK_g(o0O00o0.OooO00o(" (", privilegeCount, "/", size, ")"), (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m3647getBottomPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m3662getLastLineBottomEVpEnUU(), null), (LineBreak) null, (Hyphens) null, (TextMotion) null, 15073277, (DefaultConstructorMarker) null), composerStartRestartGroup, 0, 0, 65530);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        List<ItemVipModel> list = vipModel.getPrivilegeData();
        composerStartRestartGroup.startReplaceableGroup(1581512590);
        if (list == null) {
            composer2 = composerStartRestartGroup;
        } else {
            int size2 = (list.size() + 5) / 6;
            Intrinsics.checkNotNullParameter(list, "list");
            int size3 = list.size();
            int i3 = ((size3 + 6) - 1) / 6;
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i4 * 6;
                i4++;
                int i6 = i4 * 6;
                if (i6 >= size3) {
                    i6 = size3;
                }
                arrayList.add(list.subList(i5, i6));
            }
            Oooo000 oooo000OooO00o = o000oOoO.OooO00o(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, composerStartRestartGroup, 6, 0);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            float f3 = (float) 7.5d;
            composer2 = composerStartRestartGroup;
            Pager.OooO00o(Integer.MAX_VALUE, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, PaddingKt.m480paddingqDBjuR0$default(companion5, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(f3), 0.0f, 8, null), 1.0f, false, 2, null), oooo000OooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1648936860, true, new OooO0O0(size2, arrayList, appCompatActivity, lifecycleOwner, vipModel)), composer2, 6, 6, 1016);
            if (size2 > 1) {
                float fM3765constructorimpl = Dp.m3765constructorimpl(f2);
                float fM3765constructorimpl2 = Dp.m3765constructorimpl(f2);
                long j3 = o0oO0O0o.f46946OooO0O0;
                long j4 = o0oO0O0o.f46955OooOO0o;
                Modifier modifierAlign = columnScopeInstance.align(PaddingKt.m476padding3ABfNKs(companion5, Dp.m3765constructorimpl(8)), Alignment.INSTANCE.getCenterHorizontally());
                Integer numValueOf = Integer.valueOf(LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
                Integer numValueOf2 = Integer.valueOf(size2);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(numValueOf) | composer2.changed(numValueOf2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0OO(size2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                p184o00o00o.OooOOOO.OooO00o(oooo000OooO00o, modifierAlign, size2, (Function1) objRememberedValue, j3, j4, fM3765constructorimpl2, fM3765constructorimpl, 0.0f, null, composer2, 14155776, 768);
            }
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(vipModel, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(VipModel vipModel, int i, PersonalVipModel personalVipModel, Composer composer, int i2) {
        int i3;
        String strOooO00o;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1855843786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855843786, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipContent (VipPrivilegeCard.kt:106)");
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f47123o00O0o), Color.m1660boximpl(o0oO0O0o.f47127o00O0oO), Color.m1660boximpl(o0oO0O0o.f47128o00O0oOO), Color.m1660boximpl(o0oO0O0o.f47129o00O0oOo), Color.m1660boximpl(o0oO0O0o.f47131o00O0oo0), Color.m1660boximpl(o0oO0O0o.f47130o00O0oo)});
        List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip1), Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip2), Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip3), Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip4), Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip5), Integer.valueOf(oO00OOO.ic_welfare_count_bg_vip6)});
        if (i >= listListOf.size()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(vipModel, i, personalVipModel, i2));
            return;
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(((Color) listListOf.get(i)).m1680unboximpl(), null, "", null, composerStartRestartGroup, 384, 10);
        int privilegeCount = vipModel.getPrivilegeCount();
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        int size = privilegeData != null ? privilegeData.size() : 0;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal end = companion2.getEnd();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(arrangement, end, composerStartRestartGroup, 48, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 16;
        float f2 = 70;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(f2, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 8, null), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf2.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f2));
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), false, false, 0L, false, null, null, null, new OooOO0(appCompatActivity, vipModel), 255);
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyRowMeasurePolicy, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        float f3 = 28;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_vip_privilege_icon, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        if (personalVipModel.getKaVIPLv() == vipModel.getKaVipLv()) {
            composerStartRestartGroup.startReplaceableGroup(-368873855);
            i3 = 0;
            strOooO00o = StringResources_androidKt.stringResource(oO00OOo0.vip_your_privilege, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            i3 = 0;
            composerStartRestartGroup.startReplaceableGroup(-368873758);
            strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.vip_XXX_privilege, composerStartRestartGroup, 0), String.valueOf(i + 1));
            composerStartRestartGroup.endReplaceableGroup();
        }
        float f4 = 8;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, i3, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i3);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o3, composerM1309constructorimpl5, currentCompositionLocalMap5);
        if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        long sp = TextUnitKt.getSp(12);
        long j = o0oO0O0o.f46956OooOOO;
        TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion);
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
        Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl6, measurePolicyOooO00o4, composerM1309constructorimpl6, currentCompositionLocalMap6);
        if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1251Text4IGK_g(privilegeCount + "/" + size, (Modifier) null, stateM58animateColorAsStateeuL9pac.getValue().m1680unboximpl(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        int i4 = oO00OOO.wealfare_arrow_right;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0);
        float f5 = (float) 2;
        Modifier modifierOooO0Oo = o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
        ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, modifierOooO0Oo, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1711tintxETnrds$default(companion4, ((Color) listListOf.get(i)).m1680unboximpl(), 0, 2, null), composerStartRestartGroup, 56, 56);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f6 = 12;
        SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(1)), Dp.m3765constructorimpl(f6)), o0oO0O0o.f46952OooO0oo, null, 2, null), composerStartRestartGroup, 0);
        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), false, false, 0L, false, null, null, null, new OooOO0O((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), personalVipModel), 255);
        Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically3, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
        Function2 function2OooO00o7 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl7, measurePolicyRowMeasurePolicy2, composerM1309constructorimpl7, currentCompositionLocalMap7);
        if (composerM1309constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash7, composerM1309constructorimpl7, currentCompositeKeyHash7, function2OooO00o7);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_vip_welfare_icon, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default2);
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
        Function2 function2OooO00o8 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl8, measurePolicyOooO00o5, composerM1309constructorimpl8, currentCompositionLocalMap8);
        if (composerM1309constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash8, composerM1309constructorimpl8, currentCompositeKeyHash8, function2OooO00o8);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.welfare_point_count, composerStartRestartGroup, 0), (Modifier) null, j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically4, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor9 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor9);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o9 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl9, measurePolicyOooO00o6, composerM1309constructorimpl9, currentCompositionLocalMap9);
        if (composerM1309constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash9, composerM1309constructorimpl9, currentCompositeKeyHash9, function2OooO00o9);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1251Text4IGK_g(o00000OO.OooO00o(personalVipModel.getPointBalance()), (Modifier) null, stateM58animateColorAsStateeuL9pac.getValue().m1680unboximpl(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1711tintxETnrds$default(companion4, ((Color) listListOf.get(i)).m1680unboximpl(), 0, 2, null), composerStartRestartGroup, 56, 56);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2037491923);
        if (personalVipModel.getPointFrozen() || personalVipModel.getExpiringPoint() > 0) {
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i5 = oO00OOO.ic_welfare_point_tip_bg;
            Object obj = ContextCompat.f5271OooO00o;
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(SizeKt.wrapContentWidth$default(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), Dp.m3765constructorimpl(40)), null, false, 3, null), new OooOOO0(ContextCompat.OooO0OO.OooO0O0(context, i5)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o7 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor10 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierDrawBehind);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor10);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl10 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o10 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl10, measurePolicyOooO00o7, composerM1309constructorimpl10, currentCompositionLocalMap10);
            if (composerM1309constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash10, composerM1309constructorimpl10, currentCompositeKeyHash10, function2OooO00o10);
            }
            function3ModifierMaterializerOf10.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Alignment.Vertical centerVertically5 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = arrangement.getCenter();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.wrapContentHeight$default(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(11), 2, null), null, false, 3, null), companion2.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically5, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor11 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor11);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl11 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o11 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl11, measurePolicyRowMeasurePolicy3, composerM1309constructorimpl11, currentCompositionLocalMap11);
            if (composerM1309constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash11, composerM1309constructorimpl11, currentCompositeKeyHash11, function2OooO00o11);
            }
            function3ModifierMaterializerOf11.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(personalVipModel.getPointFrozen() ? oO00OOO.ic_welfare_point_locked : oO00OOO.ic_welfare_point_expired, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (personalVipModel.getExpiringPoint() > 0) {
                composerStartRestartGroup.startReplaceableGroup(1753132310);
                TextKt.m1252TextIbK3jfQ(o000O0Oo.OooO00o(o0oO0O0o.f47148o00OOO0O, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.welfare_about_to_expire), String.valueOf(personalVipModel.getExpiringPoint())), String.valueOf(personalVipModel.getExpiringPoint())), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3120, 0, 131056);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1753133025);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.welfare_benefits_frozen, composerStartRestartGroup, 0), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3120, 0, 65520);
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
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (OooOo.OooO0o.OooO0O0(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO(vipModel, i, personalVipModel, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(int i, @NotNull VipVm vipVm, @NotNull PersonalVipModel myKaVipModel, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(myKaVipModel, "myKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137219938);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1137219938, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeCard (VipPrivilegeCard.kt:87)");
        }
        int iLevel = VipLevel.INSTANCE.of(i).level();
        VipModel vipModel = vipVm.getKaVipModels().size() > iLevel ? vipVm.getKaVipModels().get(iLevel) : vipVm.getKaVipModels().get(0);
        if (myKaVipModel.getKaVIPLv() >= VipLevel.Vip1.getValue() || myKaVipModel.getOnceBeenVIP()) {
            composerStartRestartGroup.startReplaceableGroup(1096745373);
            OooO0O0(vipModel, i, myKaVipModel, composerStartRestartGroup, ((i2 << 3) & 112) | 520);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1096745444);
            OooO00o(vipModel, i, composerStartRestartGroup, ((i2 << 3) & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i, vipVm, myKaVipModel, i2));
    }

    public static final void OooO0Oo(List list, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1479876202);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479876202, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeGrid (VipPrivilegeCard.kt:476)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        r3.OooO00o(list, 3, null, Dp.m3765constructorimpl(8), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1524449277, true, new o0O0O0o0(function1)), composerStartRestartGroup, 27704, 4);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0OO0(list, i, function1));
    }
}
