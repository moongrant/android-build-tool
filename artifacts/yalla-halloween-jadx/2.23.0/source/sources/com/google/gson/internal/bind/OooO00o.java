package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.o00Oo0;
import com.google.gson.internal.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p004OooO0oO.o0OoOo0;
import p318o0O0oo0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o<T extends Date> extends o0ooOOo<T> {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final OooO0O0<T> dateType;

    public static abstract class OooO0O0<T extends Date> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C0261OooO00o f20647OooO0O0 = new C0261OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f20648OooO00o;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public class C0261OooO00o extends OooO0O0<Date> {
            public C0261OooO00o() {
                super(Date.class);
            }

            @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
            public final Date OooO0O0(Date date) {
                return date;
            }
        }

        public OooO0O0(Class<T> cls) {
            this.f20648OooO00o = cls;
        }

        public final o0OOO0o OooO00o(int i, int i2) {
            OooO00o oooO00o = new OooO00o(this, i, i2);
            o0OOO0o o0ooo0o2 = TypeAdapters.f20671OooO00o;
            return new TypeAdapters.AnonymousClass31(this.f20648OooO00o, oooO00o);
        }

        public abstract T OooO0O0(Date date);
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
                return OooOOOO.OooO0O0(strNextString, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbOooO00o = o0OoOo0.OooO00o("Failed parsing '", strNextString, "' as Date; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString(), e);
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.o0ooOOo
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) this.dateType.OooO0O0(deserializeToDate(jsonReader));
    }

    @Override // com.google.gson.o0ooOOo
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

    private OooO00o(OooO0O0<T> oooO0O0, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        oooO0O0.getClass();
        this.dateType = oooO0O0;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private OooO00o(OooO0O0<T> oooO0O0, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        oooO0O0.getClass();
        this.dateType = oooO0O0;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (o00Oo0.f20701OooO00o >= 9) {
            if (i == 0) {
                str = "EEEE, MMMM d, y";
            } else if (i == 1) {
                str = "MMMM d, y";
            } else if (i == 2) {
                str = "MMM d, y";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown DateFormat style: ", i));
                }
                str = "M/d/yy";
            }
            arrayList.add(new SimpleDateFormat(str, locale));
        }
    }

    private OooO00o(OooO0O0<T> oooO0O0, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        oooO0O0.getClass();
        this.dateType = oooO0O0;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (o00Oo0.f20701OooO00o >= 9) {
            arrayList.add(o00oO0o.OooO00o(i, i2));
        }
    }
}
