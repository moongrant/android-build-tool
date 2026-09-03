package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo0oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45378Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f45379Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f45380Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f45381Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(VipActivity vipActivity, o00O00o0 o00o00o1, int i, int i2) {
        super(2);
        this.f45379Oooo0o = vipActivity;
        this.f45380Oooo0oO = o00o00o1;
        this.f45381Oooo0oo = i;
        this.f45378Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        VipActivity.OooOoOO(this.f45379Oooo0o, this.f45380Oooo0oO, this.f45381Oooo0oo, ooo00o, this.f45378Oooo | 1);
        return Unit.INSTANCE;
    }
}
