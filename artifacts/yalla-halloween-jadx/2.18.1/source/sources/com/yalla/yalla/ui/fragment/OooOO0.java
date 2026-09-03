package com.yalla.yalla.ui.fragment;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MainSearchRoomFragment.OooO00o f24061Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomIndexModel f24062OoooO00;

    public OooOO0(MainSearchRoomFragment.OooO00o oooO00o, RoomIndexModel roomIndexModel) {
        this.f24061Oooo = oooO00o;
        this.f24062OoooO00 = roomIndexModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0O00000.OooO0OO("Search_room");
        MainSearchRoomFragment.OooO00o oooO00o = this.f24061Oooo;
        RoomIndexModel roomIndexModel = this.f24062OoooO00;
        if (MainSearchRoomFragment.this.getActivity() == null) {
            return;
        }
        FragmentActivity activity = MainSearchRoomFragment.this.getActivity();
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        RoomModel roomModel = new RoomModel();
        roomModel.setName(roomIndexModel.barname);
        roomModel.setId(p168o00Ooo0.o0O0O00.OooOOO0(roomIndexModel.barid));
        roomModel.setBaridx(roomIndexModel.baridx);
        roomModel.setImage(roomIndexModel.barimage);
        roomModel.setRoomIp(roomIndexModel.roomserverip);
        RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Search_Room);
    }
}
