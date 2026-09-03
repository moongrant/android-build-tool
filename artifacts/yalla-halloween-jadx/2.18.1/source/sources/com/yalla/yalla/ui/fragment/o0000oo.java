package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.fragment.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ VipPrivilegeInfo f24489Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f24490OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f24491OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f24492OoooO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f24493Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ p188o00o00o0.OooO0o f24494Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O0 o0000o1, p188o00o00o0.OooO0o oooO0o) {
            super(0);
            this.f24493Oooo0o = o0000o1;
            this.f24494Oooo0oO = oooO0o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24493Oooo0o.notifyItemChanged(this.f24494Oooo0oO.getLayoutPosition());
            return Unit.INSTANCE;
        }
    }

    public o0000oo(VipPrivilegeInfo vipPrivilegeInfo, PremiumFragment premiumFragment, o0000O0 o0000o1, p188o00o00o0.OooO0o oooO0o) {
        this.f24489Oooo = vipPrivilegeInfo;
        this.f24491OoooO00 = premiumFragment;
        this.f24490OoooO0 = o0000o1;
        this.f24492OoooO0O = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f24489Oooo.getState() == 0) {
            return;
        }
        VipPrivilegeInfo.INSTANCE.setShowRedDot(this.f24489Oooo.getIdentId(), new OooO00o(this.f24490OoooO0, this.f24492OoooO0O));
        MutableLiveData<String> premiumUrl = SharedUrlManager.INSTANCE.getPremiumUrl();
        LifecycleOwner viewLifecycleOwner = this.f24491OoooO00.getViewLifecycleOwner();
        final VipPrivilegeInfo vipPrivilegeInfo = this.f24489Oooo;
        final o0000O0 o0000o1 = this.f24490OoooO0;
        premiumUrl.observe(viewLifecycleOwner, new Observer() { // from class: o0oOoOoO.r2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VipPrivilegeInfo item = vipPrivilegeInfo;
                o0000O0 this$0 = o0000o1;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (url == null || StringsKt.isBlank(url)) {
                    return;
                }
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VIPNobleIntroductionPage);
                Intrinsics.checkNotNullExpressionValue(url, "url");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f21217Oooo0oO = url;
                webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.Exclusive_privileges));
                webPageInfo.OooO00o("vipdetails", String.valueOf(item.getIdentId()));
                webPageInfo.OooO00o("vipid", String.valueOf(item.getShopId()));
                WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oooO00o.OooO00o(context, webPageInfo);
            }
        });
    }
}
