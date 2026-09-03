package p492o0o00OO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
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
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00o.oO0OoOO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p371o0OOo0oO.oo000o;
import p476o0OooooO.o0OOo000;
import p497o0o00OoO.o0000O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPostDetailCommentSonListBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,412:1\n72#2,6:413\n78#2:447\n82#2:495\n78#3,11:419\n78#3,11:457\n91#3:489\n91#3:494\n78#3,11:504\n78#3,11:541\n78#3,11:577\n91#3:613\n91#3:620\n91#3:625\n456#4,8:430\n464#4,3:444\n456#4,8:468\n464#4,3:482\n467#4,3:486\n467#4,3:491\n456#4,8:515\n464#4,3:529\n456#4,8:552\n464#4,3:566\n456#4,8:588\n464#4,3:602\n467#4,3:610\n467#4,3:617\n467#4,3:622\n4144#5,6:438\n4144#5,6:476\n4144#5,6:523\n4144#5,6:560\n4144#5,6:596\n164#6:448\n154#6:449\n154#6:450\n154#6:496\n154#6:497\n154#6:533\n154#6:534\n154#6:570\n154#6:606\n154#6:607\n154#6:608\n154#6:609\n154#6:615\n154#6:616\n154#6:628\n154#6:629\n154#6:630\n73#7,6:451\n79#7:485\n83#7:490\n73#7,6:535\n79#7:569\n83#7:621\n66#8,6:498\n72#8:532\n66#8,6:571\n72#8:605\n76#8:614\n76#8:626\n76#9:627\n*S KotlinDebug\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt\n*L\n85#1:413,6\n85#1:447\n85#1:495\n85#1:419,11\n103#1:457,11\n103#1:489\n85#1:494\n188#1:504,11\n189#1:541,11\n198#1:577,11\n198#1:613\n189#1:620\n188#1:625\n85#1:430,8\n85#1:444,3\n103#1:468,8\n103#1:482,3\n103#1:486,3\n85#1:491,3\n188#1:515,8\n188#1:529,3\n189#1:552,8\n189#1:566,3\n198#1:588,8\n198#1:602,3\n198#1:610,3\n189#1:617,3\n188#1:622,3\n85#1:438,6\n103#1:476,6\n188#1:523,6\n189#1:560,6\n198#1:596,6\n98#1:448\n106#1:449\n107#1:450\n146#1:496\n147#1:497\n193#1:533\n194#1:534\n201#1:570\n209#1:606\n210#1:607\n211#1:608\n225#1:609\n230#1:615\n232#1:616\n254#1:628\n271#1:629\n272#1:630\n103#1:451,6\n103#1:485\n103#1:490\n189#1:535,6\n189#1:569\n189#1:621\n188#1:498,6\n188#1:532\n198#1:571,6\n198#1:605\n198#1:614\n188#1:626\n247#1:627\n*E\n"})
public final class o0O00oO0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f49264OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0oo0o onLogin = o0O0oo0o.f49307OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(p475o0Ooooo0.o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.getClass();
                Unit unit = Unit.INSTANCE;
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49265OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOO0 o00ooo1) {
            super(0);
            this.f49265OooO0Oo = o00ooo1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            final o00OOO0 o00ooo1 = this.f49265OooO0Oo;
            if (o00ooo1.OooO00o().getSpanManager().OooO0OO("@") >= 7) {
                String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Mention_a_maximum_of_XXX_people), "7");
                if (!StringsKt.isBlank(strOooO00o)) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                o00ooo1.f49181OooO0Oo.setValue(Boolean.TRUE);
                o00ooo1.OooO0O0(false);
                p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(o00ooo1.f49178OooO00o);
                oooOo.f57388OooO0O0 = AtFriendsActivity.class;
                oooOo.OooO0O0(new p604o0oo0O0.Oooo000() { // from class: o0o00OO0.o0O00o00
                    @Override // p604o0oo0O0.Oooo000
                    public final void onActivityResult(int i, Intent intent) {
                        o00OOO0 detailBottomState = o00ooo1;
                        Intrinsics.checkNotNullParameter(detailBottomState, "$detailBottomState");
                        detailBottomState.f49181OooO0Oo.setValue(Boolean.FALSE);
                        if (intent != null) {
                            detailBottomState.OooO00o().postDelayed(new oO0OoOO0(3, detailBottomState, intent), 200L);
                        }
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49266OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49267OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OOO0 o00ooo1, int i) {
            super(2);
            this.f49266OooO0Oo = o00ooo1;
            this.f49267OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49267OooO0o0 | 1);
            o0O00oO0.OooO00o(this.f49266OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, EditTextSpan> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49268OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OOO0 o00ooo1) {
            super(1);
            this.f49268OooO0Oo = o00ooo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final EditTextSpan invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f49268OooO0Oo.OooO00o();
        }
    }

    public static final class OooO0o extends Lambda implements Function1<EditTextSpan, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f49269OooO0Oo = new OooO0o();

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
        public final /* synthetic */ RowScope f49270OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49271OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49272OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RowScope rowScope, o00OOO0 o00ooo1, int i) {
            super(2);
            this.f49270OooO0Oo = rowScope;
            this.f49272OooO0o0 = o00ooo1;
            this.f49271OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49271OooO0o | 1);
            o0O00oO0.OooO0O0(this.f49270OooO0Oo, this.f49272OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49273OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f49274OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o00OOO0 o00ooo1, Context context) {
            super(0);
            this.f49273OooO0Oo = o00ooo1;
            this.f49274OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo000o value = this.f49273OooO0Oo.f49182OooO0o.getValue();
            if (value != null) {
                value.OooO0OO(this.f49274OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListBottomCompKt$InitSonListKeyBoardPanelHelper$1", f = "PostDetailCommentSonListBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49275OooO0Oo;

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOO0 f49276OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00OOO0 o00ooo1) {
                super(2);
                this.f49276OooO0Oo = o00ooo1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                this.f49276OooO0Oo.f49184OooO0oO.setValue(Boolean.valueOf(zBooleanValue));
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOO0 f49277OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o00OOO0 o00ooo1) {
                super(2);
                this.f49277OooO0Oo = o00ooo1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                Integer num2 = num;
                o00OOO0 o00ooo1 = this.f49277OooO0Oo;
                if (zBooleanValue) {
                    o000O.OooOOOO(o00ooo1.f49179OooO0O0);
                } else {
                    o000O.OooO0O0(o00ooo1.f49179OooO0O0);
                }
                Function3<? super o00OOO0, ? super Boolean, ? super Integer, Unit> function3 = o00ooo1.f49188OooOO0o;
                if (function3 != null) {
                    function3.invoke(o00ooo1, Boolean.valueOf(zBooleanValue), num2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o00OOO0 o00ooo1, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f49275OooO0Oo = o00ooo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f49275OooO0Oo, continuation);
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
            final o00OOO0 o00ooo1 = this.f49275OooO0Oo;
            MutableState<oo000o> mutableState = o00ooo1.f49182OooO0o;
            oo000o oo000oVar = new oo000o(o00ooo1.f49177OooO, o00ooo1.OooO00o());
            oo000oVar.f43183OooO0OO = new OooO00o(o00ooo1);
            oo000oVar.f43184OooO0Oo = new OooO0O0(o00ooo1);
            mutableState.setValue(oo000oVar);
            o00ooo1.OooO00o().f30429OooO0oO = new o0O0O0Oo();
            o00ooo1.f49179OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00OO0.o0O0O0o0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    o00ooo1.OooO0O0(false);
                    return true;
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f49278OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49279OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49280OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, o00OOO0 o00ooo1, int i) {
            super(2);
            this.f49278OooO0Oo = modifier;
            this.f49280OooO0o0 = o00ooo1;
            this.f49279OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49279OooO0o | 1);
            o0O00oO0.OooO0OO(this.f49278OooO0Oo, this.f49280OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListBottomCompKt$InitSonListKeyBoardPanelHelper$2", f = "PostDetailCommentSonListBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49281OooO0Oo;

        public static final class OooO00o extends Lambda implements Function1<EmojiFaceView, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OOO0 f49282OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00OOO0 o00ooo1) {
                super(1);
                this.f49282OooO0Oo = o00ooo1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(EmojiFaceView emojiFaceView) {
                o00OOO0 o00ooo1 = this.f49282OooO0Oo;
                o00ooo1.f49186OooOO0.OooO00o(o00ooo1.OooO00o());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o00OOO0 o00ooo1, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f49281OooO0Oo = o00ooo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f49281OooO0Oo, continuation);
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
            o00OOO0 o00ooo1 = this.f49281OooO0Oo;
            o00ooo1.f49186OooOO0.f56981OooO0o0 = new OooO00o(o00ooo1);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPostDetailCommentSonListBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt$MomentReplyActivityBottomComp$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,412:1\n315#2:413\n329#2,4:414\n316#2:418\n*S KotlinDebug\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailCommentSonListBottomCompKt$MomentReplyActivityBottomComp$1\n*L\n90#1:413\n90#1:414,4\n90#1:418\n*E\n"})
    public static final class OooOo extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f49283OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(View view) {
            super(1);
            this.f49283OooO0Oo = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            int iM3934getHeightimpl = IntSize.m3934getHeightimpl(it.mo2811getSizeYbymL2g());
            View view = this.f49283OooO0Oo;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iM3934getHeightimpl;
                view.setLayoutParams(layoutParams);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49284OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49285OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o00OOO0 o00ooo1, int i) {
            super(2);
            this.f49284OooO0Oo = o00ooo1;
            this.f49285OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49285OooO0o0 | 1);
            o0O00oO0.OooO0Oo(this.f49284OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f49286OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f49287OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49288OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(o00OOO0 o00ooo1) {
            super(3);
            this.f49288OooO0Oo = o00ooo1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554828213, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentReplyActivityBottomComp.<anonymous>.<anonymous>.<anonymous> (PostDetailCommentSonListBottomComp.kt:119)");
            }
            o0O00oO0.OooO0o(this.f49288OooO0Oo, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f49289OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ View f49290OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOO0 f49291OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49292OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(BoxScope boxScope, o00OOO0 o00ooo1, View view, int i) {
            super(2);
            this.f49289OooO0Oo = boxScope;
            this.f49291OooO0o0 = o00ooo1;
            this.f49290OooO0o = view;
            this.f49292OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49292OooO0oO | 1);
            o00OOO0 o00ooo1 = this.f49291OooO0o0;
            View view = this.f49290OooO0o;
            o0O00oO0.OooO0o0(this.f49289OooO0Oo, o00ooo1, view, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o00OOO0 o00ooo1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1111339007);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1111339007, i, -1, "com.yalla.yalla.ui.activity.moment.AtImage (PostDetailCommentSonListBottomComp.kt:140)");
        }
        IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_at, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(12), Dp.m3775constructorimpl(13), 3, null), Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, new OooO00o(o00ooo1), 253), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, composerStartRestartGroup, 56, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(o00ooo1, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(RowScope rowScope, o00OOO0 o00ooo1, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1288087601);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1288087601, i, -1, "com.yalla.yalla.ui.activity.moment.EditTextAndEmoji (PostDetailCommentSonListBottomComp.kt:186)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f = 8;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(21, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getCenterStart()), 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(f), 1, null)), o0OOo000.f48272o000o0o0, null, 2, null);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        Modifier modifierOooO00o2 = p454o0Ooo000.OooOo00.OooO00o(12, androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        float f2 = 0;
        AndroidView_androidKt.AndroidView(new OooO0OO(o00ooo1), PaddingKt.m480paddingVpY3zN4$default(SizeKt.m513heightInVpY3zN4$default(SizeKt.m513heightInVpY3zN4$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getCenterStart()), 0.0f, Dp.m3775constructorimpl(95), 1, null), Dp.m3775constructorimpl(38), 0.0f, 2, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null), OooO0o.f49269OooO0Oo, composerStartRestartGroup, 384, 0);
        composerStartRestartGroup.startReplaceableGroup(1293660439);
        if (o00ooo1.f49180OooO0OO.getValue().booleanValue()) {
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o00ooo1.f49183OooO0o0.getValue(), PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 10, null), o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
        } else {
            composer2 = composerStartRestartGroup;
        }
        o00O000o.OooO00o(composer2);
        Composer composer3 = composer2;
        OooO0OO(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(6), 7, null), o00ooo1, composer3, 70);
        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer3, 6);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(-1025847023);
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        if (!Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(p475o0Ooooo0.o0O00oO0.OooOo0O(), composer3, 8).getValue(), Boolean.TRUE)) {
            SpacerKt.Spacer(o0O0O00.OooO0O0(boxScopeInstance.matchParentSize(companion), false, false, 0L, false, null, null, null, OooO.f49264OooO0Oo, 253), composer3, 0);
        }
        if (androidx.compose.animation.OooOo.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(rowScope, o00ooo1, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Modifier modifier, o00OOO0 o00ooo1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-176123568);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176123568, i, -1, "com.yalla.yalla.ui.activity.moment.FaceImage (PostDetailCommentSonListBottomComp.kt:245)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource((o00ooo1.f49184OooO0oO.getValue().booleanValue() || !o00ooo1.f49177OooO.f49754OooO0o0.getValue().booleanValue()) ? p562o0oOo000.o0O0O00.ic_moment_chat_emoji_gray : p562o0oOo000.o0O0O00.ic_moment_chat_keyboard_gray, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE.then(modifier), Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, new OooOO0O(o00ooo1, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier, o00ooo1, i));
    }

    @Composable
    public static final void OooO0Oo(o00OOO0 o00ooo1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(4629694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4629694, i, -1, "com.yalla.yalla.ui.activity.moment.InitSonListKeyBoardPanelHelper (PostDetailCommentSonListBottomComp.kt:280)");
        }
        EffectsKt.LaunchedEffect(o00ooo1.OooO00o(), new OooOOO(o00ooo1, null), composerStartRestartGroup, 72);
        EffectsKt.LaunchedEffect(o00ooo1.f49186OooOO0.f56985OooOO0O, new OooOOOO(o00ooo1, null), composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(o00ooo1, i));
    }

    public static final void OooO0o(o00OOO0 o00ooo1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-790101159);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-790101159, i, -1, "com.yalla.yalla.ui.activity.moment.CommentSonListSendImage (PostDetailCommentSonListBottomComp.kt:266)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_chat_send, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3775constructorimpl(12), 0.0f, 0.0f, Dp.m3775constructorimpl(13), 6, null), Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, new o0O0O0O(o00ooo1), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0oO0O0o(o00ooo1, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@NotNull BoxScope boxScope, @NotNull o00OOO0 detailBottomState, @Nullable View view, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(detailBottomState, "detailBottomState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1639428574);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1639428574, i, -1, "com.yalla.yalla.ui.activity.moment.MomentReplyActivityBottomComp (PostDetailCommentSonListBottomComp.kt:83)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(OnGloballyPositionedModifierKt.onGloballyPositioned(boxScope.align(companion, companion2.getBottomStart()), new OooOo(view)), o0OOo000.f48135OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl((float) 0.5d)), 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, null, 2, null), composerStartRestartGroup, 0);
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(54), 0.0f, 2, null), Dp.m3775constructorimpl(12), 0.0f, 2, null);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, bottom, composerStartRestartGroup, 48, -1323940314);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        OooO00o(detailBottomState, composerStartRestartGroup, 8);
        OooO0O0(rowScopeInstance, detailBottomState, composerStartRestartGroup, 70);
        MutableState<Boolean> mutableState = detailBottomState.f49180OooO0OO;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, mutableState.getValue().booleanValue(), SemanticsModifierKt.semantics$default(companion, false, Oooo000.f49287OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, o00Oo0.f49194OooO00o, composerStartRestartGroup, 1572870, 28);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, !mutableState.getValue().booleanValue(), SemanticsModifierKt.semantics$default(companion, false, Oooo0.f49286OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1554828213, true, new o000oOoO(detailBottomState)), composerStartRestartGroup, 1572870, 28);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        o0000O00.OooO00o(detailBottomState.f49177OooO, detailBottomState.f49186OooOO0, detailBottomState.f49184OooO0oO.getValue().booleanValue() ? 60 : 300, composerStartRestartGroup, 72, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, detailBottomState, view, i));
    }
}
