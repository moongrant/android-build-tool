package com.amazonaws.util.json;

import com.facebook.internal.ServerProtocol;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class GsonFactory implements AwsJsonFactory {

    /* JADX INFO: renamed from: com.amazonaws.util.json.GsonFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11211OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f11211OooO00o = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11211OooO00o[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11211OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11211OooO00o[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11211OooO00o[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11211OooO00o[JsonToken.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11211OooO00o[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11211OooO00o[JsonToken.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11211OooO00o[JsonToken.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11211OooO00o[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class GsonReader implements AwsJsonReader {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final JsonReader f11212OooO00o;

        public GsonReader(Reader reader) {
            this.f11212OooO00o = new JsonReader(reader);
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final void OooO00o() throws IOException {
            this.f11212OooO00o.endObject();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final void OooO0O0() throws IOException {
            this.f11212OooO00o.beginObject();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final String OooO0OO() throws IOException {
            JsonToken jsonTokenPeek = this.f11212OooO00o.peek();
            if (JsonToken.NULL.equals(jsonTokenPeek)) {
                this.f11212OooO00o.nextNull();
                return null;
            }
            if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                return this.f11212OooO00o.nextBoolean() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false";
            }
            return this.f11212OooO00o.nextString();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final void OooO0Oo() throws IOException {
            this.f11212OooO00o.skipValue();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final String OooO0o() throws IOException {
            return this.f11212OooO00o.nextName();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final boolean OooO0o0() throws IOException {
            JsonToken jsonTokenPeek = this.f11212OooO00o.peek();
            return JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek) || JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek);
        }

        public final AwsJsonToken OooO0oO() throws IOException {
            AwsJsonToken awsJsonToken = null;
            try {
                JsonToken jsonTokenPeek = this.f11212OooO00o.peek();
                if (jsonTokenPeek != null) {
                    switch (AnonymousClass1.f11211OooO00o[jsonTokenPeek.ordinal()]) {
                        case 1:
                            awsJsonToken = AwsJsonToken.BEGIN_ARRAY;
                            break;
                        case 2:
                            awsJsonToken = AwsJsonToken.END_ARRAY;
                            break;
                        case 3:
                            awsJsonToken = AwsJsonToken.BEGIN_OBJECT;
                            break;
                        case 4:
                            awsJsonToken = AwsJsonToken.END_OBJECT;
                            break;
                        case 5:
                            awsJsonToken = AwsJsonToken.FIELD_NAME;
                            break;
                        case 6:
                            awsJsonToken = AwsJsonToken.VALUE_BOOLEAN;
                            break;
                        case 7:
                            awsJsonToken = AwsJsonToken.VALUE_NUMBER;
                            break;
                        case 8:
                            awsJsonToken = AwsJsonToken.VALUE_NULL;
                            break;
                        case 9:
                            awsJsonToken = AwsJsonToken.VALUE_STRING;
                            break;
                        case 10:
                            break;
                        default:
                            awsJsonToken = AwsJsonToken.UNKNOWN;
                            break;
                    }
                }
            } catch (EOFException unused) {
            }
            return awsJsonToken;
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final void close() throws IOException {
            this.f11212OooO00o.close();
        }

        @Override // com.amazonaws.util.json.AwsJsonReader
        public final boolean hasNext() throws IOException {
            return this.f11212OooO00o.hasNext();
        }
    }

    public static final class GsonWriter implements AwsJsonWriter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final JsonWriter f11213OooO00o;

        public GsonWriter(Writer writer) {
            this.f11213OooO00o = new JsonWriter(writer);
        }

        @Override // com.amazonaws.util.json.AwsJsonWriter
        public final AwsJsonWriter OooO00o() throws IOException {
            this.f11213OooO00o.endObject();
            return this;
        }

        @Override // com.amazonaws.util.json.AwsJsonWriter
        public final AwsJsonWriter OooO0O0() throws IOException {
            this.f11213OooO00o.beginObject();
            return this;
        }

        @Override // com.amazonaws.util.json.AwsJsonWriter
        public final AwsJsonWriter OooO0OO(String str) throws IOException {
            this.f11213OooO00o.value(str);
            return this;
        }

        @Override // com.amazonaws.util.json.AwsJsonWriter
        public final AwsJsonWriter OooO0Oo(String str) throws IOException {
            this.f11213OooO00o.name(str);
            return this;
        }

        @Override // com.amazonaws.util.json.AwsJsonWriter
        public final void close() throws IOException {
            this.f11213OooO00o.close();
        }
    }
}
