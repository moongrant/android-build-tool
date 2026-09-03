package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooOO0O;
import o000OO.OooOOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class oo0ooO implements o0OO0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOO00 f1319OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOOO00.OooO00o f1320OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1323OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1324OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public OooOO0O<Void> f1326OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f1325OooO0oO = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000Oo0.OooO0o f1321OooO0OO = o000Oo0.OooO00o(new o0OO000o(this));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0.OooO0o f1322OooO0Oo = o000Oo0.OooO00o(new oo0oO0(this));

    public oo0ooO(@NonNull o0OOOO00 o0oooo01, @NonNull o0OOOO00.OooO00o oooO00o) {
        this.f1319OooO00o = o0oooo01;
        this.f1320OooO0O0 = oooO00o;
    }

    public final void OooO00o() {
        OooOOO0.OooO0o("The callback can only complete once.", !this.f1322OooO0Oo.isDone());
        this.f1323OooO0o.OooO0O0(null);
    }
}
