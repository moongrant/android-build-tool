package o0OO0OoO;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f37571OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzfy f37572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f37573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f37574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f37575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f37576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f37577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f37578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f37579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f37580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f37581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f37582OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f37583OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f37584OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f37585OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f37586OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Boolean f37587OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public String f37588OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f37589OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f37590OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f37591OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ArrayList f37592OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f37593OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f37594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f37595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f37596OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f37597OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f37598OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public String f37599OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f37600OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f37601OooOooo;

    @WorkerThread
    public o000O(zzfy zzfyVar, String str) {
        Preconditions.checkNotNull(zzfyVar);
        Preconditions.checkNotEmpty(str);
        this.f37572OooO00o = zzfyVar;
        this.f37573OooO0O0 = str;
        zzfyVar.zzaz().zzg();
    }

    @WorkerThread
    public final void OooO(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37600OooOooO != j;
        this.f37600OooOooO = j;
    }

    @Nullable
    @WorkerThread
    public final List OooO00o() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37592OooOo00;
    }

    @WorkerThread
    public final void OooO0O0() {
        this.f37572OooO00o.zzaz().zzg();
        long j = this.f37578OooO0oO + 1;
        if (j > 2147483647L) {
            this.f37572OooO00o.zzay().zzk().zzb("Bundle index overflow. appId", zzeo.OooO0o0(this.f37573OooO0O0));
            j = 0;
        }
        this.f37598OooOoo = true;
        this.f37578OooO0oO = j;
    }

    @WorkerThread
    public final void OooO0OO(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f37598OooOoo |= true ^ zzg.zza(this.f37588OooOOo0, str);
        this.f37588OooOOo0 = str;
    }

    @WorkerThread
    public final void OooO0Oo(boolean z) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37586OooOOOo != z;
        this.f37586OooOOOo = z;
    }

    @WorkerThread
    public final void OooO0o(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37582OooOO0o, str);
        this.f37582OooOO0o = str;
    }

    @WorkerThread
    public final void OooO0o0(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37574OooO0OO, str);
        this.f37574OooO0OO = str;
    }

    @WorkerThread
    public final void OooO0oO(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37580OooOO0, str);
        this.f37580OooOO0 = str;
    }

    @WorkerThread
    public final void OooO0oo(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37581OooOO0O != j;
        this.f37581OooOO0O = j;
    }

    @WorkerThread
    public final void OooOO0(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37583OooOOO != j;
        this.f37583OooOOO = j;
    }

    @WorkerThread
    public final void OooOO0O(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37589OooOOoo != j;
        this.f37589OooOOoo = j;
    }

    @WorkerThread
    public final void OooOO0o(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37601OooOooo != j;
        this.f37601OooOooo = j;
    }

    @WorkerThread
    public final void OooOOO(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f37598OooOoo |= true ^ zzg.zza(this.f37575OooO0Oo, str);
        this.f37575OooO0Oo = str;
    }

    @WorkerThread
    public final void OooOOO0(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37576OooO0o, str);
        this.f37576OooO0o = str;
    }

    @WorkerThread
    public final void OooOOOO(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37584OooOOO0 != j;
        this.f37584OooOOO0 = j;
    }

    @WorkerThread
    public final void OooOOOo(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37599OooOoo0, str);
        this.f37599OooOoo0 = str;
    }

    @WorkerThread
    public final void OooOOo() {
        this.f37572OooO00o.zzaz().zzg();
    }

    @WorkerThread
    public final void OooOOo0(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37571OooO != j;
        this.f37571OooO = j;
    }

    @WorkerThread
    public final void OooOOoo(long j) {
        Preconditions.checkArgument(j >= 0);
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo = (this.f37578OooO0oO != j) | this.f37598OooOoo;
        this.f37578OooO0oO = j;
    }

    @WorkerThread
    public final void OooOo(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37591OooOo0, str);
        this.f37591OooOo0 = str;
    }

    @WorkerThread
    public final void OooOo0(boolean z) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37585OooOOOO != z;
        this.f37585OooOOOO = z;
    }

    @WorkerThread
    public final void OooOo00(long j) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= this.f37579OooO0oo != j;
        this.f37579OooO0oo = j;
    }

    @WorkerThread
    public final void OooOo0O(@Nullable String str) {
        this.f37572OooO00o.zzaz().zzg();
        this.f37598OooOoo |= !zzg.zza(this.f37577OooO0o0, str);
        this.f37577OooO0o0 = str;
    }

    @WorkerThread
    public final void OooOo0o(@Nullable List list) {
        this.f37572OooO00o.zzaz().zzg();
        if (zzg.zza(this.f37592OooOo00, list)) {
            return;
        }
        this.f37598OooOoo = true;
        this.f37592OooOo00 = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final boolean OooOoO() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37585OooOOOO;
    }

    @WorkerThread
    public final boolean OooOoO0() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37586OooOOOo;
    }

    @WorkerThread
    public final long OooOoOO() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37581OooOO0O;
    }

    @WorkerThread
    public final long OooOoo() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37583OooOOO;
    }

    @WorkerThread
    public final long OooOoo0() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37600OooOooO;
    }

    @WorkerThread
    public final long OooOooO() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37589OooOOoo;
    }

    @WorkerThread
    public final long OooOooo() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37601OooOooo;
    }

    @Nullable
    @WorkerThread
    public final String Oooo() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37576OooO0o;
    }

    @WorkerThread
    public final long Oooo0() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37579OooO0oo;
    }

    @WorkerThread
    public final long Oooo000() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37584OooOOO0;
    }

    @WorkerThread
    public final long Oooo00O() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37571OooO;
    }

    @WorkerThread
    public final long Oooo00o() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37578OooO0oO;
    }

    @Nullable
    @WorkerThread
    public final String Oooo0O0() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37588OooOOo0;
    }

    @Nullable
    @WorkerThread
    public final String Oooo0OO() {
        this.f37572OooO00o.zzaz().zzg();
        String str = this.f37599OooOoo0;
        OooOOOo(null);
        return str;
    }

    @Nullable
    @WorkerThread
    public final String Oooo0o() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37574OooO0OO;
    }

    @WorkerThread
    public final String Oooo0o0() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37573OooO0O0;
    }

    @Nullable
    @WorkerThread
    public final String Oooo0oO() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37582OooOO0o;
    }

    @Nullable
    @WorkerThread
    public final String Oooo0oo() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37580OooOO0;
    }

    @Nullable
    @WorkerThread
    public final String OoooO00() {
        this.f37572OooO00o.zzaz().zzg();
        return this.f37575OooO0Oo;
    }
}
