package p492o0o00OO0;

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
import com.code.android.util.o0OoOo0;
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
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o00O0000;
import p450o0OoOooO.o0O0O0o0;
import p475o0Ooooo0.o0O00oO0;
import p519o0o0O0OO.o000OO00;
import p519o0o0O0OO.o0oO0O0o;
import p522o0o0O0oO.oO00000o;
import p522o0o0O0oO.oO000O0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p583o0oOoo00.oo0o0Oo;
import p590o0oOooo0.l;
import p598o0oo00Oo.o0000O00;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPostDetailBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailBottomCompKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,886:1\n66#2,6:887\n72#2:921\n66#2,6:969\n72#2:1003\n76#2:1009\n76#2:1020\n78#3,11:893\n78#3,11:931\n78#3,11:975\n91#3:1008\n91#3:1014\n91#3:1019\n78#3,11:1063\n91#3:1097\n78#3,11:1105\n91#3:1139\n456#4,8:904\n464#4,3:918\n456#4,8:942\n464#4,3:956\n36#4:962\n456#4,8:986\n464#4,3:1000\n467#4,3:1005\n467#4,3:1011\n467#4,3:1016\n36#4:1021\n36#4:1029\n25#4:1041\n25#4:1050\n456#4,8:1074\n464#4,3:1088\n467#4,3:1094\n456#4,8:1116\n464#4,3:1130\n467#4,3:1136\n4144#5,6:912\n4144#5,6:950\n4144#5,6:994\n4144#5,6:1082\n4144#5,6:1124\n164#6:922\n154#6:923\n154#6:924\n154#6:960\n154#6:961\n154#6:1004\n154#6:1010\n154#6:1037\n154#6:1039\n154#6:1040\n154#6:1092\n154#6:1093\n154#6:1134\n154#6:1135\n73#7,6:925\n79#7:959\n83#7:1015\n73#7,6:1057\n79#7:1091\n83#7:1098\n73#7,6:1099\n79#7:1133\n83#7:1140\n1097#8,6:963\n1097#8,6:1022\n1097#8,6:1030\n1097#8,6:1042\n1097#8,6:1051\n76#9:1028\n76#9:1036\n76#9:1038\n76#9:1048\n76#9:1049\n*S KotlinDebug\n*F\n+ 1 PostDetailBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/PostDetailBottomCompKt\n*L\n99#1:887,6\n99#1:921\n121#1:969,6\n121#1:1003\n121#1:1009\n99#1:1020\n99#1:893,11\n113#1:931,11\n121#1:975,11\n121#1:1008\n113#1:1014\n99#1:1019\n716#1:1063,11\n716#1:1097\n777#1:1105,11\n777#1:1139\n99#1:904,8\n99#1:918,3\n113#1:942,8\n113#1:956,3\n127#1:962\n121#1:986,8\n121#1:1000,3\n121#1:1005,3\n113#1:1011,3\n99#1:1016,3\n173#1:1021\n313#1:1029\n709#1:1041\n714#1:1050\n716#1:1074,8\n716#1:1088,3\n716#1:1094,3\n777#1:1116,8\n777#1:1130,3\n777#1:1136,3\n99#1:912,6\n113#1:950,6\n121#1:994,6\n716#1:1082,6\n777#1:1124,6\n108#1:922\n117#1:923\n118#1:924\n124#1:960\n125#1:961\n137#1:1004\n147#1:1010\n561#1:1037\n598#1:1039\n599#1:1040\n756#1:1092\n763#1:1093\n794#1:1134\n801#1:1135\n113#1:925,6\n113#1:959\n113#1:1015\n716#1:1057,6\n716#1:1091\n716#1:1098\n777#1:1099,6\n777#1:1133\n777#1:1140\n127#1:963,6\n173#1:1022,6\n313#1:1030,6\n709#1:1042,6\n714#1:1051,6\n305#1:1028\n554#1:1036\n592#1:1038\n710#1:1048\n712#1:1049\n*E\n"})
public final class o0O00O {

    public static final class OooO extends Lambda implements Function0<oO000O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49210OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f49210OooO0Oo = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO000O0 invoke() {
            MomentDetailActivityVM momentDetailActivityVM = this.f49210OooO0Oo;
            MomentDetailModel value = momentDetailActivityVM.getMPostDetailModel().getValue();
            Long lValueOf = value != null ? Long.valueOf(value.getId()) : null;
            Long currentCommentId = momentDetailActivityVM.getCurrentCommentId();
            HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
            oO000O0 oo000o0OooO00o = oo0o0Oo.OooO00o(lValueOf, currentCommentId, 0L);
            o0000O00.OooO0OO("TAAAA", "onLoadInputCache value = " + oo000o0OooO00o);
            return oo000o0OooO00o;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49211OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49212OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ l f49213OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, l lVar, MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f49211OooO0Oo = mutableState;
            this.f49213OooO0o0 = lVar;
            this.f49212OooO0o = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00O0o onLogin = new o0O00O0o(this.f49211OooO0Oo, this.f49213OooO0o0, this.f49212OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f49214OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49215OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49216OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ l f49217OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49218OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f49219OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentDetailModel momentDetailModel, l lVar, MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Modifier modifier, int i) {
            super(2);
            this.f49215OooO0Oo = momentDetailModel;
            this.f49217OooO0o0 = lVar;
            this.f49216OooO0o = momentDetailActivityVM;
            this.f49218OooO0oO = mutableState;
            this.f49219OooO0oo = modifier;
            this.f49214OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00O.OooO00o(this.f49215OooO0Oo, this.f49217OooO0o0, this.f49216OooO0o, this.f49218OooO0oO, this.f49219OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49214OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49220OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState) {
            super(0);
            this.f49220OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f49220OooO0Oo.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f49221OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f49222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49224OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49225OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ l f49226OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f49227OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, MomentDetailActivityVM momentDetailActivityVM, l lVar, MomentDetailCommentFragment momentDetailCommentFragment, int i) {
            super(2);
            this.f49222OooO0Oo = boxScope;
            this.f49224OooO0o0 = momentDetailModel;
            this.f49223OooO0o = mutableState;
            this.f49225OooO0oO = momentDetailActivityVM;
            this.f49226OooO0oo = lVar;
            this.f49221OooO = momentDetailCommentFragment;
            this.f49227OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00O.OooO0O0(this.f49222OooO0Oo, this.f49224OooO0o0, this.f49223OooO0o, this.f49225OooO0oO, this.f49226OooO0oo, this.f49221OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49227OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<oO000O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49228OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentDetailActivityVM momentDetailActivityVM) {
            super(1);
            this.f49228OooO0Oo = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO000O0 oo000o0) {
            oO000O0 it = oo000o0;
            Intrinsics.checkNotNullParameter(it, "it");
            o0000O00.OooO0OO("TAAAA", "onSaveInputCache value = " + it);
            MomentDetailActivityVM momentDetailActivityVM = this.f49228OooO0Oo;
            MomentDetailModel value = momentDetailActivityVM.getMPostDetailModel().getValue();
            oo0o0Oo.OooO0OO(value != null ? Long.valueOf(value.getId()) : null, momentDetailActivityVM.getCurrentCommentId(), it, 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49229OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState) {
            super(1);
            this.f49229OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f49229OooO0Oo.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailBottomCompKt$MomentDetailBottom$6", f = "PostDetailBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f49230OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49231OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailCommentFragment momentDetailCommentFragment, MomentDetailModel momentDetailModel, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f49230OooO0Oo = momentDetailCommentFragment;
            this.f49231OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f49230OooO0Oo, this.f49231OooO0o0, continuation);
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
            MomentDetailCommentFragment momentDetailCommentFragment = this.f49230OooO0Oo;
            if (momentDetailCommentFragment != null) {
                momentDetailCommentFragment.setData(this.f49231OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<oO00000o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f49232OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentDetailCommentFragment momentDetailCommentFragment) {
            super(1);
            this.f49232OooO0Oo = momentDetailCommentFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO00000o oo00000o) {
            oO00000o it = oo00000o;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentFragment momentDetailCommentFragment = this.f49232OooO0Oo;
            if (momentDetailCommentFragment != null) {
                momentDetailCommentFragment.sendComment(it.OooO0OO(), it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49233OooO0Oo;

        public OooOOOO(MutableState<Boolean> mutableState) {
            this.f49233OooO0Oo = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f49233OooO0Oo.setValue(Boolean.TRUE);
            }
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f49236OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MomentDetailModel momentDetailModel, Activity activity, MomentDetailActivityVM momentDetailActivityVM) {
            super(0);
            this.f49234OooO0Oo = momentDetailModel;
            this.f49236OooO0o0 = activity;
            this.f49235OooO0o = momentDetailActivityVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00OO onLogin = new o0O00OO(this.f49234OooO0Oo, this.f49236OooO0o0, this.f49235OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.PostDetailBottomCompKt$MomentDetailBottom$9", f = "PostDetailBottomComp.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f49237OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49238OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49239OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f49239OooO0o0 = momentDetailActivityVM;
            this.f49238OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f49239OooO0o0, this.f49238OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f49237OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MomentDetailActivityVM momentDetailActivityVM = this.f49239OooO0o0;
                if (momentDetailActivityVM.getMIsShowKeyboard() && momentDetailActivityVM.getIsRefreshDataSuccess()) {
                    this.f49237OooO0Oo = 1;
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
            this.f49238OooO0o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f49240OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49241OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f49242OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49243OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49244OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49245OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Activity activity, MutableState<Boolean> mutableState2, MomentDetailActivityVM momentDetailActivityVM, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f49241OooO0Oo = mutableState;
            this.f49243OooO0o0 = momentDetailModel;
            this.f49242OooO0o = activity;
            this.f49244OooO0oO = mutableState2;
            this.f49245OooO0oo = momentDetailActivityVM;
            this.f49240OooO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oO0Ooo onLogin = new o0oO0Ooo(this.f49241OooO0Oo, this.f49243OooO0o0, this.f49242OooO0o, this.f49244OooO0oO, this.f49245OooO0oo, this.f49240OooO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
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

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49246OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49247OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49248OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49249OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, int i, int i2) {
            super(2);
            this.f49246OooO0Oo = momentDetailActivityVM;
            this.f49248OooO0o0 = modifier;
            this.f49247OooO0o = i;
            this.f49249OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49247OooO0o | 1);
            Modifier modifier = this.f49248OooO0o0;
            int i = this.f49249OooO0oO;
            o0O00O.OooO0OO(this.f49246OooO0Oo, modifier, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f49250OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f49251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailActivityVM f49252OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49253OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f49254OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MomentDetailModel momentDetailModel, MomentDetailActivityVM momentDetailActivityVM, Modifier modifier, int i, int i2) {
            super(2);
            this.f49250OooO0Oo = momentDetailModel;
            this.f49252OooO0o0 = momentDetailActivityVM;
            this.f49251OooO0o = modifier;
            this.f49253OooO0oO = i;
            this.f49254OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00O.OooO0Oo(this.f49250OooO0Oo, this.f49252OooO0o0, this.f49251OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49253OooO0oO | 1), this.f49254OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(MomentDetailModel momentDetailModel, l lVar, MomentDetailActivityVM momentDetailActivityVM, MutableState<Boolean> mutableState, Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(346168423);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346168423, i, -1, "com.yalla.yalla.ui.activity.moment.GifContainer (PostDetailBottomComp.kt:775)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion.then(modifier), false, false, 0L, false, null, null, null, new OooO00o(mutableState, lVar, momentDetailActivityVM), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_gift_red, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(26)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        String strOooO0o = o0O0O0Oo.OooO0o(momentDetailModel.getTotalPropValue(), true);
        long j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        long sp = TextUnitKt.getSp(12);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(strOooO0o);
        TextKt.m1261Text4IGK_g(strOooO0o, modifierM482paddingqDBjuR0$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(momentDetailModel, lVar, momentDetailActivityVM, mutableState, modifier, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull BoxScope boxScope, @NotNull MomentDetailModel data, @NotNull MutableState<Boolean> isPanelViewShow, @NotNull MomentDetailActivityVM momentVM, @Nullable l lVar, @Nullable MomentDetailCommentFragment momentDetailCommentFragment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(isPanelViewShow, "isPanelViewShow");
        Intrinsics.checkNotNullParameter(momentVM, "momentVM");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079897822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079897822, i, -1, "com.yalla.yalla.ui.activity.moment.MomentDetailBottom (PostDetailBottomComp.kt:97)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScope.align(modifierM171backgroundbw27NRU$default, companion2.getBottomCenter()), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        SpacerKt.Spacer(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl((float) 0.5d)), 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, null, 2, null), composerStartRestartGroup, 0);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        float f = 12;
        Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, 2, null), Dp.m3775constructorimpl(56), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM513heightInVpY3zN4$default);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        OooO0OO(momentVM, null, composerStartRestartGroup, 8, 2);
        Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m513heightInVpY3zN4$default(PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f), 0.0f, 2, null), Dp.m3775constructorimpl(40), 0.0f, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38620OooO0Oo, RoundedCornerShapeKt.RoundedCornerShape(50));
        int i2 = (i >> 6) & 14;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(isPanelViewShow);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(isPanelViewShow);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM170backgroundbw27NRU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.please_chat_friendly, composerStartRestartGroup, 0), PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        OooO0Oo(data, momentVM, null, composerStartRestartGroup, 72, 4);
        composerStartRestartGroup.startReplaceableGroup(338324262);
        if (!momentVM.isSelfPost().getValue().booleanValue() && MomentStateKt.isApprovedState(data)) {
            OooO00o(data, lVar, momentVM, momentVM.isSelfPost(), PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 25160);
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
        o0oO0O0o.OooO00o(isPanelViewShow, false, false, null, oooO, oooOO1, (Function1) objRememberedValue2, new OooOOO0(momentDetailCommentFragment), null, null, modifierAlign, composerStartRestartGroup, i2, 0, 782);
        EffectsKt.LaunchedEffect(data, momentVM.getPostCommentDetailModel(), momentDetailCommentFragment, new OooOOO(momentDetailCommentFragment, data, null), composerStartRestartGroup, 4680);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
        Observable<Object> observable = LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD_AND_FINISH");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        o00O0000.OooO00o(observable, new o0O0O0o0(activity, 1), composerStartRestartGroup, 72);
        Observable<Object> observable2 = LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(isPanelViewShow);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new OooOOOO(isPanelViewShow);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o00O0000.OooO00o(observable2, (Observer) objRememberedValue3, composerStartRestartGroup, 72);
        EffectsKt.LaunchedEffect(Boolean.valueOf(momentVM.getIsRefreshDataSuccess()), new OooOo00(momentVM, isPanelViewShow, null), composerStartRestartGroup, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, data, isPanelViewShow, momentVM, lVar, momentDetailCommentFragment, i));
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
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icv_share, composerStartRestartGroup, 0);
                Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE.then(modifier2), Dp.m3775constructorimpl(23)), false, false, 0L, false, null, null, null, new OooOo(value3, activity, momentDetailActivityVM), 253);
                if (o0OoOo0.OooO00o(value3 != null ? Boolean.valueOf(MomentStateKt.isApprovedState(value3)) : null)) {
                    composerStartRestartGroup.startReplaceableGroup(1183347135);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1183347150);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, modifierOooO0O0, j, composerStartRestartGroup, 56, 0);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(momentDetailActivityVM, modifier2, i, i2));
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
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion2.then(modifier2), false, false, 0L, false, null, null, null, new Oooo0(mutableState2, momentDetailModel, activity, mutableState, momentDetailActivityVM, lifecycleOwner), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        o000OO00.OooO0Oo(momentDetailModel, false, MomentStateKt.isApprovedState(momentDetailModel), mutableState, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(23)), composerStartRestartGroup, 27704, 0);
        String strOooO0o = o0O0O0Oo.OooO0o(momentDetailModel.getPraiseNum(), true);
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            composerStartRestartGroup.startReplaceableGroup(-739969252);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-739969237);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
        }
        long j2 = j;
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(12);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(strOooO0o);
        Modifier modifier3 = modifier2;
        TextKt.m1261Text4IGK_g(strOooO0o, modifierM482paddingqDBjuR0$default, j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(momentDetailModel, momentDetailActivityVM, modifier3, i, i2));
    }
}
