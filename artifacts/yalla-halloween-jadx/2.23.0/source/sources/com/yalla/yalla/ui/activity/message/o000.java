package com.yalla.yalla.ui.activity.message;

import android.media.MediaPlayer;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p416o0Oo0ooo.y0;
import p579o0oOoo.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function2<ChatMessage, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25793OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(PrivateChatActivity privateChatActivity) {
        super(2);
        this.f25793OooO0Oo = privateChatActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ChatMessage chatMessage, Integer num) {
        ChatMessage.VoiceInfo voiceInfo;
        String filePath;
        String filename;
        String path;
        File fileOooO00o;
        ChatMessage chatMessage2 = chatMessage;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        PrivateChatActivity privateChatActivity = this.f25793OooO0Oo;
        p430o0OoOOO0.o00O00OO o00o00oo2 = privateChatActivity.f25706OooOoo;
        PrivateChatVM privateChatVM = privateChatActivity.OooOo();
        PrivateChatAdapter chatAdapter = privateChatActivity.OooOo0O();
        o00o00oo2.getClass();
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        ChatMessage.VoiceInfo voiceInfo2 = chatMessage2.getVoiceInfo();
        if (voiceInfo2 != null) {
            String voiceUrl = voiceInfo2.getVoiceUrl();
            if (chatMessage2.getIsAcceptMsg() && !voiceInfo2.getIsVoiceRead()) {
                privateChatVM.updateVoice(chatMessage2.getTargetId(), chatMessage2.getMid());
            }
            oOO0O0O ooo0o0o = o00o00oo2.f45815OooO0Oo;
            MediaPlayer mediaPlayer = ooo0o0o.f56656OooO00o;
            if (!(mediaPlayer != null && mediaPlayer.isPlaying())) {
                chatAdapter.f27440OooOo0o = chatMessage2;
                if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getFilename())) {
                    filePath = voiceInfo2.getFilename();
                    filename = voiceInfo2.getFilename();
                    File file = y0.f45407OooO00o;
                    path = ((File) y0.f45412OooO0o0.getValue()).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "audioCachePath.path");
                    if (!StringsKt.Oooo00o(filename, path)) {
                        filePath = p028Oooo0oO.o0O00o0.OooO0O0(new StringBuilder(), o00o00oo2.f45816OooO0o, voiceInfo2.getFilename());
                    }
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    fileOooO00o = com.code.android.util.Oooo000.OooO00o(filePath);
                    if (fileOooO00o == null && fileOooO00o.exists()) {
                        ooo0o0o.OooO00o(filePath, chatMessage2.getMid());
                        ChatMessage chatMessage3 = chatAdapter.f27440OooOo0o;
                        voiceInfo = chatMessage3 != null ? chatMessage3.getVoiceInfo() : null;
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                    } else if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getVoiceUrl())) {
                        ChatMessage chatMessage4 = chatAdapter.f27440OooOo0o;
                        voiceInfo = chatMessage4 != null ? chatMessage4.getVoiceInfo() : null;
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                        privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o00o00oo2.f45812OooO00o, new o0OoOOO0.o00O00OO.OooO00o(new p430o0OoOOO0.oOO00O(o00o00oo2, chatMessage2, chatAdapter)));
                    } else {
                        chatAdapter.OooOOOO();
                    }
                } else if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getVoiceUrl())) {
                    ChatMessage chatMessage5 = chatAdapter.f27440OooOo0o;
                    if (chatMessage5 != null) {
                    }
                    if (voiceInfo != null) {
                        voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                    }
                    chatAdapter.notifyItemChanged(iIntValue);
                    privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o00o00oo2.f45812OooO00o, new o0OoOOO0.o00O00OO.OooO00o(new p430o0OoOOO0.oOO00O(o00o00oo2, chatMessage2, chatAdapter)));
                } else {
                    chatAdapter.OooOOOO();
                }
            } else if (Intrinsics.areEqual(chatMessage2.getMid(), ooo0o0o.f56658OooO0OO)) {
                ooo0o0o.OooO0O0();
                chatAdapter.OooOOOO();
            } else {
                ooo0o0o.OooO0O0();
                chatAdapter.OooOOOO();
                chatAdapter.f27440OooOo0o = chatMessage2;
                if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getFilename())) {
                    filePath = voiceInfo2.getFilename();
                    filename = voiceInfo2.getFilename();
                    File file2 = y0.f45407OooO00o;
                    path = ((File) y0.f45412OooO0o0.getValue()).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "audioCachePath.path");
                    if (!StringsKt.Oooo00o(filename, path)) {
                        filePath = p028Oooo0oO.o0O00o0.OooO0O0(new StringBuilder(), o00o00oo2.f45816OooO0o, voiceInfo2.getFilename());
                    }
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    fileOooO00o = com.code.android.util.Oooo000.OooO00o(filePath);
                    if (fileOooO00o == null && fileOooO00o.exists()) {
                        ooo0o0o.OooO00o(filePath, chatMessage2.getMid());
                        ChatMessage chatMessage6 = chatAdapter.f27440OooOo0o;
                        if (chatMessage6 != null) {
                        }
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                    } else if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getVoiceUrl())) {
                        ChatMessage chatMessage7 = chatAdapter.f27440OooOo0o;
                        if (chatMessage7 != null) {
                        }
                        if (voiceInfo != null) {
                            voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                        }
                        chatAdapter.notifyItemChanged(iIntValue);
                        privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o00o00oo2.f45812OooO00o, new o0OoOOO0.o00O00OO.OooO00o(new p430o0OoOOO0.oOO00O(o00o00oo2, chatMessage2, chatAdapter)));
                    } else {
                        chatAdapter.OooOOOO();
                    }
                } else if (com.code.android.util.OooOo00.OooO0O0(voiceInfo2.getVoiceUrl())) {
                    ChatMessage chatMessage8 = chatAdapter.f27440OooOo0o;
                    if (chatMessage8 != null) {
                    }
                    if (voiceInfo != null) {
                        voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Download);
                    }
                    chatAdapter.notifyItemChanged(iIntValue);
                    privateChatVM.downloadVoice(chatMessage2, voiceUrl).observe(o00o00oo2.f45812OooO00o, new o0OoOOO0.o00O00OO.OooO00o(new p430o0OoOOO0.oOO00O(o00o00oo2, chatMessage2, chatAdapter)));
                } else {
                    chatAdapter.OooOOOO();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
