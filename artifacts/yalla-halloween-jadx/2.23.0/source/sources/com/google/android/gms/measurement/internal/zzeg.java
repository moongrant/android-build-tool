package com.google.android.gms.measurement.internal;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.internal.measurement.zzrg;
import com.google.android.gms.internal.measurement.zzrj;
import com.google.android.gms.internal.measurement.zzrm;
import com.google.android.gms.internal.measurement.zzrp;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import p269o00ooooo.o0OO00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeg {
    public static final zzef zzA;
    public static final zzef zzB;
    public static final zzef zzC;
    public static final zzef zzD;
    public static final zzef zzE;
    public static final zzef zzF;
    public static final zzef zzG;
    public static final zzef zzH;
    public static final zzef zzI;
    public static final zzef zzJ;
    public static final zzef zzK;
    public static final zzef zzL;
    public static final zzef zzM;
    public static final zzef zzN;
    public static final zzef zzO;
    public static final zzef zzP;
    public static final zzef zzQ;
    public static final zzef zzR;
    public static final zzef zzS;
    public static final zzef zzT;
    public static final zzef zzU;
    public static final zzef zzV;
    public static final zzef zzW;
    public static final zzef zzX;
    public static final zzef zzY;
    public static final zzef zzZ;
    public static final zzef zzaA;
    public static final zzef zzaB;
    public static final zzef zzaC;
    public static final zzef zzaD;
    public static final zzef zzaE;
    public static final zzef zzaF;
    public static final zzef zzaG;
    public static final zzef zzaH;
    public static final zzef zzaI;
    public static final zzef zzaa;
    public static final zzef zzab;
    public static final zzef zzac;
    public static final zzef zzad;
    public static final zzef zzae;
    public static final zzef zzaf;
    public static final zzef zzag;
    public static final zzef zzah;
    public static final zzef zzai;
    public static final zzef zzaj;
    public static final zzef zzak;
    public static final zzef zzal;
    public static final zzef zzam;
    public static final zzef zzan;
    public static final zzef zzao;
    public static final zzef zzap;
    public static final zzef zzaq;
    public static final zzef zzar;
    public static final zzef zzas;
    public static final zzef zzat;
    public static final zzef zzau;
    public static final zzef zzav;
    public static final zzef zzaw;
    public static final zzef zzax;
    public static final zzef zzay;
    public static final zzef zzaz;
    public static final zzef zzk;
    public static final zzef zzl;
    public static final zzef zzm;
    public static final zzef zzn;
    public static final zzef zzo;
    public static final zzef zzp;
    public static final zzef zzq;
    public static final zzef zzr;
    public static final zzef zzs;
    public static final zzef zzt;
    public static final zzef zzu;
    public static final zzef zzv;
    public static final zzef zzw;
    public static final zzef zzx;
    public static final zzef zzy;
    public static final zzef zzz;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List f15902OooO00o = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set f15903OooO0O0 = Collections.synchronizedSet(new HashSet());
    public static final zzef zza = OooO00o("measurement.ad_id_cache_time", 10000L, 10000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Long.valueOf(zzoj.zzb());
        }
    });
    public static final zzef zzb = OooO00o("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzaz
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Long.valueOf(zzoj.zzc());
        }
    });
    public static final zzef zzc = OooO00o("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Long.valueOf(zzoj.zzn());
        }
    });
    public static final zzef zzd = OooO00o("measurement.config.cache_time", 86400000L, 3600000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbx
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Long.valueOf(zzoj.zze());
        }
    });
    public static final zzef zze = OooO00o("measurement.config.url_scheme", "https", "https", new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcj
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return zzoj.zzM();
        }
    });
    public static final zzef zzf = OooO00o("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcv
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return zzoj.zzL();
        }
    });
    public static final zzef zzg = OooO00o("measurement.upload.max_bundles", 100, 100, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdh
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Integer.valueOf((int) zzoj.zzy());
        }
    });
    public static final zzef zzh = OooO00o("measurement.upload.max_batch_size", 65536, 65536, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdt
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Integer.valueOf((int) zzoj.zzG());
        }
    });
    public static final zzef zzi = OooO00o("measurement.upload.max_bundle_size", 65536, 65536, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdy
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Integer.valueOf((int) zzoj.zzx());
        }
    });
    public static final zzef zzj = OooO00o("measurement.upload.max_events_per_bundle", 1000, 1000, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdz
        @Override // p269o00ooooo.o0OO00OO
        public final Object zza() {
            List list = zzeg.f15902OooO00o;
            return Integer.valueOf((int) zzoj.zzB());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        zzk = OooO00o("measurement.upload.max_events_per_day", numValueOf, numValueOf, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzC());
            }
        });
        zzl = OooO00o("measurement.upload.max_error_events_per_day", 1000, 1000, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzA());
            }
        });
        Integer numValueOf2 = Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        zzm = OooO00o("measurement.upload.max_public_events_per_day", numValueOf2, numValueOf2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzD());
            }
        });
        Integer numValueOf3 = Integer.valueOf(ResponseInfo.UnknownError);
        zzn = OooO00o("measurement.upload.max_conversions_per_day", numValueOf3, numValueOf3, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzz());
            }
        });
        zzo = OooO00o("measurement.upload.max_realtime_events_per_day", 10, 10, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzF());
            }
        });
        zzp = OooO00o("measurement.store.max_stored_events_per_app", numValueOf, numValueOf, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzh());
            }
        });
        zzq = OooO00o("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return zzoj.zzN();
            }
        });
        zzr = OooO00o("measurement.upload.backoff_period", 43200000L, 43200000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzu());
            }
        });
        zzs = OooO00o("measurement.upload.window_interval", 3600000L, 3600000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzax
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzJ());
            }
        });
        zzt = OooO00o("measurement.upload.interval", 3600000L, 3600000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzw());
            }
        });
        zzu = OooO00o("measurement.upload.realtime_upload_interval", 10000L, 10000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzo());
            }
        });
        zzv = OooO00o("measurement.upload.debug_upload_interval", 1000L, 1000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbb
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzf());
            }
        });
        zzw = OooO00o("measurement.upload.minimum_delay", 500L, 500L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzm());
            }
        });
        zzx = OooO00o("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzl());
            }
        });
        zzy = OooO00o("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzr());
            }
        });
        zzz = OooO00o("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzp());
            }
        });
        zzA = OooO00o("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzv());
            }
        });
        zzB = OooO00o("measurement.upload.retry_time", 1800000L, 1800000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzI());
            }
        });
        zzC = OooO00o("measurement.upload.retry_count", 6, 6, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzH());
            }
        });
        zzD = OooO00o("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzE());
            }
        });
        zzE = OooO00o("measurement.lifetimevalue.max_currency_tracked", 4, 4, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzg());
            }
        });
        zzF = OooO00o("measurement.audience.filter_result_max_count", 200, 200, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzj());
            }
        });
        zzG = OooO00o("measurement.upload.max_public_user_properties", 25, 25, null);
        zzH = OooO00o("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzI = OooO00o("measurement.upload.max_public_event_params", 25, 25, null);
        zzJ = OooO00o("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzq());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzK = OooO00o("measurement.test.boolean_flag", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqc.zzg());
            }
        });
        zzL = OooO00o("measurement.test.string_flag", "---", "---", new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return zzqc.zzf();
            }
        });
        zzM = OooO00o("measurement.test.long_flag", -1L, -1L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzqc.zzd());
            }
        });
        zzN = OooO00o("measurement.test.int_flag", -2, -2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzqc.zzc());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        zzO = OooO00o("measurement.test.double_flag", dValueOf, dValueOf, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Double.valueOf(zzqc.zzb());
            }
        });
        zzP = OooO00o("measurement.experiment.max_ids", 50, 50, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzi());
            }
        });
        zzQ = OooO00o("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzk());
            }
        });
        zzR = OooO00o("measurement.max_bundles_per_iteration", 100, 100, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzoj.zzd());
            }
        });
        zzS = OooO00o("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzs());
            }
        });
        zzT = OooO00o("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Long.valueOf(zzoj.zzt());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzU = OooO00o("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqf.zzc());
            }
        });
        zzV = OooO00o("measurement.quality.checksum", bool, bool, null);
        zzW = OooO00o("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzoy.zze());
            }
        });
        zzX = OooO00o("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzoy.zzd());
            }
        });
        zzY = OooO00o("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzoy.zzf());
            }
        });
        zzZ = OooO00o("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrm.zzc());
            }
        });
        zzaa = OooO00o("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpt.zzc());
            }
        });
        zzab = OooO00o("measurement.lifecycle.app_in_background_parameter", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpw.zzc());
            }
        });
        zzac = OooO00o("measurement.integration.disable_firebase_instance_id", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrj.zzd());
            }
        });
        zzad = OooO00o("measurement.collection.service.update_with_analytics_fix", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrp.zzc());
            }
        });
        zzae = OooO00o("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzos.zzd());
            }
        });
        zzaf = OooO00o("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzph.zzd());
            }
        });
        zzag = OooO00o("measurement.collection.synthetic_data_mitigation", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrg.zzc());
            }
        });
        zzah = OooO00o("measurement.service.storage_consent_support_version", 203600, 203600, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Integer.valueOf((int) zzom.zzb());
            }
        });
        zzai = OooO00o("measurement.client.click_identifier_control.dev", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzod.zzc());
            }
        });
        zzaj = OooO00o("measurement.service.click_identifier_control", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzog.zzc());
            }
        });
        zzak = OooO00o("measurement.service.store_null_safelist", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzop.zzd());
            }
        });
        zzal = OooO00o("measurement.service.store_safelist", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzop.zze());
            }
        });
        zzam = OooO00o("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqu.zze());
            }
        });
        zzan = OooO00o("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqu.zzd());
            }
        });
        zzao = OooO00o("measurement.session_stitching_token_enabled", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqu.zzf());
            }
        });
        zzap = OooO00o("measurement.sgtm.client.dev", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrd.zzd());
            }
        });
        zzaq = OooO00o("measurement.sgtm.service", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzrd.zze());
            }
        });
        zzar = OooO00o("measurement.redaction.retain_major_os_version", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzql.zzc());
            }
        });
        zzas = OooO00o("measurement.redaction.scion_payload_generator", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzql.zzd());
            }
        });
        zzat = OooO00o("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpk.zzd());
            }
        });
        zzau = OooO00o("measurement.sessionid.enable_client_session_id", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqr.zzd());
            }
        });
        zzav = OooO00o("measurement.sfmc.client", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzra.zzd());
            }
        });
        zzaw = OooO00o("measurement.sfmc.service", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzra.zze());
            }
        });
        zzax = OooO00o("measurement.gmscore_feature_tracking", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpn.zzd());
            }
        });
        zzay = OooO00o("measurement.fix_health_monitor_stack_trace", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpe.zzd());
            }
        });
        zzaz = OooO00o("measurement.item_scoped_custom_parameters.client", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpq.zzd());
            }
        });
        zzaA = OooO00o("measurement.item_scoped_custom_parameters.service", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzpq.zze());
            }
        });
        zzaB = OooO00o("measurement.remove_app_background.client", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqo.zzd());
            }
        });
        zzaC = OooO00o("measurement.rb.attribution.service", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqi.zzc());
            }
        });
        zzaD = OooO00o("measurement.collection.client.log_target_api_version", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzd());
            }
        });
        zzaE = OooO00o("measurement.collection.service.log_target_api_version", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                return Boolean.valueOf(zzpz.zze());
            }
        });
        zzaF = OooO00o("measurement.client.deep_link_referrer_fix", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                return Boolean.valueOf(zzpb.zzd());
            }
        });
        zzaG = OooO00o("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                return Boolean.valueOf(zzqx.zzc());
            }
        });
        zzaH = OooO00o("measurement.link_sst_to_sid", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                List list = zzeg.f15902OooO00o;
                return Boolean.valueOf(zzqu.zzg());
            }
        });
        zzaI = OooO00o("measurement.client.ad_id_consent_fix", bool2, bool2, new o0OO00OO() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // p269o00ooooo.o0OO00OO
            public final Object zza() {
                return Boolean.valueOf(zzov.zzd());
            }
        });
    }

    public static zzef OooO00o(String str, Object obj, Object obj2, o0OO00OO o0oo00oo2) {
        zzef zzefVar = new zzef(str, obj, obj2, o0oo00oo2);
        f15902OooO00o.add(zzefVar);
        return zzefVar;
    }
}
