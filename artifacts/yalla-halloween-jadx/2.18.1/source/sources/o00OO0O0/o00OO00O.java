package o00OO0O0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.mixedroom.model.RoomIdentity;
import com.app.base.model.AtUserInfoModel;
import com.app.base.model.ChatModel;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OO00O extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final FixTextView f31544OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public o00OOO0O f31545OooOOo0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31546Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f31546Oooo0o = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            p159o00OoOO.o00O000.OooO().OooO0oo(this.f31546Oooo0o.aites.get(0).getUserid());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31545OooOOo0 = new o00OOO0O(activity, view);
        View viewFindViewById = view.findViewById(R.id.tvContentMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContentMessage)");
        this.f31544OooOOo = (FixTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return true;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31544OooOOo);
        this.f31545OooOOo0.OooO0O0(model);
        if (model.replyInfo != null) {
            ViewGroup.LayoutParams layoutParams = this.f31544OooOOo.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388611;
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f31544OooOOo.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        int i2 = model.atType;
        if (i2 == 39) {
            StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('@');
            sbOooO00o.append(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_at_member));
            String string = sbOooO00o.toString();
            FixTextView fixTextView = this.f31544OooOOo;
            p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
            String str = model.message;
            Intrinsics.checkNotNullExpressionValue(str, "model.message");
            String str2 = model.atHead;
            Intrinsics.checkNotNullExpressionValue(str2, "model.atHead");
            fixTextView.setText(p453o0Ooo.OooOO0.OooO0Oo(StringsKt.OooOo00(str, str2, string), com.yalla.support.common.util.OooOo00.OooO00o(18.0f)));
            p522o0o0O0o.oo0o0O0.OooO0o0(this.f31544OooOOo, new String[]{string}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_1BA1FD));
            RoomIdentity roomIdentity = RoomIdentity.INSTANCE;
            if (roomIdentity.isRoomMember(model.roleReceiving) || roomIdentity.isRoomAdmin(model.roleReceiving) || roomIdentity.isRoomHost(model.roleReceiving)) {
                p522o0o0O0o.oo0o0O0.OooO0o0(this.f31544OooOOo, new String[]{string}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
                p522o0o0O0o.oo0o0O0.OooO0OO(this.f31544OooOOo, new String[]{string}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_007FD6));
            }
            this.f31544OooOOo.setMovementMethod(null);
        } else if (i2 != 40) {
            String chatContent = model.message;
            p453o0Ooo.OooOO0 oooOO2 = p453o0Ooo.OooOO0.f40347OooO00o;
            Intrinsics.checkNotNullExpressionValue(chatContent, "chatContent");
            this.f31544OooOOo.setText(p453o0Ooo.OooOO0.OooO0Oo(chatContent, com.yalla.support.common.util.OooOo00.OooO00o(18.0f)));
            ArrayList<AtUserInfoModel> arrayList = model.aites;
            if (arrayList == null || arrayList.size() <= 0) {
                this.f31544OooOOo.setMovementMethod(null);
            } else {
                StringBuilder sbOooO00o2 = p028Oooo0o0.o00O0O0O.OooO00o('@');
                sbOooO00o2.append(model.aites.get(0).getUsername());
                String string2 = sbOooO00o2.toString();
                p522o0o0O0o.oo0o0O0.OooO0O0(this.f31544OooOOo, string2, new OooO00o(model));
                p522o0o0O0o.oo0o0O0.OooO0o0(this.f31544OooOOo, new String[]{string2}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217));
                long userid = model.aites.get(0).getUserid();
                Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
                if (value != null && userid == value.longValue()) {
                    p522o0o0O0o.oo0o0O0.OooO0o0(this.f31544OooOOo, new String[]{string2}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
                    p522o0o0O0o.oo0o0O0.OooO0OO(this.f31544OooOOo, new String[]{string2}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_EA6713));
                }
            }
        } else {
            StringBuilder sbOooO00o3 = p028Oooo0o0.o00O0O0O.OooO00o('@');
            sbOooO00o3.append(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_at_everyOne));
            String string3 = sbOooO00o3.toString();
            FixTextView fixTextView2 = this.f31544OooOOo;
            p453o0Ooo.OooOO0 oooOO3 = p453o0Ooo.OooOO0.f40347OooO00o;
            String str3 = model.message;
            Intrinsics.checkNotNullExpressionValue(str3, "model.message");
            String str4 = model.atHead;
            Intrinsics.checkNotNullExpressionValue(str4, "model.atHead");
            fixTextView2.setText(p453o0Ooo.OooOO0.OooO0Oo(StringsKt.OooOo00(str3, str4, string3), com.yalla.support.common.util.OooOo00.OooO00o(18.0f)));
            p522o0o0O0o.oo0o0O0.OooO0o0(this.f31544OooOOo, new String[]{string3}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
            p522o0o0O0o.oo0o0O0.OooO0OO(this.f31544OooOOo, new String[]{string3}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_007FD6));
            this.f31544OooOOo.setMovementMethod(null);
        }
        this.f31544OooOOo.setOnLongClickListener(new View.OnLongClickListener() { // from class: o00OO0O0.o00OO000
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                o00OO00O this$0 = this.f31543Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f31386OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
            }
        });
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
