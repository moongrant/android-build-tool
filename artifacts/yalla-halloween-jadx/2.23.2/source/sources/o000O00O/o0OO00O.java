package o000O00O;

import android.database.Cursor;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import p233o00oOoOO.o0OoOoOo;
import p269o00oooo0.o0O0oo0o;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o0O0o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements o000OoO.o00000O0.OooO00o, o00oo0o0.o000OO00.OooO00o, OnSuccessListener, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34142OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f34141OooO0Oo = i;
        this.f34142OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PurchaseLockRoomActivity this$0 = (PurchaseLockRoomActivity) this.f34142OooO0o0;
        int i2 = PurchaseLockRoomActivity.f25791OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oooO0oOooO00o.OooO0O0("HAS_ROOM" + o0O00oO0.OooOOo0().getValue(), false)) {
            LockShopModel.LockShopModelItem lockShopModelItem = (LockShopModel.LockShopModelItem) this$0.f25795OooOo0O.get(i);
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
            o000o.OooOOoo(p562o0oOo000.o000000.purchase_roomlock);
            o000o.OooOo(true);
            o000o.OooOo0(new o0O0o0(this$0, lockShopModelItem));
            o000o.OooOO0o();
        }
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        p248o00oo0o0.o000OO00 o000oo01 = (p248o00oo0o0.o000OO00) this.f34142OooO0o0;
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = p248o00oo0o0.o000OO00.f40194OooO;
        o000oo01.getClass();
        while (cursor.moveToNext()) {
            o000oo01.OooOOo(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34141OooO0Oo;
        Object obj2 = this.f34142OooO0o0;
        switch (i) {
            case 0:
                o00O0OO o00o0oo2 = (o00O0OO) obj2;
                Player.OooO0OO oooO0OO = (Player.OooO0OO) obj;
                oooO0OO.onLoadingChanged(o00o0oo2.f34111OooO0oO);
                oooO0OO.onIsLoadingChanged(o00o0oo2.f34111OooO0oO);
                break;
            default:
                ((androidx.media3.session.o000OO0O.OooO0OO) obj2).getClass();
                ((Player.OooO0OO) obj).onAvailableCommandsChanged(null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((RemoteConfigManager) this.f34142OooO0o0).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
