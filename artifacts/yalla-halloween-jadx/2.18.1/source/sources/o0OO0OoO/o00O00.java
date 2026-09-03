package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzjs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzid f37633Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37634Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37635Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37636Oooo0oo;

    public o00O00(zzid zzidVar, AtomicReference atomicReference, String str, String str2) {
        this.f37633Oooo = zzidVar;
        this.f37634Oooo0o = atomicReference;
        this.f37635Oooo0oO = str;
        this.f37636Oooo0oo = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVarZzt = this.f37633Oooo.f37615OooO00o.zzt();
        AtomicReference atomicReference = this.f37634Oooo0o;
        String str = this.f37635Oooo0oO;
        String str2 = this.f37636Oooo0oo;
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o0OoOoOo(zzjsVarZzt, atomicReference, str, str2, zzjsVarZzt.OooO0oO(false)));
    }
}
