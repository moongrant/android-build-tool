package com.facebook.appevents;

import android.graphics.SurfaceTexture;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.jvm.internal.Intrinsics;
import p608o0oo0Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10578OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f10577OooO0Oo = i;
        this.f10578OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10577OooO0Oo) {
            case 0:
                AnalyticsUserIDStore.m4055setUserID$lambda1((String) this.f10578OooO0o0);
                break;
            default:
                o0000O00 this$0 = (o0000O00) this.f10578OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    SurfaceTexture surfaceTexture = this$0.f56980OooOO0O;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
                        evaJniUtil.renderFrame(this$0.f56971OooO0Oo.f56944OooO0O0);
                        this$0.f56971OooO0Oo.f56961OooOo.OooO0Oo();
                        evaJniUtil.renderSwapBuffers(this$0.f56971OooO0Oo.f56944OooO0O0);
                    }
                } catch (Throwable tr) {
                    String msg = "render exception=" + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                    return;
                }
                break;
        }
    }
}
