package p037OoooOo0;

import androidx.camera.core.processing.SurfaceProcessorNode;
import com.facebook.internal.FileLruCache;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oOO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1617OooO0o0;

    public /* synthetic */ oOO00O(Object obj, int i) {
        this.f1616OooO0Oo = i;
        this.f1617OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1616OooO0Oo;
        Object obj = this.f1617OooO0o0;
        switch (i) {
            case 0:
                SurfaceProcessorNode.Out out = ((SurfaceProcessorNode) obj).f3840OooO0OO;
                if (out != null) {
                    for (o00O0000 o00o0001 : out.values()) {
                        o00o0001.getClass();
                        o0Oo0oo.OooO00o();
                        o00o0001.f1603OooOOO0.OooO00o();
                        o00O000 o00o001 = o00o0001.f1599OooOO0;
                        if (o00o001 != null) {
                            o00o001.OooO00o();
                            o00o0001.f1599OooOO0 = null;
                        }
                        o00o0001.f1604OooOOOO = true;
                    }
                }
                break;
            case 1:
                FileLruCache.m4129clearCache$lambda1((File[]) obj);
                break;
            default:
                ((CountDownLatch) obj).countDown();
                break;
        }
    }
}
