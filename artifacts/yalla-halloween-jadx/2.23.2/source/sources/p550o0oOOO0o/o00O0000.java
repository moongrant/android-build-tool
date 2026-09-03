package p550o0oOOO0o;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import com.code.android.util.o000O00;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.module.media.camera.CameraScreenKt;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.File;
import java.io.IOException;
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
import p207o00o0oO0.o000O0Oo;
import p457o0Ooo0O.o000O0o;
import p460o0Ooo0o.o00O;
import p460o0Ooo0o.o00O0O0;
import p460o0Ooo0o.o00O0OO0;
import p460o0Ooo0o.o00OOO0;
import p460o0Ooo0o.o00OOO00;
import p460o0Ooo0o.oo0O;
import p460o0Ooo0o.oo0o0O0;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMediaPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,588:1\n66#2,6:589\n72#2:623\n66#2,6:626\n72#2:660\n76#2:665\n76#2:685\n66#2,6:701\n72#2:735\n76#2:801\n78#3,11:595\n78#3,11:632\n91#3:664\n91#3:684\n78#3,11:707\n91#3:800\n456#4,8:606\n464#4,3:620\n456#4,8:643\n464#4,3:657\n467#4,3:661\n25#4:666\n50#4:673\n49#4:674\n467#4,3:681\n25#4:686\n36#4:693\n456#4,8:718\n464#4,3:732\n36#4:736\n36#4:745\n36#4:752\n25#4:759\n25#4:771\n467#4,3:797\n4144#5,6:614\n4144#5,6:651\n4144#5,6:726\n154#6:624\n154#6:625\n154#6:700\n154#6:743\n154#6:744\n154#6:782\n154#6:783\n154#6:784\n154#6:785\n154#6,11:786\n154#6:802\n1097#7,6:667\n1097#7,6:675\n1097#7,6:687\n1097#7,6:694\n1097#7,6:737\n1097#7,6:746\n1097#7,6:753\n1097#7,6:760\n1097#7,3:772\n1100#7,3:778\n76#8:766\n486#9,4:767\n490#9,2:775\n494#9:781\n486#10:777\n88#11:803\n*S KotlinDebug\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt\n*L\n89#1:589,6\n89#1:623\n96#1:626,6\n96#1:660\n96#1:665\n89#1:685\n217#1:701,6\n217#1:735\n217#1:801\n89#1:595,11\n96#1:632,11\n96#1:664\n89#1:684\n217#1:707,11\n217#1:800\n89#1:606,8\n89#1:620,3\n96#1:643,8\n96#1:657,3\n96#1:661,3\n158#1:666\n162#1:673\n162#1:674\n89#1:681,3\n177#1:686\n212#1:693\n217#1:718,8\n217#1:732,3\n232#1:736\n250#1:745\n262#1:752\n281#1:759\n285#1:771\n217#1:797,3\n89#1:614,6\n96#1:651,6\n217#1:726,6\n107#1:624\n110#1:625\n221#1:700\n241#1:743\n243#1:744\n292#1:782\n293#1:783\n304#1:784\n306#1:785\n327#1:786,11\n343#1:802\n158#1:667,6\n162#1:675,6\n177#1:687,6\n212#1:694,6\n232#1:737,6\n250#1:746,6\n262#1:753,6\n281#1:760,6\n285#1:772,3\n285#1:778,3\n284#1:766\n285#1:767,4\n285#1:775,2\n285#1:781\n285#1:777\n343#1:803\n*E\n"})
public final class o00O0000 {

    public static final class OooO extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55905OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() / 2);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55906OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55907OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() / 2);
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55908OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O00OO o00o00oo2) {
            super(3);
            this.f55908OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439951239, iIntValue, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen.<anonymous>.<anonymous> (MediaPreviewScreen.kt:133)");
            }
            o00O00OO o00o00oo2 = this.f55908OooO0Oo;
            if (o00o00oo2.f55984OooOOOo.getValue().booleanValue()) {
                com.yalla.yalla.module.media.preview.OooO0O0.OooO00o(o00o00oo2, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f55909OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55910OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00O00OO o00o00oo2) {
            super(3);
            this.f55910OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204148290, iIntValue, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen.<anonymous>.<anonymous> (MediaPreviewScreen.kt:149)");
            }
            o00O00OO o00o00oo2 = this.f55910OooO0Oo;
            if (!o00o00oo2.f55984OooOOOo.getValue().booleanValue()) {
                o00.OooO0O0(o00o00oo2, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55911OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55912OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f55911OooO0Oo = mutableState;
            this.f55912OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55911OooO0Oo.setValue(Boolean.FALSE);
            this.f55912OooO0o0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Context, PhotoView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f55913OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PhotoView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return new PhotoView(it);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55914OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55915OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f55916OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f55917OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f55918OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, o00O00OO o00o00oo2, Function1<? super Uri, Unit> function2, int i) {
            super(2);
            this.f55914OooO0Oo = function0;
            this.f55916OooO0o0 = function1;
            this.f55915OooO0o = o00o00oo2;
            this.f55917OooO0oO = function2;
            this.f55918OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O0000.OooO00o(this.f55914OooO0Oo, this.f55916OooO0o0, this.f55915OooO0o, this.f55917OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55918OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<PhotoView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55919OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o00O00OO o00o00oo2) {
            super(1);
            this.f55919OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PhotoView photoView) {
            PhotoView it = photoView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setImageURI(this.f55919OooO0Oo.OooO0Oo().getUri());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55920OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(o00O00OO o00o00oo2) {
            super(0);
            this.f55920OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("106097", MapsKt.mapOf(new Pair("state", 0)));
            this.f55920OooO0Oo.f55973OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55921OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55922OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o00O00OO o00o00oo2, int i) {
            super(2);
            this.f55921OooO0Oo = o00o00oo2;
            this.f55922OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55922OooO0o0 | 1);
            o00O0000.OooO0O0(this.f55921OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55923OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55924OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState mutableState, o00O00OO o00o00oo2) {
            super(0);
            this.f55923OooO0Oo = o00o00oo2;
            this.f55924OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("106097", MapsKt.mapOf(new Pair("state", 0)));
            this.f55923OooO0Oo.f55973OooO0Oo.setValue(Boolean.TRUE);
            this.f55924OooO0o0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55925OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55926OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55927OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState mutableState, o00O00OO o00o00oo2, Function0 function0) {
            super(0);
            this.f55925OooO0Oo = mutableState;
            this.f55927OooO0o0 = function0;
            this.f55926OooO0o = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("106097", MapsKt.mapOf(new Pair("state", 1)));
            this.f55925OooO0Oo.setValue(Boolean.FALSE);
            this.f55927OooO0o0.invoke();
            Lazy lazy = o00O0OO0.f47783OooO00o;
            MediaVideoInfo videoInfo = this.f55926OooO0o.OooO0Oo().getVideoInfo();
            com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o00O0O0(videoInfo != null ? videoInfo.getVideoItemList() : null, null));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMediaPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt$VideoPreviewComp$6\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,588:1\n63#2,5:589\n*S KotlinDebug\n*F\n+ 1 MediaPreviewScreen.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewScreenKt$VideoPreviewComp$6\n*L\n380#1:589,5\n*E\n"})
    public static final class o00000 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55928OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(o00O00OO o00o00oo2) {
            super(1);
            this.f55928OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o00oOoo(this.f55928OooO0Oo);
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55929OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(o00O00OO o00o00oo2) {
            super(0);
            this.f55929OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0o0O0.OooO00o("_PreView", "MediaPreviewScreen  VideoPreviewComp  play resume ");
            this.f55929OooO0Oo.OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55930OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(o00O00OO o00o00oo2) {
            super(0);
            this.f55930OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0o0O0.OooO00o("_PreView", "MediaPreviewScreen  VideoPreviewComp  play pause");
            p363o0OOo00O.OooO oooOOooO0o0 = this.f55930OooO0Oo.OooO0o0();
            if (oooOOooO0o0 != null) {
                oooOOooO0o0.OooO0o(false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$showCompressCancelOrError$2", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public o00000O(Continuation<? super o00000O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o00000O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000O00.OooO0O0(o0000.OooO0OO(p456o0Ooo00o.o00oO0o.process_video_error));
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55931OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55932OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(o00O00OO o00o00oo2, int i) {
            super(2);
            this.f55931OooO0Oo = o00o00oo2;
            this.f55932OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55932OooO0o0 | 1);
            o00O0000.OooO0Oo(this.f55931OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$showCompressCancelOrError$3", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55933OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(o00O00OO o00o00oo2, Continuation<? super o00000OO> continuation) {
            super(2, continuation);
            this.f55933OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000OO(this.f55933OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f55933OooO0Oo.OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function1<p363o0OOo00O.OooOOO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55934OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(o00O00OO o00o00oo2) {
            super(1);
            this.f55934OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p363o0OOo00O.OooOOO oooOOO) {
            p363o0OOo00O.OooOOO state = oooOOO;
            Intrinsics.checkNotNullParameter(state, "state");
            boolean zAreEqual = Intrinsics.areEqual(state, o0OOo00O.OooOOO.OooO.f43046OooO00o);
            o00O00OO o00o00oo2 = this.f55934OooO0Oo;
            if (zAreEqual || Intrinsics.areEqual(state, o0OOo00O.OooOOO.OooOO0.f43050OooO00o)) {
                o00o00oo2.OooO(true);
            } else if ((Intrinsics.areEqual(state, o0OOo00O.OooOOO.OooOOO0.f43052OooO00o) || Intrinsics.areEqual(state, o0OOo00O.OooOOO.OooO0o.f43049OooO00o)) && o00o00oo2.f55974OooO0o.getValue() != null) {
                oo0o0O0.OooO00o("_PreviewVM", "stopBackgroundMusic");
                p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
                o00OOO00.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55935OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(o0OO00O o0oo00o2) {
            super(0);
            this.f55935OooO0Oo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55935OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55936OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(o00O00OO o00o00oo2) {
            super(0);
            this.f55936OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O00OO o00o00oo2 = this.f55936OooO0Oo;
            o00o00oo2.f55974OooO0o.setValue(null);
            o00o00oo2.f55976OooO0oO.setValue(null);
            o00o00oo2.f55978OooOO0.setIntValue(100);
            o00OOO00.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<SelectMusicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f55937OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(Function1<? super SelectMusicModel, Unit> function1) {
            super(1);
            this.f55937OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SelectMusicModel selectMusicModel) {
            this.f55937OooO0Oo.invoke(selectMusicModel);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55938OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(o00O00OO o00o00oo2) {
            super(1);
            this.f55938OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            o00O00OO o00o00oo2 = this.f55938OooO0Oo;
            o00o00oo2.OooO0OO().f55894OooO0O0.setLongValue(jLongValue);
            o00o00oo2.OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55939OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(o00O00OO o00o00oo2) {
            super(0);
            this.f55939OooO0Oo = o00o00oo2;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0074  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MediaVideoInfo videoInfo;
            MediaVideoInfo videoInfo2;
            o0oo0000.OooO00o.OooO0O0("106104");
            o00O00OO o00o00oo2 = this.f55939OooO0Oo;
            o00o00oo2.f55984OooOOOo.setValue(Boolean.FALSE);
            MediaVideoInfo videoInfo3 = o00o00oo2.OooO0Oo().getVideoInfo();
            if (videoInfo3 != null && o00o00oo2.OooO0o().f55994OooO0OO.getLongValue() == videoInfo3.getVideoPlayRangeStart()) {
                MediaVideoInfo videoInfo4 = o00o00oo2.OooO0Oo().getVideoInfo();
                if (!(videoInfo4 != null && o00o00oo2.OooO0o().f55995OooO0Oo.getLongValue() == videoInfo4.getVideoPlayRangeEnd())) {
                    videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
                    if (videoInfo != null) {
                        videoInfo.setVideoPlayRangeStart(o00o00oo2.OooO0o().f55994OooO0OO.getLongValue());
                    }
                    videoInfo2 = o00o00oo2.OooO0Oo().getVideoInfo();
                    if (videoInfo2 != null) {
                        videoInfo2.setVideoPlayRangeEnd(o00o00oo2.OooO0o().f55995OooO0Oo.getLongValue());
                    }
                }
            } else {
                videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
                if (videoInfo != null) {
                    videoInfo.setVideoPlayRangeStart(o00o00oo2.OooO0o().f55994OooO0OO.getLongValue());
                }
                videoInfo2 = o00o00oo2.OooO0Oo().getVideoInfo();
                if (videoInfo2 != null) {
                    videoInfo2.setVideoPlayRangeEnd(o00o00oo2.OooO0o().f55995OooO0Oo.getLongValue());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function3<Float, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55940OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(o00O00OO o00o00oo2) {
            super(3);
            this.f55940OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f, Long l, Long l2) {
            float fFloatValue = f.floatValue();
            long jLongValue = l.longValue();
            l2.longValue();
            o00O00OO o00o00oo2 = this.f55940OooO0Oo;
            o00o00oo2.f55979OooOO0O.setFloatValue(fFloatValue);
            o00o00oo2.f55986OooOOo0.setLongValue(jLongValue);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55941OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55942OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55943OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MutableState mutableState, o00O00OO o00o00oo2, Function0 function0) {
            super(0);
            this.f55941OooO0Oo = o00o00oo2;
            this.f55943OooO0o0 = function0;
            this.f55942OooO0o = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006e  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O00OO o00o00oo2 = this.f55941OooO0Oo;
            if (o00o00oo2.OooO0Oo().isPicture()) {
                this.f55943OooO0o0.invoke();
            } else {
                MutableState<Boolean> mutableState = o00o00oo2.f55984OooOOOo;
                if (mutableState.getValue().booleanValue()) {
                    o0oo0000.OooO00o.OooO0O0("106103");
                    mutableState.setValue(Boolean.FALSE);
                    MediaVideoInfo videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
                    if (videoInfo != null && o00o00oo2.OooO0o().f55994OooO0OO.getLongValue() == videoInfo.getVideoPlayRangeStart()) {
                        MediaVideoInfo videoInfo2 = o00o00oo2.OooO0Oo().getVideoInfo();
                        if (!(videoInfo2 != null && o00o00oo2.OooO0o().f55995OooO0Oo.getLongValue() == videoInfo2.getVideoPlayRangeEnd())) {
                            o00o00oo2.OooOO0();
                        }
                    } else {
                        o00o00oo2.OooOO0();
                    }
                } else if (!o00o00oo2.OooO0Oo().isPicture()) {
                    o0oo0000.OooO00o.OooO0O0("106096");
                    o00o00oo2.f55973OooO0Oo.setValue(Boolean.FALSE);
                    this.f55942OooO0o.setValue(Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55944OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(o0OO00O o0oo00o2) {
            super(0);
            this.f55944OooO0Oo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55944OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55945OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55946OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f55947OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f55948OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f55949OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0Oo0oo(Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, o00O00OO o00o00oo2, Function1<? super Uri, Unit> function2, int i) {
            super(2);
            this.f55945OooO0Oo = function0;
            this.f55947OooO0o0 = function1;
            this.f55946OooO0o = o00o00oo2;
            this.f55948OooO0oO = function2;
            this.f55949OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O0000.OooO0OO(this.f55945OooO0Oo, this.f55947OooO0o0, this.f55946OooO0o, this.f55948OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55949OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f55950OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(Function1<? super SelectMusicModel, Unit> function1) {
            super(0);
            this.f55950OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("106098");
            this.f55950OooO0Oo.invoke(null);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55951OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55952OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f55953OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f55954OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Uri, Unit> f55955OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0ooOOo(o00O00OO o00o00oo2, Context context, MutableState<Boolean> mutableState, CoroutineScope coroutineScope, Function1<? super Uri, Unit> function1) {
            super(0);
            this.f55951OooO0Oo = o00o00oo2;
            this.f55953OooO0o0 = context;
            this.f55952OooO0o = mutableState;
            this.f55954OooO0oO = coroutineScope;
            this.f55955OooO0oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O00OO o00o00oo2 = this.f55951OooO0Oo;
            if (o00o00oo2.OooO0Oo().isFileNotExit()) {
                o000O00.OooO0O0(o0000.OooO0OO(p456o0Ooo00o.o00oO0o.open_file_error));
            } else {
                if (!o00o00oo2.OooO0Oo().isPicture()) {
                    o0oo0000.OooO00o.OooO0O0("106099");
                }
                o00OOO0.OooO00o(new o0O0ooO(this.f55951OooO0Oo, this.f55953OooO0o0, this.f55952OooO0o, this.f55954OooO0oO, this.f55955OooO0oo));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55956OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(o00O00OO o00o00oo2) {
            super(1);
            this.f55956OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                o00O00OO o00o00oo2 = this.f55956OooO0Oo;
                o00o00oo2.getClass();
                oo0o0O0.OooO00o("_PreviewVM", "resetBackgroundMusic");
                o00o00oo2.OooOO0O();
                o00o00oo2.OooO(false);
                o00o00oo2.OooOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<p363o0OOo00O.OooO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55957OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(o00O00OO o00o00oo2) {
            super(1);
            this.f55957OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p363o0OOo00O.OooO oooO) {
            p363o0OOo00O.OooO it = oooO;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O00OO o00o00oo2 = this.f55957OooO0Oo;
            o00o00oo2.f55971OooO0O0.setValue(it);
            it.OooO0oo(!o00o00oo2.f55983OooOOOO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Function0<Unit> onBackClick, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @NotNull o00O00OO previewViewModel, @NotNull Function1<? super Uri, Unit> compressMediaSuccess, @Nullable Composer composer, int i) {
        Composer composer2;
        float fM3775constructorimpl;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Intrinsics.checkNotNullParameter(compressMediaSuccess, "compressMediaSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1264714445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1264714445, i, -1, "com.yalla.yalla.module.media.preview.MediaPreviewScreen (MediaPreviewScreen.kt:87)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(companion), 0.0f, 1, null);
        MutableState<Boolean> mutableState = p458o0Ooo0O0.OooOo00.f47771OooO00o;
        Modifier modifierThen = modifierFillMaxSize$default.then(p458o0Ooo0O0.OooOo00.f47772OooO0O0);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (previewViewModel.OooO0Oo().isFileNotExit()) {
            composer2 = composerStartRestartGroup;
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composer2, -1569285443, -492369756);
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objOooO00o == companion4.getEmpty()) {
                objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer2.updateRememberedValue(objOooO00o);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objOooO00o;
            String strStringResource = StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.open_file_error, composer2, 0);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(mutableState2) | composer2.changed(onBackClick);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new OooOO0O(mutableState2, onBackClick);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o000O0Oo.OooO0Oo(mutableState2, strStringResource, null, null, false, false, null, null, null, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, 196614, 0, 1044444);
            composer2.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1569288057);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean zIsPicture = previewViewModel.OooO0Oo().isPicture();
            MutableState<Boolean> mutableState3 = previewViewModel.f55984OooOOOo;
            if (zIsPicture) {
                fM3775constructorimpl = Dp.m3775constructorimpl(0);
            } else if (mutableState3.getValue().booleanValue()) {
                fM3775constructorimpl = com.yalla.yalla.module.media.preview.OooO0O0.f24150OooO00o;
            } else {
                fM3775constructorimpl = p458o0Ooo0O0.OooOo00.f47771OooO00o.getValue().booleanValue() ? CameraScreenKt.f23672OooO00o : Dp.m3775constructorimpl(0);
            }
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(modifierFillMaxSize$default2, 0.0f, 0.0f, 0.0f, fM3775constructorimpl, 7, null);
            int i2 = o0OOo000.f48347o00OOooO;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierM482paddingqDBjuR0$default, o0OOo000.f48200o000000o, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (previewViewModel.OooO0Oo().isPicture()) {
                composerStartRestartGroup.startReplaceableGroup(-1936763666);
                OooO0O0(previewViewModel, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1936763588);
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
                AnimatedVisibilityKt.AnimatedVisibility(mutableState3.getValue().booleanValue(), SemanticsModifierKt.semantics$default(BackgroundKt.m171backgroundbw27NRU$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), o0OOo000.f48153OooOo0, null, 2, null), false, OooO00o.f55906OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, OooO0O0.f55907OooO0Oo, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1439951239, true, new OooO0OO(previewViewModel)), composer2, 200064, 16);
                AnimatedVisibilityKt.AnimatedVisibility(!mutableState3.getValue().booleanValue(), SemanticsModifierKt.semantics$default(BackgroundKt.m171backgroundbw27NRU$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), p458o0Ooo0O0.OooOo00.f47771OooO00o.getValue().booleanValue() ? Color.INSTANCE.m1707getBlack0d7_KjU() : o0OOo000.f48134OooO00o, null, 2, null), false, OooO0o.f55909OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, OooO.f55905OooO0Oo, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composer2, -1204148290, true, new OooOO0(previewViewModel)), composer2, 200064, 16);
            }
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(onBackClick, direct2AddMusic, previewViewModel, compressMediaSuccess, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(o00O00OO o00o00oo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1248497215);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248497215, i, -1, "com.yalla.yalla.module.media.preview.PicturePreview (MediaPreviewScreen.kt:386)");
        }
        AndroidView_androidKt.AndroidView(OooOOO.f55913OooO0Oo, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new OooOOOO(o00o00oo2), composerStartRestartGroup, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(o00o00oo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull Function0<Unit> onBack, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @NotNull o00O00OO previewViewModel, @NotNull Function1<? super Uri, Unit> compressMediaSuccess, @Nullable Composer composer, int i) {
        BoxScopeInstance boxScopeInstance;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Intrinsics.checkNotNullParameter(compressMediaSuccess, "compressMediaSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1465075856);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1465075856, i, -1, "com.yalla.yalla.module.media.preview.PreviewToolBar (MediaPreviewScreen.kt:175)");
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
        o000O0Oo.OooO0Oo(mutableState, StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.video_edit_back_warn_title, composerStartRestartGroup, 0), null, null, false, false, new OooOo(previewViewModel), null, StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.Go_Back, composerStartRestartGroup, 0), false, null, false, new Oooo000(mutableState, previewViewModel, onBack), null, false, false, null, new Oooo0(mutableState, previewViewModel), null, null, composerStartRestartGroup, 6, 0, 913084);
        o0OO00O o0oo00o2 = new o0OO00O(mutableState, previewViewModel, onBack);
        composerStartRestartGroup.startReplaceableGroup(-650781297);
        if (!previewViewModel.OooO0Oo().isPicture()) {
            boolean zBooleanValue = previewViewModel.f55973OooO0Oo.getValue().booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(o0oo00o2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new o000oOoO(o0oo00o2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p010OooOOoo.OooOo.OooO00o(zBooleanValue, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(46, WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null)), composerStartRestartGroup, 733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1541433533);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(o0oo00o2);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new o0OOO0o(o0oo00o2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O1 = com.code.android.util.o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253);
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState2 = previewViewModel.f55984OooOOOo;
        float f = 16;
        float f2 = 24;
        ImageKt.Image(PainterResources_androidKt.painterResource(mutableState2.getValue().booleanValue() ? p456o0Ooo00o.oo000o.ic_preview_back : p456o0Ooo00o.oo000o.ic_camera_close_page, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(boxScopeInstance2.align(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), companion3.getCenterStart()), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 0).then(modifierOooO0O1), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.startReplaceableGroup(-1541432969);
        if (previewViewModel.OooO0Oo().isPicture() || mutableState2.getValue().booleanValue()) {
            boxScopeInstance = boxScopeInstance2;
            composer2 = composerStartRestartGroup;
        } else {
            MutableState<SelectMusicModel> mutableState3 = previewViewModel.f55974OooO0o;
            if (mutableState3.getValue() == null) {
                composerStartRestartGroup.startReplaceableGroup(-1541432815);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged3 = composerStartRestartGroup.changed(direct2AddMusic);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new o0OoOo0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.yalla.yalla.module.media.camera.OooOOO.OooO00o(boxScopeInstance2, false, (Function0) objRememberedValue4, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.endReplaceableGroup();
                boxScopeInstance = boxScopeInstance2;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1541432612);
                SelectMusicModel value = mutableState3.getValue();
                long startPosition = value != null ? value.getStartPosition() : 0L;
                MutableState<Boolean> mutableState4 = previewViewModel.OooO0OO().f55893OooO00o;
                MutableState<Function0<Unit>> mutableState5 = previewViewModel.OooO0OO().f55895OooO0OO;
                o00O0O o00o0o2 = new o00O0O(previewViewModel);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged4 = composerStartRestartGroup.changed(direct2AddMusic);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new o00Oo0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                boxScopeInstance = boxScopeInstance2;
                composer2 = composerStartRestartGroup;
                com.yalla.yalla.module.media.camera.OooOOO.OooO0o(boxScopeInstance2, mutableState3, true, startPosition, o00o0o2, (Function1) objRememberedValue5, mutableState4, mutableState5, new o00Ooo(previewViewModel), new oo000o(previewViewModel), composer2, 390, 0);
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
        o000O0o.OooO00o(mutableState6, previewViewModel, composer4, 70);
        Context context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composer4, 773894976, -492369756);
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4), composer4);
        }
        composer4.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composer4.endReplaceableGroup();
        if (mutableState2.getValue().booleanValue()) {
            composer4.startReplaceableGroup(-1541431177);
            ImageKt.Image(PainterResources_androidKt.painterResource(p456o0Ooo00o.oo000o.ic_camera_white_tick, composer4, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), Dp.m3775constructorimpl(f2)), companion3.getCenterEnd()), false, false, 0L, false, null, null, null, new o00oO0o(previewViewModel), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
            composer4.endReplaceableGroup();
            composer3 = composer4;
        } else {
            composer4.startReplaceableGroup(-1541430617);
            String strStringResource = StringResources_androidKt.stringResource(p456o0Ooo00o.o00oO0o.Next, composer4, 0);
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(androidx.media3.session.o00O0O0.OooO00o(6, boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), companion3.getCenterEnd())), ColorKt.Color(4278245577L), null, 2, null);
            composer3 = composer4;
            TextKt.m1261Text4IGK_g(strStringResource, PaddingKt.m479paddingVpY3zN4(com.code.android.util.o0O0O00.OooO0O0(modifierM171backgroundbw27NRU$default, false, false, 0L, false, null, null, null, new o0ooOOo(previewViewModel, context, mutableState6, coroutineScope, compressMediaSuccess), 253), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl((float) 6.5d)), Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
            composer3.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(onBack, direct2AddMusic, previewViewModel, compressMediaSuccess, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(o00O00OO o00o00oo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1251096339);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251096339, i, -1, "com.yalla.yalla.module.media.preview.VideoPreviewComp (MediaPreviewScreen.kt:337)");
        }
        float fFloatValue = AnimateAsStateKt.animateFloatAsState(o00o00oo2.f55984OooOOOo.getValue().booleanValue() ? 1.0f : 0.0f, null, 0.0f, "", null, composerStartRestartGroup, 3072, 22).getValue().floatValue();
        p363o0OOo00O.OooOO0O.OooO00o(SizeKt.fillMaxSize$default(PaddingKt.m482paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), 0.0f, Dp.m3775constructorimpl(Dp.m3775constructorimpl(48) * fFloatValue), 0.0f, Dp.m3775constructorimpl(Dp.m3775constructorimpl(40) * fFloatValue), 5, null), 0.0f, 1, null), 1, new oo0o0Oo(o00o00oo2), 0L, new o0O0O00(o00o00oo2), new o000OOo(o00o00oo2), composerStartRestartGroup, 48, 8);
        p461o0Ooo0o0.o000oOoO.OooO00o(o00o00oo2, composerStartRestartGroup, 8);
        com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_RESUME, new o000000(o00o00oo2), composerStartRestartGroup, 6);
        com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_PAUSE, new o000000O(o00o00oo2), composerStartRestartGroup, 6);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new o00000(o00o00oo2), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000O0(o00o00oo2, i));
    }

    @Nullable
    public static final Object OooO0o(@NotNull MutableState<Boolean> mutableState, @NotNull FFmpegCmdResult fFmpegCmdResult, @NotNull o00O00OO o00o00oo2, @NotNull Continuation<? super Unit> continuation) {
        mutableState.setValue(Boxing.boxBoolean(false));
        if (fFmpegCmdResult == FFmpegCmdResult.Failure) {
            Object objOooO0o0 = com.code.android.util.OooOOO.OooO0o0(new o00000O(null), continuation);
            return objOooO0o0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o0 : Unit.INSTANCE;
        }
        if (fFmpegCmdResult != FFmpegCmdResult.Cancel) {
            return Unit.INSTANCE;
        }
        Object objOooO0o1 = com.code.android.util.OooOOO.OooO0o0(new o00000OO(o00o00oo2, null), continuation);
        return objOooO0o1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o1 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object OooO0o0(o00O o00o2, o00O o00o3, o00O00OO o00o00oo2, MutableState mutableState, Function1 function1, Continuation continuation) throws IOException {
        o00O000o o00o000o2;
        Function1 function2;
        Object obj;
        MutableState mutableState2;
        o00O00OO o00o00oo3;
        if (continuation instanceof o00O000o) {
            o00o000o2 = (o00O000o) continuation;
            int i = o00o000o2.f55962OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o000o2.f55962OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00o000o2 = new o00O000o(continuation);
            }
        } else {
            o00o000o2 = new o00O000o(continuation);
        }
        Object obj2 = o00o000o2.f55961OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o000o2.f55962OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                Function1 function3 = o00o000o2.f55959OooO0o;
                MutableState mutableState3 = o00o000o2.f55960OooO0o0;
                o00o00oo3 = o00o000o2.f55958OooO0Oo;
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
        Lazy lazy = o00O0OO0.f47783OooO00o;
        String absolutePath = new File(o00O0OO0.OooO0Oo(), p004OooO0oO.o000oOoO.OooO0O0("yalla_", ((SimpleDateFormat) o00O0OO0.f47783OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())), ".mp4")).getAbsolutePath();
        MediaVideoInfo videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        long videoPlayRangeEnd = videoInfo.getVideoPlayRangeEnd();
        MediaVideoInfo videoInfo2 = o00o00oo2.OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo2);
        long videoPlayRangeStart = videoPlayRangeEnd - videoInfo2.getVideoPlayRangeStart();
        oo0O oo0o = oo0O.f47807OooO00o;
        oo0O.f47809OooO0OO.setValue(null);
        o00o00oo2.f55975OooO0o0.setValue(Boxing.boxBoolean(true));
        Intrinsics.checkNotNull(absolutePath);
        String str = o00o2.f47777OooO0O0;
        String str2 = o00o3 != null ? o00o3.f47777OooO0O0 : null;
        float f = 100;
        float fOooO0oO = o00o00oo2.OooO0oO() / f;
        float fOooO0O0 = o00o00oo2.OooO0O0() / f;
        o00O00 o00o01 = new o00O00(mutableState);
        o00o000o2.f55958OooO0Oo = o00o00oo2;
        o00o000o2.f55960OooO0o0 = mutableState;
        o00o000o2.f55959OooO0o = function1;
        o00o000o2.f55962OooO0oo = 1;
        Object objOooO00o = oo0o.OooO00o(absolutePath, str, videoPlayRangeStart, str2, fOooO0oO, fOooO0O0, o00o01, o00o000o2);
        if (objOooO00o == coroutine_suspended) {
            return coroutine_suspended;
        }
        function2 = function1;
        obj = objOooO00o;
        mutableState2 = mutableState;
        o00o00oo3 = o00o00oo2;
        o00O o00o4 = (o00O) obj;
        FFmpegCmdResult fFmpegCmdResult = o00o4.f47776OooO00o;
        if (fFmpegCmdResult == FFmpegCmdResult.Success) {
            String str3 = o00o4.f47777OooO0O0;
            if (str3 == null) {
                str3 = "";
            }
            Uri uriFromFile = Uri.fromFile(new File(str3));
            Intrinsics.checkNotNull(uriFromFile);
            function2.invoke(uriFromFile);
            mutableState2.setValue(Boxing.boxBoolean(false));
        } else {
            o00o000o2.f55958OooO0Oo = r12;
            o00o000o2.f55960OooO0o0 = r12;
            o00o000o2.f55959OooO0o = 0;
            o00o000o2.f55962OooO0oo = 2;
            if (OooO0o(mutableState2, fFmpegCmdResult, o00o00oo3, o00o000o2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
