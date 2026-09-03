package o000O00O;

import android.util.Pair;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34124OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34125OooO0o0;

    public /* synthetic */ o00O0OO0(int i, Object obj, Object obj2) {
        this.f34123OooO0Oo = i;
        this.f34125OooO0o0 = obj;
        this.f34124OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34123OooO0Oo;
        Object obj = this.f34124OooO0o;
        Object obj2 = this.f34125OooO0o0;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo.OooOoOO(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second);
                break;
            case 1:
                androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = (androidx.media3.exoplayer.drm.OooO0O0.OooO00o) obj2;
                ((androidx.media3.exoplayer.drm.OooO0O0) obj).Oooo00O(oooO00o.f7639OooO00o, oooO00o.f7640OooO0O0);
                break;
            default:
                TextView this_apply = (TextView) obj2;
                p436o0OoOOo.o0000 this$0 = (p436o0OoOOo.o0000) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo().f47053OooOoo0 = this_apply.getWidth();
                this$0.OooO0Oo().notifyDataSetChanged();
                break;
        }
    }
}
