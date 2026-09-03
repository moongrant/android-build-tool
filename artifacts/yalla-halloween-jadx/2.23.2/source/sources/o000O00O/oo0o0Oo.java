package o000O00O;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.yalla.yalla.data.repository.VoteRepo$getUserInfo$1$1;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import p233o00oOoOO.o0OoOoOo;
import p650o0ooo.m2;
import p650o0ooo.n2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo implements o000OoO.o00000O0.OooO00o, o00oo0o0.o000OO00.OooO00o, OnFailureListener, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34156OooO0Oo;

    public /* synthetic */ oo0o0Oo(Object obj) {
        this.f34156OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomVoteDialog this$0 = (RoomVoteDialog) this.f34156OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objOooOOO = baseQuickAdapter.OooOOO(i);
        Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.model.VoteRankModel");
        VoteRankModel voteRankModel = (VoteRankModel) objOooOOO;
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(voteRankModel.getUserId()));
        if (roomUserInfoModelOooO0o0 != null) {
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(roomUserInfoModelOooO0o0);
            return;
        }
        long userId = voteRankModel.getUserId();
        long roomId = voteRankModel.getRoomId();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new VoteRepo$getUserInfo$1$1(userId, roomId, mutableLiveData, null), 3, null);
        Context context = this$0.f58507OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        mutableLiveData.observe((FragmentActivity) context, new p384o0OOoo0O.o000oOoO(m2.f58385OooO0Oo, new n2(voteRankModel), null, false, 12));
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        Map map = (Map) this.f34156OooO0Oo;
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = p248o00oo0o0.o000OO00.f40194OooO;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new o00oo0o0.o000OO00.OooO0O0(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        o00O0OO o00o0oo2 = (o00O0OO) this.f34156OooO0Oo;
        ((Player.OooO0OO) obj).onPlayerStateChanged(o00o0oo2.f34115OooOO0o, o00o0oo2.f34110OooO0o0);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((RemoteConfigManager) this.f34156OooO0Oo).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
