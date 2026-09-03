package p677o0oooo0o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O000 implements oO0o0000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO f52169Oooo0o;

    public oOO0O000(oO oOVar) {
        this.f52169Oooo0o = oOVar;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return OooO0o0();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        return new oOO0(this.f52169Oooo0o.OooO0OO());
    }
}
