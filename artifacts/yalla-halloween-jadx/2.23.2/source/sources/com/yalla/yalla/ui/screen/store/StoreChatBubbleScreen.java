package com.yalla.yalla.ui.screen.store;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import com.yalla.yalla.util.WebPageInfo;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p195o00o0OO0.o00000OO;
import p196o00o0OOO.oOO00O;
import p200o00o0OoO.o00OO00O;
import p207o00o0oO0.o000O0Oo;
import p423o0OoO0OO.o000OO;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oOO;
import p516o0o0O00o.oo00oO;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p542o0o0OoOo.O0OO00;
import p542o0o0OoOo.a;
import p562o0oOo000.o000000;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001d\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u000bJ\u0013\u0010\u001e\u001a\u00020\u0006*\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%¨\u0006-²\u0006\u000e\u0010)\u001a\u0004\u0018\u00010(8\nX\u008a\u0084\u0002²\u0006\u000e\u0010*\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen;", "Lo0o0OOo0/o000O0;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM;", "vm", "", "ItemBubbleBuyButton", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM;Landroidx/compose/runtime/Composer;I)V", "onBuyClick", "Landroidx/compose/runtime/MutableState;", "", "show", "OpenPremiumDialog", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "OpenVipDialog", "buyModel", "Lo0oOoOo/o0oOo0O0;", "loadingVM", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "buyBubble", "Landroid/content/Context;", "context", "", "url", "jumpToWebObtainPage", StoreChatBubbleScreen.IS_FROM_OUTFIT, "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "ItemBubbleInfo", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;Landroidx/compose/runtime/Composer;I)V", "BuyConfirmDialog", "IS_FROM_OUTFIT", "Ljava/lang/String;", "Z", "<init>", "()V", "", "coin", "enable", "bubbleReady", "bubbleLoading", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,517:1\n76#2:518\n76#2:732\n76#2:733\n76#2:745\n81#3,11:519\n81#3,11:734\n81#3,11:746\n25#4:530\n456#4,8:557\n464#4,3:571\n50#4:575\n49#4:576\n25#4:585\n456#4,8:614\n464#4,3:628\n467#4,3:634\n456#4,8:659\n464#4,3:673\n467#4,3:677\n456#4,8:700\n464#4,3:714\n467#4,3:722\n467#4,3:727\n1097#5,6:531\n1097#5,6:577\n1097#5,6:586\n154#6:537\n154#6:538\n154#6:539\n154#6:583\n154#6:584\n154#6:592\n154#6:593\n154#6:594\n154#6:595\n154#6:596\n154#6:632\n154#6:633\n154#6:639\n154#6:640\n154#6:641\n154#6:642\n154#6:682\n154#6:718\n154#6:719\n154#6:720\n154#6:721\n66#7,6:540\n72#7:574\n67#7,5:643\n72#7:676\n76#7:681\n76#7:731\n78#8,11:546\n78#8,11:603\n91#8:637\n78#8,11:648\n91#8:680\n78#8,11:689\n91#8:725\n91#8:730\n4144#9,6:565\n4144#9,6:622\n4144#9,6:667\n4144#9,6:708\n73#10,6:597\n79#10:631\n83#10:638\n73#10,6:683\n79#10:717\n83#10:726\n81#11:757\n81#11:758\n107#11,2:759\n81#11:761\n107#11,2:762\n81#11:764\n107#11,2:765\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen\n*L\n82#1:518\n379#1:732\n406#1:733\n408#1:745\n94#1:519,11\n407#1:734,11\n410#1:746,11\n139#1:530\n181#1:557,8\n181#1:571,3\n197#1:575\n197#1:576\n227#1:585\n235#1:614,8\n235#1:628,3\n235#1:634,3\n277#1:659,8\n277#1:673,3\n277#1:677,3\n299#1:700,8\n299#1:714,3\n299#1:722,3\n181#1:727,3\n139#1:531,6\n197#1:577,6\n227#1:586,6\n164#1:537\n169#1:538\n184#1:539\n212#1:583\n220#1:584\n229#1:592\n231#1:593\n238#1:594\n239#1:595\n244#1:596\n249#1:632\n251#1:633\n269#1:639\n270#1:640\n271#1:641\n281#1:642\n302#1:682\n306#1:718\n307#1:719\n316#1:720\n332#1:721\n181#1:540,6\n181#1:574\n277#1:643,5\n277#1:676\n277#1:681\n181#1:731\n181#1:546,11\n235#1:603,11\n235#1:637\n277#1:648,11\n277#1:680\n299#1:689,11\n299#1:725\n181#1:730\n181#1:565,6\n235#1:622,6\n277#1:667,6\n299#1:708,6\n235#1:597,6\n235#1:631\n235#1:638\n299#1:683,6\n299#1:717\n299#1:726\n130#1:757\n139#1:758\n139#1:759,2\n194#1:761\n194#1:762,2\n195#1:764\n195#1:765,2\n*E\n"})
public final class StoreChatBubbleScreen extends o000O0 {

    @NotNull
    private static final String IS_FROM_OUTFIT = "isFromOutFit";
    private static boolean isFromOutFit;

    @NotNull
    public static final StoreChatBubbleScreen INSTANCE = new StoreChatBubbleScreen();
    public static final int $stable = 8;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f29291OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29292OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29293OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
            super(0);
            this.f29292OooO0Oo = context;
            this.f29293OooO0o0 = storeRoomChatBubbleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreChatBubbleScreen.INSTANCE.jumpToWebObtainPage(this.f29292OooO0Oo, this.f29293OooO0o0.getH5Url());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f29294OooO0Oo = new OooO0O0();

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
        public static final OooO0OO f29295OooO0Oo = new OooO0OO();

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
        public static final OooO0o f29296OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$BuyConfirmDialog$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29297OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f29298OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f29299OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29300OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Context f29301OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, Context context) {
            super(0);
            this.f29297OooO0Oo = storeRoomChatBubbleModel;
            this.f29299OooO0o0 = storeRoomChatBubbleVM;
            this.f29298OooO0o = o0ooo0o1;
            this.f29300OooO0oO = lifecycleOwner;
            this.f29301OooO0oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreRoomChatBubbleModel storeRoomChatBubbleModel = this.f29297OooO0Oo;
            if (storeRoomChatBubbleModel.getCanBuy()) {
                StoreChatBubbleScreen.INSTANCE.buyBubble(storeRoomChatBubbleModel, this.f29299OooO0o0, this.f29298OooO0o, this.f29300OooO0oO);
            } else if (storeRoomChatBubbleModel.getObtainType() == 1) {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = PremiumActivity.f26673Oooo0oO;
                    PremiumActivity.OooO00o.OooO00o(activityOooO0O0, PremiumLevel.INSTANCE.of(Integer.valueOf(storeRoomChatBubbleModel.getObtainLevel())));
                }
            } else if (storeRoomChatBubbleModel.getObtainType() == 2) {
                Context context2 = o000O00O.f13421OooO00o;
                if (com.code.android.util.OooO0O0.OooO0O0() != null) {
                    VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
                }
            } else if (!StringsKt.isBlank(storeRoomChatBubbleModel.getH5Url())) {
                StoreChatBubbleScreen.INSTANCE.jumpToWebObtainPage(this.f29301OooO0oo, storeRoomChatBubbleModel.getH5Url());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29303OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29304OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29304OooO0o0 = mutableState;
            this.f29303OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29303OooO0o | 1);
            StoreChatBubbleScreen.this.BuyConfirmDialog(this.f29304OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$Content$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n154#2:518\n154#2:519\n154#2:520\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$Content$1\n*L\n108#1:518\n109#1:519\n110#1:520\n*E\n"})
    public static final class OooOOO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> f29305OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f29306OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
            super(3);
            this.f29305OooO0Oo = oooOOOO;
            this.f29306OooO0o0 = storeRoomChatBubbleVM;
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
                    ComposerKt.traceEventStart(-618176693, iIntValue, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.Content.<anonymous> (StoreChatBubbleScreen.kt:105)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(Dp.m3775constructorimpl(13), Dp.m3775constructorimpl(12));
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 9;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM472PaddingValuesYgX7TsA, false, arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), null, false, new com.yalla.yalla.ui.screen.store.OooOo00(this.f29305OooO0Oo, this.f29306OooO0o0), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29308OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29309OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29309OooO0o0 = mutableState;
            this.f29308OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29308OooO0o | 1);
            StoreChatBubbleScreen.this.BuyConfirmDialog(this.f29309OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29312OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ColumnScope columnScope, int i) {
            super(2);
            this.f29312OooO0o0 = columnScope;
            this.f29311OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29311OooO0o | 1);
            StoreChatBubbleScreen.this.Content(this.f29312OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f29314OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29315OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29316OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, int i) {
            super(2);
            this.f29315OooO0o0 = storeRoomChatBubbleModel;
            this.f29314OooO0o = storeRoomChatBubbleVM;
            this.f29316OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29316OooO0oO | 1);
            StoreRoomChatBubbleModel storeRoomChatBubbleModel = this.f29315OooO0o0;
            StoreRoomChatBubbleVM storeRoomChatBubbleVM = this.f29314OooO0o;
            StoreChatBubbleScreen.this.ItemBubbleBuyButton(storeRoomChatBubbleModel, storeRoomChatBubbleVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29317OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f29318OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
            super(0);
            this.f29317OooO0Oo = storeRoomChatBubbleModel;
            this.f29318OooO0o0 = storeRoomChatBubbleVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreChatBubbleScreen.INSTANCE.onBuyClick(this.f29317OooO0Oo, this.f29318OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$ItemBubbleInfo$1$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,517:1\n489#2,11:518\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$ItemBubbleInfo$1$2$1\n*L\n198#1:518,11\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29319OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29320OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(1);
            this.f29319OooO0Oo = mutableState;
            this.f29320OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<Boolean> mutableState = this.f29319OooO0Oo;
            it.f11683OooO0o0 = new a(mutableState, mutableState, this.f29320OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f29321OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooO0o(it, new ColorDrawable(Color.parseColor("#FF2C2C34")));
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f29322OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29324OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29325OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(StoreRoomChatBubbleModel storeRoomChatBubbleModel, int i) {
            super(2);
            this.f29325OooO0o0 = storeRoomChatBubbleModel;
            this.f29324OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29324OooO0o | 1);
            StoreChatBubbleScreen.this.ItemBubbleInfo(this.f29325OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29326OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(Context context) {
            super(0);
            this.f29326OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f26673Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f29326OooO0Oo, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f29327OooO0Oo = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f29328OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29331OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29331OooO0o0 = mutableState;
            this.f29330OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29330OooO0o | 1);
            StoreChatBubbleScreen.this.OpenVipDialog(this.f29331OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$buyBubble$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n350#2,7:518\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleScreen$buyBubble$1\n*L\n499#1:518,7\n*E\n"})
    public static final class o0Oo0oo extends Lambda implements Function1<StoreRoomChatBubbleBuyModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f29332OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29333OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
            super(1);
            this.f29332OooO0Oo = storeRoomChatBubbleVM;
            this.f29333OooO0o0 = storeRoomChatBubbleModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel) {
            StoreRoomChatBubbleVM storeRoomChatBubbleVM = this.f29332OooO0Oo;
            Iterator<StoreRoomChatBubbleModel> it = storeRoomChatBubbleVM.getBubblePagingSource().f38497OooO0Oo.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getShopId() == this.f29333OooO0o0.getShopId()) {
                    break;
                }
                i++;
            }
            List<StoreRoomChatBubbleModel> list = storeRoomChatBubbleVM.getBubblePagingSource().f38497OooO0Oo;
            StoreRoomChatBubbleModel storeRoomChatBubbleModel = storeRoomChatBubbleVM.getBubblePagingSource().f38497OooO0Oo.get(i);
            list.set(i, storeRoomChatBubbleModel.copy((8387583 & 1) != 0 ? storeRoomChatBubbleModel.attachedPicUrl : null, (8387583 & 2) != 0 ? storeRoomChatBubbleModel.backgroundUrl : null, (8387583 & 4) != 0 ? storeRoomChatBubbleModel.bubbleColour : null, (8387583 & 8) != 0 ? storeRoomChatBubbleModel.canBuy : false, (8387583 & 16) != 0 ? storeRoomChatBubbleModel.canBuyUserType : 0, (8387583 & 32) != 0 ? storeRoomChatBubbleModel.dayNum : 0, (8387583 & 64) != 0 ? storeRoomChatBubbleModel.exclusiveLv : 0, (8387583 & 128) != 0 ? storeRoomChatBubbleModel.flagType : 0, (8387583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? storeRoomChatBubbleModel.frozenDay : 0, (8387583 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel.h5Url : null, (8387583 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? storeRoomChatBubbleModel.isHave : true, (8387583 & 2048) != 0 ? storeRoomChatBubbleModel.limitNum : 0, (8387583 & 4096) != 0 ? storeRoomChatBubbleModel.obtainType : 0, (8387583 & 8192) != 0 ? storeRoomChatBubbleModel.obtainLevel : 0, (8387583 & 16384) != 0 ? storeRoomChatBubbleModel.picUrl : null, (8387583 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel.price : 0, (8387583 & 65536) != 0 ? storeRoomChatBubbleModel.promotionPrice : 0, (8387583 & 131072) != 0 ? storeRoomChatBubbleModel.replyColour : null, (8387583 & 262144) != 0 ? storeRoomChatBubbleModel.selected : false, (8387583 & 524288) != 0 ? storeRoomChatBubbleModel.shopId : 0, (8387583 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? storeRoomChatBubbleModel.timeLong : 0, (8387583 & 2097152) != 0 ? storeRoomChatBubbleModel.waresName : null, (8387583 & Configuration.BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel.bubbleText : null));
            storeRoomChatBubbleVM.getBubblePagingSource().OooO0O0();
            String strOooO0OO = o0000.OooO0OO(o000000.Purchase_successful);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            if (StoreChatBubbleScreen.isFromOutFit) {
                LiveEventBus.get("OUT_FIT_CHAT_BOX_REFRESH").post(Boolean.TRUE);
                o00O00.OooO0o(null);
            } else {
                MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 2, null, false, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f29334OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f29335OooO0Oo = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29337OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29338OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29338OooO0o0 = mutableState;
            this.f29337OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29337OooO0o | 1);
            StoreChatBubbleScreen.this.OpenPremiumDialog(this.f29338OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private StoreChatBubbleScreen() {
    }

    private static final Long Content$lambda$0(State<Long> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemBubbleBuyButton(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, Composer composer, int i) {
        String strOooO0OO;
        Composer composerStartRestartGroup = composer.startRestartGroup(668790275);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668790275, i, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.ItemBubbleBuyButton (StoreChatBubbleScreen.kt:137)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (storeRoomChatBubbleModel.isHave() && storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getTimeLong() <= 0) {
            ItemBubbleBuyButton$lambda$3(mutableState, false);
            strOooO0OO = o0000.OooO0OO(o000000.Purchased);
        } else if (storeRoomChatBubbleModel.isHave() && !storeRoomChatBubbleModel.getCanBuy()) {
            ItemBubbleBuyButton$lambda$3(mutableState, true);
            strOooO0OO = o0000.OooO0OO(o000000.Obtained);
        } else if (storeRoomChatBubbleModel.isHave() || storeRoomChatBubbleModel.getCanBuy()) {
            ItemBubbleBuyButton$lambda$3(mutableState, true);
            strOooO0OO = o0000.OooO0OO(o000000.Purchase);
        } else {
            ItemBubbleBuyButton$lambda$3(mutableState, true);
            strOooO0OO = o0000.OooO0OO(o000000.Obtain);
        }
        RoundedCornerShape roundedCornerShapeM729RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(0));
        int i2 = o0OOo000.f48347o00OOooO;
        o00O0OO0.OooO00o(strOooO0OO, 0L, null, null, androidx.compose.ui.graphics.Color.m1671boximpl(o0OOo000.f48135OooO0O0), androidx.compose.ui.graphics.Color.m1671boximpl(ItemBubbleBuyButton$lambda$2(mutableState) ? o0OOo000.f48349o00Ooo : o0OOo000.f48176OoooO0), roundedCornerShapeM729RoundedCornerShape0680j_4, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(36)), 0.0f, 1, null), new OooOo00(storeRoomChatBubbleModel, storeRoomChatBubbleVM), composerStartRestartGroup, 0, 100663296, 262030);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(storeRoomChatBubbleModel, storeRoomChatBubbleVM, i));
    }

    private static final boolean ItemBubbleBuyButton$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ItemBubbleBuyButton$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ItemBubbleInfo$lambda$14$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemBubbleInfo$lambda$14$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ItemBubbleInfo$lambda$14$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemBubbleInfo$lambda$14$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OpenPremiumDialog(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482036024);
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
                ComposerKt.traceEventStart(-1482036024, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.OpenPremiumDialog (StoreChatBubbleScreen.kt:377)");
            }
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, null, o0000.OooO0OO(o000000.only_premium_purchase), null, false, false, null, null, o0000.OooO0OO(o000000.Get_Yalla_Premium), false, null, false, new o00Oo0((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, false, false, null, o00Ooo.f29327OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(mutableState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OpenVipDialog(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-494298610);
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
                ComposerKt.traceEventStart(-494298610, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.OpenVipDialog (StoreChatBubbleScreen.kt:390)");
            }
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, null, o0000.OooO0OO(o000000.only_vip_purchase), null, false, false, null, null, o0000.OooO0OO(o000000.Get_Vip), false, null, false, o00oO0o.f29328OooO0Oo, null, false, false, null, o0ooOOo.f29335OooO0Oo, null, null, composer2, i2 & 14, 12583296, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(mutableState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void buyBubble(StoreRoomChatBubbleModel buyModel, StoreRoomChatBubbleVM vm, o0oOo0O0 loadingVM, LifecycleOwner lifecycleOwner) {
        boolean z;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        int promotionPrice = buyModel.getPromotionPrice();
        T value = o0O00oO0.OooO0O0().getValue();
        Intrinsics.checkNotNull(value);
        if (((Number) value).longValue() < promotionPrice) {
            ApiError error = new ApiError(2003, null, null, 6, null);
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
            z = false;
        } else {
            z = true;
        }
        if (z) {
            o00OO0O0<ApiResult<StoreRoomChatBubbleBuyModel>> o00oo0o0BuyBubble = vm.buyBubble(buyModel.getShopId());
            o0oOO.OooO0O0(o00oo0o0BuyBubble, loadingVM, false, 6);
            p384o0OOoo0O.o00O0O.OooO0Oo(o00oo0o0BuyBubble, lifecycleOwner, false, null, null, new o0Oo0oo(buyModel, vm), 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToWebObtainPage(Context context, String url) {
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreBubbleObtain);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32283OooO0o0 = url;
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(context, webPageInfo);
    }

    public static /* synthetic */ void navigate$default(StoreChatBubbleScreen storeChatBubbleScreen, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        storeChatBubbleScreen.navigate(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBuyClick(StoreRoomChatBubbleModel model, StoreRoomChatBubbleVM vm) {
        boolean z = true;
        if (model.isHave() && (model.getObtainType() == 1 || model.getObtainType() == 2 || model.getTimeLong() <= 0)) {
            String strOooO0OO = o0000.OooO0OO(o000000.already_have);
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
        if (model.getObtainType() == 1 || model.getObtainType() == 2) {
            o0oo0000.OooO00o.OooO0OO("102244", MapsKt.mapOf(new Pair("shopid", Integer.valueOf(model.getShopId()))));
        }
        vm.setBuyModel(model);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
        if (pair == null) {
            return;
        }
        if (model.getCanBuy() && model.getCanBuyUserType() == 1 && !((Boolean) pair.getFirst()).booleanValue()) {
            vm.getShowOpenPremiumDialog().setValue(Boolean.TRUE);
            return;
        }
        Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
        if (pair2 == null) {
            return;
        }
        if (model.getCanBuy() && model.getCanBuyUserType() == 2 && !VipState.INSTANCE.of((Integer) pair2.getFirst()).isNormal()) {
            vm.getShowOpenVipDialog().setValue(Boolean.TRUE);
        } else {
            vm.getShowBuyDialog().setValue(Boolean.TRUE);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BuyConfirmDialog(@NotNull MutableState<Boolean> show, @Nullable Composer composer, int i) {
        int i2;
        String strOooO00o;
        String strOooO0OO;
        Function0 oooO00o;
        Composer composer2;
        Intrinsics.checkNotNullParameter(show, "show");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1210606255);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(show) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1210606255, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.BuyConfirmDialog (StoreChatBubbleScreen.kt:402)");
            }
            composerStartRestartGroup.startReplaceableGroup(1876100576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1876100576, 0, -1, "com.yalla.yalla.ui.composable.common.rememberLoadingDialogState (LoadingDialog.kt:64)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oo00oO(false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            oo00oO oo00oo = (oo00oO) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0oOO.OooO00o(oo00oo, null, false, composerStartRestartGroup, 8, 6);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            StoreRoomChatBubbleVM storeRoomChatBubbleVM = (StoreRoomChatBubbleVM) viewModel;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i3 = i2;
            StoreRoomChatBubbleModel buyModel = storeRoomChatBubbleVM.getBuyModel();
            if (buyModel == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(show, i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel2;
            String strOooO0OO2 = o0000.OooO0OO(o000000.Confirmation);
            boolean z = buyModel.getCanBuy() && (StringsKt.isBlank(buyModel.getH5Url()) ^ true);
            if (buyModel.getCanBuy() && buyModel.getFlagType() != 1 && buyModel.getTimeLong() == -1) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_pay_for_permanent), String.valueOf(buyModel.getPromotionPrice()));
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() != 1 && buyModel.getTimeLong() != -1) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_pay_for_days), String.valueOf(buyModel.getPromotionPrice()), String.valueOf(buyModel.getTimeLong()));
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() == 1 && buyModel.getTimeLong() == -1) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_pay_or_obtain_for_permanent), String.valueOf(buyModel.getPromotionPrice()), buyModel.getWaresName());
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() == 1 && buyModel.getTimeLong() != -1) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_pay_or_obtain_for_days), String.valueOf(buyModel.getPromotionPrice()), String.valueOf(buyModel.getTimeLong()), buyModel.getWaresName());
            } else if (!buyModel.getCanBuy() && buyModel.getObtainType() == 1) {
                String strOooO0OO3 = o0000.OooO0OO(o000000.store_obtain_premium_xxx_free);
                int i4 = UserPremiumView.f30257OooO0o0;
                strOooO00o = o0000O.OooO00o(strOooO0OO3, UserPremiumView.OooO00o.OooO0O0(buyModel.getObtainLevel()));
            } else if (!buyModel.getCanBuy() && buyModel.getObtainType() == 2) {
                strOooO00o = o0000.OooO0OO(o000000.store_obtain_vip_free);
            } else if (buyModel.getCanBuy() || buyModel.getTimeLong() != -1) {
                strOooO00o = (buyModel.getCanBuy() || buyModel.getTimeLong() == -1) ? "" : o0000O.OooO00o(o0000.OooO0OO(o000000.store_obtain_for_days), String.valueOf(buyModel.getTimeLong()), buyModel.getWaresName());
            } else {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_obtain_for_permanent), buyModel.getWaresName());
            }
            if (buyModel.getCanBuy()) {
                strOooO0OO = o0000.OooO0OO(o000000.Pay);
            } else if (buyModel.getObtainType() == 1) {
                strOooO0OO = o0000.OooO0OO(o000000.Get_Yalla_Premium);
            } else if (buyModel.getObtainType() == 2) {
                strOooO0OO = o0000.OooO0OO(o000000.Get_Vip);
            } else {
                strOooO0OO = StringsKt.isBlank(buyModel.getH5Url()) ^ true ? o0000.OooO0OO(o000000.Obtain) : o0000.OooO0OO(o000000.yl_dialog_OK);
            }
            String str = strOooO0OO;
            String strOooO0OO4 = (buyModel.getCanBuy() && (StringsKt.isBlank(buyModel.getH5Url()) ^ true)) ? o0000.OooO0OO(o000000.Obtain) : o0000.OooO0OO(o000000.yl_dialog_Cancel);
            if (buyModel.getCanBuy() && (!StringsKt.isBlank(buyModel.getH5Url()))) {
                oooO00o = new OooO00o(context, buyModel);
            } else if (buyModel.getCanBuy() && StringsKt.isBlank(buyModel.getH5Url())) {
                oooO00o = OooO0O0.f29294OooO0Oo;
            } else if (!buyModel.getCanBuy() && (!StringsKt.isBlank(buyModel.getH5Url()))) {
                oooO00o = OooO0OO.f29295OooO0Oo;
            } else if (buyModel.getCanBuy() || buyModel.getObtainType() != 1) {
                oooO00o = (buyModel.getCanBuy() || buyModel.getObtainType() != 2) ? null : OooO.f29291OooO0Oo;
            } else {
                oooO00o = OooO0o.f29296OooO0Oo;
            }
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(show, strOooO0OO2, strOooO00o, null, z, false, null, null, str, false, null, false, new OooOO0(buyModel, storeRoomChatBubbleVM, o0ooo0o1, lifecycleOwner, context), strOooO0OO4, false, false, null, oooO00o, null, null, composer2, i3 & 14, 0, 904936);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(show, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-874215289);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-874215289, i, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.Content (StoreChatBubbleScreen.kt:79)");
        }
        o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
        isFromOutFit = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup).getBoolean(IS_FROM_OUTFIT);
        String strOooO0OO = o0000.OooO0OO(o000000.Chat_Box);
        long j = o0000oo.OooO0OO(composerStartRestartGroup).f38630OooOOOO;
        ComposableLambda composableLambda = O0OO00.f55344OooO00o;
        Modifier.Companion companion = Modifier.INSTANCE;
        o0O0oo0o.OooO00o(strOooO0OO, 0.0f, j, null, null, null, null, composableLambda, BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38631OooOOOo, null, 2, null), composerStartRestartGroup, 12582912, 122);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        StoreRoomChatBubbleVM storeRoomChatBubbleVM = (StoreRoomChatBubbleVM) viewModel;
        OpenPremiumDialog(storeRoomChatBubbleVM.getShowOpenPremiumDialog(), composerStartRestartGroup, 64);
        OpenVipDialog(storeRoomChatBubbleVM.getShowOpenVipDialog(), composerStartRestartGroup, 64);
        BuyConfirmDialog(storeRoomChatBubbleVM.getShowBuyDialog(), composerStartRestartGroup, 64);
        p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(storeRoomChatBubbleVM.getBubblePagingSource().f38501OooO0oo, composerStartRestartGroup);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(companion, o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, null, 2, null), 0.0f, 1, null), 1.0f, false, 2, null);
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -618176693, true, new OooOOO(oooOOOOOooO00o, storeRoomChatBubbleVM));
        int i2 = p107o000ooO0.OooOOOO.f35803OooO0o0;
        oOO00O.OooO0o(oooOOOOOooO00o, modifierOooO00o, null, null, null, composableLambda2, composerStartRestartGroup, 196616, 28);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0O00oO0.OooO0O0(), composerStartRestartGroup, 8);
        p674oO0Oo.OooOOO0 oooOOO0 = p674oO0Oo.OooOOO0.f60111OooO00o;
        Long lContent$lambda$0 = Content$lambda$0(stateObserveAsState);
        Intrinsics.checkNotNull(lContent$lambda$0);
        oooOOO0.OooO00o(384, 2, lContent$lambda$0.longValue(), composerStartRestartGroup, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemBubbleInfo(@NotNull StoreRoomChatBubbleModel model, @Nullable Composer composer, int i) {
        Composer composer2;
        BoxScopeInstance boxScopeInstance;
        int i2;
        int i3;
        Integer numValueOf;
        int i4;
        int i5;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        int i6;
        Composer composer6;
        String strOooO0OO;
        long j;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(1759093662);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1759093662, i, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen.ItemBubbleInfo (StoreChatBubbleScreen.kt:179)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(170, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        p121o00O0Ooo.o0000 o0000VarOooO0OO = o000OO.OooO0OO(p184o00o00O0.OooO0OO.OooO0Oo(model.getBackgroundUrl()), Oooo000.f29321OooO0Oo, composerStartRestartGroup, 48, 0);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ComposeUiNode.Companion companion5 = companion3;
        ImageKt.Image(o0000VarOooO0OO, "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
        MutableState mutableState = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) o0OoOo0.f29334OooO0Oo, composerStartRestartGroup, 3080, 6);
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) o000oOoO.f29322OooO0Oo, composerStartRestartGroup, 3080, 6);
        String attachedPicUrl = model.getAttachedPicUrl();
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Oooo0(mutableState2, mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f = 30;
        ImageKt.Image(o000OO.OooO0OO(attachedPicUrl, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0), "", SizeKt.fillMaxSize$default(PaddingKt.m481paddingqDBjuR0(boxScopeInstance2.align(companion, companion2.getCenter()), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(35), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(46)), 0.0f, 1, null), (Alignment) null, companion4.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        composerStartRestartGroup.startReplaceableGroup(587310286);
        if (ItemBubbleInfo$lambda$14$lambda$4(mutableState)) {
            String bubbleText = model.getBubbleText();
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getCenter()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(11), 7, null);
            int i7 = o0OOo000.f48347o00OOooO;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(bubbleText, modifierM482paddingqDBjuR0$default, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(20, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        Composer composer7 = composer2;
        composer7.startReplaceableGroup(587310664);
        if (ItemBubbleInfo$lambda$14$lambda$6(mutableState2)) {
            composer7.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer7.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = "svga/anim_loading.svga";
                composer7.updateRememberedValue("svga/anim_loading.svga");
            }
            composer7.endReplaceableGroup();
            Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(60));
            Alignment center = companion2.getCenter();
            boxScopeInstance = boxScopeInstance2;
            i2 = 11;
            o00OO00O.OooO00o((String) objRememberedValue2, true, 0, null, null, PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(modifierM525size3ABfNKs, center), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(11), 7, null), composer7, 54, 28);
        } else {
            boxScopeInstance = r13;
            i2 = 11;
        }
        composer7.endReplaceableGroup();
        if (model.getLimitNum() > 0) {
            composer7.startReplaceableGroup(587311037);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            float f2 = 5;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(20));
            if (model.getFrozenDay() > 0) {
                int i8 = o0OOo000.f48347o00OOooO;
                j = o0OOo000.f48252o000Oo0;
            } else {
                int i9 = o0OOo000.f48347o00OOooO;
                j = o0OOo000.f48212o0000OO;
            }
            Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m170backgroundbw27NRU(modifierM511height3ABfNKs, j, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3775constructorimpl(4), 0.0f, Dp.m3775constructorimpl(6), 0.0f, 10, null);
            composer7.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composer7, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor2);
            } else {
                composer7.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer7);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer7)), composer7, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            companion5 = companion5;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_store_limit_time, composer7, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(i2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer7, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composer7, 6, 2);
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.store_xxx_days), String.valueOf(model.getLimitNum()));
            int i10 = o0OOo000.f48347o00OOooO;
            TextKt.m1261Text4IGK_g(strOooO00o, (Modifier) null, o0OOo000.f48135OooO0O0, o0000O0.OooO0OO(11, composer7, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer7, 0, 0, 131058);
            composer7.endReplaceableGroup();
            composer7.endNode();
            composer7.endReplaceableGroup();
            composer7.endReplaceableGroup();
            composer7.endReplaceableGroup();
            i5 = 1;
            i4 = 2;
            composer7 = composer7;
        } else {
            composer7.startReplaceableGroup(587312181);
            if (model.getFlagType() != 1 || model.getLimitNum() <= 0) {
                i3 = 2;
                if (model.getFlagType() == 2 || model.getObtainType() == 1) {
                    numValueOf = Integer.valueOf(p562o0oOo000.o0Oo0oo.ic_store_flag_premium);
                } else {
                    numValueOf = (model.getFlagType() == 3 || model.getObtainType() == 2) ? Integer.valueOf(p562o0oOo000.o0Oo0oo.ic_store_flag_vip) : null;
                }
            } else {
                numValueOf = Integer.valueOf(p562o0oOo000.o0Oo0oo.ic_store_flag_activity);
                i3 = 2;
            }
            i4 = i3;
            if (numValueOf != null) {
                numValueOf.intValue();
                float f3 = 6;
                ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composer7, 0), "", ClipKt.clip(SizeKt.m525size3ABfNKs(PaddingKt.m478padding3ABfNKs(companion, Dp.m3775constructorimpl(5)), Dp.m3775constructorimpl(21)), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 12, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer7, 56, 120);
                Unit unit = Unit.INSTANCE;
            }
            composer7.endReplaceableGroup();
            i5 = 1;
        }
        if (model.getCanBuy() || !(model.getObtainType() == i5 || model.getObtainType() == i4)) {
            ComposeUiNode.Companion companion6 = companion5;
            Composer composer8 = composer7;
            composer8.startReplaceableGroup(587314108);
            Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(10), 7, null);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            composer8.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically2, composer8, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer8.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default3);
            if (!(composer8.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer8.startReusableNode();
            if (composer8.getInserting()) {
                composer8.createNode(constructor3);
            } else {
                composer8.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer8);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer8)), composer8, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer8.startReplaceableGroup(829685361);
            if (model.getCanBuy()) {
                ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.coin, composer8, 0), "", SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer8, 440, 120);
                float f4 = i4;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f4), null, composer8, 6, i4);
                composer8.startReplaceableGroup(829685553);
                if (model.getPrice() > model.getPromotionPrice()) {
                    String strValueOf = String.valueOf(model.getPrice());
                    long jOooO0OO = o0000O0.OooO0OO(16, composer8, 6);
                    int i11 = o0OOo000.f48347o00OOooO;
                    TextKt.m1261Text4IGK_g(strValueOf, (Modifier) null, o0OOo000.f48301o00O0O, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer8, 100663296, 0, 130802);
                    composer6 = composer8;
                    i6 = 6;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f4), null, composer6, 6, 2);
                } else {
                    i6 = 6;
                    composer6 = composer8;
                }
                composer6.endReplaceableGroup();
                String strValueOf2 = String.valueOf(model.getPromotionPrice());
                long jOooO0OO2 = o0000O0.OooO0OO(16, composer6, i6);
                int i12 = o0OOo000.f48347o00OOooO;
                composer3 = composer6;
                TextKt.m1261Text4IGK_g(strValueOf2, (Modifier) null, o0OOo000.f48348o00Oo0, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131058);
            } else {
                composer3 = composer8;
            }
            composer3.endReplaceableGroup();
            Composer composer9 = composer3;
            composer9.startReplaceableGroup(829686347);
            if (!model.getCanBuy() || model.getTimeLong() <= 0) {
                composer4 = composer9;
            } else {
                long jOooO0OO3 = o0000O0.OooO0OO(12, composer9, 6);
                int i13 = o0OOo000.f48347o00OOooO;
                composer4 = composer9;
                TextKt.m1261Text4IGK_g("/", (Modifier) null, o0OOo000.f48348o00Oo0, jOooO0OO3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 6, 0, 131058);
            }
            composer4.endReplaceableGroup();
            Composer composer10 = composer4;
            composer10.startReplaceableGroup(587315682);
            if (model.getTimeLong() > 0) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composer10, 6, 2);
                String strOooO00o2 = o0000O.OooO00o(o0000.OooO0OO(o000000.vehicle_store_xxx_days), String.valueOf(model.getTimeLong()));
                long jOooO0OO4 = o0000O0.OooO0OO(12, composer10, 6);
                int i14 = o0OOo000.f48347o00OOooO;
                composer5 = composer10;
                TextKt.m1261Text4IGK_g(strOooO00o2, (Modifier) null, o0OOo000.f48348o00Oo0, jOooO0OO4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131058);
            } else {
                composer5 = composer10;
            }
            composer5.endReplaceableGroup();
            composer5.endReplaceableGroup();
            composer5.endNode();
            composer5.endReplaceableGroup();
            composer5.endReplaceableGroup();
            composer5.endReplaceableGroup();
        } else {
            composer7.startReplaceableGroup(587313075);
            Alignment center2 = companion2.getCenter();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, i5, null), Dp.m3775constructorimpl(24)), companion2.getBottomCenter());
            int i15 = o0OOo000.f48347o00OOooO;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierAlign, o0OOo000.f48256o000OoO, null, 2, null);
            composer7.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, false, composer7, 6);
            composer7.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor4);
            } else {
                composer7.useNode();
            }
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composer7);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl4, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer7)), composer7, 0);
            composer7.startReplaceableGroup(2058660585);
            if (model.getObtainType() == i5 && PremiumLevel.INSTANCE.of(Integer.valueOf(model.getObtainLevel())) == PremiumLevel.Premium4) {
                strOooO0OO = o0000.OooO0OO(o000000.Free_for_Count);
            } else if (model.getObtainType() == i5 && PremiumLevel.INSTANCE.of(Integer.valueOf(model.getObtainLevel())) == PremiumLevel.Premium5) {
                strOooO0OO = o0000.OooO0OO(o000000.Free_for_Marquis);
            } else {
                strOooO0OO = model.getObtainType() == i4 ? o0000.OooO0OO(o000000.Free_for_VIP) : "";
            }
            Composer composer11 = composer7;
            TextKt.m1261Text4IGK_g(strOooO0OO, (Modifier) null, o0OOo000.f48239o000O0o, o0000O0.OooO0OO(12, composer7, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer11, 0, 0, 131058);
            composer11.endReplaceableGroup();
            composer11.endNode();
            composer11.endReplaceableGroup();
            composer11.endReplaceableGroup();
            composer11.endReplaceableGroup();
            composer5 = composer11;
        }
        if (androidx.compose.material.OooO0o.OooO00o(composer5)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(model, i));
    }

    public final void navigate(boolean isFromOutFit2) {
        o00O00.OooO0o0(INSTANCE, p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to(IS_FROM_OUTFIT, Boolean.valueOf(isFromOutFit2))), false, null, 12);
    }
}
