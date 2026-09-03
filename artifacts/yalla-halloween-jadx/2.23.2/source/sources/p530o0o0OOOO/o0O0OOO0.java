package p530o0o0OOOO;

import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function0<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53430OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53430OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        CheckConveneMemberStatusModel checkConveneMemberStatusModel = this.f53430OooO0Oo.f53408OooOo0;
        long endTime = checkConveneMemberStatusModel != null ? checkConveneMemberStatusModel.getEndTime() : 0L;
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(endTime).length();
        int i = 1;
        if (1 <= length) {
            while (true) {
                endTime *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(endTime - System.currentTimeMillis());
    }
}
