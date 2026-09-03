package com.facebook.login;

import android.net.Uri;
import android.os.Bundle;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.facebook.internal.PlatformServiceClient;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0O implements PlatformServiceClient.CompletedListener, o00Oo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f12869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f12870OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, Object obj2) {
        this.f12869OooO0Oo = obj;
        this.f12870OooO0o0 = obj2;
    }

    @Override // o00Oo00.OooO0O0
    public final void OooO0O0(Object obj, int i, Object obj2) {
        ShowImageActivity this$0 = (ShowImageActivity) this.f12869OooO0Oo;
        String finalOriginalImage = (String) this.f12870OooO0o0;
        AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
        ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(finalOriginalImage, "$finalOriginalImage");
        if (absListenerTag == AbsListenerTag.Ok) {
            String string = Uri.parse(finalOriginalImage).toString();
            Intrinsics.checkNotNullExpressionValue(string, "parse(finalOriginalImage).toString()");
            this$0.Oooo0(string);
        }
    }

    @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
    public final void completed(Bundle bundle) {
        GetTokenLoginMethodHandler.m225tryAuthorize$lambda1((GetTokenLoginMethodHandler) this.f12869OooO0Oo, (LoginClient.Request) this.f12870OooO0o0, bundle);
    }
}
