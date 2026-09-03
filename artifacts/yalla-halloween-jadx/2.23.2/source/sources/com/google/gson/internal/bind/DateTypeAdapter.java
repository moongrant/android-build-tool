package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.internal.o00Ooo;
import com.google.gson.internal.o0ooOOo;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p004OooO0oO.o0OoOo0;
import p324o0O0ooO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTypeAdapter extends o0OOO0o<Date> {
    public static final o0Oo0oo FACTORY = new o0Oo0oo() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> dateFormats;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o00Ooo.f20228OooO00o >= 9) {
            arrayList.add(o0ooOOo.OooO00o(2, 2));
        }
    }

    private Date deserializeToDate(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        synchronized (this.dateFormats) {
            Iterator<DateFormat> it = this.dateFormats.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(strNextString);
                } catch (ParseException unused) {
                }
            }
            try {
                return oo0o0Oo.OooO0O0(strNextString, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as Date; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString(), e);
            }
        }
    }

    @Override // com.google.gson.o0OOO0o
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return deserializeToDate(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.dateFormats.get(0);
        synchronized (this.dateFormats) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }
}
