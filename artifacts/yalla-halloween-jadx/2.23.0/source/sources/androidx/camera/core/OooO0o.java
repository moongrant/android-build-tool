package androidx.camera.core;

import androidx.annotation.NonNull;
import p037OoooOo0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends SurfaceOutput.Event {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3442OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SurfaceOutput f3443OooO0O0;

    public OooO0o(o00O000 o00o001) {
        this.f3443OooO0O0 = o00o001;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final int OooO00o() {
        return this.f3442OooO00o;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    @NonNull
    public final SurfaceOutput OooO0O0() {
        return this.f3443OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.Event)) {
            return false;
        }
        SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
        return this.f3442OooO00o == event.OooO00o() && this.f3443OooO0O0.equals(event.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f3442OooO00o ^ 1000003) * 1000003) ^ this.f3443OooO0O0.hashCode();
    }

    public final String toString() {
        return "Event{eventCode=" + this.f3442OooO00o + ", surfaceOutput=" + this.f3443OooO0O0 + "}";
    }
}
