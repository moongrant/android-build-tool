package p229o00oOo00;

import java.io.File;
import java.util.Objects;
import p214o00oO0.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements o00OOOO0<File> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final File f33896Oooo0o;

    public OooOo(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f33896Oooo0o = file;
    }

    @Override // p214o00oO0.o00OOOO0
    public final /* bridge */ /* synthetic */ void OooO00o() {
    }

    @Override // p214o00oO0.o00OOOO0
    public final Class<File> OooO0OO() {
        return this.f33896Oooo0o.getClass();
    }

    @Override // p214o00oO0.o00OOOO0
    public final File get() {
        return this.f33896Oooo0o;
    }

    @Override // p214o00oO0.o00OOOO0
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }
}
