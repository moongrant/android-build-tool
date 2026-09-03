package o0OO0OoO;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzex;
import com.google.android.gms.measurement.internal.zzey;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzfb;
import com.google.android.gms.measurement.internal.zzfc;
import com.google.android.gms.measurement.internal.zzfy;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends o000OO0O {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @VisibleForTesting
    public static final Pair f37762OooOo0o = new Pair("", 0L);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f37763OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SharedPreferences f37764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzfb f37765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzfc f37766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zzez f37767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f37768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f37769OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzez f37770OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzex f37771OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzfc f37772OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zzez f37773OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzex f37774OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f37775OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final zzex f37776OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zzez f37777OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zzex f37778OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final zzfc f37779OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final zzez f37780OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final zzfc f37781OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final zzey f37782OooOo0O;

    public o0O0O00(zzfy zzfyVar) {
        super(zzfyVar);
        this.f37770OooOO0 = new zzez(this, "session_timeout", 1800000L);
        this.f37771OooOO0O = new zzex(this, "start_new_session", true);
        this.f37773OooOOO = new zzez(this, "last_pause_time", 0L);
        this.f37772OooOO0o = new zzfc(this, "non_personalized_ads", null);
        this.f37774OooOOO0 = new zzex(this, "allow_remote_dynamite", false);
        this.f37767OooO0o0 = new zzez(this, "first_open_time", 0L);
        new zzez(this, "app_install_time", 0L);
        this.f37766OooO0o = new zzfc(this, "app_instance_id", null);
        this.f37776OooOOOo = new zzex(this, "app_backgrounded", false);
        this.f37778OooOOo0 = new zzex(this, "deep_link_retrieval_complete", false);
        this.f37777OooOOo = new zzez(this, "deep_link_retrieval_attempts", 0L);
        this.f37779OooOOoo = new zzfc(this, "firebase_feature_rollouts", null);
        this.f37781OooOo00 = new zzfc(this, "deferred_attribution_cache", null);
        this.f37780OooOo0 = new zzez(this, "deferred_attribution_cache_timestamp", 0L);
        this.f37782OooOo0O = new zzey(this, "default_event_parameters", null);
    }

    @WorkerThread
    public final void OooO(boolean z) {
        zzg();
        this.f37615OooO00o.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = OooO0o0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @Override // o0OO0OoO.o000OO0O
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    public final void OooO00o() {
        SharedPreferences sharedPreferences = this.f37615OooO00o.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f37764OooO0OO = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f37775OooOOOO = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f37764OooO0OO.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f37615OooO00o.zzf();
        this.f37765OooO0Oo = new zzfb(this, Math.max(0L, ((Long) zzeb.zzb.zza(null)).longValue()));
    }

    @Override // o0OO0OoO.o000OO0O
    public final boolean OooO0O0() {
        return true;
    }

    @WorkerThread
    public final zzai OooO0o() {
        zzg();
        return zzai.zzb(OooO0o0().getString("consent_settings", "G1"));
    }

    @VisibleForTesting
    @WorkerThread
    public final SharedPreferences OooO0o0() {
        zzg();
        OooO0OO();
        Preconditions.checkNotNull(this.f37764OooO0OO);
        return this.f37764OooO0OO;
    }

    @WorkerThread
    public final Boolean OooO0oO() {
        zzg();
        if (OooO0o0().contains("measurement_enabled")) {
            return Boolean.valueOf(OooO0o0().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final void OooO0oo(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = OooO0o0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final boolean OooOO0(long j) {
        return j - this.f37770OooOO0.zza() > this.f37773OooOOO.zza();
    }

    @WorkerThread
    public final boolean OooOO0O(int i) {
        return zzai.zzj(i, OooO0o0().getInt("consent_source", 100));
    }
}
