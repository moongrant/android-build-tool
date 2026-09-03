package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.AdVM;
import com.yalla.yalla.model.MomentAdDataModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p649o0ooOOoo.be;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailAdView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailAdView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public AdVM f24861Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final be f24862Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public MomentAdDataModel f24863Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f24864Oooo0oo;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentDetailAdView momentDetailAdView = MomentDetailAdView.this;
            Objects.requireNonNull(momentDetailAdView);
            LiveEventBus.get("POST_FEATURED_AD_DELETE").post(Integer.valueOf(momentDetailAdView.f24864Oooo0oo));
        }
    }

    public static final class OooO0O0 extends o00Oo0 {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Context f24867OoooO00;

        public OooO0O0(Context context) {
            this.f24867OoooO00 = context;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentAdDataModel momentAdDataModel = MomentDetailAdView.this.f24863Oooo0oO;
            if (momentAdDataModel != null) {
                long adId = momentAdDataModel.getAdId();
                MomentDetailAdView momentDetailAdView = MomentDetailAdView.this;
                Context context = this.f24867OoooO00;
                if (momentDetailAdView.f24861Oooo == null) {
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    momentDetailAdView.f24861Oooo = (AdVM) new ViewModelProvider((FragmentActivity) context).get(AdVM.class);
                }
                AdVM adVM = momentDetailAdView.f24861Oooo;
                if (adVM != null) {
                    adVM.advertUserLogInsClick(adId);
                }
            }
            MomentDetailAdView momentDetailAdView2 = MomentDetailAdView.this;
            MomentAdDataModel momentAdDataModel2 = momentDetailAdView2.f24863Oooo0oO;
            if (momentAdDataModel2 == null || !(!StringsKt.isBlank(momentAdDataModel2.getAdUrl()))) {
                return;
            }
            o0O00000.OooO0OO("Featured_ad");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
            webPageInfo.OooO0Oo(momentAdDataModel2.getAdUrl());
            webPageInfo.OooO0OO(momentAdDataModel2.getAdTitle());
            WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
            Context context2 = momentDetailAdView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            oooO00o.OooO00o(context2, webPageInfo);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailAdView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        be beVarInflate = be.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(beVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24862Oooo0o = beVarInflate;
        beVarInflate.f49036OooO0Oo.setOnClickListener(new OooO00o());
        setOnClickListener(new OooO0O0(context));
    }
}
