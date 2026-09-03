package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import java.util.Set;
import p028Oooo0oO.o0O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO000 implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f3726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f3727OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RestrictedCameraControl f3728OooO0OO;

    public o00OO000(@NonNull o0Oo0oo o0oo0oo2, @NonNull RestrictedCameraControl restrictedCameraControl) {
        this.f3726OooO00o = o0oo0oo2;
        this.f3727OooO0O0 = o0oo0oo2;
        this.f3728OooO0OO = restrictedCameraControl;
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final void OooO(p033OoooO0O.o0ooOOo o0ooooo, p440o0OoOo0.o00Oo0 o00oo1) {
        this.f3726OooO00o.OooO(o0ooooo, o00oo1);
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final Set OooO00o() {
        return this.f3726OooO00o.OooO00o();
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData OooO0O0() {
        return this.f3726OooO00o.OooO0O0();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooO0OO() {
        return this.f3726OooO00o.OooO0OO();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final String OooO0Oo() {
        return this.f3726OooO00o.OooO0Oo();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final List OooO0o(int i) {
        return this.f3726OooO00o.OooO0o(i);
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooO0o0() {
        return this.f3726OooO00o.OooO0o0();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final oo0o0O0 OooO0oO() {
        return this.f3726OooO00o.OooO0oO();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final List OooO0oo(int i) {
        return this.f3726OooO00o.OooO0oo(i);
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final void OooOO0(o000oOoO o000oooo2) {
        this.f3726OooO00o.OooOO0(o000oooo2);
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final o0Oo0oo OooOO0O() {
        return this.f3727OooO0O0;
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final Timebase OooOO0o() {
        return this.f3726OooO00o.OooOO0o();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooOOO(int i) {
        return this.f3726OooO00o.OooOOO(i);
    }

    @Override // androidx.camera.core.CameraInfo
    public final String OooOOO0() {
        return this.f3726OooO00o.OooOOO0();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final o0000O OooOOOO() {
        return this.f3726OooO00o.OooOOOO();
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public final LiveData<o0O0o> OooOOOo() {
        return !this.f3728OooO0OO.OooOO0(0) ? new MutableLiveData(new p034OoooOO0.o000oOoO(1.0f, 1.0f, 1.0f, 0.0f)) : this.f3727OooO0O0.OooOOOo();
    }
}
