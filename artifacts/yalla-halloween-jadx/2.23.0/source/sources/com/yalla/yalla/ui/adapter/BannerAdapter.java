package com.yalla.yalla.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.BarBannerModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class BannerAdapter extends com.youth.banner.adapter.BannerAdapter<BarBannerModel.BarBannerItem, BannerViewHolder> {

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/adapter/BannerAdapter$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Lcom/yalla/netimage/NetImageView;", "iv", "Lcom/yalla/netimage/NetImageView;", "getIv", "()Lcom/yalla/netimage/NetImageView;", "<init>", "(Lcom/yalla/netimage/NetImageView;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BannerViewHolder extends RecyclerView.o0O0O00 {
        public static final int $stable = 8;

        @NotNull
        private final NetImageView iv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerViewHolder(@NotNull NetImageView iv) {
            super(iv);
            Intrinsics.checkNotNullParameter(iv, "iv");
            this.iv = iv;
        }

        @NotNull
        public final NetImageView getIv() {
            return this.iv;
        }
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i, int i2) {
        BannerViewHolder bannerViewHolder = (BannerViewHolder) obj;
        BarBannerModel.BarBannerItem data = (BarBannerModel.BarBannerItem) obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNull(bannerViewHolder);
        if (bannerViewHolder.getIv().getContext() instanceof Activity) {
            Context context = bannerViewHolder.getIv().getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(bannerViewHolder.getIv().getContext());
        oooO00o.f43911OooO0OO = data.getImageUrl();
        oooO00o.f43909OooO00o = 0;
        int i3 = oOo00OO0.icon_picture_default_banner;
        oooO00o.f43923OooOOOo = i3;
        oooO00o.f43913OooO0o = i3;
        oooO00o.f43914OooO0o0 = true;
        oooO00o.OooO0Oo(bannerViewHolder.getIv());
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final Object onCreateHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNull(viewGroup);
        NetImageView netImageView = new NetImageView(viewGroup.getContext());
        netImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerViewHolder(netImageView);
    }
}
