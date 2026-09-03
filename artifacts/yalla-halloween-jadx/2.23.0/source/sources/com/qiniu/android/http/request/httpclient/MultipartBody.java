package com.qiniu.android.http.request.httpclient;

import com.qiniu.android.http.Headers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import okio.ByteString;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class MultipartBody extends oo00oO {
    public static final o00OOO0 ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    private static final byte[] DASHDASH;
    public static final o00OOO0 DIGEST;
    public static final o00OOO0 FORM;
    public static final o00OOO0 MIXED;
    public static final o00OOO0 PARALLEL;
    private final ByteString boundary;
    private long contentLength = -1;
    private final o00OOO0 contentType;
    private final o00OOO0 originalType;
    private final List<Part> parts;

    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private o00OOO0 type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(oo00oO oo00oo) {
            return addPart(Part.create(oo00oo));
        }

        public MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }

        public Builder setType(o00OOO0 o00ooo1) {
            if (o00ooo1 == null) {
                throw new NullPointerException("type == null");
            }
            if (o00ooo1.f57236OooO0O0.equals("multipart")) {
                this.type = o00ooo1;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + o00ooo1);
        }

        public Builder(String str) {
            this.parts = new ArrayList();
            this.type = MultipartBody.MIXED;
            ByteString byteString = ByteString.f60866OooO0oO;
            this.boundary = ByteString.OooO00o.OooO0OO(str);
        }

        public Builder addFormDataPart(String str, String str2, oo00oO oo00oo) {
            return addPart(Part.createFormData(str, str2, oo00oo));
        }

        public Builder addPart(Headers headers, oo00oO oo00oo) {
            return addPart(Part.create(headers, oo00oo));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    public static final class Part {
        final oo00oO body;
        final Headers headers;

        private Part(Headers headers, oo00oO oo00oo) {
            this.headers = headers;
            this.body = oo00oo;
        }

        public static Part create(oo00oO oo00oo) {
            return create(null, oo00oo);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, oo00oO.create((o00OOO0) null, str2));
        }

        public oo00oO body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }

        public static Part create(Headers headers, oo00oO oo00oo) {
            if (oo00oo == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, oo00oo);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part createFormData(String str, String str2, oo00oO oo00oo) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(Headers.of("Content-Disposition", sb.toString()), oo00oo);
        }
    }

    static {
        Pattern pattern = o00OOO0.f57234OooO0o0;
        MIXED = o00OOO0.OooO00o.OooO0O0("multipart/mixed");
        ALTERNATIVE = o00OOO0.OooO00o.OooO0O0("multipart/alternative");
        DIGEST = o00OOO0.OooO00o.OooO0O0("multipart/digest");
        PARALLEL = o00OOO0.OooO00o.OooO0O0("multipart/parallel");
        FORM = o00OOO0.OooO00o.OooO0O0("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(ByteString byteString, o00OOO0 o00ooo1, List<Part> list) {
        this.boundary = byteString;
        this.originalType = o00ooo1;
        this.contentType = o00OOO0.OooO00o.OooO00o(o00ooo1 + "; boundary=" + byteString.OooOo00());
        this.parts = Collections.unmodifiableList(list);
    }

    public static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append(Typography.quote);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(Typography.quote);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(o0000Ooo o0000ooo, boolean z) throws IOException {
        o00000O o00000o;
        if (z) {
            o0000ooo = new o00000O();
            o00000o = o0000ooo;
        } else {
            o00000o = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            oo00oO oo00oo = part.body;
            o0000ooo.write(DASHDASH);
            o0000ooo.o0000O00(this.boundary);
            o0000ooo.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o0000ooo.OooOooo(headers.name(i2)).write(COLONSPACE).OooOooo(headers.value(i2)).write(CRLF);
                }
            }
            o00OOO0 o00ooo0ContentType = oo00oo.contentType();
            if (o00ooo0ContentType != null) {
                o0000ooo.OooOooo("Content-Type: ").OooOooo(o00ooo0ContentType.f57235OooO00o).write(CRLF);
            }
            long jContentLength = oo00oo.contentLength();
            if (jContentLength != -1) {
                o0000ooo.OooOooo("Content-Length: ").Ooooo00(jContentLength).write(CRLF);
            } else if (z) {
                o00000o.OooO0oO();
                return -1L;
            }
            byte[] bArr = CRLF;
            o0000ooo.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                oo00oo.writeTo(o0000ooo);
            }
            o0000ooo.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        o0000ooo.write(bArr2);
        o0000ooo.o0000O00(this.boundary);
        o0000ooo.write(bArr2);
        o0000ooo.write(CRLF);
        if (!z) {
            return j;
        }
        long j2 = j + o00000o.f60177OooO0o0;
        o00000o.OooO0oO();
        return j2;
    }

    public String boundary() {
        return this.boundary.OooOo00();
    }

    @Override // p634o0ooO0oO.oo00oO
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p634o0ooO0oO.oo00oO
    public o00OOO0 contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public o00OOO0 type() {
        return this.originalType;
    }

    @Override // p634o0ooO0oO.oo00oO
    public void writeTo(o0000Ooo o0000ooo) throws IOException {
        writeOrCountBytes(o0000ooo, false);
    }
}
