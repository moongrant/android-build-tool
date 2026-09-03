package com.google.gson.internal.sql;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class SqlTimestampTypeAdapter extends o00O0<Timestamp> {
    public static final o00O0O00 FACTORY = new o00O0O00() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // p386o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            if (o00000o1.getRawType() != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(o000ooo1);
            return new SqlTimestampTypeAdapter(o000ooo1.OooO0o0(o00000O0.get(Date.class)));
        }
    };
    private final o00O0<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(o00O0<Date> o00o1) {
        this.dateTypeAdapter = o00o1;
    }

    @Override // p386o0OOoo0O.o00O0
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
