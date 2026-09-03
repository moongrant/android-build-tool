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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlTimeTypeAdapter extends o0OOO0o<Time> {
    static final o0Oo0oo FACTORY = new o0Oo0oo() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.o0OOO0o
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.format.parse(strNextString).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as SQL Time; at path ");
            sbOooO0O0.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO0O0.toString(), e);
        }
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((Date) time);
        }
        jsonWriter.value(str);
    }
}
