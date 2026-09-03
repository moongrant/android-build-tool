package p641o0ooOO0o;

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
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O000o0 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final byte[] f57812OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0O000Oo f57813OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0O000Oo f57814OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final byte[] f57815OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final byte[] f57816OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ByteString f57817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f57818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O000Oo f57819OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f57820OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ByteString f57821OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o0O000Oo f57822OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57823OooO0OO;

        @JvmOverloads
        public OooO00o() {
            this(0);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @Nullable String str, @NotNull o0oO0Ooo body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            OooO0OO part = OooO0OO.OooO00o.OooO0O0(name, str, body);
            Intrinsics.checkNotNullParameter(part, "part");
            this.f57823OooO0OO.add(part);
        }

        @NotNull
        public final o0O000o0 OooO0O0() {
            ArrayList arrayList = this.f57823OooO0OO;
            if (!arrayList.isEmpty()) {
                return new o0O000o0(this.f57821OooO00o, this.f57822OooO0O0, oO000o00.OooOo(arrayList));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final void OooO0OO(@NotNull o0O000Oo type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.areEqual(type.f57809OooO0O0, "multipart")) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("multipart != ", type).toString());
            }
            this.f57822OooO0O0 = type;
        }

        public OooO00o(int i) {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            ByteString byteString = ByteString.f60193OooO0oO;
            this.f57821OooO00o = ByteString.OooO00o.OooO0OO(boundary);
            this.f57822OooO0O0 = o0O000o0.f57814OooO0o0;
            this.f57823OooO0OO = new ArrayList();
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
        public final o0O000 f57824OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o0oO0Ooo f57825OooO0O0;

        public static final class OooO00o {
            @JvmStatic
            @NotNull
            public static OooO0OO OooO00o(@Nullable o0O000 o0o001, @NotNull o0oO0Ooo body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if (!((o0o001 == null ? null : o0o001.OooO00o("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((o0o001 != null ? o0o001.OooO00o("Content-Length") : null) == null) {
                    return new OooO0OO(o0o001, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            @NotNull
            public static OooO0OO OooO0O0(@NotNull String name, @Nullable String str, @NotNull o0oO0Ooo body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                o0O000Oo o0o000oo2 = o0O000o0.f57814OooO0o0;
                OooO0O0.OooO00o(name, sb);
                if (str != null) {
                    sb.append("; filename=");
                    OooO0O0.OooO00o(str, sb);
                }
                String value = sb.toString();
                Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
                o0O000.OooO00o oooO00o = new o0O000.OooO00o();
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                o0O000.OooO0O0.OooO00o("Content-Disposition");
                oooO00o.OooO0O0("Content-Disposition", value);
                return OooO00o(oooO00o.OooO0OO(), body);
            }
        }

        public OooO0OO(o0O000 o0o001, o0oO0Ooo o0oo0ooo2) {
            this.f57824OooO00o = o0o001;
            this.f57825OooO0O0 = o0oo0ooo2;
        }
    }

    static {
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        f57814OooO0o0 = o0O000Oo.OooO00o.OooO00o("multipart/mixed");
        o0O000Oo.OooO00o.OooO00o("multipart/alternative");
        o0O000Oo.OooO00o.OooO00o("multipart/digest");
        o0O000Oo.OooO00o.OooO00o("multipart/parallel");
        f57813OooO0o = o0O000Oo.OooO00o.OooO00o("multipart/form-data");
        f57815OooO0oO = new byte[]{58, 32};
        f57816OooO0oo = new byte[]{13, 10};
        f57812OooO = new byte[]{45, 45};
    }

    public o0O000o0(@NotNull ByteString boundaryByteString, @NotNull o0O000Oo type, @NotNull List<OooO0OO> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f57817OooO00o = boundaryByteString;
        this.f57818OooO0O0 = parts;
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        this.f57819OooO0OO = o0O000Oo.OooO00o.OooO00o(type + "; boundary=" + boundaryByteString.OooOo00());
        this.f57820OooO0Oo = -1L;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() throws IOException {
        long j = this.f57820OooO0Oo;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.f57820OooO0Oo = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    @NotNull
    public final o0O000Oo contentType() {
        return this.f57819OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long writeOrCountBytes(o0O0o00O o0o0o00o, boolean z) throws IOException {
        oo0OOoo oo0oooo;
        o0O0o00O oo0oooo2;
        if (z) {
            oo0oooo2 = new oo0OOoo();
            oo0oooo = oo0oooo2;
        } else {
            oo0oooo = 0;
            oo0oooo2 = o0o0o00o;
        }
        List<OooO0OO> list = this.f57818OooO0O0;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f57817OooO00o;
            byte[] bArr = f57812OooO;
            byte[] bArr2 = f57816OooO0oo;
            if (i >= size) {
                Intrinsics.checkNotNull(oo0oooo2);
                oo0oooo2.write(bArr);
                oo0oooo2.o0000oo(byteString);
                oo0oooo2.write(bArr);
                oo0oooo2.write(bArr2);
                if (!z) {
                    return j;
                }
                Intrinsics.checkNotNull(oo0oooo);
                long j2 = j + oo0oooo.f59828OooO0o0;
                oo0oooo.OooO0oO();
                return j2;
            }
            int i2 = i + 1;
            OooO0OO oooO0OO = list.get(i);
            o0O000 o0o001 = oooO0OO.f57824OooO00o;
            Intrinsics.checkNotNull(oo0oooo2);
            oo0oooo2.write(bArr);
            oo0oooo2.o0000oo(byteString);
            oo0oooo2.write(bArr2);
            if (o0o001 != null) {
                int length = o0o001.f57773OooO0Oo.length / 2;
                for (int i3 = 0; i3 < length; i3++) {
                    oo0oooo2.Oooo000(o0o001.OooO0OO(i3)).write(f57815OooO0oO).Oooo000(o0o001.OooO0o0(i3)).write(bArr2);
                }
            }
            o0oO0Ooo o0oo0ooo2 = oooO0OO.f57825OooO0O0;
            o0O000Oo o0o000ooContentType = o0oo0ooo2.contentType();
            if (o0o000ooContentType != null) {
                oo0oooo2.Oooo000("Content-Type: ").Oooo000(o0o000ooContentType.f57808OooO00o).write(bArr2);
            }
            long jContentLength = o0oo0ooo2.contentLength();
            if (jContentLength != -1) {
                oo0oooo2.Oooo000("Content-Length: ").Ooooo00(jContentLength).write(bArr2);
            } else if (z) {
                Intrinsics.checkNotNull(oo0oooo);
                oo0oooo.OooO0oO();
                return -1L;
            }
            oo0oooo2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                o0oo0ooo2.writeTo(oo0oooo2);
            }
            oo0oooo2.write(bArr2);
            i = i2;
        }
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
