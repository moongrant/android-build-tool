package o000O00O;

import android.util.Pair;
import com.yalla.yalla.ui.view.round.DisplayType;
import com.yalla.yalla.ui.view.round.RoundImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34080OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34081OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34082OooO0oO;

    public /* synthetic */ o00O0O00(int i, Object obj, Object obj2, Object obj3) {
        this.f34079OooO0Oo = i;
        this.f34081OooO0o0 = obj;
        this.f34080OooO0o = obj2;
        this.f34082OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34079OooO0Oo;
        Object obj = this.f34082OooO0oO;
        Object obj2 = this.f34080OooO0o;
        Object obj3 = this.f34081OooO0o0;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                androidx.media3.exoplayer.OooOOO0.this.f7320OooO0oo.OooOO0O(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, (o000O.Oooo000) obj);
                break;
            default:
                RoundImageView this$0 = (RoundImageView) obj3;
                p370o0OOo0Oo.Oooo000 option = (p370o0OOo0Oo.Oooo000) obj2;
                DisplayType[] displayTypeArr = RoundImageView.f30804OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(option, "$option");
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$0.getContext());
                oooO00o.OooO00o(option);
                oooO00o.f43127OooO0OO = (String) obj;
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(this$0);
                break;
        }
    }
}
