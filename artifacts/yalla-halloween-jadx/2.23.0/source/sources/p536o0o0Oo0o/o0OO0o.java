package p536o0o0Oo0o;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OO0o f54984OooO0Oo = new o0OO0o();

    public o0OO0o() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityOooO0O0;
            o00O000o.f44504OooOOOo.observe(fragmentActivity, new oO000O0.OooOOO(new o0OO0o00(fragmentActivity)));
        }
        return Unit.INSTANCE;
    }
}
