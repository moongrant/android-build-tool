package p652o0ooOoo;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.OooOO0O;
import com.google.protobuf.o00oO0o;
import com.google.protobuf.o0OOO0o;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends GeneratedMessageLite<j, OooO00o> implements o00oO0o {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final j f51152OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static volatile o0OOO0o<j> f51153OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f51155Oooo0o;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f51158OoooO00;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f51156Oooo0oO = "";

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f51157Oooo0oo = "";

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f51154Oooo = "";

    public static final class OooO00o extends GeneratedMessageLite.OooO00o<j, OooO00o> implements o00oO0o {
        public OooO00o() {
            super(j.f51152OoooO0);
        }
    }

    static {
        j jVar = new j();
        f51152OoooO0 = jVar;
        jVar.makeImmutable();
    }

    public static j OooO00o(ByteString byteString) throws InvalidProtocolBufferException {
        return (j) GeneratedMessageLite.parseFrom(f51152OoooO0, byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (i.f51151OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return f51152OoooO0;
            case 3:
                return null;
            case 4:
                return new OooO00o();
            case 5:
                GeneratedMessageLite.OooOOO oooOOO = (GeneratedMessageLite.OooOOO) obj;
                j jVar = (j) obj2;
                long j = this.f51155Oooo0o;
                boolean z2 = j != 0;
                long j2 = jVar.f51155Oooo0o;
                this.f51155Oooo0o = oooOOO.OooOO0O(z2, j, j2 != 0, j2);
                this.f51156Oooo0oO = oooOOO.OooO0o(!this.f51156Oooo0oO.isEmpty(), this.f51156Oooo0oO, !jVar.f51156Oooo0oO.isEmpty(), jVar.f51156Oooo0oO);
                this.f51157Oooo0oo = oooOOO.OooO0o(!this.f51157Oooo0oo.isEmpty(), this.f51157Oooo0oo, !jVar.f51157Oooo0oo.isEmpty(), jVar.f51157Oooo0oo);
                this.f51154Oooo = oooOOO.OooO0o(!this.f51154Oooo.isEmpty(), this.f51154Oooo, !jVar.f51154Oooo.isEmpty(), jVar.f51154Oooo);
                long j3 = this.f51158OoooO00;
                boolean z3 = j3 != 0;
                long j4 = jVar.f51158OoooO00;
                this.f51158OoooO00 = oooOOO.OooOO0O(z3, j3, j4 != 0, j4);
                return this;
            case 6:
                OooOO0O oooOO0O = (OooOO0O) obj;
                while (!z) {
                    try {
                        int iOooOOoo = oooOO0O.OooOOoo();
                        if (iOooOOoo != 0) {
                            if (iOooOOoo == 8) {
                                this.f51155Oooo0o = oooOO0O.OooOOOo();
                            } else if (iOooOOoo == 18) {
                                this.f51156Oooo0oO = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 26) {
                                this.f51157Oooo0oo = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 34) {
                                this.f51154Oooo = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 40) {
                                this.f51158OoooO00 = oooOO0O.OooOOOo();
                            } else if (!oooOO0O.OooOo0O(iOooOOoo)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f51153OoooO0O == null) {
                    synchronized (j.class) {
                        if (f51153OoooO0O == null) {
                            f51153OoooO0O = new GeneratedMessageLite.OooO0O0(f51152OoooO0);
                        }
                        break;
                    }
                }
                return f51153OoooO0O;
            default:
                throw new UnsupportedOperationException();
        }
        return f51152OoooO0;
    }

    @Override // com.google.protobuf.oo000o
    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f51155Oooo0o;
        int iOooO0Oo = j != 0 ? 0 + CodedOutputStream.OooO0Oo(1, j) : 0;
        if (!this.f51156Oooo0oO.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(2, this.f51156Oooo0oO);
        }
        if (!this.f51157Oooo0oo.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(3, this.f51157Oooo0oo);
        }
        if (!this.f51154Oooo.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(4, this.f51154Oooo);
        }
        long j2 = this.f51158OoooO00;
        if (j2 != 0) {
            iOooO0Oo += CodedOutputStream.OooO0Oo(5, j2);
        }
        this.memoizedSerializedSize = iOooO0Oo;
        return iOooO0Oo;
    }

    @Override // com.google.protobuf.oo000o
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f51155Oooo0o;
        if (j != 0) {
            codedOutputStream.OooOOo0(1, j);
        }
        if (!this.f51156Oooo0oO.isEmpty()) {
            codedOutputStream.OooOOOO(2, this.f51156Oooo0oO);
        }
        if (!this.f51157Oooo0oo.isEmpty()) {
            codedOutputStream.OooOOOO(3, this.f51157Oooo0oo);
        }
        if (!this.f51154Oooo.isEmpty()) {
            codedOutputStream.OooOOOO(4, this.f51154Oooo);
        }
        long j2 = this.f51158OoooO00;
        if (j2 != 0) {
            codedOutputStream.OooOOo0(5, j2);
        }
    }
}
