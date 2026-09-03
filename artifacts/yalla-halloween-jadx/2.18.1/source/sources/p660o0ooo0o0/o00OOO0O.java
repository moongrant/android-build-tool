package p660o0ooo0o0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0O extends o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ByteString f51435OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f51436OooO0O0;

    public o00OOO0O(ByteString byteString, o00OO0O0 o00oo0o1) {
        this.f51435OooO00o = byteString;
        this.f51436OooO0O0 = o00oo0o1;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final long contentLength() {
        return this.f51435OooO00o.OooO0o0();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    @Nullable
    public final o00OO0O0 contentType() {
        return this.f51436OooO0O0;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final void writeTo(@NotNull oo00oO sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.o000000(this.f51435OooO00o);
    }
}
