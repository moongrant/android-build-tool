package p524o0o0OO0o;

import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function0<Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53510OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(o0O00 o0o01) {
        super(0);
        this.f53510OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        CheckConveneMemberStatusModel checkConveneMemberStatusModel = this.f53510OooO0Oo.f53474OooOo0;
        return Integer.valueOf(checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getMaxConveneCount() : 50);
    }
}
