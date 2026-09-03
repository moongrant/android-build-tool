package p578o0oOoOoo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooO0O0;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO f56432OooO0Oo = new oOO();

    public oOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        o0OO0O0.OooO00o("_ChangeVoice", "background voice change: " + iIntValue);
        OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.f46938OooO00o.OooO0oO(((float) iIntValue) / 100.0f);
        return Unit.INSTANCE;
    }
}
