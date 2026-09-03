package p269o00ooooo;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzgd;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzet f41182OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f41184OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41185OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41186OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f41187OooO0oo;

    public o0OO0(zzet zzetVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f41182OooO = zzetVar;
        this.f41183OooO0Oo = i;
        this.f41185OooO0o0 = str;
        this.f41184OooO0o = obj;
        this.f41186OooO0oO = obj2;
        this.f41187OooO0oo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzet zzetVar = this.f41182OooO;
        o0OOO0 o0ooo0Zzm = zzetVar.f41276OooO00o.zzm();
        if (!o0ooo0Zzm.f41275OooO0O0) {
            Log.println(6, zzetVar.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        char c = zzetVar.f15929OooO0OO;
        zzgd zzgdVar = zzetVar.f41276OooO00o;
        if (c == 0) {
            if (zzgdVar.zzf().zzy()) {
                zzgdVar.zzay();
                zzetVar.f15929OooO0OO = 'C';
            } else {
                zzgdVar.zzay();
                zzetVar.f15929OooO0OO = 'c';
            }
        }
        if (zzetVar.f15930OooO0Oo < 0) {
            zzgdVar.zzf().zzh();
            zzetVar.f15930OooO0Oo = 79000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f41183OooO0Oo);
        char c2 = zzetVar.f15929OooO0OO;
        long j = zzetVar.f15930OooO0Oo;
        Object obj = this.f41184OooO0o;
        String str = this.f41185OooO0o0;
        String strOooO0o0 = zzet.OooO0o0(true, str, obj, this.f41186OooO0oO, this.f41187OooO0oo);
        StringBuilder sb = new StringBuilder(FeedbackType.Suggestions);
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j);
        String strOooO0O0 = o0O00o0.OooO0O0(sb, CertificateUtil.DELIMITER, strOooO0o0);
        if (strOooO0O0.length() > 1024) {
            strOooO0O0 = str.substring(0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        zzfg zzfgVar = o0ooo0Zzm.f41210OooO0Oo;
        if (zzfgVar != null) {
            zzfgVar.zzb(strOooO0O0, 1L);
        }
    }
}
