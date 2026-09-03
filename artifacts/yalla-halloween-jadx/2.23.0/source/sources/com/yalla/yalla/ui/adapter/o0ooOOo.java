package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final NetImageView f27674OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f27675OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetImageView f27676OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f27677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ImageView f27678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f27679OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f27680OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f27681OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final TextView f27682OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final TextView f27683OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final NetImageView f27684OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final TextView f27685OooOO0o;

    public o0ooOOo(@NotNull PagingViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f27675OooO00o = (ConstraintLayout) viewHolder.getView(oO00O0oO.layout);
        this.f27676OooO0O0 = (NetImageView) viewHolder.getView(oO00O0oO.ivHead);
        this.f27677OooO0OO = (TextView) viewHolder.getView(oO00O0oO.tvName);
        this.f27678OooO0Oo = (ImageView) viewHolder.getView(oO00O0oO.ivLike);
        this.f27680OooO0o0 = (ImageView) viewHolder.getView(oO00O0oO.ivReward);
        this.f27679OooO0o = (TextView) viewHolder.getView(oO00O0oO.tvContent);
        this.f27681OooO0oO = (TextView) viewHolder.getView(oO00O0oO.tvTime);
        this.f27682OooO0oo = (TextView) viewHolder.getView(oO00O0oO.tvReply);
        this.f27674OooO = (NetImageView) viewHolder.getView(oO00O0oO.ivImage);
        this.f27683OooOO0 = (TextView) viewHolder.getView(oO00O0oO.tvGiftNum);
        this.f27684OooOO0O = (NetImageView) viewHolder.getView(oO00O0oO.nivGift);
        this.f27685OooOO0o = (TextView) viewHolder.getView(oO00O0oO.tvCommentContent);
    }
}
