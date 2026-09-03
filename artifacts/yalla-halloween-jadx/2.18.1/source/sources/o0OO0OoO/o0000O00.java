package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzgq;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f37555OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f37556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f37557OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzgq f37558OooO0Oo;

    public o0000O00(zzgq zzgqVar, String str, String str2, String str3) {
        this.f37558OooO0Oo = zzgqVar;
        this.f37555OooO00o = str;
        this.f37556OooO0O0 = str2;
        this.f37557OooO0OO = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.f37558OooO0Oo.f16225OooO00o.OooO00o();
        return this.f37558OooO0Oo.f16225OooO00o.zzi().OooOooO(this.f37555OooO00o, this.f37556OooO0O0, this.f37557OooO0OO);
    }
}
