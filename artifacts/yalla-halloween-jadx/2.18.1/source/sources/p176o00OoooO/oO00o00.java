package p176o00OoooO;

import com.yalla.yalla.common.vm.UserGiftVM;
import com.yalla.yalla.model.MyGiftModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00OOO0.OooO00o;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public final class oO00o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f32857Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f32858Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MyGiftModel.Data f32859Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f32860Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO00o00(long j, MyGiftModel.Data data, OooO00o oooO00o, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.f32858Oooo0o = j;
        this.f32859Oooo0oO = data;
        this.f32860Oooo0oo = oooO00o;
        this.f32857Oooo = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        new UserGiftVM().sendGift(this.f32858Oooo0o, this.f32859Oooo0oO.getGiftid(), 1, this.f32859Oooo0oO.getImageurl()).observe(this.f32860Oooo0oo, new oO00o000(this.f32857Oooo, 0));
        o0O00000.OooO0OO("Me_profile_sentGift");
        return Unit.INSTANCE;
    }
}
