package com.yalla.yalla.ui.screen.user.vip;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.screen.main.VipExperienceScreen;
import com.yalla.yalla.ui.vm.room.VipVm;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import p022Oooo00O.o00O00OO;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.o00O00o0;
import p211o00o0oo0.o000OOo0;
import p212o00o0ooo.o0O00oO0;
import p425o0OoO0OO.oOO00O;
import p444o0OoOo0O.o000;
import p450o0OoOoo.oo0oOO0;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p525o0o0O0oo.o0O0ooO;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.oo0o0Oo;
import p587o0oOooO.oOO0O0O0;
import p593o0oOoooO.h0;
import p647o0ooOOo.O0O0;
import p647o0ooOOo.O0OO00;
import p647o0ooOOo.Oo0000;
import p647o0ooOOo.e;
import p647o0ooOOo.j;
import p647o0ooOOo.q;
import p647o0ooOOo.t;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVipInfoHeadCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,675:1\n154#2:676\n154#2:782\n154#2:783\n154#2:784\n154#2:820\n154#2:821\n154#2:882\n154#2:918\n154#2:919\n154#2:955\n154#2:956\n154#2:957\n154#2:963\n154#2:964\n154#2:965\n154#2:1010\n154#2:1011\n154#2:1012\n154#2:1048\n154#2:1049\n154#2:1085\n154#2:1086\n154#2:1087\n164#2:1095\n154#2:1096\n154#2:1097\n174#2:1150\n154#2:1151\n154#2:1152\n154#2:1153\n154#2:1154\n154#2:1155\n154#2:1187\n66#3,6:677\n72#3:711\n66#3,6:747\n72#3:781\n76#3:871\n76#3:881\n66#3,6:883\n72#3:917\n67#3,5:966\n72#3:999\n76#3:1004\n76#3:1009\n66#3,6:1013\n72#3:1047\n76#3:1114\n66#3,6:1115\n72#3:1149\n76#3:1233\n78#4,11:683\n78#4,11:718\n78#4,11:753\n78#4,11:791\n78#4,11:828\n91#4:860\n91#4:865\n91#4:870\n91#4:875\n91#4:880\n78#4,11:889\n78#4,11:926\n91#4:961\n78#4,11:971\n91#4:1003\n91#4:1008\n78#4,11:1019\n78#4,11:1056\n91#4:1108\n91#4:1113\n78#4,11:1121\n78#4,11:1194\n91#4:1227\n91#4:1232\n456#5,8:694\n464#5,3:708\n456#5,8:729\n464#5,3:743\n456#5,8:764\n464#5,3:778\n456#5,8:802\n464#5,3:816\n456#5,8:839\n464#5,3:853\n467#5,3:857\n467#5,3:862\n467#5,3:867\n467#5,3:872\n467#5,3:877\n456#5,8:900\n464#5,3:914\n456#5,8:937\n464#5,3:951\n467#5,3:958\n456#5,8:982\n464#5,3:996\n467#5,3:1000\n467#5,3:1005\n456#5,8:1030\n464#5,3:1044\n456#5,8:1067\n464#5,3:1081\n25#5:1088\n36#5:1098\n467#5,3:1105\n467#5,3:1110\n456#5,8:1132\n464#5,3:1146\n25#5:1160\n456#5,8:1205\n464#5,3:1219\n467#5,3:1224\n467#5,3:1229\n4144#6,6:702\n4144#6,6:737\n4144#6,6:772\n4144#6,6:810\n4144#6,6:847\n4144#6,6:908\n4144#6,6:945\n4144#6,6:990\n4144#6,6:1038\n4144#6,6:1075\n4144#6,6:1140\n4144#6,6:1213\n73#7,6:712\n79#7:746\n73#7,6:785\n79#7:819\n83#7:866\n83#7:876\n73#7,6:920\n79#7:954\n83#7:962\n73#7,6:1188\n79#7:1222\n83#7:1228\n72#8,6:822\n78#8:856\n82#8:861\n72#8,6:1050\n78#8:1084\n82#8:1109\n1097#9,6:1089\n1097#9,6:1099\n955#9,6:1161\n73#10,4:1156\n77#10,20:1167\n1098#11:1223\n81#12:1234\n81#12:1235\n81#12:1236\n107#12,2:1237\n*S KotlinDebug\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt\n*L\n100#1:676\n136#1:782\n139#1:783\n145#1:784\n155#1:820\n158#1:821\n239#1:882\n246#1:918\n247#1:919\n254#1:955\n256#1:956\n265#1:957\n269#1:963\n270#1:964\n271#1:965\n344#1:1010\n369#1:1011\n370#1:1012\n377#1:1048\n383#1:1049\n389#1:1085\n397#1:1086\n398#1:1087\n417#1:1095\n418#1:1096\n421#1:1097\n451#1:1150\n456#1:1151\n457#1:1152\n458#1:1153\n459#1:1154\n466#1:1155\n541#1:1187\n98#1:677,6\n98#1:711\n123#1:747,6\n123#1:781\n123#1:871\n98#1:881\n237#1:883,6\n237#1:917\n267#1:966,5\n267#1:999\n267#1:1004\n237#1:1009\n367#1:1013,6\n367#1:1047\n367#1:1114\n446#1:1115,6\n446#1:1149\n446#1:1233\n98#1:683,11\n118#1:718,11\n123#1:753,11\n143#1:791,11\n158#1:828,11\n158#1:860\n143#1:865\n123#1:870\n118#1:875\n98#1:880\n237#1:889,11\n244#1:926,11\n244#1:961\n267#1:971,11\n267#1:1003\n237#1:1008\n367#1:1019,11\n380#1:1056,11\n380#1:1108\n367#1:1113\n446#1:1121,11\n538#1:1194,11\n538#1:1227\n446#1:1232\n98#1:694,8\n98#1:708,3\n118#1:729,8\n118#1:743,3\n123#1:764,8\n123#1:778,3\n143#1:802,8\n143#1:816,3\n158#1:839,8\n158#1:853,3\n158#1:857,3\n143#1:862,3\n123#1:867,3\n118#1:872,3\n98#1:877,3\n237#1:900,8\n237#1:914,3\n244#1:937,8\n244#1:951,3\n244#1:958,3\n267#1:982,8\n267#1:996,3\n267#1:1000,3\n237#1:1005,3\n367#1:1030,8\n367#1:1044,3\n380#1:1067,8\n380#1:1081,3\n403#1:1088\n424#1:1098\n380#1:1105,3\n367#1:1110,3\n446#1:1132,8\n446#1:1146,3\n464#1:1160\n538#1:1205,8\n538#1:1219,3\n538#1:1224,3\n446#1:1229,3\n98#1:702,6\n118#1:737,6\n123#1:772,6\n143#1:810,6\n158#1:847,6\n237#1:908,6\n244#1:945,6\n267#1:990,6\n367#1:1038,6\n380#1:1075,6\n446#1:1140,6\n538#1:1213,6\n118#1:712,6\n118#1:746\n143#1:785,6\n143#1:819\n143#1:866\n118#1:876\n244#1:920,6\n244#1:954\n244#1:962\n538#1:1188,6\n538#1:1222\n538#1:1228\n158#1:822,6\n158#1:856\n158#1:861\n380#1:1050,6\n380#1:1084\n380#1:1109\n403#1:1089,6\n424#1:1099,6\n464#1:1161,6\n464#1:1156,4\n464#1:1167,20\n566#1:1223\n150#1:1234\n159#1:1235\n472#1:1236\n472#1:1237,2\n*E\n"})
public final class VipInfoHeadCardKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final List<Color> f29679OooO00o;

    @SourceDebugExtension({"SMAP\nVipInfoHeadCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,675:1\n154#2:676\n154#2:677\n154#2:678\n*S KotlinDebug\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$4$1\n*L\n513#1:676\n514#1:677\n515#1:678\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f29686OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j) {
            super(1);
            this.f29686OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path Path = AndroidPath_androidKt.Path();
            float f = 2;
            float f2 = 9;
            Path.moveTo((Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f) - Dp.m3775constructorimpl(f2), 0.0f);
            Path.lineTo(Dp.m3775constructorimpl(f2) + (Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f), 0.0f);
            Path.lineTo(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) / f, Dp.m3775constructorimpl(f2));
            Path.close();
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo00O(Canvas, Path, this.f29686OooO0Oo, 0.0f, null, null, 0, 60, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f29687OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29688OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipModel f29689OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipLevel f29690OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipVm f29691OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29692OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, VipLevel vipLevel, VipModel vipModel, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29688OooO0Oo = boxScope;
            this.f29690OooO0o0 = vipLevel;
            this.f29689OooO0o = vipModel;
            this.f29691OooO0oO = vipVm;
            this.f29692OooO0oo = personalVipModel;
            this.f29687OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipInfoHeadCardKt.OooO00o(this.f29688OooO0Oo, this.f29690OooO0o0, this.f29689OooO0o, this.f29691OooO0oO, this.f29692OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29687OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ O0OO00 f29693OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(O0OO00 o0oo00) {
            super(1);
            this.f29693OooO0Oo = o0oo00;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            Oo0000 oo0000 = constrainAs.f57607OooO0oO;
            O0OO00 o0oo00 = this.f29693OooO0Oo;
            o000OOo0.OooO0O0(oo0000, o0oo00.f57610OooO0OO, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57604OooO0Oo, o0oo00.f57609OooO0O0, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57605OooO0o, o0oo00.f57611OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f29694OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Float> mutableState) {
            super(1);
            this.f29694OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            float fM3935getWidthimpl = IntSize.m3935getWidthimpl(intSize.getPackedValue()) / 2.0f;
            List<Color> list = VipInfoHeadCardKt.f29679OooO00o;
            this.f29694OooO0Oo.setValue(Float.valueOf(fM3935getWidthimpl));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipInfoHeadCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,675:1\n154#2:676\n64#3:677\n*S KotlinDebug\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$3$1\n*L\n509#1:676\n509#1:677\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ O0OO00 f29695OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(O0OO00 o0oo00) {
            super(1);
            this.f29695OooO0Oo = o0oo00;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            j jVar = constrainAs.f57604OooO0Oo;
            O0OO00 o0oo00 = this.f29695OooO0Oo;
            o0O00oO0.OooO0O0(jVar, o0oo00.f57609OooO0O0, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57605OooO0o, o0oo00.f57611OooO0Oo, 0.0f, 6);
            o000OOo0.OooO0O0(constrainAs.f57607OooO0oO, o0oo00.f57610OooO0OO, Dp.m3775constructorimpl(-Dp.m3775constructorimpl(2)), 4);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipInfoHeadCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,675:1\n154#2:676\n*S KotlinDebug\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$1$5$1\n*L\n526#1:676\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f29696OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(float f) {
            super(1);
            this.f29696OooO0Oo = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            j jVar = constrainAs.f57604OooO0Oo;
            O0OO00 o0oo00 = constrainAs.f57603OooO0OO;
            o0O00oO0.OooO0O0(jVar, o0oo00.f57609OooO0O0, this.f29696OooO0Oo, 4);
            o000OOo0.OooO0O0(constrainAs.f57606OooO0o0, o0oo00.f57610OooO0OO, Dp.m3775constructorimpl(116), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29697OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PersonalVipModel personalVipModel) {
            super(0);
            this.f29697OooO0Oo = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0O0("105042");
            VipExperienceScreen.INSTANCE.navigate(this.f29697OooO0Oo.getCurrentExperience());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f29698OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29699OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29700OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29701OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(VipModel vipModel, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29698OooO0Oo = vipModel;
            this.f29700OooO0o0 = vipVm;
            this.f29699OooO0o = personalVipModel;
            this.f29701OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29701OooO0oO | 1);
            VipVm vipVm = this.f29700OooO0o0;
            PersonalVipModel personalVipModel = this.f29699OooO0o;
            VipInfoHeadCardKt.OooO0O0(this.f29698OooO0Oo, vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipInfoHeadCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$3$inlineContentMap$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,675:1\n154#2:676\n154#2:677\n*S KotlinDebug\n*F\n+ 1 VipInfoHeadCard.kt\ncom/yalla/yalla/ui/screen/user/vip/VipInfoHeadCardKt$ExperienceProgressBar$1$3$inlineContentMap$1\n*L\n589#1:676\n590#1:677\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function3<String, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipModel f29702OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(VipModel vipModel) {
            super(3);
            this.f29702OooO0Oo = vipModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, Composer composer, Integer num) {
            int i;
            String it = str;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-327159666, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.ExperienceProgressBar.<anonymous>.<anonymous>.<anonymous> (VipInfoHeadCard.kt:584)");
                }
                switch (Oooo000.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(this.f29702OooO0Oo.getKaVipLv()).ordinal()]) {
                    case 1:
                        i = oo0o0Oo.icon_level_arrow_right_1;
                        break;
                    case 2:
                        i = oo0o0Oo.icon_level_arrow_right_2;
                        break;
                    case 3:
                        i = oo0o0Oo.icon_level_arrow_right_3;
                        break;
                    case 4:
                        i = oo0o0Oo.icon_level_arrow_right_4;
                        break;
                    case 5:
                        i = oo0o0Oo.icon_level_arrow_right_5;
                        break;
                    case 6:
                        i = oo0o0Oo.icon_level_arrow_right_6;
                        break;
                    default:
                        i = oo0o0Oo.icon_level_arrow_right_1;
                        break;
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m517requiredSize3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(12)), composer2, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipLevel f29703OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(VipLevel vipLevel) {
            super(0);
            this.f29703OooO0Oo = vipLevel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f29703OooO0Oo == VipLevel.Vip6) {
                h0.OooO0O0("105126");
            } else {
                h0.OooO0O0("105125");
            }
            oOO0O0O0.OooO00o(true, false, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f29704OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29705OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29706OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29707OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i, VipVm vipVm, PersonalVipModel personalVipModel, int i2) {
            super(2);
            this.f29704OooO0Oo = i;
            this.f29706OooO0o0 = vipVm;
            this.f29705OooO0o = personalVipModel;
            this.f29707OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29707OooO0oO | 1);
            VipVm vipVm = this.f29706OooO0o0;
            PersonalVipModel personalVipModel = this.f29705OooO0o;
            VipInfoHeadCardKt.OooO0Oo(this.f29704OooO0Oo, vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipLevel f29708OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29709OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipModel f29710OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29711OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29712OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(VipLevel vipLevel, VipModel vipModel, PersonalVipModel personalVipModel, int i, int i2) {
            super(2);
            this.f29708OooO0Oo = vipLevel;
            this.f29710OooO0o0 = vipModel;
            this.f29709OooO0o = personalVipModel;
            this.f29711OooO0oO = i;
            this.f29712OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipInfoHeadCardKt.OooO0OO(this.f29708OooO0Oo, this.f29710OooO0o0, this.f29709OooO0o, this.f29711OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29712OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f29713OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOO0O0O0.OooO00o(true, false, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class Oooo000 {
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

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29714OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29715OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29716OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29717OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(BoxScope boxScope, PersonalVipModel personalVipModel, int i, int i2) {
            super(2);
            this.f29714OooO0Oo = boxScope;
            this.f29716OooO0o0 = personalVipModel;
            this.f29715OooO0o = i;
            this.f29717OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29717OooO0oO | 1);
            PersonalVipModel personalVipModel = this.f29716OooO0o0;
            int i = this.f29715OooO0o;
            VipInfoHeadCardKt.OooO0o0(this.f29714OooO0Oo, personalVipModel, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        int i = o0O0o.f48305o00OOooO;
        f29679OooO00o = CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0O0o.f48286o00OO00O), Color.m1671boximpl(o0O0o.f48287o00OO00o), Color.m1671boximpl(o0O0o.f48284o00OO0), Color.m1671boximpl(o0O0o.f48289o00OO0O0), Color.m1671boximpl(o0O0o.f48288o00OO0O), Color.m1671boximpl(o0O0o.f48290o00OO0OO)});
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, VipLevel vipLevel, VipModel vipModel, VipVm vipVm, PersonalVipModel personalVipModel, Composer composer, int i) {
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1728688530);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1728688530, i, -1, "com.yalla.yalla.ui.screen.user.vip.BottomArea (VipInfoHeadCard.kt:304)");
        }
        if (vipVm.isVipNormal(vipModel.getKaVipLv())) {
            if ((vipLevel == VipLevel.Vip0 && vipModel.getKaVipLv() == VipLevel.Vip1.getValue()) || vipLevel.getValue() == vipModel.getKaVipLv()) {
                composerStartRestartGroup.startReplaceableGroup(-1074139874);
                OooO0O0(vipModel, vipVm, personalVipModel, composerStartRestartGroup, 584);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1074139691);
                if (vipLevel.getValue() > vipModel.getKaVipLv()) {
                    composerStartRestartGroup.startReplaceableGroup(-1074139557);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.user_ka_vip_over_this_level, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (vipModel.getKaVipLv() - vipLevel.getValue() == 100) {
                    composerStartRestartGroup.startReplaceableGroup(-1074139382);
                    strStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(o000OOo.user_ka_vip_upgrade_level, composerStartRestartGroup, 0), oOO00O.OooO0O0(String.valueOf(vipModel.getExperience())));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1074138807);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.user_ka_vip_continue_refueling_to_level, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                String str = strStringResource;
                TextKt.m1261Text4IGK_g(str, boxScope.align(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(20), 0.0f, Dp.m3775constructorimpl(2), Dp.m3775constructorimpl(40), 2, null), Alignment.INSTANCE.getBottomStart()), Color.m1680copywmQWz5c$default(OooO0o(vipModel.getKaVipLv()), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130928);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, vipLevel, vipModel, vipVm, personalVipModel, i));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x02be  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(final VipModel vipModel, VipVm vipVm, final PersonalVipModel personalVipModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(782891844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(782891844, i, -1, "com.yalla.yalla.ui.screen.user.vip.ExperienceProgressBar (VipInfoHeadCard.kt:444)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int currentExperience = personalVipModel.getCurrentExperience() > 0 ? personalVipModel.getCurrentExperience() : 0;
        float leftExperience = currentExperience / (personalVipModel.getLeftExperience() + currentExperience);
        float f = 180;
        final float fM3775constructorimpl = Dp.m3775constructorimpl(leftExperience * f);
        float f2 = 20;
        ProgressIndicatorKt.m1158LinearProgressIndicator_5eSRE(Float.isNaN(leftExperience) ? 0.0f : leftExperience, boxScopeInstance.align(SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(o000.OooO00o(2, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(Constants.ERR_WATERMARK_READ), 0.0f, 0.0f, 12, null)), Dp.m3775constructorimpl(4)), Dp.m3775constructorimpl(f)), companion2.getTopStart()), o0O0o.f48093OooO0O0, OooO0o(vipModel.getKaVipLv()), 0, composerStartRestartGroup, 0, 16);
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-270267587);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new q();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final q qVar = (q) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Pair pairOooO0O0 = e.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, qVar, composerStartRestartGroup);
        MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
        final Function0 function0 = (Function0) pairOooO0O0.component2();
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.user.vip.VipInfoHeadCardKt$ExperienceProgressBar$lambda$26$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.OooO00o(semantics, qVar);
                return Unit.INSTANCE;
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.vip.VipInfoHeadCardKt$ExperienceProgressBar$lambda$26$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Composer composer2, Integer num) {
                long j;
                Composer composer3 = composer2;
                if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    constraintLayoutScope2.getClass();
                    constraintLayoutScope2.OooO0Oo();
                    ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                    O0OO00 o0oo00OooO00o = oooO00oOooO0OO.OooO00o();
                    O0OO00 o0oo00OooO0O0 = oooO00oOooO0OO.OooO0O0();
                    O0OO00 o0oo00OooO0OO = oooO00oOooO0OO.OooO0OO();
                    int kaVipLv = vipModel.getKaVipLv();
                    List<Color> list = VipInfoHeadCardKt.f29679OooO00o;
                    switch (VipInfoHeadCardKt.Oooo000.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(kaVipLv).ordinal()]) {
                        case 1:
                            j = o0O0o.f48173o0000OOo;
                            break;
                        case 2:
                            j = o0O0o.f48175o0000Oo0;
                            break;
                        case 3:
                            j = o0O0o.f48174o0000Oo;
                            break;
                        case 4:
                            j = o0O0o.f48176o0000OoO;
                            break;
                        case 5:
                            j = o0O0o.f48179o0000o0;
                            break;
                        case 6:
                            j = o0O0o.f48180o0000o0O;
                            break;
                        default:
                            j = o0O0o.f48173o0000OOo;
                            break;
                    }
                    composer3.startReplaceableGroup(-492369756);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue4 == companion5.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    MutableState mutableState = (MutableState) objRememberedValue4;
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    float fM3775constructorimpl2 = Dp.m3775constructorimpl(20);
                    float f3 = fM3775constructorimpl;
                    Dp.m3775constructorimpl(Dp.m3775constructorimpl(fM3775constructorimpl2 + f3) - density.mo322toDpu2uoSUM(((Number) mutableState.getValue()).floatValue()));
                    PersonalVipModel personalVipModel2 = personalVipModel;
                    String strOooO0O0 = personalVipModel2.getCurrentExperience() >= 0 ? oOO00O.OooO0O0(String.valueOf(personalVipModel2.getCurrentExperience())) : o00O00OO.OooO00o("-", oOO00O.OooO0O0(String.valueOf(Math.abs(personalVipModel2.getCurrentExperience()))));
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged = composer3.changed(o0oo00OooO0O0);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue5 == companion5.getEmpty()) {
                        objRememberedValue5 = new VipInfoHeadCardKt.OooO0O0(o0oo00OooO0O0);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.m532widthInVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(ConstraintLayoutScope.OooO00o(companion6, o0oo00OooO00o, (Function1) objRememberedValue5), RoundedCornerShapeKt.getCircleShape()), j, null, 2, null), Dp.m3775constructorimpl(28), 0.0f, 2, null), Dp.m3775constructorimpl(5), Dp.m3775constructorimpl(1));
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer3.changed(mutableState);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == companion5.getEmpty()) {
                        objRememberedValue6 = new VipInfoHeadCardKt.OooO0OO(mutableState);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceableGroup();
                    long j2 = j;
                    TextKt.m1261Text4IGK_g(strOooO0O0, OnRemeasuredModifierKt.onSizeChanged(modifierM479paddingVpY3zN4, (Function1) objRememberedValue6), o0O0o.f48108OooOOo0, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 3072, 122352);
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged3 = composer3.changed(o0oo00OooO0OO);
                    Object objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == companion5.getEmpty()) {
                        objRememberedValue7 = new VipInfoHeadCardKt.OooO0o(o0oo00OooO0OO);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(companion6, o0oo00OooO0O0, (Function1) objRememberedValue7);
                    Color colorM1671boximpl = Color.m1671boximpl(j2);
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged4 = composer3.changed(colorM1671boximpl);
                    Object objRememberedValue8 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue8 == companion5.getEmpty()) {
                        objRememberedValue8 = new VipInfoHeadCardKt.OooO(j2);
                        composer3.updateRememberedValue(objRememberedValue8);
                    }
                    composer3.endReplaceableGroup();
                    CanvasKt.Canvas(modifierOooO00o, (Function1) objRememberedValue8, composer3, 0);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0OOO0o.user_ka_vip_exp, composer3, 0);
                    Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(companion6, Dp.m3775constructorimpl(30));
                    Dp dpM3773boximpl = Dp.m3773boximpl(f3);
                    composer3.startReplaceableGroup(1157296644);
                    boolean zChanged5 = composer3.changed(dpM3773boximpl);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (zChanged5 || objRememberedValue9 == companion5.getEmpty()) {
                        objRememberedValue9 = new VipInfoHeadCardKt.OooOO0(f3);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    composer3.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource, (String) null, ConstraintLayoutScope.OooO00o(modifierM525size3ABfNKs, o0oo00OooO0OO, (Function1) objRememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                }
                return Unit.INSTANCE;
            }
        }), measurePolicy, composerStartRestartGroup, 48, 0);
        composerStartRestartGroup.endReplaceableGroup();
        VipLevel vipLevel = vipVm.getSupportVip6().getValue().booleanValue() ? VipLevel.Vip6 : VipLevel.Vip5;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(ZegoConstants.RoomError.SessionError), 0.0f, 0.0f, 12, null), companion2.getTopStart()), false, false, 0L, false, null, null, null, new OooOO0O(personalVipModel), 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0OO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        switch (Oooo000.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(personalVipModel.getKaVIPLv()).ordinal()]) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                if (!vipVm.getSupportVip6().getValue().booleanValue()) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                break;
            case 6:
                i2 = 6;
                break;
            default:
                i2 = 1;
                break;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append((personalVipModel.getLeftExperience() > 0 || personalVipModel.getKaVIPLv() < vipLevel.getValue()) ? personalVipModel.getKaVIPLv() == vipLevel.getValue() ? o0000O.OooO00o(o0000.OooO0OO(o000OOo.user_ka_vip_level_keep), oOO00O.OooO0O0(String.valueOf(personalVipModel.getLeftExperience()))) : o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.vip_exp_level_up), oOO00O.OooO0O0(String.valueOf(personalVipModel.getLeftExperience()))), String.valueOf(i2)) : o0000.OooO0OO(o000OOo.user_ka_vip_exp_level_full));
        InlineTextContentKt.appendInlineContent$default(builder, "imageId", null, 2, null);
        TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), OooO0o(vipModel.getKaVipLv()), TextUnitKt.getSp(10), null, null, null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to("imageId", new InlineTextContent(new Placeholder(TextUnitKt.getSp(12), TextUnitKt.getSp(12), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -327159666, true, new OooOOO0(vipModel))))), null, null, composerStartRestartGroup, 3072, 0, 229232);
        if (o00O00o0.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(vipModel, vipVm, personalVipModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(VipLevel vipLevel, VipModel vipModel, PersonalVipModel personalVipModel, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1943937391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1943937391, i2, -1, "com.yalla.yalla.ui.screen.user.vip.RightArea (VipInfoHeadCard.kt:357)");
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_1), Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_2), Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_3), Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_4), Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_5), Integer.valueOf(o0OOO0o.user_ka_vip_level_shadow_6)});
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 8;
        float f2 = 112;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), Dp.m3775constructorimpl(f2)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, BoxScopeInstance.INSTANCE.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f2)), companion2.getTopCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(16), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        o0O0ooO o0o0ooo = o0O0ooO.f53105OooO00o;
        o0O0ooO.OooOo0O(null, Integer.valueOf(vipModel.getKaVipLv()), 0.0f, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(80)), composerStartRestartGroup, 286720, 13);
        switch (Oooo000.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(vipModel.getKaVipLv()).ordinal()]) {
            case 1:
                i3 = o0OOO0o.user_ka_vip_level_1;
                break;
            case 2:
                i3 = o0OOO0o.user_ka_vip_level_2;
                break;
            case 3:
                i3 = o0OOO0o.user_ka_vip_level_3;
                break;
            case 4:
                i3 = o0OOO0o.user_ka_vip_level_4;
                break;
            case 5:
                i3 = o0OOO0o.user_ka_vip_level_5;
                break;
            case 6:
                i3 = o0OOO0o.user_ka_vip_level_6;
                break;
            default:
                i3 = o0OOO0o.user_ka_vip_level_1;
                break;
        }
        boolean z = true;
        ImageKt.Image(PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0), (String) null, OffsetKt.m439offsetVpY3zN4$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(11)), 0.0f, Dp.m3775constructorimpl(-2), 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        composerStartRestartGroup.startReplaceableGroup(611434496);
        if (vipLevel.getValue() > vipModel.getKaVipLv() || personalVipModel.getKaVIPState() == VipState.VipFrozen.getValue()) {
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                int iOooO0OO = p596o0oo000O.OooO0o.OooO0OO();
                if (iOooO0OO != 5 && iOooO0OO != 6) {
                    z = false;
                }
                objRememberedValue = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            if (vipLevel == VipLevel.Vip6) {
                composerStartRestartGroup.startReplaceableGroup(542759000);
                strStringResource = StringResources_androidKt.stringResource(o000OOo.welfare_recharge, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(542759091);
                strStringResource = StringResources_androidKt.stringResource(o000OOo.vip_level_up, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            long j = o0O0o.f48093OooO0O0;
            long jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(OooO0o(vipModel.getKaVipLv()), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            long jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
            PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(zBooleanValue ? Dp.m3775constructorimpl(f) : Dp.m3775constructorimpl(17), Dp.m3775constructorimpl((float) 6.5d));
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null);
            FontWeight normal = FontWeight.INSTANCE.getNormal();
            Color colorM1671boximpl = Color.m1671boximpl(j);
            Color colorM1671boximpl2 = Color.m1671boximpl(jM1680copywmQWz5c$default);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(vipLevel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new OooOOOO(vipLevel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o00O0OO0.OooO00o(strStringResource, jOooO0OO, normal, null, colorM1671boximpl, colorM1671boximpl2, null, 0.0f, paddingValuesM472PaddingValuesYgX7TsA, false, false, 0L, false, null, null, null, null, null, modifierM482paddingqDBjuR0$default, (Function0) objRememberedValue2, composer2, 384, 100663302, 260808);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(vipLevel, vipModel, personalVipModel, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(int i, @NotNull VipVm vipVm, @NotNull PersonalVipModel myKaVipModel, @Nullable Composer composer, int i2) {
        int i3;
        float f;
        String strOooO00o;
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(myKaVipModel, "myKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(898083414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(898083414, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipInfoHeadCard (VipInfoHeadCard.kt:94)");
        }
        VipModel vipModel = vipVm.getKaVipModels().get(i);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(12), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        VipLevel.Companion companion4 = VipLevel.INSTANCE;
        switch (Oooo000.$EnumSwitchMapping$0[companion4.of(i + 1).ordinal()]) {
            case 1:
                i3 = o0OOO0o.user_ka_vip_level_page_1;
                break;
            case 2:
                i3 = o0OOO0o.user_ka_vip_level_page_2;
                break;
            case 3:
                i3 = o0OOO0o.user_ka_vip_level_page_3;
                break;
            case 4:
                i3 = o0OOO0o.user_ka_vip_level_page_4;
                break;
            case 5:
                i3 = o0OOO0o.user_ka_vip_level_page_5;
                break;
            case 6:
                i3 = o0OOO0o.user_ka_vip_level_page_6;
                break;
            default:
                i3 = o0OOO0o.user_ka_vip_level_page_1;
                break;
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getCenter(), ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 28088, 96);
        VipLevel vipLevelOf = companion4.of(myKaVipModel.getKaVIPLv());
        long jOooO0o = OooO0o(vipModel.getKaVipLv());
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), companion2.getCenter());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(companion2, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(715614233);
        if (myKaVipModel.getKaVIPLv() == vipModel.getKaVipLv()) {
            float f2 = 0;
            f = 0.0f;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000OOo.user_ka_vip_current_level, composerStartRestartGroup, 0), PaddingKt.m479paddingVpY3zN4(boxScopeInstance.align(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m730RoundedCornerShapea9UjIt4(Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(f2))), Color.m1680copywmQWz5c$default(jOooO0o, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), companion2.getTopStart()), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(6)), jOooO0o, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65392);
        } else {
            f = 0.0f;
        }
        float f3 = f;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign2 = boxScopeInstance.align(IntrinsicKt.height(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(32), 0.0f, 0.0f, 12, null), IntrinsicSize.Max), companion2.getTopStart());
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign2);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO00o4, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(oo0oO0.OooO(), composerStartRestartGroup, 8);
        o0O0ooO o0o0ooo = o0O0ooO.f53105OooO00o;
        o0o0ooo.OooO((String) stateObserveAsState.getValue(), null, 0.0f, null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(44)), composerStartRestartGroup, 286768, 12);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO00o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO00o5, composerM1320constructorimpl5, currentCompositionLocalMap5);
        if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        o0o0ooo.OooOOOo((String) LiveDataAdapterKt.observeAsState(oo0oO0.OooOOoo(), composerStartRestartGroup, 8).getValue(), jOooO0o, false, TextUnitKt.getSp(16), 0, 0, FontWeight.INSTANCE.getBold(), false, null, composerStartRestartGroup, 1075317760, 436);
        composerStartRestartGroup.startReplaceableGroup(1594254138);
        VipLevel vipLevel = VipLevel.Vip0;
        if (vipLevelOf == vipLevel && vipModel.getKaVipLv() == VipLevel.Vip1.getValue()) {
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000OOo.user_ka_vip_not_current_level, composerStartRestartGroup, 0), (Modifier) null, OooO0o(vipModel.getKaVipLv()), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(f3, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130930);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-692199345);
        if ((vipLevelOf == vipLevel && vipModel.getKaVipLv() == VipLevel.Vip1.getValue() && myKaVipModel.getCurrentExperience() > 0) || vipLevelOf.getValue() == vipModel.getKaVipLv()) {
            if (myKaVipModel.getKaVIPState() == VipState.VipFrozen.getValue()) {
                composerStartRestartGroup.startReplaceableGroup(1594255367);
                strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000OOo.user_ka_vip_remain_time, composerStartRestartGroup, 0), String.valueOf(myKaVipModel.getLeftDayNum()));
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1594255449);
                strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(vipLevelOf == vipLevel ? o000OOo.user_ka_vip_experience_expiry_time : o000OOo.user_ka_vip_expiry_time, composerStartRestartGroup, 0), p606o0oo0O0.OooOOOO.OooO0OO(myKaVipModel.getExpireTimeStamp(), "dd/MM/yyyy"));
                composerStartRestartGroup.endReplaceableGroup();
            }
            TextKt.m1261Text4IGK_g(strOooO00o, (Modifier) null, Color.m1680copywmQWz5c$default(jOooO0o, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(f3, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130930);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScopeInstance, vipLevelOf, vipModel, vipVm, myKaVipModel, composerStartRestartGroup, 37382);
        o00O00OO.OooO0O0(composerStartRestartGroup);
        OooO0OO(vipLevelOf, vipModel, myKaVipModel, i, composerStartRestartGroup, ((i2 << 9) & 7168) | 576);
        o00O00OO.OooO0O0(composerStartRestartGroup);
        OooO0o0(boxScopeInstance, myKaVipModel, i, composerStartRestartGroup, ((i2 << 6) & 896) | 70);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(i, vipVm, myKaVipModel, i2));
    }

    public static final long OooO0o(int i) {
        int iLevel = VipLevel.INSTANCE.of(i).level() - 1;
        if (iLevel >= 0) {
            List<Color> list = f29679OooO00o;
            if (iLevel < list.size()) {
                return list.get(iLevel).m1691unboximpl();
            }
        }
        int i2 = o0O0o.f48305o00OOooO;
        return o0O0o.f48286o00OO00O;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(BoxScope boxScope, PersonalVipModel personalVipModel, int i, Composer composer, int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326355650);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-326355650, i2, -1, "com.yalla.yalla.ui.screen.user.vip.frozenVipArea (VipInfoHeadCard.kt:222)");
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip1), Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip2), Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip3), Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip4), Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip5), Integer.valueOf(oo0o0Oo.ic_frozen_rechage_bg_vip6)});
        if (personalVipModel.getKaVIPState() == VipState.VipFrozen.getValue() && personalVipModel.getKaVIPLv() == VipLevel.INSTANCE.of(i + 1).getValue()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 23;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ClipKt.clip(companion, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), 0.0f, 1, null), o0O0o.f48116OooOoO0, null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM171backgroundbw27NRU$default, companion2.getCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f2 = 17;
            float f3 = 58;
            Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(125), Dp.m3775constructorimpl(f2), 2, null), Dp.m3775constructorimpl(f3)), companion2.getBottomStart());
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0OO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign2);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0OOO0o.user_ka_vip_look, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            oo0oOO0.OooO00o(4, companion, composerStartRestartGroup, 6);
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(o000OOo.user_ka_vip_forzen_hint, composerStartRestartGroup, 0), String.valueOf(Math.abs(personalVipModel.getCurrentExperience()))), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), o0O0o.f48093OooO0O0, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130928);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(11), Dp.m3775constructorimpl(f2), 3, null), Dp.m3775constructorimpl(109)), Dp.m3775constructorimpl(f3)), companion2.getBottomEnd()), false, false, 0L, false, null, null, null, Oooo0.f29713OooO0Oo, 253);
            Alignment center = companion2.getCenter();
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
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf.get(i)).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000OOo.welfare_recharge, composer2, 0), boxScopeInstance.align(companion, companion2.getCenter()), OooO0o(personalVipModel.getKaVIPLv()), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
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
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, personalVipModel, i, i2));
    }
}
