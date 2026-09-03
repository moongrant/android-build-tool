package com.yalla.yalla.ui.screen.user;

import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.o0OO00O;
import com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.oOO00O;
import p207o00o0oO0.o000O0Oo;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o00OOOOo;
import p516o0o0O00o.o0oOO;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p543o0o0Ooo0.oOO0OO0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0oOo0O0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010#\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/RoomThemeCustomScreen;", "Lo0o0OOo0/o000O0;", "", "isSelected", "", "selectView", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "item", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bottomView", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/model/CustomizeThemeModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "data", "Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;", "vm", "Lo0oOoOo/o0oOo0O0;", "loadingVM", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "onSetTheme", "onRenewals", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "ThemeDialog", "(Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "renewalsListener", "ThemeItem", "(Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;Lcom/yalla/yalla/model/CustomizeThemeModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeCustomScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeCustomScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,518:1\n76#2:519\n76#2:653\n76#2:654\n81#3,11:520\n81#3,11:531\n486#4,4:542\n490#4,2:550\n494#4:556\n25#5:546\n456#5,8:574\n464#5,3:588\n456#5,8:611\n464#5,3:625\n467#5,3:643\n467#5,3:648\n36#5:656\n456#5,8:680\n464#5,3:694\n36#5:699\n456#5,8:724\n464#5,3:738\n467#5,3:745\n467#5,3:750\n456#5,8:773\n464#5,3:787\n467#5,3:793\n456#5,8:817\n464#5,3:831\n456#5,8:853\n464#5,3:867\n36#5:877\n456#5,8:901\n464#5,3:915\n467#5,3:919\n467#5,3:924\n467#5,3:929\n1097#6,3:547\n1100#6,3:553\n1097#6,6:657\n1097#6,6:700\n1097#6,6:878\n486#7:552\n66#8,6:557\n72#8:591\n66#8,6:594\n72#8:628\n76#8:647\n76#8:652\n66#8,6:663\n72#8:697\n66#8,6:707\n72#8:741\n76#8:749\n76#8:754\n66#8,6:756\n72#8:790\n76#8:797\n66#8,6:800\n72#8:834\n66#8,6:884\n72#8:918\n76#8:923\n76#8:933\n78#9,11:563\n78#9,11:600\n91#9:646\n91#9:651\n78#9,11:669\n78#9,11:713\n91#9:748\n91#9:753\n78#9,11:762\n91#9:796\n78#9,11:806\n78#9,11:842\n78#9,11:890\n91#9:922\n91#9:927\n91#9:932\n4144#10,6:582\n4144#10,6:619\n4144#10,6:688\n4144#10,6:732\n4144#10,6:781\n4144#10,6:825\n4144#10,6:861\n4144#10,6:909\n154#11:592\n154#11:593\n154#11:629\n154#11,11:630\n154#11:641\n154#11:642\n154#11:655\n154#11:698\n154#11:706\n164#11:742\n154#11:743\n164#11:744\n154#11:755\n154#11:791\n154#11:792\n154#11:798\n154#11:799\n154#11:835\n154#11:871\n154#11:872\n154#11:873\n154#11:874\n154#11:875\n164#11:876\n72#12,6:836\n78#12:870\n82#12:928\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeCustomScreen\n*L\n95#1:519\n183#1:653\n184#1:654\n96#1:520,11\n97#1:531,11\n99#1:542,4\n99#1:550,2\n99#1:556\n99#1:546\n103#1:574,8\n103#1:588,3\n145#1:611,8\n145#1:625,3\n145#1:643,3\n103#1:648,3\n258#1:656\n255#1:680,8\n255#1:694,3\n276#1:699\n285#1:724,8\n285#1:738,3\n285#1:745,3\n255#1:750,3\n319#1:773,8\n319#1:787,3\n319#1:793,3\n342#1:817,8\n342#1:831,3\n358#1:853,8\n358#1:867,3\n405#1:877\n397#1:901,8\n397#1:915,3\n397#1:919,3\n358#1:924,3\n342#1:929,3\n99#1:547,3\n99#1:553,3\n258#1:657,6\n276#1:700,6\n405#1:878,6\n99#1:552\n103#1:557,6\n103#1:591\n145#1:594,6\n145#1:628\n145#1:647\n103#1:652\n255#1:663,6\n255#1:697\n285#1:707,6\n285#1:741\n285#1:749\n255#1:754\n319#1:756,6\n319#1:790\n319#1:797\n342#1:800,6\n342#1:834\n397#1:884,6\n397#1:918\n397#1:923\n342#1:933\n103#1:563,11\n145#1:600,11\n145#1:646\n103#1:651\n255#1:669,11\n285#1:713,11\n285#1:748\n255#1:753\n319#1:762,11\n319#1:796\n342#1:806,11\n358#1:842,11\n397#1:890,11\n397#1:922\n358#1:927\n342#1:932\n103#1:582,6\n145#1:619,6\n255#1:688,6\n285#1:732,6\n319#1:781,6\n342#1:825,6\n358#1:861,6\n397#1:909,6\n114#1:592\n148#1:593\n158#1:629\n160#1:630,11\n162#1:641\n164#1:642\n257#1:655\n273#1:698\n288#1:706\n295#1:742\n296#1:743\n307#1:744\n322#1:755\n330#1:791\n331#1:792\n345#1:798\n347#1:799\n354#1:835\n373#1:871\n391#1:872\n399#1:873\n401#1:874\n402#1:875\n404#1:876\n358#1:836,6\n358#1:870\n358#1:928\n*E\n"})
public final class RoomThemeCustomScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final RoomThemeCustomScreen INSTANCE = new RoomThemeCustomScreen();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29459OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Context context) {
            super(0);
            this.f29459OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f26673Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f29459OooO0Oo, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29461OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29462OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29462OooO0o0 = columnScope;
            this.f29461OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29461OooO0o | 1);
            RoomThemeCustomScreen.this.Content(this.f29462OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomThemeCustomScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeCustomScreen$MainContent$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,518:1\n154#2:519\n154#2:520\n154#2:521\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeCustomScreen$MainContent$2$1\n*L\n118#1:519\n119#1:520\n120#1:521\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<CustomizeThemeModel> f29463OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f29464OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29465OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29466OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f29467OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p107o000ooO0.OooOOOO<CustomizeThemeModel> oooOOOO, RoomThemeVM roomThemeVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
            super(3);
            this.f29463OooO0Oo = oooOOOO;
            this.f29465OooO0o0 = roomThemeVM;
            this.f29464OooO0o = o0ooo0o1;
            this.f29466OooO0oO = lifecycleOwner;
            this.f29467OooO0oo = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1019547360, iIntValue, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.MainContent.<anonymous>.<anonymous> (RoomThemeCustomScreen.kt:115)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                float f = 10;
                PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f));
                Arrangement arrangement = Arrangement.INSTANCE;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM472PaddingValuesYgX7TsA, false, arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), null, false, new com.yalla.yalla.ui.screen.user.o000oOoO(this.f29463OooO0Oo, this.f29465OooO0o0, this.f29464OooO0o, this.f29466OooO0oO, this.f29467OooO0oo), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29468OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomThemeVM roomThemeVM) {
            super(0);
            this.f29468OooO0Oo = roomThemeVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (o0O00oO0.f47987Ooooo00.getValue() == null) {
                this.f29468OooO0Oo.isShowDialogCreateRoom().setValue(Boolean.TRUE);
            } else {
                o0oo0000.OooO00o.OooO0O0("105037");
                o00O00.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, null, false, null, 14);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29470OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f29470OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29470OooO0o0 | 1);
            RoomThemeCustomScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f29471OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29472OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29473OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f29474OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomThemeVM roomThemeVM, CustomizeThemeModel customizeThemeModel, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f29472OooO0Oo = roomThemeVM;
            this.f29474OooO0o0 = customizeThemeModel;
            this.f29473OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CustomizeThemeModel customizeThemeModel = this.f29474OooO0o0;
            this.f29472OooO0Oo.renewCustomTheme(customizeThemeModel.getId(), customizeThemeModel.getThemeType()).observe(this.f29473OooO0o, new p384o0OOoo0O.o000oOoO(com.yalla.yalla.ui.screen.user.o0OoOo0.f29648OooO0Oo, null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29475OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Context context) {
            super(0);
            this.f29475OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = CreateRoomActivity.f26050OooOoo0;
            CreateRoomActivity.OooO00o.OooO00o(this.f29475OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f29476OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f29477OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29478OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Function0<Unit> function0) {
            super(0);
            this.f29478OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f29478OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29480OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29481OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomThemeVM roomThemeVM, int i) {
            super(2);
            this.f29481OooO0o0 = roomThemeVM;
            this.f29480OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29480OooO0o | 1);
            RoomThemeCustomScreen.this.ThemeDialog(this.f29481OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29482OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(Function0<Unit> function0) {
            super(0);
            this.f29482OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f29482OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f29483OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = o0Oo0oo.icon_room_theme_placeholder_big;
            it.OooO0Oo(i);
            it.OooO0OO(i);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29484OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f29486OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29487OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f29488OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29489OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f29490OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f29491OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(RoomThemeVM roomThemeVM, CustomizeThemeModel customizeThemeModel, Modifier modifier, Function0<Unit> function0, Function0<Unit> function1, int i, int i2) {
            super(2);
            this.f29487OooO0o0 = roomThemeVM;
            this.f29486OooO0o = customizeThemeModel;
            this.f29488OooO0oO = modifier;
            this.f29489OooO0oo = function0;
            this.f29484OooO = function1;
            this.f29490OooOO0 = i;
            this.f29491OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomThemeCustomScreen.this.ThemeItem(this.f29487OooO0o0, this.f29486OooO0o, this.f29488OooO0oO, this.f29489OooO0oo, this.f29484OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29490OooOO0 | 1), this.f29491OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f29492OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f29494OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29495OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29496OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29497OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(BoxScope boxScope, CustomizeThemeModel customizeThemeModel, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f29495OooO0o0 = boxScope;
            this.f29494OooO0o = customizeThemeModel;
            this.f29496OooO0oO = function0;
            this.f29497OooO0oo = i;
            this.f29492OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomThemeCustomScreen.this.bottomView(this.f29495OooO0o0, this.f29494OooO0o, this.f29496OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29497OooO0oo | 1), this.f29492OooO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen$onSetTheme$1", f = "RoomThemeCustomScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29498OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f29499OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f29500OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29501OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ CustomizeThemeModel f29502OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(CustomizeThemeModel customizeThemeModel) {
                super(1);
                this.f29502OooO0Oo = customizeThemeModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                CustomizeThemeModel customizeThemeModel = this.f29502OooO0Oo;
                customizeThemeModel.setSelected(true);
                o0000O00.OooO0O0("onSetRoomThemeMine wrm isSuccess \nmodel = ".concat(p187o00o00o0.OooO.OooO00o(customizeThemeModel)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(RoomThemeVM roomThemeVM, CustomizeThemeModel customizeThemeModel, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f29498OooO0Oo = roomThemeVM;
            this.f29500OooO0o0 = customizeThemeModel;
            this.f29499OooO0o = o0ooo0o1;
            this.f29501OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Oo0(this.f29498OooO0Oo, this.f29500OooO0o0, this.f29499OooO0o, this.f29501OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CustomizeThemeModel customizeThemeModel = this.f29500OooO0o0;
            o00OO0O0<ApiResult<String>> roomTheme = this.f29498OooO0Oo.setRoomTheme(customizeThemeModel.getId(), false);
            o0oOO.OooO0O0(roomTheme, this.f29499OooO0o, false, 6);
            p384o0OOoo0O.o00O0O.OooO0Oo(roomTheme, this.f29501OooO0oO, false, null, null, new OooO00o(customizeThemeModel), 14);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29504OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f29505OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(boolean z, int i) {
            super(2);
            this.f29505OooO0o0 = z;
            this.f29504OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29504OooO0o | 1);
            RoomThemeCustomScreen.this.selectView(this.f29505OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29506OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(Function0<Unit> function0) {
            super(0);
            this.f29506OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f29506OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private RoomThemeCustomScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$0(p107o000ooO0.OooOOOO lazyPagingItems, boolean z) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        lazyPagingItems.OooO0Oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void bottomView(BoxScope boxScope, CustomizeThemeModel customizeThemeModel, Function0<Unit> function0, Composer composer, int i, int i2) {
        BoxScopeInstance boxScopeInstance;
        ComposeUiNode.Companion companion;
        Composer composer2;
        Composer composer3;
        String strStringResource;
        Composer composer4;
        Function0<Unit> function1;
        String strStringResource2;
        Composer composerStartRestartGroup = composer.startRestartGroup(750959266);
        Function0<Unit> function2 = (i2 & 2) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(750959266, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.bottomView (RoomThemeCustomScreen.kt:339)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(140));
        Alignment.Companion companion3 = Alignment.INSTANCE;
        float f = 8;
        Modifier modifierClip = ClipKt.clip(boxScope.align(modifierM511height3ABfNKs, companion3.getBottomCenter()), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
        BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null)), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48134OooO00o), Color.m1671boximpl(o0OOo000.f48167Oooo00O)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
        Modifier modifierAlign = boxScopeInstance2.align(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), companion3.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion3, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-249387768);
        if (customizeThemeModel.getIsExpired()) {
            boxScopeInstance = boxScopeInstance2;
            companion = companion4;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.room_theme_customize_invalid_days, composerStartRestartGroup, 0), String.valueOf(customizeThemeModel.getInvalidDay())), SizeKt.fillMaxWidth$default(PaddingKt.m479paddingVpY3zN4(companion2, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(4)), 0.0f, 1, null), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
        } else {
            boxScopeInstance = boxScopeInstance2;
            companion = companion4;
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        if (customizeThemeModel.isStateFrozen()) {
            composer3 = composer2;
            composer3.startReplaceableGroup(-249387037);
            strStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.days_remained, composer3, 0), String.valueOf(customizeThemeModel.getFroznday()));
            composer3.endReplaceableGroup();
        } else {
            composer3 = composer2;
            if (customizeThemeModel.isStateApproved()) {
                composer3.startReplaceableGroup(-249386906);
                strStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.days_remained, composer3, 0), String.valueOf(customizeThemeModel.getDayNum()));
                composer3.endReplaceableGroup();
            } else if (customizeThemeModel.isStateUnderReview()) {
                composer3.startReplaceableGroup(-249386812);
                strStringResource = StringResources_androidKt.stringResource(o000000.room_theme_customize_under_review, composer3, 0);
                composer3.endReplaceableGroup();
            } else {
                composer3.startReplaceableGroup(-249386714);
                strStringResource = StringResources_androidKt.stringResource(o000000.room_theme_customize_under_review, composer3, 0);
                composer3.endReplaceableGroup();
            }
        }
        long j = o0OOo000.f48291o00O00;
        long sp = TextUnitKt.getSp(11);
        TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
        float f2 = 4;
        Composer composer5 = composer3;
        TextKt.m1261Text4IGK_g(strStringResource, SizeKt.fillMaxWidth$default(PaddingKt.m479paddingVpY3zN4(companion2, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2)), 0.0f, 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3120, 3120, 120816);
        composer5.startReplaceableGroup(940398551);
        if (customizeThemeModel.isStateUnderReview()) {
            composer4 = composer5;
            function1 = function2;
        } else {
            Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(BackgroundKt.m170backgroundbw27NRU(o00O0O0.OooO00o(6, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m479paddingVpY3zN4(companion2, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2)), 0.0f, 1, null), Dp.m3775constructorimpl(32))), o0OOo000.f48369oo00o, RectangleShapeKt.getRectangleShape()), Dp.m3775constructorimpl((float) 7.5d));
            composer5.startReplaceableGroup(1157296644);
            Function0<Unit> function3 = function2;
            boolean zChanged = composer5.changed(function3);
            Object objRememberedValue = composer5.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0OoOo0(function3);
                composer5.updateRememberedValue(objRememberedValue);
            }
            composer5.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM478padding3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255);
            composer5.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composer5, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor3);
            } else {
                composer5.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer5);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer5)), composer5, 0);
            composer5.startReplaceableGroup(2058660585);
            if (customizeThemeModel.getIsFrozen()) {
                composer5.startReplaceableGroup(-323528849);
                strStringResource2 = StringResources_androidKt.stringResource(o000000.room_theme_customize_frozen_unfreeze, composer5, 0);
                composer5.endReplaceableGroup();
            } else if (customizeThemeModel.getIsExpired()) {
                composer5.startReplaceableGroup(-323528737);
                strStringResource2 = StringResources_androidKt.stringResource(o000000.room_theme_customize_purchase_again, composer5, 0);
                composer5.endReplaceableGroup();
            } else {
                composer5.startReplaceableGroup(-323528636);
                strStringResource2 = StringResources_androidKt.stringResource(o000000.room_theme_customize_renewals, composer5, 0);
                composer5.endReplaceableGroup();
            }
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            composer4 = composer5;
            function1 = function3;
            TextKt.m1261Text4IGK_g(strStringResource2, boxScopeInstance3.align(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), companion3.getCenter()), o0OOo000.f48300o00O00oO, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, companion5.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 199680, 3120, 120272);
            o000O.o0ooOOo.OooO00o(composer4);
        }
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        composer4.endNode();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        composer4.endNode();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(boxScope, customizeThemeModel, function1, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRenewals(CustomizeThemeModel data, RoomThemeVM vm) {
        o0000O00.OooO0O0("onSetRoomThemeMine wrm \nmodel = ".concat(p187o00o00o0.OooO.OooO00o(data)));
        if (data.getIsExpired()) {
            o00O00.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_ID, Long.valueOf(data.getId())), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_PIC_URL, data.getPic()), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_TYPE, Integer.valueOf(data.getThemeType()))), false, null, 12);
        } else {
            vm.getSelectCustomizeThemeModel().setValue(data);
            vm.isShowDialogForRenewals().setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetTheme(CustomizeThemeModel data, RoomThemeVM vm, o0oOo0O0 loadingVM, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        o0000O00.OooO0O0("onSetRoomThemeMine wrm \nmodel = ".concat(p187o00o00o0.OooO.OooO00o(data)));
        boolean z = true;
        if (o0O00oO0.f47987Ooooo00.getValue() == null) {
            vm.isShowDialogCreateRoom().setValue(Boolean.TRUE);
            return;
        }
        if (data.getIsFrozen()) {
            vm.getSelectCustomizeThemeModel().setValue(data);
            vm.isShowDialogSetThemeFrozen().setValue(Boolean.TRUE);
            return;
        }
        if (data.isStateUnderReview()) {
            String strOooO0OO = o0000.OooO0OO(o000000.room_theme_customize_toast_under_review);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (vm.getCurrentThemeShopId().getValue().longValue() != data.getId() && !data.getIsSelected()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o00Oo0(vm, data, loadingVM, lifecycleOwner, null), 3, null);
            return;
        }
        String strOooO0OO2 = o0000.OooO0OO(o000000.item_in_used);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o2.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void selectView(boolean z, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1254371197);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1254371197, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.selectView (RoomThemeCustomScreen.kt:316)");
            }
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO00o = o00O0O0.OooO00o(8, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                int i3 = o0OOo000.f48347o00OOooO;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierOooO00o, o0OOo000.f48141OooO0oo, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.recom_checked, composerStartRestartGroup, 0), (String) null, BoxScopeInstance.INSTANCE.align(ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(92), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)), RoundedCornerShapeKt.getCircleShape()), companion2.getTopCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(z, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-282009535);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-282009535, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.Content (RoomThemeCustomScreen.kt:88)");
            }
            MainContent(composerStartRestartGroup, (i2 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(@Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        RoomThemeCustomScreen roomThemeCustomScreen;
        Composer composerStartRestartGroup = composer.startRestartGroup(-594926230);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            roomThemeCustomScreen = this;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-594926230, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.MainContent (RoomThemeCustomScreen.kt:93)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomThemeVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            RoomThemeVM roomThemeVM = (RoomThemeVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel2;
            p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(roomThemeVM.getCustomizeRoomTheme().f38501OooO0oo, composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Observable<Object> observable = LiveEventBus.get("ROOM_THEME_UPDATE");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new o0OO00O(oooOOOOOooO00o, 1), composerStartRestartGroup, 72);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            int i3 = i2;
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
            float f = 56;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 7, null);
            ComposableLambda composableLambda = oOO0OO0O.f55504OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1019547360, true, new OooO0O0(oooOOOOOooO00o, roomThemeVM, o0ooo0o1, lifecycleOwner, coroutineScope));
            int i4 = p107o000ooO0.OooOOOO.f35803OooO0o0;
            oOO00O.OooO0o(oooOOOOOooO00o, modifierM482paddingqDBjuR0$default, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 199736, 20);
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f)), companion2.getBottomCenter()), o0OOo000.f48135OooO0O0, null, 2, null);
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
            o00OOOOo.OooO00o(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, 0L, composerStartRestartGroup, 0, 6);
            String strStringResource = StringResources_androidKt.stringResource(o000000.room_theme_customize_create, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(16);
            TextButtonStyle textButtonStyle = TextButtonStyle.Green;
            float f2 = 18;
            RoundedCornerShape roundedCornerShapeM729RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2));
            float f3 = 40;
            composer2 = composerStartRestartGroup;
            o00O0OO0.OooO00o(strStringResource, sp, null, textButtonStyle, null, null, roundedCornerShapeM729RoundedCornerShape0680j_4, 0.0f, null, true, false, 0L, false, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f2, boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl((float) 9.0d), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl((float) 9.5d)), 0.0f, 1, null), Dp.m3775constructorimpl(36)), companion2.getBottomCenter())), o0OOo000.f48185Ooooo00, null, 2, null), new OooO0OO(roomThemeVM), composerStartRestartGroup, 805309488, 0, 261556);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            roomThemeCustomScreen = this;
            roomThemeCustomScreen.ThemeDialog(roomThemeVM, composer2, ((i3 << 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(roomThemeCustomScreen.new OooO0o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ThemeDialog(@NotNull RoomThemeVM vm, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1635678644);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635678644, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.ThemeDialog (RoomThemeCustomScreen.kt:181)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        CustomizeThemeModel value = vm.getSelectCustomizeThemeModel().getValue();
        composerStartRestartGroup.startReplaceableGroup(535126660);
        if (value == null) {
            composer2 = composerStartRestartGroup;
        } else {
            o000O0Oo.OooO0Oo(vm.isShowDialogSetThemeFrozen(), StringResources_androidKt.stringResource(o000000.title_RoomMember_Tips, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.room_theme_customize_new_unfrozen_content, composerStartRestartGroup, 0), null, true, false, null, null, StringResources_androidKt.stringResource(o000000.Get_Yalla_Premium, composerStartRestartGroup, 0), false, TextButtonStyle.Green, false, new OooO(context), StringResources_androidKt.stringResource(o000000.Get_Vip, composerStartRestartGroup, 0), false, false, TextButtonStyle.GreenOutLined, OooOO0.f29471OooO0Oo, null, null, composerStartRestartGroup, 24576, 14155782, 838376);
            MutableState<Boolean> mutableStateIsShowDialogForRenewals = vm.isShowDialogForRenewals();
            String strStringResource = StringResources_androidKt.stringResource(o000000.room_theme_customize_new_renewals_content, composerStartRestartGroup, 0);
            String strValueOf = String.valueOf(value.getRenewPrice());
            RoomThemeCustomCreateVM.Companion oooO00o = RoomThemeCustomCreateVM.INSTANCE;
            int themeType = value.getThemeType();
            oooO00o.getClass();
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableStateIsShowDialogForRenewals, null, o0000O.OooO00o(strStringResource, strValueOf, themeType == 2 ? "7" : "30"), null, false, false, null, null, StringResources_androidKt.stringResource(o000000.room_dialog_theme_customize_renewals, composerStartRestartGroup, 0), false, null, false, new OooOO0O(vm, value, lifecycleOwner), null, false, true, null, OooOOO0.f29476OooO0Oo, null, null, composer2, 0, 12779520, 880378);
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        o000O0Oo.OooO0Oo(vm.isShowDialogCreateRoom(), null, StringResources_androidKt.stringResource(o000000.room_theme_custom_create_room_title, composer3, 0), null, false, false, null, null, StringResources_androidKt.stringResource(o000000.Creat_Room, composer3, 0), false, TextButtonStyle.Green, false, new OooOOO(context), StringResources_androidKt.stringResource(o000000.Cancel, composer3, 0), false, false, TextButtonStyle.GreenOutLined, OooOOOO.f29477OooO0Oo, null, null, composer3, 24576, 14155782, 838378);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(vm, i));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01a1  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ThemeItem(@NotNull RoomThemeVM vm, @NotNull CustomizeThemeModel item, @NotNull Modifier modifier, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1042951149);
        Function0<Unit> function2 = (i2 & 8) != 0 ? null : function0;
        Function0<Unit> function3 = (i2 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1042951149, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen.ThemeItem (RoomThemeCustomScreen.kt:252)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 8;
        Modifier modifierClip = ClipKt.clip(companion.then(modifier), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOo(function2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<Unit> function4 = function3;
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
        ImageKt.Image(o000OO.OooO0OO(p184o00o00O0.OooO0OO.OooO0Oo(item.getPic()), Oooo000.f29483OooO0Oo, composerStartRestartGroup, 48, 0), "", o00O0O0.OooO00o(f, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        RoomThemeCustomScreen roomThemeCustomScreen = INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(function4);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Oooo0(function4);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        roomThemeCustomScreen.bottomView(boxScopeInstance, item, (Function0) objRememberedValue2, composerStartRestartGroup, 3142, 0);
        if (item.getId() != vm.getCurrentThemeShopId().getValue().longValue()) {
            i3 = 48;
            z = false;
        } else {
            if (o0O00oO0.f47987Ooooo00.getValue() == null) {
                i3 = 48;
                z = false;
            } else {
                i3 = 48;
                z = true;
            }
        }
        roomThemeCustomScreen.selectView(z, composerStartRestartGroup, i3);
        composerStartRestartGroup.startReplaceableGroup(287081562);
        if (item.getIsFrozen()) {
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(f, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), o0OOo000.f48162OooOooO, null, 2, null);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.room_theme_customize_frozen, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl((float) 66.5d), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(55)), companion2.getTopCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.room_theme_customize_frozen, composerStartRestartGroup, 0), boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl((float) 133.5d), 0.0f, 0.0f, 13, null), 0.0f, 1, null), companion2.getTopCenter()), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120304);
            o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(vm, item, modifier, function2, function4, i, i2));
    }
}
