package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000000O<T> {

    public static final class OooO<T> extends o000000O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61029OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61030OooO0O0;

        public OooO(Method method, int i) {
            this.f61029OooO00o = method;
            this.f61030OooO0O0 = i;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f61030OooO0O0;
            Method method = this.f61029OooO00o;
            if (map == null) {
                throw o0000OO0.OooOO0O(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000OO0.OooOO0O(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000OO0.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO00o("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                o0000ooVar.OooO0O0(str, value.toString());
            }
        }
    }

    public static final class OooO00o<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61031OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61032OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, oo00oO> f61033OooO0OO;

        public OooO00o(Method method, int i, retrofit2.OooOOOO<T, oo00oO> oooOOOO) {
            this.f61031OooO00o = method;
            this.f61032OooO0O0 = i;
            this.f61033OooO0OO = oooOOOO;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) {
            int i = this.f61032OooO0O0;
            Method method = this.f61031OooO00o;
            if (t == null) {
                throw o0000OO0.OooOO0O(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                o0000ooVar.f61130OooOO0O = this.f61033OooO0OO.convert(t);
            } catch (IOException e) {
                throw o0000OO0.OooOO0o(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class OooO0O0<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f61034OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, String> f61035OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f61036OooO0OO;

        public OooO0O0(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f61007OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f61034OooO00o = str;
            this.f61035OooO0O0 = oooO0o;
            this.f61036OooO0OO = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f61035OooO0O0.convert(t)) == null) {
                return;
            }
            o0000ooVar.OooO00o(this.f61034OooO00o, strConvert, this.f61036OooO0OO);
        }
    }

    public static final class OooO0OO<T> extends o000000O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61037OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61038OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f61039OooO0OO;

        public OooO0OO(Method method, int i, boolean z) {
            this.f61037OooO00o = method;
            this.f61038OooO0O0 = i;
            this.f61039OooO0OO = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f61038OooO0O0;
            Method method = this.f61037OooO00o;
            if (map == null) {
                throw o0000OO0.OooOO0O(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000OO0.OooOO0O(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000OO0.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO00o("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o0000OO0.OooOO0O(method, i, "Field map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0000ooVar.OooO00o(str, string, this.f61039OooO0OO);
            }
        }
    }

    public static final class OooO0o<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f61040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, String> f61041OooO0O0;

        public OooO0o(String str) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f61007OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f61040OooO00o = str;
            this.f61041OooO0O0 = oooO0o;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f61041OooO0O0.convert(t)) == null) {
                return;
            }
            o0000ooVar.OooO0O0(this.f61040OooO00o, strConvert);
        }
    }

    public static final class OooOO0 extends o000000O<oo0O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61042OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61043OooO0O0;

        public OooOO0(int i, Method method) {
            this.f61042OooO00o = method;
            this.f61043OooO0O0 = i;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable oo0O oo0o) throws IOException {
            oo0O headers = oo0o;
            if (headers == null) {
                int i = this.f61043OooO0O0;
                throw o0000OO0.OooOO0O(this.f61042OooO00o, i, "Headers parameter must not be null.", new Object[0]);
            }
            oo0O.OooO00o oooO00o = o0000ooVar.f61125OooO0o;
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(headers, "headers");
            int length = headers.f57369OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                oooO00o.OooO0O0(headers.OooO0OO(i2), headers.OooO0o0(i2));
            }
        }
    }

    public static final class OooOO0O<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61044OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61045OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo0O f61046OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, oo00oO> f61047OooO0Oo;

        public OooOO0O(Method method, int i, oo0O oo0o, retrofit2.OooOOOO<T, oo00oO> oooOOOO) {
            this.f61044OooO00o = method;
            this.f61045OooO0O0 = i;
            this.f61046OooO0OO = oo0o;
            this.f61047OooO0Oo = oooOOOO;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                oo00oO body = this.f61047OooO0Oo.convert(t);
                o00OOO0O.OooO00o oooO00o = o0000ooVar.f61120OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(body, "body");
                o00OOO0O.OooO0OO part = o00OOO0O.OooO0OO.OooO00o.OooO00o(this.f61046OooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57250OooO0OO.add(part);
            } catch (IOException e) {
                throw o0000OO0.OooOO0O(this.f61044OooO00o, this.f61045OooO0O0, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class OooOOO<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61048OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61049OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f61050OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, String> f61051OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f61052OooO0o0;

        public OooOOO(Method method, int i, String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f61007OooO00o;
            this.f61048OooO00o = method;
            this.f61049OooO0O0 = i;
            Objects.requireNonNull(str, "name == null");
            this.f61050OooO0OO = str;
            this.f61051OooO0Oo = oooO0o;
            this.f61052OooO0o0 = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException {
            String strOoooOO0;
            String str = this.f61050OooO0OO;
            if (t == null) {
                throw o0000OO0.OooOO0O(this.f61048OooO00o, this.f61049OooO0O0, p004OooO0oO.o000oOoO.OooO00o("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strConvert = this.f61051OooO0Oo.convert(t);
            if (o0000ooVar.f61123OooO0OO == null) {
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
                boolean z = this.f61052OooO0o0;
                int i2 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    p659o0oooO00.o00000O o00000o = new p659o0oooO00.o00000O();
                    o00000o.o000OOo(0, iCharCount, strConvert);
                    p659o0oooO00.o00000O o00000o2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strConvert.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (o00000o2 == null) {
                                    o00000o2 = new p659o0oooO00.o00000O();
                                }
                                o00000o2.o00000o0(iCodePointAt2);
                                while (!o00000o2.oo000o()) {
                                    int i3 = o00000o2.readByte() & UByte.MAX_VALUE;
                                    o00000o.o00O0O(37);
                                    char[] cArr = o0000oo.f61118OooOO0o;
                                    o00000o.o00O0O(cArr[(i3 >> 4) & 15]);
                                    o00000o.o00O0O(cArr[i3 & 15]);
                                }
                            } else {
                                o00000o.o00000o0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    strOoooOO0 = o00000o.OoooOO0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = o0000ooVar.f61123OooO0OO.replace("{" + str + "}", strOoooOO0);
            if (o0000oo.f61119OooOOO0.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strConvert));
            }
            o0000ooVar.f61123OooO0OO = strReplace;
        }
    }

    public static final class OooOOO0<T> extends o000000O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61053OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61054OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, oo00oO> f61055OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f61056OooO0Oo;

        public OooOOO0(Method method, int i, retrofit2.OooOOOO<T, oo00oO> oooOOOO, String str) {
            this.f61053OooO00o = method;
            this.f61054OooO0O0 = i;
            this.f61055OooO0OO = oooOOOO;
            this.f61056OooO0Oo = str;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f61054OooO0O0;
            Method method = this.f61053OooO00o;
            if (map == null) {
                throw o0000OO0.OooOO0O(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000OO0.OooOO0O(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000OO0.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO00o("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                oo0O oo0oOooO0OO = oo0O.OooO0O0.OooO0OO("Content-Disposition", p004OooO0oO.o000oOoO.OooO00o("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f61056OooO0Oo);
                oo00oO body = this.f61055OooO0OO.convert((T) value);
                o00OOO0O.OooO00o oooO00o = o0000ooVar.f61120OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(body, "body");
                o00OOO0O.OooO0OO part = o00OOO0O.OooO0OO.OooO00o.OooO00o(oo0oOooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57250OooO0OO.add(part);
            }
        }
    }

    public static final class OooOOOO<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f61057OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOOOO<T, String> f61058OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f61059OooO0OO;

        public OooOOOO(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f61007OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f61057OooO00o = str;
            this.f61058OooO0O0 = oooO0o;
            this.f61059OooO0OO = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f61058OooO0O0.convert(t)) == null) {
                return;
            }
            o0000ooVar.OooO0OO(this.f61057OooO00o, strConvert, this.f61059OooO0OO);
        }
    }

    public static final class OooOo<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f61060OooO00o;

        public OooOo(boolean z) {
            this.f61060OooO00o = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            o0000ooVar.OooO0OO(t.toString(), null, this.f61060OooO00o);
        }
    }

    public static final class OooOo00<T> extends o000000O<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61061OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61062OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f61063OooO0OO;

        public OooOo00(Method method, int i, boolean z) {
            this.f61061OooO00o = method;
            this.f61062OooO0O0 = i;
            this.f61063OooO0OO = z;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f61062OooO0O0;
            Method method = this.f61061OooO00o;
            if (map == null) {
                throw o0000OO0.OooOO0O(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o0000OO0.OooOO0O(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o0000OO0.OooOO0O(method, i, p004OooO0oO.o000oOoO.OooO00o("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o0000OO0.OooOO0O(method, i, "Query map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0000ooVar.OooO0OO(str, string, this.f61063OooO0OO);
            }
        }
    }

    public static final class Oooo0 extends o000000O<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f61064OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61065OooO0O0;

        public Oooo0(int i, Method method) {
            this.f61064OooO00o = method;
            this.f61065OooO0O0 = i;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable Object obj) {
            if (obj != null) {
                o0000ooVar.f61123OooO0OO = obj.toString();
            } else {
                int i = this.f61065OooO0O0;
                throw o0000OO0.OooOO0O(this.f61064OooO00o, i, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    public static final class Oooo000 extends o000000O<o00OOO0O.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f61066OooO00o = new Oooo000();

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable o00OOO0O.OooO0OO oooO0OO) throws IOException {
            o00OOO0O.OooO0OO part = oooO0OO;
            if (part != null) {
                o00OOO0O.OooO00o oooO00o = o0000ooVar.f61120OooO;
                oooO00o.getClass();
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o.f57250OooO0OO.add(part);
            }
        }
    }

    public static final class o000oOoO<T> extends o000000O<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f61067OooO00o;

        public o000oOoO(Class<T> cls) {
            this.f61067OooO00o = cls;
        }

        @Override // retrofit2.o000000O
        public final void OooO00o(o0000oo o0000ooVar, @Nullable T t) {
            o0000ooVar.f61126OooO0o0.OooO(this.f61067OooO00o, t);
        }
    }

    public abstract void OooO00o(o0000oo o0000ooVar, @Nullable T t) throws IOException;
}
