package p034OoooO0O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import p032OoooO0.o00oOoo;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo extends FunctionReferenceImpl implements Function1<Integer, o0OO00O> {
    public o0ooOOo(Object obj) {
        super(1, obj, o00oOoo.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0OO00O invoke(Integer num) {
        int iIntValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.receiver;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new o0OO00O(o000O0O0.OooO00o(o00oOoo.OooO0O0(charSequence, iIntValue), o00oOoo.OooO00o(charSequence, iIntValue)));
    }
}
