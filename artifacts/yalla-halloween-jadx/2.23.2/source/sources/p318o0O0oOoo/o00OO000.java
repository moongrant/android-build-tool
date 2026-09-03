package p318o0O0oOoo;

import p317o0O0oOoO.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 implements o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41998OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f41999OooO0O0;

    public o00OO000(String str, int i) {
        this.f41998OooO00o = str;
        this.f41999OooO0O0 = i;
    }

    @Override // p317o0O0oOoO.o0O0ooO
    public final String OooO00o() {
        if (this.f41999OooO0O0 == 0) {
            return "";
        }
        String str = this.f41998OooO00o;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // p317o0O0oOoO.o0O0ooO
    public final long OooO0O0() {
        if (this.f41999OooO0O0 == 0) {
            return 0L;
        }
        String strTrim = OooO00o().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "long"), e);
        }
    }

    @Override // p317o0O0oOoO.o0O0ooO
    public final double OooO0OO() {
        if (this.f41999OooO0O0 == 0) {
            return 0.0d;
        }
        String strTrim = OooO00o().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "double"), e);
        }
    }

    @Override // p317o0O0oOoO.o0O0ooO
    public final boolean OooO0Oo() throws IllegalArgumentException {
        if (this.f41999OooO0O0 == 0) {
            return false;
        }
        String strTrim = OooO00o().trim();
        if (oo0o0O0.f42014OooO0o0.matcher(strTrim).matches()) {
            return true;
        }
        if (oo0o0O0.f42013OooO0o.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "boolean"));
    }

    @Override // p317o0O0oOoO.o0O0ooO
    public final int getSource() {
        return this.f41999OooO0O0;
    }
}
