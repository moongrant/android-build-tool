package p499o0o00o;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0OoO.o00OO00O;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.t;
import p423o0OoO0OO.o00O0000;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;
import p650o0ooo.h4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,221:1\n76#2:222\n25#3:223\n25#3:230\n25#3:237\n50#3:244\n49#3:245\n36#3:252\n1097#4,6:224\n1097#4,6:231\n1097#4,6:238\n1097#4,6:246\n1097#4,6:253\n154#5:259\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager\n*L\n62#1:222\n64#1:223\n66#1:230\n68#1:237\n75#1:244\n75#1:245\n89#1:252\n64#1:224,6\n66#1:231,6\n68#1:238,6\n75#1:246,6\n89#1:253,6\n99#1:259\n*E\n"})
public final class oO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO000 f50000OooO00o = new oO000();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50002OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f50002OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50002OooO0o0 | 1);
            oO000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxOpenDialog> f50003OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f50004OooO0o0;

        public OooO00o(MutableState<TreasureBoxOpenDialog> mutableState, MutableState<TreasureBoxDialog> mutableState2) {
            this.f50003OooO0Oo = mutableState;
            this.f50004OooO0o0 = mutableState2;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24566Oooo.postValue(null);
            MutableState<TreasureBoxOpenDialog> mutableState = this.f50003OooO0Oo;
            TreasureBoxOpenDialog value = mutableState.getValue();
            if (value != null && value.OooO0OO()) {
                value.OooO0O0();
            }
            mutableState.setValue(null);
            MutableState<TreasureBoxDialog> mutableState2 = this.f50004OooO0o0;
            TreasureBoxDialog value2 = mutableState2.getValue();
            if (value2 != null && value2.OooO0OO()) {
                value2.OooO0O0();
            }
            mutableState2.setValue(null);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,221:1\n63#2,5:222\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$3$1\n*L\n90#1:222,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f50005OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<TreasureBoxDialog> mutableState) {
            super(1);
            this.f50005OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oO000O0(this.f50005OooO0Oo);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f50006OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,221:1\n72#2,6:222\n78#2:256\n82#2:265\n78#3,11:228\n91#3:264\n456#4,8:239\n464#4,3:253\n467#4,3:261\n4144#5,6:247\n154#6:257\n154#6:258\n154#6:259\n154#6:260\n81#7:266\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$5\n*L\n135#1:222,6\n135#1:256\n135#1:265\n135#1:228,11\n135#1:264\n135#1:239,8\n135#1:253,3\n135#1:261,3\n135#1:247,6\n150#1:257\n155#1:258\n160#1:259\n171#1:260\n163#1:266\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TreasureBoxProgressModel f50007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f50009OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TreasureBoxProgressModel treasureBoxProgressModel, MutableState<TreasureBoxDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f50007OooO0Oo = treasureBoxProgressModel;
            this.f50009OooO0o0 = mutableState;
            this.f50008OooO0o = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            Integer numValueOf;
            String str;
            boolean z;
            boolean z2;
            Integer num2;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(350354335, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTreasureBoxManager.Content.<anonymous> (RoomTreasureBoxManager.kt:102)");
            }
            TreasureBoxProgressModel treasureBoxProgressModel = this.f50007OooO0Oo;
            int boxLevel = treasureBoxProgressModel.getBoxLevel();
            if (boxLevel != 1) {
                if (boxLevel != 5) {
                    if (boxLevel != 10) {
                        z2 = true;
                        str = null;
                        num2 = null;
                    } else {
                        if (treasureBoxProgressModel.getPercent() == 100) {
                            numValueOf = Integer.valueOf(o0Oo0oo.ic_room_treasure_box_side_3_open);
                            z = false;
                        } else if (treasureBoxProgressModel.getPercent() >= 90) {
                            str = "svga/anim_room_treasure_box_side_3.svga";
                            z2 = true;
                            num2 = null;
                        } else {
                            numValueOf = Integer.valueOf(o0Oo0oo.ic_room_treasure_box_side_3);
                            z = true;
                        }
                        z2 = z;
                        num2 = numValueOf;
                        str = null;
                    }
                } else if (treasureBoxProgressModel.getPercent() >= 90) {
                    str = "svga/anim_room_treasure_box_side_2.svga";
                    z2 = true;
                    num2 = null;
                } else {
                    numValueOf = Integer.valueOf(o0Oo0oo.ic_room_treasure_box_side_2);
                    z = true;
                    z2 = z;
                    num2 = numValueOf;
                    str = null;
                }
            } else if (treasureBoxProgressModel.getPercent() >= 90) {
                str = "svga/anim_room_treasure_box_side_1.svga";
                z2 = true;
                num2 = null;
            } else {
                numValueOf = Integer.valueOf(o0Oo0oo.ic_room_treasure_box_side_1);
                z = true;
                z2 = z;
                num2 = numValueOf;
                str = null;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new oO0Ooooo(this.f50009OooO0o0, this.f50008OooO0o), 253);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (!TextUtils.isEmpty(str)) {
                composer2.startReplaceableGroup(631016);
                Intrinsics.checkNotNull(str);
                o00OO00O.OooO00o(str, true, 0, null, null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(40)), composer2, 196656, 28);
                composer2.endReplaceableGroup();
            } else if (num2 != null) {
                composer2.startReplaceableGroup(631259);
                ImageKt.Image(PainterResources_androidKt.painterResource(num2.intValue(), composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(631478);
                composer2.endReplaceableGroup();
            }
            composer2.startReplaceableGroup(925175207);
            if (z2) {
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(2), null, composer2, 6, 2);
                ProgressIndicatorKt.m1158LinearProgressIndicator_5eSRE(AnimateAsStateKt.animateFloatAsState(treasureBoxProgressModel.getPercent() / 100.0f, AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, composer2, 0, 28).getValue().floatValue(), ClipKt.clip(AnimationModifierKt.animateContentSize$default(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(8), 0.0f, 2, null), null, null, 3, null), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4293624878L), o0OOo000.f48138OooO0o, 0, composer2, 384, 16);
            }
            if (OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50011OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f50011OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50011OooO0o0 | 1);
            oO000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50013OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f50013OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50013OooO0o0 | 1);
            oO000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxOpenDialog> f50014OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50015OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> f50016OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<TreasureBoxOpenDialog> mutableState, SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> snapshotStateList, MixedRoomActivity mixedRoomActivity) {
            super(1);
            this.f50014OooO0Oo = mutableState;
            this.f50016OooO0o0 = snapshotStateList;
            this.f50015OooO0o = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<TreasureBoxOpenDialog> mutableState = this.f50014OooO0Oo;
            mutableState.setValue(null);
            SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> snapshotStateList = this.f50016OooO0o0;
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = (RoomTreasureBox.TreasureBoxDrawNotify) CollectionsKt.getOrNull(snapshotStateList, 0);
            if (treasureBoxDrawNotify != null) {
                snapshotStateList.remove(0);
                oO000.OooO0O0(treasureBoxDrawNotify, snapshotStateList, mutableState, this.f50015OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(RoomTreasureBox.TreasureBoxDrawNotify notify, SnapshotStateList snapshotStateList, MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        String strOooO0OO;
        StringBuilder sb;
        String string;
        mutableState.setValue(new TreasureBoxOpenDialog(mixedRoomActivity));
        TreasureBoxOpenDialog treasureBoxOpenDialog = (TreasureBoxOpenDialog) mutableState.getValue();
        if (treasureBoxOpenDialog != null) {
            treasureBoxOpenDialog.OooO00o(new OooOOO0(mutableState, snapshotStateList, mixedRoomActivity));
        }
        TreasureBoxOpenDialog treasureBoxOpenDialog2 = (TreasureBoxOpenDialog) mutableState.getValue();
        if (treasureBoxOpenDialog2 != null) {
            Intrinsics.checkNotNullParameter(notify, "notify");
            treasureBoxOpenDialog2.f27512OooOOO0 = notify;
            t tVar = treasureBoxOpenDialog2.f27510OooOO0o;
            LinearLayoutCompat vCountdown = tVar.f45540OooOOO;
            Intrinsics.checkNotNullExpressionValue(vCountdown, "vCountdown");
            o000O.OooOOOO(vCountdown);
            LinearLayoutCompat vAward = tVar.f45541OooOOO0;
            Intrinsics.checkNotNullExpressionValue(vAward, "vAward");
            o000O.OooO0O0(vAward);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(treasureBoxOpenDialog2.f58507OooO0Oo);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = treasureBoxOpenDialog2.f27512OooOOO0;
            Object obj = null;
            if (treasureBoxDrawNotify == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify = null;
            }
            String headUrl = treasureBoxDrawNotify.getRoomboxTop().getHeadUrl();
            int iOooO00o = o0000O0.OooO00o(60);
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, headUrl);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.color_FFFCCB80));
            oooO00o.OooO0Oo(tVar.f45534OooO0o0);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify2 = treasureBoxOpenDialog2.f27512OooOOO0;
            if (treasureBoxDrawNotify2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify2 = null;
            }
            tVar.f45528OooO.setText(treasureBoxDrawNotify2.getRoomboxTop().getNickName());
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify3 = treasureBoxOpenDialog2.f27512OooOOO0;
            if (treasureBoxDrawNotify3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify3 = null;
            }
            int roomboxLevel = treasureBoxDrawNotify3.getRoomboxLevel();
            SVGAView sVGAView = tVar.f45533OooO0o;
            FragmentActivity fragmentActivity = treasureBoxOpenDialog2.f27509OooOO0O;
            if (roomboxLevel == 1) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_1.svga", fragmentActivity);
            } else if (roomboxLevel == 5) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_2.svga", fragmentActivity);
            } else if (roomboxLevel == 10) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_3.svga", fragmentActivity);
            }
            sVGAView.setLoops(1);
            sVGAView.OooOO0o();
            sVGAView.f13231OooOoo0 = new h4(treasureBoxOpenDialog2);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify4 = treasureBoxOpenDialog2.f27512OooOOO0;
            if (treasureBoxDrawNotify4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify4 = null;
            }
            int roomboxLevel2 = treasureBoxDrawNotify4.getRoomboxLevel();
            if (roomboxLevel2 == 1) {
                strOooO0OO = o0000.OooO0OO(o000000.Treasure_Chest_Opened_1);
            } else if (roomboxLevel2 != 5) {
                strOooO0OO = roomboxLevel2 != 10 ? o0000.OooO0OO(o000000.Treasure_Chest_Opened_1) : o0000.OooO0OO(o000000.Treasure_Chest_Opened_3);
            } else {
                strOooO0OO = o0000.OooO0OO(o000000.Treasure_Chest_Opened_2);
            }
            tVar.f45539OooOO0o.setText(strOooO0OO);
            List<RoomTreasureBox.TreasureBoxDrawAwardUserModel> awardUsersList = notify.getAwardUsersList();
            Intrinsics.checkNotNullExpressionValue(awardUsersList, "getAwardUsersList(...)");
            for (Object obj2 : awardUsersList) {
                long userId = ((RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj2).getUserId();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && userId == l.longValue()) {
                    obj = obj2;
                    break;
                }
            }
            RoomTreasureBox.TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = (RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj;
            TextView textView = tVar.f45538OooOO0O;
            ImageView ivAwardBg = tVar.f45530OooO0O0;
            ImageView ivAwardNotWin = tVar.f45531OooO0OO;
            TextView tvAward = tVar.f45536OooO0oo;
            SVGAView svgaViewAward = tVar.f45535OooO0oO;
            if (treasureBoxDrawAwardUserModel != null) {
                Intrinsics.checkNotNullExpressionValue(ivAwardBg, "ivAwardBg");
                o000O.OooOOOO(ivAwardBg);
                Intrinsics.checkNotNullExpressionValue(tvAward, "tvAward");
                o000O.OooOOOO(tvAward);
                Intrinsics.checkNotNullExpressionValue(ivAwardNotWin, "ivAwardNotWin");
                o000O.OooO0OO(ivAwardNotWin);
                Intrinsics.checkNotNullExpressionValue(svgaViewAward, "svgaViewAward");
                o000O.OooOOOO(svgaViewAward);
                String dynamicUrl = treasureBoxDrawAwardUserModel.getDynamicUrl();
                if (dynamicUrl.length() == 0) {
                    dynamicUrl = treasureBoxDrawAwardUserModel.getAwardImage();
                }
                Intrinsics.checkNotNull(dynamicUrl);
                svgaViewAward.OooOO0O(dynamicUrl, fragmentActivity);
                svgaViewAward.OooOO0o();
                if (treasureBoxDrawAwardUserModel.getAwardType() == 1) {
                    string = treasureBoxDrawAwardUserModel.getNums() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(o000000.days);
                } else {
                    if (OooOo00.OooO0o0()) {
                        int nums = treasureBoxDrawAwardUserModel.getNums();
                        sb = new StringBuilder();
                        sb.append(nums);
                        sb.append("x");
                    } else {
                        int nums2 = treasureBoxDrawAwardUserModel.getNums();
                        sb = new StringBuilder("x");
                        sb.append(nums2);
                    }
                    string = sb.toString();
                }
                tvAward.setText(string);
                textView.setText(o000000.Treasure_box_win);
            } else {
                Intrinsics.checkNotNullExpressionValue(ivAwardNotWin, "ivAwardNotWin");
                o000O.OooOOOO(ivAwardNotWin);
                Intrinsics.checkNotNullExpressionValue(ivAwardBg, "ivAwardBg");
                o000O.OooO0OO(ivAwardBg);
                Intrinsics.checkNotNullExpressionValue(svgaViewAward, "svgaViewAward");
                o000O.OooO0OO(svgaViewAward);
                Intrinsics.checkNotNullExpressionValue(tvAward, "tvAward");
                o000O.OooO0OO(tvAward);
                textView.setText(o000000.Treasure_box_nothing);
            }
        }
        TreasureBoxOpenDialog treasureBoxOpenDialog3 = (TreasureBoxOpenDialog) mutableState.getValue();
        if (treasureBoxOpenDialog3 != null) {
            treasureBoxOpenDialog3.OooO();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-637745289);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-637745289, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTreasureBoxManager.Content (RoomTreasureBoxManager.kt:60)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            Observable<Object> observable = LiveEventBus.get("ROOM_TREASURE_BOX_OPEN");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o00o.oO0000o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    SnapshotStateList notifyQueue = snapshotStateList;
                    Intrinsics.checkNotNullParameter(notifyQueue, "$notifyQueue");
                    MutableState openDialog = mutableState;
                    Intrinsics.checkNotNullParameter(openDialog, "$openDialog");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (activity.f22280OooO0oO) {
                        RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = (RoomTreasureBox.TreasureBoxDrawNotify) it;
                        if (openDialog.getValue() != null) {
                            notifyQueue.add(treasureBoxDrawNotify);
                        } else {
                            oO000.OooO0O0(treasureBoxDrawNotify, notifyQueue, openDialog, activity);
                        }
                    }
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new OooO00o(mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable2, (Observer) objRememberedValue4, composerStartRestartGroup, 72);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new OooO0O0(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
            TreasureBoxProgressModel treasureBoxProgressModel = (TreasureBoxProgressModel) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24576Oooo0oo, composerStartRestartGroup, 8).getValue();
            if (treasureBoxProgressModel == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(i));
                return;
            }
            AnimatedVisibilityKt.AnimatedVisibility(treasureBoxProgressModel.getTimeId() != 0, SemanticsModifierKt.semantics$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), false, OooO0OO.f50006OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 350354335, true, new OooO0o(treasureBoxProgressModel, mutableState2, mixedRoomActivity)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooO(i));
    }
}
