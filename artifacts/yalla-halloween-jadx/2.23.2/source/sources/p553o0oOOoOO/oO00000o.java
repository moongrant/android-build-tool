package p553o0oOOoOO;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.vip.VipWelfareModel;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0OoO.o00OO00O;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O00OO;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nListWelfareItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListWelfareItem.kt\ncom/yalla/yalla/ui/screen/user/vip/ListWelfareItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,417:1\n154#2:418\n154#2:419\n154#2:427\n154#2:428\n154#2:469\n154#2:470\n154#2:471\n154#2:538\n154#2:539\n154#2:540\n154#2:593\n154#2:594\n154#2:595\n154#2:631\n154#2:632\n154#2:647\n154#2:648\n154#2:654\n154#2:660\n154#2:696\n154#2:697\n164#2:698\n154#2:699\n154#2:735\n154#2:736\n154#2:742\n154#2:743\n164#2:744\n154#2:745\n154#2:781\n154#2:782\n154#2:788\n154#2:789\n164#2:790\n154#2:791\n154#2:827\n154#2:828\n154#2:839\n154#2:840\n36#3:420\n456#3,8:446\n464#3,3:460\n467#3,3:464\n456#3,8:489\n464#3,3:503\n456#3,8:520\n464#3,3:534\n467#3,3:541\n467#3,3:546\n25#3:551\n456#3,8:575\n464#3,3:589\n456#3,8:613\n464#3,3:627\n36#3:633\n25#3:640\n467#3,3:649\n467#3,3:655\n456#3,8:678\n464#3,3:692\n456#3,8:717\n464#3,3:731\n467#3,3:737\n456#3,8:763\n464#3,3:777\n467#3,3:783\n456#3,8:809\n464#3,3:823\n467#3,3:829\n467#3,3:834\n1097#4,6:421\n1097#4,6:552\n1097#4,6:634\n1097#4,6:641\n66#5,6:429\n72#5:463\n76#5:468\n66#5,6:472\n72#5:506\n76#5:550\n66#5,6:596\n72#5:630\n76#5:653\n78#6,11:435\n91#6:467\n78#6,11:478\n78#6,11:509\n91#6:544\n91#6:549\n78#6,11:564\n78#6,11:602\n91#6:652\n91#6:658\n78#6,11:667\n78#6,11:706\n91#6:740\n78#6,11:752\n91#6:786\n78#6,11:798\n91#6:832\n91#6:837\n4144#7,6:454\n4144#7,6:497\n4144#7,6:528\n4144#7,6:583\n4144#7,6:621\n4144#7,6:686\n4144#7,6:725\n4144#7,6:771\n4144#7,6:817\n77#8,2:507\n79#8:537\n83#8:545\n73#8,6:661\n79#8:695\n73#8,6:700\n79#8:734\n83#8:741\n73#8,6:746\n79#8:780\n83#8:787\n73#8,6:792\n79#8:826\n83#8:833\n83#8:838\n72#9,6:558\n78#9:592\n82#9:659\n81#10:841\n107#10,2:842\n*S KotlinDebug\n*F\n+ 1 ListWelfareItem.kt\ncom/yalla/yalla/ui/screen/user/vip/ListWelfareItemKt\n*L\n72#1:418\n73#1:419\n80#1:427\n81#1:428\n118#1:469\n119#1:470\n120#1:471\n150#1:538\n153#1:539\n166#1:540\n209#1:593\n210#1:594\n211#1:595\n222#1:631\n223#1:632\n257#1:647\n259#1:648\n280#1:654\n291#1:660\n297#1:696\n298#1:697\n303#1:698\n303#1:699\n308#1:735\n310#1:736\n328#1:742\n329#1:743\n334#1:744\n334#1:745\n339#1:781\n341#1:782\n359#1:788\n360#1:789\n365#1:790\n365#1:791\n370#1:827\n372#1:828\n398#1:839\n399#1:840\n74#1:420\n65#1:446,8\n65#1:460,3\n65#1:464,3\n123#1:489,8\n123#1:503,3\n140#1:520,8\n140#1:534,3\n140#1:541,3\n123#1:546,3\n201#1:551\n203#1:575,8\n203#1:589,3\n207#1:613,8\n207#1:627,3\n238#1:633\n255#1:640\n207#1:649,3\n203#1:655,3\n291#1:678,8\n291#1:692,3\n294#1:717,8\n294#1:731,3\n294#1:737,3\n325#1:763,8\n325#1:777,3\n325#1:783,3\n356#1:809,8\n356#1:823,3\n356#1:829,3\n291#1:834,3\n74#1:421,6\n201#1:552,6\n238#1:634,6\n255#1:641,6\n65#1:429,6\n65#1:463\n65#1:468\n123#1:472,6\n123#1:506\n123#1:550\n207#1:596,6\n207#1:630\n207#1:653\n65#1:435,11\n65#1:467\n123#1:478,11\n140#1:509,11\n140#1:544\n123#1:549\n203#1:564,11\n207#1:602,11\n207#1:652\n203#1:658\n291#1:667,11\n294#1:706,11\n294#1:740\n325#1:752,11\n325#1:786\n356#1:798,11\n356#1:832\n291#1:837\n65#1:454,6\n123#1:497,6\n140#1:528,6\n203#1:583,6\n207#1:621,6\n291#1:686,6\n294#1:725,6\n325#1:771,6\n356#1:817,6\n140#1:507,2\n140#1:537\n140#1:545\n291#1:661,6\n291#1:695\n294#1:700,6\n294#1:734\n294#1:741\n325#1:746,6\n325#1:780\n325#1:787\n356#1:792,6\n356#1:826\n356#1:833\n291#1:838\n203#1:558,6\n203#1:592\n203#1:659\n201#1:841\n201#1:842,2\n*E\n"})
public final class oO00000o {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f56033OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Function0<Unit> function0) {
            super(0);
            this.f56033OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f56033OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f56034OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56035OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Integer, Unit> function1, VipWelfareModel vipWelfareModel) {
            super(0);
            this.f56034OooO0Oo = function1;
            this.f56035OooO0o0 = vipWelfareModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f56034OooO0Oo.invoke(Integer.valueOf(this.f56035OooO0o0.getShopId()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f56036OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56037OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f56038OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56039OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(BoxScope boxScope, Function1<? super Integer, Unit> function1, VipWelfareModel vipWelfareModel, int i) {
            super(2);
            this.f56036OooO0Oo = boxScope;
            this.f56038OooO0o0 = function1;
            this.f56037OooO0o = vipWelfareModel;
            this.f56039OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56039OooO0oO | 1);
            Function1<Integer, Unit> function1 = this.f56038OooO0o0;
            VipWelfareModel vipWelfareModel = this.f56037OooO0o;
            oO00000o.OooO00o(this.f56036OooO0Oo, function1, vipWelfareModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56041OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(VipWelfareModel vipWelfareModel, int i) {
            super(2);
            this.f56040OooO0Oo = vipWelfareModel;
            this.f56041OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56041OooO0o0 | 1);
            oO00000o.OooO0O0(this.f56040OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f56042OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56043OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f56044OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56045OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(BoxScope boxScope, Function1<? super Integer, Unit> function1, VipWelfareModel vipWelfareModel, int i) {
            super(2);
            this.f56042OooO0Oo = boxScope;
            this.f56044OooO0o0 = function1;
            this.f56043OooO0o = vipWelfareModel;
            this.f56045OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56045OooO0oO | 1);
            Function1<Integer, Unit> function1 = this.f56044OooO0o0;
            VipWelfareModel vipWelfareModel = this.f56043OooO0o;
            oO00000o.OooO0OO(this.f56042OooO0Oo, function1, vipWelfareModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56046OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f56047OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f56048OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56049OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(VipWelfareModel vipWelfareModel, Function1<? super Integer, Unit> function1, Function0<Unit> function0, int i) {
            super(2);
            this.f56046OooO0Oo = vipWelfareModel;
            this.f56048OooO0o0 = function1;
            this.f56047OooO0o = function0;
            this.f56049OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56049OooO0oO | 1);
            Function1<Integer, Unit> function1 = this.f56048OooO0o0;
            Function0<Unit> function0 = this.f56047OooO0o;
            oO00000o.OooO0Oo(this.f56046OooO0Oo, function1, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nListWelfareItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListWelfareItem.kt\ncom/yalla/yalla/ui/screen/user/vip/ListWelfareItemKt$MainTopArea$1$1$1$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,417:1\n489#2,11:418\n*S KotlinDebug\n*F\n+ 1 ListWelfareItem.kt\ncom/yalla/yalla/ui/screen/user/vip/ListWelfareItemKt$MainTopArea$1$1$1$1\n*L\n239#1:418,11\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f56050OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState) {
            super(1);
            this.f56050OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<Boolean> mutableState = this.f56050OooO0Oo;
            it.f11683OooO0o0 = new oO0000O(mutableState, mutableState);
            o000OO.OooO0o(it, new ColorDrawable(Color.parseColor("#FF2C2C34")));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f56051OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56052OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(BoxScope boxScope, int i) {
            super(2);
            this.f56051OooO0Oo = boxScope;
            this.f56052OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56052OooO0o0 | 1);
            oO00000o.OooO0o(this.f56051OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f56053OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f56054OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipWelfareModel f56055OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(BoxScope boxScope, VipWelfareModel vipWelfareModel, int i) {
            super(2);
            this.f56053OooO0Oo = boxScope;
            this.f56055OooO0o0 = vipWelfareModel;
            this.f56054OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56054OooO0o | 1);
            oO00000o.OooO0o0(this.f56053OooO0Oo, this.f56055OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, @NotNull Function1<? super Integer, Unit> onBuyClick, @NotNull VipWelfareModel model, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onBuyClick, "onBuyClick");
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1217524478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1217524478, i, -1, "com.yalla.yalla.ui.screen.user.vip.BottomArea (ListWelfareItem.kt:115)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 18;
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(24), 2, null), Dp.m3775constructorimpl(32)), Dp.m3775constructorimpl(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(modifierM530width3ABfNKs, companion2.getBottomCenter());
        Modifier modifierOooO0O0 = model.isEnable() ? o0O0O00.OooO0O0(companion.then(modifierAlign), false, false, 0L, false, null, null, null, new OooO00o(onBuyClick, model), 255) : companion.then(modifierAlign);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(model.isEnable() ? p562o0oOo000.o0O0O00.ic_welfare_item_btn : p562o0oOo000.o0O0O00.ic_welfare_item_soldout_btn, composerStartRestartGroup, 0);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 6), (Alignment) null, companion4.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (model.isEnable()) {
            composerStartRestartGroup.startReplaceableGroup(-1086914544);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_welfare_list_item_icon, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
            float f2 = 4;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            if (model.getTimeLong() > 0) {
                composerStartRestartGroup.startReplaceableGroup(-1086914152);
                TextKt.m1261Text4IGK_g(String.valueOf(model.getPrice()), (Modifier) null, o0OOo000.f48334o00OO0o0, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 199680, 0, 65490);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
                TextKt.m1261Text4IGK_g("/".concat(o0000O.OooO00o(o0000.OooO0OO(o000000.store_xxx_days), String.valueOf(model.getTimeLong()))), (Modifier) null, o0OOo000.f48313o00O0Ooo, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1086913173);
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(String.valueOf(model.getPrice()), (Modifier) null, o0OOo000.f48334o00OO0o0, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1086912878);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.welfare_out_of_stock, composer2, 0), (Modifier) null, o0OOo000.f48140OooO0oO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            composer2.endReplaceableGroup();
        }
        if (com.facebook.appevents.OooOOO0.OooO0O0(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, onBuyClick, model, i));
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(VipWelfareModel vipWelfareModel, Composer composer, int i) {
        Composer composer2;
        Composer composer3;
        Arrangement arrangement;
        ?? r0;
        Composer composer4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-510707027);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-510707027, i, -1, "com.yalla.yalla.ui.screen.user.vip.LeftTopTagArea (ListWelfareItem.kt:288)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 8;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement2 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement2, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
        composerStartRestartGroup.startReplaceableGroup(1046204886);
        if (vipWelfareModel.getIsLimitNum()) {
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(14));
            Brush.Companion companion4 = Brush.INSTANCE;
            int i2 = o0OOo000.f48347o00OOooO;
            Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.background$default(modifierM511height3ABfNKs, Brush.Companion.m1638linearGradientmHitzGk$default(companion4, CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48370oo0O), androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48325o00OO)}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape(50), 0.0f, 4, null), Dp.m3775constructorimpl((float) 2.5d), 0.0f, Dp.m3775constructorimpl(4), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement2, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_welfare_mall_limit_sold, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composerStartRestartGroup, 6, 2);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.welfare_limited, composerStartRestartGroup, 0), (Modifier) null, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(10, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 0, 0, 65522);
            o0ooOOo.OooO00o(composer2);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        Composer composer5 = composer2;
        composer5.startReplaceableGroup(1046206041);
        if (vipWelfareModel.getLimitDay() > 0) {
            Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
            Modifier modifierM511height3ABfNKs2 = SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(14));
            Brush.Companion companion5 = Brush.INSTANCE;
            int i3 = o0OOo000.f48347o00OOooO;
            r0 = 0;
            Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.background$default(modifierM511height3ABfNKs2, Brush.Companion.m1638linearGradientmHitzGk$default(companion5, CollectionsKt.listOf((Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48339o00OOO0O), androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.o0o0Oo)}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape(50), 0.0f, 4, null), Dp.m3775constructorimpl((float) 2.5d), 0.0f, Dp.m3775constructorimpl(4), 0.0f, 10, null);
            composer5.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement2, centerVertically3, composer5, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default3);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O2, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer5)), composer5, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_welfare_mall_limit_time, composer5, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composer5, 6, 2);
            companion3 = companion3;
            arrangement = arrangement2;
            composer3 = composer5;
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(o000000.store_xxx_days), String.valueOf(vipWelfareModel.getLimitDay())), (Modifier) null, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(10, composer5, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer3, 0, 0, 65522);
            o0ooOOo.OooO00o(composer3);
        } else {
            composer3 = composer5;
            arrangement = arrangement2;
            r0 = 0;
        }
        composer3.endReplaceableGroup();
        Composer composer6 = composer3;
        composer6.startReplaceableGroup(-1992317993);
        if (vipWelfareModel.getExchangeLevel() > 0) {
            Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
            float f2 = 4;
            Modifier modifierM511height3ABfNKs3 = SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(14));
            Brush.Companion companion6 = Brush.INSTANCE;
            androidx.compose.ui.graphics.Color[] colorArr = new androidx.compose.ui.graphics.Color[2];
            int i4 = o0OOo000.f48347o00OOooO;
            colorArr[r0] = androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48338o00OOO00);
            colorArr[1] = androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48337o00OOO0);
            Modifier modifierM482paddingqDBjuR0$default4 = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.background$default(modifierM511height3ABfNKs3, Brush.Companion.m1638linearGradientmHitzGk$default(companion6, CollectionsKt.listOf((Object[]) colorArr), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape(50), 0.0f, 4, null), Dp.m3775constructorimpl((float) 2.5d), 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 10, null);
            composer6.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically4, composer6, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, r0);
            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default4);
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor4);
            } else {
                composer6.useNode();
            }
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composer6);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O3, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(r0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer6)), composer6, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_welfare_mall_vip, composer6, r0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(9)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(1), null, composer6, 6, 2);
            composer4 = composer6;
            TextKt.m1261Text4IGK_g(String.valueOf(vipWelfareModel.getExchangeLevel() / 100), (Modifier) null, o0OOo000.f48316o00O0o00, o0000O0.OooO0OO(10, composer6, 6), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle((boolean) r0), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer4, 196608, 0, 65490);
            o0ooOOo.OooO00o(composer4);
        } else {
            composer4 = composer6;
        }
        if (OooOo.OooO00o(composer4)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(vipWelfareModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull BoxScope boxScope, @NotNull Function1<? super Integer, Unit> onItemClick, @NotNull VipWelfareModel model, @Nullable Composer composer, int i) {
        Integer shopType;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(1678007755);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1678007755, i, -1, "com.yalla.yalla.ui.screen.user.vip.ListItemMainContent (ListWelfareItem.kt:92)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_welfare_item_bg, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        int i2 = i & 14;
        OooO0o0(boxScope, model, composerStartRestartGroup, i2 | 64);
        OooO0O0(model, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(319813614);
        Integer shopType2 = model.getShopType();
        if ((shopType2 != null && shopType2.intValue() == 9) || ((shopType = model.getShopType()) != null && shopType.intValue() == 10)) {
            OooO0o(boxScope, composerStartRestartGroup, i2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScope, onItemClick, model, composerStartRestartGroup, i2 | ConstantsKt.MINIMUM_BLOCK_SIZE | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, onItemClick, model, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull VipWelfareModel model, @NotNull Function1<? super Integer, Unit> onBuyBtnClick, @NotNull Function0<Unit> onItemPreviewClick, @Nullable Composer composer, int i) {
        Integer shopType;
        Modifier modifierOooO00o;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onBuyBtnClick, "onBuyBtnClick");
        Intrinsics.checkNotNullParameter(onItemPreviewClick, "onItemPreviewClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1509913454);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1509913454, i, -1, "com.yalla.yalla.ui.screen.user.vip.ListWelfareItem (ListWelfareItem.kt:63)");
        }
        composerStartRestartGroup.startReplaceableGroup(-515368684);
        Integer shopType2 = model.getShopType();
        if ((shopType2 != null && shopType2.intValue() == 9) || ((shopType = model.getShopType()) != null && shopType.intValue() == 10)) {
            Modifier modifierClip = ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(185)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(6)));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(onItemPreviewClick);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO(onItemPreviewClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierOooO00o = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        } else {
            modifierOooO00o = o00O0O0.OooO00o(6, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(185)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        OooO0OO(BoxScopeInstance.INSTANCE, onBuyBtnClick, model, composerStartRestartGroup, (i & 112) | 518);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(model, onBuyBtnClick, onItemPreviewClick, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1831124106);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831124106, i2, -1, "com.yalla.yalla.ui.screen.user.vip.RightTopOpenBig (ListWelfareItem.kt:391)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_profile_expand, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m3775constructorimpl(8)), Dp.m3775constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(boxScope, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(BoxScope boxScope, VipWelfareModel vipWelfareModel, Composer composer, int i) {
        Integer shopType;
        Alignment.Companion companion;
        BoxScopeInstance boxScopeInstance;
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1035975336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1035975336, i, -1, "com.yalla.yalla.ui.screen.user.vip.MainTopArea (ListWelfareItem.kt:199)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(companion3, companion4.getTopCenter());
        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, Dp.m3775constructorimpl(24), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(75)), Dp.m3775constructorimpl(120));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion4, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM530width3ABfNKs);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScopeInstance2.align(companion3, companion4.getCenter()), 0.0f, 1, null);
        ContentScale.Companion companion6 = ContentScale.INSTANCE;
        ContentScale fit = companion6.getFit();
        Integer shopType2 = vipWelfareModel.getShopType();
        if (shopType2 != null && shopType2.intValue() == 10) {
            fit = companion6.getInside();
            modifierFillMaxSize$default = SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(boxScopeInstance2.align(companion3, companion4.getCenter()), Dp.m3775constructorimpl(56)), Dp.m3775constructorimpl(85));
        }
        composerStartRestartGroup.startReplaceableGroup(928514606);
        Integer shopType3 = vipWelfareModel.getShopType();
        if ((shopType3 != null && shopType3.intValue() == 9) || ((shopType = vipWelfareModel.getShopType()) != null && shopType.intValue() == 8)) {
            modifierFillMaxSize$default = o0O0O00.OooO0Oo(modifierFillMaxSize$default, composerStartRestartGroup, 0);
        }
        Modifier modifier = modifierFillMaxSize$default;
        composerStartRestartGroup.endReplaceableGroup();
        int i3 = 11;
        if (o00O00OO.OooO0oO(vipWelfareModel.getPicUrl())) {
            composerStartRestartGroup.startReplaceableGroup(928514853);
            companion = companion4;
            o00OO00O.OooO00o(vipWelfareModel.getPicUrl(), true, 0, null, null, modifier, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.endReplaceableGroup();
            boxScopeInstance = boxScopeInstance2;
        } else {
            companion = companion4;
            composerStartRestartGroup.startReplaceableGroup(928515035);
            String picUrl = vipWelfareModel.getPicUrl();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new OooOO0O(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boxScopeInstance = boxScopeInstance2;
            ImageKt.Image(o000OO.OooO0OO(picUrl, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0), "", modifier, (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 104);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = "svga/anim_loading.svga";
                    composerStartRestartGroup.updateRememberedValue("svga/anim_loading.svga");
                }
                composerStartRestartGroup.endReplaceableGroup();
                i2 = 11;
                o00OO00O.OooO00o((String) objRememberedValue3, true, 0, null, null, PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(30)), companion.getCenter()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(11), 7, null), composerStartRestartGroup, 54, 28);
            } else {
                i2 = 11;
            }
            i3 = i2;
            composerStartRestartGroup.endReplaceableGroup();
        }
        int i4 = i3;
        composerStartRestartGroup.startReplaceableGroup(1837232503);
        Integer shopType4 = vipWelfareModel.getShopType();
        if (shopType4 != null && shopType4.intValue() == 8) {
            Modifier modifierAlign2 = boxScopeInstance.align(companion3, companion.getCenter());
            int i5 = o0OOo000.f48347o00OOooO;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g("Yalla", modifierAlign2, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        String shopName = vipWelfareModel.getShopName();
        Composer composer4 = composer2;
        composer4.startReplaceableGroup(959427250);
        if (shopName == null) {
            composer3 = composer4;
        } else {
            long sp = TextUnitKt.getSp(i4);
            int i6 = o0OOo000.f48347o00OOooO;
            float f = 8;
            composer3 = composer4;
            TextKt.m1261Text4IGK_g(shopName, PaddingKt.m482paddingqDBjuR0$default(companion3, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2), Dp.m3775constructorimpl(f), 0.0f, 8, null), o0OOo000.f48142OooOO0, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 130544);
            Unit unit = Unit.INSTANCE;
        }
        if (OooOo.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(boxScope, vipWelfareModel, i));
    }
}
