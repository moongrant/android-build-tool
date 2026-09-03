package o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f33594OooO00o = new OooO0o(null, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0o f33595OooO0O0 = new OooO0o(null, true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0o f33596OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f33597OooO0Oo;

    public static class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f33598OooO00o = new OooO00o();

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        @Override // o0000O0O.o00Ooo.OooO0O0
        public final int OooO00o(CharSequence charSequence, int i) {
            int i2 = 0;
            int i3 = i + 0;
            i2 = 2;
            for (int i4 = 0; i4 < i3 && i2 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                OooO0o oooO0o = o00Ooo.f33594OooO00o;
                if (directionality == 0) {
                    i2 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i2 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            continue;
                    }
                }
            }
            return i2;
        }
    }

    public interface OooO0O0 {
        int OooO00o(CharSequence charSequence, int i);
    }

    public static abstract class OooO0OO implements o00Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f33599OooO00o;

        public OooO0OO(OooO00o oooO00o) {
            this.f33599OooO00o = oooO00o;
        }

        public abstract boolean OooO00o();

        public final boolean OooO0O0(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            OooO0O0 oooO0O0 = this.f33599OooO00o;
            if (oooO0O0 == null) {
                return OooO00o();
            }
            int iOooO00o = oooO0O0.OooO00o(charSequence, i);
            if (iOooO00o == 0) {
                return true;
            }
            if (iOooO00o != 1) {
                return OooO00o();
            }
            return false;
        }
    }

    public static class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f33600OooO0O0;

        public OooO0o(OooO00o oooO00o, boolean z) {
            super(oooO00o);
            this.f33600OooO0O0 = z;
        }

        @Override // o0000O0O.o00Ooo.OooO0OO
        public final boolean OooO00o() {
            return this.f33600OooO0O0;
        }
    }

    static {
        OooO00o oooO00o = OooO00o.f33598OooO00o;
        f33596OooO0OO = new OooO0o(oooO00o, false);
        f33597OooO0Oo = new OooO0o(oooO00o, true);
    }
}
