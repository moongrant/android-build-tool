package o000O0;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements o000OoO.o00000O0.OooO00o, Continuation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33896OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33897OooO0o0;

    public /* synthetic */ OooO(Object obj, Object obj2) {
        this.f33896OooO0Oo = obj;
        this.f33897OooO0o0 = obj2;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooOO0();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f33896OooO0Oo;
        Map map = (Map) this.f33897OooO0o0;
        int[] iArr = ConfigFetchHandler.f20033OooOO0O;
        return configFetchHandler.OooO0O0(0L, task, map);
    }
}
