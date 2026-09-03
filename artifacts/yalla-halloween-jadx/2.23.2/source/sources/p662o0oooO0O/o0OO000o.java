package p662o0oooO0O;

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
public abstract class o0OO000o extends o0OO000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OO000 f59772OooO0O0;

    public o0OO000o(@NotNull o0OO0o00 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f59772OooO0O0 = delegate;
    }

    @NotNull
    public static void OooOOO0(@NotNull o0OOOO00 path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // p662o0oooO0O.o0OO000
    @Nullable
    public final o0O OooO(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooOOO0(path, "metadataOrNull", "path");
        o0O o0oOooO2 = this.f59772OooO0O0.OooO(path);
        if (o0oOooO2 == null) {
            return null;
        }
        o0OOOO00 path2 = o0oOooO2.f59745OooO0OO;
        if (path2 == null) {
            return o0oOooO2;
        }
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
        boolean z = o0oOooO2.f59743OooO00o;
        boolean z2 = o0oOooO2.f59744OooO0O0;
        Long l = o0oOooO2.f59746OooO0Oo;
        Long l2 = o0oOooO2.f59748OooO0o0;
        Long l3 = o0oOooO2.f59747OooO0o;
        Long l4 = o0oOooO2.f59749OooO0oO;
        Map<KClass<?>, Object> extras = o0oOooO2.f59750OooO0oo;
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new o0O(z, z2, path2, l, l2, l3, l4, extras);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooO00o(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "appendingSink", ShareInternalUtility.STAGING_PARAM);
        return this.f59772OooO0O0.OooO00o(file);
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0O0(@NotNull o0OOOO00 source, @NotNull o0OOOO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        OooOOO0(source, "atomicMove", "source");
        OooOOO0(target, "atomicMove", "target");
        this.f59772OooO0O0.OooO0O0(source, target);
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0OO(@NotNull o0OOOO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        OooOOO0(dir, "createDirectory", "dir");
        this.f59772OooO0O0.OooO0OO(dir);
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0Oo(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooOOO0(path, "delete", "path");
        this.f59772OooO0O0.OooO0Oo(path);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final List<o0OOOO00> OooO0oO(@NotNull o0OOOO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        OooOOO0(dir, "list", "dir");
        List<o0OOOO00> listOooO0oO = this.f59772OooO0O0.OooO0oO(dir);
        ArrayList arrayList = new ArrayList();
        for (o0OOOO00 path : listOooO0oO) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final o0O0oo00 OooOO0(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "openReadOnly", ShareInternalUtility.STAGING_PARAM);
        return this.f59772OooO0O0.OooOO0(file);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final oO00000 OooOO0o(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        OooOOO0(file, "source", ShareInternalUtility.STAGING_PARAM);
        return this.f59772OooO0O0.OooOO0o(file);
    }

    @NotNull
    public final String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.f59772OooO0O0 + ')';
    }
}
