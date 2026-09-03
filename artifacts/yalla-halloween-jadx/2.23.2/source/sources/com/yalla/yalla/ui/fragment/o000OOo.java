package com.yalla.yalla.ui.fragment;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000000 f28396OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f28397OooO0oo;

    public o000OOo(o000000 o000000Var, RoomIndexModel roomIndexModel) {
        this.f28396OooO0oO = o000000Var;
        this.f28397OooO0oo = roomIndexModel;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0oo0000.OooO00o.OooO0O0("201013");
        MainSearchRoomFragment mainSearchRoomFragment = this.f28396OooO0oO.f28360OooOoo0;
        if (mainSearchRoomFragment.getActivity() == null) {
            return;
        }
        FragmentActivity activity = mainSearchRoomFragment.getActivity();
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        RoomModel roomModel = new RoomModel();
        RoomIndexModel roomIndexModel = this.f28397OooO0oo;
        roomModel.setName(roomIndexModel.barname);
        roomModel.setId(o0O0O0Oo.OooOO0o(roomIndexModel.barid));
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        roomModel.websocketaddr = roomIndexModel.websocketaddr;
        MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
        p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Search_Room);
    }
}
