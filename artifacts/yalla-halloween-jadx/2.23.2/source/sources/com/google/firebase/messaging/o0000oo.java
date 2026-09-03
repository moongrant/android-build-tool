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
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("TopicsStore.class")
    public static WeakReference<o0000oo> f19870OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f19871OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00000OO f19872OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f19873OooO0OO;

    public o0000oo(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f19873OooO0OO = scheduledExecutorService;
        this.f19871OooO00o = sharedPreferences;
    }

    @Nullable
    public final synchronized o0000O00 OooO00o() {
        o0000O00 o0000o00;
        String strOooO0O0 = this.f19872OooO0O0.OooO0O0();
        Pattern pattern = o0000O00.f19848OooO0Oo;
        if (!TextUtils.isEmpty(strOooO0O0)) {
            String[] strArrSplit = strOooO0O0.split("!", -1);
            if (strArrSplit.length == 2) {
                o0000o00 = new o0000O00(strArrSplit[0], strArrSplit[1]);
            }
        }
        o0000o00 = null;
        return o0000o00;
    }

    @WorkerThread
    public final synchronized void OooO0O0() {
        this.f19872OooO0O0 = o00000OO.OooO00o(this.f19871OooO00o, this.f19873OooO0OO);
    }

    public final synchronized void OooO0OO(o0000O00 o0000o00) {
        this.f19872OooO0O0.OooO0OO(o0000o00.f19851OooO0OO);
    }
}
