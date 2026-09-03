package p003OooO0Oo;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import kotlin.jvm.internal.Intrinsics;
import p088o000o00.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f122Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f123Oooo0oO;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f122Oooo0o = i;
        this.f123Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f122Oooo0o) {
            case 0:
                o0OoOo0 this$0 = (o0OoOo0) this.f123Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                break;
            default:
                ProfileInstaller.OooO0OO((Context) this.f123Oooo0oO, OooOO0.f28598Oooo0o, ProfileInstaller.f8821OooO00o, false);
                break;
        }
    }
}
