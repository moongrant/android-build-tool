package p546o0o0Ooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOO extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f44422Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f44423Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(Ref.ObjectRef<String> objectRef, Ref.IntRef intRef) {
        super(2);
        this.f44422Oooo0o = objectRef;
        this.f44423Oooo0oO = intRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String replaceAfter = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(replaceAfter, "replaceAfter");
        o00O00.OooO0O0("addMaskKeyAtRemoveSpace replaceAfter = " + replaceAfter + ", indexOfAfter = " + iIntValue);
        this.f44422Oooo0o.element = replaceAfter;
        this.f44423Oooo0oO.element = iIntValue;
        return Unit.INSTANCE;
    }
}
