package androidx.appcompat.app;

import android.util.Range;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2414OooO0o0;

    public /* synthetic */ o000000(int i, Object obj, Object obj2) {
        this.f2412OooO0Oo = i;
        this.f2414OooO0o0 = obj;
        this.f2413OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2412OooO0Oo;
        Object obj = this.f2413OooO0o;
        Object obj2 = this.f2414OooO0o0;
        switch (i) {
            case 0:
                o000000O.OooO00o oooO00o = (o000000O.OooO00o) obj2;
                Runnable runnable = (Runnable) obj;
                oooO00o.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    oooO00o.OooO0O0();
                }
            default:
                Range<Integer> range = SurfaceRequest.f3502OooOOOO;
                ((o000OO.OooO00o) obj2).accept(new androidx.camera.core.OooO(4, (Surface) obj));
                return;
        }
    }
}
