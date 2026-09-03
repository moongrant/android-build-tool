package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
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
public final class SqlDateTypeAdapter extends o0OOO0o<Date> {
    static final o0Oo0oo FACTORY = new o0Oo0oo() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
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

    @Override // com.google.gson.o0OOO0o
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
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as SQL Date; at path ");
            sbOooO0O0.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO0O0.toString(), e);
        }
    }

    @Override // com.google.gson.o0OOO0o
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
