package p659o0oooO00;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000OO extends o0000O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O0O f60220OooO0O0;

    public o000OO(@NotNull o000O00O delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f60220OooO0O0 = delegate;
    }

    @NotNull
    public static void OooOOO0(@NotNull o000OO00 path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // p659o0oooO00.o0000O0O
    @Nullable
    public final o0000O0 OooO(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooOOO0(path, "metadataOrNull", "path");
        o0000O0 o0000o0OooO = this.f60220OooO0O0.OooO(path);
        if (o0000o0OooO == null) {
            return null;
        }
        o000OO00 path2 = o0000o0OooO.f60189OooO0OO;
        if (path2 == null) {
            return o0000o0OooO;
        }
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
        boolean z = o0000o0OooO.f60187OooO00o;
        boolean z2 = o0000o0OooO.f60188OooO0O0;
        Long l = o0000o0OooO.f60190OooO0Oo;
        Long l2 = o0000o0OooO.f60192OooO0o0;
        Long l3 = o0000o0OooO.f60191OooO0o;
        Long l4 = o0000o0OooO.f60193OooO0oO;
        Map<KClass<?>, Object> extras = o0000o0OooO.f60194OooO0oo;
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new o0000O0(z, z2, path2, l, l2, l3, l4, extras);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooO00o(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "appendingSink", ShareInternalUtility.STAGING_PARAM);
        return this.f60220OooO0O0.OooO00o(file);
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0O0(@NotNull o000OO00 source, @NotNull o000OO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        OooOOO0(source, "atomicMove", "source");
        OooOOO0(target, "atomicMove", "target");
        this.f60220OooO0O0.OooO0O0(source, target);
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0OO(@NotNull o000OO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        OooOOO0(dir, "createDirectory", "dir");
        this.f60220OooO0O0.OooO0OO(dir);
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0Oo(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooOOO0(path, "delete", "path");
        this.f60220OooO0O0.OooO0Oo(path);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final List<o000OO00> OooO0oO(@NotNull o000OO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        OooOOO0(dir, "list", "dir");
        List<o000OO00> listOooO0oO = this.f60220OooO0O0.OooO0oO(dir);
        ArrayList arrayList = new ArrayList();
        for (o000OO00 path : listOooO0oO) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o0000oo OooOO0(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "openReadOnly", ShareInternalUtility.STAGING_PARAM);
        return this.f60220OooO0O0.OooOO0(file);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O00 OooOO0o(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "source", ShareInternalUtility.STAGING_PARAM);
        return this.f60220OooO0O0.OooOO0o(file);
    }

    @NotNull
    public final String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.f60220OooO0O0 + ')';
    }
}
