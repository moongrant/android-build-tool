package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000000<T> {

    public static final class OooO<T> extends o000000<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60500OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60501OooO0O0;

        public OooO(Method method, int i) {
            this.f60500OooO00o = method;
            this.f60501OooO0O0 = i;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f60501OooO0O0;
            Method method = this.f60500OooO00o;
            if (map == null) {
                throw o0000O.OooOO0O(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000O.OooOO0O(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000O.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO0O0("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                o0000o00.OooO0O0(str, value.toString());
            }
        }
    }

    public static final class OooO00o<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60502OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60503OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOOO<T, o0oO0Ooo> f60504OooO0OO;

        public OooO00o(Method method, int i, retrofit2.OooOOO<T, o0oO0Ooo> oooOOO) {
            this.f60502OooO00o = method;
            this.f60503OooO0O0 = i;
            this.f60504OooO0OO = oooOOO;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) {
            int i = this.f60503OooO0O0;
            Method method = this.f60502OooO00o;
            if (t == null) {
                throw o0000O.OooOO0O(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                o0000o00.f60561OooOO0O = this.f60504OooO0OO.convert(t);
            } catch (IOException e) {
                throw o0000O.OooOO0o(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class OooO0O0<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f60505OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOO<T, String> f60506OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f60507OooO0OO;

        public OooO0O0(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f60468OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f60505OooO00o = str;
            this.f60506OooO0O0 = oooO0o;
            this.f60507OooO0OO = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f60506OooO0O0.convert(t)) == null) {
                return;
            }
            o0000o00.OooO00o(this.f60505OooO00o, strConvert, this.f60507OooO0OO);
        }
    }

    public static final class OooO0OO<T> extends o000000<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60508OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60509OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f60510OooO0OO;

        public OooO0OO(Method method, int i, boolean z) {
            this.f60508OooO00o = method;
            this.f60509OooO0O0 = i;
            this.f60510OooO0OO = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f60509OooO0O0;
            Method method = this.f60508OooO00o;
            if (map == null) {
                throw o0000O.OooOO0O(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000O.OooOO0O(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000O.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO0O0("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o0000O.OooOO0O(method, i, "Field map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0000o00.OooO00o(str, string, this.f60510OooO0OO);
            }
        }
    }

    public static final class OooO0o<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f60511OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOO<T, String> f60512OooO0O0;

        public OooO0o(String str) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f60468OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f60511OooO00o = str;
            this.f60512OooO0O0 = oooO0o;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f60512OooO0O0.convert(t)) == null) {
                return;
            }
            o0000o00.OooO0O0(this.f60511OooO00o, strConvert);
        }
    }

    public static final class OooOO0 extends o000000<o0O000> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60513OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60514OooO0O0;

        public OooOO0(int i, Method method) {
            this.f60513OooO00o = method;
            this.f60514OooO0O0 = i;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable o0O000 o0o001) throws IOException {
            o0O000 headers = o0o001;
            if (headers == null) {
                int i = this.f60514OooO0O0;
                throw o0000O.OooOO0O(this.f60513OooO00o, i, "Headers parameter must not be null.", new Object[0]);
            }
            o0O000.OooO00o oooO00o = o0000o00.f60556OooO0o;
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(headers, "headers");
            int length = headers.f57773OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                oooO00o.OooO0O0(headers.OooO0OO(i2), headers.OooO0o0(i2));
            }
        }
    }

    public static final class OooOO0O<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60515OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60516OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O000 f60517OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOOO<T, o0oO0Ooo> f60518OooO0Oo;

        public OooOO0O(Method method, int i, o0O000 o0o001, retrofit2.OooOOO<T, o0oO0Ooo> oooOOO) {
            this.f60515OooO00o = method;
            this.f60516OooO0O0 = i;
            this.f60517OooO0OO = o0o001;
            this.f60518OooO0Oo = oooOOO;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                o0oO0Ooo body = this.f60518OooO0Oo.convert(t);
                o0O000o0.OooO00o oooO00o = o0000o00.f60551OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(body, "body");
                o0O000o0.OooO0OO part = o0O000o0.OooO0OO.OooO00o.OooO00o(this.f60517OooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57823OooO0OO.add(part);
            } catch (IOException e) {
                throw o0000O.OooOO0O(this.f60515OooO00o, this.f60516OooO0O0, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class OooOOO<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60519OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60520OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f60521OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOOO<T, String> f60522OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f60523OooO0o0;

        public OooOOO(Method method, int i, String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f60468OooO00o;
            this.f60519OooO00o = method;
            this.f60520OooO0O0 = i;
            Objects.requireNonNull(str, "name == null");
            this.f60521OooO0OO = str;
            this.f60522OooO0Oo = oooO0o;
            this.f60523OooO0o0 = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException {
            String strOoooOO0;
            String str = this.f60521OooO0OO;
            if (t == null) {
                throw o0000O.OooOO0O(this.f60519OooO00o, this.f60520OooO0O0, p004OooO0oO.o000oOoO.OooO0O0("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strConvert = this.f60522OooO0Oo.convert(t);
            if (o0000o00.f60554OooO0OO == null) {
                throw new AssertionError();
            }
            int length = strConvert.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strOoooOO0 = strConvert;
                    break;
                }
                int iCodePointAt = strConvert.codePointAt(iCharCount);
                int i = 47;
                boolean z = this.f60523OooO0o0;
                int i2 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    oo0OOoo oo0oooo = new oo0OOoo();
                    oo0oooo.o000000O(0, iCharCount, strConvert);
                    oo0OOoo oo0oooo2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strConvert.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (oo0oooo2 == null) {
                                    oo0oooo2 = new oo0OOoo();
                                }
                                oo0oooo2.o00000o0(iCodePointAt2);
                                while (!oo0oooo2.o00oO0O()) {
                                    int i3 = oo0oooo2.readByte() & UByte.MAX_VALUE;
                                    oo0oooo.o00o0O(37);
                                    char[] cArr = o0000O00.f60549OooOO0o;
                                    oo0oooo.o00o0O(cArr[(i3 >> 4) & 15]);
                                    oo0oooo.o00o0O(cArr[i3 & 15]);
                                }
                            } else {
                                oo0oooo.o00000o0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    strOoooOO0 = oo0oooo.OoooOO0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = o0000o00.f60554OooO0OO.replace("{" + str + "}", strOoooOO0);
            if (o0000O00.f60550OooOOO0.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strConvert));
            }
            o0000o00.f60554OooO0OO = strReplace;
        }
    }

    public static final class OooOOO0<T> extends o000000<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60524OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60525OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOOO<T, o0oO0Ooo> f60526OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f60527OooO0Oo;

        public OooOOO0(Method method, int i, retrofit2.OooOOO<T, o0oO0Ooo> oooOOO, String str) {
            this.f60524OooO00o = method;
            this.f60525OooO0O0 = i;
            this.f60526OooO0OO = oooOOO;
            this.f60527OooO0Oo = str;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f60525OooO0O0;
            Method method = this.f60524OooO00o;
            if (map == null) {
                throw o0000O.OooOO0O(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000O.OooOO0O(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000O.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO0O0("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                o0O000 o0o000OooO0OO = o0O000.OooO0O0.OooO0OO("Content-Disposition", p004OooO0oO.o000oOoO.OooO0O0("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f60527OooO0Oo);
                o0oO0Ooo body = this.f60526OooO0OO.convert((T) value);
                o0O000o0.OooO00o oooO00o = o0000o00.f60551OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(body, "body");
                o0O000o0.OooO0OO part = o0O000o0.OooO0OO.OooO00o.OooO00o(o0o000OooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57823OooO0OO.add(part);
            }
        }
    }

    public static final class OooOOOO<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f60528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOO<T, String> f60529OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f60530OooO0OO;

        public OooOOOO(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f60468OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f60528OooO00o = str;
            this.f60529OooO0O0 = oooO0o;
            this.f60530OooO0OO = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f60529OooO0O0.convert(t)) == null) {
                return;
            }
            o0000o00.OooO0OO(this.f60528OooO00o, strConvert, this.f60530OooO0OO);
        }
    }

    public static final class OooOo<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f60531OooO00o;

        public OooOo(boolean z) {
            this.f60531OooO00o = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            o0000o00.OooO0OO(t.toString(), null, this.f60531OooO00o);
        }
    }

    public static final class OooOo00<T> extends o000000<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60532OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60533OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f60534OooO0OO;

        public OooOo00(Method method, int i, boolean z) {
            this.f60532OooO00o = method;
            this.f60533OooO0O0 = i;
            this.f60534OooO0OO = z;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f60533OooO0O0;
            Method method = this.f60532OooO00o;
            if (map == null) {
                throw o0000O.OooOO0O(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000O.OooOO0O(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000O.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO0O0("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o0000O.OooOO0O(method, i, "Query map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0000o00.OooO0OO(str, string, this.f60534OooO0OO);
            }
        }
    }

    public static final class Oooo0 extends o000000<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f60535OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f60536OooO0O0;

        public Oooo0(int i, Method method) {
            this.f60535OooO00o = method;
            this.f60536OooO0O0 = i;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable Object obj) {
            if (obj != null) {
                o0000o00.f60554OooO0OO = obj.toString();
            } else {
                int i = this.f60536OooO0O0;
                throw o0000O.OooOO0O(this.f60535OooO00o, i, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    public static final class Oooo000 extends o000000<o0O000o0.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f60537OooO00o = new Oooo000();

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable o0O000o0.OooO0OO oooO0OO) throws IOException {
            o0O000o0.OooO0OO part = oooO0OO;
            if (part != null) {
                o0O000o0.OooO00o oooO00o = o0000o00.f60551OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57823OooO0OO.add(part);
            }
        }
    }

    public static final class o000oOoO<T> extends o000000<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f60538OooO00o;

        public o000oOoO(Class<T> cls) {
            this.f60538OooO00o = cls;
        }

        @Override // retrofit2.o000000
        public final void OooO00o(o0000O00 o0000o00, @Nullable T t) {
            o0000o00.f60557OooO0o0.OooO(this.f60538OooO00o, t);
        }
    }

    public abstract void OooO00o(o0000O00 o0000o00, @Nullable T t) throws IOException;
}
