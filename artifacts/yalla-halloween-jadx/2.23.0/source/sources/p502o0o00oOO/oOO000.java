package p502o0o00oOO;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.Oooo000;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO000 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f49638OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final FixTextView f49639OooOoO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49640OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f49640OooO0Oo = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            long userid = this.f49640OooO0Oo.getAites().get(0).getUserid();
            if (userid > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(userid);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49638OooOo = new oOO0O000(view, activity);
        View viewFindViewById = view.findViewById(oO00O0oO.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContentMessage)");
        this.f49639OooOoO0 = (FixTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        FixTextView fixTextView = this.f49639OooOoO0;
        o0OOO0.OooO0O0(model, fixTextView);
        this.f49638OooOo.OooO0O0(model);
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
            String strOooO00o = o00O00OO.OooO00o("@", o0000.OooO0OO(oO00OOo0.room_at_member));
            MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
            String message = model.getMessage();
            Intrinsics.checkNotNull(message);
            String atHead = model.getAtHead();
            Intrinsics.checkNotNull(atHead);
            fixTextView.setText(Oooo000.OooO0Oo(o0000O0.OooO00o(18), StringsKt.OooOoO(message, atHead, strOooO00o)));
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_1BA1FD), strOooO00o);
            RoomIdentity roomIdentity = RoomIdentity.INSTANCE;
            if (roomIdentity.isRoomMember(model.getRoleReceiving()) || roomIdentity.isRoomAdmin(model.getRoleReceiving()) || roomIdentity.isRoomHost(model.getRoleReceiving())) {
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), strOooO00o);
                o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_007FD6), strOooO00o);
            }
            fixTextView.setMovementMethod(null);
        } else if (atType != 40) {
            String message2 = model.getMessage();
            MutableLiveData<List<OooOo>> mutableLiveData2 = Oooo000.f43954OooO00o;
            Intrinsics.checkNotNull(message2);
            fixTextView.setText(Oooo000.OooO0Oo(o0000O0.OooO00o(18), message2));
            if (model.getAites() == null || model.getAites().size() <= 0) {
                fixTextView.setMovementMethod(null);
            } else {
                String strOooO00o2 = o00O00OO.OooO00o("@", model.getAites().get(0).getUsername());
                o000O0o.OooO00o(fixTextView, strOooO00o2, new OooO00o(model));
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FF7217), strOooO00o2);
                long userid = model.getAites().get(0).getUserid();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                if (l != null && userid == l.longValue()) {
                    o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), strOooO00o2);
                    o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_EA6713), strOooO00o2);
                }
            }
        } else {
            String strOooO00o3 = o00O00OO.OooO00o("@", o0000.OooO0OO(oO00OOo0.room_at_everyOne));
            MutableLiveData<List<OooOo>> mutableLiveData3 = Oooo000.f43954OooO00o;
            String message3 = model.getMessage();
            Intrinsics.checkNotNull(message3);
            String atHead2 = model.getAtHead();
            Intrinsics.checkNotNull(atHead2);
            fixTextView.setText(Oooo000.OooO0Oo(o0000O0.OooO00o(18), StringsKt.OooOoO(message3, atHead2, strOooO00o3)));
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), strOooO00o3);
            o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_007FD6), strOooO00o3);
            fixTextView.setMovementMethod(null);
        }
        fixTextView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00oOO.oOO0000
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                oOO000 this$0 = this.f49641OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f49451OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
            }
        });
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
