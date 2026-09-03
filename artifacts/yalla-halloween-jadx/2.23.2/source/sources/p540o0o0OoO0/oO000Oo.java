package p540o0o0OoO0;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.ui.vm.RoomMemberVM;
import kotlin.Unit;
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
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o000000;
import p483o0o000Oo.o00000OO;
import p483o0o000Oo.o0000oo;
import p516o0o0O00o.o0O0o;
import p530o0o0OOOO.o0O00oO0;
import p562o0oOo000.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,443:1\n76#2:444\n76#2:639\n81#3,11:445\n154#4:456\n154#4:457\n154#4:533\n154#4:534\n154#4:535\n154#4:541\n154#4:542\n154#4:543\n154#4:544\n154#4:545\n154#4:546\n154#4:582\n154#4:625\n154#4:626\n154#4:627\n154#4:628\n154#4:699\n154#4:735\n154#4:736\n154#4:737\n154#4:773\n154#4:779\n154#4:780\n154#4:781\n66#5,6:458\n72#5:492\n76#5:497\n66#5,6:498\n72#5:532\n76#5:540\n66#5,6:547\n72#5:581\n76#5:638\n66#5,6:664\n72#5:698\n66#5,6:738\n72#5:772\n76#5:778\n76#5:791\n78#6,11:464\n91#6:496\n78#6,11:504\n91#6:539\n78#6,11:553\n78#6,11:596\n91#6:632\n91#6:637\n78#6,11:670\n78#6,11:706\n78#6,11:744\n91#6:777\n91#6:785\n91#6:790\n78#6,11:799\n91#6:831\n456#7,8:475\n464#7,3:489\n467#7,3:493\n456#7,8:515\n464#7,3:529\n467#7,3:536\n456#7,8:564\n464#7,3:578\n36#7:583\n456#7,8:607\n464#7,3:621\n467#7,3:629\n467#7,3:634\n25#7:640\n25#7:647\n67#7,3:654\n66#7:657\n456#7,8:681\n464#7,3:695\n456#7,8:717\n464#7,3:731\n456#7,8:755\n464#7,3:769\n467#7,3:774\n467#7,3:782\n467#7,3:787\n456#7,8:810\n464#7,3:824\n467#7,3:828\n4144#8,6:483\n4144#8,6:523\n4144#8,6:572\n4144#8,6:615\n4144#8,6:689\n4144#8,6:725\n4144#8,6:763\n4144#8,6:818\n1097#9,6:584\n1097#9,6:641\n1097#9,6:648\n1097#9,6:658\n72#10,6:590\n78#10:624\n82#10:633\n72#10,6:700\n78#10:734\n82#10:786\n71#10,7:792\n78#10:827\n82#10:832\n81#11:833\n81#11:834\n81#11:835\n81#11:836\n107#11,2:837\n81#11:839\n107#11,2:840\n*S KotlinDebug\n*F\n+ 1 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt\n*L\n78#1:444\n323#1:639\n79#1:445,11\n91#1:456\n93#1:457\n172#1:533\n173#1:534\n174#1:535\n229#1:541\n230#1:542\n231#1:543\n254#1:544\n255#1:545\n256#1:546\n291#1:582\n297#1:625\n303#1:626\n305#1:627\n312#1:628\n375#1:699\n381#1:735\n384#1:736\n385#1:737\n392#1:773\n404#1:779\n412#1:780\n422#1:781\n88#1:458,6\n88#1:492\n88#1:497\n126#1:498,6\n126#1:532\n126#1:540\n287#1:547,6\n287#1:581\n287#1:638\n371#1:664,6\n371#1:698\n382#1:738,6\n382#1:772\n382#1:778\n371#1:791\n88#1:464,11\n88#1:496\n126#1:504,11\n126#1:539\n287#1:553,11\n288#1:596,11\n288#1:632\n287#1:637\n371#1:670,11\n372#1:706,11\n382#1:744,11\n382#1:777\n372#1:785\n371#1:790\n440#1:799,11\n440#1:831\n88#1:475,8\n88#1:489,3\n88#1:493,3\n126#1:515,8\n126#1:529,3\n126#1:536,3\n287#1:564,8\n287#1:578,3\n292#1:583\n288#1:607,8\n288#1:621,3\n288#1:629,3\n287#1:634,3\n332#1:640\n335#1:647\n338#1:654,3\n338#1:657\n371#1:681,8\n371#1:695,3\n372#1:717,8\n372#1:731,3\n382#1:755,8\n382#1:769,3\n382#1:774,3\n372#1:782,3\n371#1:787,3\n440#1:810,8\n440#1:824,3\n440#1:828,3\n88#1:483,6\n126#1:523,6\n287#1:572,6\n288#1:615,6\n371#1:689,6\n372#1:725,6\n382#1:763,6\n440#1:818,6\n292#1:584,6\n332#1:641,6\n335#1:648,6\n338#1:658,6\n288#1:590,6\n288#1:624\n288#1:633\n372#1:700,6\n372#1:734\n372#1:786\n440#1:792,7\n440#1:827\n440#1:832\n95#1:833\n219#1:834\n325#1:835\n332#1:836\n332#1:837,2\n335#1:839\n335#1:840,2\n*E\n"})
public final class oO000Oo {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54925OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54926OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f54927OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54928OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54929OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f54930OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, String str, Modifier modifier, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f54926OooO0Oo = i;
            this.f54928OooO0o0 = str;
            this.f54927OooO0o = modifier;
            this.f54929OooO0oO = function0;
            this.f54930OooO0oo = i2;
            this.f54925OooO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000Oo.OooO0O0(this.f54926OooO0Oo, this.f54928OooO0o0, this.f54927OooO0o, this.f54929OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54930OooO0oo | 1), this.f54925OooO);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt$ConveneMembersCalling$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,443:1\n63#2,5:444\n*S KotlinDebug\n*F\n+ 1 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt$ConveneMembersCalling$1$1\n*L\n366#1:444,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f54931OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54932OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Long> f54933OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MutableState<Long> mutableState, MutableState<String> mutableState2) {
            super(1);
            this.f54931OooO0Oo = j;
            this.f54933OooO0o0 = mutableState;
            this.f54932OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            StringBuilder sb = new StringBuilder("memberConveneState \nduration = ");
            long j = this.f54931OooO0Oo;
            sb.append(j);
            o0000O00.OooO0O0(sb.toString());
            oO000Oo0 oo000oo0 = new oO000Oo0(j, this.f54933OooO0o0, this.f54932OooO0o);
            if (j > 0) {
                oo000oo0.start();
            }
            return new oO0OOo0o(oo000oo0);
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMenuDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMenuDialogKt$ConveneMembersCalling$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f54934OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f54934OooO0Oo = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MixedRoomActivity mixedRoomActivity = this.f54934OooO0Oo;
            if (mixedRoomActivity != null) {
                o0O00oO0.OooO00o.OooO00o(mixedRoomActivity);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f54935OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54936OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f54937OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54938OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(float f, int i, int i2, long j) {
            super(2);
            this.f54935OooO0Oo = j;
            this.f54937OooO0o0 = f;
            this.f54936OooO0o = i;
            this.f54938OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000Oo.OooO00o(this.f54935OooO0Oo, this.f54937OooO0o0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54936OooO0o | 1), this.f54938OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54939OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Function0<Unit> function0) {
            super(0);
            this.f54939OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54939OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO(MixedRoomActivity mixedRoomActivity, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1986560761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986560761, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemSetting (LiveRoomMenuDialog.kt:243)");
        }
        boolean zOooO0oo = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooO0oo();
        o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0;
        OooO0O0(o0O0O00.icon_room_bottom_menu_setting, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Settings, composerStartRestartGroup, 0), o0000Ooo.OooO00o(Modifier.INSTANCE, zOooO0oo || (o000000Var.OooO0o() > 0) || ((Boolean) o000000Var.f48467OooOO0.getValue()).booleanValue() || ((Boolean) o000000Var.f48462OooO0Oo.getValue()).booleanValue(), 0L, Dp.m3775constructorimpl(3), false, false, Dp.m3775constructorimpl(26), Dp.m3775constructorimpl(-4), 0.0f, 826), new oOo000o0(mixedRoomActivity), composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0(i, mixedRoomActivity));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x020a  */
    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:78:0x022d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0287  */
    /* JADX WARN: Code duplicated, block: B:84:0x0293  */
    /* JADX WARN: Code duplicated, block: B:85:0x0297  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f3  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(long j, float f, Composer composer, int i, int i2) {
        long j2;
        int i3;
        float f2;
        long j3;
        float f3;
        Object objConsume;
        MixedRoomActivity mixedRoomActivity;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        boolean zChanged;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM1320constructorimpl3;
        Function2 function2OooO00o3;
        Composer composer2;
        float f4;
        long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1917829143);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j2 = j;
        } else if ((i & 14) == 0) {
            j2 = j;
            i3 = i | (composerStartRestartGroup.changed(j2) ? 4 : 2);
        } else {
            j2 = j;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    j3 = 0;
                } else {
                    j3 = j2;
                }
                if (i5 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1917829143, i3, -1, "com.yalla.yalla.ui.dialog.room.ConveneMembersCalling (LiveRoomMenuDialog.kt:320)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                if (objConsume instanceof MixedRoomActivity) {
                    mixedRoomActivity = (MixedRoomActivity) objConsume;
                } else {
                    mixedRoomActivity = null;
                }
                MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432, 8);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                Unit unit = Unit.INSTANCE;
                Long lValueOf = Long.valueOf(j3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(lValueOf) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new OooO00o(j3, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
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
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(98)), false, false, 0L, false, null, null, null, new OooO0O0(mixedRoomActivity2), 253);
                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion4.getConstructor();
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
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f5 = 8;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f5), null, composerStartRestartGroup, 6, 2);
                Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(28)), Dp.m3775constructorimpl(1));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                o0O0o.OooO00o((f3 - ((Number) mutableState2.getValue()).longValue()) / f3, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ColorKt.Color(4291611853L), Dp.m3775constructorimpl(2), composerStartRestartGroup, 3504, 0);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.room_bottom_menu_calling, composerStartRestartGroup, 0);
                Modifier modifierAlign = boxScopeInstance.align(RotateKt.rotate(companion2, stateAnimateFloat.getValue().floatValue()), companion3.getCenter());
                long j5 = j3;
                ImageKt.Image(painterPainterResource, (String) null, modifierAlign, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f5), null, composerStartRestartGroup, 6, 2);
                String strStringResource = StringResources_androidKt.stringResource(p562o0oOo000.o000000.room_member_convene_tick, composerStartRestartGroup, 0);
                long sp = TextUnitKt.getSp(12);
                long j6 = o0OOo000.f48148OooOOOo;
                float f6 = 12;
                Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(f6), 0.0f, 2, null);
                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(strStringResource, modifierM480paddingVpY3zN4$default, j6, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
                TextKt.m1261Text4IGK_g((String) mutableState.getValue(), PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(f6), 0.0f, 2, null), o0OOo000.f48350o00o0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion5.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
                if (OooOOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                f4 = f3;
                j4 = j5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j4 = j2;
                f4 = f2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(f4, i, i2, j4));
        }
        i3 |= 48;
        f2 = f;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                j3 = 0;
            } else {
                j3 = j2;
            }
            if (i5 != 0) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917829143, i3, -1, "com.yalla.yalla.ui.dialog.room.ConveneMembersCalling (LiveRoomMenuDialog.kt:320)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            if (objConsume instanceof MixedRoomActivity) {
                mixedRoomActivity = (MixedRoomActivity) objConsume;
            } else {
                mixedRoomActivity = null;
            }
            MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity;
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432, 8);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j3), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            Unit unit2 = Unit.INSTANCE;
            Long lValueOf2 = Long.valueOf(j3);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(lValueOf2) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new OooO00o(j3, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(j3, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion7 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o4 = Oooo000.OooO00o(companion7, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m3775constructorimpl(98)), false, false, 0L, false, null, null, null, new OooO0O0(mixedRoomActivity3), 253);
            Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl2, measurePolicyOooO00o5, composerM1320constructorimpl2, currentCompositionLocalMap5);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f7 = 8;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f7), null, composerStartRestartGroup, 6, 2);
            Modifier modifierM478padding3ABfNKs2 = PaddingKt.m478padding3ABfNKs(SizeKt.m525size3ABfNKs(companion6, Dp.m3775constructorimpl(28)), Dp.m3775constructorimpl(1));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o6 = Oooo000.OooO00o(companion7, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl3, measurePolicyOooO00o6, composerM1320constructorimpl3, currentCompositionLocalMap6);
            if (composerM1320constructorimpl3.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            o0O0o.OooO00o((f3 - ((Number) mutableState2.getValue()).longValue()) / f3, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ColorKt.Color(4291611853L), Dp.m3775constructorimpl(2), composerStartRestartGroup, 3504, 0);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0O0O00.room_bottom_menu_calling, composerStartRestartGroup, 0);
            Modifier modifierAlign2 = boxScopeInstance2.align(RotateKt.rotate(companion6, stateAnimateFloat2.getValue().floatValue()), companion7.getCenter());
            long j7 = j3;
            ImageKt.Image(painterPainterResource2, (String) null, modifierAlign2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f7), null, composerStartRestartGroup, 6, 2);
            String strStringResource2 = StringResources_androidKt.stringResource(p562o0oOo000.o000000.room_member_convene_tick, composerStartRestartGroup, 0);
            long sp2 = TextUnitKt.getSp(12);
            long j8 = o0OOo000.f48148OooOOOo;
            float f8 = 12;
            Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m3775constructorimpl(f8), 0.0f, 2, null);
            TextAlign.Companion companion9 = TextAlign.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource2, modifierM480paddingVpY3zN4$default2, j8, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion9.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
            TextKt.m1261Text4IGK_g((String) mutableState.getValue(), PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m3775constructorimpl(f8), 0.0f, 2, null), o0OOo000.f48350o00o0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion9.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            f4 = f3;
            j4 = j7;
        } else {
            if (i4 != 0) {
                j3 = 0;
            } else {
                j3 = j2;
            }
            if (i5 != 0) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917829143, i3, -1, "com.yalla.yalla.ui.dialog.room.ConveneMembersCalling (LiveRoomMenuDialog.kt:320)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            if (objConsume instanceof MixedRoomActivity) {
                mixedRoomActivity = (MixedRoomActivity) objConsume;
            } else {
                mixedRoomActivity = null;
            }
            MixedRoomActivity mixedRoomActivity4 = mixedRoomActivity;
            State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432, 8);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j3), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            Unit unit3 = Unit.INSTANCE;
            Long lValueOf3 = Long.valueOf(j3);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(lValueOf3) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new OooO00o(j3, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(j3, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
            Modifier.Companion companion10 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion11 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o7 = Oooo000.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
            constructor = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Modifier modifierOooO0O2 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m3775constructorimpl(98)), false, false, 0L, false, null, null, null, new OooO0O0(mixedRoomActivity4), 253);
            Alignment.Horizontal centerHorizontally3 = companion11.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o8 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl2, measurePolicyOooO00o8, composerM1320constructorimpl2, currentCompositionLocalMap8);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            float f9 = 8;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f9), null, composerStartRestartGroup, 6, 2);
            Modifier modifierM478padding3ABfNKs3 = PaddingKt.m478padding3ABfNKs(SizeKt.m525size3ABfNKs(companion10, Dp.m3775constructorimpl(28)), Dp.m3775constructorimpl(1));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o9 = Oooo000.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl3, measurePolicyOooO00o9, composerM1320constructorimpl3, currentCompositionLocalMap9);
            if (composerM1320constructorimpl3.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            o0O0o.OooO00o((f3 - ((Number) mutableState2.getValue()).longValue()) / f3, SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null), ColorKt.Color(4291611853L), Dp.m3775constructorimpl(2), composerStartRestartGroup, 3504, 0);
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(o0O0O00.room_bottom_menu_calling, composerStartRestartGroup, 0);
            Modifier modifierAlign3 = boxScopeInstance3.align(RotateKt.rotate(companion10, stateAnimateFloat3.getValue().floatValue()), companion11.getCenter());
            long j9 = j3;
            ImageKt.Image(painterPainterResource3, (String) null, modifierAlign3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f9), null, composerStartRestartGroup, 6, 2);
            String strStringResource3 = StringResources_androidKt.stringResource(p562o0oOo000.o000000.room_member_convene_tick, composerStartRestartGroup, 0);
            long sp3 = TextUnitKt.getSp(12);
            long j10 = o0OOo000.f48148OooOOOo;
            float f10 = 12;
            Modifier modifierM480paddingVpY3zN4$default3 = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m3775constructorimpl(f10), 0.0f, 2, null);
            TextAlign.Companion companion13 = TextAlign.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource3, modifierM480paddingVpY3zN4$default3, j10, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion13.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
            TextKt.m1261Text4IGK_g((String) mutableState.getValue(), PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m3775constructorimpl(f10), 0.0f, 2, null), o0OOo000.f48350o00o0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(companion13.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            f4 = f3;
            j4 = j9;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(f4, i, i2, j4));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0257  */
    /* JADX WARN: Code duplicated, block: B:92:0x0263  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(int i, String str, Modifier modifier, Function0<Unit> function0, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326988755);
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
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i5;
            }
            if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1326988755, i4, -1, "com.yalla.yalla.ui.dialog.room.MenuItem (LiveRoomMenuDialog.kt:285)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(98, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(modifierOooO0O0, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
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
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 8;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                Modifier modifier5 = modifier3;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion.then(modifier3), Dp.m3775constructorimpl(28)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                TextKt.m1261Text4IGK_g(str, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(12), 0.0f, 2, null), o0OOo000.f48148OooOOOo, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 3) & 14) | 3120, 0, 130544);
                if (OooOOO0.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i, str, modifier4, function0, i2, i3));
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i5 = 2048;
            } else {
                i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i4 |= i5;
        }
        if ((i4 & 5851) == 1170) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326988755, i4, -1, "com.yalla.yalla.ui.dialog.room.MenuItem (LiveRoomMenuDialog.kt:285)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierOooO0O2 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(98, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), composerStartRestartGroup, 1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O3 = com.code.android.util.o0O0O00.OooO0O0(modifierOooO0O2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl2, measurePolicyOooO00o4, composerM1320constructorimpl2, currentCompositionLocalMap4);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f2 = 8;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            Modifier modifier6 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion4.then(modifier3), Dp.m3775constructorimpl(28)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            TextKt.m1261Text4IGK_g(str, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m3775constructorimpl(12), 0.0f, 2, null), o0OOo000.f48148OooOOOo, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 3) & 14) | 3120, 0, 130544);
            if (OooOOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326988755, i4, -1, "com.yalla.yalla.ui.dialog.room.MenuItem (LiveRoomMenuDialog.kt:285)");
            }
            Modifier.Companion companion7 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion8 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o5 = Oooo000.OooO00o(companion8, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO00o5, composerM1320constructorimpl, currentCompositionLocalMap5);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Modifier modifierOooO0O4 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(98, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), composerStartRestartGroup, 1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O5 = com.code.android.util.o0O0O00.OooO0O0(modifierOooO0O4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Alignment.Horizontal centerHorizontally3 = companion8.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO0O5);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl2, measurePolicyOooO00o6, composerM1320constructorimpl2, currentCompositionLocalMap6);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            float f3 = 8;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
            Modifier modifier7 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), (String) null, SizeKt.m525size3ABfNKs(companion7.then(modifier3), Dp.m3775constructorimpl(28)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
            TextKt.m1261Text4IGK_g(str, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), Dp.m3775constructorimpl(12), 0.0f, 2, null), o0OOo000.f48148OooOOOo, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 3) & 14) | 3120, 0, 130544);
            if (OooOOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i, str, modifier4, function0, i2, i3));
    }

    public static final void OooO0OO(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1256971645);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1256971645, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMenuContent (LiveRoomMenuDialog.kt:76)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomMemberVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new oO000o00((RoomMemberVM) viewModel, null), composerStartRestartGroup, 70);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 24;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null)), ColorKt.Color(4279900444L), null, 2, null), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(4), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, null, null, null, false, new oO00OO0O(mixedRoomActivity, LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8)), composerStartRestartGroup, 48, 508);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00OOO(i));
    }

    public static final void OooO0Oo(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2050613225);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2050613225, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemApplyMic (LiveRoomMenuDialog.kt:124)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OooO0O0(o0O0O00.icon_room_bottom_menu_microphone_application, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Microphone_Application, composerStartRestartGroup, 0), null, oO00o000.f54955OooO0Oo, composerStartRestartGroup, 3072, 4);
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            String str = o0000ooVar.OooOO0() ? "ON" : "OFF";
            long sp = TextUnitKt.getSp(9);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(50), Dp.m3775constructorimpl(0), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(23)), Dp.m3775constructorimpl(11)), companion2.getTopCenter()), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(o0000ooVar.OooOO0() ? 4282827600L : 2583691263L), null, 2, null), o0000ooVar.OooOO0() ? o0OOo000.f48135OooO0O0 : ColorKt.Color(4281545523L), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 0, 65008);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00o00(i));
    }

    public static final void OooO0o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-708893565);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-708893565, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemMusic (LiveRoomMenuDialog.kt:276)");
            }
            OooO0O0(o0O0O00.icon_room_bottom_menu_music, StringResources_androidKt.stringResource(p562o0oOo000.o000000.room_alert_music, composerStartRestartGroup, 0), null, oO00o0.f54953OooO0Oo, composerStartRestartGroup, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo00o0o(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0o0(MixedRoomActivity mixedRoomActivity, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1746978523);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1746978523, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemMemberConvene (LiveRoomMenuDialog.kt:217)");
        }
        o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24518OooO0oo;
        GetConveneMemberStateModel getConveneMemberStateModel = (GetConveneMemberStateModel) LiveDataAdapterKt.observeAsState(o00000oo2.f48486OooO0O0, composerStartRestartGroup, 8).getValue();
        if (getConveneMemberStateModel != null) {
            long endTime = getConveneMemberStateModel.getEndTime();
            int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(endTime).length();
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    endTime *= (long) 10;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            long jCurrentTimeMillis = endTime - System.currentTimeMillis();
            if (getConveneMemberStateModel.getState() != 1 || jCurrentTimeMillis <= 0) {
                composerStartRestartGroup.startReplaceableGroup(179291341);
                OooO0O0(o0O0O00.icon_room_bottom_menu_convene_members, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Gather_Members, composerStartRestartGroup, 0), o0000Ooo.OooO00o(Modifier.INSTANCE, ((Boolean) o00000oo2.f48485OooO00o.getValue()).booleanValue(), 0L, Dp.m3775constructorimpl(3), false, false, Dp.m3775constructorimpl(26), Dp.m3775constructorimpl(-4), 0.0f, 826), new oO0OOO00(mixedRoomActivity), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(179291210);
                OooO00o(jCurrentTimeMillis, 60000 * o0OoOo0.OooO0Oo(Integer.valueOf(getConveneMemberStateModel.getConveneTimeLong())), composerStartRestartGroup, 0, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00o00O(i, mixedRoomActivity));
    }

    public static final void OooO0oO(MixedRoomActivity mixedRoomActivity, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1514193653);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1514193653, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemPicture (LiveRoomMenuDialog.kt:265)");
        }
        OooO0O0(o0O0O00.icon_room_bottom_menu_picture, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Photo, composerStartRestartGroup, 0), null, new oOo00ooO(mixedRoomActivity), composerStartRestartGroup, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OO00o(i, mixedRoomActivity));
    }

    public static final void OooO0oo(MixedRoomActivity mixedRoomActivity, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1313900195);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1313900195, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemRoomLock (LiveRoomMenuDialog.kt:195)");
        }
        OooO0O0(o0O0O00.icon_room_bottom_menu_lock, StringResources_androidKt.stringResource(p562o0oOo000.o000000.lock, composerStartRestartGroup, 0), null, new oOo000Oo(mixedRoomActivity), composerStartRestartGroup, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo0000O(i, mixedRoomActivity));
    }

    public static final void OooOO0(MixedRoomActivity mixedRoomActivity, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(948171040);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(948171040, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemTheme (LiveRoomMenuDialog.kt:208)");
        }
        OooO0O0(o0O0O00.icon_room_bottom_menu_theme, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Room_themes, composerStartRestartGroup, 0), null, new oO0O000(mixedRoomActivity), composerStartRestartGroup, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0O000o(i, mixedRoomActivity));
    }

    public static final void OooOO0O(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1485094138);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485094138, i, -1, "com.yalla.yalla.ui.dialog.room.MenuItemUpgrade (LiveRoomMenuDialog.kt:184)");
            }
            OooO0O0(o0O0O00.icon_room_bottom_menu_upgrade, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Upgrade, composerStartRestartGroup, 0), null, oO0O00.f54959OooO0Oo, composerStartRestartGroup, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0O00O(i));
    }
}
