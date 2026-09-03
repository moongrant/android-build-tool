package p495o0o00Ooo;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
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
import p154o00OoO00.OooOo00;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p519o0o0O0oO.j4;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.f8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,209:1\n76#2:210\n25#3:211\n25#3:218\n25#3:225\n36#3:232\n1097#4,6:212\n1097#4,6:219\n1097#4,6:226\n1097#4,6:233\n154#5:239\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager\n*L\n50#1:210\n52#1:211\n54#1:218\n56#1:225\n77#1:232\n52#1:212,6\n54#1:219,6\n56#1:226,6\n77#1:233,6\n87#1:239\n*E\n"})
public final class o0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0o0 f48833OooO00o = new o0O0o0();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f48835OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48835OooO0o0 | 1);
            o0O0o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48836OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxOpenDialog> f48837OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> f48838OooO0o0;

        public OooO00o(MutableState mutableState, SnapshotStateList snapshotStateList, MixedRoomActivity mixedRoomActivity) {
            this.f48836OooO0Oo = mixedRoomActivity;
            this.f48838OooO0o0 = snapshotStateList;
            this.f48837OooO0o = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MixedRoomActivity mixedRoomActivity = this.f48836OooO0Oo;
            if (mixedRoomActivity.f22753OooO0oO) {
                RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = (RoomTreasureBox.TreasureBoxDrawNotify) it;
                MutableState<TreasureBoxOpenDialog> mutableState = this.f48837OooO0o;
                TreasureBoxOpenDialog value = mutableState.getValue();
                SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> snapshotStateList = this.f48838OooO0o0;
                if (value != null) {
                    snapshotStateList.add(treasureBoxDrawNotify);
                } else {
                    o0O0o0.OooO0O0(treasureBoxDrawNotify, snapshotStateList, mutableState, mixedRoomActivity);
                }
            }
        }
    }

    public static final class OooO0O0 implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxOpenDialog> f48839OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f48840OooO0o0;

        public OooO0O0(MutableState<TreasureBoxOpenDialog> mutableState, MutableState<TreasureBoxDialog> mutableState2) {
            this.f48839OooO0Oo = mutableState;
            this.f48840OooO0o0 = mutableState2;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25028Oooo.postValue(null);
            MutableState<TreasureBoxOpenDialog> mutableState = this.f48839OooO0Oo;
            TreasureBoxOpenDialog value = mutableState.getValue();
            if (value != null && value.OooO0OO()) {
                value.OooO0O0();
            }
            mutableState.setValue(null);
            MutableState<TreasureBoxDialog> mutableState2 = this.f48840OooO0o0;
            TreasureBoxDialog value2 = mutableState2.getValue();
            if (value2 != null && value2.OooO0OO()) {
                value2.OooO0O0();
            }
            mutableState2.setValue(null);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,209:1\n63#2,5:210\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$3$1\n*L\n78#1:210,5\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f48841OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<TreasureBoxDialog> mutableState) {
            super(1);
            this.f48841OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0oOo0O0(this.f48841OooO0Oo);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTreasureBoxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,209:1\n72#2,6:210\n78#2:244\n82#2:253\n78#3,11:216\n91#3:252\n456#4,8:227\n464#4,3:241\n467#4,3:249\n4144#5,6:235\n154#6:245\n154#6:246\n154#6:247\n154#6:248\n81#7:254\n*S KotlinDebug\n*F\n+ 1 RoomTreasureBoxManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTreasureBoxManager$Content$4\n*L\n123#1:210,6\n123#1:244\n123#1:253\n123#1:216,11\n123#1:252\n123#1:227,8\n123#1:241,3\n123#1:249,3\n123#1:235,6\n138#1:245\n143#1:246\n148#1:247\n159#1:248\n151#1:254\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TreasureBoxProgressModel f48842OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48843OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxDialog> f48844OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TreasureBoxProgressModel treasureBoxProgressModel, MutableState<TreasureBoxDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f48842OooO0Oo = treasureBoxProgressModel;
            this.f48844OooO0o0 = mutableState;
            this.f48843OooO0o = mixedRoomActivity;
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
                ComposerKt.traceEventStart(350354335, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTreasureBoxManager.Content.<anonymous> (RoomTreasureBoxManager.kt:89)");
            }
            TreasureBoxProgressModel treasureBoxProgressModel = this.f48842OooO0Oo;
            int boxLevel = treasureBoxProgressModel.getBoxLevel();
            if (boxLevel != 1) {
                if (boxLevel != 5) {
                    if (boxLevel != 10) {
                        z2 = true;
                        str = null;
                        num2 = null;
                    } else {
                        if (treasureBoxProgressModel.getPercent() == 100) {
                            numValueOf = Integer.valueOf(oOo00OO0.ic_room_treasure_box_side_3_open);
                            z = false;
                        } else if (treasureBoxProgressModel.getPercent() >= 90) {
                            str = "svga/anim_room_treasure_box_side_3.svga";
                            z2 = true;
                            num2 = null;
                        } else {
                            numValueOf = Integer.valueOf(oOo00OO0.ic_room_treasure_box_side_3);
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
                    numValueOf = Integer.valueOf(oOo00OO0.ic_room_treasure_box_side_2);
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
                numValueOf = Integer.valueOf(oOo00OO0.ic_room_treasure_box_side_1);
                z = true;
                z2 = z;
                num2 = numValueOf;
                str = null;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new o0O(this.f48844OooO0o0, this.f48843OooO0o), 253);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composer2, 48, -1323940314);
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (!TextUtils.isEmpty(str)) {
                composer2.startReplaceableGroup(630417);
                Intrinsics.checkNotNull(str);
                OooOo00.OooO00o(str, true, 0, null, null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composer2, 196656, 28);
                composer2.endReplaceableGroup();
            } else if (num2 != null) {
                composer2.startReplaceableGroup(630660);
                ImageKt.Image(PainterResources_androidKt.painterResource(num2.intValue(), composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(630879);
                composer2.endReplaceableGroup();
            }
            composer2.startReplaceableGroup(925174608);
            if (z2) {
                com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(2), null, composer2, 6, 2);
                ProgressIndicatorKt.m1142LinearProgressIndicator_5eSRE(AnimateAsStateKt.animateFloatAsState(treasureBoxProgressModel.getPercent() / 100.0f, AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, composer2, 0, 28).getValue().floatValue(), ClipKt.clip(AnimationModifierKt.animateContentSize$default(PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(8), 0.0f, 2, null), null, null, 3, null), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4293624878L), o0oO0O0o.f46949OooO0o, 0, composer2, 384, 16);
            }
            if (OooOo.OooO0o.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48846OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f48846OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48846OooO0o0 | 1);
            o0O0o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48848OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f48848OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48848OooO0o0 | 1);
            o0O0o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TreasureBoxOpenDialog> f48849OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48850OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> f48851OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<TreasureBoxOpenDialog> mutableState, SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> snapshotStateList, MixedRoomActivity mixedRoomActivity) {
            super(1);
            this.f48849OooO0Oo = mutableState;
            this.f48851OooO0o0 = snapshotStateList;
            this.f48850OooO0o = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<TreasureBoxOpenDialog> mutableState = this.f48849OooO0Oo;
            mutableState.setValue(null);
            SnapshotStateList<RoomTreasureBox.TreasureBoxDrawNotify> snapshotStateList = this.f48851OooO0o0;
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = (RoomTreasureBox.TreasureBoxDrawNotify) CollectionsKt.getOrNull(snapshotStateList, 0);
            if (treasureBoxDrawNotify != null) {
                snapshotStateList.remove(0);
                o0O0o0.OooO0O0(treasureBoxDrawNotify, snapshotStateList, mutableState, this.f48850OooO0o);
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
            treasureBoxOpenDialog2.f27975OooOOO0 = notify;
            f8 f8Var = treasureBoxOpenDialog2.f27973OooOO0o;
            LinearLayoutCompat linearLayoutCompat = f8Var.f57935OooOOO;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.vCountdown");
            o000OO00.OooOOOO(linearLayoutCompat);
            LinearLayoutCompat linearLayoutCompat2 = f8Var.f57936OooOOO0;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.vAward");
            o000OO00.OooO0O0(linearLayoutCompat2);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(treasureBoxOpenDialog2.f52532OooO0Oo);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify = treasureBoxOpenDialog2.f27975OooOOO0;
            Object obj = null;
            if (treasureBoxDrawNotify == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify = null;
            }
            String headUrl = treasureBoxDrawNotify.getRoomboxTop().getHeadUrl();
            int iOooO00o = o0000O0.OooO00o(60);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, headUrl);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0O0(2, o0000.OooO00o(oO00O0o.color_FFFCCB80));
            oooO00o.OooO0Oo(f8Var.f57929OooO0o0);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify2 = treasureBoxOpenDialog2.f27975OooOOO0;
            if (treasureBoxDrawNotify2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify2 = null;
            }
            f8Var.f57923OooO.setText(treasureBoxDrawNotify2.getRoomboxTop().getNickName());
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify3 = treasureBoxOpenDialog2.f27975OooOOO0;
            if (treasureBoxDrawNotify3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify3 = null;
            }
            int roomboxLevel = treasureBoxDrawNotify3.getRoomboxLevel();
            SVGAView sVGAView = f8Var.f57928OooO0o;
            FragmentActivity fragmentActivity = treasureBoxOpenDialog2.f27972OooOO0O;
            if (roomboxLevel == 1) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_1.svga", fragmentActivity);
            } else if (roomboxLevel == 5) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_2.svga", fragmentActivity);
            } else if (roomboxLevel == 10) {
                sVGAView.OooOO0O("svga/anim_room_treasure_box_3.svga", fragmentActivity);
            }
            sVGAView.setLoops(1);
            sVGAView.OooOO0o();
            sVGAView.f10171OooOoo0 = new j4(treasureBoxOpenDialog2);
            RoomTreasureBox.TreasureBoxDrawNotify treasureBoxDrawNotify4 = treasureBoxOpenDialog2.f27975OooOOO0;
            if (treasureBoxDrawNotify4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify4 = null;
            }
            int roomboxLevel2 = treasureBoxDrawNotify4.getRoomboxLevel();
            if (roomboxLevel2 == 1) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Treasure_Chest_Opened_1);
            } else if (roomboxLevel2 != 5) {
                strOooO0OO = roomboxLevel2 != 10 ? o0000.OooO0OO(oO00OOo0.Treasure_Chest_Opened_1) : o0000.OooO0OO(oO00OOo0.Treasure_Chest_Opened_3);
            } else {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Treasure_Chest_Opened_2);
            }
            f8Var.f57934OooOO0o.setText(strOooO0OO);
            List<RoomTreasureBox.TreasureBoxDrawAwardUserModel> awardUsersList = notify.getAwardUsersList();
            Intrinsics.checkNotNullExpressionValue(awardUsersList, "notify.awardUsersList");
            for (Object obj2 : awardUsersList) {
                long userId = ((RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj2).getUserId();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                if (l != null && userId == l.longValue()) {
                    obj = obj2;
                    break;
                }
            }
            RoomTreasureBox.TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = (RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj;
            TextView textView = f8Var.f57933OooOO0O;
            ImageView imageView = f8Var.f57925OooO0O0;
            ImageView imageView2 = f8Var.f57926OooO0OO;
            TextView textView2 = f8Var.f57931OooO0oo;
            SVGAView sVGAView2 = f8Var.f57930OooO0oO;
            if (treasureBoxDrawAwardUserModel != null) {
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivAwardBg");
                o000OO00.OooOOOO(imageView);
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvAward");
                o000OO00.OooOOOO(textView2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivAwardNotWin");
                o000OO00.OooO0OO(imageView2);
                Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaViewAward");
                o000OO00.OooOOOO(sVGAView2);
                String imageUrl = treasureBoxDrawAwardUserModel.getDynamicUrl();
                if (imageUrl.length() == 0) {
                    imageUrl = treasureBoxDrawAwardUserModel.getAwardImage();
                }
                Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
                sVGAView2.OooOO0O(imageUrl, fragmentActivity);
                sVGAView2.OooOO0o();
                if (treasureBoxDrawAwardUserModel.getAwardType() == 1) {
                    string = treasureBoxDrawAwardUserModel.getNums() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.days);
                } else {
                    if (p591o0oo000O.OooO.OooO0o0()) {
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
                textView2.setText(string);
                textView.setText(oO00OOo0.Treasure_box_win);
            } else {
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivAwardNotWin");
                o000OO00.OooOOOO(imageView2);
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivAwardBg");
                o000OO00.OooO0OO(imageView);
                Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaViewAward");
                o000OO00.OooO0OO(sVGAView2);
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvAward");
                o000OO00.OooO0OO(textView2);
                textView.setText(oO00OOo0.Treasure_box_nothing);
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
                ComposerKt.traceEventStart(-637745289, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTreasureBoxManager.Content (RoomTreasureBoxManager.kt:48)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
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
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            Observable<Object> observable = LiveEventBus.get("ROOM_TREASURE_BOX_OPEN");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.ROOM_TREASURE_BOX_OPEN)");
            o00000O.OooO00o(observable, new OooO00o(mutableState, snapshotStateList, mixedRoomActivity), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(RoomEventKey.RESET_ROOM)");
            o00000O.OooO00o(observable2, new OooO0O0(mutableState, mutableState2), composerStartRestartGroup, 8);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new OooO0OO(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
            TreasureBoxProgressModel treasureBoxProgressModel = (TreasureBoxProgressModel) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25038Oooo0oo, composerStartRestartGroup, 8).getValue();
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
            AnimatedVisibilityKt.AnimatedVisibility(treasureBoxProgressModel.getTimeId() != 0, PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 350354335, true, new OooO0o(treasureBoxProgressModel, mutableState2, mixedRoomActivity)), composerStartRestartGroup, 200112, 16);
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
