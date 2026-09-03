package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.app.base.util.DateNumeralUtils;
import com.code.android.util.ToastUtil;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p579o0oOoOOo.c1;
import p649o0ooOOoo.fg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0014R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/fragment/RoomThemeStoreFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/fg;", "", "initView", "", "position", "", "Lcom/yalla/yalla/model/ThemeModel;", "themeModel", "showThemeBigImageDialog", "item", "showSend", "showPurchase", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "getSimplePurchaseContent", "getActivePurchaseContent", "content", "showBuyConfirmDialog", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "themeTypeId", "I", "", "isHasRoom", "Z", "themePreviewDialogIsShowing", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeStoreFragment extends p503o0o00o00.OooO<fg> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String THEME_TYPE_ID = "THEME_TYPE_ID";
    private final boolean isHasRoom;

    @Nullable
    private p188o00o00o0.OooO0OO<ThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    @Nullable
    private c1 themePreviewDialog;
    private boolean themePreviewDialogIsShowing;
    private int themeTypeId;

    public static final class OooO extends p654o0ooo.o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            if (RoomThemeStoreFragment.this.themeTypeId == Integer.MAX_VALUE) {
                LiveEventBus.get("ROOM_THEME_REQUEST_FAILED").post(null);
            } else {
                RoomThemeStoreFragment.this.initData();
            }
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<ThemeModel>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ThemeModel> list) {
            List<ThemeModel> list2 = list;
            p188o00o00o0.OooO0OO oooO0OO = RoomThemeStoreFragment.this.mAdapter;
            if (oooO0OO != null) {
                oooO0OO.setNewData(list2);
            }
            p188o00o00o0.OooO0OO oooO0OO2 = RoomThemeStoreFragment.this.mAdapter;
            if (oooO0OO2 != null) {
                oooO0OO2.setLoadComplete();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            p188o00o00o0.OooO0OO oooO0OO = RoomThemeStoreFragment.this.mAdapter;
            if (oooO0OO != null) {
                oooO0OO.loadError();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends p188o00o00o0.OooO0OO<ThemeModel> {
        public OooO0o(Context context) {
            super(context, R.layout.room_item_theme_mine);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            String str;
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            ThemeModel item = (ThemeModel) obj;
            if (oooO0o == null || item == null) {
                return;
            }
            View viewOooO0Oo = oooO0o.OooO0Oo(R.id.tlTheme);
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            ThemeLayout themeLayout = (ThemeLayout) viewOooO0Oo;
            themeLayout.OooO00o(item);
            themeLayout.OooO0O0(item, new o000O00(roomThemeStoreFragment, oooO0o));
            Intrinsics.checkNotNullExpressionValue(themeLayout, "");
            ThemeLayout.OooO0OO(themeLayout, item, roomThemeStoreFragment.isHasRoom, new o000O00O(roomThemeStoreFragment, item), new o000O0(roomThemeStoreFragment, item), 4);
            o000O0Oo o000o0oo2 = new o000O0Oo(roomThemeStoreFragment, item, oooO0o);
            Intrinsics.checkNotNullParameter(item, "item");
            LinearLayout linearLayout = themeLayout.f25216Oooo0o.f50720OooOO0;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llThemePrice");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout);
            TextView textView = themeLayout.f25216Oooo0o.f50728OooOOo0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvThemePrice");
            com.yalla.support.common.util.o00O0O.OooO00o(textView);
            if (item.getIsHave() != 1) {
                if (item.getThemeTagType() != 1 && item.getThemeTagType() != 3) {
                    LinearLayout linearLayout2 = themeLayout.f25216Oooo0o.f50720OooOO0;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llThemePrice");
                    com.yalla.support.common.util.o00O0O.OooO(linearLayout2);
                }
                if (item.getTimeLong() < 0) {
                    if (item.getPrice() > item.getPromotionPrice()) {
                        TextView textView2 = themeLayout.f25216Oooo0o.f50728OooOOo0;
                        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvThemePrice");
                        com.yalla.support.common.util.o00O0O.OooO(textView2);
                        themeLayout.f25216Oooo0o.f50728OooOOo0.setText(String.valueOf(item.getPrice()));
                        themeLayout.f25216Oooo0o.f50728OooOOo0.getPaint().setFlags(17);
                    }
                    themeLayout.f25216Oooo0o.f50725OooOOOO.setText(String.valueOf(item.getPromotionPrice()));
                } else if (item.getPromotionPrice() <= 0) {
                    ImageView imageView = themeLayout.f25216Oooo0o.f50715OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCoin");
                    com.yalla.support.common.util.o00O0O.OooO00o(imageView);
                    themeLayout.f25216Oooo0o.f50725OooOOOO.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Free) + '/' + item.getTimeLong() + ' ' + com.yalla.support.common.util.OooOOO.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d)));
                } else {
                    ImageView imageView2 = themeLayout.f25216Oooo0o.f50715OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivCoin");
                    com.yalla.support.common.util.o00O0O.OooO(imageView2);
                    if (p168o00Ooo0.oo000o.OooO0o0()) {
                        str = item.getTimeLong() + '/' + item.getPromotionPrice() + ' ' + com.yalla.support.common.util.OooOOO.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d));
                    } else {
                        str = item.getPromotionPrice() + '/' + item.getTimeLong() + ' ' + com.yalla.support.common.util.OooOOO.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d));
                    }
                    if (item.getPrice() > item.getPromotionPrice()) {
                        TextView textView3 = themeLayout.f25216Oooo0o.f50728OooOOo0;
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvThemePrice");
                        com.yalla.support.common.util.o00O0O.OooO(textView3);
                        themeLayout.f25216Oooo0o.f50728OooOOo0.setText(String.valueOf(item.getPrice()));
                        themeLayout.f25216Oooo0o.f50728OooOOo0.getPaint().setFlags(16);
                    }
                    themeLayout.f25216Oooo0o.f50725OooOOOO.setText(str);
                }
            }
            themeLayout.f25216Oooo0o.f50719OooO0oo.setOnClickListener(new p502o0o00o0.o000(o000o0oo2, 2));
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f24227Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f24228Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ThemeModel themeModel, oo0oOO0 oo0ooo0) {
            super(0);
            this.f24227Oooo0o = themeModel;
            this.f24228Oooo0oO = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0OO("102015", MapsKt.mapOf(new Pair("shopid", Long.valueOf(this.f24227Oooo0o.getShopId()))));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            webPageInfo.OooO0Oo(this.f24227Oooo0o.getH5Url());
            WebActivity.f22108OoooooO.OooO00o(this.f24228Oooo0oO.f34199OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f24230Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f24231Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ThemeModel themeModel, oo0oOO0 oo0ooo0) {
            super(0);
            this.f24230Oooo0oO = themeModel;
            this.f24231Oooo0oo = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = RoomThemeStoreFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOoo0((BaseActivityK) activity, null, 0L, 3, null);
            LiveData<ApiResult<ThemeBoughtModel>> liveDataGoBuyTheme = RoomThemeStoreFragment.this.getStoreVm().goBuyTheme(this.f24230Oooo0oO.getShopId());
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            liveDataGoBuyTheme.observe(roomThemeStoreFragment, new o0o0000.OooOo(new o000OO0O(roomThemeStoreFragment, this.f24231Oooo0oo), null, new o000O0O0(RoomThemeStoreFragment.this), false, 10));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f24232Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f24233Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ThemeModel themeModel, oo0oOO0 oo0ooo0) {
            super(0);
            this.f24232Oooo0o = themeModel;
            this.f24233Oooo0oO = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0OO("102015", MapsKt.mapOf(new Pair("shopid", Long.valueOf(this.f24232Oooo0o.getShopId()))));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            webPageInfo.OooO0Oo(this.f24232Oooo0o.getH5Url());
            WebActivity.f22108OoooooO.OooO00o(this.f24233Oooo0oO.f34199OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
            Context context = RoomThemeStoreFragment.this.getBinding().f49401OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.rvThemeLayout.context");
            oooO00o.OooO00o(context, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f24236Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ThemeModel themeModel) {
            super(1);
            this.f24236Oooo0oO = themeModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            o0O00000.OooO0OO("Me_store_Theme_give");
            ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.Theme);
            GiveThemeModel giveThemeModel = new GiveThemeModel();
            ThemeModel themeModel = this.f24236Oooo0oO;
            giveThemeModel.setThemeName(themeModel.getName());
            if (!StringsKt.isBlank(themeModel.getVideoPath())) {
                giveThemeModel.setVideoUrl(themeModel.getVideoPath());
            } else {
                giveThemeModel.setImageUrl(themeModel.getPic());
            }
            giveThemeModel.setShopId(themeModel.getShopId());
            shareToFriendModel.setGiveThemeModel(giveThemeModel);
            ShareToFriendsActivity.OooO00o oooO00o = ShareToFriendsActivity.f22209o00o0O;
            Context contextRequireContext = RoomThemeStoreFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            oooO00o.OooO00o(contextRequireContext, shareToFriendModel);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ThemeModel, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ThemeModel themeModel) {
            ThemeModel $receiver = themeModel;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            RoomThemeStoreFragment.this.showSend($receiver);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiResult<Integer>, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Integer> apiResult) {
            ApiResult<Integer> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            Context context = RoomThemeStoreFragment.this.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            ((BaseActivityK) context).OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<DialogInterface, Unit> {
        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeStoreFragment.this.themePreviewDialogIsShowing = false;
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ThemeModel, Unit> {
        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ThemeModel themeModel) {
            ThemeModel $receiver = themeModel;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            RoomThemeStoreFragment.this.showPurchase($receiver);
            return Unit.INSTANCE;
        }
    }

    public RoomThemeStoreFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.storeVm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24244Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24244Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeStoreFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.themeTypeId = Integer.MAX_VALUE;
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        this.isHasRoom = p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue() != null;
    }

    private final String getActivePurchaseContent(ThemeModel model) {
        String strOooO00o;
        if (model.getTimeLong() < 0) {
            return com.yalla.support.common.util.OooOo.OooO00o(p168o00Ooo0.oo000o.OooO0O0() == 7 ? com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_permanently), model.getName()), String.valueOf(model.getPromotionPrice())) : com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_permanently), String.valueOf(model.getPromotionPrice())), model.getName()), model.getThemeTag());
        }
        if (model.getPromotionPrice() <= 0) {
            strOooO00o = (p168o00Ooo0.oo000o.OooO0O0() == 7 || p168o00Ooo0.oo000o.OooO0O0() == 2 || p168o00Ooo0.oo000o.OooO0O0() == 8) ? com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_claim_XXX__for_activity_XXX_days), String.valueOf(model.getTimeLong())), model.getName()) : com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_claim_XXX__for_activity_XXX_days), model.getName()), String.valueOf(model.getTimeLong()));
        } else if (p168o00Ooo0.oo000o.OooO0O0() == 7) {
            strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getTimeLong())), model.getName()), String.valueOf(model.getPromotionPrice()));
        } else {
            strOooO00o = p168o00Ooo0.oo000o.OooO0O0() == 8 ? com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getPromotionPrice())), String.valueOf(model.getTimeLong())), model.getName()) : com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getPromotionPrice())), model.getName()), String.valueOf(model.getTimeLong()));
        }
        return com.yalla.support.common.util.OooOo.OooO00o(strOooO00o, model.getThemeTag());
    }

    private final String getSimplePurchaseContent(ThemeModel model) {
        if (model.getTimeLong() < 0) {
            return com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_permanently), String.valueOf(model.getPromotionPrice())), model.getName());
        }
        return model.getPromotionPrice() <= 0 ? com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_claim_XXX_for_XXX_days), model.getName()), String.valueOf(model.getTimeLong())) : com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm_to_pay_XXX_golds_to_buy_XXX_for_XXX_days), String.valueOf(model.getPromotionPrice())), model.getName()), String.valueOf(model.getTimeLong()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeStoreVM getStoreVm() {
        return (ThemeStoreVM) this.storeVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt(THEME_TYPE_ID, 0) : Integer.MAX_VALUE;
        this.themeTypeId = i;
        if (i != Integer.MAX_VALUE) {
            getStoreVm().getThemeTypeListData(this.themeTypeId).observe(this, new o0o0000.OooOo(new OooO0O0(), new OooO0OO(), null, false, 12));
            return;
        }
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO = this.mAdapter;
        if (oooO0OO != null) {
            oooO0OO.loadError();
        }
    }

    private final void initView() {
        OooO0o oooO0o = new OooO0o(getBinding().f49401OooO0O0.getContext());
        this.mAdapter = oooO0o;
        oooO0o.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO = this.mAdapter;
        if (oooO0OO != null) {
            oooO0OO.setEmptyText(R.string.no_data);
        }
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO2 = this.mAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.setLoadErrorClickListener(new OooO());
        }
        getBinding().f49401OooO0O0.setLayoutManager(new GridLayoutManager(getBinding().f49401OooO0O0.getContext(), 2));
        getBinding().f49401OooO0O0.setAdapter(this.mAdapter);
    }

    private final void showBuyConfirmDialog(String content, ThemeModel item) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivityRequireActivity);
        oo0ooo0.OooOoo(R.string.Confirmation);
        oo0ooo0.OooOo0O(content);
        String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.OK);
        if (item.getThemeTagType() == 2 && (!StringsKt.isBlank(item.getH5Url()))) {
            strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.Purchase);
            oo0ooo0.OooOoO0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Obtain));
            oo0ooo0.OooOo(new OooOO0(item, oo0ooo0));
        } else {
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        }
        oo0ooo0.OooOOo0(strOooO0OO);
        oo0ooo0.OooOo0o(new OooOO0O(item, oo0ooo0));
        oo0ooo0.OooOOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPurchase(ThemeModel item) {
        if (item.getIsHave() == 1) {
            ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_bought));
            return;
        }
        int themeTagType = item.getThemeTagType();
        if (themeTagType == 0) {
            showBuyConfirmDialog(getSimplePurchaseContent(item), item);
            return;
        }
        if (themeTagType == 1) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivityRequireActivity);
            oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.open_vip_alert), item.getThemeTag()));
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOo0o(new OooOOO0());
            oo0ooo0.OooOOO0();
            return;
        }
        if (themeTagType == 2) {
            showBuyConfirmDialog(getActivePurchaseContent(item), item);
            return;
        }
        if (themeTagType != 3) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity()");
        oo0oOO0 oo0ooo1 = new oo0oOO0(fragmentActivityRequireActivity2);
        oo0ooo1.OooOo0O(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.join_activity), item.getThemeTag()));
        if (!StringsKt.isBlank(item.getH5Url())) {
            oo0ooo1.OooOOo0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Obtain));
            oo0ooo1.OooOo0o(new OooOOO(item, oo0ooo1));
            oo0oOO0.OooOoo0(oo0ooo1, false, 1, null);
        } else {
            oo0oOO0.OooOOoo(oo0ooo1, false, 1, null);
        }
        oo0ooo1.OooOOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSend(ThemeModel item) {
        if (getContext() instanceof BaseActivityK) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOoo0((BaseActivityK) context, null, 0L, 3, null);
            getStoreVm().getRoomThemeGiveCount().observe(this, new o0o0000.OooOo(new OooOOOO(item), null, new OooOo00(), false, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showThemeBigImageDialog(int position, List<ThemeModel> themeModel) {
        if (this.themePreviewDialogIsShowing) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        c1 c1Var = new c1(fragmentActivityRequireActivity, new OooOo(), new Oooo000());
        c1Var.OooO00o(new Oooo0());
        this.themePreviewDialog = c1Var;
        Intrinsics.checkNotNullParameter(themeModel, "themeModel");
        c1Var.f45938OoooOOo = position;
        p188o00o00o0.OooO0OO<ThemeModel> oooO0OO = c1Var.f45937OoooOOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(themeModel);
        c1Var.f45940o000oOoO.f50115OooO0Oo.scrollToPosition(position);
        c1Var.OooOO0O();
        c1 c1Var2 = this.themePreviewDialog;
        if (c1Var2 != null) {
            c1Var2.OooOO0();
        }
        this.themePreviewDialogIsShowing = true;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public fg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        fg fgVarInflate = fg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fgVarInflate, "inflate(inflater, container, false)");
        return fgVarInflate;
    }
}
