package com.yalla.yalla.ui.screen.user.vip;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000O;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.vip.VipShopExchangeModel;
import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import com.yalla.yalla.ui.vm.room.VipVm;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;
import p442o0OoOoO0.oo0O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p507o0o00ooo.v0;
import p519o0o0O0oO.h5;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p537o0o0OoO.o0O00OO;
import p537o0o0OoO.o0O00OOO;
import p537o0o0OoO.o0O00oO0;
import p537o0o0OoO.o0O0o0;
import p539o0o0OoOO.r3;
import p571o0oOoOO.o0O0OOO0;
import p579o0oOoo.oO000O0O;
import p579o0oOoo.oOO0OO;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016J\u0013\u0010\u001a\u001a\u00020\b*\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001e2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b0 H\u0007¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\b*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010\fJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/vip/VipScreen;", "Lo0o0OOO0/o00O00O;", "Lo00o00o/Oooo000;", "pagerState", "Lcom/yalla/yalla/ui/vm/room/VipVm;", "vipVm", "Lcom/yalla/yalla/model/PersonalVipModel;", "personalKaVipModel", "", "PrivilegeBanner", "(Lo00o00o/Oooo000;Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "WelfarePointsInfo", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "HeaderBackground", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/ScrollState;", "scrollState", "KaVipToolbar", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Landroidx/compose/foundation/ScrollState;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/model/VipLevel;", "kaVipLevel", "", "needNewTask", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lo00o00o/Oooo000;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "itemNotAvailable", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/vip/VipShopExchangeModel;", "Lkotlin/ParameterName;", "name", DeviceRequestsHelper.DEVICE_INFO_MODEL, "onSuccess", "BuyConfirmDialog", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UpgradeDialog", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "WhatAppDialog", "PrivilegeBottom", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Landroidx/compose/runtime/Composer;I)V", "", VipScreen.KA_VIP_LEVEL, "Ljava/lang/String;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,645:1\n81#2,11:646\n81#2,11:848\n76#3:657\n76#3:764\n76#3:859\n76#3:862\n76#3:870\n486#4,4:658\n490#4,2:666\n494#4:672\n25#5:662\n36#5:673\n456#5,8:697\n464#5,3:711\n456#5,8:733\n464#5,3:747\n467#5,3:751\n467#5,3:756\n456#5,8:782\n464#5,3:796\n456#5,8:818\n464#5,3:832\n467#5,3:837\n467#5,3:842\n25#5:863\n25#5:871\n456#5,8:892\n464#5,3:906\n467#5,3:912\n1097#6,3:663\n1100#6,3:669\n1097#6,6:674\n1097#6,6:864\n1097#6,6:872\n486#7:668\n66#8,6:680\n72#8:714\n76#8:760\n78#9,11:686\n78#9,11:722\n91#9:754\n91#9:759\n78#9,11:771\n78#9,11:807\n91#9:840\n91#9:845\n78#9,11:881\n91#9:915\n4144#10,6:705\n4144#10,6:741\n4144#10,6:790\n4144#10,6:826\n4144#10,6:900\n71#11,7:715\n78#11:750\n82#11:755\n154#12:761\n154#12:762\n154#12:763\n154#12:765\n154#12:836\n154#12:847\n154#12:860\n154#12:861\n154#12:878\n154#12:910\n154#12:911\n74#13,5:766\n79#13:799\n72#13,7:800\n79#13:835\n83#13:841\n83#13:846\n77#13,2:879\n79#13:909\n83#13:916\n81#14:917\n81#14:918\n81#14:919\n107#14,2:920\n81#14:922\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen\n*L\n91#1:646,11\n295#1:848,11\n92#1:657\n228#1:764\n297#1:859\n507#1:862\n545#1:870\n106#1:658,4\n106#1:666,2\n106#1:672\n106#1:662\n112#1:673\n155#1:697,8\n155#1:711,3\n157#1:733,8\n157#1:747,3\n157#1:751,3\n155#1:756,3\n229#1:782,8\n229#1:796,3\n252#1:818,8\n252#1:832,3\n252#1:837,3\n229#1:842,3\n508#1:863\n546#1:871\n619#1:892,8\n619#1:906,3\n619#1:912,3\n106#1:663,3\n106#1:669,3\n112#1:674,6\n508#1:864,6\n546#1:872,6\n106#1:668\n155#1:680,6\n155#1:714\n155#1:760\n155#1:686,11\n157#1:722,11\n157#1:754\n155#1:759\n229#1:771,11\n252#1:807,11\n252#1:840\n229#1:845\n619#1:881,11\n619#1:915\n155#1:705,6\n157#1:741,6\n229#1:790,6\n252#1:826,6\n619#1:900,6\n157#1:715,7\n157#1:750\n157#1:755\n216#1:761\n217#1:762\n218#1:763\n233#1:765\n262#1:836\n272#1:847\n490#1:860\n500#1:861\n622#1:878\n633#1:910\n635#1:911\n229#1:766,5\n229#1:799\n252#1:800,7\n252#1:835\n252#1:841\n229#1:846\n619#1:879,2\n619#1:909\n619#1:916\n97#1:917\n267#1:918\n508#1:919\n508#1:920,2\n546#1:922\n*E\n"})
public final class VipScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final VipScreen INSTANCE = new VipScreen();

    @NotNull
    private static final String KA_VIP_LEVEL = "KA_VIP_LEVEL";

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30253OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30254OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<VipShopExchangeModel, Unit> f30255OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30256OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(VipVm vipVm, Function0<Unit> function0, Function1<? super VipShopExchangeModel, Unit> function1, int i) {
            super(2);
            this.f30254OooO0o0 = vipVm;
            this.f30253OooO0o = function0;
            this.f30255OooO0oO = function1;
            this.f30256OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.BuyConfirmDialog(this.f30254OooO0o0, this.f30253OooO0o, this.f30255OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30256OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30257OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f30258OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f30259OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<VipShopExchangeModel, Unit> f30260OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(VipVm vipVm, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, Function1<? super VipShopExchangeModel, Unit> function1) {
            super(0);
            this.f30257OooO0Oo = vipVm;
            this.f30259OooO0o0 = o0o0ooo0;
            this.f30258OooO0o = lifecycleOwner;
            this.f30260OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipVm vipVm = this.f30257OooO0Oo;
            p420o0OoO0OO.o0OO00O<ApiResult<VipShopExchangeModel>> o0oo00oShopExchange = vipVm.shopExchange(vipVm.getCurrentUserWelfareModel().getShopId());
            v0.OooO0O0(o0oo00oShopExchange, this.f30259OooO0o0, false, 6);
            o000O000.OooO0Oo(o0oo00oShopExchange, this.f30258OooO0o, true, null, new com.yalla.yalla.ui.screen.user.vip.OooO00o(vipVm), new com.yalla.yalla.ui.screen.user.vip.OooO0O0(this.f30260OooO0oO), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f30261OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f30262OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30263OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30264OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipVm vipVm, Function0<Unit> function0) {
            super(0);
            this.f30263OooO0Oo = vipVm;
            this.f30264OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            switch (this.f30263OooO0Oo.getCurrentErrorCode()) {
                case 3030:
                case 3031:
                case 3034:
                case 3036:
                    oOO0OO.OooO00o(true, false, null);
                    break;
                case 3037:
                case 3038:
                    this.f30264OooO0o0.invoke();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f30265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30266OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(p184o00o00o.Oooo000 oooo000, CoroutineScope coroutineScope) {
            super(1);
            this.f30265OooO0Oo = coroutineScope;
            this.f30266OooO0o0 = oooo000;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            BuildersKt__Builders_commonKt.launch$default(this.f30265OooO0Oo, null, null, new com.yalla.yalla.ui.screen.user.vip.OooO0OO(this.f30266OooO0o0, num.intValue(), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$2$1", f = "VipScreen.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30267OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30268OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p184o00o00o.Oooo000 f30269OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(p184o00o00o.Oooo000 oooo000) {
                super(0);
                this.f30269OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f30269OooO0Oo.OooO0oO());
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$2$1$2", f = "VipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f30270OooO0Oo;

            public OooO0O0(Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(continuation);
                oooO0O0.f30270OooO0Oo = ((Number) obj).intValue();
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o0OO000.OooO0O0("305002", MapsKt.mapOf(TuplesKt.to("source", Boxing.boxInt(this.f30270OooO0Oo + 1))));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(p184o00o00o.Oooo000 oooo000, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f30268OooO0o0 = oooo000;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f30268OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30267OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(this.f30268OooO0o0));
                OooO0O0 oooO0O0 = new OooO0O0(null);
                this.f30267OooO0Oo = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, oooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f30271OooO0Oo;

        public OooOOO(State<PersonalVipModel> state) {
            this.f30271OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            VipScreen.Content$lambda$0(this.f30271OooO0Oo).setShowPremiumFirst(bool.booleanValue());
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<VipLevel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f30272OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30273OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(p184o00o00o.Oooo000 oooo000, CoroutineScope coroutineScope) {
            super(1);
            this.f30272OooO0Oo = coroutineScope;
            this.f30273OooO0o0 = oooo000;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipLevel vipLevel) {
            VipLevel it = vipLevel;
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(this.f30272OooO0Oo, null, null, new com.yalla.yalla.ui.screen.user.vip.OooO0o(this.f30273OooO0o0, it, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f30274OooO0Oo;

        public OooOOOO(State<PersonalVipModel> state) {
            this.f30274OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            VipScreen.Content$lambda$0(this.f30274OooO0Oo).setStealthVisit(bool.booleanValue());
        }
    }

    public static final class OooOo implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30275OooO0Oo;

        public OooOo(VipVm vipVm) {
            this.f30275OooO0Oo = vipVm;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            this.f30275OooO0Oo.refreshShopList();
        }
    }

    public static final class OooOo00 implements Observer<VipShopExchangeModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30276OooO0Oo;

        public OooOo00(VipVm vipVm) {
            this.f30276OooO0Oo = vipVm;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(VipShopExchangeModel vipShopExchangeModel) {
            VipShopExchangeModel it = vipShopExchangeModel;
            Intrinsics.checkNotNullParameter(it, "it");
            VipVm vipVm = this.f30276OooO0Oo;
            vipVm.getPersonalKaVipModel().getValue().setPointBalance(it.getPointBalance());
            vipVm.getPersonalKaVipModel().getValue().setExpiringPoint(it.getExpiringPoint());
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30278OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f30279OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(ColumnScope columnScope, int i) {
            super(2);
            this.f30279OooO0o0 = columnScope;
            this.f30278OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30278OooO0o | 1);
            VipScreen.this.Content(this.f30279OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$8", f = "VipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30280OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(VipVm vipVm, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f30280OooO0Oo = vipVm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f30280OooO0Oo, continuation);
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
            this.f30280OooO0Oo.loadKaVipModel();
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000 f30281OooO0Oo = new o0000();

        public o0000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f30283OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30284OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30285OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30286OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(BoxScope boxScope, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f30284OooO0o0 = boxScope;
            this.f30283OooO0o = vipVm;
            this.f30285OooO0oO = personalVipModel;
            this.f30286OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.UpgradeDialog(this.f30284OooO0o0, this.f30283OooO0o, this.f30285OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30286OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30287OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(VipVm vipVm) {
            super(0);
            this.f30287OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipVm vipVm = this.f30287OooO0Oo;
            vipVm.setOpenDialog(false);
            vipVm.updateVipDialogState();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$UpgradeDialog$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,645:1\n154#2:646\n154#2:682\n154#2:717\n154#2:723\n154#2:724\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:770\n154#2:771\n72#3,6:647\n78#3:681\n72#3,6:725\n78#3:759\n82#3:769\n82#3:776\n78#4,11:653\n78#4,11:688\n91#4:721\n78#4,11:731\n91#4:768\n91#4:775\n456#5,8:664\n464#5,3:678\n456#5,8:699\n464#5,3:713\n467#5,3:718\n456#5,8:742\n464#5,3:756\n467#5,3:765\n467#5,3:772\n4144#6,6:672\n4144#6,6:707\n4144#6,6:750\n67#7,5:683\n72#7:716\n76#7:722\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$UpgradeDialog$2\n*L\n396#1:646\n404#1:682\n409#1:717\n431#1:723\n434#1:724\n437#1:760\n444#1:761\n447#1:762\n450#1:763\n452#1:764\n466#1:770\n473#1:771\n394#1:647,6\n394#1:681\n429#1:725,6\n429#1:759\n429#1:769\n394#1:776\n394#1:653,11\n401#1:688,11\n401#1:721\n429#1:731,11\n429#1:768\n394#1:775\n394#1:664,8\n394#1:678,3\n401#1:699,8\n401#1:713,3\n401#1:718,3\n429#1:742,8\n429#1:756,3\n429#1:765,3\n394#1:772,3\n394#1:672,6\n401#1:707,6\n429#1:750,6\n401#1:683,5\n401#1:716\n401#1:722\n*E\n"})
    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30288OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30289OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f30290OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipVm f30291OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(BoxScope boxScope, int i, PersonalVipModel personalVipModel, VipVm vipVm) {
            super(2);
            this.f30288OooO0Oo = boxScope;
            this.f30290OooO0o0 = i;
            this.f30289OooO0o = personalVipModel;
            this.f30291OooO0oO = vipVm;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1690817976, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.UpgradeDialog.<anonymous> (VipScreen.kt:392)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(280));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = this.f30288OooO0Oo.align(modifierM528width3ABfNKs, companion2.getCenter());
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(arrangement, centerHorizontally, composer2, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(66));
                Alignment center = companion2.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 33;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), 0.0f, 1, null);
                long j = o0oO0O0o.f46946OooO0O0;
                SpacerKt.Spacer(boxScopeInstance.align(BackgroundKt.m169backgroundbw27NRU$default(modifierFillMaxWidth$default, j, null, 2, null), companion2.getBottomCenter()), composer2, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_upgrade_dialog_header, composer2, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                int i = this.f30290OooO0o0;
                String strOooO00o = android.support.v4.media.OooO00o.OooO00o("VIP", i > 0 ? i : VipLevel.Vip1.getValue());
                long sp = TextUnitKt.getSp(21);
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                int iM3671getCentere0LSkKk = companion4.m3671getCentere0LSkKk();
                Modifier modifierAlign2 = boxScopeInstance.align(companion, companion2.getCenter());
                TextUnitType.Companion companion5 = TextUnitType.INSTANCE;
                int value = i;
                TextKt.m1251Text4IGK_g(strOooO00o, modifierAlign2, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, companion5.m3979getSpUIouoOA()), (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130416);
                p426o0OoOO.o000oOoO.OooO00o(composer2);
                float f2 = 20;
                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 3, null)), j, null, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(26), 7, null);
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooOOO0.OooO0O0(arrangement, centerHorizontally2, composer2, 48, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO0O1, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                float f3 = 15;
                p150o00Oo0oO.o00000O.OooO00o(f3, companion, composer2, 6);
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_upgrade_dialog_content, composer2, 0);
                String[] strArr = new String[1];
                if (value <= 0) {
                    value = VipLevel.Vip1.getValue();
                }
                strArr[0] = String.valueOf(value);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(strStringResource, strArr), PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f3), 0.0f, 2, null), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37711OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, companion5.m3979getSpUIouoOA()), (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130416);
                p150o00Oo0oO.o00000O.OooO00o(14, companion, composer2, 6);
                p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
                PersonalVipModel personalVipModel = this.f30289OooO0o;
                p517o0o0O0o.OooOOOO.OooOo0O(null, Integer.valueOf(personalVipModel.getKaVIPLv()), 0.0f, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(120)), composer2, 286720, 13);
                p150o00Oo0oO.o00000O.OooO00o(12, companion, composer2, 6);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_upgrade_dialog_valid_time, composer2, 0), p601o0oo0O0.o0000oo.OooO0OO(personalVipModel.getExpireTimeStamp(), "dd/MM/yyyy")), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37710OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, companion5.m3979getSpUIouoOA()), (TextDecoration) null, TextAlign.m3664boximpl(companion4.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130418);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_upgrade_dialog_close, composer2, 0), (String) null, ClickableKt.m202clickableXHw0xAI$default(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), false, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOOO(this.f30291OooO0oO), 7, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function4<Integer, VipWelfareModel, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30292OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(VipVm vipVm) {
            super(4);
            this.f30292OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(Integer num, VipWelfareModel vipWelfareModel, Composer composer, Integer num2) {
            num.intValue();
            VipWelfareModel item = vipWelfareModel;
            Composer composer2 = composer;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter(item, "item");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141061150, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.WelfarePointsInfo.<anonymous> (VipScreen.kt:272)");
            }
            VipVm vipVm = this.f30292OooO0Oo;
            o0O00OOO.OooO0Oo(item, new com.yalla.yalla.ui.screen.user.vip.OooOOOO(vipVm, item), new com.yalla.yalla.ui.screen.user.vip.OooOo00(vipVm, item), composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$WelfarePointsInfo$1\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,645:1\n17#2,5:646\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$WelfarePointsInfo$1\n*L\n239#1:646,5\n*E\n"})
    public static final class o00000O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30293OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30294OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(Context context, PersonalVipModel personalVipModel) {
            super(0);
            this.f30293OooO0Oo = context;
            this.f30294OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("105127", MapsKt.mapOf(TuplesKt.to("source", 2)));
            Context context = this.f30293OooO0Oo;
            Intent intent = new Intent(context, (Class<?>) UserWelfareMallActivity.class);
            PersonalVipModel personalVipModel = this.f30294OooO0o0;
            intent.putExtra("POINT_BALANCE", personalVipModel.getPointBalance());
            intent.putExtra("EXPIRING_POINT", personalVipModel.getExpiringPoint());
            intent.putExtra("POINT_FROZEN", personalVipModel.getPointFrozen());
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30296OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30297OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30298OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f30297OooO0o0 = vipVm;
            this.f30296OooO0o = personalVipModel;
            this.f30298OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30298OooO0oO | 1);
            VipVm vipVm = this.f30297OooO0o0;
            PersonalVipModel personalVipModel = this.f30296OooO0o;
            VipScreen.this.WelfarePointsInfo(vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30300OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30301OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30302OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O00(VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f30301OooO0o0 = vipVm;
            this.f30300OooO0o = personalVipModel;
            this.f30302OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30302OooO0oO | 1);
            VipVm vipVm = this.f30301OooO0o0;
            PersonalVipModel personalVipModel = this.f30300OooO0o;
            VipScreen.this.WhatAppDialog(vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30303OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f30304OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f30305OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(PersonalVipModel personalVipModel, Context context, MutableState<Boolean> mutableState) {
            super(0);
            this.f30303OooO0Oo = personalVipModel;
            this.f30305OooO0o0 = context;
            this.f30304OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PersonalVipModel personalVipModel = this.f30303OooO0Oo;
            try {
                boolean zWhatAppDialog$lambda$8 = VipScreen.WhatAppDialog$lambda$8(this.f30304OooO0o);
                Context context = this.f30305OooO0o0;
                if (zWhatAppDialog$lambda$8 && (!StringsKt.isBlank(personalVipModel.getKaServeAddr()))) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(personalVipModel.getKaServeAddr()));
                    intent.setPackage("com.whatsapp");
                    context.startActivity(intent);
                } else {
                    oO000O0O.OooO0O0(context, "com.whatsapp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0000oo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f30306OooO0Oo;

        public o0000oo(com.yalla.yalla.ui.screen.user.vip.OooO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30306OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f30306OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f30306OooO0Oo;
        }

        public final int hashCode() {
            return this.f30306OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30306OooO0Oo.invoke(obj);
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30308OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30309OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(VipVm vipVm, int i) {
            super(2);
            this.f30309OooO0o0 = vipVm;
            this.f30308OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30308OooO0o | 1);
            VipScreen.this.PrivilegeBottom(this.f30309OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f30312OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(BoxScope boxScope, int i) {
            super(2);
            this.f30312OooO0o0 = boxScope;
            this.f30311OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f30311OooO0o | 1);
            VipScreen.this.HeaderBackground(this.f30312OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ScrollState f30314OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30315OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30316OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30317OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(VipVm vipVm, ScrollState scrollState, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f30315OooO0o0 = vipVm;
            this.f30314OooO0o = scrollState;
            this.f30316OooO0oO = personalVipModel;
            this.f30317OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.KaVipToolbar(this.f30315OooO0o0, this.f30314OooO0o, this.f30316OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30317OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$backgroundColor$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$backgroundColor$2$1\n*L\n548#1:646\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function0<Color> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScrollState f30318OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(ScrollState scrollState) {
            super(0);
            this.f30318OooO0Oo = scrollState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Color invoke() {
            return Color.m1660boximpl(((float) this.f30318OooO0Oo.getValue()) > Dp.m3765constructorimpl((float) 118) ? o0oO0O0o.f47009o000000 : o0oO0O0o.f46945OooO00o);
        }
    }

    public static final class o00Ooo extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30319OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(VipVm vipVm) {
            super(3);
            this.f30319OooO0Oo = vipVm;
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
                    ComposerKt.traceEventStart(-132795485, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.MainContent.<anonymous>.<anonymous>.<anonymous> (VipScreen.kt:163)");
                }
                o0O00OO.OooO00o(new com.yalla.yalla.ui.screen.user.vip.OooOOO0(this.f30319OooO0Oo), 0, null, 0L, null, null, composer2, 0, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$MainContent$1$1$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n66#2,6:646\n72#2:680\n76#2:767\n78#3,11:652\n78#3,11:687\n78#3,11:724\n91#3:756\n91#3:761\n91#3:766\n456#4,8:663\n464#4,3:677\n456#4,8:698\n464#4,3:712\n456#4,8:735\n464#4,3:749\n467#4,3:753\n467#4,3:758\n467#4,3:763\n4144#5,6:671\n4144#5,6:706\n4144#5,6:743\n72#6,6:681\n78#6:715\n71#6,7:717\n78#6:752\n82#6:757\n82#6:762\n154#7:716\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$MainContent$1$1$3\n*L\n165#1:646,6\n165#1:680\n165#1:767\n165#1:652,11\n168#1:687,11\n170#1:724,11\n170#1:756\n168#1:761\n165#1:766\n165#1:663,8\n165#1:677,3\n168#1:698,8\n168#1:712,3\n170#1:735,8\n170#1:749,3\n170#1:753,3\n168#1:758,3\n165#1:763,3\n165#1:671,6\n168#1:706,6\n170#1:743,6\n168#1:681,6\n168#1:715\n170#1:717,7\n170#1:752\n170#1:757\n168#1:762\n169#1:716\n*E\n"})
    public static final class o00oO0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScrollState f30320OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f30321OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30322OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30323OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30324OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(ScrollState scrollState, p184o00o00o.Oooo000 oooo000, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(3);
            this.f30320OooO0Oo = scrollState;
            this.f30322OooO0o0 = oooo000;
            this.f30321OooO0o = vipVm;
            this.f30323OooO0oO = personalVipModel;
            this.f30324OooO0oo = i;
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
                    ComposerKt.traceEventStart(-2068717343, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.MainContent.<anonymous>.<anonymous>.<anonymous> (VipScreen.kt:163)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, this.f30320OooO0Oo, false, null, false, 14, null);
                p184o00o00o.Oooo000 oooo000 = this.f30322OooO0o0;
                VipVm vipVm = this.f30321OooO0o;
                PersonalVipModel personalVipModel = this.f30323OooO0oO;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VipScreen vipScreen = VipScreen.INSTANCE;
                vipScreen.HeaderBackground(boxScopeInstance, composer2, 54);
                Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(companion);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierStatusBarsPadding);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(44)), composer2, 6);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                vipScreen.PrivilegeBanner(oooo000, vipVm, personalVipModel, composer2, ((this.f30324OooO0oo >> 3) & 14) | 3648);
                o0O00oO0.OooO0OO(oooo000.OooO0oO(), vipVm, personalVipModel, composer2, 576);
                vipScreen.WelfarePointsInfo(vipVm, personalVipModel, composer2, 456);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
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

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30325OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(VipVm vipVm) {
            super(0);
            this.f30325OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f30325OooO0Oo.getOpenWhatAppDialog().setValue(Boolean.TRUE);
            o0OO000.OooO00o("105044");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function4<p184o00o00o.OooOo00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30326OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30327OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(VipVm vipVm, PersonalVipModel personalVipModel) {
            super(4);
            this.f30326OooO0Oo = vipVm;
            this.f30327OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p184o00o00o.OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
            p184o00o00o.OooOo00 HorizontalPager = oooOo00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-7626219, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.PrivilegeBanner.<anonymous> (VipScreen.kt:218)");
                }
                VipInfoHeadCardKt.OooO0Oo(iIntValue, this.f30326OooO0Oo, this.f30327OooO0o0, composer2, ((iIntValue2 >> 3) & 14) | 576);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<VipShopExchangeModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30328OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(VipVm vipVm) {
            super(1);
            this.f30328OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipShopExchangeModel vipShopExchangeModel) {
            VipShopExchangeModel it = vipShopExchangeModel;
            Intrinsics.checkNotNullParameter(it, "it");
            VipVm vipVm = this.f30328OooO0Oo;
            vipVm.getCurrentUserWelfareModel().setEnable(it.getIsEnable());
            vipVm.getPersonalKaVipModel().getValue().setPointBalance(it.getPointBalance());
            vipVm.getPersonalKaVipModel().getValue().setExpiringPoint(it.getExpiringPoint());
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipScreen f30329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f30331OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30332OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30333OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(int i, p184o00o00o.Oooo000 oooo000, PersonalVipModel personalVipModel, VipScreen vipScreen, VipVm vipVm) {
            super(2);
            this.f30329OooO0Oo = vipScreen;
            this.f30331OooO0o0 = vipVm;
            this.f30330OooO0o = oooo000;
            this.f30332OooO0oO = personalVipModel;
            this.f30333OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f30329OooO0Oo.MainContent(this.f30331OooO0o0, this.f30330OooO0o, this.f30332OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30333OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n154#2:649\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$1\n*L\n560#1:646\n583#1:647\n589#1:648\n609#1:649\n*E\n"})
    public static final class o0OoOo0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30334OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30335OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f30336OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(VipVm vipVm, AppCompatActivity appCompatActivity, PersonalVipModel personalVipModel) {
            super(3);
            this.f30334OooO0Oo = vipVm;
            this.f30336OooO0o0 = appCompatActivity;
            this.f30335OooO0o = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(75531610, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.KaVipToolbar.<anonymous> (VipScreen.kt:553)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.icon_nav_vip_information, composer2, 0);
                long j = o0oO0O0o.f46946OooO0O0;
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), false, false, 0L, false, null, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOO0(this.f30336OooO0o0), 255), j, composer2, 56, 0);
                composer2.startReplaceableGroup(-1847921342);
                if (this.f30334OooO0Oo.getOpenSettingSwitch()) {
                    oo0O.OooO00o(12, companion, composer2, 6);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.svg_setting, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), false, false, 0L, false, null, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOO0O(this.f30335OooO0o), 255), j, composer2, 56, 0);
                }
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(6)), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30337OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(VipVm vipVm) {
            super(0);
            this.f30337OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f30337OooO0Oo.refreshShopList();
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f30338OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(VipVm vipVm) {
            super(0);
            this.f30338OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f30338OooO0Oo.loadKaVipModel();
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipScreen f30339OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f30340OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p184o00o00o.Oooo000 f30341OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f30342OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30343OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(int i, p184o00o00o.Oooo000 oooo000, PersonalVipModel personalVipModel, VipScreen vipScreen, VipVm vipVm) {
            super(2);
            this.f30339OooO0Oo = vipScreen;
            this.f30341OooO0o0 = oooo000;
            this.f30340OooO0o = vipVm;
            this.f30342OooO0oO = personalVipModel;
            this.f30343OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f30339OooO0Oo.PrivilegeBanner(this.f30341OooO0o0, this.f30340OooO0o, this.f30342OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30343OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    private VipScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalVipModel Content$lambda$0(State<PersonalVipModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void HeaderBackground(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1872293597);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1872293597, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.HeaderBackground (VipScreen.kt:484)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_background_2, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(120), 0.0f, 0.0f, 13, null));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(modifierStatusBarsPadding, companion2.getTopCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_background_1, composerStartRestartGroup, 0), (String) null, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(355)), companion2.getTopCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3512, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void KaVipToolbar(VipVm vipVm, ScrollState scrollState, PersonalVipModel personalVipModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-171937639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-171937639, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.KaVipToolbar (VipScreen.kt:538)");
        }
        p149o00Oo0o0.o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new o00Oo0(scrollState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.single_vip_title, composerStartRestartGroup, 0);
        int i2 = o0oO0O0o.f47152o00OOOo;
        t1.OooO00o(strStringResource, 0.0f, o0oO0O0o.f46946OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 75531610, true, new o0OoOo0(vipVm, appCompatActivity, personalVipModel)), BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, KaVipToolbar$lambda$11((State) objRememberedValue), null, 2, null), composerStartRestartGroup, 12582912, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(vipVm, scrollState, personalVipModel, i));
    }

    private static final long KaVipToolbar$lambda$11(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PrivilegeBanner(p184o00o00o.Oooo000 oooo000, VipVm vipVm, PersonalVipModel personalVipModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1029080400);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1029080400, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.PrivilegeBanner (VipScreen.kt:205)");
        }
        Pager.OooO00o(vipVm.getKaVipModels().size(), SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(221)), oooo000, false, Dp.m3765constructorimpl(8), PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(16)), null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -7626219, true, new o0OO00O(vipVm, personalVipModel)), composerStartRestartGroup, ((i << 6) & 896) | 221232, 6, 968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(i, oooo000, personalVipModel, this, vipVm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void WelfarePointsInfo(VipVm vipVm, PersonalVipModel personalVipModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1780216836);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1780216836, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.WelfarePointsInfo (VipScreen.kt:226)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(PaddingKt.m479paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(12)), false, false, 0L, false, null, null, null, new o00000O0(context, personalVipModel), 255);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.welfare_benefit_points_mall, composerStartRestartGroup, 0), (Modifier) null, Color.INSTANCE.m1707getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131026);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.welfare_view_more, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f46954OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.wealfare_arrow_right, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        r3.OooO00o(WelfarePointsInfo$lambda$6(FlowExtKt.collectAsStateWithLifecycle(vipVm.getTopShopItemList(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7)), 2, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141061150, true, new o00000O(vipVm)), composerStartRestartGroup, 25016, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000OO(vipVm, personalVipModel, i));
    }

    private static final List<VipWelfareModel> WelfarePointsInfo$lambda$6(State<? extends List<VipWelfareModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WhatAppDialog$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WhatAppDialog$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void navigate$default(VipScreen vipScreen, VipLevel vipLevel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vipLevel = VipLevel.Vip0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        vipScreen.navigate(vipLevel, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:29:0x0206  */
    /* JADX WARN: Code duplicated, block: B:31:0x0218  */
    /* JADX WARN: Code duplicated, block: B:34:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x022b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x022d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0234  */
    /* JADX WARN: Code duplicated, block: B:39:0x023b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0242  */
    /* JADX WARN: Code duplicated, block: B:41:0x0249  */
    /* JADX WARN: Code duplicated, block: B:44:0x0286  */
    /* JADX WARN: Code duplicated, block: B:48:0x0290  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BuyConfirmDialog(@NotNull VipVm vipVm, @NotNull Function0<Unit> itemNotAvailable, @NotNull Function1<? super VipShopExchangeModel, Unit> onSuccess, @Nullable Composer composer, int i) {
        int i2;
        OooO0OO oooO0OO;
        String strOooO00o;
        int currentErrorCode;
        String strOooO0OO;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(itemNotAvailable, "itemNotAvailable");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(373308796);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(373308796, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.BuyConfirmDialog (VipScreen.kt:289)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0O0OOO0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int i3 = oO00OOo0.welfare_error_3034;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(3030, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3030, composerStartRestartGroup, 0)), TuplesKt.to(3031, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3031, composerStartRestartGroup, 0)), TuplesKt.to(3032, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3032, composerStartRestartGroup, 0)), TuplesKt.to(3033, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3033, composerStartRestartGroup, 0)), TuplesKt.to(3034, StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0)), TuplesKt.to(3035, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3035, composerStartRestartGroup, 0)), TuplesKt.to(3036, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3036, composerStartRestartGroup, 0)), TuplesKt.to(3037, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3037, composerStartRestartGroup, 0)), TuplesKt.to(3038, StringResources_androidKt.stringResource(oO00OOo0.welfare_error_3038, composerStartRestartGroup, 0)));
        p158o00OoOOO.oo000o.OooO0Oo(vipVm.getShowBuyDialog(), com.code.android.util.o0000.OooO0OO(oO00OOo0.Confirm), vipVm.getCurrentUserWelfareModel().getTimeLong() > 0 ? o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_buy_tip), String.valueOf(vipVm.getCurrentUserWelfareModel().getPrice()), String.valueOf(vipVm.getCurrentUserWelfareModel().getTimeLong())) : o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_buy_tip2), String.valueOf(vipVm.getCurrentUserWelfareModel().getPrice())), null, false, false, null, null, com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_redeem), false, null, false, new OooO00o(vipVm, o0o0ooo0, lifecycleOwner, onSuccess), null, false, false, null, OooO0O0.f30261OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913144);
        int currentErrorCode2 = vipVm.getCurrentErrorCode();
        if (currentErrorCode2 != 3030 && currentErrorCode2 != 3031) {
            i2 = 3036;
            if (currentErrorCode2 != 3034 && currentErrorCode2 != 3036) {
                oooO0OO = null;
            }
            OooO0OO oooO0OO2 = oooO0OO;
            MutableState<Boolean> showBuyResultDialog = vipVm.getShowBuyResultDialog();
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_redeem_failed);
            if (vipVm.getCurrentErrorCode() == 3034) {
                strOooO00o = o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(i3), String.valueOf(vipVm.getCurrentUserWelfareModel().getExchangeLevel() / 100));
            } else {
                strOooO00o = (String) mapMapOf.get(Integer.valueOf(vipVm.getCurrentErrorCode()));
                if (strOooO00o == null) {
                    strOooO00o = "";
                }
            }
            currentErrorCode = vipVm.getCurrentErrorCode();
            if (currentErrorCode != 3030) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_become_vip);
            } else if (currentErrorCode != 3031) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Unfreeze_VIP);
            } else if (currentErrorCode != 3034) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.vip_level_up);
            } else if (currentErrorCode != i2) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.yl_dialog_OK);
            } else {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_recharge);
            }
            p158o00OoOOO.oo000o.OooO0Oo(showBuyResultDialog, strOooO0OO2, strOooO00o, null, false, false, null, null, strOooO0OO, false, null, false, new OooO0o(vipVm, itemNotAvailable), null, false, false, null, oooO0OO2, null, null, composerStartRestartGroup, 0, 0, 913144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(vipVm, itemNotAvailable, onSuccess, i));
        }
        i2 = 3036;
        oooO0OO = OooO0OO.f30262OooO0Oo;
        OooO0OO oooO0OO3 = oooO0OO;
        MutableState<Boolean> showBuyResultDialog2 = vipVm.getShowBuyResultDialog();
        String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_redeem_failed);
        if (vipVm.getCurrentErrorCode() == 3034) {
            strOooO00o = o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(i3), String.valueOf(vipVm.getCurrentUserWelfareModel().getExchangeLevel() / 100));
        } else {
            strOooO00o = (String) mapMapOf.get(Integer.valueOf(vipVm.getCurrentErrorCode()));
            if (strOooO00o == null) {
                strOooO00o = "";
            }
        }
        currentErrorCode = vipVm.getCurrentErrorCode();
        if (currentErrorCode != 3030) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_become_vip);
        } else if (currentErrorCode != 3031) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Unfreeze_VIP);
        } else if (currentErrorCode != 3034) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.vip_level_up);
        } else if (currentErrorCode != i2) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.yl_dialog_OK);
        } else {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.welfare_recharge);
        }
        p158o00OoOOO.oo000o.OooO0Oo(showBuyResultDialog2, strOooO0OO3, strOooO00o, null, false, false, null, null, strOooO0OO, false, null, false, new OooO0o(vipVm, itemNotAvailable), null, false, false, null, oooO0OO3, null, null, composerStartRestartGroup, 0, 0, 913144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(vipVm, itemNotAvailable, onSuccess, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1919841548);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919841548, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.Content (VipScreen.kt:89)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(VipVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            VipVm vipVm = (VipVm) viewModel;
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            VipLevel vipLevel = VipLevel.Vip0;
            int kaVIPLv = bundleOooO0O0.getInt(KA_VIP_LEVEL, vipLevel.getValue());
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(vipVm.getPersonalKaVipModel(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            VipLevel.Companion companion = VipLevel.INSTANCE;
            if (kaVIPLv <= vipLevel.getValue()) {
                kaVIPLv = Content$lambda$0(stateCollectAsStateWithLifecycle).getKaVIPLv();
            }
            p184o00o00o.Oooo000 oooo000OooO00o = p184o00o00o.o000oOoO.OooO00o(RangesKt.coerceAtLeast(companion.of(kaVIPLv).level() - 1, 0), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            vipVm.setKaVipChangeListener(new OooOO0(oooo000OooO00o, coroutineScope));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(oooo000OooO00o);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new OooOO0O(oooo000OooO00o, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(oooo000OooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            MainContent(vipVm, oooo000OooO00o, Content$lambda$0(stateCollectAsStateWithLifecycle), composerStartRestartGroup, ((i2 << 6) & 7168) | 520);
            h5.f52341OooO00o.OooO00o(vipVm.getAddVip6Dialog(), new OooOOO0(oooo000OooO00o, coroutineScope), composerStartRestartGroup, 384, 0);
            Observable<Object> observable = LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.KA_VIP_SHOW_PREMIUM_FIRST)");
            p417o0OoO0.o00000O.OooO00o(observable, new OooOOO(stateCollectAsStateWithLifecycle), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.KA_VIP_INVISIBLE_ISITOR)");
            p417o0OoO0.o00000O.OooO00o(observable2, new OooOOOO(stateCollectAsStateWithLifecycle), composerStartRestartGroup, 8);
            Observable<Object> observable3 = LiveEventBus.get("WELFARE_INFO_CHANGE");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.WELFARE_INFO_CHANGE)");
            p417o0OoO0.o00000O.OooO00o(observable3, new OooOo00(vipVm), composerStartRestartGroup, 8);
            Observable<Object> observable4 = LiveEventBus.get("WELFARE_ITEM_OUT_OF_STOCK_NOTIFY");
            Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.WELFARE_ITEM_OUT_OF_STOCK_NOTIFY)");
            p417o0OoO0.o00000O.OooO00o(observable4, new OooOo(vipVm), composerStartRestartGroup, 8);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new Oooo000(vipVm, null), composerStartRestartGroup, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(@NotNull VipVm vipVm, @NotNull p184o00o00o.Oooo000 pagerState, @NotNull PersonalVipModel personalKaVipModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(personalKaVipModel, "personalKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(4596963);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4596963, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.MainContent (VipScreen.kt:153)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f47009o000000, null, 2, null);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        p150o00Oo0oO.o0000Ooo.OooO0o0(vipVm.getContentState(), false, androidx.compose.foundation.layout.OooOO0.OooO00o(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -132795485, true, new o00Ooo(vipVm)), new oo000o(vipVm), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2068717343, true, new o00oO0o(scrollStateRememberScrollState, pagerState, vipVm, personalKaVipModel, i)), composerStartRestartGroup, 12779520, 26);
        composerStartRestartGroup.startReplaceableGroup(570729538);
        if (personalKaVipModel.getKaVIPState() != VipState.NotVip.getValue()) {
            INSTANCE.PrivilegeBottom(vipVm, composerStartRestartGroup, 56);
        }
        p148o00Oo0o.o0ooOOo.OooO00o(composerStartRestartGroup);
        VipScreen vipScreen = INSTANCE;
        vipScreen.KaVipToolbar(vipVm, scrollStateRememberScrollState, personalKaVipModel, composerStartRestartGroup, 3592);
        vipScreen.UpgradeDialog(boxScopeInstance, vipVm, personalKaVipModel, composerStartRestartGroup, 3654);
        vipScreen.WhatAppDialog(vipVm, personalKaVipModel, composerStartRestartGroup, 456);
        vipScreen.BuyConfirmDialog(vipVm, new o0ooOOo(vipVm), new o0OOO0o(vipVm), composerStartRestartGroup, 3080);
        o0O0o0.OooO00o(vipVm.getShowProfilePreViewDialog(), vipVm.getCurrentUserWelfareModel(), vipVm.getShowBuyDialog(), composerStartRestartGroup, 64);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(i, pagerState, personalKaVipModel, this, vipVm));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PrivilegeBottom(@NotNull VipVm vipVm, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-659454975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-659454975, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.PrivilegeBottom (VipScreen.kt:617)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(55)), false, null, null, new o0O0O00(vipVm), 7, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_contact_yalla, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        oo0O.OooO00o(4, companion, composerStartRestartGroup, 6);
        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_contact_yalla, composerStartRestartGroup, 0);
        long sp = TextUnitKt.getSp(12);
        int i2 = o0oO0O0o.f47152o00OOOo;
        TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o0oO0O0o.f47120o00O0Oo0, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3958TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3979getSpUIouoOA()), TextDecoration.INSTANCE.getUnderline(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 100666368, 0, 130674);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(vipVm, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void UpgradeDialog(@NotNull BoxScope boxScope, @NotNull VipVm vipVm, @NotNull PersonalVipModel personalKaVipModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(personalKaVipModel, "personalKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2051260666);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2051260666, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.UpgradeDialog (VipScreen.kt:385)");
        }
        if (vipVm.getOpenDialog()) {
            AndroidDialog_androidKt.Dialog(new o000000(vipVm), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1690817976, true, new o000000O(boxScope, VipLevel.INSTANCE.of(personalKaVipModel.getKaVIPLv()).level(), personalKaVipModel, vipVm)), composerStartRestartGroup, 384, 2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000(boxScope, vipVm, personalKaVipModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void WhatAppDialog(@NotNull VipVm vipVm, @NotNull PersonalVipModel personalKaVipModel, @Nullable Composer composer, int i) {
        String strStringResource;
        String strStringResource2;
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(personalKaVipModel, "personalKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(2035385724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2035385724, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.WhatAppDialog (VipScreen.kt:505)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (vipVm.getOpenWhatAppDialog().getValue().booleanValue()) {
            WhatAppDialog$lambda$9(mutableState, oO000O0O.OooO00o(context, "com.whatsapp"));
        }
        MutableState<Boolean> openWhatAppDialog = vipVm.getOpenWhatAppDialog();
        if (WhatAppDialog$lambda$8(mutableState)) {
            composerStartRestartGroup.startReplaceableGroup(-640439821);
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_open_whatsapp, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-640439753);
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_open_market, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (WhatAppDialog$lambda$8(mutableState)) {
            composerStartRestartGroup.startReplaceableGroup(-640439654);
            strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.OK, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-640439609);
            strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.user_ka_vip_open_market_download, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        p158o00OoOOO.oo000o.OooO0Oo(openWhatAppDialog, null, strStringResource, null, false, false, null, null, strStringResource2, false, null, false, new o0000Ooo(personalKaVipModel, context, mutableState), null, false, false, null, o0000.f30281OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913146);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000O00(vipVm, personalKaVipModel, i));
    }

    public final void navigate(@NotNull VipLevel kaVipLevel, boolean needNewTask) {
        Intrinsics.checkNotNullParameter(kaVipLevel, "kaVipLevel");
        oo0oOO0.OooO0o0(INSTANCE, p063o0000oO.o00Ooo.OooO0O0(new Pair(KA_VIP_LEVEL, Integer.valueOf(kaVipLevel.getValue()))), needNewTask, null, 8);
    }
}
