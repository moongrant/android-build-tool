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
public final class oOO0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO0O0O f55501OooO0Oo = new oOO0O0O();

    public oOO0O0O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityOooO0O0;
            o00000OO.f56673OooOOOo.observe(fragmentActivity, new oo000000.OooOOO(new oOO0O0O0(fragmentActivity)));
        }
        return Unit.INSTANCE;
    }
}
