package p539o0o0OoOO;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f55526OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r0 r0Var) {
        super(2);
        this.f55526OooO0Oo = r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        o0OO000.OooO0O0("102034", MapsKt.hashMapOf(new Pair("emotiid", Integer.valueOf(iIntValue))));
        this.f55526OooO0Oo.invoke(gifUrl, Integer.valueOf(iIntValue));
        return Unit.INSTANCE;
    }
}
