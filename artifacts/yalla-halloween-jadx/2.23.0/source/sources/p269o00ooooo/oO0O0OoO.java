package p269o00ooooo;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0OoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f41348OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgd f41349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f41351OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f41352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f41353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f41354OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f41355OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f41356OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f41357OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f41358OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f41359OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f41360OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f41361OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f41362OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f41363OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Boolean f41364OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public String f41365OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f41366OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f41367OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f41368OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ArrayList f41369OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f41370OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f41371OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f41372OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f41373OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f41374OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f41375OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f41376OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f41377OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public String f41378OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f41379Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f41380Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f41381Oooo00o;

    @WorkerThread
    public oO0O0OoO(zzgd zzgdVar, String str) {
        Preconditions.checkNotNull(zzgdVar);
        Preconditions.checkNotEmpty(str);
        this.f41349OooO00o = zzgdVar;
        this.f41350OooO0O0 = str;
        zzgdVar.zzaB().zzg();
    }

    @WorkerThread
    public final void OooO(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41366OooOOoo != j;
        this.f41366OooOOoo = j;
    }

    @Nullable
    @WorkerThread
    public final String OooO00o() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41352OooO0Oo;
    }

    @WorkerThread
    public final void OooO0O0(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f41379Oooo000 |= true ^ zzg.zza(this.f41365OooOOo0, str);
        this.f41365OooOOo0 = str;
    }

    @WorkerThread
    public final void OooO0OO(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41351OooO0OO, str);
        this.f41351OooO0OO = str;
    }

    @WorkerThread
    public final void OooO0Oo(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41359OooOO0o, str);
        this.f41359OooOO0o = str;
    }

    @WorkerThread
    public final void OooO0o(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41358OooOO0O != j;
        this.f41358OooOO0O = j;
    }

    @WorkerThread
    public final void OooO0o0(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41357OooOO0, str);
        this.f41357OooOO0 = str;
    }

    @WorkerThread
    public final void OooO0oO(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41380Oooo00O != j;
        this.f41380Oooo00O = j;
    }

    @WorkerThread
    public final void OooO0oo(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41360OooOOO != j;
        this.f41360OooOOO = j;
    }

    @WorkerThread
    public final void OooOO0(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41353OooO0o, str);
        this.f41353OooO0o = str;
    }

    @WorkerThread
    public final void OooOO0O(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f41379Oooo000 |= true ^ zzg.zza(this.f41352OooO0Oo, str);
        this.f41352OooO0Oo = str;
    }

    @WorkerThread
    public final void OooOO0o(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41361OooOOO0 != j;
        this.f41361OooOOO0 = j;
    }

    @WorkerThread
    public final void OooOOO(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41348OooO != j;
        this.f41348OooO = j;
    }

    @WorkerThread
    public final void OooOOO0(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41378OooOooo, str);
        this.f41378OooOooo = str;
    }

    @WorkerThread
    public final void OooOOOO(long j) {
        Preconditions.checkArgument(j >= 0);
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41355OooO0oO != j;
        this.f41355OooO0oO = j;
    }

    @WorkerThread
    public final void OooOOOo(long j) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41356OooO0oo != j;
        this.f41356OooO0oo = j;
    }

    @WorkerThread
    public final void OooOOo(@Nullable String str) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= !zzg.zza(this.f41354OooO0o0, str);
        this.f41354OooO0o0 = str;
    }

    @WorkerThread
    public final void OooOOo0(boolean z) {
        this.f41349OooO00o.zzaB().zzg();
        this.f41379Oooo000 |= this.f41362OooOOOO != z;
        this.f41362OooOOOO = z;
    }

    @WorkerThread
    public final void OooOOoo(@Nullable List list) {
        this.f41349OooO00o.zzaB().zzg();
        if (zzg.zza(this.f41369OooOo00, list)) {
            return;
        }
        this.f41379Oooo000 = true;
        this.f41369OooOo00 = list != null ? new ArrayList(list) : null;
    }

    @Nullable
    @WorkerThread
    public final String OooOo() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41351OooO0OO;
    }

    @Nullable
    @WorkerThread
    public final String OooOo0() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41365OooOOo0;
    }

    @WorkerThread
    public final long OooOo00() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41358OooOO0O;
    }

    @Nullable
    @WorkerThread
    public final String OooOo0O() {
        this.f41349OooO00o.zzaB().zzg();
        String str = this.f41378OooOooo;
        OooOOO0(null);
        return str;
    }

    @WorkerThread
    public final String OooOo0o() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41350OooO0O0;
    }

    @Nullable
    @WorkerThread
    public final String OooOoO() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41353OooO0o;
    }

    @Nullable
    @WorkerThread
    public final String OooOoO0() {
        this.f41349OooO00o.zzaB().zzg();
        return this.f41357OooOO0;
    }
}
