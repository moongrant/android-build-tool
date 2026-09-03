package com.amazonaws.util.json;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import p386o0OOoo0O.o00O000;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00OO;
import p386o0OOoo0O.o00O00o0;
import p386o0OOoo0O.o00oOoo;
import p386o0OOoo0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public class DateDeserializer implements o00O000<Date>, o00O00o0<Date> {
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    private SimpleDateFormat mSimpleDateFormat;

    public DateDeserializer(String[] strArr) {
        this.dateFormats = Arrays.asList(strArr);
    }

    @Override // p386o0OOoo0O.o00O000
    public Date deserialize(o00O000o o00o000o2, Type type, o00oOoo o00oooo2) {
        String strOooO0OO = o00o000o2.OooO0OO();
        for (String str : this.dateFormats) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                this.mSimpleDateFormat = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(strOooO0OO).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(strOooO0OO);
        } catch (ParseException e) {
            throw new JsonParseException(e.getMessage(), e);
        }
    }

    @Override // p386o0OOoo0O.o00O00o0
    public o00O000o serialize(Date date, Type type, o00O00OO o00o00oo2) {
        oOO00O ooo00o;
        synchronized (this.mIso8601DateFormat) {
            ooo00o = new oOO00O(this.mIso8601DateFormat.format(date));
        }
        return ooo00o;
    }
}
