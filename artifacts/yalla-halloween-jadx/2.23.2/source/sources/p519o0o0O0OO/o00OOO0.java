package p519o0o0O0OO;

import android.app.Activity;
import android.text.TextUtils;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o0000O00;
import androidx.media3.session.o00O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import com.yallatech.support.platform.share.bean.ShareRequest;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;
import p194o00o0OO.o0O0ooO;
import p205o00o0o0o.o000O;
import p381o0OOoOo0.o00O0O;
import p381o0OOoOo0.o0OoOo0;
import p448o0OoOoo.o00O0OOO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o00oO0o;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentHeaderComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentHeaderComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentHeaderCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,450:1\n76#2:451\n76#2:463\n76#2:464\n76#2:509\n76#2:510\n76#2:511\n76#2:630\n76#2:674\n76#2:682\n76#2:696\n76#2:697\n76#2:725\n76#2:726\n81#3,11:452\n81#3,11:714\n25#4:465\n456#4,8:491\n464#4,3:505\n456#4,8:530\n464#4,3:544\n467#4,3:553\n456#4,8:574\n464#4,3:588\n456#4,8:610\n464#4,3:624\n467#4,3:633\n456#4,8:656\n464#4,3:670\n467#4,3:686\n467#4,3:691\n36#4:702\n467#4,3:709\n456#4,8:758\n464#4,3:772\n467#4,3:776\n456#4,8:801\n464#4,3:815\n467#4,3:819\n1097#5,6:466\n1097#5,6:703\n154#6:472\n154#6:473\n154#6:512\n154#6:548\n154#6:549\n154#6:550\n154#6:551\n154#6:552\n154#6:592\n154#6:628\n154#6:629\n154#6:631\n154#6:632\n154#6:638\n154#6:675\n154#6:676\n154#6:677\n154#6:678\n154#6:679\n154#6:680\n154#6:681\n154#6:683\n154#6:684\n154#6:685\n154#6:698\n154#6:699\n154#6:700\n154#6:701\n154#6:727\n154#6:728\n154#6,11:729\n154#6:740\n154#6:781\n154#6:782\n154#6:783\n154#6:824\n73#7,6:474\n79#7:508\n73#7,6:593\n79#7:627\n83#7:637\n73#7,6:639\n79#7:673\n83#7:690\n83#7:713\n78#8,11:480\n78#8,11:519\n91#8:556\n78#8,11:563\n78#8,11:599\n91#8:636\n78#8,11:645\n91#8:689\n91#8:694\n91#8:712\n78#8,11:747\n91#8:779\n78#8,11:790\n91#8:822\n4144#9,6:499\n4144#9,6:538\n4144#9,6:582\n4144#9,6:618\n4144#9,6:664\n4144#9,6:766\n4144#9,6:809\n66#10,6:513\n72#10:547\n76#10:557\n66#10,6:741\n72#10:775\n76#10:780\n66#10,6:784\n72#10:818\n76#10:823\n73#11,5:558\n78#11:591\n82#11:695\n76#12:825\n109#12,2:826\n*S KotlinDebug\n*F\n+ 1 MomentHeaderComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentHeaderCompKt\n*L\n75#1:451\n79#1:463\n80#1:464\n92#1:509\n93#1:510\n95#1:511\n226#1:630\n263#1:674\n292#1:682\n308#1:696\n317#1:697\n351#1:725\n353#1:726\n78#1:452,11\n350#1:714,11\n81#1:465\n83#1:491,8\n83#1:505,3\n97#1:530,8\n97#1:544,3\n97#1:553,3\n188#1:574,8\n188#1:588,3\n198#1:610,8\n198#1:624,3\n198#1:633,3\n262#1:656,8\n262#1:670,3\n262#1:686,3\n188#1:691,3\n336#1:702\n83#1:709,3\n355#1:758,8\n355#1:772,3\n355#1:776,3\n391#1:801,8\n391#1:815,3\n391#1:819,3\n81#1:466,6\n336#1:703,6\n86#1:472\n88#1:473\n97#1:512\n122#1:548\n173#1:549\n174#1:550\n175#1:551\n176#1:552\n194#1:592\n205#1:628\n221#1:629\n253#1:631\n254#1:632\n262#1:638\n263#1:675\n270#1:676\n271#1:677\n277#1:678\n278#1:679\n284#1:680\n285#1:681\n293#1:683\n298#1:684\n300#1:685\n323#1:698\n324#1:699\n334#1:700\n335#1:701\n371#1:727\n372#1:728\n375#1:729,11\n376#1:740\n393#1:781\n396#1:782\n397#1:783\n425#1:824\n83#1:474,6\n83#1:508\n198#1:593,6\n198#1:627\n198#1:637\n262#1:639,6\n262#1:673\n262#1:690\n83#1:713\n83#1:480,11\n97#1:519,11\n97#1:556\n188#1:563,11\n198#1:599,11\n198#1:636\n262#1:645,11\n262#1:689\n188#1:694\n83#1:712\n355#1:747,11\n355#1:779\n391#1:790,11\n391#1:822\n83#1:499,6\n97#1:538,6\n188#1:582,6\n198#1:618,6\n262#1:664,6\n355#1:766,6\n391#1:809,6\n97#1:513,6\n97#1:547\n97#1:557\n355#1:741,6\n355#1:775\n355#1:780\n391#1:784,6\n391#1:818\n391#1:823\n188#1:558,5\n188#1:591\n188#1:695\n81#1:825\n81#1:826,2\n*E\n"})
public final class o00OOO0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f52152OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52153OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Activity activity, MomentDetailModel momentDetailModel) {
            super(0);
            this.f52152OooO0Oo = activity;
            this.f52153OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Activity activity = this.f52152OooO0Oo;
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activity, o0000O00.OooO00o(this.f52153OooO0o0.getUserId()), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f52154OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f52154OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OOO0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f52154OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52155OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52156OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52157OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52158OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52159OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f52155OooO0Oo = modifier;
            this.f52157OooO0o0 = z;
            this.f52156OooO0o = function0;
            this.f52158OooO0oO = i;
            this.f52159OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OOO0.OooO0O0(this.f52155OooO0Oo, this.f52157OooO0o0, this.f52156OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52158OooO0oO | 1), this.f52159OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentHeaderCompKt$MomentHeaderContainer$2$1$1", f = "MomentHeaderComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f52160OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f52161OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52162OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f52163OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f52164OooO0oo;

        public static final class OooO00o extends Lambda implements Function1<o00O0O<MomentInRoomStateModel>, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableLongState f52165OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableLongState mutableLongState) {
                super(1);
                this.f52165OooO0Oo = mutableLongState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o00O0O<MomentInRoomStateModel> o00o0o2) {
                o00O0O<MomentInRoomStateModel> launchCollectApi = o00o0o2;
                Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
                launchCollectApi.f43270OooO00o = new o00OOO0O(this.f52165OooO0Oo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, MutableLongState mutableLongState, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f52160OooO0Oo = z;
            this.f52162OooO0o0 = momentDetailModel;
            this.f52161OooO0o = baseMomentDetailVM;
            this.f52163OooO0oO = lifecycleOwner;
            this.f52164OooO0oo = mutableLongState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f52160OooO0Oo, this.f52162OooO0o0, this.f52161OooO0o, this.f52163OooO0oO, this.f52164OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f52160OooO0Oo) {
                MomentDetailModel momentDetailModel = this.f52162OooO0o0;
                boolean zIsInRoom = momentDetailModel.isInRoom();
                MutableLongState mutableLongState = this.f52164OooO0oo;
                if (zIsInRoom) {
                    o0OoOo0.OooO00o(this.f52161OooO0o.getInRoomState(momentDetailModel.getUserId()), this.f52163OooO0oO, new OooO00o(mutableLongState));
                } else {
                    mutableLongState.setLongValue(0L);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f52166OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52167OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f52168OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52169OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f52170OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Activity f52171OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentDetailModel momentDetailModel, boolean z, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, Activity activity, MutableLongState mutableLongState) {
            super(0);
            this.f52167OooO0Oo = momentDetailModel;
            this.f52169OooO0o0 = z;
            this.f52168OooO0o = baseMomentDetailVM;
            this.f52170OooO0oO = lifecycleOwner;
            this.f52171OooO0oo = activity;
            this.f52166OooO = mutableLongState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OOOOo onLogin = new o00OOOOo(this.f52167OooO0Oo, this.f52169OooO0o0, this.f52168OooO0o, this.f52170OooO0oO, this.f52171OooO0oo, this.f52166OooO);
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

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f52172OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52173OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Activity activity, MomentDetailModel momentDetailModel) {
            super(0);
            this.f52172OooO0Oo = activity;
            this.f52173OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentDetailModel data = this.f52173OooO0o0;
            Intrinsics.checkNotNullParameter(data, "data");
            Activity activity = this.f52172OooO0Oo;
            if (com.code.android.util.OooO0OO.OooO00o(activity)) {
                Intrinsics.checkNotNull(activity);
                o000O o000o = new o000O(activity);
                o000o.OooOo00(o0000.OooO0OO(o000000.Discard_Post));
                o000o.OooOOOo(o0000.OooO0OO(o000000.KEEP_TRYING));
                o000o.OooOo0o(o0000.OooO0OO(o000000.DISCARD));
                o000o.OooOo0(new o00OO(activity, data));
                o000o.OooOo0O(new o00OOO00(data));
                o000o.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52174OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f52174OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f52174OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingVM f52175OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52176OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52177OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52178OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentFollowingVM momentFollowingVM, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z) {
            super(0);
            this.f52175OooO0Oo = momentFollowingVM;
            this.f52177OooO0o0 = momentDetailModel;
            this.f52176OooO0o = momentAdapterTag;
            this.f52178OooO0oO = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00Oo00 onLogin = new o00Oo00(this.f52175OooO0Oo, this.f52177OooO0o0, this.f52176OooO0o, this.f52178OooO0oO);
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

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52181OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52182OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52183OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f52179OooO0Oo = modifier;
            this.f52181OooO0o0 = z;
            this.f52180OooO0o = function0;
            this.f52182OooO0oO = i;
            this.f52183OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00OOO0.OooO0O0(this.f52179OooO0Oo, this.f52181OooO0o0, this.f52180OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52182OooO0oO | 1), this.f52183OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f52184OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52185OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(boolean z, int i) {
            super(2);
            this.f52184OooO0Oo = z;
            this.f52185OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52185OooO0o0 | 1);
            o00OOO0.OooO0OO(this.f52184OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f52186OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52187OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f52188OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(BoxScope boxScope, boolean z, int i) {
            super(2);
            this.f52186OooO0Oo = boxScope;
            this.f52188OooO0o0 = z;
            this.f52187OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52187OooO0o | 1);
            o00OOO0.OooO0Oo(this.f52186OooO0Oo, this.f52188OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1960600578);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1960600578, i, -1, "com.yalla.yalla.ui.composable.moment.MomentFriendTag (MomentHeaderComp.kt:389)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierClip = ClipKt.clip(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            int i2 = o0OOo000.f48347o00OOooO;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(16, PaddingKt.m479paddingVpY3zN4(BackgroundKt.m171backgroundbw27NRU$default(modifierClip, o0OOo000.f48186Ooooo0o, null, 2, null), Dp.m3775constructorimpl(6), Dp.m3775constructorimpl(0)), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(o000000.Friends, composerStartRestartGroup, 0);
            TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
            long j = o0OOo000.f48135OooO0O0;
            long sp = TextUnitKt.getSp(11);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, modifierAlign, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer2, 3072, 3072, 57328);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
    }

    /* JADX WARN: Code duplicated, block: B:128:0x03be  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:140:0x0405  */
    /* JADX WARN: Code duplicated, block: B:141:0x040a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0445  */
    /* JADX WARN: Code duplicated, block: B:147:0x0451  */
    /* JADX WARN: Code duplicated, block: B:148:0x0455  */
    /* JADX WARN: Code duplicated, block: B:153:0x0474  */
    /* JADX WARN: Code duplicated, block: B:161:0x054f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0552  */
    /* JADX WARN: Code duplicated, block: B:169:0x0572  */
    /* JADX WARN: Code duplicated, block: B:174:0x0585  */
    /* JADX WARN: Code duplicated, block: B:176:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x058f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0596  */
    /* JADX WARN: Code duplicated, block: B:182:0x059f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0623  */
    /* JADX WARN: Code duplicated, block: B:188:0x062f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0633  */
    /* JADX WARN: Code duplicated, block: B:194:0x0654  */
    /* JADX WARN: Code duplicated, block: B:197:0x067a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0681  */
    /* JADX WARN: Code duplicated, block: B:201:0x0744  */
    /* JADX WARN: Code duplicated, block: B:206:0x076f  */
    /* JADX WARN: Code duplicated, block: B:210:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:227:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:230:0x08b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable Modifier modifier, boolean z, @NotNull Function0<Unit> moreClickCallBack, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        boolean z2;
        MomentAdapterTag momentAdapterTag;
        boolean z3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        ColumnScopeInstance columnScopeInstance;
        Modifier modifierWeight;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        Integer numValueOf;
        MomentAdapterTag momentAdapterTag2;
        float f;
        boolean z4;
        int i5;
        int positionid;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM1320constructorimpl3;
        Function2 function2OooO00o3;
        float fM3775constructorimpl;
        float f2;
        boolean zOooOOo;
        boolean zBooleanValue;
        float f3;
        float fM3775constructorimpl2;
        Long l;
        Intrinsics.checkNotNullParameter(moreClickCallBack, "moreClickCallBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(663551319);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(moreClickCallBack) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663551319, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentHeaderContainer (MomentHeaderComp.kt:73)");
            }
            if (((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, z, moreClickCallBack, i, i2));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
            Activity activity = (Activity) composerStartRestartGroup.consume(oo0OOoo.f52735OooO0o0);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotLongStateKt.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableLongState mutableLongState = (MutableLongState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f4 = 15;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion2.then(modifier3), Dp.m3775constructorimpl(61)), 0.0f, 1, null), Dp.m3775constructorimpl(f4), 0.0f, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier4 = modifier3;
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl4, measurePolicyOooO0O0, composerM1320constructorimpl4, currentCompositionLocalMap);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MomentAdapterTag momentAdapterTag3 = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
            ProvidableCompositionLocal<Boolean> providableCompositionLocal = oo0OOoo.f52729OooO;
            boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
            float f5 = 38;
            Modifier modifierOooO00o = o00O0.OooO00o(f5, companion2, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl5, measurePolicyOooO00o, composerM1320constructorimpl5, currentCompositionLocalMap2);
            if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MomentAdapterTag momentAdapterTag4 = MomentAdapterTag.MomentListFollowingFragment;
            boolean z5 = momentAdapterTag3 == momentAdapterTag4 || momentAdapterTag3 == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag3 == MomentAdapterTag.MomentListFollowingFragment_Recommend;
            EffectsKt.LaunchedEffect(Boolean.valueOf(momentDetailModel.isInRoom()), new OooO0OO(z5, momentDetailModel, baseMomentDetailVM, lifecycleOwner, mutableLongState, null), composerStartRestartGroup, 64);
            oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
            oooO00o.OooOO0O(momentDetailModel.getHeadUrl(), o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f5)), !zBooleanValue2, false, 0L, false, null, null, null, new OooO0o(momentDetailModel, z5, baseMomentDetailVM, lifecycleOwner, activity, mutableLongState), 252), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
            if (mutableLongState.getLongValue() == 0 || !z5) {
                i4 = 6;
                z2 = false;
            } else {
                i4 = 6;
                z2 = true;
            }
            OooO0Oo(boxScopeInstance, z2, composerStartRestartGroup, i4);
            composerStartRestartGroup.startReplaceableGroup(346971445);
            if (momentDetailModel.getRole() == 2) {
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_userinfo_official_just_for_moment, composerStartRestartGroup, 0), (String) null, OffsetKt.m439offsetVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(OffsetKt.m439offsetVpY3zN4$default(companion2, Dp.m3775constructorimpl(p595o0oo00O.OooOo00.OooO0o0() ? -6 : 13), 0.0f, 2, null), Dp.m3775constructorimpl(31)), Dp.m3775constructorimpl(19)), 0.0f, Dp.m3775constructorimpl(-2), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            o00O000o.OooO00o(composerStartRestartGroup);
            if (z) {
                momentAdapterTag = momentAdapterTag3;
            } else {
                momentAdapterTag = momentAdapterTag3;
                if (momentAdapterTag == MomentAdapterTag.PostDetailCommentSonList || momentAdapterTag == MomentAdapterTag.MomentListFeaturedFragment) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
                    long userId = momentDetailModel.getUserId();
                    if ((l2 == null || l2.longValue() != userId) && !momentDetailModel.isFollow()) {
                        z3 = true;
                    }
                }
                Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null);
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = o00O0OOO.OooO00o(companion3, center, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (z3) {
                    modifierWeight = columnScopeInstance.weight(companion2, 1.0f, false);
                } else {
                    modifierWeight = columnScopeInstance.weight(SizeKt.m532widthInVpY3zN4$default(companion2, 0.0f, Dp.m3775constructorimpl(216), 1, null), 1.0f, false);
                }
                Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap4);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                float f6 = 8;
                numValueOf = null;
                momentAdapterTag2 = momentAdapterTag;
                oooO00o.OooOOOo(momentDetailModel.getNickName(), 0L, false, TextUnitKt.getSp(15), 0, 0, FontWeight.INSTANCE.getBold(), false, o0O0O00.OooO0O0(rowScopeInstance.weight(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false), false, false, 0L, false, null, null, null, new OooO(activity, momentDetailModel), 255), composerStartRestartGroup, 1087900672, 54);
                f = 4;
                oooO00o.OooO0oO(Integer.valueOf(momentDetailModel.getSex()), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 560, 0);
                composerStartRestartGroup.startReplaceableGroup(2043648373);
                if (momentAdapterTag2 == momentAdapterTag4 || !momentDetailModel.getIsFriend() || ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    l = (Long) o0O00oO0.OooOOo0().getValue();
                    long userId2 = momentDetailModel.getUserId();
                    if (l == null || l.longValue() != userId2) {
                        OooO00o(composerStartRestartGroup, 0);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-813828737);
                if (momentAdapterTag2 != MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag2 == MomentAdapterTag.TopicDetailFragmentLatest) {
                    positionid = momentDetailModel.getPositionid();
                    if (positionid == 1) {
                        numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_owner);
                    } else if (positionid == 3) {
                        numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_manager);
                    }
                    if (numValueOf != null) {
                        numValueOf.intValue();
                        ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, i5), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                oo0O.OooO00o(momentDetailModel, composerStartRestartGroup, 8);
                Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOO0O.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap5);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                if (((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue()) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(1);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(f);
                }
                f2 = fM3775constructorimpl;
                oooO00o.OooOo(momentDetailModel.getWealthLevel(), momentDetailModel.getWealthBadgeImage(), SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(32)), o0000O0.OooO0OO(8, composerStartRestartGroup, 6), composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
                boolean zOooOo0 = oO0OO.OooO00o.OooOo0(null, Integer.valueOf(momentDetailModel.getKaVipLv()), null, Dp.m3775constructorimpl(f4), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 265216, 5);
                zOooOOo = oO0OO.OooO00o.OooOOo(Boolean.valueOf(momentDetailModel.getIsVIP()), Integer.valueOf(momentDetailModel.getNVipLv()), false, Dp.m3775constructorimpl(f4), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 265216, 4);
                composerStartRestartGroup.startReplaceableGroup(-813826615);
                if (!TextUtils.isEmpty(momentDetailModel.getMedal())) {
                    f3 = 3;
                    int iMo320roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(Dp.m3775constructorimpl(f3));
                    String medal = momentDetailModel.getMedal();
                    Integer numValueOf2 = Integer.valueOf(iMo320roundToPx0680j_4);
                    float fM3775constructorimpl3 = Dp.m3775constructorimpl(f4);
                    if (!zOooOOo || zOooOo0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(f3);
                    } else {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(0);
                    }
                    oooO00o.OooOOO(medal, numValueOf2, fM3775constructorimpl3, PaddingKt.m482paddingqDBjuR0$default(companion2, fM3775constructorimpl2, f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 33152, 0);
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
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(346976748);
                if (z3) {
                    OooO0OO(zBooleanValue, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1628521953);
                if (zBooleanValue && momentAdapterTag2 != MomentAdapterTag.MomentEditRecord) {
                    if (((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(346976984);
                        MomentSendModel sendPostModel = momentDetailModel.getSendPostModel();
                        Intrinsics.checkNotNull(sendPostModel);
                        if (sendPostModel.isSendFailed()) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_delete, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOO0(activity, momentDetailModel), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(346977589);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_more, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(19));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        boolean zChanged = composerStartRestartGroup.changed(moreClickCallBack);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new OooOO0O(moreClickCallBack);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierM525size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (OooOo.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            z3 = false;
            Modifier modifierOooO00o3 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o4 = o00O0OOO.OooO00o(companion3, center2, composerStartRestartGroup, 6, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap6);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z3) {
                modifierWeight = columnScopeInstance.weight(companion2, 1.0f, false);
            } else {
                modifierWeight = columnScopeInstance.weight(SizeKt.m532widthInVpY3zN4$default(companion2, 0.0f, Dp.m3775constructorimpl(216), 1, null), 1.0f, false);
            }
            Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierWeight);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O2, composerM1320constructorimpl2, currentCompositionLocalMap7);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            float f7 = 8;
            numValueOf = null;
            momentAdapterTag2 = momentAdapterTag;
            oooO00o.OooOOOo(momentDetailModel.getNickName(), 0L, false, TextUnitKt.getSp(15), 0, 0, FontWeight.INSTANCE.getBold(), false, o0O0O00.OooO0O0(rowScopeInstance.weight(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false), false, false, 0L, false, null, null, null, new OooO(activity, momentDetailModel), 255), composerStartRestartGroup, 1087900672, 54);
            f = 4;
            oooO00o.OooO0oO(Integer.valueOf(momentDetailModel.getSex()), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 560, 0);
            composerStartRestartGroup.startReplaceableGroup(2043648373);
            if (momentAdapterTag2 == momentAdapterTag4) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                l = (Long) o0O00oO0.OooOOo0().getValue();
                long userId3 = momentDetailModel.getUserId();
                i5 = l == null ? 0 : 0;
                OooO00o(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-813828737);
            if (momentAdapterTag2 != MomentAdapterTag.TopicDetailFragmentPopular) {
                positionid = momentDetailModel.getPositionid();
                if (positionid == 1) {
                    numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_owner);
                } else if (positionid == 3) {
                    numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_manager);
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, i5), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                positionid = momentDetailModel.getPositionid();
                if (positionid == 1) {
                    numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_owner);
                } else if (positionid == 3) {
                    numValueOf = Integer.valueOf(o0Oo0oo.ic_topic_manager);
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, i5), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(f4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            oo0O.OooO00o(momentDetailModel, composerStartRestartGroup, 8);
            Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooOO0O.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o5, composerM1320constructorimpl3, currentCompositionLocalMap8);
            if (composerM1320constructorimpl3.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf8.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue()) {
                fM3775constructorimpl = Dp.m3775constructorimpl(1);
            } else {
                fM3775constructorimpl = Dp.m3775constructorimpl(f);
            }
            f2 = fM3775constructorimpl;
            oooO00o.OooOo(momentDetailModel.getWealthLevel(), momentDetailModel.getWealthBadgeImage(), SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(f4)), Dp.m3775constructorimpl(32)), o0000O0.OooO0OO(8, composerStartRestartGroup, 6), composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
            boolean zOooOo1 = oO0OO.OooO00o.OooOo0(null, Integer.valueOf(momentDetailModel.getKaVipLv()), null, Dp.m3775constructorimpl(f4), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 265216, 5);
            zOooOOo = oO0OO.OooO00o.OooOOo(Boolean.valueOf(momentDetailModel.getIsVIP()), Integer.valueOf(momentDetailModel.getNVipLv()), false, Dp.m3775constructorimpl(f4), PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 265216, 4);
            composerStartRestartGroup.startReplaceableGroup(-813826615);
            if (!TextUtils.isEmpty(momentDetailModel.getMedal())) {
                f3 = 3;
                int iMo320roundToPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(Dp.m3775constructorimpl(f3));
                String medal2 = momentDetailModel.getMedal();
                Integer numValueOf3 = Integer.valueOf(iMo320roundToPx0680j_5);
                float fM3775constructorimpl4 = Dp.m3775constructorimpl(f4);
                if (zOooOOo) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(f3);
                } else {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(f3);
                }
                oooO00o.OooOOO(medal2, numValueOf3, fM3775constructorimpl4, PaddingKt.m482paddingqDBjuR0$default(companion2, fM3775constructorimpl2, f2, 0.0f, 0.0f, 12, null), composerStartRestartGroup, 33152, 0);
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
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(346976748);
            if (z3) {
                OooO0OO(zBooleanValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1628521953);
            if (zBooleanValue) {
            }
            if (OooOo.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO0(modifier2, z, moreClickCallBack, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(boolean z, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-598401714);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598401714, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentUserFollow (MomentHeaderComp.kt:348)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentFollowingVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
            MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooOOO((MomentFollowingVM) viewModel, momentDetailModel, momentAdapterTag, z), 253), Dp.m3775constructorimpl(24), 0.0f, 0.0f, 0.0f, 14, null);
            float fM3775constructorimpl = Dp.m3775constructorimpl(1);
            long j = o0OOo000.f48186Ooooo0o;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(27, PaddingKt.m480paddingVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(BorderKt.m182borderxT4_qwU(modifierM482paddingqDBjuR0$default, fM3775constructorimpl, j, RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape()), z ? j : o0OOo000.f48134OooO00o, null, 2, null), z ? Dp.m3775constructorimpl(12) : Dp.m3775constructorimpl((float) 10.5d), 0.0f, 2, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(o000000.Follow, composerStartRestartGroup, 0);
            if (z) {
                j = o0OOo000.f48135OooO0O0;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, boxScopeInstance.align(companion, companion2.getCenter()), j, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 3072, 56816);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(z, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, boolean z, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(513394207);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composerStartRestartGroup = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(513394207, i2, -1, "com.yalla.yalla.ui.composable.moment.UserInfoRoomAnimation (MomentHeaderComp.kt:410)");
            }
            if (z) {
                o0O0ooO.OooO00o(o00oO0o.moment_user_in_room, 2000L, ContentScale.INSTANCE.getCrop(), 0, null, null, null, boxScope.align(SizeKt.m517requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(48)), Alignment.INSTANCE.getCenter()), composerStartRestartGroup, 432, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(boxScope, z, i));
    }
}
