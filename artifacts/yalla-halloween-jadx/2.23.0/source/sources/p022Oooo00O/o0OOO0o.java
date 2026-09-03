package p022Oooo00O;

import android.util.Log;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f831OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f832OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f833OooO0o0;

    public /* synthetic */ o0OOO0o(int i, Object obj, Object obj2) {
        this.f831OooO0Oo = i;
        this.f833OooO0o0 = obj;
        this.f832OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f831OooO0Oo;
        Object obj = this.f832OooO0o;
        Object obj2 = this.f833OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) obj2).OooO0O0((o00Oo0) obj);
                return;
            default:
                Violation violation = (Violation) obj;
                FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6044OooO00o;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) obj2), violation);
                throw violation;
        }
    }
}
