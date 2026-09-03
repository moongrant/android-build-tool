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
import p559o0oOo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0O00 implements o000Oo0.OooO0OO, OooO00o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f730OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f731OooO0o0;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f730OooO0Oo = i;
        this.f731OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainExploreFragment.initView$lambda$1$lambda$0((MainExploreFragment) this.f731OooO0o0);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        int i = this.f730OooO0Oo;
        Object obj = this.f731OooO0o0;
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
                Range<Long> range = o0000Ooo.f1885OooOooO;
                ((AtomicReference) obj).set(oooO00o);
                return "mReleasedFuture";
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        LoginFragment.m4174onCreate$lambda1((Function1) this.f731OooO0o0, (ActivityResult) obj);
    }
}
