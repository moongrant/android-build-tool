package p424o0OoO00O;

import com.common.support.zeus.SV2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 extends FunctionReferenceImpl implements Function2<byte[], String, String> {
    public o00Oo0(Object obj) {
        super(2, obj, SV2.class, "a3", "a3([BLjava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(byte[] bArr, String str) {
        byte[] p0 = bArr;
        String p1 = str;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return ((SV2) this.receiver).a3(p0, p1);
    }
}
