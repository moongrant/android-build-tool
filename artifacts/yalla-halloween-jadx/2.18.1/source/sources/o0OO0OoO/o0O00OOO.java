package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzkz;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00OOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzkz f37754Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Runnable f37755Oooo0oO;

    public o0O00OOO(zzkz zzkzVar, Runnable runnable) {
        this.f37754Oooo0o = zzkzVar;
        this.f37755Oooo0oO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37754Oooo0o.OooO00o();
        zzkz zzkzVar = this.f37754Oooo0o;
        Runnable runnable = this.f37755Oooo0oO;
        zzkzVar.zzaz().zzg();
        if (zzkzVar.f16298OooOOOo == null) {
            zzkzVar.f16298OooOOOo = new ArrayList();
        }
        zzkzVar.f16298OooOOOo.add(runnable);
        this.f37754Oooo0o.OooOOOo();
    }
}
