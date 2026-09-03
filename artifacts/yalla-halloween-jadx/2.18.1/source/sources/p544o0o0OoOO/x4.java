package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p536o0o0OOoo.p;

/* JADX INFO: loaded from: classes2.dex */
public final class x4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44341Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(MemberListConveneActivity memberListConveneActivity) {
        super(0);
        this.f44341Oooo0o = memberListConveneActivity;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MemberListConveneActivity memberListConveneActivity = this.f44341Oooo0o;
        int i = MemberListConveneActivity.f22860o0OoOo0;
        Objects.requireNonNull(memberListConveneActivity);
        ArrayList arrayList = new ArrayList();
        Iterator it = memberListConveneActivity.f22864OooooO0.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
        }
        memberListConveneActivity.Oooo000().conveneBarMember(memberListConveneActivity.f22863Ooooo0o, arrayList).observe(memberListConveneActivity, new p(memberListConveneActivity, 2));
        return Unit.INSTANCE;
    }
}
