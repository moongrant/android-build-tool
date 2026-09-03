package p045Oooooo;

import com.yy.yyeva.view.EvaAnimView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1973OooO0o0;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f1972OooO0Oo = i;
        this.f1973OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1972OooO0Oo;
        Object obj = this.f1973OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj).OooO0Oo();
                break;
            default:
                Function0 f = (Function0) obj;
                int i2 = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter(f, "$f");
                f.invoke();
                break;
        }
    }
}
