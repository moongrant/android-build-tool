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
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipartBody extends o0oO0Ooo {
    public static final o0O000Oo ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    private static final byte[] DASHDASH;
    public static final o0O000Oo DIGEST;
    public static final o0O000Oo FORM;
    public static final o0O000Oo MIXED;
    public static final o0O000Oo PARALLEL;
    private final ByteString boundary;
    private long contentLength = -1;
    private final o0O000Oo contentType;
    private final o0O000Oo originalType;
    private final List<Part> parts;

    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private o0O000Oo type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(o0oO0Ooo o0oo0ooo2) {
            return addPart(Part.create(o0oo0ooo2));
        }

        public MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }

        public Builder setType(o0O000Oo o0o000oo2) {
            if (o0o000oo2 == null) {
                throw new NullPointerException("type == null");
            }
            if (o0o000oo2.f57809OooO0O0.equals("multipart")) {
                this.type = o0o000oo2;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + o0o000oo2);
        }

        public Builder(String str) {
            this.parts = new ArrayList();
            this.type = MultipartBody.MIXED;
            ByteString byteString = ByteString.f60193OooO0oO;
            this.boundary = ByteString.OooO00o.OooO0OO(str);
        }

        public Builder addFormDataPart(String str, String str2, o0oO0Ooo o0oo0ooo2) {
            return addPart(Part.createFormData(str, str2, o0oo0ooo2));
        }

        public Builder addPart(Headers headers, o0oO0Ooo o0oo0ooo2) {
            return addPart(Part.create(headers, o0oo0ooo2));
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
        final o0oO0Ooo body;
        final Headers headers;

        private Part(Headers headers, o0oO0Ooo o0oo0ooo2) {
            this.headers = headers;
            this.body = o0oo0ooo2;
        }

        public static Part create(o0oO0Ooo o0oo0ooo2) {
            return create(null, o0oo0ooo2);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, o0oO0Ooo.create((o0O000Oo) null, str2));
        }

        public o0oO0Ooo body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }

        public static Part create(Headers headers, o0oO0Ooo o0oo0ooo2) {
            if (o0oo0ooo2 == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, o0oo0ooo2);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part createFormData(String str, String str2, o0oO0Ooo o0oo0ooo2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(Headers.of("Content-Disposition", sb.toString()), o0oo0ooo2);
        }
    }

    static {
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        MIXED = o0O000Oo.OooO00o.OooO0O0("multipart/mixed");
        ALTERNATIVE = o0O000Oo.OooO00o.OooO0O0("multipart/alternative");
        DIGEST = o0O000Oo.OooO00o.OooO0O0("multipart/digest");
        PARALLEL = o0O000Oo.OooO00o.OooO0O0("multipart/parallel");
        FORM = o0O000Oo.OooO00o.OooO0O0("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(ByteString byteString, o0O000Oo o0o000oo2, List<Part> list) {
        this.boundary = byteString;
        this.originalType = o0o000oo2;
        this.contentType = o0O000Oo.OooO00o.OooO00o(o0o000oo2 + "; boundary=" + byteString.OooOo00());
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
    private long writeOrCountBytes(o0O0o00O o0o0o00o, boolean z) throws IOException {
        oo0OOoo oo0oooo;
        if (z) {
            o0o0o00o = new oo0OOoo();
            oo0oooo = o0o0o00o;
        } else {
            oo0oooo = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            o0oO0Ooo o0oo0ooo2 = part.body;
            o0o0o00o.write(DASHDASH);
            o0o0o00o.o0000oo(this.boundary);
            o0o0o00o.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o0o0o00o.Oooo000(headers.name(i2)).write(COLONSPACE).Oooo000(headers.value(i2)).write(CRLF);
                }
            }
            o0O000Oo o0o000ooContentType = o0oo0ooo2.contentType();
            if (o0o000ooContentType != null) {
                o0o0o00o.Oooo000("Content-Type: ").Oooo000(o0o000ooContentType.f57808OooO00o).write(CRLF);
            }
            long jContentLength = o0oo0ooo2.contentLength();
            if (jContentLength != -1) {
                o0o0o00o.Oooo000("Content-Length: ").Ooooo00(jContentLength).write(CRLF);
            } else if (z) {
                oo0oooo.OooO0oO();
                return -1L;
            }
            byte[] bArr = CRLF;
            o0o0o00o.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                o0oo0ooo2.writeTo(o0o0o00o);
            }
            o0o0o00o.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        o0o0o00o.write(bArr2);
        o0o0o00o.o0000oo(this.boundary);
        o0o0o00o.write(bArr2);
        o0o0o00o.write(CRLF);
        if (!z) {
            return j;
        }
        long j2 = j + oo0oooo.f59828OooO0o0;
        oo0oooo.OooO0oO();
        return j2;
    }

    public String boundary() {
        return this.boundary.OooOo00();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public o0O000Oo contentType() {
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

    public o0O000Oo type() {
        return this.originalType;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public void writeTo(o0O0o00O o0o0o00o) throws IOException {
        writeOrCountBytes(o0o0o00o, false);
    }
}
