package p175o00OooOo;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o000 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function2<String, Integer, Unit> f32719Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o000(Function2<? super String, ? super Integer, Unit> function2) {
        super(2);
        this.f32719Oooo0o = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        OooOo.OooO0OO("102034", MapsKt.hashMapOf(new Pair("emotiid", Integer.valueOf(iIntValue))));
        this.f32719Oooo0o.invoke(gifUrl, Integer.valueOf(iIntValue));
        return Unit.INSTANCE;
    }
}
