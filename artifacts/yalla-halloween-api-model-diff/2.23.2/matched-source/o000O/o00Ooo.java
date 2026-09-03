package o000O;

import com.common.support.utils.UtilsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33868OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f33867OooO0Oo = i;
        this.f33868OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33867OooO0Oo;
        Object obj = this.f33868OooO0o0;
        switch (i) {
            case 0:
                ((androidx.media3.exoplayer.source.Oooo0) obj).OooOo();
                break;
            default:
                UtilsKt.m4030runDelayedOnUiThread$lambda1((Function0) obj);
                break;
        }
    }
}
