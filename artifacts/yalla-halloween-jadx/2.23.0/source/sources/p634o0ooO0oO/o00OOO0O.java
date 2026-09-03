package p634o0ooO0oO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOO0O extends oo00oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final byte[] f57239OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OOO0 f57240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OOO0 f57241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final byte[] f57242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final byte[] f57243OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ByteString f57244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f57245OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f57246OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f57247OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ByteString f57248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00OOO0 f57249OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57250OooO0OO;

        @JvmOverloads
        public OooO00o() {
            this(0);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @Nullable String str, @NotNull oo00oO body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            OooO0OO part = OooO0OO.OooO00o.OooO0O0(name, str, body);
            Intrinsics.checkNotNullParameter(part, "part");
            this.f57250OooO0OO.add(part);
        }

        @NotNull
        public final o00OOO0O OooO0O0() {
            ArrayList arrayList = this.f57250OooO0OO;
            if (!arrayList.isEmpty()) {
                return new o00OOO0O(this.f57248OooO00o, this.f57249OooO0O0, o0O000o0.OooOo(arrayList));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final void OooO0OO(@NotNull o00OOO0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.areEqual(type.f57236OooO0O0, "multipart")) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("multipart != ", type).toString());
            }
            this.f57249OooO0O0 = type;
        }

        public OooO00o(int i) {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            ByteString byteString = ByteString.f60866OooO0oO;
            this.f57248OooO00o = ByteString.OooO00o.OooO0OO(boundary);
            this.f57249OooO0O0 = o00OOO0O.f57241OooO0o0;
            this.f57250OooO0OO = new ArrayList();
        }
    }

    public static final class OooO0O0 {
        public static void OooO00o(@NotNull String key, @NotNull StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append(Typography.quote);
            int length = key.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
                i = i2;
            }
            sb.append(Typography.quote);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final oo0O f57251OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final oo00oO f57252OooO0O0;

        public static final class OooO00o {
            @JvmStatic
            @NotNull
            public static OooO0OO OooO00o(@Nullable oo0O oo0o, @NotNull oo00oO body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if (!((oo0o == null ? null : oo0o.OooO00o("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((oo0o != null ? oo0o.OooO00o("Content-Length") : null) == null) {
                    return new OooO0OO(oo0o, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            @NotNull
            public static OooO0OO OooO0O0(@NotNull String name, @Nullable String str, @NotNull oo00oO body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                o00OOO0 o00ooo1 = o00OOO0O.f57241OooO0o0;
                OooO0O0.OooO00o(name, sb);
                if (str != null) {
                    sb.append("; filename=");
                    OooO0O0.OooO00o(str, sb);
                }
                String value = sb.toString();
                Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
                oo0O.OooO00o oooO00o = new oo0O.OooO00o();
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                oo0O.OooO0O0.OooO00o("Content-Disposition");
                oooO00o.OooO0O0("Content-Disposition", value);
                return OooO00o(oooO00o.OooO0OO(), body);
            }
        }

        public OooO0OO(oo0O oo0o, oo00oO oo00oo) {
            this.f57251OooO00o = oo0o;
            this.f57252OooO0O0 = oo00oo;
        }
    }

    static {
        Pattern pattern = o00OOO0.f57234OooO0o0;
        f57241OooO0o0 = o00OOO0.OooO00o.OooO00o("multipart/mixed");
        o00OOO0.OooO00o.OooO00o("multipart/alternative");
        o00OOO0.OooO00o.OooO00o("multipart/digest");
        o00OOO0.OooO00o.OooO00o("multipart/parallel");
        f57240OooO0o = o00OOO0.OooO00o.OooO00o("multipart/form-data");
        f57242OooO0oO = new byte[]{58, 32};
        f57243OooO0oo = new byte[]{13, 10};
        f57239OooO = new byte[]{45, 45};
    }

    public o00OOO0O(@NotNull ByteString boundaryByteString, @NotNull o00OOO0 type, @NotNull List<OooO0OO> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f57244OooO00o = boundaryByteString;
        this.f57245OooO0O0 = parts;
        Pattern pattern = o00OOO0.f57234OooO0o0;
        this.f57246OooO0OO = o00OOO0.OooO00o.OooO00o(type + "; boundary=" + boundaryByteString.OooOo00());
        this.f57247OooO0Oo = -1L;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() throws IOException {
        long j = this.f57247OooO0Oo;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.f57247OooO0Oo = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p634o0ooO0oO.oo00oO
    @NotNull
    public final o00OOO0 contentType() {
        return this.f57246OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long writeOrCountBytes(o0000Ooo o0000ooo, boolean z) throws IOException {
        o00000O o00000o;
        o0000Ooo o00000o2;
        if (z) {
            o00000o2 = new o00000O();
            o00000o = o00000o2;
        } else {
            o00000o = 0;
            o00000o2 = o0000ooo;
        }
        List<OooO0OO> list = this.f57245OooO0O0;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f57244OooO00o;
            byte[] bArr = f57239OooO;
            byte[] bArr2 = f57243OooO0oo;
            if (i >= size) {
                Intrinsics.checkNotNull(o00000o2);
                o00000o2.write(bArr);
                o00000o2.o0000O00(byteString);
                o00000o2.write(bArr);
                o00000o2.write(bArr2);
                if (!z) {
                    return j;
                }
                Intrinsics.checkNotNull(o00000o);
                long j2 = j + o00000o.f60177OooO0o0;
                o00000o.OooO0oO();
                return j2;
            }
            int i2 = i + 1;
            OooO0OO oooO0OO = list.get(i);
            oo0O oo0o = oooO0OO.f57251OooO00o;
            Intrinsics.checkNotNull(o00000o2);
            o00000o2.write(bArr);
            o00000o2.o0000O00(byteString);
            o00000o2.write(bArr2);
            if (oo0o != null) {
                int length = oo0o.f57369OooO0Oo.length / 2;
                for (int i3 = 0; i3 < length; i3++) {
                    o00000o2.OooOooo(oo0o.OooO0OO(i3)).write(f57242OooO0oO).OooOooo(oo0o.OooO0o0(i3)).write(bArr2);
                }
            }
            oo00oO oo00oo = oooO0OO.f57252OooO0O0;
            o00OOO0 o00ooo0ContentType = oo00oo.contentType();
            if (o00ooo0ContentType != null) {
                o00000o2.OooOooo("Content-Type: ").OooOooo(o00ooo0ContentType.f57235OooO00o).write(bArr2);
            }
            long jContentLength = oo00oo.contentLength();
            if (jContentLength != -1) {
                o00000o2.OooOooo("Content-Length: ").Ooooo00(jContentLength).write(bArr2);
            } else if (z) {
                Intrinsics.checkNotNull(o00000o);
                o00000o.OooO0oO();
                return -1L;
            }
            o00000o2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                oo00oo.writeTo(o00000o2);
            }
            o00000o2.write(bArr2);
            i = i2;
        }
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
