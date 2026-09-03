package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f20286OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f20290OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("internalQueue")
    @VisibleForTesting
    public final ArrayDeque<String> f20289OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20287OooO0O0 = "topic_operation_queue";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f20288OooO0OO = ",";

    public o0000(SharedPreferences sharedPreferences, Executor executor) {
        this.f20286OooO00o = sharedPreferences;
        this.f20290OooO0o0 = executor;
    }

    @WorkerThread
    public static o0000 OooO00o(SharedPreferences sharedPreferences, Executor executor) {
        o0000 o0000Var = new o0000(sharedPreferences, executor);
        synchronized (o0000Var.f20289OooO0Oo) {
            o0000Var.f20289OooO0Oo.clear();
            String string = o0000Var.f20286OooO00o.getString(o0000Var.f20287OooO0O0, "");
            if (!TextUtils.isEmpty(string) && string.contains(o0000Var.f20288OooO0OO)) {
                String[] strArrSplit = string.split(o0000Var.f20288OooO0OO, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        o0000Var.f20289OooO0Oo.add(str);
                    }
                }
            }
        }
        return o0000Var;
    }

    @Nullable
    public final String OooO0O0() {
        String strPeek;
        synchronized (this.f20289OooO0Oo) {
            strPeek = this.f20289OooO0Oo.peek();
        }
        return strPeek;
    }

    public final boolean OooO0OO(@Nullable String str) {
        boolean zRemove;
        synchronized (this.f20289OooO0Oo) {
            zRemove = this.f20289OooO0Oo.remove(str);
            if (zRemove) {
                this.f20290OooO0o0.execute(new Runnable() { // from class: com.google.firebase.messaging.o0000Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000 o0000Var = this.f20337OooO0Oo;
                        synchronized (o0000Var.f20289OooO0Oo) {
                            SharedPreferences.Editor editorEdit = o0000Var.f20286OooO00o.edit();
                            String str2 = o0000Var.f20287OooO0O0;
                            StringBuilder sb = new StringBuilder();
                            Iterator<String> it = o0000Var.f20289OooO0Oo.iterator();
                            while (it.hasNext()) {
                                sb.append(it.next());
                                sb.append(o0000Var.f20288OooO0OO);
                            }
                            editorEdit.putString(str2, sb.toString()).commit();
                        }
                    }
                });
            }
        }
        return zRemove;
    }
}
