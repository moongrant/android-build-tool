package p029Oooo0oo;

import androidx.camera.core.OooOOO0;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.SessionEventsState;
import com.google.common.util.concurrent.OooO00o;
import java.util.Objects;
import p045Oooooo.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1354OooO0o0;

    public /* synthetic */ oO0Oo(int i, Object obj, Object obj2) {
        this.f1352OooO0Oo = i;
        this.f1354OooO0o0 = obj;
        this.f1353OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1352OooO0Oo;
        Object obj = this.f1353OooO0o;
        Object obj2 = this.f1354OooO0o0;
        switch (i) {
            case 0:
                Objects.requireNonNull(((o0oo0000) obj2).OooO0Oo());
                Objects.requireNonNull((OooOOO0) obj);
                break;
            case 1:
                ((o0000Ooo.OooO0OO) obj2).f1942OooO0OO.remove((OooO00o) obj);
                break;
            default:
                AppEventQueue.m4060handleResponse$lambda5((AccessTokenAppIdPair) obj2, (SessionEventsState) obj);
                break;
        }
    }
}
