package p313o0O0oOo;

import p671oo0oOOo.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f42575OooO0O0;

    public o000OO(String str, int i) {
        this.f42574OooO00o = str;
        this.f42575OooO0O0 = i;
    }

    @Override // p671oo0oOOo.Oooo000
    public final String OooO00o() {
        if (this.f42575OooO0O0 == 0) {
            return "";
        }
        String str = this.f42574OooO00o;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // p671oo0oOOo.Oooo000
    public final long OooO0O0() {
        if (this.f42575OooO0O0 == 0) {
            return 0L;
        }
        String strTrim = OooO00o().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "long"), e);
        }
    }

    @Override // p671oo0oOOo.Oooo000
    public final double OooO0OO() {
        if (this.f42575OooO0O0 == 0) {
            return 0.0d;
        }
        String strTrim = OooO00o().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "double"), e);
        }
    }

    @Override // p671oo0oOOo.Oooo000
    public final boolean OooO0Oo() throws IllegalArgumentException {
        if (this.f42575OooO0O0 == 0) {
            return false;
        }
        String strTrim = OooO00o().trim();
        if (o0000.f42532OooO0o0.matcher(strTrim).matches()) {
            return true;
        }
        if (o0000.f42531OooO0o.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "boolean"));
    }

    @Override // p671oo0oOOo.Oooo000
    public final int getSource() {
        return this.f42575OooO0O0;
    }
}
