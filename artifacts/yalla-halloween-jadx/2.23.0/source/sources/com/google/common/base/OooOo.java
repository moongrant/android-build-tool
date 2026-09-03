package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class OooOo {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f19076OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f19077OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0O0 f19078OooO0OO;

        /* JADX INFO: renamed from: com.google.common.base.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0227OooO00o extends OooO0O0 {
        }

        public static class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @CheckForNull
            public String f19079OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @CheckForNull
            public Object f19080OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @CheckForNull
            public OooO0O0 f19081OooO0OO;
        }

        public OooO00o(String str) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f19077OooO0O0 = oooO0O0;
            this.f19078OooO0OO = oooO0O0;
            this.f19076OooO00o = str;
        }

        @CanIgnoreReturnValue
        public final void OooO00o(@CheckForNull Object obj, String str) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f19078OooO0OO.f19081OooO0OO = oooO0O0;
            this.f19078OooO0OO = oooO0O0;
            oooO0O0.f19080OooO0O0 = obj;
            oooO0O0.f19079OooO00o = str;
        }

        public final void OooO0O0(String str, String str2) {
            C0227OooO00o c0227OooO00o = new C0227OooO00o();
            this.f19078OooO0OO.f19081OooO0OO = c0227OooO00o;
            this.f19078OooO0OO = c0227OooO00o;
            c0227OooO00o.f19080OooO0O0 = str;
            c0227OooO00o.f19079OooO00o = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f19076OooO00o);
            sb.append('{');
            OooO0O0 oooO0O0 = this.f19077OooO0O0.f19081OooO0OO;
            String str = "";
            while (oooO0O0 != null) {
                Object obj = oooO0O0.f19080OooO0O0;
                boolean z = oooO0O0 instanceof C0227OooO00o;
                sb.append(str);
                String str2 = oooO0O0.f19079OooO00o;
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
                oooO0O0 = oooO0O0.f19081OooO0OO;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <T> T OooO00o(@CheckForNull T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static OooO00o OooO0O0(Object obj) {
        return new OooO00o(obj.getClass().getSimpleName());
    }
}
