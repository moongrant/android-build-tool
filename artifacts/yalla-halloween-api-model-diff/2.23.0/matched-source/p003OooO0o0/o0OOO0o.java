package p003OooO0o0;

import OooO0O0.OooO0o;
import android.util.Pair;
import com.google.android.exoplayer2.o00O0O;
import com.google.android.exoplayer2.source.OooOOOO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f140OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f141OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f142OooO0o0;

    public /* synthetic */ o0OOO0o(int i, Object obj, Object obj2) {
        this.f140OooO0Oo = i;
        this.f142OooO0o0 = obj;
        this.f141OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f140OooO0Oo;
        Object obj = this.f141OooO0o;
        Object obj2 = this.f142OooO0o0;
        switch (i) {
            case 0:
                o0OO00O this$0 = (o0OO00O) obj2;
                OooO0o this_apply = (OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this$0.OooO0o(this_apply);
                break;
            default:
                Pair pair = (Pair) obj;
                ((o00O0O.OooO00o) obj2).f12812OooO0o0.f12807OooO0oo.Oooo0O0(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second);
                break;
        }
    }
}
