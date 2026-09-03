package p654o0ooOoo;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.OooOO0O;
import com.google.protobuf.o00oO0o;
import com.google.protobuf.o0OOO0o;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends GeneratedMessageLite<i, OooO00o> implements o00oO0o {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final i f51170OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static volatile o0OOO0o<i> f51171o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f51172Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long f51173OoooO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f51175OoooO00 = "";

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f51174OoooO0 = "";

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f51176OoooO0O = "";

    public static final class OooO00o extends GeneratedMessageLite.OooO00o<i, OooO00o> implements o00oO0o {
        public OooO00o() {
            super(i.f51170OoooOO0);
        }
    }

    static {
        i iVar = new i();
        f51170OoooOO0 = iVar;
        iVar.makeImmutable();
    }

    public static i OooO00o(ByteString byteString) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.parseFrom(f51170OoooOO0, byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (h.f51169OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return f51170OoooOO0;
            case 3:
                return null;
            case 4:
                return new OooO00o();
            case 5:
                GeneratedMessageLite.OooOOO oooOOO = (GeneratedMessageLite.OooOOO) obj;
                i iVar = (i) obj2;
                long j = this.f51172Oooo;
                boolean z2 = j != 0;
                long j2 = iVar.f51172Oooo;
                this.f51172Oooo = oooOOO.OooOO0O(z2, j, j2 != 0, j2);
                this.f51175OoooO00 = oooOOO.OooO0o(!this.f51175OoooO00.isEmpty(), this.f51175OoooO00, !iVar.f51175OoooO00.isEmpty(), iVar.f51175OoooO00);
                this.f51174OoooO0 = oooOOO.OooO0o(!this.f51174OoooO0.isEmpty(), this.f51174OoooO0, !iVar.f51174OoooO0.isEmpty(), iVar.f51174OoooO0);
                this.f51176OoooO0O = oooOOO.OooO0o(!this.f51176OoooO0O.isEmpty(), this.f51176OoooO0O, !iVar.f51176OoooO0O.isEmpty(), iVar.f51176OoooO0O);
                long j3 = this.f51173OoooO;
                boolean z3 = j3 != 0;
                long j4 = iVar.f51173OoooO;
                this.f51173OoooO = oooOOO.OooOO0O(z3, j3, j4 != 0, j4);
                return this;
            case 6:
                OooOO0O oooOO0O = (OooOO0O) obj;
                while (!z) {
                    try {
                        int iOooOOoo = oooOO0O.OooOOoo();
                        if (iOooOOoo != 0) {
                            if (iOooOOoo == 8) {
                                this.f51172Oooo = oooOO0O.OooOOOo();
                            } else if (iOooOOoo == 18) {
                                this.f51175OoooO00 = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 26) {
                                this.f51174OoooO0 = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 34) {
                                this.f51176OoooO0O = oooOO0O.OooOOo();
                            } else if (iOooOOoo == 40) {
                                this.f51173OoooO = oooOO0O.OooOOOo();
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
                if (f51171o000oOoO == null) {
                    synchronized (i.class) {
                        if (f51171o000oOoO == null) {
                            f51171o000oOoO = new GeneratedMessageLite.OooO0O0(f51170OoooOO0);
                        }
                        break;
                    }
                }
                return f51171o000oOoO;
            default:
                throw new UnsupportedOperationException();
        }
        return f51170OoooOO0;
    }

    @Override // com.google.protobuf.oo000o
    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f51172Oooo;
        int iOooO0Oo = j != 0 ? 0 + CodedOutputStream.OooO0Oo(1, j) : 0;
        if (!this.f51175OoooO00.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(2, this.f51175OoooO00);
        }
        if (!this.f51174OoooO0.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(3, this.f51174OoooO0);
        }
        if (!this.f51176OoooO0O.isEmpty()) {
            iOooO0Oo += CodedOutputStream.OooO0oO(4, this.f51176OoooO0O);
        }
        long j2 = this.f51173OoooO;
        if (j2 != 0) {
            iOooO0Oo += CodedOutputStream.OooO0Oo(5, j2);
        }
        this.memoizedSerializedSize = iOooO0Oo;
        return iOooO0Oo;
    }

    @Override // com.google.protobuf.oo000o
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f51172Oooo;
        if (j != 0) {
            codedOutputStream.OooOOo0(1, j);
        }
        if (!this.f51175OoooO00.isEmpty()) {
            codedOutputStream.OooOOOO(2, this.f51175OoooO00);
        }
        if (!this.f51174OoooO0.isEmpty()) {
            codedOutputStream.OooOOOO(3, this.f51174OoooO0);
        }
        if (!this.f51176OoooO0O.isEmpty()) {
            codedOutputStream.OooOOOO(4, this.f51176OoooO0O);
        }
        long j2 = this.f51173OoooO;
        if (j2 != 0) {
            codedOutputStream.OooOOo0(5, j2);
        }
    }
}
