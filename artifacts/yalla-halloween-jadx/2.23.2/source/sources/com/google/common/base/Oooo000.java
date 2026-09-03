package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Oooo000 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f18601OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f18602OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0O0 f18603OooO0OO;

        /* JADX INFO: renamed from: com.google.common.base.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0224OooO00o extends OooO0O0 {
        }

        public static class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @CheckForNull
            public String f18604OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @CheckForNull
            public Object f18605OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @CheckForNull
            public OooO0O0 f18606OooO0OO;
        }

        public OooO00o(String str) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f18602OooO0O0 = oooO0O0;
            this.f18603OooO0OO = oooO0O0;
            this.f18601OooO00o = str;
        }

        @CanIgnoreReturnValue
        public final void OooO00o(@CheckForNull Object obj, String str) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f18603OooO0OO.f18606OooO0OO = oooO0O0;
            this.f18603OooO0OO = oooO0O0;
            oooO0O0.f18605OooO0O0 = obj;
            oooO0O0.f18604OooO00o = str;
        }

        public final void OooO0O0(String str, String str2) {
            C0224OooO00o c0224OooO00o = new C0224OooO00o();
            this.f18603OooO0OO.f18606OooO0OO = c0224OooO00o;
            this.f18603OooO0OO = c0224OooO00o;
            c0224OooO00o.f18605OooO0O0 = str;
            c0224OooO00o.f18604OooO00o = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f18601OooO00o);
            sb.append('{');
            OooO0O0 oooO0O0 = this.f18602OooO0O0.f18606OooO0OO;
            String str = "";
            while (oooO0O0 != null) {
                Object obj = oooO0O0.f18605OooO0O0;
                boolean z = oooO0O0 instanceof C0224OooO00o;
                sb.append(str);
                String str2 = oooO0O0.f18604OooO00o;
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
                oooO0O0 = oooO0O0.f18606OooO0OO;
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
