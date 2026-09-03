package p485o0o00O0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.o00oOoo;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o0ooOOo;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p599o0oo00oo.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPostDetailCommentSonListBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,411:1\n72#2,6:412\n78#2:446\n82#2:494\n78#3,11:418\n78#3,11:456\n91#3:488\n91#3:493\n78#3,11:503\n78#3,11:540\n78#3,11:576\n91#3:612\n91#3:619\n91#3:624\n456#4,8:429\n464#4,3:443\n456#4,8:467\n464#4,3:481\n467#4,3:485\n467#4,3:490\n456#4,8:514\n464#4,3:528\n456#4,8:551\n464#4,3:565\n456#4,8:587\n464#4,3:601\n467#4,3:609\n467#4,3:616\n467#4,3:621\n4144#5,6:437\n4144#5,6:475\n4144#5,6:522\n4144#5,6:559\n4144#5,6:595\n164#6:447\n154#6:448\n154#6:449\n154#6:495\n154#6:496\n154#6:532\n154#6:533\n154#6:569\n154#6:605\n154#6:606\n154#6:607\n154#6:608\n154#6:614\n154#6:615\n154#6:627\n154#6:628\n154#6:629\n73#7,6:450\n79#7:484\n83#7:489\n73#7,6:534\n79#7:568\n83#7:620\n66#8,6:497\n72#8:531\n66#8,6:570\n72#8:604\n76#8:613\n76#8:625\n76#9:626\n*S KotlinDebug\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt\n*L\n84#1:412,6\n84#1:446\n84#1:494\n84#1:418,11\n102#1:456,11\n102#1:488\n84#1:493\n187#1:503,11\n188#1:540,11\n197#1:576,11\n197#1:612\n188#1:619\n187#1:624\n84#1:429,8\n84#1:443,3\n102#1:467,8\n102#1:481,3\n102#1:485,3\n84#1:490,3\n187#1:514,8\n187#1:528,3\n188#1:551,8\n188#1:565,3\n197#1:587,8\n197#1:601,3\n197#1:609,3\n188#1:616,3\n187#1:621,3\n84#1:437,6\n102#1:475,6\n187#1:522,6\n188#1:559,6\n197#1:595,6\n97#1:447\n105#1:448\n106#1:449\n145#1:495\n146#1:496\n192#1:532\n193#1:533\n200#1:569\n208#1:605\n209#1:606\n210#1:607\n224#1:608\n229#1:614\n231#1:615\n253#1:627\n270#1:628\n271#1:629\n102#1:450,6\n102#1:484\n102#1:489\n188#1:534,6\n188#1:568\n188#1:620\n187#1:497,6\n187#1:531\n197#1:570,6\n197#1:604\n197#1:613\n187#1:625\n246#1:626\n*E\n"})
public final class o0O0O0Oo {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47945OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0OOO0 onLogin = o0O0OOO0.f47975OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.getClass();
                Unit unit = Unit.INSTANCE;
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47946OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOOo o00ooooo2) {
            super(0);
            this.f47946OooO0Oo = o00ooooo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            final o00OOOOo o00ooooo2 = this.f47946OooO0Oo;
            if (o00ooooo2.OooO00o().getSpanManager().OooO0OO("@") >= 7) {
                String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Mention_a_maximum_of_XXX_people), "7");
                if (!StringsKt.isBlank(strOooO00o)) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                o00ooooo2.f47864OooO0Oo.setValue(Boolean.TRUE);
                o00ooooo2.OooO0O0(false);
                o000OO o000oo2 = new o000OO(o00ooooo2.f47861OooO00o);
                o000oo2.f56864OooO0O0 = AtFriendsActivity.class;
                o000oo2.OooO0O0(new p599o0oo00oo.o0000O() { // from class: o0o00O0.o0O0oo0o
                    @Override // p599o0oo00oo.o0000O
                    public final void onActivityResult(int i, Intent intent) {
                        o00OOOOo detailBottomState = o00ooooo2;
                        Intrinsics.checkNotNullParameter(detailBottomState, "$detailBottomState");
                        detailBottomState.f47864OooO0Oo.setValue(Boolean.FALSE);
                        if (intent != null) {
                            detailBottomState.OooO00o().postDelayed(new o00oOoo(2, detailBottomState, intent), 200L);
                        }
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47947OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47948OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OOOOo o00ooooo2, int i) {
            super(2);
            this.f47947OooO0Oo = o00ooooo2;
            this.f47948OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47948OooO0o0 | 1);
            o0O0O0Oo.OooO00o(this.f47947OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, EditTextSpan> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47949OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OOOOo o00ooooo2) {
            super(1);
            this.f47949OooO0Oo = o00ooooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final EditTextSpan invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f47949OooO0Oo.OooO00o();
        }
    }

    public static final class OooO0o extends Lambda implements Function1<EditTextSpan, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47950OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EditTextSpan editTextSpan) {
            EditTextSpan it = editTextSpan;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f47951OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f47952OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47953OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RowScope rowScope, o00OOOOo o00ooooo2, int i) {
            super(2);
            this.f47951OooO0Oo = rowScope;
            this.f47953OooO0o0 = o00ooooo2;
            this.f47952OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47952OooO0o | 1);
            o0O0O0Oo.OooO0O0(this.f47951OooO0Oo, this.f47953OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47954OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f47955OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o00OOOOo o00ooooo2, Context context) {
            super(0);
            this.f47954OooO0Oo = o00ooooo2;
            this.f47955OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p367o0OOo0o0.OooOOOO value = this.f47954OooO0Oo.f47865OooO0o.getValue();
            if (value != null) {
                value.OooO0OO(this.f47955OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListBottomCompKt$InitSonListKeyBoardPanelHelper$1", f = "PostDetailCommentSonListBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47956OooO0Oo;

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOOOo f47957OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00OOOOo o00ooooo2) {
                super(2);
                this.f47957OooO0Oo = o00ooooo2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                this.f47957OooO0Oo.f47867OooO0oO.setValue(Boolean.valueOf(zBooleanValue));
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOOOo f47958OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o00OOOOo o00ooooo2) {
                super(2);
                this.f47958OooO0Oo = o00ooooo2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                Integer num2 = num;
                o00OOOOo o00ooooo2 = this.f47958OooO0Oo;
                if (zBooleanValue) {
                    o000OO00.OooOOOO(o00ooooo2.f47862OooO0O0);
                } else {
                    o000OO00.OooO0O0(o00ooooo2.f47862OooO0O0);
                }
                Function3<? super o00OOOOo, ? super Boolean, ? super Integer, Unit> function3 = o00ooooo2.f47871OooOO0o;
                if (function3 != null) {
                    function3.invoke(o00ooooo2, Boolean.valueOf(zBooleanValue), num2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o00OOOOo o00ooooo2, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f47956OooO0Oo = o00ooooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f47956OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            final o00OOOOo o00ooooo2 = this.f47956OooO0Oo;
            MutableState<p367o0OOo0o0.OooOOOO> mutableState = o00ooooo2.f47865OooO0o;
            p367o0OOo0o0.OooOOOO oooOOOO = new p367o0OOo0o0.OooOOOO(o00ooooo2.f47860OooO, o00ooooo2.OooO00o());
            oooOOOO.f43971OooO0OO = new OooO00o(o00ooooo2);
            oooOOOO.f43972OooO0Oo = new OooO0O0(o00ooooo2);
            mutableState.setValue(oooOOOO);
            o00ooooo2.OooO00o().f30974OooO0oO = new o0O0OOOo();
            o00ooooo2.f47862OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00O0.oo0OOoo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    o00ooooo2.OooO0O0(false);
                    return true;
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f47959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f47960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47961OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, o00OOOOo o00ooooo2, int i) {
            super(2);
            this.f47959OooO0Oo = modifier;
            this.f47961OooO0o0 = o00ooooo2;
            this.f47960OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47960OooO0o | 1);
            o0O0O0Oo.OooO0OO(this.f47959OooO0Oo, this.f47961OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListBottomCompKt$InitSonListKeyBoardPanelHelper$2", f = "PostDetailCommentSonListBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47962OooO0Oo;

        public static final class OooO00o extends Lambda implements Function1<EmojiFaceView, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOOOo f47963OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00OOOOo o00ooooo2) {
                super(1);
                this.f47963OooO0Oo = o00ooooo2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(EmojiFaceView emojiFaceView) {
                o00OOOOo o00ooooo2 = this.f47963OooO0Oo;
                o00ooooo2.f47869OooOO0.OooO00o(o00ooooo2.OooO00o());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o00OOOOo o00ooooo2, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f47962OooO0Oo = o00ooooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f47962OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OOOOo o00ooooo2 = this.f47962OooO0Oo;
            o00ooooo2.f47869OooOO0.f55753OooO0o0 = new OooO00o(o00ooooo2);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPostDetailCommentSonListBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt$MomentReplyActivityBottomComp$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,411:1\n315#2:412\n329#2,4:413\n316#2:417\n*S KotlinDebug\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt$MomentReplyActivityBottomComp$1\n*L\n89#1:412\n89#1:413,4\n89#1:417\n*E\n"})
    public static final class OooOo extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f47964OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(View view) {
            super(1);
            this.f47964OooO0Oo = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            int iM3924getHeightimpl = IntSize.m3924getHeightimpl(it.mo2801getSizeYbymL2g());
            View view = this.f47964OooO0Oo;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iM3924getHeightimpl;
                view.setLayoutParams(layoutParams);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47965OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47966OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o00OOOOo o00ooooo2, int i) {
            super(2);
            this.f47965OooO0Oo = o00ooooo2;
            this.f47966OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47966OooO0o0 | 1);
            o0O0O0Oo.OooO0Oo(this.f47965OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f47967OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ View f47968OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47969OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47970OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(BoxScope boxScope, o00OOOOo o00ooooo2, View view, int i) {
            super(2);
            this.f47967OooO0Oo = boxScope;
            this.f47969OooO0o0 = o00ooooo2;
            this.f47968OooO0o = view;
            this.f47970OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47970OooO0oO | 1);
            o00OOOOo o00ooooo2 = this.f47969OooO0o0;
            View view = this.f47968OooO0o;
            o0O0O0Oo.OooO0o0(this.f47967OooO0Oo, o00ooooo2, view, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f47971OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o00OOOOo o00ooooo2) {
            super(3);
            this.f47971OooO0Oo = o00ooooo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554828213, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentReplyActivityBottomComp.<anonymous>.<anonymous>.<anonymous> (PostDetailCommentSonListBottomComp.kt:117)");
            }
            o0O0O0Oo.OooO0o(this.f47971OooO0Oo, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1111339007);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1111339007, i, -1, "com.yalla.yalla.ui.activity.moment.AtImage (PostDetailCommentSonListBottomComp.kt:139)");
        }
        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_at, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(13), 3, null), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new OooO00o(o00ooooo2), 253), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, composerStartRestartGroup, 56, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(o00ooooo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(RowScope rowScope, o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1288087601);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1288087601, i, -1, "com.yalla.yalla.ui.activity.moment.EditTextAndEmoji (PostDetailCommentSonListBottomComp.kt:183)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f = 8;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(com.facebook.OooOo.OooO0O0(21, PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getCenterStart()), 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(f), 1, null)), o0oO0O0o.f47078o000o0O, null, 2, null);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
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
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierOooO00o2 = o0oOO.OooO00o(12, androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        float f2 = 0;
        AndroidView_androidKt.AndroidView(new OooO0OO(o00ooooo2), PaddingKt.m478paddingVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getCenterStart()), 0.0f, Dp.m3765constructorimpl(95), 1, null), Dp.m3765constructorimpl(38), 0.0f, 2, null), Dp.m3765constructorimpl(f2), 0.0f, 2, null), OooO0o.f47950OooO0Oo, composerStartRestartGroup, 384, 0);
        composerStartRestartGroup.startReplaceableGroup(1293660322);
        if (o00ooooo2.f47863OooO0OO.getValue().booleanValue()) {
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o00ooooo2.f47866OooO0o0.getValue(), PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), Dp.m3765constructorimpl(f2), 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 10, null), o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
        } else {
            composer2 = composerStartRestartGroup;
        }
        o0ooOOo.OooO00o(composer2);
        Composer composer3 = composer2;
        OooO0OO(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(6), 7, null), o00ooooo2, composer3, 70);
        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer3, 6);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(-1025847140);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (!Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(o000000O.OooOo0O(), composer3, 8).getValue(), Boolean.TRUE)) {
            SpacerKt.Spacer(o0O0O00.OooO0O0(boxScopeInstance.matchParentSize(companion), false, false, 0L, false, null, null, null, OooO.f47945OooO0Oo, 253), composer3, 0);
        }
        if (OooOo.OooO0o.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(rowScope, o00ooooo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Modifier modifier, o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-176123568);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176123568, i, -1, "com.yalla.yalla.ui.activity.moment.FaceImage (PostDetailCommentSonListBottomComp.kt:244)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource((o00ooooo2.f47867OooO0oO.getValue().booleanValue() || !o00ooooo2.f47860OooO.f48511OooO0o0.getValue().booleanValue()) ? oO00OOO.ic_moment_chat_emoji_gray : oO00OOO.ic_moment_chat_keyboard_gray, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new OooOO0O(o00ooooo2, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier, o00ooooo2, i));
    }

    @Composable
    public static final void OooO0Oo(o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(4629694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4629694, i, -1, "com.yalla.yalla.ui.activity.moment.InitSonListKeyBoardPanelHelper (PostDetailCommentSonListBottomComp.kt:277)");
        }
        EffectsKt.LaunchedEffect(o00ooooo2.OooO00o(), new OooOOO(o00ooooo2, null), composerStartRestartGroup, 72);
        EffectsKt.LaunchedEffect(o00ooooo2.f47869OooOO0.f55757OooOO0O, new OooOOOO(o00ooooo2, null), composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(o00ooooo2, i));
    }

    public static final void OooO0o(o00OOOOo o00ooooo2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-790101159);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-790101159, i, -1, "com.yalla.yalla.ui.activity.moment.CommentSonListSendImage (PostDetailCommentSonListBottomComp.kt:263)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_chat_send, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3765constructorimpl(12), 0.0f, 0.0f, Dp.m3765constructorimpl(13), 6, null), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new o0O0O0o0(o00ooooo2), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0OO0(o00ooooo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@NotNull BoxScope boxScope, @NotNull o00OOOOo detailBottomState, @Nullable View view, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(detailBottomState, "detailBottomState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1639428574);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1639428574, i, -1, "com.yalla.yalla.ui.activity.moment.MomentReplyActivityBottomComp (PostDetailCommentSonListBottomComp.kt:79)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(OnGloballyPositionedModifierKt.onGloballyPositioned(boxScope.align(companion, companion2.getBottomStart()), new OooOo(view)), o0oO0O0o.f46946OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl((float) 0.5d)), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, null, 2, null), composerStartRestartGroup, 0);
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(54), 0.0f, 2, null), Dp.m3765constructorimpl(12), 0.0f, 2, null);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        OooO00o(detailBottomState, composerStartRestartGroup, 8);
        OooO0O0(rowScopeInstance, detailBottomState, composerStartRestartGroup, 70);
        MutableState<Boolean> mutableState = detailBottomState.f47863OooO0OO;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, mutableState.getValue().booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, oo000o.f48218OooO00o, composerStartRestartGroup, 1572870, 30);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, !mutableState.getValue().booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1554828213, true, new Oooo000(detailBottomState)), composerStartRestartGroup, 1572870, 30);
        o000oOoO.OooO00o(composerStartRestartGroup);
        p490o0o00OOO.OooOo00.OooO00o(detailBottomState.f47860OooO, detailBottomState.f47869OooOO0, detailBottomState.f47867OooO0oO.getValue().booleanValue() ? 60 : 300, composerStartRestartGroup, 72, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0Oo(detailBottomState, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(boxScope, detailBottomState, view, i));
    }
}
