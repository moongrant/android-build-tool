package p313o0O0oOo;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import java.net.HttpURLConnection;
import o0O0o0.OooOOO;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements SuccessContinuation, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f42573OooO0Oo;

    public /* synthetic */ o0000oo(Object obj) {
        this.f42573OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        ExploreCountryRoomListFragment.initView$lambda$0((ExploreCountryRoomListFragment) this.f42573OooO0Oo);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        ((HttpURLConnection) this.f42573OooO0Oo).setRequestProperty("X-Goog-Firebase-Installations-Auth", ((OooOOO) obj).OooO00o());
        return Tasks.forResult(null);
    }
}
