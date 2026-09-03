package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class AtProtobuf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f19087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Protobuf.IntEncoding f19088OooO0O0 = Protobuf.IntEncoding.DEFAULT;

    public static final class ProtobufImpl implements Protobuf {
        private final Protobuf.IntEncoding intEncoding;
        private final int tag;

        public ProtobufImpl(int i, Protobuf.IntEncoding intEncoding) {
            this.tag = i;
            this.intEncoding = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.tag == protobuf.tag() && this.intEncoding.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.tag ^ 14552422) + (this.intEncoding.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.intEncoding;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.tag;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.tag + "intEncoding=" + this.intEncoding + ')';
        }
    }

    public final Protobuf OooO00o() {
        return new ProtobufImpl(this.f19087OooO00o, this.f19088OooO0O0);
    }
}
