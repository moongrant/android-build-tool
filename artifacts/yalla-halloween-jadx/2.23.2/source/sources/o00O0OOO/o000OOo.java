package o00O0OOO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000OOo implements p115o00O00oO.o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p119o00O0Oo0.o0OoOo0 f36294OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0O0.OooO00o f36295OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0OO.oo000o f36296OooO0OO;

    static {
        p115o00O00oO.o0Oo0oo.OooO0o("WMFgUpdater");
    }

    public o000OOo(@NonNull WorkDatabase workDatabase, @NonNull oo0o0O0.OooO00o oooO00o, @NonNull p119o00O0Oo0.o0OoOo0 o0oooo1) {
        this.f36295OooO0O0 = oooO00o;
        this.f36294OooO00o = o0oooo1;
        this.f36296OooO0OO = workDatabase.OooOo0();
    }
}
