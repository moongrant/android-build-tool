package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final NetImageView f27218OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f27219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetImageView f27220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f27221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ImageView f27222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f27223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f27224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f27225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final TextView f27226OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final TextView f27227OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final NetImageView f27228OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final TextView f27229OooOO0o;

    public o0ooOOo(@NotNull PagingViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f27219OooO00o = (ConstraintLayout) viewHolder.getView(p562o0oOo000.o0OO00O.layout);
        this.f27220OooO0O0 = (NetImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivHead);
        this.f27221OooO0OO = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvName);
        this.f27222OooO0Oo = (ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivLike);
        this.f27224OooO0o0 = (ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivReward);
        this.f27223OooO0o = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvContent);
        this.f27225OooO0oO = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvTime);
        this.f27226OooO0oo = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvReply);
        this.f27218OooO = (NetImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivImage);
        this.f27227OooOO0 = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvGiftNum);
        this.f27228OooOO0O = (NetImageView) viewHolder.getView(p562o0oOo000.o0OO00O.nivGift);
        this.f27229OooOO0o = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.tvCommentContent);
    }
}
