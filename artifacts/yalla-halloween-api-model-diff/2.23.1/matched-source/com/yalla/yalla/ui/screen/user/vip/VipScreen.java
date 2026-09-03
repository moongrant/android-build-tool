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
import p022Oooo00O.o00O00OO;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p196o00o0OOO.oo00o;
import p207o00o0oO0.o000O0Oo;
import p425o0OoO0OO.o00;
import p426o0OoO0Oo.o00OO00O;
import p450o0OoOoo.oo0oOO0;
import p477o0Ooooo0.o0O0o;
import p492o0o00O0O.o0O00;
import p492o0o00O0O.o0O000Oo;
import p515o0o0O00.o0O0oo0o;
import p515o0o0O00.o0oOO;
import p525o0o0O0oo.o0O0ooO;
import p532o0o0OOOO.o0O00OOO;
import p532o0o0OOOO.o0O0o000;
import p532o0o0OOOO.o0O0o00O;
import p545o0o0OoOo.b6;
import p545o0o0OoOo.c6;
import p545o0o0OoOo.f6;
import p545o0o0OoOo.r6;
import p546o0o0Ooo0.oO0o0000;
import p577o0oOoOOO.f;
import p587o0oOooO.oOO0O0O0;
import p587o0oOooO.ooOOOOoo;
import p593o0oOoooO.h0;
import p675oO0Oo.e7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016J\u0013\u0010\u001a\u001a\u00020\b*\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001e2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b0 H\u0007¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\b*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010\fJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/¨\u00068²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u00104\u001a\b\u0012\u0004\u0012\u000203028\nX\u008a\u0084\u0002²\u0006\u000e\u00105\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0002068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/vip/VipScreen;", "Lo0o0OOOO/o0O00OOO;", "Lo00oOo0o/o000000;", "pagerState", "Lcom/yalla/yalla/ui/vm/room/VipVm;", "vipVm", "Lcom/yalla/yalla/model/PersonalVipModel;", "personalKaVipModel", "", "PrivilegeBanner", "(Lo00oOo0o/o000000;Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "WelfarePointsInfo", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "HeaderBackground", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/ScrollState;", "scrollState", "KaVipToolbar", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Landroidx/compose/foundation/ScrollState;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/model/VipLevel;", "kaVipLevel", "", "needNewTask", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lo00oOo0o/o000000;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "itemNotAvailable", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/vip/VipShopExchangeModel;", "Lkotlin/ParameterName;", "name", DeviceRequestsHelper.DEVICE_INFO_MODEL, "onSuccess", "BuyConfirmDialog", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UpgradeDialog", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/ui/vm/room/VipVm;Lcom/yalla/yalla/model/PersonalVipModel;Landroidx/compose/runtime/Composer;I)V", "WhatAppDialog", "PrivilegeBottom", "(Lcom/yalla/yalla/ui/vm/room/VipVm;Landroidx/compose/runtime/Composer;I)V", "", VipScreen.KA_VIP_LEVEL, "Ljava/lang/String;", "<init>", "()V", "", "Lcom/yalla/yalla/model/vip/VipWelfareModel;", "list", "isInstallWhatsApp", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,645:1\n81#2,11:646\n81#2,11:862\n76#3:657\n76#3:778\n76#3:873\n76#3:876\n76#3:884\n486#4,4:658\n490#4,2:666\n494#4:672\n25#5:662\n36#5:673\n36#5:680\n36#5:687\n456#5,8:711\n464#5,3:725\n456#5,8:747\n464#5,3:761\n467#5,3:765\n467#5,3:770\n456#5,8:796\n464#5,3:810\n456#5,8:832\n464#5,3:846\n467#5,3:851\n467#5,3:856\n25#5:877\n25#5:885\n456#5,8:906\n464#5,3:920\n467#5,3:926\n1097#6,3:663\n1100#6,3:669\n1097#6,6:674\n1097#6,6:681\n1097#6,6:688\n1097#6,6:878\n1097#6,6:886\n486#7:668\n66#8,6:694\n72#8:728\n76#8:774\n78#9,11:700\n78#9,11:736\n91#9:768\n91#9:773\n78#9,11:785\n78#9,11:821\n91#9:854\n91#9:859\n78#9,11:895\n91#9:929\n4144#10,6:719\n4144#10,6:755\n4144#10,6:804\n4144#10,6:840\n4144#10,6:914\n71#11,7:729\n78#11:764\n82#11:769\n154#12:775\n154#12:776\n154#12:777\n154#12:779\n154#12:850\n154#12:861\n154#12:874\n154#12:875\n154#12:892\n154#12:924\n154#12:925\n74#13,5:780\n79#13:813\n72#13,7:814\n79#13:849\n83#13:855\n83#13:860\n77#13,2:893\n79#13:923\n83#13:930\n81#14:931\n81#14:932\n81#14:933\n107#14,2:934\n81#14:936\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen\n*L\n91#1:646,11\n295#1:862,11\n92#1:657\n228#1:778\n297#1:873\n507#1:876\n545#1:884\n106#1:658,4\n106#1:666,2\n106#1:672\n106#1:662\n112#1:673\n133#1:680\n136#1:687\n155#1:711,8\n155#1:725,3\n157#1:747,8\n157#1:761,3\n157#1:765,3\n155#1:770,3\n229#1:796,8\n229#1:810,3\n252#1:832,8\n252#1:846,3\n252#1:851,3\n229#1:856,3\n508#1:877\n546#1:885\n619#1:906,8\n619#1:920,3\n619#1:926,3\n106#1:663,3\n106#1:669,3\n112#1:674,6\n133#1:681,6\n136#1:688,6\n508#1:878,6\n546#1:886,6\n106#1:668\n155#1:694,6\n155#1:728\n155#1:774\n155#1:700,11\n157#1:736,11\n157#1:768\n155#1:773\n229#1:785,11\n252#1:821,11\n252#1:854\n229#1:859\n619#1:895,11\n619#1:929\n155#1:719,6\n157#1:755,6\n229#1:804,6\n252#1:840,6\n619#1:914,6\n157#1:729,7\n157#1:764\n157#1:769\n216#1:775\n217#1:776\n218#1:777\n233#1:779\n262#1:850\n272#1:861\n490#1:874\n500#1:875\n622#1:892\n633#1:924\n635#1:925\n229#1:780,5\n229#1:813\n252#1:814,7\n252#1:849\n252#1:855\n229#1:860\n619#1:893,2\n619#1:923\n619#1:930\n97#1:931\n267#1:932\n508#1:933\n508#1:934,2\n546#1:936\n*E\n"})
public final class VipScreen extends o0O00OOO {
    public static final int $stable = 0;

    @NotNull
    public static final VipScreen INSTANCE = new VipScreen();

    @NotNull
    private static final String KA_VIP_LEVEL = "KA_VIP_LEVEL";

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29719OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29720OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<VipShopExchangeModel, Unit> f29721OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29722OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(VipVm vipVm, Function0<Unit> function0, Function1<? super VipShopExchangeModel, Unit> function1, int i) {
            super(2);
            this.f29720OooO0o0 = vipVm;
            this.f29719OooO0o = function0;
            this.f29721OooO0oO = function1;
            this.f29722OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.BuyConfirmDialog(this.f29720OooO0o0, this.f29719OooO0o, this.f29721OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29722OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29724OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ f f29725OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<VipShopExchangeModel, Unit> f29726OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(VipVm vipVm, f fVar, LifecycleOwner lifecycleOwner, Function1<? super VipShopExchangeModel, Unit> function1) {
            super(0);
            this.f29723OooO0Oo = vipVm;
            this.f29725OooO0o0 = fVar;
            this.f29724OooO0o = lifecycleOwner;
            this.f29726OooO0oO = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipVm vipVm = this.f29723OooO0Oo;
            o00OO00O<ApiResult<VipShopExchangeModel>> o00oo00oShopExchange = vipVm.shopExchange(vipVm.getCurrentUserWelfareModel().getShopId());
            o0oOO.OooO0O0(o00oo00oShopExchange, this.f29725OooO0o0, false, 6);
            p386o0OOoo0O.o00Oo0.OooO0Oo(o00oo00oShopExchange, this.f29724OooO0o, true, null, new com.yalla.yalla.ui.screen.user.vip.OooO00o(vipVm), new com.yalla.yalla.ui.screen.user.vip.OooO0O0(this.f29726OooO0oO), 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f29727OooO0Oo = new OooO0O0();

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
        public static final OooO0OO f29728OooO0Oo = new OooO0OO();

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
        public final /* synthetic */ VipVm f29729OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29730OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(VipVm vipVm, Function0<Unit> function0) {
            super(0);
            this.f29729OooO0Oo = vipVm;
            this.f29730OooO0o0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            switch (this.f29729OooO0Oo.getCurrentErrorCode()) {
                case 3030:
                case 3031:
                case 3034:
                case 3036:
                    oOO0O0O0.OooO00o(true, false, null);
                    break;
                case 3037:
                case 3038:
                    this.f29730OooO0o0.invoke();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f29731OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29732OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(p230o00oOo0o.o000000 o000000Var, CoroutineScope coroutineScope) {
            super(1);
            this.f29731OooO0Oo = coroutineScope;
            this.f29732OooO0o0 = o000000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            BuildersKt__Builders_commonKt.launch$default(this.f29731OooO0Oo, null, null, new com.yalla.yalla.ui.screen.user.vip.OooO0OO(this.f29732OooO0o0, num.intValue(), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$2$1", f = "VipScreen.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f29733OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29734OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p230o00oOo0o.o000000 f29735OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(p230o00oOo0o.o000000 o000000Var) {
                super(0);
                this.f29735OooO0Oo = o000000Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f29735OooO0Oo.OooO0oO());
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$2$1$2", f = "VipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f29736OooO0Oo;

            public OooO0O0(Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(continuation);
                oooO0O0.f29736OooO0Oo = ((Number) obj).intValue();
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
                h0.OooO0OO("305002", MapsKt.mapOf(TuplesKt.to("source", Boxing.boxInt(this.f29736OooO0Oo + 1))));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(p230o00oOo0o.o000000 o000000Var, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f29734OooO0o0 = o000000Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f29734OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29733OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(this.f29734OooO0o0));
                OooO0O0 oooO0O0 = new OooO0O0(null);
                this.f29733OooO0Oo = 1;
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

    public static final class OooOOO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f29737OooO0Oo;

        public OooOOO(State<PersonalVipModel> state) {
            this.f29737OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            VipScreen.Content$lambda$0(this.f29737OooO0Oo).setShowPremiumFirst(((Boolean) obj).booleanValue());
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<VipLevel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f29738OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29739OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(p230o00oOo0o.o000000 o000000Var, CoroutineScope coroutineScope) {
            super(1);
            this.f29738OooO0Oo = coroutineScope;
            this.f29739OooO0o0 = o000000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipLevel vipLevel) {
            VipLevel it = vipLevel;
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(this.f29738OooO0Oo, null, null, new com.yalla.yalla.ui.screen.user.vip.OooO0o(this.f29739OooO0o0, it, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<PersonalVipModel> f29740OooO0Oo;

        public OooOOOO(State<PersonalVipModel> state) {
            this.f29740OooO0Oo = state;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            VipScreen.Content$lambda$0(this.f29740OooO0Oo).setStealthVisit(((Boolean) obj).booleanValue());
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29742OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29743OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(ColumnScope columnScope, int i) {
            super(2);
            this.f29743OooO0o0 = columnScope;
            this.f29742OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29742OooO0o | 1);
            VipScreen.this.Content(this.f29743OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.user.vip.VipScreen$Content$8", f = "VipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29744OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(VipVm vipVm, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f29744OooO0Oo = vipVm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f29744OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f29744OooO0Oo.loadKaVipModel();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n154#2:649\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$1\n*L\n560#1:646\n583#1:647\n589#1:648\n609#1:649\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29745OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29746OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f29747OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(VipVm vipVm, AppCompatActivity appCompatActivity, PersonalVipModel personalVipModel) {
            super(3);
            this.f29745OooO0Oo = vipVm;
            this.f29747OooO0o0 = appCompatActivity;
            this.f29746OooO0o = personalVipModel;
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
                    ComposerKt.traceEventStart(75531610, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.KaVipToolbar.<anonymous> (VipScreen.kt:554)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(p565o0oOo000.oo0o0Oo.icon_nav_vip_information, composer2, 0);
                long j = o0O0o.f48093OooO0O0;
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOO0(this.f29747OooO0o0), 255), j, composer2, 56, 0);
                composer2.startReplaceableGroup(-1847921342);
                if (this.f29745OooO0Oo.getOpenSettingSwitch()) {
                    oo0oOO0.OooO00o(12, companion, composer2, 6);
                    IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.svg_setting, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), false, false, 0L, false, null, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOO0O(this.f29746OooO0o), 255), j, composer2, 56, 0);
                }
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(6)), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29749OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29750OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(BoxScope boxScope, int i) {
            super(2);
            this.f29750OooO0o0 = boxScope;
            this.f29749OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29749OooO0o | 1);
            VipScreen.this.HeaderBackground(this.f29750OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f29751OooO0Oo;

        public o0000(com.yalla.yalla.ui.screen.user.vip.OooO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29751OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f29751OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29751OooO0Oo;
        }

        public final int hashCode() {
            return this.f29751OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29751OooO0Oo.invoke(obj);
        }
    }

    public static final class o00000 extends Lambda implements Function4<Integer, VipWelfareModel, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29752OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(VipVm vipVm) {
            super(4);
            this.f29752OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(Integer num, VipWelfareModel vipWelfareModel, Composer composer, Integer num2) {
            num.intValue();
            VipWelfareModel item = vipWelfareModel;
            Composer composer2 = composer;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter(item, "item");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141061150, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.WelfarePointsInfo.<anonymous> (VipScreen.kt:273)");
            }
            VipVm vipVm = this.f29752OooO0Oo;
            c6.OooO0Oo(item, new com.yalla.yalla.ui.screen.user.vip.OooOOOO(vipVm, item), new com.yalla.yalla.ui.screen.user.vip.OooOo00(vipVm, item), composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f29754OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29755OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29756OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29757OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(BoxScope boxScope, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29755OooO0o0 = boxScope;
            this.f29754OooO0o = vipVm;
            this.f29756OooO0oO = personalVipModel;
            this.f29757OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.UpgradeDialog(this.f29755OooO0o0, this.f29754OooO0o, this.f29756OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29757OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$WelfarePointsInfo$1\n+ 2 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt\n*L\n1#1,645:1\n17#2,5:646\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$WelfarePointsInfo$1\n*L\n239#1:646,5\n*E\n"})
    public static final class o000000O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29758OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29759OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(Context context, PersonalVipModel personalVipModel) {
            super(0);
            this.f29758OooO0Oo = context;
            this.f29759OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0OO("105127", MapsKt.mapOf(TuplesKt.to("source", 2)));
            Context context = this.f29758OooO0Oo;
            Intent intent = new Intent(context, (Class<?>) UserWelfareMallActivity.class);
            PersonalVipModel personalVipModel = this.f29759OooO0o0;
            intent.putExtra("POINT_BALANCE", personalVipModel.getPointBalance());
            intent.putExtra("EXPIRING_POINT", personalVipModel.getExpiringPoint());
            intent.putExtra("POINT_FROZEN", personalVipModel.getPointFrozen());
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29760OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29761OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f29762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(PersonalVipModel personalVipModel, Context context, MutableState<Boolean> mutableState) {
            super(0);
            this.f29760OooO0Oo = personalVipModel;
            this.f29762OooO0o0 = context;
            this.f29761OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PersonalVipModel personalVipModel = this.f29760OooO0Oo;
            try {
                boolean zWhatAppDialog$lambda$12 = VipScreen.WhatAppDialog$lambda$12(this.f29761OooO0o);
                Context context = this.f29762OooO0o0;
                if (zWhatAppDialog$lambda$12 && (!StringsKt.isBlank(personalVipModel.getKaServeAddr()))) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(personalVipModel.getKaServeAddr()));
                    intent.setPackage("com.whatsapp");
                    context.startActivity(intent);
                } else {
                    ooOOOOoo.OooO0O0(context, "com.whatsapp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29764OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29765OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29766OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29765OooO0o0 = vipVm;
            this.f29764OooO0o = personalVipModel;
            this.f29766OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29766OooO0oO | 1);
            VipVm vipVm = this.f29765OooO0o0;
            PersonalVipModel personalVipModel = this.f29764OooO0o;
            VipScreen.this.WelfarePointsInfo(vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000OO f29767OooO0Oo = new o00000OO();

        public o00000OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29769OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29770OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29771OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29770OooO0o0 = vipVm;
            this.f29769OooO0o = personalVipModel;
            this.f29771OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29771OooO0oO | 1);
            VipVm vipVm = this.f29770OooO0o0;
            PersonalVipModel personalVipModel = this.f29769OooO0o;
            VipScreen.this.WhatAppDialog(vipVm, personalVipModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$UpgradeDialog$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,645:1\n154#2:646\n154#2:682\n154#2:717\n154#2:723\n154#2:724\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:770\n154#2:771\n72#3,6:647\n78#3:681\n72#3,6:725\n78#3:759\n82#3:769\n82#3:776\n78#4,11:653\n78#4,11:688\n91#4:721\n78#4,11:731\n91#4:768\n91#4:775\n456#5,8:664\n464#5,3:678\n456#5,8:699\n464#5,3:713\n467#5,3:718\n456#5,8:742\n464#5,3:756\n467#5,3:765\n467#5,3:772\n4144#6,6:672\n4144#6,6:707\n4144#6,6:750\n67#7,5:683\n72#7:716\n76#7:722\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$UpgradeDialog$2\n*L\n396#1:646\n404#1:682\n409#1:717\n431#1:723\n434#1:724\n437#1:760\n444#1:761\n447#1:762\n450#1:763\n452#1:764\n466#1:770\n473#1:771\n394#1:647,6\n394#1:681\n429#1:725,6\n429#1:759\n429#1:769\n394#1:776\n394#1:653,11\n401#1:688,11\n401#1:721\n429#1:731,11\n429#1:768\n394#1:775\n394#1:664,8\n394#1:678,3\n401#1:699,8\n401#1:713,3\n401#1:718,3\n429#1:742,8\n429#1:756,3\n429#1:765,3\n394#1:772,3\n394#1:672,6\n401#1:707,6\n429#1:750,6\n401#1:683,5\n401#1:716\n401#1:722\n*E\n"})
    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29772OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29773OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29774OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipVm f29775OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(BoxScope boxScope, int i, PersonalVipModel personalVipModel, VipVm vipVm) {
            super(2);
            this.f29772OooO0Oo = boxScope;
            this.f29774OooO0o0 = i;
            this.f29773OooO0o = personalVipModel;
            this.f29775OooO0oO = vipVm;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1690817976, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.UpgradeDialog.<anonymous> (VipScreen.kt:393)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM530width3ABfNKs = SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(280));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = this.f29772OooO0Oo.align(modifierM530width3ABfNKs, companion2.getCenter());
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(arrangement, centerHorizontally, composer2, 48, -1323940314);
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(66));
                Alignment center = companion2.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 33;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), 0.0f, 1, null);
                long j = o0O0o.f48093OooO0O0;
                SpacerKt.Spacer(boxScopeInstance.align(BackgroundKt.m171backgroundbw27NRU$default(modifierFillMaxWidth$default, j, null, 2, null), companion2.getBottomCenter()), composer2, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.user_ka_vip_upgrade_dialog_header, composer2, 0), (String) null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                int i = this.f29774OooO0o0;
                String strOooO00o = android.support.v4.media.OooO00o.OooO00o("VIP", i > 0 ? i : VipLevel.Vip1.getValue());
                long sp = TextUnitKt.getSp(21);
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                int iM3681getCentere0LSkKk = companion4.m3681getCentere0LSkKk();
                Modifier modifierAlign2 = boxScopeInstance.align(companion, companion2.getCenter());
                TextUnitType.Companion companion5 = TextUnitType.INSTANCE;
                int value = i;
                TextKt.m1261Text4IGK_g(strOooO00o, modifierAlign2, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130416);
                o00O00OO.OooO0O0(composer2);
                float f2 = 20;
                Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 3, null)), j, null, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(26), 7, null);
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0.OooO00o(arrangement, centerHorizontally2, composer2, 48, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                float f3 = 15;
                p196o00o0OOO.o00O00OO.OooO00o(f3, companion, composer2, 6);
                String strStringResource = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_upgrade_dialog_content, composer2, 0);
                String[] strArr = new String[1];
                if (value <= 0) {
                    value = VipLevel.Vip1.getValue();
                }
                strArr[0] = String.valueOf(value);
                TextKt.m1261Text4IGK_g(o0000O.OooO00o(strStringResource, strArr), PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 2, null), o0000oo.OooO0OO(composer2).f38622OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130416);
                p196o00o0OOO.o00O00OO.OooO00o(14, companion, composer2, 6);
                o0O0ooO o0o0ooo = o0O0ooO.f53105OooO00o;
                PersonalVipModel personalVipModel = this.f29773OooO0o;
                o0O0ooO.OooOo0O(null, Integer.valueOf(personalVipModel.getKaVIPLv()), 0.0f, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(120)), composer2, 286720, 13);
                p196o00o0OOO.o00O00OO.OooO00o(12, companion, composer2, 6);
                TextKt.m1261Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_upgrade_dialog_valid_time, composer2, 0), p606o0oo0O0.OooOOOO.OooO0OO(personalVipModel.getExpireTimeStamp(), "dd/MM/yyyy")), (Modifier) null, o0000oo.OooO0OO(composer2).f38621OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, companion5.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(companion4.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130418);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composer2, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.user_ka_vip_upgrade_dialog_close, composer2, 0), (String) null, ClickableKt.m204clickableXHw0xAI$default(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), false, null, null, new com.yalla.yalla.ui.screen.user.vip.OooOOO(this.f29775OooO0oO), 7, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ScrollState f29777OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29778OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29779OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29780OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(VipVm vipVm, ScrollState scrollState, PersonalVipModel personalVipModel, int i) {
            super(2);
            this.f29778OooO0o0 = vipVm;
            this.f29777OooO0o = scrollState;
            this.f29779OooO0oO = personalVipModel;
            this.f29780OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VipScreen.this.KaVipToolbar(this.f29778OooO0o0, this.f29777OooO0o, this.f29779OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29780OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29781OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(VipVm vipVm) {
            super(3);
            this.f29781OooO0Oo = vipVm;
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
                b6.OooO00o(new com.yalla.yalla.ui.screen.user.vip.OooOOO0(this.f29781OooO0Oo), 0, null, 0L, null, null, composer2, 0, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29782OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(VipVm vipVm) {
            super(0);
            this.f29782OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29782OooO0Oo.loadKaVipModel();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$MainContent$1$1$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n66#2,6:646\n72#2:680\n76#2:767\n78#3,11:652\n78#3,11:687\n78#3,11:724\n91#3:756\n91#3:761\n91#3:766\n456#4,8:663\n464#4,3:677\n456#4,8:698\n464#4,3:712\n456#4,8:735\n464#4,3:749\n467#4,3:753\n467#4,3:758\n467#4,3:763\n4144#5,6:671\n4144#5,6:706\n4144#5,6:743\n72#6,6:681\n78#6:715\n71#6,7:717\n78#6:752\n82#6:757\n82#6:762\n154#7:716\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$MainContent$1$1$3\n*L\n165#1:646,6\n165#1:680\n165#1:767\n165#1:652,11\n168#1:687,11\n170#1:724,11\n170#1:756\n168#1:761\n165#1:766\n165#1:663,8\n165#1:677,3\n168#1:698,8\n168#1:712,3\n170#1:735,8\n170#1:749,3\n170#1:753,3\n168#1:758,3\n165#1:763,3\n165#1:671,6\n168#1:706,6\n170#1:743,6\n168#1:681,6\n168#1:715\n170#1:717,7\n170#1:752\n170#1:757\n168#1:762\n169#1:716\n*E\n"})
    public static final class o00Ooo extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScrollState f29783OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f29784OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29785OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29786OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29787OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(ScrollState scrollState, p230o00oOo0o.o000000 o000000Var, VipVm vipVm, PersonalVipModel personalVipModel, int i) {
            super(3);
            this.f29783OooO0Oo = scrollState;
            this.f29785OooO0o0 = o000000Var;
            this.f29784OooO0o = vipVm;
            this.f29786OooO0oO = personalVipModel;
            this.f29787OooO0oo = i;
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
                    ComposerKt.traceEventStart(-2068717343, iIntValue, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.MainContent.<anonymous>.<anonymous>.<anonymous> (VipScreen.kt:164)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, this.f29783OooO0Oo, false, null, false, 14, null);
                p230o00oOo0o.o000000 o000000Var = this.f29785OooO0o0;
                VipVm vipVm = this.f29784OooO0o;
                PersonalVipModel personalVipModel = this.f29786OooO0oO;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VipScreen vipScreen = VipScreen.INSTANCE;
                vipScreen.HeaderBackground(boxScopeInstance, composer2, 54);
                Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(companion);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO00o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(44)), composer2, 6);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO00o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                vipScreen.PrivilegeBanner(o000000Var, vipVm, personalVipModel, composer2, ((this.f29787OooO0oo >> 3) & 14) | 3648);
                f6.OooO0OO(o000000Var.OooO0oO(), vipVm, personalVipModel, composer2, 576);
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

    public static final class o00oO0o extends Lambda implements Function1<VipShopExchangeModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29788OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(VipVm vipVm) {
            super(1);
            this.f29788OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipShopExchangeModel vipShopExchangeModel) {
            VipShopExchangeModel it = vipShopExchangeModel;
            Intrinsics.checkNotNullParameter(it, "it");
            VipVm vipVm = this.f29788OooO0Oo;
            vipVm.getCurrentUserWelfareModel().setEnable(it.getIsEnable());
            vipVm.getPersonalKaVipModel().getValue().setPointBalance(it.getPointBalance());
            vipVm.getPersonalKaVipModel().getValue().setExpiringPoint(it.getExpiringPoint());
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29789OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(VipVm vipVm) {
            super(0);
            this.f29789OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipVm vipVm = this.f29789OooO0Oo;
            vipVm.setOpenDialog(false);
            vipVm.updateVipDialogState();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29790OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(VipVm vipVm) {
            super(0);
            this.f29790OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29790OooO0Oo.getOpenWhatAppDialog().setValue(Boolean.TRUE);
            h0.OooO0O0("105044");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function4<p230o00oOo0o.o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29791OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29792OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(VipVm vipVm, PersonalVipModel personalVipModel) {
            super(4);
            this.f29791OooO0Oo = vipVm;
            this.f29792OooO0o0 = personalVipModel;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p230o00oOo0o.o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            p230o00oOo0o.o0O0O00 HorizontalPager = o0o0o00;
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
                    ComposerKt.traceEventStart(-7626219, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.PrivilegeBanner.<anonymous> (VipScreen.kt:220)");
                }
                VipInfoHeadCardKt.OooO0Oo(iIntValue, this.f29791OooO0Oo, this.f29792OooO0o0, composer2, ((iIntValue2 >> 3) & 14) | 576);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipScreen f29793OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ VipVm f29794OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29795OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29796OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29797OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(int i, p230o00oOo0o.o000000 o000000Var, PersonalVipModel personalVipModel, VipScreen vipScreen, VipVm vipVm) {
            super(2);
            this.f29793OooO0Oo = vipScreen;
            this.f29795OooO0o0 = o000000Var;
            this.f29794OooO0o = vipVm;
            this.f29796OooO0oO = personalVipModel;
            this.f29797OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f29793OooO0Oo.PrivilegeBanner(this.f29795OooO0o0, this.f29794OooO0o, this.f29796OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29797OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$backgroundColor$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n*S KotlinDebug\n*F\n+ 1 VipScreen.kt\ncom/yalla/yalla/ui/screen/user/vip/VipScreen$KaVipToolbar$backgroundColor$2$1\n*L\n548#1:646\n*E\n"})
    public static final class o0OoOo0 extends Lambda implements Function0<Color> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ScrollState f29798OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(ScrollState scrollState) {
            super(0);
            this.f29798OooO0Oo = scrollState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Color invoke() {
            return Color.m1671boximpl(((float) this.f29798OooO0Oo.getValue()) > Dp.m3775constructorimpl((float) 118) ? o0O0o.f48155o00000 : o0O0o.f48092OooO00o);
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipScreen f29799OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p230o00oOo0o.o000000 f29800OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29801OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PersonalVipModel f29802OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f29803OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(int i, p230o00oOo0o.o000000 o000000Var, PersonalVipModel personalVipModel, VipScreen vipScreen, VipVm vipVm) {
            super(2);
            this.f29799OooO0Oo = vipScreen;
            this.f29801OooO0o0 = vipVm;
            this.f29800OooO0o = o000000Var;
            this.f29802OooO0oO = personalVipModel;
            this.f29803OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            this.f29799OooO0Oo.MainContent(this.f29801OooO0o0, this.f29800OooO0o, this.f29802OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29803OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipVm f29804OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(VipVm vipVm) {
            super(0);
            this.f29804OooO0Oo = vipVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f29804OooO0Oo.refreshShopList();
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29806OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ VipVm f29807OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(VipVm vipVm, int i) {
            super(2);
            this.f29807OooO0o0 = vipVm;
            this.f29806OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29806OooO0o | 1);
            VipScreen.this.PrivilegeBottom(this.f29807OooO0o0, composer, iUpdateChangedFlags);
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
    public static final void Content$lambda$4(VipVm vipVm, VipShopExchangeModel it) {
        Intrinsics.checkNotNullParameter(vipVm, "$vipVm");
        Intrinsics.checkNotNullParameter(it, "it");
        vipVm.getPersonalKaVipModel().getValue().setPointBalance(it.getPointBalance());
        vipVm.getPersonalKaVipModel().getValue().setExpiringPoint(it.getExpiringPoint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$5(VipVm vipVm, boolean z) {
        Intrinsics.checkNotNullParameter(vipVm, "$vipVm");
        vipVm.refreshShopList();
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
                ComposerKt.traceEventStart(1872293597, i2, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.HeaderBackground (VipScreen.kt:484)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.user_ka_vip_background_2, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(120), 0.0f, 0.0f, 13, null));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(modifierStatusBarsPadding, companion2.getTopCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.user_ka_vip_background_1, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(355)), companion2.getTopCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3512, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void KaVipToolbar(VipVm vipVm, ScrollState scrollState, PersonalVipModel personalVipModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-171937639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-171937639, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.KaVipToolbar (VipScreen.kt:542)");
        }
        p195o00o0OO0.o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new o0OoOo0(scrollState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        String strStringResource = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.single_vip_title, composerStartRestartGroup, 0);
        int i2 = o0O0o.f48305o00OOooO;
        o0O0oo0o.OooO00o(strStringResource, 0.0f, o0O0o.f48093OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 75531610, true, new Oooo0(vipVm, appCompatActivity, personalVipModel)), BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, KaVipToolbar$lambda$15((State) objRememberedValue), null, 2, null), composerStartRestartGroup, 12582912, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(vipVm, scrollState, personalVipModel, i));
    }

    private static final long KaVipToolbar$lambda$15(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PrivilegeBanner(p230o00oOo0o.o000000 o000000Var, VipVm vipVm, PersonalVipModel personalVipModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1029080400);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1029080400, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.PrivilegeBanner (VipScreen.kt:209)");
        }
        Pager.OooO00o(vipVm.getKaVipModels().size(), SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(221)), o000000Var, false, Dp.m3775constructorimpl(8), PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(16)), null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -7626219, true, new o0OOO0o(vipVm, personalVipModel)), composerStartRestartGroup, ((i << 6) & 896) | 221232, 6, 968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(i, o000000Var, personalVipModel, this, vipVm));
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
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(PaddingKt.m481paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12)), false, false, 0L, false, null, null, null, new o000000O(context, personalVipModel), 255);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_benefit_points_mall, composerStartRestartGroup, 0), (Modifier) null, Color.INSTANCE.m1718getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131026);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_view_more, composerStartRestartGroup, 0), (Modifier) null, o0O0o.f48101OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.oo0o0Oo.wealfare_arrow_right, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        oO0o0000.OooO00o(WelfarePointsInfo$lambda$10(FlowExtKt.collectAsStateWithLifecycle(vipVm.getTopShopItemList(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7)), 2, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 141061150, true, new o00000(vipVm)), composerStartRestartGroup, 25016, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00000O0(vipVm, personalVipModel, i));
    }

    private static final List<VipWelfareModel> WelfarePointsInfo$lambda$10(State<? extends List<VipWelfareModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WhatAppDialog$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WhatAppDialog$lambda$13(MutableState<Boolean> mutableState, boolean z) {
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
            ComposerKt.traceEventStart(373308796, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.BuyConfirmDialog (VipScreen.kt:293)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(f.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        f fVar = (f) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int i3 = p565o0oOo000.o000OOo.welfare_error_3034;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(3030, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3030, composerStartRestartGroup, 0)), TuplesKt.to(3031, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3031, composerStartRestartGroup, 0)), TuplesKt.to(3032, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3032, composerStartRestartGroup, 0)), TuplesKt.to(3033, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3033, composerStartRestartGroup, 0)), TuplesKt.to(3034, StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0)), TuplesKt.to(3035, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3035, composerStartRestartGroup, 0)), TuplesKt.to(3036, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3036, composerStartRestartGroup, 0)), TuplesKt.to(3037, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3037, composerStartRestartGroup, 0)), TuplesKt.to(3038, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.welfare_error_3038, composerStartRestartGroup, 0)));
        o000O0Oo.OooO0Oo(vipVm.getShowBuyDialog(), com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Confirm), vipVm.getCurrentUserWelfareModel().getTimeLong() > 0 ? o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_buy_tip), String.valueOf(vipVm.getCurrentUserWelfareModel().getPrice()), String.valueOf(vipVm.getCurrentUserWelfareModel().getTimeLong())) : o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_buy_tip2), String.valueOf(vipVm.getCurrentUserWelfareModel().getPrice())), null, false, false, null, null, com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_redeem), false, null, false, new OooO00o(vipVm, fVar, lifecycleOwner, onSuccess), null, false, false, null, OooO0O0.f29727OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913144);
        int currentErrorCode2 = vipVm.getCurrentErrorCode();
        if (currentErrorCode2 != 3030 && currentErrorCode2 != 3031) {
            i2 = 3036;
            if (currentErrorCode2 != 3034 && currentErrorCode2 != 3036) {
                oooO0OO = null;
            }
            OooO0OO oooO0OO2 = oooO0OO;
            MutableState<Boolean> showBuyResultDialog = vipVm.getShowBuyResultDialog();
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_redeem_failed);
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
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_become_vip);
            } else if (currentErrorCode != 3031) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Unfreeze_VIP);
            } else if (currentErrorCode != 3034) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.vip_level_up);
            } else if (currentErrorCode != i2) {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.yl_dialog_OK);
            } else {
                strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_recharge);
            }
            o000O0Oo.OooO0Oo(showBuyResultDialog, strOooO0OO2, strOooO00o, null, false, false, null, null, strOooO0OO, false, null, false, new OooO0o(vipVm, itemNotAvailable), null, false, false, null, oooO0OO2, null, null, composerStartRestartGroup, 0, 0, 913144);
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
        oooO0OO = OooO0OO.f29728OooO0Oo;
        OooO0OO oooO0OO3 = oooO0OO;
        MutableState<Boolean> showBuyResultDialog2 = vipVm.getShowBuyResultDialog();
        String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_redeem_failed);
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
            strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_become_vip);
        } else if (currentErrorCode != 3031) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Unfreeze_VIP);
        } else if (currentErrorCode != 3034) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.vip_level_up);
        } else if (currentErrorCode != i2) {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.yl_dialog_OK);
        } else {
            strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welfare_recharge);
        }
        o000O0Oo.OooO0Oo(showBuyResultDialog2, strOooO0OO3, strOooO00o, null, false, false, null, null, strOooO0OO, false, null, false, new OooO0o(vipVm, itemNotAvailable), null, false, false, null, oooO0OO3, null, null, composerStartRestartGroup, 0, 0, 913144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(vipVm, itemNotAvailable, onSuccess, i));
    }

    @Override // p532o0o0OOOO.o0O00OOO
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
            Bundle bundleOooO0O0 = o0O0o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o0O0o00O.f53389OooO00o), composerStartRestartGroup);
            VipLevel vipLevel = VipLevel.Vip0;
            int kaVIPLv = bundleOooO0O0.getInt(KA_VIP_LEVEL, vipLevel.getValue());
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(vipVm.getPersonalKaVipModel(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            VipLevel.Companion companion = VipLevel.INSTANCE;
            if (kaVIPLv <= vipLevel.getValue()) {
                kaVIPLv = Content$lambda$0(stateCollectAsStateWithLifecycle).getKaVIPLv();
            }
            int i3 = 1;
            p230o00oOo0o.o000000 o000000VarOooO00o = p230o00oOo0o.o00000.OooO00o(RangesKt.coerceAtLeast(companion.of(kaVIPLv).level() - 1, 0), composerStartRestartGroup, 0, 0);
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
            vipVm.setKaVipChangeListener(new OooOO0(o000000VarOooO00o, coroutineScope));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(o000000VarOooO00o);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new OooOO0O(o000000VarOooO00o, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(o000000VarOooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            MainContent(vipVm, o000000VarOooO00o, Content$lambda$0(stateCollectAsStateWithLifecycle), composerStartRestartGroup, ((i2 << 6) & 7168) | 520);
            e7.f59135OooO00o.OooO00o(vipVm.getAddVip6Dialog(), new OooOOO0(o000000VarOooO00o, coroutineScope), composerStartRestartGroup, 384, 0);
            Observable<Object> observable = LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new OooOOO(stateCollectAsStateWithLifecycle);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00.OooO00o(observable, (Observer) objRememberedValue3, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new OooOOOO(stateCollectAsStateWithLifecycle);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00.OooO00o(observable2, (Observer) objRememberedValue4, composerStartRestartGroup, 72);
            Observable<Object> observable3 = LiveEventBus.get("WELFARE_INFO_CHANGE");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
            o00.OooO00o(observable3, new o0O000Oo(vipVm, i3), composerStartRestartGroup, 72);
            Observable<Object> observable4 = LiveEventBus.get("WELFARE_ITEM_OUT_OF_STOCK_NOTIFY");
            Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
            o00.OooO00o(observable4, new o0O00(vipVm, i3), composerStartRestartGroup, 72);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooOo00(vipVm, null), composerStartRestartGroup, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(@NotNull VipVm vipVm, @NotNull p230o00oOo0o.o000000 pagerState, @NotNull PersonalVipModel personalKaVipModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(vipVm, "vipVm");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(personalKaVipModel, "personalKaVipModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(4596963);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4596963, i, -1, "com.yalla.yalla.ui.screen.user.vip.VipScreen.MainContent (VipScreen.kt:153)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0O0o.f48305o00OOooO;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(companion, o0O0o.f48155o00000, null, 2, null);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO00o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        oo00o.OooO0o0(vipVm.getContentState(), false, androidx.compose.foundation.layout.OooOO0.OooO00o(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -132795485, true, new o00O0O(vipVm)), new o00Oo0(vipVm), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2068717343, true, new o00Ooo(scrollStateRememberScrollState, pagerState, vipVm, personalKaVipModel, i)), composerStartRestartGroup, 12779520, 26);
        composerStartRestartGroup.startReplaceableGroup(570729538);
        if (personalKaVipModel.getKaVIPState() != VipState.NotVip.getValue()) {
            INSTANCE.PrivilegeBottom(vipVm, composerStartRestartGroup, 56);
        }
        o00O000o.OooO0O0(composerStartRestartGroup);
        VipScreen vipScreen = INSTANCE;
        vipScreen.KaVipToolbar(vipVm, scrollStateRememberScrollState, personalKaVipModel, composerStartRestartGroup, 3592);
        vipScreen.UpgradeDialog(boxScopeInstance, vipVm, personalKaVipModel, composerStartRestartGroup, 3654);
        vipScreen.WhatAppDialog(vipVm, personalKaVipModel, composerStartRestartGroup, 456);
        vipScreen.BuyConfirmDialog(vipVm, new oo000o(vipVm), new o00oO0o(vipVm), composerStartRestartGroup, 3080);
        r6.OooO00o(vipVm.getShowProfilePreViewDialog(), vipVm.getCurrentUserWelfareModel(), vipVm.getShowBuyDialog(), composerStartRestartGroup, 64);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(i, pagerState, personalKaVipModel, this, vipVm));
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
        Modifier modifierM204clickableXHw0xAI$default = ClickableKt.m204clickableXHw0xAI$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(55)), false, null, null, new o0OO00O(vipVm), 7, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM204clickableXHw0xAI$default);
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
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(p565o0oOo000.o0OOO0o.user_ka_vip_contact_yalla, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        oo0oOO0.OooO00o(4, companion, composerStartRestartGroup, 6);
        String strStringResource = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_contact_yalla, composerStartRestartGroup, 0);
        long sp = TextUnitKt.getSp(12);
        int i2 = o0O0o.f48305o00OOooO;
        TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, o0O0o.f48270o00O0OoO, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), TextDecoration.INSTANCE.getUnderline(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 100666368, 0, 130674);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(vipVm, i));
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
            AndroidDialog_androidKt.Dialog(new o0O0O00(vipVm), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1690817976, true, new o000OOo(boxScope, VipLevel.INSTANCE.of(personalKaVipModel.getKaVIPLv()).level(), personalKaVipModel, vipVm)), composerStartRestartGroup, 384, 2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000(boxScope, vipVm, personalKaVipModel, i));
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
            WhatAppDialog$lambda$13(mutableState, ooOOOOoo.OooO00o(context, "com.whatsapp"));
        }
        MutableState<Boolean> openWhatAppDialog = vipVm.getOpenWhatAppDialog();
        if (WhatAppDialog$lambda$12(mutableState)) {
            composerStartRestartGroup.startReplaceableGroup(-640439821);
            strStringResource = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_open_whatsapp, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-640439753);
            strStringResource = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_open_market, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (WhatAppDialog$lambda$12(mutableState)) {
            composerStartRestartGroup.startReplaceableGroup(-640439654);
            strStringResource2 = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.OK, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-640439609);
            strStringResource2 = StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.user_ka_vip_open_market_download, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        o000O0Oo.OooO0Oo(openWhatAppDialog, null, strStringResource, null, false, false, null, null, strStringResource2, false, null, false, new o00000O(personalKaVipModel, context, mutableState), null, false, false, null, o00000OO.f29767OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913146);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0000Ooo(vipVm, personalKaVipModel, i));
    }

    public final void navigate(@NotNull VipLevel kaVipLevel, boolean needNewTask) {
        Intrinsics.checkNotNullParameter(kaVipLevel, "kaVipLevel");
        o0O0o000.OooO0o0(INSTANCE, p063o0000oO.o000oOoO.OooO0O0(new Pair(KA_VIP_LEVEL, Integer.valueOf(kaVipLevel.getValue()))), needNewTask, null, 8);
    }
}
