package p169o00Ooo0O;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p144o00Oo.o000O00;
import p144o00Oo.o00O0000;
import p168o00Ooo00.o0ooOOo;
import p174o00OooOo.o00OO000;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0000<?, ?, ?> f38237OooO0OO = new o00O0000<>(Object.class, Object.class, Object.class, Collections.singletonList(new o000O00(Object.class, Object.class, Object.class, Collections.emptyList(), new o0ooOOo(), null)), null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<o00OO000, o00O0000<?, ?, ?>> f38238OooO00o = new OooO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<o00OO000> f38239OooO0O0 = new AtomicReference<>();

    public final void OooO00o(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable o00O0000<?, ?, ?> o00o0001) {
        synchronized (this.f38238OooO00o) {
            OooO<o00OO000, o00O0000<?, ?, ?>> oooO = this.f38238OooO00o;
            o00OO000 o00oo001 = new o00OO000(cls, cls2, cls3);
            if (o00o0001 == null) {
                o00o0001 = f38237OooO0OO;
            }
            oooO.put(o00oo001, o00o0001);
        }
    }
}
