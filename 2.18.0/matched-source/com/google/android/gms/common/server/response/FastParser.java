package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import p266o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final char[] f15728OooO0oO = {'u', 'l', 'l'};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final char[] f15729OooO0oo = {'r', 'u', 'e'};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final char[] f15727OooO = {'r', 'u', 'e', Typography.quote};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final char[] f15730OooOO0 = {'a', 'l', 's', 'e'};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final char[] f15731OooOO0O = {'a', 'l', 's', 'e', Typography.quote};

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f15732OooOO0o = {'\n'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooOOO<Integer> f15734OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooOOO<Long> f15733OooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooOOO<Float> f15735OooOOOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooOOO<Double> f15736OooOOOo = new OooO0o();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooOOO<Boolean> f15738OooOOo0 = new OooO();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final OooOOO<String> f15737OooOOo = new OooOO0();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final OooOOO<BigInteger> f15739OooOOoo = new OooOO0O();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooOOO<BigDecimal> f15740OooOo00 = new OooOOO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char[] f15741OooO00o = new char[1];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char[] f15742OooO0O0 = new char[32];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final char[] f15743OooO0OO = new char[1024];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StringBuilder f15744OooO0Oo = new StringBuilder(32);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final StringBuilder f15746OooO0o0 = new StringBuilder(1024);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Stack<Integer> f15745OooO0o = new Stack<>();

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
    public final String OooO(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f15745OooO0o.push(2);
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            this.f15745OooO0o.push(3);
            String strOooO00o = OooO00o(bufferedReader, this.f15742OooO0O0, this.f15744OooO0Oo, null);
            OooOOOO(3);
            if (OooO0O0(bufferedReader) == ':') {
                return strOooO00o;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cOooO0O0 == ']') {
            OooOOOO(2);
            OooOOOO(1);
            OooOOOO(5);
            return null;
        }
        if (cOooO0O0 == '}') {
            OooOOOO(2);
            return null;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cOooO0O0);
        throw new ParseException(sb.toString());
    }

    public final char OooO0O0(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.f15741OooO00o) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.f15741OooO00o[0])) {
            if (bufferedReader.read(this.f15741OooO00o) == -1) {
                return (char) 0;
            }
        }
        return this.f15741OooO00o[0];
    }

    public final double OooO0OO(BufferedReader bufferedReader) throws ParseException, IOException {
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        if (iOooO0o == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f15743OooO0OO, 0, iOooO0o));
    }

    public final float OooO0Oo(BufferedReader bufferedReader) throws ParseException, IOException {
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        return iOooO0o == 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : Float.parseFloat(new String(this.f15743OooO0OO, 0, iOooO0o));
    }

    public final int OooO0o(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cOooO0O0 == ',') {
            throw new ParseException("Missing value");
        }
        if (cOooO0O0 == 'n') {
            OooOOOo(bufferedReader, f15728OooO0oO);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cOooO0O0 == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c != '\"') {
                    z = c == '\\' ? !z : false;
                    i++;
                } else if (!z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return i;
                }
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

    public final int OooO0o0(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i2;
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        if (iOooO0o == 0) {
            return 0;
        }
        char[] cArr = this.f15743OooO0OO;
        if (iOooO0o <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        int i3 = c == '-' ? Integer.MIN_VALUE : -2147483647;
        int i4 = c == '-' ? 1 : 0;
        if (i4 < iOooO0o) {
            i = i4 + 1;
            int iDigit = Character.digit(cArr[i4], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i2 = -iDigit;
        } else {
            i = i4;
            i2 = 0;
        }
        while (i < iOooO0o) {
            int i5 = i + 1;
            int iDigit2 = Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i2 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i6 = i2 * 10;
            if (i6 < i3 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i2 = i6 - iDigit2;
            i = i5;
        }
        if (i4 == 0) {
            return -i2;
        }
        if (i > 1) {
            return i2;
        }
        throw new ParseException("No digits to parse");
    }

    public final long OooO0oO(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int i;
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        if (iOooO0o == 0) {
            return 0L;
        }
        char[] cArr = this.f15743OooO0OO;
        if (iOooO0o <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        long j2 = c == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i2 = c == '-' ? 1 : 0;
        if (i2 < iOooO0o) {
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
        while (i < iOooO0o) {
            int i3 = i + 1;
            int iDigit2 = Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j3 = j * 10;
            long j4 = iDigit2;
            if (j3 < j2 + j4) {
                throw new ParseException("Number too large");
            }
            j = j3 - j4;
            i = i3;
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
    public final String OooO0oo(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            return OooO00o(bufferedReader, cArr, sb, cArr2);
        }
        if (cOooO0O0 != 'n') {
            throw new ParseException("Expected string");
        }
        OooOOOo(bufferedReader, f15728OooO0oO);
        return null;
    }

    @Nullable
    public final String OooOO0(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cOooO0O0 = OooO0O0(bufferedReader);
        int i = 1;
        if (cOooO0O0 != '\"') {
            if (cOooO0O0 == ',') {
                throw new ParseException("Missing value");
            }
            if (cOooO0O0 == '[') {
                this.f15745OooO0o.push(5);
                bufferedReader.mark(32);
                if (OooO0O0(bufferedReader) != ']') {
                    bufferedReader.reset();
                    boolean z = false;
                    loop1: while (true) {
                        boolean z2 = false;
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
                                    z = !z;
                                }
                                cOooO0O1 = Typography.quote;
                            }
                            if (cOooO0O1 == '[') {
                                if (!z) {
                                    i++;
                                }
                                cOooO0O1 = '[';
                            }
                            if (cOooO0O1 == ']' && !z) {
                                i--;
                            }
                            if (cOooO0O1 == '\\' && z) {
                                z2 = !z2;
                            }
                        }
                        OooOOOO(5);
                        break loop1;
                    }
                } else {
                    OooOOOO(5);
                }
            } else if (cOooO0O0 != '{') {
                bufferedReader.reset();
                OooO0o(bufferedReader, this.f15743OooO0OO);
            } else {
                this.f15745OooO0o.push(1);
                bufferedReader.mark(32);
                char cOooO0O2 = OooO0O0(bufferedReader);
                if (cOooO0O2 == '}') {
                    OooOOOO(1);
                } else {
                    if (cOooO0O2 != '\"') {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(cOooO0O2);
                        throw new ParseException(sb.toString());
                    }
                    bufferedReader.reset();
                    OooO(bufferedReader);
                    while (OooOO0(bufferedReader) != null) {
                    }
                    OooOOOO(1);
                }
            }
        } else {
            if (bufferedReader.read(this.f15741OooO00o) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c = this.f15741OooO00o[0];
            boolean z3 = false;
            while (true) {
                if (c == '\"') {
                    if (!z3) {
                        break;
                    }
                    c = Typography.quote;
                    z3 = true;
                }
                z3 = c == '\\' ? !z3 : false;
                if (bufferedReader.read(this.f15741OooO00o) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c = this.f15741OooO00o[0];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cOooO0O3 = OooO0O0(bufferedReader);
        if (cOooO0O3 == ',') {
            OooOOOO(2);
            return OooO(bufferedReader);
        }
        if (cOooO0O3 == '}') {
            OooOOOO(2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(cOooO0O3);
        throw new ParseException(sb2.toString());
    }

    @Nullable
    public final BigDecimal OooOO0O(BufferedReader bufferedReader) throws ParseException, IOException {
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        if (iOooO0o == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f15743OooO0OO, 0, iOooO0o));
    }

    @Nullable
    public final BigInteger OooOO0o(BufferedReader bufferedReader) throws ParseException, IOException {
        int iOooO0o = OooO0o(bufferedReader, this.f15743OooO0OO);
        if (iOooO0o == 0) {
            return null;
        }
        return new BigInteger(new String(this.f15743OooO0OO, 0, iOooO0o));
    }

    @Nullable
    public final <T extends FastJsonResponse> ArrayList<T> OooOOO(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArgumentList argumentList = (ArrayList<T>) new ArrayList();
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == ']') {
            OooOOOO(5);
            return argumentList;
        }
        if (cOooO0O0 == 'n') {
            OooOOOo(bufferedReader, f15728OooO0oO);
            OooOOOO(5);
            return null;
        }
        if (cOooO0O0 != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(cOooO0O0);
            throw new ParseException(sb.toString());
        }
        this.f15745OooO0o.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!OooOOo(bufferedReader, fastJsonResponseZad)) {
                    return argumentList;
                }
                argumentList.add(fastJsonResponseZad);
                char cOooO0O1 = OooO0O0(bufferedReader);
                if (cOooO0O1 != ',') {
                    if (cOooO0O1 == ']') {
                        OooOOOO(5);
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
                this.f15745OooO0o.push(1);
            } catch (IllegalAccessException e) {
                throw new ParseException("Error instantiating inner object", e);
            } catch (InstantiationException e2) {
                throw new ParseException("Error instantiating inner object", e2);
            }
        }
    }

    @Nullable
    public final <O> ArrayList<O> OooOOO0(BufferedReader bufferedReader, OooOOO<O> oooOOO) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == 'n') {
            OooOOOo(bufferedReader, f15728OooO0oO);
            return null;
        }
        if (cOooO0O0 != '[') {
            throw new ParseException("Expected start of array");
        }
        this.f15745OooO0o.push(5);
        ArrayList<O> arrayList = new ArrayList<>();
        while (true) {
            bufferedReader.mark(1024);
            char cOooO0O1 = OooO0O0(bufferedReader);
            if (cOooO0O1 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cOooO0O1 != ',') {
                if (cOooO0O1 == ']') {
                    OooOOOO(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(oooOOO.OooO00o(this, bufferedReader));
            }
        }
    }

    public final void OooOOOO(int i) throws ParseException {
        if (this.f15745OooO0o.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int iIntValue = this.f15745OooO0o.pop().intValue();
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

    public final void OooOOOo(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int i2 = bufferedReader.read(this.f15742OooO0O0, 0, length - i);
            if (i2 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (cArr[i3 + i] != this.f15742OooO0O0[i3]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOOo(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        HashMap map;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strOooO = OooO(bufferedReader);
        if (strOooO == null) {
            OooOOOO(1);
            return false;
        }
        while (strOooO != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strOooO);
            if (field == null) {
                strOooO = OooOO0(bufferedReader);
            } else {
                this.f15745OooO0o.push(4);
                int i = field.f15719OoooO00;
                switch (i) {
                    case 0:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zau(field, OooO0o0(bufferedReader));
                        } else {
                            fastJsonResponse.zav(field, OooOOO0(bufferedReader, f15734OooOOO0));
                        }
                        break;
                    case 1:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zae(field, OooOO0o(bufferedReader));
                        } else {
                            fastJsonResponse.zag(field, OooOOO0(bufferedReader, f15739OooOOoo));
                        }
                        break;
                    case 2:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zax(field, OooO0oO(bufferedReader));
                        } else {
                            fastJsonResponse.zay(field, OooOOO0(bufferedReader, f15733OooOOO));
                        }
                        break;
                    case 3:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zaq(field, OooO0Oo(bufferedReader));
                        } else {
                            fastJsonResponse.zas(field, OooOOO0(bufferedReader, f15735OooOOOO));
                        }
                        break;
                    case 4:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zam(field, OooO0OO(bufferedReader));
                        } else {
                            fastJsonResponse.zao(field, OooOOO0(bufferedReader, f15736OooOOOo));
                        }
                        break;
                    case 5:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zaa(field, OooOO0O(bufferedReader));
                        } else {
                            fastJsonResponse.zac(field, OooOOO0(bufferedReader, f15740OooOo00));
                        }
                        break;
                    case 6:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zai(field, OooOOo0(bufferedReader, false));
                        } else {
                            fastJsonResponse.zaj(field, OooOOO0(bufferedReader, f15738OooOOo0));
                        }
                        break;
                    case 7:
                        if (!field.f15718OoooO0) {
                            fastJsonResponse.zaA(field, OooO0oo(bufferedReader, this.f15742OooO0O0, this.f15744OooO0Oo, null));
                        } else {
                            fastJsonResponse.zaC(field, OooOOO0(bufferedReader, f15737OooOOo));
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(OooO0oo(bufferedReader, this.f15743OooO0OO, this.f15746OooO0o0, f15732OooOO0o)));
                        break;
                    case 9:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(OooO0oo(bufferedReader, this.f15743OooO0OO, this.f15746OooO0o0, f15732OooOO0o)));
                        break;
                    case 10:
                        char cOooO0O0 = OooO0O0(bufferedReader);
                        if (cOooO0O0 == 'n') {
                            OooOOOo(bufferedReader, f15728OooO0oO);
                            map = null;
                        } else {
                            if (cOooO0O0 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.f15745OooO0o.push(1);
                            map = new HashMap();
                            while (true) {
                                char cOooO0O1 = OooO0O0(bufferedReader);
                                if (cOooO0O1 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cOooO0O1 == '\"') {
                                    String strOooO00o = OooO00o(bufferedReader, this.f15742OooO0O0, this.f15744OooO0Oo, null);
                                    if (OooO0O0(bufferedReader) != ':') {
                                        String strValueOf = String.valueOf(strOooO00o);
                                        throw new ParseException(strValueOf.length() != 0 ? "No map value found for key ".concat(strValueOf) : new String("No map value found for key "));
                                    }
                                    if (OooO0O0(bufferedReader) != '\"') {
                                        String strValueOf2 = String.valueOf(strOooO00o);
                                        throw new ParseException(strValueOf2.length() != 0 ? "Expected String value for key ".concat(strValueOf2) : new String("Expected String value for key "));
                                    }
                                    map.put(strOooO00o, OooO00o(bufferedReader, this.f15742OooO0O0, this.f15744OooO0Oo, null));
                                    char cOooO0O2 = OooO0O0(bufferedReader);
                                    if (cOooO0O2 != ',') {
                                        if (cOooO0O2 != '}') {
                                            StringBuilder sb = new StringBuilder(48);
                                            sb.append("Unexpected character while parsing string map: ");
                                            sb.append(cOooO0O2);
                                            throw new ParseException(sb.toString());
                                        }
                                        OooOOOO(1);
                                    }
                                } else if (cOooO0O1 == '}') {
                                    OooOOOO(1);
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        break;
                    case 11:
                        if (field.f15718OoooO0) {
                            char cOooO0O3 = OooO0O0(bufferedReader);
                            if (cOooO0O3 == 'n') {
                                OooOOOo(bufferedReader, f15728OooO0oO);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.f15721OoooOO0, null);
                            } else {
                                this.f15745OooO0o.push(5);
                                if (cOooO0O3 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.f15721OoooOO0, OooOOO(bufferedReader, field));
                            }
                        } else {
                            char cOooO0O4 = OooO0O0(bufferedReader);
                            if (cOooO0O4 == 'n') {
                                OooOOOo(bufferedReader, f15728OooO0oO);
                                fastJsonResponse.addConcreteTypeInternal(field, field.f15721OoooOO0, null);
                            } else {
                                this.f15745OooO0o.push(1);
                                if (cOooO0O4 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    OooOOo(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.f15721OoooOO0, fastJsonResponseZad);
                                } catch (IllegalAccessException e) {
                                    throw new ParseException("Error instantiating inner object", e);
                                } catch (InstantiationException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                        break;
                    default:
                        throw new ParseException(Oooo0.OooO00o(30, "Invalid field type ", i));
                }
                OooOOOO(4);
                OooOOOO(2);
                char cOooO0O5 = OooO0O0(bufferedReader);
                if (cOooO0O5 == ',') {
                    strOooO = OooO(bufferedReader);
                } else {
                    if (cOooO0O5 != '}') {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Expected end of object or field separator, but found: ");
                        sb2.append(cOooO0O5);
                        throw new ParseException(sb2.toString());
                    }
                    strOooO = null;
                }
            }
        }
        OooOOOO(1);
        return true;
    }

    public final boolean OooOOo0(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char cOooO0O0 = OooO0O0(bufferedReader);
        if (cOooO0O0 == '\"') {
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            return OooOOo0(bufferedReader, true);
        }
        if (cOooO0O0 == 'f') {
            OooOOOo(bufferedReader, z ? f15731OooOO0O : f15730OooOO0);
            return false;
        }
        if (cOooO0O0 == 'n') {
            OooOOOo(bufferedReader, f15728OooO0oO);
            return false;
        }
        if (cOooO0O0 == 't') {
            OooOOOo(bufferedReader, z ? f15727OooO : f15729OooO0oo);
            return true;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cOooO0O0);
        throw new ParseException(sb.toString());
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f15745OooO0o.push(0);
                char cOooO0O0 = OooO0O0(bufferedReader);
                if (cOooO0O0 == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cOooO0O0 == '[') {
                    this.f15745OooO0o.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.f15721OoooOO0, OooOOO(bufferedReader, value));
                } else {
                    if (cOooO0O0 != '{') {
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(cOooO0O0);
                        throw new ParseException(sb.toString());
                    }
                    this.f15745OooO0o.push(1);
                    OooOOo(bufferedReader, t);
                }
                OooOOOO(0);
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
