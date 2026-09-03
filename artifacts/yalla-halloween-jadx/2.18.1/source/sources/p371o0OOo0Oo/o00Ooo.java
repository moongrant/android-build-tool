package p371o0OOo0Oo;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o00O0O;
import p368o0OOo0O.o00Oo0;
import p368o0OOo0O.o0OoOo0;
import p370o0OOo0OO.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements Oooo0<o00Ooo> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f38667OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, o000oOoO<?>> f38668OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o00O0O<?>> f38669OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000oOoO<Object> f38670OooO0OO = new o000oOoO() { // from class: o0OOo0Oo.o000oOoO
        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(Object obj, o0OoOo0 o0oooo1) {
            o00Ooo.OooO00o oooO00o = o00Ooo.f38667OooO0o0;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Couldn't find encoder for type ");
            sbOooO0o0.append(obj.getClass().getCanonicalName());
            throw new EncodingException(sbOooO0o0.toString());
        }
    };

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f38671OooO0Oo = false;

    public static final class OooO00o implements o00O0O<Date> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SimpleDateFormat f38672OooO00o;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f38672OooO00o = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // p368o0OOo0O.Oooo000
        public final void OooO00o(@NonNull Object obj, @NonNull o00Oo0 o00oo1) throws IOException {
            o00oo1.OooO0o0(f38672OooO00o.format((Date) obj));
        }
    }

    public o00Ooo() {
        OooO0O0(String.class, new o00O0O() { // from class: o0OOo0Oo.o0OoOo0
            @Override // p368o0OOo0O.Oooo000
            public final void OooO00o(Object obj, o00Oo0 o00oo1) throws IOException {
                o00Ooo.OooO00o oooO00o = o00Ooo.f38667OooO0o0;
                o00oo1.OooO0o0((String) obj);
            }
        });
        OooO0O0(Boolean.class, new o00O0O() { // from class: o0OOo0Oo.o00O0O
            @Override // p368o0OOo0O.Oooo000
            public final void OooO00o(Object obj, o00Oo0 o00oo1) throws IOException {
                o00Ooo.OooO00o oooO00o = o00Ooo.f38667OooO0o0;
                o00oo1.OooO0o(((Boolean) obj).booleanValue());
            }
        });
        OooO0O0(Date.class, f38667OooO0o0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p370o0OOo0OO.Oooo0
    @NonNull
    public final Oooo0 OooO00o(@NonNull Class cls, @NonNull o000oOoO o000oooo2) {
        this.f38668OooO00o.put((Class<?>) cls, (o000oOoO<?>) o000oooo2);
        this.f38669OooO0O0.remove(cls);
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <T> o00Ooo OooO0O0(@NonNull Class<T> cls, @NonNull o00O0O<? super T> o00o0o2) {
        this.f38669OooO0O0.put((Class<?>) cls, o00o0o2);
        this.f38668OooO00o.remove(cls);
        return this;
    }
}
