package p587o0oOooOO;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f57019OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k kVar) {
        super(2);
        this.f57019OooO0Oo = kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        OooO00o.OooO0OO("102034", MapsKt.hashMapOf(new Pair("emotiid", Integer.valueOf(iIntValue))));
        this.f57019OooO0Oo.invoke(gifUrl, Integer.valueOf(iIntValue));
        return Unit.INSTANCE;
    }
}
