package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.OooO00o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import o000O00O.Oooo000;
import org.json.JSONArray;
import org.json.JSONObject;
import p372o0OOo0o.o0O0O00;
import p372o0OOo0o.o0OO00O;
import p372o0OOo0o.oo0o0Oo;
import p375o0OOo0oo.o0OOO0o;
import p382o0OOoOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements oo0o0Oo, HeartBeatInfo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f19113OooO0o = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o<o0O0O00> f19114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f19115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o<o00000> f19116OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<o0OO00O> f19117OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f19118OooO0o0;

    public OooO00o(final Context context, final String str, Set<o0OO00O> set, o0OOO0o<o00000> o0ooo0o2) {
        o0OOO0o<o0O0O00> o0ooo0o3 = new o0OOO0o() { // from class: o0OOo0o.o0Oo0oo
            @Override // p375o0OOo0oo.o0OOO0o
            public final Object get() {
                return new o0O0O00(context, str);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: o0OOo0o.o0ooOOo
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i = OooO00o.f19113OooO0o;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f19114OooO00o = o0ooo0o3;
        this.f19117OooO0Oo = set;
        this.f19118OooO0o0 = threadPoolExecutor;
        this.f19116OooO0OO = o0ooo0o2;
        this.f19115OooO0O0 = context;
    }

    @Override // p372o0OOo0o.oo0o0Oo
    public final Task<String> OooO00o() {
        return Oooo000.OooO00o(this.f19115OooO0O0) ^ true ? Tasks.forResult("") : Tasks.call(this.f19118OooO0o0, new Callable() { // from class: o0OOo0o.o00oO0o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                OooO00o oooO00o = this.f38682OooO00o;
                synchronized (oooO00o) {
                    o0O0O00 o0o0o00 = oooO00o.f19114OooO00o.get();
                    List<o000OOo> listOooO0OO = o0o0o00.OooO0OO();
                    o0o0o00.OooO0O0();
                    JSONArray jSONArray = new JSONArray();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listOooO0OO;
                        if (i < arrayList.size()) {
                            o000OOo o000ooo2 = (o000OOo) arrayList.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", o000ooo2.OooO0O0());
                            jSONObject.put("dates", new JSONArray((Collection) o000ooo2.OooO00o()));
                            jSONArray.put(jSONObject);
                            i++;
                        } else {
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
                    }
                }
                return string;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public final synchronized HeartBeatInfo.HeartBeat OooO0O0() {
        boolean zOooO0oO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0O0O00 o0o0o00 = this.f19114OooO00o.get();
        synchronized (o0o0o00) {
            zOooO0oO = o0o0o00.OooO0oO(jCurrentTimeMillis);
        }
        if (!zOooO0oO) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (o0o0o00) {
            String strOooO0Oo = o0o0o00.OooO0Oo(System.currentTimeMillis());
            o0o0o00.f38683OooO00o.edit().putString("last-used-date", strOooO0Oo).commit();
            o0o0o00.OooO0o(strOooO0Oo);
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final Task<Void> OooO0OO() {
        if (this.f19117OooO0Oo.size() <= 0) {
            return Tasks.forResult(null);
        }
        return Oooo000.OooO00o(this.f19115OooO0O0) ^ true ? Tasks.forResult(null) : Tasks.call(this.f19118OooO0o0, new Callable() { // from class: o0OOo0o.oo000o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                OooO00o oooO00o = this.f38688OooO00o;
                synchronized (oooO00o) {
                    oooO00o.f19114OooO00o.get().OooO0oo(System.currentTimeMillis(), oooO00o.f19116OooO0OO.get().OooO00o());
                }
                return null;
            }
        });
    }
}
