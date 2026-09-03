package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.UserReturnRewardModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f24459Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(View view) {
        super(0);
        this.f24459Oooo0o = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserReturnRewardModel value = OooOOO.f41216OooO00o.OooOoOO().getValue();
        if (value == null) {
            return null;
        }
        View view = this.f24459Oooo0o;
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
        webPageInfo.OooO0Oo(o00O0.OooO0oO(value.getActionH5Url()));
        webPageInfo.f21220OoooO0 = true;
        WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        oooO00o.OooO00o(context, webPageInfo);
        return Unit.INSTANCE;
    }
}
