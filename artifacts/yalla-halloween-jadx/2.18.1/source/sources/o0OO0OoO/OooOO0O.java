package o0OO0OoO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.app.base.interfaceType.FeedbackType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzlh;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends oo0OOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f37495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O0OO0 f37496OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String[] f37488OooO0o = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f37489OooO0oO = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f37490OooO0oo = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", TopDataVM.TYPE_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String[] f37487OooO = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String[] f37491OooOO0 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String[] f37492OooOO0O = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String[] f37493OooOO0o = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String[] f37494OooOOO0 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public OooOO0O(zzkz zzkzVar) {
        super(zzkzVar);
        this.f37496OooO0o0 = new o0O0OO0(this.f37615OooO00o.zzav());
        this.f37615OooO00o.zzf();
        this.f37495OooO0Oo = new OooOO0(this, this.f37615OooO00o.zzau());
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
        if (OooOoO0(str, zzacVar.zzc.zzb) == null) {
            long jOooOOO0 = OooOOO0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f37615OooO00o.zzf();
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
        contentValues.put("timed_out_event", this.f37615OooO00o.zzv().Oooo00O(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.f37615OooO00o.zzv().Oooo00O(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.f37615OooO00o.zzv().Oooo00O(zzacVar.zzk));
        try {
            if (OooOOo().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f37615OooO00o.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeo.OooO0o0(str));
            }
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Error storing conditional user property", zzeo.OooO0o0(str), e);
        }
        return true;
    }

    @Override // o0OO0OoO.oo0OOoo
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
            this.f37615OooO00o.zzay().zzd().zzd("Error deleting user property. appId", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0o(str2), e);
        }
    }

    @WorkerThread
    public final void OooO0Oo() {
        OooO00o();
        OooOOo().setTransactionSuccessful();
    }

    @WorkerThread
    public final void OooO0o(OooOOOO oooOOOO) {
        Preconditions.checkNotNull(oooOOOO);
        zzg();
        OooO00o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oooOOOO.f37504OooO00o);
        contentValues.put("name", oooOOOO.f37505OooO0O0);
        contentValues.put("lifetime_count", Long.valueOf(oooOOOO.f37506OooO0OO));
        contentValues.put("current_bundle_count", Long.valueOf(oooOOOO.f37507OooO0Oo));
        contentValues.put("last_fire_timestamp", Long.valueOf(oooOOOO.f37508OooO0o));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oooOOOO.f37510OooO0oO));
        contentValues.put("last_bundled_day", oooOOOO.f37511OooO0oo);
        contentValues.put("last_sampled_complex_event_id", oooOOOO.f37503OooO);
        contentValues.put("last_sampling_rate", oooOOOO.f37512OooOO0);
        contentValues.put("current_session_count", Long.valueOf(oooOOOO.f37509OooO0o0));
        Boolean bool = oooOOOO.f37513OooOO0O;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (OooOOo().insertWithOnConflict(d.ar, null, contentValues, 5) == -1) {
                this.f37615OooO00o.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeo.OooO0o0(oooOOOO.f37504OooO00o));
            }
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Error storing event aggregates. appId", zzeo.OooO0o0(oooOOOO.f37504OooO00o), e);
        }
    }

    @WorkerThread
    public final void OooO0o0(o000O o000o) {
        Preconditions.checkNotNull(o000o);
        zzg();
        OooO00o();
        String strOooo0o0 = o000o.Oooo0o0();
        Preconditions.checkNotNull(strOooo0o0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strOooo0o0);
        contentValues.put("app_instance_id", o000o.Oooo0o());
        contentValues.put("gmp_app_id", o000o.OoooO00());
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("resettable_device_id_hash", o000o.f37577OooO0o0);
        contentValues.put("last_bundle_index", Long.valueOf(o000o.Oooo00o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(o000o.Oooo0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(o000o.Oooo00O()));
        contentValues.put("app_version", o000o.Oooo0oo());
        contentValues.put("app_store", o000o.Oooo0oO());
        contentValues.put("gmp_version", Long.valueOf(o000o.Oooo000()));
        contentValues.put("dev_cert_hash", Long.valueOf(o000o.OooOoo()));
        contentValues.put("measurement_enabled", Boolean.valueOf(o000o.OooOoO()));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put(TopDataVM.TYPE_DAY, Long.valueOf(o000o.f37593OooOo0O));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("daily_public_events_count", Long.valueOf(o000o.f37594OooOo0o));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("daily_events_count", Long.valueOf(o000o.f37590OooOo));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("daily_conversions_count", Long.valueOf(o000o.f37596OooOoO0));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("config_fetched_time", Long.valueOf(o000o.f37600OooOooO));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("failed_config_fetch_time", Long.valueOf(o000o.f37601OooOooo));
        contentValues.put("app_version_int", Long.valueOf(o000o.OooOoOO()));
        contentValues.put("firebase_instance_id", o000o.Oooo());
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("daily_error_events_count", Long.valueOf(o000o.f37595OooOoO));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("daily_realtime_events_count", Long.valueOf(o000o.f37597OooOoOO));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("health_monitor_sample", o000o.f37599OooOoo0);
        o000o.OooOOo();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(o000o.OooOoO0()));
        contentValues.put("admob_app_id", o000o.Oooo0O0());
        contentValues.put("dynamite_version", Long.valueOf(o000o.OooOooO()));
        o000o.f37572OooO00o.zzaz().zzg();
        contentValues.put("session_stitching_token", o000o.f37591OooOo0);
        List listOooO00o = o000o.OooO00o();
        if (listOooO00o != null) {
            if (listOooO00o.isEmpty()) {
                this.f37615OooO00o.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", strOooo0o0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listOooO00o));
            }
        }
        zzns.zzc();
        if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzai) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            if (sQLiteDatabaseOooOOo.update("apps", contentValues, "app_id = ?", new String[]{strOooo0o0}) == 0 && sQLiteDatabaseOooOOo.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f37615OooO00o.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeo.OooO0o0(strOooo0o0));
            }
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Error storing app. appId", zzeo.OooO0o0(strOooo0o0), e);
        }
    }

    @VisibleForTesting
    public final boolean OooO0oO() {
        Context contextZzau = this.f37615OooO00o.zzau();
        this.f37615OooO00o.zzf();
        return contextZzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean OooO0oo(String str, Long l, long j, zzfs zzfsVar) {
        zzg();
        OooO00o();
        Preconditions.checkNotNull(zzfsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzbv = zzfsVar.zzbv();
        this.f37615OooO00o.zzay().zzj().zzc("Saving complex main event, appId, data size", this.f37615OooO00o.zzj().OooO0Oo(str), Integer.valueOf(bArrZzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzbv);
        try {
            if (OooOOo().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f37615OooO00o.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeo.OooO0o0(str));
            return false;
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Error storing complex main event. appId", zzeo.OooO0o0(str), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean OooOO0(oo0ooO oo0ooo) {
        Preconditions.checkNotNull(oo0ooo);
        zzg();
        OooO00o();
        if (OooOoO0(oo0ooo.f37906OooO00o, oo0ooo.f37908OooO0OO) == null) {
            if (zzlh.OooOoo(oo0ooo.f37908OooO0OO)) {
                if (OooOOO0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{oo0ooo.f37906OooO00o}) >= this.f37615OooO00o.zzf().zzf(oo0ooo.f37906OooO00o, zzeb.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(oo0ooo.f37908OooO0OO)) {
                long jOooOOO0 = OooOOO0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{oo0ooo.f37906OooO00o, oo0ooo.f37907OooO0O0});
                this.f37615OooO00o.zzf();
                if (jOooOOO0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oo0ooo.f37906OooO00o);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, oo0ooo.f37907OooO0O0);
        contentValues.put("name", oo0ooo.f37908OooO0OO);
        contentValues.put("set_timestamp", Long.valueOf(oo0ooo.f37909OooO0Oo));
        OooOO0o(contentValues, oo0ooo.f37910OooO0o0);
        try {
            if (OooOOo().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f37615OooO00o.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeo.OooO0o0(oo0ooo.f37906OooO00o));
            }
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Error storing user property. appId", zzeo.OooO0o0(oo0ooo.f37906OooO00o), e);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void OooOO0O(long j, long j2, o0OO000 o0oo000) throws Throwable {
        ?? IsEmpty;
        String string;
        int i;
        String str;
        String[] strArr;
        Preconditions.checkNotNull(o0oo000);
        zzg();
        OooO00o();
        ?? r3 = 0;
        String string2 = null;
         = 0;
        ?? r4 = 0;
        try {
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                    IsEmpty = TextUtils.isEmpty(null);
                    try {
                        if (IsEmpty != 0) {
                            Cursor cursorRawQuery = sQLiteDatabaseOooOOo.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                            if (!cursorRawQuery.moveToFirst()) {
                                cursorRawQuery.close();
                                return;
                            }
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                            IsEmpty = cursorRawQuery;
                        } else {
                            Cursor cursorRawQuery2 = sQLiteDatabaseOooOOo.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                            if (!cursorRawQuery2.moveToFirst()) {
                                cursorRawQuery2.close();
                                return;
                            } else {
                                string = cursorRawQuery2.getString(0);
                                cursorRawQuery2.close();
                                IsEmpty = cursorRawQuery2;
                            }
                        }
                        String str2 = string2;
                        r4 = IsEmpty;
                        String str3 = string;
                        try {
                            Cursor cursorQuery = sQLiteDatabaseOooOOo.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str3}, null, null, "rowid", FeedbackType.Suggestions);
                            if (!cursorQuery.moveToFirst()) {
                                this.f37615OooO00o.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeo.OooO0o0(str2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                zzgc zzgcVar = (zzgc) ((zzgb) zzlb.OooOOoo(zzgc.zzt(), cursorQuery.getBlob(0))).zzaE();
                                if (cursorQuery.moveToNext()) {
                                    this.f37615OooO00o.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeo.OooO0o0(str2));
                                }
                                cursorQuery.close();
                                Preconditions.checkNotNull(zzgcVar);
                                o0oo000.f37813OooO00o = zzgcVar;
                                if (j2 != -1) {
                                    str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    i = 1;
                                    strArr = new String[]{str2, str3, String.valueOf(j2)};
                                } else {
                                    i = 1;
                                    str = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{str2, str3};
                                }
                                Cursor cursorQuery2 = sQLiteDatabaseOooOOo.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                                if (!cursorQuery2.moveToFirst()) {
                                    this.f37615OooO00o.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeo.OooO0o0(str2));
                                    cursorQuery2.close();
                                    return;
                                }
                                do {
                                    long j3 = cursorQuery2.getLong(0);
                                    try {
                                        zzfr zzfrVar = (zzfr) zzlb.OooOOoo(zzfs.zze(), cursorQuery2.getBlob(3));
                                        zzfrVar.zzi(cursorQuery2.getString(i));
                                        zzfrVar.zzm(cursorQuery2.getLong(2));
                                        if (!o0oo000.OooO00o(j3, (zzfs) zzfrVar.zzaE())) {
                                            cursorQuery2.close();
                                            return;
                                        }
                                    } catch (IOException e) {
                                        this.f37615OooO00o.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeo.OooO0o0(str2), e);
                                    }
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                            } catch (IOException e2) {
                                this.f37615OooO00o.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeo.OooO0o0(str2), e2);
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            IsEmpty = r4;
                            r4 = str2;
                            this.f37615OooO00o.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeo.OooO0o0(r4), e);
                            if (IsEmpty != 0) {
                                IsEmpty.close();
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    IsEmpty = 0;
                }
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r3 = IsEmpty;
        }
    }

    @WorkerThread
    public final int OooOOO(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        try {
            return OooOOo().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzd("Error deleting conditional property", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0o(str2), e);
            return 0;
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
                this.f37615OooO00o.zzay().zzd().zzc("Database error", str, e);
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
                this.f37615OooO00o.zzay().zzd().zzc("Database error", str, e);
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
                        this.f37615OooO00o.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeo.OooO0o0(str), "first_open_count");
                        return -1L;
                    }
                    jOooOOOO = 0;
                    this.f37615OooO00o.zzay().zzd().zzd("Error inserting column. appId", zzeo.OooO0o0(str), "first_open_count", e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jOooOOOO));
                    if (sQLiteDatabaseOooOOo.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.f37615OooO00o.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeo.OooO0o0(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseOooOOo.setTransactionSuccessful();
                    return jOooOOOO;
                } catch (SQLiteException e) {
                    e = e;
                    j = jOooOOOO;
                }
            } finally {
                sQLiteDatabaseOooOOo.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase OooOOo() {
        zzg();
        try {
            return this.f37495OooO0Oo.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    public final long OooOOo0(String str) {
        Preconditions.checkNotEmpty(str);
        return OooOOOO("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    public final Bundle OooOOoo(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        OooO00o();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = OooOOo().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.f37615OooO00o.zzay().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        zzfs zzfsVar = (zzfs) ((zzfr) zzlb.OooOOoo(zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE();
                        this.f37794OooO0O0.zzu();
                        List<zzfw> listZzi = zzfsVar.zzi();
                        Bundle bundle = new Bundle();
                        for (zzfw zzfwVar : listZzi) {
                            String strZzg = zzfwVar.zzg();
                            if (zzfwVar.zzu()) {
                                bundle.putDouble(strZzg, zzfwVar.zza());
                            } else if (zzfwVar.zzv()) {
                                bundle.putFloat(strZzg, zzfwVar.zzb());
                            } else if (zzfwVar.zzy()) {
                                bundle.putString(strZzg, zzfwVar.zzh());
                            } else if (zzfwVar.zzw()) {
                                bundle.putLong(strZzg, zzfwVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e) {
                        this.f37615OooO00o.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeo.OooO0o0(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f37615OooO00o.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
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
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    @WorkerThread
    public final OooOOOO OooOo(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = OooOOo().query(d.ar, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
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
                cursor2 = cursorQuery;
                try {
                    OooOOOO oooOOOO = new OooOOOO(str, str2, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        this.f37615OooO00o.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeo.OooO0o0(str));
                    }
                    cursor2.close();
                    return oooOOOO;
                } catch (SQLiteException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = cursorQuery;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.f37615OooO00o.zzay().zzd().zzd("Error querying events. appId", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0Oo(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzac OooOo0(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor = null;
        try {
            cursorQuery = OooOOo().query("conditional_properties", new String[]{AppMeasurementSdk.ConditionalUserProperty.ORIGIN, AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
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
                    Object objOooOoO = OooOoO(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    zzlb zzlbVarZzu = this.f37794OooO0O0.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzlc(str2, cursorQuery.getLong(8), objOooOoO, str3), cursorQuery.getLong(6), z, string2, (zzaw) zzlbVarZzu.OooOOOo(blob, creator), j, (zzaw) this.f37794OooO0O0.zzu().OooOOOo(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzaw) this.f37794OooO0O0.zzu().OooOOOo(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.f37615OooO00o.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0o(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.f37615OooO00o.zzay().zzd().zzd("Error querying conditional property", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0o(str2), e);
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

    /* JADX WARN: Code duplicated, block: B:77:0x0278  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0275: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:75:0x0275 */
    @WorkerThread
    public final o000O OooOo00(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        Cursor cursor2 = null;
        try {
            try {
                boolean z = true;
                cursorQuery = OooOOo().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", TopDataVM.TYPE_DAY, "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    o000O o000o = new o000O(this.f37794OooO0O0.f16294OooOO0o, str);
                    o000o.OooO0o0(cursorQuery.getString(0));
                    o000o.OooOOO(cursorQuery.getString(1));
                    o000o.OooOo0O(cursorQuery.getString(2));
                    o000o.OooOOoo(cursorQuery.getLong(3));
                    o000o.OooOo00(cursorQuery.getLong(4));
                    o000o.OooOOo0(cursorQuery.getLong(5));
                    o000o.OooO0oO(cursorQuery.getString(6));
                    o000o.OooO0o(cursorQuery.getString(7));
                    o000o.OooOOOO(cursorQuery.getLong(8));
                    o000o.OooOO0(cursorQuery.getLong(9));
                    o000o.OooOo0(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    long j = cursorQuery.getLong(11);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37593OooOo0O != j;
                    o000o.f37593OooOo0O = j;
                    long j2 = cursorQuery.getLong(12);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37594OooOo0o != j2;
                    o000o.f37594OooOo0o = j2;
                    long j3 = cursorQuery.getLong(13);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37590OooOo != j3;
                    o000o.f37590OooOo = j3;
                    long j4 = cursorQuery.getLong(14);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37596OooOoO0 != j4;
                    o000o.f37596OooOoO0 = j4;
                    o000o.OooO(cursorQuery.getLong(15));
                    o000o.OooOO0o(cursorQuery.getLong(16));
                    o000o.OooO0oo(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    o000o.OooOOO0(cursorQuery.getString(18));
                    long j5 = cursorQuery.getLong(19);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37595OooOoO != j5;
                    o000o.f37595OooOoO = j5;
                    long j6 = cursorQuery.getLong(20);
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo |= o000o.f37597OooOoOO != j6;
                    o000o.f37597OooOoOO = j6;
                    o000o.OooOOOo(cursorQuery.getString(21));
                    if (!cursorQuery.isNull(23) && cursorQuery.getInt(23) == 0) {
                        z = false;
                    }
                    o000o.OooO0Oo(z);
                    o000o.OooO0OO(cursorQuery.getString(24));
                    o000o.OooOO0O(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        o000o.OooOo0o(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzoz.zzc();
                    if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzar)) {
                        o000o.OooOo(cursorQuery.getString(28));
                    }
                    o000o.f37572OooO00o.zzaz().zzg();
                    o000o.f37598OooOoo = false;
                    if (cursorQuery.moveToNext()) {
                        this.f37615OooO00o.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeo.OooO0o0(str));
                    }
                    cursorQuery.close();
                    return o000o;
                } catch (SQLiteException e) {
                    e = e;
                    this.f37615OooO00o.zzay().zzd().zzc("Error querying app. appId", zzeo.OooO0o0(str), e);
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
    public final zzak OooOo0O(long j, String str, boolean z, boolean z2) {
        return OooOo0o(j, str, 1L, false, false, z, false, z2);
    }

    @WorkerThread
    public final zzak OooOo0o(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                Cursor cursorQuery = sQLiteDatabaseOooOOo.query("apps", new String[]{TopDataVM.TYPE_DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.f37615OooO00o.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeo.OooO0o0(str));
                    cursorQuery.close();
                    return zzakVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzakVar.f16080OooO0O0 = cursorQuery.getLong(1);
                    zzakVar.f16079OooO00o = cursorQuery.getLong(2);
                    zzakVar.f16081OooO0OO = cursorQuery.getLong(3);
                    zzakVar.f16082OooO0Oo = cursorQuery.getLong(4);
                    zzakVar.f16083OooO0o0 = cursorQuery.getLong(5);
                }
                if (z) {
                    zzakVar.f16080OooO0O0 += j2;
                }
                if (z2) {
                    zzakVar.f16079OooO00o += j2;
                }
                if (z3) {
                    zzakVar.f16081OooO0OO += j2;
                }
                if (z4) {
                    zzakVar.f16082OooO0Oo += j2;
                }
                if (z5) {
                    zzakVar.f16083OooO0o0 += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(TopDataVM.TYPE_DAY, Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.f16079OooO00o));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.f16080OooO0O0));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.f16081OooO0OO));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.f16082OooO0Oo));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.f16083OooO0o0));
                sQLiteDatabaseOooOOo.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzakVar;
            } catch (SQLiteException e) {
                this.f37615OooO00o.zzay().zzd().zzc("Error updating daily counts. appId", zzeo.OooO0o0(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final Object OooOoO(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            p167o00Ooo.OooOO0.OooO0O0(this.f37615OooO00o, "Loaded invalid null value from database");
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
            this.f37615OooO00o.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        p167o00Ooo.OooOO0.OooO0O0(this.f37615OooO00o, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a5: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a5 */
    @WorkerThread
    public final oo0ooO OooOoO0(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        OooO00o();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = OooOOo().query("user_attributes", new String[]{"set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objOooOoO = OooOoO(cursorQuery, 1);
                    if (objOooOoO == null) {
                        cursorQuery.close();
                        return null;
                    }
                    oo0ooO oo0ooo = new oo0ooO(str, cursorQuery.getString(2), str2, j, objOooOoO);
                    if (cursorQuery.moveToNext()) {
                        this.f37615OooO00o.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeo.OooO0o0(str));
                    }
                    cursorQuery.close();
                    return oo0ooo;
                } catch (SQLiteException e) {
                    e = e;
                    this.f37615OooO00o.zzay().zzd().zzd("Error querying user property. appId", zzeo.OooO0o0(str), this.f37615OooO00o.zzj().OooO0o(str2), e);
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
    public final List OooOoOO(String str, String str2, String str3) {
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
        return OooOoo0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    @WorkerThread
    public final List OooOoo(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.f37615OooO00o.zzf();
                cursorQuery = OooOOo().query("user_attributes", new String[]{"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
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
                    Object objOooOoO = OooOoO(cursorQuery, 3);
                    if (objOooOoO == null) {
                        this.f37615OooO00o.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeo.OooO0o0(str));
                    } else {
                        arrayList.add(new oo0ooO(str, str2, string, j, objOooOoO));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f37615OooO00o.zzay().zzd().zzc("Error querying user properties. appId", zzeo.OooO0o0(str), e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    public final List OooOoo0(String str, String[] strArr) {
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                String[] strArr2 = {"app_id", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                this.f37615OooO00o.zzf();
                cursorQuery = sQLiteDatabaseOooOOo.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    int size = arrayList.size();
                    this.f37615OooO00o.zzf();
                    if (size >= 1000) {
                        zzem zzemVarZzd = this.f37615OooO00o.zzay().zzd();
                        this.f37615OooO00o.zzf();
                        zzemVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objOooOoO = OooOoO(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    zzlb zzlbVarZzu = this.f37794OooO0O0.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) zzlbVarZzu.OooOOOo(blob, creator);
                    arrayList.add(new zzac(string, string2, new zzlc(string3, cursorQuery.getLong(10), objOooOoO, string2), cursorQuery.getLong(8), z, string4, zzawVar, j, (zzaw) this.f37794OooO0O0.zzu().OooOOOo(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzaw) this.f37794OooO0O0.zzu().OooOOOo(cursorQuery.getBlob(12), creator)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f37615OooO00o.zzay().zzd().zzb("Error querying conditional user property value", e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    @WorkerThread
    public final List OooOooO(String str, String str2, String str3) {
        String string;
        Preconditions.checkNotEmpty(str);
        zzg();
        OooO00o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            this.f37615OooO00o.zzay().zzd().zzd("(2)Error querying user properties", zzeo.OooO0o0(str), string, e);
                            List listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                    String[] strArr2 = {"name", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ORIGIN};
                    String string2 = sb.toString();
                    this.f37615OooO00o.zzf();
                    cursorQuery = sQLiteDatabaseOooOOo.query("user_attributes", strArr2, string2, strArr, null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    do {
                        int size = arrayList.size();
                        this.f37615OooO00o.zzf();
                        if (size >= 1000) {
                            zzem zzemVarZzd = this.f37615OooO00o.zzay().zzd();
                            this.f37615OooO00o.zzf();
                            zzemVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                            break;
                        }
                        String string3 = cursorQuery.getString(0);
                        long j = cursorQuery.getLong(1);
                        Object objOooOoO = OooOoO(cursorQuery, 2);
                        string = cursorQuery.getString(3);
                        if (objOooOoO == null) {
                            this.f37615OooO00o.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeo.OooO0o0(str), string, str3);
                        } else {
                            arrayList.add(new oo0ooO(str, string, string3, j, objOooOoO));
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                    string = str2;
                    this.f37615OooO00o.zzay().zzd().zzd("(2)Error querying user properties", zzeo.OooO0o0(str), string, e);
                    List listEmptyList2 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList2;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void OooOooo() {
        OooO00o();
        OooOOo().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final void Oooo000(List list) {
        zzg();
        OooO00o();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (OooO0oO()) {
            String strOooO00o = OooO0o.OooO0OO.OooO00o("(", TextUtils.join(",", list), ")");
            if (OooOOO0("SELECT COUNT(1) FROM queue WHERE rowid IN " + strOooO00o + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                OooO00o.OooO0O0(this.f37615OooO00o, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                OooOOo().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strOooO00o + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f37615OooO00o.zzay().zzd().zzb("Error incrementing retry count. error", e);
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
                    this.f37615OooO00o.zzay().zzd().zzb("Database error getting next bundle app id", e);
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
    public final void zzz() {
        zzg();
        OooO00o();
        if (OooO0oO()) {
            long jZza = this.f37794OooO0O0.zzs().zza.zza();
            long jElapsedRealtime = this.f37615OooO00o.zzav().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.f37615OooO00o.zzf();
            if (jAbs > ((Long) zzeb.zzx.zza(null)).longValue()) {
                this.f37794OooO0O0.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                OooO00o();
                if (OooO0oO()) {
                    SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
                    this.f37615OooO00o.zzf();
                    int iDelete = sQLiteDatabaseOooOOo.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f37615OooO00o.zzav().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (iDelete > 0) {
                        this.f37615OooO00o.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
