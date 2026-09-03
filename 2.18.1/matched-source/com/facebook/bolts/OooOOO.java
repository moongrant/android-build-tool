package com.facebook.bolts;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import p374o0OOo0oO.o00oO0o;
import p381o0OOoOOO.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12791Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12792Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12793Oooo0oo;

    public /* synthetic */ OooOOO(Object obj, Object obj2, int i) {
        this.f12791Oooo0o = i;
        this.f12792Oooo0oO = obj;
        this.f12793Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12791Oooo0o) {
            case 0:
                Task.Companion.m172delay$lambda1((ScheduledFuture) this.f12792Oooo0oO, (TaskCompletionSource) this.f12793Oooo0oo);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12792Oooo0oO;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.f12793Oooo0oo;
                com.google.firebase.messaging.OooO00o oooO00o = FirebaseMessaging.f19170OooOOO;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    o00oO0o o00oo0o2 = firebaseMessaging.f19176OooO0O0;
                    oo0oOO0.OooO0O0(firebaseMessaging.f19175OooO00o);
                    o00oo0o2.OooO00o();
                    taskCompletionSource.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
        }
    }
}
