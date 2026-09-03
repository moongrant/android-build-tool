package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends o0ooOOo<Date> {
    static final o0OOO0o FACTORY = new o0OOO0o() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.o0OOO0o
        public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.o0ooOOo
    public Date read(JsonReader jsonReader) throws IOException {
        java.util.Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                date = this.format.parse(strNextString);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("Failed parsing '", strNextString, "' as SQL Date; at path ");
            sbOooO00o.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO00o.toString(), e);
        }
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }
}
