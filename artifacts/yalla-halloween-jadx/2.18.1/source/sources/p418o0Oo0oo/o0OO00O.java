package p418o0Oo0oo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<o0OOO0o, OooO00o> f39736OooO00o = new LinkedHashMap();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f39737OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39738OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f39739OooO0OO;

        public OooO00o(long j, long j2, boolean z) {
            this.f39737OooO00o = j;
            this.f39738OooO0O0 = j2;
            this.f39739OooO0OO = z;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.LinkedHashMap, java.util.Map<o0Oo0oo.o0OOO0o, o0Oo0oo.o0OO00O$OooO00o>] */
    @NotNull
    public final Oooo000 OooO00o(@NotNull oo0o0Oo pointerInputEvent, @NotNull o0000oo positionCalculator) {
        long j;
        boolean z;
        long jOooOOOO;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.f39760OooO00o.size());
        List<o0O0O00> list = pointerInputEvent.f39760OooO00o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o0O0O00 o0o0o00 = list.get(i);
            OooO00o oooO00o = (OooO00o) this.f39736OooO00o.get(new o0OOO0o(o0o0o00.f39728OooO00o));
            if (oooO00o == null) {
                j = o0o0o00.f39729OooO0O0;
                jOooOOOO = o0o0o00.f39731OooO0Oo;
                z = false;
            } else {
                long j2 = oooO00o.f39737OooO00o;
                j = j2;
                z = oooO00o.f39739OooO0OO;
                jOooOOOO = positionCalculator.OooOOOO(oooO00o.f39738OooO0O0);
            }
            long j3 = o0o0o00.f39728OooO00o;
            linkedHashMap.put(new o0OOO0o(j3), new o0Oo0oo(j3, o0o0o00.f39729OooO0O0, o0o0o00.f39731OooO0Oo, o0o0o00.f39733OooO0o0, j, jOooOOOO, z, o0o0o00.f39732OooO0o, o0o0o00.f39735OooO0oo, o0o0o00.f39727OooO));
            boolean z2 = o0o0o00.f39733OooO0o0;
            if (z2) {
                this.f39736OooO00o.put(new o0OOO0o(o0o0o00.f39728OooO00o), new OooO00o(o0o0o00.f39729OooO0O0, o0o0o00.f39730OooO0OO, z2));
            } else {
                this.f39736OooO00o.remove(new o0OOO0o(o0o0o00.f39728OooO00o));
            }
        }
        return new Oooo000(linkedHashMap, pointerInputEvent);
    }
}
