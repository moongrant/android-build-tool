package o0OO0OoO;

import android.util.Log;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzfb;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f37715Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37716Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37717Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37718Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzeo f37719OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37720OoooO00;

    public o00Ooo(zzeo zzeoVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f37719OoooO0 = zzeoVar;
        this.f37716Oooo0o = i;
        this.f37717Oooo0oO = str;
        this.f37718Oooo0oo = obj;
        this.f37715Oooo = obj2;
        this.f37720OoooO00 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0O0O00 o0o0o00Zzm = this.f37719OoooO0.f37615OooO00o.zzm();
        if (!o0o0o00Zzm.OooO0Oo()) {
            Log.println(6, this.f37719OoooO0.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeo zzeoVar = this.f37719OoooO0;
        if (zzeoVar.f16133OooO0OO == 0) {
            if (zzeoVar.f37615OooO00o.zzf().zzy()) {
                zzeo zzeoVar2 = this.f37719OoooO0;
                zzeoVar2.f37615OooO00o.zzaw();
                zzeoVar2.f16133OooO0OO = 'C';
            } else {
                zzeo zzeoVar3 = this.f37719OoooO0;
                zzeoVar3.f37615OooO00o.zzaw();
                zzeoVar3.f16133OooO0OO = 'c';
            }
        }
        zzeo zzeoVar4 = this.f37719OoooO0;
        if (zzeoVar4.f16134OooO0Oo < 0) {
            zzeoVar4.f37615OooO00o.zzf().zzh();
            zzeoVar4.f16134OooO0Oo = 73000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f37716Oooo0o);
        zzeo zzeoVar5 = this.f37719OoooO0;
        char c = zzeoVar5.f16133OooO0OO;
        long j = zzeoVar5.f16134OooO0Oo;
        String strOooO0o = zzeo.OooO0o(true, this.f37717Oooo0oO, this.f37718Oooo0oo, this.f37715Oooo, this.f37720OoooO00);
        StringBuilder sb = new StringBuilder();
        sb.append(FeedbackType.Suggestions);
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        String strOooO00o = p058o0000OoO.OooO.OooO00o(sb, CertificateUtil.DELIMITER, strOooO0o);
        if (strOooO00o.length() > 1024) {
            strOooO00o = this.f37717Oooo0oO.substring(0, 1024);
        }
        zzfb zzfbVar = o0o0o00Zzm.f37765OooO0Oo;
        if (zzfbVar != null) {
            zzfbVar.zzb(strOooO00o, 1L);
        }
    }
}
