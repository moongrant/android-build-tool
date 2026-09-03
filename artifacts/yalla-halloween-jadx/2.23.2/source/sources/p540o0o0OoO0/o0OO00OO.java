package p540o0o0OoO0;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import p194o00o0OO.o00O0OO0;
import p202o00o0o.o00Oo0;
import p207o00o0oO0.o000O0Oo;
import p414o0Oo0oO.oO00OO0O;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00oOoo;
import p448o0OoOoo.o00O0OOO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o0000Ooo;
import p523o0o0O0oo.oO0OoOO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0Oo0oo;
import p581o0oOoo.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,487:1\n81#2,11:488\n81#2,11:499\n81#2,11:854\n81#2,11:877\n154#3:510\n154#3:511\n154#3:512\n154#3:513\n154#3:549\n154#3:585\n154#3:603\n154#3:604\n154#3:605\n154#3:641\n154#3:642\n154#3:678\n154#3:679\n154#3:680\n154#3:681\n154#3:716\n154#3:717\n154#3:718\n154#3:754\n154#3:755\n154#3:772\n154#3:773\n154#3:779\n154#3:780\n154#3:816\n154#3:817\n154#3:818\n154#3:871\n66#4,6:514\n72#4:548\n76#4:602\n66#4,6:606\n72#4:640\n76#4:778\n78#5,11:520\n78#5,11:556\n91#5:596\n91#5:601\n78#5,11:612\n78#5,11:649\n78#5,11:687\n78#5,11:725\n91#5:759\n91#5:764\n91#5:769\n91#5:777\n78#5,11:787\n78#5,11:825\n91#5:869\n91#5:875\n456#6,8:531\n464#6,3:545\n456#6,8:567\n464#6,3:581\n467#6,3:593\n467#6,3:598\n456#6,8:623\n464#6,3:637\n456#6,8:660\n464#6,3:674\n456#6,8:698\n464#6,3:712\n456#6,8:736\n464#6,3:750\n467#6,3:756\n467#6,3:761\n467#6,3:766\n467#6,3:774\n456#6,8:798\n464#6,3:812\n456#6,8:836\n464#6,3:850\n467#6,3:866\n467#6,3:872\n25#6:888\n4144#7,6:539\n4144#7,6:575\n4144#7,6:631\n4144#7,6:668\n4144#7,6:706\n4144#7,6:744\n4144#7,6:806\n4144#7,6:844\n72#8,6:550\n78#8:584\n82#8:597\n73#8,5:682\n78#8:715\n82#8:765\n72#8,6:819\n78#8:853\n82#8:870\n1098#9:586\n927#9,6:587\n1098#9:865\n73#10,6:643\n79#10:677\n73#10,6:719\n79#10:753\n83#10:760\n83#10:770\n73#10,6:781\n79#10:815\n83#10:876\n76#11:771\n1097#12,6:889\n81#13:895\n81#13:896\n81#13:897\n107#13,2:898\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog\n*L\n140#1:488,11\n164#1:499,11\n381#1:854,11\n435#1:877,11\n187#1:510\n188#1:511\n229#1:512\n230#1:513\n233#1:549\n240#1:585\n262#1:603\n263#1:604\n264#1:605\n276#1:641\n278#1:642\n287#1:678\n288#1:679\n289#1:680\n291#1:681\n299#1:716\n300#1:717\n305#1:718\n321#1:754\n327#1:755\n340#1:772\n341#1:773\n361#1:779\n362#1:780\n367#1:816\n369#1:817\n373#1:818\n422#1:871\n227#1:514,6\n227#1:548\n227#1:602\n259#1:606,6\n259#1:640\n259#1:778\n227#1:520,11\n233#1:556,11\n233#1:596\n227#1:601\n259#1:612,11\n274#1:649,11\n292#1:687,11\n306#1:725,11\n306#1:759\n292#1:764\n274#1:769\n259#1:777\n358#1:787,11\n370#1:825,11\n370#1:869\n358#1:875\n227#1:531,8\n227#1:545,3\n233#1:567,8\n233#1:581,3\n233#1:593,3\n227#1:598,3\n259#1:623,8\n259#1:637,3\n274#1:660,8\n274#1:674,3\n292#1:698,8\n292#1:712,3\n306#1:736,8\n306#1:750,3\n306#1:756,3\n292#1:761,3\n274#1:766,3\n259#1:774,3\n358#1:798,8\n358#1:812,3\n370#1:836,8\n370#1:850,3\n370#1:866,3\n358#1:872,3\n436#1:888\n227#1:539,6\n233#1:575,6\n259#1:631,6\n274#1:668,6\n292#1:706,6\n306#1:744,6\n358#1:806,6\n370#1:844,6\n233#1:550,6\n233#1:584\n233#1:597\n292#1:682,5\n292#1:715\n292#1:765\n370#1:819,6\n370#1:853\n370#1:870\n242#1:586\n244#1:587,6\n383#1:865\n274#1:643,6\n274#1:677\n306#1:719,6\n306#1:753\n306#1:760\n274#1:770\n358#1:781,6\n358#1:815\n358#1:876\n333#1:771\n436#1:889,6\n281#1:895\n293#1:896\n436#1:897\n436#1:898,2\n*E\n"})
public final class o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f54822OooO00o = new o0OO00OO();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54824OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f54824OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54824OooO0o0 | 1);
            o0OO00OO.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$InviteConfirmDialog$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,487:1\n154#2:488\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$InviteConfirmDialog$1\n*L\n148#1:488\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f54825OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000oo o0000ooVar) {
            super(3);
            this.f54825OooO0Oo = o0000ooVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1204430016, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.InviteConfirmDialog.<anonymous> (LiveRoomMemberTaskHostDialog.kt:144)");
                }
                o00Oo0.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(25), 0.0f, 2, null), StringResources_androidKt.stringResource(o000000.Dont_remind_me_again, composer2, 0), this.f54825OooO0Oo.f56613OooO0Oo, composer2, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f54826OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000oo o0000ooVar) {
            super(0);
            this.f54826OooO0Oo = o0000ooVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO00OO0O oo00oo0o = (oO00OO0O) o00Ooo.f46421OooOOOo.getValue();
            boolean zBooleanValue = this.f54826OooO0Oo.f56613OooO0Oo.getValue().booleanValue();
            oo00oo0o.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            oo00oo0o.OooO0o("inviteMemberReminder" + o0O00oO0.OooOOo0().getValue(), zBooleanValue);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1000900, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54827OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54829OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f54829OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54829OooO0o0 | 1);
            o0OO00OO.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$TaskItem$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,487:1\n154#2:488\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberTaskHostDialog$TaskItem$1$1$2\n*L\n404#1:488\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<String, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f54830OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0000oo o0000ooVar) {
            super(3);
            this.f54830OooO0Oo = o0000ooVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, Composer composer, Integer num) {
            String it = str;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1257975601, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TaskItem.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskHostDialog.kt:398)");
                }
                IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_doubt, composer2, 0), (String) null, o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(14)), new o0OO00o0(this.f54830OooO0Oo)), false, false, 0L, false, null, null, null, o0OO0.f54817OooO0Oo, 253), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38627OooOO0o, composer2, 56, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54832OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomMemberTaskHostInfoModel f54833OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel, int i) {
            super(2);
            this.f54833OooO0o0 = roomMemberTaskHostInfoModel;
            this.f54832OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54832OooO0o | 1);
            o0OO00OO.this.OooO0OO(this.f54833OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0Oo(o0OO00OO o0oo00oo2, BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composer2;
        o0oo00oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(2122860180);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122860180, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.InviteButton (LiveRoomMemberTaskHostDialog.kt:160)");
            }
            o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
            int iIntValue = ((Number) o0000ooo.f48532OooOOOO.getValue()).intValue();
            if (iIntValue >= 0) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(o0000oo.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                o0000oo o0000ooVar = (o0000oo) viewModel;
                long jLongValue = ((Number) o0000ooo.f48533OooOOOo.getValue()).longValue();
                composer2 = composerStartRestartGroup;
                o00O0OO0.OooO0O0(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -327143454, true, new o0OO000o(jLongValue, iIntValue)), null, null, Color.m1671boximpl((jLongValue > 0 || iIntValue == 0) ? o0OOo000.f48190Oooooo : o0OOo000.f48185Ooooo00), null, 0.0f, null, false, false, 0L, false, null, null, null, null, boxScope.align(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(12), 7, null), Dp.m3775constructorimpl(240), Dp.m3775constructorimpl(43)), Alignment.INSTANCE.getBottomCenter()), new oo0oO0(jLongValue, iIntValue, o0000ooVar), composer2, 6, 0, 32758);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0ooO(o0oo00oo2, boxScope, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0o(o0OO00OO o0oo00oo2, o0000oo o0000ooVar, Composer composer, int i) {
        o0oo00oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(850008437);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(850008437, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TodayIntimacyAndRanking (LiveRoomMemberTaskHostDialog.kt:225)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m513heightInVpY3zN4$default(companion, Dp.m3775constructorimpl(48), 0.0f, 2, null), Dp.m3775constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(105), 0.0f, 11, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Todays_Task_Progress, composerStartRestartGroup, 0), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.startReplaceableGroup(485203418);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(o000000.Intimacy_points, composerStartRestartGroup, 0));
        int iPushStyle = builder.pushStyle(new SpanStyle(o0OOo000.f48265o000o00O, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(" +" + o00oOoo.OooO0O0(((Number) o0000ooVar.f56610OooO00o.getValue()).longValue()));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1262TextIbK3jfQ(annotatedString, null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 3072, 0, 262130);
            o0ooOOo.OooO00o(composerStartRestartGroup);
            oO0OoOO0.f53184OooO00o.OooO0O0(((Number) o0000ooVar.f56611OooO0O0.getValue()).intValue(), 384, composerStartRestartGroup, boxScopeInstance.align(companion, companion2.getCenterEnd()));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OO0oO0(o0oo00oo2, o0000ooVar, i));
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0o0(o0OO00OO o0oo00oo2, Composer composer, int i) {
        o0oo00oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1339175175);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1339175175, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TipPopup (LiveRoomMemberTaskHostDialog.kt:432)");
            }
            if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48531OooOOO0.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(o0000oo.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                o0000oo o0000ooVar = (o0000oo) viewModel;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3927boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                int iMax = Math.max(Math.min(com.code.android.util.o000000.OooO0Oo(Float.valueOf(Offset.m1447getXimpl(o0000ooVar.f56615OooO0o0))) - (IntSize.m3935getWidthimpl(((IntSize) mutableState.getValue()).getPackedValue()) / 2), o0000O00.OooO0OO() - IntSize.m3935getWidthimpl(((IntSize) mutableState.getValue()).getPackedValue())), 0);
                AndroidPopup_androidKt.m4014PopupK5zGePQ(null, IntOffsetKt.IntOffset(iMax, (com.code.android.util.o000000.OooO0Oo(Float.valueOf(Offset.m1448getYimpl(o0000ooVar.f56615OooO0o0))) - IntSize.m3934getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue())) - o0000O0.OooO00o(8)), o0OO0O0.f54835OooO0Oo, new PopupProperties(true, true, true, null, false, false, 56, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -286984865, true, new o0OO0o00(mutableState, o0000ooVar, iMax)), composerStartRestartGroup, 28032, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO0o(o0oo00oo2, i));
    }

    public static final void OooO0oO(o0OO00OO o0oo00oo2, Composer composer, int i) {
        Composer composer2;
        o0oo00oo2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1080951158);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1080951158, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TopRoomInfo (LiveRoomMemberTaskHostDialog.kt:257)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierClip = ClipKt.clip(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(90)), Dp.m3775constructorimpl(f), 0.0f, 2, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
            Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_room_member_host_task_bg, composerStartRestartGroup, 0);
            ContentScale.Companion companion4 = ContentScale.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(boxScopeInstance.matchParentSize(companion), composerStartRestartGroup, 0), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            float f2 = 60;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(boxScopeInstance.align(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, 2, null), companion2.getCenterStart()), Dp.m3775constructorimpl(f2));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            float f3 = 2;
            float f4 = 12;
            ImageKt.Image(o000OO.OooO0O0((String) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24536OooO00o, composerStartRestartGroup, 8).getValue(), null, composerStartRestartGroup, 0, 1), (String) null, o00O0O0.OooO00o(f4, SizeKt.m525size3ABfNKs(BorderKt.m182borderxT4_qwU(companion, Dp.m3775constructorimpl(f3), o0OOo000.f48135OooO0O0, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f4))), Dp.m3775constructorimpl(f2))), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f4), null, composerStartRestartGroup, 6, 2);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = o00O0OOO.OooO00o(companion2, center, composerStartRestartGroup, 6, -1323940314);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            p197o00o0OOo.o00O0O0.OooO00o(o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.rooms_Member_Group, composerStartRestartGroup, 0), (String) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24537OooO0O0, "", composerStartRestartGroup, 56).getValue()), p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(0), 0.0f, Dp.m3775constructorimpl(24), 0.0f, 10, null), true, composerStartRestartGroup, 28032, 0);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, o0OO.f54816OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O1, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Members, composerStartRestartGroup, 0) + ZegoConstants.ZegoVideoDataAuxPublishingStream + Math.max(com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0o0() - 1, 0), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composer2 = composerStartRestartGroup;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f3), null, composer2, 6, 2);
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_arrow, composer2, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer2, 6), p193o00o0O0O.o0000oo.OooO0OO(composer2).f38627OooOO0o, composer2, 56, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_doubt, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(boxScopeInstance.align(companion, companion2.getTopEnd()), Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, new o0OOO0((LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())), 253), o0OOo000.f48241o000O0oO, composer2, 56, 0);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0OO(o0oo00oo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(460668565);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(460668565, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.InviteConfirmDialog (LiveRoomMemberTaskHostDialog.kt:138)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0000oo.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0000oo o0000ooVar = (o0000oo) viewModel;
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(o0000ooVar.f56612OooO0OO, null, StringResources_androidKt.stringResource(o000000.invite_member_task_title, composerStartRestartGroup, 0), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1204430016, true, new OooO00o(o0000ooVar)), false, false, null, null, StringResources_androidKt.stringResource(o000000.Invite, composerStartRestartGroup, 0), false, null, false, new OooO0O0(o0000ooVar), null, false, false, null, OooO0OO.f54827OooO0Oo, null, null, composer2, 3072, 12582912, 913138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(488333457);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488333457, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.OnDialog (LiveRoomMemberTaskHostDialog.kt:80)");
            }
            OooO00o(composerStartRestartGroup, i2 & 14);
            p207o00o0oO0.o0000O0.OooO00o(com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48527OooOO0, false, false, null, null, 80, o000000O.WindowAnimBottomWithAlpha, 0.0f, o0oOOo.f54892OooO0O0, composerStartRestartGroup, 100859904, 158);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull RoomMemberTaskHostInfoModel model, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(517807381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517807381, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.TaskItem (LiveRoomMemberTaskHostDialog.kt:356)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(16), 0.0f, 2, null), Dp.m3775constructorimpl(72), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM513heightInVpY3zN4$default);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(model.getTaskIcon(), composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(48)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        float f = 12;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, Dp.m3775constructorimpl(f), 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
        if (model.getTaskId() != 4) {
            composerStartRestartGroup.startReplaceableGroup(1553643775);
            i2 = 6;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(model.getTaskName(), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 0, 65522);
            composer2.endReplaceableGroup();
        } else {
            i2 = 6;
            composerStartRestartGroup.startReplaceableGroup(1553644016);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0000oo.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0000oo o0000ooVar = (o0000oo) viewModel;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(model.getTaskName());
            builder.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            InlineTextContentKt.appendInlineContent$default(builder, "icv_doubt", null, 2, null);
            composer2 = composerStartRestartGroup;
            TextKt.m1262TextIbK3jfQ(builder.toAnnotatedString(), null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, MapsKt.mapOf(TuplesKt.to("icv_doubt", new InlineTextContent(new Placeholder(TextUnitKt.getSp(14), TextUnitKt.getSp(14), PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1257975601, true, new OooOO0(o0000ooVar))))), null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 0, 98290);
            composer2.endReplaceableGroup();
        }
        o0ooOOo.OooO00o(composer2);
        Composer composer3 = composer2;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(26), null, composer3, i2, 2);
        String strOooO0o0 = o0O0O0Oo.OooO0o0(model.getCompletedNum());
        long sp = TextUnitKt.getSp(15);
        FontWeight medium = FontWeight.INSTANCE.getMedium();
        long j = o0OOo000.f48185Ooooo00;
        Intrinsics.checkNotNull(strOooO0o0);
        TextKt.m1261Text4IGK_g(strOooO0o0, (Modifier) null, j, sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131026);
        if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(model, i));
    }
}
