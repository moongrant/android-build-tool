package p058o0000Ooo;

import android.graphics.Typeface;
import androidx.core.content.res.OooO00o;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import p312o0O0oO0o.oo0o0Oo;
import p317o0O0oOo0.o0OO00O;
import p317o0O0oOo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f33724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33725OooO0o0;

    public /* synthetic */ o00Oo0(int i, Object obj, Object obj2) {
        this.f33723OooO0Oo = i;
        this.f33725OooO0o0 = obj;
        this.f33724OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33723OooO0Oo;
        Object obj = this.f33724OooO0o;
        Object obj2 = this.f33725OooO0o0;
        switch (i) {
            case 0:
                ((OooO00o.OooO) obj2).OooO0Oo((Typeface) obj);
                break;
            case 1:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj2).onSuccess((FetchedAppSettings) obj);
                break;
            default:
                o0OO00O o0oo00o2 = (o0OO00O) obj2;
                oo000o oo000oVar = (oo000o) obj;
                oo0o0Oo oo0o0oo = o0OO00O.f41907OooOo0;
                o0oo00o2.getClass();
                o0oo00o2.OooO0Oo(oo000oVar.f41933OooO00o, oo000oVar.f41934OooO0O0);
                break;
        }
    }
}
