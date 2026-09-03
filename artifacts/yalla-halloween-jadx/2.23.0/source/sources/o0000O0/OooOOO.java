package o0000O0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Callable<OooOo00.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f34063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f34064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f34065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34066OooO0Oo;

    public OooOOO(String str, Context context, OooOO0 oooOO1, int i) {
        this.f34063OooO00o = str;
        this.f34064OooO0O0 = context;
        this.f34065OooO0OO = oooOO1;
        this.f34066OooO0Oo = i;
    }

    @Override // java.util.concurrent.Callable
    public final OooOo00.OooO00o call() throws Exception {
        try {
            return OooOo00.OooO00o(this.f34063OooO00o, this.f34064OooO0O0, this.f34065OooO0OO, this.f34066OooO0Oo);
        } catch (Throwable unused) {
            return new OooOo00.OooO00o(-3);
        }
    }
}
