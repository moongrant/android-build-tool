package com.yalla.yalla.ui.fragment;

import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SVGAView f24551Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ImageView f24552Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(SVGAView sVGAView, ImageView imageView) {
        super(0);
        this.f24551Oooo0o = sVGAView;
        this.f24552Oooo0oO = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SVGAView rewardSvga = this.f24551Oooo0o;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        rewardSvga.setVisibility(4);
        this.f24552Oooo0oO.setVisibility(0);
        this.f24552Oooo0oO.setImageResource(R.drawable.icon_reward_red);
        return Unit.INSTANCE;
    }
}
