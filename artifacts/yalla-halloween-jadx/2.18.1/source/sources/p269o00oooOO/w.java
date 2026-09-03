package p269o00oooOO;

import androidx.lifecycle.LiveData;
import com.google.android.exoplayer2.drm.OooO00o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34949Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34950Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f34951Oooo0oo;

    public /* synthetic */ w(Object obj, Object obj2, int i) {
        this.f34949Oooo0o = i;
        this.f34950Oooo0oO = obj;
        this.f34951Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34949Oooo0o) {
            case 0:
                LiveData initLiveData = (LiveData) this.f34950Oooo0oO;
                x.OooO00o observer = (x.OooO00o) this.f34951Oooo0oo;
                Intrinsics.checkNotNullParameter(initLiveData, "$initLiveData");
                Intrinsics.checkNotNullParameter(observer, "$observer");
                initLiveData.observeForever(observer);
                break;
            default:
                OooO00o.C0097OooO00o c0097OooO00o = (OooO00o.C0097OooO00o) this.f34950Oooo0oO;
                ((OooO00o) this.f34951Oooo0oo).OooOoO(c0097OooO00o.f13720OooO00o, c0097OooO00o.f13721OooO0O0);
                break;
        }
    }
}
