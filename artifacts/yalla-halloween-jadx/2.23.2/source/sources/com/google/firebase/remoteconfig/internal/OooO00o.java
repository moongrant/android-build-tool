package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.OooOOOO;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO00o;
import com.qiniu.android.common.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p317o0O0oOoO.o000O0O0;
import p317o0O0oOoO.o000OO00;
import p318o0O0oOoo.o00O0;
import p318o0O0oOoo.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<o000OO00> f20054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HttpURLConnection f20055OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConfigFetchHandler f20056OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o f20057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ScheduledExecutorService f20058OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO00 f20059OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Random f20060OooO0oO = new Random();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC0256OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f20061OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f20063OooO0o0;

        public RunnableC0256OooO00o(int i, long j) {
            this.f20061OooO0Oo = i;
            this.f20063OooO0o0 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final OooO00o oooO00o = OooO00o.this;
            int i = this.f20061OooO0Oo;
            final long j = this.f20063OooO0o0;
            synchronized (oooO00o) {
                final int i2 = i - 1;
                final Task<ConfigFetchHandler.FetchResponse> taskOooO0OO = oooO00o.f20056OooO0OO.OooO0OO(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
                final Task<o00O0> taskOooO0O0 = oooO00o.f20057OooO0Oo.OooO0O0();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0OO, taskOooO0O0}).continueWithTask(oooO00o.f20058OooO0o, new Continuation() { // from class: o0O0oOoo.oOO00O
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) throws JSONException {
                        Boolean boolValueOf;
                        JSONObject jSONObject;
                        OooO00o oooO00o2 = oooO00o;
                        Task task2 = taskOooO0OO;
                        Task task3 = taskOooO0O0;
                        long j2 = j;
                        int i3 = i2;
                        oooO00o2.getClass();
                        if (!task2.isSuccessful()) {
                            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
                        }
                        if (!task3.isSuccessful()) {
                            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
                        }
                        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task2.getResult();
                        o00O0 o00o1 = (o00O0) task3.getResult();
                        o00O0 o00o2 = fetchResponse.f20044OooO0O0;
                        if (o00o2 != null) {
                            boolValueOf = Boolean.valueOf(o00o2.f41976OooO0o >= j2);
                        } else {
                            boolValueOf = Boolean.valueOf(fetchResponse.f20043OooO00o == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                            oooO00o2.OooO00o(i3, j2);
                            return Tasks.forResult(null);
                        }
                        if (fetchResponse.f20044OooO0O0 == null) {
                            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                            return Tasks.forResult(null);
                        }
                        if (o00o1 == null) {
                            Date date = o00O0.f41971OooO0oO;
                            o00o1 = new o00O0(new JSONObject(), o00O0.f41971OooO0oO, new JSONArray(), new JSONObject(), 0L);
                        }
                        o00O0 o00o3 = fetchResponse.f20044OooO0O0;
                        o00O0 o00o0OooO00o = o00O0.OooO00o(new JSONObject(o00o3.f41972OooO00o.toString()));
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject2 = o00o1.f41973OooO0O0;
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (true) {
                            boolean zHasNext = itKeys.hasNext();
                            jSONObject = o00o0OooO00o.f41973OooO0O0;
                            if (!zHasNext) {
                                break;
                            }
                            String next = itKeys.next();
                            JSONObject jSONObject3 = o00o3.f41973OooO0O0;
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                JSONObject jSONObject4 = o00o1.f41977OooO0o0;
                                boolean zHas = jSONObject4.has(next);
                                JSONObject jSONObject5 = o00o3.f41977OooO0o0;
                                if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject.remove(next);
                                }
                            } else {
                                hashSet.add(next);
                            }
                        }
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (itKeys2.hasNext()) {
                            hashSet.add(itKeys2.next());
                        }
                        if (hashSet.isEmpty()) {
                            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                            return Tasks.forResult(null);
                        }
                        new o000O0O0(hashSet);
                        synchronized (oooO00o2) {
                            Iterator<o000OO00> it = oooO00o2.f20054OooO00o.iterator();
                            while (it.hasNext()) {
                                it.next().onUpdate();
                            }
                        }
                        return Tasks.forResult(null);
                    }
                });
            }
        }
    }

    public OooO00o(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, oo00o oo00oVar, Set set, OooO0OO.OooO0O0 oooO0O0, ScheduledExecutorService scheduledExecutorService) {
        this.f20055OooO0O0 = httpURLConnection;
        this.f20056OooO0OO = configFetchHandler;
        this.f20057OooO0Oo = oo00oVar;
        this.f20054OooO00o = set;
        this.f20059OooO0o0 = oooO0O0;
        this.f20058OooO0o = scheduledExecutorService;
    }

    public final void OooO00o(int i, long j) {
        if (i == 0) {
            OooO0Oo(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f20058OooO0o.schedule(new RunnableC0256OooO00o(i, j), this.f20060OooO0oO.nextInt(4), TimeUnit.SECONDS);
    }

    public final void OooO0O0(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.UTF_8));
        String strOooO00o = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strOooO00o = OooOOOO.OooO00o(strOooO00o, line);
            if (line.contains("}")) {
                int iIndexOf = strOooO00o.indexOf(123);
                int iLastIndexOf = strOooO00o.lastIndexOf(125);
                strOooO00o = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strOooO00o.substring(iIndexOf, iLastIndexOf + 1);
                if (strOooO00o.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strOooO00o);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            this.f20059OooO0o0.OooO00o(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f20054OooO00o.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.f20056OooO0OO.f20042OooO0oo.f20066OooO00o.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                OooO00o(3, j2);
                            }
                        }
                        strOooO00o = "";
                    } catch (JSONException e) {
                        OooO0Oo(new FirebaseRemoteConfigClientException(e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    @VisibleForTesting
    public final void OooO0OO() {
        HttpURLConnection httpURLConnection = this.f20055OooO0O0;
        try {
            if (httpURLConnection == null) {
                return;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                OooO0O0(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final synchronized void OooO0Oo(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<o000OO00> it = this.f20054OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(firebaseRemoteConfigException);
        }
    }
}
