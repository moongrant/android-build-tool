package p509o0o00ooO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomIdentity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.FixTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p369o0OOo0o.OooOOO;
import p369o0OOo0o.OooOOO0;
import p423o0OoO0OO.o00O0O0O;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o00Oo0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class m4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final t4 f50733OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final FixTextView f50734OooOoO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50735OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f50735OooO0Oo = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            long userid = this.f50735OooO0Oo.getAites().get(0).getUserid();
            if (userid > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(userid);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50733OooOo = new t4(view, activity);
        View viewFindViewById = view.findViewById(o0OO00O.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50734OooOoO0 = (FixTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        FixTextView fixTextView = this.f50734OooOoO0;
        p1.OooO0O0(model, fixTextView);
        this.f50733OooOo.OooO0O0(model);
        if (model.getReplyInfo() != null) {
            ViewGroup.LayoutParams layoutParams = fixTextView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388611;
        } else {
            ViewGroup.LayoutParams layoutParams2 = fixTextView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        int atType = model.getAtType();
        if (atType == 39) {
            String strOooO00o = o00O00OO.OooO00o("@", o0000.OooO0OO(o000000.room_at_member));
            MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
            String message = model.getMessage();
            Intrinsics.checkNotNull(message);
            String atHead = model.getAtHead();
            Intrinsics.checkNotNull(atHead);
            fixTextView.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(18), StringsKt__StringsJVMKt.replace$default(message, atHead, strOooO00o, false, 4, (Object) null)));
            o00O0O0O.OooO0Oo(fixTextView, o0000.OooO00o(o0OOO0o.color_1BA1FD), strOooO00o);
            RoomIdentity roomIdentity = RoomIdentity.INSTANCE;
            if (roomIdentity.isRoomMember(model.getRoleReceiving()) || roomIdentity.isRoomAdmin(model.getRoleReceiving()) || roomIdentity.isRoomHost(model.getRoleReceiving())) {
                o00O0O0O.OooO0Oo(fixTextView, o0000.OooO00o(o0OOO0o.color_FFFFFFF), strOooO00o);
                o00O0O0O.OooO0O0(fixTextView, o0000.OooO00o(o0OOO0o.color_007FD6), strOooO00o);
            }
            fixTextView.setMovementMethod(null);
        } else if (atType != 40) {
            String message2 = model.getMessage();
            MutableLiveData<List<OooOOO0>> mutableLiveData2 = OooOOO.f43158OooO00o;
            Intrinsics.checkNotNull(message2);
            fixTextView.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(18), message2));
            if (model.getAites() == null || model.getAites().size() <= 0) {
                fixTextView.setMovementMethod(null);
            } else {
                String strOooO00o2 = o00O00OO.OooO00o("@", model.getAites().get(0).getUsername());
                o00O0O0O.OooO00o(fixTextView, strOooO00o2, new OooO00o(model));
                o00O0O0O.OooO0Oo(fixTextView, o0000.OooO00o(o0OOO0o.color_FF7217), strOooO00o2);
                long userid = model.getAites().get(0).getUserid();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && userid == l.longValue()) {
                    o00O0O0O.OooO0Oo(fixTextView, o0000.OooO00o(o0OOO0o.color_FFFFFFF), strOooO00o2);
                    o00O0O0O.OooO0O0(fixTextView, o0000.OooO00o(o0OOO0o.color_EA6713), strOooO00o2);
                }
            }
        } else {
            String strOooO00o3 = o00O00OO.OooO00o("@", o0000.OooO0OO(o000000.room_at_everyOne));
            MutableLiveData<List<OooOOO0>> mutableLiveData3 = OooOOO.f43158OooO00o;
            String message3 = model.getMessage();
            Intrinsics.checkNotNull(message3);
            String atHead2 = model.getAtHead();
            Intrinsics.checkNotNull(atHead2);
            fixTextView.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(18), StringsKt__StringsJVMKt.replace$default(message3, atHead2, strOooO00o3, false, 4, (Object) null)));
            o00O0O0O.OooO0Oo(fixTextView, o0000.OooO00o(o0OOO0o.color_FFFFFFF), strOooO00o3);
            o00O0O0O.OooO0O0(fixTextView, o0000.OooO00o(o0OOO0o.color_007FD6), strOooO00o3);
            fixTextView.setMovementMethod(null);
        }
        fixTextView.setOnLongClickListener(new o00Oo0(this, 1));
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
