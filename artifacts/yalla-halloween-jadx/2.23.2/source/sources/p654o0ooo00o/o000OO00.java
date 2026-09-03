package p654o0ooo00o;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO00 extends o0O00oO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f59409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f59410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59411OooO0oO;

    public o000OO00(@Nullable String str, long j, @NotNull o0o0000 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59410OooO0o0 = str;
        this.f59409OooO0o = j;
        this.f59411OooO0oO = source;
    }

    @Override // p641o0ooOO0o.o0O00oO0
    public final long OooO0OO() {
        return this.f59409OooO0o;
    }

    @Override // p641o0ooOO0o.o0O00oO0
    @Nullable
    public final o0O000Oo OooO0oO() {
        String str = this.f59410OooO0o0;
        if (str == null) {
            return null;
        }
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        return o0O000Oo.OooO00o.OooO0O0(str);
    }

    @Override // p641o0ooOO0o.o0O00oO0
    @NotNull
    public final o0O0o0 OooOOo() {
        return this.f59411OooO0oO;
    }
}
