package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p402o0Oo0OOO.o00O000o;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f28906OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VipPrivilegeInfo f28907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f28908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28909OooOO0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f28910OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28911OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O0 o0000o1, ViewHolder viewHolder) {
            super(0);
            this.f28910OooO0Oo = o0000o1;
            this.f28911OooO0o0 = viewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28910OooO0Oo.notifyItemChanged(this.f28911OooO0o0.getLayoutPosition());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ VipPrivilegeInfo f28912OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f28913OooO0o0;

        public OooO0O0(VipPrivilegeInfo vipPrivilegeInfo, o0000O0 o0000o1) {
            this.f28912OooO0Oo = vipPrivilegeInfo;
            this.f28913OooO0o0 = o0000o1;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String url = str;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VIPNobleIntroductionPage);
            Intrinsics.checkNotNullExpressionValue(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(oO00OOo0.Exclusive_privileges));
            VipPrivilegeInfo vipPrivilegeInfo = this.f28912OooO0Oo;
            webPageInfo.OooO00o("vipdetails", String.valueOf(vipPrivilegeInfo.getIdentId()));
            webPageInfo.OooO00o("vipid", String.valueOf(vipPrivilegeInfo.getShopId()));
            int i = WebActivity.f25584OooOoO0;
            Context context = this.f28913OooO0o0.f56196OooOo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            WebActivity.OooO00o.OooO00o(context, webPageInfo);
        }
    }

    public o0000oo(VipPrivilegeInfo vipPrivilegeInfo, PremiumFragment premiumFragment, o0000O0 o0000o1, ViewHolder viewHolder) {
        this.f28907OooO0oO = vipPrivilegeInfo;
        this.f28908OooO0oo = premiumFragment;
        this.f28906OooO = o0000o1;
        this.f28909OooOO0 = viewHolder;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VipPrivilegeInfo vipPrivilegeInfo = this.f28907OooO0oO;
        if (vipPrivilegeInfo.getState() == 0) {
            return;
        }
        VipPrivilegeInfo.Companion companion = VipPrivilegeInfo.INSTANCE;
        int identId = vipPrivilegeInfo.getIdentId();
        o0000O0 o0000o1 = this.f28906OooO;
        companion.setShowRedDot(identId, new OooO00o(o0000o1, this.f28909OooOO0));
        o00O000o.f44492OooO0OO.observe(this.f28908OooO0oo.getViewLifecycleOwner(), new OooO0O0(vipPrivilegeInfo, o0000o1));
    }
}
