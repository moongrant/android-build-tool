package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.net.Uri;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f25156OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(WebActivity webActivity) {
        super(0);
        this.f25156OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = WebActivity.f25130OooOoO0;
        WebActivity webActivity = this.f25156OooO0Oo;
        webActivity.OooOoO0().setShowDropdownMenu(false);
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            WebPageInfo webPageInfo = webActivity.f25137OooOo0O;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            intent.setData(Uri.parse(c1.OooO00o(webPageInfo.f32283OooO0o0)));
            if (intent.resolveActivity(webActivity.getPackageManager()) != null) {
                webActivity.startActivity(Intent.createChooser(intent, ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
