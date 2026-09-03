package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzlh f40866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Runnable f40867OooO0o0;

    public y(zzlh zzlhVar, Runnable runnable) {
        this.f40866OooO0Oo = zzlhVar;
        this.f40867OooO0o0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzlh zzlhVar = this.f40866OooO0Oo;
        zzlhVar.OooO00o();
        zzlhVar.zzaB().zzg();
        if (zzlhVar.f15619OooOOOo == null) {
            zzlhVar.f15619OooOOOo = new ArrayList();
        }
        zzlhVar.f15619OooOOOo.add(this.f40867OooO0o0);
        zzlhVar.OooOOOO();
    }
}
