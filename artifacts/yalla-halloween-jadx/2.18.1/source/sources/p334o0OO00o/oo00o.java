package p334o0OO00o;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhi;
import javax.annotation.Nullable;
import p334o0OO00o.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements o00O00OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("GservicesLoader.class")
    public static oo00o f37455OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f37456OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00O00o0 f37457OooO0O0;

    public oo00o() {
        this.f37456OooO00o = null;
        this.f37457OooO0O0 = null;
    }

    public oo00o(Context context) {
        this.f37456OooO00o = context;
        o00O00o0 o00o00o1 = new o00O00o0();
        this.f37457OooO0O0 = o00o00o1;
        context.getContentResolver().registerContentObserver(zzgz.zza, true, o00o00o1);
    }

    @Override // p334o0OO00o.o00O00OO
    @Nullable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f37456OooO00o;
        if (context != null && !zzha.zza(context)) {
            try {
                return (String) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhk
                    @Override // com.google.android.gms.internal.measurement.zzhi
                    public final Object zza() {
                        oo00o oo00oVar = this.zza;
                        return zzgz.zza(oo00oVar.f37456OooO00o.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }
}
