package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Continuation, p562o0oOo0O.o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f20386OooO0Oo;

    public /* synthetic */ o0ooOOo(Object obj) {
        this.f20386OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MainMomentsTopicFollowingFragment.initView$lambda$1((MainMomentsTopicFollowingFragment) this.f20386OooO0Oo);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        ((o0OOO0o) this.f20386OooO0Oo).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
