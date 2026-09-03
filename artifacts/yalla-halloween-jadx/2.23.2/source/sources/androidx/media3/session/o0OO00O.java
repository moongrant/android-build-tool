package androidx.media3.session;

import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p650o0ooo.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OO00O implements o000OoO.o00000O0.OooO00o, androidx.activity.result.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9483OooO0Oo;

    public /* synthetic */ o0OO00O(Object obj) {
        this.f9483OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        j this$0 = (j) this.f9483OooO0Oo;
        int i2 = j.f58287OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) obj);
        if (roomUserInfoModelOooO0o0 == null) {
            return;
        }
        Pair<Boolean, Integer> pairOooO = this$0.OooO(roomUserInfoModelOooO0o0);
        boolean zBooleanValue = pairOooO.getFirst().booleanValue();
        List<RoomUserInfoModel> list = this$0.f58289OooOOO0;
        if (zBooleanValue) {
            list.remove(pairOooO.getSecond().intValue());
        } else {
            if (list.size() >= 20) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_vote_game_master_select_ten_user);
                if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            list.add(roomUserInfoModelOooO0o0);
        }
        TextView textView = this$0.f58594OooO0oO;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSelectNum");
            textView = null;
        }
        textView.setText("(" + list.size() + "/20)");
        baseQuickAdapter.notifyItemChanged(i);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onAvailableCommandsChanged(((o0000OO0) this.f9483OooO0Oo).f9297OooO0OO);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        p335o0OO0o0O.o0OO00O this$0 = (p335o0OO0o0O.o0OO00O) this.f9483OooO0Oo;
        Boolean granted = (Boolean) obj;
        int i = p335o0OO0o0O.o0OO00O.f42474OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(granted, "granted");
        boolean zBooleanValue = granted.booleanValue();
        if (this$0.OooO0O0()) {
            p335o0OO0o0O.o0ooOOo o0ooooo = null;
            if (zBooleanValue) {
                p335o0OO0o0O.oo0o0Oo oo0o0oo = this$0.f42476OooO0Oo;
                if (oo0o0oo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo0o0oo = null;
                }
                oo0o0oo.f42492OooO0oO.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                p335o0OO0o0O.oo0o0Oo oo0o0oo2 = this$0.f42476OooO0Oo;
                if (oo0o0oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo0o0oo2 = null;
                }
                oo0o0oo2.f42493OooO0oo.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                p335o0OO0o0O.oo0o0Oo oo0o0oo3 = this$0.f42476OooO0Oo;
                if (oo0o0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo0o0oo3 = null;
                }
                oo0o0oo3.f42485OooO.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                p335o0OO0o0O.o0ooOOo o0ooooo2 = this$0.f42478OooO0o0;
                if (o0ooooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo2;
                }
                o0ooooo.finish();
                return;
            }
            this$0.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
            p335o0OO0o0O.oo0o0Oo oo0o0oo4 = this$0.f42476OooO0Oo;
            if (oo0o0oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo4 = null;
            }
            oo0o0oo4.getClass();
            p335o0OO0o0O.oo0o0Oo oo0o0oo5 = this$0.f42476OooO0Oo;
            if (oo0o0oo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo5 = null;
            }
            oo0o0oo5.getClass();
            p335o0OO0o0O.oo0o0Oo oo0o0oo6 = this$0.f42476OooO0Oo;
            if (oo0o0oo6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo6 = null;
            }
            oo0o0oo6.getClass();
            p335o0OO0o0O.o0ooOOo o0ooooo3 = this$0.f42478OooO0o0;
            if (o0ooooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
            } else {
                o0ooooo = o0ooooo3;
            }
            o0ooooo.finish();
        }
    }
}
