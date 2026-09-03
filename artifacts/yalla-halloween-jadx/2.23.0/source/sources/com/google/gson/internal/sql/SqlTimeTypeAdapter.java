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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlTimeTypeAdapter extends o0ooOOo<Time> {
    static final o0OOO0o FACTORY = new o0OOO0o() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.o0OOO0o
        public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
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

    @Override // com.google.gson.o0ooOOo
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
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("Failed parsing '", strNextString, "' as SQL Time; at path ");
            sbOooO00o.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO00o.toString(), e);
        }
    }

    @Override // com.google.gson.o0ooOOo
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
