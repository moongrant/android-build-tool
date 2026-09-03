package p504o0o00oO0;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0OoO.o00OO00O;
import p423o0OoO0OO.o00O00OO;
import p590o0oOooo0.q0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomEnterTipsComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,397:1\n36#2:398\n67#2,3:405\n66#2:408\n36#2:415\n25#2:422\n456#2,8:448\n464#2,3:462\n467#2,3:466\n25#2:472\n36#2:482\n1097#3,6:399\n1097#3,6:409\n1097#3,6:416\n1097#3,6:423\n1097#3,6:473\n1097#3,6:483\n154#4:429\n154#4:430\n154#4:479\n154#4:480\n154#4:489\n154#4:490\n66#5,6:431\n72#5:465\n76#5:470\n78#6,11:437\n91#6:469\n4144#7,6:456\n76#8:471\n51#9:481\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt\n*L\n62#1:398\n64#1:405,3\n64#1:408\n82#1:415\n87#1:422\n205#1:448,8\n205#1:462,3\n205#1:466,3\n231#1:472\n334#1:482\n62#1:399,6\n64#1:409,6\n82#1:416,6\n87#1:423,6\n231#1:473,6\n334#1:483,6\n209#1:429\n210#1:430\n244#1:479\n278#1:480\n343#1:489\n55#1:490\n205#1:431,6\n205#1:465\n205#1:470\n205#1:437,11\n205#1:469\n205#1:456,6\n229#1:471\n278#1:481\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f50187OooO00o = Dp.m3775constructorimpl(60);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final int[] f50188OooO0O0 = {2, 2, 3, 3, 4, 4, 4, 5};

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f50189OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ y f50190OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50191OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50192OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50193OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, y yVar, Function0<Unit> function0, int i) {
            super(2);
            this.f50189OooO0Oo = boxScope;
            this.f50191OooO0o0 = roomUserInfoModel;
            this.f50190OooO0o = yVar;
            this.f50192OooO0oO = function0;
            this.f50193OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            q.OooO0OO(this.f50189OooO0Oo, this.f50191OooO0o0, this.f50190OooO0o, this.f50192OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50193OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f50194OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50195OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(File file, int i) {
            super(2);
            this.f50194OooO0Oo = file;
            this.f50195OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50195OooO0o0 | 1);
            q.OooO00o(this.f50194OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ File f50196OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50197OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(File file, int i) {
            super(2);
            this.f50196OooO0Oo = file;
            this.f50197OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50197OooO0o0 | 1);
            q.OooO00o(this.f50196OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f50198OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50199OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ File f50200OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50201OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, File file, int i, int i2) {
            super(2);
            this.f50198OooO0Oo = boxScope;
            this.f50200OooO0o0 = file;
            this.f50199OooO0o = i;
            this.f50201OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50201OooO0oO | 1);
            File file = this.f50200OooO0o0;
            int i = this.f50199OooO0o;
            q.OooO0O0(this.f50198OooO0Oo, file, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ NinePatchDrawable f50202OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NinePatchDrawable ninePatchDrawable) {
            super(1);
            this.f50202OooO0Oo = ninePatchDrawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            NinePatchDrawable ninePatchDrawable = this.f50202OooO0Oo;
            if (ninePatchDrawable != null) {
                ninePatchDrawable.setBounds(0, 0, (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
            }
            if (ninePatchDrawable != null) {
                ninePatchDrawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y f50203OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(y yVar) {
            super(1);
            this.f50203OooO0Oo = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            y yVar = this.f50203OooO0Oo;
            NinePatchDrawable ninePatchDrawable = yVar.f50306OooO0o0;
            Intrinsics.checkNotNull(ninePatchDrawable);
            ninePatchDrawable.setBounds(0, 0, (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
            NinePatchDrawable ninePatchDrawable2 = yVar.f50306OooO0o0;
            Intrinsics.checkNotNull(ninePatchDrawable2);
            ninePatchDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50204OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f50205OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ y f50206OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50207OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50208OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50209OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, Function0<Unit> function0, int i) {
            super(2);
            this.f50205OooO0Oo = boxScope;
            this.f50207OooO0o0 = roomUserInfoModel;
            this.f50206OooO0o = yVar;
            this.f50208OooO0oO = inRoomEffectsInfo;
            this.f50209OooO0oo = function0;
            this.f50204OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            q.OooO0Oo(this.f50205OooO0Oo, this.f50207OooO0o0, this.f50206OooO0o, this.f50208OooO0oO, this.f50209OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50204OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f50210OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50211OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f50212OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f50210OooO0Oo = mutableState;
            this.f50212OooO0o0 = mutableState2;
            this.f50211OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50211OooO0o | 1);
            q.OooO0o(this.f50210OooO0Oo, this.f50212OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50213OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f50214OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50215OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50216OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ y f50217OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50218OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f50219OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f50220OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, RoomUserInfoModel roomUserInfoModel, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, y yVar, Function0<Unit> function0, MutableState<Boolean> mutableState, int i, int i2) {
            super(2);
            this.f50214OooO0Oo = modifier;
            this.f50216OooO0o0 = roomUserInfoModel;
            this.f50215OooO0o = inRoomEffectsInfo;
            this.f50217OooO0oO = yVar;
            this.f50218OooO0oo = function0;
            this.f50213OooO = mutableState;
            this.f50219OooOO0 = i;
            this.f50220OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            q.OooO0o0(this.f50214OooO0Oo, this.f50216OooO0o0, this.f50215OooO0o, this.f50217OooO0oO, this.f50218OooO0oo, this.f50213OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50219OooOO0 | 1), this.f50220OooOO0O);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2", f = "RoomEnterTipsComp.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, l = {143, 144, 145, 146, 147}, m = "invokeSuspend", n = {"backgroundJob", "badgeJob", "effects1Job", "effects2Job", "badgeJob", "effects1Job", "effects2Job", "effects1Job", "effects2Job", "effects2Job"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ y f50221OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Deferred f50222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Deferred f50223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Deferred f50224OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f50225OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f50226OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50227OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50228OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50229OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50230OooOOO0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$effects2Job$1", f = "RoomEnterTipsComp.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50231OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public y f50232OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ y f50233OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f50234OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50235OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f50236OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50237OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f50233OooO0o = yVar;
                this.f50235OooO0oO = inRoomEffectsInfo;
                this.f50236OooO0oo = coroutineScope;
                this.f50231OooO = mutableState;
                this.f50237OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO(this.f50233OooO0o, this.f50235OooO0oO, this.f50236OooO0oo, this.f50231OooO, this.f50237OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                y yVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f50234OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    q0 q0Var = q0.f57260OooO00o;
                    String effectsUrl2 = this.f50235OooO0oO.getEffectsUrl2();
                    y yVar2 = this.f50233OooO0o;
                    this.f50232OooO0Oo = yVar2;
                    this.f50234OooO0o0 = 1;
                    q0Var.getClass();
                    obj = q0.OooO0O0(effectsUrl2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = this.f50232OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f50236OooO0oo, this.f50231OooO, this.f50237OooOO0);
                yVar.f50307OooO0oO = (File) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$backgroundJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50238OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public y f50239OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ y f50240OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f50241OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50242OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f50243OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50244OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f50240OooO0o = yVar;
                this.f50242OooO0oO = inRoomEffectsInfo;
                this.f50243OooO0oo = coroutineScope;
                this.f50238OooO = mutableState;
                this.f50244OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f50240OooO0o, this.f50242OooO0oO, this.f50243OooO0oo, this.f50238OooO, this.f50244OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                y yVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f50241OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    q0 q0Var = q0.f57260OooO00o;
                    String strOooO0oO = p184o00o00O0.OooO0OO.OooO0oO(o0000O0.OooO00o(246), o0000O0.OooO00o(60), this.f50242OooO0oO.getBackgroundUrl());
                    y yVar2 = this.f50240OooO0o;
                    this.f50239OooO0Oo = yVar2;
                    this.f50241OooO0o0 = 1;
                    obj = q0Var.OooO0OO(strOooO0oO, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = this.f50239OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f50243OooO0oo, this.f50238OooO, this.f50244OooOO0);
                yVar.f50306OooO0o0 = (NinePatchDrawable) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$badgeJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50245OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public y f50246OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ y f50247OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f50248OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50249OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f50250OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50251OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f50247OooO0o = yVar;
                this.f50249OooO0oO = inRoomEffectsInfo;
                this.f50250OooO0oo = coroutineScope;
                this.f50245OooO = mutableState;
                this.f50251OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f50247OooO0o, this.f50249OooO0oO, this.f50250OooO0oo, this.f50245OooO, this.f50251OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                y yVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f50248OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    q0 q0Var = q0.f57260OooO00o;
                    String badgeUrl = this.f50249OooO0oO.getBadgeUrl();
                    y yVar2 = this.f50247OooO0o;
                    this.f50246OooO0Oo = yVar2;
                    this.f50248OooO0o0 = 1;
                    q0Var.getClass();
                    obj = q0.OooO0O0(badgeUrl, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = this.f50246OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f50250OooO0oo, this.f50245OooO, this.f50251OooOO0);
                yVar.f50304OooO0Oo = (File) obj;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$carDisplayJob$1", f = "RoomEnterTipsComp.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50252OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public MutableState f50253OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ y f50254OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f50255OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoModel f50256OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f50257OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50258OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(y yVar, RoomUserInfoModel roomUserInfoModel, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f50254OooO0o = yVar;
                this.f50256OooO0oO = roomUserInfoModel;
                this.f50257OooO0oo = coroutineScope;
                this.f50252OooO = mutableState;
                this.f50258OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0OO(this.f50254OooO0o, this.f50256OooO0oO, this.f50257OooO0oo, this.f50252OooO, this.f50258OooOO0, continuation);
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
                int i = this.f50255OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableState<File> mutableState2 = this.f50254OooO0o.f50303OooO0OO;
                    q0 q0Var = q0.f57260OooO00o;
                    String value = this.f50256OooO0oO.getVehicleSVGAUrl().getValue();
                    this.f50253OooO0Oo = mutableState2;
                    this.f50255OooO0o0 = 1;
                    q0Var.getClass();
                    Object objOooO0O0 = q0.OooO0O0(value, this);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objOooO0O0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState = this.f50253OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f50257OooO0oo, this.f50252OooO, this.f50258OooOO0);
                mutableState.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsCompKt$RoomEnterTipsComp$2$effects1Job$1", f = "RoomEnterTipsComp.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50259OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public y f50260OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ y f50261OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f50262OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50263OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f50264OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f50265OooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f50261OooO0o = yVar;
                this.f50263OooO0oO = inRoomEffectsInfo;
                this.f50264OooO0oo = coroutineScope;
                this.f50259OooO = mutableState;
                this.f50265OooOO0 = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0o(this.f50261OooO0o, this.f50263OooO0oO, this.f50264OooO0oo, this.f50259OooO, this.f50265OooOO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                y yVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f50262OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    q0 q0Var = q0.f57260OooO00o;
                    String effectsUrl1 = this.f50263OooO0oO.getEffectsUrl1();
                    y yVar2 = this.f50261OooO0o;
                    this.f50260OooO0Oo = yVar2;
                    this.f50262OooO0o0 = 1;
                    q0Var.getClass();
                    obj = q0.OooO0O0(effectsUrl1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yVar = yVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = this.f50260OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                OooOOOO.OooO00o(obj, this.f50264OooO0oo, this.f50259OooO, this.f50265OooOO0);
                yVar.f50305OooO0o = (File) obj;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(y yVar, RoomUserInfoModel roomUserInfoModel, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f50221OooO = yVar;
            this.f50227OooOO0 = roomUserInfoModel;
            this.f50228OooOO0O = inRoomEffectsInfo;
            this.f50229OooOO0o = mutableState;
            this.f50230OooOOO0 = mutableState2;
        }

        public static final void OooO00o(Object obj, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2) {
            if (obj == null) {
                o0000O00.OooO0O0("RoomEnterTipsManager:  cancel");
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                Boolean bool = Boolean.TRUE;
                mutableState.setValue(bool);
                mutableState2.setValue(bool);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f50221OooO, this.f50227OooOO0, this.f50228OooOO0O, this.f50229OooOO0o, this.f50230OooOOO0, continuation);
            oooOOOO.f50226OooO0oo = obj;
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
            int i = this.f50225OooO0oO;
            y yVar = this.f50221OooO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f50226OooO0oo;
                o0000O00.OooO0O0("RoomEnterTipsManager  start:  " + yVar);
                RoomUserInfoModel roomUserInfoModel = this.f50227OooOO0;
                Deferred deferredOooO00o4 = (TextUtils.isEmpty(roomUserInfoModel.getVehicleSVGAUrl().getValue()) || !StringsKt__StringsJVMKt.endsWith$default(o00O00OO.OooO0oo(roomUserInfoModel.getVehicleSVGAUrl().getValue()), ".svga", false, 2, null)) ? null : com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0OO(this.f50221OooO, this.f50227OooOO0, coroutineScope, this.f50230OooOOO0, this.f50229OooOO0o, null));
                deferredOooO00o = com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO00o(this.f50221OooO, this.f50228OooOO0O, coroutineScope, this.f50230OooOOO0, this.f50229OooOO0o, null));
                RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo = this.f50228OooOO0O;
                Deferred deferredOooO00o5 = StringsKt.isBlank(inRoomEffectsInfo.getBadgeUrl()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0O0(this.f50221OooO, this.f50228OooOO0O, coroutineScope, this.f50230OooOOO0, this.f50229OooOO0o, null)) : null;
                deferredOooO00o2 = StringsKt.isBlank(inRoomEffectsInfo.getEffectsUrl1()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO0o(this.f50221OooO, this.f50228OooOO0O, coroutineScope, this.f50230OooOOO0, this.f50229OooOO0o, null)) : null;
                deferredOooO00o3 = StringsKt.isBlank(inRoomEffectsInfo.getEffectsUrl2()) ^ true ? com.code.android.util.OooOOO.OooO00o(coroutineScope, new OooO(this.f50221OooO, this.f50228OooOO0O, coroutineScope, this.f50230OooOOO0, this.f50229OooOO0o, null)) : null;
                if (deferredOooO00o4 != null) {
                    this.f50226OooO0oo = deferredOooO00o;
                    this.f50222OooO0Oo = deferredOooO00o5;
                    this.f50224OooO0o0 = deferredOooO00o2;
                    this.f50223OooO0o = deferredOooO00o3;
                    this.f50225OooO0oO = 1;
                    if (deferredOooO00o4.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred2 = deferredOooO00o;
                    deferred3 = deferredOooO00o5;
                    deferred4 = deferredOooO00o2;
                } else {
                    deferred = deferredOooO00o5;
                }
                this.f50226OooO0oo = deferred;
                this.f50222OooO0Oo = deferredOooO00o2;
                this.f50224OooO0o0 = deferredOooO00o3;
                deferred5 = null;
                this.f50223OooO0o = null;
                this.f50225OooO0oO = 2;
                if (deferredOooO00o.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred6 = deferredOooO00o2;
                if (deferred != null) {
                    this.f50226OooO0oo = deferred6;
                    this.f50222OooO0Oo = deferredOooO00o3;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 3;
                    if (deferred.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferred6 != null) {
                    this.f50226OooO0oo = deferredOooO00o3;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f50226OooO0oo = deferred5;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o0000O00.OooO0O0("RoomEnterTipsManager load success:  " + yVar);
                this.f50229OooOO0o.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            if (i == 1) {
                deferredOooO00o3 = this.f50223OooO0o;
                deferred4 = this.f50224OooO0o0;
                deferred3 = this.f50222OooO0Oo;
                deferred2 = (Deferred) this.f50226OooO0oo;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                deferredOooO00o3 = this.f50224OooO0o0;
                Deferred deferred7 = this.f50222OooO0Oo;
                deferred = (Deferred) this.f50226OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred6 = deferred7;
                deferred5 = null;
                if (deferred != null) {
                    this.f50226OooO0oo = deferred6;
                    this.f50222OooO0Oo = deferredOooO00o3;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 3;
                    if (deferred.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferred6 != null) {
                    this.f50226OooO0oo = deferredOooO00o3;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f50226OooO0oo = deferred5;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 3) {
                deferredOooO00o3 = this.f50222OooO0Oo;
                deferred6 = (Deferred) this.f50226OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred5 = null;
                if (deferred6 != null) {
                    this.f50226OooO0oo = deferredOooO00o3;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 4;
                    if (deferred6.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (deferredOooO00o3 != null) {
                    this.f50226OooO0oo = deferred5;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 5;
                    if (deferredOooO00o3.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 4) {
                deferredOooO00o3 = (Deferred) this.f50226OooO0oo;
                ResultKt.throwOnFailure(obj);
                deferred5 = null;
                if (deferredOooO00o3 != null) {
                    this.f50226OooO0oo = deferred5;
                    this.f50222OooO0Oo = deferred5;
                    this.f50224OooO0o0 = deferred5;
                    this.f50225OooO0oO = 5;
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
            o0000O00.OooO0O0("RoomEnterTipsManager load success:  " + yVar);
            this.f50229OooOO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
            deferredOooO00o2 = deferred4;
            deferred = deferred3;
            deferredOooO00o = deferred2;
            this.f50226OooO0oo = deferred;
            this.f50222OooO0Oo = deferredOooO00o2;
            this.f50224OooO0o0 = deferredOooO00o3;
            deferred5 = null;
            this.f50223OooO0o = null;
            this.f50225OooO0oO = 2;
            if (deferredOooO00o.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred6 = deferredOooO00o2;
            if (deferred != null) {
                this.f50226OooO0oo = deferred6;
                this.f50222OooO0Oo = deferredOooO00o3;
                this.f50224OooO0o0 = deferred5;
                this.f50225OooO0oO = 3;
                if (deferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (deferred6 != null) {
                this.f50226OooO0oo = deferredOooO00o3;
                this.f50222OooO0Oo = deferred5;
                this.f50224OooO0o0 = deferred5;
                this.f50225OooO0oO = 4;
                if (deferred6.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (deferredOooO00o3 != null) {
                this.f50226OooO0oo = deferred5;
                this.f50222OooO0Oo = deferred5;
                this.f50224OooO0o0 = deferred5;
                this.f50225OooO0oO = 5;
                if (deferredOooO00o3.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            o0000O00.OooO0O0("RoomEnterTipsManager load success:  " + yVar);
            this.f50229OooOO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomEnterTipsComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt$RoomEnterTipsComp$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,397:1\n66#2,6:398\n72#2:432\n76#2:437\n78#3,11:404\n91#3:436\n456#4,8:415\n464#4,3:429\n467#4,3:433\n4144#5,6:423\n*S KotlinDebug\n*F\n+ 1 RoomEnterTipsComp.kt\ncom/yalla/yalla/ui/activity/room/live/tips/RoomEnterTipsCompKt$RoomEnterTipsComp$4\n*L\n162#1:398,6\n162#1:432\n162#1:437\n162#1:404,11\n162#1:436\n162#1:415,8\n162#1:429,3\n162#1:433,3\n162#1:423,6\n*E\n"})
    public static final class OooOo extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50266OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f50267OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoDTO.InRoomEffectsInfo f50268OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50269OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ y f50270OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50271OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RoomUserInfoModel roomUserInfoModel, MutableState<Boolean> mutableState, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, y yVar, Function0<Unit> function0, MutableState<Boolean> mutableState2) {
            super(3);
            this.f50267OooO0Oo = roomUserInfoModel;
            this.f50269OooO0o0 = mutableState;
            this.f50268OooO0o = inRoomEffectsInfo;
            this.f50270OooO0oO = yVar;
            this.f50271OooO0oo = function0;
            this.f50266OooO = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1790593843, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsComp.<anonymous> (RoomEnterTipsComp.kt:161)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new w(this.f50267OooO0Oo), 253);
            RoomUserInfoModel roomUserInfoModel = this.f50267OooO0Oo;
            RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo = this.f50268OooO0o;
            y yVar = this.f50270OooO0oO;
            Function0<Unit> function0 = this.f50271OooO0oo;
            MutableState<Boolean> mutableState = this.f50266OooO;
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(992402387);
            if (this.f50269OooO0o0.getValue().booleanValue()) {
                q.OooO0o0(boxScopeInstance.align(companion, companion2.getBottomStart()), roomUserInfoModel, inRoomEffectsInfo, yVar, function0, mutableState, composer2, 201280, 0);
            }
            composer2.endReplaceableGroup();
            if (yVar.f50303OooO0OO.getValue() != null) {
                composer2.startReplaceableGroup(992402798);
                q.OooO0oO(roomUserInfoModel, yVar, function0, composer2, 72);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(992402929);
                q.OooO0oo(roomUserInfoModel, function0, composer2, 8);
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f50272OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f50273OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50274OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f50275OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f50273OooO0Oo = mutableState;
            this.f50275OooO0o0 = mutableState2;
            this.f50274OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50274OooO0o | 1);
            q.OooO0o(this.f50273OooO0Oo, this.f50275OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f50276OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50277OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f50278OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<RoomUserInfoModel> mutableState, MutableState<CancellableContinuation<Boolean>> mutableState2, int i) {
            super(2);
            this.f50276OooO0Oo = mutableState;
            this.f50278OooO0o0 = mutableState2;
            this.f50277OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50277OooO0o | 1);
            q.OooO0o(this.f50276OooO0Oo, this.f50278OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomUserInfoModel> f50279OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<CancellableContinuation<Boolean>> f50280OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50281OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableState<RoomUserInfoModel> mutableState, MutableState<Boolean> mutableState2, MutableState<CancellableContinuation<Boolean>> mutableState3) {
            super(0);
            this.f50279OooO0Oo = mutableState;
            this.f50281OooO0o0 = mutableState2;
            this.f50280OooO0o = mutableState3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            CancellableContinuation<Boolean> value;
            this.f50279OooO0Oo.setValue(null);
            this.f50281OooO0o0.setValue(Boolean.FALSE);
            MutableState<CancellableContinuation<Boolean>> mutableState = this.f50280OooO0o;
            CancellableContinuation<Boolean> value2 = mutableState.getValue();
            if (value2 != null) {
                z = value2.isActive();
            }
            if (z && (value = mutableState.getValue()) != null) {
                Result.Companion companion = Result.INSTANCE;
                value.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(File file, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-563781989);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563781989, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.BadgeComp (RoomEnterTipsComp.kt:281)");
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
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        o00OO00O.OooO0O0(absolutePath, true, 0, false, null, null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f50187OooO00o), composerStartRestartGroup, 1572912, 60);
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
            ComposerKt.traceEventStart(287702470, i2, -1, "com.yalla.yalla.ui.activity.room.live.tips.DisplayEffect (RoomEnterTipsComp.kt:295)");
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            Modifier modifierOooO0Oo = o0O0O00.OooO0Oo(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
            if (i != 1) {
                center = i != 2 ? Alignment.INSTANCE.getCenterStart() : Alignment.INSTANCE.getCenterEnd();
            } else {
                center = Alignment.INSTANCE.getCenter();
            }
            o00OO00O.OooO0O0(absolutePath, true, 0, true, null, null, boxScope.align(modifierOooO0Oo, center), composerStartRestartGroup, 3120, 52);
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
    public static final void OooO0OO(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, y yVar, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1787574143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1787574143, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.NormalRoomEnterBg (RoomEnterTipsComp.kt:227)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            q0 q0Var = q0.f57260OooO00o;
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), p562o0oOo000.o0O0O00.icon_room_into_tips_bg_normal);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            objRememberedValue = q0.OooO00o(q0Var, bitmapDecodeResource);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        BoxKt.Box(DrawModifierKt.drawBehind(o0O0O00.OooO0Oo(boxScope.matchParentSize(companion), composerStartRestartGroup, 0), new OooO0o((NinePatchDrawable) objRememberedValue)), composerStartRestartGroup, 0);
        p.OooO00o(roomUserInfoModel, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(12), 0.0f, Dp.m3775constructorimpl(38), 0.0f, 10, null), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, roomUserInfoModel, yVar, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, y yVar, RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211680784);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1211680784, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RichRoomEnterBg (RoomEnterTipsComp.kt:255)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BoxKt.Box(DrawModifierKt.drawBehind(o0O0O00.OooO0Oo(boxScope.matchParentSize(companion), composerStartRestartGroup, 0), new OooOO0(yVar)), composerStartRestartGroup, 0);
        OooO00o(yVar.f50304OooO0Oo, composerStartRestartGroup, 8);
        int i2 = (i & 14) | 64;
        OooO0O0(boxScope, yVar.f50305OooO0o, yVar.f50301OooO00o, composerStartRestartGroup, i2);
        OooO0O0(boxScope, yVar.f50307OooO0oO, yVar.f50302OooO0O0, composerStartRestartGroup, i2);
        p.OooO00o(roomUserInfoModel, PaddingKt.m482paddingqDBjuR0$default(companion, yVar.f50304OooO0Oo == null ? Dp.m3775constructorimpl(12) : Dp.m3775constructorimpl(Dp.m3775constructorimpl(2) + f50187OooO00o), 0.0f, Dp.m3775constructorimpl(38), 0.0f, 10, null), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, roomUserInfoModel, yVar, inRoomEffectsInfo, function0, i));
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
                ComposerKt.traceEventStart(1938056181, i2, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsComp (RoomEnterTipsComp.kt:57)");
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
                objRememberedValue2 = new o000oOoO(currentEnterUserInfo, mutableState, continuationState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue2;
            if (value2 == null) {
                currentEnterUserInfo.setValue(null);
                CancellableContinuation<Boolean> value3 = continuationState.getValue();
                if ((value3 != null && value3.isActive()) && (value = continuationState.getValue()) != null) {
                    Result.Companion companion = Result.INSTANCE;
                    value.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
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
                scopeUpdateScopeEndRestartGroup2.updateScope(new Oooo0(currentEnterUserInfo, continuationState, i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(value2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new y(value4.getEffectsIndex1(), value4.getEffectsIndex2());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            y yVar = (y) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            EffectsKt.LaunchedEffect(value2, new OooOOOO(yVar, value2, value4, mutableState, mutableState2, null), composerStartRestartGroup, 72);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooOo00.f50272OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1790593843, true, new OooOo(value2, mutableState, value4, yVar, function0, mutableState2)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new Oooo000(currentEnterUserInfo, continuationState, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@Nullable Modifier modifier, @NotNull RoomUserInfoModel userInfoModel, @NotNull RoomUserInfoDTO.InRoomEffectsInfo inRoomEffectsInfo, @NotNull y showEntity, @NotNull Function0<Unit> resumeNext, @NotNull MutableState<Boolean> isResourceLoadError, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
        Intrinsics.checkNotNullParameter(inRoomEffectsInfo, "inRoomEffectsInfo");
        Intrinsics.checkNotNullParameter(showEntity, "showEntity");
        Intrinsics.checkNotNullParameter(resumeNext, "resumeNext");
        Intrinsics.checkNotNullParameter(isResourceLoadError, "isResourceLoadError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-530924125);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-530924125, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterContainer (RoomEnterTipsComp.kt:203)");
        }
        Modifier modifierM532widthInVpY3zN4$default = SizeKt.m532widthInVpY3zN4$default(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(Modifier.INSTANCE.then(modifier2), f50187OooO00o), Dp.m3775constructorimpl(10), 0.0f, 2, null), Dp.m3775constructorimpl(246), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM532widthInVpY3zN4$default);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (showEntity.f50306OooO0o0 == null || isResourceLoadError.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-1572018969);
            OooO0OO(boxScopeInstance, userInfoModel, showEntity, resumeNext, composerStartRestartGroup, ((i >> 3) & 7168) | 582);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1572019072);
            OooO0Oo(boxScopeInstance, userInfoModel, showEntity, inRoomEffectsInfo, resumeNext, composerStartRestartGroup, (57344 & i) | 4678);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, userInfoModel, inRoomEffectsInfo, showEntity, resumeNext, isResourceLoadError, i, i2));
    }

    public static final void OooO0oO(RoomUserInfoModel roomUserInfoModel, y yVar, Function0 function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(501206014);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501206014, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterDisplayCar (RoomEnterTipsComp.kt:328)");
        }
        File value = yVar.f50303OooO0OO.getValue();
        Intrinsics.checkNotNull(value);
        String absolutePath = value.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new r(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o00OO00O.OooO0O0(absolutePath, true, 1, false, (Function0) objRememberedValue, new s(yVar), o0O0O00.OooO0Oo(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(174)), composerStartRestartGroup, 6), composerStartRestartGroup, 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new t(roomUserInfoModel, yVar, function0, i));
    }

    public static final void OooO0oo(RoomUserInfoModel roomUserInfoModel, Function0 function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1675745236);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1675745236, i, -1, "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterDisplayTime (RoomEnterTipsComp.kt:348)");
        }
        EffectsKt.LaunchedEffect(roomUserInfoModel, new u(roomUserInfoModel, function0, null), composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new v(roomUserInfoModel, function0, i));
    }
}
