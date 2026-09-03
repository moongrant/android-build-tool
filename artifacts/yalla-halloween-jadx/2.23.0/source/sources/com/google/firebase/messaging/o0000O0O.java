package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("TopicsStore.class")
    public static WeakReference<o0000O0O> f20323OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f20324OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000 f20325OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f20326OooO0OO;

    public o0000O0O(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f20326OooO0OO = scheduledExecutorService;
        this.f20324OooO00o = sharedPreferences;
    }

    @Nullable
    public final synchronized o0000O0 OooO00o() {
        o0000O0 o0000o1;
        String strOooO0O0 = this.f20325OooO0O0.OooO0O0();
        Pattern pattern = o0000O0.f20314OooO0Oo;
        if (!TextUtils.isEmpty(strOooO0O0)) {
            String[] strArrSplit = strOooO0O0.split("!", -1);
            if (strArrSplit.length == 2) {
                o0000o1 = new o0000O0(strArrSplit[0], strArrSplit[1]);
            }
        }
        o0000o1 = null;
        return o0000o1;
    }

    @WorkerThread
    public final synchronized void OooO0O0() {
        this.f20325OooO0O0 = o0000.OooO00o(this.f20324OooO00o, this.f20326OooO0OO);
    }

    public final synchronized void OooO0OO(o0000O0 o0000o1) {
        this.f20325OooO0O0.OooO0OO(o0000o1.f20317OooO0OO);
    }
}
