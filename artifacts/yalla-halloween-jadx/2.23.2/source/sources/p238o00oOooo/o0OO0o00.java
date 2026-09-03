package p238o00oOooo;

import com.google.android.datatransport.runtime.dagger.Component;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;
import p242o00oo00O.o00000;
import p243o00oo0O.o000;
import p243o00oo0O.o000O0o;
import p248o00oo0o0.o0000O0O;
import p249o00oo0oO.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Component(modules = {o00000.class, o0000O0O.class, o0O.class, o000O0o.class, o000.class, o000OO0O.class})
public abstract class o0OO0o00 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((o0O0o00O) this).f40016OooO0oo.get().close();
    }
}
