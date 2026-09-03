package p045Oooooo;

import android.content.Context;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.yy.yyeva.view.EvaAnimViewV3;
import p003OooO0o0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1963OooO0o0;

    public /* synthetic */ o000O0(int i, Object obj, Object obj2) {
        this.f1961OooO0Oo = i;
        this.f1963OooO0o0 = obj;
        this.f1962OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1961OooO0Oo;
        Object obj = this.f1962OooO0o;
        Object obj2 = this.f1963OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj2).OooO0O0((o0OoOo0) obj);
                return;
            case 1:
                o0O0O00.OooO0O0(obj2);
                int i2 = AdsMediaSource.f13155OooOO0O;
                throw null;
            default:
                EvaAnimViewV3.prepareTextureViewRunnable$lambda$1((EvaAnimViewV3) obj2, (Context) obj);
                return;
        }
    }
}
