package p490o0o00OOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f48488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f48489OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(Ref.ObjectRef<String> objectRef, Ref.IntRef intRef) {
        super(2);
        this.f48488OooO0Oo = objectRef;
        this.f48489OooO0o0 = intRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String replaceAfter = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(replaceAfter, "replaceAfter");
        OooOOO0.OooO0O0("addMaskKeyAtRemoveSpace replaceAfter = " + replaceAfter + ", indexOfAfter = " + iIntValue);
        this.f48488OooO0Oo.element = replaceAfter;
        this.f48489OooO0o0.element = iIntValue;
        return Unit.INSTANCE;
    }
}
