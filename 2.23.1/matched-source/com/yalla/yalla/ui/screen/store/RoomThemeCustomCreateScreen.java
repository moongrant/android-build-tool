package com.yalla.yalla.ui.screen.store;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
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
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.io.File;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.o00O00o0;
import p196o00o0OOO.oo00o;
import p207o00o0oO0.o000O0Oo;
import p425o0OoO0OO.o000;
import p437o0OoOOOo.o0O00000;
import p437o0OoOOOo.o0OoOoOo;
import p445o0OoOo0o.o000O0;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p515o0o0O00.o00O00OO;
import p515o0o0O00.o0O0oo0o;
import p532o0o0OOOO.o0O00OOO;
import p532o0o0OOOO.o0O0o000;
import p532o0o0OOOO.o0O0o00O;
import p542o0o0OoO.o000O00;
import p587o0oOooO.oO0OOo0o;
import p593o0oOoooO.h0;
import p675oO0Oo.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0012\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0013\u0010 \u001a\u00020\u0005*\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen;", "Lo0o0OOOO/o0O00OOO;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;", "viewModel", "", "MainBody", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;Landroidx/compose/runtime/Composer;I)V", "MainContainer", "TopAddPickContainer", "(Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;Landroidx/compose/runtime/Composer;I)V", "PreViewPicture", "DayChooseContainer", "Landroidx/compose/foundation/layout/RowScope;", "Lcom/yalla/yalla/model/CustomPrices;", "customPrices", "Landroidx/compose/ui/Modifier;", "modifier", "DayChooseItem", "(Landroidx/compose/foundation/layout/RowScope;Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;Lcom/yalla/yalla/model/CustomPrices;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PayButton", "BottomShowMoneyContainer", "(Landroidx/compose/ui/Modifier;Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;Landroidx/compose/runtime/Composer;I)V", "TextDescribeLayout", "(Landroidx/compose/runtime/Composer;I)V", "", ViewHierarchyConstants.TEXT_KEY, "TextDescribe", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "selectThemePicture", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "PRE_THEME_THEME_ID", "Ljava/lang/String;", "PRE_THEME_PIC_URL", "PRE_THEME_THEME_TYPE", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeCustomCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,598:1\n81#2,11:599\n76#3:610\n76#3:611\n76#3:659\n76#3:662\n76#3:717\n76#3:718\n76#3:742\n36#4:612\n456#4,8:634\n464#4,3:648\n467#4,3:652\n25#4:663\n456#4,8:688\n464#4,3:702\n467#4,3:708\n25#4:719\n25#4:726\n25#4:733\n456#4,8:762\n464#4,3:776\n456#4,8:797\n464#4,3:811\n467#4,3:817\n456#4,8:839\n464#4,3:853\n467#4,3:857\n467#4,3:862\n1097#5,6:613\n1097#5,6:664\n1097#5,6:720\n1097#5,6:727\n1097#5,6:734\n154#6:619\n154#6:620\n164#6:657\n164#6:658\n154#6:660\n154#6:661\n154#6:670\n154#6:671\n154#6:713\n154#6:714\n154#6:715\n154#6:716\n154#6:740\n154#6:741\n154#6:743\n154#6:744\n154#6:815\n154#6:816\n154#6:867\n76#7,2:621\n78#7:651\n82#7:656\n78#8,11:623\n91#8:655\n78#8,11:677\n91#8:711\n78#8,11:751\n78#8,11:786\n91#8:820\n78#8,11:828\n91#8:860\n91#8:865\n4144#9,6:642\n4144#9,6:696\n4144#9,6:770\n4144#9,6:805\n4144#9,6:847\n74#10,5:672\n79#10:705\n83#10:712\n73#10,6:780\n79#10:814\n83#10:821\n73#10,6:822\n79#10:856\n83#10:861\n1855#11,2:706\n66#12,6:745\n72#12:779\n76#12:866\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen\n*L\n90#1:599,11\n92#1:610\n94#1:611\n187#1:659\n229#1:662\n373#1:717\n375#1:718\n499#1:742\n96#1:612\n147#1:634,8\n147#1:648,3\n147#1:652,3\n231#1:663\n271#1:688,8\n271#1:702,3\n271#1:708,3\n377#1:719\n378#1:726\n379#1:733\n501#1:762,8\n501#1:776,3\n507#1:797,8\n507#1:811,3\n507#1:817,3\n522#1:839,8\n522#1:853,3\n522#1:857,3\n501#1:862,3\n96#1:613,6\n231#1:664,6\n377#1:720,6\n378#1:727,6\n379#1:734,6\n149#1:619\n155#1:620\n172#1:657\n175#1:658\n192#1:660\n193#1:661\n274#1:670\n275#1:671\n296#1:713\n298#1:714\n300#1:715\n302#1:716\n449#1:740\n450#1:741\n504#1:743\n505#1:744\n512#1:815\n517#1:816\n567#1:867\n147#1:621,2\n147#1:651\n147#1:656\n147#1:623,11\n147#1:655\n271#1:677,11\n271#1:711\n501#1:751,11\n507#1:786,11\n507#1:820\n522#1:828,11\n522#1:860\n501#1:865\n147#1:642,6\n271#1:696,6\n501#1:770,6\n507#1:805,6\n522#1:847,6\n271#1:672,5\n271#1:705\n271#1:712\n507#1:780,6\n507#1:814\n507#1:821\n522#1:822,6\n522#1:856\n522#1:861\n277#1:706,2\n501#1:745,6\n501#1:779\n501#1:866\n*E\n"})
public final class RoomThemeCustomCreateScreen extends o0O00OOO {
    public static final int $stable = 0;

    @NotNull
    public static final RoomThemeCustomCreateScreen INSTANCE = new RoomThemeCustomCreateScreen();

    @NotNull
    public static final String PRE_THEME_PIC_URL = "preThemePicUrl";

    @NotNull
    public static final String PRE_THEME_THEME_ID = "preThemeThemeId";

    @NotNull
    public static final String PRE_THEME_THEME_TYPE = "preThemeThemeType";

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29181OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29182OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29182OooO0o0 = roomThemeCustomCreateVM;
            this.f29181OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29181OooO0o | 1);
            RoomThemeCustomCreateScreen.this.DayChooseContainer(this.f29182OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29183OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f29183OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = WalletActivity.f26589OooOoOO;
            WalletActivity.OooO00o.OooO00o(this.f29183OooO0Oo, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29185OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f29186OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29187OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29186OooO0o0 = modifier;
            this.f29185OooO0o = roomThemeCustomCreateVM;
            this.f29187OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29187OooO0oO | 1);
            Modifier modifier = this.f29186OooO0o0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29185OooO0o;
            RoomThemeCustomCreateScreen.this.BottomShowMoneyContainer(modifier, roomThemeCustomCreateVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen$Content$2", f = "RoomThemeCustomCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29188OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29189OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RoomThemeCustomCreateVM f29190OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RoomThemeCustomCreateVM roomThemeCustomCreateVM) {
                super(1);
                this.f29190OooO0Oo = roomThemeCustomCreateVM;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l) {
                String strOooO0Oo = p595o0oo0.OooOo00.OooO0Oo(String.valueOf(l));
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "fmtMicrometer(...)");
                this.f29190OooO0Oo.setCoin(strOooO0Oo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LifecycleOwner lifecycleOwner, RoomThemeCustomCreateVM roomThemeCustomCreateVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f29188OooO0Oo = lifecycleOwner;
            this.f29189OooO0o0 = roomThemeCustomCreateVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f29188OooO0Oo, this.f29189OooO0o0, continuation);
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
            Observable<Object> observable = LiveEventBus.get("ROOM_THEME_PREVIEW_CROP_RESULT");
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29189OooO0o0;
            o000O0 o000o0 = new o000O0(roomThemeCustomCreateVM, 3);
            LifecycleOwner lifecycleOwner = this.f29188OooO0Oo;
            observable.observe(lifecycleOwner, o000o0);
            LiveEventBus.get("CUSTOM_THEME_GET_YALLA_PREMIUM_4_5").observe(lifecycleOwner, new p519o0o0O0O.o00Oo0(roomThemeCustomCreateVM, 1));
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            oo0oO0.OooO0O0().observe(lifecycleOwner, new o00000(new OooO00o(roomThemeCustomCreateVM)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29192OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29193OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ColumnScope columnScope, int i) {
            super(2);
            this.f29193OooO0o0 = columnScope;
            this.f29192OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29192OooO0o | 1);
            RoomThemeCustomCreateScreen.this.Content(this.f29193OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29194OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f29195OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomThemeCustomCreateVM roomThemeCustomCreateVM, CustomPrices customPrices) {
            super(0);
            this.f29194OooO0Oo = roomThemeCustomCreateVM;
            this.f29195OooO0o0 = customPrices;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29194OooO0Oo.setCurrentThemeType(this.f29195OooO0o0.getThemeType());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29197OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29198OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29198OooO0o0 = roomThemeCustomCreateVM;
            this.f29197OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29197OooO0o | 1);
            RoomThemeCustomCreateScreen.this.DayChooseContainer(this.f29198OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f29199OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29201OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RowScope f29202OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f29203OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f29204OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(RowScope rowScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, CustomPrices customPrices, Modifier modifier, int i) {
            super(2);
            this.f29202OooO0o0 = rowScope;
            this.f29201OooO0o = roomThemeCustomCreateVM;
            this.f29203OooO0oO = customPrices;
            this.f29204OooO0oo = modifier;
            this.f29199OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RoomThemeCustomCreateScreen.this.DayChooseItem(this.f29202OooO0o0, this.f29201OooO0o, this.f29203OooO0oO, this.f29204OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29199OooO | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomThemeCustomCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen$DayChooseItem$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,598:1\n65#2,7:599\n72#2:634\n76#2:721\n78#3,11:606\n78#3,11:637\n78#3,11:674\n91#3:709\n91#3:714\n91#3:720\n456#4,8:617\n464#4,3:631\n456#4,8:648\n464#4,3:662\n456#4,8:685\n464#4,3:699\n467#4,3:706\n467#4,3:711\n467#4,3:717\n4144#5,6:625\n4144#5,6:656\n4144#5,6:693\n76#6,2:635\n78#6:665\n82#6:715\n164#7:666\n154#7:703\n154#7:704\n154#7:705\n154#7:716\n72#8,7:667\n79#8:702\n83#8:710\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen$DayChooseItem$1\n*L\n305#1:599,7\n305#1:634\n305#1:721\n305#1:606,11\n306#1:637,11\n317#1:674,11\n317#1:709\n306#1:714\n305#1:720\n305#1:617,8\n305#1:631,3\n306#1:648,8\n306#1:662,3\n317#1:685,8\n317#1:699,3\n317#1:706,3\n306#1:711,3\n305#1:717,3\n305#1:625,6\n306#1:656,6\n317#1:693,6\n306#1:635,2\n306#1:665\n306#1:715\n315#1:666\n319#1:703\n324#1:704\n334#1:705\n349#1:716\n317#1:667,7\n317#1:702\n317#1:710\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f29205OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f29206OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z, CustomPrices customPrices) {
            super(2);
            this.f29205OooO0Oo = z;
            this.f29206OooO0o0 = customPrices;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-616159151, iIntValue, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.DayChooseItem.<anonymous> (RoomThemeCustomCreateScreen.kt:304)");
                }
                composer2.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                RoomThemeCustomCreateVM.Companion oooO00o = RoomThemeCustomCreateVM.INSTANCE;
                CustomPrices customPrices = this.f29206OooO0o0;
                int themeType = customPrices.getThemeType();
                oooO00o.getClass();
                TextKt.m1261Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(p565o0oOo000.o000OOo.xxx_days), themeType == 2 ? "7" : "30"), (Modifier) null, o0000oo.OooO0OO(composer2).f38621OooOO0, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
                Composer composer3 = composer2;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 5.5d), null, composer3, 6, 2);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer3.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically, composer3, 48, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.coin, composer3, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 440, 120);
                float f = 2;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer3, 6, 2);
                composer3.startReplaceableGroup(-1030339044);
                if (customPrices.getDiscountPrice() != customPrices.getOriginalPrice()) {
                    TextKt.m1261Text4IGK_g(String.valueOf(customPrices.getOriginalPrice()), (Modifier) null, o0O0o.f48187o0000oo0, oO0OOo0o.OooO0O0(14, composer3), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 100663296, 0, 130802);
                    composer3 = composer3;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composer3, 6, 2);
                }
                composer3.endReplaceableGroup();
                Composer composer4 = composer3;
                TextKt.m1261Text4IGK_g(String.valueOf(customPrices.getDiscountPrice()), (Modifier) null, o0O0o.f48188o0000ooO, oO0OOo0o.OooO0O0(14, composer3), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131058);
                composer4.endReplaceableGroup();
                composer4.endNode();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endNode();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.startReplaceableGroup(-1498755520);
                if (this.f29205OooO0Oo) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.ic_room_theme_customize_pay_selected, composer4, 0), (String) null, SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion2.getTopEnd()), Dp.m3775constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                }
                if (androidx.compose.animation.OooOo.OooO00o(composer4)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29207OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RoomThemeCustomCreateVM roomThemeCustomCreateVM) {
            super(0);
            this.f29207OooO0Oo = roomThemeCustomCreateVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29207OooO0Oo.loadThemePrice();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29209OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29210OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29211OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(ColumnScope columnScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29210OooO0o0 = columnScope;
            this.f29209OooO0o = roomThemeCustomCreateVM;
            this.f29211OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29211OooO0oO | 1);
            ColumnScope columnScope = this.f29210OooO0o0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29209OooO0o;
            RoomThemeCustomCreateScreen.this.MainBody(columnScope, roomThemeCustomCreateVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomThemeCustomCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen$MainBody$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,598:1\n71#2,7:599\n78#2:634\n82#2:639\n78#3,11:606\n91#3:638\n456#4,8:617\n464#4,3:631\n467#4,3:635\n4144#5,6:625\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomCreateScreen.kt\ncom/yalla/yalla/ui/screen/store/RoomThemeCustomCreateScreen$MainBody$2\n*L\n139#1:599,7\n139#1:634\n139#1:639\n139#1:606,11\n139#1:638\n139#1:617,8\n139#1:631,3\n139#1:635,3\n139#1:625,6\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29212OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomThemeCustomCreateVM roomThemeCustomCreateVM) {
            super(3);
            this.f29212OooO0Oo = roomThemeCustomCreateVM;
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
                    ComposerKt.traceEventStart(428629843, iIntValue, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.MainBody.<anonymous> (RoomThemeCustomCreateScreen.kt:138)");
                }
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RoomThemeCustomCreateScreen.INSTANCE.MainContainer(ColumnScopeInstance.INSTANCE, this.f29212OooO0Oo, composer2, 454);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29213OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f29213OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f26674Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f29213OooO0Oo, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29215OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29216OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29217OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(ColumnScope columnScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29216OooO0o0 = columnScope;
            this.f29215OooO0o = roomThemeCustomCreateVM;
            this.f29217OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29217OooO0oO | 1);
            ColumnScope columnScope = this.f29216OooO0o0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29215OooO0o;
            RoomThemeCustomCreateScreen.this.MainContainer(columnScope, roomThemeCustomCreateVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f29218OooO0Oo;

        public o00000(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29218OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f29218OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29218OooO0Oo;
        }

        public final int hashCode() {
            return this.f29218OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29218OooO0Oo.invoke(obj);
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29219OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(AppCompatActivity appCompatActivity) {
            super(0);
            this.f29219OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomThemeCustomCreateScreen.INSTANCE.selectThemePicture(this.f29219OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29221OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29222OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29222OooO0o0 = roomThemeCustomCreateVM;
            this.f29221OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29221OooO0o | 1);
            RoomThemeCustomCreateScreen.this.TopAddPickContainer(this.f29222OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29223OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(AppCompatActivity appCompatActivity) {
            super(1);
            this.f29223OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                AppCompatActivity appCompatActivity = this.f29223OooO0Oo;
                o00OOOo0.OooOOO0.OooO0O0(appCompatActivity, new com.yalla.yalla.ui.screen.store.OooO0o(appCompatActivity));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29225OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29226OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29226OooO0o0 = roomThemeCustomCreateVM;
            this.f29225OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29225OooO0o | 1);
            RoomThemeCustomCreateScreen.this.TopAddPickContainer(this.f29226OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f29227OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f29228OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f29229OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0o000.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29230OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29231OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29232OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29233OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(RoomThemeCustomCreateVM roomThemeCustomCreateVM, MutableState<Boolean> mutableState, int i, MutableState<Boolean> mutableState2) {
            super(0);
            this.f29230OooO0Oo = roomThemeCustomCreateVM;
            this.f29232OooO0o0 = mutableState;
            this.f29231OooO0o = i;
            this.f29233OooO0oO = mutableState2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x0091  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Long l;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29230OooO0Oo;
            if (roomThemeCustomCreateVM.getCurrentThemeType() > 0 && !TextUtils.isEmpty(roomThemeCustomCreateVM.getCustomImagePath())) {
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Pair pair = (Pair) oo0oO0.OooOO0o().getValue();
                boolean z = true;
                if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                    l = (Long) oo0oO0.OooO0O0().getValue();
                    if (l == null) {
                        l = 0L;
                    }
                    if (l.longValue() < this.f29231OooO0o) {
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0OoOoOo.f47016OooO00o);
                    } else {
                        this.f29233OooO0oO.setValue(Boolean.TRUE);
                    }
                } else {
                    Pair pair2 = (Pair) oo0oO0.OooOO0().getValue();
                    if (!(pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue())) {
                        Pair pair3 = (Pair) oo0oO0.OooOO0().getValue();
                        if (!(pair3 != null && ((Number) pair3.getFirst()).intValue() == VipState.VipHide.getValue())) {
                            z = false;
                        }
                    }
                    if (z) {
                        l = (Long) oo0oO0.OooO0O0().getValue();
                        if (l == null) {
                            l = 0L;
                        }
                        if (l.longValue() < this.f29231OooO0o) {
                            kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0OoOoOo.f47016OooO00o);
                        } else {
                            this.f29233OooO0oO.setValue(Boolean.TRUE);
                        }
                    } else {
                        this.f29232OooO0o0.setValue(Boolean.TRUE);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29236OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29236OooO0o0 = roomThemeCustomCreateVM;
            this.f29235OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29235OooO0o | 1);
            RoomThemeCustomCreateScreen.this.PreViewPicture(this.f29236OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29238OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(int i) {
            super(2);
            this.f29238OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29238OooO0o0 | 1);
            RoomThemeCustomCreateScreen.this.TextDescribeLayout(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29239OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f29240OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(RoomThemeCustomCreateVM roomThemeCustomCreateVM, Context context) {
            super(1);
            this.f29239OooO0Oo = roomThemeCustomCreateVM;
            this.f29240OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f29239OooO0Oo.isNewTheme()) {
                RoomThemeCustomCreateScreen roomThemeCustomCreateScreen = RoomThemeCustomCreateScreen.INSTANCE;
                Context context = this.f29240OooO0o0;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                roomThemeCustomCreateScreen.selectThemePicture((AppCompatActivity) context);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f29241OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(View view, RoomThemeCustomCreateVM roomThemeCustomCreateVM) {
            super(1);
            this.f29241OooO0Oo = view;
            this.f29242OooO0o0 = roomThemeCustomCreateVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            NetImageView netImageView = (NetImageView) this.f29241OooO0Oo.findViewById(p565o0oOo000.o0Oo0oo.ivSelectedImage);
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29242OooO0o0;
            if (roomThemeCustomCreateVM.isNewTheme()) {
                netImageView.setImageBitmap(BitmapFactory.decodeFile(roomThemeCustomCreateVM.getCustomImagePath()));
            } else {
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(netImageView.getContext());
                oooO00o.f43127OooO0OO = roomThemeCustomCreateVM.getCustomImagePath();
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(netImageView);
            }
            netImageView.setCornerRadius(o0000O0.OooO00o(8));
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29244OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29245OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29245OooO0o0 = roomThemeCustomCreateVM;
            this.f29244OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29244OooO0o | 1);
            RoomThemeCustomCreateScreen.this.PreViewPicture(this.f29245OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29246OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29247OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29248OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(RoomThemeCustomCreateVM roomThemeCustomCreateVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
            super(0);
            this.f29246OooO0Oo = roomThemeCustomCreateVM;
            this.f29248OooO0o0 = lifecycleOwner;
            this.f29247OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29246OooO0Oo;
            boolean zIsNewTheme = roomThemeCustomCreateVM.isNewTheme();
            LifecycleOwner lifecycleOwner = this.f29248OooO0o0;
            if (zIsNewTheme) {
                String customImagePath = roomThemeCustomCreateVM.getCustomImagePath();
                if (customImagePath == null) {
                    customImagePath = "";
                }
                roomThemeCustomCreateVM.uploadCustomImage(new File(customImagePath)).observe(lifecycleOwner, new o00000(new com.yalla.yalla.ui.screen.store.OooO0O0(roomThemeCustomCreateVM, lifecycleOwner, this.f29247OooO0o)));
            } else {
                roomThemeCustomCreateVM.reNewOldTheme().observe(lifecycleOwner, new p386o0OOoo0O.o0OoOo0(com.yalla.yalla.ui.screen.store.OooO0OO.f29163OooO0Oo, null, null, false, 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<Context, View> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f29249OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(View view) {
            super(1);
            this.f29249OooO0Oo = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f29249OooO0Oo;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f29252OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(RoomThemeCustomCreateVM roomThemeCustomCreateVM, int i) {
            super(2);
            this.f29252OooO0o0 = roomThemeCustomCreateVM;
            this.f29251OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29251OooO0o | 1);
            RoomThemeCustomCreateScreen.this.PayButton(this.f29252OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29254OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f29255OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(String str, int i) {
            super(2);
            this.f29255OooO0o0 = str;
            this.f29254OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29254OooO0o | 1);
            RoomThemeCustomCreateScreen.this.TextDescribe(this.f29255OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private RoomThemeCustomCreateScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomShowMoneyContainer(Modifier modifier, RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(877758278);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877758278, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.BottomShowMoneyContainer (RoomThemeCustomCreateScreen.kt:496)");
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objConsume;
        Modifier modifierOooO00o = kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(50, PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m3775constructorimpl(15), 0.0f, 2, null), composerStartRestartGroup, 733328855);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.coin, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(21)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(5), null, composerStartRestartGroup, 6, 2);
        String coin = roomThemeCustomCreateVM.getCoin();
        long jOooO0O0 = oO0OOo0o.OooO0O0(18, composerStartRestartGroup);
        long j = o0O0o.f48171o0000OO0;
        TextKt.m1261Text4IGK_g(coin, (Modifier) null, j, jOooO0O0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131058);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically2 = companion.getCenterVertically();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(boxScopeInstance.align(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), companion.getTopEnd()), false, false, 0L, false, null, null, null, new OooO00o(appCompatActivity), 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1261Text4IGK_g(o0000.OooO0OO(p565o0oOo000.o000OOo.Recharge_), (Modifier) companion3, j, oO0OOo0o.OooO0O0(14, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 48, 0, 65520);
        if (o00O00o0.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier, roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DayChooseContainer(RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-690653586);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-690653586, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.DayChooseContainer (RoomThemeCustomCreateScreen.kt:265)");
        }
        List<CustomPrices> dayChooseList = roomThemeCustomCreateVM.getDayChooseList();
        if (dayChooseList != null && dayChooseList.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(roomThemeCustomCreateVM, i));
            return;
        }
        float f = 16;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1907312124);
        List<CustomPrices> dayChooseList2 = roomThemeCustomCreateVM.getDayChooseList();
        Intrinsics.checkNotNull(dayChooseList2);
        for (CustomPrices customPrices : dayChooseList2) {
            INSTANCE.DayChooseItem(rowScopeInstance, roomThemeCustomCreateVM, customPrices, com.code.android.util.o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new OooOO0(roomThemeCustomCreateVM, customPrices), 253), composerStartRestartGroup, 25158);
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DayChooseItem(RowScope rowScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, CustomPrices customPrices, Modifier modifier, Composer composer, int i) {
        long jM1718getWhite0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(1468876846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1468876846, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.DayChooseItem (RoomThemeCustomCreateScreen.kt:289)");
        }
        boolean z = roomThemeCustomCreateVM.getCurrentThemeType() == customPrices.getThemeType();
        float fM3775constructorimpl = Dp.m3775constructorimpl(1);
        int i2 = o0O0o.f48305o00OOooO;
        float f = 9;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m511height3ABfNKs(BorderKt.m184borderziNgDLE(modifier, fM3775constructorimpl, new SolidColor(z ? o0O0o.f48171o0000OO0 : o0O0o.f48132Oooo0oo, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f))), Dp.m3775constructorimpl(69)), 1.0f, false, 2, null);
        RoundedCornerShape roundedCornerShapeM729RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f));
        if (z) {
            int i3 = o0O0o.f48305o00OOooO;
            jM1718getWhite0d7_KjU = o0O0o.f48185o0000oOo;
        } else {
            jM1718getWhite0d7_KjU = Color.INSTANCE.m1718getWhite0d7_KjU();
        }
        CardKt.m1015CardFjzlyU(modifierOooO00o, roundedCornerShapeM729RoundedCornerShape0680j_4, jM1718getWhite0d7_KjU, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -616159151, true, new OooOOO0(z, customPrices)), composerStartRestartGroup, 1572864, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(rowScope, roomThemeCustomCreateVM, customPrices, modifier, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainBody(ColumnScope columnScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1881717295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1881717295, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.MainBody (RoomThemeCustomCreateScreen.kt:129)");
        }
        o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.Custom_Themes, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
        oo00o.OooO0o0(roomThemeCustomCreateVM.getContentState(), false, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, new OooOOOO(roomThemeCustomCreateVM), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 428629843, true, new OooOo00(roomThemeCustomCreateVM)), composerStartRestartGroup, 12582912, 58);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(columnScope, roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContainer(ColumnScope columnScope, RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-622246816);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-622246816, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.MainContainer (RoomThemeCustomCreateScreen.kt:145)");
        }
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        float f = 16;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(f));
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(BackgroundKt.m171backgroundbw27NRU$default(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38614OooO0O0, null, 2, null), 0.0f, Dp.m3775constructorimpl(f), 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        RoomThemeCustomCreateScreen roomThemeCustomCreateScreen = INSTANCE;
        roomThemeCustomCreateScreen.TopAddPickContainer(roomThemeCustomCreateVM, composerStartRestartGroup, 56);
        roomThemeCustomCreateScreen.PreViewPicture(roomThemeCustomCreateVM, composerStartRestartGroup, 56);
        roomThemeCustomCreateScreen.DayChooseContainer(roomThemeCustomCreateVM, composerStartRestartGroup, 56);
        roomThemeCustomCreateScreen.PayButton(roomThemeCustomCreateVM, composerStartRestartGroup, 56);
        roomThemeCustomCreateScreen.TextDescribeLayout(composerStartRestartGroup, 6);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f2 = (float) 0.5d;
        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2)), composerStartRestartGroup, 6);
        DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38617OooO0o, Dp.m3775constructorimpl(f2), 0.0f, composerStartRestartGroup, 384, 9);
        BottomShowMoneyContainer(BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38614OooO0O0, null, 2, null), roomThemeCustomCreateVM, composerStartRestartGroup, (i & 896) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(columnScope, roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PayButton(RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062787714);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062787714, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.PayButton (RoomThemeCustomCreateScreen.kt:361)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM1644verticalGradient8A3gB4$default = Brush.Companion.m1644verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0O0o.f48153o000), Color.m1671boximpl(o0O0o.f48192o000O000)}), 0.0f, 100.0f, 0, 8, (Object) null);
        long j = o0O0o.f48134OoooO0;
        Brush brushM1644verticalGradient8A3gB4$default2 = Brush.Companion.m1644verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(j), Color.m1671boximpl(j)}), 0.0f, 100.0f, 0, 8, (Object) null);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objConsume;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue3;
        int currentCustomPrice = roomThemeCustomCreateVM.getCurrentCustomPrice();
        String strOooO0OO = o0000.OooO0OO(p565o0oOo000.o000OOo.title_RoomMember_Tips);
        String strOooO0OO2 = o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_dialog_premium_vip_warn);
        String strOooO0OO3 = o0000.OooO0OO(p565o0oOo000.o000OOo.Get_Yalla_Premium);
        TextButtonStyle textButtonStyle = TextButtonStyle.GreenOutLined;
        o000O0Oo.OooO0Oo(mutableState, strOooO0OO, strOooO0OO2, null, true, false, null, null, strOooO0OO3, false, textButtonStyle, false, new Oooo0(appCompatActivity), o0000.OooO0OO(p565o0oOo000.o000OOo.Get_Vip), false, false, textButtonStyle, o000oOoO.f29227OooO0Oo, null, null, composerStartRestartGroup, 24582, 14155782, 838376);
        d1.OooO00o(null, roomThemeCustomCreateVM.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
        String strOooO0OO4 = o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_dialog_before_buy_warn);
        String strValueOf = String.valueOf(currentCustomPrice);
        RoomThemeCustomCreateVM.Companion oooO00o = RoomThemeCustomCreateVM.INSTANCE;
        int currentThemeType = roomThemeCustomCreateVM.getCurrentThemeType();
        oooO00o.getClass();
        String strOooO00o = o0000O.OooO00o(strOooO0OO4, strValueOf, currentThemeType == 2 ? "7" : "30");
        int i2 = p565o0oOo000.o000OOo.Pay;
        o000O0Oo.OooO0Oo(mutableState2, null, strOooO00o, null, false, false, null, null, o0000.OooO0OO(i2), false, null, false, new o0OoOo0(roomThemeCustomCreateVM, lifecycleOwner, mutableState3), null, false, false, null, o00O0O.f29228OooO0Oo, null, null, composerStartRestartGroup, 6, 12582912, 913146);
        o000O0Oo.OooO0Oo(mutableState3, o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_dialog_success_title), o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_dialog_success_content), null, false, false, null, null, null, false, null, false, o00Oo0.f29229OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 196614, 384, 1044440);
        String strOooO0OO5 = o0000.OooO0OO(i2);
        long j2 = o0O0o.f48093OooO0O0;
        Modifier modifierBackground$default = Modifier.INSTANCE;
        Modifier modifierBackground$default2 = BackgroundKt.background$default(ClipKt.clip(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(modifierBackground$default, 0.0f, 1, null), Dp.m3775constructorimpl(40)), Dp.m3775constructorimpl(16), 0.0f, 2, null), RoundedCornerShapeKt.RoundedCornerShape(50)), (roomThemeCustomCreateVM.getCurrentThemeType() <= 0 || TextUtils.isEmpty(roomThemeCustomCreateVM.getCustomImagePath())) ? brushM1644verticalGradient8A3gB4$default2 : brushM1644verticalGradient8A3gB4$default, null, 0.0f, 6, null);
        String customImagePath = roomThemeCustomCreateVM.getCustomImagePath();
        if (!(customImagePath == null || StringsKt.isBlank(customImagePath))) {
            modifierBackground$default = BackgroundKt.background$default(modifierBackground$default, (roomThemeCustomCreateVM.getCurrentThemeType() <= 0 || TextUtils.isEmpty(roomThemeCustomCreateVM.getCustomImagePath())) ? brushM1644verticalGradient8A3gB4$default2 : brushM1644verticalGradient8A3gB4$default, null, 0.0f, 6, null);
        }
        Modifier modifierThen = modifierBackground$default2.then(modifierBackground$default);
        long jOooO0O0 = oO0OOo0o.OooO0O0(16, composerStartRestartGroup);
        String customImagePath2 = roomThemeCustomCreateVM.getCustomImagePath();
        TextButtonStyle textButtonStyle2 = !(customImagePath2 == null || StringsKt.isBlank(customImagePath2)) ? TextButtonStyle.Green : TextButtonStyle.GreyDisable;
        String customImagePath3 = roomThemeCustomCreateVM.getCustomImagePath();
        long j3 = !(customImagePath3 == null || StringsKt.isBlank(customImagePath3)) ? o0O0o.f48092OooO00o : o0O0o.f48322o0ooOO0;
        String customImagePath4 = roomThemeCustomCreateVM.getCustomImagePath();
        o00O0OO0.OooO00o(strOooO0OO5, jOooO0O0, null, textButtonStyle2, Color.m1671boximpl(j2), Color.m1671boximpl(j3), null, 0.0f, null, !(customImagePath4 == null || StringsKt.isBlank(customImagePath4)), false, 0L, false, null, null, null, null, null, modifierThen, new o00Ooo(roomThemeCustomCreateVM, mutableState, currentCustomPrice, mutableState2), composerStartRestartGroup, 0, 0, 261572);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PreViewPicture(RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(1714968422);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1714968422, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.PreViewPicture (RoomThemeCustomCreateScreen.kt:223)");
        }
        if (TextUtils.isEmpty(roomThemeCustomCreateVM.getCustomImagePath())) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(roomThemeCustomCreateVM, i));
            return;
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            obj = objRememberedValue;
            View viewInflate = View.inflate(context, p565o0oOo000.o0OO00O.room_include_theme_room_preview, null);
            Intrinsics.checkNotNull(viewInflate);
            o000O.OooOOOO(viewInflate);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(o0000O0.OooO00o(208.0f), -2);
            layoutParams.height = (layoutParams.width * o000.f46631OooO0O0) / o000.f46630OooO00o;
            viewInflate.setLayoutParams(layoutParams);
            Intrinsics.checkNotNull(viewInflate);
            o000O.OooO(viewInflate, new o0OO00O(roomThemeCustomCreateVM, context));
            composerStartRestartGroup.updateRememberedValue(viewInflate);
            obj = viewInflate;
        }
        obj = objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        View view = (View) obj;
        AndroidView_androidKt.AndroidView(new o0ooOOo(view), Modifier.INSTANCE, new o0OOO0o(view, roomThemeCustomCreateVM), composerStartRestartGroup, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0Oo0oo(roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TextDescribe(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1020467041);
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
                ComposerKt.traceEventStart(1020467041, i2, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.TextDescribe (RoomThemeCustomCreateScreen.kt:563)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o, oO0OOo0o.OooO0O0(13, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 48, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TextDescribeLayout(Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1666546940);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666546940, i2, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.TextDescribeLayout (RoomThemeCustomCreateScreen.kt:547)");
            }
            int i3 = (i2 << 3) & 112;
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_1), composerStartRestartGroup, i3);
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_2), composerStartRestartGroup, i3);
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_3), composerStartRestartGroup, i3);
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_4), composerStartRestartGroup, i3);
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_5), composerStartRestartGroup, i3);
            TextDescribe(o0000.OooO0OO(p565o0oOo000.o000OOo.room_theme_customize_description_6), composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0O00(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopAddPickContainer(RoomThemeCustomCreateVM roomThemeCustomCreateVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1279663356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1279663356, i, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.TopAddPickContainer (RoomThemeCustomCreateScreen.kt:181)");
        }
        if (!TextUtils.isEmpty(roomThemeCustomCreateVM.getCustomImagePath())) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(roomThemeCustomCreateVM, i));
            return;
        }
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        o00O00OO.f51269OooO00o.OooO00o(com.code.android.util.o0O0O00.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(159)), Dp.m3775constructorimpl(55), 0.0f, 2, null), false, false, 0L, false, null, null, null, new o000000((AppCompatActivity) objConsume), 253), o0O0o.f48143Ooooo00, 0.0f, 0.0f, 0.0f, 0.0f, o000O00.f54842OooO00o, composerStartRestartGroup, 14155776, 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o000000O(roomThemeCustomCreateVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectThemePicture(AppCompatActivity activity) {
        h0.OooO0O0("105038");
        try {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(activity, PermissionGroupReveal.f32345OooO0o, null, new o00000O0(activity));
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    @Override // p532o0o0OOOO.o0O00OOO
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        ColumnScope columnScope2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1422761721);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            columnScope2 = columnScope;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422761721, i3, -1, "com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen.Content (RoomThemeCustomCreateScreen.kt:86)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomThemeCustomCreateVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = (RoomThemeCustomCreateVM) viewModel;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Bundle bundleOooO0O0 = o0O0o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o0O0o00O.f53389OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                String string = bundleOooO0O0.getString(PRE_THEME_PIC_URL);
                long j = bundleOooO0O0.getLong(PRE_THEME_THEME_ID, -1L);
                int i4 = bundleOooO0O0.getInt(PRE_THEME_THEME_TYPE, 2);
                if (!TextUtils.isEmpty(string) && j != -1) {
                    roomThemeCustomCreateVM.setCurrentThemeType(i4);
                    roomThemeCustomCreateVM.setReNewThemeId(j);
                    roomThemeCustomCreateVM.setCustomImagePath(string);
                }
                roomThemeCustomCreateVM.loadThemePrice();
                composerStartRestartGroup.updateRememberedValue(null);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0OO(lifecycleOwner, roomThemeCustomCreateVM, null), composerStartRestartGroup, 70);
            columnScope2 = columnScope;
            MainBody(columnScope2, roomThemeCustomCreateVM, composerStartRestartGroup, (i3 & 14) | 64 | ((i3 << 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(columnScope2, i));
    }
}
