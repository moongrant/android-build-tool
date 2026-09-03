package p530o0o0OOOO;

import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function0<Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53449OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53449OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        CheckConveneMemberStatusModel checkConveneMemberStatusModel = this.f53449OooO0Oo.f53408OooOo0;
        return Integer.valueOf(checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getMaxConveneCount() : 50);
    }
}
