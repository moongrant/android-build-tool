package p455o0Ooo0O0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import com.app.selectPicture.view.photoview.PhotoView;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.module.media.camera.CameraScreenKt;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.File;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.o0OO00OO;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OO0oO0;
import p468o0OoooO0.o0OOOO00;
import p468o0OoooO0.o0OOo000;
import p468o0OoooO0.o0o0000;
import p469o0OoooOO.o0oO0O0o;
import p547o0oOO0Oo.o000O0O0;
import p549o0oOOOoo.o0O0o00O;
import p578o0oOoOoo.oOOO000o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMediaPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,585:1\n66#2,6:586\n72#2:620\n66#2,6:623\n72#2:657\n76#2:662\n76#2:682\n66#2,6:698\n72#2:732\n76#2:798\n78#3,11:592\n78#3,11:629\n91#3:661\n91#3:681\n78#3,11:704\n91#3:797\n456#4,8:603\n464#4,3:617\n456#4,8:640\n464#4,3:654\n467#4,3:658\n25#4:663\n50#4:670\n49#4:671\n467#4,3:678\n25#4:683\n36#4:690\n456#4,8:715\n464#4,3:729\n36#4:733\n36#4:742\n36#4:749\n25#4:756\n25#4:768\n467#4,3:794\n4144#5,6:611\n4144#5,6:648\n4144#5,6:723\n154#6:621\n154#6:622\n154#6:697\n154#6:740\n154#6:741\n154#6:779\n154#6:780\n154#6:781\n154#6:782\n154#6,11:783\n154#6:799\n1097#7,6:664\n1097#7,6:672\n1097#7,6:684\n1097#7,6:691\n1097#7,6:734\n1097#7,6:743\n1097#7,6:750\n1097#7,6:757\n1097#7,3:769\n1100#7,3:775\n76#8:763\n486#9,4:764\n490#9,2:772\n494#9:778\n486#10:774\n88#11:800\n*S KotlinDebug\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt\n*L\n88#1:586,6\n88#1:620\n95#1:623,6\n95#1:657\n95#1:662\n88#1:682\n214#1:698,6\n214#1:732\n214#1:798\n88#1:592,11\n95#1:629,11\n95#1:661\n88#1:681\n214#1:704,11\n214#1:797\n88#1:603,8\n88#1:617,3\n95#1:640,8\n95#1:654,3\n95#1:658,3\n155#1:663\n159#1:670\n159#1:671\n88#1:678,3\n174#1:683\n209#1:690\n214#1:715,8\n214#1:729,3\n229#1:733\n247#1:742\n259#1:749\n278#1:756\n282#1:768\n214#1:794,3\n88#1:611,6\n95#1:648,6\n214#1:723,6\n106#1:621\n109#1:622\n218#1:697\n238#1:740\n240#1:741\n289#1:779\n290#1:780\n301#1:781\n303#1:782\n324#1:783,11\n340#1:799\n155#1:664,6\n159#1:672,6\n174#1:684,6\n209#1:691,6\n229#1:734,6\n247#1:743,6\n259#1:750,6\n278#1:757,6\n282#1:769,3\n282#1:775,3\n281#1:763\n282#1:764,4\n282#1:772,2\n282#1:778\n282#1:774\n340#1:800\n*E\n"})
public final class o00Oo0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46509OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46510OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f46509OooO0Oo = mutableState;
            this.f46510OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46509OooO0Oo.setValue(Boolean.FALSE);
            this.f46510OooO0o0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46511OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() / 2);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46512OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(3);
            this.f46512OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439951239, iIntValue, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen.<anonymous>.<anonymous> (MediaPreviewScreen.kt:130)");
            }
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46512OooO0Oo;
            if (oo0o0oo.f46613OooOOOo.getValue().booleanValue()) {
                com.yalla.yalla.module.media.preview.OooO0O0.OooO00o(oo0o0oo, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f46513OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() / 2);
        }
    }

    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46514OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(3);
            this.f46514OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204148290, iIntValue, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen.<anonymous>.<anonymous> (MediaPreviewScreen.kt:145)");
            }
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46514OooO0Oo;
            if (!oo0o0oo.f46613OooOOOo.getValue().booleanValue()) {
                p455o0Ooo0O0.o00O0O.OooO0O0(oo0o0oo, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46515OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46516OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f46517OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f46518OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46519OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, p455o0Ooo0O0.oo0o0Oo oo0o0oo, Function1<? super Uri, Unit> function2, int i) {
            super(2);
            this.f46515OooO0Oo = function0;
            this.f46517OooO0o0 = function1;
            this.f46516OooO0o = oo0o0oo;
            this.f46518OooO0oO = function2;
            this.f46519OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f46515OooO0Oo, this.f46517OooO0o0, this.f46516OooO0o, this.f46518OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46519OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Context, PhotoView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f46520OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PhotoView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return new PhotoView(it);
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46521OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46522OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(p455o0Ooo0O0.oo0o0Oo oo0o0oo, int i) {
            super(2);
            this.f46521OooO0Oo = oo0o0oo;
            this.f46522OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46522OooO0o0 | 1);
            o00Oo0.OooO0O0(this.f46521OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<PhotoView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46523OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46523OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PhotoView photoView) {
            PhotoView it = photoView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setImageURI(this.f46523OooO0Oo.OooO0Oo().getUri());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46524OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46524OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("106097", MapsKt.mapOf(new Pair("state", 0)));
            this.f46524OooO0Oo.f46602OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46525OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46526OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MutableState mutableState, p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46525OooO0Oo = oo0o0oo;
            this.f46526OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("106097", MapsKt.mapOf(new Pair("state", 0)));
            this.f46525OooO0Oo.f46602OooO0Oo.setValue(Boolean.TRUE);
            this.f46526OooO0o0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46527OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46528OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46529OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState mutableState, p455o0Ooo0O0.oo0o0Oo oo0o0oo, Function0 function0) {
            super(0);
            this.f46527OooO0Oo = mutableState;
            this.f46529OooO0o0 = function0;
            this.f46528OooO0o = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("106097", MapsKt.mapOf(new Pair("state", 1)));
            this.f46527OooO0Oo.setValue(Boolean.FALSE);
            this.f46529OooO0o0.invoke();
            Lazy lazy = o0OO0.f46906OooO00o;
            MediaVideoInfo videoInfo = this.f46528OooO0o.OooO0Oo().getVideoInfo();
            com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0OO00OO(videoInfo != null ? videoInfo.getVideoItemList() : null, null));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f46530OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(Function1<? super SelectMusicModel, Unit> function1) {
            super(0);
            this.f46530OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("106098");
            this.f46530OooO0Oo.invoke(null);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46531OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o0OOO0o o0ooo0o2) {
            super(0);
            this.f46531OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46531OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$showCompressCancelOrError$2", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public o00000(Continuation<? super o00000> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o00000(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000O00O.OooO0O0(o0000.OooO0OO(p450o0Ooo00.OooO.process_video_error));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMediaPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt$VideoPreviewComp$6\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,585:1\n63#2,5:586\n*S KotlinDebug\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt$VideoPreviewComp$6\n*L\n377#1:586,5\n*E\n"})
    public static final class o000000 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46532OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46532OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new p455o0Ooo0O0.oo000o(this.f46532OooO0Oo);
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46533OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46534OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(p455o0Ooo0O0.oo0o0Oo oo0o0oo, int i) {
            super(2);
            this.f46533OooO0Oo = oo0o0oo;
            this.f46534OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46534OooO0o0 | 1);
            o00Oo0.OooO0Oo(this.f46533OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$showCompressCancelOrError$3", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46535OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(p455o0Ooo0O0.oo0o0Oo oo0o0oo, Continuation<? super o00000O0> continuation) {
            super(2, continuation);
            this.f46535OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000O0(this.f46535OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f46535OooO0Oo.OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46536OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46536OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO0O0.OooO00o("_PreView", "MediaPreviewScreen  VideoPreviewComp  play pause");
            o0OOo000.OooO0OO oooO0OOOooO0o0 = this.f46536OooO0Oo.OooO0o0();
            if (oooO0OOOooO0o0 != null) {
                oooO0OOOooO0o0.OooO0o(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46537OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46537OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46537OooO0Oo;
            oo0o0oo.f46603OooO0o.setValue(null);
            oo0o0oo.f46605OooO0oO.setValue(null);
            oo0o0oo.f46607OooOO0.setIntValue(100);
            o0OOo000.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46538OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46538OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46538OooO0Oo;
            oo0o0oo.OooO0OO().f46590OooO0O0.setLongValue(jLongValue);
            oo0o0oo.OooOO0();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0O0.o00Oo0$o00Oo0, reason: collision with other inner class name */
    public static final class C0477o00Oo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46539OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0477o00Oo0(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46539OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46539OooO0Oo;
                oo0o0oo.getClass();
                o0OO0O0.OooO00o("_PreviewVM", "resetBackgroundMusic");
                oo0o0oo.OooOO0O();
                oo0o0oo.OooO(false);
                oo0o0oo.OooOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46540OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46540OooO0Oo = oo0o0oo;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0074  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MediaVideoInfo videoInfo;
            MediaVideoInfo videoInfo2;
            o0OO000.OooO00o("106104");
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46540OooO0Oo;
            oo0o0oo.f46613OooOOOo.setValue(Boolean.FALSE);
            MediaVideoInfo videoInfo3 = oo0o0oo.OooO0Oo().getVideoInfo();
            if (videoInfo3 != null && oo0o0oo.OooO0o().f46574OooO0OO.getLongValue() == videoInfo3.getVideoPlayRangeStart()) {
                MediaVideoInfo videoInfo4 = oo0o0oo.OooO0Oo().getVideoInfo();
                if (!(videoInfo4 != null && oo0o0oo.OooO0o().f46575OooO0Oo.getLongValue() == videoInfo4.getVideoPlayRangeEnd())) {
                    videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
                    if (videoInfo != null) {
                        videoInfo.setVideoPlayRangeStart(oo0o0oo.OooO0o().f46574OooO0OO.getLongValue());
                    }
                    videoInfo2 = oo0o0oo.OooO0Oo().getVideoInfo();
                    if (videoInfo2 != null) {
                        videoInfo2.setVideoPlayRangeEnd(oo0o0oo.OooO0o().f46575OooO0Oo.getLongValue());
                    }
                }
            } else {
                videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
                if (videoInfo != null) {
                    videoInfo.setVideoPlayRangeStart(oo0o0oo.OooO0o().f46574OooO0OO.getLongValue());
                }
                videoInfo2 = oo0o0oo.OooO0Oo().getVideoInfo();
                if (videoInfo2 != null) {
                    videoInfo2.setVideoPlayRangeEnd(oo0o0oo.OooO0o().f46575OooO0Oo.getLongValue());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46541OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(o0OOO0o o0ooo0o2) {
            super(0);
            this.f46541OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46541OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46542OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(0);
            this.f46542OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO0O0.OooO00o("_PreView", "MediaPreviewScreen  VideoPreviewComp  play resume ");
            this.f46542OooO0Oo.OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function3<Float, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46543OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(3);
            this.f46543OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46543OooO0Oo;
            oo0o0oo.f46608OooOO0O.setFloatValue(fFloatValue);
            oo0o0oo.f46615OooOOo0.setLongValue(jLongValue);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46544OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46545OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46546OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(MutableState mutableState, p455o0Ooo0O0.oo0o0Oo oo0o0oo, Function0 function0) {
            super(0);
            this.f46544OooO0Oo = oo0o0oo;
            this.f46546OooO0o0 = function0;
            this.f46545OooO0o = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006e  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46544OooO0Oo;
            if (oo0o0oo.OooO0Oo().isPicture()) {
                this.f46546OooO0o0.invoke();
            } else {
                MutableState<Boolean> mutableState = oo0o0oo.f46613OooOOOo;
                if (mutableState.getValue().booleanValue()) {
                    o0OO000.OooO00o("106103");
                    mutableState.setValue(Boolean.FALSE);
                    MediaVideoInfo videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
                    if (videoInfo != null && oo0o0oo.OooO0o().f46574OooO0OO.getLongValue() == videoInfo.getVideoPlayRangeStart()) {
                        MediaVideoInfo videoInfo2 = oo0o0oo.OooO0Oo().getVideoInfo();
                        if (!(videoInfo2 != null && oo0o0oo.OooO0o().f46575OooO0Oo.getLongValue() == videoInfo2.getVideoPlayRangeEnd())) {
                            oo0o0oo.OooOO0();
                        }
                    } else {
                        oo0o0oo.OooOO0();
                    }
                } else if (!oo0o0oo.OooO0Oo().isPicture()) {
                    o0OO000.OooO00o("106096");
                    oo0o0oo.f46602OooO0Oo.setValue(Boolean.FALSE);
                    this.f46545OooO0o.setValue(Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function1<o0OOo000.OooO0OO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46547OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46547OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOo000.OooO0OO oooO0OO) {
            o0OOo000.OooO0OO it = oooO0OO;
            Intrinsics.checkNotNullParameter(it, "it");
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46547OooO0Oo;
            oo0o0oo.f46600OooO0O0.setValue(it);
            it.OooO0oo(!oo0o0oo.f46612OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<SelectMusicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f46548OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(Function1<? super SelectMusicModel, Unit> function1) {
            super(1);
            this.f46548OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SelectMusicModel selectMusicModel) {
            this.f46548OooO0Oo.invoke(selectMusicModel);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46549OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46550OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f46551OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f46552OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46553OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0ooOOo(Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, p455o0Ooo0O0.oo0o0Oo oo0o0oo, Function1<? super Uri, Unit> function2, int i) {
            super(2);
            this.f46549OooO0Oo = function0;
            this.f46551OooO0o0 = function1;
            this.f46550OooO0o = oo0o0oo;
            this.f46552OooO0oO = function2;
            this.f46553OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Oo0.OooO0OO(this.f46549OooO0Oo, this.f46551OooO0o0, this.f46550OooO0o, this.f46552OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46553OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46554OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46555OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f46556OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f46557OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f46558OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public oo000o(p455o0Ooo0O0.oo0o0Oo oo0o0oo, Context context, MutableState<Boolean> mutableState, CoroutineScope coroutineScope, Function1<? super Uri, Unit> function1) {
            super(0);
            this.f46554OooO0Oo = oo0o0oo;
            this.f46556OooO0o0 = context;
            this.f46555OooO0o = mutableState;
            this.f46557OooO0oO = coroutineScope;
            this.f46558OooO0oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46554OooO0Oo;
            if (oo0o0oo.OooO0Oo().isFileNotExit()) {
                o000O00O.OooO0O0(o0000.OooO0OO(p450o0Ooo00.OooO.open_file_error));
            } else {
                if (!oo0o0oo.OooO0Oo().isPicture()) {
                    o0OO000.OooO00o("106099");
                }
                o0o0000.OooO00o(new p455o0Ooo0O0.o00Ooo(this.f46554OooO0Oo, this.f46556OooO0o0, this.f46555OooO0o, this.f46557OooO0oO, this.f46558OooO0oo));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<o0OOo000.OooOO0O, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p455o0Ooo0O0.oo0o0Oo f46559OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(p455o0Ooo0O0.oo0o0Oo oo0o0oo) {
            super(1);
            this.f46559OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOo000.OooOO0O oooOO0O) {
            o0OOo000.OooOO0O state = oooOO0O;
            Intrinsics.checkNotNullParameter(state, "state");
            boolean zAreEqual = Intrinsics.areEqual(state, o0OOo000.OooOO0O.OooO.f43851OooO00o);
            p455o0Ooo0O0.oo0o0Oo oo0o0oo = this.f46559OooO0Oo;
            if (zAreEqual || Intrinsics.areEqual(state, o0OOo000.OooOO0O.OooOO0.f43855OooO00o)) {
                oo0o0oo.OooO(true);
            } else if ((Intrinsics.areEqual(state, o0OOo000.OooOO0O.OooOOO0.f43857OooO00o) || Intrinsics.areEqual(state, o0OOo000.OooOO0O.OooO0o.f43854OooO00o)) && oo0o0oo.f46603OooO0o.getValue() != null) {
                o0OO0O0.OooO00o("_PreviewVM", "stopBackgroundMusic");
                o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
                o0OOo000.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Function0<Unit> onBackClick, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @NotNull p455o0Ooo0O0.oo0o0Oo previewViewModel, @NotNull Function1<? super Uri, Unit> compressMediaSuccess, @Nullable Composer composer, int i) {
        Composer composer2;
        float fM3765constructorimpl;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Intrinsics.checkNotNullParameter(compressMediaSuccess, "compressMediaSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1264714445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1264714445, i, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen (MediaPreviewScreen.kt:81)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(companion), 0.0f, 1, null);
        MutableState<Boolean> mutableState = o000O0O0.f55880OooO00o;
        Modifier modifierThen = modifierFillMaxSize$default.then(o000O0O0.f55881OooO0O0);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (previewViewModel.OooO0Oo().isFileNotExit()) {
            composer2 = composerStartRestartGroup;
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composer2, -1569285568, -492369756);
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objOooO00o == companion4.getEmpty()) {
                objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer2.updateRememberedValue(objOooO00o);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objOooO00o;
            String strStringResource = StringResources_androidKt.stringResource(p450o0Ooo00.OooO.open_file_error, composer2, 0);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(mutableState2) | composer2.changed(onBackClick);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new OooO(mutableState2, onBackClick);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            p158o00OoOOO.oo000o.OooO0Oo(mutableState2, strStringResource, null, null, false, false, null, null, null, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, 196614, 0, 1044444);
            composer2.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1569288104);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean zIsPicture = previewViewModel.OooO0Oo().isPicture();
            MutableState<Boolean> mutableState3 = previewViewModel.f46613OooOOOo;
            if (zIsPicture) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else if (mutableState3.getValue().booleanValue()) {
                fM3765constructorimpl = com.yalla.yalla.module.media.preview.OooO0O0.f24612OooO00o;
            } else {
                fM3765constructorimpl = o000O0O0.f55880OooO00o.getValue().booleanValue() ? CameraScreenKt.f24139OooO00o : Dp.m3765constructorimpl(0);
            }
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(modifierFillMaxSize$default2, 0.0f, 0.0f, 0.0f, fM3765constructorimpl, 7, null);
            int i2 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierM480paddingqDBjuR0$default, o0oO0O0o.f47059o000OOo, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (previewViewModel.OooO0Oo().isPicture()) {
                composerStartRestartGroup.startReplaceableGroup(-1936763713);
                OooO0O0(previewViewModel, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1936763635);
                OooO0Oo(previewViewModel, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            }
            OooO0OO(onBackClick, direct2AddMusic, previewViewModel, compressMediaSuccess, composerStartRestartGroup, (i & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i & 112) | (i & 7168));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (previewViewModel.OooO0Oo().isPicture()) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(mutableState3.getValue().booleanValue(), BackgroundKt.m169backgroundbw27NRU$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), o0oO0O0o.f46964OooOo0, null, 2, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, OooO00o.f46511OooO0Oo, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1439951239, true, new OooO0O0(previewViewModel)), composer2, 200064, 16);
                AnimatedVisibilityKt.AnimatedVisibility(!mutableState3.getValue().booleanValue(), BackgroundKt.m169backgroundbw27NRU$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), o000O0O0.f55880OooO00o.getValue().booleanValue() ? Color.INSTANCE.m1696getBlack0d7_KjU() : o0oO0O0o.f46945OooO00o, null, 2, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, OooO0OO.f46513OooO0Oo, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composer2, -1204148290, true, new OooO0o(previewViewModel)), composer2, 200064, 16);
            }
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(onBackClick, direct2AddMusic, previewViewModel, compressMediaSuccess, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(p455o0Ooo0O0.oo0o0Oo oo0o0oo, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1248497215);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248497215, i, -1, "com.yalla.yalla.module.media.preview.PicturePreview (MediaPreviewScreen.kt:383)");
        }
        AndroidView_androidKt.AndroidView(OooOO0O.f46520OooO0Oo, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new OooOOO0(oo0o0oo), composerStartRestartGroup, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(oo0o0oo, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull Function0<Unit> onBack, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @NotNull p455o0Ooo0O0.oo0o0Oo previewViewModel, @NotNull Function1<? super Uri, Unit> compressMediaSuccess, @Nullable Composer composer, int i) {
        BoxScopeInstance boxScopeInstance;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Intrinsics.checkNotNullParameter(compressMediaSuccess, "compressMediaSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1465075856);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1465075856, i, -1, "com.yalla.yalla.module.media.preview.PreviewToolBar (MediaPreviewScreen.kt:167)");
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
        p158o00OoOOO.oo000o.OooO0Oo(mutableState, StringResources_androidKt.stringResource(p450o0Ooo00.OooO.video_edit_back_warn_title, composerStartRestartGroup, 0), null, null, false, false, new OooOOOO(previewViewModel), null, StringResources_androidKt.stringResource(p450o0Ooo00.OooO.Go_Back, composerStartRestartGroup, 0), false, null, false, new OooOo00(mutableState, previewViewModel, onBack), null, false, false, null, new OooOo(mutableState, previewViewModel), null, null, composerStartRestartGroup, 6, 0, 913084);
        o0OOO0o o0ooo0o2 = new o0OOO0o(mutableState, previewViewModel, onBack);
        composerStartRestartGroup.startReplaceableGroup(-650781422);
        if (!previewViewModel.OooO0Oo().isPicture()) {
            boolean zBooleanValue = previewViewModel.f46602OooO0Oo.getValue().booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(o0ooo0o2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Oooo000(o0ooo0o2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p010OooOOoo.OooOo.OooO00o(zBooleanValue, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(46, WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null)), composerStartRestartGroup, 733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1541433658);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(o0ooo0o2);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new o00oO0o(o0ooo0o2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253);
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState2 = previewViewModel.f46613OooOOOo;
        float f = 16;
        float f2 = 24;
        ImageKt.Image(PainterResources_androidKt.painterResource(mutableState2.getValue().booleanValue() ? p450o0Ooo00.OooO0o.ic_preview_back : p450o0Ooo00.OooO0o.ic_camera_close_page, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(boxScopeInstance2.align(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), companion3.getCenterStart()), Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 0).then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.startReplaceableGroup(-1541433094);
        if (previewViewModel.OooO0Oo().isPicture() || mutableState2.getValue().booleanValue()) {
            boxScopeInstance = boxScopeInstance2;
            composer2 = composerStartRestartGroup;
        } else {
            MutableState<SelectMusicModel> mutableState3 = previewViewModel.f46603OooO0o;
            if (mutableState3.getValue() == null) {
                composerStartRestartGroup.startReplaceableGroup(-1541432940);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged3 = composerStartRestartGroup.changed(direct2AddMusic);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Oooo0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.yalla.yalla.module.media.camera.OooOOOO.OooO00o(boxScopeInstance2, false, (Function0) objRememberedValue4, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.endReplaceableGroup();
                boxScopeInstance = boxScopeInstance2;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1541432737);
                SelectMusicModel value = mutableState3.getValue();
                long startPosition = value != null ? value.getStartPosition() : 0L;
                MutableState<Boolean> mutableState4 = previewViewModel.OooO0OO().f46589OooO00o;
                MutableState<Function0<Unit>> mutableState5 = previewViewModel.OooO0OO().f46591OooO0OO;
                o000oOoO o000oooo2 = new o000oOoO(previewViewModel);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged4 = composerStartRestartGroup.changed(direct2AddMusic);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new o0OoOo0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boxScopeInstance = boxScopeInstance2;
                composer2 = composerStartRestartGroup;
                com.yalla.yalla.module.media.camera.OooOOOO.OooO0o(boxScopeInstance2, mutableState3, true, startPosition, o000oooo2, (Function1) objRememberedValue5, mutableState4, mutableState5, new o00O0O(previewViewModel), new C0477o00Oo0(previewViewModel), composer2, 390, 0);
                composer2.endReplaceableGroup();
            }
        }
        composer2.endReplaceableGroup();
        Composer composer4 = composer2;
        composer4.startReplaceableGroup(-492369756);
        Object objRememberedValue6 = composer4.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer4.updateRememberedValue(objRememberedValue6);
        }
        composer4.endReplaceableGroup();
        MutableState mutableState6 = (MutableState) objRememberedValue6;
        oOOO000o.OooO00o(mutableState6, previewViewModel, composer4, 70);
        Context context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composer4, 773894976, -492369756);
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4), composer4);
        }
        composer4.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composer4.endReplaceableGroup();
        if (mutableState2.getValue().booleanValue()) {
            composer4.startReplaceableGroup(-1541431302);
            ImageKt.Image(PainterResources_androidKt.painterResource(p450o0Ooo00.OooO0o.ic_camera_white_tick, composer4, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), Dp.m3765constructorimpl(f2)), companion3.getCenterEnd()), false, false, 0L, false, null, null, null, new o00Ooo(previewViewModel), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
            composer4.endReplaceableGroup();
            composer3 = composer4;
        } else {
            composer4.startReplaceableGroup(-1541430742);
            String strStringResource = StringResources_androidKt.stringResource(p450o0Ooo00.OooO.Next, composer4, 0);
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(com.facebook.OooOo.OooO0O0(6, boxScopeInstance.align(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), companion3.getCenterEnd())), ColorKt.Color(4278245577L), null, 2, null);
            composer3 = composer4;
            TextKt.m1251Text4IGK_g(strStringResource, PaddingKt.m477paddingVpY3zN4(com.code.android.util.o0O0O00.OooO0O0(modifierM169backgroundbw27NRU$default, false, false, 0L, false, null, null, null, new oo000o(previewViewModel, context, mutableState6, coroutineScope, compressMediaSuccess), 253), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl((float) 6.5d)), Color.INSTANCE.m1707getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
            composer3.endReplaceableGroup();
        }
        if (androidx.compose.material.OooOO0.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(onBack, direct2AddMusic, previewViewModel, compressMediaSuccess, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(p455o0Ooo0O0.oo0o0Oo oo0o0oo, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1251096339);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251096339, i, -1, "com.yalla.yalla.module.media.preview.VideoPreviewComp (MediaPreviewScreen.kt:332)");
        }
        float fFloatValue = AnimateAsStateKt.animateFloatAsState(oo0o0oo.f46613OooOOOo.getValue().booleanValue() ? 1.0f : 0.0f, null, 0.0f, "", null, composerStartRestartGroup, 3072, 22).getValue().floatValue();
        o0OOo000.OooO.OooO00o(SizeKt.fillMaxSize$default(PaddingKt.m480paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), 0.0f, Dp.m3765constructorimpl(Dp.m3765constructorimpl(48) * fFloatValue), 0.0f, Dp.m3765constructorimpl(Dp.m3765constructorimpl(40) * fFloatValue), 5, null), 0.0f, 1, null), 1, new o0Oo0oo(oo0o0oo), 0L, new o0OO00O(oo0o0oo), new oo0o0Oo(oo0o0oo), composerStartRestartGroup, 0, 8);
        o0O0o00O.OooO00o(oo0o0oo, composerStartRestartGroup, 8);
        com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_RESUME, new o0O0O00(oo0o0oo), composerStartRestartGroup, 6);
        com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new o000OOo(oo0o0oo), composerStartRestartGroup, 6);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new o000000(oo0o0oo), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000O(oo0o0oo, i));
    }

    @Nullable
    public static final Object OooO0o(@NotNull MutableState<Boolean> mutableState, @NotNull FFmpegCmdResult fFmpegCmdResult, @NotNull p455o0Ooo0O0.oo0o0Oo oo0o0oo, @NotNull Continuation<? super Unit> continuation) {
        mutableState.setValue(Boxing.boxBoolean(false));
        if (fFmpegCmdResult == FFmpegCmdResult.Failure) {
            Object objOooO0o0 = com.code.android.util.OooOOO.OooO0o0(new o00000(null), continuation);
            return objOooO0o0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o0 : Unit.INSTANCE;
        }
        if (fFmpegCmdResult != FFmpegCmdResult.Cancel) {
            return Unit.INSTANCE;
        }
        Object objOooO0o1 = com.code.android.util.OooOOO.OooO0o0(new o00000O0(oo0o0oo, null), continuation);
        return objOooO0o1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o1 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object OooO0o0(o0OO0oO0 o0oo0oo1, o0OO0oO0 o0oo0oo2, p455o0Ooo0O0.oo0o0Oo oo0o0oo, MutableState mutableState, Function1 function1, Continuation continuation) throws Throwable {
        p455o0Ooo0O0.o0ooOOo o0ooooo;
        Function1 function2;
        Object obj;
        MutableState mutableState2;
        p455o0Ooo0O0.oo0o0Oo oo0o0oo2;
        if (continuation instanceof p455o0Ooo0O0.o0ooOOo) {
            o0ooooo = (p455o0Ooo0O0.o0ooOOo) continuation;
            int i = o0ooooo.f46596OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooooo.f46596OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o0ooooo = new p455o0Ooo0O0.o0ooOOo(continuation);
            }
        } else {
            o0ooooo = new p455o0Ooo0O0.o0ooOOo(continuation);
        }
        Object obj2 = o0ooooo.f46595OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooooo.f46596OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                Function1 function3 = o0ooooo.f46593OooO0o;
                MutableState mutableState3 = o0ooooo.f46594OooO0o0;
                oo0o0oo2 = o0ooooo.f46592OooO0Oo;
                ResultKt.throwOnFailure(obj2);
                function2 = function3;
                mutableState2 = mutableState3;
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        Lazy lazy = o0OO0.f46906OooO00o;
        String outputFilePath = new File(o0OO0.OooO0Oo(), p004OooO0oO.o000oOoO.OooO00o("yalla_", ((SimpleDateFormat) o0OO0.f46906OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())), ".mp4")).getAbsolutePath();
        MediaVideoInfo videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        long videoPlayRangeEnd = videoInfo.getVideoPlayRangeEnd();
        MediaVideoInfo videoInfo2 = oo0o0oo.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo2);
        long videoPlayRangeStart = videoPlayRangeEnd - videoInfo2.getVideoPlayRangeStart();
        o0OOOO00 o0oooo01 = o0OOOO00.f46930OooO00o;
        o0OOOO00.f46932OooO0OO.setValue(null);
        oo0o0oo.f46604OooO0o0.setValue(Boxing.boxBoolean(true));
        Intrinsics.checkNotNullExpressionValue(outputFilePath, "outputFilePath");
        String str = o0oo0oo1.f46918OooO0O0;
        String str2 = o0oo0oo2 != null ? o0oo0oo2.f46918OooO0O0 : null;
        float f = 100;
        float fOooO0oO = oo0o0oo.OooO0oO() / f;
        float fOooO0O0 = oo0o0oo.OooO0O0() / f;
        p455o0Ooo0O0.o0OOO0o o0ooo0o2 = new p455o0Ooo0O0.o0OOO0o(mutableState);
        o0ooooo.f46592OooO0Oo = oo0o0oo;
        o0ooooo.f46594OooO0o0 = mutableState;
        o0ooooo.f46593OooO0o = function1;
        o0ooooo.f46596OooO0oo = 1;
        Object objOooO00o = o0oooo01.OooO00o(outputFilePath, str, videoPlayRangeStart, str2, fOooO0oO, fOooO0O0, o0ooo0o2, o0ooooo);
        if (objOooO00o == coroutine_suspended) {
            return coroutine_suspended;
        }
        function2 = function1;
        obj = objOooO00o;
        mutableState2 = mutableState;
        oo0o0oo2 = oo0o0oo;
        o0OO0oO0 o0oo0oo3 = (o0OO0oO0) obj;
        FFmpegCmdResult fFmpegCmdResult = o0oo0oo3.f46917OooO00o;
        if (fFmpegCmdResult == FFmpegCmdResult.Success) {
            String str3 = o0oo0oo3.f46918OooO0O0;
            if (str3 == null) {
                str3 = "";
            }
            Uri uri = Uri.fromFile(new File(str3));
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            function2.invoke(uri);
            mutableState2.setValue(Boxing.boxBoolean(false));
        } else {
            o0ooooo.f46592OooO0Oo = r12;
            o0ooooo.f46594OooO0o0 = r12;
            o0ooooo.f46593OooO0o = 0;
            o0ooooo.f46596OooO0oo = 2;
            if (OooO0o(mutableState2, fFmpegCmdResult, oo0o0oo2, o0ooooo) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
