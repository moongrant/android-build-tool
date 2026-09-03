package p498o0o00o00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0000O0O;
import p579o0oOoo.oOO;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomEnterTipsComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,391:1\n36#2:392\n67#2,3:399\n66#2:402\n36#2:409\n25#2:416\n456#2,8:442\n464#2,3:456\n467#2,3:460\n25#2:466\n36#2:476\n1097#3,6:393\n1097#3,6:403\n1097#3,6:410\n1097#3,6:417\n1097#3,6:467\n1097#3,6:477\n154#4:423\n154#4:424\n154#4:473\n154#4:474\n154#4:483\n154#4:484\n66#5,6:425\n72#5:459\n76#5:464\n78#6,11:431\n91#6:463\n4144#7,6:450\n76#8:465\n51#9:475\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt\n*L\n61#1:392\n63#1:399,3\n63#1:402\n81#1:409\n86#1:416\n199#1:442,8\n199#1:456,3\n199#1:460,3\n225#1:466\n328#1:476\n61#1:393,6\n63#1:403,6\n81#1:410,6\n86#1:417,6\n225#1:467,6\n328#1:477,6\n203#1:423\n204#1:424\n238#1:473\n272#1:474\n337#1:483\n54#1:484\n199#1:425,6\n199#1:459\n199#1:464\n199#1:431,11\n199#1:463\n199#1:450,6\n223#1:465\n272#1:475\n*E\n"})
public final class o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f49216OooO00o = Dp.m3765constructorimpl(60);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final int[] f49217OooO0O0 = {2, 2, 3, 3, 4, 4, 4, 5};

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f49218OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49219OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49220OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49221OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f49222OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, Function0<Unit> function0, int i) {
            super(2);
            this.f49218OooO0Oo = boxScope;
            this.f49220OooO0o0 = roomUserInfoModel;
            this.f49219OooO0o = o0o0o0;
            this.f49221OooO0oO = function0;
            this.f49222OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0O0Oo.OooO0OO(this.f49218OooO0Oo, this.f49220OooO0o0, this.f49219OooO0o, this.f49221OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49222OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f49223OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49224OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(File file, int i) {
            super(2);
            this.f49223OooO0Oo = file;
            this.f49224OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49224OooO0o0 | 1);
            o0O0O0Oo.OooO00o(this.f49223OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f49225OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49226OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(File file, int i) {
            super(2);
            this.f49225OooO0Oo = file;
            this.f49226OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49226OooO0o0 | 1);
            o0O0O0Oo.OooO00o(this.f49225OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f49227OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49228OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ File f49229OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49230OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, File file, int i, int i2) {
            super(2);
            this.f49227OooO0Oo = boxScope;
            this.f49229OooO0o0 = file;
            this.f49228OooO0o = i;
            this.f49230OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49230OooO0oO | 1);
            File file = this.f49229OooO0o0;
            int i = this.f49228OooO0o;
            o0O0O0Oo.OooO0O0(this.f49227OooO0Oo, file, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ NinePatchDrawable f49231OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NinePatchDrawable ninePatchDrawable) {
            super(1);
            this.f49231OooO0Oo = ninePatchDrawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            NinePatchDrawable ninePatchDrawable = this.f49231OooO0Oo;
            if (ninePatchDrawable != null) {
                int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(drawBehind.mo2108getSizeNHjbRc());
                int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(drawBehind.mo2108getSizeNHjbRc());
                Intrinsics.checkNotNullParameter(ninePatchDrawable, "<this>");
                ninePatchDrawable.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
            }
            if (ninePatchDrawable != null) {
                ninePatchDrawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49232OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O0o0 o0o0o0) {
            super(1);
            this.f49232OooO0Oo = o0o0o0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            o0O0o0 o0o0o0 = this.f49232OooO0Oo;
            NinePatchDrawable ninePatchDrawable = o0o0o0.f49326OooO0o0;
            Intrinsics.checkNotNull(ninePatchDrawable);
            int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(drawBehind.mo2108getSizeNHjbRc());
            int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(drawBehind.mo2108getSizeNHjbRc());
            Intrinsics.checkNotNullParameter(ninePatchDrawable, "<this>");
            ninePatchDrawable.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
            NinePatchDrawable ninePatchDrawable2 = o0o0o0.f49326OooO0o0;
            Intrinsics.checkNotNull(ninePatchDrawable2);
            ninePatchDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f49233OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f49234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49236OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49237OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49238OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, Function0<Unit> function0, int i) {
            super(2);
            this.f49234OooO0Oo = boxScope;
            this.f49236OooO0o0 = roomUserInfoModel;
            this.f49235OooO0o = o0o0o0;
            this.f49237OooO0oO = inRoomEffectsInfo;
            this.f49238OooO0oo = function0;
            this.f49233OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0O0Oo.OooO0Oo(this.f49234OooO0Oo, this.f49236OooO0o0, this.f49235OooO0o, this.f49237OooO0oO, this.f49238OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49233OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f49239OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49240OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f49241OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f49239OooO0Oo = mutableState;
            this.f49241OooO0o0 = mutableState2;
            this.f49240OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49240OooO0o | 1);
            o0O0O0Oo.OooO0o(this.f49239OooO0Oo, this.f49241OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49242OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f49243OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49244OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49245OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49246OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49247OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f49248OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f49249OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, RoomUserInfoModel roomUserInfoModel, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, o0O0o0 o0o0o0, Function0<Unit> function0, MutableState<Boolean> mutableState, int i, int i2) {
            super(2);
            this.f49243OooO0Oo = modifier;
            this.f49245OooO0o0 = roomUserInfoModel;
            this.f49244OooO0o = inRoomEffectsInfo;
            this.f49246OooO0oO = o0o0o0;
            this.f49247OooO0oo = function0;
            this.f49242OooO = mutableState;
            this.f49248OooOO0 = i;
            this.f49249OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0O0Oo.OooO0o0(this.f49243OooO0Oo, this.f49245OooO0o0, this.f49244OooO0o, this.f49246OooO0oO, this.f49247OooO0oo, this.f49242OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49248OooOO0 | 1), this.f49249OooOO0O);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2", f = "RoomEnterTipsComp.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, l = {142, 143, 144, 145, 146}, m = "invokeSuspend", n = {"backgroundJob", "badgeJob", "effects1Job", "effects2Job", "badgeJob", "effects1Job", "effects2Job", "effects1Job", "effects2Job", "effects2Job"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49250OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Deferred f49251OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Deferred f49252OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Deferred f49253OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f49254OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f49255OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49256OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49257OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49258OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49259OooOOO0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$effects2Job$1", f = "RoomEnterTipsComp.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49260OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0O0o0 f49261OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0O0o0 f49262OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f49263OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49264OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49265OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49266OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f49262OooO0o = o0o0o0;
                this.f49264OooO0oO = inRoomEffectsInfo;
                this.f49265OooO0oo = coroutineScope;
                this.f49260OooO = mutableState;
                this.f49266OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO(this.f49262OooO0o, this.f49264OooO0oO, this.f49265OooO0oo, this.f49260OooO, this.f49266OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0O0o0 o0o0o0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49263OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    oOO ooo = oOO.f56647OooO00o;
                    String effectsUrl2 = this.f49264OooO0oO.getEffectsUrl2();
                    o0O0o0 o0o0o1 = this.f49262OooO0o;
                    this.f49261OooO0Oo = o0o0o1;
                    this.f49263OooO0o0 = 1;
                    ooo.getClass();
                    obj = oOO.OooO0O0(effectsUrl2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0o0 = o0o0o1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0o0o0 = this.f49261OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f49265OooO0oo, this.f49260OooO, this.f49266OooOO0);
                o0o0o0.f49327OooO0oO = (File) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$backgroundJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49267OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0O0o0 f49268OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0O0o0 f49269OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f49270OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49271OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49272OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49273OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f49269OooO0o = o0o0o0;
                this.f49271OooO0oO = inRoomEffectsInfo;
                this.f49272OooO0oo = coroutineScope;
                this.f49267OooO = mutableState;
                this.f49273OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f49269OooO0o, this.f49271OooO0oO, this.f49272OooO0oo, this.f49267OooO, this.f49273OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                o0O0o0 o0o0o0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49270OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    oOO ooo = oOO.f56647OooO00o;
                    String strOooO0oO = p139o00OOooO.OooO0o.OooO0oO(o0000O0.OooO00o(246), o0000O0.OooO00o(60), this.f49271OooO0oO.getBackgroundUrl());
                    o0O0o0 o0o0o1 = this.f49269OooO0o;
                    this.f49268OooO0Oo = o0o0o1;
                    this.f49270OooO0o0 = 1;
                    obj = ooo.OooO0OO(strOooO0oO, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0o0 = o0o0o1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0o0o0 = this.f49268OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f49272OooO0oo, this.f49267OooO, this.f49273OooOO0);
                o0o0o0.f49326OooO0o0 = (NinePatchDrawable) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$badgeJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49274OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0O0o0 f49275OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0O0o0 f49276OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f49277OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49278OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49279OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49280OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f49276OooO0o = o0o0o0;
                this.f49278OooO0oO = inRoomEffectsInfo;
                this.f49279OooO0oo = coroutineScope;
                this.f49274OooO = mutableState;
                this.f49280OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f49276OooO0o, this.f49278OooO0oO, this.f49279OooO0oo, this.f49274OooO, this.f49280OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0O0o0 o0o0o0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49277OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    oOO ooo = oOO.f56647OooO00o;
                    String badgeUrl = this.f49278OooO0oO.getBadgeUrl();
                    o0O0o0 o0o0o1 = this.f49276OooO0o;
                    this.f49275OooO0Oo = o0o0o1;
                    this.f49277OooO0o0 = 1;
                    ooo.getClass();
                    obj = oOO.OooO0O0(badgeUrl, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0o0 = o0o0o1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0o0o0 = this.f49275OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f49279OooO0oo, this.f49274OooO, this.f49280OooOO0);
                o0o0o0.f49324OooO0Oo = (File) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$carDisplayJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49281OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public MutableState f49282OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0O0o0 f49283OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f49284OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoModel f49285OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49286OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49287OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(o0O0o0 o0o0o0, RoomUserInfoModel roomUserInfoModel, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f49283OooO0o = o0o0o0;
                this.f49285OooO0oO = roomUserInfoModel;
                this.f49286OooO0oo = coroutineScope;
                this.f49281OooO = mutableState;
                this.f49287OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0OO(this.f49283OooO0o, this.f49285OooO0oO, this.f49286OooO0oo, this.f49281OooO, this.f49287OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49284OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableState<File> mutableState2 = this.f49283OooO0o.f49323OooO0OO;
                    oOO ooo = oOO.f56647OooO00o;
                    String value = this.f49285OooO0oO.getVehicleSVGAUrl().getValue();
                    this.f49282OooO0Oo = mutableState2;
                    this.f49284OooO0o0 = 1;
                    ooo.getClass();
                    Object objOooO0O0 = oOO.OooO0O0(value, this);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objOooO0O0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState = this.f49282OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f49286OooO0oo, this.f49281OooO, this.f49287OooOO0);
                mutableState.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$effects1Job$1", f = "RoomEnterTipsComp.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49288OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public o0O0o0 f49289OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ o0O0o0 f49290OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f49291OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49292OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49293OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f49294OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f49290OooO0o = o0o0o0;
                this.f49292OooO0oO = inRoomEffectsInfo;
                this.f49293OooO0oo = coroutineScope;
                this.f49288OooO = mutableState;
                this.f49294OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0o(this.f49290OooO0o, this.f49292OooO0oO, this.f49293OooO0oo, this.f49288OooO, this.f49294OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0O0o0 o0o0o0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49291OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    oOO ooo = oOO.f56647OooO00o;
                    String effectsUrl1 = this.f49292OooO0oO.getEffectsUrl1();
                    o0O0o0 o0o0o1 = this.f49290OooO0o;
                    this.f49289OooO0Oo = o0o0o1;
                    this.f49291OooO0o0 = 1;
                    ooo.getClass();
                    obj = oOO.OooO0O0(effectsUrl1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0o0 = o0o0o1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0o0o0 = this.f49289OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f49293OooO0oo, this.f49288OooO, this.f49294OooOO0);
                o0o0o0.f49325OooO0o = (File) obj;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0O0o0 o0o0o0, RoomUserInfoModel roomUserInfoModel, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f49250OooO = o0o0o0;
            this.f49256OooOO0 = roomUserInfoModel;
            this.f49257OooOO0O = inRoomEffectsInfo;
            this.f49258OooOO0o = mutableState;
            this.f49259OooOOO0 = mutableState2;
        }

        public static final void OooO00o(Object obj, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2) {
            if (obj == null) {
                p592o0oo00O.OooOOO0.OooO0O0("RoomEnterTipsManager:  cancel");
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                Boolean bool = Boolean.TRUE;
                mutableState.setValue(bool);
                mutableState2.setValue(bool);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f49250OooO, this.f49256OooOO0, this.f49257OooOO0O, this.f49258OooOO0o, this.f49259OooOOO0, continuation);
            oooOOOO.f49255OooO0oo = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x017e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x017f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0182  */
        /* JADX WARN: Code duplicated, block: B:48:0x0191 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0194  */
        /* JADX WARN: Code duplicated, block: B:52:0x01a3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:56:0x01b5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferredOooO00o;
            Deferred deferredOooO00o2;
            Deferred deferredOooO00o3;
            Deferred deferred;
            Deferred deferred2;
            Deferred deferred3;
            Deferred deferred4;
            Deferred deferred5;
            Deferred deferred6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f49254OooO0oO;
            o0O0o0 o0o0o0 = this.f49250OooO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f49255OooO0oo;
                p592o0oo00O.OooOOO0.OooO0O0("RoomEnterTipsManager  start:  " + o0o0o0);
                RoomUserInfoModel roomUserInfoModel = this.f49256OooOO0;
                Deferred deferredOooO00o4 = (TextUtils.isEmpty(roomUserInfoModel.getVehicleSVGAUrl().getValue()) || !StringsKt.OooOO0O(o0000O0O.OooO0oo(roomUserInfoModel.getVehicleSVGAUrl().getValue()), ".svga")) ? null : com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0OO(this.f49250OooO, this.f49256OooOO0, coroutineScope, this.f49259OooOOO0, this.f49258OooOO0o, null));
                deferredOooO00o = com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO00o(this.f49250OooO, this.f49257OooOO0O, coroutineScope, this.f49259OooOOO0, this.f49258OooOO0o, null));
                RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo = this.f49257OooOO0O;
                Deferred deferredOooO00o5 = StringsKt.isBlank(inRoomEffectsInfo.getBadgeUrl()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0O0(this.f49250OooO, this.f49257OooOO0O, coroutineScope, this.f49259OooOOO0, this.f49258OooOO0o, null)) : null;
                deferredOooO00o2 = StringsKt.isBlank(inRoomEffectsInfo.getEffectsUrl1()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0o(this.f49250OooO, this.f49257OooOO0O, coroutineScope, this.f49259OooOOO0, this.f49258OooOO0o, null)) : null;
                deferredOooO00o3 = StringsKt.isBlank(inRoomEffectsInfo.getEffectsUrl2()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO(this.f49250OooO, this.f49257OooOO0O, coroutineScope, this.f49259OooOOO0, this.f49258OooOO0o, null)) : null;
                if (deferredOooO00o4 != null) {
                    this.f49255OooO0oo = deferredOooO00o;
                    this.f49251OooO0Oo = deferredOooO00o5;
                    this.f49253OooO0o0 = deferredOooO00o2;
                    this.f49252OooO0o = deferredOooO00o3;
                    this.f49254OooO0oO = 1;
                    if (deferredOooO00o4.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred2 = deferredOooO00o;
                    deferred3 = deferredOooO00o5;
                    deferred4 = deferredOooO00o2;
                } else {
                    deferred = deferredOooO00o5;
                }
                this.f49255OooO0oo = deferred;
                this.f49251OooO0Oo = deferredOooO00o2;
                this.f49253OooO0o0 = deferredOooO00o3;
                deferred5 = null;
                this.f49252OooO0o = null;
                this.f49254OooO0oO = 2;
                if (deferredOooO00o.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred6 = deferredOooO00o2;
                if (deferred != null) {
                    this.f49255OooO0oo = deferred6;
                    this.f49251OooO0Oo = deferredOooO00o3;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 3;
                    if (deferred.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferred6 != null) {
                    this.f49255OooO0oo = deferredOooO00o3;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f49255OooO0oo = deferred5;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                p592o0oo00O.OooOOO0.OooO0O0("RoomEnterTipsManager load success:  " + o0o0o0);
                this.f49258OooOO0o.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            if (i == 1) {
                deferredOooO00o3 = this.f49252OooO0o;
                deferred4 = this.f49253OooO0o0;
                deferred3 = this.f49251OooO0Oo;
                deferred2 = (Deferred) this.f49255OooO0oo;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                deferredOooO00o3 = this.f49253OooO0o0;
                Deferred deferred7 = this.f49251OooO0Oo;
                deferred = (Deferred) this.f49255OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred6 = deferred7;
                deferred5 = null;
                if (deferred != null) {
                    this.f49255OooO0oo = deferred6;
                    this.f49251OooO0Oo = deferredOooO00o3;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 3;
                    if (deferred.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferred6 != null) {
                    this.f49255OooO0oo = deferredOooO00o3;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f49255OooO0oo = deferred5;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 3) {
                deferredOooO00o3 = this.f49251OooO0Oo;
                deferred6 = (Deferred) this.f49255OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred5 = null;
                if (deferred6 != null) {
                    this.f49255OooO0oo = deferredOooO00o3;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f49255OooO0oo = deferred5;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 4) {
                deferredOooO00o3 = (Deferred) this.f49255OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred5 = null;
                if (deferredOooO00o3 != null) {
                    this.f49255OooO0oo = deferred5;
                    this.f49251OooO0Oo = deferred5;
                    this.f49253OooO0o0 = deferred5;
                    this.f49254OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            p592o0oo00O.OooOOO0.OooO0O0("RoomEnterTipsManager load success:  " + o0o0o0);
            this.f49258OooOO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
            deferredOooO00o2 = deferred4;
            deferred = deferred3;
            deferredOooO00o = deferred2;
            this.f49255OooO0oo = deferred;
            this.f49251OooO0Oo = deferredOooO00o2;
            this.f49253OooO0o0 = deferredOooO00o3;
            deferred5 = null;
            this.f49252OooO0o = null;
            this.f49254OooO0oO = 2;
            if (deferredOooO00o.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred6 = deferredOooO00o2;
            if (deferred != null) {
                this.f49255OooO0oo = deferred6;
                this.f49251OooO0Oo = deferredOooO00o3;
                this.f49253OooO0o0 = deferred5;
                this.f49254OooO0oO = 3;
                if (deferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (deferred6 != null) {
                this.f49255OooO0oo = deferredOooO00o3;
                this.f49251OooO0Oo = deferred5;
                this.f49253OooO0o0 = deferred5;
                this.f49254OooO0oO = 4;
                if (deferred6.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (deferredOooO00o3 != null) {
                this.f49255OooO0oo = deferred5;
                this.f49251OooO0Oo = deferred5;
                this.f49253OooO0o0 = deferred5;
                this.f49254OooO0oO = 5;
                if (deferredOooO00o3.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            p592o0oo00O.OooOOO0.OooO0O0("RoomEnterTipsManager load success:  " + o0o0o0);
            this.f49258OooOO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f49295OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49296OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f49297OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f49295OooO0Oo = mutableState;
            this.f49297OooO0o0 = mutableState2;
            this.f49296OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49296OooO0o | 1);
            o0O0O0Oo.OooO0o(this.f49295OooO0Oo, this.f49297OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomEnterTipsComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt$RoomEnterTipsComp$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,391:1\n66#2,6:392\n72#2:426\n76#2:431\n78#3,11:398\n91#3:430\n456#4,8:409\n464#4,3:423\n467#4,3:427\n4144#5,6:417\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt$RoomEnterTipsComp$3\n*L\n156#1:392,6\n156#1:426\n156#1:431\n156#1:398,11\n156#1:430\n156#1:409,8\n156#1:423,3\n156#1:427,3\n156#1:417,6\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49298OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49299OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f49300OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49301OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0o0 f49302OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49303OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomUserInfoModel roomUserInfoModel, MutableState<Boolean> mutableState, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, o0O0o0 o0o0o0, Function0<Unit> function0, MutableState<Boolean> mutableState2) {
            super(3);
            this.f49299OooO0Oo = roomUserInfoModel;
            this.f49301OooO0o0 = mutableState;
            this.f49300OooO0o = inRoomEffectsInfo;
            this.f49302OooO0oO = o0o0o0;
            this.f49303OooO0oo = function0;
            this.f49298OooO = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1790593843, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsComp.<anonymous> (RoomEnterTipsComp.kt:154)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new o0O0o000(this.f49299OooO0Oo), 253);
            RoomUserInfoModel roomUserInfoModel = this.f49299OooO0Oo;
            RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo = this.f49300OooO0o;
            o0O0o0 o0o0o0 = this.f49302OooO0oO;
            Function0<Unit> function0 = this.f49303OooO0oo;
            MutableState<Boolean> mutableState = this.f49298OooO;
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(992402267);
            if (this.f49301OooO0o0.getValue().booleanValue()) {
                o0O0O0Oo.OooO0o0(boxScopeInstance.align(companion, companion2.getBottomStart()), roomUserInfoModel, inRoomEffectsInfo, o0o0o0, function0, mutableState, composer2, 201280, 0);
            }
            composer2.endReplaceableGroup();
            if (o0o0o0.f49323OooO0OO.getValue() != null) {
                composer2.startReplaceableGroup(992402678);
                o0O0O0Oo.OooO0oO(roomUserInfoModel, o0o0o0, function0, composer2, 72);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(992402809);
                o0O0O0Oo.OooO0oo(roomUserInfoModel, function0, composer2, 8);
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f49304OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f49305OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49306OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<RoomUserInfoModel> mutableState, MutableState<Boolean> mutableState2, MutableState<CancellableContinuation<Boolean>> mutableState3) {
            super(0);
            this.f49304OooO0Oo = mutableState;
            this.f49306OooO0o0 = mutableState2;
            this.f49305OooO0o = mutableState3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            CancellableContinuation<Boolean> value;
            this.f49304OooO0Oo.setValue(null);
            this.f49306OooO0o0.setValue(Boolean.FALSE);
            MutableState<CancellableContinuation<Boolean>> mutableState = this.f49305OooO0o;
            CancellableContinuation<Boolean> value2 = mutableState.getValue();
            if (value2 != null) {
                z = value2.isActive();
            }
            if (z && (value = mutableState.getValue()) != null) {
                Result.Companion companion = Result.INSTANCE;
                value.resumeWith(Result.m4213constructorimpl(Boolean.TRUE));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f49307OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49308OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f49309OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f49307OooO0Oo = mutableState;
            this.f49309OooO0o0 = mutableState2;
            this.f49308OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49308OooO0o | 1);
            o0O0O0Oo.OooO0o(this.f49307OooO0Oo, this.f49309OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(File file, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-563781989);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563781989, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.BadgeComp (RoomEnterTipsComp.kt:275)");
        }
        if (file == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(file, i));
            return;
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "badge.absolutePath");
        p154o00OoO00.OooOo00.OooO0O0(absolutePath, true, 0, false, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, f49216OooO00o), composerStartRestartGroup, 1572912, 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(file, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(BoxScope boxScope, File file, int i, Composer composer, int i2) {
        Alignment center;
        Composer composerStartRestartGroup = composer.startRestartGroup(287702470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(287702470, i2, -1, "com.yalla.yalla.ui.activity.room.live.tips.DisplayEffect (RoomEnterTipsComp.kt:289)");
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            Modifier modifierOooO0Oo = o0O0O00.OooO0Oo(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
            if (i != 1) {
                center = i != 2 ? Alignment.INSTANCE.getCenterStart() : Alignment.INSTANCE.getCenterEnd();
            } else {
                center = Alignment.INSTANCE.getCenter();
            }
            p154o00OoO00.OooOo00.OooO0O0(absolutePath, true, 0, true, null, null, boxScope.align(modifierOooO0Oo, center), composerStartRestartGroup, 3120, 52);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, file, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1787574143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1787574143, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.NormalRoomEnterBg (RoomEnterTipsComp.kt:217)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            oOO ooo = oOO.f56647OooO00o;
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), oO00OOO.icon_room_into_tips_bg_normal);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(context.r…room_into_tips_bg_normal)");
            objRememberedValue = oOO.OooO00o(ooo, bitmapDecodeResource);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        BoxKt.Box(DrawModifierKt.drawBehind(o0O0O00.OooO0Oo(boxScope.matchParentSize(companion), composerStartRestartGroup, 0), new OooO0o((NinePatchDrawable) objRememberedValue)), composerStartRestartGroup, 0);
        o0O0oo0o.OooO00o(roomUserInfoModel, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(12), 0.0f, Dp.m3765constructorimpl(38), 0.0f, 10, null), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, roomUserInfoModel, o0o0o0, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211680784);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1211680784, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RichRoomEnterBg (RoomEnterTipsComp.kt:244)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BoxKt.Box(DrawModifierKt.drawBehind(o0O0O00.OooO0Oo(boxScope.matchParentSize(companion), composerStartRestartGroup, 0), new OooOO0(o0o0o0)), composerStartRestartGroup, 0);
        OooO00o(o0o0o0.f49324OooO0Oo, composerStartRestartGroup, 8);
        int i2 = (i & 14) | 64;
        OooO0O0(boxScope, o0o0o0.f49325OooO0o, o0o0o0.f49321OooO00o, composerStartRestartGroup, i2);
        OooO0O0(boxScope, o0o0o0.f49327OooO0oO, o0o0o0.f49322OooO0O0, composerStartRestartGroup, i2);
        o0O0oo0o.OooO00o(roomUserInfoModel, PaddingKt.m480paddingqDBjuR0$default(companion, o0o0o0.f49324OooO0Oo == null ? Dp.m3765constructorimpl(12) : Dp.m3765constructorimpl(Dp.m3765constructorimpl(2) + f49216OooO00o), 0.0f, Dp.m3765constructorimpl(38), 0.0f, 10, null), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, roomUserInfoModel, o0o0o0, inRoomEffectsInfo, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull MutableState<RoomUserInfoModel> currentEnterUserInfo, @NotNull MutableState<CancellableContinuation<Boolean>> continuationState, @Nullable Composer composer, int i) {
        int i2;
        CancellableContinuation<Boolean> value;
        Intrinsics.checkNotNullParameter(currentEnterUserInfo, "currentEnterUserInfo");
        Intrinsics.checkNotNullParameter(continuationState, "continuationState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1938056181);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(currentEnterUserInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(continuationState) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1938056181, i2, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsComp (RoomEnterTipsComp.kt:56)");
            }
            RoomUserInfoModel value2 = currentEnterUserInfo.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(value2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged2 = composerStartRestartGroup.changed(currentEnterUserInfo) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(continuationState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Oooo0(currentEnterUserInfo, mutableState, continuationState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue2;
            if (value2 == null) {
                currentEnterUserInfo.setValue(null);
                CancellableContinuation<Boolean> value3 = continuationState.getValue();
                if ((value3 != null && value3.isActive()) && (value = continuationState.getValue()) != null) {
                    Result.Companion companion = Result.INSTANCE;
                    value.resumeWith(Result.m4213constructorimpl(Boolean.TRUE));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(currentEnterUserInfo, continuationState, i));
                return;
            }
            RoomUserInfoDTO.InRoomEffectsInfo value4 = value2.getInRoomEffectsInfoEntity().getValue();
            if (value4 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new Oooo000(currentEnterUserInfo, continuationState, i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(value2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new o0O0o0(value4.getEffectsIndex1(), value4.getEffectsIndex2());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0O0o0 o0o0o0 = (o0O0o0) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            EffectsKt.LaunchedEffect(value2, new OooOOOO(o0o0o0, value2, value4, mutableState, mutableState2, null), composerStartRestartGroup, 72);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1790593843, true, new OooOo00(value2, mutableState, value4, o0o0o0, function0, mutableState2)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooOo(currentEnterUserInfo, continuationState, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@Nullable Modifier modifier, @NotNull RoomUserInfoModel userInfoModel, @NotNull RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, @NotNull o0O0o0 showEntity, @NotNull Function0<Unit> resumeNext, @NotNull MutableState<Boolean> isResourceLoadError, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
        Intrinsics.checkNotNullParameter(inRoomEffectsInfo, "inRoomEffectsInfo");
        Intrinsics.checkNotNullParameter(showEntity, "showEntity");
        Intrinsics.checkNotNullParameter(resumeNext, "resumeNext");
        Intrinsics.checkNotNullParameter(isResourceLoadError, "isResourceLoadError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-530924125);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-530924125, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterContainer (RoomEnterTipsComp.kt:190)");
        }
        Modifier modifierM530widthInVpY3zN4$default = SizeKt.m530widthInVpY3zN4$default(PaddingKt.m478paddingVpY3zN4$default(SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier2), f49216OooO00o), Dp.m3765constructorimpl(10), 0.0f, 2, null), Dp.m3765constructorimpl(246), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM530widthInVpY3zN4$default);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (showEntity.f49326OooO0o0 == null || isResourceLoadError.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-1572019089);
            OooO0OO(boxScopeInstance, userInfoModel, showEntity, resumeNext, composerStartRestartGroup, ((i >> 3) & 7168) | 582);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1572019192);
            OooO0Oo(boxScopeInstance, userInfoModel, showEntity, inRoomEffectsInfo, resumeNext, composerStartRestartGroup, (57344 & i) | 4678);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, userInfoModel, inRoomEffectsInfo, showEntity, resumeNext, isResourceLoadError, i, i2));
    }

    public static final void OooO0oO(RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, Function0 function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(501206014);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501206014, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterDisplayCar (RoomEnterTipsComp.kt:318)");
        }
        File value = o0o0o0.f49323OooO0OO.getValue();
        Intrinsics.checkNotNull(value);
        String absolutePath = value.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "showEntity.carDisplay.value!!.absolutePath");
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o0O0O0o0(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p154o00OoO00.OooOo00.OooO0O0(absolutePath, true, 1, false, (Function0) objRememberedValue, new o0O0OO0(o0o0o0), o0O0O00.OooO0Oo(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(174)), composerStartRestartGroup, 6), composerStartRestartGroup, 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0OOO0(roomUserInfoModel, o0o0o0, function0, i));
    }

    public static final void OooO0oo(RoomUserInfoModel roomUserInfoModel, Function0 function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1675745236);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1675745236, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterDisplayTime (RoomEnterTipsComp.kt:342)");
        }
        EffectsKt.LaunchedEffect(roomUserInfoModel, new o0O0OOOo(roomUserInfoModel, function0, null), composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0OOoo(roomUserInfoModel, function0, i));
    }
}
