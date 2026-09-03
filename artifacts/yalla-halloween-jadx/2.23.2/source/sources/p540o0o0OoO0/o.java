package p540o0o0OoO0;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p207o00o0oO0.o0000O0;
import p207o00o0oO0.o000O0Oo;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;
import p476o0OooooO.o0OOo000;
import p523o0o0O0oo.oO000O0O;
import p523o0o0O0oo.oO000Oo;
import p523o0o0O0oo.oO000o00;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO0O00O;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomMemberUserRankDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 14 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,508:1\n81#2,11:509\n164#3:520\n154#3:536\n154#3:537\n154#3:538\n154#3:653\n154#3:654\n154#3:655\n164#3:661\n154#3:662\n154#3:669\n154#3:705\n154#3:746\n154#3:747\n154#3:783\n154#3:784\n154#3:790\n486#4,4:521\n490#4,2:529\n494#4:535\n25#5:525\n456#5,8:556\n464#5,3:570\n467#5,3:577\n456#5,8:599\n464#5,3:613\n456#5,8:635\n464#5,3:649\n467#5,3:656\n467#5,3:663\n456#5,8:687\n464#5,3:701\n456#5,8:723\n464#5,3:737\n467#5,3:741\n456#5,8:765\n464#5,3:779\n467#5,3:785\n467#5,3:791\n456#5,8:809\n464#5,3:823\n467#5,3:827\n1097#6,3:526\n1100#6,3:532\n486#7:531\n73#8,6:539\n79#8:573\n83#8:581\n72#8,7:617\n79#8:652\n83#8:660\n73#8,6:670\n79#8:704\n73#8,6:748\n79#8:782\n83#8:789\n83#8:795\n78#9,11:545\n91#9:580\n78#9,11:588\n78#9,11:624\n91#9:659\n91#9:666\n78#9,11:676\n78#9,11:712\n91#9:744\n78#9,11:754\n91#9:788\n91#9:794\n78#9,11:798\n91#9:830\n4144#10,6:564\n4144#10,6:607\n4144#10,6:643\n4144#10,6:695\n4144#10,6:731\n4144#10,6:773\n4144#10,6:817\n1864#11,3:574\n72#12,6:582\n78#12:616\n82#12:667\n76#12,2:796\n78#12:826\n82#12:831\n76#13:668\n66#14,6:706\n72#14:740\n76#14:745\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog\n*L\n81#1:509,11\n234#1:520\n256#1:536\n257#1:537\n261#1:538\n288#1:653\n289#1:654\n298#1:655\n304#1:661\n306#1:662\n373#1:669\n381#1:705\n387#1:746\n391#1:747\n405#1:783\n409#1:784\n417#1:790\n251#1:521,4\n251#1:529,2\n251#1:535\n251#1:525\n253#1:556,8\n253#1:570,3\n253#1:577,3\n280#1:599,8\n280#1:613,3\n281#1:635,8\n281#1:649,3\n281#1:656,3\n280#1:663,3\n370#1:687,8\n370#1:701,3\n381#1:723,8\n381#1:737,3\n381#1:741,3\n394#1:765,8\n394#1:779,3\n394#1:785,3\n370#1:791,3\n424#1:809,8\n424#1:823,3\n424#1:827,3\n251#1:526,3\n251#1:532,3\n251#1:531\n253#1:539,6\n253#1:573\n253#1:581\n281#1:617,7\n281#1:652\n281#1:660\n370#1:670,6\n370#1:704\n394#1:748,6\n394#1:782\n394#1:789\n370#1:795\n253#1:545,11\n253#1:580\n280#1:588,11\n281#1:624,11\n281#1:659\n280#1:666\n370#1:676,11\n381#1:712,11\n381#1:744\n394#1:754,11\n394#1:788\n370#1:794\n424#1:798,11\n424#1:830\n253#1:564,6\n280#1:607,6\n281#1:643,6\n370#1:695,6\n381#1:731,6\n394#1:773,6\n424#1:817,6\n264#1:574,3\n280#1:582,6\n280#1:616\n280#1:667\n424#1:796,2\n424#1:826\n424#1:831\n369#1:668\n381#1:706,6\n381#1:740\n381#1:745\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o f54639OooO00o = new o();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f54641OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54642OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54643OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, Integer num, int i) {
            super(2);
            this.f54642OooO0o0 = boxScope;
            this.f54641OooO0o = num;
            this.f54643OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54643OooO0oO | 1);
            BoxScope boxScope = this.f54642OooO0o0;
            Integer num2 = this.f54641OooO0o;
            o.this.OooO0OO(boxScope, num2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54645OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f54646OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, int i) {
            super(2);
            this.f54646OooO0o0 = z;
            this.f54645OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54645OooO0o | 1);
            o.this.OooO00o(this.f54646OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> f54647OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54648OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54649OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54650OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> oooOOOO, MutableState<Boolean> mutableState, boolean z, int i) {
            super(1);
            this.f54647OooO0Oo = oooOOOO;
            this.f54649OooO0o0 = mutableState;
            this.f54648OooO0o = z;
            this.f54650OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1490560464, true, new oO00000(this.f54649OooO0o0, this.f54648OooO0o, this.f54650OooO0oO)), 3, null);
            LazyListScope.CC.OooO(LazyColumn, null, null, o0O000Oo.f54729OooO00o, 3, null);
            p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> oooOOOO = this.f54647OooO0Oo;
            LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1805660281, true, new oO00000o(oooOOOO)), 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54651OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> f54653OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f54654OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LazyListState f54655OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54656OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> oooOOOO, LazyListState lazyListState, MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f54654OooO0o0 = z;
            this.f54653OooO0o = oooOOOO;
            this.f54655OooO0oO = lazyListState;
            this.f54656OooO0oo = mutableState;
            this.f54651OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o.this.OooO0O0(this.f54654OooO0o0, this.f54653OooO0o, this.f54655OooO0oO, this.f54656OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54651OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f54658OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54659OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54660OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, Integer num, int i) {
            super(2);
            this.f54659OooO0o0 = boxScope;
            this.f54658OooO0o = num;
            this.f54660OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54660OooO0oO | 1);
            BoxScope boxScope = this.f54659OooO0o0;
            Integer num2 = this.f54658OooO0o;
            o.this.OooO0OO(boxScope, num2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54661OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f54663OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RowScope f54664OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f54665OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f54666OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RowScope rowScope, String str, boolean z, Modifier modifier, int i) {
            super(2);
            this.f54664OooO0o0 = rowScope;
            this.f54663OooO0o = str;
            this.f54665OooO0oO = z;
            this.f54666OooO0oo = modifier;
            this.f54661OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o.this.OooO0Oo(this.f54664OooO0o0, this.f54663OooO0o, this.f54665OooO0oO, this.f54666OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54661OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f54667OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54668OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f54669OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(CoroutineScope coroutineScope, o000000 o000000Var, int i) {
            super(0);
            this.f54667OooO0Oo = coroutineScope;
            this.f54669OooO0o0 = o000000Var;
            this.f54668OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f54667OooO0Oo, null, null, new oO0000o0(this.f54669OooO0o0, this.f54668OooO0o, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f54670OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankModel.RankDataDTO f54671OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Activity activity, LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO) {
            super(0);
            this.f54670OooO0Oo = activity;
            this.f54671OooO0o0 = rankDataDTO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Integer userId;
            Activity activity = this.f54670OooO0Oo;
            if (activity != null) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO = this.f54671OooO0o0;
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, activity, (rankDataDTO == null || (userId = rankDataDTO.getUserId()) == null) ? null : o0OoOo0.OooOO0o(userId, ""), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54672OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f54674OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f54675OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<String> f54676OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f54677OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54678OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ColumnScope columnScope, Modifier modifier, List<String> list, o000000 o000000Var, int i, int i2) {
            super(2);
            this.f54675OooO0o0 = columnScope;
            this.f54674OooO0o = modifier;
            this.f54676OooO0oO = list;
            this.f54677OooO0oo = o000000Var;
            this.f54672OooO = i;
            this.f54678OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o.this.OooO0o0(this.f54675OooO0o0, this.f54674OooO0o, this.f54676OooO0oO, this.f54677OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54672OooO | 1), this.f54678OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54680OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankModel.RankDataDTO f54681OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO, int i) {
            super(2);
            this.f54681OooO0o0 = rankDataDTO;
            this.f54680OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54680OooO0o | 1);
            o.this.OooO0o(this.f54681OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomMemberUserRankDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog$onDialog$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,508:1\n76#2:509\n154#3:510\n154#3:512\n154#3:555\n154#3:556\n154#3:557\n154#3:558\n154#3:566\n154#3:567\n154#3:618\n88#4:511\n66#5,6:513\n72#5:547\n76#5:628\n78#6,11:519\n78#6,11:582\n91#6:622\n91#6:627\n456#7,8:530\n464#7,3:544\n25#7:548\n25#7:559\n36#7:568\n456#7,8:593\n464#7,3:607\n36#7:611\n467#7,3:619\n467#7,3:624\n4144#8,6:538\n4144#8,6:601\n1097#9,6:549\n1097#9,6:560\n1097#9,6:569\n1097#9,6:612\n71#10,7:575\n78#10:610\n82#10:623\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberUserRankDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomMemberUserRankDialog$onDialog$2\n*L\n95#1:509\n99#1:510\n100#1:512\n115#1:555\n120#1:556\n129#1:557\n130#1:558\n147#1:566\n148#1:567\n171#1:618\n99#1:511\n96#1:513,6\n96#1:547\n96#1:628\n96#1:519,11\n154#1:582,11\n154#1:622\n96#1:627\n96#1:530,8\n96#1:544,3\n104#1:548\n138#1:559\n149#1:568\n154#1:593,8\n154#1:607,3\n162#1:611\n154#1:619,3\n96#1:624,3\n96#1:538,6\n154#1:601,6\n104#1:549,6\n138#1:560,6\n149#1:569,6\n162#1:612,6\n154#1:575,7\n154#1:610\n154#1:623\n*E\n"})
    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f54682OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM) {
            super(2);
            this.f54682OooO0Oo = liveRoomMemberUserRankVM;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(100612607, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.onDialog.<anonymous> (LiveRoomMemberUserRankDialog.kt:90)");
                }
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new oO000(null), composer2, 70);
                Configuration configuration = (Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                Modifier modifierClip = ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(Dp.m3775constructorimpl(configuration.screenHeightDp) * 0.72f)), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 0.0f, 12, null));
                Color.Companion companion2 = Color.INSTANCE;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierClip, companion2.m1718getWhite0d7_KjU(), null, 2, null);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objRememberedValue == companion5.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                float f2 = 52;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_dialog_member_user_rank, composer2, 0), (String) null, BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2)), companion2.m1718getWhite0d7_KjU(), null, 2, null), companion3.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 27704, 96);
                composer2.startReplaceableGroup(-821439624);
                boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                o oVar = o.f54639OooO00o;
                if (!zBooleanValue) {
                    o.OooO0oo(oVar, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 13, null), composer2, 54, 0);
                }
                composer2.endReplaceableGroup();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icv_arrow_back, composer2, 0);
                long j = o0OOo000.f48375oooo00o;
                Modifier modifierAlign = boxScopeInstance.align(companion, companion3.getTopStart());
                float f3 = 16;
                IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0Oo(com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(modifierAlign, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, oO000O0.f54921OooO0Oo, 253), composer2, 0), j, composer2, 56, 0);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion5.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                o.OooO0oO(oVar, mutableState2, composer2, 54);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0Oo0oo.icv_doubt, composer2, 0);
                long j2 = o0OOo000.f48268o000o0O0;
                Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion3.getTopEnd()), 0.0f, Dp.m3775constructorimpl(18), Dp.m3775constructorimpl(f3), 0.0f, 9, null), Dp.m3775constructorimpl(20));
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(mutableState2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == companion5.getEmpty()) {
                    objRememberedValue3 = new oO000O0O(mutableState2);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                IconKt.m1119Iconww6aTOc(painterPainterResource2, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierM525size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253), j2, composer2, 56, 0);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion3, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(p562o0oOo000.o000000.live_room_member_rank_weekly_title, composer2, 0), StringResources_androidKt.stringResource(p562o0oOo000.o000000.live_room_member_rank_general_title, composer2, 0)});
                o000000 o000000VarOooO00o = o00000.OooO00o(0, composer2, 0, 1);
                Integer numValueOf = Integer.valueOf(o000000VarOooO00o.OooO0oO());
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(o000000VarOooO00o);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion5.getEmpty()) {
                    objRememberedValue4 = new oO0Ooooo(o000000VarOooO00o, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                oVar.OooO0o0(columnScopeInstance, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(12), 0.0f, Dp.m3775constructorimpl(8), 5, null), listListOf, o000000VarOooO00o, composer2, 24630, 0);
                Pager.OooO00o(listListOf.size(), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), o000000VarOooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composer2, 1541210560, true, new oO000OOo(this.f54682OooO0Oo, mutableState)), composer2, 0, 6, 1016);
                if (com.facebook.appevents.OooOOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f54683OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM) {
            super(0);
            this.f54683OooO0Oo = liveRoomMemberUserRankVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54683OooO0Oo.clear();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54685OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(int i) {
            super(2);
            this.f54685OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54685OooO0o0 | 1);
            o.this.OooO(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0oO(o oVar, MutableState mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        oVar.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-910584448);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-910584448, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.RulesDialog (LiveRoomMemberUserRankDialog.kt:446)");
            }
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, StringResources_androidKt.stringResource(p562o0oOo000.o000000.Rules, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(p562o0oOo000.o000000.live_room_member_user_rank_rules, composerStartRestartGroup, 0), null, true, false, null, null, null, false, null, false, null, null, false, false, null, null, null, null, composer2, (i2 & 14) | 24576, 0, 1048552);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0000O(oVar, mutableState, i));
    }

    public static final void OooO0oo(o oVar, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        oVar.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-924613118);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-924613118, i3, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.TopBgBottomCompose (LiveRoomMemberUserRankDialog.kt:232)");
            }
            float fM3775constructorimpl = Dp.m3775constructorimpl((float) 82.2806429572469d);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_dialog_member_user_rank, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier), 0.0f, 1, null), fM3775constructorimpl), Alignment.INSTANCE.getBottomCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 27704, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0000Oo(oVar, modifier, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1817597327);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1817597327, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.onDialog (LiveRoomMemberUserRankDialog.kt:79)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(LiveRoomMemberUserRankVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = (LiveRoomMemberUserRankVM) viewModel;
            o0000O0.OooO00o(com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48528OooOO0O, false, false, null, new OooOo00(liveRoomMemberUserRankVM), 80, o000000O.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100612607, true, new OooOo(liveRoomMemberUserRankVM)), composerStartRestartGroup, 100859904, 142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(boolean z, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1930767137);
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
                ComposerKt.traceEventStart(-1930767137, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.MemberRankHeader (LiveRoomMemberUserRankDialog.kt:278)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
            float f = 24;
            float f2 = 16;
            ImageKt.Image(PainterResources_androidKt.painterResource(z ? o0O0O00.ic_member_rank_weekly_list : o0O0O00.ic_member_rank_general_list, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(14), Dp.m3775constructorimpl(12)), Dp.m3775constructorimpl(60)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(918450040);
                i3 = p562o0oOo000.o000000.live_room_member_rank_weekly_description;
            } else {
                composerStartRestartGroup.startReplaceableGroup(918450111);
                i3 = p562o0oOo000.o000000.live_room_member_rank_general_description;
            }
            String strStringResource = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource, PaddingKt.m482paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), ColorKt.Color(4287839499L), oOO0O00O.OooO0OO(12, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 384, 0, 65520);
            o0ooOOo.OooO00o(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null), ColorKt.Color(4293585642L), null, 2, null), composer2, 6, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(z, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(boolean z, @NotNull p107o000ooO0.OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> lazyPagingItems, @NotNull LazyListState lazyListState, @NotNull MutableState<Boolean> topBgBottomVisibleInHeadView, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "lazyPagingItems");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(topBgBottomVisibleInHeadView, "topBgBottomVisibleInHeadView");
        Composer composerStartRestartGroup = composer.startRestartGroup(-191834212);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(topBgBottomVisibleInHeadView) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-191834212, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.MemberRankList (LiveRoomMemberUserRankDialog.kt:320)");
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), lazyListState, null, false, null, null, null, false, new OooO0O0(lazyPagingItems, topBgBottomVisibleInHeadView, z, i2), composerStartRestartGroup, ((i2 >> 3) & 112) | 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(z, lazyPagingItems, lazyListState, topBgBottomVisibleInHeadView, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull BoxScope boxScope, @Nullable Integer num, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-144786799);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-144786799, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.RoomMemberUserRankNumber (LiveRoomMemberUserRankDialog.kt:459)");
            }
            if ((num != null ? num.intValue() : -1) < 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, num, i));
                return;
            }
            Intrinsics.checkNotNull(num);
            if (num.intValue() <= 3) {
                composerStartRestartGroup.startReplaceableGroup(-1099618665);
                oO000o00.OooO00o(boxScope, num.intValue(), composerStartRestartGroup, (i2 & 112) | (i2 & 14));
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1099618606);
                oO000Oo.f53142OooO00o.OooO0O0(boxScope, num.toString(), composerStartRestartGroup, (i2 & 14) | 384);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(boxScope, num, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(RowScope rowScope, String str, boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(262594587);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(262594587, i2, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.Tab (LiveRoomMemberUserRankDialog.kt:422)");
            }
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, ClipKt.clip(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), 1.0f, false, 2, null);
            Color.Companion companion = Color.INSTANCE;
            Modifier modifierThen = BackgroundKt.m171backgroundbw27NRU$default(modifierOooO00o, z ? companion.m1718getWhite0d7_KjU() : companion.m1716getTransparent0d7_KjU(), null, 2, null).then(modifier);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(str, (Modifier) null, ColorKt.Color(4287839499L), oOO0O00O.OooO0OO(14, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, (i2 >> 3) & 14, 0, 65010);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(rowScope, str, z, modifier, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(@Nullable LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO, @Nullable Composer composer, int i) {
        String nickName;
        Long friendShip;
        Boolean isTopRank;
        Composer composerStartRestartGroup = composer.startRestartGroup(330047797);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(330047797, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.UserRankListItem (LiveRoomMemberUserRankDialog.kt:367)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Activity activity = objConsume instanceof Activity ? (Activity) objConsume : null;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(60)), false, false, 0L, false, null, null, null, new OooOOO(activity, rankDataDTO), 255);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(56));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM530width3ABfNKs);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        f54639OooO00o.OooO0OO(BoxScopeInstance.INSTANCE, rankDataDTO != null ? rankDataDTO.getRank() : null, composerStartRestartGroup, 390);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        oO0OO.OooO00o.f59939OooO00o.OooOO0(rankDataDTO != null ? rankDataDTO.getHeadUrl() : null, ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        if (rankDataDTO == null || (nickName = rankDataDTO.getNickName()) == null) {
            nickName = "";
        }
        TextKt.m1261Text4IGK_g(nickName, rowScopeInstance.weight(companion, 1.0f, false), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, oOO0O00O.OooO0OO(16, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3120, 120816);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        oO000O0O.f53112OooO00o.OooO00o(rankDataDTO != null ? rankDataDTO.getMemberLv() : null, rankDataDTO != null ? rankDataDTO.getBadgeUrl() : null, 0L, (rankDataDTO == null || (isTopRank = rankDataDTO.getIsTopRank()) == null) ? false : isTopRank.booleanValue(), SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(20)), composerStartRestartGroup, 221184, 4);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        String strOooO0o0 = o0O0O0Oo.OooO0o0((rankDataDTO == null || (friendShip = rankDataDTO.getFriendShip()) == null) ? 0L : friendShip.longValue());
        long j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        long jOooO0OO = oOO0O00O.OooO0OO(16, composerStartRestartGroup);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(26), 0.0f, Dp.m3775constructorimpl(16), 0.0f, 10, null);
        Intrinsics.checkNotNull(strOooO0o0);
        TextKt.m1261Text4IGK_g(strOooO0o0, modifierM482paddingqDBjuR0$default, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rankDataDTO, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(@NotNull ColumnScope columnScope, @Nullable Modifier modifier, @NotNull List<String> pages, @NotNull o000000 pagerState, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-643790358);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-643790358, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.TopTabContainer (LiveRoomMemberUserRankDialog.kt:249)");
        }
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == Composer.INSTANCE.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(Modifier.INSTANCE.then(modifier2), Dp.m3775constructorimpl(234)), Dp.m3775constructorimpl(32));
        Alignment.Companion companion = Alignment.INSTANCE;
        Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(columnScope.align(modifierM511height3ABfNKs, companion.getCenterHorizontally()), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294960323L), null, 2, null), Dp.m3775constructorimpl(2));
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1273000959);
        int i3 = 0;
        for (Object obj : pages) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            f54639OooO00o.OooO0Oo(rowScopeInstance, (String) obj, pagerState.OooO0oO() == i3, com.code.android.util.o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooOO0O(coroutineScope, pagerState, i3), 253), composerStartRestartGroup, 24582);
            i3 = i4;
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(columnScope, modifier2, pages, pagerState, i, i2));
    }
}
