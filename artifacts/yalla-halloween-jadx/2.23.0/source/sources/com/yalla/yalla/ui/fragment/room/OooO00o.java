package com.yalla.yalla.ui.fragment.room;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.o000O000;
import com.yalla.yalla.ui.adapter.roomMemberManager.RoomMemberManagerTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function3<RoomUserInfoModel, Integer, RoomMemberManagerTag, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f28953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMemberListFragment f28954OooO0o0;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.room.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0334OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomMemberManagerTag.values().length];
            try {
                iArr[RoomMemberManagerTag.setting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomMemberManagerTag.del.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoomMemberManagerTag.manager.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoomMemberManagerTag.member.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoomMemberManagerTag.detail.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o000O000 o000o001, RoomInfoMemberListFragment roomInfoMemberListFragment) {
        super(3);
        this.f28953OooO0Oo = o000o001;
        this.f28954OooO0o0 = roomInfoMemberListFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel, Integer num, RoomMemberManagerTag roomMemberManagerTag) {
        RoomUserInfoModel model = roomUserInfoModel;
        int iIntValue = num.intValue();
        RoomMemberManagerTag tag = roomMemberManagerTag;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        int i = C0334OooO00o.$EnumSwitchMapping$0[tag.ordinal()];
        RoomInfoMemberListFragment roomInfoMemberListFragment = this.f28954OooO0o0;
        if (i == 1) {
            model.isSetting().setValue(Boolean.valueOf(!model.isSetting().getValue().booleanValue()));
            this.f28953OooO0Oo.notifyItemChanged(iIntValue);
            roomInfoMemberListFragment.getBinding().f58441OooO0OO.smoothScrollToPosition(iIntValue);
        } else if (i == 2) {
            roomInfoMemberListFragment.delMember(model);
        } else if (i == 3) {
            roomInfoMemberListFragment.setToManger(model);
        } else if (i == 4) {
            roomInfoMemberListFragment.setToMember(model);
        } else if (i == 5) {
            EditText view = roomInfoMemberListFragment.getBinding().f58440OooO0O0.f57470OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.llSearch.searchEdit");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), p367o0OOo0o0.Oooo000.OooO00o(context), view.getWindowToken(), 0);
            FragmentActivity activity = roomInfoMemberListFragment.getActivity();
            if (activity != null) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                UserInfoActivity.OooO00o.OooO0O0(activity, String.valueOf(model.getUserId().getValue().longValue()), false, true, false, false);
            }
        }
        return Unit.INSTANCE;
    }
}
