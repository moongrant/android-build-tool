package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f19837OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f19841OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("internalQueue")
    @VisibleForTesting
    public final ArrayDeque<String> f19840OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19838OooO0O0 = "topic_operation_queue";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19839OooO0OO = ",";

    public o00000OO(SharedPreferences sharedPreferences, Executor executor) {
        this.f19837OooO00o = sharedPreferences;
        this.f19841OooO0o0 = executor;
    }

    @WorkerThread
    public static o00000OO OooO00o(SharedPreferences sharedPreferences, Executor executor) {
        o00000OO o00000oo2 = new o00000OO(sharedPreferences, executor);
        synchronized (o00000oo2.f19840OooO0Oo) {
            o00000oo2.f19840OooO0Oo.clear();
            String string = o00000oo2.f19837OooO00o.getString(o00000oo2.f19838OooO0O0, "");
            if (!TextUtils.isEmpty(string) && string.contains(o00000oo2.f19839OooO0OO)) {
                String[] strArrSplit = string.split(o00000oo2.f19839OooO0OO, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        o00000oo2.f19840OooO0Oo.add(str);
                    }
                }
            }
        }
        return o00000oo2;
    }

    @Nullable
    public final String OooO0O0() {
        String strPeek;
        synchronized (this.f19840OooO0Oo) {
            strPeek = this.f19840OooO0Oo.peek();
        }
        return strPeek;
    }

    public final boolean OooO0OO(@Nullable String str) {
        boolean zRemove;
        synchronized (this.f19840OooO0Oo) {
            zRemove = this.f19840OooO0Oo.remove(str);
            if (zRemove) {
                this.f19841OooO0o0.execute(new com.facebook.appevents.OooO0OO(this, 1));
            }
        }
        return zRemove;
    }
}
