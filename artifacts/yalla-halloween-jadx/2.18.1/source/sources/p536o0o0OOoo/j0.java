package p536o0o0OOoo;

import android.media.MediaPlayer;
import androidx.lifecycle.Observer;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p494o0o00OO0.OooO0o;
import p700oO0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends Lambda implements Function2<ChatMessage, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43803Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(PrivateChatActivity privateChatActivity) {
        super(2);
        this.f43803Oooo0o = privateChatActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00a9, please report this as an issue */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ChatMessage chatMessage, Integer num) {
        ChatMessage.VoiceInfo voiceInfo;
        String filename;
        String filename2;
        String path;
        final ChatMessage chatMessage2 = chatMessage;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        PrivateChatActivity privateChatActivity = this.f43803Oooo0o;
        final o0000 o0000Var = privateChatActivity.f22180o00Oo0;
        PrivateChatVM privateChatVM = privateChatActivity.Oooo0O0();
        final PrivateChatAdapter chatAdapter = this.f43803Oooo0o.Oooo0();
        Objects.requireNonNull(o0000Var);
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        ChatMessage.VoiceInfo voiceInfo2 = chatMessage2.getVoiceInfo();
        if (voiceInfo2 != null) {
            String voiceUrl = voiceInfo2.getVoiceUrl();
            if (chatMessage2.getIsAcceptMsg() && !voiceInfo2.getIsVoiceRead()) {
                privateChatVM.updateVoice(chatMessage2.getTargetId(), chatMessage2.getMid());
            }
            MediaPlayer mediaPlayer = o0000Var.f52866OooO0Oo.f32656OooO00o;
            if (!(mediaPlayer != null && mediaPlayer.isPlaying())) {
                chatAdapter.f23644OooOo0o = chatMessage2;
                if (OooO0OO.OooO0O0(voiceInfo2.getFilename())) {
                    filename = voiceInfo2.getFilename();
                    filename2 = voiceInfo2.getFilename();
                    path = OooO0o.f41155OooO00o.OooO0OO().getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "audioCachePath.path");
                    if (!StringsKt.OooOoOO(filename2, path)) {
                        filename = o0000Var.f52867OooO0o + voiceInfo2.getFilename();
                    }
                    if (com.yalla.support.common.util.OooO0o.OooO00o(filename)) {
                        o0000Var.f52866OooO0Oo.OooO00o(filename, chatMessage2.getMid());
                        ChatMessage chatMessage3 = chatAdapter.f23644OooOo0o;
                        voiceInfo = chatMessage3 != null ? chatMessage3.getVoiceInfo() : null;
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                    } else if (OooO0OO.OooO0O0(voiceInfo2.getVoiceUrl())) {
                        ChatMessage chatMessage4 = chatAdapter.f23644OooOo0o;
                        voiceInfo = chatMessage4 != null ? chatMessage4.getVoiceInfo() : null;
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                        privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o0000Var.f52863OooO00o, new Observer() { // from class: oO0Oo.o00000
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj) {
                                o0000 this$0 = o0000Var;
                                ChatMessage message = chatMessage2;
                                PrivateChatAdapter chatAdapter2 = chatAdapter;
                                String str = (String) obj;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(message, "$chatMessage");
                                Intrinsics.checkNotNullParameter(chatAdapter2, "$chatAdapter");
                                if (!OooO0OO.OooO0O0(str)) {
                                    chatAdapter2.OooOOOo();
                                    return;
                                }
                                this$0.f52866OooO0Oo.OooO00o(str, message.getMid());
                                Objects.requireNonNull(chatAdapter2);
                                Intrinsics.checkNotNullParameter(message, "message");
                                String mid = message.getMid();
                                ChatMessage chatMessage5 = chatAdapter2.f23644OooOo0o;
                                if (Intrinsics.areEqual(mid, chatMessage5 != null ? chatMessage5.getMid() : null)) {
                                    ChatMessage chatMessage6 = chatAdapter2.f23644OooOo0o;
                                    ChatMessage.VoiceInfo voiceInfo3 = chatMessage6 != null ? chatMessage6.getVoiceInfo() : null;
                                    if (voiceInfo3 != null) {
                                        voiceInfo3.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                                    }
                                    int itemCount = chatAdapter2.getItemCount();
                                    for (int i = 0; i < itemCount; i++) {
                                        String mid2 = message.getMid();
                                        ChatMessage item = chatAdapter2.getItem(i);
                                        if (Intrinsics.areEqual(mid2, item != null ? item.getMid() : null)) {
                                            chatAdapter2.notifyItemChanged(i);
                                            return;
                                        }
                                    }
                                }
                            }
                        });
                    } else {
                        chatAdapter.OooOOOo();
                    }
                } else if (OooO0OO.OooO0O0(voiceInfo2.getVoiceUrl())) {
                    ChatMessage chatMessage5 = chatAdapter.f23644OooOo0o;
                    if (chatMessage5 != null) {
                    }
                    if (voiceInfo != null) {
                        voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                    }
                    chatAdapter.notifyItemChanged(iIntValue);
                    privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o0000Var.f52863OooO00o, new Observer() { // from class: oO0Oo.o00000
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            o0000 this$0 = o0000Var;
                            ChatMessage message = chatMessage2;
                            PrivateChatAdapter chatAdapter2 = chatAdapter;
                            String str = (String) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(message, "$chatMessage");
                            Intrinsics.checkNotNullParameter(chatAdapter2, "$chatAdapter");
                            if (!OooO0OO.OooO0O0(str)) {
                                chatAdapter2.OooOOOo();
                                return;
                            }
                            this$0.f52866OooO0Oo.OooO00o(str, message.getMid());
                            Objects.requireNonNull(chatAdapter2);
                            Intrinsics.checkNotNullParameter(message, "message");
                            String mid = message.getMid();
                            ChatMessage chatMessage6 = chatAdapter2.f23644OooOo0o;
                            if (Intrinsics.areEqual(mid, chatMessage6 != null ? chatMessage6.getMid() : null)) {
                                ChatMessage chatMessage7 = chatAdapter2.f23644OooOo0o;
                                ChatMessage.VoiceInfo voiceInfo3 = chatMessage7 != null ? chatMessage7.getVoiceInfo() : null;
                                if (voiceInfo3 != null) {
                                    voiceInfo3.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                                }
                                int itemCount = chatAdapter2.getItemCount();
                                for (int i = 0; i < itemCount; i++) {
                                    String mid2 = message.getMid();
                                    ChatMessage item = chatAdapter2.getItem(i);
                                    if (Intrinsics.areEqual(mid2, item != null ? item.getMid() : null)) {
                                        chatAdapter2.notifyItemChanged(i);
                                        return;
                                    }
                                }
                            }
                        }
                    });
                } else {
                    chatAdapter.OooOOOo();
                }
            } else if (Intrinsics.areEqual(chatMessage2.getMid(), o0000Var.f52866OooO0Oo.f32658OooO0OO)) {
                o0000Var.f52866OooO0Oo.OooO0O0();
                chatAdapter.OooOOOo();
            } else {
                o0000Var.f52866OooO0Oo.OooO0O0();
                chatAdapter.OooOOOo();
                chatAdapter.f23644OooOo0o = chatMessage2;
                if (OooO0OO.OooO0O0(voiceInfo2.getFilename())) {
                    filename = voiceInfo2.getFilename();
                    filename2 = voiceInfo2.getFilename();
                    path = OooO0o.f41155OooO00o.OooO0OO().getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "audioCachePath.path");
                    if (!StringsKt.OooOoOO(filename2, path)) {
                        filename = o0000Var.f52867OooO0o + voiceInfo2.getFilename();
                    }
                    if (com.yalla.support.common.util.OooO0o.OooO00o(filename)) {
                        o0000Var.f52866OooO0Oo.OooO00o(filename, chatMessage2.getMid());
                        ChatMessage chatMessage6 = chatAdapter.f23644OooOo0o;
                        if (chatMessage6 != null) {
                        }
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                    } else if (OooO0OO.OooO0O0(voiceInfo2.getVoiceUrl())) {
                        ChatMessage chatMessage7 = chatAdapter.f23644OooOo0o;
                        if (chatMessage7 != null) {
                        }
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                        privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o0000Var.f52863OooO00o, new Observer() { // from class: oO0Oo.o00000
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj) {
                                o0000 this$0 = o0000Var;
                                ChatMessage message = chatMessage2;
                                PrivateChatAdapter chatAdapter2 = chatAdapter;
                                String str = (String) obj;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(message, "$chatMessage");
                                Intrinsics.checkNotNullParameter(chatAdapter2, "$chatAdapter");
                                if (!OooO0OO.OooO0O0(str)) {
                                    chatAdapter2.OooOOOo();
                                    return;
                                }
                                this$0.f52866OooO0Oo.OooO00o(str, message.getMid());
                                Objects.requireNonNull(chatAdapter2);
                                Intrinsics.checkNotNullParameter(message, "message");
                                String mid = message.getMid();
                                ChatMessage chatMessage8 = chatAdapter2.f23644OooOo0o;
                                if (Intrinsics.areEqual(mid, chatMessage8 != null ? chatMessage8.getMid() : null)) {
                                    ChatMessage chatMessage9 = chatAdapter2.f23644OooOo0o;
                                    ChatMessage.VoiceInfo voiceInfo3 = chatMessage9 != null ? chatMessage9.getVoiceInfo() : null;
                                    if (voiceInfo3 != null) {
                                        voiceInfo3.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                                    }
                                    int itemCount = chatAdapter2.getItemCount();
                                    for (int i = 0; i < itemCount; i++) {
                                        String mid2 = message.getMid();
                                        ChatMessage item = chatAdapter2.getItem(i);
                                        if (Intrinsics.areEqual(mid2, item != null ? item.getMid() : null)) {
                                            chatAdapter2.notifyItemChanged(i);
                                            return;
                                        }
                                    }
                                }
                            }
                        });
                    } else {
                        chatAdapter.OooOOOo();
                    }
                } else if (OooO0OO.OooO0O0(voiceInfo2.getVoiceUrl())) {
                    ChatMessage chatMessage8 = chatAdapter.f23644OooOo0o;
                    if (chatMessage8 != null) {
                    }
                    if (voiceInfo != null) {
                        voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                    }
                    chatAdapter.notifyItemChanged(iIntValue);
                    privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o0000Var.f52863OooO00o, new Observer() { // from class: oO0Oo.o00000
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            o0000 this$0 = o0000Var;
                            ChatMessage message = chatMessage2;
                            PrivateChatAdapter chatAdapter2 = chatAdapter;
                            String str = (String) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(message, "$chatMessage");
                            Intrinsics.checkNotNullParameter(chatAdapter2, "$chatAdapter");
                            if (!OooO0OO.OooO0O0(str)) {
                                chatAdapter2.OooOOOo();
                                return;
                            }
                            this$0.f52866OooO0Oo.OooO00o(str, message.getMid());
                            Objects.requireNonNull(chatAdapter2);
                            Intrinsics.checkNotNullParameter(message, "message");
                            String mid = message.getMid();
                            ChatMessage chatMessage9 = chatAdapter2.f23644OooOo0o;
                            if (Intrinsics.areEqual(mid, chatMessage9 != null ? chatMessage9.getMid() : null)) {
                                ChatMessage chatMessage10 = chatAdapter2.f23644OooOo0o;
                                ChatMessage.VoiceInfo voiceInfo3 = chatMessage10 != null ? chatMessage10.getVoiceInfo() : null;
                                if (voiceInfo3 != null) {
                                    voiceInfo3.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                                }
                                int itemCount = chatAdapter2.getItemCount();
                                for (int i = 0; i < itemCount; i++) {
                                    String mid2 = message.getMid();
                                    ChatMessage item = chatAdapter2.getItem(i);
                                    if (Intrinsics.areEqual(mid2, item != null ? item.getMid() : null)) {
                                        chatAdapter2.notifyItemChanged(i);
                                        return;
                                    }
                                }
                            }
                        }
                    });
                } else {
                    chatAdapter.OooOOOo();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
