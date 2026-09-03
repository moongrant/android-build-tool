package com.yalla.yalla.module.media.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.ImageCapture;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.OooO0OO;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoOutput;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.core.content.PermissionChecker;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.MediaVideoItemModel;
import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0O0;
import p039OoooOoo.o00O0000;
import p039OoooOoo.o00O0O0O;
import p207o00o0oO0.o000O0Oo;
import p211o00o0oo0.o000OOo0;
import p212o00o0ooo.o0O00oO0;
import p458o0Ooo00o.o0000Ooo;
import p461o0Ooo0Oo.o0O00;
import p461o0Ooo0Oo.o0O000;
import p461o0Ooo0Oo.o0O0o;
import p461o0Ooo0Oo.o0oOO;
import p461o0Ooo0Oo.o0oOOo;
import p552o0oOO0Oo.o0O0oo0o;
import p552o0oOO0Oo.o0oO0O0o;
import p582o0oOoOoo.b0;
import p582o0oOoOoo.c0;
import p582o0oOoOoo.z;
import p593o0oOoooO.h0;
import p647o0ooOOo.O0O0;
import p647o0ooOOo.O0OO00;
import p647o0ooOOo.Oo0000;
import p647o0ooOOo.e;
import p647o0ooOOo.j;
import p647o0ooOOo.q;
import p647o0ooOOo.t;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,529:1\n76#2:530\n76#2:845\n486#3,4:531\n490#3,2:539\n494#3:545\n486#3,4:830\n490#3,2:838\n494#3:844\n25#4:535\n36#4:546\n25#4:553\n456#4,8:578\n464#4,3:592\n456#4,8:614\n464#4,3:628\n467#4,3:632\n467#4,3:637\n456#4,8:659\n464#4,3:673\n467#4,3:677\n25#4:682\n25#4:689\n36#4:696\n50#4:703\n49#4:704\n50#4:711\n49#4:712\n36#4:719\n456#4,8:743\n464#4,3:757\n36#4:761\n456#4,8:788\n464#4,3:802\n467#4,3:806\n36#4:811\n36#4:818\n467#4,3:825\n25#4:834\n25#4:850\n1097#5,3:536\n1100#5,3:542\n1097#5,6:547\n1097#5,6:554\n1097#5,6:683\n1097#5,6:690\n1097#5,6:697\n1097#5,6:705\n1097#5,6:713\n1097#5,6:720\n1097#5,6:762\n1097#5,6:812\n1097#5,6:819\n1097#5,3:835\n1100#5,3:841\n955#5,6:851\n486#6:541\n486#6:840\n154#7:560\n154#7:596\n154#7:768\n154#7:769\n154#7:770\n154#7:878\n66#8,6:561\n72#8:595\n76#8:641\n66#8,6:642\n72#8:676\n76#8:681\n66#8,6:726\n72#8:760\n76#8:829\n78#9,11:567\n78#9,11:603\n91#9:635\n91#9:640\n78#9,11:648\n91#9:680\n78#9,11:732\n78#9,11:777\n91#9:809\n91#9:828\n4144#10,6:586\n4144#10,6:622\n4144#10,6:667\n4144#10,6:751\n4144#10,6:796\n72#11,6:597\n78#11:631\n82#11:636\n72#11,6:771\n78#11:805\n82#11:810\n73#12,4:846\n77#12,20:857\n1#13:877\n*S KotlinDebug\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt\n*L\n76#1:530\n260#1:845\n78#1:531,4\n78#1:539,2\n78#1:545\n259#1:830,4\n259#1:838,2\n259#1:844\n78#1:535\n80#1:546\n85#1:553\n92#1:578,8\n92#1:592,3\n106#1:614,8\n106#1:628,3\n106#1:632,3\n92#1:637,3\n122#1:659,8\n122#1:673,3\n122#1:677,3\n146#1:682\n147#1:689\n161#1:696\n169#1:703\n169#1:704\n165#1:711\n165#1:712\n177#1:719\n181#1:743,8\n181#1:757,3\n195#1:761\n212#1:788,8\n212#1:802,3\n212#1:806,3\n227#1:811\n241#1:818\n181#1:825,3\n259#1:834\n283#1:850\n78#1:536,3\n78#1:542,3\n80#1:547,6\n85#1:554,6\n146#1:683,6\n147#1:690,6\n161#1:697,6\n169#1:705,6\n165#1:713,6\n177#1:720,6\n195#1:762,6\n227#1:812,6\n241#1:819,6\n259#1:835,3\n259#1:841,3\n283#1:851,6\n78#1:541\n259#1:840\n95#1:560\n109#1:596\n203#1:768\n204#1:769\n215#1:770\n529#1:878\n92#1:561,6\n92#1:595\n92#1:641\n122#1:642,6\n122#1:676\n122#1:681\n181#1:726,6\n181#1:760\n181#1:829\n92#1:567,11\n106#1:603,11\n106#1:635\n92#1:640\n122#1:648,11\n122#1:680\n181#1:732,11\n212#1:777,11\n212#1:809\n181#1:828\n92#1:586,6\n106#1:622,6\n122#1:667,6\n181#1:751,6\n212#1:796,6\n106#1:597,6\n106#1:631\n106#1:636\n212#1:771,6\n212#1:805\n212#1:810\n283#1:846,4\n283#1:857,20\n*E\n"})
public final class CameraScreenKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f23685OooO00o = Dp.m3775constructorimpl(56);

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23694OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23695OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f23694OooO0Oo = mutableState;
            this.f23695OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23694OooO0Oo.setValue(Boolean.FALSE);
            h0.OooO0OO("106085", MapsKt.mapOf(new Pair("state", 1)));
            this.f23695OooO0o0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23696OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23697OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23698OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23699OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Bundle f23700OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23701OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23702OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f23703OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(BoxScope boxScope, Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, Bundle bundle, CameraViewModel cameraViewModel, Function0<Unit> function2, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function3, int i) {
            super(2);
            this.f23697OooO0Oo = boxScope;
            this.f23699OooO0o0 = function0;
            this.f23698OooO0o = function1;
            this.f23700OooO0oO = bundle;
            this.f23701OooO0oo = cameraViewModel;
            this.f23696OooO = function2;
            this.f23702OooOO0 = function3;
            this.f23703OooOO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CameraScreenKt.OooO00o(this.f23697OooO0Oo, this.f23699OooO0o0, this.f23698OooO0o, this.f23700OooO0oO, this.f23701OooO0oo, this.f23696OooO, this.f23702OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23703OooOO0O | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23704OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CameraViewModel cameraViewModel) {
            super(0);
            this.f23704OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23704OooO0Oo.f23774OooO0oO.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23705OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23707OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23708OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Bundle f23709OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23710OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23711OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f23712OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(BoxScope boxScope, Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, Bundle bundle, CameraViewModel cameraViewModel, Function0<Unit> function2, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function3, int i) {
            super(2);
            this.f23706OooO0Oo = boxScope;
            this.f23708OooO0o0 = function0;
            this.f23707OooO0o = function1;
            this.f23709OooO0oO = bundle;
            this.f23710OooO0oo = cameraViewModel;
            this.f23705OooO = function2;
            this.f23711OooOO0 = function3;
            this.f23712OooOO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CameraScreenKt.OooO00o(this.f23706OooO0Oo, this.f23708OooO0o0, this.f23707OooO0o, this.f23709OooO0oO, this.f23710OooO0oo, this.f23705OooO, this.f23711OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23712OooOO0O | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23713OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<Boolean> mutableState) {
            super(0);
            this.f23713OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0OO("106085", MapsKt.mapOf(new Pair("state", 0)));
            this.f23713OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23714OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23715OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(0);
            this.f23714OooO0Oo = mutableState;
            this.f23715OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0OO("106085", MapsKt.mapOf(new Pair("state", 0)));
            this.f23714OooO0Oo.setValue(Boolean.TRUE);
            this.f23715OooO0o0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23716OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Oooo000 oooo000) {
            super(0);
            this.f23716OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23716OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23717OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(CameraViewModel cameraViewModel) {
            super(0);
            this.f23717OooO0Oo = cameraViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23717OooO0Oo.OooO0o().f23809OooO00o.setValue(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23718OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(Function1<? super SelectMusicModel, Unit> function1) {
            super(0);
            this.f23718OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0O0("106075");
            this.f23718OooO0Oo.invoke(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<SelectMusicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23719OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(Function1<? super SelectMusicModel, Unit> function1) {
            super(1);
            this.f23719OooO0Oo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SelectMusicModel selectMusicModel) {
            this.f23719OooO0Oo.invoke(selectMusicModel);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23720OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23721OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<PreviewView> f23722OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<SelectMusicModel, Unit> f23723OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f23724OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(CameraViewModel cameraViewModel, MutableState<PreviewView> mutableState, Function0<Unit> function0, Function1<? super SelectMusicModel, Unit> function1, int i) {
            super(2);
            this.f23720OooO0Oo = cameraViewModel;
            this.f23722OooO0o0 = mutableState;
            this.f23721OooO0o = function0;
            this.f23723OooO0oO = function1;
            this.f23724OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CameraScreenKt.OooO0O0(this.f23720OooO0Oo, this.f23722OooO0o0, this.f23721OooO0o, this.f23723OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23724OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23725OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Oooo000 oooo000) {
            super(0);
            this.f23725OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23725OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23726OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23727OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23728OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, CoroutineScope coroutineScope) {
            super(0);
            this.f23726OooO0Oo = cameraViewModel;
            this.f23728OooO0o0 = function2;
            this.f23727OooO0o = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraViewModel cameraViewModel = this.f23726OooO0Oo;
            ImageCapture imageCapture = cameraViewModel.f23788OooOo00;
            if (imageCapture != null) {
                Lazy lazy = o0oOOo.f47821OooO00o;
                File fileOooO00o = o0oOOo.OooO00o(o0oOOo.OooO0OO(), ".jpg");
                ImageCapture.OooOO0O oooOO0O = new ImageCapture.OooOO0O(fileOooO00o, new ImageCapture.OooO0o());
                Intrinsics.checkNotNullExpressionValue(oooOO0O, "build(...)");
                imageCapture.Oooo0OO(oooOO0O, ExecutorsKt.asExecutor(Dispatchers.getIO()), new b0(fileOooO00o, cameraViewModel, this.f23727OooO0o, this.f23728OooO0o0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23729OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23730OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23731OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(CameraViewModel cameraViewModel, MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f23729OooO0Oo = cameraViewModel;
            this.f23731OooO0o0 = mutableState;
            this.f23730OooO0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraViewModel cameraViewModel = this.f23729OooO0Oo;
            if (cameraViewModel.OooO() || cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) {
                this.f23730OooO0o.invoke();
            } else if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() != CameraViewModel.VideoRecordState.Recording) {
                h0.OooO0O0("106084");
                this.f23731OooO0o0.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraScreenKt$startVideoMerging$1", f = "CameraScreen.kt", i = {}, l = {496, 499}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23732OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f23733OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23734OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23735OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraScreenKt$startVideoMerging$1$1", f = "CameraScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0O000 f23736OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23737OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ CameraViewModel f23738OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(o0O000 o0o001, CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f23736OooO0Oo = o0o001;
                this.f23738OooO0o0 = cameraViewModel;
                this.f23737OooO0o = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f23736OooO0Oo, this.f23738OooO0o0, this.f23737OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o0O000 o0o001 = this.f23736OooO0Oo;
                if (o0o001.f47790OooO00o == FFmpegCmdResult.Success) {
                    String str = o0o001.f47791OooO0O0;
                    if (str == null) {
                        str = "";
                    }
                    CameraScreenKt.OooO0oO(this.f23738OooO0o0, this.f23737OooO0o, str);
                } else {
                    o000O00.OooO0O0(o0000.OooO0OO(o0O0oo0o.video_recording_error));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o000OOo(CameraViewModel cameraViewModel, String str, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, Continuation<? super o000OOo> continuation) {
            super(2, continuation);
            this.f23734OooO0o0 = cameraViewModel;
            this.f23733OooO0o = str;
            this.f23735OooO0oO = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000OOo(this.f23734OooO0o0, this.f23733OooO0o, this.f23735OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000OOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23732OooO0Oo;
            CameraViewModel cameraViewModel = this.f23734OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o0O00 o0o01 = o0O00.f47783OooO00o;
            ArrayList<MediaVideoItemModel> arrayList = cameraViewModel.OooO0oo().f23796OooO0OO;
            this.f23732OooO0Oo = 1;
            obj = o0o01.OooO0o0(arrayList, this.f23733OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            cameraViewModel.f23774OooO0oO.setValue(Boxing.boxBoolean(false));
            OooO00o oooO00o = new OooO00o((o0O000) obj, cameraViewModel, this.f23735OooO0oO, null);
            this.f23732OooO0Oo = 2;
            if (com.code.android.util.OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23739OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23740OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o000oOoO(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2) {
            super(0);
            this.f23739OooO0Oo = cameraViewModel;
            this.f23740OooO0o0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraScreenKt.OooO0o0(this.f23739OooO0Oo, this.f23740OooO0o0, true);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23741OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MutableState<Boolean> mutableState) {
            super(0);
            this.f23741OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23741OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCameraScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt$CaptureButton$3$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,529:1\n154#2:530\n*S KotlinDebug\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt$CaptureButton$3$3$1\n*L\n299#1:530\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ O0OO00 f23742OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(O0OO00 o0oo00) {
            super(1);
            this.f23742OooO0Oo = o0oo00;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            Oo0000 oo0000 = constrainAs.f57606OooO0o0;
            O0OO00 o0oo00 = constrainAs.f57603OooO0OO;
            o000OOo0.OooO0O0(oo0000, o0oo00.f57610OooO0OO, 0.0f, 6);
            o000OOo0.OooO0O0(constrainAs.f57607OooO0oO, o0oo00.f57612OooO0o0, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57605OooO0o, this.f23742OooO0Oo.f57609OooO0O0, Dp.m3775constructorimpl(40), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23743OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MutableState<Boolean> mutableState) {
            super(0);
            this.f23743OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0O0("106081");
            this.f23743OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23744OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23745OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23746OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Context f23747OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23748OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oO0o(boolean z, CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, Context context, CoroutineScope coroutineScope) {
            super(0);
            this.f23744OooO0Oo = z;
            this.f23746OooO0o0 = cameraViewModel;
            this.f23745OooO0o = function2;
            this.f23747OooO0oO = context;
            this.f23748OooO0oo = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function2<MediaModel, SelectMusicModelWrapper, Unit> function2 = this.f23745OooO0o;
            Context context = this.f23747OooO0oO;
            try {
                Result.Companion companion = Result.INSTANCE;
                boolean z = this.f23744OooO0Oo;
                CameraViewModel cameraViewModel = this.f23746OooO0o0;
                if (z) {
                    h0.OooO0O0("106080");
                    CameraScreenKt.OooO0o0(cameraViewModel, function2, false);
                } else {
                    h0.OooO0O0("106083");
                    CameraScreenKt.OooO0Oo(cameraViewModel, context);
                }
                Result.m4215constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23749OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23750OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23751OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(CameraViewModel cameraViewModel, Function2 function2, boolean z) {
            super(0);
            this.f23749OooO0Oo = z;
            this.f23751OooO0o0 = cameraViewModel;
            this.f23750OooO0o = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = this.f23749OooO0Oo;
            CameraViewModel cameraViewModel = this.f23751OooO0o0;
            if (z) {
                CameraScreenKt.OooO0o(cameraViewModel, this.f23750OooO0o);
            } else {
                cameraViewModel.f23772OooO0o.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23752OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23753OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23754OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23755OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OO00O(CameraViewModel cameraViewModel, CoroutineScope coroutineScope, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, int i) {
            super(2);
            this.f23752OooO0Oo = cameraViewModel;
            this.f23754OooO0o0 = coroutineScope;
            this.f23753OooO0o = function2;
            this.f23755OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23755OooO0oO | 1);
            CoroutineScope coroutineScope = this.f23754OooO0o0;
            Function2<MediaModel, SelectMusicModelWrapper, Unit> function2 = this.f23753OooO0o;
            CameraScreenKt.OooO0OO(this.f23752OooO0Oo, coroutineScope, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23756OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23757OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23758OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23759OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OOO0o(boolean z, CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, boolean z2) {
            super(0);
            this.f23756OooO0Oo = z;
            this.f23758OooO0o0 = cameraViewModel;
            this.f23757OooO0o = function2;
            this.f23759OooO0oO = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = this.f23756OooO0Oo;
            Function2<MediaModel, SelectMusicModelWrapper, Unit> function2 = this.f23757OooO0o;
            CameraViewModel cameraViewModel = this.f23758OooO0o0;
            if (z) {
                CameraScreenKt.OooO0o0(cameraViewModel, function2, true);
            } else {
                h0.OooO0O0("106082");
                if (this.f23759OooO0oO) {
                    CameraScreenKt.OooO0o0(cameraViewModel, function2, true);
                } else {
                    o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(o0O0oo0o.video_record_min_time), String.valueOf(((Number) cameraViewModel.f23778OooOO0o.getValue()).longValue() / ((long) 1000))));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23760OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23761OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f23762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(CameraViewModel cameraViewModel, Context context, CoroutineScope coroutineScope) {
            super(0);
            this.f23760OooO0Oo = cameraViewModel;
            this.f23762OooO0o0 = context;
            this.f23761OooO0o = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws Throwable {
            CameraScreenKt.OooO0Oo(this.f23760OooO0Oo, this.f23762OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f23763OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f23764OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2) {
            super(0);
            this.f23763OooO0Oo = cameraViewModel;
            this.f23764OooO0o0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            float f = CameraScreenKt.f23685OooO00o;
            CameraViewModel cameraViewModel = this.f23763OooO0Oo;
            Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
            Function2<MediaModel, SelectMusicModelWrapper, Unit> onMediaPickSuccess = this.f23764OooO0o0;
            Intrinsics.checkNotNullParameter(onMediaPickSuccess, "onMediaPickSuccess");
            CameraScreenKt.OooO0o0(cameraViewModel, onMediaPickSuccess, false);
            CameraViewModel.OooO00o oooO00oOooO0oo = cameraViewModel.OooO0oo();
            Lazy lazy = o0oOOo.f47821OooO00o;
            com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0oOO(0L, null));
            oooO00oOooO0oo.f23796OooO0OO.clear();
            oooO00oOooO0oo.f23799OooO0o0 = null;
            oooO00oOooO0oo.f23800OooO0oO.setValue(CameraViewModel.VideoRecordState.IDLE);
            oooO00oOooO0oo.f23801OooO0oo = null;
            oooO00oOooO0oo.f23793OooO.setValue(0L);
            oooO00oOooO0oo.f23802OooOO0.setValue(Float.valueOf(0.0f));
            oooO00oOooO0oo.f23803OooOO0O.setValue(0L);
            oooO00oOooO0oo.f23804OooOO0o.setValue(Float.valueOf(0.0f));
            oooO00oOooO0oo.f23806OooOOO0.setValue(0L);
            oooO00oOooO0oo.f23805OooOOO.setValue(Float.valueOf(0.0f));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCameraScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt$CaptureButton$3$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,529:1\n154#2:530\n*S KotlinDebug\n*F\n+ 1 CameraScreen.kt\ncom/yalla/yalla/module/media/camera/CameraScreenKt$CaptureButton$3$7$1\n*L\n339#1:530\n*E\n"})
    public static final class o0ooOOo extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ O0OO00 f23765OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(O0OO00 o0oo00) {
            super(1);
            this.f23765OooO0Oo = o0oo00;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            Oo0000 oo0000 = constrainAs.f57606OooO0o0;
            O0OO00 o0oo00 = constrainAs.f57603OooO0OO;
            o000OOo0.OooO0O0(oo0000, o0oo00.f57610OooO0OO, 0.0f, 6);
            o000OOo0.OooO0O0(constrainAs.f57607OooO0oO, o0oo00.f57612OooO0o0, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57604OooO0Oo, this.f23765OooO0Oo.f57611OooO0Oo, Dp.m3775constructorimpl(40), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<O0O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f23766OooO0Oo = new oo000o();

        public oo000o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(O0O0 o0o0) {
            O0O0 constrainAs = o0o0;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            j jVar = constrainAs.f57604OooO0Oo;
            O0OO00 o0oo00 = constrainAs.f57603OooO0OO;
            o0O00oO0.OooO0O0(jVar, o0oo00.f57609OooO0O0, 0.0f, 6);
            o0O00oO0.OooO0O0(constrainAs.f57605OooO0o, o0oo00.f57611OooO0Oo, 0.0f, 6);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class oo0o0Oo {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraViewModel.VideoRecordState.values().length];
            try {
                iArr[CameraViewModel.VideoRecordState.Recording.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraViewModel.VideoRecordState.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, @NotNull Function0<Unit> onBackClick, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @NotNull Bundle params, @NotNull CameraViewModel cameraViewModel, @NotNull Function0<Unit> openCameraError, @NotNull Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> onMediaPickSuccess, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(openCameraError, "openCameraError");
        Intrinsics.checkNotNullParameter(onMediaPickSuccess, "onMediaPickSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(365101091);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(365101091, i, -1, "com.yalla.yalla.module.media.camera.CameraScreen (CameraScreen.kt:74)");
        }
        LifecycleOwner viewLifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(unit);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == companion.getEmpty()) {
            cameraViewModel.getClass();
            Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
            Intrinsics.checkNotNullParameter(params, "params");
            if (!cameraViewModel.f23773OooO0o0) {
                cameraViewModel.f23773OooO0o0 = true;
                Intrinsics.checkNotNullParameter(viewLifecycleOwner, "<set-?>");
                cameraViewModel.f23769OooO0O0 = viewLifecycleOwner;
                cameraViewModel.f23771OooO0Oo = params;
                boolean zOooO0Oo = cameraViewModel.OooO0Oo();
                Lazy lazy = cameraViewModel.f23776OooOO0;
                Boolean boolValueOf = Boolean.valueOf(zOooO0Oo && ((Boolean) lazy.getValue()).booleanValue());
                MutableState mutableState = cameraViewModel.f23781OooOOOO;
                mutableState.setValue(boolValueOf);
                if (!cameraViewModel.OooO0OO()) {
                    mutableState.setValue(Boolean.TRUE);
                }
                cameraViewModel.f23777OooOO0O.setValue(Boolean.valueOf(params.containsKey("camera_show_front") ? params.getBoolean("camera_show_front") : p473o0OoooO0.o0oOOo.f47875OooO0O0.OooO00o("showFrontCamera", true)));
                p473o0OoooO0.o0oOOo o0oooo = p473o0OoooO0.o0oOOo.f47875OooO0O0;
                o0oooo.OooO0O0("showTakePicture", cameraViewModel.OooO());
                o0oooo.OooO0O0("showFrontCamera", cameraViewModel.OooO0oO());
                o0O0o.OooO00o("_CameraVM", "params int: enableTakePicture: " + cameraViewModel.OooO0Oo() + "   enableRecordingVideo:" + cameraViewModel.OooO0OO() + "    firstShowTakePicture:" + ((Boolean) lazy.getValue()).booleanValue() + "  showFrontCamera" + cameraViewModel.OooO0oO());
            }
            composerStartRestartGroup.updateRememberedValue(cameraViewModel);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        if (!cameraViewModel.OooO0Oo() && !cameraViewModel.OooO0OO()) {
            onBackClick.invoke();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, onBackClick, direct2AddMusic, params, cameraViewModel, openCameraError, onMediaPickSuccess, i));
            return;
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        MutableState<Boolean> mutableState3 = o0000Ooo.f47744OooO00o;
        boolean zBooleanValue = mutableState3.getValue().booleanValue();
        float f = f23685OooO00o;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, 0.0f, 0.0f, zBooleanValue ? f : Dp.m3775constructorimpl(0), 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        com.yalla.yalla.module.media.camera.OooOo00.OooO00o(null, cameraViewModel, mutableState2, openCameraError, composerStartRestartGroup, ((i >> 6) & 7168) | 448, 1);
        int i2 = i << 3;
        OooO0O0(cameraViewModel, mutableState2, onBackClick, direct2AddMusic, composerStartRestartGroup, (i2 & 896) | 56 | (i2 & 7168));
        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getBottomCenter()), 0.0f, 0.0f, 0.0f, mutableState3.getValue().booleanValue() ? Dp.m3775constructorimpl(0) : f, 7, null);
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO0OO(cameraViewModel, coroutineScope, onMediaPickSuccess, composerStartRestartGroup, ((i >> 12) & 896) | 72);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign = boxScope.align(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion2, f), 0.0f, 1, null), companion3.getBottomStart());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        z.OooO00o(cameraViewModel, params, composerStartRestartGroup, 72);
        com.yalla.yalla.module.media.camera.OooOOO.OooO0oO(boxScopeInstance, cameraViewModel, composerStartRestartGroup, 70);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.o00Oo0.OooO00o(Lifecycle.Event.ON_STOP, new OooO0O0(cameraViewModel), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(boxScope, onBackClick, direct2AddMusic, params, cameraViewModel, openCameraError, onMediaPickSuccess, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x044c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0451  */
    /* JADX WARN: Code duplicated, block: B:105:0x0458  */
    /* JADX WARN: Code duplicated, block: B:109:0x0462  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0382  */
    /* JADX WARN: Code duplicated, block: B:76:0x038e  */
    /* JADX WARN: Code duplicated, block: B:78:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:91:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x040c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0428  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull CameraViewModel cameraViewModel, @NotNull MutableState<PreviewView> previewView, @NotNull Function0<Unit> onBack, @NotNull Function1<? super SelectMusicModel, Unit> direct2AddMusic, @Nullable Composer composer, int i) {
        boolean z;
        CameraViewModel.VideoRecordState videoRecordState;
        BoxScopeInstance boxScopeInstance;
        boolean z2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean zChanged;
        Object objRememberedValue;
        boolean z3;
        boolean zChanged2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(direct2AddMusic, "direct2AddMusic");
        Composer composerStartRestartGroup = composer.startRestartGroup(310412030);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(310412030, i, -1, "com.yalla.yalla.module.media.camera.CameraToolBar (CameraScreen.kt:144)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue4;
        Oooo000 oooo000 = new Oooo000(cameraViewModel, mutableState, onBack);
        String strStringResource = StringResources_androidKt.stringResource(o0O0oo0o.sure_to_discard_this_video, composerStartRestartGroup, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(o0O0oo0o.Discard, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new OooO0o(mutableState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Function0 function0 = (Function0) objRememberedValue5;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged4 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onBack);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new OooO(mutableState, onBack);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Function0 function1 = (Function0) objRememberedValue6;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged5 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new OooOO0(mutableState2, mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o000O0Oo.OooO0Oo(mutableState, strStringResource, null, null, false, false, function0, null, strStringResource2, false, null, false, function1, null, false, false, null, (Function0) objRememberedValue7, null, null, composerStartRestartGroup, 6, 0, 913084);
        boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged6 = composerStartRestartGroup.changed(oooo000);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged6 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new OooOO0O(oooo000);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p010OooOOoo.OooOo.OooO00o(zBooleanValue, (Function0) objRememberedValue8, composerStartRestartGroup, 0, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion2), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1954948208);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged7 = composerStartRestartGroup.changed(oooo000);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new OooOo00(oooo000);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue9, 253);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1954948336);
        CameraViewModel.VideoRecordState value = cameraViewModel.OooO0oo().f23800OooO0oO.getValue();
        CameraViewModel.VideoRecordState videoRecordState2 = CameraViewModel.VideoRecordState.Recording;
        if (value != videoRecordState2) {
            z = true;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0oO0O0o.ic_camera_close_page, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(12), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(24)).then(modifierOooO0O0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        } else {
            z = true;
        }
        r15.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1954948741);
        if (!cameraViewModel.OooO()) {
            videoRecordState = videoRecordState2;
            if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == videoRecordState) {
                z2 = false;
                boxScopeInstance = boxScopeInstance2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1600965810);
            if (cameraViewModel.OooO()) {
                composer2 = composerStartRestartGroup;
            } else if (cameraViewModel.OooO0o().f23809OooO00o.getValue() == null) {
                composerStartRestartGroup.startReplaceableGroup(1954949348);
                if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() != videoRecordState) {
                    if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) {
                        z3 = z;
                    } else {
                        z3 = z2;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(direct2AddMusic);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new OooOOO0(direct2AddMusic);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.yalla.yalla.module.media.camera.OooOOO.OooO00o(boxScopeInstance, z3, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1954949792);
                if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() != videoRecordState) {
                    MutableState<SelectMusicModel> mutableState3 = cameraViewModel.OooO0o().f23809OooO00o;
                    if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) {
                        z2 = z;
                    }
                    OooOOO oooOOO = new OooOOO(cameraViewModel);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(direct2AddMusic);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new OooOOOO(direct2AddMusic);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                    boolean z4 = z2;
                    composer2 = composerStartRestartGroup;
                    com.yalla.yalla.module.media.camera.OooOOO.OooO0o(boxScopeInstance3, mutableState3, z4, 0L, oooOOO, (Function1) objRememberedValue, null, null, null, null, composer2, 3078, 480);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.animation.OooOo.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(cameraViewModel, previewView, onBack, direct2AddMusic, i));
        }
        videoRecordState = videoRecordState2;
        boxScopeInstance = boxScopeInstance2;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getTopEnd()), 0.0f, Dp.m3775constructorimpl(10), Dp.m3775constructorimpl(16), 0.0f, 9, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO00o.OooO00o(companion3, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        com.yalla.yalla.module.media.camera.OooOOO.OooO0Oo(cameraViewModel, previewView, composerStartRestartGroup, (i & 112) | 8);
        com.yalla.yalla.module.media.camera.OooOOO.OooO0OO(cameraViewModel, composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        z2 = false;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1600965810);
        if (cameraViewModel.OooO()) {
            composer2 = composerStartRestartGroup;
        } else if (cameraViewModel.OooO0o().f23809OooO00o.getValue() == null) {
            composerStartRestartGroup.startReplaceableGroup(1954949348);
            if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() != videoRecordState) {
                if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(direct2AddMusic);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO0(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.yalla.yalla.module.media.camera.OooOOO.OooO00o(boxScopeInstance, z3, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(1954949792);
            if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() != videoRecordState) {
                MutableState<SelectMusicModel> mutableState4 = cameraViewModel.OooO0o().f23809OooO00o;
                if (cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.IDLE) {
                    z2 = z;
                }
                OooOOO oooOOO2 = new OooOOO(cameraViewModel);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(direct2AddMusic);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOOOO(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOOOO(direct2AddMusic);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxScopeInstance boxScopeInstance4 = boxScopeInstance;
                boolean z5 = z2;
                composer2 = composerStartRestartGroup;
                com.yalla.yalla.module.media.camera.OooOOO.OooO0o(boxScopeInstance4, mutableState4, z5, 0L, oooOOO2, (Function1) objRememberedValue, null, null, null, null, composer2, 3078, 480);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.animation.OooOo.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(cameraViewModel, previewView, onBack, direct2AddMusic, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"MissingPermission"})
    public static final void OooO0OO(@NotNull final CameraViewModel cameraViewModel, @NotNull CoroutineScope coroutineScope, @NotNull final Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> onMediaPickSuccess, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onMediaPickSuccess, "onMediaPickSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1558786078);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1558786078, i, -1, "com.yalla.yalla.module.media.camera.CaptureButton (CameraScreen.kt:257)");
        }
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        p454o0Ooo0.OooO0o.OooO00o(cameraViewModel.f23774OooO0oO, composerStartRestartGroup, 0);
        if (cameraViewModel.OooO()) {
            composerStartRestartGroup.startReplaceableGroup(-893999958);
            com.yalla.yalla.module.media.camera.OooOOO.OooO0O0(com.code.android.util.o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new Oooo0(cameraViewModel, onMediaPickSuccess, coroutineScope2), 253), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-893999732);
            int i2 = oo0o0Oo.$EnumSwitchMapping$0[cameraViewModel.OooO0oo().f23800OooO0oO.getValue().ordinal()];
            if (i2 == 1 || i2 == 2) {
                composerStartRestartGroup.startReplaceableGroup(-893999552);
                boolean z = cameraViewModel.OooO0oo().f23800OooO0oO.getValue() == CameraViewModel.VideoRecordState.Recording;
                com.yalla.yalla.module.media.camera.OooOOO.OooO0oo(cameraViewModel, new o000oOoO(cameraViewModel, onMediaPickSuccess), composerStartRestartGroup, 8);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new q();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final q qVar = (q) objRememberedValue;
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
                Pair pairOooO0O0 = e.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, qVar, composerStartRestartGroup);
                MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
                final Function0 function0 = (Function0) pairOooO0O0.component2();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.module.media.camera.CameraScreenKt$CaptureButton$$inlined$ConstraintLayout$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        t.OooO00o(semantics, qVar);
                        return Unit.INSTANCE;
                    }
                }, 1, null);
                final boolean z2 = z;
                LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.media.camera.CameraScreenKt$CaptureButton$$inlined$ConstraintLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(Composer composer2, Integer num) {
                        O0OO00 o0oo00;
                        int i3;
                        Composer composer3 = composer2;
                        if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.OooO0Oo();
                            ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                            O0OO00 o0oo00OooO00o = oooO00oOooO0OO.OooO00o();
                            O0OO00 o0oo00OooO0O0 = oooO00oOooO0OO.OooO0O0();
                            O0OO00 o0oo00OooO0OO = oooO00oOooO0OO.OooO0OO();
                            composer3.startReplaceableGroup(-492369756);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue4 == companion2.getEmpty()) {
                                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            MutableState mutableState = (MutableState) objRememberedValue4;
                            String strStringResource = StringResources_androidKt.stringResource(o0O0oo0o.sure_to_delete_this_video, composer3, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(o0O0oo0o.Delete, composer3, 0);
                            CameraViewModel cameraViewModel2 = cameraViewModel;
                            Function2 function2 = onMediaPickSuccess;
                            CameraScreenKt.o0OoOo0 o0oooo1 = new CameraScreenKt.o0OoOo0(cameraViewModel2, function2);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged = composer3.changed(mutableState);
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue5 == companion2.getEmpty()) {
                                objRememberedValue5 = new CameraScreenKt.o00O0O(mutableState);
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            composer3.endReplaceableGroup();
                            o000O0Oo.OooO0Oo(mutableState, strStringResource, null, null, false, false, null, null, strStringResource2, false, null, false, o0oooo1, null, false, false, null, (Function0) objRememberedValue5, null, null, composer3, 6, 0, 913148);
                            composer3.startReplaceableGroup(-138894840);
                            boolean z3 = z2;
                            if (z3) {
                                o0oo00 = o0oo00OooO0O0;
                                i3 = 0;
                            } else {
                                i3 = 0;
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0oO0O0o.ic_camera_cancel, composer3, 0);
                                Modifier modifierOooO00o = androidx.media3.session.o000OOo0.OooO00o(36, Modifier.INSTANCE, composer3, 1157296644);
                                o0oo00 = o0oo00OooO0O0;
                                boolean zChanged2 = composer3.changed(o0oo00);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue6 == companion2.getEmpty()) {
                                    objRememberedValue6 = new CameraScreenKt.o00Oo0(o0oo00);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierOooO00o2 = ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo00OooO00o, (Function1) objRememberedValue6);
                                composer3.startReplaceableGroup(1157296644);
                                boolean zChanged3 = composer3.changed(mutableState);
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue7 == companion2.getEmpty()) {
                                    objRememberedValue7 = new CameraScreenKt.o00Ooo(mutableState);
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                composer3.endReplaceableGroup();
                                ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierOooO00o2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue7, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            }
                            composer3.endReplaceableGroup();
                            float fFloatValue = ((Number) cameraViewModel2.OooO0oo().f23805OooOOO.getValue()).floatValue();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            OooOOO.OooO0o0(fFloatValue, z3, o0O0O00.OooO0O0(ConstraintLayoutScope.OooO00o(companion3, o0oo00, CameraScreenKt.oo000o.f23766OooO0Oo), false, false, 0L, false, null, null, null, new CameraScreenKt.o00oO0o(z2, cameraViewModel, onMediaPickSuccess, context, coroutineScope2), 253), composer3, i3);
                            boolean z4 = cameraViewModel2.OooO0oo().OooO00o() >= ((Number) cameraViewModel2.f23778OooOO0o.getValue()).longValue() ? 1 : i3;
                            composer3.startReplaceableGroup(-893996511);
                            if (z4 != 0 || !z3) {
                                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(z4 != 0 ? o0oO0O0o.ic_camera_complete : o0oO0O0o.ic_camera_complete_disable, composer3, i3);
                                Modifier modifierOooO00o3 = androidx.media3.session.o000OOo0.OooO00o(36, companion3, composer3, 1157296644);
                                boolean zChanged4 = composer3.changed(o0oo00);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue8 == companion2.getEmpty()) {
                                    objRememberedValue8 = new CameraScreenKt.o0ooOOo(o0oo00);
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                ImageKt.Image(painterPainterResource2, (String) null, o0O0O00.OooO0O0(ConstraintLayoutScope.OooO00o(modifierOooO00o3, o0oo00OooO0OO, (Function1) objRememberedValue8), false, false, 0L, false, null, null, null, new CameraScreenKt.o0OOO0o(z3, cameraViewModel2, function2, z4), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            }
                            composer3.endReplaceableGroup();
                        }
                        return Unit.INSTANCE;
                    }
                }), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-893994746);
                com.yalla.yalla.module.media.camera.OooOOO.OooO0O0(com.code.android.util.o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0Oo0oo(cameraViewModel, context, coroutineScope2), 253), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(cameraViewModel, coroutineScope, onMediaPickSuccess, i));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0195, please report this as an issue */
    public static final void OooO0Oo(CameraViewModel cameraViewModel, Context context) throws Throwable {
        boolean z;
        int i;
        Object obj;
        Object obj2;
        int i2;
        IOException e;
        int i3;
        androidx.camera.video.OooOOO0 oooOOO0;
        if (cameraViewModel.OooO0oo().OooO00o() >= cameraViewModel.OooO0oo().f23794OooO00o) {
            o000O00.OooO0O0(o0000.OooO0OO(o0O0oo0o.video_record_max_time));
            return;
        }
        cameraViewModel.f23779OooOOO.setValue(null);
        if (cameraViewModel.OooO0oo().f23797OooO0Oo == null) {
            return;
        }
        CameraViewModel.OooO00o oooO00oOooO0oo = cameraViewModel.OooO0oo();
        CameraViewModel.OooO00o oooO00oOooO0oo2 = cameraViewModel.OooO0oo();
        Lazy lazy = o0oOOo.f47821OooO00o;
        oooO00oOooO0oo2.f23801OooO0oo = o0oOOo.OooO00o(o0oOOo.OooO0OO(), ".mp4");
        File file = cameraViewModel.OooO0oo().f23801OooO0oo;
        Intrinsics.checkNotNull(file);
        OoooOoo.o000O0Oo.OooO00o oooO00o = new OoooOoo.o000O0Oo.OooO00o();
        oooO00o.OooO0OO();
        oooO00o.OooO0O0();
        o000OO.OooOOO0.OooO0o0(file, "File can't be null.");
        oooO00o.f1630OooO0OO = file;
        o00O0000 o00o0001 = new o00O0000(oooO00o.OooO00o());
        Intrinsics.checkNotNullExpressionValue(o00o0001, "build(...)");
        o0O0o.OooO00o("_Camera", "start video, videoFile : " + cameraViewModel.OooO0oo().f23801OooO0oo);
        androidx.camera.video.OooOOOO<androidx.camera.video.OooOO0O> oooOOOO = cameraViewModel.OooO0oo().f23797OooO0Oo;
        Intrinsics.checkNotNull(oooOOOO);
        final androidx.camera.video.OooOO0O oooOO0O = (androidx.camera.video.OooOO0O) oooOOOO.Oooo0O0();
        oooOO0O.getClass();
        Context contextOooO00o = p031OoooO0.o000oOoO.OooO00o(context);
        boolean z2 = true;
        if (!oooO00oOooO0oo.f23798OooO0o.getValue().booleanValue()) {
            z = false;
        } else {
            if (PermissionChecker.OooO00o(contextOooO00o, "android.permission.RECORD_AUDIO") == -1) {
                throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            }
            o000OO.OooOOO0.OooO0o("The Recorder this recording is associated to doesn't support audio.", ((MediaSpec) androidx.camera.video.OooOO0O.OooOO0(oooOO0O.f3947OooOoOO)).OooO0O0().OooO0OO() != 0);
            z = true;
        }
        Executor executorAsExecutor = ExecutorsKt.asExecutor(Dispatchers.getMain());
        c0 c0Var = oooO00oOooO0oo.f23808OooOOOo;
        o000OO.OooOOO0.OooO0o0(executorAsExecutor, "Listener Executor can't be null.");
        o000OO.OooOOO0.OooO0o0(c0Var, "Event listener can't be null");
        Object obj3 = oooOO0O.f3926OooO0o;
        synchronized (obj3) {
            try {
                try {
                    long j = 1 + oooOO0O.f3934OooOOO0;
                    oooOO0O.f3934OooOOO0 = j;
                    switch (androidx.camera.video.OooOO0O.OooOO0.f3985OooO00o[oooOO0O.f3929OooO0oo.ordinal()]) {
                        case 1:
                        case 2:
                            i = 0;
                            obj = oooOO0O.f3931OooOO0O;
                            obj2 = obj;
                            i2 = i;
                            e = null;
                            if (obj2 == null) {
                                throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
                            }
                            if (i2 != 0) {
                                o00O0O0.OooO0O0("Recorder", "Recording was started when the Recorder had encountered error " + e);
                                oooOO0O.OooO0oo(new androidx.camera.video.OooO0OO(o00o0001, executorAsExecutor, c0Var, z, j), i2);
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, true);
                            } else {
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, false);
                            }
                            oooO00oOooO0oo.f23799OooO0o0 = oooOOO0;
                            o0O0o.OooO00o("_Camera", "Recording started  " + o00o0001);
                            return;
                        case 3:
                        case 4:
                            i = 0;
                            obj = oooOO0O.f3932OooOO0o;
                            obj.getClass();
                            obj2 = obj;
                            i2 = i;
                            e = null;
                            if (obj2 == null) {
                                throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
                            }
                            if (i2 != 0) {
                                o00O0O0.OooO0O0("Recorder", "Recording was started when the Recorder had encountered error " + e);
                                oooOO0O.OooO0oo(new androidx.camera.video.OooO0OO(o00o0001, executorAsExecutor, c0Var, z, j), i2);
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, true);
                            } else {
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, false);
                            }
                            oooO00oOooO0oo.f23799OooO0o0 = oooOOO0;
                            o0O0o.OooO00o("_Camera", "Recording started  " + o00o0001);
                            return;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            androidx.camera.video.OooOO0O.OooOOO oooOOO = oooOO0O.f3929OooO0oo;
                            androidx.camera.video.OooOO0O.OooOOO oooOOO2 = androidx.camera.video.OooOO0O.OooOOO.IDLING;
                            if (oooOOO == oooOOO2) {
                                if (oooOO0O.f3931OooOO0O != null || oooOO0O.f3932OooOO0o != null) {
                                    z2 = false;
                                }
                                o000OO.OooOOO0.OooO0o("Expected recorder to be idle but a recording is either pending or in progress.", z2);
                            }
                            try {
                                j = j;
                                obj3 = obj3;
                                try {
                                    androidx.camera.video.OooO0OO oooO0OO = new androidx.camera.video.OooO0OO(o00o0001, executorAsExecutor, c0Var, z, j);
                                    oooO0OO.OooOoO(contextOooO00o);
                                    oooOO0O.f3932OooOO0o = oooO0OO;
                                    androidx.camera.video.OooOO0O.OooOOO oooOOO3 = oooOO0O.f3929OooO0oo;
                                    if (oooOOO3 == oooOOO2) {
                                        oooOO0O.OooOoOO(androidx.camera.video.OooOO0O.OooOOO.PENDING_RECORDING);
                                        oooOO0O.f3924OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00O00OO
                                            /* JADX WARN: Code duplicated, block: B:24:0x0047  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i4;
                                                OooOO0O.OooOOO0 oooOOO1;
                                                boolean z3;
                                                OooO0OO oooO0OO2;
                                                OooOO0O.OooOOO0 oooOOO0OooOOOO;
                                                OooOO0O oooOO0O2 = oooOO0O;
                                                synchronized (oooOO0O2.f3926OooO0o) {
                                                    try {
                                                        int i5 = OooOO0O.OooOO0.f3985OooO00o[oooOO0O2.f3929OooO0oo.ordinal()];
                                                        i4 = 4;
                                                        oooOOO1 = null;
                                                        if (i5 != 3) {
                                                            if (i5 != 4) {
                                                                z3 = false;
                                                                oooOOO0OooOOOO = null;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            i4 = 0;
                                                            oooOOO1 = oooOOO0OooOOOO;
                                                            oooO0OO2 = null;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        if (oooOO0O2.f3931OooOO0O != null || oooOO0O2.f3969OoooOOo) {
                                                            i4 = 0;
                                                            oooO0OO2 = null;
                                                        } else if (oooOO0O2.f3973o000oOoO == VideoOutput.SourceState.INACTIVE) {
                                                            oooO0OO2 = oooOO0O2.f3932OooOO0o;
                                                            oooOO0O2.f3932OooOO0o = null;
                                                            oooOO0O2.OooOo0O();
                                                            Set<OooOO0O.OooOOO> set = OooOO0O.f3915Ooooo00;
                                                        } else if (oooOO0O2.f3948OooOoo != null) {
                                                            oooOOO0OooOOOO = oooOO0O2.OooOOOO(oooOO0O2.f3929OooO0oo);
                                                            i4 = 0;
                                                            oooOOO1 = oooOOO0OooOOOO;
                                                            oooO0OO2 = null;
                                                        } else {
                                                            i4 = 0;
                                                            oooO0OO2 = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (oooOOO1 != null) {
                                                    oooOO0O2.OooOooo(oooOOO1, z3);
                                                } else if (oooO0OO2 != null) {
                                                    oooOO0O2.OooO0oo(oooO0OO2, i4);
                                                }
                                            }
                                        });
                                        i3 = 0;
                                    } else if (oooOOO3 == androidx.camera.video.OooOO0O.OooOOO.ERROR) {
                                        oooOO0O.OooOoOO(androidx.camera.video.OooOO0O.OooOOO.PENDING_RECORDING);
                                        i3 = 0;
                                        oooOO0O.f3924OooO0OO.execute(new o00O0O0O(oooOO0O, i3));
                                    } else {
                                        i3 = 0;
                                        oooOO0O.OooOoOO(androidx.camera.video.OooOO0O.OooOOO.PENDING_RECORDING);
                                    }
                                    i2 = i3;
                                    e = null;
                                } catch (IOException e2) {
                                    e = e2;
                                    i2 = 5;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                j = j;
                                obj3 = obj3;
                            }
                            obj2 = null;
                            if (obj2 == null) {
                                throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
                            }
                            if (i2 != 0) {
                                o00O0O0.OooO0O0("Recorder", "Recording was started when the Recorder had encountered error " + e);
                                oooOO0O.OooO0oo(new androidx.camera.video.OooO0OO(o00o0001, executorAsExecutor, c0Var, z, j), i2);
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, true);
                            } else {
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, false);
                            }
                            oooO00oOooO0oo.f23799OooO0o0 = oooOOO0;
                            o0O0o.OooO00o("_Camera", "Recording started  " + o00o0001);
                            return;
                        default:
                            j = j;
                            obj3 = obj3;
                            i3 = 0;
                            i2 = i3;
                            e = null;
                            obj2 = null;
                            if (obj2 == null) {
                                throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
                            }
                            if (i2 != 0) {
                                o00O0O0.OooO0O0("Recorder", "Recording was started when the Recorder had encountered error " + e);
                                oooOO0O.OooO0oo(new androidx.camera.video.OooO0OO(o00o0001, executorAsExecutor, c0Var, z, j), i2);
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, true);
                            } else {
                                oooOOO0 = new androidx.camera.video.OooOOO0(oooOO0O, j, o00o0001, false);
                            }
                            oooO00oOooO0oo.f23799OooO0o0 = oooOOO0;
                            o0O0o.OooO00o("_Camera", "Recording started  " + o00o0001);
                            return;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        throw th;
    }

    public static final void OooO0o(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2) {
        MutableState mutableState = cameraViewModel.f23772OooO0o;
        Boolean bool = Boolean.TRUE;
        mutableState.setValue(bool);
        if (cameraViewModel.OooO0oo().f23796OooO0OO.size() == 1) {
            OooO0oO(cameraViewModel, function2, cameraViewModel.OooO0oo().f23796OooO0OO.get(0).getFilePath());
            return;
        }
        cameraViewModel.f23774OooO0oO.setValue(bool);
        Lazy lazy = o0oOOo.f47821OooO00o;
        String absolutePath = new File(o0oOOo.OooO0OO(), p004OooO0oO.o000oOoO.OooO00o("merge-", new SimpleDateFormat("yyyyMMddHHmmss", Locale.US).format(Long.valueOf(System.currentTimeMillis())), ".mp4")).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        LifecycleOwner lifecycleOwner = cameraViewModel.f23769OooO0O0;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLifecycleOwner");
            lifecycleOwner = null;
        }
        com.code.android.util.OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), new o000OOo(cameraViewModel, absolutePath, function2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"RestrictedApi"})
    public static final void OooO0o0(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, boolean z) {
        cameraViewModel.OooO0oo().f23795OooO0O0 = z;
        CameraViewModel.VideoRecordState value = cameraViewModel.OooO0oo().f23800OooO0oO.getValue();
        CameraViewModel.VideoRecordState videoRecordState = CameraViewModel.VideoRecordState.Pause;
        MutableState mutableState = cameraViewModel.f23772OooO0o;
        if (value == videoRecordState && z) {
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                return;
            }
            OooO0o(cameraViewModel, function2);
            return;
        }
        mutableState.setValue(Boolean.TRUE);
        cameraViewModel.OooO0oo().f23807OooOOOO = new o0O0O00(cameraViewModel, function2, z);
        o0O0o.OooO00o("_Camera", "pauseOrCompleteRecording()   stop or complete video");
        androidx.camera.video.OooOOO0 oooOOO0 = cameraViewModel.OooO0oo().f23799OooO0o0;
        if (oooOOO0 != null) {
            oooOOO0.close();
        }
    }

    public static final void OooO0oO(CameraViewModel cameraViewModel, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, String str) {
        cameraViewModel.f23772OooO0o.setValue(Boolean.FALSE);
        Uri uriFromFile = Uri.fromFile(new File(str));
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(...)");
        MediaModel mediaModel = new MediaModel(false, uriFromFile, null, 4, null);
        mediaModel.setVideoInfo(new MediaVideoInfo(cameraViewModel.OooO0oo().f23796OooO0OO, 0L, mediaModel.getVideoDuration()));
        function2.invoke(mediaModel, new SelectMusicModelWrapper(SelectMusicFrom.CAMERA_PAGE, cameraViewModel.OooO0o().f23809OooO00o.getValue()));
    }
}
