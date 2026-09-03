package com.yalla.yalla.ui.view;

import android.content.Context;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f25035Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f25036Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f25037Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MomentDetailView momentDetailView, Context context, int i) {
        super(0);
        this.f25035Oooo0o = momentDetailView;
        this.f25036Oooo0oO = context;
        this.f25037Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25035Oooo0o.OooOo0();
        PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
        Context context = this.f25036Oooo0oO;
        MomentDetailView momentDetailView = this.f25035Oooo0o;
        MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
        int i = this.f25037Oooo0oo;
        MomentAdapterTag momentAdapterTag = momentDetailView.f24938Oooo;
        PostDetailActivity.f22417o0O0O00.OooO00o(context, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : i, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
        return null;
    }
}
