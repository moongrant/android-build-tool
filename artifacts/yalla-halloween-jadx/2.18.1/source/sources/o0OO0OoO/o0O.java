package o0OO0OoO;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzkz;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O implements o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzkz f37723OooO00o;

    public o0O(zzkz zzkzVar) {
        this.f37723OooO00o = zzkzVar;
    }

    @Override // o0OO0OoO.o0OO00OO
    public final void OooO00o(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f37723OooO00o.zzaz().zzp(new o0O0oo00(this, str, bundle));
            return;
        }
        zzfy zzfyVar = this.f37723OooO00o.f16294OooOO0o;
        if (zzfyVar != null) {
            zzfyVar.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
