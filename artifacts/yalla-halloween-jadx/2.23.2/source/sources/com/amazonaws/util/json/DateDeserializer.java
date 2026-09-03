package com.amazonaws.util.json;

import com.google.gson.JsonParseException;
import com.google.gson.OooOo;
import com.google.gson.Oooo000;
import com.google.gson.o000oOoO;
import com.google.gson.o00Ooo;
import com.google.gson.o00oO0o;
import com.google.gson.oo000o;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DateDeserializer implements Oooo000<Date>, o00oO0o<Date> {
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    private SimpleDateFormat mSimpleDateFormat;

    public DateDeserializer(String[] strArr) {
        this.dateFormats = Arrays.asList(strArr);
    }

    @Override // com.google.gson.Oooo000
    public Date deserialize(o000oOoO o000oooo2, Type type, OooOo oooOo) {
        String strOooO0O0 = o000oooo2.OooO0O0();
        for (String str : this.dateFormats) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                this.mSimpleDateFormat = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(strOooO0O0).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(strOooO0O0);
        } catch (ParseException e) {
            throw new JsonParseException(e.getMessage(), e);
        }
    }

    @Override // com.google.gson.o00oO0o
    public o000oOoO serialize(Date date, Type type, oo000o oo000oVar) {
        o00Ooo o00ooo2;
        synchronized (this.mIso8601DateFormat) {
            o00ooo2 = new o00Ooo(this.mIso8601DateFormat.format(date));
        }
        return o00ooo2;
    }
}
