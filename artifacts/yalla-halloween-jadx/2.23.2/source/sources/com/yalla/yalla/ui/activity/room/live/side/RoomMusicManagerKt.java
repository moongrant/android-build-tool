package com.yalla.yalla.ui.activity.room.live.side;

import androidx.compose.animation.OooOo00;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.media3.session.o00O0;
import com.code.android.util.o0O0O00;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p587o0oOooOO.oo000000;
import p587o0oOooOO.w;
import p644o0ooOOo.o;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.o0OOO00;
import p644o0ooOOo.o0OOo000;
import p644o0ooOOo.oO000;
import p644o0ooOOo.oO000O0;
import p644o0ooOOo.oO0OoOO0;
import p644o0ooOOo.oO0o0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomMusicManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMusicManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMusicManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,174:1\n36#2:175\n25#2:186\n1097#3,6:176\n955#3,6:187\n73#4,4:182\n77#4,20:193\n*S KotlinDebug\n*F\n+ 1 RoomMusicManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMusicManagerKt\n*L\n82#1:175\n80#1:186\n82#1:176,6\n80#1:187,6\n80#1:182,4\n80#1:193,20\n*E\n"})
public final class RoomMusicManagerKt {

    public static final class OooO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f26345OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OO o0oo) {
            super(1);
            this.f26345OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f26345OooO0Oo;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f26346OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f26346OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f26346OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f26347OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0OOO00 o0ooo00 = constrainAs.f58050OooO0o0;
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO000.OooO00o(o0ooo00, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f26348OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OO o0oo) {
            super(1);
            this.f26348OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f26348OooO0Oo;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f26349OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OO o0oo) {
            super(1);
            this.f26349OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o oVar = constrainAs.f58048OooO0Oo;
            o0OO o0oo = this.f26349OooO0Oo;
            oO0OoOO0.OooO00o(oVar, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58022OooO0OO, 0.0f, 6);
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58024OooO0o0, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomMusicManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMusicManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMusicManagerKt$RoomSlideMusicCompose$2$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,174:1\n154#2:175\n*S KotlinDebug\n*F\n+ 1 RoomMusicManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomMusicManagerKt$RoomSlideMusicCompose$2$5$1\n*L\n161#1:175\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function1<o0OO0oO0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO f26350OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0OO o0oo) {
            super(1);
            this.f26350OooO0Oo = o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO0oO0 o0oo0oo1) {
            o0OO0oO0 constrainAs = o0oo0oo1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            oO000.OooO00o(constrainAs.f58050OooO0o0, this.f26350OooO0Oo.f58024OooO0o0, Dp.m3775constructorimpl(4), 4);
            o0OO o0oo = constrainAs.f58047OooO0OO;
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f26351OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f26352OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26353OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f26354OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Modifier modifier, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f26351OooO0Oo = modifier;
            this.f26353OooO0o0 = z;
            this.f26352OooO0o = function0;
            this.f26354OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f26354OooO0oO | 1);
            boolean z = this.f26353OooO0o0;
            Function0<Unit> function0 = this.f26352OooO0o;
            RoomMusicManagerKt.OooO00o(this.f26351OooO0Oo, z, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Modifier modifier, final boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(796122331);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796122331, i2, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomSlideMusicCompose (RoomMusicManager.kt:78)");
            }
            Modifier modifierThen = Modifier.INSTANCE.then(modifier);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(onClick);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierThen, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, -270267587, -3687241);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = new oO000O0();
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO000O0 oo000o0 = (oO000O0) objOooO00o;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = o0OOo000.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo000o0, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierOooO0O0, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomMusicManagerKt$RoomSlideMusicCompose$$inlined$ConstraintLayout$1
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
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomMusicManagerKt$RoomSlideMusicCompose$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    int i3;
                    float fFloatValue;
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO o0ooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO o0ooOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO o0ooOooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO o0ooOooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        o0OO o0ooOooO0O1 = oooO00oOooO0OO.f4214OooO00o.OooO0O0();
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_side_music_bg, composer3, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f = 40;
                        ImageKt.Image(painterPainterResource, (String) null, ConstraintLayoutScope.OooO00o(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), o0ooOooO00o, RoomMusicManagerKt.OooO0O0.f26347OooO0Oo), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        composer3.startReplaceableGroup(918028845);
                        if (z) {
                            i3 = 0;
                            fFloatValue = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer3, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composer3, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432, 8).getValue().floatValue();
                        } else {
                            i3 = 0;
                            fFloatValue = 0.0f;
                        }
                        composer3.endReplaceableGroup();
                        Painter painterPainterResource2 = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_side_music, composer3, i3);
                        Modifier modifierRotate = RotateKt.rotate(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), fFloatValue);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new RoomMusicManagerKt.OooO0OO(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOooO00o = ConstraintLayoutScope.OooO00o(modifierRotate, o0ooOooO0O0, (Function1) objRememberedValue4);
                        int i4 = i3;
                        ImageKt.Image(painterPainterResource2, (String) null, modifierOooO00o, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        Painter painterPainterResource3 = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_side_center_circle, composer3, i4);
                        Modifier modifierOooO00o2 = o00O0.OooO00o(f, companion2, composer3, 1157296644);
                        boolean zChanged3 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new RoomMusicManagerKt.OooO0o(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource3, (String) null, ConstraintLayoutScope.OooO00o(modifierOooO00o2, o0ooOooO0OO, (Function1) objRememberedValue5), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        Painter painterPainterResource4 = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_side_music_fg, composer3, i4);
                        Modifier modifierOooO00o3 = o00O0.OooO00o(f, companion2, composer3, 1157296644);
                        boolean zChanged4 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new RoomMusicManagerKt.OooO(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource4, (String) null, ConstraintLayoutScope.OooO00o(modifierOooO00o3, o0ooOooO0Oo, (Function1) objRememberedValue6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        String strStringResource = StringResources_androidKt.stringResource(o000000.room_alert_music, composer3, i4);
                        w wVar = new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10));
                        long j = p476o0OooooO.o0OOo000.f48147OooOOOO;
                        int iM3681getCentere0LSkKk = TextAlign.INSTANCE.m3681getCentere0LSkKk();
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged5 = composer3.changed(o0ooOooO00o);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new RoomMusicManagerKt.OooOO0(o0ooOooO00o);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        composer3.endReplaceableGroup();
                        oo000000.OooO00o(strStringResource, wVar, ConstraintLayoutScope.OooO00o(companion2, o0ooOooO0O1, (Function1) objRememberedValue7), j, null, null, null, 0L, null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, 0, false, 1, null, composer3, 0, 3072, 24048);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier, z, onClick, i));
    }
}
