package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p210o00o0oo.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final char[] f14734OooO0oO = {'u', 'l', 'l'};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final char[] f14735OooO0oo = {'r', 'u', 'e'};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final char[] f14733OooO = {'r', 'u', 'e', Typography.quote};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final char[] f14736OooOO0 = {'a', 'l', 's', 'e'};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final char[] f14737OooOO0O = {'a', 'l', 's', 'e', Typography.quote};

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f14738OooOO0o = {'\n'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO00o f14740OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO0O0 f14739OooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO0OO f14741OooOOOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0o f14742OooOOOo = new OooO0o();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO f14744OooOOo0 = new OooO();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final OooOO0 f14743OooOOo = new OooOO0();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final OooOO0O f14745OooOOoo = new OooOO0O();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooOOO0 f14746OooOo00 = new OooOOO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char[] f14747OooO00o = new char[1];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char[] f14748OooO0O0 = new char[32];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final char[] f14749OooO0OO = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StringBuilder f14750OooO0Oo = new StringBuilder(32);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f14752OooO0o0 = new StringBuilder(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Stack<Integer> f14751OooO0o = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(@NonNull String str) {
            super(str);
        }

        public ParseException(@NonNull String str, @NonNull Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@NonNull Throwable th) {
            super(th);
        }
    }

    public static final String OooO00o(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            for (int i2 = 0; i2 < i; i2++) {
                char c = cArr[i2];
                if (Character.isISOControl(c)) {
                    if (cArr2 != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 <= 0) {
                                if (cArr2[i3] == c) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c != '\"') {
                    if (c == '\\') {
                        z2 = !z2;
                        z = true;
                    }
                } else if (!z2) {
                    sb.append(cArr, 0, i2);
                    bufferedReader.reset();
                    bufferedReader.skip(i2 + 1);
                    return z ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                z2 = false;
            }
            sb.append(cArr, 0, i);
            bufferedReader.mark(cArr.length);
        }
    }

    @Nullable
    public final <O> ArrayList<O> OooO(BufferedReader bufferedReader, OooOOO<O> oooOOO) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == 'n') {
            OooOO0o(bufferedReader, f14734OooO0oO);
            return null;
        }
        if (cOooO0O0 != '[') {
            throw new ParseException("Expected start of array");
        }
        this.f14751OooO0o.push(5);
        ArrayList<O> arrayList = new ArrayList<>();
        while (true) {
            bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            char cOooO0O1 = OooO0O0(bufferedReader);
            if (cOooO0O1 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cOooO0O1 != ',') {
                if (cOooO0O1 == ']') {
                    OooOO0O(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(oooOOO.OooO00o(this, bufferedReader));
            }
        }
    }

    public final char OooO0O0(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.f14747OooO00o;
        if (bufferedReader.read(cArr) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(cArr[0])) {
            if (bufferedReader.read(cArr) == -1) {
                return (char) 0;
            }
        }
        return cArr[0];
    }

    public final int OooO0OO(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i2;
        char[] cArr = this.f14749OooO0OO;
        int iOooO0Oo = OooO0Oo(bufferedReader, cArr);
        if (iOooO0Oo == 0) {
            return 0;
        }
        if (iOooO0Oo <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        int i3 = c == '-' ? Integer.MIN_VALUE : -2147483647;
        int i4 = c == '-' ? 1 : 0;
        if (i4 < iOooO0Oo) {
            i2 = i4 + 1;
            int iDigit = Character.digit(cArr[i4], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i = -iDigit;
        } else {
            i = 0;
            i2 = i4;
        }
        while (i2 < iOooO0Oo) {
            int i5 = i2 + 1;
            int iDigit2 = Character.digit(cArr[i2], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i < -214748364) {
                throw new ParseException("Number too large");
            }
            int i6 = i * 10;
            if (i6 < i3 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i = i6 - iDigit2;
            i2 = i5;
        }
        if (i4 == 0) {
            return -i;
        }
        if (i2 > 1) {
            return i;
        }
        throw new ParseException("No digits to parse");
    }

    public final int OooO0Oo(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cOooO0O0 == ',') {
            throw new ParseException("Missing value");
        }
        if (cOooO0O0 == 'n') {
            OooOO0o(bufferedReader, f14734OooO0oO);
            return 0;
        }
        bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (cOooO0O0 == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c != '\"') {
                    if (c == '\\') {
                        z = !z;
                    }
                    i++;
                } else if (!z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return i;
                }
                z = false;
                i++;
            }
        } else {
            cArr[0] = cOooO0O0;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    @Nullable
    public final String OooO0o(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            return OooO00o(bufferedReader, cArr, sb, cArr2);
        }
        if (cOooO0O0 != 'n') {
            throw new ParseException("Expected string");
        }
        OooOO0o(bufferedReader, f14734OooO0oO);
        return null;
    }

    public final long OooO0o0(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int i;
        char[] cArr = this.f14749OooO0OO;
        int iOooO0Oo = OooO0Oo(bufferedReader, cArr);
        if (iOooO0Oo == 0) {
            return 0L;
        }
        if (iOooO0Oo <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        long j2 = c == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i2 = c == '-' ? 1 : 0;
        if (i2 < iOooO0Oo) {
            i = i2 + 1;
            int iDigit = Character.digit(cArr[i2], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j = -iDigit;
        } else {
            j = 0;
            i = i2;
        }
        while (i < iOooO0Oo) {
            int i3 = i + 1;
            int iDigit2 = Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j3 = j * 10;
            char[] cArr2 = cArr;
            long j4 = iDigit2;
            if (j3 < j2 + j4) {
                throw new ParseException("Number too large");
            }
            j = j3 - j4;
            i = i3;
            cArr = cArr2;
        }
        if (i2 == 0) {
            return -j;
        }
        if (i > 1) {
            return j;
        }
        throw new ParseException("No digits to parse");
    }

    @Nullable
    public final String OooO0oO(BufferedReader bufferedReader) throws ParseException, IOException {
        Stack<Integer> stack = this.f14751OooO0o;
        stack.push(2);
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            stack.push(3);
            String strOooO00o = OooO00o(bufferedReader, this.f14748OooO0O0, this.f14750OooO0Oo, null);
            OooOO0O(3);
            if (OooO0O0(bufferedReader) == ':') {
                return strOooO00o;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cOooO0O0 == ']') {
            OooOO0O(2);
            OooOO0O(1);
            OooOO0O(5);
            return null;
        }
        if (cOooO0O0 == '}') {
            OooOO0O(2);
            return null;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cOooO0O0);
        throw new ParseException(sb.toString());
    }

    @Nullable
    public final String OooO0oo(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        char cOooO0O0 = OooO0O0(bufferedReader);
        int i = 1;
        if (cOooO0O0 == '\"') {
            char[] cArr = this.f14747OooO00o;
            if (bufferedReader.read(cArr) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c = cArr[0];
            boolean z = false;
            while (true) {
                if (c == '\"') {
                    if (!z) {
                        break;
                    }
                    c = '\"';
                    z = true;
                }
                z = c == '\\' ? !z : false;
                if (bufferedReader.read(cArr) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c = cArr[0];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        } else {
            if (cOooO0O0 == ',') {
                throw new ParseException("Missing value");
            }
            Stack<Integer> stack = this.f14751OooO0o;
            if (cOooO0O0 == '[') {
                stack.push(5);
                bufferedReader.mark(32);
                if (OooO0O0(bufferedReader) == ']') {
                    OooOO0O(5);
                } else {
                    bufferedReader.reset();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i > 0) {
                        char cOooO0O1 = OooO0O0(bufferedReader);
                        if (cOooO0O1 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cOooO0O1)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cOooO0O1 == '\"') {
                            if (!z2) {
                                z3 = !z3;
                            }
                            cOooO0O1 = '\"';
                        }
                        if (cOooO0O1 == '[') {
                            if (!z3) {
                                i++;
                            }
                            cOooO0O1 = '[';
                        }
                        if (cOooO0O1 == ']' && !z3) {
                            i--;
                        }
                        z2 = (cOooO0O1 == '\\' && z3) ? !z2 : false;
                    }
                    OooOO0O(5);
                }
            } else if (cOooO0O0 != '{') {
                bufferedReader.reset();
                OooO0Oo(bufferedReader, this.f14749OooO0OO);
            } else {
                stack.push(1);
                bufferedReader.mark(32);
                char cOooO0O2 = OooO0O0(bufferedReader);
                if (cOooO0O2 == '}') {
                    OooOO0O(1);
                } else {
                    if (cOooO0O2 != '\"') {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(cOooO0O2);
                        throw new ParseException(sb.toString());
                    }
                    bufferedReader.reset();
                    OooO0oO(bufferedReader);
                    while (OooO0oo(bufferedReader) != null) {
                    }
                    OooOO0O(1);
                }
            }
        }
        char cOooO0O3 = OooO0O0(bufferedReader);
        if (cOooO0O3 == ',') {
            OooOO0O(2);
            return OooO0oO(bufferedReader);
        }
        if (cOooO0O3 == '}') {
            OooOO0O(2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(cOooO0O3);
        throw new ParseException(sb2.toString());
    }

    @Nullable
    public final <T extends FastJsonResponse> ArrayList<T> OooOO0(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArgumentList argumentList = (ArrayList<T>) new ArrayList();
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == ']') {
            OooOO0O(5);
            return argumentList;
        }
        if (cOooO0O0 == 'n') {
            OooOO0o(bufferedReader, f14734OooO0oO);
            OooOO0O(5);
            return null;
        }
        if (cOooO0O0 != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(cOooO0O0);
            throw new ParseException(sb.toString());
        }
        Stack<Integer> stack = this.f14751OooO0o;
        stack.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!OooOOO(bufferedReader, fastJsonResponseZad)) {
                    return argumentList;
                }
                argumentList.add(fastJsonResponseZad);
                char cOooO0O1 = OooO0O0(bufferedReader);
                if (cOooO0O1 != ',') {
                    if (cOooO0O1 == ']') {
                        OooOO0O(5);
                        return argumentList;
                    }
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(cOooO0O1);
                    throw new ParseException(sb2.toString());
                }
                if (OooO0O0(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                stack.push(1);
            } catch (IllegalAccessException e) {
                throw new ParseException("Error instantiating inner object", e);
            } catch (InstantiationException e2) {
                throw new ParseException("Error instantiating inner object", e2);
            }
        }
    }

    public final void OooOO0O(int i) throws ParseException {
        Stack<Integer> stack = this.f14751OooO0o;
        if (stack.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int iIntValue = stack.pop().intValue();
        if (iIntValue == i) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(iIntValue);
        throw new ParseException(sb2.toString());
    }

    public final void OooOO0o(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            char[] cArr2 = this.f14748OooO0O0;
            int i2 = bufferedReader.read(cArr2, 0, length - i);
            if (i2 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (cArr[i3 + i] != cArr2[i3]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0296  */
    /* JADX WARN: Code duplicated, block: B:136:0x029a  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:158:0x029c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOOO(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        String str;
        String str2;
        HashMap map;
        int i;
        String str3;
        char cOooO0O0;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strOooO0oO = OooO0oO(bufferedReader);
        boolean z = true;
        if (strOooO0oO == null) {
            OooOO0O(1);
            return false;
        }
        while (strOooO0oO != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strOooO0oO);
            if (field == null) {
                strOooO0oO = OooO0oo(bufferedReader);
            } else {
                Stack<Integer> stack = this.f14751OooO0o;
                stack.push(4);
                char[] cArr = f14738OooOO0o;
                char[] cArr2 = f14734OooO0oO;
                StringBuilder sb = this.f14752OooO0o0;
                char[] cArr3 = this.f14749OooO0OO;
                char[] cArr4 = this.f14748OooO0O0;
                StringBuilder sb2 = this.f14750OooO0Oo;
                boolean z2 = field.f14724OooO0o;
                int i2 = field.f14725OooO0o0;
                switch (i2) {
                    case 0:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zav(field, OooO(bufferedReader, f14740OooOOO0));
                        } else {
                            fastJsonResponse.zau(field, OooO0OO(bufferedReader));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb3 = new StringBuilder(55);
                                sb3.append("Expected end of object or field separator, but found: ");
                                sb3.append(cOooO0O0);
                                throw new ParseException(sb3.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 1:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zag(field, OooO(bufferedReader, f14745OooOOoo));
                        } else {
                            int iOooO0Oo = OooO0Oo(bufferedReader, cArr3);
                            fastJsonResponse.zae(field, iOooO0Oo == 0 ? null : new BigInteger(new String(cArr3, 0, iOooO0Oo)));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb4 = new StringBuilder(55);
                                sb4.append("Expected end of object or field separator, but found: ");
                                sb4.append(cOooO0O0);
                                throw new ParseException(sb4.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 2:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zay(field, OooO(bufferedReader, f14739OooOOO));
                        } else {
                            fastJsonResponse.zax(field, OooO0o0(bufferedReader));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb5 = new StringBuilder(55);
                                sb5.append("Expected end of object or field separator, but found: ");
                                sb5.append(cOooO0O0);
                                throw new ParseException(sb5.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 3:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zas(field, OooO(bufferedReader, f14741OooOOOO));
                        } else {
                            int iOooO0Oo2 = OooO0Oo(bufferedReader, cArr3);
                            fastJsonResponse.zaq(field, iOooO0Oo2 == 0 ? 0.0f : Float.parseFloat(new String(cArr3, 0, iOooO0Oo2)));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb6 = new StringBuilder(55);
                                sb6.append("Expected end of object or field separator, but found: ");
                                sb6.append(cOooO0O0);
                                throw new ParseException(sb6.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 4:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zao(field, OooO(bufferedReader, f14742OooOOOo));
                        } else {
                            int iOooO0Oo3 = OooO0Oo(bufferedReader, cArr3);
                            fastJsonResponse.zam(field, iOooO0Oo3 == 0 ? 0.0d : Double.parseDouble(new String(cArr3, 0, iOooO0Oo3)));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb7 = new StringBuilder(55);
                                sb7.append("Expected end of object or field separator, but found: ");
                                sb7.append(cOooO0O0);
                                throw new ParseException(sb7.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 5:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zac(field, OooO(bufferedReader, f14746OooOo00));
                        } else {
                            int iOooO0Oo4 = OooO0Oo(bufferedReader, cArr3);
                            fastJsonResponse.zaa(field, iOooO0Oo4 == 0 ? null : new BigDecimal(new String(cArr3, 0, iOooO0Oo4)));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb8 = new StringBuilder(55);
                                sb8.append("Expected end of object or field separator, but found: ");
                                sb8.append(cOooO0O0);
                                throw new ParseException(sb8.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 6:
                        str = null;
                        if (z2) {
                            fastJsonResponse.zaj(field, OooO(bufferedReader, f14744OooOOo0));
                        } else {
                            fastJsonResponse.zai(field, OooOOO0(bufferedReader, false));
                        }
                        str2 = str;
                        str3 = str2;
                        i = 4;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb9 = new StringBuilder(55);
                                sb9.append("Expected end of object or field separator, but found: ");
                                sb9.append(cOooO0O0);
                                throw new ParseException(sb9.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 7:
                        if (!z2) {
                            str = null;
                            fastJsonResponse.zaA(field, OooO0o(bufferedReader, cArr4, sb2, null));
                            str2 = str;
                            str3 = str2;
                            i = 4;
                            OooOO0O(i);
                            OooOO0O(2);
                            cOooO0O0 = OooO0O0(bufferedReader);
                            if (cOooO0O0 == ',') {
                                strOooO0oO = OooO0oO(bufferedReader);
                            } else {
                                if (cOooO0O0 != '}') {
                                    StringBuilder sb10 = new StringBuilder(55);
                                    sb10.append("Expected end of object or field separator, but found: ");
                                    sb10.append(cOooO0O0);
                                    throw new ParseException(sb10.toString());
                                }
                                strOooO0oO = str3;
                            }
                            z = true;
                        } else {
                            fastJsonResponse.zaC(field, OooO(bufferedReader, f14743OooOOo));
                            i = 4;
                            str3 = null;
                            OooOO0O(i);
                            OooOO0O(2);
                            cOooO0O0 = OooO0O0(bufferedReader);
                            if (cOooO0O0 == ',') {
                                strOooO0oO = OooO0oO(bufferedReader);
                            } else {
                                if (cOooO0O0 != '}') {
                                    StringBuilder sb11 = new StringBuilder(55);
                                    sb11.append("Expected end of object or field separator, but found: ");
                                    sb11.append(cOooO0O0);
                                    throw new ParseException(sb11.toString());
                                }
                                strOooO0oO = str3;
                            }
                            z = true;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(OooO0o(bufferedReader, cArr3, sb, cArr)));
                        i = 4;
                        str3 = null;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb12 = new StringBuilder(55);
                                sb12.append("Expected end of object or field separator, but found: ");
                                sb12.append(cOooO0O0);
                                throw new ParseException(sb12.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 9:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(OooO0o(bufferedReader, cArr3, sb, cArr)));
                        i = 4;
                        str3 = null;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb13 = new StringBuilder(55);
                                sb13.append("Expected end of object or field separator, but found: ");
                                sb13.append(cOooO0O0);
                                throw new ParseException(sb13.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 10:
                        char cOooO0O1 = OooO0O0(bufferedReader);
                        if (cOooO0O1 == 'n') {
                            OooOO0o(bufferedReader, cArr2);
                            map = null;
                        } else {
                            if (cOooO0O1 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            stack.push(1);
                            map = new HashMap();
                            while (true) {
                                char cOooO0O2 = OooO0O0(bufferedReader);
                                if (cOooO0O2 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cOooO0O2 == '\"') {
                                    String strOooO00o = OooO00o(bufferedReader, cArr4, sb2, null);
                                    if (OooO0O0(bufferedReader) != ':') {
                                        String strValueOf = String.valueOf(strOooO00o);
                                        throw new ParseException(strValueOf.length() != 0 ? "No map value found for key ".concat(strValueOf) : new String("No map value found for key "));
                                    }
                                    if (OooO0O0(bufferedReader) != '\"') {
                                        String strValueOf2 = String.valueOf(strOooO00o);
                                        throw new ParseException(strValueOf2.length() != 0 ? "Expected String value for key ".concat(strValueOf2) : new String("Expected String value for key "));
                                    }
                                    map.put(strOooO00o, OooO00o(bufferedReader, cArr4, sb2, null));
                                    char cOooO0O3 = OooO0O0(bufferedReader);
                                    if (cOooO0O3 != ',') {
                                        if (cOooO0O3 != '}') {
                                            StringBuilder sb14 = new StringBuilder(48);
                                            sb14.append("Unexpected character while parsing string map: ");
                                            sb14.append(cOooO0O3);
                                            throw new ParseException(sb14.toString());
                                        }
                                        OooOO0O(1);
                                    }
                                } else if (cOooO0O2 == '}') {
                                    OooOO0O(1);
                                }
                                i = 4;
                                str3 = null;
                                OooOO0O(i);
                                OooOO0O(2);
                                cOooO0O0 = OooO0O0(bufferedReader);
                                if (cOooO0O0 == ',') {
                                    strOooO0oO = OooO0oO(bufferedReader);
                                } else {
                                    if (cOooO0O0 != '}') {
                                        StringBuilder sb15 = new StringBuilder(55);
                                        sb15.append("Expected end of object or field separator, but found: ");
                                        sb15.append(cOooO0O0);
                                        throw new ParseException(sb15.toString());
                                    }
                                    strOooO0oO = str3;
                                }
                                z = true;
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        i = 4;
                        str3 = null;
                        OooOO0O(i);
                        OooOO0O(2);
                        cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == ',') {
                            strOooO0oO = OooO0oO(bufferedReader);
                        } else {
                            if (cOooO0O0 != '}') {
                                StringBuilder sb16 = new StringBuilder(55);
                                sb16.append("Expected end of object or field separator, but found: ");
                                sb16.append(cOooO0O0);
                                throw new ParseException(sb16.toString());
                            }
                            strOooO0oO = str3;
                        }
                        z = true;
                        break;
                    case 11:
                        String str4 = field.f14722OooO;
                        if (z2) {
                            char cOooO0O4 = OooO0O0(bufferedReader);
                            if (cOooO0O4 == 'n') {
                                OooOO0o(bufferedReader, cArr2);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, str4, null);
                                str2 = null;
                                str3 = str2;
                                i = 4;
                                OooOO0O(i);
                                OooOO0O(2);
                                cOooO0O0 = OooO0O0(bufferedReader);
                                if (cOooO0O0 == ',') {
                                    strOooO0oO = OooO0oO(bufferedReader);
                                } else {
                                    if (cOooO0O0 != '}') {
                                        StringBuilder sb17 = new StringBuilder(55);
                                        sb17.append("Expected end of object or field separator, but found: ");
                                        sb17.append(cOooO0O0);
                                        throw new ParseException(sb17.toString());
                                    }
                                    strOooO0oO = str3;
                                }
                                z = true;
                            } else {
                                stack.push(5);
                                if (cOooO0O4 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, str4, OooOO0(bufferedReader, field));
                                i = 4;
                                str3 = null;
                                OooOO0O(i);
                                OooOO0O(2);
                                cOooO0O0 = OooO0O0(bufferedReader);
                                if (cOooO0O0 == ',') {
                                    strOooO0oO = OooO0oO(bufferedReader);
                                } else {
                                    if (cOooO0O0 != '}') {
                                        StringBuilder sb18 = new StringBuilder(55);
                                        sb18.append("Expected end of object or field separator, but found: ");
                                        sb18.append(cOooO0O0);
                                        throw new ParseException(sb18.toString());
                                    }
                                    strOooO0oO = str3;
                                }
                                z = true;
                            }
                        } else {
                            char cOooO0O5 = OooO0O0(bufferedReader);
                            if (cOooO0O5 == 'n') {
                                OooOO0o(bufferedReader, cArr2);
                                fastJsonResponse.addConcreteTypeInternal(field, str4, null);
                                str2 = null;
                                str3 = str2;
                                i = 4;
                                OooOO0O(i);
                                OooOO0O(2);
                                cOooO0O0 = OooO0O0(bufferedReader);
                                if (cOooO0O0 == ',') {
                                    strOooO0oO = OooO0oO(bufferedReader);
                                } else {
                                    if (cOooO0O0 != '}') {
                                        StringBuilder sb19 = new StringBuilder(55);
                                        sb19.append("Expected end of object or field separator, but found: ");
                                        sb19.append(cOooO0O0);
                                        throw new ParseException(sb19.toString());
                                    }
                                    strOooO0oO = str3;
                                }
                                z = true;
                            } else {
                                stack.push(1);
                                if (cOooO0O5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    OooOOO(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, str4, fastJsonResponseZad);
                                    i = 4;
                                    str3 = null;
                                    OooOO0O(i);
                                    OooOO0O(2);
                                    cOooO0O0 = OooO0O0(bufferedReader);
                                    if (cOooO0O0 == ',') {
                                        strOooO0oO = OooO0oO(bufferedReader);
                                    } else {
                                        if (cOooO0O0 != '}') {
                                            StringBuilder sb110 = new StringBuilder(55);
                                            sb110.append("Expected end of object or field separator, but found: ");
                                            sb110.append(cOooO0O0);
                                            throw new ParseException(sb110.toString());
                                        }
                                        strOooO0oO = str3;
                                    }
                                    z = true;
                                } catch (IllegalAccessException e) {
                                    throw new ParseException("Error instantiating inner object", e);
                                } catch (InstantiationException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                        break;
                    default:
                        throw new ParseException(o0O0000O.OooO00o(30, "Invalid field type ", i2));
                }
            }
        }
        OooOO0O(z ? 1 : 0);
        return z;
    }

    public final boolean OooOOO0(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            return OooOOO0(bufferedReader, true);
        }
        if (cOooO0O0 == 'f') {
            OooOO0o(bufferedReader, z ? f14737OooOO0O : f14736OooOO0);
            return false;
        }
        if (cOooO0O0 == 'n') {
            OooOO0o(bufferedReader, f14734OooO0oO);
            return false;
        }
        if (cOooO0O0 == 't') {
            OooOO0o(bufferedReader, z ? f14733OooO : f14735OooO0oo);
            return true;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cOooO0O0);
        throw new ParseException(sb.toString());
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        Stack<Integer> stack = this.f14751OooO0o;
        try {
            try {
                stack.push(0);
                char cOooO0O0 = OooO0O0(bufferedReader);
                if (cOooO0O0 == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cOooO0O0 == '[') {
                    stack.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.f14722OooO, OooOO0(bufferedReader, value));
                } else {
                    if (cOooO0O0 != '{') {
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(cOooO0O0);
                        throw new ParseException(sb.toString());
                    }
                    stack.push(1);
                    OooOOO(bufferedReader, t);
                }
                OooOO0O(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
