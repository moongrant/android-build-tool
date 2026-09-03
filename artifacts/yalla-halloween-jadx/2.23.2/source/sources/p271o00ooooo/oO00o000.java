package p271o00ooooo;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzgd;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o000 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzet f40583OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f40584OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f40585OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40586OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40587OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f40588OooO0oo;

    public oO00o000(zzet zzetVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f40583OooO = zzetVar;
        this.f40584OooO0Oo = i;
        this.f40586OooO0o0 = str;
        this.f40585OooO0o = obj;
        this.f40587OooO0oO = obj2;
        this.f40588OooO0oo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzet zzetVar = this.f40583OooO;
        oOo000Oo ooo000ooZzm = zzetVar.f40788OooO00o.zzm();
        if (!ooo000ooZzm.f40534OooO0O0) {
            Log.println(6, zzetVar.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        char c = zzetVar.f15453OooO0OO;
        zzgd zzgdVar = zzetVar.f40788OooO00o;
        if (c == 0) {
            if (zzgdVar.zzf().zzy()) {
                zzgdVar.zzay();
                zzetVar.f15453OooO0OO = 'C';
            } else {
                zzgdVar.zzay();
                zzetVar.f15453OooO0OO = 'c';
            }
        }
        if (zzetVar.f15454OooO0Oo < 0) {
            zzgdVar.zzf().zzh();
            zzetVar.f15454OooO0Oo = 79000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f40584OooO0Oo);
        char c2 = zzetVar.f15453OooO0OO;
        long j = zzetVar.f15454OooO0Oo;
        Object obj = this.f40585OooO0o;
        String str = this.f40586OooO0o0;
        String strOooO0o0 = zzet.OooO0o0(true, str, obj, this.f40587OooO0oO, this.f40588OooO0oo);
        StringBuilder sb = new StringBuilder(FeedbackType.Suggestions);
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j);
        String strOooO0O0 = o0oOO.OooO0O0(sb, CertificateUtil.DELIMITER, strOooO0o0);
        if (strOooO0O0.length() > 1024) {
            strOooO0O0 = str.substring(0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        zzfg zzfgVar = ooo000ooZzm.f40766OooO0Oo;
        if (zzfgVar != null) {
            zzfgVar.zzb(strOooO0O0, 1L);
        }
    }
}
