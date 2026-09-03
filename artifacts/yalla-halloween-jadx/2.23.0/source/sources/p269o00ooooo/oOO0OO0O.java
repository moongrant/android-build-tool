package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzlh f41464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Runnable f41465OooO0o0;

    public oOO0OO0O(zzlh zzlhVar, Runnable runnable) {
        this.f41464OooO0Oo = zzlhVar;
        this.f41465OooO0o0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzlh zzlhVar = this.f41464OooO0Oo;
        zzlhVar.OooO00o();
        zzlhVar.zzaB().zzg();
        if (zzlhVar.f16095OooOOOo == null) {
            zzlhVar.f16095OooOOOo = new ArrayList();
        }
        zzlhVar.f16095OooOOOo.add(this.f41465OooO0o0);
        zzlhVar.OooOOOO();
    }
}
