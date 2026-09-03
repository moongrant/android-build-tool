package p029Oooo0oo;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.o000O0O0;
import androidx.camera.core.impl.o00OO;
import java.util.concurrent.Executor;
import p028Oooo0oO.o00OO0O0;
import p034OoooOO0.o0OoOo0;
import p038OoooOoO.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0O0OOOo implements o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o000O0O0 f1271OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0OO000 f1272OooO0O0;

    public o0O0OOOo(@NonNull o000O0O0 o000o0o1) {
        this.f1271OooO00o = o000o0o1;
    }

    @Nullable
    public final o00OO0O0 OooO00o(@Nullable OooOOO0 oooOOO0) {
        if (oooOOO0 == null) {
            return null;
        }
        o000OO.OooOOO0.OooO0o("Pending request should not be null", this.f1272OooO0O0 != null);
        o0OO000 o0oo000 = this.f1272OooO0O0;
        Pair pair = new Pair(o0oo000.f1291OooO0oO, o0oo000.f1292OooO0oo.get(0));
        o00OO o00oo2 = o00OO.f3727OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        o00OO o00oo3 = new o00OO(arrayMap);
        this.f1272OooO0O0 = null;
        return new o00OO0O0(oooOOO0, new Size(oooOOO0.getWidth(), oooOOO0.getHeight()), new o0OoOo0(new o000Oo0(null, o00oo3, oooOOO0.o00000OO().OooO0OO())));
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0O0() {
        return OooO00o(this.f1271OooO00o.OooO0O0());
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0OO() {
        return this.f1271OooO00o.OooO0OO();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0Oo() {
        this.f1271OooO00o.OooO0Oo();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0o(@NonNull final o000O0O0.OooO00o oooO00o, @NonNull Executor executor) {
        this.f1271OooO00o.OooO0o(new o000O0O0.OooO00o() { // from class: Oooo0oo.o0O0OOO0
            @Override // androidx.camera.core.impl.o000O0O0.OooO00o
            public final void OooO00o(o000O0O0 o000o0o1) {
                o0O0OOOo o0o0oooo = this.f1269OooO00o;
                o0o0oooo.getClass();
                oooO00o.OooO00o(o0o0oooo);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0o0() {
        return this.f1271OooO00o.OooO0o0();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0oO() {
        return OooO00o(this.f1271OooO00o.OooO0oO());
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void close() {
        this.f1271OooO00o.close();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getHeight() {
        return this.f1271OooO00o.getHeight();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final Surface getSurface() {
        return this.f1271OooO00o.getSurface();
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getWidth() {
        return this.f1271OooO00o.getWidth();
    }
}
