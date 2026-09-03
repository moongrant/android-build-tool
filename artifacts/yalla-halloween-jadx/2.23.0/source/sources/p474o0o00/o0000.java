package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47227OooO0Oo;

    public o0000(LoginActivity loginActivity) {
        this.f47227OooO0Oo = loginActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Long, kotlin.Long>");
        Pair pair = (Pair) obj;
        new o00O000o(this.f47227OooO0Oo, ((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue()).OooO();
    }
}
