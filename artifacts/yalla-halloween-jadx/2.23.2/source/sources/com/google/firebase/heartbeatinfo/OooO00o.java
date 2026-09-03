package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.OooO00o;
import com.yalla.yalla.data.constant.FeedbackType;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p063o0000oO.o000000;
import p300o0O0o00o.OooOOOO;
import p300o0O0o00o.OooOo;
import p300o0O0o00o.o00Ooo;
import p301o0O0o0O.OooO0o;
import p315o0O0oOo.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooOo, HeartBeatInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o<o00Ooo> f19701OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f19702OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o<o0000O> f19703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<OooOOOO> f19704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f19705OooO0o0;

    @VisibleForTesting
    public OooO00o() {
        throw null;
    }

    public OooO00o(final Context context, final String str, Set<OooOOOO> set, OooO0o<o0000O> oooO0o, Executor executor) {
        this.f19701OooO00o = new OooO0o() { // from class: o0O0o00o.OooOOO
            @Override // p301o0O0o0O.OooO0o
            public final Object get() {
                return new o00Ooo(context, str);
            }
        };
        this.f19704OooO0Oo = set;
        this.f19705OooO0o0 = executor;
        this.f19703OooO0OO = oooO0o;
        this.f19702OooO0O0 = context;
    }

    @Override // p300o0O0o00o.OooOo
    public final Task<String> OooO00o() {
        if (!o000000.OooO00o(this.f19702OooO0O0)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f19705OooO0o0, new Callable() { // from class: o0O0o00o.OooOO0O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                OooO00o oooO00o = this.f41735OooO00o;
                synchronized (oooO00o) {
                    o00Ooo o00ooo2 = oooO00o.f19701OooO00o.get();
                    ArrayList arrayListOooO0OO = o00ooo2.OooO0OO();
                    o00ooo2.OooO0O0();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                        oo000o oo000oVar = (oo000o) arrayListOooO0OO.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", oo000oVar.OooO0O0());
                        jSONObject.put("dates", new JSONArray((Collection) oo000oVar.OooO00o()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, FeedbackType.Suggestions);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                return string;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public final synchronized HeartBeatInfo.HeartBeat OooO0O0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00Ooo o00ooo2 = this.f19701OooO00o.get();
        if (!o00ooo2.OooO(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        o00ooo2.OooO0oO();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final void OooO0OO() {
        if (this.f19704OooO0Oo.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o000000.OooO00o(this.f19702OooO0O0)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f19705OooO0o0, new Callable() { // from class: o0O0o00o.OooOO0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OooO00o oooO00o = this.f41734OooO00o;
                    synchronized (oooO00o) {
                        oooO00o.f19701OooO00o.get().OooOO0O(System.currentTimeMillis(), oooO00o.f19703OooO0OO.get().OooO00o());
                    }
                    return null;
                }
            });
        }
    }
}
