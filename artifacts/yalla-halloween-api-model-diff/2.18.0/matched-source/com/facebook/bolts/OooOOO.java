package com.facebook.bolts;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import p376o0OOo0oO.o00oO0o;
import p383o0OOoOOO.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12807Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12808OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12809OoooO00;

    public /* synthetic */ OooOOO(Object obj, Object obj2, int i) {
        this.f12807Oooo = i;
        this.f12809OoooO00 = obj;
        this.f12808OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12807Oooo) {
            case 0:
                Task.Companion.m172delay$lambda1((ScheduledFuture) this.f12809OoooO00, (TaskCompletionSource) this.f12808OoooO0);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12809OoooO00;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.f12808OoooO0;
                com.google.firebase.messaging.OooO00o oooO00o = FirebaseMessaging.f19189OooOOO;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    o00oO0o o00oo0o2 = firebaseMessaging.f19195OooO0O0;
                    oo0oOO0.OooO0O0(firebaseMessaging.f19194OooO00o);
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
