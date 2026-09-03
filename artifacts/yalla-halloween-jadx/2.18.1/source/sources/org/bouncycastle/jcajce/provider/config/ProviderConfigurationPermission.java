package org.bouncycastle.jcajce.provider.config;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class ProviderConfigurationPermission extends BasicPermission {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f53658Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f53659Oooo0oO;

    public ProviderConfigurationPermission(String str) {
        super("BC", str);
        this.f53658Oooo0o = str;
        StringTokenizer stringTokenizer = new StringTokenizer(OooO0o.OooO0OO(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        this.f53659Oooo0oO = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProviderConfigurationPermission)) {
            return false;
        }
        ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) obj;
        return this.f53659Oooo0oO == providerConfigurationPermission.f53659Oooo0oO && getName().equals(providerConfigurationPermission.getName());
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.f53658Oooo0o;
    }

    public final int hashCode() {
        return getName().hashCode() + this.f53659Oooo0oO;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.f53659Oooo0oO;
        int i2 = ((ProviderConfigurationPermission) permission).f53659Oooo0oO;
        return (i & i2) == i2;
    }
}
