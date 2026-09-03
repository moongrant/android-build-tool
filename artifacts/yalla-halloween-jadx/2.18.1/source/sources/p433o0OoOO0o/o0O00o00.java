package p433o0OoOO0o;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p386o0OOoo0O.o00;
import p435o0OoOOO0.o000000;
import p435o0OoOOO0.o000000O;
import p435o0OoOOO0.o000OOo;
import p435o0OoOOO0.oo0o0Oo;
import p436o0OoOOOO.o0OoOoOo;
import p440o0OoOOoO.o0OO00o0;
import p660o0ooo0o0.o00OO;
import p693oO000oO.OooO;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap<Class, Object> f39938OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f39939OooO0O0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public o0O00o00() {
        o0O0000O o0o0000oOooO0O0 = o0O0oo0o.OooO0OO().OooO0O0();
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        oooO00o.OooO0O0(o000000O.OooO00o());
        o000OOo authenticator = new o000OOo(o0o0000oOooO0O0);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        oooO00o.f51356OooO0oO = authenticator;
        oooO00o.OooO00o(new oo0o0Oo(o0o0000oOooO0O0));
        p435o0OoOOO0.o0O0O00 interceptor = new p435o0OoOOO0.o0O0O00();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f51353OooO0Oo.add(interceptor);
        this(new o00OO(oooO00o), new o0OO00o0());
    }

    public final <T> T OooO00o(Class<T> cls) {
        if (!this.f39938OooO00o.contains(cls)) {
            this.f39938OooO00o.putIfAbsent(cls, this.f39939OooO0O0.OooO0O0(cls));
        }
        return (T) this.f39938OooO00o.get(cls);
    }

    public o0O00o00(o0O0O0Oo o0o0o0oo) {
        TwitterAuthConfig twitterAuthConfig = o0O0oo0o.OooO0OO().f39952OooO0Oo;
        if (o0o0o0oo != null) {
            o00OO.OooO00o oooO00o = new o00OO.OooO00o();
            oooO00o.OooO0O0(o000000O.OooO00o());
            oooO00o.OooO00o(new o000000(o0o0o0oo, twitterAuthConfig));
            this(new o00OO(oooO00o), new o0OO00o0());
            return;
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public o0O00o00(o00OO o00oo2, o0OO00o0 o0oo00o1) {
        this.f39938OooO00o = new ConcurrentHashMap<>();
        o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
        oooO0O0.f53806OooO0O0 = o00oo2;
        oooO0O0.OooO0O0("https://api.twitter.com");
        o00 o00Var = new o00();
        o00Var.OooO0OO(new SafeListAdapter());
        o00Var.OooO0OO(new SafeMapAdapter());
        o00Var.OooO0O0(o0OoOoOo.class, new BindingValuesAdapter());
        oooO0O0.f53808OooO0Oo.add(OooO.OooO0Oo(o00Var.OooO00o()));
        this.f39939OooO0O0 = oooO0O0.OooO0OO();
    }
}
