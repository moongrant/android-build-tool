package p003OooO0Oo;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import kotlin.jvm.internal.Intrinsics;
import p088o000o00.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f122Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f123OoooO00;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f122Oooo = i;
        this.f123OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f122Oooo) {
            case 0:
                o0OoOo0 this$0 = (o0OoOo0) this.f123OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                break;
            default:
                ProfileInstaller.OooO0OO((Context) this.f123OoooO00, OooOO0.f28617Oooo, ProfileInstaller.f8837OooO00o, false);
                break;
        }
    }
}
