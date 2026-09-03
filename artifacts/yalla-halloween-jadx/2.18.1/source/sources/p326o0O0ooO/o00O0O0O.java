package p326o0O0ooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import o00O000.OooO00o;
import o00O0000.o00O0O;
import p102o000oo.OooOOOO;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O0O implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f37011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00.OooO00o f37012OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f37013OooO0OO;

    static {
        o0OoOo0.OooO0o0("WMFgUpdater");
    }

    public o00O0O0O(@NonNull WorkDatabase workDatabase, @NonNull o00.OooO00o oooO00o, @NonNull OooO00o oooO00o2) {
        this.f37012OooO0O0 = oooO00o;
        this.f37011OooO00o = oooO00o2;
        this.f37013OooO0OO = workDatabase.OooOo0O();
    }
}
