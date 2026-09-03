package p157o00OoOO0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements BaseQuickAdapter.OooO0o, Continuation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f38229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f38230OooO0o0;

    public /* synthetic */ o000oOoO(Object obj, Serializable serializable) {
        this.f38229OooO0Oo = obj;
        this.f38230OooO0o0 = serializable;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o00O0O this$0 = (o00O0O) this.f38229OooO0Oo;
        Function1 onItemClick = (Function1) this.f38230OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        if (this$0.f38236OooOO0o) {
            this$0.OooO0OO();
        }
        onItemClick.invoke(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f38229OooO0Oo;
        Date date = (Date) this.f38230OooO0o0;
        int[] iArr = ConfigFetchHandler.f20506OooOO0O;
        configFetchHandler.getClass();
        if (task.isSuccessful()) {
            OooO0O0 oooO0O0 = configFetchHandler.f20515OooO0oo;
            synchronized (oooO0O0.f20540OooO0O0) {
                oooO0O0.f20539OooO00o.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                    configFetchHandler.f20515OooO0oo.OooO0oO();
                } else {
                    configFetchHandler.f20515OooO0oo.OooO0o();
                }
            }
        }
        return task;
    }
}
