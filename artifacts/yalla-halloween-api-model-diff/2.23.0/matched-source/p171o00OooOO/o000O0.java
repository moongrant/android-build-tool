package p171o00OooOO;

import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import java.util.concurrent.Callable;
import o0O0OOO0.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f38534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f38535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f38536OooO0o0;

    public /* synthetic */ o000O0(int i, Object obj, Object obj2) {
        this.f38534OooO0Oo = i;
        this.f38536OooO0o0 = obj;
        this.f38535OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f38534OooO0Oo;
        Object obj = this.f38535OooO0o;
        Object obj2 = this.f38536OooO0o0;
        switch (i) {
            case 0:
                ViewOnClickListener.Companion.m4105queryHistoryAndProcess$lambda0((String) obj2, (String) obj);
                break;
            default:
                o000oOoO.OooO0O0 oooO0O0 = (o000oOoO.OooO0O0) obj;
                try {
                    o000oOoO.this.OooOO0(((Callable) obj2).call());
                } catch (Exception e) {
                    o000oOoO.this.OooOO0O(e);
                    return;
                }
                break;
        }
    }
}
