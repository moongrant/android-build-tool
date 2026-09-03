package androidx.camera.core.impl;

import com.common.support.utils.UtilsKt;
import com.yy.yyeva.view.EvaAnimViewV3;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3672OooO0o0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f3671OooO0Oo = i;
        this.f3672OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3671OooO0Oo;
        Object obj = this.f3672OooO0o0;
        switch (i) {
            case 0:
                ((com.google.common.util.concurrent.OooOO0O) obj).cancel(true);
                break;
            case 1:
                UtilsKt.m4031runOnUiThread$lambda0((Function0) obj);
                break;
            default:
                EvaAnimViewV3.onSurfaceTextureDestroyed$lambda$4((EvaAnimViewV3) obj);
                break;
        }
    }
}
