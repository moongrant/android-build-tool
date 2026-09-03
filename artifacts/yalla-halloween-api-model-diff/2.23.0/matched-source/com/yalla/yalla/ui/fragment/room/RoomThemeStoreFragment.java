package com.yalla.yalla.ui.fragment.room;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import com.yalla.yalla.util.DateNumeralUtils;
import com.yalla.yalla.util.WebPageInfo;
import com.zego.zegoavkit2.ZegoConstants;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p519o0o0O0oO.u3;
import p519o0o0O0oO.w3;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.k7;
import p641o0ooOOOO.v8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0014R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%¨\u00061"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomThemeStoreFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/v8;", "", "initView", "", "position", "", "Lcom/yalla/yalla/model/ThemeModel;", "themeModel", "showThemeBigImageDialog", "item", "showSend", "showPurchase", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "getSimplePurchaseContent", "getActivePurchaseContent", "content", "showBuyConfirmDialog", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "themeTypeId", "I", "", "isHasRoom", "Z", "Lo0oOo0OO/o000O;", "mAdapter", "Lo0oOo0OO/o000O;", "Lo0o0O0oO/w3;", "themePreviewDialog", "Lo0o0O0oO/w3;", "themePreviewDialogIsShowing", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomThemeStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeStoreFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeStoreFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,372:1\n106#2,15:373\n*S KotlinDebug\n*F\n+ 1 RoomThemeStoreFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeStoreFragment\n*L\n52#1:373,15\n*E\n"})
public final class RoomThemeStoreFragment extends p508o0o0O.OooOO0O<v8> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String THEME_TYPE_ID = "THEME_TYPE_ID";
    private final boolean isHasRoom;

    @Nullable
    private o000O<ThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    @Nullable
    private w3 themePreviewDialog;
    private boolean themePreviewDialogIsShowing;
    private int themeTypeId;

    public static final class OooO extends oo00o {
        public OooO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@Nullable View view) {
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            if (roomThemeStoreFragment.themeTypeId == Integer.MAX_VALUE) {
                LiveEventBus.get("ROOM_THEME_REQUEST_FAILED").post(null);
            } else {
                roomThemeStoreFragment.initData();
            }
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<ThemeModel>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ThemeModel> list) {
            List<ThemeModel> list2 = list;
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            o000O o000o = roomThemeStoreFragment.mAdapter;
            if (o000o != null) {
                o000o.OooOoO0(list2);
            }
            o000O o000o2 = roomThemeStoreFragment.mAdapter;
            if (o000o2 != null) {
                o000o2.Oooo00o();
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
            o000O o000o = RoomThemeStoreFragment.this.mAdapter;
            if (o000o != null) {
                o000o.OooOoo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends o000O<ThemeModel> {
        public OooO0o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            String str;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ThemeModel item = (ThemeModel) obj;
            if (viewHolder == null || item == null) {
                return;
            }
            ThemeLayout convert$lambda$0 = (ThemeLayout) viewHolder.getView(oO00O0oO.tlTheme);
            convert$lambda$0.OooO00o(item);
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            convert$lambda$0.OooO0O0(item, new o00Ooo(roomThemeStoreFragment, viewHolder));
            Intrinsics.checkNotNullExpressionValue(convert$lambda$0, "convert$lambda$0");
            ThemeLayout.OooO0OO(convert$lambda$0, item, roomThemeStoreFragment.isHasRoom, new oo000o(roomThemeStoreFragment, item), new o00oO0o(roomThemeStoreFragment, item), 4);
            final o0ooOOo o0ooooo = new o0ooOOo(roomThemeStoreFragment, item, viewHolder);
            Intrinsics.checkNotNullParameter(item, "item");
            k7 k7Var = convert$lambda$0.f30759OooO0Oo;
            LinearLayout linearLayout = k7Var.f58288OooOO0;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llThemePrice");
            o000OO00.OooO0O0(linearLayout);
            TextView textView = k7Var.f58296OooOOo0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvThemePrice");
            o000OO00.OooO0O0(textView);
            if (item.getIsHave() != 1) {
                if (item.getThemeTagType() != 1 && item.getThemeTagType() != 3) {
                    LinearLayout linearLayout2 = k7Var.f58288OooOO0;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llThemePrice");
                    o000OO00.OooOOOO(linearLayout2);
                }
                long timeLong = item.getTimeLong();
                TextView textView2 = k7Var.f58293OooOOOO;
                if (timeLong < 0) {
                    if (item.getPrice() > item.getPromotionPrice()) {
                        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvThemePrice");
                        o000OO00.OooOOOO(textView);
                        textView.setText(String.valueOf(item.getPrice()));
                        textView.getPaint().setFlags(17);
                    }
                    textView2.setText(String.valueOf(item.getPromotionPrice()));
                } else {
                    int promotionPrice = item.getPromotionPrice();
                    ImageView imageView = k7Var.f58283OooO0Oo;
                    if (promotionPrice <= 0) {
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCoin");
                        o000OO00.OooO0O0(imageView);
                        textView2.setText(o0000.OooO0OO(oO00OOo0.Free) + "/" + item.getTimeLong() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d)));
                    } else {
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivCoin");
                        o000OO00.OooOOOO(imageView);
                        if (p591o0oo000O.OooO.OooO0o0()) {
                            str = item.getTimeLong() + "/" + item.getPromotionPrice() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d));
                        } else {
                            str = item.getPromotionPrice() + "/" + item.getTimeLong() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(DateNumeralUtils.OooO00o(item.getTimeLong(), DateNumeralUtils.DateType.d));
                        }
                        if (item.getPrice() > item.getPromotionPrice()) {
                            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvThemePrice");
                            o000OO00.OooOOOO(textView);
                            textView.setText(String.valueOf(item.getPrice()));
                            textView.getPaint().setFlags(16);
                        }
                        textView2.setText(str);
                    }
                }
            }
            k7Var.f58287OooO0oo.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ThemeLayout.f30758OooO0o0;
                    Function0 function0 = o0ooooo;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29099OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f29100OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ThemeModel themeModel, o0OO00O o0oo00o2) {
            super(0);
            this.f29099OooO0Oo = themeModel;
            this.f29100OooO0o0 = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ThemeModel themeModel = this.f29099OooO0Oo;
            o0OO000.OooO0O0("102015", MapsKt.mapOf(new Pair("shopid", Long.valueOf(themeModel.getShopId()))));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            webPageInfo.OooO0o0(themeModel.getH5Url());
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f29100OooO0o0.f10133OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29102OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ThemeModel themeModel) {
            super(0);
            this.f29102OooO0o0 = themeModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomThemeStoreFragment roomThemeStoreFragment = RoomThemeStoreFragment.this;
            FragmentActivity activity = roomThemeStoreFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOo0o((BaseActivityK) activity, null, 0L, 3);
            roomThemeStoreFragment.getStoreVm().goBuyTheme(this.f29102OooO0o0.getShopId()).observe(roomThemeStoreFragment, new o0000OO0(new o0OOO0o(roomThemeStoreFragment), null, new o0Oo0oo(roomThemeStoreFragment), false, 10));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29103OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f29104OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ThemeModel themeModel, o0OO00O o0oo00o2) {
            super(0);
            this.f29103OooO0Oo = themeModel;
            this.f29104OooO0o0 = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ThemeModel themeModel = this.f29103OooO0Oo;
            o0OO000.OooO0O0("102015", MapsKt.mapOf(new Pair("shopid", Long.valueOf(themeModel.getShopId()))));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            webPageInfo.OooO0o0(themeModel.getH5Url());
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f29104OooO0o0.f10133OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f27140Oooo0oO;
            Context context = RoomThemeStoreFragment.this.getBinding().f59076OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.rvThemeLayout.context");
            PremiumActivity.OooO00o.OooO00o(context, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ThemeModel f29107OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ThemeModel themeModel) {
            super(1);
            this.f29107OooO0o0 = themeModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            o0OO000.OooO00o("105033");
            ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Theme);
            GiveThemeModel giveThemeModel = new GiveThemeModel();
            ThemeModel themeModel = this.f29107OooO0o0;
            giveThemeModel.setThemeName(themeModel.getName());
            if (!StringsKt.isBlank(themeModel.getVideoPath())) {
                giveThemeModel.setVideoUrl(themeModel.getVideoPath());
            } else {
                giveThemeModel.setImageUrl(themeModel.getPic());
            }
            giveThemeModel.setShopId(themeModel.getShopId());
            shareToFriendModel.setGiveThemeModel(giveThemeModel);
            int i = ShareToFriendsActivity.f25730Oooo00o;
            Context contextRequireContext = RoomThemeStoreFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            ShareToFriendsActivity.OooO00o.OooO00o(contextRequireContext, shareToFriendModel);
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
            ((BaseActivityK) context).OooOo0();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$1] */
    public RoomThemeStoreFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.storeVm = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f29115OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f29115OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.themeTypeId = Integer.MAX_VALUE;
        this.isHasRoom = o000000O.f46724OoooOoo.getValue() != null;
    }

    private final String getActivePurchaseContent(ThemeModel model) {
        String strOooO00o;
        if (model.getTimeLong() < 0) {
            return o0000O.OooO00o(p591o0oo000O.OooO.OooO0OO() == 7 ? o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_permanently), model.getName()), String.valueOf(model.getPromotionPrice())) : o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_permanently), String.valueOf(model.getPromotionPrice())), model.getName()), model.getThemeTag());
        }
        if (model.getPromotionPrice() <= 0) {
            strOooO00o = (p591o0oo000O.OooO.OooO0OO() == 7 || p591o0oo000O.OooO.OooO0OO() == 2 || p591o0oo000O.OooO.OooO0OO() == 8) ? o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_claim_XXX__for_activity_XXX_days), String.valueOf(model.getTimeLong())), model.getName()) : o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_claim_XXX__for_activity_XXX_days), model.getName()), String.valueOf(model.getTimeLong()));
        } else if (p591o0oo000O.OooO.OooO0OO() == 7) {
            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getTimeLong())), model.getName()), String.valueOf(model.getPromotionPrice()));
        } else {
            strOooO00o = p591o0oo000O.OooO.OooO0OO() == 8 ? o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getPromotionPrice())), String.valueOf(model.getTimeLong())), model.getName()) : o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_activity_XXX_days), String.valueOf(model.getPromotionPrice())), model.getName()), String.valueOf(model.getTimeLong()));
        }
        return o0000O.OooO00o(strOooO00o, model.getThemeTag());
    }

    private final String getSimplePurchaseContent(ThemeModel model) {
        if (model.getTimeLong() < 0) {
            return o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_permanently), String.valueOf(model.getPromotionPrice())), model.getName());
        }
        return model.getPromotionPrice() <= 0 ? o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_claim_XXX_for_XXX_days), model.getName()), String.valueOf(model.getTimeLong())) : o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_XXX_golds_to_buy_XXX_for_XXX_days), String.valueOf(model.getPromotionPrice())), model.getName()), String.valueOf(model.getTimeLong()));
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
            getStoreVm().getThemeTypeListData(this.themeTypeId).observe(this, new o0000OO0(new OooO0O0(), new OooO0OO(), null, false, 12));
            return;
        }
        o000O<ThemeModel> o000o = this.mAdapter;
        if (o000o != null) {
            o000o.OooOoo();
        }
    }

    private final void initView() {
        OooO0o oooO0o = new OooO0o(getBinding().f59076OooO0O0.getContext(), oO00OO0O.room_item_theme_mine);
        this.mAdapter = oooO0o;
        oooO0o.OooOooo(oOo00OO0.ic_empty_delete);
        o000O<ThemeModel> o000o = this.mAdapter;
        if (o000o != null) {
            o000o.Oooo000(oO00OOo0.no_data);
        }
        o000O<ThemeModel> o000o2 = this.mAdapter;
        if (o000o2 != null) {
            o000o2.Oooo0OO(new OooO());
        }
        getBinding().f59076OooO0O0.setLayoutManager(new GridLayoutManager(getBinding().f59076OooO0O0.getContext(), 2));
        getBinding().f59076OooO0O0.setAdapter(this.mAdapter);
    }

    private final void showBuyConfirmDialog(String content, ThemeModel item) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        o0OO00O o0oo00o2 = new o0OO00O(fragmentActivityRequireActivity);
        o0oo00o2.OooOoO0(oO00OOo0.Confirmation);
        o0oo00o2.OooOo00(content);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.OK);
        if (item.getThemeTagType() == 2 && (!StringsKt.isBlank(item.getH5Url()))) {
            strOooO0OO = o0000.OooO0OO(oO00OOo0.Purchase);
            o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Obtain));
            o0oo00o2.OooOo0O(new OooOO0(item, o0oo00o2));
        } else {
            o0oo00o2.OooOo(true);
        }
        o0oo00o2.OooOOOo(strOooO0OO);
        o0oo00o2.OooOo0(new OooOO0O(item));
        o0oo00o2.OooOO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPurchase(ThemeModel item) {
        boolean z = true;
        if (item.getIsHave() == 1) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_theme_bought);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        int themeTagType = item.getThemeTagType();
        if (themeTagType == 0) {
            showBuyConfirmDialog(getSimplePurchaseContent(item), item);
            return;
        }
        if (themeTagType == 1) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            o0OO00O o0oo00o2 = new o0OO00O(fragmentActivityRequireActivity);
            o0oo00o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.open_vip_alert), item.getThemeTag()));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new OooOOO0());
            o0oo00o2.OooOO0o();
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
        o0OO00O o0oo00o3 = new o0OO00O(fragmentActivityRequireActivity2);
        o0oo00o3.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.join_activity), item.getThemeTag()));
        if (!StringsKt.isBlank(item.getH5Url())) {
            o0oo00o3.OooOOOo(o0000.OooO0OO(oO00OOo0.Obtain));
            o0oo00o3.OooOo0(new OooOOO(item, o0oo00o3));
            o0oo00o3.OooOo(true);
        } else {
            o0oo00o3.OooOOo0(true);
        }
        o0oo00o3.OooOO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSend(ThemeModel item) {
        if (getContext() instanceof BaseActivityK) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOo0o((BaseActivityK) context, null, 0L, 3);
            getStoreVm().getRoomThemeGiveCount().observe(this, new o0000OO0(new OooOOOO(item), null, new OooOo00(), false, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showThemeBigImageDialog(int position, List<ThemeModel> themeModel) {
        if (this.themePreviewDialogIsShowing) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        w3 w3Var = new w3(fragmentActivityRequireActivity, new OooOo(), new Oooo000());
        w3Var.OooO00o(new Oooo0());
        this.themePreviewDialog = w3Var;
        Intrinsics.checkNotNullParameter(themeModel, "themeModel");
        w3Var.f53197OooOOOO = position;
        u3 u3Var = w3Var.f53195OooOOO;
        if (u3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            u3Var = null;
        }
        u3Var.OooOoO0(themeModel);
        w3Var.f53196OooOOO0.f57742OooO0Oo.scrollToPosition(position);
        w3Var.OooOO0();
        w3 w3Var2 = this.themePreviewDialog;
        if (w3Var2 != null) {
            w3Var2.OooO();
        }
        this.themePreviewDialogIsShowing = true;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public v8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v8 v8VarInflate = v8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(v8VarInflate, "inflate(inflater, container, false)");
        return v8VarInflate;
    }
}
