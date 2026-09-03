package com.qiniu.android.http.request.httpclient;

import com.qiniu.android.http.Headers;
import com.umeng.analytics.pro.bz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.text.Typography;
import okio.ByteString;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class MultipartBody extends o0o0Oo {
    public static final o00OO0O0 ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    private static final byte[] DASHDASH;
    public static final o00OO0O0 DIGEST;
    public static final o00OO0O0 FORM;
    public static final o00OO0O0 MIXED;
    public static final o00OO0O0 PARALLEL;
    private final ByteString boundary;
    private long contentLength = -1;
    private final o00OO0O0 contentType;
    private final o00OO0O0 originalType;
    private final List<Part> parts;

    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private o00OO0O0 type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(o0o0Oo o0o0oo) {
            return addPart(Part.create(o0o0oo));
        }

        public MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }

        public Builder setType(o00OO0O0 o00oo0o1) {
            Objects.requireNonNull(o00oo0o1, "type == null");
            if (o00oo0o1.f51403OooO0O0.equals("multipart")) {
                this.type = o00oo0o1;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + o00oo0o1);
        }

        public Builder(String str) {
            this.parts = new ArrayList();
            this.type = MultipartBody.MIXED;
            this.boundary = ByteString.f53047OoooO00.OooO0OO(str);
        }

        public Builder addFormDataPart(String str, String str2, o0o0Oo o0o0oo) {
            return addPart(Part.createFormData(str, str2, o0o0oo));
        }

        public Builder addPart(Headers headers, o0o0Oo o0o0oo) {
            return addPart(Part.create(headers, o0o0oo));
        }

        public Builder addPart(Part part) {
            Objects.requireNonNull(part, "part == null");
            this.parts.add(part);
            return this;
        }
    }

    public static final class Part {
        public final o0o0Oo body;
        public final Headers headers;

        private Part(Headers headers, o0o0Oo o0o0oo) {
            this.headers = headers;
            this.body = o0o0oo;
        }

        public static Part create(o0o0Oo o0o0oo) {
            return create(null, o0o0oo);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, o0o0Oo.create((o00OO0O0) null, str2));
        }

        public o0o0Oo body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }

        public static Part create(Headers headers, o0o0Oo o0o0oo) {
            Objects.requireNonNull(o0o0oo, "body == null");
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, o0o0oo);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part createFormData(String str, String str2, o0o0Oo o0o0oo) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(Headers.of("Content-Disposition", sb.toString()), o0o0oo);
        }
    }

    static {
        o00OO0O0.OooO00o oooO00o = o00OO0O0.f51401OooO0oO;
        MIXED = oooO00o.OooO0O0("multipart/mixed");
        ALTERNATIVE = oooO00o.OooO0O0("multipart/alternative");
        DIGEST = oooO00o.OooO0O0("multipart/digest");
        PARALLEL = oooO00o.OooO0O0("multipart/parallel");
        FORM = oooO00o.OooO0O0("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{bz.k, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(ByteString byteString, o00OO0O0 o00oo0o1, List<Part> list) {
        this.boundary = byteString;
        this.originalType = o00oo0o1;
        this.contentType = o00OO0O0.OooO0O0(o00oo0o1 + "; boundary=" + byteString.OooOOO());
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
    private long writeOrCountBytes(oo00oO oo00oo, boolean z) throws IOException {
        o0oOO o0ooo2;
        if (z) {
            oo00oo = new o0oOO();
            o0ooo2 = oo00oo;
        } else {
            o0ooo2 = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            o0o0Oo o0o0oo = part.body;
            oo00oo.OooOO0(DASHDASH);
            oo00oo.o000000(this.boundary);
            oo00oo.OooOO0(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    oo00oo.OoooOoo(headers.name(i2)).OooOO0(COLONSPACE).OoooOoo(headers.value(i2)).OooOO0(CRLF);
                }
            }
            o00OO0O0 o00oo0o0ContentType = o0o0oo.contentType();
            if (o00oo0o0ContentType != null) {
                oo00oo.OoooOoo("Content-Type: ").OoooOoo(o00oo0o0ContentType.f51402OooO00o).OooOO0(CRLF);
            }
            long jContentLength = o0o0oo.contentLength();
            if (jContentLength != -1) {
                oo00oo.OoooOoo("Content-Length: ").o0000O0(jContentLength).OooOO0(CRLF);
            } else if (z) {
                o0ooo2.OooO0Oo();
                return -1L;
            }
            byte[] bArr = CRLF;
            oo00oo.OooOO0(bArr);
            if (z) {
                j += jContentLength;
            } else {
                o0o0oo.writeTo(oo00oo);
            }
            oo00oo.OooOO0(bArr);
        }
        byte[] bArr2 = DASHDASH;
        oo00oo.OooOO0(bArr2);
        oo00oo.o000000(this.boundary);
        oo00oo.OooOO0(bArr2);
        oo00oo.OooOO0(CRLF);
        if (!z) {
            return j;
        }
        long j2 = j + o0ooo2.f52099Oooo0oO;
        o0ooo2.OooO0Oo();
        return j2;
    }

    public String boundary() {
        return this.boundary.OooOOO();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public o00OO0O0 contentType() {
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

    public o00OO0O0 type() {
        return this.originalType;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public void writeTo(oo00oO oo00oo) throws IOException {
        writeOrCountBytes(oo00oo, false);
    }
}
