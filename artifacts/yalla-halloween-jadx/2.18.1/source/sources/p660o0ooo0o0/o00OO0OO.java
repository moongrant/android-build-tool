package p660o0ooo0o0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO extends o0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final byte[] f51406OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OO0O0 f51407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OO0O0 f51408OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final byte[] f51409OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final byte[] f51410OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0O0 f51411OooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0O0 f51412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f51413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ByteString f51414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f51415OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteString f51416OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00OO0O0 f51417OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<OooO0OO> f51418OooO0OO;

        @JvmOverloads
        public OooO00o() {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "UUID.randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f51416OooO00o = ByteString.f53047OoooO00.OooO0OO(boundary);
            this.f51417OooO0O0 = o00OO0OO.f51408OooO0o0;
            this.f51418OooO0OO = new ArrayList();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00OO0OO$OooO0OO>] */
        @NotNull
        public final OooO00o OooO00o(@NotNull OooO0OO part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f51418OooO0OO.add(part);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00OO0OO$OooO0OO>] */
        @NotNull
        public final o00OO0OO OooO0O0() {
            if (!this.f51418OooO0OO.isEmpty()) {
                return new o00OO0OO(this.f51416OooO00o, this.f51417OooO0O0, o00OOO00.OooOoO(this.f51418OooO0OO));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final OooO00o OooO0OO(@NotNull o00OO0O0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.f51403OooO0O0, "multipart")) {
                this.f51417OooO0O0 = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    public static final class OooO0O0 {
        public final void OooO00o(@NotNull StringBuilder appendQuotedString, @NotNull String key) {
            Intrinsics.checkNotNullParameter(appendQuotedString, "$this$appendQuotedString");
            Intrinsics.checkNotNullParameter(key, "key");
            appendQuotedString.append(Typography.quote);
            int length = key.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    appendQuotedString.append("%0A");
                } else if (cCharAt == '\r') {
                    appendQuotedString.append("%0D");
                } else if (cCharAt != '\"') {
                    appendQuotedString.append(cCharAt);
                } else {
                    appendQuotedString.append("%22");
                }
            }
            appendQuotedString.append(Typography.quote);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f51419OooO0OO = new OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final o00O f51420OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o0o0Oo f51421OooO0O0;

        public static final class OooO00o {
            @JvmStatic
            @NotNull
            public final OooO0OO OooO00o(@Nullable o00O o00o2, @NotNull o0o0Oo body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if (!((o00o2 != null ? o00o2.OooO00o("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((o00o2 != null ? o00o2.OooO00o("Content-Length") : null) == null) {
                    return new OooO0OO(o00o2, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            @NotNull
            public final OooO0OO OooO0O0(@NotNull String name, @Nullable String str, @NotNull o0o0Oo body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                OooO0O0 oooO0O0 = o00OO0OO.f51411OooOO0;
                oooO0O0.OooO00o(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    oooO0O0.OooO00o(sb, str);
                }
                String value = sb.toString();
                Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
                ArrayList arrayList = new ArrayList(20);
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                o00O.f51229Oooo0oO.OooO00o("Content-Disposition");
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add("Content-Disposition");
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return OooO00o(new o00O((String[]) array), body);
            }
        }

        public OooO0OO(o00O o00o2, o0o0Oo o0o0oo) {
            this.f51420OooO00o = o00o2;
            this.f51421OooO0O0 = o0o0oo;
        }
    }

    static {
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f51401OooO0oO;
        f51408OooO0o0 = oooO00o.OooO00o("multipart/mixed");
        oooO00o.OooO00o("multipart/alternative");
        oooO00o.OooO00o("multipart/digest");
        oooO00o.OooO00o("multipart/parallel");
        f51407OooO0o = oooO00o.OooO00o("multipart/form-data");
        f51409OooO0oO = new byte[]{(byte) 58, (byte) 32};
        f51410OooO0oo = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        f51406OooO = new byte[]{b, b};
    }

    public o00OO0OO(@NotNull ByteString boundaryByteString, @NotNull o00OO0O0 type, @NotNull List<OooO0OO> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f51414OooO0OO = boundaryByteString;
        this.f51415OooO0Oo = parts;
        this.f51412OooO00o = o00OO0O0.f51401OooO0oO.OooO00o(type + "; boundary=" + boundaryByteString.OooOOO());
        this.f51413OooO0O0 = -1L;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final long contentLength() throws IOException {
        long j = this.f51413OooO0O0;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.f51413OooO0O0 = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    @NotNull
    public final o00OO0O0 contentType() {
        return this.f51412OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long writeOrCountBytes(oo00oO oo00oo, boolean z) throws IOException {
        o0oOO o0ooo2;
        if (z) {
            oo00oo = new o0oOO();
            o0ooo2 = oo00oo;
        } else {
            o0ooo2 = 0;
        }
        int size = this.f51415OooO0Oo.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            OooO0OO oooO0OO = this.f51415OooO0Oo.get(i);
            o00O o00o2 = oooO0OO.f51420OooO00o;
            o0o0Oo o0o0oo = oooO0OO.f51421OooO0O0;
            Intrinsics.checkNotNull(oo00oo);
            oo00oo.OooOO0(f51406OooO);
            oo00oo.o000000(this.f51414OooO0OO);
            oo00oo.OooOO0(f51410OooO0oo);
            if (o00o2 != null) {
                int length = o00o2.f51230Oooo0o.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    oo00oo.OoooOoo(o00o2.OooO0O0(i2)).OooOO0(f51409OooO0oO).OoooOoo(o00o2.OooO0o0(i2)).OooOO0(f51410OooO0oo);
                }
            }
            o00OO0O0 o00oo0o0ContentType = o0o0oo.contentType();
            if (o00oo0o0ContentType != null) {
                oo00oo.OoooOoo("Content-Type: ").OoooOoo(o00oo0o0ContentType.f51402OooO00o).OooOO0(f51410OooO0oo);
            }
            long jContentLength = o0o0oo.contentLength();
            if (jContentLength != -1) {
                oo00oo.OoooOoo("Content-Length: ").o0000O0(jContentLength).OooOO0(f51410OooO0oo);
            } else if (z) {
                Intrinsics.checkNotNull(o0ooo2);
                o0ooo2.OooO0Oo();
                return -1L;
            }
            byte[] bArr = f51410OooO0oo;
            oo00oo.OooOO0(bArr);
            if (z) {
                j += jContentLength;
            } else {
                o0o0oo.writeTo(oo00oo);
            }
            oo00oo.OooOO0(bArr);
        }
        Intrinsics.checkNotNull(oo00oo);
        byte[] bArr2 = f51406OooO;
        oo00oo.OooOO0(bArr2);
        oo00oo.o000000(this.f51414OooO0OO);
        oo00oo.OooOO0(bArr2);
        oo00oo.OooOO0(f51410OooO0oo);
        if (!z) {
            return j;
        }
        Intrinsics.checkNotNull(o0ooo2);
        long j2 = j + o0ooo2.f52099Oooo0oO;
        o0ooo2.OooO0Oo();
        return j2;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final void writeTo(@NotNull oo00oO sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
