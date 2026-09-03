package p488o0o00O0o;

import com.yalla.yalla.model.MomentSelectMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function3<Integer, Integer, Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f48466OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f48467OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<MomentSelectMedia> f48468OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(String str, ArrayList arrayList, o0OO00O o0oo00o2) {
        super(3);
        this.f48466OooO0Oo = str;
        this.f48468OooO0o0 = arrayList;
        this.f48467OooO0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Long l) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        long jLongValue = l.longValue();
        MomentSelectMedia momentSelectMedia = new MomentSelectMedia(this.f48466OooO0Oo);
        momentSelectMedia.setWidth(iIntValue);
        momentSelectMedia.setHeight(iIntValue2);
        momentSelectMedia.setDuration(jLongValue);
        List<MomentSelectMedia> list = this.f48468OooO0o0;
        list.add(momentSelectMedia);
        o0OO00O o0oo00o2 = this.f48467OooO0o;
        if (jLongValue > 0) {
            o0oo00o2.f48450OooO0OO.OooOoO0(o0oo00o2.OooO00o(list));
        } else {
            o0oo00o2.f48450OooO0OO.OooO0OO(momentSelectMedia);
        }
        o0oo00o2.OooO0Oo();
        return Unit.INSTANCE;
    }
}
