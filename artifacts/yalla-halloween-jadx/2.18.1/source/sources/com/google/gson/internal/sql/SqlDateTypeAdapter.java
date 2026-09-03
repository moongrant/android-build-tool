package com.google.gson.internal.sql;

import OooO0o.OooO0o;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class SqlDateTypeAdapter extends o00O0<Date> {
    public static final o00O0O00 FACTORY = new o00O0O00() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // p386o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            if (o00000o1.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // p386o0OOoo0O.o00O0
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
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("Failed parsing '", strNextString, "' as SQL Date; at path ");
            sbOooO0OO.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO0OO.toString(), e);
        }
    }

    @Override // p386o0OOoo0O.o00O0
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
