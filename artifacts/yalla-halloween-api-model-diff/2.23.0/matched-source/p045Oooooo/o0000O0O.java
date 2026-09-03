package p045Oooooo;

import androidx.camera.core.impl.o00O00o0;
import com.google.android.exoplayer2.source.OooOo00;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import p029Oooo0oo.o0OOo000;
import p226o00oOo00.o0000O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1888OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1889OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1890OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f1891OooO0oO;

    public /* synthetic */ o0000O0O(int i, Object obj, Object obj2, Object obj3) {
        this.f1888OooO0Oo = i;
        this.f1890OooO0o0 = obj;
        this.f1889OooO0o = obj2;
        this.f1891OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1888OooO0Oo;
        Object obj = this.f1891OooO0oO;
        Object obj2 = this.f1889OooO0o;
        Object obj3 = this.f1890OooO0o0;
        switch (i) {
            case 0:
                o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) obj3;
                o00O00o0.OooO00o oooO00o = (o00O00o0.OooO00o) obj2;
                Executor executor = (Executor) obj;
                LinkedHashMap linkedHashMap = oooO0OO.f1940OooO00o;
                oooO00o.getClass();
                executor.getClass();
                linkedHashMap.put(oooO00o, executor);
                executor.execute(new o0OOo000(1, oooO00o, oooO0OO.f1941OooO0O0));
                break;
            default:
                OooOo00.OooO00o oooO00o2 = (OooOo00.OooO00o) obj3;
                ((OooOo00) obj2).Oooo00O(oooO00o2.f13058OooO00o, oooO00o2.f13059OooO0O0, (o0000O00) obj);
                break;
        }
    }
}
