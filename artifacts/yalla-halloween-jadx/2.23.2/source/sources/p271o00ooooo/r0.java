package p271o00ooooo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements v0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzlh f40833OooO00o;

    public r0(zzlh zzlhVar) {
        this.f40833OooO00o = zzlhVar;
    }

    @Override // p271o00ooooo.v0
    public final void OooO00o(Bundle bundle, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlh zzlhVar = this.f40833OooO00o;
        if (!zIsEmpty) {
            zzlhVar.zzaB().zzp(new q0(this, str, bundle));
            return;
        }
        zzgd zzgdVar = zzlhVar.f15615OooOO0o;
        if (zzgdVar != null) {
            zzgdVar.zzaA().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
