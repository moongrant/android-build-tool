package p543o0o0Ooo0;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oo0000 f55355OooO0Oo = new Oo0000();

    public Oo0000() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityOooO0O0;
            o00000OO.f56662OooO0Oo.observe(fragmentActivity, new oo000000.OooOOO(new O0OO00(fragmentActivity)));
        }
        return Unit.INSTANCE;
    }
}
