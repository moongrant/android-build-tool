package com.google.gson.internal.sql;

import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlTimestampTypeAdapter extends o0ooOOo<Timestamp> {
    static final o0OOO0o FACTORY = new o0OOO0o() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.o0OOO0o
        public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            oooOOO0.getClass();
            return new SqlTimestampTypeAdapter(oooOOO0.OooO0o0(TypeToken.get(Date.class)));
        }
    };
    private final o0ooOOo<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(o0ooOOo<Date> o0ooooo) {
        this.dateTypeAdapter = o0ooooo;
    }

    @Override // com.google.gson.o0ooOOo
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
