package p270o00oooOO;

import androidx.lifecycle.LiveData;
import com.google.android.exoplayer2.drm.OooO00o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34981Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f34982OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34983OoooO00;

    public /* synthetic */ z(Object obj, Object obj2, int i) {
        this.f34981Oooo = i;
        this.f34983OoooO00 = obj;
        this.f34982OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34981Oooo) {
            case 0:
                LiveData initLiveData = (LiveData) this.f34983OoooO00;
                a0.OooO00o observer = (a0.OooO00o) this.f34982OoooO0;
                Intrinsics.checkNotNullParameter(initLiveData, "$initLiveData");
                Intrinsics.checkNotNullParameter(observer, "$observer");
                initLiveData.observeForever(observer);
                break;
            default:
                OooO00o.C0097OooO00o c0097OooO00o = (OooO00o.C0097OooO00o) this.f34983OoooO00;
                ((OooO00o) this.f34982OoooO0).OooOoO(c0097OooO00o.f13738OooO00o, c0097OooO00o.f13739OooO0O0);
                break;
        }
    }
}
