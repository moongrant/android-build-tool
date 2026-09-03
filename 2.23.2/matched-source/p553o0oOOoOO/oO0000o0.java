package p553o0oOOoOO;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.Oooo000;
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
import p022Oooo00O.o0O00oO0;
import p046Oooooo0.o0O00o0;
import p230o00oOo0o.o0O0O00;
import p230o00oOo0o.oo0o0Oo;
import p423o0OoO0OO.o00oOoo;
import p423o0OoO0OO.oo0oOO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o00000;
import p562o0oOo000.o000000;
import p583o0oOoo00.o00000OO;
import p587o0oOooOO.w2;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,550:1\n76#2:551\n76#2:786\n76#2:918\n76#2:1006\n76#2:1007\n72#3,6:552\n78#3:586\n72#3,6:696\n78#3:730\n82#3:778\n72#3,6:820\n78#3:854\n82#3:902\n82#3:1005\n72#3,6:1045\n78#3:1079\n82#3:1143\n72#3,6:1149\n78#3:1183\n82#3:1189\n78#4,11:558\n78#4,11:595\n78#4,11:631\n78#4,11:665\n78#4,11:702\n78#4,11:738\n91#4:772\n91#4:777\n91#4:782\n78#4,11:789\n78#4,11:826\n78#4,11:862\n91#4:896\n91#4:901\n91#4:906\n91#4:911\n91#4:916\n78#4,11:927\n78#4,11:959\n91#4:994\n91#4:999\n91#4:1004\n78#4,11:1016\n78#4,11:1051\n78#4,11:1083\n91#4:1115\n91#4:1142\n91#4:1147\n78#4,11:1155\n91#4:1188\n456#5,8:569\n464#5,3:583\n456#5,8:606\n464#5,3:620\n456#5,8:642\n464#5,3:656\n456#5,8:676\n464#5,3:690\n456#5,8:713\n464#5,3:727\n456#5,8:749\n464#5,3:763\n467#5,3:769\n467#5,3:774\n467#5,3:779\n456#5,8:800\n464#5,3:814\n456#5,8:837\n464#5,3:851\n456#5,8:873\n464#5,3:887\n467#5,3:893\n467#5,3:898\n467#5,3:903\n467#5,3:908\n467#5,3:913\n456#5,8:938\n464#5,3:952\n456#5,8:970\n464#5,3:984\n467#5,3:991\n467#5,3:996\n467#5,3:1001\n456#5,8:1027\n464#5,3:1041\n456#5,8:1062\n464#5,3:1076\n456#5,8:1094\n464#5,3:1108\n467#5,3:1112\n50#5:1131\n49#5:1132\n467#5,3:1139\n467#5,3:1144\n456#5,8:1166\n464#5,3:1180\n467#5,3:1185\n4144#6,6:577\n4144#6,6:614\n4144#6,6:650\n4144#6,6:684\n4144#6,6:721\n4144#6,6:757\n4144#6,6:808\n4144#6,6:845\n4144#6,6:881\n4144#6,6:946\n4144#6,6:978\n4144#6,6:1035\n4144#6,6:1070\n4144#6,6:1102\n4144#6,6:1174\n154#7:587\n154#7:588\n154#7:624\n154#7:694\n154#7:695\n154#7:767\n154#7:768\n154#7:784\n154#7:785\n154#7:818\n154#7:819\n154#7:891\n154#7:892\n154#7:919\n154#7:920\n154#7:956\n154#7:988\n154#7:989\n154#7:990\n154#7:1008\n154#7:1009\n154#7:1080\n154#7,11:1117\n154#7:1128\n154#7:1129\n154#7:1130\n154#7:1184\n66#8,6:589\n72#8:623\n76#8:917\n66#8,6:921\n72#8:955\n76#8:1000\n66#8,6:1010\n72#8:1044\n76#8:1148\n73#9,6:625\n79#9:659\n74#9,5:660\n79#9:693\n72#9,7:731\n79#9:766\n83#9:773\n83#9:783\n77#9,2:787\n79#9:817\n72#9,7:855\n79#9:890\n83#9:897\n83#9:907\n83#9:912\n77#9,2:957\n79#9:987\n83#9:995\n77#9,2:1081\n79#9:1111\n83#9:1116\n1097#10,6:1133\n81#11:1190\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt\n*L\n126#1:551\n219#1:786\n272#1:918\n349#1:1006\n350#1:1007\n132#1:552,6\n132#1:586\n187#1:696,6\n187#1:730\n187#1:778\n243#1:820,6\n243#1:854\n243#1:902\n132#1:1005\n367#1:1045,6\n367#1:1079\n367#1:1143\n481#1:1149,6\n481#1:1183\n481#1:1189\n132#1:558,11\n133#1:595,11\n146#1:631,11\n152#1:665,11\n187#1:702,11\n193#1:738,11\n193#1:772\n187#1:777\n152#1:782\n221#1:789,11\n243#1:826,11\n249#1:862,11\n249#1:896\n243#1:901\n221#1:906\n146#1:911\n133#1:916\n278#1:927,11\n291#1:959,11\n291#1:994\n278#1:999\n132#1:1004\n354#1:1016,11\n367#1:1051,11\n370#1:1083,11\n370#1:1115\n367#1:1142\n354#1:1147\n481#1:1155,11\n481#1:1188\n132#1:569,8\n132#1:583,3\n133#1:606,8\n133#1:620,3\n146#1:642,8\n146#1:656,3\n152#1:676,8\n152#1:690,3\n187#1:713,8\n187#1:727,3\n193#1:749,8\n193#1:763,3\n193#1:769,3\n187#1:774,3\n152#1:779,3\n221#1:800,8\n221#1:814,3\n243#1:837,8\n243#1:851,3\n249#1:873,8\n249#1:887,3\n249#1:893,3\n243#1:898,3\n221#1:903,3\n146#1:908,3\n133#1:913,3\n278#1:938,8\n278#1:952,3\n291#1:970,8\n291#1:984,3\n291#1:991,3\n278#1:996,3\n132#1:1001,3\n354#1:1027,8\n354#1:1041,3\n367#1:1062,8\n367#1:1076,3\n370#1:1094,8\n370#1:1108,3\n370#1:1112,3\n458#1:1131\n458#1:1132\n367#1:1139,3\n354#1:1144,3\n481#1:1166,8\n481#1:1180,3\n481#1:1185,3\n132#1:577,6\n133#1:614,6\n146#1:650,6\n152#1:684,6\n187#1:721,6\n193#1:757,6\n221#1:808,6\n243#1:845,6\n249#1:881,6\n278#1:946,6\n291#1:978,6\n354#1:1035,6\n367#1:1070,6\n370#1:1102,6\n481#1:1174,6\n135#1:587\n137#1:588\n149#1:624\n180#1:694\n187#1:695\n203#1:767\n204#1:768\n215#1:784\n216#1:785\n241#1:818\n243#1:819\n259#1:891\n260#1:892\n279#1:919\n280#1:920\n295#1:956\n303#1:988\n312#1:989\n320#1:990\n356#1:1008\n358#1:1009\n372#1:1080\n435#1:1117,11\n459#1:1128\n460#1:1129\n464#1:1130\n485#1:1184\n133#1:589,6\n133#1:623\n133#1:917\n278#1:921,6\n278#1:955\n278#1:1000\n354#1:1010,6\n354#1:1044\n354#1:1148\n146#1:625,6\n146#1:659\n152#1:660,5\n152#1:693\n193#1:731,7\n193#1:766\n193#1:773\n152#1:783\n221#1:787,2\n221#1:817\n249#1:855,7\n249#1:890\n249#1:897\n221#1:907\n146#1:912\n291#1:957,2\n291#1:987\n291#1:995\n370#1:1081,2\n370#1:1111\n370#1:1116\n458#1:1133,6\n127#1:1190\n*E\n"})
public final class oO0000o0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f56060OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f56061OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56062OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56063OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(VipModel vipModel, int i, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f56060OooO0Oo = vipModel;
            this.f56062OooO0o0 = i;
            this.f56061OooO0o = personalVipModel;
            this.f56063OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56063OooO0oO | 1);
            int i = this.f56062OooO0o0;
            PersonalVipModel personalVipModel = this.f56061OooO0o;
            oO0000o0.OooO0O0(this.f56060OooO0Oo, i, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f56064OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipModel f56065OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AppCompatActivity appCompatActivity, VipModel vipModel) {
            super(0);
            this.f56064OooO0Oo = appCompatActivity;
            this.f56065OooO0o0 = vipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("105128", MapsKt.mapOf(TuplesKt.to("source", 1)));
            AppCompatActivity appCompatActivity = this.f56064OooO0Oo;
            if (appCompatActivity != null) {
                o00000OO.f56681OooOo0o.observe(appCompatActivity, new OooOo(new oO0000Oo(appCompatActivity, this.f56065OooO0o0)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f56066OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f56067OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<List<ItemVipModel>> f56068OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f56069OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f56070OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, ArrayList arrayList, AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, VipModel vipModel) {
            super(4);
            this.f56066OooO0Oo = i;
            this.f56068OooO0o0 = arrayList;
            this.f56067OooO0o = appCompatActivity;
            this.f56069OooO0oO = lifecycleOwner;
            this.f56070OooO0oo = vipModel;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            o0O0O00 HorizontalPager = o0o0o00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1648936860, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.vip.NeverBeenVipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VipPrivilegeCard.kt:437)");
                }
                oO0000o0.OooO0Oo(this.f56068OooO0o0.get(o00000.OooO0OO(iIntValue - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f56066OooO0Oo)), new oO000(this.f56067OooO0o, this.f56069OooO0oO, this.f56070OooO0oo), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f56071OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(1);
            this.f56071OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(o00000.OooO0OO(num.intValue() - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f56071OooO0Oo));
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f56072OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f56073OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56074OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipModel vipModel, int i, int i2) {
            super(2);
            this.f56072OooO0Oo = vipModel;
            this.f56074OooO0o0 = i;
            this.f56073OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56073OooO0o | 1);
            oO0000o0.OooO00o(this.f56072OooO0Oo, this.f56074OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f56075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipModel f56076OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(AppCompatActivity appCompatActivity, VipModel vipModel) {
            super(0);
            this.f56075OooO0Oo = appCompatActivity;
            this.f56076OooO0o0 = vipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("105128", MapsKt.mapOf(TuplesKt.to("source", 2)));
            AppCompatActivity appCompatActivity = this.f56075OooO0Oo;
            if (appCompatActivity != null) {
                o00000OO.f56681OooOo0o.observe(appCompatActivity, new OooOo(new oO000O0(appCompatActivity, this.f56076OooO0o0)));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipPrivilegeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipContent$2$1$1$3\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,550:1\n17#2,5:551\n*S KotlinDebug\n*F\n+ 1 VipPrivilegeCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipPrivilegeCardKt$VipContent$2$1$1$3\n*L\n229#1:551,5\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f56077OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f56078OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context, PersonalVipModel personalVipModel) {
            super(0);
            this.f56077OooO0Oo = context;
            this.f56078OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("105127", MapsKt.mapOf(TuplesKt.to("source", 1)));
            Context context = this.f56077OooO0Oo;
            Intent intent = new Intent(context, (Class<?>) UserWelfareMallActivity.class);
            PersonalVipModel personalVipModel = this.f56078OooO0o0;
            intent.putExtra("POINT_BALANCE", personalVipModel.getPointBalance());
            intent.putExtra("EXPIRING_POINT", personalVipModel.getExpiringPoint());
            intent.putExtra("POINT_FROZEN", personalVipModel.getPointFrozen());
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f56079OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f56080OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56081OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56082OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(VipModel vipModel, int i, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f56079OooO0Oo = vipModel;
            this.f56081OooO0o0 = i;
            this.f56080OooO0o = personalVipModel;
            this.f56082OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56082OooO0oO | 1);
            int i = this.f56081OooO0o0;
            PersonalVipModel personalVipModel = this.f56080OooO0o;
            oO0000o0.OooO0O0(this.f56079OooO0Oo, i, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f56083OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Drawable drawable) {
            super(1);
            this.f56083OooO0Oo = drawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Drawable drawable = this.f56083OooO0Oo;
            if (drawable != null) {
                drawable.setBounds(0, 0, (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
            }
            if (drawable != null) {
                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f56084OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f56085OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f56086OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56087OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i, VipVm vipVm, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f56084OooO0Oo = i;
            this.f56086OooO0o0 = vipVm;
            this.f56085OooO0o = personalVipModel;
            this.f56087OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56087OooO0oO | 1);
            VipVm vipVm = this.f56086OooO0o0;
            PersonalVipModel personalVipModel = this.f56085OooO0o;
            oO0000o0.OooO0OO(this.f56084OooO0Oo, vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56088OooO0Oo;

        public OooOo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56088OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56088OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56088OooO0Oo;
        }

        public final int hashCode() {
            return this.f56088OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56088OooO0Oo.invoke(obj);
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
            ComposerKt.traceEventStart(1320185316, i2, -1, "com.yalla.yalla.ui.screen.user.vip.NeverBeenVipContent (VipPrivilegeCard.kt:339)");
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip1), Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip2), Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip3), Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip4), Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip5), Integer.valueOf(p562o0oOo000.o0O0O00.ic_privilege_card_bg_vip6)});
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int kaVipLv = vipModel.getKaVipLv();
        VipLevel.Companion companion = VipLevel.INSTANCE;
        switch (OooOo00.$EnumSwitchMapping$0[companion.of(kaVipLv).ordinal()]) {
            case 1:
                j = o0OOo000.f48205o00000o0;
                break;
            case 2:
                j = o0OOo000.f48206o00000oO;
                break;
            case 3:
                j = o0OOo000.f48219o0000Ooo;
                break;
            case 4:
                j = o0OOo000.f48207o00000oo;
                break;
            case 5:
                j = o0OOo000.f48210o0000O00;
                break;
            case 6:
                j = o0OOo000.f48228o0000oo;
                break;
            default:
                j = o0OOo000.f48205o00000o0;
                break;
        }
        long j2 = j;
        int privilegeCount = vipModel.getPrivilegeCount();
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        int size = privilegeData != null ? privilegeData.size() : 0;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 16;
        float f2 = 4;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(230, SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(companion2, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2)), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion2, Dp.m3775constructorimpl(44)), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooO00o(appCompatActivity, vipModel), 255);
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(o000000.vip_XXX_privilege), String.valueOf(companion.of(vipModel.getKaVipLv()).level())), (Modifier) null, j2, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
        TextKt.m1261Text4IGK_g(o0O00o0.OooO00o(" (", privilegeCount, "/", size, ")"), (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m3657getBottomPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m3672getLastLineBottomEVpEnUU(), null), (LineBreak) null, (Hyphens) null, (TextMotion) null, 15073277, (DefaultConstructorMarker) null), composerStartRestartGroup, 0, 0, 65530);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        List<ItemVipModel> list = vipModel.getPrivilegeData();
        composerStartRestartGroup.startReplaceableGroup(1581512552);
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
            p230o00oOo0o.o000000 o000000VarOooO00o = p230o00oOo0o.o00000.OooO00o(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, composerStartRestartGroup, 6, 0);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            float f3 = (float) 7.5d;
            composer2 = composerStartRestartGroup;
            Pager.OooO00o(Integer.MAX_VALUE, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, PaddingKt.m482paddingqDBjuR0$default(companion5, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(12), Dp.m3775constructorimpl(f3), 0.0f, 8, null), 1.0f, false, 2, null), o000000VarOooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1648936860, true, new OooO0O0(size2, arrayList, appCompatActivity, lifecycleOwner, vipModel)), composer2, 6, 6, 1016);
            if (size2 > 1) {
                float fM3775constructorimpl = Dp.m3775constructorimpl(f2);
                float fM3775constructorimpl2 = Dp.m3775constructorimpl(f2);
                long j3 = o0OOo000.f48135OooO0O0;
                long j4 = o0OOo000.f48144OooOO0o;
                Modifier modifierAlign = columnScopeInstance.align(PaddingKt.m478padding3ABfNKs(companion5, Dp.m3775constructorimpl(8)), Alignment.INSTANCE.getCenterHorizontally());
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
                oo0o0Oo.OooO00o(o000000VarOooO00o, modifierAlign, size2, (Function1) objRememberedValue, j3, j4, fM3775constructorimpl2, fM3775constructorimpl, 0.0f, null, composer2, 14155776, 768);
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
        List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48321o00O0oOo), Color.m1671boximpl(o0OOo000.f48323o00O0oo0), Color.m1671boximpl(o0OOo000.f48322o00O0oo), Color.m1671boximpl(o0OOo000.f48324o00O0ooo), Color.m1671boximpl(o0OOo000.f48289o00O), Color.m1671boximpl(o0OOo000.f48327o00OO000)});
        List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip1), Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip2), Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip3), Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip4), Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip5), Integer.valueOf(p562o0oOo000.o0O0O00.ic_welfare_count_bg_vip6)});
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
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(((Color) listListOf.get(i)).m1691unboximpl(), null, "", null, composerStartRestartGroup, 384, 10);
        int privilegeCount = vipModel.getPrivilegeCount();
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        int size = privilegeData != null ? privilegeData.size() : 0;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal end = companion2.getEnd();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(arrangement, end, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 16;
        float f2 = 70;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f2, SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 8, null), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf2.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2));
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O0, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), false, false, 0L, false, null, null, null, new OooOO0(appCompatActivity, vipModel), 255);
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyRowMeasurePolicy, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        float f3 = 28;
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_vip_privilege_icon, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        if (personalVipModel.getKaVIPLv() == vipModel.getKaVipLv()) {
            composerStartRestartGroup.startReplaceableGroup(-368873860);
            i3 = 0;
            strOooO00o = StringResources_androidKt.stringResource(o000000.vip_your_privilege, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            i3 = 0;
            composerStartRestartGroup.startReplaceableGroup(-368873763);
            strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.vip_XXX_privilege, composerStartRestartGroup, 0), String.valueOf(i + 1));
            composerStartRestartGroup.endReplaceableGroup();
        }
        float f4 = 8;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, i3, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i3);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O1, composerM1320constructorimpl5, currentCompositionLocalMap5);
        if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        long sp = TextUnitKt.getSp(12);
        long j = o0OOo000.f48145OooOOO;
        TextKt.m1261Text4IGK_g(strOooO00o, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl6, measurePolicyOooO0O2, composerM1320constructorimpl6, currentCompositionLocalMap6);
        if (composerM1320constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash6, composerM1320constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1261Text4IGK_g(privilegeCount + "/" + size, (Modifier) null, stateM58animateColorAsStateeuL9pac.getValue().m1691unboximpl(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        int i4 = p562o0oOo000.o0O0O00.wealfare_arrow_right;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0);
        float f5 = (float) 2;
        Modifier modifierOooO0Oo = com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6);
        ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, modifierOooO0Oo, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1722tintxETnrds$default(companion4, ((Color) listListOf.get(i)).m1691unboximpl(), 0, 2, null), composerStartRestartGroup, 56, 56);
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
        SpacerKt.Spacer(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(1)), Dp.m3775constructorimpl(f6)), o0OOo000.f48141OooO0oo, null, 2, null), composerStartRestartGroup, 0);
        Modifier modifierOooO0O2 = com.code.android.util.o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), false, false, 0L, false, null, null, null, new OooOO0O((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), personalVipModel), 255);
        Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically3, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor7);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl7 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o7 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl7, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl7, currentCompositionLocalMap7);
        if (composerM1320constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash7, composerM1320constructorimpl7, currentCompositeKeyHash7, function2OooO00o7);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_vip_welfare_icon, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O3 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor8);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl8 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o8 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl8, measurePolicyOooO0O3, composerM1320constructorimpl8, currentCompositionLocalMap8);
        if (composerM1320constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash8, composerM1320constructorimpl8, currentCompositeKeyHash8, function2OooO00o8);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.welfare_point_count, composerStartRestartGroup, 0), (Modifier) null, j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O4 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically4, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl9 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o9 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl9, measurePolicyOooO0O4, composerM1320constructorimpl9, currentCompositionLocalMap9);
        if (composerM1320constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash9, composerM1320constructorimpl9, currentCompositeKeyHash9, function2OooO00o9);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1261Text4IGK_g(o00oOoo.OooO00o(personalVipModel.getPointBalance()), (Modifier) null, stateM58animateColorAsStateeuL9pac.getValue().m1691unboximpl(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1722tintxETnrds$default(companion4, ((Color) listListOf.get(i)).m1691unboximpl(), 0, 2, null), composerStartRestartGroup, 56, 56);
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
        composerStartRestartGroup.startReplaceableGroup(2037491918);
        if (personalVipModel.getPointFrozen() || personalVipModel.getExpiringPoint() > 0) {
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i5 = p562o0oOo000.o0O0O00.ic_welfare_point_tip_bg;
            Object obj = ContextCompat.f5281OooO00o;
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(SizeKt.wrapContentWidth$default(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), Dp.m3775constructorimpl(40)), null, false, 3, null), new OooOOO0(ContextCompat.OooO0OO.OooO0O0(context, i5)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl10 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o10 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl10, measurePolicyOooO00o3, composerM1320constructorimpl10, currentCompositionLocalMap10);
            if (composerM1320constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash10, composerM1320constructorimpl10, currentCompositeKeyHash10, function2OooO00o10);
            }
            function3ModifierMaterializerOf10.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Alignment.Vertical centerVertically5 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = arrangement.getCenter();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.wrapContentHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(11), 2, null), null, false, 3, null), companion2.getBottomCenter());
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
            Composer composerM1320constructorimpl11 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o11 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl11, measurePolicyRowMeasurePolicy3, composerM1320constructorimpl11, currentCompositionLocalMap11);
            if (composerM1320constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash11, composerM1320constructorimpl11, currentCompositeKeyHash11, function2OooO00o11);
            }
            function3ModifierMaterializerOf11.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(personalVipModel.getPointFrozen() ? p562o0oOo000.o0O0O00.ic_welfare_point_locked : p562o0oOo000.o0O0O00.ic_welfare_point_expired, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (personalVipModel.getExpiringPoint() > 0) {
                composerStartRestartGroup.startReplaceableGroup(1753132305);
                TextKt.m1262TextIbK3jfQ(oo0oOO0.OooO00o(o0OOo000.f48341o00OOOO0, o0000O.OooO00o(o0000.OooO0OO(o000000.welfare_about_to_expire), String.valueOf(personalVipModel.getExpiringPoint())), String.valueOf(personalVipModel.getExpiringPoint())), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3120, 0, 131056);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1753132987);
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.welfare_benefits_frozen, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3120, 0, 65520);
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
        if (androidx.compose.animation.OooOo.OooO00o(composer2)) {
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
            ComposerKt.traceEventStart(-1137219938, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeCard (VipPrivilegeCard.kt:91)");
        }
        int iLevel = VipLevel.INSTANCE.of(i).level();
        VipModel vipModel = vipVm.getKaVipModels().size() > iLevel ? vipVm.getKaVipModels().get(iLevel) : vipVm.getKaVipModels().get(0);
        if (myKaVipModel.getKaVIPLv() >= VipLevel.Vip1.getValue() || myKaVipModel.getOnceBeenVIP()) {
            composerStartRestartGroup.startReplaceableGroup(1096745368);
            OooO0O0(vipModel, i, myKaVipModel, composerStartRestartGroup, ((i2 << 3) & 112) | 520);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1096745439);
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
            ComposerKt.traceEventStart(1479876202, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipPrivilegeGrid (VipPrivilegeCard.kt:478)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        w2.OooO00o(list, 3, null, Dp.m3775constructorimpl(8), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1524449277, true, new oO0o0o(function1)), composerStartRestartGroup, 27704, 4);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OoOO0(list, i, function1));
    }
}
