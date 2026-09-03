package p271o00ooooo;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f40652OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgd f40653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f40654OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f40655OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f40656OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f40657OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f40658OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f40659OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f40660OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f40661OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f40662OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f40663OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f40664OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f40665OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f40666OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f40667OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Boolean f40668OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public String f40669OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f40670OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f40671OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f40672OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ArrayList f40673OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f40674OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f40675OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f40676OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f40677OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f40678OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f40679OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f40680OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f40681OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public String f40682OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f40683Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f40684Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f40685Oooo00o;

    @WorkerThread
    public oOO0000(zzgd zzgdVar, String str) {
        Preconditions.checkNotNull(zzgdVar);
        Preconditions.checkNotEmpty(str);
        this.f40653OooO00o = zzgdVar;
        this.f40654OooO0O0 = str;
        zzgdVar.zzaB().zzg();
    }

    @WorkerThread
    public final void OooO(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40670OooOOoo != j;
        this.f40670OooOOoo = j;
    }

    @Nullable
    @WorkerThread
    public final String OooO00o() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40656OooO0Oo;
    }

    @WorkerThread
    public final void OooO0O0(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f40683Oooo000 |= true ^ zzg.zza(this.f40669OooOOo0, str);
        this.f40669OooOOo0 = str;
    }

    @WorkerThread
    public final void OooO0OO(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40655OooO0OO, str);
        this.f40655OooO0OO = str;
    }

    @WorkerThread
    public final void OooO0Oo(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40663OooOO0o, str);
        this.f40663OooOO0o = str;
    }

    @WorkerThread
    public final void OooO0o(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40662OooOO0O != j;
        this.f40662OooOO0O = j;
    }

    @WorkerThread
    public final void OooO0o0(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40661OooOO0, str);
        this.f40661OooOO0 = str;
    }

    @WorkerThread
    public final void OooO0oO(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40684Oooo00O != j;
        this.f40684Oooo00O = j;
    }

    @WorkerThread
    public final void OooO0oo(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40664OooOOO != j;
        this.f40664OooOOO = j;
    }

    @WorkerThread
    public final void OooOO0(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40657OooO0o, str);
        this.f40657OooO0o = str;
    }

    @WorkerThread
    public final void OooOO0O(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f40683Oooo000 |= true ^ zzg.zza(this.f40656OooO0Oo, str);
        this.f40656OooO0Oo = str;
    }

    @WorkerThread
    public final void OooOO0o(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40665OooOOO0 != j;
        this.f40665OooOOO0 = j;
    }

    @WorkerThread
    public final void OooOOO(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40652OooO != j;
        this.f40652OooO = j;
    }

    @WorkerThread
    public final void OooOOO0(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40682OooOooo, str);
        this.f40682OooOooo = str;
    }

    @WorkerThread
    public final void OooOOOO(long j) {
        Preconditions.checkArgument(j >= 0);
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40659OooO0oO != j;
        this.f40659OooO0oO = j;
    }

    @WorkerThread
    public final void OooOOOo(long j) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40660OooO0oo != j;
        this.f40660OooO0oo = j;
    }

    @WorkerThread
    public final void OooOOo(@Nullable String str) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= !zzg.zza(this.f40658OooO0o0, str);
        this.f40658OooO0o0 = str;
    }

    @WorkerThread
    public final void OooOOo0(boolean z) {
        this.f40653OooO00o.zzaB().zzg();
        this.f40683Oooo000 |= this.f40666OooOOOO != z;
        this.f40666OooOOOO = z;
    }

    @WorkerThread
    public final void OooOOoo(@Nullable List list) {
        this.f40653OooO00o.zzaB().zzg();
        if (zzg.zza(this.f40673OooOo00, list)) {
            return;
        }
        this.f40683Oooo000 = true;
        this.f40673OooOo00 = list != null ? new ArrayList(list) : null;
    }

    @Nullable
    @WorkerThread
    public final String OooOo() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40655OooO0OO;
    }

    @Nullable
    @WorkerThread
    public final String OooOo0() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40669OooOOo0;
    }

    @WorkerThread
    public final long OooOo00() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40662OooOO0O;
    }

    @Nullable
    @WorkerThread
    public final String OooOo0O() {
        this.f40653OooO00o.zzaB().zzg();
        String str = this.f40682OooOooo;
        OooOOO0(null);
        return str;
    }

    @WorkerThread
    public final String OooOo0o() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40654OooO0O0;
    }

    @Nullable
    @WorkerThread
    public final String OooOoO() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40657OooO0o;
    }

    @Nullable
    @WorkerThread
    public final String OooOoO0() {
        this.f40653OooO00o.zzaB().zzg();
        return this.f40661OooOO0;
    }
}
