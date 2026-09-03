package p580o0oOoOo;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46683Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46684Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(MixedRoomActivity mixedRoomActivity, int i) {
        super(2);
        this.f46683Oooo0o = mixedRoomActivity;
        this.f46684Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOo00o00.OooOO0(this.f46683Oooo0o, ooo00o, this.f46684Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
