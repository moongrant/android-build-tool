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
import p466o0Oooo0o.oo00o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f28950OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f28951OooO0oo;

    public oo0o0Oo(o0O0O00 o0o0o00, RoomIndexModel roomIndexModel) {
        this.f28950OooO0oO = o0o0o00;
        this.f28951OooO0oo = roomIndexModel;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0OO000.OooO00o("201013");
        MainSearchRoomFragment mainSearchRoomFragment = this.f28950OooO0oO.f28942OooOoo0;
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
        RoomIndexModel roomIndexModel = this.f28951OooO0oo;
        roomModel.setName(roomIndexModel.barname);
        roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(roomIndexModel.barid));
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        roomModel.websocketaddr = roomIndexModel.websocketaddr;
        MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Search_Room);
    }
}
