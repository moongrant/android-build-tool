package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public enum ToNumberPolicy implements o00oO0o {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.OooO00o
        @Override // com.google.gson.o00oO0o
        public final Number OooO00o(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.OooO0O0
        @Override // com.google.gson.o00oO0o
        public final Number OooO00o(JsonReader jsonReader) throws IOException {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.OooO0OO
        @Override // com.google.gson.o00oO0o
        public final Number OooO00o(JsonReader jsonReader) throws JsonParseException, IOException {
            String strNextString = jsonReader.nextString();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strNextString);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || jsonReader.isLenient()) {
                        return dValueOf;
                    }
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                }
            } catch (NumberFormatException e) {
                StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("Cannot parse ", strNextString, "; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonParseException(sbOooO00o.toString(), e);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.OooO0o
        @Override // com.google.gson.o00oO0o
        public final Number OooO00o(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("Cannot parse ", strNextString, "; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonParseException(sbOooO00o.toString(), e);
            }
        }
    };

    ToNumberPolicy() {
        throw null;
    }
}
