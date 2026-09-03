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
public final class oO0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0Oo0oo f55167OooO0Oo = new oO0Oo0oo();

    public oO0Oo0oo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityOooO0O0;
            o00O000o.f44493OooO0Oo.observe(fragmentActivity, new oO000O0.OooOOO(new oO0OoOO0(fragmentActivity)));
        }
        return Unit.INSTANCE;
    }
}
