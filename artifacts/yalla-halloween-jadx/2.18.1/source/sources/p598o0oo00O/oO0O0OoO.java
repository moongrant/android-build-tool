package p598o0oo00O;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.ToastUtil;
import com.umeng.commonsdk.internal.a;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00o00;
import p029Oooo0oO.o000O0Oo;
import p029Oooo0oO.o000OO00;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p044OooooOO.o00O00O;
import p045OooooOo.o00O0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p257o00ooOO0.o0O0oo0o;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.m;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O0O0O;
import p571o0oOo0o.o00O0OO;
import p571o0oOo0o.oo00o;
import p576o0oOoOO.o0O0OOO0;
import p584o0oOoo.o0000O;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0OoO extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0O0OoO f47813OooO00o = new oO0O0OoO();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f47814Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47815Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f47816Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
            super(0);
            this.f47815Oooo0o = context;
            this.f47816Oooo0oO = storeRoomChatBubbleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47815Oooo0o;
            String url = this.f47816Oooo0oO.getH5Url();
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreBubbleObtain);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f21217Oooo0oO = url;
            WebActivity.f22108OoooooO.OooO00o(context, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f47817Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f47818Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f47819Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47820Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f47821Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f47822Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47823Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f47824OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner, Context context) {
            super(0);
            this.f47821Oooo0o = storeRoomChatBubbleModel;
            this.f47822Oooo0oO = storeRoomChatBubbleVM;
            this.f47823Oooo0oo = oo0oo0oo;
            this.f47820Oooo = lifecycleOwner;
            this.f47824OoooO00 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = true;
            if (this.f47821Oooo0o.getCanBuy()) {
                StoreRoomChatBubbleModel storeRoomChatBubbleModel = this.f47821Oooo0o;
                StoreRoomChatBubbleVM storeRoomChatBubbleVM = this.f47822Oooo0oO;
                oO0Oo0oo oo0oo0oo = this.f47823Oooo0oo;
                LifecycleOwner lifecycleOwner = this.f47820Oooo;
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                int promotionPrice = storeRoomChatBubbleModel.getPromotionPrice();
                Long value = oooOOO.OooO0OO().getValue();
                Intrinsics.checkNotNull(value);
                if (value.longValue() < promotionPrice) {
                    ApiError error = new ApiError(2003, null, 2, null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
                    z = false;
                }
                if (z) {
                    p484o0o000OO.OooOOOO<ApiResult<StoreRoomChatBubbleBuyModel>> oooOOOOBuyBubble = storeRoomChatBubbleVM.buyBubble(storeRoomChatBubbleModel.getShopId());
                    oo00o.OooO0O0(oooOOOOBuyBubble, oo0oo0oo);
                    o0o0000.o000oOoO.OooO0Oo(oooOOOOBuyBubble, lifecycleOwner, new oO00OOOo(storeRoomChatBubbleVM, storeRoomChatBubbleModel));
                }
            } else if (this.f47821Oooo0o.getObtainType() == 1) {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                Activity activityOooO0O0 = o00O000.OooO0O0();
                if (activityOooO0O0 != null) {
                    PremiumActivity.f23360o0ooOOo.OooO00o(activityOooO0O0, PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(this.f47821Oooo0o.getObtainLevel())));
                }
            } else if (this.f47821Oooo0o.getObtainType() == 2) {
                o00O000 o00o002 = o00O000.f34346OooO00o;
                Activity activityOooO0O1 = o00O000.OooO0O0();
                if (activityOooO0O1 != null) {
                    VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
                    VipActivity.f23570OoooOOo.OooO00o(activityOooO0O1, VipLevel.Vip0);
                }
            } else if (!StringsKt.isBlank(this.f47821Oooo0o.getH5Url())) {
                Context context = this.f47824OoooO00;
                String url = this.f47821Oooo0o.getH5Url();
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreBubbleObtain);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f21217Oooo0oO = url;
                WebActivity.f22108OoooooO.OooO00o(context, webPageInfo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47826Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47827Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47826Oooo0oO = o0o00oo2;
            this.f47827Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO0o0(this.f47826Oooo0oO, ooo00o, this.f47827Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<StoreRoomChatBubbleModel> f47828Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleVM f47829Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(androidx.paging.compose.OooO0OO<StoreRoomChatBubbleModel> oooO0OO, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
            super(3);
            this.f47828Oooo0o = oooO0OO;
            this.f47829Oooo0oO = storeRoomChatBubbleVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o000O0Oo.OooO00o oooO00o = new o000O0Oo.OooO00o(2);
                float f = 13;
                float f2 = 12;
                o0O00O o0o00o2 = new o0O00O(f, f2, f, f2);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                float f3 = 9;
                o000OO00.OooO00o(oooO00o, SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, o0o00o2, false, o00o001.OooO0oo(f3), o00o001.OooO0oo(f3), null, false, new oO00O0oO(this.f47828Oooo0o, this.f47829Oooo0oO), ooo00o2, 1772592, 404);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47831Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47832Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47831Oooo0oO = o0o00oo2;
            this.f47832Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO0o0(this.f47831Oooo0oO, ooo00o, this.f47832Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47834Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47835Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47834Oooo0oO = o00o0o01;
            this.f47835Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO00o(this.f47834Oooo0oO, ooo00o, this.f47835Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<o0O00OO<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo f47836Oooo0o = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00OO<Boolean> invoke() {
            return o0OOO00.OooO0Oo(Boolean.FALSE);
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<o0O00OO<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f47837Oooo0o = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00OO<Boolean> invoke() {
            return o0OOO00.OooO0Oo(Boolean.TRUE);
        }
    }

    public static final class Oooo0 implements coil.request.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO f47838OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO f47839OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO f47840OooO0Oo;

        public Oooo0(o0O00OO o0o00oo2, o0O00OO o0o00oo3, o0O00OO o0o00oo4) {
            this.f47838OooO0O0 = o0o00oo2;
            this.f47839OooO0OO = o0o00oo3;
            this.f47840OooO0Oo = o0o00oo4;
        }

        @Override // coil.request.OooO00o.OooO0O0
        public final void OooO00o(@NotNull coil.request.OooO00o request) {
            Intrinsics.checkNotNullParameter(request, "request");
        }

        @Override // coil.request.OooO00o.OooO0O0
        public final void OooO0O0(@NotNull coil.request.OooO00o request) {
            Intrinsics.checkNotNullParameter(request, "request");
        }

        @Override // coil.request.OooO00o.OooO0O0
        public final void OooO0OO(@NotNull coil.request.OooO00o request, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f47838OooO0O0.setValue(Boolean.FALSE);
        }

        @Override // coil.request.OooO00o.OooO0O0
        public final void OooO0Oo(@NotNull coil.request.OooO00o request, @NotNull o00O0OO0.OooOOO0.OooO00o metadata) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f47839OooO0OO.setValue(Boolean.FALSE);
            this.f47840OooO0Oo.setValue(Boolean.TRUE);
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f47842Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47843Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(StoreRoomChatBubbleModel storeRoomChatBubbleModel, int i) {
            super(2);
            this.f47842Oooo0oO = storeRoomChatBubbleModel;
            this.f47843Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO0oO(this.f47842Oooo0oO, ooo00o, this.f47843Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47844Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(Context context) {
            super(0);
            this.f47844Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumActivity.f23360o0ooOOo.OooO00o(this.f47844Oooo0o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47846Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47847Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47846Oooo0oO = o0o00oo2;
            this.f47847Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO0oo(this.f47846Oooo0oO, ooo00o, this.f47847Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47848Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(Context context) {
            super(0);
            this.f47848Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.f23570OoooOOo.OooO00o(this.f47848Oooo0o, VipLevel.Vip1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00Ooo f47849Oooo0o = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f47850Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47852Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47853Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47852Oooo0oO = o0o00oo2;
            this.f47853Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0OoO.this.OooO(this.f47852Oooo0oO, ooo00o, this.f47853Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0o(o0O00OO<Boolean> o0o00oo2, boolean z) {
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0(oO0O0OoO oo0o0ooo, StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, oOO00O ooo00o, int i) {
        String strOooO0OO;
        Objects.requireNonNull(oo0o0ooo);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(668790275);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        if (storeRoomChatBubbleModel.isHave() && storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getTimeLong() <= 0) {
            OooO0o(o0o00oo2, false);
            strOooO0OO = o000O0O0.OooO0OO(R.string.Purchased);
        } else if (storeRoomChatBubbleModel.isHave() && !storeRoomChatBubbleModel.getCanBuy()) {
            OooO0o(o0o00oo2, false);
            strOooO0OO = o000O0O0.OooO0OO(R.string.Obtained);
        } else if (storeRoomChatBubbleModel.isHave() || storeRoomChatBubbleModel.getCanBuy()) {
            OooO0o(o0o00oo2, true);
            strOooO0OO = o000O0O0.OooO0OO(R.string.Purchase);
        } else {
            OooO0o(o0o00oo2, true);
            strOooO0OO = o000O0O0.OooO0OO(R.string.Obtain);
        }
        p033OoooO00.o0OoOo0 o0oooo0OooO0OO = p033OoooO00.o00O0O.OooO0OO(0);
        boolean zBooleanValue = ((Boolean) o0o00oo2.getValue()).booleanValue();
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        p.OooO0O0(strOooO0OO, 0L, null, zBooleanValue, true, null, m.OooO00o(o0000O0.f41720OooOooo, 0L, ooo00oOooOOo, a.k, 14), o0oooo0OooO0OO, null, null, null, null, SizeKt.OooO0o(SizeKt.OooO0oO(o00OOOO0.OooO00o.f4198Oooo0o, 36)), new oO00OO0O(storeRoomChatBubbleModel, storeRoomChatBubbleVM), ooo00oOooOOo, 24576, 384, 3878);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO00OOO(oo0o0ooo, storeRoomChatBubbleModel, storeRoomChatBubbleVM, i));
    }

    public static final void OooOO0O(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
        VipState vipState;
        if (storeRoomChatBubbleModel.isHave() && (storeRoomChatBubbleModel.getObtainType() == 1 || storeRoomChatBubbleModel.getObtainType() == 2 || storeRoomChatBubbleModel.getTimeLong() <= 0)) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.already_have);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
                return;
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                return;
            }
        }
        if (storeRoomChatBubbleModel.getObtainType() == 1 || storeRoomChatBubbleModel.getObtainType() == 2) {
            p606o0oo0O.OooOo.OooO0O0("102244");
        }
        storeRoomChatBubbleVM.setBuyModel(storeRoomChatBubbleModel);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
        if (value == null) {
            return;
        }
        if (storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getCanBuyUserType() == 1 && !value.getFirst().booleanValue()) {
            storeRoomChatBubbleVM.getShowOpenPremiumDialog().setValue(Boolean.TRUE);
            return;
        }
        Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
        if (value2 == null) {
            return;
        }
        if (storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getCanBuyUserType() == 2) {
            VipState.Companion companion = VipState.INSTANCE;
            Integer first = value2.getFirst();
            Objects.requireNonNull(companion);
            if (first != null && first.intValue() == 0) {
                vipState = VipState.NotVip;
            } else if (first != null && first.intValue() == 1) {
                vipState = VipState.Vip;
            } else if (first != null && first.intValue() == 2) {
                vipState = VipState.VipFrozen;
            } else if (first != null && first.intValue() == 3) {
                vipState = VipState.VipHide;
            } else {
                vipState = (first != null && first.intValue() == 4) ? VipState.VipFrozenHide : VipState.NotVip;
            }
            Objects.requireNonNull(vipState);
            if (!(vipState == VipState.Vip || vipState == VipState.VipHide)) {
                storeRoomChatBubbleVM.getShowOpenVipDialog().setValue(Boolean.TRUE);
                return;
            }
        }
        storeRoomChatBubbleVM.getShowBuyDialog().setValue(Boolean.TRUE);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-494298610);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, o000O0O0.OooO0OO(R.string.only_vip_purchase), null, false, false, null, null, o000O0O0.OooO0OO(R.string.Get_Vip), false, null, false, new o00Oo0((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), null, false, null, o00Ooo.f47849Oooo0o, null, null, ooo00o2, i2 & 14, 1572864, 454394);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(o0o00oo2, i));
    }

    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-874215289);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Chat_Box);
            oO00000 oo00000 = oO00000.f47703OooO00o;
            o00O0OO.OooO00o(strOooO0OO, 0L, 0, null, null, oO00000.f47704OooO0O0, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 196608, 0, 2014);
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            StoreRoomChatBubbleVM storeRoomChatBubbleVM = (StoreRoomChatBubbleVM) viewModel;
            int i4 = i3 & 112;
            OooO0oo(storeRoomChatBubbleVM.getShowOpenPremiumDialog(), ooo00oOooOOo, i4);
            OooO(storeRoomChatBubbleVM.getShowOpenVipDialog(), ooo00oOooOOo, i4);
            OooO0o0(storeRoomChatBubbleVM.getShowBuyDialog(), ooo00oOooOOo, i4);
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = androidx.paging.compose.OooOO0.OooO00o(storeRoomChatBubbleVM.getBubblePagingSource().f48686OooO0oo, ooo00oOooOOo);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o0O0o.OooO0Oo(oooO0OOOooO00o, o00o0o01.OooO00o(SizeKt.OooO0o(oooO00o), true), null, null, null, o00O0000.OooO00o(ooo00oOooOOo, -618176693, new OooOOO(oooO0OOOooO00o, storeRoomChatBubbleVM)), ooo00oOooOOo, 196616, 28);
            oO0Oo oo0ooOooO0O0 = o00O00O.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO(), ooo00oOooOOo);
            o0O0OOO0 o0o0ooo0 = o0O0OOO0.f45701OooO00o;
            Long l = (Long) oo0ooOooO0O0.getValue();
            Intrinsics.checkNotNull(l);
            o0o0ooo0.OooO00o(l.longValue(), BackgroundKt.OooO0O0(oooO00o, u.OooO0O0(ooo00oOooOOo).OooOO0O(), p145o00Oo0.o000O0Oo.f32099OooO00o), ooo00oOooOOo, 384, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOOO(o00o0o01, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(@NotNull o0O00OO<Boolean> show, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        String strOooO00o;
        String strOooO0OO;
        Function0 oooO00o;
        oOO00O ooo00o2;
        Intrinsics.checkNotNullParameter(show, "show");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1210606255);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(show) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooO0O0 = o000O00.OooO0O0(ooo00oOooOOo, 940661400, -492369756);
            if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0O0 = new p571o0oOo0o.o00O0O00();
                ooo00oOooOOo.Oooo00o(objOooO0O0);
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.Oooo0o0();
            oo00o.OooO00o((p571o0oOo0o.o00O0O00) objOooO0O0, null, false, ooo00oOooOOo, 8, 6);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            ooo00oOooOOo.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            StoreRoomChatBubbleVM storeRoomChatBubbleVM = (StoreRoomChatBubbleVM) viewModel;
            Context context = (Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0);
            StoreRoomChatBubbleModel buyModel = storeRoomChatBubbleVM.getBuyModel();
            if (buyModel == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO0(show, i));
                return;
            }
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            oO0Oo0oo oo0oo0oo = (oO0Oo0oo) viewModel2;
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Confirmation);
            boolean z = buyModel.getCanBuy() && (StringsKt.isBlank(buyModel.getH5Url()) ^ true);
            if (buyModel.getCanBuy() && buyModel.getFlagType() != 1 && buyModel.getTimeLong() == -1) {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_pay_for_permanent), String.valueOf(buyModel.getPromotionPrice()));
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() != 1 && buyModel.getTimeLong() != -1) {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_pay_for_days), String.valueOf(buyModel.getPromotionPrice()), String.valueOf(buyModel.getTimeLong()));
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() == 1 && buyModel.getTimeLong() == -1) {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_pay_or_obtain_for_permanent), String.valueOf(buyModel.getPromotionPrice()), buyModel.getWaresName());
            } else if (buyModel.getCanBuy() && buyModel.getFlagType() == 1 && buyModel.getTimeLong() != -1) {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_pay_or_obtain_for_days), String.valueOf(buyModel.getPromotionPrice()), String.valueOf(buyModel.getTimeLong()), buyModel.getWaresName());
            } else if (!buyModel.getCanBuy() && buyModel.getObtainType() == 1) {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_obtain_premium_xxx_free), UserPremiumView.f21052OoooO00.OooO0O0(buyModel.getObtainLevel()));
            } else if (!buyModel.getCanBuy() && buyModel.getObtainType() == 2) {
                strOooO00o = o000O0O0.OooO0OO(R.string.store_obtain_vip_free);
            } else if (buyModel.getCanBuy() || buyModel.getTimeLong() != -1) {
                strOooO00o = (buyModel.getCanBuy() || buyModel.getTimeLong() == -1) ? "" : com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_obtain_for_days), String.valueOf(buyModel.getTimeLong()), buyModel.getWaresName());
            } else {
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_obtain_for_permanent), buyModel.getWaresName());
            }
            String str = strOooO00o;
            if (buyModel.getCanBuy()) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Pay);
            } else if (buyModel.getObtainType() == 1) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Get_Yalla_Premium);
            } else if (buyModel.getObtainType() == 2) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Get_Vip);
            } else {
                strOooO0OO = StringsKt.isBlank(buyModel.getH5Url()) ^ true ? o000O0O0.OooO0OO(R.string.Obtain) : o000O0O0.OooO0OO(R.string.yl_dialog_OK);
            }
            String str2 = strOooO0OO;
            String strOooO0OO3 = (buyModel.getCanBuy() && (StringsKt.isBlank(buyModel.getH5Url()) ^ true)) ? o000O0O0.OooO0OO(R.string.Obtain) : o000O0O0.OooO0OO(R.string.yl_dialog_Cancel);
            if (buyModel.getCanBuy() && (!StringsKt.isBlank(buyModel.getH5Url()))) {
                oooO00o = new OooO00o(context, buyModel);
            } else if (buyModel.getCanBuy() && StringsKt.isBlank(buyModel.getH5Url())) {
                oooO00o = OooO0O0.f47817Oooo0o;
            } else if (!buyModel.getCanBuy() && (!StringsKt.isBlank(buyModel.getH5Url()))) {
                oooO00o = OooO0OO.f47818Oooo0o;
            } else if (buyModel.getCanBuy() || buyModel.getObtainType() != 1) {
                oooO00o = (buyModel.getCanBuy() || buyModel.getObtainType() != 2) ? null : OooO.f47814Oooo0o;
            } else {
                oooO00o = OooO0o.f47819Oooo0o;
            }
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(show, strOooO0OO2, str, null, z, false, null, null, str2, false, null, false, new OooOO0(buyModel, storeRoomChatBubbleVM, oo0oo0oo, lifecycleOwner, context), strOooO0OO3, false, null, oooO00o, null, null, ooo00o2, i2 & 14, 0, 446184);
        }
        oo0ooO oo0oooOooOo2 = ooo00o2.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOO0O(show, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(@NotNull StoreRoomChatBubbleModel model, @Nullable oOO00O ooo00o, int i) {
        o00OO0OO o00oo0oo;
        o00O00o0 o00o00o1;
        o00OOOO0.OooO00o oooO00o;
        Integer num;
        int i2;
        o00OOOO0.OooO00o oooO00o2;
        int i3;
        int i4;
        char c;
        String strOooO0OO;
        long j;
        Function0<o000000.OooO00o> function0;
        Intrinsics.checkNotNullParameter(model, "model");
        oOO00O composer = ooo00o.OooOOo(1759093662);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o3), 170);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
            p100o000oOoO.o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function1);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r7);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r26 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r26, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        o00O00o0 o00o00o2 = BoxScopeInstance.f5741OooO00o;
        String strImgFormat = CloudImageUtilKt.imgFormat(model.getBackgroundUrl());
        composer.OooO0o0(604400049);
        o0O0O0o0<oOO00O.OooOO0> o0o0o0o3 = p114o00O00o.o000oOoO.f30327OooO00o;
        oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(o0o0o0o3, composer);
        composer.OooO0o0(604401387);
        o0O0O0o0<Context> o0o0o0o4 = o0O0O00.f6591OooO0O0;
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o4));
        c0072OooO00o.f9912OooO0OO = strImgFormat;
        c0072OooO00o.OooO0O0(false);
        c0072OooO00o.f9936OooOoo = new ColorDrawable(Color.parseColor("#FF2C2C34"));
        c0072OooO00o.f9937OooOoo0 = 0;
        Function0<o000000.OooO00o> function2 = function1;
        o0O0O0o0<o00OOOOo> o0o0o0o5 = o0o0o0o2;
        o0O0O0o0<LayoutDirection> o0o0o0o6 = o0o0o0o1;
        Oooo0.o00.OooO00o(com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer), "", SizeKt.OooO0o0(oooO00o3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25008, 104);
        o0O00OO o0o00oo2 = (o0O00OO) o00O0.OooO00o(new Object[0], null, OooOo.f47836Oooo0o, composer, 6);
        o0O00OO o0o00oo3 = (o0O00OO) o00O0.OooO00o(new Object[0], null, OooOo00.f47837Oooo0o, composer, 6);
        String strImgFormat2 = CloudImageUtilKt.imgFormat(model.getAttachedPicUrl());
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o2 = p114o00O00o.OooOOOO.OooO00o(o0o0o0o3, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o2 = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o4));
        c0072OooO00o2.f9912OooO0OO = strImgFormat2;
        c0072OooO00o2.OooO0O0(false);
        c0072OooO00o2.f9915OooO0o0 = new Oooo0(o0o00oo3, o0o00oo3, o0o00oo2);
        p114o00O00o.OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o2, oooOO0OooO00o2, composer);
        o0O0O00.OooOO0.OooO00o.OooO oooO2 = o0O0O00.OooOO0.OooO00o.f35239OooO0OO;
        o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
        float f = 30;
        Oooo0.o00.OooO00o(oooOo00OooO0O0, "", SizeKt.OooO0o0(PaddingKt.OooO0oo(o00o00o2.OooO00o(oooO00o3, o00oo0oo2), f, 35, f, 46)), null, oooO2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
        composer.OooO0o0(587309498);
        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
            String bubbleText = model.getBubbleText();
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(o00o00o2.OooO00o(oooO00o3, o00oo0oo2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11, 7);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            p031OoooO.o000O0O0.OooO0OO(bubbleText, o00oooo0OooO, o0000O0.f41693OooO0OO, p254o00ooO0O.o000OO00.OooO0OO(20, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65520);
        }
        composer.Oooo0o0();
        composer.OooO0o0(587309850);
        if (((Boolean) o0o00oo3.getValue()).booleanValue()) {
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = "svga/anim_loading.svga";
                composer.Oooo00o("svga/anim_loading.svga");
            }
            composer.Oooo0o0();
            oooO00o = oooO00o3;
            o00oo0oo = o00oo0oo2;
            o00o00o1 = o00o00o2;
            o0O0O0O.OooO00o((String) objOooO0o, true, 0, null, PaddingKt.OooO(o00o00o1.OooO00o(SizeKt.OooOO0(oooO00o, 60), o00oo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11, 7), composer, 54, 12);
        } else {
            o00oo0oo = o00oo0oo2;
            o00o00o1 = r14;
            oooO00o = oooO00o3;
        }
        composer.Oooo0o0();
        if (model.getLimitNum() > 0) {
            composer.OooO0o0(587310223);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            float f2 = 5;
            o00OOOO0 o00oooo0OooO0oO2 = SizeKt.OooO0oO(PaddingKt.OooO(oooO00o, f2, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12), 20);
            if (model.getFrozenDay() > 0) {
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                j = o0000O0.f41753o00000;
            } else {
                o0000O0 o0000o3 = o0000O0.f41691OooO00o;
                j = o0000O0.f41749OoooooO;
            }
            o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(BackgroundKt.OooO0O0(o00oooo0OooO0oO2, j, p033OoooO00.o00O0O.OooO00o()), 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o6);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o5);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO2);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                function0 = function2;
                composer.OooOoO0(function0);
            } else {
                function0 = function2;
                composer.Oooo00O();
            }
            function2 = function0;
            o0o0o0o5 = o0o0o0o5;
            o0o0o0o6 = o0o0o0o6;
            o0o0o0o0 = o0o0o0o0;
            o00OOOO0.OooO00o oooO00o4 = oooO00o;
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r7, composer, oooO3, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r26, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_store_limit_time, composer), null, SizeKt.OooOO0(oooO00o4, 11), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(2, null, composer, 6, 2);
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.store_xxx_days), String.valueOf(model.getLimitNum()));
            o0000O0 o0000o4 = o0000O0.f41691OooO00o;
            num = 0;
            p031OoooO.o000O0O0.OooO0OO(strOooO00o, null, o0000O0.f41693OooO0OO, p254o00ooO0O.o000OO00.OooO0OO(11, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            oooO00o2 = oooO00o4;
            i3 = 12;
            i2 = 2;
        } else {
            o00OOOO0.OooO00o oooO00o5 = oooO00o;
            num = r16;
            Integer numValueOf = null;
            composer.OooO0o0(587311289);
            if (model.getFlagType() == 1 && model.getLimitNum() > 0) {
                numValueOf = Integer.valueOf(R.drawable.ic_store_flag_activity);
            } else if (model.getFlagType() == 2 || model.getObtainType() == 1) {
                numValueOf = Integer.valueOf(R.drawable.ic_store_flag_premium);
            } else if (model.getFlagType() == 3 || model.getObtainType() == 2) {
                numValueOf = Integer.valueOf(R.drawable.ic_store_flag_vip);
            }
            i2 = 2;
            if (numValueOf == null) {
                oooO00o2 = oooO00o5;
            } else {
                numValueOf.intValue();
                oooO00o2 = oooO00o5;
                float f3 = 6;
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(numValueOf.intValue(), composer), "", p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(PaddingKt.OooO0o0(oooO00o2, 5), 21), p033OoooO00.o00O0O.OooO0o0(f3, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                Unit unit = Unit.INSTANCE;
            }
            composer.Oooo0o0();
            i3 = 12;
        }
        if (model.getCanBuy() || !(model.getObtainType() == 1 || model.getObtainType() == i2)) {
            Function0<o000000.OooO00o> function4 = function2;
            composer.OooO0o0(587313162);
            o00OOOO0 o00oooo0OooO3 = PaddingKt.OooO(o00o00o1.OooO00o(oooO00o2, o00OO0O0.OooO00o.f4170OooO), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 7);
            o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o002 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O1, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO4 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o6);
            o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o5);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO3);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function4);
            } else {
                composer.Oooo00O();
            }
            o00OOOO0.OooO00o oooO00o6 = oooO00o2;
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r7, composer, oooO4, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r26, composer, "composer", composer), composer, num);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            composer.OooO0o0(829684415);
            if (model.getCanBuy()) {
                c = 0;
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.coin, composer), "", SizeKt.OooOO0(oooO00o6, 16), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                float f4 = 2;
                o0000oo.OooO0O0(f4, null, composer, 6, 2);
                composer.OooO0o0(829684607);
                if (model.getPrice() > model.getPromotionPrice()) {
                    String strValueOf = String.valueOf(model.getPrice());
                    long jOooO0OO = p254o00ooO0O.o000OO00.OooO0OO(16, composer);
                    o0000O0 o0000o5 = o0000O0.f41691OooO00o;
                    p031OoooO.o000O0O0.OooO0OO(strValueOf, null, o0000O0.f41717OooOoo, jOooO0OO, null, null, null, 0L, o0000O0.OooO.f27248OooO0o0, null, 0L, 0, false, 0, null, null, composer, 100663680, 0, 65266);
                    o0000oo.OooO0O0(f4, null, composer, 6, 2);
                }
                composer.Oooo0o0();
                String strValueOf2 = String.valueOf(model.getPromotionPrice());
                long jOooO0OO2 = p254o00ooO0O.o000OO00.OooO0OO(16, composer);
                o0000O0 o0000o6 = o0000O0.f41691OooO00o;
                i4 = 2;
                p031OoooO.o000O0O0.OooO0OO(strValueOf2, null, o0000O0.f41719OooOooO, jOooO0OO2, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            } else {
                i4 = 2;
                c = 0;
            }
            composer.Oooo0o0();
            composer.OooO0o0(829685239);
            if (model.getCanBuy() && model.getTimeLong() > 0) {
                long jOooO0OO3 = p254o00ooO0O.o000OO00.OooO0OO(12, composer);
                o0000O0 o0000o7 = o0000O0.f41691OooO00o;
                p031OoooO.o000O0O0.OooO0OO("/", null, o0000O0.f41719OooOooO, jOooO0OO3, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 390, 0, 65522);
            }
            composer.Oooo0o0();
            if (model.getTimeLong() > 0) {
                o0000oo.OooO0O0(i4, null, composer, 6, i4);
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.vehicle_store_xxx_days);
                String[] strArr = new String[1];
                strArr[c] = String.valueOf(model.getTimeLong());
                String strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr);
                long jOooO0OO4 = p254o00ooO0O.o000OO00.OooO0OO(12, composer);
                o0000O0 o0000o8 = o0000O0.f41691OooO00o;
                p031OoooO.o000O0O0.OooO0OO(strOooO00o2, null, o0000O0.f41719OooOooO, jOooO0OO4, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            }
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(587312183);
            o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o2), 24), o00OO0O0.OooO00o.f4170OooO);
            o0000O0 o0000o9 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41791o000OOo, p145o00Oo0.o000O0Oo.f32099OooO00o);
            o000000 o000000VarOooO00o3 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
            o0000O0O.OooO oooO5 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o6);
            o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o5);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function2);
            } else {
                composer.Oooo00O();
            }
            int i5 = i3;
            int i6 = i2;
            ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r7, composer, oooO5, r3, composer, layoutDirection4, r4, composer, o00ooooo5, r26, composer, "composer", composer), composer, num);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (model.getObtainType() == 1 && PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(model.getObtainLevel())) == PremiumLevel.Premium4) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Free_for_Count);
            } else if (model.getObtainType() == 1 && PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(model.getObtainLevel())) == PremiumLevel.Premium5) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Free_for_Marquis);
            } else {
                strOooO0OO = model.getObtainType() == i6 ? o000O0O0.OooO0OO(R.string.Free_for_VIP) : "";
            }
            p031OoooO.o000O0O0.OooO0OO(strOooO0OO, null, o0000O0.f41754o000000, p254o00ooO0O.o000OO00.OooO0OO(i5, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new Oooo000(model, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1482036024);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, o000O0O0.OooO0OO(R.string.only_premium_purchase), null, false, false, null, null, o000O0O0.OooO0OO(R.string.Get_Yalla_Premium), false, null, false, new o000oOoO((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), null, false, null, o0OoOo0.f47850Oooo0o, null, null, ooo00o2, i2 & 14, 1572864, 454394);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00O0O(o0o00oo2, i));
    }
}
