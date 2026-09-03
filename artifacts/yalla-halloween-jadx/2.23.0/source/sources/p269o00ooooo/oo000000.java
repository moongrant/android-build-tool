package p269o00ooooo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000000 implements O0OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzlh f41529OooO00o;

    public oo000000(zzlh zzlhVar) {
        this.f41529OooO00o = zzlhVar;
    }

    @Override // p269o00ooooo.O0OO00
    public final void OooO00o(Bundle bundle, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlh zzlhVar = this.f41529OooO00o;
        if (!zIsEmpty) {
            zzlhVar.zzaB().zzp(new oOo0o00(this, str, bundle));
            return;
        }
        zzgd zzgdVar = zzlhVar.f16091OooOO0o;
        if (zzgdVar != null) {
            zzgdVar.zzaA().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
