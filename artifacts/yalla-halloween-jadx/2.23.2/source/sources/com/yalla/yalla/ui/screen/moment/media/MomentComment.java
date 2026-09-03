package com.yalla.yalla.ui.screen.moment.media;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p412o0Oo0o0O.o000O000;
import p423o0OoO0OO.o00O000o;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p535o0o0Oo0.oO00o00O;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;
import p609o0oo0OOO.i5;
import p644o0ooOOo.o;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.oO000;
import p644o0ooOOo.oO000O0;
import p644o0ooOOo.oO0OoOO0;
import p644o0ooOOo.oO0o0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentComment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentComment.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentComment\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,639:1\n154#2:640\n154#2:729\n154#2:735\n154#2:806\n154#2:847\n154#2:848\n154#2:849\n154#2:885\n154#2:901\n154#2:913\n154#2:992\n154#2:1051\n154#2:1052\n154#2:1088\n154#2:1089\n154#2:1095\n154#2:1131\n154#2:1132\n154#2:1133\n154#2:1134\n154#2:1135\n154#2:1136\n154#2:1137\n154#2:1138\n154#2:1139\n154#2:1140\n154#2:1141\n154#2:1142\n154#2:1143\n154#2:1144\n154#2:1145\n154#2:1151\n154#2:1210\n154#2:1211\n154#2:1254\n154#2:1255\n154#2:1287\n154#2:1322\n154#2:1323\n73#3,4:641\n77#3,20:652\n25#4:645\n456#4,8:711\n464#4,3:725\n467#4,3:730\n456#4,8:753\n464#4,3:767\n456#4,8:788\n464#4,3:802\n456#4,8:824\n464#4,3:838\n467#4,3:842\n456#4,8:867\n464#4,3:881\n467#4,3:886\n467#4,3:891\n467#4,3:896\n50#4:914\n49#4:915\n456#4,8:939\n464#4,3:953\n456#4,8:974\n464#4,3:988\n456#4,8:1010\n464#4,3:1024\n50#4:1028\n49#4:1029\n467#4,3:1036\n467#4,3:1041\n467#4,3:1046\n456#4,8:1070\n464#4,3:1084\n467#4,3:1090\n456#4,8:1113\n464#4,3:1127\n467#4,3:1146\n456#4,8:1168\n464#4,3:1182\n467#4,3:1186\n25#4:1203\n36#4:1212\n456#4,8:1236\n464#4,3:1250\n467#4,3:1256\n25#4:1261\n25#4:1280\n456#4,8:1304\n464#4,3:1318\n467#4,3:1324\n955#5,6:646\n1097#5,6:916\n1097#5,6:1030\n1097#5,6:1204\n1097#5,6:1213\n1097#5,6:1262\n1097#5,6:1281\n81#6,11:672\n81#6,11:683\n81#6,11:902\n81#6,11:1191\n81#6,11:1268\n66#7,6:694\n72#7:728\n76#7:734\n66#7,6:1053\n72#7:1087\n76#7:1094\n67#7,5:1152\n72#7:1185\n76#7:1190\n66#7,6:1219\n72#7:1253\n76#7:1260\n67#7,5:1288\n72#7:1321\n76#7:1328\n78#8,11:700\n91#8:733\n78#8,11:742\n78#8,11:777\n78#8,11:813\n91#8:845\n78#8,11:856\n91#8:889\n91#8:894\n91#8:899\n78#8,11:928\n78#8,11:963\n78#8,11:999\n91#8:1039\n91#8:1044\n91#8:1049\n78#8,11:1059\n91#8:1093\n78#8,11:1102\n91#8:1149\n78#8,11:1157\n91#8:1189\n78#8,11:1225\n91#8:1259\n78#8,11:1293\n91#8:1327\n4144#9,6:719\n4144#9,6:761\n4144#9,6:796\n4144#9,6:832\n4144#9,6:875\n4144#9,6:947\n4144#9,6:982\n4144#9,6:1018\n4144#9,6:1078\n4144#9,6:1121\n4144#9,6:1176\n4144#9,6:1244\n4144#9,6:1312\n73#10,6:736\n79#10:770\n73#10,6:850\n79#10:884\n83#10:890\n83#10:900\n73#10,6:922\n79#10:956\n83#10:1050\n73#10,6:1096\n79#10:1130\n83#10:1150\n72#11,6:771\n78#11:805\n72#11,6:807\n78#11:841\n82#11:846\n82#11:895\n72#11,6:957\n78#11:991\n72#11,6:993\n78#11:1027\n82#11:1040\n82#11:1045\n76#12:1202\n76#12:1279\n81#13:1329\n107#13,2:1330\n*S KotlinDebug\n*F\n+ 1 MomentComment.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentComment\n*L\n89#1:640\n181#1:729\n189#1:735\n223#1:806\n264#1:847\n266#1:848\n268#1:849\n273#1:885\n291#1:901\n305#1:913\n335#1:992\n368#1:1051\n378#1:1052\n384#1:1088\n391#1:1089\n404#1:1095\n414#1:1131\n418#1:1132\n421#1:1133\n428#1:1134\n435#1:1135\n439#1:1136\n445#1:1137\n446#1:1138\n451#1:1139\n452#1:1140\n456#1:1141\n461#1:1142\n462#1:1143\n465#1:1144\n470#1:1145\n481#1:1151\n528#1:1210\n529#1:1211\n568#1:1254\n578#1:1255\n602#1:1287\n629#1:1322\n634#1:1323\n86#1:641,4\n86#1:652,20\n86#1:645\n175#1:711,8\n175#1:725,3\n175#1:730,3\n186#1:753,8\n186#1:767,3\n216#1:788,8\n216#1:802,3\n220#1:824,8\n220#1:838,3\n220#1:842,3\n261#1:867,8\n261#1:881,3\n261#1:886,3\n216#1:891,3\n186#1:896,3\n311#1:914\n311#1:915\n302#1:939,8\n302#1:953,3\n328#1:974,8\n328#1:988,3\n332#1:1010,8\n332#1:1024,3\n357#1:1028\n357#1:1029\n332#1:1036,3\n328#1:1041,3\n302#1:1046,3\n375#1:1070,8\n375#1:1084,3\n375#1:1090,3\n400#1:1113,8\n400#1:1127,3\n400#1:1146,3\n477#1:1168,8\n477#1:1182,3\n477#1:1186,3\n524#1:1203\n531#1:1212\n526#1:1236,8\n526#1:1250,3\n526#1:1256,3\n591#1:1261\n595#1:1280\n597#1:1304,8\n597#1:1318,3\n597#1:1324,3\n86#1:646,6\n311#1:916,6\n357#1:1030,6\n524#1:1204,6\n531#1:1213,6\n591#1:1262,6\n595#1:1281,6\n172#1:672,11\n173#1:683,11\n301#1:902,11\n522#1:1191,11\n592#1:1268,11\n175#1:694,6\n175#1:728\n175#1:734\n375#1:1053,6\n375#1:1087\n375#1:1094\n477#1:1152,5\n477#1:1185\n477#1:1190\n526#1:1219,6\n526#1:1253\n526#1:1260\n597#1:1288,5\n597#1:1321\n597#1:1328\n175#1:700,11\n175#1:733\n186#1:742,11\n216#1:777,11\n220#1:813,11\n220#1:845\n261#1:856,11\n261#1:889\n216#1:894\n186#1:899\n302#1:928,11\n328#1:963,11\n332#1:999,11\n332#1:1039\n328#1:1044\n302#1:1049\n375#1:1059,11\n375#1:1093\n400#1:1102,11\n400#1:1149\n477#1:1157,11\n477#1:1189\n526#1:1225,11\n526#1:1259\n597#1:1293,11\n597#1:1327\n175#1:719,6\n186#1:761,6\n216#1:796,6\n220#1:832,6\n261#1:875,6\n302#1:947,6\n328#1:982,6\n332#1:1018,6\n375#1:1078,6\n400#1:1121,6\n477#1:1176,6\n526#1:1244,6\n597#1:1312,6\n186#1:736,6\n186#1:770\n261#1:850,6\n261#1:884\n261#1:890\n186#1:900\n302#1:922,6\n302#1:956\n302#1:1050\n400#1:1096,6\n400#1:1130\n400#1:1150\n216#1:771,6\n216#1:805\n220#1:807,6\n220#1:841\n220#1:846\n216#1:895\n328#1:957,6\n328#1:991\n332#1:993,6\n332#1:1027\n332#1:1040\n328#1:1045\n523#1:1202\n593#1:1279\n524#1:1329\n524#1:1330,2\n*E\n"})
public final class MomentComment {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MomentComment f28751OooO00o = new MomentComment();

    public static final class OooO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28758OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28759OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(1);
            this.f28758OooO0Oo = momentVideoVM;
            this.f28759OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f28758OooO0Oo.setShowDialogCommentMore(this.f28759OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28760OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28761OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f28760OooO0Oo = momentVideoVM;
            this.f28761OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28760OooO0Oo.setShowDialogCommentMore(this.f28761OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28762OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28763OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super Integer, Unit> function1, int i) {
            super(0);
            this.f28762OooO0Oo = function1;
            this.f28763OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<Integer, Unit> function1 = this.f28762OooO0Oo;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.f28763OooO0o0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28764OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28765OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f28764OooO0Oo = momentVideoVM;
            this.f28765OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28764OooO0Oo.setShowDialogCommentMore(this.f28765OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28766OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentCommentDetailModel momentCommentDetailModel) {
            super(0);
            this.f28766OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                com.yalla.yalla.ui.screen.moment.media.OooO00o onLogin = new com.yalla.yalla.ui.screen.moment.media.OooO00o(activityOooO0O0, this.f28766OooO0Oo);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O1 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O1);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28767OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28768OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function1<? super Integer, Unit> function1, int i) {
            super(0);
            this.f28767OooO0Oo = function1;
            this.f28768OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<Integer, Unit> function1 = this.f28767OooO0Oo;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.f28768OooO0o0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28769OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28771OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28772OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28773OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28774OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28775OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(int i, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, Function1<? super Integer, Unit> function1, int i2, int i3) {
            super(2);
            this.f28772OooO0o0 = i;
            this.f28771OooO0o = momentCommentDetailModel;
            this.f28773OooO0oO = momentDetailModel;
            this.f28774OooO0oo = function1;
            this.f28769OooO = i2;
            this.f28775OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO00o(this.f28772OooO0o0, this.f28771OooO0o, this.f28773OooO0oO, this.f28774OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28769OooO | 1), this.f28775OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f28776OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58049OooO0o;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO0OoOO0.OooO00o(oVar, o0oo.f58023OooO0Oo, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f28777OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f28778OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28779OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(int i, Function1<? super Integer, Unit> function1) {
            super(0);
            this.f28778OooO0Oo = i;
            this.f28779OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f28778OooO0Oo != 0) {
                this.f28779OooO0o0.invoke(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28781OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Long f28782OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28783OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f28784OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(Long l, int i, Function1<? super Integer, Unit> function1, int i2) {
            super(2);
            this.f28782OooO0o0 = l;
            this.f28781OooO0o = i;
            this.f28783OooO0oO = function1;
            this.f28784OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0O0(this.f28782OooO0o0, this.f28781OooO0o, this.f28783OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28784OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f28785OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f28786OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(int i, Function1<? super Integer, Unit> function1) {
            super(0);
            this.f28785OooO0Oo = i;
            this.f28786OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f28785OooO0Oo != 1) {
                this.f28786OooO0o0.invoke(1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentCommentDetailModel, Unit> f28787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28788OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(Function1<? super MomentCommentDetailModel, Unit> function1, MomentCommentDetailModel momentCommentDetailModel) {
            super(0);
            this.f28787OooO0Oo = function1;
            this.f28788OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentCommentDetailModel, Unit> function1 = this.f28787OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f28788OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28789OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28790OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f28789OooO0Oo = momentCommentDetailModel;
            this.f28790OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentCommentDetailModel momentCommentDetailModel = this.f28789OooO0Oo;
            if (!momentCommentDetailModel.isHide()) {
                this.f28790OooO0o0.setShowDialogCommentMore(momentCommentDetailModel);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f28791OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f28793OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28794OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f28795OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f28796OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28797OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f28798OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f28799OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(BoxScope boxScope, long j, long j2, long j3, long j4, Modifier modifier, int i, int i2) {
            super(2);
            this.f28794OooO0o0 = boxScope;
            this.f28793OooO0o = j;
            this.f28795OooO0oO = j2;
            this.f28796OooO0oo = j3;
            this.f28791OooO = j4;
            this.f28797OooOO0 = modifier;
            this.f28798OooOO0O = i;
            this.f28799OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO(this.f28794OooO0o0, this.f28793OooO0o, this.f28795OooO0oO, this.f28796OooO0oo, this.f28791OooO, this.f28797OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28798OooOO0O | 1), this.f28799OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28800OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28802OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28803OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f28804OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f28805OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(BoxScope boxScope, MomentCommentDetailModel momentCommentDetailModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f28803OooO0o0 = boxScope;
            this.f28802OooO0o = momentCommentDetailModel;
            this.f28804OooO0oO = modifier;
            this.f28805OooO0oo = i;
            this.f28800OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0oo(this.f28803OooO0o0, this.f28802OooO0o, this.f28804OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28805OooO0oo | 1), this.f28800OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28806OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28807OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f28806OooO0Oo = momentVideoVM;
            this.f28807OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28806OooO0Oo.setShowDialogCommentMore(this.f28807OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28808OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28809OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(1);
            this.f28808OooO0Oo = momentVideoVM;
            this.f28809OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f28808OooO0Oo.setShowDialogCommentMore(this.f28809OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentCommentDetailModel, Unit> f28810OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28811OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(Function1<? super MomentCommentDetailModel, Unit> function1, MomentCommentDetailModel momentCommentDetailModel) {
            super(0);
            this.f28810OooO0Oo = function1;
            this.f28811OooO0o0 = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentCommentDetailModel, Unit> function1 = this.f28810OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f28811OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<MomentReplyModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyVM f28812OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28813OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28814OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MomentReplyVM momentReplyVM, MomentVideoVM momentVideoVM, MomentCommentDetailModel momentCommentDetailModel) {
            super(1);
            this.f28812OooO0Oo = momentReplyVM;
            this.f28814OooO0o0 = momentVideoVM;
            this.f28813OooO0o = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentReplyModel momentReplyModel) {
            MomentReplyModel it = momentReplyModel;
            Intrinsics.checkNotNullParameter(it, "it");
            com.yalla.yalla.ui.screen.moment.media.OooO0OO onLogin = new com.yalla.yalla.ui.screen.moment.media.OooO0OO(this.f28812OooO0Oo, this.f28814OooO0o0, this.f28813OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28815OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28817OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28818OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f28819OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f28820OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(int i, String str, int i2, Modifier modifier, int i3) {
            super(2);
            this.f28818OooO0o0 = i;
            this.f28817OooO0o = str;
            this.f28819OooO0oO = i2;
            this.f28820OooO0oo = modifier;
            this.f28815OooO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0Oo(this.f28818OooO0o0, this.f28817OooO0o, this.f28819OooO0oO, this.f28820OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28815OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28821OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<LayoutCoordinates> f28822OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28823OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28824OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f28821OooO0Oo = momentCommentDetailModel;
            this.f28823OooO0o0 = momentVideoVM;
            this.f28822OooO0o = mutableState;
            this.f28824OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = p004OooO0oO.o0OoOo0.OooO00o();
            MomentCommentDetailModel momentCommentDetailModel = this.f28821OooO0Oo;
            if (Intrinsics.areEqual(strOooO00o, momentCommentDetailModel.getUserid())) {
                o000O00.OooO0O0(o0000.OooO0OO(p562o0oOo000.o000000.send_reward_self));
            } else if (!momentCommentDetailModel.getLocalSendRewardIsIn().getValue().booleanValue() && !momentCommentDetailModel.getLocalShowRewardAnim().getValue().booleanValue()) {
                MomentVideoVM momentVideoVM = this.f28823OooO0o0;
                if (!momentVideoVM.getSendRewardDialog().getValue().booleanValue()) {
                    boolean zOooOO0o = p415o0Oo0oO0.o00Ooo.OooO().OooOO0o();
                    MutableState<LayoutCoordinates> mutableState = this.f28822OooO0o;
                    if (zOooOO0o) {
                        com.yalla.yalla.ui.screen.moment.media.OooO onLogin = new com.yalla.yalla.ui.screen.moment.media.OooO(mutableState, this.f28824OooO0oO, momentCommentDetailModel, momentVideoVM);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                        } else {
                            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O0 != null) {
                                int i = LoginActivity.f24727OooOo0O;
                                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                            }
                        }
                    } else {
                        momentVideoVM.setSendRewardDialogComment(momentCommentDetailModel);
                        momentVideoVM.setSendRewardDialogCommentLayoutCoordinates(mutableState.getValue());
                        momentVideoVM.getSendRewardDialog().setValue(Boolean.TRUE);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28825OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28827OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28828OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28829OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f28830OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28831OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(BoxScope boxScope, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f28828OooO0o0 = boxScope;
            this.f28827OooO0o = momentCommentDetailModel;
            this.f28829OooO0oO = momentDetailModel;
            this.f28830OooO0oo = modifier;
            this.f28825OooO = i;
            this.f28831OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0oO(this.f28828OooO0o0, this.f28827OooO0o, this.f28829OooO0oO, this.f28830OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28825OooO | 1), this.f28831OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28833OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28834OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f28835OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f28836OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(int i, MomentCommentDetailModel momentCommentDetailModel, long j, int i2) {
            super(2);
            this.f28834OooO0o0 = i;
            this.f28833OooO0o = momentCommentDetailModel;
            this.f28835OooO0oO = j;
            this.f28836OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0o(this.f28834OooO0o0, this.f28833OooO0o, this.f28835OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28836OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28837OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28838OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28839OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28840OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f28841OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f28842OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MutableState<Boolean> mutableState, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, MomentCommentsVM momentCommentsVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState2) {
            super(0);
            this.f28838OooO0Oo = mutableState;
            this.f28840OooO0o0 = momentCommentDetailModel;
            this.f28839OooO0o = momentDetailModel;
            this.f28841OooO0oO = momentCommentsVM;
            this.f28842OooO0oo = lifecycleOwner;
            this.f28837OooO = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f28838OooO0Oo.getValue().booleanValue()) {
                com.yalla.yalla.ui.screen.moment.media.OooO0o onLogin = new com.yalla.yalla.ui.screen.moment.media.OooO0o(this.f28838OooO0Oo, this.f28840OooO0o0, this.f28839OooO0o, this.f28841OooO0oO, this.f28842OooO0oo, this.f28837OooO);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28843OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MomentCommentDetailModel momentCommentDetailModel) {
            super(0);
            this.f28843OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentCommentDetailModel momentCommentDetailModel = this.f28843OooO0Oo;
            if (!momentCommentDetailModel.isHide()) {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    com.yalla.yalla.ui.screen.moment.media.OooO0O0 onLogin = new com.yalla.yalla.ui.screen.moment.media.OooO0O0(activityOooO0O0, momentCommentDetailModel);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O1 != null) {
                            int i = LoginActivity.f24727OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O1);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28845OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28846OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28847OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f28848OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(int i, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, int i2) {
            super(2);
            this.f28846OooO0o0 = i;
            this.f28845OooO0o = momentCommentDetailModel;
            this.f28847OooO0oO = momentDetailModel;
            this.f28848OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0o0(this.f28846OooO0o0, this.f28845OooO0o, this.f28847OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28848OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentCommentDetailModel, Unit> f28849OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f28851OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28852OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f28853OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f28854OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28855OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f28856OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public oo000o(int i, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, int i2, Function1<? super MomentCommentDetailModel, Unit> function1, int i3, int i4) {
            super(2);
            this.f28852OooO0o0 = i;
            this.f28851OooO0o = momentCommentDetailModel;
            this.f28853OooO0oO = momentDetailModel;
            this.f28854OooO0oo = i2;
            this.f28849OooO = function1;
            this.f28855OooOO0 = i3;
            this.f28856OooOO0O = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MomentComment.this.OooO0OO(this.f28852OooO0o0, this.f28851OooO0o, this.f28853OooO0oO, this.f28854OooO0oo, this.f28849OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28855OooOO0 | 1), this.f28856OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<LayoutCoordinates> f28857OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(MutableState<LayoutCoordinates> mutableState) {
            super(1);
            this.f28857OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f28857OooO0Oo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0169  */
    /* JADX WARN: Code duplicated, block: B:106:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101 A[PHI: r5 r8 r10
      0x0101: PHI (r5v26 int) = (r5v19 int), (r5v27 int), (r5v28 int) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r8v10 long) = (r8v7 long), (r8v6 long), (r8v6 long) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r10v8 long) = (r10v4 long), (r10v3 long), (r10v3 long) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(BoxScope boxScope, long j, long j2, long j3, long j4, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        long j5;
        long jOooO0OO;
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        String strOooO0OO;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1820639583);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 2) == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 4) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                        i6 = 2048;
                    }
                    i3 |= i6;
                } else {
                    j5 = j3;
                }
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i6;
            } else {
                j5 = j3;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 8) == 0) {
                    jOooO0OO = j4;
                    int i7 = composerStartRestartGroup.changed(jOooO0OO) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    jOooO0OO = j4;
                }
                i3 |= i7;
            } else {
                jOooO0OO = j4;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 4) != 0) {
                            j5 = o0OOo000.f48171Oooo0o;
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                        }
                        strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                        if (j >= 1) {
                            strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                        }
                        int i8 = i3 >> 3;
                        TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 896) | (i8 & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                    }
                    modifier3 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                    }
                    strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                    if (j >= 1) {
                        strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                    }
                    int i9 = i3 >> 3;
                    TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i9 & 896) | (i9 & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o000000(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                }
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i10 = i3 >> 3;
                TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i10 & 896) | (i10 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                }
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i11 = i3 >> 3;
                TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i11 & 896) | (i11 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o000000(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
        }
        i3 |= 384;
        if ((i & 7168) == 0) {
            if ((i2 & 4) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                    i6 = 2048;
                }
                i3 |= i6;
            } else {
                j5 = j3;
            }
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i6;
        } else {
            j5 = j3;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 8) == 0) {
                jOooO0OO = j4;
                if (composerStartRestartGroup.changed(jOooO0OO)) {
                }
                i3 |= i7;
            } else {
                jOooO0OO = j4;
            }
            i3 |= i7;
        } else {
            jOooO0OO = j4;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((458752 & i) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                }
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i12 = i3 >> 3;
                TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i12 & 896) | (i12 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0OOo000.f48171Oooo0o;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
                }
                strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i13 = i3 >> 3;
                TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i13 & 896) | (i13 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o000000(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    j5 = o0OOo000.f48171Oooo0o;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    j5 = o0OOo000.f48171Oooo0o;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
            }
            strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
            if (j >= 1) {
                strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
            }
            int i14 = i3 >> 3;
            TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 896) | (i14 & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    j5 = o0OOo000.f48171Oooo0o;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    j5 = o0OOo000.f48171Oooo0o;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820639583, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.TimeView (MomentComment.kt:500)");
            }
            strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.post_comment_sending);
            if (j >= 1) {
                strOooO0OO = o0O0O0o0.OooO0Oo(j2, System.currentTimeMillis());
            }
            int i15 = i3 >> 3;
            TextKt.m1261Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i15 & 896) | (i15 & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, @NotNull MomentCommentDetailModel item, @NotNull MomentDetailModel momentDetail, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-158677641);
        Function1<? super Integer, Unit> function2 = (i3 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-158677641, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.DetailViewForCommentReplayTitle (MomentComment.kt:299)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Vertical top = companion.getTop();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 12;
        float f2 = 8;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m481paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f)), o0OOo000.f48135OooO0O0, null, 2, null);
        OooO00o oooO00o = new OooO00o(item, momentVideoVM);
        Integer numValueOf = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(function2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0O0(function2, i);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, false, false, 0L, false, null, null, oooO00o, (Function0) objRememberedValue, 189);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, top, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function1<? super Integer, Unit> function3 = function2;
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        MomentComment momentComment = f28751OooO00o;
        int i4 = i2 & 14;
        momentComment.OooO0Oo(i, com.code.android.util.o0OoOo0.OooOOO(item.getHeadurl(), ""), item.getRole(), com.code.android.util.o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, new OooO0OO(item, momentVideoVM), new OooO0o(item), 189), composerStartRestartGroup, i4 | 24576);
        Modifier modifierWeight = rowScopeInstance.weight(companion2, 1.0f, true);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = p022Oooo00O.o0O00oO0.OooO0O0(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f2, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
        MeasurePolicy measurePolicyOooO0O2 = p022Oooo00O.o0O00oO0.OooO0O0(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        momentComment.OooO0o(i, item, momentDetail.getUserId(), composerStartRestartGroup, i4 | 3136);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        String content = item.getContent().getContent();
        List<MomentSendContentAtModel> at = item.getContent().getAt();
        TextStyle textStyle = new TextStyle(o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, p595o0oo00O.OooOo00.OooO0o0() ? null : TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco()), 0L, (TextIndent) null, new PlatformTextStyle(true), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null);
        OooO oooO = new OooO(item, momentVideoVM);
        Integer numValueOf2 = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(function3);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOO0(function3, i);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p521o0o0O0o0.oo000o.OooO00o(modifierFillMaxWidth$default, content, false, at, null, null, textStyle, false, 0, Integer.MAX_VALUE, null, null, oooO, (Function0) objRememberedValue2, composerStartRestartGroup, 805507462, 6, 2448);
        momentComment.OooO0o0(i, item, momentDetail, composerStartRestartGroup, i4 | 3648);
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
        com.code.android.util.OooOO0.OooO0OO(null, Dp.m3775constructorimpl(6), o0OOo000.f48272o000o0o0, composerStartRestartGroup, 6, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i, item, momentDetail, function3, i2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable final Long l, final int i, @NotNull final Function1<? super Integer, Unit> listener, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Composer composerStartRestartGroup = composer.startRestartGroup(1597658260);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(listener) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        final int i4 = i3;
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1597658260, i4, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.ItemTitle (MomentComment.kt:84)");
            }
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(44)), o0OOo000.f48135OooO0O0, null, 2, null);
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, -270267587, -3687241);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = new oO000O0();
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO000O0 oo000o0 = (oO000O0) objOooO00o;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = p644o0ooOOo.o0OOo000.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue2, oo000o0, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM171backgroundbw27NRU$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentComment$ItemTitle$$inlined$ConstraintLayout$1
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
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>(function0, l, i, listener, i4) { // from class: com.yalla.yalla.ui.screen.moment.media.MomentComment$ItemTitle$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ Long f28754OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Function0 f28755OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ int f28756OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public final /* synthetic */ Function1 f28757OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Composer composer3;
                    long j;
                    long j2;
                    Composer composer4 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = this.f28753OooO0Oo;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        composer4.startReplaceableGroup(1423718438);
                        Long l2 = this.f28754OooO0o;
                        if (l2 == null) {
                            composer3 = composer4;
                        } else {
                            l2.longValue();
                            String strStringResource = StringResources_androidKt.stringResource(o000000.XXX_comments, composer4, 0);
                            String strOooO0o = o0O0O0Oo.OooO0o(l2.longValue(), false);
                            Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(...)");
                            composer3 = composer4;
                            TextKt.m1261Text4IGK_g(i5.OooO00o(strStringResource, strOooO0o), PaddingKt.m480paddingVpY3zN4$default(ConstraintLayoutScope.OooO00o(Modifier.INSTANCE, o0ooOooO00o, MomentComment.OooOOO0.f28777OooO0Oo), Dp.m3775constructorimpl(16), 0.0f, 2, null), o0000oo.OooO0OO(composer4).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131056);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceableGroup();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m511height3ABfNKs(PaddingKt.m480paddingVpY3zN4$default(ConstraintLayoutScope.OooO00o(companion3, o0ooOooO0O0, MomentComment.OooOOO.f28776OooO0Oo), Dp.m3775constructorimpl(16), 0.0f, 2, null), Dp.m3775constructorimpl(30)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0OOo000.f48272o000o0o0, null, 2, null), Dp.m3775constructorimpl(3));
                        Composer composer5 = composer3;
                        composer5.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composer5, 48, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs);
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer5);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer5)), composer5, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        float f = 24;
                        Modifier modifierClip = ClipKt.clip(SizeKt.m511height3ABfNKs(companion3, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50));
                        int i5 = this.f28756OooO0oO;
                        float f2 = 8;
                        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(modifierClip, i5 == 0 ? o0OOo000.f48135OooO0O0 : o0OOo000.f48134OooO00o, null, 2, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null);
                        Integer numValueOf = Integer.valueOf(i5);
                        composer5.startReplaceableGroup(511388516);
                        boolean zChanged = composer5.changed(numValueOf);
                        Function1 function1 = this.f28757OooO0oo;
                        boolean zChanged2 = zChanged | composer5.changed(function1);
                        Object objRememberedValue3 = composer5.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new MomentComment.OooOOOO(i5, function1);
                            composer5.updateRememberedValue(objRememberedValue3);
                        }
                        composer5.endReplaceableGroup();
                        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM480paddingVpY3zN4$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253);
                        composer5.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer5, 0, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor2);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer5);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer5)), composer5, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String strStringResource2 = StringResources_androidKt.stringResource(o000000.Popular, composer5, 0);
                        long sp = TextUnitKt.getSp(14);
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        int iM3681getCentere0LSkKk = companion5.m3681getCentere0LSkKk();
                        if (i5 == 0) {
                            composer5.startReplaceableGroup(-1103229186);
                            j = o0000oo.OooO0OO(composer5).f38616OooO;
                        } else {
                            composer5.startReplaceableGroup(-1103229171);
                            j = o0000oo.OooO0OO(composer5).f38626OooOO0O;
                        }
                        composer5.endReplaceableGroup();
                        TextKt.m1261Text4IGK_g(strStringResource2, boxScopeInstance.align(companion3, companion2.getCenter()), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 130544);
                        composer5.endReplaceableGroup();
                        composer5.endNode();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m511height3ABfNKs(companion3, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50)), i5 == 1 ? o0OOo000.f48135OooO0O0 : o0OOo000.f48134OooO00o, null, 2, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null);
                        Integer numValueOf2 = Integer.valueOf(i5);
                        composer5.startReplaceableGroup(511388516);
                        boolean zChanged3 = composer5.changed(numValueOf2) | composer5.changed(function1);
                        Object objRememberedValue4 = composer5.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new MomentComment.OooOo00(i5, function1);
                            composer5.updateRememberedValue(objRememberedValue4);
                        }
                        composer5.endReplaceableGroup();
                        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierM480paddingVpY3zN4$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue4, 253);
                        composer5.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composer5, 0, -1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor3);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer5);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer5)), composer5, 2058660585);
                        String strStringResource3 = StringResources_androidKt.stringResource(o000000.Latest, composer5, 0);
                        long sp2 = TextUnitKt.getSp(14);
                        int iM3686getStarte0LSkKk = companion5.m3686getStarte0LSkKk();
                        if (i5 == 1) {
                            composer5.startReplaceableGroup(-1103228152);
                            j2 = o0000oo.OooO0OO(composer5).f38616OooO;
                        } else {
                            composer5.startReplaceableGroup(-1103228137);
                            j2 = o0000oo.OooO0OO(composer5).f38626OooOO0O;
                        }
                        composer5.endReplaceableGroup();
                        TextKt.m1261Text4IGK_g(strStringResource3, boxScopeInstance.align(companion3, companion2.getCenter()), j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(iM3686getStarte0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 130544);
                        composer5.endReplaceableGroup();
                        composer5.endNode();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        composer5.endNode();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(l, i, listener, i2));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x05a6  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(int i, @NotNull MomentCommentDetailModel item, @NotNull MomentDetailModel momentDetail, int i2, @Nullable Function1<? super MomentCommentDetailModel, Unit> function1, @Nullable Composer composer, int i3, int i4) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933598005);
        Function1<? super MomentCommentDetailModel, Unit> function2 = (i4 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1933598005, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.ItemView (MomentComment.kt:170)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
        ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel2 = ViewModelKt.viewModel(MomentReplyVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentReplyVM momentReplyVM = (MomentReplyVM) viewModel2;
        composerStartRestartGroup.startReplaceableGroup(1909318050);
        if (i2 == 0 && item.getIsFeature() == 1) {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_wonderful_comment, composerStartRestartGroup, 0), "", PaddingKt.m482paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getTopStart()), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(8), 0.0f, 0.0f, 12, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment.Vertical top = companion4.getTop();
        Modifier.Companion companion5 = Modifier.INSTANCE;
        float f = 12;
        float f2 = 8;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), 0.0f, 8, null), o0OOo000.f48135OooO0O0, null, 2, null), false, false, 0L, false, null, null, new Oooo000(item, r10), new Oooo0(function2, item), 189);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, top, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        MomentComment momentComment = f28751OooO00o;
        int i5 = i3 & 14;
        momentComment.OooO0Oo(i, com.code.android.util.o0OoOo0.OooOOO(item.getHeadurl(), ""), item.getRole(), com.code.android.util.o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, new o000oOoO(item, r10), new o0OoOo0(item), 189), composerStartRestartGroup, i5 | 24576);
        Modifier modifierWeight = rowScopeInstance.weight(companion5, 1.0f, true);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = p022Oooo00O.o0O00oO0.OooO0O0(companion4, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f2, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
        MeasurePolicy measurePolicyOooO0O2 = p022Oooo00O.o0O00oO0.OooO0O0(companion4, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        momentComment.OooO0o(i, item, momentDetail.getUserId(), composerStartRestartGroup, i5 | 3136);
        if (item.isHide()) {
            composerStartRestartGroup.startReplaceableGroup(761276401);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.comment_is_hidden, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(761275287);
            p521o0o0O0o0.oo000o.OooO00o(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), item.getContent().getContent(), false, item.getContent().getAt(), null, null, new TextStyle(o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, p595o0oo00O.OooOo00.OooO0o0() ? null : TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco()), 0L, (TextIndent) null, new PlatformTextStyle(true), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, 0, Integer.MAX_VALUE, null, null, new o00O0O(item, momentVideoVM), new o00Oo0(function2, item), composerStartRestartGroup, 805507462, 6, 2448);
            composerStartRestartGroup.endReplaceableGroup();
        }
        momentComment.OooO0o0(i, item, momentDetail, composerStartRestartGroup, i5 | 3648);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(10469785);
        if (item.isHide()) {
            composer2 = composerStartRestartGroup;
        } else {
            p598o0oo00Oo.o0000oo o0000ooVar = p598o0oo00Oo.o0000oo.f57360OooO00o;
            o0000ooVar.OooO0O0("WRM sonFirst 222 = ".concat(p187o00o00o0.OooO.OooO00o(item.getSonFirst())), composerStartRestartGroup, 48);
            MomentReplyModel sonFirst = item.getSonFirst();
            if (sonFirst == null) {
                composer2 = composerStartRestartGroup;
            } else {
                o0000ooVar.OooO0O0("WRM sonFirst 333  = ".concat(p187o00o00o0.OooO.OooO00o(item.getSonFirst())), composerStartRestartGroup, 48);
                Alignment.Vertical top2 = companion4.getTop();
                Modifier modifierM481paddingqDBjuR0 = PaddingKt.m481paddingqDBjuR0(BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f2, SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null), 0.0f, 1, null)), o0OOo000.f48272o000o0o0, null, 2, null), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f));
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, top2, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM481paddingqDBjuR0);
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
                Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl5, measurePolicyOooO0O3, composerM1320constructorimpl5, currentCompositionLocalMap5);
                if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                composer2 = composerStartRestartGroup;
                p535o0o0Oo0.oO0o0o.f54122OooO00o.OooO0OO(false, i, Dp.m3775constructorimpl(24), true, sonFirst, item, momentDetail, null, new o00Ooo(momentReplyVM, r10, item), composerStartRestartGroup, ((i3 << 3) & 112) | 820284806, 0);
                o000O.o0ooOOo.OooO00o(composer2);
                Unit unit = Unit.INSTANCE;
            }
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
        com.code.android.util.OooOO0.OooO0OO(PaddingKt.m482paddingqDBjuR0$default(companion5, Dp.m3775constructorimpl(56), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, o0OOo000.f48202o00000O0, composer2, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(i, item, momentDetail, i2, function2, i3, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(int i, String str, int i2, Modifier modifier, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(2059010279);
        if ((i3 & 112) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 32 : 16) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i4 & 5841) == 1168 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2059010279, i4, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.ItemViewHead (MomentComment.kt:373)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 32;
            Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(companion.then(modifier), Dp.m3775constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
            oooO00o.OooOO0O(p184o00o00O0.OooO0OO.OooO0oo(80, 80, str), SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), Dp.m3775constructorimpl(f)), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
            oooO00o.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(OffsetKt.m438offsetVpY3zN4(companion, Dp.m3775constructorimpl(6), Dp.m3775constructorimpl(-2)), companion2.getTopEnd()), UserInfo.Role.INSTANCE.isOfficial(i2));
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(i, str, i2, modifier, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(int i, MomentCommentDetailModel momentCommentDetailModel, long j, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1404534286);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1404534286, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.ItemViewUser (MomentComment.kt:398)");
        }
        Alignment.Vertical top = Alignment.INSTANCE.getTop();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(37, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, top, composerStartRestartGroup, 48, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        String userid = momentCommentDetailModel.getUserid();
        oooO00o.OooOOOo(o000O000.OooO0O0(userid != null ? com.code.android.util.o0OoOo0.OooO(0L, userid) : 0L, com.code.android.util.o0OoOo0.OooOOO(momentCommentDetailModel.getNickname(), "")), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, false, TextUnitKt.getSp(16), 0, 0, null, false, rowScopeInstance.weight(companion, 1.0f, false), composerStartRestartGroup, 1073744896, 244);
        float f = 2;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        float f2 = 16;
        oooO00o.OooO0oO(Integer.valueOf(momentCommentDetailModel.getSex()), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 560, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        String userid2 = momentCommentDetailModel.getUserid();
        Long lValueOf = userid2 != null ? Long.valueOf(Long.parseLong(userid2)) : null;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(lValueOf, o0O00oO0.OooOOo0().getValue()) && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
            composerStartRestartGroup.startReplaceableGroup(960159734);
            oooO00o.OooOo(com.code.android.util.o0OoOo0.OooO0o0(0, (Integer) o0O00oO0.OooO0oO().getValue()), com.code.android.util.o0OoOo0.OooOOO((String) o0O00oO0.OooO0o0().getValue(), ""), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(960160047);
            oooO00o.OooOo(momentCommentDetailModel.getWealthLevel(), momentCommentDetailModel.getWealthBadgeImage(), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        String userid3 = momentCommentDetailModel.getUserid();
        if (Intrinsics.areEqual(userid3 != null ? Long.valueOf(Long.parseLong(userid3)) : null, o0O00oO0.OooOOo0().getValue())) {
            composerStartRestartGroup.startReplaceableGroup(960160420);
            Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
            int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : VipLevel.Vip0.getValue();
            Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
            oO0OO.OooO00o.OooOo0(Integer.valueOf(pair2 != null ? ((Number) pair2.getFirst()).intValue() : VipState.Vip.getValue()), Integer.valueOf(iIntValue), null, Dp.m3775constructorimpl(f2), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(19)), composerStartRestartGroup, 289792, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(960160776);
            oO0OO.OooO00o.OooOo0(null, Integer.valueOf(momentCommentDetailModel.getKaVIPLv()), null, Dp.m3775constructorimpl(f2), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(19)), composerStartRestartGroup, 289792, 5);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        float f3 = 19;
        oO0OO.OooO00o.OooOOo(Boolean.valueOf(o00O000o.OooO0OO(Integer.valueOf(momentCommentDetailModel.getVip()))), Integer.valueOf(momentCommentDetailModel.getVipLevel()), false, Dp.m3775constructorimpl(f3), SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f3)), composerStartRestartGroup, 289792, 4);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        oooO00o.OooO0Oo(j == com.code.android.util.o0OoOo0.OooO(0L, momentCommentDetailModel.getUserid()), StringResources_androidKt.stringResource(p562o0oOo000.o000000.Author, composerStartRestartGroup, 0), 0L, 0L, 0.0f, 0L, 0.0f, null, composerStartRestartGroup, 134217728, 252);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(i, momentCommentDetailModel, j, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(int i, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2070964931);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2070964931, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.ItemViewTimeRewardPraise (MomentComment.kt:475)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(32, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        MomentComment momentComment = f28751OooO00o;
        momentComment.OooO(boxScopeInstance, momentCommentDetailModel.getId(), momentCommentDetailModel.getCreateTime(), 0L, 0L, null, composerStartRestartGroup, 1572870, 28);
        momentComment.OooO0oo(boxScopeInstance, momentCommentDetailModel, null, composerStartRestartGroup, 3142, 2);
        momentComment.OooO0oO(boxScopeInstance, momentCommentDetailModel, momentDetailModel, null, composerStartRestartGroup, 25158, 4);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(i, momentCommentDetailModel, momentDetailModel, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(BoxScope boxScope, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, Modifier modifier, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-28624251);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28624251, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.PraiseView (MomentComment.kt:588)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentCommentsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState2 = (MutableState) objRememberedValue2;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment centerStart = companion2.getCenterStart();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m530width3ABfNKs(boxScope.align(companion3.then(modifier2), companion2.getCenterEnd()), Dp.m3775constructorimpl(59)), !momentCommentDetailModel.isHide(), false, 0L, false, null, null, null, new o0Oo0oo(mutableState, momentCommentDetailModel, momentDetailModel, momentCommentsVM, lifecycleOwner, mutableState2), 252);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String strOooO0o = o0O0O0Oo.OooO0o(momentCommentDetailModel.getPraiseNum(), true);
        long jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
        long j = (!momentCommentDetailModel.isPraise() || momentCommentDetailModel.getPraiseNum() <= 0) ? o0OOo000.f48172Oooo0o0 : o0OOo000.f48169Oooo0O0;
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(18), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), companion2.getCenterStart());
        Intrinsics.checkNotNull(strOooO0o);
        Modifier modifier3 = modifier2;
        TextKt.m1261Text4IGK_g(strOooO0o, modifierAlign, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 0, 3072, 57328);
        p535o0o0Oo0.oO000.f53849OooO00o.OooO00o(momentCommentDetailModel.isPraise(), mutableState2, Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(36), composerStartRestartGroup, 28080, 0);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(boxScope, momentCommentDetailModel, momentDetailModel, modifier3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(BoxScope boxScope, MomentCommentDetailModel momentCommentDetailModel, Modifier modifier, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1806695452);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806695452, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentComment.RewardView (MomentComment.kt:520)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2.then(modifier2), 0.0f, 0.0f, Dp.m3775constructorimpl(59), 0.0f, 11, null), Dp.m3775constructorimpl(68));
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(modifierM530width3ABfNKs, companion3.getCenterEnd());
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new oo0o0Oo(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAlign, (Function1) objRememberedValue2), !momentCommentDetailModel.isHide(), false, 0L, false, null, null, null, new o0O0O00(mutableState, lifecycleOwner, momentCommentDetailModel, momentVideoVM), 252);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
        String strOooO0o = o0O0O0Oo.OooO0o(momentCommentDetailModel.getPropNum(), true);
        long jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
        long j = (!momentCommentDetailModel.isSendProp() || momentCommentDetailModel.getPropNum() <= 0) ? o0OOo000.f48172Oooo0o0 : o0OOo000.f48169Oooo0O0;
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), companion3.getCenterStart());
        Intrinsics.checkNotNull(strOooO0o);
        Modifier modifier3 = modifier2;
        TextKt.m1261Text4IGK_g(strOooO0o, modifierAlign2, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 0, 3072, 57328);
        oO00o00O.f53933OooO00o.OooO00o(momentCommentDetailModel.isSendProp(), momentCommentDetailModel.getLocalShowRewardAnim(), null, 0.0f, 0.0f, OffsetKt.m439offsetVpY3zN4$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), 0.0f, Dp.m3775constructorimpl(-9), 1, null), composerStartRestartGroup, 1572864, 28);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(boxScope, momentCommentDetailModel, modifier3, i, i2));
    }
}
