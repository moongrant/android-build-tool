package p143o00OOooo;

import android.database.Cursor;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o0O0O0Oo.OooO0O0;
import o0O0OOOo.oo0o0Oo;
import p172o00OooO.o00O0O0O;
import p174o00OooOO.o0O00OOO;
import p186o00o00Oo.o0ooOOo;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p515o0o0O00.o00O00;
import p579o0oOoOOo.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O000o implements o00O0O0O, oo0o0Oo.OooO00o, oO00OO0O, o0ooOOo, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31992OooO0Oo;

    public /* synthetic */ o00O000o(Object obj) {
        this.f31992OooO0Oo = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        PostDetailCommentFragment this$0 = (PostDetailCommentFragment) this.f31992OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O00.OooO("onTextClicked setViewData 动态详情 mPostDetailModel = " + this$0.mPostDetailModel);
    }

    @Override // p172o00OooO.o00O0O0O
    public final void OooO0O0(String str) {
        RoomInfoMemberListFragment.m58initView$lambda3((RoomInfoMemberListFragment) this.f31992OooO0Oo, str);
    }

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo it) {
        j this$0 = (j) this.f31992OooO0Oo;
        int i = j.f45965OooooO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooO(false);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        ExploreTagRoomListFragment.m326initView$lambda0((ExploreTagRoomListFragment) this.f31992OooO0Oo);
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        Map map = (Map) this.f31992OooO0Oo;
        Cursor cursor = (Cursor) obj;
        OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new oo0o0Oo.OooO0O0(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }
}
