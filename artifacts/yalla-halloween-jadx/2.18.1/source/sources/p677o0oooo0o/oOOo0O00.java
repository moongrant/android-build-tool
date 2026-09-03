package p677o0oooo0o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOo0O00 implements oO0o0000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO f52191Oooo0o;

    public oOOo0O00(oO oOVar) {
        this.f52191Oooo0o = oOVar;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return new oOOo0000(this.f52191Oooo0o.OooO0OO());
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        return new oOOo0000(this.f52191Oooo0o.OooO0OO());
    }
}
