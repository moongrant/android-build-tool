package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class OooOOO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f38238OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C0379OooO00o f38239OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C0379OooO00o f38240OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f38241OooO0Oo;

        /* JADX INFO: renamed from: o0OOOO0o.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0379OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NullableDecl
            public String f38242OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NullableDecl
            public Object f38243OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @NullableDecl
            public C0379OooO00o f38244OooO0OO;
        }

        public OooO00o(String str) {
            C0379OooO00o c0379OooO00o = new C0379OooO00o();
            this.f38239OooO0O0 = c0379OooO00o;
            this.f38240OooO0OO = c0379OooO00o;
            this.f38241OooO0Oo = false;
            this.f38238OooO00o = str;
        }

        @CanIgnoreReturnValue
        public final OooO00o OooO00o(String str, int i) {
            OooO0OO(str, String.valueOf(i));
            return this;
        }

        @CanIgnoreReturnValue
        public final OooO00o OooO0O0(String str, boolean z) {
            OooO0OO(str, String.valueOf(z));
            return this;
        }

        public final OooO00o OooO0OO(String str, @NullableDecl Object obj) {
            C0379OooO00o c0379OooO00o = new C0379OooO00o();
            this.f38240OooO0OO.f38244OooO0OO = c0379OooO00o;
            this.f38240OooO0OO = c0379OooO00o;
            c0379OooO00o.f38243OooO0O0 = obj;
            c0379OooO00o.f38242OooO00o = str;
            return this;
        }

        public final String toString() {
            boolean z = this.f38241OooO0Oo;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f38238OooO00o);
            sb.append('{');
            String str = "";
            for (C0379OooO00o c0379OooO00o = this.f38239OooO0O0.f38244OooO0OO; c0379OooO00o != null; c0379OooO00o = c0379OooO00o.f38244OooO0OO) {
                Object obj = c0379OooO00o.f38243OooO0O0;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = c0379OooO00o.f38242OooO00o;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <T> T OooO00o(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    public static OooO00o OooO0O0(Object obj) {
        return new OooO00o(obj.getClass().getSimpleName());
    }
}
