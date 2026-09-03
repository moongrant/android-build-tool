package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o000O0.OooO;
import org.conscrypt.PSKKeyManager;
import p301o0O0o0O.OooO0o;
import p302o0O0o0OO.o000;
import p302o0O0o0OO.o0000O0O;
import p318o0O0oOoo.o00O0;
import p318o0O0oOoo.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigFetchHandler {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final long f20032OooOO0 = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public static final int[] f20033OooOO0O = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<String, String> f20034OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0O f20035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o<o0O0OOO0.OooO00o> f20036OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f20037OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Clock f20038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo00o f20039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Random f20040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConfigFetchHttpClient f20041OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f20042OooO0oo;

    public static class FetchResponse {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f20043OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0 f20044OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f20045OooO0OO;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        public FetchResponse(int i, o00O0 o00o1, @Nullable String str) {
            this.f20043OooO00o = i;
            this.f20044OooO0O0 = o00o1;
            this.f20045OooO0OO = str;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public final String OooO00o() {
            return this.value;
        }
    }

    public ConfigFetchHandler(o0000O0O o0000o0o2, OooO0o oooO0o, ScheduledExecutorService scheduledExecutorService, Clock clock, Random random, oo00o oo00oVar, ConfigFetchHttpClient configFetchHttpClient, OooO0O0 oooO0O0, HashMap map) {
        this.f20035OooO00o = o0000o0o2;
        this.f20036OooO0O0 = oooO0o;
        this.f20037OooO0OO = scheduledExecutorService;
        this.f20038OooO0Oo = clock;
        this.f20040OooO0o0 = random;
        this.f20039OooO0o = oo00oVar;
        this.f20041OooO0oO = configFetchHttpClient;
        this.f20042OooO0oo = oooO0O0;
        this.f20034OooO = map;
    }

    @WorkerThread
    public final FetchResponse OooO00o(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionOooO0O0 = this.f20041OooO0oO.OooO0O0();
            ConfigFetchHttpClient configFetchHttpClient = this.f20041OooO0oO;
            HashMap mapOooO0Oo = OooO0Oo();
            String string = this.f20042OooO0oo.f20066OooO00o.getString("last_fetch_etag", null);
            o0O0OOO0.OooO00o oooO00o = this.f20036OooO0O0.get();
            FetchResponse fetchResponseFetch = configFetchHttpClient.fetch(httpURLConnectionOooO0O0, str, str2, mapOooO0Oo, string, map, oooO00o == null ? null : (Long) oooO00o.OooO0o0(true).get("_fot"), date);
            o00O0 o00o1 = fetchResponseFetch.f20044OooO0O0;
            if (o00o1 != null) {
                OooO0O0 oooO0O0 = this.f20042OooO0oo;
                long j = o00o1.f41976OooO0o;
                synchronized (oooO0O0.f20067OooO0O0) {
                    oooO0O0.f20066OooO00o.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = fetchResponseFetch.f20045OooO0OO;
            if (str4 != null) {
                this.f20042OooO0oo.OooO0Oo(str4);
            }
            this.f20042OooO0oo.OooO0OO(0, OooO0O0.f20064OooO0o);
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.f20031OooO0Oo;
            boolean z = i == 429 || i == 502 || i == 503 || i == 504;
            OooO0O0 oooO0O1 = this.f20042OooO0oo;
            if (z) {
                int i2 = oooO0O1.OooO00o().f20070OooO00o + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f20033OooOO0O;
                long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
                oooO0O1.OooO0OO(i2, new Date(date.getTime() + (millis / 2) + ((long) this.f20040OooO0o0.nextInt((int) millis))));
            }
            OooO0O0.OooO00o OooO00o2 = oooO0O1.OooO00o();
            int i3 = e.f20031OooO0Oo;
            if (OooO00o2.f20070OooO00o > 1 || i3 == 429) {
                OooO00o2.f20071OooO0O0.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException();
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case YallaTeamMessage.JumpId.RoomList_Recommended /* 502 */:
                        case YallaTeamMessage.JumpId.RoomList_Explore /* 503 */:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e, e.f20031OooO0Oo, "Fetch failed: ".concat(str3));
        }
    }

    public final Task OooO0O0(long j, Task task, final Map map) {
        Task taskContinueWithTask;
        final Date date = new Date(this.f20038OooO0Oo.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        OooO0O0 oooO0O0 = this.f20042OooO0oo;
        if (zIsSuccessful) {
            oooO0O0.getClass();
            Date date2 = new Date(oooO0O0.f20066OooO00o.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(OooO0O0.f20065OooO0o0) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return Tasks.forResult(new FetchResponse(2, null, null));
            }
        }
        Date date3 = oooO0O0.OooO00o().f20071OooO0O0;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f20037OooO0OO;
        if (date4 != null) {
            String str = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime())));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            o0000O0O o0000o0o2 = this.f20035OooO00o;
            final Task<String> id = o0000o0o2.getId();
            final Task token = o0000o0o2.getToken();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(executor, new Continuation() { // from class: o0O0oOoo.o00O0O0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task taskOnSuccessTask;
                    Date date5 = date;
                    Map<String, String> map2 = map;
                    ConfigFetchHandler configFetchHandler = this.f41983OooO0Oo;
                    configFetchHandler.getClass();
                    Task task3 = id;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = token;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        ConfigFetchHandler.FetchResponse fetchResponseOooO00o = configFetchHandler.OooO00o((String) task3.getResult(), ((o000) task4.getResult()).OooO00o(), date5, map2);
                        if (fetchResponseOooO00o.f20043OooO00o != 0) {
                            taskOnSuccessTask = Tasks.forResult(fetchResponseOooO00o);
                        } else {
                            oo00o oo00oVar = configFetchHandler.f20039OooO0o;
                            o00O0 o00o1 = fetchResponseOooO00o.f20044OooO0O0;
                            oo00oVar.getClass();
                            o00O00OO o00o00oo2 = new o00O00OO(oo00oVar, o00o1);
                            Executor executor2 = oo00oVar.f42009OooO00o;
                            taskOnSuccessTask = Tasks.call(executor2, o00o00oo2).onSuccessTask(executor2, new o00O00o0(oo00oVar, o00o1)).onSuccessTask(configFetchHandler.f20037OooO0OO, new o00O0OO0(fetchResponseOooO00o));
                        }
                        return taskOnSuccessTask;
                    } catch (FirebaseRemoteConfigException e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new Continuation() { // from class: o0O0oOoo.o00O0O0O
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                ConfigFetchHandler configFetchHandler = this.f41991OooO0Oo;
                Date date5 = date;
                configFetchHandler.getClass();
                if (task2.isSuccessful()) {
                    OooO0O0 oooO0O1 = configFetchHandler.f20042OooO0oo;
                    synchronized (oooO0O1.f20067OooO0O0) {
                        oooO0O1.f20066OooO00o.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date5.getTime()).apply();
                    }
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            configFetchHandler.f20042OooO0oo.OooO0oO();
                        } else {
                            configFetchHandler.f20042OooO0oo.OooO0o();
                        }
                    }
                }
                return task2;
            }
        });
    }

    public final Task<FetchResponse> OooO0OO(FetchType fetchType, int i) {
        HashMap map = new HashMap(this.f20034OooO);
        map.put("X-Firebase-RC-Fetch-Type", fetchType.OooO00o() + "/" + i);
        return this.f20039OooO0o.OooO0O0().continueWithTask(this.f20037OooO0OO, new OooO(this, map));
    }

    @WorkerThread
    public final HashMap OooO0Oo() {
        HashMap map = new HashMap();
        o0O0OOO0.OooO00o oooO00o = this.f20036OooO0O0.get();
        if (oooO00o == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : oooO00o.OooO0o0(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
