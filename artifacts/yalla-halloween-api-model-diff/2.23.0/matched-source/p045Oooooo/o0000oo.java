package p045Oooooo;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooOO0O;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.jvm.internal.Intrinsics;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1952OooO0o0;

    public /* synthetic */ o0000oo(int i, Object obj, Object obj2) {
        this.f1950OooO0Oo = i;
        this.f1952OooO0o0 = obj;
        this.f1951OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1950OooO0Oo;
        Object obj = this.f1951OooO0o;
        Object obj2 = this.f1952OooO0o0;
        switch (i) {
            case 0:
                ((o00O000.OooO00o) obj).OooO0O0(((o0000Ooo.OooO0OO) obj2).f1941OooO0O0);
                break;
            default:
                OooOO0O.OooO0OO transitionInfo = (OooOO0O.OooO0OO) obj2;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
                Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                transitionInfo.OooO00o();
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                break;
        }
    }
}
