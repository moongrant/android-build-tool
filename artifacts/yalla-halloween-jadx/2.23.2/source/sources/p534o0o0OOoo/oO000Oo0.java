package p534o0o0OOoo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.vm.message.FriendRequestDetailVM;
import com.yallatech.support.platform.share.bean.ShareRequest;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p207o00o0oO0.o000O0Oo;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFriendRequestDetailScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestDetailScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestDetailScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,328:1\n72#2,6:329\n78#2:363\n82#2:391\n72#2,6:602\n78#2:636\n82#2:734\n78#3,11:335\n91#3:390\n78#3,11:414\n91#3:448\n78#3,11:467\n91#3:509\n78#3,11:523\n91#3:555\n78#3,11:571\n78#3,11:608\n78#3,11:644\n91#3:677\n78#3,11:687\n91#3:728\n91#3:733\n91#3:740\n456#4,8:346\n464#4,3:360\n25#4:365\n467#4,3:387\n25#4:392\n456#4,8:425\n464#4,3:439\n467#4,3:445\n456#4,8:478\n464#4,3:492\n467#4,3:506\n456#4,8:534\n464#4,3:548\n467#4,3:552\n36#4:557\n456#4,8:582\n464#4,3:596\n456#4,8:619\n464#4,3:633\n456#4,8:655\n464#4,3:669\n467#4,3:674\n456#4,8:698\n464#4,3:712\n467#4,3:725\n467#4,3:730\n467#4,3:737\n4144#5,6:354\n4144#5,6:433\n4144#5,6:486\n4144#5,6:542\n4144#5,6:590\n4144#5,6:627\n4144#5,6:663\n4144#5,6:706\n76#6:364\n76#6:410\n76#6:496\n1097#7,6:366\n1097#7,6:393\n1097#7,6:558\n81#8,11:372\n81#8,11:399\n81#8,11:450\n154#9:383\n154#9:384\n154#9:385\n154#9:386\n154#9:411\n154#9:443\n154#9:444\n154#9:461\n154#9:497\n154#9:498\n154#9:499\n154#9:500\n154#9:501\n154#9:502\n154#9:503\n154#9:504\n154#9:505\n154#9:511\n154#9:512\n154#9:513\n164#9:514\n154#9:515\n154#9:516\n154#9:564\n154#9:600\n154#9:601\n154#9:673\n154#9:679\n154#9:716\n154#9:717\n154#9:718\n154#9:719\n154#9:720\n154#9:721\n154#9:722\n154#9:723\n154#9:724\n154#9:735\n154#9:736\n77#10,2:412\n79#10:442\n83#10:449\n74#10,5:462\n79#10:495\n83#10:510\n73#10,6:565\n79#10:599\n72#10,7:637\n79#10:672\n83#10:678\n72#10,7:680\n79#10:715\n83#10:729\n83#10:741\n66#11,6:517\n72#11:551\n76#11:556\n81#12:742\n81#12:743\n*S KotlinDebug\n*F\n+ 1 FriendRequestDetailScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestDetailScreenKt\n*L\n71#1:329,6\n71#1:363\n71#1:391\n284#1:602,6\n284#1:636\n284#1:734\n71#1:335,11\n71#1:390\n113#1:414,11\n113#1:448\n153#1:467,11\n153#1:509\n249#1:523,11\n249#1:555\n269#1:571,11\n284#1:608,11\n285#1:644,11\n285#1:677\n291#1:687,11\n291#1:728\n284#1:733\n269#1:740\n71#1:346,8\n71#1:360,3\n74#1:365\n71#1:387,3\n96#1:392\n113#1:425,8\n113#1:439,3\n113#1:445,3\n153#1:478,8\n153#1:492,3\n153#1:506,3\n249#1:534,8\n249#1:548,3\n249#1:552,3\n272#1:557\n269#1:582,8\n269#1:596,3\n284#1:619,8\n284#1:633,3\n285#1:655,8\n285#1:669,3\n285#1:674,3\n291#1:698,8\n291#1:712,3\n291#1:725,3\n284#1:730,3\n269#1:737,3\n71#1:354,6\n113#1:433,6\n153#1:486,6\n249#1:542,6\n269#1:590,6\n284#1:627,6\n285#1:663,6\n291#1:706,6\n73#1:364\n101#1:410\n159#1:496\n74#1:366,6\n96#1:393,6\n272#1:558,6\n78#1:372,11\n97#1:399,11\n152#1:450,11\n81#1:383\n83#1:384\n85#1:385\n89#1:386\n118#1:411\n131#1:443\n132#1:444\n157#1:461\n168#1:497\n174#1:498\n181#1:499\n196#1:500\n212#1:501\n215#1:502\n223#1:503\n227#1:504\n236#1:505\n251#1:511\n253#1:512\n254#1:513\n255#1:514\n255#1:515\n256#1:516\n273#1:564\n280#1:600\n283#1:601\n287#1:673\n290#1:679\n292#1:716\n295#1:717\n296#1:718\n300#1:719\n301#1:720\n306#1:721\n307#1:722\n311#1:723\n312#1:724\n318#1:735\n324#1:736\n113#1:412,2\n113#1:442\n113#1:449\n153#1:462,5\n153#1:495\n153#1:510\n269#1:565,6\n269#1:599\n285#1:637,7\n285#1:672\n285#1:678\n291#1:680,7\n291#1:715\n291#1:729\n269#1:741\n249#1:517,6\n249#1:551\n249#1:556\n79#1:742\n275#1:743\n*E\n"})
public final class oO000Oo0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f53552OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53553OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(FriendRequestDetailVM friendRequestDetailVM, MutableState<Boolean> mutableState) {
            super(0);
            this.f53552OooO0Oo = friendRequestDetailVM;
            this.f53553OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f53552OooO0Oo.isBlack()) {
                o0oo0000.OooO00o.OooO0O0("104039");
            }
            this.f53553OooO0o0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f53554OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53555OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, int i) {
            super(2);
            this.f53554OooO0Oo = str;
            this.f53555OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53555OooO0o0 | 1);
            oO000Oo0.OooO00o(this.f53554OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.message.FriendRequestDetailScreenKt$RequestMessageMenu$1", f = "FriendRequestDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f53556OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53557OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FriendRequestDetailVM friendRequestDetailVM, FriendRequestMessage friendRequestMessage, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f53556OooO0Oo = friendRequestDetailVM;
            this.f53557OooO0o0 = friendRequestMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f53556OooO0Oo, this.f53557OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f53556OooO0Oo.checkIsFriendAndBlock(this.f53557OooO0o0.getTargetUserId());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f53558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f53559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53560OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FriendRequestDetailVM friendRequestDetailVM, FriendRequestMessage friendRequestMessage, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f53558OooO0Oo = friendRequestDetailVM;
            this.f53560OooO0o0 = friendRequestMessage;
            this.f53559OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FriendRequestMessage friendRequestMessage = this.f53560OooO0o0;
            long targetUserId = friendRequestMessage.getTargetUserId();
            FriendRequestDetailVM friendRequestDetailVM = this.f53558OooO0Oo;
            friendRequestDetailVM.blockUser(targetUserId, !friendRequestDetailVM.isBlack(), friendRequestMessage.getState()).observe(this.f53559OooO0o, new o0OoOo0(oO000Oo.f53551OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f53561OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53562OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FriendRequestMessage friendRequestMessage) {
            super(0);
            this.f53562OooO0Oo = friendRequestMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("104040");
            ReportScreen reportScreen = ReportScreen.INSTANCE;
            FriendRequestMessage friendRequestMessage = this.f53562OooO0Oo;
            o00O00.OooO0o0(reportScreen, ReportScreen.bundleOf(2, friendRequestMessage.getTargetUserId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : friendRequestMessage.getMessage(), (244 & 128) != 0 ? null : 2), false, null, 12);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53563OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53564OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(FriendRequestMessage friendRequestMessage, int i) {
            super(2);
            this.f53563OooO0Oo = friendRequestMessage;
            this.f53564OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53564OooO0o0 | 1);
            oO000Oo0.OooO0O0(this.f53563OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f53565OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f53566OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53567OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(FriendRequestDetailVM friendRequestDetailVM, FriendRequestMessage friendRequestMessage, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f53565OooO0Oo = friendRequestDetailVM;
            this.f53567OooO0o0 = friendRequestMessage;
            this.f53566OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("104037");
            this.f53565OooO0Oo.applyFriendRequest(true, this.f53567OooO0o0.getTargetUserId()).observe(this.f53566OooO0o, new o0OoOo0(oO0O0OoO.f53606OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f53568OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f53569OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53570OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(FriendRequestDetailVM friendRequestDetailVM, FriendRequestMessage friendRequestMessage, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f53568OooO0Oo = friendRequestDetailVM;
            this.f53570OooO0o0 = friendRequestMessage;
            this.f53569OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("104038");
            this.f53568OooO0Oo.applyFriendRequest(false, this.f53570OooO0o0.getTargetUserId()).observe(this.f53569OooO0o, new o0OoOo0(oO000o00.f53581OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53571OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(FriendRequestMessage friendRequestMessage) {
            super(0);
            this.f53571OooO0Oo = friendRequestMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = PrivateChatActivity.f25239Oooo000;
                PrivateChatActivity.OooO00o.OooO00o(activityOooO0O0, Long.valueOf(this.f53571OooO0Oo.getTargetUserId()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f53572OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f53573OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFriendRequestDetailScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestDetailScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestDetailScreenKt$UserInfo$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f53574OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(long j) {
            super(0);
            this.f53574OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activityOooO0O0, String.valueOf(this.f53574OooO0Oo), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53575OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53576OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FriendRequestMessage friendRequestMessage, int i) {
            super(2);
            this.f53575OooO0Oo = friendRequestMessage;
            this.f53576OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53576OooO0o0 | 1);
            oO000Oo0.OooO0OO(this.f53575OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f53577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53578OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessage f53579OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(long j, FriendRequestMessage friendRequestMessage, int i) {
            super(2);
            this.f53577OooO0Oo = j;
            this.f53579OooO0o0 = friendRequestMessage;
            this.f53578OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53578OooO0o | 1);
            oO000Oo0.OooO0Oo(this.f53577OooO0Oo, this.f53579OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53580OooO0Oo;

        public o0OoOo0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53580OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53580OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53580OooO0Oo;
        }

        public final int hashCode() {
            return this.f53580OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53580OooO0Oo.invoke(obj);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(202519101);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(202519101, i2, -1, "com.yalla.yalla.ui.screen.message.RequestMessage (FriendRequestDetailScreen.kt:247)");
            }
            float f = 16;
            Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(BackgroundKt.m170backgroundbw27NRU(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(80), 0.0f, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), Dp.m3775constructorimpl((float) 0.5d), o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), Dp.m3775constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs);
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
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str == null ? "" : str, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 0, 65522);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(str, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(FriendRequestMessage friendRequestMessage, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-573063177);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-573063177, i, -1, "com.yalla.yalla.ui.screen.message.RequestMessageMenu (FriendRequestDetailScreen.kt:94)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(FriendRequestDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        FriendRequestDetailVM friendRequestDetailVM = (FriendRequestDetailVM) viewModel;
        EffectsKt.LaunchedEffect(Long.valueOf(friendRequestMessage.getTargetUserId()), new OooO0O0(friendRequestDetailVM, friendRequestMessage, null), composerStartRestartGroup, 64);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-2064247988);
        String strStringResource = friendRequestDetailVM.isBlack() ? "" : StringResources_androidKt.stringResource(o000000.Add_Block_This_User_Title, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o000O0Oo.OooO0Oo(mutableState, strStringResource, StringResources_androidKt.stringResource(friendRequestDetailVM.isBlack() ? o000000.Unblock_this_user : o000000.Add_Block_This_User_Content, composerStartRestartGroup, 0), null, false, false, null, null, null, false, null, false, new OooO0OO(friendRequestDetailVM, friendRequestMessage, lifecycleOwner), null, false, false, null, OooO0o.f53561OooO0Oo, null, null, composerStartRestartGroup, 6, 12582912, 913400);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(16, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(friendRequestDetailVM.isBlack() ? o000000.Unblock : o000000.Block, composerStartRestartGroup, 0), o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooO(friendRequestDetailVM, mutableState), 253), o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        SurfaceKt.m1201SurfaceFjzlyU(SizeKt.m527sizeVpY3zN4(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(12), 0.0f, 2, null), Dp.m3775constructorimpl(1), Dp.m3775constructorimpl(10)), null, o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, 0L, null, 0.0f, oO000OOo.f53549OooO00o, composerStartRestartGroup, 1572870, 58);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Report, composerStartRestartGroup, 0), o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooOO0(friendRequestMessage), 253), o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(friendRequestMessage, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(FriendRequestMessage friendRequestMessage, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2137281245);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2137281245, i, -1, "com.yalla.yalla.ui.screen.message.RequestMessageState (FriendRequestDetailScreen.kt:150)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(FriendRequestDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        FriendRequestDetailVM friendRequestDetailVM = (FriendRequestDetailVM) viewModel;
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Integer numValueOf = friendRequestMessage != null ? Integer.valueOf(friendRequestMessage.getState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            composerStartRestartGroup.startReplaceableGroup(159325210);
            String strStringResource = StringResources_androidKt.stringResource(o000000.Decline, composerStartRestartGroup, 0);
            TextButtonStyle textButtonStyle = TextButtonStyle.GreenOutLined;
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            float f2 = 44;
            composer2 = composerStartRestartGroup;
            o00O0OO0.OooO00o(strStringResource, 0L, companion3.getNormal(), textButtonStyle, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f2)), new OooOOO0(friendRequestDetailVM, friendRequestMessage, lifecycleOwner), composerStartRestartGroup, 3456, 0, 262130);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
            o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o000000.Accept, composer2, 0), 0L, companion3.getNormal(), TextButtonStyle.Green, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f2)), new OooOOO(friendRequestDetailVM, friendRequestMessage, lifecycleOwner), composer2, 3456, 0, 262130);
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                composer2.startReplaceableGroup(159326504);
                o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o000000.Chat, composer2, 0), 0L, FontWeight.INSTANCE.getNormal(), TextButtonStyle.Green, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(44)), new OooOOOO(friendRequestMessage), composer2, 3456, 0, 262130);
                composer2.endReplaceableGroup();
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                composer2.startReplaceableGroup(159327060);
                if (friendRequestDetailVM.getHaveRejectOperation()) {
                    composer2.startReplaceableGroup(159327106);
                    String strStringResource2 = StringResources_androidKt.stringResource(o000000.Declined, composer2, 0);
                    TextButtonStyle textButtonStyle2 = TextButtonStyle.GreyDisable;
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    float f3 = 44;
                    o00O0OO0.OooO00o(strStringResource2, 0L, companion4.getNormal(), textButtonStyle2, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f3)), OooOo00.f53573OooO0Oo, composer2, 805309824, 805306368, 261618);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer2, 6, 2);
                    o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o000000.Accept, composer2, 0), 0L, companion4.getNormal(), TextButtonStyle.GreyOutlinedDisable, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f3)), OooOo.f53572OooO0Oo, composer2, 805309824, 805306368, 261618);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(159328057);
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(20), null, composer2, 6, 2);
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.friend_request_declined, composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38629OooOOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                composer2.startReplaceableGroup(159328411);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(20), null, composer2, 6, 2);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.friend_request_expired, composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38629OooOOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(159328681);
                composer2.endReplaceableGroup();
            }
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(friendRequestMessage, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(long j, FriendRequestMessage friendRequestMessage, Composer composer, int i) {
        String userName;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1499778389);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1499778389, i, -1, "com.yalla.yalla.ui.screen.message.UserInfo (FriendRequestDetailScreen.kt:267)");
        }
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Long lValueOf = Long.valueOf(j);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(lValueOf);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Oooo0(j);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f = 16;
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f, o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
        Intrinsics.checkNotNull(friendRequestMessage);
        long targetUserId = friendRequestMessage.getTargetUserId();
        userInfoRepo.getClass();
        MutableState mutableStateOooO0o0 = UserInfoRepo.OooO0o0(targetUserId, composerStartRestartGroup);
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        UserInfo userInfo = (UserInfo) mutableStateOooO0o0.getValue();
        String userHeader = userInfo != null ? userInfo.getUserHeader() : null;
        UserInfo userInfo2 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooO(userHeader, userInfo2 != null ? userInfo2.getUserHeaderFrame() : null, 0.0f, null, ClipKt.clip(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 262144, 12);
        float f2 = 8;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2 = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O2 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        UserInfo userInfo3 = (UserInfo) mutableStateOooO0o0.getValue();
        if (userInfo3 == null || (userName = userInfo3.getUserName()) == null) {
            userName = "";
        }
        oooO00o.OooOOOo(userName, 0L, false, 0L, 0, 0, null, false, rowScopeInstance.weight(companion2, 1.0f, false), composerStartRestartGroup, Pow2.MAX_POW2, 254);
        float f3 = 6;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        UserInfo userInfo4 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOOO0(userInfo4 != null ? Integer.valueOf(userInfo4.getUserLevel()) : null, 0L, 0L, null, composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 14);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        Alignment.Vertical centerVertically3 = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O3 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
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
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O3, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        UserInfo userInfo5 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooO0o(userInfo5 != null ? Integer.valueOf(userInfo5.getCountryId()) : null, PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 11, null), composerStartRestartGroup, 560, 0);
        UserInfo userInfo6 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooO0oO(userInfo6 != null ? Integer.valueOf(userInfo6.getSex()) : null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 11, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 560, 0);
        UserInfo userInfo7 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOo00(userInfo7 != null ? Integer.valueOf(userInfo7.getIdLevel()) : null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 11, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 560, 0);
        UserInfo userInfo8 = (UserInfo) mutableStateOooO0o0.getValue();
        oO0OO.OooO00o.OooOo0(null, userInfo8 != null ? Integer.valueOf(userInfo8.getVipLevel()) : null, null, 0.0f, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 11, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 286720, 13);
        UserInfo userInfo9 = (UserInfo) mutableStateOooO0o0.getValue();
        Boolean boolValueOf = userInfo9 != null ? Boolean.valueOf(userInfo9.isPremium()) : null;
        UserInfo userInfo10 = (UserInfo) mutableStateOooO0o0.getValue();
        oO0OO.OooO00o.OooOOo(boolValueOf, userInfo10 != null ? Integer.valueOf(userInfo10.getPremiumLevel()) : null, false, 0.0f, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 11, null), Dp.m3775constructorimpl(f)), composerStartRestartGroup, 286720, 12);
        UserInfo userInfo11 = (UserInfo) mutableStateOooO0o0.getValue();
        oooO00o.OooOOO(userInfo11 != null ? userInfo11.getMedal() : null, null, 0.0f, null, composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 14);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(24), null, composerStartRestartGroup, 6, 2);
        IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_arrow, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 6), o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, composerStartRestartGroup, 56, 0);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(j, friendRequestMessage, i));
    }

    public static final void OooO0o0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(877205985);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(877205985, i, -1, "com.yalla.yalla.ui.screen.message.FriendRequestDetailScreenContent (FriendRequestDetailScreen.kt:69)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Friend_Request, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Long.valueOf(bundleOooO0O0.getLong("targetUserId"));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jLongValue = ((Number) objRememberedValue).longValue();
            composerStartRestartGroup.startReplaceableGroup(1449993199);
            if (jLongValue <= 0) {
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new ooOOOOoo(null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(FriendRequestDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            FriendRequestMessage friendRequestMessage = (FriendRequestMessage) SnapshotStateKt.collectAsState(((FriendRequestDetailVM) viewModel).getMessageByTargetUserId(jLongValue), null, null, composerStartRestartGroup, 56, 2).getValue();
            composerStartRestartGroup.startReplaceableGroup(668172629);
            if (friendRequestMessage != null) {
                float f = 20;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                OooO0Oo(jLongValue, friendRequestMessage, composerStartRestartGroup, 70);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                OooO00o(friendRequestMessage.getMessage(), composerStartRestartGroup, 0);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(40), null, composerStartRestartGroup, 6, 2);
                OooO0OO(friendRequestMessage, composerStartRestartGroup, 8);
                SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                OooO0O0(friendRequestMessage, composerStartRestartGroup, 8);
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(12), null, composerStartRestartGroup, 6, 2);
            }
            if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0OOo0o(i));
    }
}
