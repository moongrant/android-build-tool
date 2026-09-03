package p601o0oo00Oo;

import android.content.Intent;
import com.facebook.internal.OooO0o;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150o00Oo0Oo.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00OO extends Lambda implements Function2<Integer, Intent, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentsMessagesEditView f48198Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(MomentsMessagesEditView momentsMessagesEditView) {
        super(2);
        this.f48198Oooo0o = momentsMessagesEditView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            Serializable serializableExtra = intent2.getSerializableExtra("Data");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.common.db.table.FriendInfo");
            UserInfo userInfo = ((FriendInfo) serializableExtra).getUserInfo();
            if (userInfo != null) {
                this.f48198Oooo0o.f25000Oooo0o.f49248OooO0O0.OooO00o("@", new OooOo(userInfo.getUserName(), userInfo.getUserId()));
            }
            MomentsMessagesEditView momentsMessagesEditView = this.f48198Oooo0o;
            momentsMessagesEditView.f25000Oooo0o.f49248OooO0O0.postDelayed(new OooO0o(momentsMessagesEditView, 1), 200L);
        }
        return Unit.INSTANCE;
    }
}
