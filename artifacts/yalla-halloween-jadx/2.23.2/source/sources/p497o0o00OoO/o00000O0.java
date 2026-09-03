package p497o0o00OoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f49698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f49699OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(Ref.ObjectRef<String> objectRef, Ref.IntRef intRef) {
        super(2);
        this.f49698OooO0Oo = objectRef;
        this.f49699OooO0o0 = intRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String replaceAfter = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(replaceAfter, "replaceAfter");
        o0000O00.OooO0O0("addMaskKeyAtRemoveSpace replaceAfter = " + replaceAfter + ", indexOfAfter = " + iIntValue);
        this.f49698OooO0Oo.element = replaceAfter;
        this.f49699OooO0o0.element = iIntValue;
        return Unit.INSTANCE;
    }
}
