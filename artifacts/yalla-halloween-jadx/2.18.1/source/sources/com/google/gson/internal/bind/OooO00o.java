package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
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
import java.util.Objects;
import p384o0OOoo.OooOo00;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p387o0OOoo0o.o00O0OOO;
import p387o0OOoo0o.o00OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<T extends Date> extends o00O0<T> {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final OooO0O0<T> dateType;

    public static abstract class OooO0O0<T extends Date> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0<Date> f19247OooO0O0 = new C0155OooO00o(Date.class);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f19248OooO00o;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public class C0155OooO00o extends OooO0O0<Date> {
            public C0155OooO00o(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
            public final Date OooO0O0(Date date) {
                return date;
            }
        }

        public OooO0O0(Class<T> cls) {
            this.f19248OooO00o = cls;
        }

        public final o00O0O00 OooO00o(int i, int i2) {
            OooO00o oooO00o = new OooO00o(this, i, i2);
            Class<T> cls = this.f19248OooO00o;
            o00O0O00 o00o0o01 = TypeAdapters.f19271OooO00o;
            return new TypeAdapters.AnonymousClass31(cls, oooO00o);
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
                return OooOo00.OooO0O0(strNextString, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Failed parsing '", strNextString, "' as Date; at path ");
                sbOooO0OO.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0OO.toString(), e);
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DefaultDateTypeAdapter(");
            sbOooO0o0.append(((SimpleDateFormat) dateFormat).toPattern());
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("DefaultDateTypeAdapter(");
        sbOooO0o1.append(dateFormat.getClass().getSimpleName());
        sbOooO0o1.append(')');
        return sbOooO0o1.toString();
    }

    @Override // p386o0OOoo0O.o00O0
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) this.dateType.OooO0O0(deserializeToDate(jsonReader));
    }

    @Override // p386o0OOoo0O.o00O0
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
        Objects.requireNonNull(oooO0O0);
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
        Objects.requireNonNull(oooO0O0);
        this.dateType = oooO0O0;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (o00OOO0.OooO00o()) {
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
        Objects.requireNonNull(oooO0O0);
        this.dateType = oooO0O0;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (o00OOO0.OooO00o()) {
            arrayList.add(o00O0OOO.OooO0o(i, i2));
        }
    }
}
