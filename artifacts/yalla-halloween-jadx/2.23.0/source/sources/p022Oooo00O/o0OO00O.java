package p022Oooo00O;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import com.facebook.appevents.aam.MetadataViewObserver;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f799OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f800OooO0o0;

    public /* synthetic */ o0OO00O(int i, Object obj, Object obj2) {
        this.f798OooO0Oo = i;
        this.f800OooO0o0 = obj;
        this.f799OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f798OooO0Oo;
        Object obj = this.f799OooO0o;
        Object obj2 = this.f800OooO0o0;
        switch (i) {
            case 0:
                o0Oo0oo.OooO0O0 oooO0O0 = (o0Oo0oo.OooO0O0) obj2;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                oooO0O0.getClass();
                HashSet hashSet = new HashSet();
                HashSet<o0Oo0oo.OooO0OO> hashSet2 = oooO0O0.f863OooO00o;
                for (o0Oo0oo.OooO0OO oooO0OO : hashSet2) {
                    if (oooO0OO.OooO00o(totalCaptureResult)) {
                        hashSet.add(oooO0OO);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                }
                break;
            default:
                MetadataViewObserver.m4074process$lambda0((View) obj2, (MetadataViewObserver) obj);
                break;
        }
    }
}
