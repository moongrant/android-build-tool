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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p150o00Oo0oO.o00000OO;
import p150o00Oo0oO.o0000Ooo;
import p377o0OOoOo.o000O000;
import p417o0OoO0.o00000O;
import p420o0OoO0OO.o0OO00O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.v0;
import p526o0o0OOO0.o00O00O;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0007J0\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0013\u0010 \u001a\u00020\u0005*\u00020\u000eH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/screen/user/RoomThemeMineScreen;", "Lo0o0OOO0/o00O00O;", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/yalla/yalla/model/ThemeModel;", "item", "", "imageContent", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/runtime/Composer;I)V", "limitNumView", "videoView", "", "isSelected", "selectView", "(Landroidx/compose/foundation/layout/BoxScope;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "themePurchaseView", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/runtime/Composer;I)V", "themeTagView", "themeTypeView", "themeNameView", "themeDayNumView", "bottomView", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;", "vm", "Lo0oOoOO/o0O0OOO0;", "loadingVM", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "onSetTheme", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "ThemeDialog", "(Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ThemeItem", "(Lcom/yalla/yalla/model/ThemeModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomThemeMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,518:1\n76#2:519\n76#2:557\n76#2:707\n81#3,11:520\n81#3,11:531\n81#3,11:558\n486#4,4:542\n490#4,2:550\n494#4:556\n25#5:546\n36#5:570\n456#5,8:594\n464#5,3:608\n467#5,3:612\n456#5,8:638\n464#5,3:652\n467#5,3:656\n456#5,8:681\n464#5,3:695\n467#5,3:701\n456#5,8:726\n464#5,3:740\n467#5,3:746\n456#5,8:772\n464#5,3:786\n456#5,8:809\n464#5,3:823\n467#5,3:827\n467#5,3:832\n1097#6,3:547\n1100#6,3:553\n1097#6,6:571\n486#7:552\n154#8:569\n154#8:617\n154#8:618\n154#8:619\n154#8:620\n154#8:621\n154#8:661\n154#8:662\n154#8:663\n154#8:699\n154#8:700\n154#8:706\n154#8:708\n154#8:744\n154#8:745\n154#8:751\n154#8:752\n154#8:753\n154#8:754\n154#8:790\n154#8:791\n66#9,6:577\n72#9:611\n76#9:616\n67#9,5:622\n72#9:655\n76#9:660\n66#9,6:664\n72#9:698\n76#9:705\n66#9,6:755\n72#9:789\n76#9:836\n78#10,11:583\n91#10:615\n78#10,11:627\n91#10:659\n78#10,11:670\n91#10:704\n78#10,11:715\n91#10:749\n78#10,11:761\n78#10,11:798\n91#10:830\n91#10:835\n4144#11,6:602\n4144#11,6:646\n4144#11,6:689\n4144#11,6:734\n4144#11,6:780\n4144#11,6:817\n73#12,6:709\n79#12:743\n83#12:750\n72#13,6:792\n78#13:826\n82#13:831\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen\n*L\n69#1:519\n111#1:557\n321#1:707\n70#1:520,11\n71#1:531,11\n136#1:558,11\n73#1:542,4\n73#1:550,2\n73#1:556\n73#1:546\n141#1:570\n137#1:594,8\n137#1:608,3\n137#1:612,3\n188#1:638,8\n188#1:652,3\n188#1:656,3\n228#1:681,8\n228#1:695,3\n228#1:701,3\n358#1:726,8\n358#1:740,3\n358#1:746,3\n420#1:772,8\n420#1:786,3\n436#1:809,8\n436#1:823,3\n436#1:827,3\n420#1:832,3\n73#1:547,3\n73#1:553,3\n141#1:571,6\n73#1:552\n140#1:569\n168#1:617\n180#1:618\n191#1:619\n192#1:620\n195#1:621\n218#1:661\n219#1:662\n231#1:663\n239#1:699\n240#1:700\n311#1:706\n360#1:708\n367#1:744\n370#1:745\n395#1:751\n411#1:752\n423#1:753\n425#1:754\n432#1:790\n440#1:791\n137#1:577,6\n137#1:611\n137#1:616\n188#1:622,5\n188#1:655\n188#1:660\n228#1:664,6\n228#1:698\n228#1:705\n420#1:755,6\n420#1:789\n420#1:836\n137#1:583,11\n137#1:615\n188#1:627,11\n188#1:659\n228#1:670,11\n228#1:704\n358#1:715,11\n358#1:749\n420#1:761,11\n436#1:798,11\n436#1:830\n420#1:835\n137#1:602,6\n188#1:646,6\n228#1:689,6\n358#1:734,6\n420#1:780,6\n436#1:817,6\n358#1:709,6\n358#1:743\n358#1:750\n436#1:792,6\n436#1:826\n436#1:831\n*E\n"})
public final class RoomThemeMineScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final RoomThemeMineScreen INSTANCE = new RoomThemeMineScreen();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30050OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Context context) {
            super(0);
            this.f30050OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = CreateRoomActivity.f26502OooOoo0;
            CreateRoomActivity.OooO00o.OooO00o(this.f30050OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30052OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30053OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f30053OooO0o0 = columnScope;
            this.f30052OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30052OooO0o | 1);
            RoomThemeMineScreen.this.Content(this.f30053OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<ThemeModel> f30054OooO0Oo;

        public OooO0O0(o000O0.OooO0O0<ThemeModel> oooO0O0) {
            this.f30054OooO0Oo = oooO0O0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            this.f30054OooO0Oo.OooO0Oo();
        }
    }

    @SourceDebugExtension({"SMAP\nRoomThemeMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,518:1\n154#2:519\n154#2:520\n154#2:521\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2\n*L\n83#1:519\n84#1:520\n85#1:521\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<ThemeModel> f30055OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f30056OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f30057OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f30058OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f30059OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O0.OooO0O0<ThemeModel> oooO0O0, RoomThemeVM roomThemeVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
            super(3);
            this.f30055OooO0Oo = oooO0O0;
            this.f30057OooO0o0 = roomThemeVM;
            this.f30056OooO0o = o0o0ooo0;
            this.f30058OooO0oO = lifecycleOwner;
            this.f30059OooO0oo = coroutineScope;
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
                    ComposerKt.traceEventStart(17351074, iIntValue, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.MainContent.<anonymous> (RoomThemeMineScreen.kt:79)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                float f = 10;
                PaddingValues paddingValuesM470PaddingValuesYgX7TsA = PaddingKt.m470PaddingValuesYgX7TsA(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f));
                Arrangement arrangement = Arrangement.INSTANCE;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM470PaddingValuesYgX7TsA, false, arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), null, false, new com.yalla.yalla.ui.screen.user.o00Ooo(this.f30055OooO0Oo, this.f30057OooO0o0, this.f30056OooO0o, this.f30058OooO0oO, this.f30059OooO0oo), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f30061OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f30061OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30061OooO0o0 | 1);
            RoomThemeMineScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f30062OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30064OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f30065OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomThemeVM roomThemeVM, int i) {
            super(2);
            this.f30065OooO0o0 = roomThemeVM;
            this.f30064OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30064OooO0o | 1);
            RoomThemeMineScreen.this.ThemeDialog(this.f30065OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f30066OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f30068OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30069OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30070OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30071OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ThemeModel themeModel, Modifier modifier, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f30069OooO0o0 = themeModel;
            this.f30068OooO0o = modifier;
            this.f30070OooO0oO = function0;
            this.f30071OooO0oo = i;
            this.f30066OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomThemeMineScreen.this.ThemeItem(this.f30069OooO0o0, this.f30068OooO0o, this.f30070OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30071OooO0oo | 1), this.f30066OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30072OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Function0<Unit> function0) {
            super(0);
            this.f30072OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f30072OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30074OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30075OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30076OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30075OooO0o0 = boxScope;
            this.f30074OooO0o = themeModel;
            this.f30076OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30076OooO0oO | 1);
            BoxScope boxScope = this.f30075OooO0o0;
            ThemeModel themeModel = this.f30074OooO0o;
            RoomThemeMineScreen.this.bottomView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30078OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30079OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30080OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30079OooO0o0 = boxScope;
            this.f30078OooO0o = themeModel;
            this.f30080OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30080OooO0oO | 1);
            BoxScope boxScope = this.f30079OooO0o0;
            ThemeModel themeModel = this.f30078OooO0o;
            RoomThemeMineScreen.this.imageContent(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f30081OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = oOo00OO0.icon_room_theme_placeholder_big;
            it.OooO0Oo(i);
            it.OooO0OO(i);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen$onSetTheme$1", f = "RoomThemeMineScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f30082OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f30083OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30084OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f30085OooO0oO;

        public static final class OooO00o extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ThemeModel f30086OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ThemeModel themeModel) {
                super(1);
                this.f30086OooO0Oo = themeModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                ThemeModel themeModel = this.f30086OooO0Oo;
                themeModel.setSelected(true);
                p592o0oo00O.OooOOO0.OooO0O0("onSetRoomThemeMine wrm " + o0000.OooO0OO(oO00OOo0.item_in_use_now) + "\nshopId = " + themeModel.getShopId() + " \nname = " + themeModel.getName());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(RoomThemeVM roomThemeVM, ThemeModel themeModel, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f30082OooO0Oo = roomThemeVM;
            this.f30084OooO0o0 = themeModel;
            this.f30083OooO0o = o0o0ooo0;
            this.f30085OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f30082OooO0Oo, this.f30084OooO0o0, this.f30083OooO0o, this.f30085OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ThemeModel themeModel = this.f30084OooO0o0;
            o0OO00O<ApiResult<String>> roomTheme = this.f30082OooO0Oo.setRoomTheme(themeModel.getShopId(), false);
            v0.OooO0O0(roomTheme, this.f30083OooO0o, false, 6);
            o000O000.OooO0Oo(roomTheme, this.f30085OooO0oO, false, null, null, new OooO00o(themeModel), 14);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30088OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30089OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30090OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30089OooO0o0 = boxScope;
            this.f30088OooO0o = themeModel;
            this.f30090OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30090OooO0oO | 1);
            BoxScope boxScope = this.f30089OooO0o0;
            ThemeModel themeModel = this.f30088OooO0o;
            RoomThemeMineScreen.this.limitNumView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30092OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30093OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30094OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(BoxScope boxScope, boolean z, int i) {
            super(2);
            this.f30093OooO0o0 = boxScope;
            this.f30092OooO0o = z;
            this.f30094OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30094OooO0oO | 1);
            BoxScope boxScope = this.f30093OooO0o0;
            boolean z = this.f30092OooO0o;
            RoomThemeMineScreen.this.selectView(boxScope, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30096OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30097OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30098OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30097OooO0o0 = columnScope;
            this.f30096OooO0o = themeModel;
            this.f30098OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30098OooO0oO | 1);
            ColumnScope columnScope = this.f30097OooO0o0;
            ThemeModel themeModel = this.f30096OooO0o;
            RoomThemeMineScreen.this.themeNameView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30100OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30101OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30102OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30101OooO0o0 = columnScope;
            this.f30100OooO0o = themeModel;
            this.f30102OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30102OooO0oO | 1);
            ColumnScope columnScope = this.f30101OooO0o0;
            ThemeModel themeModel = this.f30100OooO0o;
            RoomThemeMineScreen.this.themePurchaseView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30104OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30105OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30106OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30105OooO0o0 = columnScope;
            this.f30104OooO0o = themeModel;
            this.f30106OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30106OooO0oO | 1);
            ColumnScope columnScope = this.f30105OooO0o0;
            ThemeModel themeModel = this.f30104OooO0o;
            RoomThemeMineScreen.this.themeTagView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30108OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30109OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30110OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(BoxScope boxScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30109OooO0o0 = boxScope;
            this.f30108OooO0o = themeModel;
            this.f30110OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30110OooO0oO | 1);
            BoxScope boxScope = this.f30109OooO0o0;
            ThemeModel themeModel = this.f30108OooO0o;
            RoomThemeMineScreen.this.videoView(boxScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30112OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30113OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30114OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30113OooO0o0 = columnScope;
            this.f30112OooO0o = themeModel;
            this.f30114OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30114OooO0oO | 1);
            ColumnScope columnScope = this.f30113OooO0o0;
            ThemeModel themeModel = this.f30112OooO0o;
            RoomThemeMineScreen.this.themeDayNumView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f30116OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30117OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30118OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(ColumnScope columnScope, ThemeModel themeModel, int i) {
            super(2);
            this.f30117OooO0o0 = columnScope;
            this.f30116OooO0o = themeModel;
            this.f30118OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30118OooO0oO | 1);
            ColumnScope columnScope = this.f30117OooO0o0;
            ThemeModel themeModel = this.f30116OooO0o;
            RoomThemeMineScreen.this.themeTypeView(columnScope, themeModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private RoomThemeMineScreen() {
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
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(140));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        float f = 8;
        Modifier modifierClip = ClipKt.clip(boxScope.align(modifierM509height3ABfNKs, companion2.getBottomCenter()), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 3, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierClip2 = ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 3, null));
        Brush.Companion companion4 = Brush.INSTANCE;
        int i2 = o0oO0O0o.f47152o00OOOo;
        BoxKt.Box(BackgroundKt.background$default(modifierClip2, Brush.Companion.m1633verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f46945OooO00o), Color.m1660boximpl(o0oO0O0o.f46978Oooo00O)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), Dp.m3765constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        RoomThemeMineScreen roomThemeMineScreen = INSTANCE;
        roomThemeMineScreen.themeTagView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeTypeView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeNameView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themeDayNumView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        roomThemeMineScreen.themePurchaseView(columnScopeInstance, themeModel, composerStartRestartGroup, 454);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(boxScope, themeModel, i));
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
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_room_bg, composerStartRestartGroup, 0), (String) null, com.facebook.OooOo.OooO0O0(8, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1838119562);
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO(p139o00OOooO.OooO0o.OooO0Oo(themeModel.getPic()), OooOo00.f30081OooO0Oo, composerStartRestartGroup, 48, 0), "", com.facebook.OooOo.OooO0O0(8, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(boxScope, themeModel, i));
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
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(f, PaddingKt.m476padding3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(8)));
            Brush.Companion companion2 = Brush.INSTANCE;
            int i2 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(boxScope.align(BackgroundKt.background$default(modifierOooO0O0, Brush.Companion.m1625horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f47109o00O00o), Color.m1660boximpl(o0oO0O0o.f47111o00O00oO)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), companion.getTopStart()), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(3));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.days_special, composerStartRestartGroup, 0), String.valueOf(themeModel.getLimitNum())), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
            p426o0OoOO.o000oOoO.OooO00o(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(boxScope, themeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetTheme(ThemeModel model, RoomThemeVM vm, o0O0OOO0 loadingVM, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        p592o0oo00O.OooOOO0.OooO0O0("onSetRoomThemeMine wrm \nshopId = " + model.getShopId() + " \nname = " + model.getName());
        boolean z = true;
        if (o000000O.f46724OoooOoo.getValue() == null) {
            vm.isShowDialogCreateRoom().setValue(Boolean.TRUE);
            return;
        }
        if (vm.getCurrentThemeShopId().getValue().longValue() != model.getShopId() && !model.getIsSelected()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Oooo0(vm, model, loadingVM, lifecycleOwner, null), 3, null);
            return;
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.item_in_used);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
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
                ComposerKt.traceEventStart(333714696, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.selectView (RoomThemeMineScreen.kt:225)");
            }
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(8, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                int i3 = o0oO0O0o.f47152o00OOOo;
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierOooO0O0, o0oO0O0o.f46952OooO0oo, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.recom_checked, composerStartRestartGroup, 0), (String) null, BoxScopeInstance.INSTANCE.align(ClipKt.clip(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(92), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(35)), RoundedCornerShapeKt.getCircleShape()), companion2.getTopCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, z, i));
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
            String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.days_remained, composerStartRestartGroup, 0), String.valueOf(themeModel.getDayNum()));
            int i2 = o0oO0O0o.f47152o00OOOo;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strOooO00o, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0oO0O0o.f47160o00oOoo, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(columnScope, themeModel, i));
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
        int i2 = o0oO0O0o.f47152o00OOOo;
        TextKt.m1251Text4IGK_g(name, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
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
    @Composable
    public final void themePurchaseView(ColumnScope columnScope, ThemeModel themeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-723060761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-723060761, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themePurchaseView (RoomThemeMineScreen.kt:248)");
        }
        boolean z = themeModel.getIsHave() == 1;
        int themeTagType = themeModel.getThemeTagType();
        if (themeTagType == 0) {
            o0000.OooO0OO(z ? oO00OOo0.Purchased : oO00OOo0.Purchase);
        } else if (themeTagType == 1) {
            o0000.OooO0OO(z ? oO00OOo0.Obtained : oO00OOo0.Obtain);
        } else if (themeTagType == 2) {
            o0000.OooO0OO(z ? oO00OOo0.Purchased : oO00OOo0.Purchase);
        } else if (themeTagType == 3) {
            o0000.OooO0OO(z ? oO00OOo0.Obtained : oO00OOo0.Obtain);
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
            int i2 = o0oO0O0o.f47152o00OOOo;
            TextKt.m1251Text4IGK_g(themeTag, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null), o0oO0O0o.f47176oo00o, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 3120, 120784);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(columnScope, themeModel, i));
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
        Color colorM1660boximpl;
        String strStringResource;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        Composer composerStartRestartGroup = composer.startRestartGroup(-886021938);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886021938, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.themeTypeView (RoomThemeMineScreen.kt:319)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (themeModel.getIsRoomTeamAward()) {
            composerStartRestartGroup.startReplaceableGroup(590186065);
            i2 = oO00OOO.ic_room_member_host;
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.room_theme_mine_member_group_reward, composerStartRestartGroup, 0);
            colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.f47101o00O0);
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
                    int i3 = UserPremiumView.f30802OooO0o0;
                    int iOooO00o = UserPremiumView.OooO00o.OooO00o(themeModel.getPremiumLvThemeTag());
                    int premiumLvThemeTag = themeModel.getPremiumLvThemeTag();
                    Intrinsics.checkNotNullParameter(context, "context");
                    PremiumLevel.Companion companion = PremiumLevel.INSTANCE;
                    String string = context.getString(UserPremiumView.OooO00o.OooO0Oo(companion.of(Integer.valueOf(premiumLvThemeTag))));
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(getPre…mLevel.of(premiumLevel)))");
                    int i4 = UserPremiumView.OooO00o.C0343OooO00o.$EnumSwitchMapping$0[companion.of(Integer.valueOf(themeModel.getPremiumLvThemeTag())).ordinal()];
                    if (i4 == 2) {
                        colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.o00O0O0);
                    } else if (i4 == 3) {
                        colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.o00O0O0O);
                    } else if (i4 == 4) {
                        colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.f47114o00O0O0o);
                    } else if (i4 != 5) {
                        colorM1660boximpl = i4 != 6 ? null : Color.m1660boximpl(o0oO0O0o.f47178oo0o0O0);
                    } else {
                        colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.f47116o00O0OO0);
                    }
                    strStringResource = string;
                    i2 = iOooO00o;
                }
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(590187938);
                    if (color == null) {
                        composer2 = composerStartRestartGroup;
                    } else {
                        composer2 = composerStartRestartGroup;
                        TextKt.m1251Text4IGK_g(str, (Modifier) null, color.m1680unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
                    }
                    p148o00Oo0o.o0ooOOo.OooO00o(composer2);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(columnScope, themeModel, i));
            }
            composerStartRestartGroup.startReplaceableGroup(590186465);
            i2 = oOo00OO0.room_ic_theme_box_award;
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.room_theme_mine_chest_reward, composerStartRestartGroup, 0);
            colorM1660boximpl = Color.m1660boximpl(o0oO0O0o.f47113o00O0O00);
            composerStartRestartGroup.endReplaceableGroup();
        }
        str = strStringResource;
        z = true;
        color = colorM1660boximpl;
        if (z) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion4, 0.0f, Dp.m3765constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m523size3ABfNKs(companion4, Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(590187938);
            if (color == null) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(str, (Modifier) null, color.m1680unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
            }
            p148o00Oo0o.o0ooOOo.OooO00o(composer2);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(columnScope, themeModel, i));
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
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.room_ic_theme_scale_video, composerStartRestartGroup, 0), (String) null, boxScope.align(SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(8)), Dp.m3765constructorimpl(23)), Alignment.INSTANCE.getTopEnd()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(boxScope, themeModel, i));
    }

    @Override // p526o0o0OOO0.o00O00O
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
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel2;
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(roomThemeVM.getMineRoomTheme().f37667OooO0oo, composerStartRestartGroup);
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
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.ROOM_THEME_UPDATE)");
            o00000O.OooO00o(observable, new OooO0O0(oooO0O0OooO00o), composerStartRestartGroup, 8);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 17351074, true, new OooO0OO(oooO0O0OooO00o, roomThemeVM, o0o0ooo0, lifecycleOwner, coroutineScope));
            int i3 = o000O0.OooO0O0.f34327OooO0o0;
            o0000Ooo.OooO0o(oooO0O0OooO00o, modifierFillMaxSize$default, null, null, null, composableLambda, composerStartRestartGroup, 196664, 28);
            ThemeDialog(roomThemeVM, composerStartRestartGroup, ((i2 << 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
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
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.room_theme_custom_create_room_title, composerStartRestartGroup, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Creat_Room, composerStartRestartGroup, 0);
        TextButtonStyle textButtonStyle = TextButtonStyle.Green;
        TextButtonStyle textButtonStyle2 = TextButtonStyle.GreenOutLined;
        p158o00OoOOO.oo000o.OooO0Oo(mutableStateIsShowDialogCreateRoom, null, strStringResource, null, false, false, null, null, strStringResource2, false, textButtonStyle, false, new OooO(context), StringResources_androidKt.stringResource(oO00OOo0.Cancel, composerStartRestartGroup, 0), false, false, textButtonStyle2, OooOO0.f30062OooO0Oo, null, null, composerStartRestartGroup, 24576, 14155782, 838378);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(vm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ThemeItem(@NotNull ThemeModel item, @NotNull Modifier modifier, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1147572261);
        Function0<Unit> function1 = (i2 & 4) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1147572261, i, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.ThemeItem (RoomThemeMineScreen.kt:130)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(RoomThemeVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        RoomThemeVM roomThemeVM = (RoomThemeVM) viewModel;
        Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE.then(modifier), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8)));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function1);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooOOO0(function1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierClip, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        boolean z = false;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        RoomThemeMineScreen roomThemeMineScreen = INSTANCE;
        roomThemeMineScreen.imageContent(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.limitNumView(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.videoView(boxScopeInstance, item, composerStartRestartGroup, 454);
        roomThemeMineScreen.bottomView(boxScopeInstance, item, composerStartRestartGroup, 454);
        if (item.getShopId() == roomThemeVM.getCurrentThemeShopId().getValue().longValue()) {
            if (!(o000000O.f46724OoooOoo.getValue() == null)) {
                z = true;
            }
        }
        roomThemeMineScreen.selectView(boxScopeInstance, z, composerStartRestartGroup, 390);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(item, modifier, function1, i, i2));
    }
}
