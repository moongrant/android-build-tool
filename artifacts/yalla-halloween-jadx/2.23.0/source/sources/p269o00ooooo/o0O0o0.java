package p269o00ooooo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzlp;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.AbstractCursor;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o0 extends oOOO0O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0o00O f41171OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oOOO00 f41172OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String[] f41164OooO0o = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f41165OooO0oO = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f41166OooO0oo = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", TopDataVM.TYPE_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String[] f41163OooO = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String[] f41167OooOO0 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String[] f41168OooOO0O = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String[] f41169OooOO0o = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String[] f41170OooOOO0 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public o0O0o0(zzlh zzlhVar) {
        super(zzlhVar);
        this.f41172OooO0o0 = new oOOO00(this.f41276OooO00o.zzax());
        this.f41276OooO00o.zzf();
        this.f41171OooO0Oo = new o0O0o00O(this, this.f41276OooO00o.zzaw());
    }

    @WorkerThread
    public static final void OooOO0o(ContentValues contentValues, Object obj) {
        Preconditions.checkNotEmpty(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
        }
    }

    @WorkerThread
    public final boolean OooO(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        OooO00o();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        O0O0 o0o0OooOo = OooOo(str, zzacVar.zzc.zzb);
        zzgd zzgdVar = this.f41276OooO00o;
        if (o0o0OooOo == null) {
            long jOooOOO0 = OooOOO0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            zzgdVar.zzf();
            if (jOooOOO0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        OooOO0o(contentValues, Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        zzlp zzlpVarZzv = zzgdVar.zzv();
        zzau zzauVar = zzacVar.zzg;
        zzlpVarZzv.getClass();
        contentValues.put("timed_out_event", zzlp.Oooo000(zzauVar));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        zzlp zzlpVarZzv2 = zzgdVar.zzv();
        zzau zzauVar2 = zzacVar.zzi;
        zzlpVarZzv2.getClass();
        contentValues.put("triggered_event", zzlp.Oooo000(zzauVar2));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        zzlp zzlpVarZzv3 = zzgdVar.zzv();
        zzau zzauVar3 = zzacVar.zzk;
        zzlpVarZzv3.getClass();
        contentValues.put("expired_event", zzlp.Oooo000(zzauVar3));
        try {
            if (OooOOo().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzgdVar.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.OooO0Oo(str));
            return true;
        } catch (SQLiteException e) {
            zzgdVar.zzaA().zzd().zzc("Error storing conditional user property", zzet.OooO0Oo(str), e);
            return true;
        }
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    @WorkerThread
    public final void OooO0OO(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        try {
            OooOOo().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzgd zzgdVar = this.f41276OooO00o;
            zzgdVar.zzaA().zzd().zzd("Error deleting user property. appId", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0o(str2), e);
        }
    }

    @WorkerThread
    public final void OooO0Oo() {
        OooO00o();
        OooOOo().setTransactionSuccessful();
    }

    @WorkerThread
    public final void OooO0o(o0O o0o) {
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotNull(o0o);
        zzg();
        OooO00o();
        ContentValues contentValues = new ContentValues();
        String str = o0o.f41145OooO00o;
        contentValues.put("app_id", str);
        contentValues.put("name", o0o.f41146OooO0O0);
        contentValues.put("lifetime_count", Long.valueOf(o0o.f41147OooO0OO));
        contentValues.put("current_bundle_count", Long.valueOf(o0o.f41148OooO0Oo));
        contentValues.put("last_fire_timestamp", Long.valueOf(o0o.f41149OooO0o));
        contentValues.put("last_bundled_timestamp", Long.valueOf(o0o.f41151OooO0oO));
        contentValues.put("last_bundled_day", o0o.f41152OooO0oo);
        contentValues.put("last_sampled_complex_event_id", o0o.f41144OooO);
        contentValues.put("last_sampling_rate", o0o.f41153OooOO0);
        contentValues.put("current_session_count", Long.valueOf(o0o.f41150OooO0o0));
        Boolean bool = o0o.f41154OooOO0O;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (OooOOo().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzgdVar.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.OooO0Oo(str));
            }
        } catch (SQLiteException e) {
            zzgdVar.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.OooO0Oo(str), e);
        }
    }

    @WorkerThread
    public final void OooO0o0(oO0O0OoO oo0o0ooo) {
        Preconditions.checkNotNull(oo0o0ooo);
        zzg();
        OooO00o();
        String strOooOo0o = oo0o0ooo.OooOo0o();
        Preconditions.checkNotNull(strOooOo0o);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strOooOo0o);
        contentValues.put("app_instance_id", oo0o0ooo.OooOo());
        contentValues.put("gmp_app_id", oo0o0ooo.OooO00o());
        zzgd zzgdVar = oo0o0ooo.f41349OooO00o;
        zzgdVar.zzaB().zzg();
        contentValues.put("resettable_device_id_hash", oo0o0ooo.f41354OooO0o0);
        zzgdVar.zzaB().zzg();
        contentValues.put("last_bundle_index", Long.valueOf(oo0o0ooo.f41355OooO0oO));
        zzgdVar.zzaB().zzg();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(oo0o0ooo.f41356OooO0oo));
        zzgdVar.zzaB().zzg();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(oo0o0ooo.f41348OooO));
        contentValues.put("app_version", oo0o0ooo.OooOoO0());
        zzgdVar.zzaB().zzg();
        contentValues.put("app_store", oo0o0ooo.f41359OooOO0o);
        zzgdVar.zzaB().zzg();
        contentValues.put("gmp_version", Long.valueOf(oo0o0ooo.f41361OooOOO0));
        zzgdVar.zzaB().zzg();
        contentValues.put("dev_cert_hash", Long.valueOf(oo0o0ooo.f41360OooOOO));
        zzgdVar.zzaB().zzg();
        contentValues.put("measurement_enabled", Boolean.valueOf(oo0o0ooo.f41362OooOOOO));
        zzgdVar.zzaB().zzg();
        contentValues.put(TopDataVM.TYPE_DAY, Long.valueOf(oo0o0ooo.f41373OooOoO0));
        zzgdVar.zzaB().zzg();
        contentValues.put("daily_public_events_count", Long.valueOf(oo0o0ooo.f41372OooOoO));
        zzgdVar.zzaB().zzg();
        contentValues.put("daily_events_count", Long.valueOf(oo0o0ooo.f41374OooOoOO));
        zzgdVar.zzaB().zzg();
        contentValues.put("daily_conversions_count", Long.valueOf(oo0o0ooo.f41376OooOoo0));
        zzgdVar.zzaB().zzg();
        contentValues.put("config_fetched_time", Long.valueOf(oo0o0ooo.f41380Oooo00O));
        zzgdVar.zzaB().zzg();
        contentValues.put("failed_config_fetch_time", Long.valueOf(oo0o0ooo.f41381Oooo00o));
        contentValues.put("app_version_int", Long.valueOf(oo0o0ooo.OooOo00()));
        contentValues.put("firebase_instance_id", oo0o0ooo.OooOoO());
        zzgdVar.zzaB().zzg();
        contentValues.put("daily_error_events_count", Long.valueOf(oo0o0ooo.f41375OooOoo));
        zzgdVar.zzaB().zzg();
        contentValues.put("daily_realtime_events_count", Long.valueOf(oo0o0ooo.f41377OooOooO));
        zzgdVar.zzaB().zzg();
        contentValues.put("health_monitor_sample", oo0o0ooo.f41378OooOooo);
        zzgdVar.zzaB().zzg();
        contentValues.put("android_id", (Long) 0L);
        zzgdVar.zzaB().zzg();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(oo0o0ooo.f41363OooOOOo));
        contentValues.put("admob_app_id", oo0o0ooo.OooOo0());
        zzgdVar.zzaB().zzg();
        contentValues.put("dynamite_version", Long.valueOf(oo0o0ooo.f41366OooOOoo));
        zzgdVar.zzaB().zzg();
        contentValues.put("session_stitching_token", oo0o0ooo.f41368OooOo0);
        zzgdVar.zzaB().zzg();
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(oo0o0ooo.f41370OooOo0O));
        zzgdVar.zzaB().zzg();
        contentValues.put("target_os_version", Long.valueOf(oo0o0ooo.f41371OooOo0o));
        zzgdVar.zzaB().zzg();
        contentValues.put("session_stitching_token_hash", Long.valueOf(oo0o0ooo.f41367OooOo));
        zzgdVar.zzaB().zzg();
        ArrayList arrayList = oo0o0ooo.f41369OooOo00;
        zzgd zzgdVar2 = this.f41276OooO00o;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzgdVar2.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", strOooOo0o);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zzop.zzc();
        if (zzgdVar2.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            if (sQLiteDatabaseOooOOo.update("apps", contentValues, "app_id = ?", new String[]{strOooOo0o}) == 0 && sQLiteDatabaseOooOOo.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzgdVar2.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.OooO0Oo(strOooOo0o));
            }
        } catch (SQLiteException e) {
            zzgdVar2.zzaA().zzd().zzc("Error storing app. appId", zzet.OooO0Oo(strOooOo0o), e);
        }
    }

    @VisibleForTesting
    public final boolean OooO0oO() {
        zzgd zzgdVar = this.f41276OooO00o;
        Context contextZzaw = zzgdVar.zzaw();
        zzgdVar.zzf();
        return contextZzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void OooO0oo(String str, Long l, long j, zzft zzftVar) {
        zzg();
        OooO00o();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzbx = zzftVar.zzbx();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzj().zzc("Saving complex main event, appId, data size", zzgdVar.zzj().OooO0Oo(str), Integer.valueOf(bArrZzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzbx);
        try {
            if (OooOOo().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzgdVar.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.OooO0Oo(str));
            }
        } catch (SQLiteException e) {
            zzgdVar.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.OooO0Oo(str), e);
        }
    }

    @WorkerThread
    public final boolean OooOO0(O0O0 o0o0) {
        Preconditions.checkNotNull(o0o0);
        zzg();
        OooO00o();
        String str = o0o0.f41104OooO00o;
        String str2 = o0o0.f41106OooO0OO;
        O0O0 o0o0OooOo = OooOo(str, str2);
        zzgd zzgdVar = this.f41276OooO00o;
        String str3 = o0o0.f41105OooO0O0;
        if (o0o0OooOo == null) {
            if (zzlp.OooOoo0(str2)) {
                if (OooOOO0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= zzgdVar.zzf().zzf(str, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jOooOOO0 = OooOOO0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                zzgdVar.zzf();
                if (jOooOOO0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(o0o0.f41107OooO0Oo));
        OooOO0o(contentValues, o0o0.f41108OooO0o0);
        try {
            if (OooOOo().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzgdVar.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.OooO0Oo(str));
            return true;
        } catch (SQLiteException e) {
            zzgdVar.zzaA().zzd().zzc("Error storing user property. appId", zzet.OooO0Oo(str), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(long j, long j2, oo00 oo00Var) throws Throwable {
        SQLiteException sQLiteException;
        AbstractCursor abstractCursor;
        String string;
        char c;
        char c2;
        String[] strArr;
        String str;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotNull(oo00Var);
        zzg();
        OooO00o();
        AbstractCursor abstractCursor2 = 0;
        String string2 = null;
        String str2 = null;
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            try {
                if (TextUtils.isEmpty(null)) {
                    Cursor cursorRawQuery = sQLiteDatabaseOooOOo.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return;
                    } else {
                        string2 = cursorRawQuery.getString(0);
                        string = cursorRawQuery.getString(1);
                        cursorRawQuery.close();
                    }
                } else {
                    Cursor cursorRawQuery2 = sQLiteDatabaseOooOOo.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                    if (!cursorRawQuery2.moveToFirst()) {
                        cursorRawQuery2.close();
                        return;
                    } else {
                        string = cursorRawQuery2.getString(0);
                        cursorRawQuery2.close();
                    }
                }
                Cursor cursorQuery = sQLiteDatabaseOooOOo.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", FeedbackType.Suggestions);
                if (!cursorQuery.moveToFirst()) {
                    zzgdVar.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzet.OooO0Oo(string2));
                    cursorQuery.close();
                    return;
                }
                try {
                    com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((zzgc) zzlj.OooOOoo(com.google.android.gms.internal.measurement.zzgd.zzu(), cursorQuery.getBlob(0))).zzaD();
                    if (cursorQuery.moveToNext()) {
                        zzgdVar.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzet.OooO0Oo(string2));
                    }
                    cursorQuery.close();
                    Preconditions.checkNotNull(zzgdVar2);
                    oo00Var.f41524OooO00o = zzgdVar2;
                    if (j2 != -1) {
                        c2 = 1;
                        c = 2;
                        str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{string2, string, String.valueOf(j2)};
                    } else {
                        c = 2;
                        c2 = 1;
                        strArr = new String[]{string2, string};
                        str = "app_id = ? and metadata_fingerprint = ?";
                    }
                    String[] strArr2 = new String[4];
                    strArr2[0] = "rowid";
                    strArr2[c2] = "name";
                    strArr2[c] = "timestamp";
                    strArr2[3] = "data";
                    Cursor cursorQuery2 = sQLiteDatabaseOooOOo.query("raw_events", strArr2, str, strArr, null, null, "rowid", null);
                    if (!cursorQuery2.moveToFirst()) {
                        zzgdVar.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzet.OooO0Oo(string2));
                        cursorQuery2.close();
                        return;
                    }
                    do {
                        long j3 = cursorQuery2.getLong(0);
                        try {
                            zzfs zzfsVar = (zzfs) zzlj.OooOOoo(zzft.zze(), cursorQuery2.getBlob(3));
                            zzfsVar.zzi(cursorQuery2.getString(1));
                            zzfsVar.zzm(cursorQuery2.getLong(2));
                            if (!oo00Var.OooO00o(j3, (zzft) zzfsVar.zzaD())) {
                                cursorQuery2.close();
                                return;
                            }
                        } catch (IOException e) {
                            zzgdVar.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzet.OooO0Oo(string2), e);
                        }
                    } while (cursorQuery2.moveToNext());
                    cursorQuery2.close();
                } catch (IOException e2) {
                    zzgdVar.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzet.OooO0Oo(string2), e2);
                    cursorQuery.close();
                }
            } catch (SQLiteException e3) {
                sQLiteException = e3;
                abstractCursor = "select metadata_fingerprint from raw_events where app_id = ?";
                str2 = null;
                try {
                    zzgdVar.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzet.OooO0Oo(str2), sQLiteException);
                    if (abstractCursor != 0) {
                        abstractCursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    abstractCursor2 = abstractCursor;
                    if (abstractCursor2 != 0) {
                        abstractCursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                abstractCursor2 = "select metadata_fingerprint from raw_events where app_id = ?";
                if (abstractCursor2 != 0) {
                    abstractCursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            sQLiteException = e4;
            abstractCursor = 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @WorkerThread
    public final void OooOOO(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        try {
            OooOOo().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzgd zzgdVar = this.f41276OooO00o;
            zzgdVar.zzaA().zzd().zzd("Error deleting conditional property", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0o(str2), e);
        }
    }

    @WorkerThread
    public final long OooOOO0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = OooOOo().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                this.f41276OooO00o.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final long OooOOOO(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = OooOOo().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.f41276OooO00o.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final long OooOOOo(String str) {
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        OooO00o();
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        long j = 0;
        try {
            try {
                long jOooOOOO = OooOOOO("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jOooOOOO == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseOooOOo.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzgdVar.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.OooO0Oo(str), "first_open_count");
                        return -1L;
                    }
                    jOooOOOO = 0;
                    zzgdVar.zzaA().zzd().zzd("Error inserting column. appId", zzet.OooO0Oo(str), "first_open_count", e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jOooOOOO));
                    if (sQLiteDatabaseOooOOo.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzgdVar.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.OooO0Oo(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseOooOOo.setTransactionSuccessful();
                    return jOooOOOO;
                } catch (SQLiteException e) {
                    e = e;
                    j = jOooOOOO;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            sQLiteDatabaseOooOOo.endTransaction();
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase OooOOo() {
        zzg();
        try {
            return this.f41171OooO0Oo.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f41276OooO00o.zzaA().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    public final long OooOOo0(String str) {
        Preconditions.checkNotEmpty(str);
        return OooOOOO("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03c4  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x03c1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:962), block:B:113:0x03c1 */
    @WorkerThread
    public final oO0O0OoO OooOOoo(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        Cursor cursor2 = null;
        try {
            try {
                boolean z = true;
                cursorQuery = OooOOo().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", TopDataVM.TYPE_DAY, "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    oO0O0OoO oo0o0ooo = new oO0O0OoO(this.f41477OooO0O0.f16091OooOO0o, str);
                    zzgd zzgdVar2 = oo0o0ooo.f41349OooO00o;
                    oo0o0ooo.OooO0OO(cursorQuery.getString(0));
                    oo0o0ooo.OooOO0O(cursorQuery.getString(1));
                    oo0o0ooo.OooOOo(cursorQuery.getString(2));
                    oo0o0ooo.OooOOOO(cursorQuery.getLong(3));
                    oo0o0ooo.OooOOOo(cursorQuery.getLong(4));
                    oo0o0ooo.OooOOO(cursorQuery.getLong(5));
                    oo0o0ooo.OooO0o0(cursorQuery.getString(6));
                    oo0o0ooo.OooO0Oo(cursorQuery.getString(7));
                    oo0o0ooo.OooOO0o(cursorQuery.getLong(8));
                    oo0o0ooo.OooO0oo(cursorQuery.getLong(9));
                    oo0o0ooo.OooOOo0(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    long j = cursorQuery.getLong(11);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41373OooOoO0 != j;
                    oo0o0ooo.f41373OooOoO0 = j;
                    long j2 = cursorQuery.getLong(12);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41372OooOoO != j2;
                    oo0o0ooo.f41372OooOoO = j2;
                    long j3 = cursorQuery.getLong(13);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41374OooOoOO != j3;
                    oo0o0ooo.f41374OooOoOO = j3;
                    long j4 = cursorQuery.getLong(14);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41376OooOoo0 != j4;
                    oo0o0ooo.f41376OooOoo0 = j4;
                    oo0o0ooo.OooO0oO(cursorQuery.getLong(15));
                    long j5 = cursorQuery.getLong(16);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41381Oooo00o != j5;
                    oo0o0ooo.f41381Oooo00o = j5;
                    oo0o0ooo.OooO0o(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    oo0o0ooo.OooOO0(cursorQuery.getString(18));
                    long j6 = cursorQuery.getLong(19);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41375OooOoo != j6;
                    oo0o0ooo.f41375OooOoo = j6;
                    long j7 = cursorQuery.getLong(20);
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41377OooOooO != j7;
                    oo0o0ooo.f41377OooOooO = j7;
                    oo0o0ooo.OooOOO0(cursorQuery.getString(21));
                    boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41363OooOOOo != z2;
                    oo0o0ooo.f41363OooOOOo = z2;
                    oo0o0ooo.OooO0O0(cursorQuery.getString(24));
                    oo0o0ooo.OooO(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        oo0o0ooo.OooOOoo(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzqu.zzc();
                    if (zzgdVar.zzf().zzs(str, zzeg.zzao) || zzgdVar.zzf().zzs(null, zzeg.zzam)) {
                        String string = cursorQuery.getString(28);
                        zzgdVar2.zzaB().zzg();
                        oo0o0ooo.f41379Oooo000 |= !zzg.zza(oo0o0ooo.f41368OooOo0, string);
                        oo0o0ooo.f41368OooOo0 = string;
                    }
                    zzrd.zzc();
                    if (zzgdVar.zzf().zzs(null, zzeg.zzaq)) {
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        zzgdVar2.zzaB().zzg();
                        oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41370OooOo0O != z3;
                        oo0o0ooo.f41370OooOo0O = z3;
                    }
                    zzpz.zzc();
                    if (zzgdVar.zzf().zzs(null, zzeg.zzaE)) {
                        long j8 = cursorQuery.getLong(30);
                        zzgdVar2.zzaB().zzg();
                        oo0o0ooo.f41379Oooo000 |= oo0o0ooo.f41371OooOo0o != j8;
                        oo0o0ooo.f41371OooOo0o = j8;
                    }
                    if (zzgdVar.zzf().zzs(null, zzeg.zzaH)) {
                        long j9 = cursorQuery.getLong(31);
                        zzgdVar2.zzaB().zzg();
                        boolean z4 = oo0o0ooo.f41379Oooo000;
                        if (oo0o0ooo.f41367OooOo == j9) {
                            z = false;
                        }
                        oo0o0ooo.f41379Oooo000 = z4 | z;
                        oo0o0ooo.f41367OooOo = j9;
                    }
                    zzgdVar2.zzaB().zzg();
                    oo0o0ooo.f41379Oooo000 = false;
                    if (cursorQuery.moveToNext()) {
                        zzgdVar.zzaA().zzd().zzb("Got multiple records for app, expected one. appId", zzet.OooO0Oo(str));
                    }
                    cursorQuery.close();
                    return oo0o0ooo;
                } catch (SQLiteException e) {
                    e = e;
                    zzgdVar.zzaA().zzd().zzc("Error querying app. appId", zzet.OooO0Oo(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final O0O0 OooOo(String str, String str2) {
        Cursor cursorQuery;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor = null;
        try {
            cursorQuery = OooOOo().query("user_attributes", new String[]{"set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objOooOoO0 = OooOoO0(cursorQuery, 1);
                    if (objOooOoO0 == null) {
                        cursorQuery.close();
                        return null;
                    }
                    O0O0 o0o0 = new O0O0(j, str, cursorQuery.getString(2), str2, objOooOoO0);
                    if (cursorQuery.moveToNext()) {
                        zzgdVar.zzaA().zzd().zzb("Got multiple records for user property, expected one. appId", zzet.OooO0Oo(str));
                    }
                    cursorQuery.close();
                    return o0o0;
                } catch (SQLiteException e) {
                    e = e;
                    zzgdVar.zzaA().zzd().zzd("Error querying user property. appId", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0o(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    @WorkerThread
    public final zzai OooOo0(long j, String str, boolean z, boolean z2) {
        return OooOo0O(j, str, 1L, false, false, z, false, z2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0147  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0144: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:325), block:B:31:0x0144 */
    @WorkerThread
    public final zzac OooOo00(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        zzlh zzlhVar = this.f41477OooO0O0;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = OooOOo().query("conditional_properties", new String[]{AppMeasurementSdk.ConditionalUserProperty.ORIGIN, AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objOooOoO0 = OooOoO0(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    zzlj zzljVarZzu = zzlhVar.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzlk(cursorQuery.getLong(8), str2, str3, objOooOoO0), cursorQuery.getLong(6), z, string2, (zzau) zzljVarZzu.OooOOOo(blob, creator), j, (zzau) zzlhVar.zzu().OooOOOo(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzau) zzlhVar.zzu().OooOOOo(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        zzgdVar.zzaA().zzd().zzc("Got multiple records for conditional property, expected one", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0o(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzgdVar.zzaA().zzd().zzd("Error querying conditional property", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0o(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzai OooOo0O(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Throwable {
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                Cursor cursorQuery = sQLiteDatabaseOooOOo.query("apps", new String[]{TopDataVM.TYPE_DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        zzgdVar.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.OooO0Oo(str));
                        cursorQuery.close();
                        return zzaiVar;
                    }
                    if (cursorQuery.getLong(0) == j) {
                        zzaiVar.f15876OooO0O0 = cursorQuery.getLong(1);
                        zzaiVar.f15875OooO00o = cursorQuery.getLong(2);
                        zzaiVar.f15877OooO0OO = cursorQuery.getLong(3);
                        zzaiVar.f15878OooO0Oo = cursorQuery.getLong(4);
                        zzaiVar.f15879OooO0o0 = cursorQuery.getLong(5);
                    }
                    if (z) {
                        zzaiVar.f15876OooO0O0 += j2;
                    }
                    if (z2) {
                        zzaiVar.f15875OooO00o += j2;
                    }
                    if (z3) {
                        zzaiVar.f15877OooO0OO += j2;
                    }
                    if (z4) {
                        zzaiVar.f15878OooO0Oo += j2;
                    }
                    if (z5) {
                        zzaiVar.f15879OooO0o0 += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(TopDataVM.TYPE_DAY, Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.f15875OooO00o));
                    contentValues.put("daily_events_count", Long.valueOf(zzaiVar.f15876OooO0O0));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.f15877OooO0OO));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.f15878OooO0Oo));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.f15879OooO0o0));
                    sQLiteDatabaseOooOOo.update("apps", contentValues, "app_id=?", strArr);
                    cursorQuery.close();
                    return zzaiVar;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursorQuery;
                    zzgdVar.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.OooO0Oo(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaiVar;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @WorkerThread
    public final o0O OooOo0o(String str, String str2) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor = null;
        try {
            cursorQuery = OooOOo().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(1);
                    long j3 = cursorQuery.getLong(2);
                    long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    o0O o0o = new o0O(str, str2, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        zzgdVar.zzaA().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzet.OooO0Oo(str));
                    }
                    cursorQuery.close();
                    return o0o;
                } catch (SQLiteException e) {
                    e = e;
                    zzgdVar.zzaA().zzd().zzd("Error querying events. appId", zzet.OooO0Oo(str), zzgdVar.zzj().OooO0Oo(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    @WorkerThread
    public final List OooOoO(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return OooOoOO(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @VisibleForTesting
    @WorkerThread
    public final Object OooOoO0(Cursor cursor, int i) {
        int type = cursor.getType(i);
        zzgd zzgdVar = this.f41276OooO00o;
        if (type == 0) {
            o0O0OO0.OooO00o(zzgdVar, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            zzgdVar.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        o0O0OO0.OooO00o(zzgdVar, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0185  */
    public final List OooOoOO(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        zzlh zzlhVar = this.f41477OooO0O0;
        zzgd zzgdVar = this.f41276OooO00o;
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            String[] strArr2 = {"app_id", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            zzgdVar.zzf();
            int i = 2;
            Cursor cursorQuery = sQLiteDatabaseOooOOo.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    zzgdVar.zzf();
                    if (size >= 1000) {
                        zzer zzerVarZzd = zzgdVar.zzaA().zzd();
                        zzgdVar.zzf();
                        zzerVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(i);
                    Object objOooOoO0 = OooOoO0(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    zzlj zzljVarZzu = zzlhVar.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    arrayList.add(new zzac(string, string2, new zzlk(cursorQuery.getLong(10), string3, string2, objOooOoO0), cursorQuery.getLong(8), z, string4, (zzau) zzljVarZzu.OooOOOo(blob, creator), j, (zzau) zzlhVar.zzu().OooOOOo(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzau) zzlhVar.zzu().OooOOOo(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i = 2;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    zzgdVar.zzaA().zzd().zzb("Error querying conditional user property value", e);
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    @WorkerThread
    public final List OooOoo(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                        sb.append(" and origin=?");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                    String[] strArr2 = {"name", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ORIGIN};
                    String string = sb.toString();
                    zzgdVar.zzf();
                    Cursor cursorQuery = sQLiteDatabaseOooOOo.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
                    try {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str4 = str2;
                            while (true) {
                                try {
                                    int size = arrayList.size();
                                    zzgdVar.zzf();
                                    if (size >= 1000) {
                                        zzer zzerVarZzd = zzgdVar.zzaA().zzd();
                                        zzgdVar.zzf();
                                        zzerVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                        break;
                                    }
                                    String string2 = cursorQuery.getString(0);
                                    long j = cursorQuery.getLong(1);
                                    Object objOooOoO0 = OooOoO0(cursorQuery, 2);
                                    String string3 = cursorQuery.getString(3);
                                    if (objOooOoO0 == null) {
                                        try {
                                            zzgdVar.zzaA().zzd().zzd("(2)Read invalid user property value, ignoring it", zzet.OooO0Oo(str), string3, str3);
                                            str5 = string3;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            str5 = string3;
                                            cursor = cursorQuery;
                                            str4 = str5;
                                            try {
                                                zzgdVar.zzaA().zzd().zzd("(2)Error querying user properties", zzet.OooO0Oo(str), str4, e);
                                                List listEmptyList = Collections.emptyList();
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return listEmptyList;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        str5 = string3;
                                        arrayList.add(new O0O0(j, str, str5, string2, objOooOoO0));
                                    }
                                    try {
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
                                        str4 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        zzgdVar.zzaA().zzd().zzd("(2)Error querying user properties", zzet.OooO0Oo(str), str4, e);
                                        List listEmptyList2 = Collections.emptyList();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return listEmptyList2;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    cursor = cursorQuery;
                                    zzgdVar.zzaA().zzd().zzd("(2)Error querying user properties", zzet.OooO0Oo(str), str4, e);
                                    List listEmptyList3 = Collections.emptyList();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return listEmptyList3;
                                }
                            }
                            cursorQuery.close();
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        str4 = str2;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str4 = str2;
                    cursor = null;
                    zzgdVar.zzaA().zzd().zzd("(2)Error querying user properties", zzet.OooO0Oo(str), str4, e);
                    List listEmptyList4 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList4;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e6) {
            e = e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    @WorkerThread
    public final List OooOoo0(String str) throws Throwable {
        Cursor cursor;
        zzgd zzgdVar = this.f41276OooO00o;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            String[] strArr = {"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE};
            zzgdVar.zzf();
            Cursor cursorQuery = sQLiteDatabaseOooOOo.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objOooOoO0 = OooOoO0(cursorQuery, 3);
                    if (objOooOoO0 == null) {
                        zzgdVar.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.OooO0Oo(str));
                    } else {
                        arrayList.add(new O0O0(j, str, str2, string, objOooOoO0));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    zzgdVar.zzaA().zzd().zzc("Error querying user properties. appId", zzet.OooO0Oo(str), e);
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void OooOooO(List list) {
        zzg();
        OooO00o();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (OooO0oO()) {
            String strOooO00o = o000oOoO.OooO00o("(", TextUtils.join(",", list), ")");
            long jOooOOO0 = OooOOO0("SELECT COUNT(1) FROM queue WHERE rowid IN " + strOooO00o + " AND retry_count =  2147483647 LIMIT 1", null);
            zzgd zzgdVar = this.f41276OooO00o;
            if (jOooOOO0 > 0) {
                zzgdVar.zzaA().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                OooOOo().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strOooO00o + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzgdVar.zzaA().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    public final String zzr() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseOooOOo.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f41276OooO00o.zzaA().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseOooOOo;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzw() {
        OooO00o();
        OooOOo().beginTransaction();
    }

    @WorkerThread
    public final void zzx() {
        OooO00o();
        OooOOo().endTransaction();
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        OooO00o();
        if (OooO0oO()) {
            zzlh zzlhVar = this.f41477OooO0O0;
            long jZza = zzlhVar.zzs().zza.zza();
            zzgd zzgdVar = this.f41276OooO00o;
            long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzgdVar.zzf();
            if (jAbs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                zzlhVar.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                OooO00o();
                if (OooO0oO()) {
                    SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                    String strValueOf = String.valueOf(zzgdVar.zzax().currentTimeMillis());
                    zzgdVar.zzf();
                    int iDelete = sQLiteDatabaseOooOOo.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzag.zzA())});
                    if (iDelete > 0) {
                        zzgdVar.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
