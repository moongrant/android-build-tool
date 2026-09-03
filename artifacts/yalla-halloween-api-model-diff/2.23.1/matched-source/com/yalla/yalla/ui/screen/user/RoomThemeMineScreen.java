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
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.screen.user.RoomThemeMineScreen;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import p022Oooo00O.o00O00OO;
import p194o00o0OO.o00O000o;
import p196o00o0OOO.o00O00o0;
import p196o00o0OOO.oo00o;
import p207o00o0oO0.o000O0Oo;
import p425o0OoO0OO.o00;
import p425o0OoO0OO.o0000O0O;
import p426o0OoO0Oo.o00OO00O;
import p444o0OoOo0O.o000;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p515o0o0O00.o0oOO;
import p532o0o0OOOO.o0O00OOO;
import p565o0oOo000.o000OOo;
import p565o0oOo000.oo0o0Oo;
import p577o0oOoOOO.f;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0007J0\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0013\u0010 \u001a\u00020\u0005*\u00020\u000eH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/screen/user/RoomThemeMineScreen;", "Lo0o0OOOO/o0O00OOO;", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/yalla/yalla/model/ThemeModel;", "item", "", "imageContent", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/runtime/Composer;I)V", "limitNumView", "videoView", "", "isSelected", "selectView", "(Landroidx/compose/foundation/layout/BoxScope;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "themePurchaseView", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/runtime/Composer;I)V", "themeTagView", "themeTypeView", "themeNameView", "themeDayNumView", "bottomView", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;", "vm", "Lo0oOoOOO/f;", "loadingVM", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "onSetTheme", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "ThemeDialog", "(Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ThemeItem", "(Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,518:1\n76#2:519\n76#2:557\n76#2:707\n81#3,11:520\n81#3,11:531\n81#3,11:558\n486#4,4:542\n490#4,2:550\n494#4:556\n25#5:546\n36#5:570\n456#5,8:594\n464#5,3:608\n467#5,3:612\n456#5,8:638\n464#5,3:652\n467#5,3:656\n456#5,8:681\n464#5,3:695\n467#5,3:701\n456#5,8:726\n464#5,3:740\n467#5,3:746\n456#5,8:772\n464#5,3:786\n456#5,8:809\n464#5,3:823\n467#5,3:827\n467#5,3:832\n1097#6,3:547\n1100#6,3:553\n1097#6,6:571\n486#7:552\n154#8:569\n154#8:617\n154#8:618\n154#8:619\n154#8:620\n154#8:621\n154#8:661\n154#8:662\n154#8:663\n154#8:699\n154#8:700\n154#8:706\n154#8:708\n154#8:744\n154#8:745\n154#8:751\n154#8:752\n154#8:753\n154#8:754\n154#8:790\n154#8:791\n66#9,6:577\n72#9:611\n76#9:616\n67#9,5:622\n72#9:655\n76#9:660\n66#9,6:664\n72#9:698\n76#9:705\n66#9,6:755\n72#9:789\n76#9:836\n78#10,11:583\n91#10:615\n78#10,11:627\n91#10:659\n78#10,11:670\n91#10:704\n78#10,11:715\n91#10:749\n78#10,11:761\n78#10,11:798\n91#10:830\n91#10:835\n4144#11,6:602\n4144#11,6:646\n4144#11,6:689\n4144#11,6:734\n4144#11,6:780\n4144#11,6:817\n73#12,6:709\n79#12:743\n83#12:750\n72#13,6:792\n78#13:826\n82#13:831\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen\n*L\n69#1:519\n111#1:557\n321#1:707\n70#1:520,11\n71#1:531,11\n136#1:558,11\n73#1:542,4\n73#1:550,2\n73#1:556\n73#1:546\n141#1:570\n137#1:594,8\n137#1:608,3\n137#1:612,3\n188#1:638,8\n188#1:652,3\n188#1:656,3\n228#1:681,8\n228#1:695,3\n228#1:701,3\n358#1:726,8\n358#1:740,3\n358#1:746,3\n420#1:772,8\n420#1:786,3\n436#1:809,8\n436#1:823,3\n436#1:827,3\n420#1:832,3\n73#1:547,3\n73#1:553,3\n141#1:571,6\n73#1:552\n140#1:569\n168#1:617\n180#1:618\n191#1:619\n192#1:620\n195#1:621\n218#1:661\n219#1:662\n231#1:663\n239#1:699\n240#1:700\n311#1:706\n360#1:708\n367#1:744\n370#1:745\n395#1:751\n411#1:752\n423#1:753\n425#1:754\n432#1:790\n440#1:791\n137#1:577,6\n137#1:611\n137#1:616\n188#1:622,5\n188#1:655\n188#1:660\n228#1:664,6\n228#1:698\n228#1:705\n420#1:755,6\n420#1:789\n420#1:836\n137#1:583,11\n137#1:615\n188#1:627,11\n188#1:659\n228#1:670,11\n228#1:704\n358#1:715,11\n358#1:749\n420#1:761,11\n436#1:798,11\n436#1:830\n420#1:835\n137#1:602,6\n188#1:646,6\n228#1:689,6\n358#1:734,6\n420#1:780,6\n436#1:817,6\n358#1:709,6\n358#1:743\n358#1:750\n436#1:792,6\n436#1:826\n436#1:831\n*E\n"})
public final class RoomThemeMineScreen extends o0O00OOO {
    public static final int $stable = 0;

    @NotNull
    public static final RoomThemeMineScreen INSTANCE = new RoomThemeMineScreen();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f29517OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29519OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29520OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29520OooO0o0 = columnScope;
            this.f29519OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29519OooO0o | 1);
            RoomThemeMineScreen.this.Content(this.f29520OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomThemeMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,518:1\n154#2:519\n154#2:520\n154#2:521\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2\n*L\n83#1:519\n84#1:520\n85#1:521\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<ThemeModel> f29521OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ f f29522OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29523OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29524OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f29525OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p107o000ooO0.OooOOOO<ThemeModel> oooOOOO, RoomThemeVM roomThemeVM, f fVar, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
            super(3);
            this.f29521OooO0Oo = oooOOOO;
            this.f29523OooO0o0 = roomThemeVM;
            this.f29522OooO0o = fVar;
            this.f29524OooO0oO = lifecycleOwner;
            this.f29525OooO0oo = coroutineScope;
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
                    ComposerKt.traceEventStart(17351074, iIntValue, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.MainContent.<anonymous> (RoomThemeMineScreen.kt:80)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                float f = 10;
                PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f));
                Arrangement arrangement = Arrangement.INSTANCE;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM472PaddingValuesYgX7TsA, false, arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), null, false, new com.yalla.yalla.ui.screen.user.o00Ooo(this.f29521OooO0Oo, this.f29523OooO0o0, this.f29522OooO0o, this.f29524OooO0oO, this.f29525OooO0oo), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29527OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f29527OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29527OooO0o0 | 1);
            RoomThemeMineScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29528OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f29528OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = CreateRoomActivity.f26052OooOoo0;
            CreateRoomActivity.OooO00o.OooO00o(this.f29528OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29530OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29531OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomThemeVM roomThemeVM, int i) {
            super(2);
            this.f29531OooO0o0 = roomThemeVM;
            this.f29530OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29530OooO0o | 1);
            RoomThemeMineScreen.this.ThemeDialog(this.f29531OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29532OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f29532OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f29532OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29534OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29535OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29536OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29535OooO0o0 = boxScope;
            this.f29534OooO0o = themeModel;
            this.f29536OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29536OooO0oO | 1);
            BoxScope boxScope = this.f29535OooO0o0;
            ThemeModel themeModel = this.f29534OooO0o;
            RoomThemeMineScreen.this.bottomView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f29537OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f29539OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29540OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29541OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29542OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ThemeModel themeModel, Modifier modifier, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f29540OooO0o0 = themeModel;
            this.f29539OooO0o = modifier;
            this.f29541OooO0oO = function0;
            this.f29542OooO0oo = i;
            this.f29537OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomThemeMineScreen.this.ThemeItem(this.f29540OooO0o0, this.f29539OooO0o, this.f29541OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29542OooO0oo | 1), this.f29537OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f29543OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = p565o0oOo000.o0OOO0o.icon_room_theme_placeholder_big;
            it.OooO0Oo(i);
            it.OooO0OO(i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29545OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29546OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29547OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29546OooO0o0 = boxScope;
            this.f29545OooO0o = themeModel;
            this.f29547OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29547OooO0oO | 1);
            BoxScope boxScope = this.f29546OooO0o0;
            ThemeModel themeModel = this.f29545OooO0o;
            RoomThemeMineScreen.this.limitNumView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29549OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29550OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29551OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29550OooO0o0 = boxScope;
            this.f29549OooO0o = themeModel;
            this.f29551OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29551OooO0oO | 1);
            BoxScope boxScope = this.f29550OooO0o0;
            ThemeModel themeModel = this.f29549OooO0o;
            RoomThemeMineScreen.this.imageContent(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f29553OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29554OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29555OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(BoxScope boxScope, boolean z, int i) {
            super(2);
            this.f29554OooO0o0 = boxScope;
            this.f29553OooO0o = z;
            this.f29555OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29555OooO0oO | 1);
            BoxScope boxScope = this.f29554OooO0o0;
            boolean z = this.f29553OooO0o;
            RoomThemeMineScreen.this.selectView(boxScope, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen$onSetTheme$1", f = "RoomThemeMineScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f29556OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ f f29557OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29558OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29559OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ThemeModel f29560OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ThemeModel themeModel) {
                super(1);
                this.f29560OooO0Oo = themeModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                ThemeModel themeModel = this.f29560OooO0Oo;
                themeModel.setSelected(true);
                p597o0oo00O.OooOOOO.OooO0O0("onSetRoomThemeMine wrm " + o0000.OooO0OO(o000OOo.item_in_use_now) + "\nshopId = " + themeModel.getShopId() + " \nname = " + themeModel.getName());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(RoomThemeVM roomThemeVM, ThemeModel themeModel, f fVar, LifecycleOwner lifecycleOwner, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f29556OooO0Oo = roomThemeVM;
            this.f29558OooO0o0 = themeModel;
            this.f29557OooO0o = fVar;
            this.f29559OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f29556OooO0Oo, this.f29558OooO0o0, this.f29557OooO0o, this.f29559OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ThemeModel themeModel = this.f29558OooO0o0;
            o00OO00O<ApiResult<String>> roomTheme = this.f29556OooO0Oo.setRoomTheme(themeModel.getShopId(), false);
            o0oOO.OooO0O0(roomTheme, this.f29557OooO0o, false, 6);
            p386o0OOoo0O.o00Oo0.OooO0Oo(roomTheme, this.f29559OooO0oO, false, null, null, new OooO00o(themeModel), 14);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29562OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29563OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29564OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29563OooO0o0 = columnScope;
            this.f29562OooO0o = themeModel;
            this.f29564OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29564OooO0oO | 1);
            ColumnScope columnScope = this.f29563OooO0o0;
            ThemeModel themeModel = this.f29562OooO0o;
            RoomThemeMineScreen.this.themeDayNumView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29566OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29567OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29568OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29567OooO0o0 = columnScope;
            this.f29566OooO0o = themeModel;
            this.f29568OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29568OooO0oO | 1);
            ColumnScope columnScope = this.f29567OooO0o0;
            ThemeModel themeModel = this.f29566OooO0o;
            RoomThemeMineScreen.this.themePurchaseView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29570OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29571OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29572OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29571OooO0o0 = columnScope;
            this.f29570OooO0o = themeModel;
            this.f29572OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29572OooO0oO | 1);
            ColumnScope columnScope = this.f29571OooO0o0;
            ThemeModel themeModel = this.f29570OooO0o;
            RoomThemeMineScreen.this.themeTagView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29574OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29575OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29576OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29575OooO0o0 = columnScope;
            this.f29574OooO0o = themeModel;
            this.f29576OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29576OooO0oO | 1);
            ColumnScope columnScope = this.f29575OooO0o0;
            ThemeModel themeModel = this.f29574OooO0o;
            RoomThemeMineScreen.this.themeTypeView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29578OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29579OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29580OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29579OooO0o0 = columnScope;
            this.f29578OooO0o = themeModel;
            this.f29580OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29580OooO0oO | 1);
            ColumnScope columnScope = this.f29579OooO0o0;
            ThemeModel themeModel = this.f29578OooO0o;
            RoomThemeMineScreen.this.themeNameView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29582OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29583OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29584OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f29583OooO0o0 = boxScope;
            this.f29582OooO0o = themeModel;
            this.f29584OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29584OooO0oO | 1);
            BoxScope boxScope = this.f29583OooO0o0;
            ThemeModel themeModel = this.f29582OooO0o;
            RoomThemeMineScreen.this.videoView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private RoomThemeMineScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$0(p107o000ooO0.OooOOOO lazyPagingItems, boolean z) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        lazyPagingItems.OooO0Oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void bottomView(BoxScope boxScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1276095825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1276095825, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.bottomView (RoomThemeMineScreen.kt:418)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(140));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        float f = 8;
        Modifier modifierClip = ClipKt.clip(boxScope.align(modifierM511height3ABfNKs, companion2.getBottomCenter()), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierClip2 = ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null));
        Brush.Companion companion4 = Brush.INSTANCE;
        int i2 = o0O0o.f48305o00OOooO;
        BoxKt.Box(BackgroundKt.background$default(modifierClip2, Brush.Companion.m1644verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0O0o.f48092OooO00o), Color.m1671boximpl(o0O0o.f48125Oooo00O)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
        Modifier modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), Dp.m3775constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO00o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478padding3ABfNKs);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        RoomThemeMineScreen roomThemeMineScreen = INSTANCE;
        roomThemeMineScreen.themeTagView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeTypeView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeNameView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeDayNumView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themePurchaseView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        if (o00O00o0.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(boxScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void imageContent(BoxScope boxScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-19689565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19689565, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.imageContent (RoomThemeMineScreen.kt:159)");
        }
        if (themeModel.getDefaultDrawable()) {
            composerStartRestartGroup.startReplaceableGroup(1838119238);
            ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.icon_room_bg, composerStartRestartGroup, 0), (String) null, o000.OooO00o(8, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1838119562);
            ImageKt.Image(o0000O0O.OooO0OO(p184o00o00O0.OooO0OO.OooO0Oo(themeModel.getPic()), OooOOOO.f29543OooO0Oo, composerStartRestartGroup, 48, 0), "", o000.OooO00o(8, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(boxScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void limitNumView(BoxScope boxScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1453563023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1453563023, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.limitNumView (RoomThemeMineScreen.kt:185)");
        }
        if (themeModel.getIsHave() == 1 || themeModel.getLimitNum() <= 0) {
            composer2 = composerStartRestartGroup;
        } else {
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            float f = 4;
            Modifier modifierOooO00o = o000.OooO00o(f, PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(8)));
            Brush.Companion companion2 = Brush.INSTANCE;
            int i2 = o0O0o.f48305o00OOooO;
            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(boxScope.align(BackgroundKt.background$default(modifierOooO00o, Brush.Companion.m1636horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0O0o.f48248o00O0), Color.m1671boximpl(o0O0o.f48261o00O0O00)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), companion.getTopStart()), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(3));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(o000OOo.days_special, composerStartRestartGroup, 0), String.valueOf(themeModel.getLimitNum())), (Modifier) null, o0O0o.f48093OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
            o00O00OO.OooO0O0(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(boxScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetTheme(ThemeModel model, RoomThemeVM vm, f loadingVM, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        p597o0oo00O.OooOOOO.OooO0O0("onSetRoomThemeMine wrm \nshopId = " + model.getShopId() + " \nname = " + model.getName());
        boolean z = true;
        if (oo0oO0.f48017OoooOoo.getValue() == null) {
            vm.isShowDialogCreateRoom().setValue(Boolean.TRUE);
            return;
        }
        if (vm.getCurrentThemeShopId().getValue().longValue() != model.getShopId() && !model.getIsSelected()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Oooo000(vm, model, loadingVM, lifecycleOwner, null), 3, null);
            return;
        }
        String strOooO0OO = o0000.OooO0OO(o000OOo.item_in_used);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void selectView(BoxScope boxScope, boolean z, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(333714696);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(333714696, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.selectView (RoomThemeMineScreen.kt:225)");
            }
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO00o = o000.OooO00o(8, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                int i3 = o0O0o.f48305o00OOooO;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierOooO00o, o0O0o.f48099OooO0oo, null, 2, null);
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
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.recom_checked, composerStartRestartGroup, 0), (String) null, BoxScopeInstance.INSTANCE.align(ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(92), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(35)), RoundedCornerShapeKt.getCircleShape()), companion2.getTopCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(boxScope, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void themeDayNumView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-635283842);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-635283842, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themeDayNumView (RoomThemeMineScreen.kt:400)");
        }
        if (themeModel.getTimeLong() <= -1 || themeModel.getDayNum() <= 0) {
            composer2 = composerStartRestartGroup;
        } else {
            String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o000OOo.days_remained, composerStartRestartGroup, 0), String.valueOf(themeModel.getDayNum()));
            int i2 = o0O0o.f48305o00OOooO;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strOooO00o, SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0O0o.f48249o00O00, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(columnScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void themeNameView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-662754019);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-662754019, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themeNameView (RoomThemeMineScreen.kt:386)");
        }
        String name = themeModel.getName();
        int i2 = o0O0o.f48305o00OOooO;
        TextKt.m1261Text4IGK_g(name, SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0O0o.f48093OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(columnScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void themePurchaseView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-723060761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-723060761, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themePurchaseView (RoomThemeMineScreen.kt:248)");
        }
        boolean z = themeModel.getIsHave() == 1;
        int themeTagType = themeModel.getThemeTagType();
        if (themeTagType == 0) {
            o0000.OooO0OO(z ? o000OOo.Purchased : o000OOo.Purchase);
        } else if (themeTagType == 1) {
            o0000.OooO0OO(z ? o000OOo.Obtained : o000OOo.Obtain);
        } else if (themeTagType == 2) {
            o0000.OooO0OO(z ? o000OOo.Purchased : o000OOo.Purchase);
        } else if (themeTagType == 3) {
            o0000.OooO0OO(z ? o000OOo.Obtained : o000OOo.Obtain);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(columnScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void themeTagView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1875569252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1875569252, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themeTagView (RoomThemeMineScreen.kt:275)");
        }
        int themeTagType = themeModel.getThemeTagType();
        boolean z = false;
        if (themeTagType != 0 && themeTagType != 1 && (themeTagType == 2 || themeTagType == 3)) {
            z = true;
        }
        if (z) {
            String themeTag = themeModel.getThemeTag();
            int i2 = o0O0o.f48305o00OOooO;
            TextKt.m1261Text4IGK_g(themeTag, SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0O0o.f48260o00O0O0, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 3120, 120784);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(columnScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0157  */
    /* JADX WARN: Code duplicated, block: B:38:0x0163  */
    /* JADX WARN: Code duplicated, block: B:39:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x0186  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x020c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0220  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void themeTypeView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        String str;
        int i2;
        boolean z;
        Color color;
        Color colorM1671boximpl;
        String strStringResource;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        Composer composerStartRestartGroup = composer.startRestartGroup(-886021938);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886021938, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themeTypeView (RoomThemeMineScreen.kt:319)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (themeModel.getIsRoomTeamAward()) {
            composerStartRestartGroup.startReplaceableGroup(590186065);
            i2 = oo0o0Oo.ic_room_member_host;
            strStringResource = StringResources_androidKt.stringResource(o000OOo.room_theme_mine_member_group_reward, composerStartRestartGroup, 0);
            colorM1671boximpl = Color.m1671boximpl(o0O0o.f48262o00O0O0O);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (!themeModel.getIsBoxAward()) {
                if (themeModel.getThemeTagType() != 1 || themeModel.getPremiumLvThemeTag() <= PremiumLevel.Premium0.getValue()) {
                    composerStartRestartGroup.startReplaceableGroup(590187241);
                    composerStartRestartGroup.endReplaceableGroup();
                    str = "";
                    i2 = 0;
                    z = false;
                    color = null;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(590186886);
                    composerStartRestartGroup.endReplaceableGroup();
                    int i3 = UserPremiumView.f30267OooO0o0;
                    int iOooO00o = UserPremiumView.OooO00o.OooO00o(themeModel.getPremiumLvThemeTag());
                    int premiumLvThemeTag = themeModel.getPremiumLvThemeTag();
                    Intrinsics.checkNotNullParameter(context, "context");
                    PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
                    String string = context.getString(UserPremiumView.OooO00o.OooO0Oo(companion.of(Integer.valueOf(premiumLvThemeTag))));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    int i4 = UserPremiumView.OooO00o.C0342OooO00o.$EnumSwitchMapping$0[companion.of(Integer.valueOf(themeModel.getPremiumLvThemeTag())).ordinal()];
                    if (i4 == 2) {
                        colorM1671boximpl = Color.m1671boximpl(o0O0o.f48265o00O0OO0);
                    } else if (i4 == 3) {
                        colorM1671boximpl = Color.m1671boximpl(o0O0o.f48330oo0o0O0);
                    } else if (i4 == 4) {
                        colorM1671boximpl = Color.m1671boximpl(o0O0o.f48264o00O0OO);
                    } else if (i4 != 5) {
                        colorM1671boximpl = i4 != 6 ? null : Color.m1671boximpl(o0O0o.f48267o00O0OOo);
                    } else {
                        colorM1671boximpl = Color.m1671boximpl(o0O0o.f48266o00O0OOO);
                    }
                    strStringResource = string;
                    i2 = iOooO00o;
                }
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
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
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(590187938);
                    if (color == null) {
                        composer2 = composerStartRestartGroup;
                    } else {
                        composer2 = composerStartRestartGroup;
                        TextKt.m1261Text4IGK_g(str, (Modifier) null, color.m1691unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
                    }
                    o00O000o.OooO0O0(composer2);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(columnScope, themeModel, i));
            }
            composerStartRestartGroup.startReplaceableGroup(590186465);
            i2 = p565o0oOo000.o0OOO0o.room_ic_theme_box_award;
            strStringResource = StringResources_androidKt.stringResource(o000OOo.room_theme_mine_chest_reward, composerStartRestartGroup, 0);
            colorM1671boximpl = Color.m1671boximpl(o0O0o.f48263o00O0O0o);
            composerStartRestartGroup.endReplaceableGroup();
        }
        str = strStringResource;
        z = true;
        color = colorM1671boximpl;
        if (z) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion4, 0.0f, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m525size3ABfNKs(companion4, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(590187938);
            if (color == null) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(str, (Modifier) null, color.m1691unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
            }
            o00O000o.OooO0O0(composer2);
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(columnScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void videoView(BoxScope boxScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(924029135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(924029135, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.videoView (RoomThemeMineScreen.kt:210)");
        }
        if (!StringsKt.isBlank(themeModel.getVideoPath())) {
            ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.room_ic_theme_scale_video, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(8)), Dp.m3775constructorimpl(23)), Alignment.INSTANCE.getTopEnd()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(boxScope, themeModel, i));
    }

    @Override // p532o0o0OOOO.o0O00OOO
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1046545725);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1046545725, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.Content (RoomThemeMineScreen.kt:62)");
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-1200273690);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1200273690, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.MainContent (RoomThemeMineScreen.kt:67)");
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
            ViewModel viewModel2 = ViewModelKt.viewModel(f.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            f fVar = (f) viewModel2;
            final p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(roomThemeVM.getMineRoomTheme().f38496OooO0oo, composerStartRestartGroup);
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
            o00.OooO00o(observable, new Observer() { // from class: o0o0OoOO.d3
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    RoomThemeMineScreen.MainContent$lambda$0(oooOOOOOooO00o, ((Boolean) obj).booleanValue());
                }
            }, composerStartRestartGroup, 72);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 17351074, true, new OooO0O0(oooOOOOOooO00o, roomThemeVM, fVar, lifecycleOwner, coroutineScope));
            int i3 = p107o000ooO0.OooOOOO.f35800OooO0o0;
            oo00o.OooO0o(oooOOOOOooO00o, modifierFillMaxSize$default, null, null, null, composableLambda, composerStartRestartGroup, 196664, 28);
            ThemeDialog(roomThemeVM, composerStartRestartGroup, ((i2 << 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ThemeDialog(@NotNull RoomThemeVM vm, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-243052496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-243052496, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.ThemeDialog (RoomThemeMineScreen.kt:109)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        MutableState<Boolean> mutableStateIsShowDialogCreateRoom = vm.isShowDialogCreateRoom();
        String strStringResource = StringResources_androidKt.stringResource(o000OOo.room_theme_custom_create_room_title, composerStartRestartGroup, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(o000OOo.Creat_Room, composerStartRestartGroup, 0);
        TextButtonStyle textButtonStyle = TextButtonStyle.Green;
        TextButtonStyle textButtonStyle2 = TextButtonStyle.GreenOutLined;
        o000O0Oo.OooO0Oo(mutableStateIsShowDialogCreateRoom, null, strStringResource, null, false, false, null, null, strStringResource2, false, textButtonStyle, false, new OooO0o(context), StringResources_androidKt.stringResource(o000OOo.Cancel, composerStartRestartGroup, 0), false, false, textButtonStyle2, OooO.f29517OooO0Oo, null, null, composerStartRestartGroup, 24576, 14155782, 838378);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(vm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ThemeItem(@NotNull ThemeModel item, @NotNull Modifier modifier, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1147572261);
        Function0<Unit> function1 = (i2 & 4) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1147572261, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.ThemeItem (RoomThemeMineScreen.kt:134)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(RoomThemeVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        RoomThemeVM roomThemeVM = (RoomThemeVM) viewModel;
        Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE.then(modifier), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(8)));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function1);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOO0O(function1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        boolean z = false;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        RoomThemeMineScreen roomThemeMineScreen = INSTANCE;
        roomThemeMineScreen.imageContent(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.limitNumView(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.videoView(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.bottomView(boxScopeInstance, item, composerStartRestartGroup, 454);
        if (item.getShopId() == roomThemeVM.getCurrentThemeShopId().getValue().longValue()) {
            if (!(oo0oO0.f48017OoooOoo.getValue() == null)) {
                z = true;
            }
        }
        roomThemeMineScreen.selectView(boxScopeInstance, z, composerStartRestartGroup, 390);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(item, modifier, function1, i, i2));
    }
}
