package p546o0o0Ooo0;

import android.text.Editable;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.framework.view.editTextSpan.MessageEditText;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.room_bottom.RoomAtView;
import com.app.base.mixedroom.room_bottom.RoomReplyView;
import com.app.base.view.FacePanelView;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p150o00Oo0Oo.OooOo;
import p254o00ooO0O.o000O0O0;
import p470o0Oooo0.o00O0000;
import p522o0o0O0o.o00O0O0;
import p522o0o0O0o.o00O0O00;
import p522o0o0O0o.o00O0O0O;
import p545o0o0OoOo.c8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00Oo00 extends c8 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0O00OO<o00O0000> f44430OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44431OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f44432OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f44433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f44434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f44435OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f44436OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f44437OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f44438OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f44439OooOO0O;

    public static final class OooO extends Lambda implements Function0<RoomAtView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomAtView invoke() {
            RoomAtView roomAtView = (RoomAtView) oO00Oo00.this.f44365OooO00o.findViewById(R.id.roomAtView);
            if (roomAtView == null) {
                return null;
            }
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            roomAtView.setShowStateListener(new oO00o00(oo00oo00));
            if (oo00oo00.f44438OooOO0.getValue().booleanValue()) {
                roomAtView.OooO0OO();
            }
            roomAtView.setAtEveryOneListener(new oO0OOO00(oo00oo00));
            roomAtView.setAtMemberListener(new oO00o00O(oo00oo00));
            return roomAtView;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<MessageEditText> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MessageEditText invoke() {
            MessageEditText messageEditText = new MessageEditText(oO00Oo00.this.f44431OooO0O0);
            oO00Oo00 oo00oo00 = oO00Oo00.this;
            messageEditText.setBackgroundResource(R.drawable.bg_edit_layer_list);
            messageEditText.setGravity(8388627);
            messageEditText.setHint(o000O0O0.OooO0OO(R.string.hint_say_something));
            messageEditText.setTextColor(o000O0O0.OooO00o(R.color.color_87000000));
            messageEditText.setHintTextColor(o000O0O0.OooO00o(R.color.color_C7C7CC));
            messageEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Intrinsics.checkNotNullParameter(messageEditText, "<this>");
            messageEditText.setTextSize(2, 16.0f);
            messageEditText.setTextAlignment(2);
            messageEditText.setMaxContentLength(200);
            messageEditText.setMaxContentTips(o000O0O0.OooO0OO(R.string.char_room_text_lenght));
            messageEditText.setMaxEmojiCount(50);
            messageEditText.setMaxEmojiCountTips(o000O0O0.OooO0OO(R.string.char_room_edit1));
            messageEditText.addTextChangedListener(new oO00OOo0(oo00oo00));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            oO00OOO oo00ooo = new oO00OOO(objectRef, intRef);
            Intrinsics.checkNotNullParameter(messageEditText, "<this>");
            o00O0O00 o00o0o01 = o00O0O00.f43007Oooo0o;
            o00O0O0 o00o0o0 = new o00O0O0(messageEditText, oo00ooo);
            Intrinsics.checkNotNullParameter(messageEditText, "<this>");
            messageEditText.addTextChangedListener(new o00O0O0O(o00o0o0, o00o0o01));
            messageEditText.addTextChangedListener(new oO00OOOo(objectRef, oo00oo00, intRef, messageEditText));
            return messageEditText;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<PanelLayout> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PanelLayout invoke() {
            return (PanelLayout) oO00Oo00.this.f44365OooO00o.findViewById(R.id.pl_face);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<FacePanelView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final FacePanelView invoke() {
            FacePanelView facePanelView = (FacePanelView) oO00Oo00.this.f44365OooO00o.findViewById(R.id.facePanelView);
            if (facePanelView == null) {
                return null;
            }
            facePanelView.setOnSendStickerMessageListener(oO00Oo0.f44429Oooo0o);
            facePanelView.setOnSendGifMessageListener(oOOoOOO0.f44585Oooo0o);
            return facePanelView;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<RoomReplyView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomReplyView invoke() {
            return (RoomReplyView) oO00Oo00.this.f44365OooO00o.findViewById(R.id.roomReplyView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44431OooO0O0 = roomActivity;
        Boolean bool = Boolean.FALSE;
        this.f44432OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f44433OooO0Oo = LazyKt.lazy(new OooO0o());
        this.f44435OooO0o0 = LazyKt.lazy(new OooO0O0());
        this.f44434OooO0o = LazyKt.lazy(new OooO());
        this.f44436OooO0oO = LazyKt.lazy(new OooO0OO());
        this.f44437OooO0oo = LazyKt.lazy(new OooO00o());
        this.f44430OooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f44438OooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f44439OooOO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
    }

    public final MessageEditText OooO0OO() {
        return (MessageEditText) this.f44437OooO0oo.getValue();
    }

    public final RoomReplyView OooO0Oo() {
        return (RoomReplyView) this.f44433OooO0Oo.getValue();
    }

    public final void OooO0o0(@NotNull OooOo atMessage, boolean z) {
        RoomReplyView roomReplyViewOooO0Oo;
        Intrinsics.checkNotNullParameter(atMessage, "atMessage");
        if (z && (roomReplyViewOooO0Oo = OooO0Oo()) != null) {
            roomReplyViewOooO0Oo.setChatModel(null);
        }
        MessageEditText messageEditTextOooO0OO = OooO0OO();
        messageEditTextOooO0OO.f11739Ooooo0o = o0OO0OoO.OooO00o.f37477OooO0o0;
        messageEditTextOooO0OO.setText("");
        messageEditTextOooO0OO.OooO0Oo(atMessage);
        Editable text = OooO0OO().getText();
        messageEditTextOooO0OO.setSelection(text != null ? text.length() : 0);
    }
}
