package p191o00o0O0O;

import com.google.android.datatransport.runtime.dagger.Component;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;
import p193o00o0OO0.Oooo0;
import p197o00o0Oo0.o000000;
import p197o00o0Oo0.o0O0O00;
import p198o00o0OoO.o0O0ooO;
import p201o00o0o00.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Component(modules = {Oooo0.class, o0O0ooO.class, o00Ooo.class, o000000.class, o0O0O00.class, OooOOO.class})
public abstract class o000000O implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((o000oOoO) this).f38933OooO0oo.get().close();
    }
}
