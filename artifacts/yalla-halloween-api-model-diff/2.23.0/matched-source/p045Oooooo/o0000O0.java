package p045Oooooo;

import androidx.camera.core.impl.o00O00o0;
import com.facebook.GraphRequestBatch;
import com.facebook.ProgressOutputStream;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1884OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1885OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1886OooO0o0;

    public /* synthetic */ o0000O0(int i, Object obj, Object obj2) {
        this.f1884OooO0Oo = i;
        this.f1886OooO0o0 = obj;
        this.f1885OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1884OooO0Oo;
        Object obj = this.f1885OooO0o;
        Object obj2 = this.f1886OooO0o0;
        switch (i) {
            case 0:
                o00O00o0.OooO00o oooO00o = (o00O00o0.OooO00o) obj;
                LinkedHashMap linkedHashMap = ((o0000Ooo.OooO0OO) obj2).f1940OooO00o;
                oooO00o.getClass();
                linkedHashMap.remove(oooO00o);
                break;
            default:
                ProgressOutputStream.m4050reportBatchProgress$lambda0((GraphRequestBatch.Callback) obj2, (ProgressOutputStream) obj);
                break;
        }
    }
}
