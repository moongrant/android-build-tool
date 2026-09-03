package com.app.base.fragment.room;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.app.base.adapter.roomMemberManager.RoomMemberManagerTag;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;
import p563o0oOo0.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function3<RoomUserInfoModel, Integer, RoomMemberManagerTag, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f11654Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMemberListFragment f11655Oooo0oO;

    /* JADX INFO: renamed from: com.app.base.fragment.room.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0075OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomMemberManagerTag.values().length];
            iArr[RoomMemberManagerTag.setting.ordinal()] = 1;
            iArr[RoomMemberManagerTag.del.ordinal()] = 2;
            iArr[RoomMemberManagerTag.manager.ordinal()] = 3;
            iArr[RoomMemberManagerTag.member.ordinal()] = 4;
            iArr[RoomMemberManagerTag.detail.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o000OO00 o000oo01, RoomInfoMemberListFragment roomInfoMemberListFragment) {
        super(3);
        this.f11654Oooo0o = o000oo01;
        this.f11655Oooo0oO = roomInfoMemberListFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel, Integer num, RoomMemberManagerTag roomMemberManagerTag) {
        RoomUserInfoModel model = roomUserInfoModel;
        int iIntValue = num.intValue();
        RoomMemberManagerTag tag = roomMemberManagerTag;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        int i = C0075OooO00o.$EnumSwitchMapping$0[tag.ordinal()];
        if (i == 1) {
            model.setSetting(!model.getIsSetting());
            this.f11654Oooo0o.notifyItemChanged(iIntValue);
            this.f11655Oooo0oO.getBinding().f48926OooO0OO.smoothScrollToPosition(iIntValue);
        } else if (i == 2) {
            this.f11655Oooo0oO.delMember(model);
        } else if (i == 3) {
            this.f11655Oooo0oO.setToManger(model);
        } else if (i == 4) {
            this.f11655Oooo0oO.setToMember(model);
        } else if (i == 5) {
            EditText view = this.f11655Oooo0oO.getBinding().f48925OooO0O0.f50638OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.llSearch.searchEdit");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
            FragmentActivity activity = this.f11655Oooo0oO.getActivity();
            if (activity != null) {
                UserInfoActivity.f23452o0ooOO0.OooO0OO(activity, String.valueOf(model.getUserId()), false, true, false, false);
            }
        }
        return Unit.INSTANCE;
    }
}
