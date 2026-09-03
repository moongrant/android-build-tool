package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzon;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpl;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import o0OO0OoO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzeb {
    public static final zzea zzA;
    public static final zzea zzB;
    public static final zzea zzC;
    public static final zzea zzD;
    public static final zzea zzE;
    public static final zzea zzF;
    public static final zzea zzG;
    public static final zzea zzH;
    public static final zzea zzI;
    public static final zzea zzJ;
    public static final zzea zzK;
    public static final zzea zzL;
    public static final zzea zzM;
    public static final zzea zzN;
    public static final zzea zzO;
    public static final zzea zzP;
    public static final zzea zzQ;
    public static final zzea zzR;
    public static final zzea zzS;
    public static final zzea zzT;
    public static final zzea zzU;
    public static final zzea zzV;
    public static final zzea zzW;
    public static final zzea zzX;
    public static final zzea zzY;
    public static final zzea zzZ;
    public static final zzea zzaA;
    public static final zzea zzaB;
    public static final zzea zzaa;
    public static final zzea zzab;
    public static final zzea zzac;
    public static final zzea zzad;
    public static final zzea zzae;
    public static final zzea zzaf;
    public static final zzea zzag;
    public static final zzea zzah;
    public static final zzea zzai;
    public static final zzea zzaj;
    public static final zzea zzak;
    public static final zzea zzal;
    public static final zzea zzam;
    public static final zzea zzan;
    public static final zzea zzao;
    public static final zzea zzap;
    public static final zzea zzaq;
    public static final zzea zzar;
    public static final zzea zzas;
    public static final zzea zzat;
    public static final zzea zzau;
    public static final zzea zzav;
    public static final zzea zzaw;
    public static final zzea zzax;
    public static final zzea zzay;
    public static final zzea zzaz;
    public static final zzea zzl;
    public static final zzea zzm;
    public static final zzea zzn;
    public static final zzea zzo;
    public static final zzea zzp;
    public static final zzea zzq;
    public static final zzea zzr;
    public static final zzea zzs;
    public static final zzea zzt;
    public static final zzea zzu;
    public static final zzea zzv;
    public static final zzea zzw;
    public static final zzea zzx;
    public static final zzea zzy;
    public static final zzea zzz;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List f16106OooO00o = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set f16107OooO0O0 = Collections.synchronizedSet(new HashSet());
    public static final zzea zza = OooO00o("measurement.ad_id_cache_time", 10000L, 10000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Long.valueOf(zznm.zzb());
        }
    });
    public static final zzea zzb = OooO00o("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Long.valueOf(zznm.zzl());
        }
    });
    public static final zzea zzc = OooO00o("measurement.config.cache_time", 86400000L, 3600000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Long.valueOf(zznm.zzd());
        }
    });
    public static final zzea zzd = OooO00o("measurement.config.url_scheme", "https", "https", new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbz
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return zznm.zzK();
        }
    });
    public static final zzea zze = OooO00o("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcl
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return zznm.zzJ();
        }
    });
    public static final zzea zzf = OooO00o("measurement.upload.max_bundles", 100, 100, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcx
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzw());
        }
    });
    public static final zzea zzg = OooO00o("measurement.upload.max_batch_size", 65536, 65536, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdj
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzE());
        }
    });
    public static final zzea zzh = OooO00o("measurement.upload.max_bundle_size", 65536, 65536, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdr
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzv());
        }
    });
    public static final zzea zzi = OooO00o("measurement.upload.max_events_per_bundle", 1000, 1000, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzds
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzz());
        }
    });
    public static final zzea zzj = OooO00o("measurement.upload.max_events_per_day", 100000, 100000, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdt
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzA());
        }
    });
    public static final zzea zzk = OooO00o("measurement.upload.max_error_events_per_day", 1000, 1000, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbu
        @Override // o0OO0OoO.o000oOoO
        public final Object zza() {
            zzea zzeaVar = zzeb.zza;
            return Integer.valueOf((int) zznm.zzy());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        zzl = OooO00o("measurement.upload.max_public_events_per_day", numValueOf, numValueOf, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzB());
            }
        });
        Integer numValueOf2 = Integer.valueOf(ResponseInfo.UnknownError);
        zzm = OooO00o("measurement.upload.max_conversions_per_day", numValueOf2, numValueOf2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzx());
            }
        });
        zzn = OooO00o("measurement.upload.max_realtime_events_per_day", 10, 10, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzD());
            }
        });
        zzo = OooO00o("measurement.store.max_stored_events_per_app", 100000, 100000, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzg());
            }
        });
        zzp = OooO00o("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return zznm.zzL();
            }
        });
        zzq = OooO00o("measurement.upload.backoff_period", 43200000L, 43200000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzs());
            }
        });
        zzr = OooO00o("measurement.upload.window_interval", 3600000L, 3600000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzH());
            }
        });
        zzs = OooO00o("measurement.upload.interval", 3600000L, 3600000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzu());
            }
        });
        zzt = OooO00o("measurement.upload.realtime_upload_interval", 10000L, 10000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzm());
            }
        });
        zzu = OooO00o("measurement.upload.debug_upload_interval", 1000L, 1000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zze());
            }
        });
        zzv = OooO00o("measurement.upload.minimum_delay", 500L, 500L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzk());
            }
        });
        zzw = OooO00o("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzj());
            }
        });
        zzx = OooO00o("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzp());
            }
        });
        zzy = OooO00o("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzn());
            }
        });
        zzz = OooO00o("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzt());
            }
        });
        zzA = OooO00o("measurement.upload.retry_time", 1800000L, 1800000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzG());
            }
        });
        zzB = OooO00o("measurement.upload.retry_count", 6, 6, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzF());
            }
        });
        zzC = OooO00o("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzC());
            }
        });
        zzD = OooO00o("measurement.lifetimevalue.max_currency_tracked", 4, 4, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzf());
            }
        });
        zzE = OooO00o("measurement.audience.filter_result_max_count", 200, 200, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzi());
            }
        });
        zzF = OooO00o("measurement.upload.max_public_user_properties", 25, 25, null);
        zzG = OooO00o("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzH = OooO00o("measurement.upload.max_public_event_params", 25, 25, null);
        zzI = OooO00o("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = OooO00o("measurement.test.boolean_flag", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzoq.zzg());
            }
        });
        zzK = OooO00o("measurement.test.string_flag", "---", "---", new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return zzoq.zzf();
            }
        });
        zzL = OooO00o("measurement.test.long_flag", -1L, -1L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zzoq.zzd());
            }
        });
        zzM = OooO00o("measurement.test.int_flag", -2, -2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zzoq.zzc());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        zzN = OooO00o("measurement.test.double_flag", dValueOf, dValueOf, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Double.valueOf(zzoq.zzb());
            }
        });
        zzO = OooO00o("measurement.experiment.max_ids", 50, 50, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzh());
            }
        });
        zzP = OooO00o("measurement.max_bundles_per_iteration", 100, 100, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznm.zzc());
            }
        });
        zzQ = OooO00o("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzq());
            }
        });
        zzR = OooO00o("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Long.valueOf(zznm.zzr());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzS = OooO00o("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzot.zzc());
            }
        });
        zzT = OooO00o("measurement.quality.checksum", bool, bool, null);
        zzU = OooO00o("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzny.zze());
            }
        });
        zzV = OooO00o("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzny.zzd());
            }
        });
        zzW = OooO00o("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzny.zzf());
            }
        });
        zzX = OooO00o("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzpi.zzc());
            }
        });
        zzY = OooO00o("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzok.zzc());
            }
        });
        zzZ = OooO00o("measurement.lifecycle.app_in_background_parameter", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzon.zzc());
            }
        });
        zzaa = OooO00o("measurement.integration.disable_firebase_instance_id", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzpf.zzd());
            }
        });
        zzab = OooO00o("measurement.collection.service.update_with_analytics_fix", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzpl.zzc());
            }
        });
        zzac = OooO00o("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zznv.zzd());
            }
        });
        zzad = OooO00o("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzoe.zzd());
            }
        });
        zzae = OooO00o("measurement.collection.synthetic_data_mitigation", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzpc.zzc());
            }
        });
        zzaf = OooO00o("measurement.service.storage_consent_support_version", 203600, 203600, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Integer.valueOf((int) zznp.zzb());
            }
        });
        zzag = OooO00o("measurement.client.click_identifier_control.dev", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzng.zzc());
            }
        });
        zzah = OooO00o("measurement.service.click_identifier_control", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zznj.zzc());
            }
        });
        zzai = OooO00o("measurement.service.store_null_safelist", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzns.zzd());
            }
        });
        zzaj = OooO00o("measurement.service.store_safelist", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzns.zze());
            }
        });
        zzak = OooO00o("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzl());
            }
        });
        zzal = OooO00o("measurement.redaction.config_redacted_fields", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzf());
            }
        });
        zzam = OooO00o("measurement.redaction.upload_redacted_fields", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzo());
            }
        });
        zzan = OooO00o("measurement.redaction.upload_subdomain_override", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzp());
            }
        });
        zzao = OooO00o("measurement.redaction.device_info", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzg());
            }
        });
        zzap = OooO00o("measurement.redaction.user_id", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzq());
            }
        });
        zzaq = OooO00o("measurement.redaction.google_signals", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzk());
            }
        });
        zzar = OooO00o("measurement.collection.enable_session_stitching_token.service", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzoz.zze());
            }
        });
        zzas = OooO00o("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzoz.zzd());
            }
        });
        zzat = OooO00o("measurement.redaction.app_instance_id", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzd());
            }
        });
        zzau = OooO00o("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzj());
            }
        });
        zzav = OooO00o("measurement.redaction.enhanced_uid", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzi());
            }
        });
        zzaw = OooO00o("measurement.redaction.e_tag", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzh());
            }
        });
        zzax = OooO00o("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zze());
            }
        });
        zzay = OooO00o("measurement.redaction.retain_major_os_version", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzm());
            }
        });
        zzaz = OooO00o("measurement.redaction.scion_payload_generator", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzow.zzn());
            }
        });
        zzaA = OooO00o("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzob.zzd());
            }
        });
        zzaB = OooO00o("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new o000oOoO() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // o0OO0OoO.o000oOoO
            public final Object zza() {
                zzea zzeaVar = zzeb.zza;
                return Boolean.valueOf(zzoh.zzd());
            }
        });
    }

    @VisibleForTesting
    public static zzea OooO00o(String str, Object obj, Object obj2, o000oOoO o000oooo2) {
        zzea zzeaVar = new zzea(str, obj, obj2, o000oooo2);
        f16106OooO00o.add(zzeaVar);
        return zzeaVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzhe zzheVarZza = com.google.android.gms.internal.measurement.zzhe.zza(context.getContentResolver(), zzhp.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // java.lang.Runnable
            public final void run() {
                zzia.zzd();
            }
        });
        return zzheVarZza == null ? Collections.emptyMap() : zzheVarZza.zzc();
    }
}
