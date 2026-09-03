package p022Oooo00O;

import android.util.Range;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.OooO00o;
import com.facebook.login.LoginFragment;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import p045Oooooo.o0000Ooo;
import p569o0oOo0Oo.o0O0OO0;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0O00 implements o000O0.OooO0OO, OooO00o, o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f732OooO0o0;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f731OooO0Oo = i;
        this.f732OooO0o0 = obj;
    }

    @Override // o0ooOO0.o000O0.OooO0OO
    public final Object OooO0O0(o000O0.OooO00o oooO00o) {
        int i = this.f731OooO0Oo;
        Object obj = this.f732OooO0o0;
        switch (i) {
            case 0:
                o000OO o000oo2 = (o000OO) obj;
                o000oo2.getClass();
                try {
                    o000oo2.f550OooO0o.execute(new o00000(0, o000oo2, oooO00o));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    oooO00o.OooO0OO(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                Range<Long> range = o0000Ooo.f1888OooOooO;
                ((AtomicReference) obj).set(oooO00o);
                return "mReleasedFuture";
        }
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        MainExploreFragment.initView$lambda$1$lambda$0((MainExploreFragment) this.f732OooO0o0);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        LoginFragment.m4174onCreate$lambda1((Function1) this.f732OooO0o0, (ActivityResult) obj);
    }
}
