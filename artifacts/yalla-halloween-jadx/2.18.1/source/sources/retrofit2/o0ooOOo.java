package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0ooOOo<T> {

    public static final class OooO<T> extends o0ooOOo<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53866OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53867OooO0O0;

        public OooO(Method method, int i) {
            this.f53866OooO00o = method;
            this.f53867OooO0O0 = i;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw o000000.OooOO0O(this.f53866OooO00o, this.f53867OooO0O0, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o000000.OooOO0O(this.f53866OooO00o, this.f53867OooO0O0, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o000000.OooOO0O(this.f53866OooO00o, this.f53867OooO0O0, OooO0o.OooO0OO.OooO00o("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                o0oo0oo2.OooO0O0(str, value.toString());
            }
        }
    }

    public static final class OooO00o<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53869OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOO0<T, o0o0Oo> f53870OooO0OO;

        public OooO00o(Method method, int i, retrofit2.OooOO0<T, o0o0Oo> oooOO1) {
            this.f53868OooO00o = method;
            this.f53869OooO0O0 = i;
            this.f53870OooO0OO = oooOO1;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) {
            if (t == null) {
                throw o000000.OooOO0O(this.f53868OooO00o, this.f53869OooO0O0, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                o0oo0oo2.f53862OooOO0O = this.f53870OooO0OO.OooO00o(t);
            } catch (IOException e) {
                throw o000000.OooOO0o(this.f53868OooO00o, e, this.f53869OooO0O0, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class OooO0O0<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f53871OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOO0<T, String> f53872OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f53873OooO0OO;

        public OooO0O0(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f53738OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f53871OooO00o = str;
            this.f53872OooO0O0 = oooO0o;
            this.f53873OooO0OO = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException {
            String strOooO00o;
            if (t == null || (strOooO00o = this.f53872OooO0O0.OooO00o(t)) == null) {
                return;
            }
            o0oo0oo2.OooO00o(this.f53871OooO00o, strOooO00o, this.f53873OooO0OO);
        }
    }

    public static final class OooO0OO<T> extends o0ooOOo<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53874OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53875OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f53876OooO0OO;

        public OooO0OO(Method method, int i, boolean z) {
            this.f53874OooO00o = method;
            this.f53875OooO0O0 = i;
            this.f53876OooO0OO = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw o000000.OooOO0O(this.f53874OooO00o, this.f53875OooO0O0, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o000000.OooOO0O(this.f53874OooO00o, this.f53875OooO0O0, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o000000.OooOO0O(this.f53874OooO00o, this.f53875OooO0O0, OooO0o.OooO0OO.OooO00o("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o000000.OooOO0O(this.f53874OooO00o, this.f53875OooO0O0, "Field map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0oo0oo2.OooO00o(str, string, this.f53876OooO0OO);
            }
        }
    }

    public static final class OooO0o<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f53877OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOO0<T, String> f53878OooO0O0;

        public OooO0o(String str) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f53738OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f53877OooO00o = str;
            this.f53878OooO0O0 = oooO0o;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException {
            String strOooO00o;
            if (t == null || (strOooO00o = this.f53878OooO0O0.OooO00o(t)) == null) {
                return;
            }
            o0oo0oo2.OooO0O0(this.f53877OooO00o, strOooO00o);
        }
    }

    public static final class OooOO0 extends o0ooOOo<o00O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53879OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53880OooO0O0;

        public OooOO0(Method method, int i) {
            this.f53879OooO00o = method;
            this.f53880OooO0O0 = i;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable o00O o00o2) throws IOException {
            o00O headers = o00o2;
            if (headers == null) {
                throw o000000.OooOO0O(this.f53879OooO00o, this.f53880OooO0O0, "Headers parameter must not be null.", new Object[0]);
            }
            o00O.OooO00o oooO00o = o0oo0oo2.f53857OooO0o;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(headers, "headers");
            int length = headers.f51230Oooo0o.length / 2;
            for (int i = 0; i < length; i++) {
                oooO00o.OooO0OO(headers.OooO0O0(i), headers.OooO0o0(i));
            }
        }
    }

    public static final class OooOO0O<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53881OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53882OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O f53883OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOO0<T, o0o0Oo> f53884OooO0Oo;

        public OooOO0O(Method method, int i, o00O o00o2, retrofit2.OooOO0<T, o0o0Oo> oooOO1) {
            this.f53881OooO00o = method;
            this.f53882OooO0O0 = i;
            this.f53883OooO0OO = o00o2;
            this.f53884OooO0Oo = oooOO1;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                o0o0Oo body = this.f53884OooO0Oo.OooO00o(t);
                o00O o00o2 = this.f53883OooO0OO;
                o00OO0OO.OooO00o oooO00o = o0oo0oo2.f53852OooO;
                Objects.requireNonNull(oooO00o);
                Intrinsics.checkNotNullParameter(body, "body");
                oooO00o.OooO00o(o00OO0OO.OooO0OO.f51419OooO0OO.OooO00o(o00o2, body));
            } catch (IOException e) {
                throw o000000.OooOO0O(this.f53881OooO00o, this.f53882OooO0O0, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class OooOOO<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53885OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53886OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f53887OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooOO0<T, String> f53888OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f53889OooO0o0;

        public OooOOO(Method method, int i, String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f53738OooO00o;
            this.f53885OooO00o = method;
            this.f53886OooO0O0 = i;
            Objects.requireNonNull(str, "name == null");
            this.f53887OooO0OO = str;
            this.f53888OooO0Oo = oooO0o;
            this.f53889OooO0o0 = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException {
            String strOooo0o;
            if (t == null) {
                throw o000000.OooOO0O(this.f53885OooO00o, this.f53886OooO0O0, p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Path parameter \""), this.f53887OooO0OO, "\" value must not be null."), new Object[0]);
            }
            String str = this.f53887OooO0OO;
            String strOooO00o = this.f53888OooO0Oo.OooO00o(t);
            boolean z = this.f53889OooO0o0;
            if (o0oo0oo2.f53855OooO0OO == null) {
                throw new AssertionError();
            }
            int length = strOooO00o.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strOooo0o = strOooO00o;
                    break;
                }
                int iCodePointAt = strOooO00o.codePointAt(iCharCount);
                int i = -1;
                int i2 = 127;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    o0oOO o0ooo2 = new o0oOO();
                    o0ooo2.o00oO0O(strOooO00o, 0, iCharCount);
                    o0oOO o0ooo3 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strOooO00o.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= i2 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i || (!z && (iCodePointAt2 == 47 || iCodePointAt2 == 37))) {
                                if (o0ooo3 == null) {
                                    o0ooo3 = new o0oOO();
                                }
                                o0ooo3.oo0o0Oo(iCodePointAt2);
                                while (!o0ooo3.OooOooo()) {
                                    int i3 = o0ooo3.readByte() & UByte.MAX_VALUE;
                                    o0ooo2.Ooooo0o(37);
                                    char[] cArr = o0Oo0oo.f53850OooOO0o;
                                    o0ooo2.Ooooo0o(cArr[(i3 >> 4) & 15]);
                                    o0ooo2.Ooooo0o(cArr[i3 & 15]);
                                }
                            } else {
                                o0ooo2.oo0o0Oo(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = -1;
                        i2 = 127;
                    }
                    strOooo0o = o0ooo2.Oooo0o();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = o0oo0oo2.f53855OooO0OO.replace("{" + str + "}", strOooo0o);
            if (o0Oo0oo.f53851OooOOO0.matcher(strReplace).matches()) {
                throw new IllegalArgumentException(p016OooOoO0.OooOo00.OooO0Oo("@Path parameters shouldn't perform path traversal ('.' or '..'): ", strOooO00o));
            }
            o0oo0oo2.f53855OooO0OO = strReplace;
        }
    }

    public static final class OooOOO0<T> extends o0ooOOo<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53890OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53891OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final retrofit2.OooOO0<T, o0o0Oo> f53892OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f53893OooO0Oo;

        public OooOOO0(Method method, int i, retrofit2.OooOO0<T, o0o0Oo> oooOO1, String str) {
            this.f53890OooO00o = method;
            this.f53891OooO0O0 = i;
            this.f53892OooO0OO = oooOO1;
            this.f53893OooO0Oo = str;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) throws IOException, CloneNotSupportedException {
            Map map = (Map) obj;
            if (map == null) {
                throw o000000.OooOO0O(this.f53890OooO00o, this.f53891OooO0O0, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o000000.OooOO0O(this.f53890OooO00o, this.f53891OooO0O0, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o000000.OooOO0O(this.f53890OooO00o, this.f53891OooO0O0, OooO0o.OooO0OO.OooO00o("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                o00O o00oOooO0OO = o00O.f51229Oooo0oO.OooO0OO("Content-Disposition", OooO0o.OooO0OO.OooO00o("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f53893OooO0Oo);
                o0o0Oo body = this.f53892OooO0OO.OooO00o((T) value);
                o00OO0OO.OooO00o oooO00o = o0oo0oo2.f53852OooO;
                Objects.requireNonNull(oooO00o);
                Intrinsics.checkNotNullParameter(body, "body");
                oooO00o.OooO00o(o00OO0OO.OooO0OO.f51419OooO0OO.OooO00o(o00oOooO0OO, body));
            }
        }
    }

    public static final class OooOOOO<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f53894OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final retrofit2.OooOO0<T, String> f53895OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f53896OooO0OO;

        public OooOOOO(String str, boolean z) {
            retrofit2.OooO00o.OooO0o oooO0o = retrofit2.OooO00o.OooO0o.f53738OooO00o;
            Objects.requireNonNull(str, "name == null");
            this.f53894OooO00o = str;
            this.f53895OooO0O0 = oooO0o;
            this.f53896OooO0OO = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException {
            String strOooO00o;
            if (t == null || (strOooO00o = this.f53895OooO0O0.OooO00o(t)) == null) {
                return;
            }
            o0oo0oo2.OooO0OO(this.f53894OooO00o, strOooO00o, this.f53896OooO0OO);
        }
    }

    public static final class OooOo<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f53897OooO00o;

        public OooOo(boolean z) {
            this.f53897OooO00o = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            o0oo0oo2.OooO0OO(t.toString(), null, this.f53897OooO00o);
        }
    }

    public static final class OooOo00<T> extends o0ooOOo<Map<String, T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53898OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53899OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f53900OooO0OO;

        public OooOo00(Method method, int i, boolean z) {
            this.f53898OooO00o = method;
            this.f53899OooO0O0 = i;
            this.f53900OooO0OO = z;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw o000000.OooOO0O(this.f53898OooO00o, this.f53899OooO0O0, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw o000000.OooOO0O(this.f53898OooO00o, this.f53899OooO0O0, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw o000000.OooOO0O(this.f53898OooO00o, this.f53899OooO0O0, OooO0o.OooO0OO.OooO00o("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw o000000.OooOO0O(this.f53898OooO00o, this.f53899OooO0O0, "Query map value '" + value + "' converted to null by " + retrofit2.OooO00o.OooO0o.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                o0oo0oo2.OooO0OO(str, string, this.f53900OooO0OO);
            }
        }
    }

    public static final class Oooo0 extends o0ooOOo<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f53901OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53902OooO0O0;

        public Oooo0(Method method, int i) {
            this.f53901OooO00o = method;
            this.f53902OooO0O0 = i;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable Object obj) {
            if (obj == null) {
                throw o000000.OooOO0O(this.f53901OooO00o, this.f53902OooO0O0, "@Url parameter is null.", new Object[0]);
            }
            o0oo0oo2.f53855OooO0OO = obj.toString();
        }
    }

    public static final class Oooo000 extends o0ooOOo<o00OO0OO.OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f53903OooO00o = new Oooo000();

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable o00OO0OO.OooO0OO oooO0OO) throws IOException {
            o00OO0OO.OooO0OO oooO0OO2 = oooO0OO;
            if (oooO0OO2 != null) {
                o0oo0oo2.f53852OooO.OooO00o(oooO0OO2);
            }
        }
    }

    public static final class o000oOoO<T> extends o0ooOOo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f53904OooO00o;

        public o000oOoO(Class<T> cls) {
            this.f53904OooO00o = cls;
        }

        @Override // retrofit2.o0ooOOo
        public final void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) {
            o0oo0oo2.f53858OooO0o0.OooOO0(this.f53904OooO00o, t);
        }
    }

    public abstract void OooO00o(o0Oo0oo o0oo0oo2, @Nullable T t) throws IOException;
}
