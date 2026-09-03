package p271o00ooooo;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzfc;
import com.google.android.gms.measurement.internal.zzfd;
import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzfh;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzhb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000Oo extends oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Pair f40763OooOo = new Pair("", 0L);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f40764OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SharedPreferences f40765OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzfg f40766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzfh f40767OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzfe f40768OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f40769OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f40770OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzfe f40771OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzfc f40772OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzfh f40773OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zzfe f40774OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzfc f40775OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final zzfe f40776OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f40777OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zzfc f40778OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zzfc f40779OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final zzfe f40780OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final zzfh f40781OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final zzfh f40782OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final zzfe f40783OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final zzfd f40784OooOo0o;

    public oOo000Oo(zzgd zzgdVar) {
        super(zzgdVar);
        this.f40771OooOO0 = new zzfe(this, "session_timeout", 1800000L);
        this.f40772OooOO0O = new zzfc(this, "start_new_session", true);
        this.f40774OooOOO = new zzfe(this, "last_pause_time", 0L);
        this.f40776OooOOOO = new zzfe(this, "session_id", 0L);
        this.f40773OooOO0o = new zzfh(this, "non_personalized_ads", null);
        this.f40775OooOOO0 = new zzfc(this, "allow_remote_dynamite", false);
        this.f40768OooO0o0 = new zzfe(this, "first_open_time", 0L);
        new zzfe(this, "app_install_time", 0L);
        this.f40767OooO0o = new zzfh(this, "app_instance_id", null);
        this.f40779OooOOo0 = new zzfc(this, "app_backgrounded", false);
        this.f40778OooOOo = new zzfc(this, "deep_link_retrieval_complete", false);
        this.f40780OooOOoo = new zzfe(this, "deep_link_retrieval_attempts", 0L);
        this.f40782OooOo00 = new zzfh(this, "firebase_feature_rollouts", null);
        this.f40781OooOo0 = new zzfh(this, "deferred_attribution_cache", null);
        this.f40783OooOo0O = new zzfe(this, "deferred_attribution_cache_timestamp", 0L);
        this.f40784OooOo0o = new zzfd(this, "default_event_parameters", null);
    }

    public final boolean OooO(long j) {
        return j - this.f40771OooOO0.zza() > this.f40774OooOOO.zza();
    }

    @Override // p271o00ooooo.oO
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    public final void OooO00o() {
        zzgd zzgdVar = this.f40788OooO00o;
        SharedPreferences sharedPreferences = zzgdVar.zzaw().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f40765OooO0OO = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f40777OooOOOo = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f40765OooO0OO.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zzgdVar.zzf();
        this.f40766OooO0Oo = new zzfg(this, Math.max(0L, ((Long) zzeg.zzc.zza(null)).longValue()));
    }

    @Override // p271o00ooooo.oO
    public final boolean OooO0O0() {
        return true;
    }

    @WorkerThread
    public final SharedPreferences OooO0Oo() {
        zzg();
        OooO0OO();
        Preconditions.checkNotNull(this.f40765OooO0OO);
        return this.f40765OooO0OO;
    }

    @WorkerThread
    public final Boolean OooO0o() {
        zzg();
        if (OooO0Oo().contains("measurement_enabled")) {
            return Boolean.valueOf(OooO0Oo().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final zzhb OooO0o0() {
        zzg();
        return zzhb.zzc(OooO0Oo().getString("consent_settings", "G1"), OooO0Oo().getInt("consent_source", 100));
    }

    @WorkerThread
    public final void OooO0oO(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = OooO0Oo().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    public final void OooO0oo(boolean z) {
        zzg();
        this.f40788OooO00o.zzaA().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = OooO0Oo().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @WorkerThread
    public final boolean OooOO0(int i) {
        return zzhb.zzk(i, OooO0Oo().getInt("consent_source", 100));
    }
}
