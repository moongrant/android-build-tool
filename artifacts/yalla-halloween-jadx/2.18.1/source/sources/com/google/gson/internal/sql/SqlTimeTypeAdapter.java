package com.google.gson.internal.sql;

import OooO0o.OooO0o;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class SqlTimeTypeAdapter extends o00O0<Time> {
    public static final o00O0O00 FACTORY = new o00O0O00() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // p386o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            if (o00000o1.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // p386o0OOoo0O.o00O0
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
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("Failed parsing '", strNextString, "' as SQL Time; at path ");
            sbOooO0OO.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO0OO.toString(), e);
        }
    }

    @Override // p386o0OOoo0O.o00O0
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
