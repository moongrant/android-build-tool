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
import p313o0O0oOo.o000000;
import p313o0O0oOo.o000000O;
import p671oo0oOOo.OooOO0;
import p671oo0oOOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<OooOOO0> f20527OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HttpURLConnection f20528OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConfigFetchHandler f20529OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f20530OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ScheduledExecutorService f20531OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f20532OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Random f20533OooO0oO = new Random();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC0257OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f20534OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f20536OooO0o0;

        public RunnableC0257OooO00o(int i, long j) {
            this.f20534OooO0Oo = i;
            this.f20536OooO0o0 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final OooO00o oooO00o = OooO00o.this;
            int i = this.f20534OooO0Oo;
            final long j = this.f20536OooO0o0;
            synchronized (oooO00o) {
                final int i2 = i - 1;
                final Task<ConfigFetchHandler.FetchResponse> taskOooO0OO = oooO00o.f20529OooO0OO.OooO0OO(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
                final Task<o000000O> taskOooO0O0 = oooO00o.f20530OooO0Oo.OooO0O0();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0OO, taskOooO0O0}).continueWithTask(oooO00o.f20531OooO0o, new Continuation() { // from class: o0O0oOo.o0OO00O
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
                        o000000O o000000o2 = (o000000O) task3.getResult();
                        o000000O o000000o3 = fetchResponse.f20517OooO0O0;
                        if (o000000o3 != null) {
                            boolValueOf = Boolean.valueOf(o000000o3.f42551OooO0o >= j2);
                        } else {
                            boolValueOf = Boolean.valueOf(fetchResponse.f20516OooO00o == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                            oooO00o2.OooO00o(i3, j2);
                            return Tasks.forResult(null);
                        }
                        if (fetchResponse.f20517OooO0O0 == null) {
                            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                            return Tasks.forResult(null);
                        }
                        if (o000000o2 == null) {
                            Date date = o000000O.f42546OooO0oO;
                            o000000o2 = new o000000O(new JSONObject(), o000000O.f42546OooO0oO, new JSONArray(), new JSONObject(), 0L);
                        }
                        o000000O o000000o4 = fetchResponse.f20517OooO0O0;
                        o000000O o000000oOooO00o = o000000O.OooO00o(new JSONObject(o000000o4.f42547OooO00o.toString()));
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject2 = o000000o2.f42548OooO0O0;
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (true) {
                            boolean zHasNext = itKeys.hasNext();
                            jSONObject = o000000oOooO00o.f42548OooO0O0;
                            if (!zHasNext) {
                                break;
                            }
                            String next = itKeys.next();
                            JSONObject jSONObject3 = o000000o4.f42548OooO0O0;
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                JSONObject jSONObject4 = o000000o2.f42552OooO0o0;
                                boolean zHas = jSONObject4.has(next);
                                JSONObject jSONObject5 = o000000o4.f42552OooO0o0;
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
                        new OooOO0(hashSet);
                        synchronized (oooO00o2) {
                            Iterator<OooOOO0> it = oooO00o2.f20527OooO00o.iterator();
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

    public OooO00o(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, o000000 o000000Var, Set set, OooO0OO.OooO0O0 oooO0O0, ScheduledExecutorService scheduledExecutorService) {
        this.f20528OooO0O0 = httpURLConnection;
        this.f20529OooO0OO = configFetchHandler;
        this.f20530OooO0Oo = o000000Var;
        this.f20527OooO00o = set;
        this.f20532OooO0o0 = oooO0O0;
        this.f20531OooO0o = scheduledExecutorService;
    }

    public final void OooO00o(int i, long j) {
        if (i == 0) {
            OooO0Oo(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f20531OooO0o.schedule(new RunnableC0257OooO00o(i, j), this.f20533OooO0oO.nextInt(4), TimeUnit.SECONDS);
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
                            this.f20532OooO0o0.OooO00o(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f20527OooO00o.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.f20529OooO0OO.f20515OooO0oo.f20539OooO00o.getLong("last_template_version", 0L);
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
        HttpURLConnection httpURLConnection = this.f20528OooO0O0;
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
        Iterator<OooOOO0> it = this.f20527OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(firebaseRemoteConfigException);
        }
    }
}
