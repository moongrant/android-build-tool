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
import p063o0000oO.o00000O;
import p297o0O0o00.o0OO00O;
import p297o0O0o00.o0Oo0oo;
import p297o0O0o00.o0ooOOo;
import p298o0O0o00o.OooO0OO;
import p314o0O0oOo0.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements o0Oo0oo, HeartBeatInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO<o0OO00O> f20173OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f20174OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO<o000OO0O> f20175OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<o0ooOOo> f20176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f20177OooO0o0;

    @VisibleForTesting
    public OooO00o() {
        throw null;
    }

    public OooO00o(final Context context, final String str, Set<o0ooOOo> set, OooO0OO<o000OO0O> oooO0OO, Executor executor) {
        this.f20173OooO00o = new OooO0OO() { // from class: o0O0o00.o00oO0o
            @Override // p298o0O0o00o.OooO0OO
            public final Object get() {
                return new o0OO00O(context, str);
            }
        };
        this.f20176OooO0Oo = set;
        this.f20177OooO0o0 = executor;
        this.f20175OooO0OO = oooO0OO;
        this.f20174OooO0O0 = context;
    }

    @Override // p297o0O0o00.o0Oo0oo
    public final Task<String> OooO00o() {
        if (!o00000O.OooO00o(this.f20174OooO0O0)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f20177OooO0o0, new Callable() { // from class: o0O0o00.o00Ooo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                OooO00o oooO00o = this.f42393OooO00o;
                synchronized (oooO00o) {
                    o0OO00O o0oo00o2 = oooO00o.f20173OooO00o.get();
                    ArrayList arrayListOooO0OO = o0oo00o2.OooO0OO();
                    o0oo00o2.OooO0O0();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < arrayListOooO0OO.size(); i++) {
                        oo0o0Oo oo0o0oo = (oo0o0Oo) arrayListOooO0OO.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", oo0o0oo.OooO0O0());
                        jSONObject.put("dates", new JSONArray((Collection) oo0o0oo.OooO00o()));
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
        o0OO00O o0oo00o2 = this.f20173OooO00o.get();
        if (!o0oo00o2.OooO(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        o0oo00o2.OooO0oO();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final void OooO0OO() {
        if (this.f20176OooO0Oo.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o00000O.OooO00o(this.f20174OooO0O0)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f20177OooO0o0, new Callable() { // from class: o0O0o00.o00Oo0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    OooO00o oooO00o = this.f42392OooO00o;
                    synchronized (oooO00o) {
                        oooO00o.f20173OooO00o.get().OooOO0O(System.currentTimeMillis(), oooO00o.f20175OooO0OO.get().OooO00o());
                    }
                    return null;
                }
            });
        }
    }
}
