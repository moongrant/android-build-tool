package p198o00o0OoO;

import android.database.Cursor;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p389o0OOoooO.o00O0OO;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements o00OO00O.OooO00o, o00O0OO, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39079OooO0Oo;

    public /* synthetic */ o00O00OO(Object obj) {
        this.f39079OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.o00O0OO
    public final void OooO00o(SmartRefreshLayout it) {
        MomentDetailActivity this$0 = (MomentDetailActivity) this.f39079OooO0Oo;
        int i = MomentDetailActivity.f26057Oooo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = this$0.f26069OooOooO;
        if (i2 == 0) {
            this$0.OooOoo0().tabRefreshData(true);
        } else if (i2 == 1) {
            this$0.OooOooO().tabRefreshData(true);
        } else if (i2 == 2) {
            this$0.OooOoo().tabRefreshData(true);
        }
        this$0.Oooo000();
        this$0.OooOooo().onRefreshData();
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        RoomInfoMemberListFragment.initData$lambda$10((RoomInfoMemberListFragment) this.f39079OooO0Oo);
    }

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        Map map = (Map) this.f39079OooO0Oo;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new o00OO00O.OooO0O0(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }
}
