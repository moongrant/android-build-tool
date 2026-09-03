package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00O0o f25492OooO0Oo = new o0O00O0o();

    public o0O00O0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!com.code.android.util.OooOo00.OooO00o(url)) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32280OooO = true;
            webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_unique_id));
            webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        }
        return Unit.INSTANCE;
    }
}
