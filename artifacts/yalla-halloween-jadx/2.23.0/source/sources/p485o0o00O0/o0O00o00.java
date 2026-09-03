package p485o0o00O0;

import android.app.Activity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import java.util.HashMap;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p402o0Oo0OOO.o000O;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p509o0o0O0.o00O0O;
import p509o0o0O0.o00O0OOO;
import p579o0oOoo.oO0O0O00;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPostDetailBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailBottomCompKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,886:1\n66#2,6:887\n72#2:921\n66#2,6:969\n72#2:1003\n76#2:1009\n76#2:1020\n78#3,11:893\n78#3,11:931\n78#3,11:975\n91#3:1008\n91#3:1014\n91#3:1019\n78#3,11:1056\n91#3:1090\n78#3,11:1098\n91#3:1132\n456#4,8:904\n464#4,3:918\n456#4,8:942\n464#4,3:956\n36#4:962\n456#4,8:986\n464#4,3:1000\n467#4,3:1005\n467#4,3:1011\n467#4,3:1016\n36#4:1021\n25#4:1034\n25#4:1043\n456#4,8:1067\n464#4,3:1081\n467#4,3:1087\n456#4,8:1109\n464#4,3:1123\n467#4,3:1129\n4144#5,6:912\n4144#5,6:950\n4144#5,6:994\n4144#5,6:1075\n4144#5,6:1117\n164#6:922\n154#6:923\n154#6:924\n154#6:960\n154#6:961\n154#6:1004\n154#6:1010\n154#6:1030\n154#6:1032\n154#6:1033\n154#6:1085\n154#6:1086\n154#6:1127\n154#6:1128\n73#7,6:925\n79#7:959\n83#7:1015\n73#7,6:1050\n79#7:1084\n83#7:1091\n73#7,6:1092\n79#7:1126\n83#7:1133\n1097#8,6:963\n1097#8,6:1022\n1097#8,6:1035\n1097#8,6:1044\n76#9:1028\n76#9:1029\n76#9:1031\n76#9:1041\n76#9:1042\n*S KotlinDebug\n*F\n+ 1 PostDetailBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailBottomCompKt\n*L\n99#1:887,6\n99#1:921\n121#1:969,6\n121#1:1003\n121#1:1009\n99#1:1020\n99#1:893,11\n113#1:931,11\n121#1:975,11\n121#1:1008\n113#1:1014\n99#1:1019\n716#1:1056,11\n716#1:1090\n777#1:1098,11\n777#1:1132\n99#1:904,8\n99#1:918,3\n113#1:942,8\n113#1:956,3\n127#1:962\n121#1:986,8\n121#1:1000,3\n121#1:1005,3\n113#1:1011,3\n99#1:1016,3\n173#1:1021\n709#1:1034\n714#1:1043\n716#1:1067,8\n716#1:1081,3\n716#1:1087,3\n777#1:1109,8\n777#1:1123,3\n777#1:1129,3\n99#1:912,6\n113#1:950,6\n121#1:994,6\n716#1:1075,6\n777#1:1117,6\n108#1:922\n117#1:923\n118#1:924\n124#1:960\n125#1:961\n137#1:1004\n147#1:1010\n561#1:1030\n598#1:1032\n599#1:1033\n756#1:1085\n763#1:1086\n794#1:1127\n801#1:1128\n113#1:925,6\n113#1:959\n113#1:1015\n716#1:1050,6\n716#1:1084\n716#1:1091\n777#1:1092,6\n777#1:1126\n777#1:1133\n127#1:963,6\n173#1:1022,6\n709#1:1035,6\n714#1:1044,6\n305#1:1028\n554#1:1029\n592#1:1031\n710#1:1041\n712#1:1042\n*E\n"})
public final class o0O00o00 {

    public static final class OooO extends Lambda implements Function0<p534o0o0Oo00.o000oOoO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47893OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f47893OooO0Oo = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final p534o0o0Oo00.o000oOoO invoke() {
            MomentDetailActivityVM momentDetailActivityVM = this.f47893OooO0Oo;
            MomentDetailModel value = momentDetailActivityVM.getMPostDetailModel().getValue();
            Long lValueOf = value != null ? Long.valueOf(value.getId()) : null;
            Long currentCommentId = momentDetailActivityVM.getCurrentCommentId();
            HashMap<String, p534o0o0Oo00.o000oOoO> map = o000O.f44463OooO00o;
            p534o0o0Oo00.o000oOoO o000ooooOooO00o = o000O.OooO00o(lValueOf, currentCommentId, 0L);
            p592o0oo00O.OooOOO0.OooO0OO("TAAAA", "onLoadInputCache value = " + o000ooooOooO00o);
            return o000ooooOooO00o;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47894OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0O0O00 f47896OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, oO0O0O00 oo0o0o00, MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f47894OooO0Oo = mutableState;
            this.f47896OooO0o0 = oo0o0o00;
            this.f47895OooO0o = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oO0Ooo onLogin = new o0oO0Ooo(this.f47894OooO0Oo, this.f47896OooO0o0, this.f47895OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f47897OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47898OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47899OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0O0O00 f47900OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47901OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f47902OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentDetailModel momentDetailModel, oO0O0O00 oo0o0o00, MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Modifier modifier, int i) {
            super(2);
            this.f47898OooO0Oo = momentDetailModel;
            this.f47900OooO0o0 = oo0o0o00;
            this.f47899OooO0o = momentDetailActivityVM;
            this.f47901OooO0oO = mutableState;
            this.f47902OooO0oo = modifier;
            this.f47897OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00o00.OooO00o(this.f47898OooO0Oo, this.f47900OooO0o0, this.f47899OooO0o, this.f47901OooO0oO, this.f47902OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47897OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47903OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState) {
            super(0);
            this.f47903OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47903OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f47904OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f47905OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47906OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47907OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47908OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oO0O0O00 f47909OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f47910OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MomentDetailActivityVM momentDetailActivityVM, oO0O0O00 oo0o0o00, MomentDetailCommentFragment momentDetailCommentFragment, int i) {
            super(2);
            this.f47905OooO0Oo = boxScope;
            this.f47907OooO0o0 = momentDetailModel;
            this.f47906OooO0o = mutableState;
            this.f47908OooO0oO = momentDetailActivityVM;
            this.f47909OooO0oo = oo0o0o00;
            this.f47904OooO = momentDetailCommentFragment;
            this.f47910OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00o00.OooO0O0(this.f47905OooO0Oo, this.f47907OooO0o0, this.f47906OooO0o, this.f47908OooO0oO, this.f47909OooO0oo, this.f47904OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47910OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<p534o0o0Oo00.o000oOoO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47911OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentDetailActivityVM momentDetailActivityVM) {
            super(1);
            this.f47911OooO0Oo = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p534o0o0Oo00.o000oOoO o000oooo2) {
            p534o0o0Oo00.o000oOoO it = o000oooo2;
            Intrinsics.checkNotNullParameter(it, "it");
            p592o0oo00O.OooOOO0.OooO0OO("TAAAA", "onSaveInputCache value = " + it);
            MomentDetailActivityVM momentDetailActivityVM = this.f47911OooO0Oo;
            MomentDetailModel value = momentDetailActivityVM.getMPostDetailModel().getValue();
            o000O.OooO0OO(value != null ? Long.valueOf(value.getId()) : null, momentDetailActivityVM.getCurrentCommentId(), it, 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47912OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState) {
            super(1);
            this.f47912OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f47912OooO0Oo.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailBottomCompKt$MomentDetailBottom$6", f = "PostDetailBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f47913OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47914OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailCommentFragment momentDetailCommentFragment, MomentDetailModel momentDetailModel, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f47913OooO0Oo = momentDetailCommentFragment;
            this.f47914OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f47913OooO0Oo, this.f47914OooO0o0, continuation);
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
            MomentDetailCommentFragment momentDetailCommentFragment = this.f47913OooO0Oo;
            if (momentDetailCommentFragment != null) {
                momentDetailCommentFragment.setData(this.f47914OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<p534o0o0Oo00.OooOOOO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f47915OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentDetailCommentFragment momentDetailCommentFragment) {
            super(1);
            this.f47915OooO0Oo = momentDetailCommentFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p534o0o0Oo00.OooOOOO oooOOOO) {
            p534o0o0Oo00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentFragment momentDetailCommentFragment = this.f47915OooO0Oo;
            if (momentDetailCommentFragment != null) {
                momentDetailCommentFragment.sendComment(it.OooO0OO(), it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f47916OooO0Oo;

        public OooOOOO(Activity activity) {
            this.f47916OooO0Oo = activity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            Activity activity = this.f47916OooO0Oo;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailBottomCompKt$MomentDetailBottom$9", f = "PostDetailBottomComp.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f47917OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47918OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47919OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f47919OooO0o0 = momentDetailActivityVM;
            this.f47918OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f47919OooO0o0, this.f47918OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47917OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MomentDetailActivityVM momentDetailActivityVM = this.f47919OooO0o0;
                if (momentDetailActivityVM.getMIsShowKeyboard() && momentDetailActivityVM.getIsRefreshDataSuccess()) {
                    this.f47917OooO0Oo = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.f47918OooO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47920OooO0Oo;

        public OooOo00(MutableState<Boolean> mutableState) {
            this.f47920OooO0Oo = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                this.f47920OooO0Oo.setValue(Boolean.TRUE);
            }
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47921OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f47922OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f47923OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47924OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, int i, int i2) {
            super(2);
            this.f47921OooO0Oo = momentDetailActivityVM;
            this.f47923OooO0o0 = modifier;
            this.f47922OooO0o = i;
            this.f47924OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47922OooO0o | 1);
            Modifier modifier = this.f47923OooO0o0;
            int i = this.f47924OooO0oO;
            o0O00o00.OooO0OO(this.f47921OooO0Oo, modifier, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47925OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47926OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f47927OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MomentDetailModel momentDetailModel, Activity activity, MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f47925OooO0Oo = momentDetailModel;
            this.f47927OooO0o0 = activity;
            this.f47926OooO0o = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00oO0 onLogin = new o0O00oO0(this.f47925OooO0Oo, this.f47927OooO0o0, this.f47926OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47928OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47929OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f47930OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47931OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f47932OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47933OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Activity activity, MutableState<Boolean> mutableState2, MomentDetailActivityVM momentDetailActivityVM, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f47929OooO0Oo = mutableState;
            this.f47931OooO0o0 = momentDetailModel;
            this.f47930OooO0o = activity;
            this.f47932OooO0oO = mutableState2;
            this.f47933OooO0oo = momentDetailActivityVM;
            this.f47928OooO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oO0O0o onLogin = new o0oO0O0o(this.f47929OooO0Oo, this.f47931OooO0o0, this.f47930OooO0o, this.f47932OooO0oO, this.f47933OooO0oo, this.f47928OooO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f47934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f47935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f47936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f47937OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f47938OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MomentDetailModel momentDetailModel, MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, int i, int i2) {
            super(2);
            this.f47934OooO0Oo = momentDetailModel;
            this.f47936OooO0o0 = momentDetailActivityVM;
            this.f47935OooO0o = modifier;
            this.f47937OooO0oO = i;
            this.f47938OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00o00.OooO0Oo(this.f47934OooO0Oo, this.f47936OooO0o0, this.f47935OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47937OooO0oO | 1), this.f47938OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(MomentDetailModel momentDetailModel, oO0O0O00 oo0o0o00, MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(346168423);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346168423, i, -1, "com.yalla.yalla.ui.activity.moment.GifContainer (PostDetailBottomComp.kt:769)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion.then(modifier), false, false, 0L, false, null, null, null, new OooO00o(mutableState, oo0o0o00, momentDetailActivityVM), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_gift_red, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(26)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentDetailModel.getTotalPropValue(), true);
        long j = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
        long sp = TextUnitKt.getSp(12);
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(data.totalPropValue, true)");
        TextKt.m1251Text4IGK_g(strOooO0o, modifierM480paddingqDBjuR0$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(momentDetailModel, oo0o0o00, momentDetailActivityVM, mutableState, modifier, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull BoxScope boxScope, @NotNull MomentDetailModel data, @NotNull MutableState<Boolean> isPanelViewShow, @NotNull MomentDetailActivityVM momentVM, @Nullable oO0O0O00 oo0o0o00, @Nullable MomentDetailCommentFragment momentDetailCommentFragment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(isPanelViewShow, "isPanelViewShow");
        Intrinsics.checkNotNullParameter(momentVM, "momentVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079897822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079897822, i, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailBottom (PostDetailBottomComp.kt:91)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScope.align(modifierM169backgroundbw27NRU$default, companion2.getBottomCenter()), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        SpacerKt.Spacer(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl((float) 0.5d)), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, null, 2, null), composerStartRestartGroup, 0);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        float f = 12;
        Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(56), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM511heightInVpY3zN4$default);
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
        OooO0OO(momentVM, null, composerStartRestartGroup, 8, 2);
        Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.m511heightInVpY3zN4$default(PaddingKt.m478paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(40), 0.0f, 2, null), o000OOo.OooO0OO(composerStartRestartGroup).f37705OooO0Oo, RoundedCornerShapeKt.RoundedCornerShape(50));
        int i2 = (i >> 6) & 14;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(isPanelViewShow);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(isPanelViewShow);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM168backgroundbw27NRU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.please_chat_friendly, composerStartRestartGroup, 0), PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        OooO0Oo(data, momentVM, null, composerStartRestartGroup, 72, 4);
        composerStartRestartGroup.startReplaceableGroup(338324262);
        if (!momentVM.isSelfPost().getValue().booleanValue() && MomentStateKt.isApprovedState(data)) {
            OooO00o(data, oo0o0o00, momentVM, momentVM.isSelfPost(), PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 25160);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign = boxScope.align(companion, companion2.getBottomCenter());
        OooO oooO = new OooO(momentVM);
        OooOO0 oooOO1 = new OooOO0(momentVM);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(isPanelViewShow);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOO0O(isPanelViewShow);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o00O0OOO.OooO00o(isPanelViewShow, false, false, null, oooO, oooOO1, (Function1) objRememberedValue2, new OooOOO0(momentDetailCommentFragment), null, null, modifierAlign, composerStartRestartGroup, i2, 0, 782);
        EffectsKt.LaunchedEffect(data, momentVM.getPostCommentDetailModel(), momentDetailCommentFragment, new OooOOO(momentDetailCommentFragment, data, null), composerStartRestartGroup, 4680);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
        Observable<Object> observable = LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.POST_DETAIL_SHOW_KEYBOARD_AND_FINISH)");
        o00000O.OooO00o(observable, new OooOOOO(activity), composerStartRestartGroup, 8);
        Observable<Object> observable2 = LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.POST_DETAIL_SHOW_KEYBOARD)");
        o00000O.OooO00o(observable2, new OooOo00(isPanelViewShow), composerStartRestartGroup, 8);
        EffectsKt.LaunchedEffect(Boolean.valueOf(momentVM.getIsRefreshDataSuccess()), new OooOo(momentVM, isPanelViewShow, null), composerStartRestartGroup, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, data, isPanelViewShow, momentVM, oo0o0o00, momentDetailCommentFragment, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, Composer composer, int i, int i2) {
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(1163925388);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163925388, i, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailShareImage (PostDetailBottomComp.kt:549)");
        }
        MomentDetailModel value = momentDetailActivityVM.getMPostDetailModel().getValue();
        if (value != null && value.getPower() == MomentTypePower.Open.getValue()) {
            MomentDetailModel value2 = momentDetailActivityVM.getMPostDetailModel().getValue();
            if (value2 != null && value2.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
                Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
                MomentDetailModel value3 = momentDetailActivityVM.getMPostDetailModel().getValue();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icv_share, composerStartRestartGroup, 0);
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier2), Dp.m3765constructorimpl(23)), false, false, 0L, false, null, null, null, new Oooo000(value3, activity, momentDetailActivityVM), 253);
                if (com.code.android.util.o0OoOo0.OooO00o(value3 != null ? Boolean.valueOf(MomentStateKt.isApprovedState(value3)) : null)) {
                    composerStartRestartGroup.startReplaceableGroup(1183347135);
                    j = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1183347150);
                    j = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, modifierOooO0O0, j, composerStartRestartGroup, 56, 0);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(momentDetailActivityVM, modifier2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(MomentDetailModel momentDetailModel, MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, Composer composer, int i, int i2) {
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(-524609244);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-524609244, i, -1, "com.yalla.yalla.ui.activity.moment.PraiseContainer (PostDetailBottomComp.kt:706)");
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
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion2.then(modifier2), false, false, 0L, false, null, null, null, new o000oOoO(mutableState2, momentDetailModel, activity, mutableState, momentDetailActivityVM, lifecycleOwner), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        o00O0O.OooO0Oo(momentDetailModel, false, MomentStateKt.isApprovedState(momentDetailModel), mutableState, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(23)), composerStartRestartGroup, 27704, 0);
        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentDetailModel.getPraiseNum(), true);
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            composerStartRestartGroup.startReplaceableGroup(-739969252);
            j = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-739969237);
            j = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
        }
        long j2 = j;
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(12);
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(data.praiseNum, true)");
        Modifier modifier3 = modifier2;
        TextKt.m1251Text4IGK_g(strOooO0o, modifierM480paddingqDBjuR0$default, j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(momentDetailModel, momentDetailActivityVM, modifier3, i, i2));
    }
}
