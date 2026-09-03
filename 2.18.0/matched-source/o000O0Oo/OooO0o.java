package o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C0297OooO0o f28174OooO00o = new C0297OooO0o(null, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C0297OooO0o f28175OooO0O0 = new C0297OooO0o(null, true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C0297OooO0o f28176OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C0297OooO0o f28177OooO0Oo;

    public static class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f28178OooO00o = new OooO00o();

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        @Override // o000O0Oo.OooO0o.OooO0O0
        public final int OooO00o(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                C0297OooO0o c0297OooO0o = OooO0o.f28174OooO00o;
                if (directionality == 0) {
                    i3 = 1;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i3 = 1;
                            break;
                        case 16:
                        case 17:
                            i3 = 0;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                } else {
                    i3 = 0;
                }
            }
            return i3;
        }
    }

    public interface OooO0O0 {
        int OooO00o(CharSequence charSequence, int i);
    }

    public static abstract class OooO0OO implements o000O0Oo.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f28179OooO00o;

        public OooO0OO(OooO0O0 oooO0O0) {
            this.f28179OooO00o = oooO0O0;
        }

        public abstract boolean OooO00o();

        public final boolean OooO0O0(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            OooO0O0 oooO0O0 = this.f28179OooO00o;
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

    /* JADX INFO: renamed from: o000O0Oo.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class C0297OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f28180OooO0O0;

        public C0297OooO0o(OooO0O0 oooO0O0, boolean z) {
            super(oooO0O0);
            this.f28180OooO0O0 = z;
        }

        @Override // o000O0Oo.OooO0o.OooO0OO
        public final boolean OooO00o() {
            return this.f28180OooO0O0;
        }
    }

    static {
        OooO00o oooO00o = OooO00o.f28178OooO00o;
        f28176OooO0OO = new C0297OooO0o(oooO00o, false);
        f28177OooO0Oo = new C0297OooO0o(oooO00o, true);
    }
}
