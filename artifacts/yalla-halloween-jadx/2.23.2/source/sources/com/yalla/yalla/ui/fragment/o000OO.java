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
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o0000O f28387OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VipPrivilegeInfo f28388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f28389OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f28390OooOO0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000O f28391OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f28392OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O o0000o2, ViewHolder viewHolder) {
            super(0);
            this.f28391OooO0Oo = o0000o2;
            this.f28392OooO0o0 = viewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28391OooO0Oo.notifyItemChanged(this.f28392OooO0o0.getLayoutPosition());
            return Unit.INSTANCE;
        }
    }

    public o000OO(VipPrivilegeInfo vipPrivilegeInfo, PremiumFragment premiumFragment, o0000O o0000o2, ViewHolder viewHolder) {
        this.f28388OooO0oO = vipPrivilegeInfo;
        this.f28389OooO0oo = premiumFragment;
        this.f28387OooO = o0000o2;
        this.f28390OooOO0 = viewHolder;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final VipPrivilegeInfo vipPrivilegeInfo = this.f28388OooO0oO;
        if (vipPrivilegeInfo.getState() == 0) {
            return;
        }
        VipPrivilegeInfo.Companion companion = VipPrivilegeInfo.INSTANCE;
        int identId = vipPrivilegeInfo.getIdentId();
        final o0000O o0000o2 = this.f28387OooO;
        companion.setShowRedDot(identId, new OooO00o(o0000o2, this.f28390OooOO0));
        p583o0oOoo00.o00000OO.f56661OooO0OO.observe(this.f28389OooO0oo.getViewLifecycleOwner(), new Observer() { // from class: com.yalla.yalla.ui.fragment.o0000O0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String url = (String) obj;
                VipPrivilegeInfo item = vipPrivilegeInfo;
                Intrinsics.checkNotNullParameter(item, "$item");
                o0000O this$0 = o0000o2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (url == null || StringsKt.isBlank(url)) {
                    return;
                }
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VIPNobleIntroductionPage);
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32283OooO0o0 = url;
                webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Exclusive_privileges));
                webPageInfo.OooO00o("vipdetails", String.valueOf(item.getIdentId()));
                webPageInfo.OooO00o("vipid", String.valueOf(item.getShopId()));
                int i = WebActivity.f25130OooOoO0;
                Context context = this$0.f56423OooOo;
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                WebActivity.OooO00o.OooO00o(context, webPageInfo);
            }
        });
    }
}
