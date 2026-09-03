package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p386o0OOoo0O.oo00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ToNumberPolicy implements oo00o {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final ToNumberPolicy BIG_DECIMAL;
    public static final ToNumberPolicy DOUBLE;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final ToNumberPolicy LONG_OR_DOUBLE;

    public final enum OooO00o extends ToNumberPolicy {
        public OooO00o() {
            super("DOUBLE", 0, null);
        }

        @Override // p386o0OOoo0O.oo00o
        public final Number OooO00o(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        DOUBLE = oooO00o;
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.OooO0O0
            @Override // p386o0OOoo0O.oo00o
            public final Number OooO00o(JsonReader jsonReader) throws IOException {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.OooO0OO
            @Override // p386o0OOoo0O.oo00o
            public final Number OooO00o(JsonReader jsonReader) throws JsonParseException, IOException {
                String strNextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strNextString));
                    } catch (NumberFormatException e) {
                        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Cannot parse ", strNextString, "; at path ");
                        sbOooO0OO.append(jsonReader.getPreviousPath());
                        throw new JsonParseException(sbOooO0OO.toString(), e);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strNextString);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || jsonReader.isLenient()) {
                        return dValueOf;
                    }
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                }
            }
        };
        LONG_OR_DOUBLE = toNumberPolicy2;
        ToNumberPolicy toNumberPolicy3 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.OooO0o
            @Override // p386o0OOoo0O.oo00o
            public final Number OooO00o(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e) {
                    StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Cannot parse ", strNextString, "; at path ");
                    sbOooO0OO.append(jsonReader.getPreviousPath());
                    throw new JsonParseException(sbOooO0OO.toString(), e);
                }
            }
        };
        BIG_DECIMAL = toNumberPolicy3;
        $VALUES = new ToNumberPolicy[]{oooO00o, toNumberPolicy, toNumberPolicy2, toNumberPolicy3};
    }

    public ToNumberPolicy(String str, int i, OooO00o oooO00o) {
        super(str, i);
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }
}
