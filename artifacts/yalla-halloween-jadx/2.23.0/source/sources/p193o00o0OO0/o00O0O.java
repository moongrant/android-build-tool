package p193o00o0OO0;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;
import p201o00o0o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f38959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f38960OooO0OO;

    @Inject
    public o00O0O(Context context, @WallTime OooOOO0 oooOOO0, @Monotonic OooOOO0 oooOOO1) {
        this.f38958OooO00o = context;
        this.f38959OooO0O0 = oooOOO0;
        this.f38960OooO0OO = oooOOO1;
    }
}
