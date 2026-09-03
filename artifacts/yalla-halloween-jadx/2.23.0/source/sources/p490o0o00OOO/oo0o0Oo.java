package p490o0o00OOO;

import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p367o0OOo0o0.OooOOOO;
import p433o0OoOOo.o0o0Oo;
import p475o0o000.Oooo0;
import p476o0o0000o.o0000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.h;
import p585o0oOooOO.k;
import p591o0oo000O.OooO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f48717OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(OooOOOO oooOOOO) {
        super(0);
        this.f48717OooO0Oo = oooOOOO;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x013d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string;
        ChatModel value;
        RoomMessageReplyInfo replayModel;
        h hVar;
        HashMap map;
        RoomLiveService roomLiveService;
        OooOOOO oooOOOO = this.f48717OooO0Oo;
        String strValueOf = String.valueOf(oooOOOO.OooO00o().getText());
        MessageEditText etMessageInput = oooOOOO.OooO00o();
        boolean zOooO0Oo = oooOOOO.OooO0Oo();
        OooOOOO oooOOOOOooO0O0 = oooOOOO.OooO0O0();
        o0o0Oo o0o0ooOooO0OO = oooOOOO.OooO0OO();
        boolean z = true;
        boolean z2 = etMessageInput.getSpanManager().OooO0OO("@") > 0;
        String string2 = StringsKt.trim((CharSequence) strValueOf).toString();
        if (string2 == null || StringsKt.isBlank(string2)) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.chat_room_on_Txt);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Oooo0 oooo0 = OooO00o.f24988OooOOo;
            if (jCurrentTimeMillis - ((Number) oooo0.f47361OooO0O0.getValue()).longValue() >= 1000) {
                string = etMessageInput.getTransformedText().toString();
                MutableState mutableState = oooo0.f47360OooO00o;
                if (StringsKt.OooOO0o((String) mutableState.getValue(), string)) {
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.char_room_content);
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(string, "<set-?>");
                    mutableState.setValue(string);
                }
                if (!TextUtils.isEmpty(string) && MixedRoomDataSource.OooO0o0().f23461OooO0o0 != null) {
                    if (zOooO0Oo) {
                        if (oooOOOOOooO0O0 != null) {
                            oooOOOOOooO0O0.OooO00o();
                        }
                        if (string != null && !StringsKt.isBlank(string)) {
                            z = false;
                        }
                        if (!z) {
                            OooOOO0.OooO0O0("sendNobleBroadcast " + string);
                            map = new HashMap();
                            map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                            map.put("lang", OooO.OooO0O0());
                            roomLiveService = RoomLiveService.f25058OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10019, oOo00OO0.OooO0OO(map));
                            }
                        }
                    } else {
                        value = o0o0ooOooO0OO.f46032OooO00o.getValue();
                        if (value != null) {
                            replayModel = new RoomMessageReplyInfo().getReplayModel(value);
                        } else {
                            replayModel = null;
                        }
                        if (z2) {
                            hVar = etMessageInput.getSpanManager().OooO0O0("@").get(0);
                        } else {
                            hVar = null;
                        }
                        o0000O.OooO0OO(string, hVar, replayModel);
                        k spanManager = etMessageInput.getSpanManager();
                        spanManager.OooO00o();
                        spanManager.f56774OooO00o.clear();
                        o0o0ooOooO0OO.f46032OooO00o.setValue(null);
                        o0o0ooOooO0OO.f46033OooO0O0.setValue(Boolean.FALSE);
                    }
                    OooO00o.f24988OooOOo.f47361OooO0O0.setValue(Long.valueOf(System.currentTimeMillis()));
                    Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
                    if (oooOOOOOooO0O0 != null) {
                        etMessageInput.setText("");
                        k spanManager2 = etMessageInput.getSpanManager();
                        spanManager2.OooO00o();
                        spanManager2.f56774OooO00o.clear();
                        etMessageInput.getMaskKeys().clear();
                    }
                }
                return Unit.INSTANCE;
            }
            String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.message_too_often);
            if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                }
            }
        }
        string = null;
        if (!TextUtils.isEmpty(string)) {
            if (zOooO0Oo) {
                if (oooOOOOOooO0O0 != null) {
                    oooOOOOOooO0O0.OooO00o();
                }
                if (string != null) {
                    z = false;
                }
                if (!z) {
                    OooOOO0.OooO0O0("sendNobleBroadcast " + string);
                    map = new HashMap();
                    map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                    map.put("lang", OooO.OooO0O0());
                    roomLiveService = RoomLiveService.f25058OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oO(10019, oOo00OO0.OooO0OO(map));
                    }
                }
            } else {
                value = o0o0ooOooO0OO.f46032OooO00o.getValue();
                if (value != null) {
                    replayModel = new RoomMessageReplyInfo().getReplayModel(value);
                } else {
                    replayModel = null;
                }
                if (z2) {
                    hVar = etMessageInput.getSpanManager().OooO0O0("@").get(0);
                } else {
                    hVar = null;
                }
                o0000O.OooO0OO(string, hVar, replayModel);
                k spanManager3 = etMessageInput.getSpanManager();
                spanManager3.OooO00o();
                spanManager3.f56774OooO00o.clear();
                o0o0ooOooO0OO.f46032OooO00o.setValue(null);
                o0o0ooOooO0OO.f46033OooO0O0.setValue(Boolean.FALSE);
            }
            OooO00o.f24988OooOOo.f47361OooO0O0.setValue(Long.valueOf(System.currentTimeMillis()));
            Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
            if (oooOOOOOooO0O0 != null) {
                etMessageInput.setText("");
                k spanManager4 = etMessageInput.getSpanManager();
                spanManager4.OooO00o();
                spanManager4.f56774OooO00o.clear();
                etMessageInput.getMaskKeys().clear();
            }
        }
        return Unit.INSTANCE;
    }
}
