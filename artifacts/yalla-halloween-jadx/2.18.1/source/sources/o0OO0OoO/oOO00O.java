package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzjs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f37886Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37888Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37889Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzid f37890OoooO00;

    public oOO00O(zzid zzidVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f37890OoooO00 = zzidVar;
        this.f37887Oooo0o = atomicReference;
        this.f37888Oooo0oO = str;
        this.f37889Oooo0oo = str2;
        this.f37886Oooo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVarZzt = this.f37890OoooO00.f37615OooO00o.zzt();
        AtomicReference atomicReference = this.f37887Oooo0o;
        String str = this.f37888Oooo0oO;
        String str2 = this.f37889Oooo0oo;
        boolean z = this.f37886Oooo;
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        zzjsVarZzt.OooOO0(new o0O000o0(zzjsVarZzt, atomicReference, str, str2, zzjsVarZzt.OooO0oO(false), z));
    }
}
