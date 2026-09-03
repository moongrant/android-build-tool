package oO0OOoO0;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements oO000O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ThreadLocal f52852OooO00o = new ThreadLocal();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile HashSet f52853OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile HashMap f52854OooO0OO;

    static {
        new ProviderConfigurationPermission("threadLocalEcImplicitlyCa");
        new ProviderConfigurationPermission("ecImplicitlyCa");
        new ProviderConfigurationPermission("threadLocalDhDefaultParams");
        new ProviderConfigurationPermission("DhDefaultParams");
        new ProviderConfigurationPermission("acceptableEcCurves");
        new ProviderConfigurationPermission("additionalEcParameters");
    }

    public OooO00o() {
        new ThreadLocal();
        this.f52853OooO0O0 = new HashSet();
        this.f52854OooO0OO = new HashMap();
    }

    public final Map OooO00o() {
        return Collections.unmodifiableMap(this.f52854OooO0OO);
    }

    public final o000oOoO OooO0O0() {
        o000oOoO o000oooo2 = (o000oOoO) this.f52852OooO00o.get();
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        return null;
    }
}
