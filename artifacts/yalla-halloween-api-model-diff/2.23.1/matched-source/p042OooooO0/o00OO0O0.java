package p042OooooO0;

import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.OooO0o;
import com.google.android.gms.common.util.BiConsumer;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p319o0O0oOoo.o00O0;
import p319o0O0oOoo.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1791OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1792OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1793OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f1794OooO0oO;

    public /* synthetic */ o00OO0O0(int i, Object obj, Object obj2, Object obj3) {
        this.f1791OooO0Oo = i;
        this.f1793OooO0o0 = obj;
        this.f1792OooO0o = obj2;
        this.f1794OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1791OooO0Oo;
        Object obj = this.f1794OooO0oO;
        Object obj2 = this.f1792OooO0o;
        Object obj3 = this.f1793OooO0o0;
        switch (i) {
            case 0:
                ((OooO0o) obj3).f4091OooO0oO.OooO00o((AudioStream.OooO00o) obj2, (Executor) obj);
                break;
            default:
                Pattern pattern = oo0o0O0.f42009OooO0o0;
                ((BiConsumer) obj3).accept((String) obj2, (o00O0) obj);
                break;
        }
    }
}
