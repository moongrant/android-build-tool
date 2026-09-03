package kotlin.reflect.jvm.internal.impl.builtins;

import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.yalla.yalla.ui.view.moment.SendMomentShareView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p247o00oo0oO.o00O0OO;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements OooO.OooO00o, o0000O00.OooO00o {
    public static FqName OooO00o(String str, FqName fqName, String str2) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, str2);
        return fqNameChild;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        return new o00O0OO(bundle.getInt(o00O0OO.f40741OooOO0, -1), bundle.getByteArray(o00O0OO.f40745OooOOO0), bundle.getInt(o00O0OO.f40742OooOO0O, -1), bundle.getInt(o00O0OO.f40743OooOO0o, -1));
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public void OooO0Oo() {
        int i = SendMomentShareView.f31235OooO0oO;
    }
}
